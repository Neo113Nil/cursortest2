package androidx.camera.core;

import android.content.Context;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.transition.Transition;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.squareup.cash.R;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.scannerview.FlashState;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.android.Views;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.core.strings.IdentifierResolvableString;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.elements.DropdownConfig$Mode$Condensed;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class LegacySessionConfig {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object effects;
    public final Object featureSelectionListener;
    public Object featureSelectionListenerExecutor;
    public final Object frameRateRange;
    public boolean isLegacy;
    public final Object preferredFeatureGroup;
    public final Object requiredFeatureGroup;
    public final Object useCases;

    public LegacySessionConfig(List list, List list2) {
        Object obj;
        String concat;
        String str;
        String str2;
        boolean containsOption;
        list.getClass();
        list2.getClass();
        Object obj2 = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        obj2.getClass();
        EmptySet emptySet = EmptySet.INSTANCE;
        EmptyList emptyList = EmptyList.INSTANCE;
        emptySet.getClass();
        emptyList.getClass();
        this.effects = list2;
        this.frameRateRange = obj2;
        this.requiredFeatureGroup = emptySet;
        this.preferredFeatureGroup = emptyList;
        List list3 = CollectionsKt.toList(CollectionsKt.toMutableSet(list));
        this.useCases = list3;
        this.featureSelectionListener = new SessionConfig$$ExternalSyntheticLambda0(0);
        HandlerScheduledExecutorService mainThreadExecutor = zzabp.mainThreadExecutor();
        mainThreadExecutor.getClass();
        this.featureSelectionListenerExecutor = mainThreadExecutor;
        if (!obj2.equals(obj2)) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((UseCase) it.next()).mUseCaseConfig.containsOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list4 = (List) this.preferredFeatureGroup;
        Set set = (Set) this.requiredFeatureGroup;
        if (!set.isEmpty() || !list4.isEmpty()) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((GroupableFeature) it2.next()).getFeatureTypeInternal());
            }
            for (FeatureTypeInternal featureTypeInternal : CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList))) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : set2) {
                    if (((GroupableFeature) obj3).getFeatureTypeInternal() == featureTypeInternal) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.size() > 1) {
                    Path$$ExternalSyntheticBUOutline0.m$3(arrayList2, "requiredFeatures has conflicting feature values: ");
                    throw null;
                }
            }
            if (CollectionsKt.distinct(list4).size() != list4.size()) {
                Path$$ExternalSyntheticBUOutline0.m$1("Duplicate values in preferredFeatures(", 41, list4);
                throw null;
            }
            LinkedHashSet intersect = CollectionsKt.intersect(set2, list4);
            if (!intersect.isEmpty()) {
                Path$$ExternalSyntheticBUOutline0.m$3(intersect, "requiredFeatures and preferredFeatures have duplicate values: ");
                throw null;
            }
            for (UseCase useCase : (List) this.useCases) {
                UseCaseType.Companion.getClass();
                if (Transition.AnonymousClass1.getFeatureGroupUseCaseType(useCase) == UseCaseType.UNDEFINED) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(useCase, " is not supported with feature group");
                    throw null;
                }
                String str3 = useCase instanceof Preview ? "Preview" : useCase instanceof ImageCapture ? "ImageCapture" : useCase instanceof ImageAnalysis ? "ImageAnalysis" : UseCaseUtil.isVideoCapture(useCase) ? "VideoCapture" : "UseCase";
                Iterator it3 = FeatureTypeInternal.$ENTRIES.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    UseCaseType.Companion.getClass();
                    int ordinal = ((FeatureTypeInternal) obj).ordinal();
                    if (ordinal == 0) {
                        containsOption = useCase.mUseCaseConfig.containsOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE);
                    } else if (ordinal == 1) {
                        containsOption = useCase.mUseCaseConfig.containsOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE);
                    } else if (ordinal == 2) {
                        containsOption = useCase.mUseCaseConfig.containsOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE) || useCase.mUseCaseConfig.containsOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE);
                    } else if (ordinal == 3) {
                        containsOption = useCase.mUseCaseConfig.containsOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT);
                    } else {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            throw null;
                        }
                        containsOption = Intrinsics.areEqual(useCase.mUseCaseConfig.retrieveOption(UseCaseConfig.OPTION_IS_VIDEO_QUALITY_SELECTOR_DEFAULT, Boolean.TRUE), Boolean.FALSE);
                    }
                    if (containsOption) {
                        break;
                    }
                }
                FeatureTypeInternal featureTypeInternal2 = (FeatureTypeInternal) obj;
                if (featureTypeInternal2 != null) {
                    StringBuilder sb = new StringBuilder("A ");
                    sb.append(featureTypeInternal2.name());
                    sb.append(" value is set to ");
                    sb.append(str3);
                    sb.append(" despite using feature groups. Do not use APIs like ");
                    int ordinal2 = featureTypeInternal2.ordinal();
                    if (ordinal2 == 0) {
                        concat = str3.concat(".Builder.setDynamicRange");
                    } else if (ordinal2 == 1) {
                        concat = str3.concat(".Builder.setTargetFrameRateRange");
                    } else if (ordinal2 == 2) {
                        concat = UseCaseUtil.isVideoCapture(useCase) ? str3.concat(".Builder.setVideoStabilizationEnabled") : str3.concat(".Builder.setPreviewStabilizationEnabled");
                    } else if (ordinal2 == 3) {
                        concat = str3.concat(".Builder.setOutputFormat");
                    } else {
                        if (ordinal2 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            throw null;
                        }
                        concat = "Recorder.Builder.setQualitySelector";
                    }
                    sb.append(concat);
                    sb.append(" while using feature groups. If, for example, ");
                    int ordinal3 = featureTypeInternal2.ordinal();
                    if (ordinal3 == 0) {
                        str = "HDR";
                    } else if (ordinal3 == 1) {
                        str = "60 FPS";
                    } else if (ordinal3 == 2) {
                        str = "stabilization";
                    } else if (ordinal3 == 3) {
                        str = "JPEG_R output format";
                    } else {
                        if (ordinal3 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            throw null;
                        }
                        str = "UHD recording quality";
                    }
                    sb.append(str);
                    sb.append(" is required, instead set ");
                    int ordinal4 = featureTypeInternal2.ordinal();
                    if (ordinal4 == 0) {
                        str2 = "GroupableFeature.HDR_HLG10";
                    } else if (ordinal4 == 1) {
                        str2 = "GroupableFeature.FPS_60";
                    } else if (ordinal4 == 2) {
                        str2 = "GroupableFeature.PREVIEW_STABILIZATION";
                    } else if (ordinal4 == 3) {
                        str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
                    } else {
                        if (ordinal4 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            throw null;
                        }
                        str2 = "GroupableFeatures.UHD_RECORDING";
                    }
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str2, " as either a required or preferred feature."));
                    throw null;
                }
            }
        }
        this.isLegacy = true;
    }

    public void safelyUpdateSelectedIndex(Integer num) {
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.frameRateRange;
        if (num == null) {
            stateFlowImpl.setValue((Integer) this.useCases);
            return;
        }
        int intValue = num.intValue();
        if (intValue < ((ArrayList) this.preferredFeatureGroup).size()) {
            Integer valueOf = Integer.valueOf(intValue);
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, valueOf);
        }
    }

    public void setVisibility(int i) {
        if (i == 0 && ((FlashState) this.featureSelectionListenerExecutor) == FlashState.UNAVAILABLE) {
            return;
        }
        ((ImageButton) this.effects).setVisibility(i);
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                StringBuilder sb = new StringBuilder("SessionConfig@");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" {useCases=");
                sb.append((List) this.useCases);
                sb.append(", frameRateRange=");
                sb.append((Range) this.frameRateRange);
                sb.append(", requiredFeatureGroup=");
                sb.append((Set) this.requiredFeatureGroup);
                sb.append(", preferredFeatureGroup=");
                sb.append((List) this.preferredFeatureGroup);
                sb.append(", effects=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, (List) this.effects, ", viewPort=null}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c1, code lost:
    
        if (r7 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LegacySessionConfig(SubtreeManager subtreeManager, String str) {
        Object obj;
        String str2;
        this.effects = subtreeManager;
        ArrayList arrayList = (ArrayList) subtreeManager.children;
        this.preferredFeatureGroup = arrayList;
        final int i = 0;
        this.useCases = 0;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.FALSE);
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(0);
        this.frameRateRange = MutableStateFlow2;
        this.requiredFeatureGroup = MutableStateFlow2;
        this.featureSelectionListener = FlowKt.MutableStateFlow((IdentifierResolvableString) subtreeManager.workflowSession);
        IblLoaderKt.mapAsStateFlow(MutableStateFlow2, new Function1(this) { // from class: com.stripe.android.uicore.elements.DropdownFieldController$$ExternalSyntheticLambda0
            public final /* synthetic */ LegacySessionConfig f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                LegacySessionConfig legacySessionConfig = this.f$0;
                Integer num = (Integer) obj2;
                switch (i2) {
                    case 0:
                        if (num != null) {
                            String str3 = (String) ((ArrayList) legacySessionConfig.preferredFeatureGroup).get(num.intValue());
                            if (str3 != null) {
                                return str3;
                            }
                        }
                        return "";
                    default:
                        if (num != null) {
                            return (String) CollectionsKt.getOrNull(num.intValue(), (ArrayList) ((SubtreeManager) legacySessionConfig.effects).idCounter);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        FlowToStateFlow mapAsStateFlow = IblLoaderKt.mapAsStateFlow(MutableStateFlow2, new Function1(this) { // from class: com.stripe.android.uicore.elements.DropdownFieldController$$ExternalSyntheticLambda0
            public final /* synthetic */ LegacySessionConfig f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                LegacySessionConfig legacySessionConfig = this.f$0;
                Integer num = (Integer) obj2;
                switch (i22) {
                    case 0:
                        if (num != null) {
                            String str3 = (String) ((ArrayList) legacySessionConfig.preferredFeatureGroup).get(num.intValue());
                            if (str3 != null) {
                                return str3;
                            }
                        }
                        return "";
                    default:
                        if (num != null) {
                            return (String) CollectionsKt.getOrNull(num.intValue(), (ArrayList) ((SubtreeManager) legacySessionConfig.effects).idCounter);
                        }
                        return null;
                }
            }
        });
        this.featureSelectionListenerExecutor = IblLoaderKt.combineAsStateFlow(MutableStateFlow, MutableStateFlow2, new PhoneNumberController$$ExternalSyntheticLambda5(23));
        IblLoaderKt.combineAsStateFlow(IblLoaderKt.mapAsStateFlow(MutableStateFlow2, new StripeApiRepository$$ExternalSyntheticLambda5(26)), mapAsStateFlow, new PhoneNumberController$$ExternalSyntheticLambda5(24));
        this.isLegacy = ((DropdownConfig$Mode$Condensed) subtreeManager.contextForChildren) instanceof DropdownConfig$Mode$Condensed;
        if (str != null) {
            Set set = CountryUtils.supportedBillingCountries;
            CountryCode.Companion.getClass();
            CountryCode create = CountryCode.Companion.create(str);
            Locale locale = Locale.getDefault();
            locale.getClass();
            Iterator it = CountryUtils.getSortedLocalizedCountries(locale).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((Country) obj).code, create)) {
                        break;
                    }
                }
            }
            Country country = (Country) obj;
            if (country != null) {
                int indexOf = ((ArrayList) subtreeManager.interceptor).indexOf(country);
                Integer valueOf = indexOf == -1 ? null : Integer.valueOf(indexOf);
                str2 = valueOf != null ? (String) arrayList.get(valueOf.intValue()) : null;
            }
            str2 = (String) CollectionsKt.firstOrNull((List) arrayList);
            if (str2 == null) {
                str2 = "";
            }
            int indexOf2 = arrayList.indexOf(str2);
            Integer valueOf2 = indexOf2 != -1 ? Integer.valueOf(indexOf2) : null;
            safelyUpdateSelectedIndex(valueOf2 == null ? (Integer) this.useCases : valueOf2);
        }
    }

    public LegacySessionConfig(Context context, ScannerView scannerView) {
        ColorPalette colorPalette = ThemeHelpersKt.findThemeInfo(context).colorPalette;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sv_flash_view, (ViewGroup) scannerView, false);
        inflate.getClass();
        View view = (ImageButton) inflate;
        this.effects = view;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, null, null, 14, null);
        mooncakePillButton.setText(context.getString(R.string.sv_camera_flash));
        mooncakePillButton.setCompoundDrawablePadding(Views.dip((View) mooncakePillButton, 8));
        this.preferredFeatureGroup = mooncakePillButton;
        this.useCases = PlatformKt.getDrawableCompat(context, R.drawable.sv_flash_on, null);
        this.frameRateRange = PlatformKt.getDrawableCompat(context, R.drawable.sv_flash_off, null);
        this.requiredFeatureGroup = PlatformKt.getDrawableCompat(context, R.drawable.sv_flash_redesign, Integer.valueOf(colorPalette.secondaryButtonTint));
        this.featureSelectionListener = PlatformKt.getDrawableCompat(context, R.drawable.sv_flash_redesign, Integer.valueOf(colorPalette.primaryButtonTint));
        this.featureSelectionListenerExecutor = FlashState.UNAVAILABLE;
        this.isLegacy = true;
        view.setVisibility(8);
        mooncakePillButton.setVisibility(8);
        scannerView.addView(view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        scannerView.addView(mooncakePillButton, layoutParams);
        scannerView.setViewToAlignBelowTargetBounds(mooncakePillButton);
    }
}

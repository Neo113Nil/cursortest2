package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.lifecycle.LifecycleOwner;
import androidx.paging.CachedPagingDataKt$cachedIn$2;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.navigation.Navigator;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.core.internal.CoreFeature$initialize$2;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$timeZone$2;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.views.InlineAppMessageView$Factory$Impl;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.treehouse.accessibility.RealAccessibilityCallbackService;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer_Factory;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import net.idrnd.face.iad.capture.internal.o0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AnchoredDraggableState implements AndroidInfoProvider {
    public final Object anchoredDragScope;
    public final Object anchors$delegate;
    public final Object animationSpec;
    public final Object closestValue$delegate;
    public final Object confirmValueChange;
    public final Object currentValue$delegate;
    public final Object dragMutex;
    public final Object dragTarget$delegate;
    public final Object draggableState;
    public final Object lastVelocity$delegate;
    public final Object offset$delegate;
    public final Object positionalThreshold;
    public final Object targetValue$delegate;
    public final Object velocityThreshold;

    public AnchoredDraggableState(final Context context) {
        context.getClass();
        String str = Build.BRAND;
        str = str == null ? "" : str;
        String str2 = Build.MODEL;
        str2 = str2 == null ? "" : str2;
        String str3 = Build.ID;
        str3 = str3 == null ? "" : str3;
        String str4 = Build.VERSION.RELEASE;
        String str5 = str4 != null ? str4 : "";
        BuildSdkVersionProvider.Companion.getClass();
        this.positionalThreshold = BuildSdkVersionProvider.Companion.DEFAULT;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.confirmValueChange = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new CoreFeature$initialize$2(context, str2));
        final int i = 0;
        this.velocityThreshold = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceName$2
            public final /* synthetic */ AnchoredDraggableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AnchoredDraggableState anchoredDraggableState = this.this$0;
                switch (i2) {
                    case 0:
                        boolean isBlank = StringsKt.isBlank(anchoredDraggableState.getDeviceBrand());
                        String str6 = (String) anchoredDraggableState.dragTarget$delegate;
                        return (isBlank || StringsKt.contains((CharSequence) str6, (CharSequence) anchoredDraggableState.getDeviceBrand(), false)) ? str6 : Recorder$$ExternalSyntheticOutline2.m(anchoredDraggableState.getDeviceBrand(), " ", str6);
                    default:
                        return (String) CollectionsKt.first(StringsKt.split$default((String) anchoredDraggableState.closestValue$delegate, new char[]{'.'}, 6));
                }
            }
        });
        this.animationSpec = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$locales$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String languageTag;
                String languageTag2;
                int i2 = i;
                AnchoredDraggableState anchoredDraggableState = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        Resources resources = context2.getResources();
                        ArrayList arrayList = new ArrayList();
                        if (((BuildSdkVersionProvider$Companion$DEFAULT$1) ((BuildSdkVersionProvider) anchoredDraggableState.positionalThreshold)).isAtLeastN) {
                            LocaleList locales = resources.getConfiguration().getLocales();
                            locales.getClass();
                            int size = locales.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                Locale locale = locales.get(i3);
                                if (locale != null && (languageTag2 = locale.toLanguageTag()) != null) {
                                    arrayList.add(languageTag2);
                                }
                            }
                        } else {
                            Locale locale2 = resources.getConfiguration().locale;
                            if (locale2 != null && (languageTag = locale2.toLanguageTag()) != null) {
                                arrayList.add(languageTag);
                            }
                        }
                        return arrayList;
                    default:
                        Resources resources2 = context2.getResources();
                        boolean z = ((BuildSdkVersionProvider$Companion$DEFAULT$1) ((BuildSdkVersionProvider) anchoredDraggableState.positionalThreshold)).isAtLeastN;
                        String str6 = null;
                        if (z) {
                            Locale locale3 = resources2.getConfiguration().getLocales().get(0);
                            if (locale3 != null) {
                                str6 = locale3.toLanguageTag();
                            }
                        } else {
                            Locale locale4 = resources2.getConfiguration().locale;
                            if (locale4 != null) {
                                str6 = locale4.toLanguageTag();
                            }
                        }
                        return str6 == null ? Locale.getDefault().toLanguageTag() : str6;
                }
            }
        });
        final int i2 = 1;
        this.dragMutex = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$locales$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String languageTag;
                String languageTag2;
                int i22 = i2;
                AnchoredDraggableState anchoredDraggableState = this;
                Context context2 = context;
                switch (i22) {
                    case 0:
                        Resources resources = context2.getResources();
                        ArrayList arrayList = new ArrayList();
                        if (((BuildSdkVersionProvider$Companion$DEFAULT$1) ((BuildSdkVersionProvider) anchoredDraggableState.positionalThreshold)).isAtLeastN) {
                            LocaleList locales = resources.getConfiguration().getLocales();
                            locales.getClass();
                            int size = locales.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                Locale locale = locales.get(i3);
                                if (locale != null && (languageTag2 = locale.toLanguageTag()) != null) {
                                    arrayList.add(languageTag2);
                                }
                            }
                        } else {
                            Locale locale2 = resources.getConfiguration().locale;
                            if (locale2 != null && (languageTag = locale2.toLanguageTag()) != null) {
                                arrayList.add(languageTag);
                            }
                        }
                        return arrayList;
                    default:
                        Resources resources2 = context2.getResources();
                        boolean z = ((BuildSdkVersionProvider$Companion$DEFAULT$1) ((BuildSdkVersionProvider) anchoredDraggableState.positionalThreshold)).isAtLeastN;
                        String str6 = null;
                        if (z) {
                            Locale locale3 = resources2.getConfiguration().getLocales().get(0);
                            if (locale3 != null) {
                                str6 = locale3.toLanguageTag();
                            }
                        } else {
                            Locale locale4 = resources2.getConfiguration().locale;
                            if (locale4 != null) {
                                str6 = locale4.toLanguageTag();
                            }
                        }
                        return str6 == null ? Locale.getDefault().toLanguageTag() : str6;
                }
            }
        });
        this.draggableState = LazyKt.lazy(lazyThreadSafetyMode, (Function0) DefaultAndroidInfoProvider$timeZone$2.INSTANCE);
        this.currentValue$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new DatadogInterceptor$intercept$1(str, 9));
        this.dragTarget$delegate = str2;
        this.anchors$delegate = str3;
        this.targetValue$delegate = "Android";
        this.closestValue$delegate = str5;
        this.offset$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceName$2
            public final /* synthetic */ AnchoredDraggableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AnchoredDraggableState anchoredDraggableState = this.this$0;
                switch (i22) {
                    case 0:
                        boolean isBlank = StringsKt.isBlank(anchoredDraggableState.getDeviceBrand());
                        String str6 = (String) anchoredDraggableState.dragTarget$delegate;
                        return (isBlank || StringsKt.contains((CharSequence) str6, (CharSequence) anchoredDraggableState.getDeviceBrand(), false)) ? str6 : Recorder$$ExternalSyntheticOutline2.m(anchoredDraggableState.getDeviceBrand(), " ", str6);
                    default:
                        return (String) CollectionsKt.first(StringsKt.split$default((String) anchoredDraggableState.closestValue$delegate, new char[]{'.'}, 6));
                }
            }
        });
        this.lastVelocity$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) DefaultAndroidInfoProvider$timeZone$2.INSTANCE$2);
        this.anchoredDragScope = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KeyHandle$keyPair$2(context, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object anchoredDrag(Object obj, MutatePriority mutatePriority, AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2, ContinuationImpl continuationImpl) {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        int i;
        Continuation continuation;
        Object closestAnchor;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) this.dragTarget$delegate;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) this.offset$delegate;
        Function1 function1 = (Function1) this.confirmValueChange;
        try {
            if (continuationImpl instanceof AnchoredDraggableState$anchoredDrag$3) {
                anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) continuationImpl;
                int i2 = anchoredDraggableState$anchoredDrag$3.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    anchoredDraggableState$anchoredDrag$3.label = i2 - PKIFailureInfo.systemUnavail;
                    AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$32 = anchoredDraggableState$anchoredDrag$3;
                    Object obj2 = anchoredDraggableState$anchoredDrag$32.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anchoredDraggableState$anchoredDrag$32.label;
                    Continuation continuation2 = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        if (!getAnchors().anchors.containsKey(obj)) {
                            setCurrentValue(obj);
                            return Unit.INSTANCE;
                        }
                        InternalMutatorMutex internalMutatorMutex = (InternalMutatorMutex) this.dragMutex;
                        continuation = null;
                        try {
                            SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(this, obj, anchoredDraggableKt$animateTo$2, false, continuation, 5);
                            anchoredDraggableState$anchoredDrag$32.label = 1;
                            internalMutatorMutex.getClass();
                            continuation = null;
                            if (JobKt.coroutineScope(new EngineInterceptor$intercept$2(mutatePriority, internalMutatorMutex, sessionWorker$doWork$2$2, continuation2, 4), anchoredDraggableState$anchoredDrag$32) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } catch (Throwable th) {
                            th = th;
                            parcelableSnapshotMutableState.setValue(continuation);
                            Object closestAnchor2 = getAnchors().closestAnchor(parcelableSnapshotMutableFloatState.getFloatValue());
                            if (closestAnchor2 != null && Math.abs(parcelableSnapshotMutableFloatState.getFloatValue() - getAnchors().positionOf(closestAnchor2)) <= 0.5f && ((Boolean) function1.invoke(closestAnchor2)).booleanValue()) {
                                setCurrentValue(closestAnchor2);
                            }
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                        continuation = null;
                    }
                    parcelableSnapshotMutableState.setValue(continuation);
                    closestAnchor = getAnchors().closestAnchor(parcelableSnapshotMutableFloatState.getFloatValue());
                    if (closestAnchor != null && Math.abs(parcelableSnapshotMutableFloatState.getFloatValue() - getAnchors().positionOf(closestAnchor)) <= 0.5f && ((Boolean) function1.invoke(closestAnchor)).booleanValue()) {
                        setCurrentValue(closestAnchor);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            parcelableSnapshotMutableState.setValue(continuation);
            closestAnchor = getAnchors().closestAnchor(parcelableSnapshotMutableFloatState.getFloatValue());
            if (closestAnchor != null) {
                setCurrentValue(closestAnchor);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            continuation = null;
        }
        anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuationImpl);
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$322 = anchoredDraggableState$anchoredDrag$3;
        Object obj22 = anchoredDraggableState$anchoredDrag$322.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableState$anchoredDrag$322.label;
        Continuation continuation22 = null;
    }

    public Object computeTarget(float f, float f2, Object obj) {
        Function1 function1 = (Function1) this.positionalThreshold;
        MapDraggableAnchors anchors = getAnchors();
        float positionOf = anchors.positionOf(obj);
        float floatValue = ((Number) ((Function0) this.velocityThreshold).invoke()).floatValue();
        if (positionOf != f && !Float.isNaN(positionOf)) {
            if (positionOf < f) {
                if (f2 >= floatValue) {
                    Object closestAnchor = anchors.closestAnchor(f, true);
                    closestAnchor.getClass();
                    return closestAnchor;
                }
                Object closestAnchor2 = anchors.closestAnchor(f, true);
                closestAnchor2.getClass();
                if (f >= Math.abs(Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(anchors.positionOf(closestAnchor2) - positionOf)))).floatValue()) + positionOf)) {
                    return closestAnchor2;
                }
            } else {
                if (f2 <= (-floatValue)) {
                    Object closestAnchor3 = anchors.closestAnchor(f, false);
                    closestAnchor3.getClass();
                    return closestAnchor3;
                }
                Object closestAnchor4 = anchors.closestAnchor(f, false);
                closestAnchor4.getClass();
                float abs = Math.abs(positionOf - Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(positionOf - anchors.positionOf(closestAnchor4))))).floatValue()));
                if (f >= RecyclerView.DECELERATION_RATE ? f <= abs : Math.abs(f) >= abs) {
                    return closestAnchor4;
                }
            }
        }
        return obj;
    }

    public MapDraggableAnchors getAnchors() {
        return (MapDraggableAnchors) ((ParcelableSnapshotMutableState) this.anchors$delegate).getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getArchitecture() {
        return (String) ((Lazy) this.lastVelocity$delegate).getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getCurrentLocale() {
        Object value = ((Lazy) this.dragMutex).getValue();
        value.getClass();
        return (String) value;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceBrand() {
        return (String) ((Lazy) this.currentValue$delegate).getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceBuildId() {
        return (String) this.anchors$delegate;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceModel() {
        return (String) this.dragTarget$delegate;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceName() {
        return (String) ((Lazy) this.velocityThreshold).getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public DeviceType getDeviceType() {
        return (DeviceType) ((Lazy) this.confirmValueChange).getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public List getLocales() {
        return (List) ((Lazy) this.animationSpec).getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public Integer getNumberOfDisplays() {
        return (Integer) ((Lazy) this.anchoredDragScope).getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getOsMajorVersion() {
        return (String) ((Lazy) this.offset$delegate).getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getOsName() {
        return (String) this.targetValue$delegate;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getOsVersion() {
        return (String) this.closestValue$delegate;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getTimeZone() {
        Object value = ((Lazy) this.draggableState).getValue();
        value.getClass();
        return (String) value;
    }

    public float newOffsetForDelta$material(float f) {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) this.offset$delegate;
        float floatValue = (Float.isNaN(parcelableSnapshotMutableFloatState.getFloatValue()) ? RecyclerView.DECELERATION_RATE : parcelableSnapshotMutableFloatState.getFloatValue()) + f;
        Float m4125minOrNull = CollectionsKt.m4125minOrNull((Iterable) getAnchors().anchors.values());
        float floatValue2 = m4125minOrNull != null ? m4125minOrNull.floatValue() : Float.NaN;
        Float m4123maxOrNull = CollectionsKt.m4123maxOrNull((Iterable) getAnchors().anchors.values());
        return RangesKt___RangesKt.coerceIn(floatValue, floatValue2, m4123maxOrNull != null ? m4123maxOrNull.floatValue() : Float.NaN);
    }

    public float requireOffset() {
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) this.offset$delegate;
        if (!Float.isNaN(parcelableSnapshotMutableFloatState.getFloatValue())) {
            return parcelableSnapshotMutableFloatState.getFloatValue();
        }
        a$$ExternalSyntheticBUOutline0.m$1("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return RecyclerView.DECELERATION_RATE;
    }

    public void setCurrentValue(Object obj) {
        ((ParcelableSnapshotMutableState) this.currentValue$delegate).setValue(obj);
    }

    public Object settle(float f, ContinuationImpl continuationImpl) {
        Object value = ((ParcelableSnapshotMutableState) this.currentValue$delegate).getValue();
        Object computeTarget = computeTarget(requireOffset(), f, value);
        if (((Boolean) ((Function1) this.confirmValueChange).invoke(computeTarget)).booleanValue()) {
            Object animateTo = CardKt.animateTo(this, computeTarget, f, continuationImpl);
            return animateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo : Unit.INSTANCE;
        }
        Object animateTo2 = CardKt.animateTo(this, value, f, continuationImpl);
        return animateTo2 == CoroutineSingletons.COROUTINE_SUSPENDED ? animateTo2 : Unit.INSTANCE;
    }

    public AnchoredDraggableState(Context context, Navigator navigator, o0 o0Var, RealCashVibrator realCashVibrator, RealSharedReactionState realSharedReactionState, RealImageLoader realImageLoader, AndroidBiometricsStore androidBiometricsStore, Instrument$Adapter instrument$Adapter, InlineAppMessagePresenterHelper$Factory$Impl inlineAppMessagePresenterHelper$Factory$Impl, Flow flow, InlineAppMessageView$Factory$Impl inlineAppMessageView$Factory$Impl, BadgeQueries$$ExternalSyntheticLambda5 badgeQueries$$ExternalSyntheticLambda5, RealAccessibilityCallbackService realAccessibilityCallbackService, LifecycleOwner lifecycleOwner) {
        navigator.getClass();
        o0Var.getClass();
        androidBiometricsStore.getClass();
        this.positionalThreshold = context;
        this.confirmValueChange = navigator;
        this.velocityThreshold = o0Var;
        this.animationSpec = realCashVibrator;
        this.dragMutex = realSharedReactionState;
        this.draggableState = realImageLoader;
        this.currentValue$delegate = androidBiometricsStore;
        this.dragTarget$delegate = instrument$Adapter;
        this.anchors$delegate = inlineAppMessagePresenterHelper$Factory$Impl;
        this.targetValue$delegate = flow;
        this.closestValue$delegate = inlineAppMessageView$Factory$Impl;
        this.offset$delegate = badgeQueries$$ExternalSyntheticLambda5;
        this.lastVelocity$delegate = realAccessibilityCallbackService;
        this.anchoredDragScope = lifecycleOwner;
    }

    public AnchoredDraggableState(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, Provider provider, InstanceFactory instanceFactory, DocumentCameraWorker_Factory documentCameraWorker_Factory, GooglePayJsonFactory_Factory googlePayJsonFactory_Factory, GooglePayJsonFactory_Factory googlePayJsonFactory_Factory2, GovIdCaptureRenderer_Factory govIdCaptureRenderer_Factory, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, Logger_Factory logger_Factory, CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.positionalThreshold = inquiryActivityModule_ContextFactory;
        this.confirmValueChange = provider;
        this.velocityThreshold = instanceFactory;
        this.animationSpec = documentCameraWorker_Factory;
        this.dragMutex = googlePayJsonFactory_Factory;
        this.draggableState = googlePayJsonFactory_Factory2;
        this.currentValue$delegate = govIdCaptureRenderer_Factory;
        this.dragTarget$delegate = selfieDirectionFeed_Factory;
        this.anchors$delegate = logger_Factory;
        this.targetValue$delegate = cameraModule_CameraStatsManagerFactory;
        this.closestValue$delegate = provider2;
        this.offset$delegate = provider3;
        this.lastVelocity$delegate = provider4;
        this.anchoredDragScope = provider5;
    }

    public AnchoredDraggableState(Enum r1, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = animationSpec;
        this.confirmValueChange = function12;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue$delegate = Updater.mutableStateOf$default(r1);
        this.targetValue$delegate = Updater.derivedStateOf(new AnchoredDraggableState$$ExternalSyntheticLambda0(this, 0));
        this.closestValue$delegate = Updater.derivedStateOf(new AnchoredDraggableState$$ExternalSyntheticLambda0(this, 1));
        this.offset$delegate = new ParcelableSnapshotMutableFloatState(Float.NaN);
        Updater.derivedStateOf(NeverEqualPolicy.INSTANCE$3, new AnchoredDraggableState$$ExternalSyntheticLambda0(this, 2));
        this.lastVelocity$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
        this.dragTarget$delegate = Updater.mutableStateOf$default(null);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.anchors$delegate = Updater.mutableStateOf$default(new MapDraggableAnchors(emptyMap));
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object anchoredDrag(MutatePriority mutatePriority, CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2, Continuation continuation) {
        AnchoredDraggableState$anchoredDrag$1 anchoredDraggableState$anchoredDrag$1;
        int i;
        Object closestAnchor;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) this.offset$delegate;
        Function1 function1 = (Function1) this.confirmValueChange;
        try {
            if (continuation instanceof AnchoredDraggableState$anchoredDrag$1) {
                anchoredDraggableState$anchoredDrag$1 = (AnchoredDraggableState$anchoredDrag$1) continuation;
                int i2 = anchoredDraggableState$anchoredDrag$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    anchoredDraggableState$anchoredDrag$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = anchoredDraggableState$anchoredDrag$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anchoredDraggableState$anchoredDrag$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        InternalMutatorMutex internalMutatorMutex = (InternalMutatorMutex) this.dragMutex;
                        Continuation continuation2 = null;
                        PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(this, cachedPagingDataKt$cachedIn$2, continuation2, 6);
                        anchoredDraggableState$anchoredDrag$1.label = 1;
                        internalMutatorMutex.getClass();
                        if (JobKt.coroutineScope(new EngineInterceptor$intercept$2(mutatePriority, internalMutatorMutex, pagingDataPresenter$collectFrom$2, continuation2, 4), anchoredDraggableState$anchoredDrag$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    closestAnchor = getAnchors().closestAnchor(parcelableSnapshotMutableFloatState.getFloatValue());
                    if (closestAnchor != null && Math.abs(parcelableSnapshotMutableFloatState.getFloatValue() - getAnchors().positionOf(closestAnchor)) <= 0.5f && ((Boolean) function1.invoke(closestAnchor)).booleanValue()) {
                        setCurrentValue(closestAnchor);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            closestAnchor = getAnchors().closestAnchor(parcelableSnapshotMutableFloatState.getFloatValue());
            if (closestAnchor != null) {
                setCurrentValue(closestAnchor);
            }
            return Unit.INSTANCE;
        } finally {
        }
        anchoredDraggableState$anchoredDrag$1 = new AnchoredDraggableState$anchoredDrag$1(this, continuation);
        Object obj2 = anchoredDraggableState$anchoredDrag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableState$anchoredDrag$1.label;
    }
}

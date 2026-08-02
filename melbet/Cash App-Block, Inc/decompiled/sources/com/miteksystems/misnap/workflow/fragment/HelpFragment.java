package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.provider.FontsContractCompat;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewbinding.ViewBindings;
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.common.base.Splitter;
import com.miteksystems.misnap.barcode.BarcodeAnalysisSettings;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.camera.frameproducers.FrameLoader;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.requirements.CameraSelectorFilter;
import com.miteksystems.misnap.camera.util.CameraUtil$CameraSupportResult;
import com.miteksystems.misnap.camera.util.CameraUtil$CameraSupportResult$Error$Execution;
import com.miteksystems.misnap.camera.util.CameraUtil$WhenMappings;
import com.miteksystems.misnap.core.LiveDataUtil;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import com.miteksystems.misnap.face.FaceAnalysisSettings;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.MiSnapWorkflowStep;
import com.miteksystems.misnap.workflow.fragment.HelpFragment;
import com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler;
import com.miteksystems.misnap.workflow.util.SharedPrefsUtil;
import com.miteksystems.misnap.workflow.util.TextUtil;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.plaid.internal.c7$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.Json;
import net.idrnd.face.iad.capture.internal.s;
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.MultipartBody;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/HelpFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "a", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class HelpFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public boolean b;
    public boolean c;
    public Integer d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final HelpFragment$$ExternalSyntheticLambda2 h;
    public final ActivityResultLauncher i;
    public final /* synthetic */ RedwoodLayoutKt$toAndroid$1 j;
    public final Lazy k;
    public final Lazy l;
    public static final /* synthetic */ KProperty[] m = {Reflection.factory.property1(new PropertyReference1Impl(HelpFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentHelpScreenRootBinding;", 0))};
    public static final Companion Companion = new Companion();
    public static final /* synthetic */ List n = CollectionsKt__CollectionsKt.listOf((Object[]) new MiSnapSettings.UseCase[]{MiSnapSettings.UseCase.BARCODE, MiSnapSettings.UseCase.FACE, MiSnapSettings.UseCase.VOICE});
    public static final /* synthetic */ int o = 35;

    public final class Companion {

        public abstract /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[MiSnapSettings.UseCase.values().length];
                try {
                    iArr[7] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[9] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[6] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[0] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[1] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[2] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[3] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[4] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[5] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:101:0x0072, code lost:
        
            if (r8.intValue() != 2) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x0079, code lost:
        
            if (androidx.core.view.WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(r8) == 2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            if (r8.intValue() != 2) goto L39;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v13, types: [com.miteksystems.misnap.core.MiSnapSettings$Analysis$Face$Trigger] */
        /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.Result$Failure] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static WorkflowSettings getDefaultWorkflowSettings(MiSnapSettings miSnapSettings, Context context, MiSnapWorkflowStep.Behavior behavior) {
            Integer num;
            int i;
            Integer failure;
            int i2;
            Object failure2;
            Object failure3;
            Integer valueOf = Integer.valueOf(R.layout.misnap_help_voice);
            MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
            MiSnapSettings.UseCase useCase = miSnapSettings.a;
            if (context != null) {
                int i3 = a.a[useCase.ordinal()];
                boolean z = true;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            try {
                                Result.Companion companion = Result.Companion;
                                failure3 = Integer.valueOf(DocumentAnalysisSettings.getOrientation(analysis.document, WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context)));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                failure3 = new Result.Failure(th);
                            }
                            if (failure3 instanceof Result.Failure) {
                                failure3 = null;
                            }
                            Integer num2 = (Integer) failure3;
                            if (num2 != null) {
                            }
                        } else {
                            try {
                                Result.Companion companion3 = Result.Companion;
                                failure2 = Integer.valueOf(BarcodeAnalysisSettings.getOrientation(analysis.barcode, WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context)));
                            } catch (Throwable th2) {
                                Result.Companion companion4 = Result.Companion;
                                failure2 = new Result.Failure(th2);
                            }
                            if (failure2 instanceof Result.Failure) {
                                failure2 = null;
                            }
                            Integer num3 = (Integer) failure2;
                            if (num3 != null) {
                            }
                        }
                    }
                }
                z = false;
                int[] iArr = a.a;
                switch (iArr[useCase.ordinal()]) {
                    case 1:
                        i = R.layout.misnap_help_face_manual;
                        num = Integer.valueOf(i);
                        break;
                    case 2:
                        num = valueOf;
                        break;
                    case 3:
                        i = Intrinsics.areEqual(behavior, MiSnapWorkflowStep.Behavior.OnMissingNldBSN.INSTANCE) ? z ? R.layout.misnap_help_nld_bsn_qr_horizontal_manual : R.layout.misnap_help_nld_bsn_qr_vertical_manual : z ? R.layout.misnap_help_barcode_horizontal_manual : R.layout.misnap_help_barcode_vertical_manual;
                        num = Integer.valueOf(i);
                        break;
                    case 4:
                        i = z ? R.layout.misnap_help_passport_horizontal_manual : R.layout.misnap_help_passport_vertical_manual;
                        num = Integer.valueOf(i);
                        break;
                    case 5:
                        i = z ? R.layout.misnap_help_id_front_horizontal_manual : R.layout.misnap_help_id_front_vertical_manual;
                        num = Integer.valueOf(i);
                        break;
                    case 6:
                        i = z ? R.layout.misnap_help_id_back_horizontal_manual : R.layout.misnap_help_id_back_vertical_manual;
                        num = Integer.valueOf(i);
                        break;
                    case 7:
                        i = z ? R.layout.misnap_help_check_front_horizontal_manual : R.layout.misnap_help_check_front_vertical_manual;
                        num = Integer.valueOf(i);
                        break;
                    case 8:
                        i = z ? R.layout.misnap_help_check_back_horizontal_manual : R.layout.misnap_help_check_back_vertical_manual;
                        num = Integer.valueOf(i);
                        break;
                    default:
                        i = R.layout.misnap_help_generic_manual;
                        num = Integer.valueOf(i);
                        break;
                }
                switch (iArr[useCase.ordinal()]) {
                    case 1:
                        try {
                            Result.Companion companion5 = Result.Companion;
                            failure = FaceAnalysisSettings.requireTrigger(analysis.face);
                        } catch (Throwable th3) {
                            Result.Companion companion6 = Result.Companion;
                            failure = new Result.Failure(th3);
                        }
                        if ((failure instanceof Result.Failure ? null : failure) != MiSnapSettings.Analysis.Face.Trigger.AUTO) {
                            i2 = R.layout.misnap_help_face_auto_smile;
                            break;
                        } else {
                            i2 = R.layout.misnap_help_face_auto;
                            break;
                        }
                    case 2:
                        break;
                    case 3:
                        if (!Intrinsics.areEqual(behavior, MiSnapWorkflowStep.Behavior.OnMissingNldBSN.INSTANCE)) {
                            if (!z) {
                                i2 = R.layout.misnap_help_barcode_vertical_auto;
                                break;
                            } else {
                                i2 = R.layout.misnap_help_barcode_horizontal_auto;
                                break;
                            }
                        } else if (!z) {
                            i2 = R.layout.misnap_help_nld_bsn_qr_vertical_auto;
                            break;
                        } else {
                            i2 = R.layout.misnap_help_nld_bsn_qr_horizontal_auto;
                            break;
                        }
                    case 4:
                        if (!z) {
                            i2 = R.layout.misnap_help_passport_vertical_auto;
                            break;
                        } else {
                            i2 = R.layout.misnap_help_passport_horizontal_auto;
                            break;
                        }
                    case 5:
                        if (!z) {
                            i2 = R.layout.misnap_help_id_front_vertical_auto;
                            break;
                        } else {
                            i2 = R.layout.misnap_help_id_front_horizontal_auto;
                            break;
                        }
                    case 6:
                        if (!z) {
                            i2 = R.layout.misnap_help_id_back_vertical_auto;
                            break;
                        } else {
                            i2 = R.layout.misnap_help_id_back_horizontal_auto;
                            break;
                        }
                    case 7:
                        if (!z) {
                            i2 = R.layout.misnap_help_check_front_vertical_auto;
                            break;
                        } else {
                            i2 = R.layout.misnap_help_check_front_horizontal_auto;
                            break;
                        }
                    case 8:
                        if (!z) {
                            i2 = R.layout.misnap_help_check_back_vertical_auto;
                            break;
                        } else {
                            i2 = R.layout.misnap_help_check_back_horizontal_auto;
                            break;
                        }
                    default:
                        i2 = R.layout.misnap_help_generic_auto;
                        break;
                }
                valueOf = Integer.valueOf(i2);
                r2 = valueOf;
            } else {
                num = null;
            }
            return new WorkflowSettings(r2, num);
        }

        public static /* synthetic */ WorkflowSettings getDefaultWorkflowSettings$default(Companion companion, MiSnapSettings miSnapSettings, Context context) {
            companion.getClass();
            return getDefaultWorkflowSettings(miSnapSettings, context, null);
        }
    }

    public final class a {
        public final /* synthetic */ String[] a;
        public /* synthetic */ int b;

        public a(String[] strArr) {
            this.a = strArr;
            if (strArr.length != 0) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Tutorial Instruction Sequence messages array cannot be empty");
            throw null;
        }
    }

    public abstract /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.UseCase.values().length];
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[9] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public static final c a = new c(1, com.miteksystems.misnap.workflow.a.g.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentHelpScreenRootBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.frameLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frameLayout);
            if (frameLayout != null) {
                i = R.id.guidelineBottomContent;
                if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineBottomContent)) != null) {
                    i = R.id.guidelineEndContent;
                    if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineEndContent)) != null) {
                        i = R.id.guidelineStartContent;
                        if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineStartContent)) != null) {
                            i = R.id.guidelineTopButton;
                            if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineTopButton)) != null) {
                                i = R.id.guidelineTopContent;
                                if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineTopContent)) != null) {
                                    i = R.id.primaryActionButton;
                                    MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.primaryActionButton);
                                    if (materialButton != null) {
                                        i = R.id.secondaryActionButton;
                                        MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.secondaryActionButton);
                                        if (materialButton2 != null) {
                                            i = R.id.skipCheckBox;
                                            MaterialCheckBox materialCheckBox = (MaterialCheckBox) ViewBindings.findChildViewById(view, R.id.skipCheckBox);
                                            if (materialCheckBox != null) {
                                                i = R.id.skipCheckBoxContainer;
                                                if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.skipCheckBoxContainer)) != null) {
                                                    return new com.miteksystems.misnap.workflow.a.g((ConstraintLayout) view, frameLayout, materialButton, materialButton2, materialCheckBox);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            return null;
        }
    }

    public final class d extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ HelpFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(HelpFragment helpFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = helpFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            String[] strArr;
            String[] strArr2;
            Boolean b;
            String str;
            int i = this.$r8$classId;
            HelpFragment helpFragment = this.a;
            switch (i) {
                case 0:
                    FragmentActivity requireActivity = helpFragment.requireActivity();
                    requireActivity.getClass();
                    ViewModelStore viewModelStore = requireActivity.getViewModelStore();
                    ViewModelProvider$Factory defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
                    CreationExtras defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
                    viewModelStore.getClass();
                    defaultViewModelProviderFactory.getClass();
                    defaultViewModelCreationExtras.getClass();
                    SimpleActor simpleActor = new SimpleActor(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                    KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CombinedWorkflowHandler.CombinedViewModel.class);
                    String qualifiedName = orCreateKotlinClass.getQualifiedName();
                    if (qualifiedName != null) {
                        return (CombinedWorkflowHandler.CombinedViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
                    return null;
                case 1:
                    if (!helpFragment.getShouldDisplayInstructionSequenceTutorial$workflow_release()) {
                        return null;
                    }
                    if (helpFragment.d()) {
                        strArr = helpFragment.getResources().getStringArray(R.array.misnapWorkflowHelpFragmentDocumentAccessibilityTutorialMessagesArray);
                        strArr.getClass();
                    } else {
                        strArr = new String[0];
                    }
                    if (strArr.length == 0) {
                        strArr = null;
                    }
                    if (strArr != null) {
                        return new a(strArr);
                    }
                    return null;
                case 2:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(helpFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                case 3:
                    FragmentActivity requireActivity2 = helpFragment.requireActivity();
                    requireActivity2.getClass();
                    ViewModelStore viewModelStore2 = requireActivity2.getViewModelStore();
                    ViewModelProvider$Factory defaultViewModelProviderFactory2 = requireActivity2.getDefaultViewModelProviderFactory();
                    CreationExtras defaultViewModelCreationExtras2 = requireActivity2.getDefaultViewModelCreationExtras();
                    viewModelStore2.getClass();
                    defaultViewModelProviderFactory2.getClass();
                    defaultViewModelCreationExtras2.getClass();
                    SimpleActor simpleActor2 = new SimpleActor(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
                    KClass orCreateKotlinClass2 = Reflection.factory.getOrCreateKotlinClass(MiSnapWorkflowViewModel.class);
                    String qualifiedName2 = orCreateKotlinClass2.getQualifiedName();
                    if (qualifiedName2 != null) {
                        return (MiSnapWorkflowViewModel) simpleActor2.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName2), orCreateKotlinClass2);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
                    return null;
                default:
                    Context requireContext = helpFragment.requireContext();
                    requireContext.getClass();
                    Object systemService = requireContext.getSystemService("accessibility");
                    AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                    if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                        MiSnapSettings miSnapSettings = (MiSnapSettings) helpFragment.c$2().f.getValue();
                        if (miSnapSettings == null) {
                            MiSnapWorkflowViewModel c$2 = helpFragment.c$2();
                            Context requireContext2 = helpFragment.requireContext();
                            requireContext2.getClass();
                            c$2.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
                        } else if (!HelpFragment.n.contains(miSnapSettings.a) && helpFragment.d()) {
                            if (helpFragment.d()) {
                                strArr2 = helpFragment.getResources().getStringArray(R.array.misnapWorkflowHelpFragmentDocumentAccessibilityTutorialMessagesArray);
                                strArr2.getClass();
                            } else {
                                strArr2 = new String[0];
                            }
                            if (strArr2.length != 0) {
                                String b$2 = helpFragment.b$2();
                                if (b$2 != null && (str = miSnapSettings.workflow.get(b$2)) != null) {
                                    Json.Default r2 = Json.Default;
                                    r2.getClass();
                                    r5 = r2.decodeFromString(str, WorkflowSettings.Companion.serializer());
                                }
                                WorkflowSettings workflowSettings = (WorkflowSettings) r5;
                                if ((workflowSettings != null && (b = workflowSettings.e) != null) || (b = MultipartBody.Companion.b(helpFragment.getArguments(), "enableAccessibilityTutorial")) != null) {
                                    return b;
                                }
                                Companion.getDefaultWorkflowSettings$default(HelpFragment.Companion, miSnapSettings, helpFragment.requireContext());
                                return Boolean.TRUE;
                            }
                        }
                    }
                    return Boolean.FALSE;
            }
        }
    }

    public final class g extends Lambda implements Function1 {
        public final /* synthetic */ MiSnapSettings a;
        public final /* synthetic */ HelpFragment b;
        public final /* synthetic */ FrameLayout c;

        public abstract /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[MiSnapSettings.UseCase.values().length];
                try {
                    iArr[7] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[6] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MiSnapSettings miSnapSettings, HelpFragment helpFragment, FrameLayout frameLayout) {
            super(1);
            this.a = miSnapSettings;
            this.b = helpFragment;
            this.c = frameLayout;
        }

        public final void a(CameraUtil$CameraSupportResult cameraUtil$CameraSupportResult) {
            MiSnapSettings.Analysis.Face face;
            MiSnapSettings.Analysis.Face.Trigger trigger;
            MiSnapSettings.Analysis.Barcode barcode;
            MiSnapSettings.Analysis.Barcode.Trigger trigger2;
            MiSnapSettings.Analysis.Document document;
            MiSnapSettings.Analysis.Document.Trigger trigger3;
            MiSnapSettings miSnapSettings = this.a;
            MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
            cameraUtil$CameraSupportResult.getClass();
            boolean z = cameraUtil$CameraSupportResult instanceof CameraUtil$CameraSupportResult.Success;
            HelpFragment helpFragment = this.b;
            if (!z) {
                if (cameraUtil$CameraSupportResult instanceof CameraUtil$CameraSupportResult$Error$Execution) {
                    Companion companion = HelpFragment.Companion;
                    MiSnapWorkflowViewModel c$2 = helpFragment.c$2();
                    Context requireContext = helpFragment.requireContext();
                    requireContext.getClass();
                    c$2.postError$workflow_release(requireContext, MiSnapWorkflowError.Camera.INSTANCE);
                    return;
                }
                return;
            }
            boolean z2 = ((CameraUtil$CameraSupportResult.Success) cameraUtil$CameraSupportResult).a.a;
            MiSnapSettings.UseCase useCase = miSnapSettings.a;
            if (z2) {
                int i = a.a[useCase.ordinal()];
                if (i == 1) {
                    face = analysis.face;
                    if (face.a == null) {
                        trigger = FaceAnalysisSettings.default(MiSnapSettings.Analysis.Face.Trigger.Companion);
                        face.a = trigger;
                    }
                } else if (i != 2) {
                    document = analysis.document;
                    trigger3 = MiSnapSettings.Analysis.Document.Trigger.AUTO;
                    document.e = trigger3;
                } else {
                    barcode = analysis.barcode;
                    trigger2 = MiSnapSettings.Analysis.Barcode.Trigger.AUTO;
                    barcode.d = trigger2;
                }
            } else {
                int i2 = a.a[useCase.ordinal()];
                if (i2 == 1) {
                    face = analysis.face;
                    trigger = MiSnapSettings.Analysis.Face.Trigger.MANUAL;
                    face.a = trigger;
                } else if (i2 != 2) {
                    document = analysis.document;
                    trigger3 = MiSnapSettings.Analysis.Document.Trigger.MANUAL;
                    document.e = trigger3;
                } else {
                    barcode = analysis.barcode;
                    trigger2 = MiSnapSettings.Analysis.Barcode.Trigger.MANUAL;
                    barcode.d = trigger2;
                }
            }
            Companion companion2 = HelpFragment.Companion;
            helpFragment.c$2().updateState$workflow_release(miSnapSettings);
            FrameLayout frameLayout = this.c;
            if (frameLayout != null) {
                helpFragment.a(frameLayout, miSnapSettings, helpFragment.b$2());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CameraUtil$CameraSupportResult) obj);
            return Unit.INSTANCE;
        }
    }

    public HelpFragment() {
        super(R.layout.misnap_fragment_help_screen_root);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, c.a);
        this.c = true;
        this.e = LazyKt.lazy(new d(this, 2));
        this.f = LazyKt.lazy(new d(this, 3));
        int i = 0;
        this.g = LazyKt.lazy(new d(this, i));
        this.h = new HelpFragment$$ExternalSyntheticLambda2(this, i);
        int i2 = 4;
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(this, i2));
        registerForActivityResult.getClass();
        this.i = registerForActivityResult;
        this.j = new RedwoodLayoutKt$toAndroid$1(this, 5);
        this.k = LazyKt.lazy(new d(this, i2));
        this.l = LazyKt.lazy(new d(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0084, code lost:
    
        if (r0 != r10) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0050, code lost:
    
        if (r0 == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.AUTO) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00df, code lost:
    
        if (r20 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e1, code lost:
    
        r0 = r6.get(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e5, code lost:
    
        if (r0 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e7, code lost:
    
        r6 = kotlinx.serialization.json.Json.Default;
        r6.getClass();
        r0 = r6.decodeFromString(r0, com.miteksystems.misnap.workflow.fragment.HelpFragment.WorkflowSettings.Companion.serializer());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f8, code lost:
    
        r0 = (com.miteksystems.misnap.workflow.fragment.HelpFragment.WorkflowSettings) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fa, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fc, code lost:
    
        r0 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fe, code lost:
    
        if (r0 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0100, code lost:
    
        r0 = okhttp3.MultipartBody.Companion.d(getArguments(), "manualLayoutId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010a, code lost:
    
        if (r0 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010c, code lost:
    
        r0 = ((com.miteksystems.misnap.workflow.util.CombinedWorkflowHandler.CombinedViewModel) r8.getValue()).getCurrentCombinedWorkflowStep();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0116, code lost:
    
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0118, code lost:
    
        r6 = requireContext();
        r0 = r0.c;
        r9.getClass();
        r15 = com.miteksystems.misnap.workflow.fragment.HelpFragment.Companion.getDefaultWorkflowSettings(r19, r6, r0).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0129, code lost:
    
        if (r15 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012b, code lost:
    
        r0 = com.miteksystems.misnap.workflow.fragment.HelpFragment.Companion.getDefaultWorkflowSettings$default(r9, r19, requireContext()).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0128, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x006a, code lost:
    
        if (r0 != r11) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(FrameLayout frameLayout, MiSnapSettings miSnapSettings, String str) {
        Object failure;
        Integer d2;
        Integer num;
        String str2;
        Object obj;
        String str3;
        Object failure2;
        Object failure3;
        MiSnapSettings.UseCase useCase = miSnapSettings.a;
        if (getShouldDisplayInstructionSequenceTutorial$workflow_release()) {
            a(frameLayout, R.layout.misnap_help_instruction_sequence);
            i();
            return;
        }
        MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
        MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
        int i = b.a[useCase.ordinal()];
        Lazy lazy = this.g;
        Companion companion = Companion;
        Object obj2 = MiSnapSettings.Analysis.Face.Trigger.MANUAL;
        MiSnapSettings.Analysis.Barcode.Trigger trigger = MiSnapSettings.Analysis.Barcode.Trigger.MANUAL;
        if (i == 1) {
            try {
                Result.Companion companion2 = Result.Companion;
                failure = FaceAnalysisSettings.requireTrigger(analysis.face);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
        } else if (i != 2) {
            if (i != 3) {
                try {
                    Result.Companion companion4 = Result.Companion;
                    failure3 = DocumentAnalysisSettings.requireTrigger(analysis.document);
                } catch (Throwable th2) {
                    Result.Companion companion5 = Result.Companion;
                    failure3 = new Result.Failure(th2);
                }
                if (failure3 instanceof Result.Failure) {
                    failure3 = null;
                }
            }
            if (str == null || (str3 = workflow.get(str)) == null) {
                obj = null;
            } else {
                Json.Default r6 = Json.Default;
                r6.getClass();
                obj = r6.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if ((workflowSettings == null || (d2 = workflowSettings.a) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "autoLayoutId")) == null) {
                MiSnapWorkflowStep currentCombinedWorkflowStep = ((CombinedWorkflowHandler.CombinedViewModel) lazy.getValue()).getCurrentCombinedWorkflowStep();
                if (currentCombinedWorkflowStep != null) {
                    Context requireContext = requireContext();
                    MiSnapWorkflowStep.Behavior behavior = currentCombinedWorkflowStep.c;
                    companion.getClass();
                    num = Companion.getDefaultWorkflowSettings(miSnapSettings, requireContext, behavior).a;
                } else {
                    num = null;
                }
                if (num == null) {
                    d2 = Companion.getDefaultWorkflowSettings$default(companion, miSnapSettings, requireContext()).a;
                }
                d2 = num;
            }
        } else {
            try {
                Result.Companion companion6 = Result.Companion;
                failure2 = BarcodeAnalysisSettings.requireTrigger(analysis.barcode);
            } catch (Throwable th3) {
                Result.Companion companion7 = Result.Companion;
                failure2 = new Result.Failure(th3);
            }
            if (failure2 instanceof Result.Failure) {
                failure2 = null;
            }
        }
        if (d2 != null) {
            a(frameLayout, d2.intValue());
        }
        if (!e(miSnapSettings, str).booleanValue()) {
            getBinding$workflow_release().k.setVisibility(8);
            return;
        }
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        int i2 = SharedPrefsUtil.a.a[useCase.ordinal()];
        if (i2 == 1) {
            Object obj3 = analysis.face.a;
            if (obj3 != null) {
                obj2 = obj3;
            }
            str2 = "PREF_FIRST_TIME_" + obj2 + "_USER_" + useCase + "_KEY";
        } else if (i2 == 2) {
            MiSnapSettings.Analysis.Barcode.Trigger trigger2 = analysis.barcode.d;
            if (trigger2 != null) {
                trigger = trigger2;
            }
            str2 = SharedPrefsUtil.a(useCase, trigger);
        } else if (i2 != 3) {
            MiSnapSettings.Analysis.Document.Trigger trigger3 = analysis.document.e;
            if (trigger3 == null) {
                trigger3 = MiSnapSettings.Analysis.Document.Trigger.MANUAL;
            }
            str2 = SharedPrefsUtil.a(useCase, trigger3);
        } else {
            MiSnapSettings.Voice.Flow flow = miSnapSettings.voice.a;
            if (flow == null) {
                flow = MiSnapSettings.Voice.Flow.ENROLLMENT;
            }
            str2 = "PREF_FIRST_TIME_AUTO_USER_" + useCase + '_' + flow + "_FLOW_KEY";
        }
        if (requireContext2.getSharedPreferences("MiSnapWorkflowSettings", 0).getBoolean(str2, false)) {
            try {
                FragmentKt.findNavController(this).navigate(R.id.navigateContinue);
            } catch (Exception e) {
                Log.e("HelpScreen", "Nav Graph Error", e);
                c$2().postNavigationError$workflow_release(new NavigationError(e, HelpFragment.class, hashCode(), NavigationAction$NavigateNfcSession.INSTANCE$1));
            }
        }
    }

    public final String b$2() {
        return (String) this.e.getValue();
    }

    public final MiSnapWorkflowViewModel c$2() {
        return (MiSnapWorkflowViewModel) this.f.getValue();
    }

    public final boolean d() {
        Unit unit;
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$2().f.getValue();
        if (miSnapSettings != null) {
            if (!n.contains(miSnapSettings.a)) {
                Context requireContext = requireContext();
                requireContext.getClass();
                int deviceCurrentBasicOrientation = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(requireContext);
                return deviceCurrentBasicOrientation == DocumentAnalysisSettings.getOrientation(miSnapSettings.analysis.document, deviceCurrentBasicOrientation);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel c$2 = c$2();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            c$2.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    public final Boolean e(MiSnapSettings miSnapSettings, String str) {
        Object obj;
        Boolean bool;
        String str2;
        if (str == null || (str2 = miSnapSettings.workflow.get(str)) == null) {
            obj = null;
        } else {
            Json.Default r0 = Json.Default;
            r0.getClass();
            obj = r0.decodeFromString(str2, WorkflowSettings.Companion.serializer());
        }
        WorkflowSettings workflowSettings = (WorkflowSettings) obj;
        if (workflowSettings != null && (bool = workflowSettings.c) != null) {
            return bool;
        }
        Boolean b2 = MultipartBody.Companion.b(getArguments(), "showSkipCheckbox");
        if (b2 != null) {
            return b2;
        }
        Companion.getDefaultWorkflowSettings$default(Companion, miSnapSettings, requireContext());
        return Boolean.FALSE;
    }

    public final void f$2() {
        Unit unit;
        String str;
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$2().f.getValue();
        if (miSnapSettings != null) {
            if (e(miSnapSettings, b$2()).booleanValue()) {
                this.b = getBinding$workflow_release().k.isChecked();
                Context requireContext = requireContext();
                requireContext.getClass();
                boolean z = this.b;
                MiSnapSettings.UseCase useCase = miSnapSettings.a;
                MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
                int i = SharedPrefsUtil.a.a[useCase.ordinal()];
                if (i == 1) {
                    MiSnapSettings.Analysis.Face.Trigger trigger = analysis.face.a;
                    if (trigger == null) {
                        trigger = MiSnapSettings.Analysis.Face.Trigger.MANUAL;
                    }
                    str = "PREF_FIRST_TIME_" + trigger + "_USER_" + useCase + "_KEY";
                } else if (i == 2) {
                    MiSnapSettings.Analysis.Barcode.Trigger trigger2 = analysis.barcode.d;
                    if (trigger2 == null) {
                        trigger2 = MiSnapSettings.Analysis.Barcode.Trigger.MANUAL;
                    }
                    str = SharedPrefsUtil.a(useCase, trigger2);
                } else if (i != 3) {
                    MiSnapSettings.Analysis.Document.Trigger trigger3 = analysis.document.e;
                    if (trigger3 == null) {
                        trigger3 = MiSnapSettings.Analysis.Document.Trigger.MANUAL;
                    }
                    str = SharedPrefsUtil.a(useCase, trigger3);
                } else {
                    MiSnapSettings.Voice.Flow flow = miSnapSettings.voice.a;
                    if (flow == null) {
                        flow = MiSnapSettings.Voice.Flow.ENROLLMENT;
                    }
                    str = "PREF_FIRST_TIME_AUTO_USER_" + useCase + '_' + flow + "_FLOW_KEY";
                }
                requireContext.getSharedPreferences("MiSnapWorkflowSettings", 0).edit().putBoolean(str, z).apply();
            }
            try {
                FragmentKt.findNavController(this).navigate(R.id.navigateContinue);
            } catch (Exception e) {
                Log.e("HelpScreen", "Nav Graph Error", e);
                c$2().postNavigationError$workflow_release(new NavigationError(e, HelpFragment.class, hashCode(), NavigationAction$NavigateNfcSession.INSTANCE$1));
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel c$2 = c$2();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            c$2.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.g getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.g) this.a.getValue((Fragment) this, m[0]);
    }

    public final /* synthetic */ a getInstructionSequenceController$workflow_release() {
        return (a) this.l.getValue();
    }

    public final /* synthetic */ boolean getShouldDisplayInstructionSequenceTutorial$workflow_release() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void i() {
        Unit unit;
        if (getShouldDisplayInstructionSequenceTutorial$workflow_release()) {
            TextView textView = (TextView) getBinding$workflow_release().b.findViewById(R.id.misnapHelpInstruction);
            if (textView != null) {
                if (Build.VERSION.SDK_INT > o) {
                    textView.setAccessibilityLiveRegion(2);
                } else {
                    a instructionSequenceController$workflow_release = getInstructionSequenceController$workflow_release();
                    if (instructionSequenceController$workflow_release != null) {
                        textView.announceForAccessibility(instructionSequenceController$workflow_release.a[instructionSequenceController$workflow_release.b]);
                    }
                }
                a instructionSequenceController$workflow_release2 = getInstructionSequenceController$workflow_release();
                if (instructionSequenceController$workflow_release2 != null) {
                    textView.setText(instructionSequenceController$workflow_release2.a[instructionSequenceController$workflow_release2.b]);
                }
            }
            a instructionSequenceController$workflow_release3 = getInstructionSequenceController$workflow_release();
            if (instructionSequenceController$workflow_release3 != null && instructionSequenceController$workflow_release3.b < instructionSequenceController$workflow_release3.a.length - 1) {
                getBinding$workflow_release().j.setVisibility(0);
                getBinding$workflow_release().k.setVisibility(8);
                return;
            }
            getBinding$workflow_release().i.setText(getString(R.string.misnapWorkflowHelpFragmentAccessibilityTutorialButtonStartSessionLabel));
            getBinding$workflow_release().i.setContentDescription(getString(R.string.misnapWorkflowHelpFragmentAccessibilityTutorialButtonStartSessionLabel));
            getBinding$workflow_release().j.setVisibility(8);
            MiSnapSettings miSnapSettings = (MiSnapSettings) c$2().f.getValue();
            if (miSnapSettings != null) {
                getBinding$workflow_release().k.setVisibility(e(miSnapSettings, b$2()).booleanValue() ? 0 : 8);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                MiSnapWorkflowViewModel c$2 = c$2();
                Context requireContext = requireContext();
                requireContext.getClass();
                c$2.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
            }
        }
    }

    public final void lookupCamera$workflow_release() {
        CameraSelectorFilter splitter;
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$2().f.getValue();
        Unit unit = null;
        if (miSnapSettings != null) {
            View view = getView();
            FrameLayout frameLayout = view != null ? (FrameLayout) view.findViewById(R.id.frameLayout) : null;
            Context requireContext = requireContext();
            requireContext.getClass();
            MiSnapSettings.Camera camera = miSnapSettings.camera;
            g gVar = new g(miSnapSettings, this, frameLayout);
            camera.getClass();
            MiSnapSettings.Camera.Advanced.FrameInjection frameInjection = camera.advanced.b;
            FrameProducer frameLoader = frameInjection != null ? new FrameLoader(requireContext, frameInjection) : new CameraWrapper(requireContext, this, camera);
            int i = CameraUtil$WhenMappings.$EnumSwitchMapping$0[s.requireProfile(camera).ordinal()];
            if (i == 1) {
                splitter = new Splitter(camera);
            } else if (i == 2) {
                splitter = new DefaultTsPayloadReaderFactory();
            } else {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                splitter = new FontsContractCompat.FontFamilyResult(2);
            }
            MutableLiveData frameProducerEvents = frameLoader.getFrameProducerEvents();
            c7$$ExternalSyntheticLambda0 c7__externalsyntheticlambda0 = new c7$$ExternalSyntheticLambda0(2, gVar, frameLoader);
            frameProducerEvents.getClass();
            frameProducerEvents.observe(this, new LiveDataUtil.b(0, c7__externalsyntheticlambda0, frameProducerEvents));
            frameLoader.openCameraInstance(splitter);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel c$2 = c$2();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            c$2.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Integer num;
        super.onDestroyView();
        this.j.remove();
        if (this.c) {
            try {
                FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.h);
            } catch (Exception unused) {
                if (requireActivity().isChangingConfigurations() || (num = this.d) == null) {
                    return;
                }
                requireActivity().setRequestedOrientation(num.intValue());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        a instructionSequenceController$workflow_release;
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("checkboxState", this.b);
        Integer num = this.d;
        if (num != null) {
            bundle.putInt("orientationKey", num.intValue());
        }
        if (!getShouldDisplayInstructionSequenceTutorial$workflow_release() || (instructionSequenceController$workflow_release = getInstructionSequenceController$workflow_release()) == null) {
            return;
        }
        bundle.putInt("instructionSequenceTutorialIndexKey", instructionSequenceController$workflow_release.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x011b, code lost:
    
        if (r11 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
    
        r11 = requireContext();
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
    
        if (okhttp3.internal.platform.AndroidPlatform.Companion.hasPermission(r11, "android.permission.CAMERA") != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016a, code lost:
    
        if (shouldShowRequestPermissionRationale("android.permission.CAMERA") == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016c, code lost:
    
        r11 = new com.google.android.material.dialog.MaterialAlertDialogBuilder(requireContext());
        r1 = r2[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017b, code lost:
    
        if (r1 == 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017d, code lost:
    
        if (r1 == 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
    
        r1 = com.squareup.cash.R.string.misnapWorkflowCameraPermissionDocumentRationaleTitle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018a, code lost:
    
        r11.setTitle(r1);
        r1 = r2[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0193, code lost:
    
        if (r1 == 1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0195, code lost:
    
        if (r1 == 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0197, code lost:
    
        r1 = com.squareup.cash.R.string.misnapWorkflowCameraPermissionDocumentRationaleMessage;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a2, code lost:
    
        r11.setMessage(r1);
        r11.P.mOnDismissListener = new com.miteksystems.misnap.workflow.fragment.HelpFragment$$ExternalSyntheticLambda4(r9, r5);
        r1 = r2[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b4, code lost:
    
        if (r1 == 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b6, code lost:
    
        if (r1 == 2) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b8, code lost:
    
        r1 = com.squareup.cash.R.string.misnapWorkflowCameraPermissionDocumentRationaleButtonConfirmLabel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c3, code lost:
    
        r11.setPositiveButton(r1, (android.content.DialogInterface.OnClickListener) null).show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bc, code lost:
    
        r1 = com.squareup.cash.R.string.misnapWorkflowCameraPermissionBarcodeRationaleButtonConfirmLabel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c0, code lost:
    
        r1 = com.squareup.cash.R.string.misnapWorkflowCameraPermissionFaceRationaleButtonConfirmLabel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019b, code lost:
    
        r1 = com.squareup.cash.R.string.misnapWorkflowCameraPermissionBarcodeRationaleMessage;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019f, code lost:
    
        r1 = com.squareup.cash.R.string.misnapWorkflowCameraPermissionFaceRationaleMessage;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0183, code lost:
    
        r1 = com.squareup.cash.R.string.misnapWorkflowCameraPermissionBarcodeRationaleTitle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0187, code lost:
    
        r1 = com.squareup.cash.R.string.misnapWorkflowCameraPermissionFaceRationaleTitle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cb, code lost:
    
        r9.i.launch("android.permission.CAMERA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d1, code lost:
    
        lookupCamera$workflow_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013e, code lost:
    
        if (r11 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0155, code lost:
    
        if (r11 == null) goto L68;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Boolean b2;
        int intValue;
        Unit unit;
        a instructionSequenceController$workflow_release;
        Unit unit2;
        Unit unit3;
        String str;
        a instructionSequenceController$workflow_release2;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            if (bundle.containsKey("checkboxState")) {
                this.b = bundle.getBoolean("checkboxState");
            }
            if (bundle.containsKey("orientationKey")) {
                this.d = Integer.valueOf(bundle.getInt("orientationKey"));
            }
            if (bundle.containsKey("instructionSequenceTutorialIndexKey") && getShouldDisplayInstructionSequenceTutorial$workflow_release() && (instructionSequenceController$workflow_release2 = getInstructionSequenceController$workflow_release()) != null) {
                instructionSequenceController$workflow_release2.b = bundle.getInt("instructionSequenceTutorialIndexKey");
                i();
            }
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.frameLayout);
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$2().f.getValue();
        Unit unit4 = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MiSnapSettings.UseCase useCase = miSnapSettings.a;
            if (Position.shouldShowExitConfirmationDialog(workflow, useCase)) {
                requireActivity().getOnBackPressedDispatcher().addCallback(this.j, requireActivity());
            }
            String b$2 = b$2();
            if (b$2 == null || (str = workflow.get(b$2)) == null) {
                obj = null;
            } else {
                Json.Default r5 = Json.Default;
                r5.getClass();
                obj = r5.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.d) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                Companion.getDefaultWorkflowSettings$default(Companion, miSnapSettings, requireContext());
                b2 = Boolean.TRUE;
            }
            boolean booleanValue = b2.booleanValue();
            this.c = booleanValue;
            if (booleanValue) {
                try {
                    Result.Companion companion = Result.Companion;
                    FragmentKt.findNavController(this).addOnDestinationChangedListener(this.h);
                } catch (Throwable unused) {
                    Result.Companion companion2 = Result.Companion;
                }
                Integer forcedOrientation = Position.getForcedOrientation(workflow, useCase);
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.d = Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            int[] iArr = b.a;
            int i = iArr[useCase.ordinal()];
            final int i2 = 0;
            final int i3 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        frameLayout.getClass();
                        a(frameLayout, miSnapSettings, b$2());
                    } else if (analysis.document.e != null) {
                        frameLayout.getClass();
                        a(frameLayout, miSnapSettings, b$2());
                        unit3 = Unit.INSTANCE;
                    } else {
                        unit3 = null;
                    }
                    MaterialButton materialButton = getBinding$workflow_release().i;
                    if (getShouldDisplayInstructionSequenceTutorial$workflow_release() && (instructionSequenceController$workflow_release = getInstructionSequenceController$workflow_release()) != null && instructionSequenceController$workflow_release.b < instructionSequenceController$workflow_release.a.length - 1) {
                        materialButton.setText(getString(R.string.misnapWorkflowHelpFragmentAccessibilityTutorialButtonContinueLabel));
                        materialButton.setContentDescription(getString(R.string.misnapWorkflowHelpFragmentAccessibilityTutorialButtonContinueLabel));
                    }
                    materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.HelpFragment$$ExternalSyntheticLambda0
                        public final /* synthetic */ HelpFragment f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            HelpFragment.a instructionSequenceController$workflow_release3;
                            int i4;
                            int i5 = i2;
                            HelpFragment helpFragment = this.f$0;
                            switch (i5) {
                                case 0:
                                    HelpFragment.Companion companion3 = HelpFragment.Companion;
                                    if (helpFragment.getShouldDisplayInstructionSequenceTutorial$workflow_release() && (instructionSequenceController$workflow_release3 = helpFragment.getInstructionSequenceController$workflow_release()) != null && (i4 = instructionSequenceController$workflow_release3.b) < instructionSequenceController$workflow_release3.a.length - 1) {
                                        instructionSequenceController$workflow_release3.b = i4 + 1;
                                        helpFragment.i();
                                        break;
                                    } else {
                                        helpFragment.f$2();
                                        break;
                                    }
                                    break;
                                default:
                                    HelpFragment.Companion companion4 = HelpFragment.Companion;
                                    helpFragment.f$2();
                                    break;
                            }
                        }
                    });
                    getBinding$workflow_release().j.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.HelpFragment$$ExternalSyntheticLambda0
                        public final /* synthetic */ HelpFragment f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            HelpFragment.a instructionSequenceController$workflow_release3;
                            int i4;
                            int i5 = i3;
                            HelpFragment helpFragment = this.f$0;
                            switch (i5) {
                                case 0:
                                    HelpFragment.Companion companion3 = HelpFragment.Companion;
                                    if (helpFragment.getShouldDisplayInstructionSequenceTutorial$workflow_release() && (instructionSequenceController$workflow_release3 = helpFragment.getInstructionSequenceController$workflow_release()) != null && (i4 = instructionSequenceController$workflow_release3.b) < instructionSequenceController$workflow_release3.a.length - 1) {
                                        instructionSequenceController$workflow_release3.b = i4 + 1;
                                        helpFragment.i();
                                        break;
                                    } else {
                                        helpFragment.f$2();
                                        break;
                                    }
                                    break;
                                default:
                                    HelpFragment.Companion companion4 = HelpFragment.Companion;
                                    helpFragment.f$2();
                                    break;
                            }
                        }
                    });
                    unit4 = Unit.INSTANCE;
                } else if (analysis.barcode.d != null) {
                    frameLayout.getClass();
                    a(frameLayout, miSnapSettings, b$2());
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
            } else if (analysis.face.a != null) {
                frameLayout.getClass();
                a(frameLayout, miSnapSettings, b$2());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        }
        if (unit4 == null) {
            MiSnapWorkflowViewModel c$2 = c$2();
            Context requireContext = requireContext();
            requireContext.getClass();
            c$2.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        frameLayout.getClass();
        Iterator it = TextUtil.getTextViews$workflow_release(frameLayout).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) it.next();
            textView.getClass();
            float f = textView.getContext().getResources().getConfiguration().fontScale;
            if (f > 1.0f) {
                com.miteksystems.misnap.workflow.a.b.a(textView, f);
            }
        }
    }

    @Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Integer a;
        public final Integer b;
        public final Boolean c;
        public final Boolean d;
        public final Boolean e;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/HelpFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/HelpFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return HelpFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = bool2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = bool3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkflowSettings)) {
                return false;
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            return Intrinsics.areEqual(this.a, workflowSettings.a) && Intrinsics.areEqual(this.b, workflowSettings.b) && Intrinsics.areEqual(this.c, workflowSettings.c) && Intrinsics.areEqual(this.d, workflowSettings.d) && Intrinsics.areEqual(this.e, workflowSettings.e);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.c;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.d;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.e;
            return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }

        public WorkflowSettings(Integer num, Integer num2) {
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            this.a = num;
            this.b = num2;
            this.c = bool;
            this.d = bool2;
            this.e = bool2;
        }
    }

    public final void a(FrameLayout frameLayout, int i) {
        if (i != 0) {
            boolean z = false;
            View inflate = LayoutInflater.from(requireActivity()).inflate(i, (ViewGroup) frameLayout, false);
            frameLayout.addView(inflate);
            Context requireContext = requireContext();
            requireContext.getClass();
            requireContext.getClass();
            Object systemService = requireContext.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
            }
            if (z) {
                inflate.sendAccessibilityEvent(32768);
            }
        }
    }
}

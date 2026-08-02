package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda5;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.controller.AnalysisSettings;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.face.FaceAnalysisSettings;
import com.miteksystems.misnap.face.MiSnapFaceAnalyzer;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.e;
import com.miteksystems.misnap.workflow.a.o;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.miteksystems.misnap.workflow.view.CountdownTimerView;
import com.miteksystems.misnap.workflow.view.GuideView;
import com.miteksystems.misnap.workflow.view.HintView;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.miteksystems.misnap.workflow.view.RecordingIconView;
import com.miteksystems.misnap.workflow.view.SuccessView;
import com.miteksystems.misnap.workflow.view.TorchView;
import com.squareup.cash.R;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
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
import kotlinx.serialization.json.Json;
import net.idrnd.face.iad.capture.internal.s;
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.MultipartBody;
import okhttp3.internal.platform.AndroidPlatform;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/FaceAnalysisFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "LowLightSensitivity", "ReviewCondition", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FaceAnalysisFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public MiSnapController.FrameResult b;
    public MiSnapFinalResult c;
    public final n d;
    public boolean e;
    public Integer f;
    public boolean g;
    public UserAction h;
    public boolean i;
    public MibiData.Session j;
    public final Lazy k;
    public final HelpFragment$$ExternalSyntheticLambda2 l;
    public final Lazy m;
    public final FaceAnalysisFragment$$ExternalSyntheticLambda1 n;
    public final FaceAnalysisFragment$$ExternalSyntheticLambda1 o;
    public FaceAnalysisFragment$$ExternalSyntheticLambda12 p;
    public FaceAnalysisFragment$$ExternalSyntheticLambda11 q;
    public FaceAnalysisFragment$$ExternalSyntheticLambda10 r;
    public FaceAnalysisFragment$$ExternalSyntheticLambda11 s;
    public FaceAnalysisFragment$$ExternalSyntheticLambda7 t;
    public final LiveDataObservable$$ExternalSyntheticLambda5 u;
    public final ActivityResultLauncher v;
    public static final /* synthetic */ KProperty[] w = {Reflection.factory.property1(new PropertyReference1Impl(FaceAnalysisFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentFaceAnalysisBinding;", 0))};
    public static final Companion Companion = new Companion();

    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static WorkflowSettings getDefaultWorkflowSettings(MiSnapSettings miSnapSettings) {
            Object failure;
            Object failure2;
            MiSnapSettings.Analysis analysis;
            MiSnapSettings.Analysis.Face face;
            MiSnapSettings.Analysis.Face.Advanced advanced;
            Object valueOf;
            MiSnapSettings.Analysis analysis2;
            MiSnapSettings.Analysis.Face face2;
            Integer valueOf2 = Integer.valueOf(R.drawable.misnap_guide_face);
            Integer valueOf3 = Integer.valueOf(R.drawable.misnap_button_camera_shutter_icon);
            Integer valueOf4 = Integer.valueOf(R.drawable.misnap_torch_on_icon);
            Integer valueOf5 = Integer.valueOf(R.drawable.misnap_torch_off_icon);
            Integer valueOf6 = Integer.valueOf(R.anim.misnap_hint_animation);
            try {
                Result.Companion companion = Result.Companion;
                failure = Boolean.valueOf(((miSnapSettings == null || (analysis2 = miSnapSettings.analysis) == null || (face2 = analysis2.face) == null) ? null : FaceAnalysisSettings.requireTrigger(face2)) == MiSnapSettings.Analysis.Face.Trigger.AUTO);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            Boolean bool = (Boolean) failure;
            if (miSnapSettings != null) {
                try {
                    analysis = miSnapSettings.analysis;
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.Companion;
                    failure2 = new Result.Failure(th2);
                }
                if (analysis != null && (face = analysis.face) != null && (advanced = face.advanced) != null) {
                    valueOf = Integer.valueOf(FaceAnalysisSettings.getTriggerDelay(advanced, FaceAnalysisSettings.requireTrigger(face)));
                    failure2 = valueOf;
                    return new WorkflowSettings(valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool, (Integer) (failure2 instanceof Result.Failure ? null : failure2), Integer.valueOf(R.array.misnapWorkflowFaceAnalysisFragmentCountdownTimerViewLabels), Integer.valueOf(R.drawable.misnap_recording_icon), Integer.valueOf(R.anim.misnap_recording_animation), Integer.valueOf(R.drawable.misnap_button_help_icon), Integer.valueOf(R.drawable.misnap_success_icon), Integer.valueOf(R.anim.misnap_success_animation), Integer.valueOf(R.drawable.misnap_button_cancel_session_icon));
                }
            }
            valueOf = null;
            failure2 = valueOf;
            return new WorkflowSettings(valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool, (Integer) (failure2 instanceof Result.Failure ? null : failure2), Integer.valueOf(R.array.misnapWorkflowFaceAnalysisFragmentCountdownTimerViewLabels), Integer.valueOf(R.drawable.misnap_recording_icon), Integer.valueOf(R.anim.misnap_recording_animation), Integer.valueOf(R.drawable.misnap_button_help_icon), Integer.valueOf(R.drawable.misnap_success_icon), Integer.valueOf(R.anim.misnap_success_animation), Integer.valueOf(R.drawable.misnap_button_cancel_session_icon));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LowLightSensitivity {
        public static final LowLightSensitivity MEDIUM;
        public static final LowLightSensitivity NONE;
        public static final /* synthetic */ LowLightSensitivity[] a;

        public abstract /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[LowLightSensitivity.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        static {
            LowLightSensitivity lowLightSensitivity = new LowLightSensitivity("NONE", 0);
            NONE = lowLightSensitivity;
            LowLightSensitivity lowLightSensitivity2 = new LowLightSensitivity("LOW", 1);
            LowLightSensitivity lowLightSensitivity3 = new LowLightSensitivity("MEDIUM", 2);
            MEDIUM = lowLightSensitivity3;
            a = new LowLightSensitivity[]{lowLightSensitivity, lowLightSensitivity2, lowLightSensitivity3, new LowLightSensitivity("HIGH", 3)};
        }

        public static LowLightSensitivity valueOf(String str) {
            return (LowLightSensitivity) Enum.valueOf(LowLightSensitivity.class, str);
        }

        public static LowLightSensitivity[] values() {
            return (LowLightSensitivity[]) a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ReviewCondition {
        public static final ReviewCondition WARNINGS;
        public static final /* synthetic */ ReviewCondition[] a;

        /* JADX INFO: Fake field, exist only in values array */
        ReviewCondition EF0;

        static {
            ReviewCondition reviewCondition = new ReviewCondition("ALWAYS", 0);
            ReviewCondition reviewCondition2 = new ReviewCondition("NEVER", 1);
            ReviewCondition reviewCondition3 = new ReviewCondition("MANUAL", 2);
            ReviewCondition reviewCondition4 = new ReviewCondition("WARNINGS", 3);
            WARNINGS = reviewCondition4;
            a = new ReviewCondition[]{reviewCondition, reviewCondition2, reviewCondition3, reviewCondition4};
        }

        public static ReviewCondition valueOf(String str) {
            return (ReviewCondition) Enum.valueOf(ReviewCondition.class, str);
        }

        public static ReviewCondition[] values() {
            return (ReviewCondition[]) a.clone();
        }
    }

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReviewCondition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public static final b a = new b(1, e.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentFaceAnalysisBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.buttonsPanel;
            if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.buttonsPanel)) != null) {
                i = R.id.cancelButton;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.cancelButton);
                if (appCompatImageView != null) {
                    i = R.id.countdownTimerView;
                    CountdownTimerView countdownTimerView = (CountdownTimerView) ViewBindings.findChildViewById(view, R.id.countdownTimerView);
                    if (countdownTimerView != null) {
                        i = R.id.guideView;
                        GuideView guideView = (GuideView) ViewBindings.findChildViewById(view, R.id.guideView);
                        if (guideView != null) {
                            i = R.id.guidelineEndManualTriggerProgressIndicator;
                            if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineEndManualTriggerProgressIndicator)) != null) {
                                i = R.id.guidelineHintMessage;
                                if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineHintMessage)) != null) {
                                    i = R.id.guidelineStartManualTriggerProgressIndicator;
                                    if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineStartManualTriggerProgressIndicator)) != null) {
                                        i = R.id.helpButton;
                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.helpButton);
                                        if (appCompatImageView2 != null) {
                                            i = R.id.hintView;
                                            HintView hintView = (HintView) ViewBindings.findChildViewById(view, R.id.hintView);
                                            if (hintView != null) {
                                                i = R.id.manualButton;
                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.manualButton);
                                                if (appCompatImageView3 != null) {
                                                    i = R.id.manualButtonProgressIndicatorLayout;
                                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.manualButtonProgressIndicatorLayout);
                                                    if (findChildViewById != null) {
                                                        o a2 = o.a(findChildViewById);
                                                        i = R.id.misnapView;
                                                        MiSnapView miSnapView = (MiSnapView) ViewBindings.findChildViewById(view, R.id.misnapView);
                                                        if (miSnapView != null) {
                                                            i = R.id.recordingIconView;
                                                            RecordingIconView recordingIconView = (RecordingIconView) ViewBindings.findChildViewById(view, R.id.recordingIconView);
                                                            if (recordingIconView != null) {
                                                                i = R.id.successView;
                                                                SuccessView successView = (SuccessView) ViewBindings.findChildViewById(view, R.id.successView);
                                                                if (successView != null) {
                                                                    i = R.id.torchView;
                                                                    TorchView torchView = (TorchView) ViewBindings.findChildViewById(view, R.id.torchView);
                                                                    if (torchView != null) {
                                                                        return new e((ConstraintLayout) view, appCompatImageView, countdownTimerView, guideView, appCompatImageView2, hintView, appCompatImageView3, a2, miSnapView, recordingIconView, successView, torchView);
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
                            }
                        }
                    }
                }
            }
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            return null;
        }
    }

    public final class c extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FaceAnalysisFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(FaceAnalysisFragment faceAnalysisFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = faceAnalysisFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            FaceAnalysisFragment faceAnalysisFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(faceAnalysisFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = faceAnalysisFragment.requireActivity();
                    requireActivity.getClass();
                    ViewModelStore viewModelStore = requireActivity.getViewModelStore();
                    ViewModelProvider$Factory defaultViewModelProviderFactory = requireActivity.getDefaultViewModelProviderFactory();
                    CreationExtras defaultViewModelCreationExtras = requireActivity.getDefaultViewModelCreationExtras();
                    viewModelStore.getClass();
                    defaultViewModelProviderFactory.getClass();
                    defaultViewModelCreationExtras.getClass();
                    SimpleActor simpleActor = new SimpleActor(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                    KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MiSnapWorkflowViewModel.class);
                    String qualifiedName = orCreateKotlinClass.getQualifiedName();
                    if (qualifiedName != null) {
                        return (MiSnapWorkflowViewModel) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
                    return null;
            }
        }
    }

    public final class f implements Observer {
        public final /* synthetic */ FaceAnalysisFragment a;
        public final /* synthetic */ MiSnapSettings b;
        public final /* synthetic */ MiSnapWorkflowViewModel c;
        public final /* synthetic */ String d;

        public f(MiSnapSettings miSnapSettings, FaceAnalysisFragment faceAnalysisFragment, MiSnapWorkflowViewModel miSnapWorkflowViewModel, String str) {
            this.a = faceAnalysisFragment;
            this.b = miSnapSettings;
            this.c = miSnapWorkflowViewModel;
            this.d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [androidx.lifecycle.Observer, com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda10] */
        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(FrameProducer.Event event) {
            Integer d;
            String str;
            Object obj;
            Integer d2;
            String str2;
            MiSnapSettings.Analysis.Face face;
            MiSnapSettings.Analysis.Face.Trigger trigger;
            if (event != null) {
                final MiSnapSettings miSnapSettings = this.b;
                MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
                boolean z = event instanceof FrameProducer.Event.CameraInitialized;
                boolean z2 = false;
                final FaceAnalysisFragment faceAnalysisFragment = this.a;
                if (!z) {
                    if (event instanceof FrameProducer.Event.CameraReady) {
                        faceAnalysisFragment.getBinding$workflow_release().m.z.removeObserver(this);
                        faceAnalysisFragment.getBinding$workflow_release().e.setVisibility(0);
                        return;
                    }
                    return;
                }
                MiSnapCameraInfo cameraInfo = ((FrameProducer.Event.CameraInitialized) event).getCameraInfo();
                if (cameraInfo.c) {
                    faceAnalysisFragment.getBinding$workflow_release().p.setVisibility(0);
                }
                e binding$workflow_release = faceAnalysisFragment.getBinding$workflow_release();
                FaceAnalysisFragment$$ExternalSyntheticLambda1 faceAnalysisFragment$$ExternalSyntheticLambda1 = faceAnalysisFragment.n;
                FaceAnalysisFragment$$ExternalSyntheticLambda1 faceAnalysisFragment$$ExternalSyntheticLambda12 = faceAnalysisFragment.o;
                n nVar = faceAnalysisFragment.d;
                binding$workflow_release.i.setVisibility(0);
                boolean z3 = cameraInfo.a;
                MiSnapSettings.Analysis.Face.Trigger trigger2 = MiSnapSettings.Analysis.Face.Trigger.AUTO;
                MiSnapSettings.Analysis.Face.Trigger trigger3 = MiSnapSettings.Analysis.Face.Trigger.MANUAL;
                if (!z3 || (trigger = (face = analysis.face).a) == trigger3) {
                    if (analysis.face.a == trigger2 && !nVar.isRunning(faceAnalysisFragment$$ExternalSyntheticLambda12)) {
                        nVar.start(faceAnalysisFragment$$ExternalSyntheticLambda12, 2000L);
                        z2 = true;
                    }
                    analysis.face.a = trigger3;
                } else if (trigger == null) {
                    face.a = FaceAnalysisSettings.default(MiSnapSettings.Analysis.Face.Trigger.Companion);
                }
                final MiSnapWorkflowViewModel miSnapWorkflowViewModel = this.c;
                miSnapWorkflowViewModel.updateState$workflow_release(miSnapSettings);
                MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
                if ((Intrinsics.areEqual(MibiData.i, f.class.getName()) || Intrinsics.areEqual(MibiData.i, MiSnapWorkflowViewModel.class.getName())) && !faceAnalysisFragment.i) {
                    MiSnapSettings.Analysis.Face.Trigger trigger4 = analysis.face.a;
                    if (trigger4 == trigger2 || trigger4 == MiSnapSettings.Analysis.Face.Trigger.AUTO_SMILE) {
                        faceAnalysisFragment.j.getMetaData().b++;
                    } else {
                        faceAnalysisFragment.j.getMetaData().c++;
                    }
                    faceAnalysisFragment.i = true;
                }
                FaceAnalysisFragment$$ExternalSyntheticLambda10 faceAnalysisFragment$$ExternalSyntheticLambda10 = faceAnalysisFragment.r;
                if (faceAnalysisFragment$$ExternalSyntheticLambda10 != null) {
                    faceAnalysisFragment.getBinding$workflow_release().m.w.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda10);
                }
                faceAnalysisFragment.getBinding$workflow_release().j.clearText();
                boolean isAutoTrigger = AnalysisSettings.isAutoTrigger(analysis, miSnapSettings.a);
                Object obj2 = null;
                final String str3 = this.d;
                if (isAutoTrigger) {
                    if (!nVar.isRunning(faceAnalysisFragment$$ExternalSyntheticLambda1)) {
                        if (str3 == null || (str2 = workflow.get(str3)) == null) {
                            obj = null;
                        } else {
                            Json.Default r3 = Json.Default;
                            r3.getClass();
                            obj = r3.decodeFromString(str2, WorkflowSettings.Companion.serializer());
                        }
                        WorkflowSettings workflowSettings = (WorkflowSettings) obj;
                        if ((workflowSettings == null || (d2 = workflowSettings.e) == null) && (d2 = MultipartBody.Companion.d(faceAnalysisFragment.getArguments(), "timeoutDuration")) == null) {
                            FragmentActivity requireActivity = faceAnalysisFragment.requireActivity();
                            requireActivity.getClass();
                            Object systemService = requireActivity.getSystemService("accessibility");
                            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                                d2 = 120000;
                            } else {
                                FaceAnalysisFragment.Companion.getClass();
                                Companion.getDefaultWorkflowSettings(miSnapSettings);
                                d2 = 20000;
                            }
                        }
                        int intValue = d2.intValue();
                        if (intValue > 0) {
                            nVar.start(faceAnalysisFragment$$ExternalSyntheticLambda1, intValue);
                        }
                    }
                } else if (!z2) {
                    faceAnalysisFragment.d$2();
                }
                CountdownTimerView countdownTimerView = faceAnalysisFragment.getBinding$workflow_release().d;
                if (str3 != null && (str = workflow.get(str3)) != null) {
                    Json.Default r2 = Json.Default;
                    r2.getClass();
                    obj2 = r2.decodeFromString(str, WorkflowSettings.Companion.serializer());
                }
                WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
                if ((workflowSettings2 == null || (d = workflowSettings2.m) == null) && (d = MultipartBody.Companion.d(faceAnalysisFragment.getArguments(), "countdownTimerDuration")) == null) {
                    FaceAnalysisFragment.Companion.getClass();
                    d = Companion.getDefaultWorkflowSettings(miSnapSettings).m;
                }
                if (d != null) {
                    countdownTimerView.setDuration(d.intValue());
                }
                ?? r1 = new Observer() { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda10
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
                    
                        if (r5 <= 90) goto L29;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
                    
                        r6.a$3$2();
                        r6.g = true;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
                    
                        if (r5 <= 50) goto L29;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
                    
                        if (r5 <= 30) goto L29;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:105:0x0114  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x0190  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x01ab  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x01ca  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x0233  */
                    /* JADX WARN: Removed duplicated region for block: B:75:0x024c  */
                    /* JADX WARN: Removed duplicated region for block: B:78:0x0268  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x0298  */
                    /* JADX WARN: Removed duplicated region for block: B:95:0x02aa  */
                    @Override // androidx.lifecycle.Observer
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void onChanged(Object obj3) {
                        String str4;
                        int i;
                        int i2;
                        String str5;
                        Object obj4;
                        Object obj5;
                        FaceAnalysisFragment.WorkflowSettings workflowSettings3;
                        Boolean b;
                        FaceAnalysisFragment.WorkflowSettings workflowSettings4;
                        Boolean b2;
                        String str6;
                        String str7;
                        MiSnapSettings miSnapSettings2;
                        MiSnapController.FeedbackResult feedbackResult = (MiSnapController.FeedbackResult) obj3;
                        FaceAnalysisFragment.Companion companion = FaceAnalysisFragment.Companion;
                        MiSnapWorkflowViewModel miSnapWorkflowViewModel2 = miSnapWorkflowViewModel;
                        miSnapWorkflowViewModel2.getClass();
                        MiSnapSettings miSnapSettings3 = miSnapSettings;
                        MiSnapSettings.Workflow workflow2 = miSnapSettings3.workflow;
                        if (feedbackResult != null) {
                            UserAction userAction = feedbackResult.a;
                            MiSnapController.FeedbackResult.Metadata metadata = feedbackResult.e;
                            FaceAnalysisFragment faceAnalysisFragment2 = faceAnalysisFragment;
                            boolean z4 = true;
                            if (metadata != null) {
                                int intValue2 = metadata.a.intValue();
                                if (!faceAnalysisFragment2.g && (miSnapSettings2 = (MiSnapSettings) faceAnalysisFragment2.c$1().f.getValue()) != null) {
                                    int i3 = FaceAnalysisFragment.LowLightSensitivity.b.a[faceAnalysisFragment2.q(miSnapSettings2, faceAnalysisFragment2.b$1()).ordinal()];
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 != 3) {
                                                if (i3 != 4) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            miSnapWorkflowViewModel2.a.handleFrameWarnings(feedbackResult.d);
                            e binding$workflow_release2 = faceAnalysisFragment2.getBinding$workflow_release();
                            FaceAnalysisFragment$$ExternalSyntheticLambda1 faceAnalysisFragment$$ExternalSyntheticLambda13 = faceAnalysisFragment2.n;
                            n nVar2 = faceAnalysisFragment2.d;
                            HintView hintView = binding$workflow_release2.j;
                            UserAction.Face.HOLD_STILL hold_still = UserAction.Face.HOLD_STILL.INSTANCE;
                            String str8 = "";
                            if (Intrinsics.areEqual(userAction, hold_still)) {
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewHoldStillAccessibilityMessage;
                            } else if (Intrinsics.areEqual(userAction, UserAction.Face.MULTIPLE_FACES.INSTANCE)) {
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewMultipleFacesAccessibilityMessage;
                            } else if (Intrinsics.areEqual(userAction, UserAction.Face.NOT_FOUND.INSTANCE)) {
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewNotFoundAccessibilityMessage;
                            } else if (Intrinsics.areEqual(userAction, UserAction.Face.OPEN_EYES.INSTANCE)) {
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewOpenEyesAccessibilityMessage;
                            } else if (Intrinsics.areEqual(userAction, UserAction.Face.PRESS_MANUAL_BUTTON.INSTANCE)) {
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewPressManualButtonAccessibilityMessage;
                            } else if (Intrinsics.areEqual(userAction, UserAction.Face.SMILE.INSTANCE)) {
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewSmileAccessibilityMessage;
                            } else if (Intrinsics.areEqual(userAction, UserAction.Face.STOP_SMILE.INSTANCE)) {
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewStopSmilingAccessibilityMessage;
                            } else if (Intrinsics.areEqual(userAction, UserAction.Face.STRAIGHTEN.INSTANCE)) {
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewStraightenAccessibilityMessage;
                            } else if (Intrinsics.areEqual(userAction, UserAction.Face.TOO_CLOSE.INSTANCE)) {
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewMoveFartherAwayAccessibilityMessage;
                            } else {
                                if (!Intrinsics.areEqual(userAction, UserAction.Face.TOO_FAR.INSTANCE)) {
                                    Intrinsics.areEqual(userAction, UserAction.NONE.INSTANCE);
                                    str4 = "";
                                    str4.getClass();
                                    hintView.setContentDescription(str4);
                                    HintView hintView2 = faceAnalysisFragment2.getBinding$workflow_release().j;
                                    if (!Intrinsics.areEqual(userAction, hold_still)) {
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewHoldStillMessage;
                                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.MULTIPLE_FACES.INSTANCE)) {
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewMultipleFacesMessage;
                                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.NOT_FOUND.INSTANCE)) {
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewNotFoundMessage;
                                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.OPEN_EYES.INSTANCE)) {
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewOpenEyesMessage;
                                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.PRESS_MANUAL_BUTTON.INSTANCE)) {
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewPressManualButtonMessage;
                                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.SMILE.INSTANCE)) {
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewSmileMessage;
                                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.STOP_SMILE.INSTANCE)) {
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewStopSmilingMessage;
                                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.STRAIGHTEN.INSTANCE)) {
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewStraightenMessage;
                                    } else if (Intrinsics.areEqual(userAction, UserAction.Face.TOO_CLOSE.INSTANCE)) {
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewMoveFartherAwayMessage;
                                    } else {
                                        if (!Intrinsics.areEqual(userAction, UserAction.Face.TOO_FAR.INSTANCE)) {
                                            Intrinsics.areEqual(userAction, UserAction.NONE.INSTANCE);
                                            str8.getClass();
                                            hintView2.setText(str8);
                                            str5 = str3;
                                            obj4 = null;
                                            if (str5 != null || (str7 = workflow2.get(str5)) == null) {
                                                obj5 = null;
                                            } else {
                                                Json.Default r10 = Json.Default;
                                                r10.getClass();
                                                obj5 = r10.decodeFromString(str7, FaceAnalysisFragment.WorkflowSettings.Companion.serializer());
                                            }
                                            workflowSettings3 = (FaceAnalysisFragment.WorkflowSettings) obj5;
                                            if ((workflowSettings3 != null || (b = workflowSettings3.A) == null) && (b = MultipartBody.Companion.b(faceAnalysisFragment2.getArguments(), "changeGuideViewStateOnFeedback")) == null) {
                                                companion.getClass();
                                                FaceAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings3);
                                                b = Boolean.TRUE;
                                            }
                                            if (b.booleanValue()) {
                                                GuideView guideView = faceAnalysisFragment2.getBinding$workflow_release().e;
                                                if (!Intrinsics.areEqual(userAction, hold_still) && !Intrinsics.areEqual(userAction, UserAction.Face.PRESS_MANUAL_BUTTON.INSTANCE) && !Intrinsics.areEqual(userAction, UserAction.Face.STOP_SMILE.INSTANCE) && !Intrinsics.areEqual(userAction, UserAction.Face.SMILE.INSTANCE) && !Intrinsics.areEqual(userAction, UserAction.NONE.INSTANCE)) {
                                                    if (!Intrinsics.areEqual(userAction, UserAction.Face.MULTIPLE_FACES.INSTANCE) && !Intrinsics.areEqual(userAction, UserAction.Face.OPEN_EYES.INSTANCE) && !Intrinsics.areEqual(userAction, UserAction.Face.NOT_FOUND.INSTANCE) && !Intrinsics.areEqual(userAction, UserAction.Face.STRAIGHTEN.INSTANCE) && !Intrinsics.areEqual(userAction, UserAction.Face.TOO_CLOSE.INSTANCE)) {
                                                        Intrinsics.areEqual(userAction, UserAction.Face.TOO_FAR.INSTANCE);
                                                    }
                                                    z4 = false;
                                                }
                                                guideView.setEnabled(z4);
                                            }
                                            if (str5 != null && (str6 = workflow2.get(str5)) != null) {
                                                Json.Default r13 = Json.Default;
                                                r13.getClass();
                                                obj4 = r13.decodeFromString(str6, FaceAnalysisFragment.WorkflowSettings.Companion.serializer());
                                            }
                                            workflowSettings4 = (FaceAnalysisFragment.WorkflowSettings) obj4;
                                            if ((workflowSettings4 != null || (b2 = workflowSettings4.l) == null) && (b2 = MultipartBody.Companion.b(faceAnalysisFragment2.getArguments(), "showCountdownTimer")) == null) {
                                                companion.getClass();
                                                b2 = FaceAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings3).l;
                                            }
                                            if (b2 != null) {
                                                boolean booleanValue = b2.booleanValue();
                                                if (Intrinsics.areEqual(userAction, hold_still) && booleanValue) {
                                                    CountdownTimerView countdownTimerView2 = faceAnalysisFragment2.getBinding$workflow_release().d;
                                                    if (countdownTimerView2.d <= -1) {
                                                        countdownTimerView2.d = 0;
                                                        countdownTimerView2.f.post(countdownTimerView2.g);
                                                    }
                                                    countdownTimerView2.setVisibility(0);
                                                } else {
                                                    faceAnalysisFragment2.e$2();
                                                }
                                            }
                                            if (FaceAnalysisFragment.d(faceAnalysisFragment2.h) && FaceAnalysisFragment.d(userAction)) {
                                                nVar2.pause(faceAnalysisFragment$$ExternalSyntheticLambda13);
                                            } else if (FaceAnalysisFragment.d(faceAnalysisFragment2.h) && !FaceAnalysisFragment.d(userAction)) {
                                                nVar2.resume(faceAnalysisFragment$$ExternalSyntheticLambda13);
                                            }
                                            faceAnalysisFragment2.h = userAction;
                                        }
                                        i2 = R.string.misnapWorkflowFaceAnalysisFragmentHintViewGetCloserMessage;
                                    }
                                    str8 = faceAnalysisFragment2.getString(i2);
                                    str8.getClass();
                                    hintView2.setText(str8);
                                    str5 = str3;
                                    obj4 = null;
                                    if (str5 != null) {
                                    }
                                    obj5 = null;
                                    workflowSettings3 = (FaceAnalysisFragment.WorkflowSettings) obj5;
                                    if (workflowSettings3 != null) {
                                    }
                                    companion.getClass();
                                    FaceAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings3);
                                    b = Boolean.TRUE;
                                    if (b.booleanValue()) {
                                    }
                                    if (str5 != null) {
                                        Json.Default r132 = Json.Default;
                                        r132.getClass();
                                        obj4 = r132.decodeFromString(str6, FaceAnalysisFragment.WorkflowSettings.Companion.serializer());
                                    }
                                    workflowSettings4 = (FaceAnalysisFragment.WorkflowSettings) obj4;
                                    if (workflowSettings4 != null) {
                                    }
                                    companion.getClass();
                                    b2 = FaceAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings3).l;
                                    if (b2 != null) {
                                    }
                                    if (FaceAnalysisFragment.d(faceAnalysisFragment2.h)) {
                                    }
                                    if (FaceAnalysisFragment.d(faceAnalysisFragment2.h)) {
                                        nVar2.resume(faceAnalysisFragment$$ExternalSyntheticLambda13);
                                    }
                                    faceAnalysisFragment2.h = userAction;
                                }
                                i = R.string.misnapWorkflowFaceAnalysisFragmentHintViewGetCloserAccessibilityMessage;
                            }
                            str4 = faceAnalysisFragment2.getString(i);
                            str4.getClass();
                            hintView.setContentDescription(str4);
                            HintView hintView22 = faceAnalysisFragment2.getBinding$workflow_release().j;
                            if (!Intrinsics.areEqual(userAction, hold_still)) {
                            }
                            str8 = faceAnalysisFragment2.getString(i2);
                            str8.getClass();
                            hintView22.setText(str8);
                            str5 = str3;
                            obj4 = null;
                            if (str5 != null) {
                            }
                            obj5 = null;
                            workflowSettings3 = (FaceAnalysisFragment.WorkflowSettings) obj5;
                            if (workflowSettings3 != null) {
                            }
                            companion.getClass();
                            FaceAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings3);
                            b = Boolean.TRUE;
                            if (b.booleanValue()) {
                            }
                            if (str5 != null) {
                            }
                            workflowSettings4 = (FaceAnalysisFragment.WorkflowSettings) obj4;
                            if (workflowSettings4 != null) {
                            }
                            companion.getClass();
                            b2 = FaceAnalysisFragment.Companion.getDefaultWorkflowSettings(miSnapSettings3).l;
                            if (b2 != null) {
                            }
                            if (FaceAnalysisFragment.d(faceAnalysisFragment2.h)) {
                            }
                            if (FaceAnalysisFragment.d(faceAnalysisFragment2.h)) {
                            }
                            faceAnalysisFragment2.h = userAction;
                        }
                    }
                };
                faceAnalysisFragment.getBinding$workflow_release().m.w.observe(faceAnalysisFragment.getViewLifecycleOwner(), r1);
                faceAnalysisFragment.r = r1;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda1] */
    public FaceAnalysisFragment() {
        super(R.layout.misnap_fragment_face_analysis);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, b.a);
        this.d = new n();
        final int i = 1;
        this.e = true;
        this.h = UserAction.NONE.INSTANCE;
        this.j = MibiData.bindSession();
        final int i2 = 0;
        this.k = LazyKt.lazy(new c(this, i2));
        this.l = new HelpFragment$$ExternalSyntheticLambda2(this, 3);
        this.m = LazyKt.lazy(new c(this, i));
        this.n = new Runnable(this) { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ FaceAnalysisFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object failure;
                Unit unit;
                int i3 = i2;
                Unit unit2 = null;
                MiSnapSettings.Analysis.Face.Trigger trigger = MiSnapSettings.Analysis.Face.Trigger.MANUAL;
                FaceAnalysisFragment faceAnalysisFragment = this.f$0;
                switch (i3) {
                    case 0:
                        FaceAnalysisFragment.Companion companion = FaceAnalysisFragment.Companion;
                        try {
                            faceAnalysisFragment.j.addUxpEvent("SFCFO", new String[0]);
                            try {
                                Result.Companion companion2 = Result.Companion;
                                failure = FragmentKt.findNavController(faceAnalysisFragment);
                            } catch (Throwable th) {
                                Result.Companion companion3 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                                faceAnalysisFragment.c$1().postNavigationError$workflow_release(new NavigationError(new Exception(m4120exceptionOrNullimpl), FaceAnalysisFragment.class, faceAnalysisFragment.hashCode(), NavigationAction$FaceAnalysis$NavigateHelp.INSTANCE$1));
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                FragmentKt.findNavController(faceAnalysisFragment).navigate(R.id.navigateFailover);
                                break;
                            }
                        } catch (Exception unused) {
                            MiSnapSettings miSnapSettings = (MiSnapSettings) faceAnalysisFragment.c$1().f.getValue();
                            if (miSnapSettings != null) {
                                miSnapSettings.analysis.face.a = trigger;
                                faceAnalysisFragment.c$1().updateState$workflow_release(miSnapSettings);
                                faceAnalysisFragment.d$2();
                                if (Intrinsics.areEqual(MibiData.i, FaceAnalysisFragment.class.getName()) || Intrinsics.areEqual(MibiData.i, MiSnapWorkflowViewModel.class.getName())) {
                                    faceAnalysisFragment.j.getMetaData().c++;
                                }
                                faceAnalysisFragment.a$2(miSnapSettings, faceAnalysisFragment.b$1(), faceAnalysisFragment.c$1());
                                unit2 = Unit.INSTANCE;
                            }
                            if (unit2 == null) {
                                MiSnapWorkflowViewModel c$1 = faceAnalysisFragment.c$1();
                                Context requireContext = faceAnalysisFragment.requireContext();
                                requireContext.getClass();
                                c$1.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
                                return;
                            }
                            return;
                        }
                        break;
                    default:
                        FaceAnalysisFragment.Companion companion4 = FaceAnalysisFragment.Companion;
                        MiSnapWorkflowViewModel c$12 = faceAnalysisFragment.c$1();
                        FaceAnalysisFragment$$ExternalSyntheticLambda1 faceAnalysisFragment$$ExternalSyntheticLambda1 = faceAnalysisFragment.n;
                        n nVar = faceAnalysisFragment.d;
                        MiSnapSettings miSnapSettings2 = (MiSnapSettings) c$12.f.getValue();
                        if (miSnapSettings2 != null) {
                            miSnapSettings2.analysis.face.a = trigger;
                            faceAnalysisFragment.c$1().updateState$workflow_release(miSnapSettings2);
                            faceAnalysisFragment.d$2();
                            if (nVar.isRunning(faceAnalysisFragment$$ExternalSyntheticLambda1)) {
                                nVar.cancel(faceAnalysisFragment$$ExternalSyntheticLambda1);
                            }
                            faceAnalysisFragment.a$2(miSnapSettings2, faceAnalysisFragment.b$1(), faceAnalysisFragment.c$1());
                            unit2 = Unit.INSTANCE;
                        }
                        if (unit2 == null) {
                            MiSnapWorkflowViewModel c$13 = faceAnalysisFragment.c$1();
                            Context requireContext2 = faceAnalysisFragment.requireContext();
                            requireContext2.getClass();
                            c$13.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
                            break;
                        }
                        break;
                }
            }
        };
        this.o = new Runnable(this) { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ FaceAnalysisFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object failure;
                Unit unit;
                int i3 = i;
                Unit unit2 = null;
                MiSnapSettings.Analysis.Face.Trigger trigger = MiSnapSettings.Analysis.Face.Trigger.MANUAL;
                FaceAnalysisFragment faceAnalysisFragment = this.f$0;
                switch (i3) {
                    case 0:
                        FaceAnalysisFragment.Companion companion = FaceAnalysisFragment.Companion;
                        try {
                            faceAnalysisFragment.j.addUxpEvent("SFCFO", new String[0]);
                            try {
                                Result.Companion companion2 = Result.Companion;
                                failure = FragmentKt.findNavController(faceAnalysisFragment);
                            } catch (Throwable th) {
                                Result.Companion companion3 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                                faceAnalysisFragment.c$1().postNavigationError$workflow_release(new NavigationError(new Exception(m4120exceptionOrNullimpl), FaceAnalysisFragment.class, faceAnalysisFragment.hashCode(), NavigationAction$FaceAnalysis$NavigateHelp.INSTANCE$1));
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                FragmentKt.findNavController(faceAnalysisFragment).navigate(R.id.navigateFailover);
                                break;
                            }
                        } catch (Exception unused) {
                            MiSnapSettings miSnapSettings = (MiSnapSettings) faceAnalysisFragment.c$1().f.getValue();
                            if (miSnapSettings != null) {
                                miSnapSettings.analysis.face.a = trigger;
                                faceAnalysisFragment.c$1().updateState$workflow_release(miSnapSettings);
                                faceAnalysisFragment.d$2();
                                if (Intrinsics.areEqual(MibiData.i, FaceAnalysisFragment.class.getName()) || Intrinsics.areEqual(MibiData.i, MiSnapWorkflowViewModel.class.getName())) {
                                    faceAnalysisFragment.j.getMetaData().c++;
                                }
                                faceAnalysisFragment.a$2(miSnapSettings, faceAnalysisFragment.b$1(), faceAnalysisFragment.c$1());
                                unit2 = Unit.INSTANCE;
                            }
                            if (unit2 == null) {
                                MiSnapWorkflowViewModel c$1 = faceAnalysisFragment.c$1();
                                Context requireContext = faceAnalysisFragment.requireContext();
                                requireContext.getClass();
                                c$1.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
                                return;
                            }
                            return;
                        }
                        break;
                    default:
                        FaceAnalysisFragment.Companion companion4 = FaceAnalysisFragment.Companion;
                        MiSnapWorkflowViewModel c$12 = faceAnalysisFragment.c$1();
                        FaceAnalysisFragment$$ExternalSyntheticLambda1 faceAnalysisFragment$$ExternalSyntheticLambda1 = faceAnalysisFragment.n;
                        n nVar = faceAnalysisFragment.d;
                        MiSnapSettings miSnapSettings2 = (MiSnapSettings) c$12.f.getValue();
                        if (miSnapSettings2 != null) {
                            miSnapSettings2.analysis.face.a = trigger;
                            faceAnalysisFragment.c$1().updateState$workflow_release(miSnapSettings2);
                            faceAnalysisFragment.d$2();
                            if (nVar.isRunning(faceAnalysisFragment$$ExternalSyntheticLambda1)) {
                                nVar.cancel(faceAnalysisFragment$$ExternalSyntheticLambda1);
                            }
                            faceAnalysisFragment.a$2(miSnapSettings2, faceAnalysisFragment.b$1(), faceAnalysisFragment.c$1());
                            unit2 = Unit.INSTANCE;
                        }
                        if (unit2 == null) {
                            MiSnapWorkflowViewModel c$13 = faceAnalysisFragment.c$1();
                            Context requireContext2 = faceAnalysisFragment.requireContext();
                            requireContext2.getClass();
                            c$13.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
                            break;
                        }
                        break;
                }
            }
        };
        this.u = new LiveDataObservable$$ExternalSyntheticLambda5(this, 7);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(this, 3));
        registerForActivityResult.getClass();
        this.v = registerForActivityResult;
    }

    public static final void a(MiSnapWorkflowViewModel miSnapWorkflowViewModel, FaceAnalysisFragment faceAnalysisFragment, MiSnapController.ErrorResult errorResult) {
        miSnapWorkflowViewModel.getClass();
        if (errorResult != null) {
            if (errorResult instanceof MiSnapController.ErrorResult.FaceAnalysis) {
                MiSnapController.ErrorResult.FaceAnalysis faceAnalysis = (MiSnapController.ErrorResult.FaceAnalysis) errorResult;
                MiSnapFaceAnalyzer.Result.Failure failure = faceAnalysis.a;
                if (failure instanceof MiSnapFaceAnalyzer.Result.Failure.License) {
                    Context requireContext = faceAnalysisFragment.requireContext();
                    requireContext.getClass();
                    MiSnapFaceAnalyzer.Result.Failure.License license = faceAnalysis.a;
                    license.getClass();
                    miSnapWorkflowViewModel.postError$workflow_release(requireContext, new MiSnapWorkflowError.License(license.getReason()));
                    return;
                }
                if ((failure instanceof MiSnapFaceAnalyzer.Result.Failure.Processing) || (failure instanceof MiSnapFaceAnalyzer.Result.Failure.Downloading)) {
                    return;
                }
            }
            Context requireContext2 = faceAnalysisFragment.requireContext();
            requireContext2.getClass();
            miSnapWorkflowViewModel.postError$workflow_release(requireContext2, MiSnapWorkflowError.Analysis.INSTANCE);
        }
    }

    public static boolean d(UserAction userAction) {
        return CollectionsKt.contains(CollectionsKt__CollectionsKt.listOf((Object[]) new UserAction.Face[]{UserAction.Face.HOLD_STILL.INSTANCE, UserAction.Face.SMILE.INSTANCE, UserAction.Face.STOP_SMILE.INSTANCE}), userAction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a$2(MiSnapFinalResult miSnapFinalResult) {
        Object obj;
        Integer d;
        Object obj2;
        Integer d2;
        Drawable b2;
        Object obj3;
        Integer d3;
        Object obj4;
        Boolean b3;
        Object obj5;
        String e;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        String str4;
        String str5;
        this.c = miSnapFinalResult;
        this.d.cancelAll();
        ((ConstraintLayout) getBinding$workflow_release().l.a).setVisibility(4);
        e$2();
        FaceAnalysisFragment$$ExternalSyntheticLambda10 faceAnalysisFragment$$ExternalSyntheticLambda10 = this.r;
        if (faceAnalysisFragment$$ExternalSyntheticLambda10 != null) {
            getBinding$workflow_release().m.w.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda10);
        }
        HintView hintView = getBinding$workflow_release().j;
        String str6 = null;
        hintView.setAnimation(null);
        hintView.setVisibility(8);
        hintView.clearText();
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$1().f.getValue();
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            SuccessView successView = getBinding$workflow_release().o;
            String b$1 = b$1();
            if (b$1 == null || (str5 = workflow.get(b$1)) == null) {
                obj = null;
            } else {
                Json.Default r5 = Json.Default;
                r5.getClass();
                obj = r5.decodeFromString(str5, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            Companion companion = Companion;
            if ((workflowSettings == null || (d = workflowSettings.s) == null) && (d = MultipartBody.Companion.d(getArguments(), "successViewMessageDrawableId")) == null) {
                companion.getClass();
                d = Companion.getDefaultWorkflowSettings(miSnapSettings).s;
            }
            if (d != null) {
                successView.setDrawableId(d.intValue());
            }
            String b$12 = b$1();
            if (b$12 == null || (str4 = workflow.get(b$12)) == null) {
                obj2 = null;
            } else {
                Json.Default r6 = Json.Default;
                r6.getClass();
                obj2 = r6.decodeFromString(str4, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (d2 = workflowSettings2.u) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "successViewBackgroundDrawableId")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                d2 = null;
            }
            if (d2 == null) {
                MiSnapFinalResult.FaceSession faceSession = miSnapFinalResult instanceof MiSnapFinalResult.FaceSession ? (MiSnapFinalResult.FaceSession) miSnapFinalResult : null;
                if (faceSession == null || (bArr = faceSession.b) == null) {
                    bArr = new byte[0];
                }
                b2 = new BitmapDrawable(successView.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } else {
                Context requireContext = requireContext();
                requireContext.getClass();
                b2 = MultipartBody.Companion.b(requireContext, d2.intValue());
            }
            successView.setBackground(b2);
            String b$13 = b$1();
            if (b$13 == null || (str3 = workflow.get(b$13)) == null) {
                obj3 = null;
            } else {
                Json.Default r62 = Json.Default;
                r62.getClass();
                obj3 = r62.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings3 = (WorkflowSettings) obj3;
            if ((workflowSettings3 == null || (d3 = workflowSettings3.t) == null) && (d3 = MultipartBody.Companion.d(getArguments(), "successViewMessageAnimationId")) == null) {
                companion.getClass();
                d3 = Companion.getDefaultWorkflowSettings(miSnapSettings).t;
            }
            if (d3 != null) {
                int intValue = d3.intValue();
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                successView.setAnimation(MultipartBody.Companion.a(requireContext2, intValue));
            }
            String b$14 = b$1();
            if (b$14 == null || (str2 = workflow.get(b$14)) == null) {
                obj4 = null;
            } else {
                Json.Default r63 = Json.Default;
                r63.getClass();
                obj4 = r63.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings4 = (WorkflowSettings) obj4;
            if ((workflowSettings4 == null || (b3 = workflowSettings4.v) == null) && (b3 = MultipartBody.Companion.b(getArguments(), "successViewShouldVibrate")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b3 = Boolean.TRUE;
            }
            successView.setVibrate(b3.booleanValue());
            String b$15 = b$1();
            if (b$15 == null || (str = workflow.get(b$15)) == null) {
                obj5 = null;
            } else {
                Json.Default r4 = Json.Default;
                r4.getClass();
                obj5 = r4.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings5 = (WorkflowSettings) obj5;
            if ((workflowSettings5 == null || (e = workflowSettings5.w) == null) && (e = MultipartBody.Companion.e(getArguments())) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
            } else {
                str6 = e;
            }
            if (str6 != null) {
                successView.setSoundUri(str6);
            }
            successView.start(new Rum$createMonitor$1(9, this, miSnapSettings, miSnapFinalResult));
            str6 = successView;
        }
        if (str6 == null) {
            MiSnapWorkflowViewModel c$1 = c$1();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            c$1.postError$workflow_release(requireContext3, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    public final void a$3$2() {
        GuideView guideView = getBinding$workflow_release().e;
        guideView.setDrawableId(R.drawable.misnap_guide_face_low_light_conditions);
        guideView.setVignetteColor(requireContext().getColor(R.color.colorGuideViewVignetteLowLightConditions));
        WindowManager.LayoutParams attributes = requireActivity().getWindow().getAttributes();
        attributes.screenBrightness = 1.0f;
        requireActivity().getWindow().setAttributes(attributes);
        this.j.addUxpEvent("SFABR", new String[0]);
    }

    public final String b$1() {
        return (String) this.k.getValue();
    }

    public final MiSnapWorkflowViewModel c$1() {
        return (MiSnapWorkflowViewModel) this.m.getValue();
    }

    public final void d$2() {
        AppCompatImageView appCompatImageView = getBinding$workflow_release().k;
        appCompatImageView.setVisibility(0);
        appCompatImageView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(4, this, appCompatImageView));
    }

    public final void e$2() {
        CountdownTimerView countdownTimerView = getBinding$workflow_release().d;
        countdownTimerView.setVisibility(8);
        if (countdownTimerView.d == -1) {
            return;
        }
        countdownTimerView.d = -1;
        countdownTimerView.setText((CharSequence) null);
        countdownTimerView.f.removeCallbacksAndMessages(null);
    }

    public final /* synthetic */ e getBinding$workflow_release() {
        return (e) this.a.getValue((Fragment) this, w[0]);
    }

    public final Integer h$2(MiSnapSettings miSnapSettings, String str) {
        Object obj;
        Integer num;
        String str2;
        if (str == null || (str2 = miSnapSettings.workflow.get(str)) == null) {
            obj = null;
        } else {
            Json.Default r0 = Json.Default;
            r0.getClass();
            obj = r0.decodeFromString(str2, WorkflowSettings.Companion.serializer());
        }
        WorkflowSettings workflowSettings = (WorkflowSettings) obj;
        if (workflowSettings != null && (num = workflowSettings.a) != null) {
            return num;
        }
        Integer d = MultipartBody.Companion.d(getArguments(), "guideViewDrawableId");
        if (d != null) {
            return d;
        }
        Companion.getClass();
        return Companion.getDefaultWorkflowSettings(miSnapSettings).a;
    }

    public final Boolean j(MiSnapSettings miSnapSettings, String str) {
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
        Boolean b2 = MultipartBody.Companion.b(getArguments(), "guideViewShowVignette");
        if (b2 != null) {
            return b2;
        }
        Companion.getClass();
        Companion.getDefaultWorkflowSettings(miSnapSettings);
        return Boolean.TRUE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Integer num;
        super.onDestroyView();
        this.d.cancelAll();
        MibiData.releaseSession(FaceAnalysisFragment.class.getName());
        if (this.e) {
            try {
                FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.l);
            } catch (Exception unused) {
                if (!requireActivity().isChangingConfigurations() && (num = this.f) != null) {
                    requireActivity().setRequestedOrientation(num.intValue());
                }
            }
        }
        WindowManager.LayoutParams attributes = requireActivity().getWindow().getAttributes();
        attributes.screenBrightness = -1.0f;
        requireActivity().getWindow().setAttributes(attributes);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Unit unit;
        super.onPause();
        FaceAnalysisFragment$$ExternalSyntheticLambda1 faceAnalysisFragment$$ExternalSyntheticLambda1 = this.n;
        n nVar = this.d;
        nVar.pause(faceAnalysisFragment$$ExternalSyntheticLambda1);
        nVar.pause(this.o);
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$1().f.getValue();
        if (miSnapSettings != null) {
            if (s.shouldRecordSession(miSnapSettings.camera.videoRecord)) {
                getBinding$workflow_release().n.stop();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel c$1 = c$1();
            Context requireContext = requireContext();
            requireContext.getClass();
            c$1.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        MiSnapView miSnapView = getBinding$workflow_release().m;
        FaceAnalysisFragment$$ExternalSyntheticLambda12 faceAnalysisFragment$$ExternalSyntheticLambda12 = this.p;
        if (faceAnalysisFragment$$ExternalSyntheticLambda12 != null) {
            miSnapView.x.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda12);
        }
        FaceAnalysisFragment$$ExternalSyntheticLambda11 faceAnalysisFragment$$ExternalSyntheticLambda11 = this.q;
        if (faceAnalysisFragment$$ExternalSyntheticLambda11 != null) {
            miSnapView.y.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda11);
        }
        FaceAnalysisFragment$$ExternalSyntheticLambda10 faceAnalysisFragment$$ExternalSyntheticLambda10 = this.r;
        if (faceAnalysisFragment$$ExternalSyntheticLambda10 != null) {
            miSnapView.w.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda10);
        }
        FaceAnalysisFragment$$ExternalSyntheticLambda11 faceAnalysisFragment$$ExternalSyntheticLambda112 = this.s;
        if (faceAnalysisFragment$$ExternalSyntheticLambda112 != null) {
            miSnapView.z.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda112);
        }
        miSnapView.C.removeObserver(this.u);
        TorchView torchView = getBinding$workflow_release().p;
        FaceAnalysisFragment$$ExternalSyntheticLambda7 faceAnalysisFragment$$ExternalSyntheticLambda7 = this.t;
        if (faceAnalysisFragment$$ExternalSyntheticLambda7 != null) {
            torchView.b.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda7);
        }
        torchView.removeObserver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.Observer, com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda11] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.Observer, com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda11] */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Unit unit;
        Object obj;
        Float c2;
        Float valueOf;
        Object obj2;
        Integer d;
        Object obj3;
        Integer d2;
        Object obj4;
        Integer d3;
        Object obj5;
        Integer d4;
        Object obj6;
        Boolean b2;
        Object obj7;
        Integer d5;
        Object obj8;
        Boolean b3;
        Object obj9;
        Integer d6;
        Object obj10;
        Integer d7;
        Object obj11;
        Boolean b4;
        Object obj12;
        Integer d8;
        Object obj13;
        Integer d9;
        Object obj14;
        Integer d10;
        Object obj15;
        Boolean b5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int intValue;
        String str13;
        String str14;
        String str15;
        Integer num = 5000;
        final int i = 0;
        super.onResume();
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$1().f.getValue();
        final int i2 = 1;
        Companion companion = Companion;
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MiSnapFinalResult miSnapFinalResult = c$1().h;
            if (miSnapFinalResult != null) {
                a$2(c$1(), miSnapSettings, b$1(), miSnapFinalResult);
                return;
            }
            FaceAnalysisFragment$$ExternalSyntheticLambda12 faceAnalysisFragment$$ExternalSyntheticLambda12 = new FaceAnalysisFragment$$ExternalSyntheticLambda12(s.shouldRecordSession(miSnapSettings.camera.videoRecord), this, i);
            getBinding$workflow_release().m.x.observe(getViewLifecycleOwner(), faceAnalysisFragment$$ExternalSyntheticLambda12);
            this.p = faceAnalysisFragment$$ExternalSyntheticLambda12;
            getBinding$workflow_release().m.C.observe(getViewLifecycleOwner(), this.u);
            GuideView guideView = getBinding$workflow_release().e;
            String b$1 = b$1();
            if (b$1 == null || (str15 = workflow.get(b$1)) == null) {
                obj = null;
            } else {
                Json.Default r10 = Json.Default;
                r10.getClass();
                obj = r10.decodeFromString(str15, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            float floatValue = ((workflowSettings == null || (c2 = workflowSettings.b) == null) && (c2 = MultipartBody.Companion.c(getArguments(), "guideViewScalePercentage")) == null) ? -1.0f : c2.floatValue();
            double d11 = floatValue;
            if (0.0d > d11 || d11 > 1.0d) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                valueOf = Float.valueOf(0.7f);
            } else {
                valueOf = Float.valueOf(floatValue);
            }
            guideView.setScale(valueOf.floatValue());
            Integer h$2 = h$2(miSnapSettings, b$1());
            if (h$2 != null) {
                int intValue2 = h$2.intValue();
                Context requireContext = requireContext();
                requireContext.getClass();
                guideView.setDrawable(MultipartBody.Companion.b(requireContext, intValue2));
            }
            guideView.setShowVignette(j(miSnapSettings, b$1()).booleanValue());
            guideView.setEnabled(false);
            CountdownTimerView countdownTimerView = getBinding$workflow_release().d;
            String b$12 = b$1();
            if (b$12 == null || (str14 = workflow.get(b$12)) == null) {
                obj2 = null;
            } else {
                Json.Default r102 = Json.Default;
                r102.getClass();
                obj2 = r102.decodeFromString(str14, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (d = workflowSettings2.o) == null) && (d = MultipartBody.Companion.d(getArguments(), "countdownTimerAnimationId")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                d = 0;
            }
            int intValue3 = d.intValue();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            countdownTimerView.setAnimation(MultipartBody.Companion.a(requireContext2, intValue3));
            String b$13 = b$1();
            if (b$13 == null || (str13 = workflow.get(b$13)) == null) {
                obj3 = null;
            } else {
                Json.Default r103 = Json.Default;
                r103.getClass();
                obj3 = r103.decodeFromString(str13, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings3 = (WorkflowSettings) obj3;
            if ((workflowSettings3 == null || (d2 = workflowSettings3.n) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "countdownTimerLabelsId")) == null) {
                companion.getClass();
                d2 = Companion.getDefaultWorkflowSettings(miSnapSettings).n;
            }
            if (d2 != null && (intValue = d2.intValue()) != 0) {
                countdownTimerView.setLabels(intValue);
            }
            HintView hintView = getBinding$workflow_release().j;
            String b$14 = b$1();
            if (b$14 == null || (str12 = workflow.get(b$14)) == null) {
                obj4 = null;
            } else {
                Json.Default r104 = Json.Default;
                r104.getClass();
                obj4 = r104.decodeFromString(str12, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings4 = (WorkflowSettings) obj4;
            if ((workflowSettings4 == null || (d3 = workflowSettings4.h) == null) && (d3 = MultipartBody.Companion.d(getArguments(), "hintDuration")) == null) {
                Context requireContext3 = requireContext();
                requireContext3.getClass();
                Object systemService = requireContext3.getSystemService("accessibility");
                AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    d3 = num;
                } else {
                    companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    d3 = 3000;
                }
            }
            hintView.setDuration(d3.intValue());
            String b$15 = b$1();
            if (b$15 == null || (str11 = workflow.get(b$15)) == null) {
                obj5 = null;
            } else {
                Json.Default r11 = Json.Default;
                r11.getClass();
                obj5 = r11.decodeFromString(str11, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings5 = (WorkflowSettings) obj5;
            if ((workflowSettings5 == null || (d4 = workflowSettings5.i) == null) && (d4 = MultipartBody.Companion.d(getArguments(), "hintAnimationId")) == null) {
                companion.getClass();
                d4 = Companion.getDefaultWorkflowSettings(miSnapSettings).i;
            }
            if (d4 != null) {
                int intValue4 = d4.intValue();
                Context requireContext4 = requireContext();
                requireContext4.getClass();
                hintView.setAnimation(MultipartBody.Companion.a(requireContext4, intValue4));
            }
            String b$16 = b$1();
            if (b$16 == null || (str10 = workflow.get(b$16)) == null) {
                obj6 = null;
            } else {
                Json.Default r112 = Json.Default;
                r112.getClass();
                obj6 = r112.decodeFromString(str10, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings6 = (WorkflowSettings) obj6;
            if ((workflowSettings6 == null || (b2 = workflowSettings6.j) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "hintViewShowBackground")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b2 = Boolean.TRUE;
            }
            hintView.setShowBackground(b2.booleanValue());
            String b$17 = b$1();
            if (b$17 == null || (str9 = workflow.get(b$17)) == null) {
                obj7 = null;
            } else {
                Json.Default r113 = Json.Default;
                r113.getClass();
                obj7 = r113.decodeFromString(str9, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings7 = (WorkflowSettings) obj7;
            if ((workflowSettings7 == null || (d5 = workflowSettings7.k) == null) && (d5 = MultipartBody.Companion.d(getArguments(), "hintViewInitialHintDelay")) == null) {
                FragmentActivity requireActivity = requireActivity();
                requireActivity.getClass();
                Object systemService2 = requireActivity.getSystemService("accessibility");
                AccessibilityManager accessibilityManager2 = systemService2 instanceof AccessibilityManager ? (AccessibilityManager) systemService2 : null;
                if (accessibilityManager2 == null || !accessibilityManager2.isEnabled() || !accessibilityManager2.isTouchExplorationEnabled()) {
                    companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    num = 0;
                }
            } else {
                num = d5;
            }
            hintView.setInitialHintDelay(num.intValue());
            String b$18 = b$1();
            if (b$18 == null || (str8 = workflow.get(b$18)) == null) {
                obj8 = null;
            } else {
                Json.Default r2 = Json.Default;
                r2.getClass();
                obj8 = r2.decodeFromString(str8, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings8 = (WorkflowSettings) obj8;
            if ((workflowSettings8 == null || (b3 = workflowSettings8.E) == null) && (b3 = MultipartBody.Companion.b(getArguments(), "hintViewShouldAnnounceUnchangedHints")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b3 = Boolean.TRUE;
            }
            hintView.setAnnounceUnchangedHints(b3.booleanValue());
            TorchView torchView = getBinding$workflow_release().p;
            String b$19 = b$1();
            if (b$19 == null || (str7 = workflow.get(b$19)) == null) {
                obj9 = null;
            } else {
                Json.Default r8 = Json.Default;
                r8.getClass();
                obj9 = r8.decodeFromString(str7, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings9 = (WorkflowSettings) obj9;
            if ((workflowSettings9 == null || (d6 = workflowSettings9.f) == null) && (d6 = MultipartBody.Companion.d(getArguments(), "torchViewOnDrawableId")) == null) {
                companion.getClass();
                d6 = Companion.getDefaultWorkflowSettings(miSnapSettings).f;
            }
            if (d6 != null) {
                torchView.setTorchOnDrawableId(d6.intValue());
            }
            String b$110 = b$1();
            if (b$110 == null || (str6 = workflow.get(b$110)) == null) {
                obj10 = null;
            } else {
                Json.Default r82 = Json.Default;
                r82.getClass();
                obj10 = r82.decodeFromString(str6, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings10 = (WorkflowSettings) obj10;
            if ((workflowSettings10 == null || (d7 = workflowSettings10.g) == null) && (d7 = MultipartBody.Companion.d(getArguments(), "torchViewOffDrawableId")) == null) {
                companion.getClass();
                d7 = Companion.getDefaultWorkflowSettings(miSnapSettings).g;
            }
            if (d7 != null) {
                torchView.setTorchOffDrawableId(d7.intValue());
            }
            AppCompatImageView appCompatImageView = getBinding$workflow_release().c;
            String b$111 = b$1();
            if (b$111 == null || (str5 = workflow.get(b$111)) == null) {
                obj11 = null;
            } else {
                Json.Default r83 = Json.Default;
                r83.getClass();
                obj11 = r83.decodeFromString(str5, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings11 = (WorkflowSettings) obj11;
            if ((workflowSettings11 == null || (b4 = workflowSettings11.C) == null) && (b4 = MultipartBody.Companion.b(getArguments(), "showCancelButton")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b4 = Boolean.FALSE;
            }
            if (b4.booleanValue()) {
                appCompatImageView.setVisibility(0);
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda5
                    public final /* synthetic */ FaceAnalysisFragment f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i;
                        FaceAnalysisFragment faceAnalysisFragment = this.f$0;
                        switch (i3) {
                            case 0:
                                FaceAnalysisFragment.Companion companion2 = FaceAnalysisFragment.Companion;
                                faceAnalysisFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                break;
                            default:
                                FaceAnalysisFragment.Companion companion3 = FaceAnalysisFragment.Companion;
                                try {
                                    FragmentKt.findNavController(faceAnalysisFragment).navigate(R.id.navigateHelp);
                                    break;
                                } catch (Exception e) {
                                    Log.e("FaceAnalysisScreen", "Nav Graph Error", e);
                                    faceAnalysisFragment.c$1().postNavigationError$workflow_release(new NavigationError(e, FaceAnalysisFragment.class, faceAnalysisFragment.hashCode(), NavigationAction$FaceAnalysis$NavigateHelp.INSTANCE));
                                }
                        }
                    }
                });
            }
            String b$112 = b$1();
            if (b$112 == null || (str4 = workflow.get(b$112)) == null) {
                obj12 = null;
            } else {
                Json.Default r84 = Json.Default;
                r84.getClass();
                obj12 = r84.decodeFromString(str4, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings12 = (WorkflowSettings) obj12;
            if ((workflowSettings12 == null || (d8 = workflowSettings12.D) == null) && (d8 = MultipartBody.Companion.d(getArguments(), "cancelButtonDrawableId")) == null) {
                companion.getClass();
                d8 = Companion.getDefaultWorkflowSettings(miSnapSettings).D;
            }
            if (d8 != null) {
                int intValue5 = d8.intValue();
                Context requireContext5 = requireContext();
                requireContext5.getClass();
                appCompatImageView.setImageDrawable(MultipartBody.Companion.b(requireContext5, intValue5));
            }
            AppCompatImageView appCompatImageView2 = getBinding$workflow_release().i;
            String b$113 = b$1();
            if (b$113 == null || (str3 = workflow.get(b$113)) == null) {
                obj13 = null;
            } else {
                Json.Default r85 = Json.Default;
                r85.getClass();
                obj13 = r85.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings13 = (WorkflowSettings) obj13;
            if ((workflowSettings13 == null || (d9 = workflowSettings13.r) == null) && (d9 = MultipartBody.Companion.d(getArguments(), "helpButtonDrawableId")) == null) {
                companion.getClass();
                d9 = Companion.getDefaultWorkflowSettings(miSnapSettings).r;
            }
            if (d9 != null) {
                int intValue6 = d9.intValue();
                Context requireContext6 = requireContext();
                requireContext6.getClass();
                appCompatImageView2.setImageDrawable(MultipartBody.Companion.b(requireContext6, intValue6));
            }
            appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda5
                public final /* synthetic */ FaceAnalysisFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    FaceAnalysisFragment faceAnalysisFragment = this.f$0;
                    switch (i3) {
                        case 0:
                            FaceAnalysisFragment.Companion companion2 = FaceAnalysisFragment.Companion;
                            faceAnalysisFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                            break;
                        default:
                            FaceAnalysisFragment.Companion companion3 = FaceAnalysisFragment.Companion;
                            try {
                                FragmentKt.findNavController(faceAnalysisFragment).navigate(R.id.navigateHelp);
                                break;
                            } catch (Exception e) {
                                Log.e("FaceAnalysisScreen", "Nav Graph Error", e);
                                faceAnalysisFragment.c$1().postNavigationError$workflow_release(new NavigationError(e, FaceAnalysisFragment.class, faceAnalysisFragment.hashCode(), NavigationAction$FaceAnalysis$NavigateHelp.INSTANCE));
                            }
                    }
                }
            });
            AppCompatImageView appCompatImageView3 = getBinding$workflow_release().k;
            String b$114 = b$1();
            if (b$114 == null || (str2 = workflow.get(b$114)) == null) {
                obj14 = null;
            } else {
                Json.Default r86 = Json.Default;
                r86.getClass();
                obj14 = r86.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings14 = (WorkflowSettings) obj14;
            if ((workflowSettings14 == null || (d10 = workflowSettings14.d) == null) && (d10 = MultipartBody.Companion.d(getArguments(), "manualButtonDrawableId")) == null) {
                companion.getClass();
                d10 = Companion.getDefaultWorkflowSettings(miSnapSettings).d;
            }
            if (d10 != null) {
                int intValue7 = d10.intValue();
                Context requireContext7 = requireContext();
                requireContext7.getClass();
                appCompatImageView3.setImageDrawable(MultipartBody.Companion.b(requireContext7, intValue7));
            }
            MiSnapView miSnapView = getBinding$workflow_release().m;
            String b$115 = b$1();
            if (b$115 == null || (str = workflow.get(b$115)) == null) {
                obj15 = null;
            } else {
                Json.Default r7 = Json.Default;
                r7.getClass();
                obj15 = r7.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings15 = (WorkflowSettings) obj15;
            if ((workflowSettings15 == null || (b5 = workflowSettings15.x) == null) && (b5 = MultipartBody.Companion.b(getArguments(), "misnapViewShowBoundingBox")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b5 = Boolean.FALSE;
            }
            miSnapView.setShowBoundingBox(b5.booleanValue());
            a$2(miSnapSettings, b$1(), c$1());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel c$1 = c$1();
            Context requireContext8 = requireContext();
            requireContext8.getClass();
            c$1.postError$workflow_release(requireContext8, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        final MiSnapWorkflowViewModel c$12 = c$1();
        ?? r22 = new Observer() { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda11
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj16) {
                int i3 = i2;
                FaceAnalysisFragment faceAnalysisFragment = this;
                MiSnapWorkflowViewModel miSnapWorkflowViewModel = c$12;
                switch (i3) {
                    case 0:
                        FaceAnalysisFragment.a(miSnapWorkflowViewModel, faceAnalysisFragment, (MiSnapController.ErrorResult) obj16);
                        break;
                    default:
                        FrameProducer.Event event = (FrameProducer.Event) obj16;
                        FaceAnalysisFragment.Companion companion2 = FaceAnalysisFragment.Companion;
                        miSnapWorkflowViewModel.getClass();
                        if (event != null) {
                            if ((event instanceof FrameProducer.Event.InitializationError) || (event instanceof FrameProducer.Event.TakePhotoError)) {
                                Context requireContext9 = faceAnalysisFragment.requireContext();
                                requireContext9.getClass();
                                miSnapWorkflowViewModel.postError$workflow_release(requireContext9, MiSnapWorkflowError.Camera.INSTANCE);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        getBinding$workflow_release().m.z.observe(getViewLifecycleOwner(), r22);
        this.s = r22;
        final MiSnapWorkflowViewModel c$13 = c$1();
        ?? r23 = new Observer() { // from class: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$$ExternalSyntheticLambda11
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj16) {
                int i3 = i;
                FaceAnalysisFragment faceAnalysisFragment = this;
                MiSnapWorkflowViewModel miSnapWorkflowViewModel = c$13;
                switch (i3) {
                    case 0:
                        FaceAnalysisFragment.a(miSnapWorkflowViewModel, faceAnalysisFragment, (MiSnapController.ErrorResult) obj16);
                        break;
                    default:
                        FrameProducer.Event event = (FrameProducer.Event) obj16;
                        FaceAnalysisFragment.Companion companion2 = FaceAnalysisFragment.Companion;
                        miSnapWorkflowViewModel.getClass();
                        if (event != null) {
                            if ((event instanceof FrameProducer.Event.InitializationError) || (event instanceof FrameProducer.Event.TakePhotoError)) {
                                Context requireContext9 = faceAnalysisFragment.requireContext();
                                requireContext9.getClass();
                                miSnapWorkflowViewModel.postError$workflow_release(requireContext9, MiSnapWorkflowError.Camera.INSTANCE);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        getBinding$workflow_release().m.y.observe(getViewLifecycleOwner(), r23);
        this.q = r23;
        MiSnapSettings miSnapSettings2 = (MiSnapSettings) c$1().f.getValue();
        if (miSnapSettings2 == null || q(miSnapSettings2, b$1()) == LowLightSensitivity.NONE) {
            return;
        }
        boolean booleanValue = j(miSnapSettings2, b$1()).booleanValue();
        Integer h$22 = h$2(miSnapSettings2, b$1());
        companion.getClass();
        boolean areEqual = Intrinsics.areEqual(h$22, Companion.getDefaultWorkflowSettings(null).a);
        if (booleanValue && areEqual && this.g) {
            a$3$2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        FaceAnalysisFragment$$ExternalSyntheticLambda1 faceAnalysisFragment$$ExternalSyntheticLambda1 = this.n;
        n nVar = this.d;
        bundle.putLong("timeoutKey", nVar.remainingTime(faceAnalysisFragment$$ExternalSyntheticLambda1));
        nVar.cancelAll();
        MiSnapFinalResult miSnapFinalResult = this.c;
        if (miSnapFinalResult != null) {
            c$1().h = miSnapFinalResult;
        }
        Integer num = this.f;
        if (num != null) {
            bundle.putInt("orientationKey", num.intValue());
        }
        bundle.putBoolean("adaptedBrightnessKey", this.g);
        bundle.putBoolean("loggedTries", this.i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean b2;
        int intValue;
        String str;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            if (bundle.containsKey("timeoutKey")) {
                long j = bundle.getLong("timeoutKey");
                if (j > 0) {
                    this.d.start(this.n, j);
                }
            }
            if (bundle.containsKey("orientationKey")) {
                this.f = Integer.valueOf(bundle.getInt("orientationKey"));
            }
            if (bundle.containsKey("loggedTries")) {
                this.i = bundle.getBoolean("loggedTries");
            }
            if (bundle.containsKey("adaptedBrightnessKey")) {
                this.g = bundle.getBoolean("adaptedBrightnessKey");
            }
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$1().f.getValue();
        Object obj = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MibiData.Uxp uxp = MibiData.a;
            MibiData.startSession(miSnapSettings, FaceAnalysisFragment.class.getName());
            this.j = MibiData.bindSession();
            String b$1 = b$1();
            if (b$1 != null && (str = workflow.get(b$1)) != null) {
                Json.Default r6 = Json.Default;
                r6.getClass();
                obj = r6.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.z) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                Companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b2 = Boolean.TRUE;
            }
            boolean booleanValue = b2.booleanValue();
            this.e = booleanValue;
            if (booleanValue) {
                try {
                    Result.Companion companion = Result.Companion;
                    FragmentKt.findNavController(this).addOnDestinationChangedListener(this.l);
                } catch (Throwable unused) {
                    Result.Companion companion2 = Result.Companion;
                }
                Integer forcedOrientation = Position.getForcedOrientation(workflow, miSnapSettings.a);
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.f = Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            obj = Unit.INSTANCE;
        }
        if (obj == null) {
            MiSnapWorkflowViewModel c$1 = c$1();
            Context requireContext = requireContext();
            requireContext.getClass();
            c$1.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        MaterialTextView materialTextView = (MaterialTextView) getBinding$workflow_release().l.c;
        float f2 = materialTextView.getContext().getResources().getConfiguration().fontScale;
        if (f2 <= 1.0f) {
            return;
        }
        com.miteksystems.misnap.workflow.a.b.a(materialTextView, f2);
    }

    public final LowLightSensitivity q(MiSnapSettings miSnapSettings, String str) {
        Object obj;
        LowLightSensitivity lowLightSensitivity;
        String str2;
        if (str == null || (str2 = miSnapSettings.workflow.get(str)) == null) {
            obj = null;
        } else {
            Json.Default r1 = Json.Default;
            r1.getClass();
            obj = r1.decodeFromString(str2, WorkflowSettings.Companion.serializer());
        }
        WorkflowSettings workflowSettings = (WorkflowSettings) obj;
        if (workflowSettings != null && (lowLightSensitivity = workflowSettings.B) != null) {
            return lowLightSensitivity;
        }
        Serializable a2 = MultipartBody.Companion.a(getArguments(), "lowLightSensitivity");
        LowLightSensitivity lowLightSensitivity2 = a2 instanceof LowLightSensitivity ? (LowLightSensitivity) a2 : null;
        if (lowLightSensitivity2 != null) {
            return lowLightSensitivity2;
        }
        Companion.getClass();
        Companion.getDefaultWorkflowSettings(miSnapSettings);
        return LowLightSensitivity.MEDIUM;
    }

    public final void startSession$workflow_release(MiSnapSettings miSnapSettings, String str, MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
        miSnapWorkflowViewModel.getClass();
        getBinding$workflow_release().m.z.observe(getViewLifecycleOwner(), new f(miSnapSettings, this, miSnapWorkflowViewModel, str));
        MiSnapView.startMiSnapSession$default(getBinding$workflow_release().m, miSnapSettings, getViewLifecycleOwner(), new AndroidPopup_androidKt$Popup$3$1(miSnapSettings, this, miSnapWorkflowViewModel, str, 9), 4);
    }

    @kotlinx.serialization.Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Boolean A;
        public final LowLightSensitivity B;
        public final Boolean C;
        public final Integer D;
        public final Boolean E;
        public final Integer a;
        public final Float b;
        public final Boolean c;
        public final Integer d;
        public final Integer e;
        public final Integer f;
        public final Integer g;
        public final Integer h;
        public final Integer i;
        public final Boolean j;
        public final Integer k;
        public final Boolean l;
        public final Integer m;
        public final Integer n;
        public final Integer o;
        public final Integer p;
        public final Integer q;
        public final Integer r;
        public final Integer s;
        public final Integer t;
        public final Integer u;
        public final Boolean v;
        public final String w;
        public final Boolean x;
        public final ReviewCondition y;
        public final Boolean z;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/FaceAnalysisFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/FaceAnalysisFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FaceAnalysisFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Integer num, Float f, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool2, Integer num8, Boolean bool3, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Boolean bool4, String str, Boolean bool5, ReviewCondition reviewCondition, Boolean bool6, Boolean bool7, LowLightSensitivity lowLightSensitivity, Boolean bool8, Integer num18, Boolean bool9) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = f;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = num3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = num4;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = num5;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = num6;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = num7;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = bool2;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = num8;
            }
            if ((i & 2048) == 0) {
                this.l = null;
            } else {
                this.l = bool3;
            }
            if ((i & 4096) == 0) {
                this.m = null;
            } else {
                this.m = num9;
            }
            if ((i & PKIFailureInfo.certRevoked) == 0) {
                this.n = null;
            } else {
                this.n = num10;
            }
            if ((i & 16384) == 0) {
                this.o = null;
            } else {
                this.o = num11;
            }
            if ((32768 & i) == 0) {
                this.p = null;
            } else {
                this.p = num12;
            }
            if ((65536 & i) == 0) {
                this.q = null;
            } else {
                this.q = num13;
            }
            if ((131072 & i) == 0) {
                this.r = null;
            } else {
                this.r = num14;
            }
            if ((262144 & i) == 0) {
                this.s = null;
            } else {
                this.s = num15;
            }
            if ((524288 & i) == 0) {
                this.t = null;
            } else {
                this.t = num16;
            }
            if ((1048576 & i) == 0) {
                this.u = null;
            } else {
                this.u = num17;
            }
            if ((2097152 & i) == 0) {
                this.v = null;
            } else {
                this.v = bool4;
            }
            if ((4194304 & i) == 0) {
                this.w = null;
            } else {
                this.w = str;
            }
            if ((8388608 & i) == 0) {
                this.x = null;
            } else {
                this.x = bool5;
            }
            if ((16777216 & i) == 0) {
                this.y = null;
            } else {
                this.y = reviewCondition;
            }
            if ((33554432 & i) == 0) {
                this.z = null;
            } else {
                this.z = bool6;
            }
            if ((67108864 & i) == 0) {
                this.A = null;
            } else {
                this.A = bool7;
            }
            if ((134217728 & i) == 0) {
                this.B = null;
            } else {
                this.B = lowLightSensitivity;
            }
            if ((268435456 & i) == 0) {
                this.C = null;
            } else {
                this.C = bool8;
            }
            if ((536870912 & i) == 0) {
                this.D = null;
            } else {
                this.D = num18;
            }
            if ((i & 1073741824) == 0) {
                this.E = null;
            } else {
                this.E = bool9;
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
            return Intrinsics.areEqual(this.a, workflowSettings.a) && Intrinsics.areEqual((Object) this.b, (Object) workflowSettings.b) && Intrinsics.areEqual(this.c, workflowSettings.c) && Intrinsics.areEqual(this.d, workflowSettings.d) && Intrinsics.areEqual(this.e, workflowSettings.e) && Intrinsics.areEqual(this.f, workflowSettings.f) && Intrinsics.areEqual(this.g, workflowSettings.g) && Intrinsics.areEqual(this.h, workflowSettings.h) && Intrinsics.areEqual(this.i, workflowSettings.i) && Intrinsics.areEqual(this.j, workflowSettings.j) && Intrinsics.areEqual(this.k, workflowSettings.k) && Intrinsics.areEqual(this.l, workflowSettings.l) && Intrinsics.areEqual(this.m, workflowSettings.m) && Intrinsics.areEqual(this.n, workflowSettings.n) && Intrinsics.areEqual(this.o, workflowSettings.o) && Intrinsics.areEqual(this.p, workflowSettings.p) && Intrinsics.areEqual(this.q, workflowSettings.q) && Intrinsics.areEqual(this.r, workflowSettings.r) && Intrinsics.areEqual(this.s, workflowSettings.s) && Intrinsics.areEqual(this.t, workflowSettings.t) && Intrinsics.areEqual(this.u, workflowSettings.u) && Intrinsics.areEqual(this.v, workflowSettings.v) && Intrinsics.areEqual(this.w, workflowSettings.w) && Intrinsics.areEqual(this.x, workflowSettings.x) && this.y == workflowSettings.y && Intrinsics.areEqual(this.z, workflowSettings.z) && Intrinsics.areEqual(this.A, workflowSettings.A) && this.B == workflowSettings.B && Intrinsics.areEqual(this.C, workflowSettings.C) && Intrinsics.areEqual(this.D, workflowSettings.D) && Intrinsics.areEqual(this.E, workflowSettings.E);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f = this.b;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Boolean bool = this.c;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.d;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.e;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f;
            int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.g;
            int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.h;
            int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.i;
            int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Boolean bool2 = this.j;
            int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num8 = this.k;
            int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Boolean bool3 = this.l;
            int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num9 = this.m;
            int hashCode13 = (hashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.n;
            int hashCode14 = (hashCode13 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Integer num11 = this.o;
            int hashCode15 = (hashCode14 + (num11 == null ? 0 : num11.hashCode())) * 31;
            Integer num12 = this.p;
            int hashCode16 = (hashCode15 + (num12 == null ? 0 : num12.hashCode())) * 31;
            Integer num13 = this.q;
            int hashCode17 = (hashCode16 + (num13 == null ? 0 : num13.hashCode())) * 31;
            Integer num14 = this.r;
            int hashCode18 = (hashCode17 + (num14 == null ? 0 : num14.hashCode())) * 31;
            Integer num15 = this.s;
            int hashCode19 = (hashCode18 + (num15 == null ? 0 : num15.hashCode())) * 31;
            Integer num16 = this.t;
            int hashCode20 = (hashCode19 + (num16 == null ? 0 : num16.hashCode())) * 31;
            Integer num17 = this.u;
            int hashCode21 = (hashCode20 + (num17 == null ? 0 : num17.hashCode())) * 31;
            Boolean bool4 = this.v;
            int hashCode22 = (hashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str = this.w;
            int hashCode23 = (hashCode22 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool5 = this.x;
            int hashCode24 = (hashCode23 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            ReviewCondition reviewCondition = this.y;
            int hashCode25 = (hashCode24 + (reviewCondition == null ? 0 : reviewCondition.hashCode())) * 31;
            Boolean bool6 = this.z;
            int hashCode26 = (hashCode25 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.A;
            int hashCode27 = (hashCode26 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            LowLightSensitivity lowLightSensitivity = this.B;
            int hashCode28 = (hashCode27 + (lowLightSensitivity == null ? 0 : lowLightSensitivity.hashCode())) * 31;
            Boolean bool8 = this.C;
            int hashCode29 = (hashCode28 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Integer num18 = this.D;
            int hashCode30 = (hashCode29 + (num18 == null ? 0 : num18.hashCode())) * 31;
            Boolean bool9 = this.E;
            return hashCode30 + (bool9 != null ? bool9.hashCode() : 0);
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }

        public WorkflowSettings(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
            Float valueOf = Float.valueOf(0.7f);
            Boolean bool2 = Boolean.TRUE;
            Boolean bool3 = Boolean.FALSE;
            this.a = num;
            this.b = valueOf;
            this.c = bool2;
            this.d = num2;
            this.e = 20000;
            this.f = num3;
            this.g = num4;
            this.h = 3000;
            this.i = num5;
            this.j = bool2;
            this.k = 0;
            this.l = bool;
            this.m = num6;
            this.n = num7;
            this.o = 0;
            this.p = num8;
            this.q = num9;
            this.r = num10;
            this.s = num11;
            this.t = num12;
            this.u = null;
            this.v = bool2;
            this.w = null;
            this.x = bool3;
            this.y = ReviewCondition.WARNINGS;
            this.z = bool2;
            this.A = bool2;
            this.B = LowLightSensitivity.MEDIUM;
            this.C = bool3;
            this.D = num13;
            this.E = bool2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r5.isEmpty() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r5.analysis.face.a != com.miteksystems.misnap.core.MiSnapSettings.Analysis.Face.Trigger.MANUAL) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a$2(MiSnapWorkflowViewModel miSnapWorkflowViewModel, MiSnapSettings miSnapSettings, String str, MiSnapFinalResult miSnapFinalResult) {
        Object obj;
        ReviewCondition reviewCondition;
        String str2;
        this.c = null;
        miSnapWorkflowViewModel.h = null;
        if (str == null || (str2 = miSnapSettings.workflow.get(str)) == null) {
            obj = null;
        } else {
            Json.Default r1 = Json.Default;
            r1.getClass();
            obj = r1.decodeFromString(str2, WorkflowSettings.Companion.serializer());
        }
        WorkflowSettings workflowSettings = (WorkflowSettings) obj;
        if (workflowSettings == null || (reviewCondition = workflowSettings.y) == null) {
            Serializable a2 = MultipartBody.Companion.a(getArguments(), "reviewCondition");
            reviewCondition = a2 instanceof ReviewCondition ? (ReviewCondition) a2 : null;
            if (reviewCondition == null) {
                Companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                reviewCondition = ReviewCondition.WARNINGS;
            }
        }
        int i = a.a[reviewCondition.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    MiSnapFinalResult.FaceSession faceSession = miSnapFinalResult instanceof MiSnapFinalResult.FaceSession ? (MiSnapFinalResult.FaceSession) miSnapFinalResult : null;
                    if (faceSession == null || (r5 = faceSession.d) == null) {
                        List list = EmptyList.INSTANCE;
                    }
                } else if (i != 4) {
                    return;
                }
                miSnapWorkflowViewModel.postResults$workflow_release(miSnapFinalResult);
                return;
            }
        }
        try {
            miSnapWorkflowViewModel.i = miSnapFinalResult;
            FragmentKt.findNavController(this).navigate(R.id.navigateReview);
        } catch (Exception e) {
            Log.e("FaceAnalysisScreen", "Nav Graph Error", e);
            miSnapWorkflowViewModel.postResults$workflow_release(miSnapFinalResult);
        }
    }

    public final void a$2(MiSnapSettings miSnapSettings, String str, MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
        Context requireContext = requireContext();
        requireContext.getClass();
        if (AndroidPlatform.Companion.hasPermission(requireContext, "android.permission.CAMERA")) {
            startSession$workflow_release(miSnapSettings, str, miSnapWorkflowViewModel);
            return;
        }
        if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(requireContext());
            materialAlertDialogBuilder.setTitle(R.string.misnapWorkflowCameraPermissionFaceRationaleTitle);
            materialAlertDialogBuilder.setMessage(R.string.misnapWorkflowCameraPermissionFaceRationaleMessage);
            materialAlertDialogBuilder.P.mOnDismissListener = new HelpFragment$$ExternalSyntheticLambda4(this, 3);
            materialAlertDialogBuilder.setPositiveButton(R.string.misnapWorkflowCameraPermissionFaceRationaleButtonConfirmLabel, (DialogInterface.OnClickListener) null).show();
            return;
        }
        this.v.launch("android.permission.CAMERA");
    }
}

package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda5;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.WindowCompat$Api35Impl;
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
import app.cash.redwood.widget.RedwoodLayoutKt$toAndroid$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer;
import com.miteksystems.misnap.barcode.MiSnapBarcodeDetector;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.classifier.MiSnapDocumentClassifier;
import com.miteksystems.misnap.controller.AnalysisSettings;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.DevicePerformanceUtil;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.detector.MiSnapDocumentDetector;
import com.miteksystems.misnap.document.DocumentAnalysisSettings;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$Result$Failure;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.d;
import com.miteksystems.misnap.workflow.a.o;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.util.DrawableUtil$a;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.miteksystems.misnap.workflow.view.GuideView;
import com.miteksystems.misnap.workflow.view.HintView;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.miteksystems.misnap.workflow.view.RecordingIconView;
import com.miteksystems.misnap.workflow.view.SuccessView;
import com.miteksystems.misnap.workflow.view.TorchView;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.Json;
import net.idrnd.face.iad.capture.internal.s;
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.MultipartBody;
import okhttp3.internal.platform.AndroidPlatform;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/DocumentAnalysisFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "ReviewCondition", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class DocumentAnalysisFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public MiSnapController.FrameResult b;
    public MiSnapFinalResult c;
    public final n d;
    public boolean e;
    public Integer f;
    public boolean g;
    public boolean h;
    public AlertDialog i;
    public MibiData.Session j;
    public final Lazy k;
    public final HelpFragment$$ExternalSyntheticLambda2 l;
    public final Lazy m;
    public final DocumentAnalysisFragment$$ExternalSyntheticLambda1 n;
    public final DocumentAnalysisFragment$$ExternalSyntheticLambda1 o;
    public FaceAnalysisFragment$$ExternalSyntheticLambda12 p;
    public DocumentAnalysisFragment$$ExternalSyntheticLambda7 q;
    public DocumentAnalysisFragment$$ExternalSyntheticLambda7 r;
    public DocumentAnalysisFragment$$ExternalSyntheticLambda7 s;
    public FaceAnalysisFragment$$ExternalSyntheticLambda7 t;
    public final LiveDataObservable$$ExternalSyntheticLambda5 u;
    public final ActivityResultLauncher v;
    public final /* synthetic */ RedwoodLayoutKt$toAndroid$1 w;
    public static final /* synthetic */ KProperty[] x = {Reflection.factory.property1(new PropertyReference1Impl(DocumentAnalysisFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentDocumentAnalysisBinding;", 0))};
    public static final Companion Companion = new Companion();

    public final class Companion {

        public abstract /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[MiSnapSettings.UseCase.values().length];
                try {
                    iArr[3] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[4] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[2] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[0] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        public static WorkflowSettings getDefaultWorkflowSettings(MiSnapSettings miSnapSettings) {
            MiSnapSettings.UseCase useCase = miSnapSettings != null ? miSnapSettings.a : null;
            int i = useCase == null ? -1 : a.a[useCase.ordinal()];
            Integer valueOf = Integer.valueOf(i != 1 ? i != 2 ? (i == 3 || i == 4) ? R.drawable.misnap_guide_id : i != 5 ? 0 : R.drawable.misnap_guide_passport : R.drawable.misnap_guide_check_back : R.drawable.misnap_guide_check_front);
            MiSnapSettings.UseCase useCase2 = miSnapSettings != null ? miSnapSettings.a : null;
            int i2 = useCase2 == null ? -1 : a.a[useCase2.ordinal()];
            Float valueOf2 = Float.valueOf((i2 == 1 || i2 == 2) ? 0.8f : (i2 == 3 || i2 == 4) ? 0.7f : i2 != 5 ? 1.0f : 0.75f);
            Integer valueOf3 = Integer.valueOf(R.drawable.misnap_button_camera_shutter_icon);
            Boolean valueOf4 = Boolean.valueOf(miSnapSettings != null ? !AnalysisSettings.isAutoTrigger(miSnapSettings.analysis, miSnapSettings.a) : false);
            Integer valueOf5 = Integer.valueOf(R.drawable.misnap_torch_on_icon);
            Integer valueOf6 = Integer.valueOf(R.drawable.misnap_torch_off_icon);
            Integer valueOf7 = Integer.valueOf(R.anim.misnap_hint_animation);
            Integer valueOf8 = Integer.valueOf(R.drawable.misnap_recording_icon);
            Integer valueOf9 = Integer.valueOf(R.anim.misnap_recording_animation);
            Integer valueOf10 = Integer.valueOf(R.drawable.misnap_button_help_icon);
            Integer valueOf11 = Integer.valueOf(R.drawable.misnap_success_icon);
            Integer valueOf12 = Integer.valueOf(R.anim.misnap_success_animation);
            MiSnapSettings.UseCase useCase3 = miSnapSettings != null ? miSnapSettings.a : null;
            int i3 = useCase3 != null ? a.a[useCase3.ordinal()] : -1;
            return new WorkflowSettings(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, Integer.valueOf(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? R.string.misnapWorkflowDocumentAnalysisFragmentGenericDocumentLabel : R.string.misnapWorkflowDocumentAnalysisFragmentPassportDocumentLabel : R.string.misnapWorkflowDocumentAnalysisFragmentIdBackDocumentLabel : R.string.misnapWorkflowDocumentAnalysisFragmentIdFrontDocumentLabel : R.string.misnapWorkflowDocumentAnalysisFragmentCheckBackDocumentLabel : R.string.misnapWorkflowDocumentAnalysisFragmentCheckFrontDocumentLabel), Integer.valueOf(R.drawable.misnap_button_cancel_session_icon));
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
        public static final /* synthetic */ int[] b;

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
            int[] iArr2 = new int[MiSnapSettings.UseCase.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
        }
    }

    public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public static final b a = new b(1, d.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentDocumentAnalysisBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.buttonsPanel;
            if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.buttonsPanel)) != null) {
                i = R.id.cancelButton;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.cancelButton);
                if (appCompatImageView != null) {
                    i = R.id.documentLabel;
                    MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.documentLabel);
                    if (materialTextView != null) {
                        i = R.id.guideView;
                        GuideView guideView = (GuideView) ViewBindings.findChildViewById(view, R.id.guideView);
                        if (guideView != null) {
                            i = R.id.guidelineEndManualTriggerProgressIndicator;
                            if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineEndManualTriggerProgressIndicator)) != null) {
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
                                                                    return new d((ConstraintLayout) view, appCompatImageView, materialTextView, guideView, appCompatImageView2, hintView, appCompatImageView3, a2, miSnapView, recordingIconView, successView, torchView);
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
        public final /* synthetic */ DocumentAnalysisFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(DocumentAnalysisFragment documentAnalysisFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = documentAnalysisFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            DocumentAnalysisFragment documentAnalysisFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(documentAnalysisFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = documentAnalysisFragment.requireActivity();
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

    public final class g implements Observer {
        public final /* synthetic */ MiSnapSettings b;
        public final /* synthetic */ MiSnapWorkflowViewModel c;
        public final /* synthetic */ String d;

        public g(MiSnapSettings miSnapSettings, MiSnapWorkflowViewModel miSnapWorkflowViewModel, String str) {
            this.b = miSnapSettings;
            this.c = miSnapWorkflowViewModel;
            this.d = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0095  */
        @Override // androidx.lifecycle.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onChanged(Object obj) {
            boolean z;
            MiSnapSettings.UseCase useCase;
            MiSnapSettings.Analysis.Document.Trigger trigger;
            DocumentAnalysisFragment$$ExternalSyntheticLambda7 documentAnalysisFragment$$ExternalSyntheticLambda7;
            String str;
            Object obj2;
            WorkflowSettings workflowSettings;
            Integer d;
            AccessibilityManager accessibilityManager;
            int intValue;
            String str2;
            FrameProducer.Event event = (FrameProducer.Event) obj;
            if (event != null) {
                MiSnapSettings miSnapSettings = this.b;
                MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
                boolean z2 = event instanceof FrameProducer.Event.CameraInitialized;
                DocumentAnalysisFragment documentAnalysisFragment = DocumentAnalysisFragment.this;
                if (!z2) {
                    if (event instanceof FrameProducer.Event.CameraReady) {
                        documentAnalysisFragment.getBinding$workflow_release().l.z.removeObserver(this);
                        documentAnalysisFragment.getBinding$workflow_release().e.setVisibility(0);
                        return;
                    }
                    return;
                }
                MiSnapCameraInfo cameraInfo = ((FrameProducer.Event.CameraInitialized) event).getCameraInfo();
                if (cameraInfo.c) {
                    documentAnalysisFragment.getBinding$workflow_release().o.setVisibility(0);
                }
                d binding$workflow_release = documentAnalysisFragment.getBinding$workflow_release();
                DocumentAnalysisFragment$$ExternalSyntheticLambda1 documentAnalysisFragment$$ExternalSyntheticLambda1 = documentAnalysisFragment.n;
                DocumentAnalysisFragment$$ExternalSyntheticLambda1 documentAnalysisFragment$$ExternalSyntheticLambda12 = documentAnalysisFragment.o;
                n nVar = documentAnalysisFragment.d;
                binding$workflow_release.h.setVisibility(0);
                boolean z3 = cameraInfo.a;
                MiSnapSettings.Analysis.Document.Trigger trigger2 = MiSnapSettings.Analysis.Document.Trigger.MANUAL;
                MiSnapSettings.Analysis.Document.Trigger trigger3 = MiSnapSettings.Analysis.Document.Trigger.AUTO;
                if (z3) {
                    MiSnapSettings.Analysis.Document document = analysis.document;
                    if (document.e != trigger2) {
                        document.e = trigger3;
                        z = false;
                        MiSnapWorkflowViewModel miSnapWorkflowViewModel = this.c;
                        miSnapWorkflowViewModel.updateState$workflow_release(miSnapSettings);
                        useCase = miSnapSettings.a;
                        if ((!Intrinsics.areEqual(MibiData.i, g.class.getName()) || Intrinsics.areEqual(MibiData.i, MiSnapWorkflowViewModel.class.getName())) && !documentAnalysisFragment.g) {
                            trigger = analysis.document.e;
                            MibiData.Session session = documentAnalysisFragment.j;
                            if (trigger != trigger3) {
                                session.getMetaData().b++;
                            } else {
                                session.getMetaData().c++;
                            }
                            documentAnalysisFragment.g = true;
                        }
                        documentAnalysisFragment$$ExternalSyntheticLambda7 = documentAnalysisFragment.r;
                        if (documentAnalysisFragment$$ExternalSyntheticLambda7 != null) {
                            documentAnalysisFragment.getBinding$workflow_release().l.w.removeObserver(documentAnalysisFragment$$ExternalSyntheticLambda7);
                        }
                        if (!AnalysisSettings.isAutoTrigger(analysis, useCase) || DocumentAnalysisSettings.shouldEnableEnhancedManual(analysis.document)) {
                            DocumentAnalysisFragment$$ExternalSyntheticLambda7 documentAnalysisFragment$$ExternalSyntheticLambda72 = new DocumentAnalysisFragment$$ExternalSyntheticLambda7(miSnapWorkflowViewModel, documentAnalysisFragment, 0);
                            documentAnalysisFragment.getBinding$workflow_release().l.w.observe(documentAnalysisFragment.getViewLifecycleOwner(), documentAnalysisFragment$$ExternalSyntheticLambda72);
                            documentAnalysisFragment.r = documentAnalysisFragment$$ExternalSyntheticLambda72;
                        }
                        if (!nVar.isRunning(documentAnalysisFragment$$ExternalSyntheticLambda1) && AnalysisSettings.isAutoTrigger(analysis, useCase)) {
                            str = this.d;
                            if (str != null || (str2 = miSnapSettings.workflow.get(str)) == null) {
                                obj2 = null;
                            } else {
                                Json.Default r2 = Json.Default;
                                r2.getClass();
                                obj2 = r2.decodeFromString(str2, WorkflowSettings.Companion.serializer());
                            }
                            workflowSettings = (WorkflowSettings) obj2;
                            if ((workflowSettings != null || (d = workflowSettings.g) == null) && (d = MultipartBody.Companion.d(documentAnalysisFragment.getArguments(), "timeoutDuration")) == null) {
                                FragmentActivity requireActivity = documentAnalysisFragment.requireActivity();
                                requireActivity.getClass();
                                Object systemService = requireActivity.getSystemService("accessibility");
                                accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                                if (accessibilityManager == null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                                    d = 120000;
                                } else {
                                    DocumentAnalysisFragment.Companion.getClass();
                                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                                    d = 20000;
                                }
                            }
                            intValue = d.intValue();
                            if (intValue > 0) {
                                nVar.start(documentAnalysisFragment$$ExternalSyntheticLambda1, intValue);
                            }
                        }
                        if (!z) {
                            documentAnalysisFragment.a$1(miSnapSettings);
                        }
                        documentAnalysisFragment.getBinding$workflow_release().i.clearText();
                    }
                }
                if (analysis.document.e != trigger3 || nVar.isRunning(documentAnalysisFragment$$ExternalSyntheticLambda12)) {
                    z = false;
                } else {
                    nVar.start(documentAnalysisFragment$$ExternalSyntheticLambda12, 2000L);
                    z = true;
                }
                analysis.document.e = trigger2;
                MiSnapWorkflowViewModel miSnapWorkflowViewModel2 = this.c;
                miSnapWorkflowViewModel2.updateState$workflow_release(miSnapSettings);
                useCase = miSnapSettings.a;
                if (!Intrinsics.areEqual(MibiData.i, g.class.getName())) {
                }
                trigger = analysis.document.e;
                MibiData.Session session2 = documentAnalysisFragment.j;
                if (trigger != trigger3) {
                }
                documentAnalysisFragment.g = true;
                documentAnalysisFragment$$ExternalSyntheticLambda7 = documentAnalysisFragment.r;
                if (documentAnalysisFragment$$ExternalSyntheticLambda7 != null) {
                }
                if (!AnalysisSettings.isAutoTrigger(analysis, useCase)) {
                }
                DocumentAnalysisFragment$$ExternalSyntheticLambda7 documentAnalysisFragment$$ExternalSyntheticLambda722 = new DocumentAnalysisFragment$$ExternalSyntheticLambda7(miSnapWorkflowViewModel2, documentAnalysisFragment, 0);
                documentAnalysisFragment.getBinding$workflow_release().l.w.observe(documentAnalysisFragment.getViewLifecycleOwner(), documentAnalysisFragment$$ExternalSyntheticLambda722);
                documentAnalysisFragment.r = documentAnalysisFragment$$ExternalSyntheticLambda722;
                if (!nVar.isRunning(documentAnalysisFragment$$ExternalSyntheticLambda1)) {
                    str = this.d;
                    if (str != null) {
                    }
                    obj2 = null;
                    workflowSettings = (WorkflowSettings) obj2;
                    if (workflowSettings != null) {
                    }
                    FragmentActivity requireActivity2 = documentAnalysisFragment.requireActivity();
                    requireActivity2.getClass();
                    Object systemService2 = requireActivity2.getSystemService("accessibility");
                    if (systemService2 instanceof AccessibilityManager) {
                    }
                    if (accessibilityManager == null) {
                    }
                    DocumentAnalysisFragment.Companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    d = 20000;
                    intValue = d.intValue();
                    if (intValue > 0) {
                    }
                }
                if (!z) {
                }
                documentAnalysisFragment.getBinding$workflow_release().i.clearText();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment$$ExternalSyntheticLambda1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment$$ExternalSyntheticLambda1] */
    public DocumentAnalysisFragment() {
        super(R.layout.misnap_fragment_document_analysis);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, b.a);
        this.d = new n();
        final int i = 1;
        this.e = true;
        this.j = MibiData.bindSession();
        final int i2 = 0;
        this.k = LazyKt.lazy(new c(this, i2));
        this.l = new HelpFragment$$ExternalSyntheticLambda2(this, 2);
        this.m = LazyKt.lazy(new c(this, i));
        this.n = new Runnable(this) { // from class: com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ DocumentAnalysisFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object failure;
                Unit unit;
                int i3 = i2;
                Unit unit2 = null;
                MiSnapSettings.Analysis.Document.Trigger trigger = MiSnapSettings.Analysis.Document.Trigger.MANUAL;
                DocumentAnalysisFragment documentAnalysisFragment = this.f$0;
                switch (i3) {
                    case 0:
                        DocumentAnalysisFragment.Companion companion = DocumentAnalysisFragment.Companion;
                        try {
                            documentAnalysisFragment.j.addUxpEvent("SDCFO", new String[0]);
                            try {
                                Result.Companion companion2 = Result.Companion;
                                failure = FragmentKt.findNavController(documentAnalysisFragment);
                            } catch (Throwable th) {
                                Result.Companion companion3 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                                documentAnalysisFragment.b$1().postNavigationError$workflow_release(new NavigationError(new Exception(m4120exceptionOrNullimpl), DocumentAnalysisFragment.class, documentAnalysisFragment.hashCode(), NavigationAction$DocumentAnalysis$NavigateHelp.INSTANCE$1));
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                FragmentKt.findNavController(documentAnalysisFragment).navigate(R.id.navigateFailover);
                                break;
                            }
                        } catch (Exception unused) {
                            MiSnapSettings miSnapSettings = (MiSnapSettings) documentAnalysisFragment.b$1().f.getValue();
                            if (miSnapSettings != null) {
                                miSnapSettings.analysis.document.e = trigger;
                                documentAnalysisFragment.b$1().updateState$workflow_release(miSnapSettings);
                                documentAnalysisFragment.a$1(miSnapSettings);
                                if (Intrinsics.areEqual(MibiData.i, DocumentAnalysisFragment.class.getName()) || Intrinsics.areEqual(MibiData.i, MiSnapWorkflowViewModel.class.getName())) {
                                    documentAnalysisFragment.j.getMetaData().c++;
                                }
                                documentAnalysisFragment.a$1(miSnapSettings, documentAnalysisFragment.a$2(), documentAnalysisFragment.b$1());
                                unit2 = Unit.INSTANCE;
                            }
                            if (unit2 == null) {
                                MiSnapWorkflowViewModel b$1 = documentAnalysisFragment.b$1();
                                Context requireContext = documentAnalysisFragment.requireContext();
                                requireContext.getClass();
                                b$1.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
                                return;
                            }
                            return;
                        }
                        break;
                    default:
                        DocumentAnalysisFragment.Companion companion4 = DocumentAnalysisFragment.Companion;
                        MiSnapWorkflowViewModel b$12 = documentAnalysisFragment.b$1();
                        DocumentAnalysisFragment$$ExternalSyntheticLambda1 documentAnalysisFragment$$ExternalSyntheticLambda1 = documentAnalysisFragment.n;
                        n nVar = documentAnalysisFragment.d;
                        MiSnapSettings miSnapSettings2 = (MiSnapSettings) b$12.f.getValue();
                        if (miSnapSettings2 != null) {
                            miSnapSettings2.analysis.document.e = trigger;
                            documentAnalysisFragment.b$1().updateState$workflow_release(miSnapSettings2);
                            documentAnalysisFragment.a$1(miSnapSettings2);
                            if (nVar.isRunning(documentAnalysisFragment$$ExternalSyntheticLambda1)) {
                                nVar.cancel(documentAnalysisFragment$$ExternalSyntheticLambda1);
                            }
                            documentAnalysisFragment.a$1(miSnapSettings2, documentAnalysisFragment.a$2(), documentAnalysisFragment.b$1());
                            unit2 = Unit.INSTANCE;
                        }
                        if (unit2 == null) {
                            MiSnapWorkflowViewModel b$13 = documentAnalysisFragment.b$1();
                            Context requireContext2 = documentAnalysisFragment.requireContext();
                            requireContext2.getClass();
                            b$13.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
                            break;
                        }
                        break;
                }
            }
        };
        this.o = new Runnable(this) { // from class: com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ DocumentAnalysisFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object failure;
                Unit unit;
                int i3 = i;
                Unit unit2 = null;
                MiSnapSettings.Analysis.Document.Trigger trigger = MiSnapSettings.Analysis.Document.Trigger.MANUAL;
                DocumentAnalysisFragment documentAnalysisFragment = this.f$0;
                switch (i3) {
                    case 0:
                        DocumentAnalysisFragment.Companion companion = DocumentAnalysisFragment.Companion;
                        try {
                            documentAnalysisFragment.j.addUxpEvent("SDCFO", new String[0]);
                            try {
                                Result.Companion companion2 = Result.Companion;
                                failure = FragmentKt.findNavController(documentAnalysisFragment);
                            } catch (Throwable th) {
                                Result.Companion companion3 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                                documentAnalysisFragment.b$1().postNavigationError$workflow_release(new NavigationError(new Exception(m4120exceptionOrNullimpl), DocumentAnalysisFragment.class, documentAnalysisFragment.hashCode(), NavigationAction$DocumentAnalysis$NavigateHelp.INSTANCE$1));
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            if (unit == null) {
                                FragmentKt.findNavController(documentAnalysisFragment).navigate(R.id.navigateFailover);
                                break;
                            }
                        } catch (Exception unused) {
                            MiSnapSettings miSnapSettings = (MiSnapSettings) documentAnalysisFragment.b$1().f.getValue();
                            if (miSnapSettings != null) {
                                miSnapSettings.analysis.document.e = trigger;
                                documentAnalysisFragment.b$1().updateState$workflow_release(miSnapSettings);
                                documentAnalysisFragment.a$1(miSnapSettings);
                                if (Intrinsics.areEqual(MibiData.i, DocumentAnalysisFragment.class.getName()) || Intrinsics.areEqual(MibiData.i, MiSnapWorkflowViewModel.class.getName())) {
                                    documentAnalysisFragment.j.getMetaData().c++;
                                }
                                documentAnalysisFragment.a$1(miSnapSettings, documentAnalysisFragment.a$2(), documentAnalysisFragment.b$1());
                                unit2 = Unit.INSTANCE;
                            }
                            if (unit2 == null) {
                                MiSnapWorkflowViewModel b$1 = documentAnalysisFragment.b$1();
                                Context requireContext = documentAnalysisFragment.requireContext();
                                requireContext.getClass();
                                b$1.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
                                return;
                            }
                            return;
                        }
                        break;
                    default:
                        DocumentAnalysisFragment.Companion companion4 = DocumentAnalysisFragment.Companion;
                        MiSnapWorkflowViewModel b$12 = documentAnalysisFragment.b$1();
                        DocumentAnalysisFragment$$ExternalSyntheticLambda1 documentAnalysisFragment$$ExternalSyntheticLambda1 = documentAnalysisFragment.n;
                        n nVar = documentAnalysisFragment.d;
                        MiSnapSettings miSnapSettings2 = (MiSnapSettings) b$12.f.getValue();
                        if (miSnapSettings2 != null) {
                            miSnapSettings2.analysis.document.e = trigger;
                            documentAnalysisFragment.b$1().updateState$workflow_release(miSnapSettings2);
                            documentAnalysisFragment.a$1(miSnapSettings2);
                            if (nVar.isRunning(documentAnalysisFragment$$ExternalSyntheticLambda1)) {
                                nVar.cancel(documentAnalysisFragment$$ExternalSyntheticLambda1);
                            }
                            documentAnalysisFragment.a$1(miSnapSettings2, documentAnalysisFragment.a$2(), documentAnalysisFragment.b$1());
                            unit2 = Unit.INSTANCE;
                        }
                        if (unit2 == null) {
                            MiSnapWorkflowViewModel b$13 = documentAnalysisFragment.b$1();
                            Context requireContext2 = documentAnalysisFragment.requireContext();
                            requireContext2.getClass();
                            b$13.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
                            break;
                        }
                        break;
                }
            }
        };
        this.u = new LiveDataObservable$$ExternalSyntheticLambda5(this, 6);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(this, 2));
        registerForActivityResult.getClass();
        this.v = registerForActivityResult;
        this.w = new RedwoodLayoutKt$toAndroid$1(this, 3);
    }

    public static final void a(MiSnapWorkflowViewModel miSnapWorkflowViewModel, DocumentAnalysisFragment documentAnalysisFragment, MiSnapController.ErrorResult errorResult) {
        miSnapWorkflowViewModel.getClass();
        if (errorResult != null) {
            if (errorResult instanceof MiSnapController.ErrorResult.DocumentAnalysis) {
                MiSnapDocumentAnalyzer$Result$Failure miSnapDocumentAnalyzer$Result$Failure = ((MiSnapController.ErrorResult.DocumentAnalysis) errorResult).a;
                if (miSnapDocumentAnalyzer$Result$Failure instanceof MiSnapDocumentAnalyzer$Result$Failure.License) {
                    Context requireContext = documentAnalysisFragment.requireContext();
                    requireContext.getClass();
                    miSnapWorkflowViewModel.postError$workflow_release(requireContext, new MiSnapWorkflowError.License(((MiSnapDocumentAnalyzer$Result$Failure.License) miSnapDocumentAnalyzer$Result$Failure).a));
                    return;
                }
            }
            if (errorResult instanceof MiSnapController.ErrorResult.DocumentDetection) {
                MiSnapController.ErrorResult.DocumentDetection documentDetection = (MiSnapController.ErrorResult.DocumentDetection) errorResult;
                if (documentDetection.a instanceof MiSnapDocumentDetector.Result.Failure.License) {
                    Context requireContext2 = documentAnalysisFragment.requireContext();
                    requireContext2.getClass();
                    MiSnapDocumentDetector.Result.Failure.License license = documentDetection.a;
                    license.getClass();
                    miSnapWorkflowViewModel.postError$workflow_release(requireContext2, new MiSnapWorkflowError.License(license.getReason()));
                    return;
                }
            }
            if (errorResult instanceof MiSnapController.ErrorResult.BarcodeAnalysis) {
                MiSnapController.ErrorResult.BarcodeAnalysis barcodeAnalysis = (MiSnapController.ErrorResult.BarcodeAnalysis) errorResult;
                if (barcodeAnalysis.a instanceof MiSnapBarcodeAnalyzer.Result.Failure.License) {
                    Context requireContext3 = documentAnalysisFragment.requireContext();
                    requireContext3.getClass();
                    MiSnapBarcodeAnalyzer.Result.Failure.License license2 = barcodeAnalysis.a;
                    license2.getClass();
                    miSnapWorkflowViewModel.postError$workflow_release(requireContext3, new MiSnapWorkflowError.License(license2.getReason()));
                    return;
                }
            }
            if (errorResult instanceof MiSnapController.ErrorResult.BarcodeDetection) {
                MiSnapController.ErrorResult.BarcodeDetection barcodeDetection = (MiSnapController.ErrorResult.BarcodeDetection) errorResult;
                if (barcodeDetection.a instanceof MiSnapBarcodeDetector.Result.Failure.License) {
                    Context requireContext4 = documentAnalysisFragment.requireContext();
                    requireContext4.getClass();
                    MiSnapBarcodeDetector.Result.Failure.License license3 = barcodeDetection.a;
                    license3.getClass();
                    miSnapWorkflowViewModel.postError$workflow_release(requireContext4, new MiSnapWorkflowError.License(license3.getReason()));
                    return;
                }
            }
            if (errorResult instanceof MiSnapController.ErrorResult.DocumentClassification) {
                MiSnapController.ErrorResult.DocumentClassification documentClassification = (MiSnapController.ErrorResult.DocumentClassification) errorResult;
                if (documentClassification.a instanceof MiSnapDocumentClassifier.Result.Failure.License) {
                    Context requireContext5 = documentAnalysisFragment.requireContext();
                    requireContext5.getClass();
                    MiSnapDocumentClassifier.Result.Failure.License license4 = documentClassification.a;
                    license4.getClass();
                    miSnapWorkflowViewModel.postError$workflow_release(requireContext5, new MiSnapWorkflowError.License(license4.getReason()));
                    return;
                }
            }
            Context requireContext6 = documentAnalysisFragment.requireContext();
            requireContext6.getClass();
            miSnapWorkflowViewModel.postError$workflow_release(requireContext6, MiSnapWorkflowError.Analysis.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a$1(MiSnapFinalResult miSnapFinalResult) {
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
        this.h = true;
        this.c = miSnapFinalResult;
        this.d.cancelAll();
        ((ConstraintLayout) getBinding$workflow_release().k.a).setVisibility(4);
        DocumentAnalysisFragment$$ExternalSyntheticLambda7 documentAnalysisFragment$$ExternalSyntheticLambda7 = this.r;
        if (documentAnalysisFragment$$ExternalSyntheticLambda7 != null) {
            getBinding$workflow_release().l.w.removeObserver(documentAnalysisFragment$$ExternalSyntheticLambda7);
        }
        HintView hintView = getBinding$workflow_release().i;
        String str6 = null;
        hintView.setAnimation(null);
        int i = 8;
        hintView.setVisibility(8);
        hintView.clearText();
        MiSnapSettings miSnapSettings = (MiSnapSettings) b$1().f.getValue();
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            SuccessView successView = getBinding$workflow_release().n;
            String a$2 = a$2();
            if (a$2 == null || (str5 = workflow.get(a$2)) == null) {
                obj = null;
            } else {
                Json.Default r6 = Json.Default;
                r6.getClass();
                obj = r6.decodeFromString(str5, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            Companion companion = Companion;
            if ((workflowSettings == null || (d = workflowSettings.q) == null) && (d = MultipartBody.Companion.d(getArguments(), "successViewMessageDrawableId")) == null) {
                companion.getClass();
                d = Companion.getDefaultWorkflowSettings(miSnapSettings).q;
            }
            if (d != null) {
                successView.setDrawableId(d.intValue());
            }
            String a$22 = a$2();
            if (a$22 == null || (str4 = workflow.get(a$22)) == null) {
                obj2 = null;
            } else {
                Json.Default r7 = Json.Default;
                r7.getClass();
                obj2 = r7.decodeFromString(str4, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (d2 = workflowSettings2.s) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "successViewBackgroundDrawableId")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                d2 = null;
            }
            if (d2 == null) {
                MiSnapFinalResult.DocumentSession documentSession = miSnapFinalResult instanceof MiSnapFinalResult.DocumentSession ? (MiSnapFinalResult.DocumentSession) miSnapFinalResult : null;
                if (documentSession == null || (bArr = documentSession.b) == null) {
                    bArr = new byte[0];
                }
                b2 = new BitmapDrawable(successView.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } else {
                Context requireContext = requireContext();
                requireContext.getClass();
                b2 = MultipartBody.Companion.b(requireContext, d2.intValue());
            }
            successView.setBackground(b2);
            String a$23 = a$2();
            if (a$23 == null || (str3 = workflow.get(a$23)) == null) {
                obj3 = null;
            } else {
                Json.Default r72 = Json.Default;
                r72.getClass();
                obj3 = r72.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings3 = (WorkflowSettings) obj3;
            if ((workflowSettings3 == null || (d3 = workflowSettings3.r) == null) && (d3 = MultipartBody.Companion.d(getArguments(), "successViewMessageAnimationId")) == null) {
                companion.getClass();
                d3 = Companion.getDefaultWorkflowSettings(miSnapSettings).r;
            }
            if (d3 != null) {
                int intValue = d3.intValue();
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                successView.setAnimation(MultipartBody.Companion.a(requireContext2, intValue));
            }
            String a$24 = a$2();
            if (a$24 == null || (str2 = workflow.get(a$24)) == null) {
                obj4 = null;
            } else {
                Json.Default r73 = Json.Default;
                r73.getClass();
                obj4 = r73.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings4 = (WorkflowSettings) obj4;
            if ((workflowSettings4 == null || (b3 = workflowSettings4.t) == null) && (b3 = MultipartBody.Companion.b(getArguments(), "successViewShouldVibrate")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b3 = Boolean.TRUE;
            }
            successView.setVibrate(b3.booleanValue());
            String a$25 = a$2();
            if (a$25 == null || (str = workflow.get(a$25)) == null) {
                obj5 = null;
            } else {
                Json.Default r5 = Json.Default;
                r5.getClass();
                obj5 = r5.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings5 = (WorkflowSettings) obj5;
            if ((workflowSettings5 == null || (e = workflowSettings5.u) == null) && (e = MultipartBody.Companion.e(getArguments())) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
            } else {
                str6 = e;
            }
            if (str6 != null) {
                successView.setSoundUri(str6);
            }
            successView.start(new Rum$createMonitor$1(i, this, miSnapSettings, miSnapFinalResult));
            str6 = successView;
        }
        if (str6 == null) {
            MiSnapWorkflowViewModel b$1 = b$1();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            b$1.postError$workflow_release(requireContext3, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    public final String a$2() {
        return (String) this.k.getValue();
    }

    public final MiSnapWorkflowViewModel b$1() {
        return (MiSnapWorkflowViewModel) this.m.getValue();
    }

    public final /* synthetic */ d getBinding$workflow_release() {
        return (d) this.a.getValue((Fragment) this, x[0]);
    }

    public final Boolean o(MiSnapSettings miSnapSettings, String str) {
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
        if (workflowSettings != null && (bool = workflowSettings.f) != null) {
            return bool;
        }
        Boolean b2 = MultipartBody.Companion.b(getArguments(), "manualButtonVisible");
        if (b2 != null) {
            return b2;
        }
        Companion.getClass();
        return Companion.getDefaultWorkflowSettings(miSnapSettings).f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Integer num;
        super.onDestroyView();
        this.w.remove();
        this.d.cancelAll();
        MibiData.releaseSession(DocumentAnalysisFragment.class.getName());
        if (this.e) {
            try {
                FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.l);
            } catch (Exception unused) {
                if (requireActivity().isChangingConfigurations() || (num = this.f) == null) {
                    return;
                }
                requireActivity().setRequestedOrientation(num.intValue());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        DocumentAnalysisFragment$$ExternalSyntheticLambda1 documentAnalysisFragment$$ExternalSyntheticLambda1 = this.n;
        n nVar = this.d;
        nVar.pause(documentAnalysisFragment$$ExternalSyntheticLambda1);
        nVar.pause(this.o);
        AlertDialog alertDialog = this.i;
        Unit unit = null;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            this.i = null;
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) b$1().f.getValue();
        if (miSnapSettings != null) {
            if (s.shouldRecordSession(miSnapSettings.camera.videoRecord)) {
                getBinding$workflow_release().m.stop();
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel b$1 = b$1();
            Context requireContext = requireContext();
            requireContext.getClass();
            b$1.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        MiSnapView miSnapView = getBinding$workflow_release().l;
        FaceAnalysisFragment$$ExternalSyntheticLambda12 faceAnalysisFragment$$ExternalSyntheticLambda12 = this.p;
        if (faceAnalysisFragment$$ExternalSyntheticLambda12 != null) {
            miSnapView.x.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda12);
        }
        DocumentAnalysisFragment$$ExternalSyntheticLambda7 documentAnalysisFragment$$ExternalSyntheticLambda7 = this.q;
        if (documentAnalysisFragment$$ExternalSyntheticLambda7 != null) {
            miSnapView.y.removeObserver(documentAnalysisFragment$$ExternalSyntheticLambda7);
        }
        DocumentAnalysisFragment$$ExternalSyntheticLambda7 documentAnalysisFragment$$ExternalSyntheticLambda72 = this.r;
        if (documentAnalysisFragment$$ExternalSyntheticLambda72 != null) {
            miSnapView.w.removeObserver(documentAnalysisFragment$$ExternalSyntheticLambda72);
        }
        DocumentAnalysisFragment$$ExternalSyntheticLambda7 documentAnalysisFragment$$ExternalSyntheticLambda73 = this.s;
        if (documentAnalysisFragment$$ExternalSyntheticLambda73 != null) {
            miSnapView.z.removeObserver(documentAnalysisFragment$$ExternalSyntheticLambda73);
        }
        miSnapView.C.removeObserver(this.u);
        TorchView torchView = getBinding$workflow_release().o;
        FaceAnalysisFragment$$ExternalSyntheticLambda7 faceAnalysisFragment$$ExternalSyntheticLambda7 = this.t;
        if (faceAnalysisFragment$$ExternalSyntheticLambda7 != null) {
            torchView.b.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda7);
        }
        torchView.removeObserver();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0275  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        Object obj;
        Bundle arguments;
        String str;
        Float f;
        String str2;
        double d;
        Float valueOf;
        String a$2;
        Object obj2;
        WorkflowSettings workflowSettings;
        Integer d2;
        String a$22;
        Object obj3;
        WorkflowSettings workflowSettings2;
        String a$23;
        Object obj4;
        WorkflowSettings workflowSettings3;
        Boolean b2;
        String a$24;
        Object obj5;
        WorkflowSettings workflowSettings4;
        Integer d3;
        String a$25;
        Object obj6;
        WorkflowSettings workflowSettings5;
        Integer d4;
        AccessibilityManager accessibilityManager;
        String a$26;
        Object obj7;
        WorkflowSettings workflowSettings6;
        Integer d5;
        String a$27;
        Object obj8;
        WorkflowSettings workflowSettings7;
        String a$28;
        Object obj9;
        WorkflowSettings workflowSettings8;
        Integer d6;
        AccessibilityManager accessibilityManager2;
        String a$29;
        Object obj10;
        WorkflowSettings workflowSettings9;
        String a$210;
        Object obj11;
        WorkflowSettings workflowSettings10;
        Integer d7;
        String a$211;
        Object obj12;
        WorkflowSettings workflowSettings11;
        Integer d8;
        String a$212;
        Object obj13;
        WorkflowSettings workflowSettings12;
        Integer d9;
        String a$213;
        Object obj14;
        WorkflowSettings workflowSettings13;
        Integer d10;
        String a$214;
        Object obj15;
        WorkflowSettings workflowSettings14;
        String a$215;
        Object obj16;
        WorkflowSettings workflowSettings15;
        MaterialTextView materialTextView;
        String a$216;
        Object obj17;
        WorkflowSettings workflowSettings16;
        Boolean b3;
        String a$217;
        WorkflowSettings workflowSettings17;
        Integer d11;
        int intValue;
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
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        Object obj18;
        String str20;
        Integer num = 5000;
        super.onResume();
        MiSnapSettings miSnapSettings = (MiSnapSettings) b$1().f.getValue();
        int i = 2;
        final int i2 = 1;
        Object obj19 = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MiSnapFinalResult miSnapFinalResult = b$1().h;
            if (miSnapFinalResult != null) {
                a$1(b$1(), miSnapSettings, a$2(), miSnapFinalResult);
                return;
            }
            MiSnapSettings.Analysis.Document document = analysis.document;
            MiSnapSettings.Analysis.Document document2 = analysis.document;
            if (DocumentAnalysisSettings.shouldEnableFocusOnFinalFrame(document)) {
                Context requireContext = requireContext();
                requireContext.getClass();
                if (SVG$Unit$EnumUnboxingLocalUtility._isLowerThan(DevicePerformanceUtil.getCurrentDevicePerformanceTier$default(requireContext))) {
                    document2.i = Boolean.FALSE;
                    b$1().updateState$workflow_release(miSnapSettings);
                }
            }
            FaceAnalysisFragment$$ExternalSyntheticLambda12 faceAnalysisFragment$$ExternalSyntheticLambda12 = new FaceAnalysisFragment$$ExternalSyntheticLambda12(s.shouldRecordSession(miSnapSettings.camera.videoRecord), this, i);
            getBinding$workflow_release().l.x.observe(getViewLifecycleOwner(), faceAnalysisFragment$$ExternalSyntheticLambda12);
            this.p = faceAnalysisFragment$$ExternalSyntheticLambda12;
            getBinding$workflow_release().l.C.observe(getViewLifecycleOwner(), this.u);
            GuideView guideView = getBinding$workflow_release().e;
            String a$218 = a$2();
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            int deviceCurrentBasicOrientation = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(requireActivity);
            final int i3 = 0;
            boolean z = deviceCurrentBasicOrientation == DocumentAnalysisSettings.getOrientation(document2, deviceCurrentBasicOrientation);
            if (z) {
                if (a$218 == null || (str20 = workflow.get(a$218)) == null) {
                    obj18 = null;
                } else {
                    Json.Default r11 = Json.Default;
                    r11.getClass();
                    obj18 = r11.decodeFromString(str20, WorkflowSettings.Companion.serializer());
                }
                WorkflowSettings workflowSettings18 = (WorkflowSettings) obj18;
                if (workflowSettings18 == null || (f = workflowSettings18.b) == null) {
                    arguments = getArguments();
                    str = "guideViewAlignedScalePercentage";
                    f = MultipartBody.Companion.c(arguments, str);
                }
                float floatValue = f == null ? f.floatValue() : -1.0f;
                d = floatValue;
                Companion companion = Companion;
                if (0.0d <= d || d > 1.0d) {
                    companion.getClass();
                    if (z) {
                        Companion.getDefaultWorkflowSettings(miSnapSettings);
                        valueOf = Float.valueOf(0.87f);
                    } else {
                        valueOf = Companion.getDefaultWorkflowSettings(miSnapSettings).b;
                    }
                } else {
                    valueOf = Float.valueOf(floatValue);
                }
                if (valueOf != null) {
                    guideView.setScale(valueOf.floatValue());
                }
                a$2 = a$2();
                if (a$2 != null || (str19 = workflow.get(a$2)) == null) {
                    obj2 = null;
                } else {
                    Json.Default r10 = Json.Default;
                    r10.getClass();
                    obj2 = r10.decodeFromString(str19, WorkflowSettings.Companion.serializer());
                }
                workflowSettings = (WorkflowSettings) obj2;
                if ((workflowSettings != null || (d2 = workflowSettings.a) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "guideViewDrawableId")) == null) {
                    companion.getClass();
                    d2 = Companion.getDefaultWorkflowSettings(miSnapSettings).a;
                }
                if (d2 != null) {
                    int intValue2 = d2.intValue();
                    Context requireContext2 = requireContext();
                    requireContext2.getClass();
                    Drawable b4 = MultipartBody.Companion.b(requireContext2, intValue2);
                    if (b4 != null) {
                        FragmentActivity requireActivity2 = requireActivity();
                        requireActivity2.getClass();
                        int deviceCurrentBasicOrientation2 = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(requireActivity2);
                        if (DocumentAnalysisSettings.getOrientation(document2, deviceCurrentBasicOrientation2) == 1 && deviceCurrentBasicOrientation2 == 1) {
                            b4 = new DrawableUtil$a(b4, new Drawable[]{b4});
                        }
                        guideView.setDrawable(b4);
                    }
                }
                a$22 = a$2();
                if (a$22 != null || (str18 = workflow.get(a$22)) == null) {
                    obj3 = null;
                } else {
                    Json.Default r9 = Json.Default;
                    r9.getClass();
                    obj3 = r9.decodeFromString(str18, WorkflowSettings.Companion.serializer());
                }
                workflowSettings2 = (WorkflowSettings) obj3;
                if ((workflowSettings2 != null || (r6 = workflowSettings2.d) == null) && (r6 = MultipartBody.Companion.b(getArguments(), "guideViewShowVignette")) == null) {
                    companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    Boolean b5 = Boolean.FALSE;
                }
                guideView.setShowVignette(b5.booleanValue());
                AppCompatImageView appCompatImageView = getBinding$workflow_release().c;
                a$23 = a$2();
                if (a$23 != null || (str17 = workflow.get(a$23)) == null) {
                    obj4 = null;
                } else {
                    Json.Default r92 = Json.Default;
                    r92.getClass();
                    obj4 = r92.decodeFromString(str17, WorkflowSettings.Companion.serializer());
                }
                workflowSettings3 = (WorkflowSettings) obj4;
                if ((workflowSettings3 != null || (b2 = workflowSettings3.B) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "showCancelButton")) == null) {
                    companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    b2 = Boolean.FALSE;
                }
                if (b2.booleanValue()) {
                    appCompatImageView.setVisibility(0);
                    appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment$$ExternalSyntheticLambda5
                        public final /* synthetic */ DocumentAnalysisFragment f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i3;
                            DocumentAnalysisFragment documentAnalysisFragment = this.f$0;
                            switch (i4) {
                                case 0:
                                    DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                                    documentAnalysisFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                    break;
                                default:
                                    DocumentAnalysisFragment.Companion companion3 = DocumentAnalysisFragment.Companion;
                                    try {
                                        FragmentKt.findNavController(documentAnalysisFragment).navigate(R.id.navigateHelp);
                                        break;
                                    } catch (Exception e) {
                                        Log.e("DocumentAnalysisScreen", "Nav Graph Error", e);
                                        documentAnalysisFragment.b$1().postNavigationError$workflow_release(new NavigationError(e, DocumentAnalysisFragment.class, documentAnalysisFragment.hashCode(), NavigationAction$DocumentAnalysis$NavigateHelp.INSTANCE));
                                    }
                            }
                        }
                    });
                }
                a$24 = a$2();
                if (a$24 != null || (str16 = workflow.get(a$24)) == null) {
                    obj5 = null;
                } else {
                    Json.Default r93 = Json.Default;
                    r93.getClass();
                    obj5 = r93.decodeFromString(str16, WorkflowSettings.Companion.serializer());
                }
                workflowSettings4 = (WorkflowSettings) obj5;
                if ((workflowSettings4 != null || (d3 = workflowSettings4.C) == null) && (d3 = MultipartBody.Companion.d(getArguments(), "cancelButtonDrawableId")) == null) {
                    companion.getClass();
                    d3 = Companion.getDefaultWorkflowSettings(miSnapSettings).C;
                }
                if (d3 != null) {
                    int intValue3 = d3.intValue();
                    Context requireContext3 = requireContext();
                    requireContext3.getClass();
                    appCompatImageView.setImageDrawable(MultipartBody.Companion.b(requireContext3, intValue3));
                }
                HintView hintView = getBinding$workflow_release().i;
                a$25 = a$2();
                if (a$25 != null || (str15 = workflow.get(a$25)) == null) {
                    obj6 = null;
                } else {
                    Json.Default r94 = Json.Default;
                    r94.getClass();
                    obj6 = r94.decodeFromString(str15, WorkflowSettings.Companion.serializer());
                }
                workflowSettings5 = (WorkflowSettings) obj6;
                if ((workflowSettings5 != null || (d4 = workflowSettings5.j) == null) && (d4 = MultipartBody.Companion.d(getArguments(), "hintDuration")) == null) {
                    Context requireContext4 = requireContext();
                    requireContext4.getClass();
                    Object systemService = requireContext4.getSystemService("accessibility");
                    accessibilityManager = !(systemService instanceof AccessibilityManager) ? (AccessibilityManager) systemService : null;
                    if (accessibilityManager == null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                        d4 = num;
                    } else {
                        companion.getClass();
                        Companion.getDefaultWorkflowSettings(miSnapSettings);
                        d4 = 3000;
                    }
                }
                hintView.setDuration(d4.intValue());
                a$26 = a$2();
                if (a$26 != null || (str14 = workflow.get(a$26)) == null) {
                    obj7 = null;
                } else {
                    Json.Default r102 = Json.Default;
                    r102.getClass();
                    obj7 = r102.decodeFromString(str14, WorkflowSettings.Companion.serializer());
                }
                workflowSettings6 = (WorkflowSettings) obj7;
                if ((workflowSettings6 != null || (d5 = workflowSettings6.k) == null) && (d5 = MultipartBody.Companion.d(getArguments(), "hintAnimationId")) == null) {
                    companion.getClass();
                    d5 = Companion.getDefaultWorkflowSettings(miSnapSettings).k;
                }
                if (d5 != null) {
                    int intValue4 = d5.intValue();
                    Context requireContext5 = requireContext();
                    requireContext5.getClass();
                    hintView.setAnimation(MultipartBody.Companion.a(requireContext5, intValue4));
                }
                a$27 = a$2();
                if (a$27 != null || (str13 = workflow.get(a$27)) == null) {
                    obj8 = null;
                } else {
                    Json.Default r103 = Json.Default;
                    r103.getClass();
                    obj8 = r103.decodeFromString(str13, WorkflowSettings.Companion.serializer());
                }
                workflowSettings7 = (WorkflowSettings) obj8;
                if ((workflowSettings7 != null || (r8 = workflowSettings7.l) == null) && (r8 = MultipartBody.Companion.b(getArguments(), "hintViewShowBackground")) == null) {
                    companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    Boolean b6 = Boolean.TRUE;
                }
                hintView.setShowBackground(b6.booleanValue());
                a$28 = a$2();
                if (a$28 != null || (str12 = workflow.get(a$28)) == null) {
                    obj9 = null;
                } else {
                    Json.Default r104 = Json.Default;
                    r104.getClass();
                    obj9 = r104.decodeFromString(str12, WorkflowSettings.Companion.serializer());
                }
                workflowSettings8 = (WorkflowSettings) obj9;
                if ((workflowSettings8 != null || (d6 = workflowSettings8.m) == null) && (d6 = MultipartBody.Companion.d(getArguments(), "hintViewInitialHintDelay")) == null) {
                    FragmentActivity requireActivity3 = requireActivity();
                    requireActivity3.getClass();
                    Object systemService2 = requireActivity3.getSystemService("accessibility");
                    accessibilityManager2 = !(systemService2 instanceof AccessibilityManager) ? (AccessibilityManager) systemService2 : null;
                    if (accessibilityManager2 != null || !accessibilityManager2.isEnabled() || !accessibilityManager2.isTouchExplorationEnabled()) {
                        companion.getClass();
                        Companion.getDefaultWorkflowSettings(miSnapSettings);
                        num = 0;
                    }
                } else {
                    num = d6;
                }
                hintView.setInitialHintDelay(num.intValue());
                a$29 = a$2();
                if (a$29 != null || (str11 = workflow.get(a$29)) == null) {
                    obj10 = null;
                } else {
                    Json.Default r8 = Json.Default;
                    r8.getClass();
                    obj10 = r8.decodeFromString(str11, WorkflowSettings.Companion.serializer());
                }
                workflowSettings9 = (WorkflowSettings) obj10;
                if ((workflowSettings9 != null || (r1 = workflowSettings9.D) == null) && (r1 = MultipartBody.Companion.b(getArguments(), "hintViewShouldAnnounceUnchangedHints")) == null) {
                    companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    Boolean b7 = Boolean.TRUE;
                }
                hintView.setAnnounceUnchangedHints(b7.booleanValue());
                TorchView torchView = getBinding$workflow_release().o;
                a$210 = a$2();
                if (a$210 != null || (str10 = workflow.get(a$210)) == null) {
                    obj11 = null;
                } else {
                    Json.Default r82 = Json.Default;
                    r82.getClass();
                    obj11 = r82.decodeFromString(str10, WorkflowSettings.Companion.serializer());
                }
                workflowSettings10 = (WorkflowSettings) obj11;
                if ((workflowSettings10 != null || (d7 = workflowSettings10.h) == null) && (d7 = MultipartBody.Companion.d(getArguments(), "torchViewOnDrawableId")) == null) {
                    companion.getClass();
                    d7 = Companion.getDefaultWorkflowSettings(miSnapSettings).h;
                }
                if (d7 != null) {
                    torchView.setTorchOnDrawableId(d7.intValue());
                }
                a$211 = a$2();
                if (a$211 != null || (str9 = workflow.get(a$211)) == null) {
                    obj12 = null;
                } else {
                    Json.Default r83 = Json.Default;
                    r83.getClass();
                    obj12 = r83.decodeFromString(str9, WorkflowSettings.Companion.serializer());
                }
                workflowSettings11 = (WorkflowSettings) obj12;
                if ((workflowSettings11 != null || (d8 = workflowSettings11.i) == null) && (d8 = MultipartBody.Companion.d(getArguments(), "torchViewOffDrawableId")) == null) {
                    companion.getClass();
                    d8 = Companion.getDefaultWorkflowSettings(miSnapSettings).i;
                }
                if (d8 != null) {
                    torchView.setTorchOffDrawableId(d8.intValue());
                }
                AppCompatImageView appCompatImageView2 = getBinding$workflow_release().h;
                a$212 = a$2();
                if (a$212 != null || (str8 = workflow.get(a$212)) == null) {
                    obj13 = null;
                } else {
                    Json.Default r84 = Json.Default;
                    r84.getClass();
                    obj13 = r84.decodeFromString(str8, WorkflowSettings.Companion.serializer());
                }
                workflowSettings12 = (WorkflowSettings) obj13;
                if ((workflowSettings12 != null || (d9 = workflowSettings12.p) == null) && (d9 = MultipartBody.Companion.d(getArguments(), "helpButtonDrawableId")) == null) {
                    companion.getClass();
                    d9 = Companion.getDefaultWorkflowSettings(miSnapSettings).p;
                }
                if (d9 != null) {
                    int intValue5 = d9.intValue();
                    Context requireContext6 = requireContext();
                    requireContext6.getClass();
                    appCompatImageView2.setImageDrawable(MultipartBody.Companion.b(requireContext6, intValue5));
                }
                appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment$$ExternalSyntheticLambda5
                    public final /* synthetic */ DocumentAnalysisFragment f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i2;
                        DocumentAnalysisFragment documentAnalysisFragment = this.f$0;
                        switch (i4) {
                            case 0:
                                DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                                documentAnalysisFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                break;
                            default:
                                DocumentAnalysisFragment.Companion companion3 = DocumentAnalysisFragment.Companion;
                                try {
                                    FragmentKt.findNavController(documentAnalysisFragment).navigate(R.id.navigateHelp);
                                    break;
                                } catch (Exception e) {
                                    Log.e("DocumentAnalysisScreen", "Nav Graph Error", e);
                                    documentAnalysisFragment.b$1().postNavigationError$workflow_release(new NavigationError(e, DocumentAnalysisFragment.class, documentAnalysisFragment.hashCode(), NavigationAction$DocumentAnalysis$NavigateHelp.INSTANCE));
                                }
                        }
                    }
                });
                AppCompatImageView appCompatImageView3 = getBinding$workflow_release().j;
                a$213 = a$2();
                if (a$213 != null || (str7 = workflow.get(a$213)) == null) {
                    obj14 = null;
                } else {
                    Json.Default r85 = Json.Default;
                    r85.getClass();
                    obj14 = r85.decodeFromString(str7, WorkflowSettings.Companion.serializer());
                }
                workflowSettings13 = (WorkflowSettings) obj14;
                if ((workflowSettings13 != null || (d10 = workflowSettings13.e) == null) && (d10 = MultipartBody.Companion.d(getArguments(), "manualButtonDrawableId")) == null) {
                    companion.getClass();
                    d10 = Companion.getDefaultWorkflowSettings(miSnapSettings).e;
                }
                if (d10 != null) {
                    int intValue6 = d10.intValue();
                    Context requireContext7 = requireContext();
                    requireContext7.getClass();
                    appCompatImageView3.setImageDrawable(MultipartBody.Companion.b(requireContext7, intValue6));
                }
                MiSnapView miSnapView = getBinding$workflow_release().l;
                a$214 = a$2();
                if (a$214 != null || (str6 = workflow.get(a$214)) == null) {
                    obj15 = null;
                } else {
                    Json.Default r86 = Json.Default;
                    r86.getClass();
                    obj15 = r86.decodeFromString(str6, WorkflowSettings.Companion.serializer());
                }
                workflowSettings14 = (WorkflowSettings) obj15;
                if ((workflowSettings14 != null || (r6 = workflowSettings14.v) == null) && (r6 = MultipartBody.Companion.b(getArguments(), "misnapViewShowBoundingBox")) == null) {
                    companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    Boolean b8 = Boolean.FALSE;
                }
                miSnapView.setShowBoundingBox(b8.booleanValue());
                a$215 = a$2();
                if (a$215 != null || (str5 = workflow.get(a$215)) == null) {
                    obj16 = null;
                } else {
                    Json.Default r87 = Json.Default;
                    r87.getClass();
                    obj16 = r87.decodeFromString(str5, WorkflowSettings.Companion.serializer());
                }
                workflowSettings15 = (WorkflowSettings) obj16;
                if ((workflowSettings15 != null || (r6 = workflowSettings15.w) == null) && (r6 = MultipartBody.Companion.b(getArguments(), "misnapViewShowGlareBox")) == null) {
                    companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    Boolean b9 = Boolean.FALSE;
                }
                miSnapView.setShowGlareBox(b9.booleanValue());
                materialTextView = getBinding$workflow_release().d;
                a$216 = a$2();
                if (a$216 != null || (str4 = workflow.get(a$216)) == null) {
                    obj17 = null;
                } else {
                    Json.Default r88 = Json.Default;
                    r88.getClass();
                    obj17 = r88.decodeFromString(str4, WorkflowSettings.Companion.serializer());
                }
                workflowSettings16 = (WorkflowSettings) obj17;
                if ((workflowSettings16 != null || (b3 = workflowSettings16.z) == null) && (b3 = MultipartBody.Companion.b(getArguments(), "showDocumentLabel")) == null) {
                    companion.getClass();
                    Companion.getDefaultWorkflowSettings(miSnapSettings);
                    b3 = Boolean.FALSE;
                }
                if (b3.booleanValue()) {
                    materialTextView.setVisibility(0);
                    materialTextView.setAccessibilityHeading(true);
                }
                a$217 = a$2();
                if (a$217 != null && (str3 = workflow.get(a$217)) != null) {
                    Json.Default r5 = Json.Default;
                    r5.getClass();
                    obj19 = r5.decodeFromString(str3, WorkflowSettings.Companion.serializer());
                }
                workflowSettings17 = (WorkflowSettings) obj19;
                if ((workflowSettings17 != null || (d11 = workflowSettings17.A) == null) && (d11 = MultipartBody.Companion.d(getArguments(), "documentLabelStringId")) == null) {
                    companion.getClass();
                    d11 = Companion.getDefaultWorkflowSettings(miSnapSettings).A;
                }
                if (d11 != null && (intValue = d11.intValue()) != 0) {
                    materialTextView.setText(getString(intValue));
                }
                a$1(miSnapSettings, a$2(), b$1());
                obj19 = Unit.INSTANCE;
            } else {
                if (a$218 == null || (str2 = workflow.get(a$218)) == null) {
                    obj = null;
                } else {
                    Json.Default r112 = Json.Default;
                    r112.getClass();
                    obj = r112.decodeFromString(str2, WorkflowSettings.Companion.serializer());
                }
                WorkflowSettings workflowSettings19 = (WorkflowSettings) obj;
                if (workflowSettings19 == null || (f = workflowSettings19.c) == null) {
                    arguments = getArguments();
                    str = "guideViewUnalignedScalePercentage";
                    f = MultipartBody.Companion.c(arguments, str);
                }
                if (f == null) {
                }
                d = floatValue;
                Companion companion2 = Companion;
                if (0.0d <= d) {
                }
                companion2.getClass();
                if (z) {
                }
                if (valueOf != null) {
                }
                a$2 = a$2();
                if (a$2 != null) {
                }
                obj2 = null;
                workflowSettings = (WorkflowSettings) obj2;
                if (workflowSettings != null) {
                }
                companion2.getClass();
                d2 = Companion.getDefaultWorkflowSettings(miSnapSettings).a;
                if (d2 != null) {
                }
                a$22 = a$2();
                if (a$22 != null) {
                }
                obj3 = null;
                workflowSettings2 = (WorkflowSettings) obj3;
                if (workflowSettings2 != null) {
                }
                companion2.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                Boolean b52 = Boolean.FALSE;
                guideView.setShowVignette(b52.booleanValue());
                AppCompatImageView appCompatImageView4 = getBinding$workflow_release().c;
                a$23 = a$2();
                if (a$23 != null) {
                }
                obj4 = null;
                workflowSettings3 = (WorkflowSettings) obj4;
                if (workflowSettings3 != null) {
                }
                companion2.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b2 = Boolean.FALSE;
                if (b2.booleanValue()) {
                }
                a$24 = a$2();
                if (a$24 != null) {
                }
                obj5 = null;
                workflowSettings4 = (WorkflowSettings) obj5;
                if (workflowSettings4 != null) {
                }
                companion2.getClass();
                d3 = Companion.getDefaultWorkflowSettings(miSnapSettings).C;
                if (d3 != null) {
                }
                HintView hintView2 = getBinding$workflow_release().i;
                a$25 = a$2();
                if (a$25 != null) {
                }
                obj6 = null;
                workflowSettings5 = (WorkflowSettings) obj6;
                if (workflowSettings5 != null) {
                }
                Context requireContext42 = requireContext();
                requireContext42.getClass();
                Object systemService3 = requireContext42.getSystemService("accessibility");
                if (!(systemService3 instanceof AccessibilityManager)) {
                }
                if (accessibilityManager == null) {
                }
                companion2.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                d4 = 3000;
                hintView2.setDuration(d4.intValue());
                a$26 = a$2();
                if (a$26 != null) {
                }
                obj7 = null;
                workflowSettings6 = (WorkflowSettings) obj7;
                if (workflowSettings6 != null) {
                }
                companion2.getClass();
                d5 = Companion.getDefaultWorkflowSettings(miSnapSettings).k;
                if (d5 != null) {
                }
                a$27 = a$2();
                if (a$27 != null) {
                }
                obj8 = null;
                workflowSettings7 = (WorkflowSettings) obj8;
                if (workflowSettings7 != null) {
                }
                companion2.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                Boolean b62 = Boolean.TRUE;
                hintView2.setShowBackground(b62.booleanValue());
                a$28 = a$2();
                if (a$28 != null) {
                }
                obj9 = null;
                workflowSettings8 = (WorkflowSettings) obj9;
                if (workflowSettings8 != null) {
                }
                FragmentActivity requireActivity32 = requireActivity();
                requireActivity32.getClass();
                Object systemService22 = requireActivity32.getSystemService("accessibility");
                if (!(systemService22 instanceof AccessibilityManager)) {
                }
                if (accessibilityManager2 != null) {
                }
                companion2.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                num = 0;
                hintView2.setInitialHintDelay(num.intValue());
                a$29 = a$2();
                if (a$29 != null) {
                }
                obj10 = null;
                workflowSettings9 = (WorkflowSettings) obj10;
                if (workflowSettings9 != null) {
                }
                companion2.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                Boolean b72 = Boolean.TRUE;
                hintView2.setAnnounceUnchangedHints(b72.booleanValue());
                TorchView torchView2 = getBinding$workflow_release().o;
                a$210 = a$2();
                if (a$210 != null) {
                }
                obj11 = null;
                workflowSettings10 = (WorkflowSettings) obj11;
                if (workflowSettings10 != null) {
                }
                companion2.getClass();
                d7 = Companion.getDefaultWorkflowSettings(miSnapSettings).h;
                if (d7 != null) {
                }
                a$211 = a$2();
                if (a$211 != null) {
                }
                obj12 = null;
                workflowSettings11 = (WorkflowSettings) obj12;
                if (workflowSettings11 != null) {
                }
                companion2.getClass();
                d8 = Companion.getDefaultWorkflowSettings(miSnapSettings).i;
                if (d8 != null) {
                }
                AppCompatImageView appCompatImageView22 = getBinding$workflow_release().h;
                a$212 = a$2();
                if (a$212 != null) {
                }
                obj13 = null;
                workflowSettings12 = (WorkflowSettings) obj13;
                if (workflowSettings12 != null) {
                }
                companion2.getClass();
                d9 = Companion.getDefaultWorkflowSettings(miSnapSettings).p;
                if (d9 != null) {
                }
                appCompatImageView22.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment$$ExternalSyntheticLambda5
                    public final /* synthetic */ DocumentAnalysisFragment f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i2;
                        DocumentAnalysisFragment documentAnalysisFragment = this.f$0;
                        switch (i4) {
                            case 0:
                                DocumentAnalysisFragment.Companion companion22 = DocumentAnalysisFragment.Companion;
                                documentAnalysisFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                break;
                            default:
                                DocumentAnalysisFragment.Companion companion3 = DocumentAnalysisFragment.Companion;
                                try {
                                    FragmentKt.findNavController(documentAnalysisFragment).navigate(R.id.navigateHelp);
                                    break;
                                } catch (Exception e) {
                                    Log.e("DocumentAnalysisScreen", "Nav Graph Error", e);
                                    documentAnalysisFragment.b$1().postNavigationError$workflow_release(new NavigationError(e, DocumentAnalysisFragment.class, documentAnalysisFragment.hashCode(), NavigationAction$DocumentAnalysis$NavigateHelp.INSTANCE));
                                }
                        }
                    }
                });
                AppCompatImageView appCompatImageView32 = getBinding$workflow_release().j;
                a$213 = a$2();
                if (a$213 != null) {
                }
                obj14 = null;
                workflowSettings13 = (WorkflowSettings) obj14;
                if (workflowSettings13 != null) {
                }
                companion2.getClass();
                d10 = Companion.getDefaultWorkflowSettings(miSnapSettings).e;
                if (d10 != null) {
                }
                MiSnapView miSnapView2 = getBinding$workflow_release().l;
                a$214 = a$2();
                if (a$214 != null) {
                }
                obj15 = null;
                workflowSettings14 = (WorkflowSettings) obj15;
                if (workflowSettings14 != null) {
                }
                companion2.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                Boolean b82 = Boolean.FALSE;
                miSnapView2.setShowBoundingBox(b82.booleanValue());
                a$215 = a$2();
                if (a$215 != null) {
                }
                obj16 = null;
                workflowSettings15 = (WorkflowSettings) obj16;
                if (workflowSettings15 != null) {
                }
                companion2.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                Boolean b92 = Boolean.FALSE;
                miSnapView2.setShowGlareBox(b92.booleanValue());
                materialTextView = getBinding$workflow_release().d;
                a$216 = a$2();
                if (a$216 != null) {
                }
                obj17 = null;
                workflowSettings16 = (WorkflowSettings) obj17;
                if (workflowSettings16 != null) {
                }
                companion2.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b3 = Boolean.FALSE;
                if (b3.booleanValue()) {
                }
                a$217 = a$2();
                if (a$217 != null) {
                    Json.Default r52 = Json.Default;
                    r52.getClass();
                    obj19 = r52.decodeFromString(str3, WorkflowSettings.Companion.serializer());
                }
                workflowSettings17 = (WorkflowSettings) obj19;
                if (workflowSettings17 != null) {
                }
                companion2.getClass();
                d11 = Companion.getDefaultWorkflowSettings(miSnapSettings).A;
                if (d11 != null) {
                    materialTextView.setText(getString(intValue));
                }
                a$1(miSnapSettings, a$2(), b$1());
                obj19 = Unit.INSTANCE;
            }
        }
        if (obj19 == null) {
            MiSnapWorkflowViewModel b$1 = b$1();
            Context requireContext8 = requireContext();
            requireContext8.getClass();
            b$1.postError$workflow_release(requireContext8, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        DocumentAnalysisFragment$$ExternalSyntheticLambda7 documentAnalysisFragment$$ExternalSyntheticLambda7 = new DocumentAnalysisFragment$$ExternalSyntheticLambda7(b$1(), this, 2);
        getBinding$workflow_release().l.z.observe(getViewLifecycleOwner(), documentAnalysisFragment$$ExternalSyntheticLambda7);
        this.s = documentAnalysisFragment$$ExternalSyntheticLambda7;
        DocumentAnalysisFragment$$ExternalSyntheticLambda7 documentAnalysisFragment$$ExternalSyntheticLambda72 = new DocumentAnalysisFragment$$ExternalSyntheticLambda7(b$1(), this, 1);
        getBinding$workflow_release().l.y.observe(getViewLifecycleOwner(), documentAnalysisFragment$$ExternalSyntheticLambda72);
        this.q = documentAnalysisFragment$$ExternalSyntheticLambda72;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        DocumentAnalysisFragment$$ExternalSyntheticLambda1 documentAnalysisFragment$$ExternalSyntheticLambda1 = this.n;
        n nVar = this.d;
        bundle.putLong("timeoutKey", nVar.remainingTime(documentAnalysisFragment$$ExternalSyntheticLambda1));
        nVar.cancelAll();
        MiSnapFinalResult miSnapFinalResult = this.c;
        if (miSnapFinalResult != null) {
            b$1().h = miSnapFinalResult;
        }
        Integer num = this.f;
        if (num != null) {
            bundle.putInt("orientationKey", num.intValue());
        }
        bundle.putBoolean("loggedTries", this.g);
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
                this.g = bundle.getBoolean("loggedTries");
            }
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) b$1().f.getValue();
        Object obj = null;
        if (miSnapSettings != null) {
            MiSnapSettings.UseCase useCase = miSnapSettings.a;
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MibiData.Uxp uxp = MibiData.a;
            MibiData.startSession(miSnapSettings, DocumentAnalysisFragment.class.getName());
            this.j = MibiData.bindSession();
            if (Position.shouldShowExitConfirmationDialog(workflow, useCase)) {
                requireActivity().getOnBackPressedDispatcher().addCallback(this.w, requireActivity());
            }
            String a$2 = a$2();
            if (a$2 != null && (str = workflow.get(a$2)) != null) {
                Json.Default r7 = Json.Default;
                r7.getClass();
                obj = r7.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.y) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
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
                Integer forcedOrientation = Position.getForcedOrientation(workflow, useCase);
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.f = Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            obj = Unit.INSTANCE;
        }
        if (obj == null) {
            MiSnapWorkflowViewModel b$1 = b$1();
            Context requireContext = requireContext();
            requireContext.getClass();
            b$1.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        MaterialTextView materialTextView = (MaterialTextView) getBinding$workflow_release().k.c;
        float f = materialTextView.getContext().getResources().getConfiguration().fontScale;
        if (f > 1.0f) {
            com.miteksystems.misnap.workflow.a.b.a(materialTextView, f);
        }
        MaterialTextView materialTextView2 = getBinding$workflow_release().d;
        float f2 = materialTextView2.getContext().getResources().getConfiguration().fontScale;
        if (f2 <= 1.0f) {
            return;
        }
        com.miteksystems.misnap.workflow.a.b.a(materialTextView2, f2);
    }

    public final void startSession$workflow_release(MiSnapSettings miSnapSettings, String str, MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
        miSnapWorkflowViewModel.getClass();
        getBinding$workflow_release().l.z.observe(getViewLifecycleOwner(), new g(miSnapSettings, miSnapWorkflowViewModel, str));
        Boolean o = o(miSnapSettings, str);
        getBinding$workflow_release().l.startMiSnapSession(miSnapSettings, getViewLifecycleOwner(), (o == null || !o.booleanValue()) ? null : Boolean.TRUE, new AndroidPopup_androidKt$Popup$3$1(miSnapSettings, this, miSnapWorkflowViewModel, str, 8));
    }

    @Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Integer A;
        public final Boolean B;
        public final Integer C;
        public final Boolean D;
        public final Integer a;
        public final Float b;
        public final Float c;
        public final Boolean d;
        public final Integer e;
        public final Boolean f;
        public final Integer g;
        public final Integer h;
        public final Integer i;
        public final Integer j;
        public final Integer k;
        public final Boolean l;
        public final Integer m;
        public final Integer n;
        public final Integer o;
        public final Integer p;
        public final Integer q;
        public final Integer r;
        public final Integer s;
        public final Boolean t;
        public final String u;
        public final Boolean v;
        public final Boolean w;
        public final ReviewCondition x;
        public final Boolean y;
        public final Boolean z;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/DocumentAnalysisFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/DocumentAnalysisFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return DocumentAnalysisFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Integer num, Float f, Float f2, Boolean bool, Integer num2, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool3, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Boolean bool4, String str, Boolean bool5, Boolean bool6, ReviewCondition reviewCondition, Boolean bool7, Boolean bool8, Integer num15, Boolean bool9, Integer num16, Boolean bool10) {
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
                this.c = f2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = bool;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = num2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = bool2;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = num3;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = num4;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = num5;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = num6;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = num7;
            }
            if ((i & 2048) == 0) {
                this.l = null;
            } else {
                this.l = bool3;
            }
            if ((i & 4096) == 0) {
                this.m = null;
            } else {
                this.m = num8;
            }
            if ((i & PKIFailureInfo.certRevoked) == 0) {
                this.n = null;
            } else {
                this.n = num9;
            }
            if ((i & 16384) == 0) {
                this.o = null;
            } else {
                this.o = num10;
            }
            if ((32768 & i) == 0) {
                this.p = null;
            } else {
                this.p = num11;
            }
            if ((65536 & i) == 0) {
                this.q = null;
            } else {
                this.q = num12;
            }
            if ((131072 & i) == 0) {
                this.r = null;
            } else {
                this.r = num13;
            }
            if ((262144 & i) == 0) {
                this.s = null;
            } else {
                this.s = num14;
            }
            if ((524288 & i) == 0) {
                this.t = null;
            } else {
                this.t = bool4;
            }
            if ((1048576 & i) == 0) {
                this.u = null;
            } else {
                this.u = str;
            }
            if ((2097152 & i) == 0) {
                this.v = null;
            } else {
                this.v = bool5;
            }
            if ((4194304 & i) == 0) {
                this.w = null;
            } else {
                this.w = bool6;
            }
            if ((8388608 & i) == 0) {
                this.x = null;
            } else {
                this.x = reviewCondition;
            }
            if ((16777216 & i) == 0) {
                this.y = null;
            } else {
                this.y = bool7;
            }
            if ((33554432 & i) == 0) {
                this.z = null;
            } else {
                this.z = bool8;
            }
            if ((67108864 & i) == 0) {
                this.A = null;
            } else {
                this.A = num15;
            }
            if ((134217728 & i) == 0) {
                this.B = null;
            } else {
                this.B = bool9;
            }
            if ((268435456 & i) == 0) {
                this.C = null;
            } else {
                this.C = num16;
            }
            if ((i & PKIFailureInfo.duplicateCertReq) == 0) {
                this.D = null;
            } else {
                this.D = bool10;
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
            return Intrinsics.areEqual(this.a, workflowSettings.a) && Intrinsics.areEqual((Object) this.b, (Object) workflowSettings.b) && Intrinsics.areEqual((Object) this.c, (Object) workflowSettings.c) && Intrinsics.areEqual(this.d, workflowSettings.d) && Intrinsics.areEqual(this.e, workflowSettings.e) && Intrinsics.areEqual(this.f, workflowSettings.f) && Intrinsics.areEqual(this.g, workflowSettings.g) && Intrinsics.areEqual(this.h, workflowSettings.h) && Intrinsics.areEqual(this.i, workflowSettings.i) && Intrinsics.areEqual(this.j, workflowSettings.j) && Intrinsics.areEqual(this.k, workflowSettings.k) && Intrinsics.areEqual(this.l, workflowSettings.l) && Intrinsics.areEqual(this.m, workflowSettings.m) && Intrinsics.areEqual(this.n, workflowSettings.n) && Intrinsics.areEqual(this.o, workflowSettings.o) && Intrinsics.areEqual(this.p, workflowSettings.p) && Intrinsics.areEqual(this.q, workflowSettings.q) && Intrinsics.areEqual(this.r, workflowSettings.r) && Intrinsics.areEqual(this.s, workflowSettings.s) && Intrinsics.areEqual(this.t, workflowSettings.t) && Intrinsics.areEqual(this.u, workflowSettings.u) && Intrinsics.areEqual(this.v, workflowSettings.v) && Intrinsics.areEqual(this.w, workflowSettings.w) && this.x == workflowSettings.x && Intrinsics.areEqual(this.y, workflowSettings.y) && Intrinsics.areEqual(this.z, workflowSettings.z) && Intrinsics.areEqual(this.A, workflowSettings.A) && Intrinsics.areEqual(this.B, workflowSettings.B) && Intrinsics.areEqual(this.C, workflowSettings.C) && Intrinsics.areEqual(this.D, workflowSettings.D);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f = this.b;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.c;
            int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Boolean bool = this.d;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.e;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool2 = this.f;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num3 = this.g;
            int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.h;
            int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.i;
            int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.j;
            int hashCode10 = (hashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.k;
            int hashCode11 = (hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Boolean bool3 = this.l;
            int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num8 = this.m;
            int hashCode13 = (hashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.n;
            int hashCode14 = (hashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.o;
            int hashCode15 = (hashCode14 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Integer num11 = this.p;
            int hashCode16 = (hashCode15 + (num11 == null ? 0 : num11.hashCode())) * 31;
            Integer num12 = this.q;
            int hashCode17 = (hashCode16 + (num12 == null ? 0 : num12.hashCode())) * 31;
            Integer num13 = this.r;
            int hashCode18 = (hashCode17 + (num13 == null ? 0 : num13.hashCode())) * 31;
            Integer num14 = this.s;
            int hashCode19 = (hashCode18 + (num14 == null ? 0 : num14.hashCode())) * 31;
            Boolean bool4 = this.t;
            int hashCode20 = (hashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str = this.u;
            int hashCode21 = (hashCode20 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool5 = this.v;
            int hashCode22 = (hashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.w;
            int hashCode23 = (hashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            ReviewCondition reviewCondition = this.x;
            int hashCode24 = (hashCode23 + (reviewCondition == null ? 0 : reviewCondition.hashCode())) * 31;
            Boolean bool7 = this.y;
            int hashCode25 = (hashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.z;
            int hashCode26 = (hashCode25 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Integer num15 = this.A;
            int hashCode27 = (hashCode26 + (num15 == null ? 0 : num15.hashCode())) * 31;
            Boolean bool9 = this.B;
            int hashCode28 = (hashCode27 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Integer num16 = this.C;
            int hashCode29 = (hashCode28 + (num16 == null ? 0 : num16.hashCode())) * 31;
            Boolean bool10 = this.D;
            return hashCode29 + (bool10 != null ? bool10.hashCode() : 0);
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }

        public WorkflowSettings(Integer num, Float f, Integer num2, Boolean bool, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
            Float valueOf = Float.valueOf(0.87f);
            Boolean bool2 = Boolean.FALSE;
            Boolean bool3 = Boolean.TRUE;
            this.a = num;
            this.b = f;
            this.c = valueOf;
            this.d = bool2;
            this.e = num2;
            this.f = bool;
            this.g = 20000;
            this.h = num3;
            this.i = num4;
            this.j = 3000;
            this.k = num5;
            this.l = bool3;
            this.m = 0;
            this.n = num6;
            this.o = num7;
            this.p = num8;
            this.q = num9;
            this.r = num10;
            this.s = null;
            this.t = bool3;
            this.u = null;
            this.v = bool2;
            this.w = bool2;
            this.x = ReviewCondition.WARNINGS;
            this.y = bool3;
            this.z = bool2;
            this.A = num11;
            this.B = bool2;
            this.C = num12;
            this.D = bool3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r5.isEmpty() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (com.miteksystems.misnap.document.DocumentAnalysisSettings.requireTrigger(r5.analysis.document) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Document.Trigger.AUTO) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a$1(MiSnapWorkflowViewModel miSnapWorkflowViewModel, MiSnapSettings miSnapSettings, String str, MiSnapFinalResult miSnapFinalResult) {
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
        if (workflowSettings == null || (reviewCondition = workflowSettings.x) == null) {
            java.io.Serializable a2 = MultipartBody.Companion.a(getArguments(), "reviewCondition");
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
                    MiSnapFinalResult.DocumentSession documentSession = miSnapFinalResult instanceof MiSnapFinalResult.DocumentSession ? (MiSnapFinalResult.DocumentSession) miSnapFinalResult : null;
                    if (documentSession == null || (r5 = documentSession.g) == null) {
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
            Log.e("DocumentAnalysisScreen", "Nav Graph Error", e);
            miSnapWorkflowViewModel.postResults$workflow_release(miSnapFinalResult);
        }
    }

    public final void a$1(MiSnapSettings miSnapSettings) {
        AppCompatImageView appCompatImageView = getBinding$workflow_release().j;
        Boolean o = o(miSnapSettings, a$2());
        if (o == null || !o.booleanValue()) {
            return;
        }
        appCompatImageView.setVisibility(0);
        appCompatImageView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(3, this, appCompatImageView));
    }

    public final void a$1(MiSnapSettings miSnapSettings, String str, MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
        Context requireContext = requireContext();
        requireContext.getClass();
        if (AndroidPlatform.Companion.hasPermission(requireContext, "android.permission.CAMERA")) {
            startSession$workflow_release(miSnapSettings, str, miSnapWorkflowViewModel);
            return;
        }
        if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(requireContext());
            materialAlertDialogBuilder.setTitle(R.string.misnapWorkflowCameraPermissionDocumentRationaleTitle);
            materialAlertDialogBuilder.setMessage(R.string.misnapWorkflowCameraPermissionDocumentRationaleMessage);
            materialAlertDialogBuilder.P.mOnDismissListener = new HelpFragment$$ExternalSyntheticLambda4(this, 2);
            materialAlertDialogBuilder.setPositiveButton(R.string.misnapWorkflowCameraPermissionDocumentRationaleButtonConfirmLabel, (DialogInterface.OnClickListener) null).show();
            return;
        }
        this.v.launch("android.permission.CAMERA");
    }
}

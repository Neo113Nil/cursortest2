package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
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
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textview.MaterialTextView;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.miteksystems.misnap.barcode.BarcodeAnalysisSettings;
import com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer;
import com.miteksystems.misnap.barcode.MiSnapBarcodeDetector;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.controller.AnalysisSettings;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.o;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.util.DrawableUtil$a;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.miteksystems.misnap.workflow.view.GuideView;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.miteksystems.misnap.workflow.view.RecordingIconView;
import com.miteksystems.misnap.workflow.view.SuccessView;
import com.miteksystems.misnap.workflow.view.TorchView;
import com.squareup.cash.R;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.Json;
import net.idrnd.face.iad.capture.internal.s;
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.MultipartBody;
import okhttp3.internal.platform.AndroidPlatform;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/BarcodeAnalysisFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "ReviewCondition", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class BarcodeAnalysisFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public MiSnapController.FrameResult b;
    public MiSnapFinalResult c;
    public final n d;
    public boolean e;
    public Integer f;
    public boolean g;
    public MibiData.Session h;
    public final Lazy i;
    public final HelpFragment$$ExternalSyntheticLambda2 j;
    public final Lazy k;
    public final KnotView$$ExternalSyntheticLambda1 l;
    public FaceAnalysisFragment$$ExternalSyntheticLambda12 m;
    public BarcodeAnalysisFragment$$ExternalSyntheticLambda6 n;
    public BarcodeAnalysisFragment$$ExternalSyntheticLambda6 o;
    public FaceAnalysisFragment$$ExternalSyntheticLambda7 p;
    public final LiveDataObservable$$ExternalSyntheticLambda5 q;
    public final ActivityResultLauncher r;
    public static final /* synthetic */ KProperty[] s = {Reflection.factory.property1(new PropertyReference1Impl(BarcodeAnalysisFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentBarcodeAnalysisBinding;", 0))};
    public static final Companion Companion = new Companion();

    public final class Companion {
        public static WorkflowSettings getDefaultWorkflowSettings(MiSnapSettings miSnapSettings) {
            MiSnapSettings.Analysis analysis;
            MiSnapSettings.Analysis.Barcode barcode;
            MiSnapSettings.Analysis analysis2;
            MiSnapSettings.Analysis.Barcode barcode2;
            Integer num = null;
            Integer valueOf = (miSnapSettings == null || (analysis2 = miSnapSettings.analysis) == null || (barcode2 = analysis2.barcode) == null) ? null : Integer.valueOf(BarcodeAnalysisSettings.getType(barcode2));
            boolean z = false;
            if (valueOf != null) {
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 1, 128, 2031});
                Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{4, 8, 32, 64, 256, 512, 1024}).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = listOf.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            int intValue = ((Number) it2.next()).intValue();
                            if ((valueOf.intValue() & intValue) == intValue) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        int intValue2 = ((Number) it.next()).intValue();
                        if ((valueOf.intValue() & intValue2) == intValue2) {
                            break;
                        }
                    }
                }
            }
            Integer valueOf2 = Integer.valueOf(z ? R.drawable.misnap_guide_barcode_square : R.drawable.misnap_guide_barcode);
            Float valueOf3 = Float.valueOf(z ? 0.65f : 0.5f);
            Integer valueOf4 = Integer.valueOf(R.drawable.misnap_button_camera_shutter_icon);
            Integer valueOf5 = Integer.valueOf(R.drawable.misnap_torch_on_icon);
            Integer valueOf6 = Integer.valueOf(R.drawable.misnap_torch_off_icon);
            Integer valueOf7 = Integer.valueOf(R.drawable.misnap_recording_icon);
            Integer valueOf8 = Integer.valueOf(R.anim.misnap_recording_animation);
            Integer valueOf9 = Integer.valueOf(R.drawable.misnap_button_help_icon);
            Integer valueOf10 = Integer.valueOf(R.drawable.misnap_success_icon);
            Integer valueOf11 = Integer.valueOf(R.anim.misnap_success_animation);
            Integer valueOf12 = Integer.valueOf(R.drawable.misnap_button_cancel_session_icon);
            if (miSnapSettings != null && (analysis = miSnapSettings.analysis) != null && (barcode = analysis.barcode) != null) {
                num = Integer.valueOf(BarcodeAnalysisSettings.getType(barcode));
            }
            return new WorkflowSettings(valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, Integer.valueOf((num != null && num.intValue() == 1) ? R.string.misnapWorkflowBarcodeAnalysisFragmentQrCodeBarcodeLabel : (num != null && num.intValue() == 64) ? R.string.misnapWorkflowBarcodeAnalysisFragmentPdf417BarcodeLabel : R.string.misnapWorkflowBarcodeAnalysisFragmentGeneralBarcodeLabel));
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
        public static final b a = new b(1, com.miteksystems.misnap.workflow.a.c.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentBarcodeAnalysisBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.barcodeLabel;
            MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.barcodeLabel);
            if (materialTextView != null) {
                i = R.id.buttonsPanel;
                if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.buttonsPanel)) != null) {
                    i = R.id.cancelButton;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.cancelButton);
                    if (appCompatImageView != null) {
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
                                                                return new com.miteksystems.misnap.workflow.a.c((ConstraintLayout) view, materialTextView, appCompatImageView, guideView, appCompatImageView2, appCompatImageView3, a2, miSnapView, recordingIconView, successView, torchView);
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
        public final /* synthetic */ BarcodeAnalysisFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(BarcodeAnalysisFragment barcodeAnalysisFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = barcodeAnalysisFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            BarcodeAnalysisFragment barcodeAnalysisFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(barcodeAnalysisFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = barcodeAnalysisFragment.requireActivity();
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
        public final /* synthetic */ MiSnapSettings b;
        public final /* synthetic */ MiSnapWorkflowViewModel c;

        public f(MiSnapSettings miSnapSettings, MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
            this.b = miSnapSettings;
            this.c = miSnapWorkflowViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
        @Override // androidx.lifecycle.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onChanged(Object obj) {
            boolean z;
            MiSnapSettings.Analysis.Barcode.Trigger trigger;
            FrameProducer.Event event = (FrameProducer.Event) obj;
            if (event != null) {
                MiSnapSettings miSnapSettings = this.b;
                MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
                boolean z2 = event instanceof FrameProducer.Event.CameraInitialized;
                BarcodeAnalysisFragment barcodeAnalysisFragment = BarcodeAnalysisFragment.this;
                if (!z2) {
                    if (event instanceof FrameProducer.Event.CameraReady) {
                        barcodeAnalysisFragment.getBinding$workflow_release().k.z.removeObserver(this);
                        barcodeAnalysisFragment.getBinding$workflow_release().e.setVisibility(0);
                        return;
                    }
                    return;
                }
                MiSnapCameraInfo cameraInfo = ((FrameProducer.Event.CameraInitialized) event).getCameraInfo();
                if (cameraInfo.c) {
                    barcodeAnalysisFragment.getBinding$workflow_release().n.setVisibility(0);
                }
                com.miteksystems.misnap.workflow.a.c binding$workflow_release = barcodeAnalysisFragment.getBinding$workflow_release();
                KnotView$$ExternalSyntheticLambda1 knotView$$ExternalSyntheticLambda1 = barcodeAnalysisFragment.l;
                n nVar = barcodeAnalysisFragment.d;
                binding$workflow_release.h.setVisibility(0);
                boolean z3 = cameraInfo.a;
                MiSnapSettings.Analysis.Barcode.Trigger trigger2 = MiSnapSettings.Analysis.Barcode.Trigger.MANUAL;
                MiSnapSettings.Analysis.Barcode.Trigger trigger3 = MiSnapSettings.Analysis.Barcode.Trigger.AUTO;
                if (z3) {
                    MiSnapSettings.Analysis.Barcode barcode = analysis.barcode;
                    if (barcode.d != trigger2) {
                        barcode.d = trigger3;
                        z = false;
                        this.c.updateState$workflow_release(miSnapSettings);
                        if ((!Intrinsics.areEqual(MibiData.i, f.class.getName()) || Intrinsics.areEqual(MibiData.i, MiSnapWorkflowViewModel.class.getName())) && !barcodeAnalysisFragment.g) {
                            trigger = analysis.barcode.d;
                            MibiData.Session session = barcodeAnalysisFragment.h;
                            if (trigger != trigger3) {
                                session.getMetaData().b++;
                            } else {
                                session.getMetaData().c++;
                            }
                            barcodeAnalysisFragment.g = true;
                        }
                        if (!AnalysisSettings.isAutoTrigger(analysis, miSnapSettings.a) || z) {
                        }
                        AppCompatImageView appCompatImageView = barcodeAnalysisFragment.getBinding$workflow_release().i;
                        appCompatImageView.setVisibility(0);
                        appCompatImageView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(2, barcodeAnalysisFragment, appCompatImageView));
                        return;
                    }
                }
                if (analysis.barcode.d != trigger3 || nVar.isRunning(knotView$$ExternalSyntheticLambda1)) {
                    z = false;
                } else {
                    nVar.start(knotView$$ExternalSyntheticLambda1, 2000L);
                    z = true;
                }
                analysis.barcode.d = trigger2;
                this.c.updateState$workflow_release(miSnapSettings);
                if (!Intrinsics.areEqual(MibiData.i, f.class.getName())) {
                }
                trigger = analysis.barcode.d;
                MibiData.Session session2 = barcodeAnalysisFragment.h;
                if (trigger != trigger3) {
                }
                barcodeAnalysisFragment.g = true;
                if (AnalysisSettings.isAutoTrigger(analysis, miSnapSettings.a)) {
                }
            }
        }
    }

    public BarcodeAnalysisFragment() {
        super(R.layout.misnap_fragment_barcode_analysis);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, b.a);
        this.d = new n();
        int i = 1;
        this.e = true;
        this.h = MibiData.bindSession();
        this.i = LazyKt.lazy(new c(this, 0));
        this.j = new HelpFragment$$ExternalSyntheticLambda2(this, i);
        this.k = LazyKt.lazy(new c(this, i));
        this.l = new KnotView$$ExternalSyntheticLambda1(this, 19);
        this.q = new LiveDataObservable$$ExternalSyntheticLambda5(this, 5);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(this, i));
        registerForActivityResult.getClass();
        this.r = registerForActivityResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(MiSnapFinalResult miSnapFinalResult) {
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
        ((ConstraintLayout) getBinding$workflow_release().j.a).setVisibility(4);
        MiSnapSettings miSnapSettings = (MiSnapSettings) b().f.getValue();
        String str6 = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            SuccessView successView = getBinding$workflow_release().m;
            String a$1 = a$1();
            if (a$1 == null || (str5 = workflow.get(a$1)) == null) {
                obj = null;
            } else {
                Json.Default r5 = Json.Default;
                r5.getClass();
                obj = r5.decodeFromString(str5, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            Companion companion = Companion;
            if ((workflowSettings == null || (d = workflowSettings.k) == null) && (d = MultipartBody.Companion.d(getArguments(), "successViewMessageDrawableId")) == null) {
                companion.getClass();
                d = Companion.getDefaultWorkflowSettings(miSnapSettings).k;
            }
            if (d != null) {
                successView.setDrawableId(d.intValue());
            }
            String a$12 = a$1();
            if (a$12 == null || (str4 = workflow.get(a$12)) == null) {
                obj2 = null;
            } else {
                Json.Default r6 = Json.Default;
                r6.getClass();
                obj2 = r6.decodeFromString(str4, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (d2 = workflowSettings2.m) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "successViewBackgroundDrawableId")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                d2 = null;
            }
            if (d2 == null) {
                MiSnapFinalResult.BarcodeSession barcodeSession = miSnapFinalResult instanceof MiSnapFinalResult.BarcodeSession ? (MiSnapFinalResult.BarcodeSession) miSnapFinalResult : null;
                if (barcodeSession == null || (bArr = barcodeSession.b) == null) {
                    bArr = new byte[0];
                }
                b2 = new BitmapDrawable(successView.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } else {
                Context requireContext = requireContext();
                requireContext.getClass();
                b2 = MultipartBody.Companion.b(requireContext, successView.c);
            }
            successView.setBackground(b2);
            String a$13 = a$1();
            if (a$13 == null || (str3 = workflow.get(a$13)) == null) {
                obj3 = null;
            } else {
                Json.Default r62 = Json.Default;
                r62.getClass();
                obj3 = r62.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings3 = (WorkflowSettings) obj3;
            if ((workflowSettings3 == null || (d3 = workflowSettings3.l) == null) && (d3 = MultipartBody.Companion.d(getArguments(), "successViewMessageAnimationId")) == null) {
                companion.getClass();
                d3 = Companion.getDefaultWorkflowSettings(miSnapSettings).l;
            }
            if (d3 != null) {
                int intValue = d3.intValue();
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                successView.setAnimation(MultipartBody.Companion.a(requireContext2, intValue));
            }
            String a$14 = a$1();
            if (a$14 == null || (str2 = workflow.get(a$14)) == null) {
                obj4 = null;
            } else {
                Json.Default r63 = Json.Default;
                r63.getClass();
                obj4 = r63.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings4 = (WorkflowSettings) obj4;
            if ((workflowSettings4 == null || (b3 = workflowSettings4.n) == null) && (b3 = MultipartBody.Companion.b(getArguments(), "successViewShouldVibrate")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b3 = Boolean.TRUE;
            }
            successView.setVibrate(b3.booleanValue());
            String a$15 = a$1();
            if (a$15 == null || (str = workflow.get(a$15)) == null) {
                obj5 = null;
            } else {
                Json.Default r4 = Json.Default;
                r4.getClass();
                obj5 = r4.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings5 = (WorkflowSettings) obj5;
            if ((workflowSettings5 == null || (e = workflowSettings5.o) == null) && (e = MultipartBody.Companion.e(getArguments())) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
            } else {
                str6 = e;
            }
            if (str6 != null) {
                successView.setSoundUri(str6);
            }
            successView.start(new Rum$createMonitor$1(7, this, miSnapSettings, miSnapFinalResult));
            str6 = successView;
        }
        if (str6 == null) {
            MiSnapWorkflowViewModel b4 = b();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            b4.postError$workflow_release(requireContext3, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    public final String a$1() {
        return (String) this.i.getValue();
    }

    public final MiSnapWorkflowViewModel b() {
        return (MiSnapWorkflowViewModel) this.k.getValue();
    }

    public final Float f(MiSnapSettings miSnapSettings, String str) {
        Bundle arguments;
        String str2;
        Float f2;
        String str3;
        String str4;
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        int deviceCurrentBasicOrientation = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(requireActivity);
        MiSnapSettings.Analysis analysis = miSnapSettings.analysis;
        MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
        boolean z = deviceCurrentBasicOrientation == BarcodeAnalysisSettings.getOrientation(analysis.barcode, deviceCurrentBasicOrientation);
        Object obj = null;
        if (z) {
            if (str != null && (str4 = workflow.get(str)) != null) {
                Json.Default r1 = Json.Default;
                r1.getClass();
                obj = r1.decodeFromString(str4, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if (workflowSettings == null || (f2 = workflowSettings.b) == null) {
                arguments = getArguments();
                str2 = "guideViewAlignedScalePercentage";
                f2 = MultipartBody.Companion.c(arguments, str2);
            }
        } else {
            if (str != null && (str3 = workflow.get(str)) != null) {
                Json.Default r12 = Json.Default;
                r12.getClass();
                obj = r12.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj;
            if (workflowSettings2 == null || (f2 = workflowSettings2.c) == null) {
                arguments = getArguments();
                str2 = "guideViewUnalignedScalePercentage";
                f2 = MultipartBody.Companion.c(arguments, str2);
            }
        }
        float floatValue = f2 != null ? f2.floatValue() : -1.0f;
        double d = floatValue;
        if (0.0d <= d && d <= 1.0d) {
            return Float.valueOf(floatValue);
        }
        Companion.getClass();
        if (z) {
            return Companion.getDefaultWorkflowSettings(miSnapSettings).b;
        }
        Companion.getDefaultWorkflowSettings(miSnapSettings);
        return Float.valueOf(0.65f);
    }

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.c getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.c) this.a.getValue((Fragment) this, s[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Integer num;
        super.onDestroyView();
        this.d.cancelAll();
        MibiData.releaseSession(BarcodeAnalysisFragment.class.getName());
        if (this.e) {
            try {
                FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.j);
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
        this.d.pause(this.l);
        MiSnapView miSnapView = getBinding$workflow_release().k;
        FaceAnalysisFragment$$ExternalSyntheticLambda12 faceAnalysisFragment$$ExternalSyntheticLambda12 = this.m;
        if (faceAnalysisFragment$$ExternalSyntheticLambda12 != null) {
            miSnapView.x.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda12);
        }
        BarcodeAnalysisFragment$$ExternalSyntheticLambda6 barcodeAnalysisFragment$$ExternalSyntheticLambda6 = this.n;
        if (barcodeAnalysisFragment$$ExternalSyntheticLambda6 != null) {
            miSnapView.y.removeObserver(barcodeAnalysisFragment$$ExternalSyntheticLambda6);
        }
        BarcodeAnalysisFragment$$ExternalSyntheticLambda6 barcodeAnalysisFragment$$ExternalSyntheticLambda62 = this.o;
        if (barcodeAnalysisFragment$$ExternalSyntheticLambda62 != null) {
            miSnapView.z.removeObserver(barcodeAnalysisFragment$$ExternalSyntheticLambda62);
        }
        miSnapView.C.removeObserver(this.q);
        TorchView torchView = getBinding$workflow_release().n;
        FaceAnalysisFragment$$ExternalSyntheticLambda7 faceAnalysisFragment$$ExternalSyntheticLambda7 = this.p;
        if (faceAnalysisFragment$$ExternalSyntheticLambda7 != null) {
            torchView.b.removeObserver(faceAnalysisFragment$$ExternalSyntheticLambda7);
        }
        torchView.removeObserver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.Observer, com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment$$ExternalSyntheticLambda6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.Observer, com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment$$ExternalSyntheticLambda6] */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Object obj;
        Integer d;
        Object obj2;
        Boolean b2;
        Object obj3;
        Integer d2;
        Object obj4;
        Integer d3;
        Object obj5;
        Boolean b3;
        Object obj6;
        Integer d4;
        Object obj7;
        Integer d5;
        Object obj8;
        Integer d6;
        Object obj9;
        Boolean b4;
        Integer d7;
        int intValue;
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
        super.onResume();
        MiSnapSettings miSnapSettings = (MiSnapSettings) b().f.getValue();
        final int i = 0;
        final int i2 = 1;
        Object obj10 = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MiSnapFinalResult miSnapFinalResult = b().h;
            if (miSnapFinalResult != null) {
                a(b(), miSnapSettings, a$1(), miSnapFinalResult);
                return;
            }
            FaceAnalysisFragment$$ExternalSyntheticLambda12 faceAnalysisFragment$$ExternalSyntheticLambda12 = new FaceAnalysisFragment$$ExternalSyntheticLambda12(s.shouldRecordSession(miSnapSettings.camera.videoRecord), this, i2);
            getBinding$workflow_release().k.x.observe(getViewLifecycleOwner(), faceAnalysisFragment$$ExternalSyntheticLambda12);
            this.m = faceAnalysisFragment$$ExternalSyntheticLambda12;
            getBinding$workflow_release().k.C.observe(getViewLifecycleOwner(), this.q);
            GuideView guideView = getBinding$workflow_release().e;
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            int deviceCurrentBasicOrientation = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(requireActivity);
            Float f2 = f(miSnapSettings, a$1());
            if (f2 != null) {
                guideView.setScale(f2.floatValue());
            }
            String a$1 = a$1();
            if (a$1 == null || (str10 = workflow.get(a$1)) == null) {
                obj = null;
            } else {
                Json.Default r8 = Json.Default;
                r8.getClass();
                obj = r8.decodeFromString(str10, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            Companion companion = Companion;
            if ((workflowSettings == null || (d = workflowSettings.a) == null) && (d = MultipartBody.Companion.d(getArguments(), "guideViewDrawableId")) == null) {
                companion.getClass();
                d = Companion.getDefaultWorkflowSettings(miSnapSettings).a;
            }
            if (d != null) {
                int intValue2 = d.intValue();
                Context requireContext = requireContext();
                requireContext.getClass();
                Drawable b5 = MultipartBody.Companion.b(requireContext, intValue2);
                if (b5 != null) {
                    if (BarcodeAnalysisSettings.getOrientation(miSnapSettings.analysis.barcode, deviceCurrentBasicOrientation) == 1 && deviceCurrentBasicOrientation == 1) {
                        b5 = new DrawableUtil$a(b5, new Drawable[]{b5});
                    }
                    guideView.setDrawable(b5);
                }
            }
            String a$12 = a$1();
            if (a$12 == null || (str9 = workflow.get(a$12)) == null) {
                obj2 = null;
            } else {
                Json.Default r7 = Json.Default;
                r7.getClass();
                obj2 = r7.decodeFromString(str9, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (b2 = workflowSettings2.d) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "guideViewShowVignette")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b2 = Boolean.FALSE;
            }
            guideView.setShowVignette(b2.booleanValue());
            TorchView torchView = getBinding$workflow_release().n;
            String a$13 = a$1();
            if (a$13 == null || (str8 = workflow.get(a$13)) == null) {
                obj3 = null;
            } else {
                Json.Default r72 = Json.Default;
                r72.getClass();
                obj3 = r72.decodeFromString(str8, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings3 = (WorkflowSettings) obj3;
            if ((workflowSettings3 == null || (d2 = workflowSettings3.f) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "torchViewOnDrawableId")) == null) {
                companion.getClass();
                d2 = Companion.getDefaultWorkflowSettings(miSnapSettings).f;
            }
            if (d2 != null) {
                torchView.setTorchOnDrawableId(d2.intValue());
            }
            String a$14 = a$1();
            if (a$14 == null || (str7 = workflow.get(a$14)) == null) {
                obj4 = null;
            } else {
                Json.Default r73 = Json.Default;
                r73.getClass();
                obj4 = r73.decodeFromString(str7, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings4 = (WorkflowSettings) obj4;
            if ((workflowSettings4 == null || (d3 = workflowSettings4.g) == null) && (d3 = MultipartBody.Companion.d(getArguments(), "torchViewOffDrawableId")) == null) {
                companion.getClass();
                d3 = Companion.getDefaultWorkflowSettings(miSnapSettings).g;
            }
            if (d3 != null) {
                torchView.setTorchOffDrawableId(d3.intValue());
            }
            AppCompatImageView appCompatImageView = getBinding$workflow_release().d;
            String a$15 = a$1();
            if (a$15 == null || (str6 = workflow.get(a$15)) == null) {
                obj5 = null;
            } else {
                Json.Default r74 = Json.Default;
                r74.getClass();
                obj5 = r74.decodeFromString(str6, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings5 = (WorkflowSettings) obj5;
            if ((workflowSettings5 == null || (b3 = workflowSettings5.r) == null) && (b3 = MultipartBody.Companion.b(getArguments(), "showCancelButton")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b3 = Boolean.FALSE;
            }
            if (b3.booleanValue()) {
                appCompatImageView.setVisibility(0);
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment$$ExternalSyntheticLambda4
                    public final /* synthetic */ BarcodeAnalysisFragment f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i3 = i;
                        BarcodeAnalysisFragment barcodeAnalysisFragment = this.f$0;
                        switch (i3) {
                            case 0:
                                BarcodeAnalysisFragment.Companion companion2 = BarcodeAnalysisFragment.Companion;
                                barcodeAnalysisFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                break;
                            default:
                                BarcodeAnalysisFragment.Companion companion3 = BarcodeAnalysisFragment.Companion;
                                try {
                                    FragmentKt.findNavController(barcodeAnalysisFragment).navigate(R.id.navigateHelp);
                                    break;
                                } catch (Exception e) {
                                    Log.e("BarcodeAnalysisScreen", "Nav Graph Error", e);
                                    barcodeAnalysisFragment.b().postNavigationError$workflow_release(new NavigationError(e, BarcodeAnalysisFragment.class, barcodeAnalysisFragment.hashCode(), NavigationAction$NavigateNfcSession.INSTANCE));
                                }
                        }
                    }
                });
            }
            String a$16 = a$1();
            if (a$16 == null || (str5 = workflow.get(a$16)) == null) {
                obj6 = null;
            } else {
                Json.Default r75 = Json.Default;
                r75.getClass();
                obj6 = r75.decodeFromString(str5, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings6 = (WorkflowSettings) obj6;
            if ((workflowSettings6 == null || (d4 = workflowSettings6.s) == null) && (d4 = MultipartBody.Companion.d(getArguments(), "cancelButtonDrawableId")) == null) {
                companion.getClass();
                d4 = Companion.getDefaultWorkflowSettings(miSnapSettings).s;
            }
            if (d4 != null) {
                int intValue3 = d4.intValue();
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                appCompatImageView.setImageDrawable(MultipartBody.Companion.b(requireContext2, intValue3));
            }
            AppCompatImageView appCompatImageView2 = getBinding$workflow_release().h;
            String a$17 = a$1();
            if (a$17 == null || (str4 = workflow.get(a$17)) == null) {
                obj7 = null;
            } else {
                Json.Default r76 = Json.Default;
                r76.getClass();
                obj7 = r76.decodeFromString(str4, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings7 = (WorkflowSettings) obj7;
            if ((workflowSettings7 == null || (d5 = workflowSettings7.j) == null) && (d5 = MultipartBody.Companion.d(getArguments(), "helpButtonDrawableId")) == null) {
                companion.getClass();
                d5 = Companion.getDefaultWorkflowSettings(miSnapSettings).j;
            }
            if (d5 != null) {
                int intValue4 = d5.intValue();
                Context requireContext3 = requireContext();
                requireContext3.getClass();
                appCompatImageView2.setImageDrawable(MultipartBody.Companion.b(requireContext3, intValue4));
            }
            appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment$$ExternalSyntheticLambda4
                public final /* synthetic */ BarcodeAnalysisFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    BarcodeAnalysisFragment barcodeAnalysisFragment = this.f$0;
                    switch (i3) {
                        case 0:
                            BarcodeAnalysisFragment.Companion companion2 = BarcodeAnalysisFragment.Companion;
                            barcodeAnalysisFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                            break;
                        default:
                            BarcodeAnalysisFragment.Companion companion3 = BarcodeAnalysisFragment.Companion;
                            try {
                                FragmentKt.findNavController(barcodeAnalysisFragment).navigate(R.id.navigateHelp);
                                break;
                            } catch (Exception e) {
                                Log.e("BarcodeAnalysisScreen", "Nav Graph Error", e);
                                barcodeAnalysisFragment.b().postNavigationError$workflow_release(new NavigationError(e, BarcodeAnalysisFragment.class, barcodeAnalysisFragment.hashCode(), NavigationAction$NavigateNfcSession.INSTANCE));
                            }
                    }
                }
            });
            AppCompatImageView appCompatImageView3 = getBinding$workflow_release().i;
            String a$18 = a$1();
            if (a$18 == null || (str3 = workflow.get(a$18)) == null) {
                obj8 = null;
            } else {
                Json.Default r77 = Json.Default;
                r77.getClass();
                obj8 = r77.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings8 = (WorkflowSettings) obj8;
            if ((workflowSettings8 == null || (d6 = workflowSettings8.e) == null) && (d6 = MultipartBody.Companion.d(getArguments(), "manualButtonDrawableId")) == null) {
                companion.getClass();
                d6 = Companion.getDefaultWorkflowSettings(miSnapSettings).e;
            }
            if (d6 != null) {
                int intValue5 = d6.intValue();
                Context requireContext4 = requireContext();
                requireContext4.getClass();
                appCompatImageView3.setImageDrawable(MultipartBody.Companion.b(requireContext4, intValue5));
            }
            MaterialTextView materialTextView = getBinding$workflow_release().b;
            String a$19 = a$1();
            if (a$19 == null || (str2 = workflow.get(a$19)) == null) {
                obj9 = null;
            } else {
                Json.Default r78 = Json.Default;
                r78.getClass();
                obj9 = r78.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings9 = (WorkflowSettings) obj9;
            if ((workflowSettings9 == null || (b4 = workflowSettings9.t) == null) && (b4 = MultipartBody.Companion.b(getArguments(), "showBarcodeLabel")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b4 = Boolean.FALSE;
            }
            if (b4.booleanValue()) {
                materialTextView.setVisibility(0);
                materialTextView.setAccessibilityHeading(true);
            }
            String a$110 = a$1();
            if (a$110 != null && (str = workflow.get(a$110)) != null) {
                Json.Default r3 = Json.Default;
                r3.getClass();
                obj10 = r3.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings10 = (WorkflowSettings) obj10;
            if ((workflowSettings10 == null || (d7 = workflowSettings10.u) == null) && (d7 = MultipartBody.Companion.d(getArguments(), "barcodeLabelStringId")) == null) {
                companion.getClass();
                d7 = Companion.getDefaultWorkflowSettings(miSnapSettings).u;
            }
            if (d7 != null && (intValue = d7.intValue()) != 0) {
                materialTextView.setText(getString(intValue));
            }
            a(miSnapSettings, a$1(), b());
            obj10 = Unit.INSTANCE;
        }
        if (obj10 == null) {
            MiSnapWorkflowViewModel b6 = b();
            Context requireContext5 = requireContext();
            requireContext5.getClass();
            b6.postError$workflow_release(requireContext5, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        final MiSnapWorkflowViewModel b7 = b();
        ?? r32 = new Observer() { // from class: com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj11) {
                int i3 = i2;
                BarcodeAnalysisFragment barcodeAnalysisFragment = this;
                MiSnapWorkflowViewModel miSnapWorkflowViewModel = b7;
                switch (i3) {
                    case 0:
                        BarcodeAnalysisFragment.a(miSnapWorkflowViewModel, barcodeAnalysisFragment, (MiSnapController.ErrorResult) obj11);
                        break;
                    default:
                        FrameProducer.Event event = (FrameProducer.Event) obj11;
                        BarcodeAnalysisFragment.Companion companion2 = BarcodeAnalysisFragment.Companion;
                        miSnapWorkflowViewModel.getClass();
                        if (event != null) {
                            if ((event instanceof FrameProducer.Event.InitializationError) || (event instanceof FrameProducer.Event.TakePhotoError)) {
                                Context requireContext6 = barcodeAnalysisFragment.requireContext();
                                requireContext6.getClass();
                                miSnapWorkflowViewModel.postError$workflow_release(requireContext6, MiSnapWorkflowError.Camera.INSTANCE);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        getBinding$workflow_release().k.z.observe(getViewLifecycleOwner(), r32);
        this.o = r32;
        final MiSnapWorkflowViewModel b8 = b();
        ?? r2 = new Observer() { // from class: com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj11) {
                int i3 = i;
                BarcodeAnalysisFragment barcodeAnalysisFragment = this;
                MiSnapWorkflowViewModel miSnapWorkflowViewModel = b8;
                switch (i3) {
                    case 0:
                        BarcodeAnalysisFragment.a(miSnapWorkflowViewModel, barcodeAnalysisFragment, (MiSnapController.ErrorResult) obj11);
                        break;
                    default:
                        FrameProducer.Event event = (FrameProducer.Event) obj11;
                        BarcodeAnalysisFragment.Companion companion2 = BarcodeAnalysisFragment.Companion;
                        miSnapWorkflowViewModel.getClass();
                        if (event != null) {
                            if ((event instanceof FrameProducer.Event.InitializationError) || (event instanceof FrameProducer.Event.TakePhotoError)) {
                                Context requireContext6 = barcodeAnalysisFragment.requireContext();
                                requireContext6.getClass();
                                miSnapWorkflowViewModel.postError$workflow_release(requireContext6, MiSnapWorkflowError.Camera.INSTANCE);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        getBinding$workflow_release().k.y.observe(getViewLifecycleOwner(), r2);
        this.n = r2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        this.d.cancelAll();
        MiSnapFinalResult miSnapFinalResult = this.c;
        if (miSnapFinalResult != null) {
            b().h = miSnapFinalResult;
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
            if (bundle.containsKey("orientationKey")) {
                this.f = Integer.valueOf(bundle.getInt("orientationKey"));
            }
            if (bundle.containsKey("loggedTries")) {
                this.g = bundle.getBoolean("loggedTries");
            }
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) b().f.getValue();
        Object obj = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MibiData.Uxp uxp = MibiData.a;
            MibiData.startSession(miSnapSettings, BarcodeAnalysisFragment.class.getName());
            this.h = MibiData.bindSession();
            String a$1 = a$1();
            if (a$1 != null && (str = workflow.get(a$1)) != null) {
                Json.Default r5 = Json.Default;
                r5.getClass();
                obj = r5.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.q) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                Companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b2 = Boolean.TRUE;
            }
            boolean booleanValue = b2.booleanValue();
            this.e = booleanValue;
            if (booleanValue) {
                try {
                    Result.Companion companion = Result.Companion;
                    FragmentKt.findNavController(this).addOnDestinationChangedListener(this.j);
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
            MiSnapWorkflowViewModel b3 = b();
            Context requireContext = requireContext();
            requireContext.getClass();
            b3.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        MaterialTextView materialTextView = (MaterialTextView) getBinding$workflow_release().j.c;
        float f2 = materialTextView.getContext().getResources().getConfiguration().fontScale;
        if (f2 > 1.0f) {
            com.miteksystems.misnap.workflow.a.b.a(materialTextView, f2);
        }
        MaterialTextView materialTextView2 = getBinding$workflow_release().b;
        float f3 = materialTextView2.getContext().getResources().getConfiguration().fontScale;
        if (f3 <= 1.0f) {
            return;
        }
        com.miteksystems.misnap.workflow.a.b.a(materialTextView2, f3);
    }

    public final void startSession$workflow_release(MiSnapSettings miSnapSettings, String str, MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
        miSnapWorkflowViewModel.getClass();
        getBinding$workflow_release().k.z.observe(getViewLifecycleOwner(), new f(miSnapSettings, miSnapWorkflowViewModel));
        MiSnapView.startMiSnapSession$default(getBinding$workflow_release().k, miSnapSettings, getViewLifecycleOwner(), new AndroidPopup_androidKt$Popup$3$1(miSnapSettings, this, miSnapWorkflowViewModel, str, 7), 4);
    }

    @Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Integer a;
        public final Float b;
        public final Float c;
        public final Boolean d;
        public final Integer e;
        public final Integer f;
        public final Integer g;
        public final Integer h;
        public final Integer i;
        public final Integer j;
        public final Integer k;
        public final Integer l;
        public final Integer m;
        public final Boolean n;
        public final String o;
        public final ReviewCondition p;
        public final Boolean q;
        public final Boolean r;
        public final Integer s;
        public final Boolean t;
        public final Integer u;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/BarcodeAnalysisFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/BarcodeAnalysisFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return BarcodeAnalysisFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Integer num, Float f, Float f2, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Boolean bool2, String str, ReviewCondition reviewCondition, Boolean bool3, Boolean bool4, Integer num11, Boolean bool5, Integer num12) {
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
                this.f = num3;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = num4;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = num5;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = num6;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = num7;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = num8;
            }
            if ((i & 2048) == 0) {
                this.l = null;
            } else {
                this.l = num9;
            }
            if ((i & 4096) == 0) {
                this.m = null;
            } else {
                this.m = num10;
            }
            if ((i & PKIFailureInfo.certRevoked) == 0) {
                this.n = null;
            } else {
                this.n = bool2;
            }
            if ((i & 16384) == 0) {
                this.o = null;
            } else {
                this.o = str;
            }
            if ((32768 & i) == 0) {
                this.p = null;
            } else {
                this.p = reviewCondition;
            }
            if ((65536 & i) == 0) {
                this.q = null;
            } else {
                this.q = bool3;
            }
            if ((131072 & i) == 0) {
                this.r = null;
            } else {
                this.r = bool4;
            }
            if ((262144 & i) == 0) {
                this.s = null;
            } else {
                this.s = num11;
            }
            if ((524288 & i) == 0) {
                this.t = null;
            } else {
                this.t = bool5;
            }
            if ((i & PKIFailureInfo.badCertTemplate) == 0) {
                this.u = null;
            } else {
                this.u = num12;
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
            return Intrinsics.areEqual(this.a, workflowSettings.a) && Intrinsics.areEqual((Object) this.b, (Object) workflowSettings.b) && Intrinsics.areEqual((Object) this.c, (Object) workflowSettings.c) && Intrinsics.areEqual(this.d, workflowSettings.d) && Intrinsics.areEqual(this.e, workflowSettings.e) && Intrinsics.areEqual(this.f, workflowSettings.f) && Intrinsics.areEqual(this.g, workflowSettings.g) && Intrinsics.areEqual(this.h, workflowSettings.h) && Intrinsics.areEqual(this.i, workflowSettings.i) && Intrinsics.areEqual(this.j, workflowSettings.j) && Intrinsics.areEqual(this.k, workflowSettings.k) && Intrinsics.areEqual(this.l, workflowSettings.l) && Intrinsics.areEqual(this.m, workflowSettings.m) && Intrinsics.areEqual(this.n, workflowSettings.n) && Intrinsics.areEqual(this.o, workflowSettings.o) && this.p == workflowSettings.p && Intrinsics.areEqual(this.q, workflowSettings.q) && Intrinsics.areEqual(this.r, workflowSettings.r) && Intrinsics.areEqual(this.s, workflowSettings.s) && Intrinsics.areEqual(this.t, workflowSettings.t) && Intrinsics.areEqual(this.u, workflowSettings.u);
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
            Integer num3 = this.f;
            int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.g;
            int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.h;
            int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.i;
            int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.j;
            int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.k;
            int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.l;
            int hashCode12 = (hashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Integer num10 = this.m;
            int hashCode13 = (hashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
            Boolean bool2 = this.n;
            int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.o;
            int hashCode15 = (hashCode14 + (str == null ? 0 : str.hashCode())) * 31;
            ReviewCondition reviewCondition = this.p;
            int hashCode16 = (hashCode15 + (reviewCondition == null ? 0 : reviewCondition.hashCode())) * 31;
            Boolean bool3 = this.q;
            int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.r;
            int hashCode18 = (hashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Integer num11 = this.s;
            int hashCode19 = (hashCode18 + (num11 == null ? 0 : num11.hashCode())) * 31;
            Boolean bool5 = this.t;
            int hashCode20 = (hashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Integer num12 = this.u;
            return hashCode20 + (num12 != null ? num12.hashCode() : 0);
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }

        public WorkflowSettings(Integer num, Float f, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11) {
            Float valueOf = Float.valueOf(0.65f);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            this.a = num;
            this.b = f;
            this.c = valueOf;
            this.d = bool;
            this.e = num2;
            this.f = num3;
            this.g = num4;
            this.h = num5;
            this.i = num6;
            this.j = num7;
            this.k = num8;
            this.l = num9;
            this.m = null;
            this.n = bool2;
            this.o = null;
            this.p = ReviewCondition.WARNINGS;
            this.q = bool2;
            this.r = bool;
            this.s = num10;
            this.t = bool;
            this.u = num11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r5.isEmpty() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (com.miteksystems.misnap.barcode.BarcodeAnalysisSettings.requireTrigger(r5.analysis.barcode) == com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode.Trigger.AUTO) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MiSnapWorkflowViewModel miSnapWorkflowViewModel, MiSnapSettings miSnapSettings, String str, MiSnapFinalResult miSnapFinalResult) {
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
        if (workflowSettings == null || (reviewCondition = workflowSettings.p) == null) {
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
                    MiSnapFinalResult.BarcodeSession barcodeSession = miSnapFinalResult instanceof MiSnapFinalResult.BarcodeSession ? (MiSnapFinalResult.BarcodeSession) miSnapFinalResult : null;
                    if (barcodeSession == null || (r5 = barcodeSession.e) == null) {
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
            Log.e("BarcodeAnalysisScreen", "Nav Graph Error", e);
            miSnapWorkflowViewModel.postResults$workflow_release(miSnapFinalResult);
        }
    }

    public static final void a(MiSnapWorkflowViewModel miSnapWorkflowViewModel, BarcodeAnalysisFragment barcodeAnalysisFragment, MiSnapController.ErrorResult errorResult) {
        miSnapWorkflowViewModel.getClass();
        if (errorResult != null) {
            if (errorResult instanceof MiSnapController.ErrorResult.BarcodeAnalysis) {
                MiSnapController.ErrorResult.BarcodeAnalysis barcodeAnalysis = (MiSnapController.ErrorResult.BarcodeAnalysis) errorResult;
                if (barcodeAnalysis.a instanceof MiSnapBarcodeAnalyzer.Result.Failure.License) {
                    Context requireContext = barcodeAnalysisFragment.requireContext();
                    requireContext.getClass();
                    MiSnapBarcodeAnalyzer.Result.Failure.License license = barcodeAnalysis.a;
                    license.getClass();
                    miSnapWorkflowViewModel.postError$workflow_release(requireContext, new MiSnapWorkflowError.License(license.getReason()));
                    return;
                }
            }
            if (errorResult instanceof MiSnapController.ErrorResult.BarcodeDetection) {
                MiSnapController.ErrorResult.BarcodeDetection barcodeDetection = (MiSnapController.ErrorResult.BarcodeDetection) errorResult;
                if (barcodeDetection.a instanceof MiSnapBarcodeDetector.Result.Failure.License) {
                    Context requireContext2 = barcodeAnalysisFragment.requireContext();
                    requireContext2.getClass();
                    MiSnapBarcodeDetector.Result.Failure.License license2 = barcodeDetection.a;
                    license2.getClass();
                    miSnapWorkflowViewModel.postError$workflow_release(requireContext2, new MiSnapWorkflowError.License(license2.getReason()));
                    return;
                }
            }
            Context requireContext3 = barcodeAnalysisFragment.requireContext();
            requireContext3.getClass();
            miSnapWorkflowViewModel.postError$workflow_release(requireContext3, MiSnapWorkflowError.Analysis.INSTANCE);
        }
    }

    public final void a(MiSnapSettings miSnapSettings, String str, MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
        Context requireContext = requireContext();
        requireContext.getClass();
        if (AndroidPlatform.Companion.hasPermission(requireContext, "android.permission.CAMERA")) {
            startSession$workflow_release(miSnapSettings, str, miSnapWorkflowViewModel);
            return;
        }
        if (shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(requireContext());
            materialAlertDialogBuilder.setTitle(R.string.misnapWorkflowCameraPermissionBarcodeRationaleTitle);
            materialAlertDialogBuilder.setMessage(R.string.misnapWorkflowCameraPermissionBarcodeRationaleMessage);
            materialAlertDialogBuilder.P.mOnDismissListener = new HelpFragment$$ExternalSyntheticLambda4(this, 1);
            materialAlertDialogBuilder.setPositiveButton(R.string.misnapWorkflowCameraPermissionBarcodeRationaleButtonConfirmLabel, (DialogInterface.OnClickListener) null).show();
            return;
        }
        this.r.launch("android.permission.CAMERA");
    }
}

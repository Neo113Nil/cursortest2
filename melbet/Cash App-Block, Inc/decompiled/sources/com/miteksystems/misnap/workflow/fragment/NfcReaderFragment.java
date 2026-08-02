package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda5;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import androidx.transition.Transition;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.gif.internal.UtilsKt$animatable2CallbackOf$1;
import coil3.size.DimensionKt;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.nfc.MiSnapNfcReader;
import com.miteksystems.misnap.nfc.NfcSettings;
import com.miteksystems.misnap.nfc.util.NfcDocumentUtil;
import com.miteksystems.misnap.nfc.util.NfcUtil;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.j;
import com.miteksystems.misnap.workflow.a.r;
import com.miteksystems.misnap.workflow.util.TextUtil;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.squareup.cash.R;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.Json;
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.MultipartBody;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcReaderFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NfcReaderFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public /* synthetic */ MiSnapNfcReader b;
    public AlertDialog c;
    public AlertDialog d;
    public StandaloneCoroutine e;
    public boolean f;
    public Integer g;
    public final Lazy h;
    public final HelpFragment$$ExternalSyntheticLambda2 i;
    public final Lazy j;
    public static final /* synthetic */ KProperty[] k = {Reflection.factory.property1(new PropertyReference1Impl(NfcReaderFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcReaderBinding;", 0))};
    public static final Companion Companion = new Companion();

    public final class Companion {
        public static WorkflowSettings getDefaultWorkflowSettings(Context context, MiSnapSettings miSnapSettings) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            MiSnapSettings.Nfc nfc;
            Mrz mrz;
            Integer num6;
            Integer num7;
            Integer num8;
            Integer num9;
            Integer num10 = null;
            if (context == null || (mrz = (nfc = miSnapSettings.nfc).a) == null) {
                num = null;
                num2 = null;
                num3 = null;
                num4 = null;
                num5 = null;
            } else {
                try {
                    Result.Companion companion = Result.Companion;
                    MiSnapSettings.Nfc.Advanced.DocType requireDocType = NfcSettings.requireDocType(nfc);
                    num6 = Integer.valueOf(r.a(context, requireDocType, mrz, 1));
                    try {
                        num7 = Integer.valueOf(r.a(context, requireDocType, mrz, 2));
                        try {
                            num8 = Integer.valueOf(r.a(context, requireDocType, mrz, 3));
                            try {
                                num9 = Integer.valueOf(r.a(context, requireDocType, mrz, 4));
                                try {
                                    num10 = Integer.valueOf(r.a(context, requireDocType, mrz));
                                } catch (Throwable unused) {
                                    Result.Companion companion2 = Result.Companion;
                                    num5 = num10;
                                    num = num6;
                                    num2 = num7;
                                    num3 = num8;
                                    num4 = num9;
                                    return new WorkflowSettings(num, num2, num3, num4, num5);
                                }
                            } catch (Throwable unused2) {
                                num9 = null;
                            }
                        } catch (Throwable unused3) {
                            num8 = null;
                            num9 = num8;
                            Result.Companion companion22 = Result.Companion;
                            num5 = num10;
                            num = num6;
                            num2 = num7;
                            num3 = num8;
                            num4 = num9;
                            return new WorkflowSettings(num, num2, num3, num4, num5);
                        }
                    } catch (Throwable unused4) {
                        num7 = null;
                        num8 = num7;
                        num9 = num8;
                        Result.Companion companion222 = Result.Companion;
                        num5 = num10;
                        num = num6;
                        num2 = num7;
                        num3 = num8;
                        num4 = num9;
                        return new WorkflowSettings(num, num2, num3, num4, num5);
                    }
                } catch (Throwable unused5) {
                    num6 = null;
                    num7 = null;
                }
                num5 = num10;
                num = num6;
                num2 = num7;
                num3 = num8;
                num4 = num9;
            }
            return new WorkflowSettings(num, num2, num3, num4, num5);
        }
    }

    public abstract /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CameraSelector$$ExternalSyntheticOutline0.values(4).length];
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

    public final /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public static final c a = new c(1, j.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcReaderBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.needHelp;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.needHelp);
            if (materialButton != null) {
                i = R.id.readProgress;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) ViewBindings.findChildViewById(view, R.id.readProgress);
                if (linearProgressIndicator != null) {
                    i = R.id.readingStatus;
                    MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.readingStatus);
                    if (materialTextView != null) {
                        i = R.id.scanAnimation;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.scanAnimation);
                        if (appCompatImageView != null) {
                            i = R.id.scanInstructions;
                            MaterialTextView materialTextView2 = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.scanInstructions);
                            if (materialTextView2 != null) {
                                i = R.id.skip;
                                MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.skip);
                                if (materialButton2 != null) {
                                    i = R.id.tryAgain;
                                    MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.tryAgain);
                                    if (materialButton3 != null) {
                                        return new j((ConstraintLayout) view, materialButton, linearProgressIndicator, materialTextView, appCompatImageView, materialTextView2, materialButton2, materialButton3);
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
        public final /* synthetic */ NfcReaderFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(NfcReaderFragment nfcReaderFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = nfcReaderFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            NfcReaderFragment nfcReaderFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(nfcReaderFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = nfcReaderFragment.requireActivity();
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

    public final class f extends Lambda implements Function0 {
        public final /* synthetic */ MiSnapNfcReader.Result b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MiSnapNfcReader.Result result) {
            super(0);
            this.b = result;
        }

        public final void a() {
            MiSnapWorkflowViewModel c$3;
            MiSnapFinalResult.NfcSession nfcSession;
            NfcReaderFragment nfcReaderFragment = NfcReaderFragment.this;
            try {
                try {
                    FragmentKt.findNavController(nfcReaderFragment).navigate(R.id.navigateContinue);
                    c$3 = nfcReaderFragment.c$3();
                    nfcSession = new MiSnapFinalResult.NfcSession(this.b.getChipData(), this.b.getMisnapMibiData(), this.b.getLicenseExpired());
                } catch (Exception e) {
                    Log.e("nfcReaderFragment", "Nav Graph Error", e);
                    Companion companion = NfcReaderFragment.Companion;
                    c$3 = nfcReaderFragment.c$3();
                    nfcSession = new MiSnapFinalResult.NfcSession(this.b.getChipData(), this.b.getMisnapMibiData(), this.b.getLicenseExpired());
                }
                c$3.postResults$workflow_release(nfcSession);
            } catch (Throwable th) {
                Companion companion2 = NfcReaderFragment.Companion;
                nfcReaderFragment.c$3().postResults$workflow_release(new MiSnapFinalResult.NfcSession(this.b.getChipData(), this.b.getMisnapMibiData(), this.b.getLicenseExpired()));
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapNfcReader.Event event = (MiSnapNfcReader.Event) obj;
            if (event != null) {
                NfcReaderFragment.this.onNfcEvent$workflow_release(event);
            }
            return Unit.INSTANCE;
        }
    }

    public final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Integer a;
            MiSnapNfcReader.Result result = (MiSnapNfcReader.Result) obj;
            if (result != null) {
                NfcReaderFragment nfcReaderFragment = NfcReaderFragment.this;
                nfcReaderFragment.getBinding$workflow_release().l.setVisibility(8);
                nfcReaderFragment.getBinding$workflow_release().i.setVisibility(8);
                nfcReaderFragment.getBinding$workflow_release().j.setVisibility(0);
                MaterialTextView materialTextView = nfcReaderFragment.getBinding$workflow_release().j;
                String string2 = nfcReaderFragment.getString(R.string.misnapWorkflowNfcReaderFragmentReadCompleteMessage);
                string2.getClass();
                TextUtil.setHtmlText(materialTextView, string2);
                Context requireContext = nfcReaderFragment.requireContext();
                requireContext.getClass();
                Object systemService = requireContext.getSystemService("accessibility");
                Unit unit = null;
                AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    nfcReaderFragment.getBinding$workflow_release().j.sendAccessibilityEvent(8);
                }
                MiSnapSettings miSnapSettings = (MiSnapSettings) nfcReaderFragment.c$3().f.getValue();
                if (miSnapSettings != null && (a = nfcReaderFragment.a(miSnapSettings, nfcReaderFragment.b$3(), 3)) != null) {
                    nfcReaderFragment.a(a.intValue(), nfcReaderFragment.new f(result));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    MiSnapWorkflowViewModel c$3 = nfcReaderFragment.c$3();
                    Context requireContext2 = nfcReaderFragment.requireContext();
                    requireContext2.getClass();
                    c$3.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapNfcReader.Error error = (MiSnapNfcReader.Error) obj;
            if (error != null) {
                NfcReaderFragment.this.onNfcError$workflow_release(error);
            }
            return Unit.INSTANCE;
        }
    }

    public NfcReaderFragment() {
        super(R.layout.misnap_fragment_nfc_reader);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, c.a);
        this.f = true;
        this.h = LazyKt.lazy(new d(this, 0));
        this.i = new HelpFragment$$ExternalSyntheticLambda2(this, 7);
        this.j = LazyKt.lazy(new d(this, 1));
    }

    public static final void e(NfcReaderFragment nfcReaderFragment) {
        nfcReaderFragment.getClass();
        FragmentActivity requireActivity = nfcReaderFragment.requireActivity();
        requireActivity.getClass();
        NfcUtil.enableNfc(requireActivity);
    }

    public final Integer a(MiSnapSettings miSnapSettings, String str, int i2) {
        Integer num;
        String str2;
        Integer num2;
        String str3;
        Integer num3;
        String str4;
        Integer num4;
        String str5;
        MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
        int i3 = b.a[CameraSelector$$ExternalSyntheticOutline0.ordinal(i2)];
        Companion companion = Companion;
        Object obj = null;
        if (i3 == 1) {
            if (str != null && (str2 = workflow.get(str)) != null) {
                Json.Default r7 = Json.Default;
                r7.getClass();
                obj = r7.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if (workflowSettings != null && (num = workflowSettings.a) != null) {
                return num;
            }
            Integer d2 = MultipartBody.Companion.d(getArguments(), "scanInstructionsSearchingDrawableId");
            if (d2 != null) {
                return d2;
            }
            Context requireContext = requireContext();
            companion.getClass();
            return Companion.getDefaultWorkflowSettings(requireContext, miSnapSettings).a;
        }
        if (i3 == 2) {
            if (str != null && (str3 = workflow.get(str)) != null) {
                Json.Default r72 = Json.Default;
                r72.getClass();
                obj = r72.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj;
            if (workflowSettings2 != null && (num2 = workflowSettings2.b) != null) {
                return num2;
            }
            Integer d3 = MultipartBody.Companion.d(getArguments(), "scanInstructionsReadingDrawableId");
            if (d3 != null) {
                return d3;
            }
            Context requireContext2 = requireContext();
            companion.getClass();
            return Companion.getDefaultWorkflowSettings(requireContext2, miSnapSettings).b;
        }
        if (i3 == 3) {
            if (str != null && (str4 = workflow.get(str)) != null) {
                Json.Default r73 = Json.Default;
                r73.getClass();
                obj = r73.decodeFromString(str4, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings3 = (WorkflowSettings) obj;
            if (workflowSettings3 != null && (num3 = workflowSettings3.c) != null) {
                return num3;
            }
            Integer d4 = MultipartBody.Companion.d(getArguments(), "scanInstructionsSuccessDrawableId");
            if (d4 != null) {
                return d4;
            }
            Context requireContext3 = requireContext();
            companion.getClass();
            return Companion.getDefaultWorkflowSettings(requireContext3, miSnapSettings).c;
        }
        if (i3 != 4) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (str != null && (str5 = workflow.get(str)) != null) {
            Json.Default r74 = Json.Default;
            r74.getClass();
            obj = r74.decodeFromString(str5, WorkflowSettings.Companion.serializer());
        }
        WorkflowSettings workflowSettings4 = (WorkflowSettings) obj;
        if (workflowSettings4 != null && (num4 = workflowSettings4.d) != null) {
            return num4;
        }
        Integer d5 = MultipartBody.Companion.d(getArguments(), "scanInstructionsFailureDrawableId");
        if (d5 != null) {
            return d5;
        }
        Context requireContext4 = requireContext();
        companion.getClass();
        return Companion.getDefaultWorkflowSettings(requireContext4, miSnapSettings).d;
    }

    public final void a$4$1() {
        StandaloneCoroutine standaloneCoroutine = this.e;
        if (standaloneCoroutine != null) {
            if (standaloneCoroutine.isActive()) {
                standaloneCoroutine.cancel(null);
            }
            this.e = null;
        }
    }

    public final String b$3() {
        return (String) this.h.getValue();
    }

    public final MiSnapWorkflowViewModel c$3() {
        return (MiSnapWorkflowViewModel) this.j.getValue();
    }

    public final void e$3() {
        try {
            FragmentKt.findNavController(this).navigate(R.id.navigateSkip);
        } catch (Exception e) {
            Log.e("nfcReaderFragment", "Nav Graph Error", e);
            c$3().postNavigationError$workflow_release(new NavigationError(e, NfcReaderFragment.class, hashCode(), NavigationAction$NavigateNfcSession.INSTANCE$2));
        }
        MiSnapWorkflowViewModel c$3 = c$3();
        Context requireContext = requireContext();
        requireContext.getClass();
        c$3.postError$workflow_release(requireContext, MiSnapWorkflowError.Nfc.Skipped.INSTANCE);
    }

    public final void g$3() {
        MiSnapNfcReader miSnapNfcReader = this.b;
        if (miSnapNfcReader != null) {
            miSnapNfcReader.getEvents().observe(getViewLifecycleOwner(), new LiveDataObservable$$ExternalSyntheticLambda5(new g(), 9));
            miSnapNfcReader.getCompletedEvent().observe(getViewLifecycleOwner(), new LiveDataObservable$$ExternalSyntheticLambda5(new h(), 10));
            miSnapNfcReader.getErrorEvents().observe(getViewLifecycleOwner(), new LiveDataObservable$$ExternalSyntheticLambda5(new i(), 8));
        }
    }

    public final /* synthetic */ j getBinding$workflow_release() {
        return (j) this.a.getValue((Fragment) this, k[0]);
    }

    public final void i$1() {
        getBinding$workflow_release().i.setVisibility(8);
        getBinding$workflow_release().i.setIndeterminate(true);
        getBinding$workflow_release().i.setProgressCompat(0, false);
    }

    public final void j() {
        MiSnapNfcReader miSnapNfcReader = this.b;
        if (miSnapNfcReader != null) {
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            miSnapNfcReader.cancel(requireActivity);
        }
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(requireContext());
        materialAlertDialogBuilder.P.mCancelable = false;
        MaterialAlertDialogBuilder title = materialAlertDialogBuilder.setTitle(getString(R.string.misnapWorkflowNfcReaderFragmentFailoverPopupTitle));
        title.setMessage(R.string.misnapWorkflowNfcReaderFragmentFailoverPopupMessage);
        MaterialAlertDialogBuilder negativeButton = title.setPositiveButton(R.string.misnapWorkflowNfcReaderFragmentFailoverPopupButtonHelpLabel, (DialogInterface.OnClickListener) new NfcReaderFragment$$ExternalSyntheticLambda4(this, 3)).setNegativeButton(R.string.misnapWorkflowNfcReaderFragmentFailoverPopupButtonRetryLabel, (DialogInterface.OnClickListener) new NfcReaderFragment$$ExternalSyntheticLambda4(this, 4));
        NfcReaderFragment$$ExternalSyntheticLambda4 nfcReaderFragment$$ExternalSyntheticLambda4 = new NfcReaderFragment$$ExternalSyntheticLambda4(this, 5);
        AlertController.AlertParams alertParams = negativeButton.P;
        alertParams.mNeutralButtonText = alertParams.mContext.getText(R.string.misnapWorkflowNfcReaderFragmentFailoverPopupButtonSkipLabel);
        alertParams.mNeutralButtonListener = nfcReaderFragment$$ExternalSyntheticLambda4;
        this.d = negativeButton.show();
    }

    public final void k() {
        MiSnapNfcReader miSnapNfcReader = this.b;
        if (miSnapNfcReader != null) {
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            miSnapNfcReader.cancel(requireActivity);
        }
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(requireContext());
        AlertController.AlertParams alertParams = materialAlertDialogBuilder.P;
        alertParams.mCancelable = false;
        alertParams.mView = null;
        alertParams.mViewLayoutResId = R.layout.misnap_fragment_nfc_need_help_dialog_content;
        materialAlertDialogBuilder.setTitle(R.string.misnapWorkflowNfcReaderFragmentHelpPopupTitleLabel);
        AlertDialog show = materialAlertDialogBuilder.setPositiveButton(R.string.misnapWorkflowNfcReaderFragmentHelpPopupButtonOkayLabel, (DialogInterface.OnClickListener) new NfcReaderFragment$$ExternalSyntheticLambda4(this, 0)).show();
        LinearLayout linearLayout = (LinearLayout) show.findViewById(R.id.misnapWorkflowNfcReaderFragmentHelpBulletsLayout);
        if (linearLayout != null) {
            Iterator it = new ViewGroupKt$children$1(linearLayout).iterator();
            while (true) {
                ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
                if (!viewGroupKt$iterator$1.hasNext()) {
                    break;
                }
                View view = (View) viewGroupKt$iterator$1.next();
                if (view instanceof MaterialTextView) {
                    TextView textView = (TextView) view;
                    float f2 = textView.getContext().getResources().getConfiguration().fontScale;
                    if (f2 > 1.0f) {
                        com.miteksystems.misnap.workflow.a.b.a(textView, f2);
                    }
                }
            }
        }
        this.c = show;
    }

    public final void m() {
        Integer d2;
        int intValue;
        String str;
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$3().f.getValue();
        Object obj = null;
        if (miSnapSettings != null) {
            Integer a = a(miSnapSettings, b$3(), 1);
            if (a != null) {
                a(a.intValue(), (f) null);
            }
            String b$3 = b$3();
            if (b$3 != null && (str = miSnapSettings.workflow.get(b$3)) != null) {
                Json.Default r1 = Json.Default;
                r1.getClass();
                obj = r1.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if ((workflowSettings == null || (d2 = workflowSettings.e) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "scanInstructionsTextId")) == null) {
                Context requireContext = requireContext();
                Companion.getClass();
                d2 = Companion.getDefaultWorkflowSettings(requireContext, miSnapSettings).e;
            }
            if (d2 != null && (intValue = d2.intValue()) != 0) {
                MaterialTextView materialTextView = getBinding$workflow_release().l;
                String string2 = getString(intValue);
                string2.getClass();
                TextUtil.setHtmlText(materialTextView, string2);
            }
            getBinding$workflow_release().l.setVisibility(0);
            getBinding$workflow_release().j.setVisibility(8);
            obj = Unit.INSTANCE;
        }
        if (obj == null) {
            MiSnapWorkflowViewModel c$3 = c$3();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            c$3.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Integer num;
        super.onDestroyView();
        if (this.f) {
            try {
                FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.i);
            } catch (Exception unused) {
                if (requireActivity().isChangingConfigurations() || (num = this.g) == null) {
                    return;
                }
                requireActivity().setRequestedOrientation(num.intValue());
            }
        }
    }

    public final void onNfcError$workflow_release(MiSnapNfcReader.Error error) {
        Unit unit;
        Integer a;
        error.getClass();
        MiSnapNfcReader miSnapNfcReader = this.b;
        if (miSnapNfcReader != null) {
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            miSnapNfcReader.cancel(requireActivity);
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$3().f.getValue();
        if (miSnapSettings == null || (a = a(miSnapSettings, b$3(), 4)) == null) {
            unit = null;
        } else {
            a(a.intValue(), (f) null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel c$3 = c$3();
            Context requireContext = requireContext();
            requireContext.getClass();
            c$3.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        getBinding$workflow_release().n.setVisibility(0);
        getBinding$workflow_release().j.setVisibility(0);
        getBinding$workflow_release().l.setVisibility(8);
        getBinding$workflow_release().i.setVisibility(8);
        getBinding$workflow_release().h.setVisibility(0);
        MaterialTextView materialTextView = getBinding$workflow_release().j;
        String string2 = getString(R.string.misnapWorkflowNfcReaderFragmentReadFailedMessage);
        string2.getClass();
        TextUtil.setHtmlText(materialTextView, string2);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        Object systemService = requireContext2.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            getBinding$workflow_release().j.sendAccessibilityEvent(8);
        }
        getBinding$workflow_release().m.setVisibility(0);
        getBinding$workflow_release().m.setOnClickListener(new NfcReaderFragment$$ExternalSyntheticLambda0(this, 0));
        if (error.equals(MiSnapNfcReader.Error.Device.NfcNotSupported.INSTANCE)) {
            MiSnapWorkflowViewModel c$32 = c$3();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            c$32.postError$workflow_release(requireContext3, MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE);
            return;
        }
        if (error.equals(MiSnapNfcReader.Error.Device.NfcNotEnabled.INSTANCE)) {
            MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(requireContext());
            materialAlertDialogBuilder.P.mCancelable = false;
            materialAlertDialogBuilder.setTitle(R.string.misnapWorkflowNfcEnablePopupTitle);
            materialAlertDialogBuilder.setMessage(R.string.misnapWorkflowNfcEnablePopupMessage);
            materialAlertDialogBuilder.setPositiveButton(R.string.misnapWorkflowNfcReaderFragmentHelpPopupButtonOkayLabel, (DialogInterface.OnClickListener) new NfcReaderFragment$$ExternalSyntheticLambda4(this, 1)).setNegativeButton(R.string.misnapWorkflowNfcEnablePopupCancelLabel, (DialogInterface.OnClickListener) new NfcReaderFragment$$ExternalSyntheticLambda4(this, 2)).show();
            return;
        }
        if (error.equals(MiSnapNfcReader.Error.Chip.Unlock.INSTANCE)) {
            MiSnapWorkflowViewModel c$33 = c$3();
            Context requireContext4 = requireContext();
            requireContext4.getClass();
            c$33.postError$workflow_release(requireContext4, MiSnapWorkflowError.Nfc.InvalidCredentials.INSTANCE);
            return;
        }
        if (error instanceof MiSnapNfcReader.Error.Licensing) {
            MiSnapWorkflowViewModel c$34 = c$3();
            Context requireContext5 = requireContext();
            requireContext5.getClass();
            c$34.postError$workflow_release(requireContext5, new MiSnapWorkflowError.License(((MiSnapNfcReader.Error.Licensing) error).getReason()));
        }
    }

    public final void onNfcEvent$workflow_release(MiSnapNfcReader.Event event) {
        Integer a;
        event.getClass();
        if (!event.equals(MiSnapNfcReader.Event.NfcChipDetected.INSTANCE)) {
            if (event.equals(MiSnapNfcReader.Event.NfcChipUnlocked.INSTANCE)) {
                getBinding$workflow_release().i.setIndeterminate(false);
                getBinding$workflow_release().i.setProgressCompat(1, true);
                getBinding$workflow_release().i.sendAccessibilityEvent(8);
                return;
            } else {
                if (event instanceof MiSnapNfcReader.Event.NfcChipAuthentication) {
                    getBinding$workflow_release().i.setProgressCompat(2, false);
                    return;
                }
                if (event instanceof MiSnapNfcReader.Event.NfcDataGroupReadComplete) {
                    MiSnapNfcReader.Event.NfcDataGroupReadComplete nfcDataGroupReadComplete = (MiSnapNfcReader.Event.NfcDataGroupReadComplete) event;
                    if (nfcDataGroupReadComplete.getDataReadStep() == MiSnapNfcReader.Event.DataReadStep.CARD_HOLDER_DETAILS) {
                        getBinding$workflow_release().i.setProgressCompat(3, true);
                        return;
                    } else {
                        if (nfcDataGroupReadComplete.getDataReadStep() == MiSnapNfcReader.Event.DataReadStep.CARD_HOLDER_PHOTO) {
                            getBinding$workflow_release().i.setProgressCompat(4, true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        getBinding$workflow_release().j.setVisibility(0);
        getBinding$workflow_release().l.setVisibility(8);
        getBinding$workflow_release().n.setVisibility(8);
        getBinding$workflow_release().m.setVisibility(4);
        getBinding$workflow_release().h.setVisibility(8);
        getBinding$workflow_release().i.setVisibility(0);
        MaterialTextView materialTextView = getBinding$workflow_release().j;
        String string2 = getString(R.string.misnapWorkflowNfcReaderFragmentChipFoundMessage);
        string2.getClass();
        TextUtil.setHtmlText(materialTextView, string2);
        Context requireContext = requireContext();
        requireContext.getClass();
        Object systemService = requireContext.getSystemService("accessibility");
        Unit unit = null;
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            getBinding$workflow_release().j.sendAccessibilityEvent(8);
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$3().f.getValue();
        if (miSnapSettings != null && (a = a(miSnapSettings, b$3(), 2)) != null) {
            a(a.intValue(), (f) null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel c$3 = c$3();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            c$3.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        a$4$1();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AlertDialog alertDialog = this.d;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            this.d = null;
        }
        AlertDialog alertDialog2 = this.c;
        if (alertDialog2 != null) {
            if (alertDialog2.isShowing()) {
                alertDialog2.dismiss();
            }
            this.c = null;
        }
        Window window = requireActivity().getWindow();
        window.getClass();
        window.clearFlags(128);
        Drawable drawable = getBinding$workflow_release().k.getDrawable();
        if (drawable != null) {
            if (drawable instanceof AnimatedVectorDrawableCompat) {
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawable;
                Drawable drawable2 = animatedVectorDrawableCompat.mDelegateDrawable;
                if (drawable2 != null) {
                    AnimatedVectorDrawableCompat.Api23Impl.clearAnimationCallbacks(drawable2);
                } else {
                    Transition.AnonymousClass3 anonymousClass3 = animatedVectorDrawableCompat.mAnimatorListener;
                    if (anonymousClass3 != null) {
                        animatedVectorDrawableCompat.mAnimatedVectorState.mAnimatorSet.removeListener(anonymousClass3);
                        animatedVectorDrawableCompat.mAnimatorListener = null;
                    }
                    ArrayList arrayList = animatedVectorDrawableCompat.mAnimationCallbacks;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
            } else if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            }
        }
        MiSnapNfcReader miSnapNfcReader = this.b;
        if (miSnapNfcReader != null) {
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getClass();
            miSnapNfcReader.cancel(requireActivity);
        }
        a$4$1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.Unit] */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Window window = requireActivity().getWindow();
        window.getClass();
        window.addFlags(128);
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$3().f.getValue();
        Continuation continuation = null;
        if (miSnapSettings != null) {
            m();
            i$1();
            getBinding$workflow_release().m.setVisibility(4);
            this.e = JobKt.launch$default(JobKt.MainScope(), null, null, new BlockRunner$cancel$1(this, continuation, 22), 3);
            getBinding$workflow_release().n.setVisibility(8);
            getBinding$workflow_release().h.setVisibility(0);
            MiSnapNfcReader miSnapNfcReader = this.b;
            if (miSnapNfcReader != null) {
                FragmentActivity requireActivity = requireActivity();
                requireActivity.getClass();
                miSnapNfcReader.start(requireActivity, miSnapSettings);
            }
            Context requireContext = requireContext();
            requireContext.getClass();
            Object systemService = requireContext.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                (getBinding$workflow_release().l.getVisibility() == 0 ? getBinding$workflow_release().l : getBinding$workflow_release().j).sendAccessibilityEvent(8);
            }
            continuation = Unit.INSTANCE;
        }
        if (continuation == null) {
            MiSnapWorkflowViewModel c$3 = c$3();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            c$3.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        Integer num = this.g;
        if (num != null) {
            bundle.putInt("orientationKey", num.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean b2;
        int intValue;
        String str;
        view.getClass();
        super.onViewCreated(view, bundle);
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$3().f.getValue();
        Object obj = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Nfc nfc = miSnapSettings.nfc;
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            String b$3 = b$3();
            if (b$3 != null && (str = workflow.get(b$3)) != null) {
                Json.Default r0 = Json.Default;
                r0.getClass();
                obj = r0.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.h) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                Context requireContext = requireContext();
                Companion.getClass();
                Companion.getDefaultWorkflowSettings(requireContext, miSnapSettings);
                b2 = Boolean.TRUE;
            }
            boolean booleanValue = b2.booleanValue();
            this.f = booleanValue;
            if (booleanValue) {
                try {
                    Result.Companion companion = Result.Companion;
                    FragmentKt.findNavController(this).addOnDestinationChangedListener(this.i);
                } catch (Throwable unused) {
                    Result.Companion companion2 = Result.Companion;
                }
                Integer forcedOrientation = Position.getForcedOrientation(workflow, miSnapSettings.a);
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.g = Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            if (!NfcUtil.isNfcSupported(requireContext2)) {
                MiSnapWorkflowViewModel c$3 = c$3();
                Context requireContext3 = requireContext();
                requireContext3.getClass();
                c$3.postError$workflow_release(requireContext3, MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE);
                view.setVisibility(8);
                return;
            }
            if (nfc.a == null) {
                MiSnapWorkflowViewModel c$32 = c$3();
                Context requireContext4 = requireContext();
                requireContext4.getClass();
                c$32.postError$workflow_release(requireContext4, MiSnapWorkflowError.SettingState.INSTANCE);
                view.setVisibility(8);
                return;
            }
            Context requireContext5 = requireContext();
            requireContext5.getClass();
            Mrz mrz = nfc.a;
            mrz.getClass();
            if (!NfcDocumentUtil.isDocumentNfcEnabled(requireContext5, mrz)) {
                MiSnapWorkflowViewModel c$33 = c$3();
                Context requireContext6 = requireContext();
                requireContext6.getClass();
                c$33.postError$workflow_release(requireContext6, MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE);
                view.setVisibility(8);
                return;
            }
            Context requireContext7 = requireContext();
            requireContext7.getClass();
            this.b = new MiSnapNfcReader(requireContext7);
            g$3();
            obj = Unit.INSTANCE;
        }
        if (obj == null) {
            MiSnapWorkflowViewModel c$34 = c$3();
            Context requireContext8 = requireContext();
            requireContext8.getClass();
            c$34.postError$workflow_release(requireContext8, MiSnapWorkflowError.SettingState.INSTANCE);
            return;
        }
        getBinding$workflow_release().n.setOnClickListener(new NfcReaderFragment$$ExternalSyntheticLambda0(this, 1));
        getBinding$workflow_release().h.setOnClickListener(new NfcReaderFragment$$ExternalSyntheticLambda0(this, 2));
        MaterialTextView materialTextView = getBinding$workflow_release().l;
        float f2 = materialTextView.getContext().getResources().getConfiguration().fontScale;
        if (f2 > 1.0f) {
            com.miteksystems.misnap.workflow.a.b.a(materialTextView, f2);
        }
        MaterialTextView materialTextView2 = getBinding$workflow_release().j;
        float f3 = materialTextView2.getContext().getResources().getConfiguration().fontScale;
        if (f3 <= 1.0f) {
            return;
        }
        com.miteksystems.misnap.workflow.a.b.a(materialTextView2, f3);
    }

    @Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Integer a;
        public final Integer b;
        public final Integer c;
        public final Integer d;
        public final Integer e;
        public final Boolean f;
        public final Integer g;
        public final Boolean h;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/NfcReaderFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/NfcReaderFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return NfcReaderFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Integer num6, Boolean bool2) {
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
                this.c = num3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = num5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = bool;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = num6;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = bool2;
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
            return Intrinsics.areEqual(this.a, workflowSettings.a) && Intrinsics.areEqual(this.b, workflowSettings.b) && Intrinsics.areEqual(this.c, workflowSettings.c) && Intrinsics.areEqual(this.d, workflowSettings.d) && Intrinsics.areEqual(this.e, workflowSettings.e) && Intrinsics.areEqual(this.f, workflowSettings.f) && Intrinsics.areEqual(this.g, workflowSettings.g) && Intrinsics.areEqual(this.h, workflowSettings.h);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.c;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.d;
            int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.e;
            int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Boolean bool = this.f;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num6 = this.g;
            int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Boolean bool2 = this.h;
            return hashCode7 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }

        public WorkflowSettings(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
            Boolean bool = Boolean.TRUE;
            this.a = num;
            this.b = num2;
            this.c = num3;
            this.d = num4;
            this.e = num5;
            this.f = bool;
            this.g = 20000;
            this.h = bool;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.Unit] */
    public static final void a(NfcReaderFragment nfcReaderFragment, View view) {
        MiSnapNfcReader miSnapNfcReader;
        Drawable drawable = nfcReaderFragment.getBinding$workflow_release().k.getDrawable();
        Continuation continuation = null;
        continuation = null;
        if (drawable != null) {
            if (drawable instanceof AnimatedVectorDrawableCompat) {
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawable;
                Drawable drawable2 = animatedVectorDrawableCompat.mDelegateDrawable;
                if (drawable2 != null) {
                    AnimatedVectorDrawableCompat.Api23Impl.clearAnimationCallbacks(drawable2);
                } else {
                    Transition.AnonymousClass3 anonymousClass3 = animatedVectorDrawableCompat.mAnimatorListener;
                    if (anonymousClass3 != null) {
                        animatedVectorDrawableCompat.mAnimatedVectorState.mAnimatorSet.removeListener(anonymousClass3);
                        animatedVectorDrawableCompat.mAnimatorListener = null;
                    }
                    ArrayList arrayList = animatedVectorDrawableCompat.mAnimationCallbacks;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                }
            } else if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            }
        }
        nfcReaderFragment.m();
        nfcReaderFragment.i$1();
        nfcReaderFragment.a$4$1();
        nfcReaderFragment.getBinding$workflow_release().m.setVisibility(4);
        nfcReaderFragment.e = JobKt.launch$default(JobKt.MainScope(), null, null, new BlockRunner$cancel$1(nfcReaderFragment, continuation, 22), 3);
        view.getClass();
        view.setVisibility(8);
        Context requireContext = nfcReaderFragment.requireContext();
        requireContext.getClass();
        Object systemService = requireContext.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            nfcReaderFragment.getBinding$workflow_release().l.sendAccessibilityEvent(8);
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) nfcReaderFragment.c$3().f.getValue();
        if (miSnapSettings != null && (miSnapNfcReader = nfcReaderFragment.b) != null) {
            FragmentActivity requireActivity = nfcReaderFragment.requireActivity();
            requireActivity.getClass();
            miSnapNfcReader.start(requireActivity, miSnapSettings);
            continuation = Unit.INSTANCE;
        }
        if (continuation == null) {
            MiSnapWorkflowViewModel c$3 = nfcReaderFragment.c$3();
            Context requireContext2 = nfcReaderFragment.requireContext();
            requireContext2.getClass();
            c$3.postError$workflow_release(requireContext2, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    public final void a(int i2, final f fVar) {
        if (i2 == 0) {
            return;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        AppCompatImageView appCompatImageView = getBinding$workflow_release().k;
        Drawable drawable = DimensionKt.getDrawable(requireContext, i2);
        if (drawable instanceof AnimatedVectorDrawable) {
            appCompatImageView.setImageDrawable(drawable);
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            animatedVectorDrawable.start();
            if (fVar != null) {
                animatedVectorDrawable.registerAnimationCallback(new UtilsKt$animatable2CallbackOf$1(animatedVectorDrawable, fVar));
            }
        } else {
            boolean z = drawable instanceof AnimatedVectorDrawableCompat;
            appCompatImageView.setImageDrawable(drawable);
            if (z) {
                final AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawable;
                animatedVectorDrawableCompat.start();
                if (fVar != null) {
                    animatedVectorDrawableCompat.registerAnimationCallback(new Animatable2Compat$AnimationCallback() { // from class: com.miteksystems.misnap.workflow.util.AnimatedDrawableUtil$b
                        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
                        public final void onAnimationEnd(Drawable drawable2) {
                            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = AnimatedVectorDrawableCompat.this;
                            Drawable drawable3 = animatedVectorDrawableCompat2.mDelegateDrawable;
                            if (drawable3 != null) {
                                AnimatedVectorDrawableCompat.Api23Impl.clearAnimationCallbacks(drawable3);
                            } else {
                                Transition.AnonymousClass3 anonymousClass3 = animatedVectorDrawableCompat2.mAnimatorListener;
                                if (anonymousClass3 != null) {
                                    animatedVectorDrawableCompat2.mAnimatedVectorState.mAnimatorSet.removeListener(anonymousClass3);
                                    animatedVectorDrawableCompat2.mAnimatorListener = null;
                                }
                                ArrayList arrayList = animatedVectorDrawableCompat2.mAnimationCallbacks;
                                if (arrayList != null) {
                                    arrayList.clear();
                                }
                            }
                            fVar.invoke();
                        }
                    });
                }
            } else if (fVar != null) {
                fVar.invoke();
            }
        }
        getBinding$workflow_release().k.setTag(Integer.valueOf(i2));
    }
}

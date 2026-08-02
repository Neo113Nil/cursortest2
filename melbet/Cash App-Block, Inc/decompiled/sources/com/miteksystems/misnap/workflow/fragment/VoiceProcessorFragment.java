package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda5;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textview.MaterialTextView;
import com.google.mlkit.vision.text.zzb;
import com.miteksystems.misnap.camera.a.n;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.voice.AudioPlaybackHandler;
import com.miteksystems.misnap.voice.MiSnapVoiceProcessor;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.t;
import com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel;
import com.miteksystems.misnap.workflow.util.TextUtil;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.miteksystems.misnap.workflow.view.ProgressTrackerView;
import com.miteksystems.misnap.workflow.view.VisualizerView;
import com.squareup.cash.R;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
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
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.MultipartBody;
import okhttp3.internal.platform.AndroidPlatform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/VoiceProcessorFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "com/google/mlkit/vision/text/zzb", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class VoiceProcessorFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public MibiData.Session b;
    public /* synthetic */ MiSnapVoiceProcessor c;
    public boolean d;
    public Integer e;
    public final n f;
    public boolean g;
    public AudioPlaybackHandler h;
    public boolean i;
    public int j;
    public final Lazy k;
    public final HelpFragment$$ExternalSyntheticLambda2 l;
    public final Lazy m;
    public final VoiceProcessorFragment$$ExternalSyntheticLambda1 n;
    public final VoiceProcessorFragment$$ExternalSyntheticLambda1 o;
    public final ActivityResultLauncher p;
    public static final /* synthetic */ KProperty[] q = {Reflection.factory.property1(new PropertyReference1Impl(VoiceProcessorFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentVoiceProcessorBinding;", 0))};
    public static final zzb Companion = new zzb(13);

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.Voice.Flow.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public static final b a = new b(1, com.miteksystems.misnap.workflow.a.n.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentVoiceProcessorBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.captureGroup;
            Group group = (Group) ViewBindings.findChildViewById(view, R.id.captureGroup);
            if (group != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.centerContentUpperBound;
                if (((Guideline) ViewBindings.findChildViewById(view, R.id.centerContentUpperBound)) != null) {
                    i = R.id.failoverGroup;
                    Group group2 = (Group) ViewBindings.findChildViewById(view, R.id.failoverGroup);
                    if (group2 != null) {
                        i = R.id.failoverLayout;
                        if (((LinearLayoutCompat) ViewBindings.findChildViewById(view, R.id.failoverLayout)) != null) {
                            i = R.id.failoverTextView;
                            MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.failoverTextView);
                            if (materialTextView != null) {
                                i = R.id.guidelineBottomContent;
                                if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineBottomContent)) != null) {
                                    i = R.id.guidelineEndContent;
                                    if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineEndContent)) != null) {
                                        i = R.id.guidelineStartContent;
                                        if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineStartContent)) != null) {
                                            i = R.id.guidelineTopContent;
                                            if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineTopContent)) != null) {
                                                i = R.id.helpButton;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.helpButton);
                                                if (appCompatImageView != null) {
                                                    i = R.id.messageAboutPhraseTextView;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.messageAboutPhraseTextView);
                                                    if (textView != null) {
                                                        i = R.id.needHelpButton;
                                                        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.needHelpButton);
                                                        if (materialButton != null) {
                                                            i = R.id.phraseForPronouncingTextView;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.phraseForPronouncingTextView);
                                                            if (textView2 != null) {
                                                                i = R.id.progressTrackerView;
                                                                ProgressTrackerView progressTrackerView = (ProgressTrackerView) ViewBindings.findChildViewById(view, R.id.progressTrackerView);
                                                                if (progressTrackerView != null) {
                                                                    i = R.id.progressTrackerViewLowerBound;
                                                                    if (((Guideline) ViewBindings.findChildViewById(view, R.id.progressTrackerViewLowerBound)) != null) {
                                                                        i = R.id.skipButton;
                                                                        MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.skipButton);
                                                                        if (materialButton2 != null) {
                                                                            i = R.id.tryAgainButton;
                                                                            MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.tryAgainButton);
                                                                            if (materialButton3 != null) {
                                                                                i = R.id.visualizer;
                                                                                VisualizerView visualizerView = (VisualizerView) ViewBindings.findChildViewById(view, R.id.visualizer);
                                                                                if (visualizerView != null) {
                                                                                    return new com.miteksystems.misnap.workflow.a.n(constraintLayout, group, group2, materialTextView, appCompatImageView, textView, materialButton, textView2, progressTrackerView, materialButton2, materialButton3, visualizerView);
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
                    }
                }
            }
            a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            return null;
        }
    }

    public final class c extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ VoiceProcessorFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(VoiceProcessorFragment voiceProcessorFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = voiceProcessorFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            VoiceProcessorFragment voiceProcessorFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(voiceProcessorFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = voiceProcessorFragment.requireActivity();
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

    public final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapVoiceProcessor.Event event = (MiSnapVoiceProcessor.Event) obj;
            if (event != null) {
                VoiceProcessorFragment.this.onProcessorEvent$workflow_release(event);
            }
            return Unit.INSTANCE;
        }
    }

    public final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            MiSnapVoiceProcessor.Result result = (MiSnapVoiceProcessor.Result) obj;
            if (result != null) {
                VoiceProcessorFragment.this.onProcessorResult$workflow_release(result);
            }
            return Unit.INSTANCE;
        }
    }

    public final class g extends Lambda implements Function1 {
        public final /* synthetic */ MiSnapSettings b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MiSnapSettings miSnapSettings, boolean z) {
            super(1);
            this.b = miSnapSettings;
            this.c = z;
        }

        public final void a(boolean z) {
            VoiceProcessorFragment voiceProcessorFragment = VoiceProcessorFragment.this;
            n nVar = voiceProcessorFragment.f;
            if (!z) {
                zzb zzbVar = VoiceProcessorFragment.Companion;
                voiceProcessorFragment.a(this.b, voiceProcessorFragment.b$4(), this.c);
                return;
            }
            MiSnapVoiceProcessor miSnapVoiceProcessor = voiceProcessorFragment.c;
            if (miSnapVoiceProcessor != null) {
                miSnapVoiceProcessor.cancel();
            }
            nVar.cancel(voiceProcessorFragment.n);
            nVar.start(voiceProcessorFragment.o, 1000L);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.miteksystems.misnap.workflow.fragment.VoiceProcessorFragment$$ExternalSyntheticLambda1] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.miteksystems.misnap.workflow.fragment.VoiceProcessorFragment$$ExternalSyntheticLambda1] */
    public VoiceProcessorFragment() {
        super(R.layout.misnap_fragment_voice_processor);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, b.a);
        this.b = MibiData.bindSession();
        final int i = 1;
        this.d = true;
        this.f = new n();
        final int i2 = 0;
        this.k = LazyKt.lazy(new c(this, i2));
        this.l = new HelpFragment$$ExternalSyntheticLambda2(this, 11);
        this.m = LazyKt.lazy(new c(this, i));
        this.n = new Runnable(this) { // from class: com.miteksystems.misnap.workflow.fragment.VoiceProcessorFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ VoiceProcessorFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                VoiceProcessorFragment voiceProcessorFragment = this.f$0;
                switch (i3) {
                    case 0:
                        VoiceProcessorFragment.b(voiceProcessorFragment);
                        break;
                    default:
                        zzb zzbVar = VoiceProcessorFragment.Companion;
                        voiceProcessorFragment.getBinding$workflow_release().p.setError();
                        voiceProcessorFragment.getBinding$workflow_release().v.reset();
                        voiceProcessorFragment.c$4().c = new t(true, voiceProcessorFragment.c$4().b);
                        voiceProcessorFragment.a$1(R.string.misnapWorkflowVoiceProcessorFragmentFailoverPopupMessageBackgroundAudioTimeout);
                        break;
                }
            }
        };
        this.o = new Runnable(this) { // from class: com.miteksystems.misnap.workflow.fragment.VoiceProcessorFragment$$ExternalSyntheticLambda1
            public final /* synthetic */ VoiceProcessorFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                VoiceProcessorFragment voiceProcessorFragment = this.f$0;
                switch (i3) {
                    case 0:
                        VoiceProcessorFragment.b(voiceProcessorFragment);
                        break;
                    default:
                        zzb zzbVar = VoiceProcessorFragment.Companion;
                        voiceProcessorFragment.getBinding$workflow_release().p.setError();
                        voiceProcessorFragment.getBinding$workflow_release().v.reset();
                        voiceProcessorFragment.c$4().c = new t(true, voiceProcessorFragment.c$4().b);
                        voiceProcessorFragment.a$1(R.string.misnapWorkflowVoiceProcessorFragmentFailoverPopupMessageBackgroundAudioTimeout);
                        break;
                }
            }
        };
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts$RequestPermission(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(this, 5));
        registerForActivityResult.getClass();
        this.p = registerForActivityResult;
    }

    public final void a(MiSnapVoiceProcessor.Result.Failure.Reason reason) {
        this.f.cancel(this.n);
        if (Intrinsics.areEqual(reason, MiSnapVoiceProcessor.Result.Failure.Reason.InsufficientSpeechLength.INSTANCE)) {
            a$1(R.string.misnapWorkflowVoiceProcessorFragmentFailoverPopupMessageAboutSpeechLength);
            return;
        }
        if (Intrinsics.areEqual(reason, MiSnapVoiceProcessor.Result.Failure.Reason.LowSNR.INSTANCE)) {
            a$1(R.string.misnapWorkflowVoiceProcessorFragmentFailoverPopupMessageAboutSnr);
            return;
        }
        if (Intrinsics.areEqual(reason, MiSnapVoiceProcessor.Result.Failure.Reason.Execution.INSTANCE)) {
            MiSnapWorkflowViewModel c$4 = c$4();
            Context requireContext = requireContext();
            requireContext.getClass();
            c$4.postError$workflow_release(requireContext, MiSnapWorkflowError.Voice.Execution.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(reason, MiSnapVoiceProcessor.Result.Failure.Reason.Initialization.INSTANCE)) {
            MiSnapWorkflowViewModel c$42 = c$4();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            c$42.postError$workflow_release(requireContext2, MiSnapWorkflowError.Voice.Initialization.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(reason, MiSnapVoiceProcessor.Result.Failure.Reason.InputFormat.INSTANCE)) {
            MiSnapWorkflowViewModel c$43 = c$4();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            c$43.postError$workflow_release(requireContext3, MiSnapWorkflowError.Voice.InputFormat.INSTANCE);
            return;
        }
        if (reason instanceof MiSnapVoiceProcessor.Result.Failure.Reason.License) {
            MiSnapWorkflowViewModel c$44 = c$4();
            Context requireContext4 = requireContext();
            requireContext4.getClass();
            c$44.postError$workflow_release(requireContext4, new MiSnapWorkflowError.License(((MiSnapVoiceProcessor.Result.Failure.Reason.License) reason).getReason()));
            return;
        }
        if (Intrinsics.areEqual(reason, MiSnapVoiceProcessor.Result.Failure.Reason.Permission.INSTANCE)) {
            MiSnapWorkflowViewModel c$45 = c$4();
            Context requireContext5 = requireContext();
            requireContext5.getClass();
            c$45.postError$workflow_release(requireContext5, MiSnapWorkflowError.Permission.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(reason, MiSnapVoiceProcessor.Result.Failure.Reason.MicrophoneMuted.INSTANCE)) {
            MiSnapWorkflowViewModel c$46 = c$4();
            Context requireContext6 = requireContext();
            requireContext6.getClass();
            c$46.postError$workflow_release(requireContext6, MiSnapWorkflowError.Voice.MicrophoneMuted.INSTANCE);
            return;
        }
        if (Intrinsics.areEqual(reason, MiSnapVoiceProcessor.Result.Failure.Reason.MissingFlow.INSTANCE)) {
            MiSnapWorkflowViewModel c$47 = c$4();
            Context requireContext7 = requireContext();
            requireContext7.getClass();
            c$47.postError$workflow_release(requireContext7, new MiSnapWorkflowError.Voice.MissingRequirement(MiSnapWorkflowError.Voice.MissingRequirement.Reason.Flow));
        }
    }

    public final void a$1(int i) {
        getBinding$workflow_release().p.setError();
        c$4().c = new t(true, c$4().b);
        b(i);
    }

    public final void b(int i) {
        this.i = true;
        this.j = i;
        MaterialTextView materialTextView = getBinding$workflow_release().g;
        String string2 = getString(i);
        string2.getClass();
        TextUtil.setHtmlText(materialTextView, string2);
        getBinding$workflow_release().b.setVisibility(8);
        getBinding$workflow_release().e.setVisibility(0);
        Context requireContext = requireContext();
        requireContext.getClass();
        Object systemService = requireContext.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            getBinding$workflow_release().g.sendAccessibilityEvent(8);
        }
    }

    public final String b$4() {
        return (String) this.k.getValue();
    }

    public final MiSnapWorkflowViewModel c$4() {
        return (MiSnapWorkflowViewModel) this.m.getValue();
    }

    public final boolean d$1() {
        return c$4().b.size() < getBinding$workflow_release().p.c;
    }

    public final void e$4() {
        try {
            FragmentKt.findNavController(this).navigate(R.id.navigateHelp);
        } catch (Exception e2) {
            Log.e("VoiceProcessorFragment", "Nav Graph Error", e2);
            c$4().postNavigationError$workflow_release(new NavigationError(e2, VoiceProcessorFragment.class, hashCode(), NavigationAction$VoiceProcessor$NavigateHelp.INSTANCE));
        }
    }

    public final void g$4() {
        MiSnapVoiceProcessor miSnapVoiceProcessor = this.c;
        if (miSnapVoiceProcessor != null) {
            miSnapVoiceProcessor.getEvents().observe(getViewLifecycleOwner(), new LiveDataObservable$$ExternalSyntheticLambda5(new e(), 11));
            miSnapVoiceProcessor.getResult().observe(getViewLifecycleOwner(), new LiveDataObservable$$ExternalSyntheticLambda5(new f(), 12));
        }
    }

    public final /* synthetic */ com.miteksystems.misnap.workflow.a.n getBinding$workflow_release() {
        return (com.miteksystems.misnap.workflow.a.n) this.a.getValue((Fragment) this, q[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Integer num;
        super.onDestroyView();
        this.f.cancelAll();
        MibiData.releaseSession(VoiceProcessorFragment.class.getName());
        if (this.d) {
            try {
                FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.l);
            } catch (Exception unused) {
                if (!requireActivity().isChangingConfigurations() && (num = this.e) != null) {
                    requireActivity().setRequestedOrientation(num.intValue());
                }
            }
        }
        MiSnapVoiceProcessor miSnapVoiceProcessor = this.c;
        if (miSnapVoiceProcessor != null) {
            miSnapVoiceProcessor.release();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        VoiceProcessorFragment$$ExternalSyntheticLambda1 voiceProcessorFragment$$ExternalSyntheticLambda1 = this.n;
        n nVar = this.f;
        nVar.pause(voiceProcessorFragment$$ExternalSyntheticLambda1);
        nVar.pause(this.o);
        MiSnapVoiceProcessor miSnapVoiceProcessor = this.c;
        if (miSnapVoiceProcessor != null) {
            miSnapVoiceProcessor.cancel();
        }
        AudioPlaybackHandler audioPlaybackHandler = this.h;
        if (audioPlaybackHandler != null) {
            audioPlaybackHandler.unmuteBackgroundAudio();
        }
    }

    public final void onProcessorEvent$workflow_release(MiSnapVoiceProcessor.Event event) {
        String str;
        event.getClass();
        VisualizerView visualizerView = getBinding$workflow_release().v;
        float amplitude = event.getAmplitude();
        if (amplitude > 1.0f) {
            str = "Normalized radius must be below or equal 1.0";
        } else {
            if (amplitude >= RecyclerView.DECELERATION_RATE) {
                float f2 = 0.05f;
                if ((Math.abs(visualizerView.a - amplitude) < 0.05f || visualizerView.i) && !visualizerView.m) {
                    return;
                }
                visualizerView.a = amplitude;
                if (amplitude > 0.05f) {
                    f2 = amplitude * 2.5f;
                    if (f2 >= 1.0f) {
                        f2 = 1.0f;
                    }
                }
                int width = visualizerView.getWidth();
                int height = visualizerView.getHeight();
                if (width > height) {
                    width = height;
                }
                float f3 = amplitude * 5.0f;
                visualizerView.a((width / 2) * f2, f3 <= 0.5f ? 127 : f3 >= 1.0f ? 255 : (int) (255.0f * f3));
                return;
            }
            str = "Normalized radius must be above or equal 0.0";
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public final void onProcessorResult$workflow_release(MiSnapVoiceProcessor.Result result) {
        result.getClass();
        this.f.cancel(this.n);
        getBinding$workflow_release().v.reset();
        if (!(result instanceof MiSnapVoiceProcessor.Result.Success)) {
            if (result instanceof MiSnapVoiceProcessor.Result.Failure) {
                a(((MiSnapVoiceProcessor.Result.Failure) result).getReason());
                return;
            }
            return;
        }
        MibiData.releaseSession(VoiceProcessorFragment.class.getName());
        this.i = false;
        ArrayList arrayList = c$4().b;
        MiSnapVoiceProcessor.Result.Success success = (MiSnapVoiceProcessor.Result.Success) result;
        byte[] audio = success.getAudio();
        Context requireContext = requireContext();
        requireContext.getClass();
        arrayList.add(new MiSnapWorkflowViewModel.a(audio, MibiData.toMiSnapMibiData(requireContext), success.getRts()));
        c$4().c = new t(false, c$4().b);
        ProgressTrackerView progressTrackerView = getBinding$workflow_release().p;
        if (progressTrackerView.b < progressTrackerView.c) {
            progressTrackerView.setHasError$workflow_release(false);
            progressTrackerView.a(progressTrackerView.g, progressTrackerView.b);
            progressTrackerView.setProgressCount(progressTrackerView.b + 1);
            progressTrackerView.performHapticFeedback(0);
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$4().f.getValue();
        Unit unit = null;
        if (miSnapSettings != null) {
            if (d$1()) {
                if (this.b.isCurrentSession()) {
                    MibiData.reset$core_release(false);
                }
                this.g = false;
                startSession$workflow_release(miSnapSettings, true);
            } else {
                String str = miSnapSettings.voice.b;
                if (str != null) {
                    MiSnapWorkflowViewModel c$4 = c$4();
                    ArrayList arrayList2 = c$4().b;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((MiSnapWorkflowViewModel.a) it.next()).a);
                    }
                    ArrayList arrayList4 = c$4().b;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(((MiSnapWorkflowViewModel.a) it2.next()).b);
                    }
                    boolean licenseExpired = success.getLicenseExpired();
                    ArrayList arrayList6 = c$4().b;
                    ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                    Iterator it3 = arrayList6.iterator();
                    while (it3.hasNext()) {
                        arrayList7.add(((MiSnapWorkflowViewModel.a) it3.next()).c);
                    }
                    c$4.postResults$workflow_release(new MiSnapFinalResult.VoiceSession(arrayList3, str, arrayList5, licenseExpired, arrayList7));
                    MiSnapWorkflowViewModel c$42 = c$4();
                    ArrayList arrayList8 = new ArrayList();
                    c$42.getClass();
                    c$42.b = arrayList8;
                    c$4().c = null;
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    MiSnapWorkflowViewModel c$43 = c$4();
                    Context requireContext2 = requireContext();
                    requireContext2.getClass();
                    c$43.postError$workflow_release(requireContext2, new MiSnapWorkflowError.Voice.MissingRequirement(MiSnapWorkflowError.Voice.MissingRequirement.Reason.Phrase));
                }
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel c$44 = c$4();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            c$44.postError$workflow_release(requireContext3, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Object obj;
        Integer d;
        Object obj2;
        Integer d2;
        Object obj3;
        Integer d3;
        Object obj4;
        Integer d4;
        String str;
        String str2;
        String str3;
        String str4;
        super.onResume();
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$4().f.getValue();
        Unit unit = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            if (!d$1()) {
                MiSnapWorkflowViewModel c$4 = c$4();
                ArrayList arrayList = new ArrayList();
                c$4.getClass();
                c$4.b = arrayList;
                c$4().c = null;
                return;
            }
            ProgressTrackerView progressTrackerView = getBinding$workflow_release().p;
            String b$4 = b$4();
            if (b$4 == null || (str4 = workflow.get(b$4)) == null) {
                obj = null;
            } else {
                Json.Default r5 = Json.Default;
                r5.getClass();
                obj = r5.decodeFromString(str4, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            zzb zzbVar = Companion;
            if ((workflowSettings == null || (d = workflowSettings.a) == null) && (d = MultipartBody.Companion.d(getArguments(), "progressTrackerViewProcessedDrawableId")) == null) {
                zzbVar.getClass();
                d = zzb.getDefaultWorkflowSettings().a;
            }
            if (d != null) {
                progressTrackerView.setProgressTrackerViewSuccessDrawableId(d.intValue());
            }
            ProgressTrackerView progressTrackerView2 = getBinding$workflow_release().p;
            String b$42 = b$4();
            if (b$42 == null || (str3 = workflow.get(b$42)) == null) {
                obj2 = null;
            } else {
                Json.Default r6 = Json.Default;
                r6.getClass();
                obj2 = r6.decodeFromString(str3, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (d2 = workflowSettings2.b) == null) && (d2 = MultipartBody.Companion.d(getArguments(), "progressTrackerViewFailedDrawableId")) == null) {
                zzbVar.getClass();
                d2 = zzb.getDefaultWorkflowSettings().b;
            }
            if (d2 != null) {
                progressTrackerView2.setProgressTrackerViewFailureDrawableId(d2.intValue());
            }
            ProgressTrackerView progressTrackerView3 = getBinding$workflow_release().p;
            String b$43 = b$4();
            if (b$43 == null || (str2 = workflow.get(b$43)) == null) {
                obj3 = null;
            } else {
                Json.Default r62 = Json.Default;
                r62.getClass();
                obj3 = r62.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings3 = (WorkflowSettings) obj3;
            if ((workflowSettings3 == null || (d3 = workflowSettings3.c) == null) && (d3 = MultipartBody.Companion.d(getArguments(), "progressTrackerViewUnprocessedDrawableId")) == null) {
                zzbVar.getClass();
                d3 = zzb.getDefaultWorkflowSettings().c;
            }
            if (d3 != null) {
                progressTrackerView3.setProgressTrackerViewUnprocessedDrawableId(d3.intValue());
            }
            AppCompatImageView appCompatImageView = getBinding$workflow_release().l;
            String b$44 = b$4();
            if (b$44 == null || (str = workflow.get(b$44)) == null) {
                obj4 = null;
            } else {
                Json.Default r4 = Json.Default;
                r4.getClass();
                obj4 = r4.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings4 = (WorkflowSettings) obj4;
            if ((workflowSettings4 == null || (d4 = workflowSettings4.d) == null) && (d4 = MultipartBody.Companion.d(getArguments(), "helpButtonDrawableId")) == null) {
                zzbVar.getClass();
                d4 = zzb.getDefaultWorkflowSettings().d;
            }
            if (d4 != null) {
                int intValue = d4.intValue();
                Context requireContext = requireContext();
                requireContext.getClass();
                appCompatImageView.setImageDrawable(MultipartBody.Companion.b(requireContext, intValue));
            }
            appCompatImageView.setOnClickListener(new VoiceProcessorFragment$$ExternalSyntheticLambda4(this, 3));
            getBinding$workflow_release().v.reset();
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            if (AndroidPlatform.Companion.hasPermission(requireContext2, "android.permission.RECORD_AUDIO")) {
                if (!this.i) {
                    startSession$workflow_release(miSnapSettings, false);
                }
            } else if (shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(requireContext());
                materialAlertDialogBuilder.setTitle(R.string.misnapWorkflowAudioPermissionVoiceRationaleTitle);
                materialAlertDialogBuilder.setMessage(R.string.misnapWorkflowAudioPermissionVoiceRationaleMessage);
                materialAlertDialogBuilder.P.mOnDismissListener = new HelpFragment$$ExternalSyntheticLambda4(this, 4);
                materialAlertDialogBuilder.setPositiveButton(R.string.misnapWorkflowAudioPermissionVoiceRationaleButtonConfirmLabel, (DialogInterface.OnClickListener) null).show();
            } else {
                this.p.launch("android.permission.RECORD_AUDIO");
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel c$42 = c$4();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            c$42.postError$workflow_release(requireContext3, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        n nVar = this.f;
        VoiceProcessorFragment$$ExternalSyntheticLambda1 voiceProcessorFragment$$ExternalSyntheticLambda1 = this.n;
        bundle.putLong("timeoutKey", nVar.remainingTime(voiceProcessorFragment$$ExternalSyntheticLambda1));
        nVar.cancel(voiceProcessorFragment$$ExternalSyntheticLambda1);
        Integer num = this.e;
        if (num != null) {
            bundle.putInt("orientationKey", num.intValue());
        }
        bundle.putBoolean("loggedTries", this.g);
        bundle.putBoolean("showFailoverKey", this.i);
        bundle.putInt("failoverReasonKey", this.j);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean b2;
        int intValue;
        int i;
        String str;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            if (bundle.containsKey("timeoutKey")) {
                long j = bundle.getLong("timeoutKey");
                if (j > 0) {
                    this.f.start(this.n, j);
                }
            }
            if (bundle.containsKey("orientationKey")) {
                this.e = Integer.valueOf(bundle.getInt("orientationKey"));
            }
            if (bundle.containsKey("loggedTries")) {
                this.g = bundle.getBoolean("loggedTries");
            }
            if (bundle.containsKey("showFailoverKey")) {
                this.i = bundle.getBoolean("showFailoverKey");
            }
            if (bundle.containsKey("failoverReasonKey")) {
                this.j = bundle.getInt("failoverReasonKey");
            }
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) c$4().f.getValue();
        int i2 = 2;
        int i3 = 1;
        Object obj = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Voice voice = miSnapSettings.voice;
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MibiData.Uxp uxp = MibiData.a;
            MibiData.startSession(miSnapSettings, VoiceProcessorFragment.class.getName());
            this.b = MibiData.bindSession();
            String b$4 = b$4();
            if (b$4 != null && (str = workflow.get(b$4)) != null) {
                Json.Default r1 = Json.Default;
                r1.getClass();
                obj = r1.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.f) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                Companion.getClass();
                b2 = Boolean.TRUE;
            }
            boolean booleanValue = b2.booleanValue();
            this.d = booleanValue;
            if (booleanValue) {
                try {
                    Result.Companion companion = Result.Companion;
                    FragmentKt.findNavController(this).addOnDestinationChangedListener(this.l);
                } catch (Throwable unused) {
                    Result.Companion companion2 = Result.Companion;
                }
                Integer forcedOrientation = Position.getForcedOrientation(workflow, miSnapSettings.a);
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.e = Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            String str2 = voice.b;
            if (str2 != null) {
                getBinding$workflow_release().o.setText(str2);
            }
            MiSnapSettings.Voice.Flow flow = voice.a;
            if (flow != null) {
                ProgressTrackerView progressTrackerView = getBinding$workflow_release().p;
                int i4 = a.a[flow.ordinal()];
                if (i4 == 1) {
                    i = 3;
                } else {
                    if (i4 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    i = 1;
                }
                progressTrackerView.setNumberOfProgressChecks(i);
            }
            if (d$1()) {
                ProgressTrackerView progressTrackerView2 = getBinding$workflow_release().p;
                t tVar = c$4().c;
                if (tVar != null) {
                    progressTrackerView2.setProgressCount(tVar.b.size());
                    if (tVar.a) {
                        progressTrackerView2.setError();
                    }
                }
            }
            Context requireContext = requireContext();
            requireContext.getClass();
            this.h = new AudioPlaybackHandler(requireContext);
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            this.c = new MiSnapVoiceProcessor(requireContext2, miSnapSettings);
            g$4();
            obj = Unit.INSTANCE;
        }
        if (obj == null) {
            MiSnapWorkflowViewModel c$4 = c$4();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            c$4.postError$workflow_release(requireContext3, MiSnapWorkflowError.SettingState.INSTANCE);
            return;
        }
        getBinding$workflow_release().u.setOnClickListener(new VoiceProcessorFragment$$ExternalSyntheticLambda4(this, 0));
        getBinding$workflow_release().n.setOnClickListener(new VoiceProcessorFragment$$ExternalSyntheticLambda4(this, i3));
        getBinding$workflow_release().s.setOnClickListener(new VoiceProcessorFragment$$ExternalSyntheticLambda4(this, i2));
        if (this.i) {
            b(this.j);
        }
        WindowCompat$Api35Impl.adjustScalingForAccessibility$workflow_release(getBinding$workflow_release().g);
        WindowCompat$Api35Impl.adjustScalingForAccessibility$workflow_release(getBinding$workflow_release().m);
        WindowCompat$Api35Impl.adjustScalingForAccessibility$workflow_release(getBinding$workflow_release().o);
    }

    public final void startSession$workflow_release(MiSnapSettings miSnapSettings, boolean z) {
        if ((Intrinsics.areEqual(MibiData.i, VoiceProcessorFragment.class.getName()) || Intrinsics.areEqual(MibiData.i, MiSnapWorkflowViewModel.class.getName())) && !this.g) {
            this.b.getMetaData().e++;
            this.g = true;
        }
        AudioPlaybackHandler audioPlaybackHandler = this.h;
        if (audioPlaybackHandler != null) {
            audioPlaybackHandler.muteBackgroundAudio(new g(miSnapSettings, z));
        }
        a(miSnapSettings, b$4(), z);
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

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/VoiceProcessorFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/VoiceProcessorFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return VoiceProcessorFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkflowSettings)) {
                return false;
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            return Intrinsics.areEqual(this.a, workflowSettings.a) && Intrinsics.areEqual(this.b, workflowSettings.b) && Intrinsics.areEqual(this.c, workflowSettings.c) && Intrinsics.areEqual(this.d, workflowSettings.d) && Intrinsics.areEqual(this.e, workflowSettings.e) && Intrinsics.areEqual(this.f, workflowSettings.f);
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
            return hashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }

        public WorkflowSettings(Integer num, Integer num2, Integer num3, Integer num4) {
            Boolean bool = Boolean.TRUE;
            this.a = num;
            this.b = num2;
            this.c = num3;
            this.d = num4;
            this.e = 10000;
            this.f = bool;
        }
    }

    public static final void b(VoiceProcessorFragment voiceProcessorFragment) {
        voiceProcessorFragment.b.addUxpEvent("SVCFO", new String[0]);
        voiceProcessorFragment.getBinding$workflow_release().p.setError();
        MiSnapVoiceProcessor miSnapVoiceProcessor = voiceProcessorFragment.c;
        if (miSnapVoiceProcessor != null) {
            miSnapVoiceProcessor.cancel();
        }
        voiceProcessorFragment.getBinding$workflow_release().v.reset();
        voiceProcessorFragment.c$4().c = new t(true, voiceProcessorFragment.c$4().b);
        voiceProcessorFragment.a$1(R.string.misnapWorkflowVoiceProcessorFragmentFailoverPopupMessageTimeout);
    }

    public final void a(MiSnapSettings miSnapSettings, String str, boolean z) {
        Object obj;
        Integer d;
        String str2;
        MiSnapVoiceProcessor miSnapVoiceProcessor = this.c;
        if (miSnapVoiceProcessor != null) {
            miSnapVoiceProcessor.start(z);
        }
        VoiceProcessorFragment$$ExternalSyntheticLambda1 voiceProcessorFragment$$ExternalSyntheticLambda1 = this.o;
        n nVar = this.f;
        nVar.cancel(voiceProcessorFragment$$ExternalSyntheticLambda1);
        VoiceProcessorFragment$$ExternalSyntheticLambda1 voiceProcessorFragment$$ExternalSyntheticLambda12 = this.n;
        if (nVar.isRunning(voiceProcessorFragment$$ExternalSyntheticLambda12)) {
            return;
        }
        if (str == null || (str2 = miSnapSettings.workflow.get(str)) == null) {
            obj = null;
        } else {
            Json.Default r4 = Json.Default;
            r4.getClass();
            obj = r4.decodeFromString(str2, WorkflowSettings.Companion.serializer());
        }
        WorkflowSettings workflowSettings = (WorkflowSettings) obj;
        if ((workflowSettings == null || (d = workflowSettings.e) == null) && (d = MultipartBody.Companion.d(getArguments(), "TimeoutDuration")) == null) {
            Companion.getClass();
            d = 10000;
        }
        int intValue = d.intValue();
        if (intValue > 0) {
            nVar.start(voiceProcessorFragment$$ExternalSyntheticLambda12, intValue);
        }
    }
}

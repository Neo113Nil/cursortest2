package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.embedded.settings.adapter.SettingsAdapter;
import com.google.android.material.textview.MaterialTextView;
import com.google.mlkit.vision.text.zza;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.m;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.squareup.cash.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "com/google/mlkit/vision/text/zza", "com/fillr/embedded/settings/adapter/SettingsAdapter", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class VoicePhraseSelectionFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public boolean b;
    public Integer c;
    public final Lazy d;
    public final HelpFragment$$ExternalSyntheticLambda2 e;
    public final Lazy f;
    public static final /* synthetic */ KProperty[] g = {Reflection.factory.property1(new PropertyReference1Impl(VoicePhraseSelectionFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentVoicePhraseSelectionBinding;", 0))};
    public static final zza Companion = new zza(13);

    @Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Boolean a;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/VoicePhraseSelectionFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return VoicePhraseSelectionFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Boolean bool) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bool;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WorkflowSettings) && Intrinsics.areEqual(this.a, ((WorkflowSettings) obj).a);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }
    }

    public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public static final b a = new b(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentVoicePhraseSelectionBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.guidelineBottomContent;
            if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineBottomContent)) != null) {
                i = R.id.guidelineEndContent;
                if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineEndContent)) != null) {
                    i = R.id.guidelineStartContent;
                    if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineStartContent)) != null) {
                        i = R.id.guidelineTopContent;
                        if (((Guideline) ViewBindings.findChildViewById(view, R.id.guidelineTopContent)) != null) {
                            i = R.id.header;
                            MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.header);
                            if (materialTextView != null) {
                                i = R.id.phraseList;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.phraseList);
                                if (recyclerView != null) {
                                    return new m((ConstraintLayout) view, materialTextView, recyclerView);
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
        public final /* synthetic */ VoicePhraseSelectionFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(VoicePhraseSelectionFragment voicePhraseSelectionFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = voicePhraseSelectionFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            VoicePhraseSelectionFragment voicePhraseSelectionFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(voicePhraseSelectionFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = voicePhraseSelectionFragment.requireActivity();
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

    public VoicePhraseSelectionFragment() {
        super(R.layout.misnap_fragment_voice_phrase_selection);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, b.a);
        this.b = true;
        this.d = LazyKt.lazy(new c(this, 0));
        this.e = new HelpFragment$$ExternalSyntheticLambda2(this, 10);
        this.f = LazyKt.lazy(new c(this, 1));
    }

    public final void a$1(MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
        try {
            FragmentKt.findNavController(this).navigate(R.id.navigateContinue);
        } catch (Exception e) {
            Log.e("NfcSelectionFragment", "Nav Graph Error", e);
            miSnapWorkflowViewModel.postNavigationError$workflow_release(new NavigationError(e, VoicePhraseSelectionFragment.class, hashCode(), NavigationAction$NavigateNfcSession.INSTANCE$3));
        }
    }

    public final MiSnapWorkflowViewModel b$7() {
        return (MiSnapWorkflowViewModel) this.f.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Integer num;
        super.onDestroyView();
        if (this.b) {
            try {
                FragmentKt.findNavController(this).removeOnDestinationChangedListener(this.e);
            } catch (Exception unused) {
                if (requireActivity().isChangingConfigurations() || (num = this.c) == null) {
                    return;
                }
                requireActivity().setRequestedOrientation(num.intValue());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        Integer num = this.c;
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
        if (bundle != null && bundle.containsKey("orientationKey")) {
            this.c = Integer.valueOf(bundle.getInt("orientationKey"));
        }
        MiSnapSettings miSnapSettings = (MiSnapSettings) b$7().f.getValue();
        KProperty[] kPropertyArr = g;
        ViewBindingUtil$FragmentViewBindingDelegate viewBindingUtil$FragmentViewBindingDelegate = this.a;
        RecyclerView recyclerView = null;
        r2 = null;
        Object obj = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            MiSnapSettings.Voice voice = miSnapSettings.voice;
            String str2 = (String) this.d.getValue();
            if (str2 != null && (str = workflow.get(str2)) != null) {
                Json.Default r2 = Json.Default;
                r2.getClass();
                obj = r2.decodeFromString(str, BarcodeAnalysisFragment.WorkflowSettings.Companion.serializer());
            }
            BarcodeAnalysisFragment.WorkflowSettings workflowSettings = (BarcodeAnalysisFragment.WorkflowSettings) obj;
            if ((workflowSettings == null || (b2 = workflowSettings.q) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                Companion.getClass();
                b2 = Boolean.TRUE;
            }
            boolean booleanValue = b2.booleanValue();
            this.b = booleanValue;
            if (booleanValue) {
                try {
                    Result.Companion companion = Result.Companion;
                    FragmentKt.findNavController(this).addOnDestinationChangedListener(this.e);
                } catch (Throwable unused) {
                    Result.Companion companion2 = Result.Companion;
                }
                Integer forcedOrientation = Position.getForcedOrientation(workflow, miSnapSettings.a);
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.c = Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            if (voice.a == null) {
                MiSnapWorkflowViewModel b$7 = b$7();
                Context requireContext = requireContext();
                requireContext.getClass();
                b$7.postError$workflow_release(requireContext, new MiSnapWorkflowError.Voice.MissingRequirement(MiSnapWorkflowError.Voice.MissingRequirement.Reason.Flow));
            }
            String str3 = voice.b;
            if (str3 != null && str3.length() != 0) {
                a$1(b$7());
            } else if (voice.a == MiSnapSettings.Voice.Flow.VERIFICATION) {
                MiSnapWorkflowViewModel b$72 = b$7();
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                b$72.postError$workflow_release(requireContext2, new MiSnapWorkflowError.Voice.MissingRequirement(MiSnapWorkflowError.Voice.MissingRequirement.Reason.Phrase));
            }
            recyclerView = ((m) viewBindingUtil$FragmentViewBindingDelegate.getValue((Fragment) this, kPropertyArr[0])).g;
            String[] stringArray = recyclerView.getResources().getStringArray(R.array.misnapWorkflowVoicePhraseSelectionFragmentPhrases);
            stringArray.getClass();
            List asList = Arrays.asList(stringArray);
            asList.getClass();
            recyclerView.setAdapter(new SettingsAdapter(this, asList));
            recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext()));
        }
        if (recyclerView == null) {
            MiSnapWorkflowViewModel b$73 = b$7();
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            b$73.postError$workflow_release(requireContext3, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        MaterialTextView materialTextView = ((m) viewBindingUtil$FragmentViewBindingDelegate.getValue((Fragment) this, kPropertyArr[0])).f;
        float f = materialTextView.getContext().getResources().getConfiguration().fontScale;
        if (f <= 1.0f) {
            return;
        }
        com.miteksystems.misnap.workflow.a.b.a(materialTextView, f);
    }
}

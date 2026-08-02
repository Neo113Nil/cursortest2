package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton;
import com.google.mlkit.vision.text.zzd;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.ValidationUtil;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.k;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "com/google/mlkit/vision/text/zzd", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NfcSelectionFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public boolean b;
    public Integer c;
    public final Lazy d;
    public final HelpFragment$$ExternalSyntheticLambda2 e;
    public final Lazy f;
    public static final /* synthetic */ KProperty[] g = {Reflection.factory.property1(new PropertyReference1Impl(NfcSelectionFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcSelectionBinding;", 0))};
    public static final zzd Companion = new zzd(13);

    @Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Boolean a;
        public final Boolean b;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/NfcSelectionFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/NfcSelectionFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return NfcSelectionFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Boolean bool, Boolean bool2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bool;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool2;
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
            return Intrinsics.areEqual(this.a, workflowSettings.a) && Intrinsics.areEqual(this.b, workflowSettings.b);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.b;
            return hashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }
    }

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MiSnapSettings.Nfc.Advanced.DocType.values().length];
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
            a = iArr;
        }
    }

    public final /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public static final b a = new b(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcSelectionBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.driversLicense;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.driversLicense);
            if (materialButton != null) {
                i = R.id.idCard;
                MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.idCard);
                if (materialButton2 != null) {
                    i = R.id.passport;
                    MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.passport);
                    if (materialButton3 != null) {
                        i = R.id.skipButton;
                        MaterialButton materialButton4 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.skipButton);
                        if (materialButton4 != null) {
                            return new k((LinearLayout) view, materialButton, materialButton2, materialButton3, materialButton4);
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
        public final /* synthetic */ NfcSelectionFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(NfcSelectionFragment nfcSelectionFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = nfcSelectionFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            NfcSelectionFragment nfcSelectionFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(nfcSelectionFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = nfcSelectionFragment.requireActivity();
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

    public NfcSelectionFragment() {
        super(R.layout.misnap_fragment_nfc_selection);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, b.a);
        this.b = true;
        this.d = LazyKt.lazy(new c(this, 0));
        this.e = new HelpFragment$$ExternalSyntheticLambda2(this, 8);
        this.f = LazyKt.lazy(new c(this, 1));
    }

    public final void a(MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
        try {
            FragmentKt.findNavController(this).navigate(R.id.navigateMrz1LineManualEntry);
        } catch (Exception e) {
            Log.e("NfcSelectionFragment", "Nav Graph Error", e);
            miSnapWorkflowViewModel.postNavigationError$workflow_release(new NavigationError(e, NfcSelectionFragment.class, hashCode(), NavigationAction$NfcSelection$NavigateNfc.INSTANCE$1));
        }
    }

    public final void b(MiSnapWorkflowViewModel miSnapWorkflowViewModel) {
        try {
            FragmentKt.findNavController(this).navigate(R.id.navigateMrzDataManualEntry);
        } catch (Exception e) {
            Log.e("NfcSelectionFragment", "Nav Graph Error", e);
            miSnapWorkflowViewModel.postNavigationError$workflow_release(new NavigationError(e, NfcSelectionFragment.class, hashCode(), NavigationAction$NfcSelection$NavigateNfc.INSTANCE$2));
        }
    }

    public final MiSnapWorkflowViewModel b$5() {
        return (MiSnapWorkflowViewModel) this.f.getValue();
    }

    public final /* synthetic */ k getBinding$workflow_release() {
        return (k) this.a.getValue((Fragment) this, g[0]);
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
        Object obj;
        Boolean b2;
        int intValue;
        Boolean b3;
        String str;
        String str2;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.containsKey("orientationKey")) {
            this.c = Integer.valueOf(bundle.getInt("orientationKey"));
        }
        final MiSnapSettings miSnapSettings = (MiSnapSettings) b$5().f.getValue();
        Object obj2 = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Nfc nfc = miSnapSettings.nfc;
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            Lazy lazy = this.d;
            String str3 = (String) lazy.getValue();
            if (str3 == null || (str2 = workflow.get(str3)) == null) {
                obj = null;
            } else {
                Json.Default r4 = Json.Default;
                r4.getClass();
                obj = r4.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            zzd zzdVar = Companion;
            if ((workflowSettings == null || (b2 = workflowSettings.b) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                zzdVar.getClass();
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
            Mrz mrz = nfc.a;
            if (mrz != null && ValidationUtil.isValidMrz(mrz)) {
                MiSnapWorkflowViewModel b$5 = b$5();
                try {
                    FragmentKt.findNavController(this).navigate(R.id.navigateNfc);
                } catch (Exception e) {
                    Log.e("NfcSelectionFragment", "Nav Graph Error", e);
                    b$5.postNavigationError$workflow_release(new NavigationError(e, NfcSelectionFragment.class, hashCode(), NavigationAction$NfcSelection$NavigateNfc.INSTANCE));
                }
            }
            MiSnapSettings.Nfc.Advanced.DocType docType = nfc.advanced.a;
            final int i = 2;
            final int i2 = 1;
            if (docType != null) {
                int i3 = a.a[docType.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    b(b$5());
                } else if (i3 == 3) {
                    a(b$5());
                }
            }
            String str4 = (String) lazy.getValue();
            if (str4 != null && (str = workflow.get(str4)) != null) {
                Json.Default r12 = Json.Default;
                r12.getClass();
                obj2 = r12.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (b3 = workflowSettings2.a) == null) && (b3 = MultipartBody.Companion.b(getArguments(), "showSkipButton")) == null) {
                zzdVar.getClass();
                b3 = Boolean.FALSE;
            }
            final int i4 = 0;
            if (b3.booleanValue()) {
                MaterialButton materialButton = getBinding$workflow_release().e;
                materialButton.setVisibility(0);
                materialButton.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 17));
            }
            getBinding$workflow_release().c.setOnClickListener(new View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = i4;
                    NfcSelectionFragment nfcSelectionFragment = this;
                    MiSnapSettings miSnapSettings2 = miSnapSettings;
                    switch (i5) {
                        case 0:
                            zzd zzdVar2 = NfcSelectionFragment.Companion;
                            miSnapSettings2.nfc.advanced.a = MiSnapSettings.Nfc.Advanced.DocType.ID;
                            nfcSelectionFragment.b$5().updateState$workflow_release(miSnapSettings2);
                            nfcSelectionFragment.b(nfcSelectionFragment.b$5());
                            break;
                        case 1:
                            zzd zzdVar3 = NfcSelectionFragment.Companion;
                            miSnapSettings2.nfc.advanced.a = MiSnapSettings.Nfc.Advanced.DocType.EU_DL;
                            nfcSelectionFragment.b$5().updateState$workflow_release(miSnapSettings2);
                            nfcSelectionFragment.a(nfcSelectionFragment.b$5());
                            break;
                        default:
                            zzd zzdVar4 = NfcSelectionFragment.Companion;
                            miSnapSettings2.nfc.advanced.a = MiSnapSettings.Nfc.Advanced.DocType.PASSPORT;
                            nfcSelectionFragment.b$5().updateState$workflow_release(miSnapSettings2);
                            nfcSelectionFragment.b(nfcSelectionFragment.b$5());
                            break;
                    }
                }
            });
            getBinding$workflow_release().b.setOnClickListener(new View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = i2;
                    NfcSelectionFragment nfcSelectionFragment = this;
                    MiSnapSettings miSnapSettings2 = miSnapSettings;
                    switch (i5) {
                        case 0:
                            zzd zzdVar2 = NfcSelectionFragment.Companion;
                            miSnapSettings2.nfc.advanced.a = MiSnapSettings.Nfc.Advanced.DocType.ID;
                            nfcSelectionFragment.b$5().updateState$workflow_release(miSnapSettings2);
                            nfcSelectionFragment.b(nfcSelectionFragment.b$5());
                            break;
                        case 1:
                            zzd zzdVar3 = NfcSelectionFragment.Companion;
                            miSnapSettings2.nfc.advanced.a = MiSnapSettings.Nfc.Advanced.DocType.EU_DL;
                            nfcSelectionFragment.b$5().updateState$workflow_release(miSnapSettings2);
                            nfcSelectionFragment.a(nfcSelectionFragment.b$5());
                            break;
                        default:
                            zzd zzdVar4 = NfcSelectionFragment.Companion;
                            miSnapSettings2.nfc.advanced.a = MiSnapSettings.Nfc.Advanced.DocType.PASSPORT;
                            nfcSelectionFragment.b$5().updateState$workflow_release(miSnapSettings2);
                            nfcSelectionFragment.b(nfcSelectionFragment.b$5());
                            break;
                    }
                }
            });
            getBinding$workflow_release().d.setOnClickListener(new View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcSelectionFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i5 = i;
                    NfcSelectionFragment nfcSelectionFragment = this;
                    MiSnapSettings miSnapSettings2 = miSnapSettings;
                    switch (i5) {
                        case 0:
                            zzd zzdVar2 = NfcSelectionFragment.Companion;
                            miSnapSettings2.nfc.advanced.a = MiSnapSettings.Nfc.Advanced.DocType.ID;
                            nfcSelectionFragment.b$5().updateState$workflow_release(miSnapSettings2);
                            nfcSelectionFragment.b(nfcSelectionFragment.b$5());
                            break;
                        case 1:
                            zzd zzdVar3 = NfcSelectionFragment.Companion;
                            miSnapSettings2.nfc.advanced.a = MiSnapSettings.Nfc.Advanced.DocType.EU_DL;
                            nfcSelectionFragment.b$5().updateState$workflow_release(miSnapSettings2);
                            nfcSelectionFragment.a(nfcSelectionFragment.b$5());
                            break;
                        default:
                            zzd zzdVar4 = NfcSelectionFragment.Companion;
                            miSnapSettings2.nfc.advanced.a = MiSnapSettings.Nfc.Advanced.DocType.PASSPORT;
                            nfcSelectionFragment.b$5().updateState$workflow_release(miSnapSettings2);
                            nfcSelectionFragment.b(nfcSelectionFragment.b$5());
                            break;
                    }
                }
            });
            obj2 = Unit.INSTANCE;
        }
        if (obj2 == null) {
            MiSnapWorkflowViewModel b$52 = b$5();
            Context requireContext = requireContext();
            requireContext.getClass();
            b$52.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
    }
}

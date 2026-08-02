package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
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
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.Mrz1Line;
import com.miteksystems.misnap.core.ValidationUtil;
import com.miteksystems.misnap.nfc.NfcSettings;
import com.miteksystems.misnap.nfc.util.NfcDocumentUtil;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.h;
import com.miteksystems.misnap.workflow.a.q;
import com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment;
import com.miteksystems.misnap.workflow.util.TextUtil;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import java.util.Iterator;
import java.util.Locale;
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
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.Json;
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.MultipartBody;
import sqip.internal.GiftCardEditor$$ExternalSyntheticLambda1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NfcMrz1LineManualEntryFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public boolean b;
    public Integer c;
    public final Lazy d;
    public final HelpFragment$$ExternalSyntheticLambda2 e;
    public final Lazy f;
    public static final /* synthetic */ KProperty[] g = {Reflection.factory.property1(new PropertyReference1Impl(NfcMrz1LineManualEntryFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcMrz1lineManualEntryBinding;", 0))};
    public static final Companion Companion = new Companion();

    public final class Companion {

        public abstract /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[MiSnapSettings.Nfc.Advanced.DocType.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[0] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static WorkflowSettings getDefaultWorkflowSettings(MiSnapSettings miSnapSettings) {
            Object failure;
            int i;
            int i2;
            try {
                Result.Companion companion = Result.Companion;
                MiSnapSettings.Nfc nfc = miSnapSettings.nfc;
                MiSnapSettings.Nfc.Advanced.DocType requireDocType = nfc != null ? NfcSettings.requireDocType(nfc) : null;
                i = requireDocType == null ? -1 : a.a[requireDocType.ordinal()];
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (i == 1) {
                i2 = R.layout.misnap_nfc_manual_entry_help_eudl;
            } else if (i == 2) {
                i2 = R.layout.misnap_nfc_manual_entry_help_id;
            } else {
                if (i != 3) {
                    failure = null;
                    return new WorkflowSettings((Integer) (failure instanceof Result.Failure ? null : failure));
                }
                i2 = R.layout.misnap_nfc_manual_entry_help_passport;
            }
            failure = Integer.valueOf(i2);
            return new WorkflowSettings((Integer) (failure instanceof Result.Failure ? null : failure));
        }
    }

    public final /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public static final a a = new a(1, h.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcMrz1lineManualEntryBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.buttonsGuideline;
            if (((Guideline) ViewBindings.findChildViewById(view, R.id.buttonsGuideline)) != null) {
                i = R.id.mrzString;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.mrzString);
                if (textInputEditText != null) {
                    i = R.id.mrzStringLabel;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.mrzStringLabel);
                    if (textInputLayout != null) {
                        i = R.id.needHelpButton;
                        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.needHelpButton);
                        if (materialButton != null) {
                            i = R.id.skipButton;
                            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.skipButton);
                            if (materialButton2 != null) {
                                i = R.id.submitButton;
                                MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.submitButton);
                                if (materialButton3 != null) {
                                    i = R.id.title;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                    if (textView != null) {
                                        return new h((ConstraintLayout) view, textInputEditText, textInputLayout, materialButton, materialButton2, materialButton3, textView);
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

    public final class b extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ NfcMrz1LineManualEntryFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = nfcMrz1LineManualEntryFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(nfcMrz1LineManualEntryFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = nfcMrz1LineManualEntryFragment.requireActivity();
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

    public NfcMrz1LineManualEntryFragment() {
        super(R.layout.misnap_fragment_nfc_mrz1line_manual_entry);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, a.a);
        this.b = true;
        this.d = LazyKt.lazy(new b(this, 0));
        this.e = new HelpFragment$$ExternalSyntheticLambda2(this, 5);
        this.f = LazyKt.lazy(new b(this, 1));
    }

    public static final void a(NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment, MiSnapSettings miSnapSettings) {
        int i;
        Mrz1Line mrz1Line = new Mrz1Line(String.valueOf(nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getText()));
        String str = null;
        if (!ValidationUtil.isValidMrz(mrz1Line)) {
            TextInputLayout textInputLayout = nfcMrz1LineManualEntryFragment.getBinding$workflow_release().d;
            if (ValidationUtil.areFieldsEmpty(String.valueOf(nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getText()))) {
                i = R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentErrorEmptyField;
            } else {
                if (!ValidationUtil.isFieldLengthIncorrect(String.valueOf(nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getText()), ValidationUtil.f)) {
                    if (ValidationUtil.containsIllegalMrzCharacters(String.valueOf(nfcMrz1LineManualEntryFragment.getBinding$workflow_release().c.getText()))) {
                        i = R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentErrorMrzStringInvalid;
                    }
                    textInputLayout.setError(str);
                    return;
                }
                i = R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentErrorMrzStringLengthIncorrect;
            }
            str = nfcMrz1LineManualEntryFragment.getString(i);
            textInputLayout.setError(str);
            return;
        }
        nfcMrz1LineManualEntryFragment.getBinding$workflow_release().d.setError(null);
        Context requireContext = nfcMrz1LineManualEntryFragment.requireContext();
        requireContext.getClass();
        if (!NfcDocumentUtil.isDocumentNfcEnabled(requireContext, mrz1Line)) {
            MiSnapWorkflowViewModel b$3 = nfcMrz1LineManualEntryFragment.b$3();
            Context requireContext2 = nfcMrz1LineManualEntryFragment.requireContext();
            requireContext2.getClass();
            b$3.postError$workflow_release(requireContext2, MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE);
            return;
        }
        miSnapSettings.nfc.a = mrz1Line;
        nfcMrz1LineManualEntryFragment.b$3().updateState$workflow_release(miSnapSettings);
        try {
            FragmentKt.findNavController(nfcMrz1LineManualEntryFragment).navigate(R.id.navigateContinue);
        } catch (Exception e) {
            Log.e("Mrz1LineManualEntry", "Nav Graph Error", e);
            nfcMrz1LineManualEntryFragment.b$3().postNavigationError$workflow_release(new NavigationError(e, NfcMrz1LineManualEntryFragment.class, nfcMrz1LineManualEntryFragment.hashCode(), NavigationAction$MrzManualEntry$NavigateSkip.INSTANCE$1));
        }
    }

    public final MiSnapWorkflowViewModel b$3() {
        return (MiSnapWorkflowViewModel) this.f.getValue();
    }

    public final /* synthetic */ h getBinding$workflow_release() {
        return (h) this.a.getValue((Fragment) this, g[0]);
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
        Object obj2;
        Boolean b3;
        String str;
        String str2;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.containsKey("orientationKey")) {
            this.c = Integer.valueOf(bundle.getInt("orientationKey"));
        }
        final MiSnapSettings miSnapSettings = (MiSnapSettings) b$3().f.getValue();
        Unit unit = null;
        if (miSnapSettings != null) {
            MiSnapSettings.Workflow workflow = miSnapSettings.workflow;
            Lazy lazy = this.d;
            String str3 = (String) lazy.getValue();
            if (str3 == null || (str2 = workflow.get(str3)) == null) {
                obj = null;
            } else {
                Json.Default r3 = Json.Default;
                r3.getClass();
                obj = r3.decodeFromString(str2, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings = (WorkflowSettings) obj;
            Companion companion = Companion;
            if ((workflowSettings == null || (b2 = workflowSettings.c) == null) && (b2 = MultipartBody.Companion.b(getArguments(), "handleOrientation")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b2 = Boolean.TRUE;
            }
            boolean booleanValue = b2.booleanValue();
            this.b = booleanValue;
            if (booleanValue) {
                try {
                    Result.Companion companion2 = Result.Companion;
                    FragmentKt.findNavController(this).addOnDestinationChangedListener(this.e);
                } catch (Throwable unused) {
                    Result.Companion companion3 = Result.Companion;
                }
                Integer forcedOrientation = Position.getForcedOrientation(workflow, miSnapSettings.a);
                if (forcedOrientation != null && requireActivity().getRequestedOrientation() != (intValue = forcedOrientation.intValue())) {
                    this.c = Integer.valueOf(requireActivity().getRequestedOrientation());
                    requireActivity().setRequestedOrientation(intValue);
                }
            }
            String str4 = (String) lazy.getValue();
            if (str4 == null || (str = workflow.get(str4)) == null) {
                obj2 = null;
            } else {
                Json.Default r1 = Json.Default;
                r1.getClass();
                obj2 = r1.decodeFromString(str, WorkflowSettings.Companion.serializer());
            }
            WorkflowSettings workflowSettings2 = (WorkflowSettings) obj2;
            if ((workflowSettings2 == null || (b3 = workflowSettings2.b) == null) && (b3 = MultipartBody.Companion.b(getArguments(), "showSkipButton")) == null) {
                companion.getClass();
                Companion.getDefaultWorkflowSettings(miSnapSettings);
                b3 = Boolean.FALSE;
            }
            final int i = 0;
            if (b3.booleanValue()) {
                MaterialButton materialButton = getBinding$workflow_release().f;
                materialButton.setVisibility(0);
                materialButton.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 15));
            }
            getBinding$workflow_release().e.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment$$ExternalSyntheticLambda2
                public final /* synthetic */ NfcMrz1LineManualEntryFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object obj3;
                    Integer d;
                    String str5;
                    int i2 = i;
                    MiSnapSettings miSnapSettings2 = miSnapSettings;
                    NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment = this.f$0;
                    switch (i2) {
                        case 0:
                            NfcMrz1LineManualEntryFragment.Companion companion4 = NfcMrz1LineManualEntryFragment.Companion;
                            String str6 = (String) nfcMrz1LineManualEntryFragment.d.getValue();
                            if (str6 == null || (str5 = miSnapSettings2.workflow.get(str6)) == null) {
                                obj3 = null;
                            } else {
                                Json.Default r12 = Json.Default;
                                r12.getClass();
                                obj3 = r12.decodeFromString(str5, NfcMrz1LineManualEntryFragment.WorkflowSettings.Companion.serializer());
                            }
                            NfcMrz1LineManualEntryFragment.WorkflowSettings workflowSettings3 = (NfcMrz1LineManualEntryFragment.WorkflowSettings) obj3;
                            if ((workflowSettings3 == null || (d = workflowSettings3.a) == null) && (d = MultipartBody.Companion.d(nfcMrz1LineManualEntryFragment.getArguments(), "helpDialogueLayoutId")) == null) {
                                NfcMrz1LineManualEntryFragment.Companion.getClass();
                                d = NfcMrz1LineManualEntryFragment.Companion.getDefaultWorkflowSettings(miSnapSettings2).a;
                            }
                            if (d != null) {
                                int intValue2 = d.intValue();
                                Context requireContext = nfcMrz1LineManualEntryFragment.requireContext();
                                requireContext.getClass();
                                new q(requireContext, intValue2).show();
                                break;
                            }
                            break;
                        default:
                            NfcMrz1LineManualEntryFragment.a(nfcMrz1LineManualEntryFragment, miSnapSettings2);
                            break;
                    }
                }
            });
            Mrz mrz = miSnapSettings.nfc.a;
            if (mrz != null) {
                if (mrz instanceof Mrz1Line) {
                    TextInputEditText textInputEditText = getBinding$workflow_release().c;
                    String obj3 = StringsKt.trim(((Mrz1Line) mrz).b).toString();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String upperCase = obj3.toUpperCase(locale);
                    upperCase.getClass();
                    textInputEditText.setText(upperCase);
                } else {
                    getBinding$workflow_release().h.setText(R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentTitle);
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                getBinding$workflow_release().h.setText(R.string.misnapWorkflowNfcMrz1LineManualEntryFragmentTitle);
            }
            getBinding$workflow_release().c.addTextChangedListener(new SearchView.AnonymousClass10(this, 5));
            final int i2 = 1;
            getBinding$workflow_release().c.setOnEditorActionListener(new GiftCardEditor$$ExternalSyntheticLambda1(this, 1));
            getBinding$workflow_release().g.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment$$ExternalSyntheticLambda2
                public final /* synthetic */ NfcMrz1LineManualEntryFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object obj32;
                    Integer d;
                    String str5;
                    int i22 = i2;
                    MiSnapSettings miSnapSettings2 = miSnapSettings;
                    NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment = this.f$0;
                    switch (i22) {
                        case 0:
                            NfcMrz1LineManualEntryFragment.Companion companion4 = NfcMrz1LineManualEntryFragment.Companion;
                            String str6 = (String) nfcMrz1LineManualEntryFragment.d.getValue();
                            if (str6 == null || (str5 = miSnapSettings2.workflow.get(str6)) == null) {
                                obj32 = null;
                            } else {
                                Json.Default r12 = Json.Default;
                                r12.getClass();
                                obj32 = r12.decodeFromString(str5, NfcMrz1LineManualEntryFragment.WorkflowSettings.Companion.serializer());
                            }
                            NfcMrz1LineManualEntryFragment.WorkflowSettings workflowSettings3 = (NfcMrz1LineManualEntryFragment.WorkflowSettings) obj32;
                            if ((workflowSettings3 == null || (d = workflowSettings3.a) == null) && (d = MultipartBody.Companion.d(nfcMrz1LineManualEntryFragment.getArguments(), "helpDialogueLayoutId")) == null) {
                                NfcMrz1LineManualEntryFragment.Companion.getClass();
                                d = NfcMrz1LineManualEntryFragment.Companion.getDefaultWorkflowSettings(miSnapSettings2).a;
                            }
                            if (d != null) {
                                int intValue2 = d.intValue();
                                Context requireContext = nfcMrz1LineManualEntryFragment.requireContext();
                                requireContext.getClass();
                                new q(requireContext, intValue2).show();
                                break;
                            }
                            break;
                        default:
                            NfcMrz1LineManualEntryFragment.a(nfcMrz1LineManualEntryFragment, miSnapSettings2);
                            break;
                    }
                }
            });
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel b$3 = b$3();
            Context requireContext = requireContext();
            requireContext.getClass();
            b$3.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        TextView textView = getBinding$workflow_release().h;
        float f = textView.getContext().getResources().getConfiguration().fontScale;
        if (f > 1.0f) {
            com.miteksystems.misnap.workflow.a.b.a(textView, f);
        }
        Iterator it = TextUtil.getTextViews$workflow_release(getBinding$workflow_release().d).iterator();
        while (it.hasNext()) {
            TextView textView2 = (TextView) it.next();
            textView2.getClass();
            float f2 = textView2.getContext().getResources().getConfiguration().fontScale;
            if (f2 > 1.0f) {
                com.miteksystems.misnap.workflow.a.b.a(textView2, f2);
            }
        }
    }

    @Serializable
    public final class WorkflowSettings {
        public static final Companion Companion = new Companion();
        public final Integer a;
        public final Boolean b;
        public final Boolean c;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/NfcMrz1LineManualEntryFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return NfcMrz1LineManualEntryFragment$WorkflowSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkflowSettings(int i, Integer num, Boolean bool, Boolean bool2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bool2;
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
            return Intrinsics.areEqual(this.a, workflowSettings.a) && Intrinsics.areEqual(this.b, workflowSettings.b) && Intrinsics.areEqual(this.c, workflowSettings.c);
        }

        public final int hashCode() {
            Integer num = this.a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.c;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            return r0.encodeToString(Companion.serializer(), this);
        }

        public WorkflowSettings(Integer num) {
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            this.a = num;
            this.b = bool;
            this.c = bool2;
        }
    }
}

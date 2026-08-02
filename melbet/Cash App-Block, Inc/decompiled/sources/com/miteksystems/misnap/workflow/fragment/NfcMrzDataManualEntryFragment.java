package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
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
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.miteksystems.misnap.core.DateUtil;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.core.MrzData;
import com.miteksystems.misnap.core.ValidationUtil;
import com.miteksystems.misnap.nfc.NfcSettings;
import com.miteksystems.misnap.nfc.util.NfcDocumentUtil;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.i;
import com.miteksystems.misnap.workflow.a.q;
import com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment;
import com.miteksystems.misnap.workflow.util.TextUtil;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import java.util.Calendar;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "WorkflowSettings", "workflow_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NfcMrzDataManualEntryFragment extends Fragment {
    public final ViewBindingUtil$FragmentViewBindingDelegate a;
    public boolean b;
    public Integer c;
    public final Lazy d;
    public final HelpFragment$$ExternalSyntheticLambda2 e;
    public final Lazy f;
    public static final /* synthetic */ KProperty[] g = {Reflection.factory.property1(new PropertyReference1Impl(NfcMrzDataManualEntryFragment.class, "binding", "getBinding$workflow_release()Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcMrzdataManualEntryBinding;", 0))};
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
        public static final a a = new a(1, i.class, "bind", "bind(Landroid/view/View;)Lcom/miteksystems/misnap/workflow/databinding/MisnapFragmentNfcMrzdataManualEntryBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            View view = (View) obj;
            view.getClass();
            int i = R.id.buttonsGuideline;
            if (((Guideline) ViewBindings.findChildViewById(view, R.id.buttonsGuideline)) != null) {
                i = R.id.dateOfBirth;
                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.dateOfBirth);
                if (textInputEditText != null) {
                    i = R.id.dateOfBirthLabel;
                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.dateOfBirthLabel);
                    if (textInputLayout != null) {
                        i = R.id.documentCode;
                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.documentCode);
                        if (textInputEditText2 != null) {
                            i = R.id.documentCodeLabel;
                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.documentCodeLabel);
                            if (textInputLayout2 != null) {
                                i = R.id.documentNumber;
                                TextInputEditText textInputEditText3 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.documentNumber);
                                if (textInputEditText3 != null) {
                                    i = R.id.documentNumberLabel;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.documentNumberLabel);
                                    if (textInputLayout3 != null) {
                                        i = R.id.expirationDate;
                                        TextInputEditText textInputEditText4 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.expirationDate);
                                        if (textInputEditText4 != null) {
                                            i = R.id.expirationDateLabel;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.expirationDateLabel);
                                            if (textInputLayout4 != null) {
                                                i = R.id.issuingCountry;
                                                TextInputEditText textInputEditText5 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.issuingCountry);
                                                if (textInputEditText5 != null) {
                                                    i = R.id.issuingCountryLabel;
                                                    TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.issuingCountryLabel);
                                                    if (textInputLayout5 != null) {
                                                        i = R.id.mrzFieldsContainer;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.mrzFieldsContainer);
                                                        if (linearLayout != null) {
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
                                                                            return new i((ScrollView) view, textInputEditText, textInputLayout, textInputEditText2, textInputLayout2, textInputEditText3, textInputLayout3, textInputEditText4, textInputLayout4, textInputEditText5, textInputLayout5, linearLayout, materialButton, materialButton2, materialButton3, textView);
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

    public final class b extends Lambda implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ NfcMrzDataManualEntryFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, int i) {
            super(0);
            this.$r8$classId = i;
            this.a = nfcMrzDataManualEntryFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object failure;
            CharSequence charSequence;
            int i = this.$r8$classId;
            NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = this.a;
            switch (i) {
                case 0:
                    try {
                        Result.Companion companion = Result.Companion;
                        NavDestination currentDestination$navigation_runtime_release = FragmentKt.findNavController(nfcMrzDataManualEntryFragment).impl.getCurrentDestination$navigation_runtime_release();
                        failure = (currentDestination$navigation_runtime_release == null || (charSequence = currentDestination$navigation_runtime_release.label) == null) ? null : charSequence.toString();
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    return (String) (failure instanceof Result.Failure ? null : failure);
                default:
                    FragmentActivity requireActivity = nfcMrzDataManualEntryFragment.requireActivity();
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

    public final class d extends Lambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ NfcMrzDataManualEntryFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, int i) {
            super(1);
            this.$r8$classId = i;
            this.a = nfcMrzDataManualEntryFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            int i = this.$r8$classId;
            NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = this.a;
            Long l = (Long) obj;
            switch (i) {
                case 0:
                    TextInputEditText textInputEditText = nfcMrzDataManualEntryFragment.getBinding$workflow_release().i;
                    l.getClass();
                    textInputEditText.setText(DateUtil.formatDate$core_release(l.longValue(), "dd MMM yy"));
                    break;
                default:
                    TextInputEditText textInputEditText2 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().c;
                    l.getClass();
                    textInputEditText2.setText(DateUtil.formatDate$core_release(l.longValue(), "dd MMM yy"));
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public final class e implements TextWatcher {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ NfcMrzDataManualEntryFragment a;

        public /* synthetic */ e(NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, int i) {
            this.$r8$classId = i;
            this.a = nfcMrzDataManualEntryFragment;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            switch (this.$r8$classId) {
                case 0:
                    editable.getClass();
                    break;
                case 1:
                    editable.getClass();
                    break;
                default:
                    editable.getClass();
                    break;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 0:
                    charSequence.getClass();
                    break;
                case 1:
                    charSequence.getClass();
                    break;
                default:
                    charSequence.getClass();
                    break;
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
            NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = this.a;
            charSequence.getClass();
            i binding$workflow_release = nfcMrzDataManualEntryFragment.getBinding$workflow_release();
            switch (i4) {
                case 0:
                    String valueOf = String.valueOf(binding$workflow_release.k.getText());
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String upperCase = valueOf.toUpperCase(locale);
                    upperCase.getClass();
                    if (!valueOf.equals(upperCase)) {
                        int selectionEnd = nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getSelectionEnd();
                        nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.setText(upperCase);
                        nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.setSelection(selectionEnd);
                        break;
                    }
                    break;
                case 1:
                    String valueOf2 = String.valueOf(binding$workflow_release.e.getText());
                    Locale locale2 = Locale.getDefault();
                    locale2.getClass();
                    String upperCase2 = valueOf2.toUpperCase(locale2);
                    upperCase2.getClass();
                    if (!valueOf2.equals(upperCase2)) {
                        int selectionEnd2 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getSelectionEnd();
                        nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.setText(upperCase2);
                        nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.setSelection(selectionEnd2);
                        break;
                    }
                    break;
                default:
                    String valueOf3 = String.valueOf(binding$workflow_release.g.getText());
                    Locale locale3 = Locale.getDefault();
                    locale3.getClass();
                    String upperCase3 = valueOf3.toUpperCase(locale3);
                    upperCase3.getClass();
                    if (!valueOf3.equals(upperCase3)) {
                        int selectionEnd3 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.getSelectionEnd();
                        nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.setText(upperCase3);
                        nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.setSelection(selectionEnd3);
                        break;
                    }
                    break;
            }
        }
    }

    public NfcMrzDataManualEntryFragment() {
        super(R.layout.misnap_fragment_nfc_mrzdata_manual_entry);
        this.a = new ViewBindingUtil$FragmentViewBindingDelegate(this, a.a);
        this.b = true;
        this.d = LazyKt.lazy(new b(this, 0));
        this.e = new HelpFragment$$ExternalSyntheticLambda2(this, 6);
        this.f = LazyKt.lazy(new b(this, 1));
    }

    public static final void a(NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment, MiSnapSettings miSnapSettings) {
        String formatDate$core_release;
        String formatDate$core_release2;
        String string2;
        String string3;
        String string4;
        int i;
        int i2;
        long parseDate;
        int i3;
        String valueOf = String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.getText());
        formatDate$core_release = DateUtil.formatDate$core_release(DateUtil.parseDate(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().c.getText()), "dd MMM yy", (r3 & 8) == 0, (r3 & 16) == 0), "yyMMdd");
        formatDate$core_release2 = DateUtil.formatDate$core_release(DateUtil.parseDate(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().i.getText()), "dd MMM yy", (r3 & 8) == 0, (r3 & 16) == 0), "yyMMdd");
        MrzData mrzData = new MrzData(valueOf, formatDate$core_release, formatDate$core_release2, StringsKt.padEnd(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText()), 3, '<'), StringsKt.padEnd(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText()), 2, '<'), "<<<<<<<<<<<<<<", "", "");
        String str = null;
        if (ValidationUtil.isValidMrz(mrzData)) {
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().h.setError(null);
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().d.setError(null);
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().j.setError(null);
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().l.setError(null);
            nfcMrzDataManualEntryFragment.getBinding$workflow_release().f.setError(null);
            Context requireContext = nfcMrzDataManualEntryFragment.requireContext();
            requireContext.getClass();
            if (!NfcDocumentUtil.isDocumentNfcEnabled(requireContext, mrzData)) {
                MiSnapWorkflowViewModel b$4 = nfcMrzDataManualEntryFragment.b$4();
                Context requireContext2 = nfcMrzDataManualEntryFragment.requireContext();
                requireContext2.getClass();
                b$4.postError$workflow_release(requireContext2, MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE);
                return;
            }
            miSnapSettings.nfc.a = mrzData;
            nfcMrzDataManualEntryFragment.b$4().updateState$workflow_release(miSnapSettings);
            try {
                FragmentKt.findNavController(nfcMrzDataManualEntryFragment).navigate(R.id.navigateContinue);
                return;
            } catch (Exception e2) {
                Log.e("MrzDataManualEntry", "Nav Graph Error", e2);
                nfcMrzDataManualEntryFragment.b$4().postNavigationError$workflow_release(new NavigationError(e2, NfcMrzDataManualEntryFragment.class, nfcMrzDataManualEntryFragment.hashCode(), NavigationAction$MrzManualEntry$NavigateSkip.INSTANCE$1));
                return;
            }
        }
        TextInputLayout textInputLayout = nfcMrzDataManualEntryFragment.getBinding$workflow_release().h;
        Editable text = nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.getText();
        if (text == null || StringsKt.isBlank(text)) {
            string2 = nfcMrzDataManualEntryFragment.getString(R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField);
        } else {
            if (ValidationUtil.isDocumentNumberLengthIncorrect(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.getText()), String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText()))) {
                i3 = R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDocumentNumberLengthIncorrect;
            } else if (ValidationUtil.containsIllegalMrzCharacters(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().g.getText()))) {
                i3 = R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDocumentNumberInvalid;
            } else {
                string2 = null;
            }
            string2 = nfcMrzDataManualEntryFragment.getString(i3);
        }
        textInputLayout.setError(string2);
        TextInputLayout textInputLayout2 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().d;
        Editable text2 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().c.getText();
        if (text2 == null || StringsKt.isBlank(text2)) {
            string3 = nfcMrzDataManualEntryFragment.getString(R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField);
        } else {
            parseDate = DateUtil.parseDate(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().c.getText()), "dd MMM yy", true, (r2 & 8) == 0);
            Calendar utcCalendar = DateUtil.getUtcCalendar();
            utcCalendar.setTimeInMillis(parseDate);
            string3 = utcCalendar.after(DateUtil.getUtcCalendar()) ? nfcMrzDataManualEntryFragment.getString(R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDobIsInFuture) : null;
        }
        textInputLayout2.setError(string3);
        TextInputLayout textInputLayout3 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().j;
        Editable text3 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().i.getText();
        textInputLayout3.setError((text3 == null || StringsKt.isBlank(text3)) ? nfcMrzDataManualEntryFragment.getString(R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField) : ValidationUtil.isDobAfterDoe(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().c.getText()), String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().i.getText())) ? nfcMrzDataManualEntryFragment.getString(R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDoeIsNotAfterDob) : null);
        TextInputLayout textInputLayout4 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().l;
        Editable text4 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText();
        if (text4 == null || StringsKt.isBlank(text4)) {
            string4 = nfcMrzDataManualEntryFragment.getString(R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField);
        } else {
            if (ValidationUtil.isFieldLengthIncorrect(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText()), ValidationUtil.g)) {
                i2 = R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorIssuingCountryLengthIncorrect;
            } else {
                if (ValidationUtil.b.matches(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().k.getText()))) {
                    string4 = null;
                } else {
                    i2 = R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorIssuingCountryInvalid;
                }
            }
            string4 = nfcMrzDataManualEntryFragment.getString(i2);
        }
        textInputLayout4.setError(string4);
        TextInputLayout textInputLayout5 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().f;
        Editable text5 = nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText();
        if (text5 == null || StringsKt.isBlank(text5)) {
            str = nfcMrzDataManualEntryFragment.getString(R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorEmptyField);
        } else {
            if (ValidationUtil.isFieldLengthIncorrect(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText()), ValidationUtil.h)) {
                i = R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDocumentCodeLengthIncorrect;
            } else {
                if (!ValidationUtil.b.matches(String.valueOf(nfcMrzDataManualEntryFragment.getBinding$workflow_release().e.getText()))) {
                    i = R.string.misnapWorkflowNfcMrzDataManualEntryFragmentErrorDocumentCodeInvalid;
                }
            }
            str = nfcMrzDataManualEntryFragment.getString(i);
        }
        textInputLayout5.setError(str);
    }

    public final MiSnapWorkflowViewModel b$4() {
        return (MiSnapWorkflowViewModel) this.f.getValue();
    }

    public final /* synthetic */ i getBinding$workflow_release() {
        return (i) this.a.getValue((Fragment) this, g[0]);
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
        long parseDate;
        long parseDate2;
        String formatDate$core_release;
        String formatDate$core_release2;
        String str;
        String str2;
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle != null && bundle.containsKey("orientationKey")) {
            this.c = Integer.valueOf(bundle.getInt("orientationKey"));
        }
        final MiSnapSettings miSnapSettings = (MiSnapSettings) b$4().f.getValue();
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
                MaterialButton materialButton = getBinding$workflow_release().o;
                materialButton.setVisibility(0);
                materialButton.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 16));
            }
            getBinding$workflow_release().n.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda1
                public final /* synthetic */ NfcMrzDataManualEntryFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object obj3;
                    Integer d2;
                    String str5;
                    int i2 = i;
                    MiSnapSettings miSnapSettings2 = miSnapSettings;
                    NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = this.f$0;
                    switch (i2) {
                        case 0:
                            NfcMrzDataManualEntryFragment.Companion companion4 = NfcMrzDataManualEntryFragment.Companion;
                            String str6 = (String) nfcMrzDataManualEntryFragment.d.getValue();
                            if (str6 == null || (str5 = miSnapSettings2.workflow.get(str6)) == null) {
                                obj3 = null;
                            } else {
                                Json.Default r12 = Json.Default;
                                r12.getClass();
                                obj3 = r12.decodeFromString(str5, NfcMrzDataManualEntryFragment.WorkflowSettings.Companion.serializer());
                            }
                            NfcMrzDataManualEntryFragment.WorkflowSettings workflowSettings3 = (NfcMrzDataManualEntryFragment.WorkflowSettings) obj3;
                            if ((workflowSettings3 == null || (d2 = workflowSettings3.a) == null) && (d2 = MultipartBody.Companion.d(nfcMrzDataManualEntryFragment.getArguments(), "helpDialogueLayoutId")) == null) {
                                NfcMrzDataManualEntryFragment.Companion.getClass();
                                d2 = NfcMrzDataManualEntryFragment.Companion.getDefaultWorkflowSettings(miSnapSettings2).a;
                            }
                            if (d2 != null) {
                                int intValue2 = d2.intValue();
                                Context requireContext = nfcMrzDataManualEntryFragment.requireContext();
                                requireContext.getClass();
                                new q(requireContext, intValue2).show();
                                break;
                            }
                            break;
                        default:
                            NfcMrzDataManualEntryFragment.a(nfcMrzDataManualEntryFragment, miSnapSettings2);
                            break;
                    }
                }
            });
            Mrz mrz = miSnapSettings.nfc.a;
            if (mrz != null) {
                if (mrz instanceof MrzData) {
                    TextInputEditText textInputEditText = getBinding$workflow_release().g;
                    MrzData mrzData = (MrzData) mrz;
                    String obj3 = StringsKt.trim(mrzData.b).toString();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String upperCase = obj3.toUpperCase(locale);
                    upperCase.getClass();
                    textInputEditText.setText(upperCase);
                    TextInputEditText textInputEditText2 = getBinding$workflow_release().c;
                    formatDate$core_release = DateUtil.formatDate$core_release(DateUtil.parseDate(StringsKt.trim(mrzData.c).toString(), "yyMMdd", (r3 & 8) == 0, (r3 & 16) == 0), "dd MMM yy");
                    textInputEditText2.setText(formatDate$core_release);
                    TextInputEditText textInputEditText3 = getBinding$workflow_release().i;
                    formatDate$core_release2 = DateUtil.formatDate$core_release(DateUtil.parseDate(StringsKt.trim(mrzData.d).toString(), "yyMMdd", (r3 & 8) == 0, (r3 & 16) == 0), "dd MMM yy");
                    textInputEditText3.setText(formatDate$core_release2);
                    TextInputEditText textInputEditText4 = getBinding$workflow_release().k;
                    String obj4 = StringsKt.trim(mrzData.e).toString();
                    Locale locale2 = Locale.getDefault();
                    locale2.getClass();
                    String upperCase2 = obj4.toUpperCase(locale2);
                    upperCase2.getClass();
                    textInputEditText4.setText(upperCase2);
                    TextInputEditText textInputEditText5 = getBinding$workflow_release().e;
                    String obj5 = StringsKt.trim(mrzData.f).toString();
                    Locale locale3 = Locale.getDefault();
                    locale3.getClass();
                    String upperCase3 = obj5.toUpperCase(locale3);
                    upperCase3.getClass();
                    textInputEditText5.setText(upperCase3);
                } else {
                    getBinding$workflow_release().q.setText(R.string.misnapWorkflowNfcMrzDataManualEntryFragmentTitle);
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                getBinding$workflow_release().q.setText(R.string.misnapWorkflowNfcMrzDataManualEntryFragmentTitle);
            }
            getBinding$workflow_release().g.addTextChangedListener(new e(this, 2));
            zzv zzvVar = new zzv(new SingleDateSelector());
            parseDate = DateUtil.parseDate(String.valueOf(getBinding$workflow_release().c.getText()), "dd MMM yy", true, (r2 & 8) == 0);
            long timeInMillis = DateUtil.getUtcCalendar().getTimeInMillis();
            CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
            builder.validator = new com.miteksystems.misnap.workflow.fragment.a(Long.MIN_VALUE, timeInMillis);
            builder.end = timeInMillis;
            builder.openAt = Long.valueOf(parseDate);
            CalendarConstraints build = builder.build();
            zzvVar.zzd = Long.valueOf(parseDate);
            zzvVar.zzc = build;
            final MaterialDatePicker build2 = zzvVar.build();
            final int i2 = 1;
            build2.onPositiveButtonClickListeners.add(new NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2(new d(this, i2), 0));
            getBinding$workflow_release().c.setOnClickListener(new View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = i;
                    NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = this;
                    MaterialDatePicker materialDatePicker = build2;
                    switch (i3) {
                        case 0:
                            NfcMrzDataManualEntryFragment.Companion companion4 = NfcMrzDataManualEntryFragment.Companion;
                            materialDatePicker.show(nfcMrzDataManualEntryFragment.getChildFragmentManager(), "dob_date_picker");
                            break;
                        default:
                            NfcMrzDataManualEntryFragment.Companion companion5 = NfcMrzDataManualEntryFragment.Companion;
                            materialDatePicker.show(nfcMrzDataManualEntryFragment.getChildFragmentManager(), "doe_date_picker");
                            break;
                    }
                }
            });
            zzv zzvVar2 = new zzv(new SingleDateSelector());
            parseDate2 = DateUtil.parseDate(String.valueOf(getBinding$workflow_release().i.getText()), "dd MMM yy", true, (r2 & 8) == 0);
            CalendarConstraints.Builder builder2 = new CalendarConstraints.Builder();
            builder2.openAt = Long.valueOf(parseDate2);
            CalendarConstraints build3 = builder2.build();
            zzvVar2.zzd = Long.valueOf(parseDate2);
            zzvVar2.zzc = build3;
            final MaterialDatePicker build4 = zzvVar2.build();
            build4.onPositiveButtonClickListeners.add(new NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda2(new d(this, i), 1));
            getBinding$workflow_release().i.setOnClickListener(new View.OnClickListener() { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = i2;
                    NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = this;
                    MaterialDatePicker materialDatePicker = build4;
                    switch (i3) {
                        case 0:
                            NfcMrzDataManualEntryFragment.Companion companion4 = NfcMrzDataManualEntryFragment.Companion;
                            materialDatePicker.show(nfcMrzDataManualEntryFragment.getChildFragmentManager(), "dob_date_picker");
                            break;
                        default:
                            NfcMrzDataManualEntryFragment.Companion companion5 = NfcMrzDataManualEntryFragment.Companion;
                            materialDatePicker.show(nfcMrzDataManualEntryFragment.getChildFragmentManager(), "doe_date_picker");
                            break;
                    }
                }
            });
            getBinding$workflow_release().k.addTextChangedListener(new e(this, i));
            getBinding$workflow_release().e.addTextChangedListener(new e(this, i2));
            getBinding$workflow_release().p.setOnClickListener(new View.OnClickListener(this) { // from class: com.miteksystems.misnap.workflow.fragment.NfcMrzDataManualEntryFragment$$ExternalSyntheticLambda1
                public final /* synthetic */ NfcMrzDataManualEntryFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object obj32;
                    Integer d2;
                    String str5;
                    int i22 = i2;
                    MiSnapSettings miSnapSettings2 = miSnapSettings;
                    NfcMrzDataManualEntryFragment nfcMrzDataManualEntryFragment = this.f$0;
                    switch (i22) {
                        case 0:
                            NfcMrzDataManualEntryFragment.Companion companion4 = NfcMrzDataManualEntryFragment.Companion;
                            String str6 = (String) nfcMrzDataManualEntryFragment.d.getValue();
                            if (str6 == null || (str5 = miSnapSettings2.workflow.get(str6)) == null) {
                                obj32 = null;
                            } else {
                                Json.Default r12 = Json.Default;
                                r12.getClass();
                                obj32 = r12.decodeFromString(str5, NfcMrzDataManualEntryFragment.WorkflowSettings.Companion.serializer());
                            }
                            NfcMrzDataManualEntryFragment.WorkflowSettings workflowSettings3 = (NfcMrzDataManualEntryFragment.WorkflowSettings) obj32;
                            if ((workflowSettings3 == null || (d2 = workflowSettings3.a) == null) && (d2 = MultipartBody.Companion.d(nfcMrzDataManualEntryFragment.getArguments(), "helpDialogueLayoutId")) == null) {
                                NfcMrzDataManualEntryFragment.Companion.getClass();
                                d2 = NfcMrzDataManualEntryFragment.Companion.getDefaultWorkflowSettings(miSnapSettings2).a;
                            }
                            if (d2 != null) {
                                int intValue2 = d2.intValue();
                                Context requireContext = nfcMrzDataManualEntryFragment.requireContext();
                                requireContext.getClass();
                                new q(requireContext, intValue2).show();
                                break;
                            }
                            break;
                        default:
                            NfcMrzDataManualEntryFragment.a(nfcMrzDataManualEntryFragment, miSnapSettings2);
                            break;
                    }
                }
            });
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            MiSnapWorkflowViewModel b$4 = b$4();
            Context requireContext = requireContext();
            requireContext.getClass();
            b$4.postError$workflow_release(requireContext, MiSnapWorkflowError.SettingState.INSTANCE);
        }
        TextView textView = getBinding$workflow_release().q;
        float f = textView.getContext().getResources().getConfiguration().fontScale;
        if (f > 1.0f) {
            com.miteksystems.misnap.workflow.a.b.a(textView, f);
        }
        Iterator it = TextUtil.getTextViews$workflow_release(getBinding$workflow_release().m).iterator();
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

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$WorkflowSettings$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/NfcMrzDataManualEntryFragment$WorkflowSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return NfcMrzDataManualEntryFragment$WorkflowSettings$$serializer.INSTANCE;
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

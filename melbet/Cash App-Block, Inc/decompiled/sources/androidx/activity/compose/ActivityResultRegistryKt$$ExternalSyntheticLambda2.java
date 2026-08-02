package androidx.activity.compose;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.activity.result.ActivityResultCallback;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModelKt;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.trace.model.SpanEvent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.google.mlkit.vision.text.zzb;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.HelpFragment;
import com.miteksystems.misnap.workflow.fragment.MiSnapWorkflowViewModel;
import com.miteksystems.misnap.workflow.fragment.VoiceProcessorFragment;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.scannerview.ScannerView;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityResult;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.googlepaylauncher.GooglePayLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Result;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.bankaccount.domain.BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponse;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.core.analytics.ErrorReporter$ExpectedErrorEvent;
import com.stripe.android.payments.core.analytics.ErrorReporter$UnexpectedErrorEvent;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$register$1;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.view.ActivityHost;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class ActivityResultRegistryKt$$ExternalSyntheticLambda2 implements ActivityResultCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ActivityResultRegistryKt$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.Unit] */
    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        MiSnapWorkflowViewModel b;
        Context requireContext;
        MiSnapWorkflowError miSnapWorkflowError;
        MiSnapWorkflowViewModel b$1;
        Context requireContext2;
        MiSnapWorkflowError miSnapWorkflowError2;
        MiSnapWorkflowViewModel c$1;
        Context requireContext3;
        MiSnapWorkflowError miSnapWorkflowError3;
        MiSnapWorkflowViewModel c$2;
        Context requireContext4;
        MiSnapWorkflowError miSnapWorkflowError4;
        MiSnapWorkflowViewModel c$4;
        Context requireContext5;
        MiSnapWorkflowError miSnapWorkflowError5;
        PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated;
        Window window;
        Object failed;
        int i = this.$r8$classId;
        int i2 = 2;
        Continuation continuation = null;
        Unit unit = null;
        Unit unit2 = null;
        Unit unit3 = null;
        Unit unit4 = null;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((Function1) ((MutableState) obj2).getValue()).invoke(obj);
                break;
            case 1:
                BarcodeAnalysisFragment barcodeAnalysisFragment = (BarcodeAnalysisFragment) obj2;
                Boolean bool = (Boolean) obj;
                BarcodeAnalysisFragment.Companion companion = BarcodeAnalysisFragment.Companion;
                bool.getClass();
                if (bool.booleanValue()) {
                    MiSnapSettings miSnapSettings = (MiSnapSettings) barcodeAnalysisFragment.b().f.getValue();
                    if (miSnapSettings != null) {
                        barcodeAnalysisFragment.startSession$workflow_release(miSnapSettings, barcodeAnalysisFragment.a$1(), barcodeAnalysisFragment.b());
                        continuation = Unit.INSTANCE;
                    }
                    if (continuation == null) {
                        b = barcodeAnalysisFragment.b();
                        requireContext = barcodeAnalysisFragment.requireContext();
                        requireContext.getClass();
                        miSnapWorkflowError = MiSnapWorkflowError.SettingState.INSTANCE;
                    }
                } else {
                    b = barcodeAnalysisFragment.b();
                    requireContext = barcodeAnalysisFragment.requireContext();
                    requireContext.getClass();
                    miSnapWorkflowError = MiSnapWorkflowError.Permission.INSTANCE;
                }
                b.postError$workflow_release(requireContext, miSnapWorkflowError);
                break;
            case 2:
                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) obj2;
                Boolean bool2 = (Boolean) obj;
                DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                bool2.getClass();
                if (bool2.booleanValue()) {
                    MiSnapSettings miSnapSettings2 = (MiSnapSettings) documentAnalysisFragment.b$1().f.getValue();
                    if (miSnapSettings2 != null) {
                        documentAnalysisFragment.startSession$workflow_release(miSnapSettings2, documentAnalysisFragment.a$2(), documentAnalysisFragment.b$1());
                        unit4 = Unit.INSTANCE;
                    }
                    if (unit4 == null) {
                        b$1 = documentAnalysisFragment.b$1();
                        requireContext2 = documentAnalysisFragment.requireContext();
                        requireContext2.getClass();
                        miSnapWorkflowError2 = MiSnapWorkflowError.SettingState.INSTANCE;
                    }
                } else {
                    b$1 = documentAnalysisFragment.b$1();
                    requireContext2 = documentAnalysisFragment.requireContext();
                    requireContext2.getClass();
                    miSnapWorkflowError2 = MiSnapWorkflowError.Permission.INSTANCE;
                }
                b$1.postError$workflow_release(requireContext2, miSnapWorkflowError2);
                break;
            case 3:
                FaceAnalysisFragment faceAnalysisFragment = (FaceAnalysisFragment) obj2;
                Boolean bool3 = (Boolean) obj;
                FaceAnalysisFragment.Companion companion3 = FaceAnalysisFragment.Companion;
                bool3.getClass();
                if (bool3.booleanValue()) {
                    MiSnapSettings miSnapSettings3 = (MiSnapSettings) faceAnalysisFragment.c$1().f.getValue();
                    if (miSnapSettings3 != null) {
                        faceAnalysisFragment.startSession$workflow_release(miSnapSettings3, faceAnalysisFragment.b$1(), faceAnalysisFragment.c$1());
                        unit3 = Unit.INSTANCE;
                    }
                    if (unit3 == null) {
                        c$1 = faceAnalysisFragment.c$1();
                        requireContext3 = faceAnalysisFragment.requireContext();
                        requireContext3.getClass();
                        miSnapWorkflowError3 = MiSnapWorkflowError.SettingState.INSTANCE;
                    }
                } else {
                    c$1 = faceAnalysisFragment.c$1();
                    requireContext3 = faceAnalysisFragment.requireContext();
                    requireContext3.getClass();
                    miSnapWorkflowError3 = MiSnapWorkflowError.Permission.INSTANCE;
                }
                c$1.postError$workflow_release(requireContext3, miSnapWorkflowError3);
                break;
            case 4:
                HelpFragment helpFragment = (HelpFragment) obj2;
                Boolean bool4 = (Boolean) obj;
                HelpFragment.Companion companion4 = HelpFragment.Companion;
                bool4.getClass();
                if (bool4.booleanValue()) {
                    if (((MiSnapSettings) helpFragment.c$2().f.getValue()) != null) {
                        helpFragment.lookupCamera$workflow_release();
                        unit2 = Unit.INSTANCE;
                    }
                    if (unit2 == null) {
                        c$2 = helpFragment.c$2();
                        requireContext4 = helpFragment.requireContext();
                        requireContext4.getClass();
                        miSnapWorkflowError4 = MiSnapWorkflowError.SettingState.INSTANCE;
                    }
                } else {
                    c$2 = helpFragment.c$2();
                    requireContext4 = helpFragment.requireContext();
                    requireContext4.getClass();
                    miSnapWorkflowError4 = MiSnapWorkflowError.Permission.INSTANCE;
                }
                c$2.postError$workflow_release(requireContext4, miSnapWorkflowError4);
                break;
            case 5:
                VoiceProcessorFragment voiceProcessorFragment = (VoiceProcessorFragment) obj2;
                Boolean bool5 = (Boolean) obj;
                zzb zzbVar = VoiceProcessorFragment.Companion;
                bool5.getClass();
                if (bool5.booleanValue()) {
                    MiSnapSettings miSnapSettings4 = (MiSnapSettings) voiceProcessorFragment.c$4().f.getValue();
                    if (miSnapSettings4 != null) {
                        voiceProcessorFragment.startSession$workflow_release(miSnapSettings4, false);
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        c$4 = voiceProcessorFragment.c$4();
                        requireContext5 = voiceProcessorFragment.requireContext();
                        requireContext5.getClass();
                        miSnapWorkflowError5 = MiSnapWorkflowError.SettingState.INSTANCE;
                    }
                } else {
                    c$4 = voiceProcessorFragment.c$4();
                    requireContext5 = voiceProcessorFragment.requireContext();
                    requireContext5.getClass();
                    miSnapWorkflowError5 = MiSnapWorkflowError.Permission.INSTANCE;
                }
                c$4.postError$workflow_release(requireContext5, miSnapWorkflowError5);
                break;
            case 6:
                PaymentLauncherViewModel$register$1 paymentLauncherViewModel$register$1 = (PaymentLauncherViewModel$register$1) obj2;
                IntentConfirmationChallengeActivityResult intentConfirmationChallengeActivityResult = (IntentConfirmationChallengeActivityResult) obj;
                intentConfirmationChallengeActivityResult.getClass();
                if (!(intentConfirmationChallengeActivityResult instanceof IntentConfirmationChallengeActivityResult.Failed)) {
                    if (!(intentConfirmationChallengeActivityResult instanceof IntentConfirmationChallengeActivityResult.Success)) {
                        if (!(intentConfirmationChallengeActivityResult instanceof IntentConfirmationChallengeActivityResult.Canceled)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            paymentFlowResult$Unvalidated = new PaymentFlowResult$Unvalidated(((IntentConfirmationChallengeActivityResult.Canceled) intentConfirmationChallengeActivityResult).clientSecret, 3, (StripeException) null, false, (String) null, (String) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        }
                    } else {
                        paymentFlowResult$Unvalidated = new PaymentFlowResult$Unvalidated(((IntentConfirmationChallengeActivityResult.Success) intentConfirmationChallengeActivityResult).clientSecret, 0, (StripeException) null, false, (String) null, (String) null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    }
                } else {
                    int i3 = StripeException.$r8$clinit;
                    paymentFlowResult$Unvalidated = new PaymentFlowResult$Unvalidated((String) null, 2, SpanEvent.Account.create(((IntentConfirmationChallengeActivityResult.Failed) intentConfirmationChallengeActivityResult).error), false, (String) null, (String) null, 121);
                }
                paymentLauncherViewModel$register$1.onActivityResult(paymentFlowResult$Unvalidated);
                break;
            case 7:
                FinancialConnectionsSheetResult financialConnectionsSheetResult = (FinancialConnectionsSheetResult) obj;
                financialConnectionsSheetResult.getClass();
                ((BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0) obj2).function.invoke(financialConnectionsSheetResult);
                break;
            case 8:
                GooglePayLauncherActivity googlePayLauncherActivity = (GooglePayLauncherActivity) obj2;
                Lazy lazy = googlePayLauncherActivity.errorReporter$delegate;
                ApiTaskResult apiTaskResult = (ApiTaskResult) obj;
                int i4 = GooglePayLauncherActivity.$r8$clinit;
                apiTaskResult.getClass();
                Status status = apiTaskResult.zzb;
                int i5 = status.zza;
                String str = status.zzb;
                Continuation continuation2 = null;
                if (i5 == 0) {
                    PaymentData paymentData = (PaymentData) apiTaskResult.zza;
                    if (paymentData == null) {
                        RealErrorReporter.report$default((RealErrorReporter) lazy.getValue(), ErrorReporter$UnexpectedErrorEvent.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6);
                        googlePayLauncherActivity.getViewModel()._googleResult.tryEmit(new GooglePayLauncher$Result.Failed(new RuntimeException("Google Pay missing result data.")));
                        break;
                    } else {
                        PaymentMethodCreateParams createFromGooglePay = zzx.createFromGooglePay(new JSONObject(paymentData.zzg), null);
                        ActivityHost activityHost = new ActivityHost(googlePayLauncherActivity, (Build.VERSION.SDK_INT <= 34 && (window = googlePayLauncherActivity.getWindow()) != null) ? Integer.valueOf(window.getStatusBarColor()) : null);
                        GooglePayLauncherViewModel viewModel = googlePayLauncherActivity.getViewModel();
                        JobKt.launch$default(ViewModelKt.getViewModelScope(viewModel), viewModel.workContext, null, new Logger$log$1(viewModel, createFromGooglePay, activityHost, continuation2, 1), 2);
                        break;
                    }
                } else if (i5 == 16) {
                    googlePayLauncherActivity.getViewModel()._googleResult.tryEmit(GooglePayLauncher$Result.Canceled.INSTANCE);
                    break;
                } else {
                    RealErrorReporter.report$default((RealErrorReporter) lazy.getValue(), ErrorReporter$ExpectedErrorEvent.GOOGLE_PAY_FAILED, null, MapsKt__MapsKt.mapOf(new Pair("status_message", str == null ? "" : str), new Pair("status_code", String.valueOf(i5))), 2);
                    googlePayLauncherActivity.getViewModel()._googleResult.tryEmit(new GooglePayLauncher$Result.Failed(new RuntimeException("Google Pay failed with error " + i5 + ": " + (str != null ? str : ""))));
                    break;
                }
                break;
            case 9:
                GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = (GooglePayPaymentMethodLauncherActivity) obj2;
                Lazy lazy2 = googlePayPaymentMethodLauncherActivity.errorReporter$delegate;
                ApiTaskResult apiTaskResult2 = (ApiTaskResult) obj;
                int i6 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                apiTaskResult2.getClass();
                Status status2 = apiTaskResult2.zzb;
                int i7 = status2.zza;
                String str2 = status2.zzb;
                if (i7 == 0) {
                    PaymentData paymentData2 = (PaymentData) apiTaskResult2.zza;
                    if (paymentData2 == null) {
                        RealErrorReporter.report$default((RealErrorReporter) lazy2.getValue(), ErrorReporter$UnexpectedErrorEvent.GOOGLE_PAY_MISSING_INTENT_DATA, null, null, 6);
                        GooglePayPaymentMethodLauncher$Result.Failed failed2 = new GooglePayPaymentMethodLauncher$Result.Failed(new RuntimeException("Google Pay failed with missing data."), 1);
                        StateFlowImpl stateFlowImpl = googlePayPaymentMethodLauncherActivity.getViewModel()._googleResult;
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, failed2);
                        break;
                    } else {
                        JobKt.launch$default(ViewModelKt.getCoroutineScope(googlePayPaymentMethodLauncherActivity.getLifecycle()), null, null, new Logger$log$1(googlePayPaymentMethodLauncherActivity, paymentData2, continuation, 3), 3);
                        break;
                    }
                } else if (i7 == 16) {
                    StateFlowImpl stateFlowImpl2 = googlePayPaymentMethodLauncherActivity.getViewModel()._googleResult;
                    stateFlowImpl2.getClass();
                    stateFlowImpl2.updateState(null, GooglePayPaymentMethodLauncher$Result.Canceled.INSTANCE);
                    break;
                } else {
                    String str3 = str2 == null ? "" : str2;
                    String valueOf = String.valueOf(i7);
                    RealErrorReporter.report$default((RealErrorReporter) lazy2.getValue(), ErrorReporter$ExpectedErrorEvent.GOOGLE_PAY_FAILED, null, MapsKt__MapsKt.mapOf(new Pair("status_message", str3), new Pair("status_code", valueOf)), 2);
                    if (!CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{8, 10, 17, 20, 405, Integer.valueOf(HttpStatusCode.CONFLICT_409), 412}).contains(Integer.valueOf(i7))) {
                        RealErrorReporter.report$default((RealErrorReporter) lazy2.getValue(), ErrorReporter$UnexpectedErrorEvent.GOOGLE_PAY_UNEXPECTED_STATUS_CODE, null, Thread$State$EnumUnboxingLocalUtility.m("status_code", valueOf), 2);
                    }
                    GooglePayPaymentMethodLauncherViewModel viewModel2 = googlePayPaymentMethodLauncherActivity.getViewModel();
                    RuntimeException runtimeException = new RuntimeException("Google Pay failed with error " + i7 + ": " + (str2 != null ? str2 : ""));
                    if (i7 == 7) {
                        i2 = 3;
                    } else if (i7 != 10) {
                        i2 = 1;
                    }
                    GooglePayPaymentMethodLauncher$Result.Failed failed3 = new GooglePayPaymentMethodLauncher$Result.Failed(runtimeException, i2);
                    StateFlowImpl stateFlowImpl3 = viewModel2._googleResult;
                    stateFlowImpl3.getClass();
                    stateFlowImpl3.updateState(null, failed3);
                    break;
                }
            case 10:
                ScannerView.AnonymousClass3 anonymousClass3 = (ScannerView.AnonymousClass3) obj2;
                CollectBankAccountResultInternal collectBankAccountResultInternal = (CollectBankAccountResultInternal) obj;
                collectBankAccountResultInternal.getClass();
                if (!(collectBankAccountResultInternal instanceof CollectBankAccountResultInternal.Cancelled)) {
                    if (!(collectBankAccountResultInternal instanceof CollectBankAccountResultInternal.Completed)) {
                        if (!(collectBankAccountResultInternal instanceof CollectBankAccountResultInternal.Failed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            failed = new CollectBankAccountResult.Failed(((CollectBankAccountResultInternal.Failed) collectBankAccountResultInternal).error);
                        }
                    } else {
                        CollectBankAccountResponseInternal collectBankAccountResponseInternal = ((CollectBankAccountResultInternal.Completed) collectBankAccountResultInternal).response;
                        CollectBankAccountResponseInternal.USBankAccountData uSBankAccountData = collectBankAccountResponseInternal.usBankAccountData;
                        if (uSBankAccountData == null) {
                            failed = new CollectBankAccountResult.Failed(new IllegalArgumentException("ACH payload cannot be null"));
                        } else {
                            StripeIntent stripeIntent = collectBankAccountResponseInternal.intent;
                            failed = stripeIntent == null ? new CollectBankAccountResult.Failed(new IllegalArgumentException("StripeIntent cannot be null")) : new CollectBankAccountResult.Completed(new CollectBankAccountResponse(stripeIntent, uSBankAccountData.financialConnectionsSession));
                        }
                    }
                } else {
                    failed = CollectBankAccountResult.Cancelled.INSTANCE;
                }
                anonymousClass3.invoke(failed);
                break;
            case 11:
                ChallengeResult challengeResult = (ChallengeResult) obj;
                int i8 = Stripe3ds2TransactionActivity.$r8$clinit;
                challengeResult.getClass();
                ((HeroCardViewKt$$ExternalSyntheticLambda0) obj2).invoke(challengeResult);
                break;
            default:
                PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated2 = (PaymentFlowResult$Unvalidated) obj;
                int i9 = Stripe3ds2TransactionActivity.$r8$clinit;
                paymentFlowResult$Unvalidated2.getClass();
                ((Stripe3ds2TransactionActivity) obj2).finishWithResult(paymentFlowResult$Unvalidated2);
                break;
        }
    }
}

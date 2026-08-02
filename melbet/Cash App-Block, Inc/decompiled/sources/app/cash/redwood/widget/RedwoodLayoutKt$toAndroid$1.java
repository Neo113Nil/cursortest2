package app.cash.redwood.widget;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertController;
import androidx.navigation.NavHostController;
import app.cash.redwood.treehouse.OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService;
import app.cash.redwood.treehouse.ViewContentCodeBinding;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.android.volley.Response;
import com.fillr.e;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.mlkit.vision.text.zzc;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FailoverFragment;
import com.miteksystems.misnap.workflow.fragment.HelpFragment;
import com.miteksystems.misnap.workflow.fragment.ReviewFragment;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.HandleBackPressWhenAttached;
import com.squareup.workflow1.ui.modal.AlertContainer$$ExternalSyntheticLambda0;
import com.squareup.workflow1.ui.modal.AlertContainer$$ExternalSyntheticLambda1;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.internal.loading.LoadingFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import sqip.internal.BaseCardEntryActivity$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class RedwoodLayoutKt$toAndroid$1 extends OnBackPressedCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $this_toAndroid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RedwoodLayoutKt$toAndroid$1(Object obj, int i) {
        super(true);
        this.$r8$classId = i;
        this.$this_toAndroid = obj;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        int i = this.$r8$classId;
        int i2 = 2;
        int i3 = 1;
        Object obj = this.$this_toAndroid;
        switch (i) {
            case 0:
                Response response = (Response) obj;
                ViewContentCodeBinding viewContentCodeBinding = (ViewContentCodeBinding) response.cacheEntry;
                JobKt.launch$default(viewContentCodeBinding.bindingScope, viewContentCodeBinding.dispatchers.zipline, null, new DiskLruCache$launchCleanup$1((OnBackPressedCallbackService$Companion$Adapter$GeneratedOutboundService) response.error, (Continuation) null, 22), 2);
                break;
            case 1:
                ((Function1) obj).invoke(this);
                break;
            case 2:
                ((NavHostController) obj).popBackStack();
                break;
            case 3:
                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) obj;
                if (!documentAnalysisFragment.h) {
                    documentAnalysisFragment.d.pause(documentAnalysisFragment.n);
                    MiSnapView miSnapView = documentAnalysisFragment.getBinding$workflow_release().l;
                    miSnapView.l.addUxpEvent("MVPFA", new String[0]);
                    miSnapView.g = false;
                    MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(documentAnalysisFragment.requireContext());
                    materialAlertDialogBuilder.setTitle(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogTitle);
                    materialAlertDialogBuilder.setMessage(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogMessage);
                    MaterialAlertDialogBuilder negativeButton = materialAlertDialogBuilder.setPositiveButton(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogPositiveButtonLabel, (DialogInterface.OnClickListener) new AlertContainer$$ExternalSyntheticLambda1(documentAnalysisFragment, i3)).setNegativeButton(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogNegativeButtonLabel, (DialogInterface.OnClickListener) new BaseCardEntryActivity$$ExternalSyntheticLambda0(i3));
                    AlertContainer$$ExternalSyntheticLambda0 alertContainer$$ExternalSyntheticLambda0 = new AlertContainer$$ExternalSyntheticLambda0(documentAnalysisFragment, i3);
                    AlertController.AlertParams alertParams = negativeButton.P;
                    alertParams.mOnCancelListener = alertContainer$$ExternalSyntheticLambda0;
                    alertParams.mCancelable = true;
                    documentAnalysisFragment.i = negativeButton.show();
                    break;
                } else {
                    documentAnalysisFragment.w.setEnabled(false);
                    documentAnalysisFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                    break;
                }
            case 4:
                FailoverFragment failoverFragment = (FailoverFragment) obj;
                zzc zzcVar = FailoverFragment.Companion;
                MaterialAlertDialogBuilder materialAlertDialogBuilder2 = new MaterialAlertDialogBuilder(failoverFragment.requireContext());
                materialAlertDialogBuilder2.setTitle(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogTitle);
                materialAlertDialogBuilder2.setMessage(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogMessage);
                MaterialAlertDialogBuilder negativeButton2 = materialAlertDialogBuilder2.setPositiveButton(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogPositiveButtonLabel, (DialogInterface.OnClickListener) new AlertContainer$$ExternalSyntheticLambda1(failoverFragment, i2)).setNegativeButton(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogNegativeButtonLabel, (DialogInterface.OnClickListener) new BaseCardEntryActivity$$ExternalSyntheticLambda0(i2));
                negativeButton2.P.mCancelable = true;
                negativeButton2.show();
                break;
            case 5:
                HelpFragment helpFragment = (HelpFragment) obj;
                HelpFragment.Companion companion = HelpFragment.Companion;
                MaterialAlertDialogBuilder materialAlertDialogBuilder3 = new MaterialAlertDialogBuilder(helpFragment.requireContext());
                materialAlertDialogBuilder3.setTitle(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogTitle);
                materialAlertDialogBuilder3.setMessage(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogMessage);
                int i4 = 3;
                MaterialAlertDialogBuilder negativeButton3 = materialAlertDialogBuilder3.setPositiveButton(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogPositiveButtonLabel, (DialogInterface.OnClickListener) new AlertContainer$$ExternalSyntheticLambda1(helpFragment, i4)).setNegativeButton(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogNegativeButtonLabel, (DialogInterface.OnClickListener) new BaseCardEntryActivity$$ExternalSyntheticLambda0(i4));
                negativeButton3.P.mCancelable = true;
                negativeButton3.show();
                break;
            case 6:
                ReviewFragment reviewFragment = (ReviewFragment) obj;
                e eVar = ReviewFragment.Companion;
                MaterialAlertDialogBuilder materialAlertDialogBuilder4 = new MaterialAlertDialogBuilder(reviewFragment.requireContext());
                materialAlertDialogBuilder4.setTitle(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogTitle);
                materialAlertDialogBuilder4.setMessage(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogMessage);
                int i5 = 4;
                MaterialAlertDialogBuilder negativeButton4 = materialAlertDialogBuilder4.setPositiveButton(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogPositiveButtonLabel, (DialogInterface.OnClickListener) new AlertContainer$$ExternalSyntheticLambda1(reviewFragment, i5)).setNegativeButton(R.string.misnapDocumentAnalysisSessionExitConfirmationDialogNegativeButtonLabel, (DialogInterface.OnClickListener) new BaseCardEntryActivity$$ExternalSyntheticLambda0(i5));
                negativeButton4.P.mCancelable = true;
                negativeButton4.show();
                break;
            case 7:
                ((Function0) obj).invoke();
                break;
            case 8:
                ((HandleBackPressWhenAttached) obj).handler.invoke();
                break;
            case 9:
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) obj;
                int i6 = 5;
                new AlertDialog.Builder(financialConnectionsSheetLiteActivity).setTitle(R.string.stripe_fc_lite_exit_title).setMessage(R.string.stripe_fc_lite_exit_message).setCancelable(true).setPositiveButton(R.string.stripe_fc_lite_exit_confirm, new AlertContainer$$ExternalSyntheticLambda1(financialConnectionsSheetLiteActivity, i6)).setNegativeButton(R.string.stripe_fc_lite_exit_cancel, new BaseCardEntryActivity$$ExternalSyntheticLambda0(i6)).create().show();
                break;
            case 10:
                ((ChallengeActivity) obj).getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
                break;
            default:
                CameraHelper$$ExternalSyntheticLambda0 cameraHelper$$ExternalSyntheticLambda0 = ((LoadingFragment) obj).onBackPressHandler;
                if (cameraHelper$$ExternalSyntheticLambda0 != null) {
                    cameraHelper$$ExternalSyntheticLambda0.invoke();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RedwoodLayoutKt$toAndroid$1(Object obj, boolean z, int i) {
        super(false);
        this.$r8$classId = i;
        this.$this_toAndroid = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedwoodLayoutKt$toAndroid$1(Response response, boolean z) {
        super(z);
        this.$r8$classId = 0;
        this.$this_toAndroid = response;
    }
}

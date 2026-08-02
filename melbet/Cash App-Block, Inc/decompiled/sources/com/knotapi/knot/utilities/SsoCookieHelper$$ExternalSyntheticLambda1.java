package com.knotapi.knot.utilities;

import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog;
import com.knotapi.knot.webview.KnotView;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.styling.BottomSheetStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController;
import com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2InquiryUiBinding;
import kotlin.collections.EmptySet;
import radiography.Radiography$$ExternalSyntheticLambda1;
import sqip.internal.BaseCardEntryActivity$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final /* synthetic */ class SsoCookieHelper$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ SsoCookieHelper$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.$r8$classId;
        Object obj = this.f$5;
        Object obj2 = this.f$4;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((SsoCookieHelper) obj5).lambda$checkAndPromptForDialog$1((KnotView) obj4, (String) obj3, "Reuse Google Account Overlay", (WebView) obj2, (KnotBottomSheetDialog) obj, view);
                break;
            default:
                UiScreenRunner uiScreenRunner = (UiScreenRunner) obj5;
                UiComponent uiComponent = (UiComponent) obj4;
                ESignature eSignature = (ESignature) obj3;
                Pi2InquiryUiBinding pi2InquiryUiBinding = uiScreenRunner.binding;
                ((ImageView) pi2InquiryUiBinding.navigationBar.binding.navBarBackButton).setEnabled(false);
                pi2InquiryUiBinding.navigationBar.setImportantForAccessibility(4);
                pi2InquiryUiBinding.uiStepContainer.setImportantForAccessibility(4);
                SignatureBottomSheetController signatureBottomSheetController = uiScreenRunner.signatureBottomSheetController;
                StepStyles.UiStepStyle uiStepStyle = ((UiWorkflow.Screen.EntryScreen) obj2).styles;
                Radiography$$ExternalSyntheticLambda1 radiography$$ExternalSyntheticLambda1 = new Radiography$$ExternalSyntheticLambda1(29, uiScreenRunner, uiComponent);
                signatureBottomSheetController.getClass();
                ((ESignatureComponent) uiComponent).getClass();
                ((ViewEnvironment) obj).getClass();
                if (!signatureBottomSheetController.setup) {
                    signatureBottomSheetController.setup = true;
                    BottomSheetBehavior from = BottomSheetBehavior.from(signatureBottomSheetController.getBinding().bottomSheet);
                    zzbk.setup(from, new SignatureBottomSheetController$$ExternalSyntheticLambda0(signatureBottomSheetController, 1), signatureBottomSheetController.getBinding().bottomSheet, signatureBottomSheetController.getBinding().signatureSheet, signatureBottomSheetController.getBinding().shadow);
                    from.draggable = false;
                    signatureBottomSheetController.getBinding().closeSignatureSheetButton.setOnClickListener(new UiStepBottomSheet$$ExternalSyntheticLambda3(from, 8));
                    signatureBottomSheetController.getBinding().clearButton.setOnClickListener(new BaseCardEntryActivity$$ExternalSyntheticLambda1(signatureBottomSheetController, 5));
                    signatureBottomSheetController.getBinding().saveButton.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(10, signatureBottomSheetController, from));
                    BottomSheetStylingKt.applyBottomSheetStyles$default(signatureBottomSheetController.getBinding().signatureSheet, uiStepStyle, null, new Rect(0, (int) ExtensionsKt.getDpToPx(12.0d), 0, 0), 10);
                }
                signatureBottomSheetController.currentOnCompleteListener = radiography$$ExternalSyntheticLambda1;
                signatureBottomSheetController.getBinding().signatureCanvas.clearCanvas();
                TextView textView = signatureBottomSheetController.getBinding().signatureLabel;
                ESignature.Attributes attributes = eSignature.getAttributes();
                textView.setText(attributes != null ? attributes.getDialogTitle() : null);
                TextView textView2 = signatureBottomSheetController.getBinding().signatureDescription;
                ESignature.Attributes attributes2 = eSignature.getAttributes();
                if (attributes2 == null || (str = attributes2.getDialogText()) == null) {
                    str = "";
                }
                textView2.setText(str);
                ESignature.ESignatureComponentStyle styles = eSignature.getStyles();
                if (styles != null) {
                    TextBasedComponentStyle dialogTitleStyle = styles.getDialogTitleStyle();
                    if (dialogTitleStyle != null) {
                        TextStylingKt.style(signatureBottomSheetController.getBinding().signatureLabel, dialogTitleStyle, EmptySet.INSTANCE);
                    }
                    TextBasedComponentStyle dialogTextStyle = styles.getDialogTextStyle();
                    if (dialogTextStyle != null) {
                        TextStylingKt.style(signatureBottomSheetController.getBinding().signatureDescription, dialogTextStyle, EmptySet.INSTANCE);
                    }
                    Integer baseBackgroundColorValue = styles.getInputTextStyle().getBaseBackgroundColorValue();
                    if (baseBackgroundColorValue != null) {
                        signatureBottomSheetController.getBinding().signatureCanvas.setCardBackgroundColor(baseBackgroundColorValue.intValue());
                    }
                    Double borderRadiusValue = styles.getInputTextStyle().getBorderRadiusValue();
                    if (borderRadiusValue != null) {
                        signatureBottomSheetController.getBinding().signatureCanvas.setRadius((float) Math.ceil(ExtensionsKt.getDpToPx(borderRadiusValue.doubleValue())));
                    }
                    Double borderWidthValue = styles.getInputTextStyle().getBorderWidthValue();
                    if (borderWidthValue != null) {
                        signatureBottomSheetController.getBinding().signatureCanvas.setStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(borderWidthValue.doubleValue())));
                    }
                    Integer baseBorderColorValue = styles.getInputTextStyle().getBaseBorderColorValue();
                    if (baseBorderColorValue != null) {
                        signatureBottomSheetController.getBinding().signatureCanvas.setStrokeColor(baseBorderColorValue.intValue());
                    }
                    ButtonSubmitComponentStyle submitButtonStyle = styles.getSubmitButtonStyle();
                    if (submitButtonStyle != null) {
                        ButtonStylingKt.style$default(signatureBottomSheetController.getBinding().saveButton, submitButtonStyle, false, false, 14);
                    }
                    ButtonCancelComponentStyle clearSignatureButtonStyle = styles.getClearSignatureButtonStyle();
                    if (clearSignatureButtonStyle != null) {
                        ButtonStylingKt.style$default(signatureBottomSheetController.getBinding().clearButton, clearSignatureButtonStyle, false, false, 14);
                    }
                }
                signatureBottomSheetController.getBinding().rootView.postDelayed(new Task$$ExternalSyntheticLambda0(signatureBottomSheetController, 14), 100L);
                break;
        }
    }
}

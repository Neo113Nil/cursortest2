package com.fillr.browsersdk.analytics;

/* loaded from: classes4.dex */
public enum FillrAnalyticsEvents {
    /* JADX INFO: Fake field, exist only in values array */
    EF0(4, 12, "FillrBarShown"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(4, 13, "FillrUseSecureButton"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(4, 4, "FillrToolbarEnabled"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(4, 5, "FillrToolbarDisabled"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(4, 14, "FillrToolbarDismissed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(3, 10, "FillrInFieldButtonShown"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(3, 9, "FillrInFieldButtonTapped"),
    FillrGenerateAffiliateLink(7, 17, "FillrGenerateAffiliateLink"),
    FillrFillResult(2, 15, "FillrFillResult"),
    /* JADX INFO: Fake field, exist only in values array */
    EF22(5, 2, "FillrSelectedSystemFill"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(5, 3, "FillrUnselectedSystemFill"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(3, 10, "FillrChipDisplayed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(3, 9, "FillrChipTapped"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(6, 7, "FillrSaveDialogConfirmed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(6, 8, "FillrSaveDialogCanceled"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(3, 11, "FillrChipCanceled"),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(6, 6, "FillrSaveDialogDisplayed"),
    FillrFillHeadlessMode(2, 16, "FillrFillHeadlessMode"),
    FillrSDK_INIT(8, 18, "FillrSDK_INIT"),
    FillrSDK_TRACK_WEBVIEW(8, 19, "FillrSDK_TRACK_WEBVIEW"),
    FillrSDK_ON_SSL_ERROR(8, 20, "FillrSDK_ON_SSL_ERROR"),
    FillrSDK_ON_FORM_DETECTED(8, 21, "FillrSDK_ON_FORM_DETECTED"),
    FillrSDK_ON_TRIGGER_FILL(8, 22, "FillrSDK_ON_TRIGGER_FILL"),
    FillrSDK_FIELD_FOCUSED(8, 25, "FillrSDK_FIELD_FOCUSED"),
    FillrSDK_CAPTURE_VALUES_LISTENER(8, 26, "FillrSDK_CAPTURE_VALUES_LISTENER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(8, 27, "FillrSDK_ON_CAPTURE_TRIGGER"),
    FillrSDK_ON_CART_EXTRACTION_LISTENER(8, 28, "FillrSDK_ON_CART_EXTRACTION_LISTENER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF387(8, 30, "FillrSDK_AFFILIATES_ENABLED");

    public final int action;

    FillrAnalyticsEvents(int i, int i2, String str) {
        this.action = i2;
    }
}

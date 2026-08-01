package com.adjust.sdk;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class AdjustPurchaseVerificationResult {
    private final int code;
    private final String message;
    private final String verificationStatus;

    public AdjustPurchaseVerificationResult(String str, int i, String str2) {
        this.verificationStatus = str;
        this.code = i;
        this.message = str2;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getVerificationStatus() {
        return this.verificationStatus;
    }
}

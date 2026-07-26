package com.adjust.sdk;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
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

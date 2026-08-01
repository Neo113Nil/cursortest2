package com.adjust.sdk;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class LicenseData {
    private final int responseCode;
    private final String signature;
    private final String signedData;

    public LicenseData(String str, String str2, int i) {
        this.signedData = str;
        this.signature = str2;
        this.responseCode = i;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSignedData() {
        return this.signedData;
    }

    public boolean isValid() {
        String str = this.signedData;
        return (str == null || this.signature == null || str.isEmpty() || this.signature.isEmpty()) ? false : true;
    }
}

package com.connectsdk.service.airplay.auth;

/* loaded from: classes.dex */
class PairSetupPin3Response {
    public final byte[] AUTH_TAG;
    public final byte[] EPK;

    public PairSetupPin3Response(byte[] bArr, byte[] bArr2) {
        this.EPK = bArr;
        this.AUTH_TAG = bArr2;
    }
}

package com.connectsdk.service.airplay.auth;

/* loaded from: classes.dex */
class PairSetupPin1Response {
    public final byte[] PK;
    public final byte[] SALT;

    public PairSetupPin1Response(byte[] bArr, byte[] bArr2) {
        this.PK = bArr;
        this.SALT = bArr2;
    }
}

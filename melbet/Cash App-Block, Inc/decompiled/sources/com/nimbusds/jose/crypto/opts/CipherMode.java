package com.nimbusds.jose.crypto.opts;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class CipherMode {
    public final int modeForDecryption;
    public final int modeForEncryption;
    public static final CipherMode WRAP_UNWRAP = new CipherMode(3, 4);
    public static final CipherMode ENCRYPT_DECRYPT = new CipherMode(1, 2);

    public CipherMode(int i, int i2) {
        this.modeForEncryption = i;
        this.modeForDecryption = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CipherMode [forEncryption=");
        sb.append(this.modeForEncryption);
        sb.append(", forDecryption=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.modeForDecryption, "]", sb);
    }
}

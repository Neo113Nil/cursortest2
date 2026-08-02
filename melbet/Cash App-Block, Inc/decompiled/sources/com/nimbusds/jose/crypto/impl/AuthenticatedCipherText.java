package com.nimbusds.jose.crypto.impl;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class AuthenticatedCipherText {
    public final byte[] authenticationTag;
    public final byte[] cipherText;

    public AuthenticatedCipherText(byte[] bArr, byte[] bArr2, int i) {
        switch (i) {
            case 1:
                this.cipherText = bArr;
                this.authenticationTag = bArr2;
                break;
            default:
                Objects.requireNonNull(bArr);
                this.cipherText = bArr;
                Objects.requireNonNull(bArr2);
                this.authenticationTag = bArr2;
                break;
        }
    }
}

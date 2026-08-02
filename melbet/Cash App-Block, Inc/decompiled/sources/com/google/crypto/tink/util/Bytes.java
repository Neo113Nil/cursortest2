package com.google.crypto.tink.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.subtle.Hex;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Bytes {
    public final byte[] data;

    public Bytes(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.data = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static Bytes copyFrom(byte[] bArr) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("data must be non-null");
            return null;
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new Bytes(bArr, length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Bytes) {
            return Arrays.equals(((Bytes) obj).data, this.data);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public final byte[] toByteArray() {
        byte[] bArr = this.data;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final String toString() {
        return "Bytes(" + Hex.encode(this.data) + ")";
    }
}

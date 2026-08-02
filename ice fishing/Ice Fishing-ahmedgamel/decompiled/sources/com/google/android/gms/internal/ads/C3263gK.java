package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.gK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3263gK {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f31325a;

    public C3263gK(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f31325a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static C3263gK a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length > length2) {
            length = length2;
        }
        return new C3263gK(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f31325a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3263gK) {
            return Arrays.equals(((C3263gK) obj).f31325a, this.f31325a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31325a);
    }

    public final String toString() {
        byte[] bArr = this.f31325a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b9 : bArr) {
            sb.append("0123456789abcdef".charAt((b9 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b9 & 15));
        }
        String sb2 = sb.toString();
        return D.x.p(new StringBuilder(sb2.length() + 7), "Bytes(", sb2, ")");
    }
}

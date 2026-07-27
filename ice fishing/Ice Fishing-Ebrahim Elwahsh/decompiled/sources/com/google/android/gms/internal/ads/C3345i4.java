package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.i4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3345i4 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f31310e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f31311a;

    /* renamed from: b, reason: collision with root package name */
    public int f31312b;

    /* renamed from: c, reason: collision with root package name */
    public int f31313c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f31314d;

    public final void a(byte[] bArr, int i, int i4) {
        if (this.f31311a) {
            int i9 = i4 - i;
            byte[] bArr2 = this.f31314d;
            int length = bArr2.length;
            int i10 = this.f31312b + i9;
            if (length < i10) {
                this.f31314d = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i, this.f31314d, this.f31312b, i9);
            this.f31312b += i9;
        }
    }
}

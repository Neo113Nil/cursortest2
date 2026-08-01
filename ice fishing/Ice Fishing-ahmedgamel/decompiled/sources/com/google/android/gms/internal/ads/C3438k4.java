package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3438k4 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f31372e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f31373a;

    /* renamed from: b, reason: collision with root package name */
    public int f31374b;

    /* renamed from: c, reason: collision with root package name */
    public int f31375c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f31376d;

    public final void a(byte[] bArr, int i, int i6) {
        if (this.f31373a) {
            int i9 = i6 - i;
            byte[] bArr2 = this.f31376d;
            int length = bArr2.length;
            int i10 = this.f31374b + i9;
            if (length < i10) {
                this.f31376d = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i, this.f31376d, this.f31374b, i9);
            this.f31374b += i9;
        }
    }
}

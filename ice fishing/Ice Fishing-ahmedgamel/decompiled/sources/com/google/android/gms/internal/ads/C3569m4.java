package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.m4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3569m4 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f32672f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f32673a;

    /* renamed from: b, reason: collision with root package name */
    public int f32674b;

    /* renamed from: c, reason: collision with root package name */
    public int f32675c;

    /* renamed from: d, reason: collision with root package name */
    public int f32676d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f32677e;

    public final void a(byte[] bArr, int i, int i4) {
        if (this.f32673a) {
            int i6 = i4 - i;
            byte[] bArr2 = this.f32677e;
            int length = bArr2.length;
            int i9 = this.f32675c + i6;
            if (length < i9) {
                this.f32677e = Arrays.copyOf(bArr2, i9 + i9);
            }
            System.arraycopy(bArr, i, this.f32677e, this.f32675c, i6);
            this.f32675c += i6;
        }
    }
}

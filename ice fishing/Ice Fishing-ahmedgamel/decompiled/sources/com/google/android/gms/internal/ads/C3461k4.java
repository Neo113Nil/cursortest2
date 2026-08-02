package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3461k4 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f32151e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f32152a;

    /* renamed from: b, reason: collision with root package name */
    public int f32153b;

    /* renamed from: c, reason: collision with root package name */
    public int f32154c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f32155d;

    public final void a(byte[] bArr, int i, int i4) {
        if (this.f32152a) {
            int i6 = i4 - i;
            byte[] bArr2 = this.f32155d;
            int length = bArr2.length;
            int i9 = this.f32153b + i6;
            if (length < i9) {
                this.f32155d = Arrays.copyOf(bArr2, i9 + i9);
            }
            System.arraycopy(bArr, i, this.f32155d, this.f32153b, i6);
            this.f32153b += i6;
        }
    }
}

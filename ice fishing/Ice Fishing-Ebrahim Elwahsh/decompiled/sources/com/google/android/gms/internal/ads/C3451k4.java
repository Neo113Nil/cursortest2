package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3451k4 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f32248f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f32249a;

    /* renamed from: b, reason: collision with root package name */
    public int f32250b;

    /* renamed from: c, reason: collision with root package name */
    public int f32251c;

    /* renamed from: d, reason: collision with root package name */
    public int f32252d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f32253e;

    public final void a(byte[] bArr, int i, int i4) {
        if (this.f32249a) {
            int i9 = i4 - i;
            byte[] bArr2 = this.f32253e;
            int length = bArr2.length;
            int i10 = this.f32251c + i9;
            if (length < i10) {
                this.f32253e = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i, this.f32253e, this.f32251c, i9);
            this.f32251c += i9;
        }
    }
}

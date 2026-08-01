package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.m4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3546m4 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f31892f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f31893a;

    /* renamed from: b, reason: collision with root package name */
    public int f31894b;

    /* renamed from: c, reason: collision with root package name */
    public int f31895c;

    /* renamed from: d, reason: collision with root package name */
    public int f31896d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f31897e;

    public final void a(byte[] bArr, int i, int i6) {
        if (this.f31893a) {
            int i9 = i6 - i;
            byte[] bArr2 = this.f31897e;
            int length = bArr2.length;
            int i10 = this.f31895c + i9;
            if (length < i10) {
                this.f31897e = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i, this.f31897e, this.f31895c, i9);
            this.f31895c += i9;
        }
    }
}

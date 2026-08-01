package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3140eb {

    /* renamed from: a, reason: collision with root package name */
    public final int f29941a;

    /* renamed from: b, reason: collision with root package name */
    public final A8 f29942b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29943c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f29944d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f29945e;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C3140eb(A8 a82, boolean z3, int[] iArr, boolean[] zArr) {
        int i = a82.f23635a;
        this.f29941a = i;
        AbstractC2772Sd.i(i == iArr.length && i == zArr.length);
        this.f29942b = a82;
        this.f29943c = z3 && i > 1;
        this.f29944d = (int[]) iArr.clone();
        this.f29945e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3140eb.class == obj.getClass()) {
            C3140eb c3140eb = (C3140eb) obj;
            if (this.f29943c == c3140eb.f29943c && this.f29942b.equals(c3140eb.f29942b) && Arrays.equals(this.f29944d, c3140eb.f29944d) && Arrays.equals(this.f29945e, c3140eb.f29945e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29945e) + ((Arrays.hashCode(this.f29944d) + (((this.f29942b.hashCode() * 31) + (this.f29943c ? 1 : 0)) * 31)) * 31);
    }
}

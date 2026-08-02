package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.eb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3163eb {

    /* renamed from: a, reason: collision with root package name */
    public final int f30732a;

    /* renamed from: b, reason: collision with root package name */
    public final A8 f30733b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30734c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f30735d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f30736e;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C3163eb(A8 a82, boolean z6, int[] iArr, boolean[] zArr) {
        int i = a82.f24415a;
        this.f30732a = i;
        AbstractC2792Sd.i(i == iArr.length && i == zArr.length);
        this.f30733b = a82;
        this.f30734c = z6 && i > 1;
        this.f30735d = (int[]) iArr.clone();
        this.f30736e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3163eb.class == obj.getClass()) {
            C3163eb c3163eb = (C3163eb) obj;
            if (this.f30734c == c3163eb.f30734c && this.f30733b.equals(c3163eb.f30733b) && Arrays.equals(this.f30735d, c3163eb.f30735d) && Arrays.equals(this.f30736e, c3163eb.f30736e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30736e) + ((Arrays.hashCode(this.f30735d) + (((this.f30733b.hashCode() * 31) + (this.f30734c ? 1 : 0)) * 31)) * 31);
    }
}

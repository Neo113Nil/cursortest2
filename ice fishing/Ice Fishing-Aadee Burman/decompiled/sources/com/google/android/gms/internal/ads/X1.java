package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class X1 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f28466b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28467c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28468d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f28469e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC2900a2[] f28470f;

    public X1(String str, boolean z3, boolean z6, String[] strArr, AbstractC2900a2[] abstractC2900a2Arr) {
        super(com.anythink.basead.exoplayer.g.b.d.f7292a);
        this.f28466b = str;
        this.f28467c = z3;
        this.f28468d = z6;
        this.f28469e = strArr;
        this.f28470f = abstractC2900a2Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X1.class == obj.getClass()) {
            X1 x12 = (X1) obj;
            if (this.f28467c == x12.f28467c && this.f28468d == x12.f28468d && Objects.equals(this.f28466b, x12.f28466b) && Arrays.equals(this.f28469e, x12.f28469e) && Arrays.equals(this.f28470f, x12.f28470f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f28466b.hashCode() + (((((this.f28467c ? 1 : 0) + 527) * 31) + (this.f28468d ? 1 : 0)) * 31);
    }
}

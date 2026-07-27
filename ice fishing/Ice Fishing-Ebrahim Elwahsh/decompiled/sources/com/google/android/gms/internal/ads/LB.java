package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class LB extends NB {
    public static final NB f(int i) {
        return i < 0 ? NB.f26492b : i > 0 ? NB.f26493c : NB.f26491a;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final NB a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final NB b(int i, int i4) {
        return f(Integer.compare(i, i4));
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final NB c(boolean z8, boolean z9) {
        return f(Boolean.compare(z9, z8));
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final NB d(boolean z8, boolean z9) {
        return f(Boolean.compare(z8, z9));
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int e() {
        return 0;
    }
}

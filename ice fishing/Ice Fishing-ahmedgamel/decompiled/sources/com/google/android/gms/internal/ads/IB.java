package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class IB extends KB {
    public static final KB f(int i) {
        return i < 0 ? KB.f25875b : i > 0 ? KB.f25876c : KB.f25874a;
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final KB a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final KB b(int i, int i6) {
        return f(Integer.compare(i, i6));
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final KB c(boolean z3, boolean z6) {
        return f(Boolean.compare(z6, z3));
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final KB d(boolean z3, boolean z6) {
        return f(Boolean.compare(z3, z6));
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final int e() {
        return 0;
    }
}

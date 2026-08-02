package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class IB extends KB {
    public static final KB f(int i) {
        return i < 0 ? KB.f26627b : i > 0 ? KB.f26628c : KB.f26626a;
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final KB a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final KB b(int i, int i4) {
        return f(Integer.compare(i, i4));
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final KB c(boolean z6, boolean z9) {
        return f(Boolean.compare(z9, z6));
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final KB d(boolean z6, boolean z9) {
        return f(Boolean.compare(z6, z9));
    }

    @Override // com.google.android.gms.internal.ads.KB
    public final int e() {
        return 0;
    }
}

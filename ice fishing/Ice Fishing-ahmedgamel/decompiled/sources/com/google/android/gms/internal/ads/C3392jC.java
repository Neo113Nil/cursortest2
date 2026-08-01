package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.jC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3392jC extends AbstractC3446kC implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final C3392jC f31213u = new C3392jC(0);

    /* renamed from: v, reason: collision with root package name */
    public static final C3392jC f31214v = new C3392jC(1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31215n;

    public /* synthetic */ C3392jC(int i) {
        this.f31215n = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f31215n) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f31215n) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}

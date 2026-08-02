package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.jC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3415jC extends AbstractC3469kC implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final C3415jC f32000u = new C3415jC(0);

    /* renamed from: v, reason: collision with root package name */
    public static final C3415jC f32001v = new C3415jC(1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32002n;

    public /* synthetic */ C3415jC(int i) {
        this.f32002n = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f32002n) {
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
        switch (this.f32002n) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}

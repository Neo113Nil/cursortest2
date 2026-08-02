package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Rj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2781Rj {

    /* renamed from: a, reason: collision with root package name */
    public static final CB f28005a = new CB();

    static {
        PB pb = RB.f27933u;
        new C2781Rj(C3523lC.f32525x);
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C2781Rj(RB rb) {
        PB pb = RB.f27933u;
        Object[] array = (rb == null ? AbstractC2991bG.g(rb.listIterator(0)) : rb).toArray();
        int length = array.length;
        AbstractC2792Sd.j(array, length);
        Arrays.sort(array, f28005a);
        RB.p(array, length);
    }
}

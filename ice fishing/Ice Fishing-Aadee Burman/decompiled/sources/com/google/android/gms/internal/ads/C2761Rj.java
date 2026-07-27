package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Rj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2761Rj {

    /* renamed from: a, reason: collision with root package name */
    public static final CB f27321a = new CB();

    static {
        PB pb = RB.f27177u;
        new C2761Rj(C3500lC.f31745x);
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C2761Rj(RB rb) {
        PB pb = RB.f27177u;
        Object[] array = (rb == null ? AbstractC2968bG.g(rb.listIterator(0)) : rb).toArray();
        int length = array.length;
        AbstractC2772Sd.j(array, length);
        Arrays.sort(array, f27321a);
        RB.p(array, length);
    }
}

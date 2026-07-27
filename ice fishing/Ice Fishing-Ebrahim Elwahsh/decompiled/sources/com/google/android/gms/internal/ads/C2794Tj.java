package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Tj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2794Tj {

    /* renamed from: a, reason: collision with root package name */
    public static final FB f27817a = new FB();

    static {
        SB sb = UB.f27942u;
        new C2794Tj(C3675oC.f33115x);
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C2794Tj(UB ub) {
        SB sb = UB.f27942u;
        Object[] array = (ub == null ? AbstractC2655Lg.g(ub.listIterator(0)) : ub).toArray();
        int length = array.length;
        PA.o(array, length);
        Arrays.sort(array, f27817a);
        UB.p(array, length);
    }
}

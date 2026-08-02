package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3278gi {

    /* renamed from: a, reason: collision with root package name */
    public final I1.a f31364a;

    /* renamed from: b, reason: collision with root package name */
    public final C3332hi f31365b;

    /* renamed from: c, reason: collision with root package name */
    public final C4031ui f31366c;

    /* renamed from: d, reason: collision with root package name */
    public final E2.F f31367d;

    /* renamed from: e, reason: collision with root package name */
    public final C4248yj f31368e;

    /* renamed from: f, reason: collision with root package name */
    public final C3063ci f31369f;

    /* renamed from: g, reason: collision with root package name */
    public final Hs f31370g;

    /* renamed from: h, reason: collision with root package name */
    public final C4248yj f31371h;
    public final C3266gN i;

    /* renamed from: j, reason: collision with root package name */
    public final C3266gN f31372j;

    public C3278gi(C3332hi c3332hi, I1.a aVar) {
        this.f31365b = c3332hi;
        this.f31364a = aVar;
        C3021bt c3021bt = new C3021bt(aVar, 0);
        this.f31366c = new C4031ui(25, c3021bt);
        C3266gN c3266gN = c3332hi.f31639d;
        C3010bi c3010bi = c3332hi.f31645g;
        this.f31367d = new E2.F(c3266gN, c3010bi, 9);
        C3021bt c3021bt2 = new C3021bt(aVar, 1);
        C3021bt c3021bt3 = new C3021bt(aVar, 2);
        C3021bt c3021bt4 = new C3021bt(aVar, 3);
        this.f31368e = new C4248yj(c3010bi, c3266gN, c3021bt2, c3021bt3, c3021bt4, 13);
        this.f31369f = new C3063ci(c3010bi, 28);
        C3266gN c3266gN2 = c3332hi.f31605I;
        this.f31370g = new Hs(c3021bt, c3266gN2, c3266gN, 3);
        this.f31371h = new C4248yj(c3266gN2, c3021bt4, c3021bt, c3266gN, new C3021bt(aVar, 5), 14);
        this.i = C3266gN.a(new C3343ht(c3332hi.f31590A, 7));
        C3021bt c3021bt5 = new C3021bt(aVar, 4);
        C3266gN a9 = C3266gN.a(AbstractC3066cl.f30348G);
        C3266gN a10 = C3266gN.a(AbstractC2659Kg.f26717B);
        C3266gN a11 = C3266gN.a(MA.f27040A);
        C3266gN a12 = C3266gN.a(AbstractC2991bG.f30047H);
        int i = C3426jN.f32028b;
        LinkedHashMap h3 = WC.h(4);
        Ju ju = Ju.GMS_SIGNALS;
        AbstractC3364iD.f(a9, "provider");
        h3.put(ju, a9);
        Ju ju2 = Ju.BUILD_URL;
        AbstractC3364iD.f(a10, "provider");
        h3.put(ju2, a10);
        Ju ju3 = Ju.HTTP;
        AbstractC3364iD.f(a11, "provider");
        h3.put(ju3, a11);
        Ju ju4 = Ju.PRE_PROCESS;
        AbstractC3364iD.f(a12, "provider");
        h3.put(ju4, a12);
        C3266gN a13 = C3266gN.a(new C2556Ef(c3021bt5, c3332hi.f31645g, new C3426jN(h3), 12));
        int i4 = C3588mN.f32724c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a13);
        this.f31372j = C3266gN.a(new C4095vs(c3332hi.f31639d, new C3979tk(new C3588mN(list, arrayList), 25), 16));
    }
}

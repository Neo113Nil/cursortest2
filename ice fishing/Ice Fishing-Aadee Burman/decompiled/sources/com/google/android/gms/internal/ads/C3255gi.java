package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3255gi {

    /* renamed from: a, reason: collision with root package name */
    public final G1.a f30597a;

    /* renamed from: b, reason: collision with root package name */
    public final C3309hi f30598b;

    /* renamed from: c, reason: collision with root package name */
    public final C4008ui f30599c;

    /* renamed from: d, reason: collision with root package name */
    public final C2.G f30600d;

    /* renamed from: e, reason: collision with root package name */
    public final C4225yj f30601e;

    /* renamed from: f, reason: collision with root package name */
    public final C3040ci f30602f;

    /* renamed from: g, reason: collision with root package name */
    public final Hs f30603g;

    /* renamed from: h, reason: collision with root package name */
    public final C4225yj f30604h;
    public final C3243gN i;

    /* renamed from: j, reason: collision with root package name */
    public final C3243gN f30605j;

    public C3255gi(C3309hi c3309hi, G1.a aVar) {
        this.f30598b = c3309hi;
        this.f30597a = aVar;
        C2998bt c2998bt = new C2998bt(aVar, 0);
        this.f30599c = new C4008ui(25, c2998bt);
        C3243gN c3243gN = c3309hi.f30878d;
        C2987bi c2987bi = c3309hi.f30884g;
        this.f30600d = new C2.G(c3243gN, c2987bi, 9);
        C2998bt c2998bt2 = new C2998bt(aVar, 1);
        C2998bt c2998bt3 = new C2998bt(aVar, 2);
        C2998bt c2998bt4 = new C2998bt(aVar, 3);
        this.f30601e = new C4225yj(c2987bi, c3243gN, c2998bt2, c2998bt3, c2998bt4, 13);
        this.f30602f = new C3040ci(c2987bi, 28);
        C3243gN c3243gN2 = c3309hi.f30844I;
        this.f30603g = new Hs(c2998bt, c3243gN2, c3243gN, 3);
        this.f30604h = new C4225yj(c3243gN2, c2998bt4, c2998bt, c3243gN, new C2998bt(aVar, 5), 14);
        this.i = C3243gN.a(new C3320ht(c3309hi.f30829A, 7));
        C2998bt c2998bt5 = new C2998bt(aVar, 4);
        C3243gN a9 = C3243gN.a(AbstractC3043cl.f29563G);
        C3243gN a10 = C3243gN.a(AbstractC2639Kg.f25939B);
        C3243gN a11 = C3243gN.a(MA.f26249A);
        C3243gN a12 = C3243gN.a(AbstractC2968bG.f29259H);
        int i = C3403jN.f31241b;
        LinkedHashMap h9 = WC.h(4);
        Ju ju = Ju.GMS_SIGNALS;
        AbstractC3341iD.f(a9, "provider");
        h9.put(ju, a9);
        Ju ju2 = Ju.BUILD_URL;
        AbstractC3341iD.f(a10, "provider");
        h9.put(ju2, a10);
        Ju ju3 = Ju.HTTP;
        AbstractC3341iD.f(a11, "provider");
        h9.put(ju3, a11);
        Ju ju4 = Ju.PRE_PROCESS;
        AbstractC3341iD.f(a12, "provider");
        h9.put(ju4, a12);
        C3243gN a13 = C3243gN.a(new C2536Ef(c2998bt5, c3309hi.f30884g, new C3403jN(h9), 12));
        int i6 = C3565mN.f31944c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a13);
        this.f30605j = C3243gN.a(new C4072vs(c3309hi.f30878d, new C3956tk(new C3565mN(list, arrayList), 25), 16));
    }
}

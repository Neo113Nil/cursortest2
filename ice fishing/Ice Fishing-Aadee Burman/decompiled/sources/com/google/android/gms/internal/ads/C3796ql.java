package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import l2.InterfaceC4660d;

/* renamed from: com.google.android.gms.internal.ads.ql, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3796ql {

    /* renamed from: a, reason: collision with root package name */
    public final Object f33378a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f33379b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f33380c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f33381d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f33382e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f33383f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f33384g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f33385h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f33386j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f33387k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f33388l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f33389m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f33390n;

    /* renamed from: o, reason: collision with root package name */
    public Object f33391o;

    public C3796ql() {
        this.f33378a = new HashSet();
        this.f33379b = new HashSet();
        this.f33380c = new HashSet();
        this.f33381d = new HashSet();
        this.f33382e = new HashSet();
        this.f33383f = new HashSet();
        this.f33384g = new HashSet();
        this.f33385h = new HashSet();
        this.i = new HashSet();
        this.f33386j = new HashSet();
        this.f33387k = new HashSet();
        this.f33388l = new HashSet();
        this.f33389m = new HashSet();
        this.f33390n = new HashSet();
    }

    public void a(InterfaceC4172xk interfaceC4172xk, Executor executor) {
        ((HashSet) this.i).add(new C2491Bl(interfaceC4172xk, executor));
    }

    public void b(InterfaceC4660d interfaceC4660d, Executor executor) {
        ((HashSet) this.f33387k).add(new C2491Bl(interfaceC4660d, executor));
    }

    public void c(InterfaceC2542El interfaceC2542El, Executor executor) {
        ((HashSet) this.f33381d).add(new C2491Bl(interfaceC2542El, executor));
    }

    public void d(InterfaceC2990bl interfaceC2990bl, Executor executor) {
        ((HashSet) this.f33379b).add(new C2491Bl(interfaceC2990bl, executor));
    }

    public C3796ql(Context context, C2949ay c2949ay, RD rd) {
        int i = 6;
        this.f33378a = this;
        C3351iN a9 = C3351iN.a(context);
        this.f33379b = a9;
        C3243gN a10 = C3243gN.a(AbstractC2968bG.f29262L);
        this.f33380c = a10;
        C3351iN a11 = C3351iN.a(rd);
        this.f33381d = a11;
        C3243gN a12 = C3243gN.a(new Fz(a9, a10, a11));
        C3243gN a13 = C3243gN.a(new C2502Cf(a9, a11, 2));
        C3243gN a14 = C3243gN.a(new C2502Cf(a9, a11, 3));
        C3243gN a15 = C3243gN.a(new C3916sy(C3243gN.a(a11), a10, 0));
        C3243gN a16 = C3243gN.a(SK.f27459q0);
        C3351iN a17 = C3351iN.a(c2949ay);
        this.f33382e = a17;
        C3243gN a18 = C3243gN.a(new C4232yq(a15, a16, a17, i));
        this.f33383f = a18;
        C3243gN a19 = C3243gN.a(new C2502Cf(a11, a17, 1));
        this.f33384g = a19;
        C3243gN a20 = C3243gN.a(new Dy(a9, a18, a11, a19, a17));
        this.f33385h = a20;
        int i6 = C3565mN.f31944c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(a12);
        arrayList.add(a13);
        arrayList.add(a14);
        arrayList.add(a20);
        C3565mN c3565mN = new C3565mN(arrayList, list);
        C3243gN a21 = C3243gN.a(new C4008ui(27, new C3056cy(this, 0)));
        C3243gN a22 = C3243gN.a(new C4008ui(28, new C3056cy(this, 1)));
        C3243gN a23 = C3243gN.a(new C4008ui(29, new C3056cy(this, 2)));
        C3243gN a24 = C3243gN.a(new C3916sy(a10, a20, 1));
        this.i = a24;
        C3243gN a25 = C3243gN.a(new Ht(a17, C3243gN.a(new C2709Oi(a21, a22, a23, a17, a11, a24)), a20, a11, a24, 1));
        C3243gN a26 = C3243gN.a(new C3094di(a11, i));
        this.f33386j = a26;
        C3243gN a27 = C3243gN.a(new C3540lz(a9, a24, a17, a26, 5));
        C3243gN a28 = C3243gN.a(new C3540lz(a9, a24, a26, a17, 6));
        ArrayList arrayList2 = new ArrayList(3);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(a25);
        arrayList2.add(a27);
        arrayList2.add(a28);
        C3243gN a29 = C3243gN.a(new C2933ai((InterfaceC3297hN) c3565mN, (InterfaceC3297hN) new C3565mN(arrayList2, list2), (InterfaceC3297hN) a11, a24, 22));
        C3243gN a30 = C3243gN.a(AbstractC2968bG.f29263M);
        C3243gN a31 = C3243gN.a(new C3320ht(a10, 21));
        ArrayList arrayList3 = new ArrayList(7);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(a30);
        arrayList3.add(a12);
        arrayList3.add(a13);
        arrayList3.add(a31);
        arrayList3.add(a14);
        arrayList3.add(a27);
        arrayList3.add(a28);
        C3243gN a32 = C3243gN.a(new C4072vs(a30, new C3565mN(arrayList3, list3), 17));
        this.f33387k = a32;
        C3243gN a33 = C3243gN.a(new C3320ht(a24, 9));
        this.f33388l = a33;
        this.f33389m = C3243gN.a(new C3096dk(a29, a25, a32, a24, a18, C3243gN.a(new C3540lz(a9, a24, a33, a17, 4)), a17));
        this.f33390n = C3243gN.a(new C3094di(a9, 5));
        this.f33391o = C3243gN.a(new C3094di(a11, 7));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import n2.InterfaceC4769d;

/* renamed from: com.google.android.gms.internal.ads.ql, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3819ql {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34160a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34161b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34162c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f34163d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f34164e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f34165f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f34166g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f34167h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f34168j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f34169k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f34170l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f34171m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f34172n;

    /* renamed from: o, reason: collision with root package name */
    public Object f34173o;

    public C3819ql() {
        this.f34160a = new HashSet();
        this.f34161b = new HashSet();
        this.f34162c = new HashSet();
        this.f34163d = new HashSet();
        this.f34164e = new HashSet();
        this.f34165f = new HashSet();
        this.f34166g = new HashSet();
        this.f34167h = new HashSet();
        this.i = new HashSet();
        this.f34168j = new HashSet();
        this.f34169k = new HashSet();
        this.f34170l = new HashSet();
        this.f34171m = new HashSet();
        this.f34172n = new HashSet();
    }

    public void a(InterfaceC4195xk interfaceC4195xk, Executor executor) {
        ((HashSet) this.i).add(new C2528Cl(interfaceC4195xk, executor));
    }

    public void b(InterfaceC4769d interfaceC4769d, Executor executor) {
        ((HashSet) this.f34169k).add(new C2528Cl(interfaceC4769d, executor));
    }

    public void c(InterfaceC2579Fl interfaceC2579Fl, Executor executor) {
        ((HashSet) this.f34163d).add(new C2528Cl(interfaceC2579Fl, executor));
    }

    public void d(InterfaceC3013bl interfaceC3013bl, Executor executor) {
        ((HashSet) this.f34161b).add(new C2528Cl(interfaceC3013bl, executor));
    }

    public C3819ql(Context context, C2972ay c2972ay, RD rd) {
        int i = 6;
        this.f34160a = this;
        C3374iN a9 = C3374iN.a(context);
        this.f34161b = a9;
        C3266gN a10 = C3266gN.a(AbstractC2991bG.f30050L);
        this.f34162c = a10;
        C3374iN a11 = C3374iN.a(rd);
        this.f34163d = a11;
        C3266gN a12 = C3266gN.a(new Fz(a9, a10, a11));
        C3266gN a13 = C3266gN.a(new C2522Cf(a9, a11, 2));
        C3266gN a14 = C3266gN.a(new C2522Cf(a9, a11, 3));
        C3266gN a15 = C3266gN.a(new C3939sy(C3266gN.a(a11), a10, 0));
        C3266gN a16 = C3266gN.a(SK.f28172l0);
        C3374iN a17 = C3374iN.a(c2972ay);
        this.f34164e = a17;
        C3266gN a18 = C3266gN.a(new C4255yq(a15, a16, a17, i));
        this.f34165f = a18;
        C3266gN a19 = C3266gN.a(new C2522Cf(a11, a17, 1));
        this.f34166g = a19;
        C3266gN a20 = C3266gN.a(new Dy(a9, a18, a11, a19, a17));
        this.f34167h = a20;
        int i4 = C3588mN.f32724c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(a12);
        arrayList.add(a13);
        arrayList.add(a14);
        arrayList.add(a20);
        C3588mN c3588mN = new C3588mN(arrayList, list);
        C3266gN a21 = C3266gN.a(new C4031ui(27, new C3079cy(this, 0)));
        C3266gN a22 = C3266gN.a(new C4031ui(28, new C3079cy(this, 1)));
        C3266gN a23 = C3266gN.a(new C4031ui(29, new C3079cy(this, 2)));
        C3266gN a24 = C3266gN.a(new C3939sy(a10, a20, 1));
        this.i = a24;
        C3266gN a25 = C3266gN.a(new Ht(a17, C3266gN.a(new C2729Oi(a21, a22, a23, a17, a11, a24)), a20, a11, a24, 1));
        C3266gN a26 = C3266gN.a(new C3117di(a11, i));
        this.f34168j = a26;
        C3266gN a27 = C3266gN.a(new C3563lz(a9, a24, a17, a26, 5));
        C3266gN a28 = C3266gN.a(new C3563lz(a9, a24, a26, a17, 6));
        ArrayList arrayList2 = new ArrayList(3);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(a25);
        arrayList2.add(a27);
        arrayList2.add(a28);
        C3266gN a29 = C3266gN.a(new C2956ai((InterfaceC3320hN) c3588mN, (InterfaceC3320hN) new C3588mN(arrayList2, list2), (InterfaceC3320hN) a11, a24, 22));
        C3266gN a30 = C3266gN.a(AbstractC2991bG.f30051M);
        C3266gN a31 = C3266gN.a(new C3343ht(a10, 21));
        ArrayList arrayList3 = new ArrayList(7);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(a30);
        arrayList3.add(a12);
        arrayList3.add(a13);
        arrayList3.add(a31);
        arrayList3.add(a14);
        arrayList3.add(a27);
        arrayList3.add(a28);
        C3266gN a32 = C3266gN.a(new C4095vs(a30, new C3588mN(arrayList3, list3), 17));
        this.f34169k = a32;
        C3266gN a33 = C3266gN.a(new C3343ht(a24, 9));
        this.f34170l = a33;
        this.f34171m = C3266gN.a(new C3119dk(a29, a25, a32, a24, a18, C3266gN.a(new C3563lz(a9, a24, a33, a17, 4)), a17));
        this.f34172n = C3266gN.a(new C3117di(a9, 5));
        this.f34173o = C3266gN.a(new C3117di(a11, 7));
    }
}

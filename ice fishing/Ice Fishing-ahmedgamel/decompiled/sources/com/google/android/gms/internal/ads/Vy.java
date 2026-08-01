package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Vy {

    /* renamed from: a, reason: collision with root package name */
    public final RD f28281a;

    /* renamed from: b, reason: collision with root package name */
    public final Xy f28282b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f28283c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28284d;

    /* renamed from: e, reason: collision with root package name */
    public final C3979u6 f28285e;

    /* renamed from: f, reason: collision with root package name */
    public final C3218fz f28286f;

    /* renamed from: g, reason: collision with root package name */
    public final C3983uA f28287g;

    public Vy(RD rd, Xy xy, C3218fz c3218fz, EnumC3593my enumC3593my, String str, C3979u6 c3979u6, C3565mN c3565mN, C3565mN c3565mN2, C3565mN c3565mN3, C3983uA c3983uA) {
        this.f28281a = rd;
        this.f28282b = xy;
        this.f28284d = str;
        this.f28286f = c3218fz;
        this.f28285e = c3979u6;
        this.f28287g = c3983uA;
        int ordinal = enumC3593my.ordinal();
        if (ordinal == 0) {
            this.f28283c = c3565mN.f();
        } else if (ordinal == 1) {
            this.f28283c = c3565mN2.f();
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException();
            }
            this.f28283c = c3565mN3.f();
        }
    }

    public final N3.a a() {
        boolean z3;
        boolean z6;
        Xy xy = this.f28282b;
        synchronized (xy) {
            z3 = xy.f28616d;
        }
        if (!z3) {
            return QC.c(Integer.toString(7));
        }
        C3218fz c3218fz = this.f28286f;
        synchronized (c3218fz) {
            z6 = c3218fz.f30479j;
        }
        if (!z6) {
            return QC.o(new Uy(this, 2), this.f28281a);
        }
        Set set = this.f28283c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3360ig) this.f28281a).b((InterfaceCallableC3756pz) it.next()));
        }
        RB n9 = RB.n(arrayList);
        Uy uy = new Uy(this, 0);
        GD gd = GD.f24952n;
        FD fd = new FD(n9, false, false);
        fd.f24757I = new ED(fd, uy, gd);
        fd.w();
        return fd;
    }
}

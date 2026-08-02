package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Vy {

    /* renamed from: a, reason: collision with root package name */
    public final RD f29079a;

    /* renamed from: b, reason: collision with root package name */
    public final Xy f29080b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f29081c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29082d;

    /* renamed from: e, reason: collision with root package name */
    public final C4002u6 f29083e;

    /* renamed from: f, reason: collision with root package name */
    public final C3241fz f29084f;

    /* renamed from: g, reason: collision with root package name */
    public final C4006uA f29085g;

    public Vy(RD rd, Xy xy, C3241fz c3241fz, EnumC3616my enumC3616my, String str, C4002u6 c4002u6, C3588mN c3588mN, C3588mN c3588mN2, C3588mN c3588mN3, C4006uA c4006uA) {
        this.f29079a = rd;
        this.f29080b = xy;
        this.f29082d = str;
        this.f29084f = c3241fz;
        this.f29083e = c4002u6;
        this.f29085g = c4006uA;
        int ordinal = enumC3616my.ordinal();
        if (ordinal == 0) {
            this.f29081c = c3588mN.f();
        } else if (ordinal == 1) {
            this.f29081c = c3588mN2.f();
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException();
            }
            this.f29081c = c3588mN3.f();
        }
    }

    public final P3.a a() {
        boolean z6;
        boolean z9;
        Xy xy = this.f29080b;
        synchronized (xy) {
            z6 = xy.f29393d;
        }
        if (!z6) {
            return QC.c(Integer.toString(7));
        }
        C3241fz c3241fz = this.f29084f;
        synchronized (c3241fz) {
            z9 = c3241fz.f31245j;
        }
        if (!z9) {
            return QC.o(new Uy(this, 2), this.f29079a);
        }
        Set set = this.f29081c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3383ig) this.f29079a).b((InterfaceCallableC3779pz) it.next()));
        }
        RB n9 = RB.n(arrayList);
        Uy uy = new Uy(this, 0);
        GD gd = GD.f25742n;
        FD fd = new FD(n9, false, false);
        fd.f25513I = new ED(fd, uy, gd);
        fd.w();
        return fd;
    }
}

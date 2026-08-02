package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.anythink.core.c.b.e;
import java.util.Collections;
import java.util.List;
import s2.AbstractBinderC4967y0;

/* renamed from: com.google.android.gms.internal.ads.vm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4089vm {

    /* renamed from: a, reason: collision with root package name */
    public int f35485a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractBinderC4967y0 f35486b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3647nb f35487c;

    /* renamed from: d, reason: collision with root package name */
    public View f35488d;

    /* renamed from: e, reason: collision with root package name */
    public List f35489e;

    /* renamed from: g, reason: collision with root package name */
    public s2.L0 f35491g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f35492h;
    public InterfaceC4084vh i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC4084vh f35493j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC4084vh f35494k;

    /* renamed from: l, reason: collision with root package name */
    public C3232fq f35495l;

    /* renamed from: m, reason: collision with root package name */
    public P3.a f35496m;

    /* renamed from: n, reason: collision with root package name */
    public C3490kg f35497n;

    /* renamed from: o, reason: collision with root package name */
    public View f35498o;

    /* renamed from: p, reason: collision with root package name */
    public View f35499p;

    /* renamed from: q, reason: collision with root package name */
    public Y2.a f35500q;

    /* renamed from: r, reason: collision with root package name */
    public double f35501r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC3862rb f35502s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC3862rb f35503t;

    /* renamed from: u, reason: collision with root package name */
    public String f35504u;

    /* renamed from: x, reason: collision with root package name */
    public float f35507x;

    /* renamed from: y, reason: collision with root package name */
    public String f35508y;

    /* renamed from: v, reason: collision with root package name */
    public final s.k f35505v = new s.k();

    /* renamed from: w, reason: collision with root package name */
    public final s.k f35506w = new s.k();

    /* renamed from: f, reason: collision with root package name */
    public List f35490f = Collections.EMPTY_LIST;

    public static C4089vm l(InterfaceC4134wd interfaceC4134wd) {
        BinderC4035um binderC4035um;
        InterfaceC4134wd interfaceC4134wd2;
        try {
            s2.A0 p9 = interfaceC4134wd.p();
            if (p9 == null) {
                interfaceC4134wd2 = interfaceC4134wd;
                binderC4035um = null;
            } else {
                interfaceC4134wd2 = interfaceC4134wd;
                binderC4035um = new BinderC4035um(p9, interfaceC4134wd2);
            }
            return m(binderC4035um, interfaceC4134wd2.s(), (View) n(interfaceC4134wd2.r()), interfaceC4134wd2.d(), interfaceC4134wd2.e(), interfaceC4134wd2.h(), interfaceC4134wd2.f3(), interfaceC4134wd2.n(), (View) n(interfaceC4134wd2.m()), interfaceC4134wd2.w(), interfaceC4134wd2.l(), interfaceC4134wd2.q(), interfaceC4134wd2.k(), interfaceC4134wd2.g(), interfaceC4134wd2.j(), interfaceC4134wd2.u());
        } catch (RemoteException e9) {
            int i = w2.z.f41712b;
            x2.i.g("Failed to get native ad assets from unified ad mapper", e9);
            return null;
        }
    }

    public static C4089vm m(BinderC4035um binderC4035um, InterfaceC3647nb interfaceC3647nb, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, Y2.a aVar, String str4, String str5, double d9, InterfaceC3862rb interfaceC3862rb, String str6, float f2) {
        C4089vm c4089vm = new C4089vm();
        c4089vm.f35485a = 6;
        c4089vm.f35486b = binderC4035um;
        c4089vm.f35487c = interfaceC3647nb;
        c4089vm.f35488d = view;
        c4089vm.o("headline", str);
        c4089vm.f35489e = list;
        c4089vm.o("body", str2);
        c4089vm.f35492h = bundle;
        c4089vm.o("call_to_action", str3);
        c4089vm.f35498o = view2;
        c4089vm.f35500q = aVar;
        c4089vm.o("store", str4);
        c4089vm.o(e.a.f12854h, str5);
        c4089vm.f35501r = d9;
        c4089vm.f35502s = interfaceC3862rb;
        c4089vm.o("advertiser", str6);
        synchronized (c4089vm) {
            c4089vm.f35507x = f2;
        }
        return c4089vm;
    }

    public static Object n(Y2.a aVar) {
        if (aVar == null) {
            return null;
        }
        return Y2.b.D0(aVar);
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final InterfaceC3862rb b() {
        List list = this.f35489e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f35489e.get(0);
        if (obj instanceof IBinder) {
            return BinderC3379ib.U3((IBinder) obj);
        }
        return null;
    }

    public final synchronized String c() {
        return p("body");
    }

    public final synchronized Bundle d() {
        try {
            if (this.f35492h == null) {
                this.f35492h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f35492h;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p("advertiser");
    }

    public final synchronized String g() {
        return this.f35504u;
    }

    public final synchronized InterfaceC4084vh h() {
        return this.i;
    }

    public final synchronized InterfaceC4084vh i() {
        return this.f35493j;
    }

    public final synchronized InterfaceC4084vh j() {
        return this.f35494k;
    }

    public final synchronized C3232fq k() {
        return this.f35495l;
    }

    public final synchronized void o(String str, String str2) {
        if (str2 == null) {
            this.f35506w.remove(str);
        } else {
            this.f35506w.put(str, str2);
        }
    }

    public final synchronized String p(String str) {
        return (String) this.f35506w.getOrDefault(str, null);
    }

    public final synchronized int q() {
        return this.f35485a;
    }

    public final synchronized s2.A0 r() {
        return this.f35486b;
    }

    public final synchronized InterfaceC3647nb s() {
        return this.f35487c;
    }
}

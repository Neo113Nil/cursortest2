package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.anythink.core.c.b.e;
import java.util.Collections;
import java.util.List;
import q2.AbstractBinderC4918y0;

/* renamed from: com.google.android.gms.internal.ads.um, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4012um {

    /* renamed from: a, reason: collision with root package name */
    public int f34564a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractBinderC4918y0 f34565b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3624nb f34566c;

    /* renamed from: d, reason: collision with root package name */
    public View f34567d;

    /* renamed from: e, reason: collision with root package name */
    public List f34568e;

    /* renamed from: g, reason: collision with root package name */
    public q2.L0 f34570g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f34571h;
    public InterfaceC4061vh i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC4061vh f34572j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC4061vh f34573k;

    /* renamed from: l, reason: collision with root package name */
    public C3209fq f34574l;

    /* renamed from: m, reason: collision with root package name */
    public N3.a f34575m;

    /* renamed from: n, reason: collision with root package name */
    public C3467kg f34576n;

    /* renamed from: o, reason: collision with root package name */
    public View f34577o;

    /* renamed from: p, reason: collision with root package name */
    public View f34578p;

    /* renamed from: q, reason: collision with root package name */
    public W2.a f34579q;

    /* renamed from: r, reason: collision with root package name */
    public double f34580r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC3839rb f34581s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC3839rb f34582t;

    /* renamed from: u, reason: collision with root package name */
    public String f34583u;

    /* renamed from: x, reason: collision with root package name */
    public float f34586x;

    /* renamed from: y, reason: collision with root package name */
    public String f34587y;

    /* renamed from: v, reason: collision with root package name */
    public final s.k f34584v = new s.k();

    /* renamed from: w, reason: collision with root package name */
    public final s.k f34585w = new s.k();

    /* renamed from: f, reason: collision with root package name */
    public List f34569f = Collections.EMPTY_LIST;

    public static C4012um l(InterfaceC4111wd interfaceC4111wd) {
        BinderC3958tm binderC3958tm;
        InterfaceC4111wd interfaceC4111wd2;
        try {
            q2.A0 p9 = interfaceC4111wd.p();
            if (p9 == null) {
                interfaceC4111wd2 = interfaceC4111wd;
                binderC3958tm = null;
            } else {
                interfaceC4111wd2 = interfaceC4111wd;
                binderC3958tm = new BinderC3958tm(p9, interfaceC4111wd2);
            }
            return m(binderC3958tm, interfaceC4111wd2.s(), (View) n(interfaceC4111wd2.r()), interfaceC4111wd2.d(), interfaceC4111wd2.e(), interfaceC4111wd2.h(), interfaceC4111wd2.l3(), interfaceC4111wd2.n(), (View) n(interfaceC4111wd2.m()), interfaceC4111wd2.w(), interfaceC4111wd2.l(), interfaceC4111wd2.q(), interfaceC4111wd2.k(), interfaceC4111wd2.g(), interfaceC4111wd2.j(), interfaceC4111wd2.u());
        } catch (RemoteException e9) {
            int i = u2.z.f41322b;
            v2.i.g("Failed to get native ad assets from unified ad mapper", e9);
            return null;
        }
    }

    public static C4012um m(BinderC3958tm binderC3958tm, InterfaceC3624nb interfaceC3624nb, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, W2.a aVar, String str4, String str5, double d2, InterfaceC3839rb interfaceC3839rb, String str6, float f3) {
        C4012um c4012um = new C4012um();
        c4012um.f34564a = 6;
        c4012um.f34565b = binderC3958tm;
        c4012um.f34566c = interfaceC3624nb;
        c4012um.f34567d = view;
        c4012um.o("headline", str);
        c4012um.f34568e = list;
        c4012um.o("body", str2);
        c4012um.f34571h = bundle;
        c4012um.o("call_to_action", str3);
        c4012um.f34577o = view2;
        c4012um.f34579q = aVar;
        c4012um.o("store", str4);
        c4012um.o(e.a.f12068h, str5);
        c4012um.f34580r = d2;
        c4012um.f34581s = interfaceC3839rb;
        c4012um.o("advertiser", str6);
        synchronized (c4012um) {
            c4012um.f34586x = f3;
        }
        return c4012um;
    }

    public static Object n(W2.a aVar) {
        if (aVar == null) {
            return null;
        }
        return W2.b.F0(aVar);
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final InterfaceC3839rb b() {
        List list = this.f34568e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f34568e.get(0);
        if (obj instanceof IBinder) {
            return BinderC3356ib.U3((IBinder) obj);
        }
        return null;
    }

    public final synchronized String c() {
        return p("body");
    }

    public final synchronized Bundle d() {
        try {
            if (this.f34571h == null) {
                this.f34571h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f34571h;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p("advertiser");
    }

    public final synchronized String g() {
        return this.f34583u;
    }

    public final synchronized InterfaceC4061vh h() {
        return this.i;
    }

    public final synchronized InterfaceC4061vh i() {
        return this.f34572j;
    }

    public final synchronized InterfaceC4061vh j() {
        return this.f34573k;
    }

    public final synchronized C3209fq k() {
        return this.f34574l;
    }

    public final synchronized void o(String str, String str2) {
        if (str2 == null) {
            this.f34585w.remove(str);
        } else {
            this.f34585w.put(str, str2);
        }
    }

    public final synchronized String p(String str) {
        return (String) this.f34585w.getOrDefault(str, null);
    }

    public final synchronized int q() {
        return this.f34564a;
    }

    public final synchronized q2.A0 r() {
        return this.f34565b;
    }

    public final synchronized InterfaceC3624nb s() {
        return this.f34566c;
    }
}

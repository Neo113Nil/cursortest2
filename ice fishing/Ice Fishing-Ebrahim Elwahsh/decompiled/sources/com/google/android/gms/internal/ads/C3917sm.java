package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.anythink.core.c.b.e;
import java.util.Collections;
import java.util.List;
import q2.AbstractBinderC4925y0;

/* renamed from: com.google.android.gms.internal.ads.sm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3917sm {

    /* renamed from: a, reason: collision with root package name */
    public int f34275a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractBinderC4925y0 f34276b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC3421jb f34277c;

    /* renamed from: d, reason: collision with root package name */
    public View f34278d;

    /* renamed from: e, reason: collision with root package name */
    public List f34279e;

    /* renamed from: g, reason: collision with root package name */
    public q2.L0 f34281g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f34282h;
    public InterfaceC3858rh i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC3858rh f34283j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC3858rh f34284k;

    /* renamed from: l, reason: collision with root package name */
    public C3330hq f34285l;

    /* renamed from: m, reason: collision with root package name */
    public J3.a f34286m;

    /* renamed from: n, reason: collision with root package name */
    public C3320hg f34287n;

    /* renamed from: o, reason: collision with root package name */
    public View f34288o;

    /* renamed from: p, reason: collision with root package name */
    public View f34289p;

    /* renamed from: q, reason: collision with root package name */
    public V2.a f34290q;

    /* renamed from: r, reason: collision with root package name */
    public double f34291r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC3637nb f34292s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC3637nb f34293t;

    /* renamed from: u, reason: collision with root package name */
    public String f34294u;

    /* renamed from: x, reason: collision with root package name */
    public float f34297x;

    /* renamed from: y, reason: collision with root package name */
    public String f34298y;

    /* renamed from: v, reason: collision with root package name */
    public final s.k f34295v = new s.k();

    /* renamed from: w, reason: collision with root package name */
    public final s.k f34296w = new s.k();

    /* renamed from: f, reason: collision with root package name */
    public List f34280f = Collections.EMPTY_LIST;

    public static C3917sm l(InterfaceC3962td interfaceC3962td) {
        BinderC3863rm binderC3863rm;
        InterfaceC3962td interfaceC3962td2;
        try {
            q2.A0 p6 = interfaceC3962td.p();
            if (p6 == null) {
                interfaceC3962td2 = interfaceC3962td;
                binderC3863rm = null;
            } else {
                interfaceC3962td2 = interfaceC3962td;
                binderC3863rm = new BinderC3863rm(p6, interfaceC3962td2);
            }
            return m(binderC3863rm, interfaceC3962td2.q(), (View) n(interfaceC3962td2.r()), interfaceC3962td2.c(), interfaceC3962td2.f(), interfaceC3962td2.e(), interfaceC3962td2.c3(), interfaceC3962td2.l(), (View) n(interfaceC3962td2.n()), interfaceC3962td2.t(), interfaceC3962td2.k(), interfaceC3962td2.m(), interfaceC3962td2.j(), interfaceC3962td2.g(), interfaceC3962td2.h(), interfaceC3962td2.R());
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.g("Failed to get native ad assets from unified ad mapper", e6);
            return null;
        }
    }

    public static C3917sm m(BinderC3863rm binderC3863rm, InterfaceC3421jb interfaceC3421jb, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, V2.a aVar, String str4, String str5, double d2, InterfaceC3637nb interfaceC3637nb, String str6, float f6) {
        C3917sm c3917sm = new C3917sm();
        c3917sm.f34275a = 6;
        c3917sm.f34276b = binderC3863rm;
        c3917sm.f34277c = interfaceC3421jb;
        c3917sm.f34278d = view;
        c3917sm.o("headline", str);
        c3917sm.f34279e = list;
        c3917sm.o("body", str2);
        c3917sm.f34282h = bundle;
        c3917sm.o("call_to_action", str3);
        c3917sm.f34288o = view2;
        c3917sm.f34290q = aVar;
        c3917sm.o("store", str4);
        c3917sm.o(e.a.f12225h, str5);
        c3917sm.f34291r = d2;
        c3917sm.f34292s = interfaceC3637nb;
        c3917sm.o("advertiser", str6);
        synchronized (c3917sm) {
            c3917sm.f34297x = f6;
        }
        return c3917sm;
    }

    public static Object n(V2.a aVar) {
        if (aVar == null) {
            return null;
        }
        return V2.b.A0(aVar);
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final InterfaceC3637nb b() {
        List list = this.f34279e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f34279e.get(0);
        if (obj instanceof IBinder) {
            return BinderC3098db.G3((IBinder) obj);
        }
        return null;
    }

    public final synchronized String c() {
        return p("body");
    }

    public final synchronized Bundle d() {
        try {
            if (this.f34282h == null) {
                this.f34282h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f34282h;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p("advertiser");
    }

    public final synchronized String g() {
        return this.f34294u;
    }

    public final synchronized InterfaceC3858rh h() {
        return this.i;
    }

    public final synchronized InterfaceC3858rh i() {
        return this.f34283j;
    }

    public final synchronized InterfaceC3858rh j() {
        return this.f34284k;
    }

    public final synchronized C3330hq k() {
        return this.f34285l;
    }

    public final synchronized void o(String str, String str2) {
        if (str2 == null) {
            this.f34296w.remove(str);
        } else {
            this.f34296w.put(str, str2);
        }
    }

    public final synchronized String p(String str) {
        return (String) this.f34296w.getOrDefault(str, null);
    }

    public final synchronized int q() {
        return this.f34275a;
    }

    public final synchronized q2.A0 r() {
        return this.f34276b;
    }

    public final synchronized InterfaceC3421jb s() {
        return this.f34277c;
    }
}

package com.anythink.core.common.h;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class br {

    /* renamed from: a, reason: collision with root package name */
    private String f14531a;

    /* renamed from: b, reason: collision with root package name */
    private List<c> f14532b;

    public br(String str, List<c> list) {
        this.f14531a = str;
        this.f14532b = list;
    }

    private synchronized double h() {
        try {
            List<c> list = this.f14532b;
            c cVar = (list == null || list.size() <= 0) ? null : this.f14532b.get(0);
            if (cVar != null) {
                return com.anythink.core.common.v.p.a(cVar.e().getUnitGroupInfo());
            }
            return 0.0d;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String a() {
        return this.f14531a;
    }

    public final synchronized int b() {
        List<c> list = this.f14532b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final synchronized c c() {
        List<c> list = this.f14532b;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f14532b.get(0);
    }

    public final synchronized boolean d() {
        try {
            List<c> list = this.f14532b;
            c cVar = (list == null || list.size() <= 0) ? null : this.f14532b.get(0);
            if (cVar != null) {
                return cVar.a();
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized bv e() {
        try {
            List<c> list = this.f14532b;
            c cVar = (list == null || list.size() <= 0) ? null : this.f14532b.get(0);
            if (cVar != null) {
                return cVar.e().getUnitGroupInfo();
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long f() {
        try {
            List<c> list = this.f14532b;
            c cVar = (list == null || list.size() <= 0) ? null : this.f14532b.get(0);
            if (cVar != null) {
                return cVar.b();
            }
            return 0L;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        List<c> list = this.f14532b;
        if (list == null) {
            return;
        }
        for (c cVar : list) {
            if (cVar != null) {
                com.anythink.core.b.d.c.a(cVar, true, 26);
                cVar.m();
            }
        }
    }

    public final synchronized void a(c cVar) {
        List<c> list = this.f14532b;
        if (list != null) {
            list.remove(cVar);
        }
    }

    public final synchronized void a(int i) {
        List<c> list = this.f14532b;
        if (list != null) {
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                it.next().e().getUnitGroupInfo().f14599m = i;
            }
        }
    }
}

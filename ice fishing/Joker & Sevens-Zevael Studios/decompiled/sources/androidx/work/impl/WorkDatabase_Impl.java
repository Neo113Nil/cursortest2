package androidx.work.impl;

import b4.b;
import b4.h;
import h4.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m7.g;
import x4.c;
import x4.e;
import x4.f;
import x4.i;
import x4.l;
import x4.n;
import x4.q;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k, reason: collision with root package name */
    public volatile q f764k;

    /* renamed from: l, reason: collision with root package name */
    public volatile c f765l;

    /* renamed from: m, reason: collision with root package name */
    public volatile s f766m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i f767n;

    /* renamed from: o, reason: collision with root package name */
    public volatile l f768o;

    /* renamed from: p, reason: collision with root package name */
    public volatile n f769p;

    /* renamed from: q, reason: collision with root package name */
    public volatile e f770q;

    @Override // androidx.work.impl.WorkDatabase
    public final h d() {
        return new h(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final d e(b bVar) {
        return bVar.f949c.b(new h4.b(bVar.f947a, bVar.f948b, new b4.n(bVar, new g(9, this)), false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c f() {
        c cVar;
        if (this.f765l != null) {
            return this.f765l;
        }
        synchronized (this) {
            try {
                if (this.f765l == null) {
                    c cVar2 = new c();
                    cVar2.f8290g = this;
                    cVar2.f8291h = new x4.b(this, 0);
                    this.f765l = cVar2;
                }
                cVar = this.f765l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(Map map) {
        return Arrays.asList(new p4.d(13, 14, 9), new p4.d());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Set i() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Map j() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(q.class, list);
        hashMap.put(c.class, list);
        hashMap.put(s.class, list);
        hashMap.put(i.class, list);
        hashMap.put(l.class, list);
        hashMap.put(n.class, list);
        hashMap.put(e.class, list);
        hashMap.put(f.class, list);
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e l() {
        e eVar;
        if (this.f770q != null) {
            return this.f770q;
        }
        synchronized (this) {
            try {
                if (this.f770q == null) {
                    this.f770q = new e(this);
                }
                eVar = this.f770q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i p() {
        i iVar;
        if (this.f767n != null) {
            return this.f767n;
        }
        synchronized (this) {
            try {
                if (this.f767n == null) {
                    i iVar2 = new i();
                    iVar2.f8303a = this;
                    iVar2.f8304b = new x4.b(this, 2);
                    iVar2.f8305c = new x4.h(this, 0);
                    iVar2.f8306d = new x4.h(this, 1);
                    this.f767n = iVar2;
                }
                iVar = this.f767n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l r() {
        l lVar;
        if (this.f768o != null) {
            return this.f768o;
        }
        synchronized (this) {
            try {
                if (this.f768o == null) {
                    this.f768o = new l(this);
                }
                lVar = this.f768o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n s() {
        n nVar;
        if (this.f769p != null) {
            return this.f769p;
        }
        synchronized (this) {
            try {
                if (this.f769p == null) {
                    this.f769p = new n(this);
                }
                nVar = this.f769p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q t() {
        q qVar;
        if (this.f764k != null) {
            return this.f764k;
        }
        synchronized (this) {
            try {
                if (this.f764k == null) {
                    this.f764k = new q(this);
                }
                qVar = this.f764k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s u() {
        s sVar;
        if (this.f766m != null) {
            return this.f766m;
        }
        synchronized (this) {
            try {
                if (this.f766m == null) {
                    this.f766m = new s(this);
                }
                sVar = this.f766m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}

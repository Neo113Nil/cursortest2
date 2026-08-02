package androidx.work.impl;

import F.d;
import S0.c;
import S0.e;
import S0.f;
import S0.i;
import S0.l;
import S0.n;
import S0.q;
import S0.s;
import com.google.android.gms.internal.ads.C3451jv;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u0.C5053b;
import u0.C5057f;
import y0.InterfaceC5197b;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k, reason: collision with root package name */
    public volatile q f5340k;

    /* renamed from: l, reason: collision with root package name */
    public volatile c f5341l;

    /* renamed from: m, reason: collision with root package name */
    public volatile s f5342m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i f5343n;

    /* renamed from: o, reason: collision with root package name */
    public volatile l f5344o;

    /* renamed from: p, reason: collision with root package name */
    public volatile n f5345p;

    /* renamed from: q, reason: collision with root package name */
    public volatile e f5346q;

    @Override // androidx.work.impl.WorkDatabase
    public final C5057f d() {
        return new C5057f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC5197b e(C5053b c5053b) {
        return c5053b.f40951c.c(new C3451jv(c5053b.f40949a, c5053b.f40950b, new d(c5053b, new n4.c(9, this)), false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c f() {
        c cVar;
        if (this.f5341l != null) {
            return this.f5341l;
        }
        synchronized (this) {
            try {
                if (this.f5341l == null) {
                    this.f5341l = new c(this);
                }
                cVar = this.f5341l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new K0.d(13, 14, 9), new K0.d());
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
        if (this.f5346q != null) {
            return this.f5346q;
        }
        synchronized (this) {
            try {
                if (this.f5346q == null) {
                    this.f5346q = new e(this);
                }
                eVar = this.f5346q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i p() {
        i iVar;
        if (this.f5343n != null) {
            return this.f5343n;
        }
        synchronized (this) {
            try {
                if (this.f5343n == null) {
                    this.f5343n = new i(this);
                }
                iVar = this.f5343n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l r() {
        l lVar;
        if (this.f5344o != null) {
            return this.f5344o;
        }
        synchronized (this) {
            try {
                if (this.f5344o == null) {
                    this.f5344o = new l(this);
                }
                lVar = this.f5344o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n s() {
        n nVar;
        if (this.f5345p != null) {
            return this.f5345p;
        }
        synchronized (this) {
            try {
                if (this.f5345p == null) {
                    this.f5345p = new n(this);
                }
                nVar = this.f5345p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q t() {
        q qVar;
        if (this.f5340k != null) {
            return this.f5340k;
        }
        synchronized (this) {
            try {
                if (this.f5340k == null) {
                    this.f5340k = new q(this);
                }
                qVar = this.f5340k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s u() {
        s sVar;
        if (this.f5342m != null) {
            return this.f5342m;
        }
        synchronized (this) {
            try {
                if (this.f5342m == null) {
                    this.f5342m = new s(this);
                }
                sVar = this.f5342m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}

package androidx.work.impl;

import F.d;
import F1.a;
import S0.c;
import S0.e;
import S0.f;
import S0.i;
import S0.l;
import S0.n;
import S0.q;
import S0.s;
import com.google.android.gms.internal.ads.C3428jv;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u0.C5052b;
import u0.C5056f;
import y0.b;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k, reason: collision with root package name */
    public volatile q f5375k;

    /* renamed from: l, reason: collision with root package name */
    public volatile c f5376l;

    /* renamed from: m, reason: collision with root package name */
    public volatile s f5377m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i f5378n;

    /* renamed from: o, reason: collision with root package name */
    public volatile l f5379o;

    /* renamed from: p, reason: collision with root package name */
    public volatile n f5380p;

    /* renamed from: q, reason: collision with root package name */
    public volatile e f5381q;

    @Override // androidx.work.impl.WorkDatabase
    public final C5056f d() {
        return new C5056f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b e(C5052b c5052b) {
        return c5052b.f40989c.a(new C3428jv(c5052b.f40987a, c5052b.f40988b, new d(c5052b, new a(2, this)), false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c f() {
        c cVar;
        if (this.f5376l != null) {
            return this.f5376l;
        }
        synchronized (this) {
            try {
                if (this.f5376l == null) {
                    this.f5376l = new c(this);
                }
                cVar = this.f5376l;
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
        if (this.f5381q != null) {
            return this.f5381q;
        }
        synchronized (this) {
            try {
                if (this.f5381q == null) {
                    this.f5381q = new e(this);
                }
                eVar = this.f5381q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i p() {
        i iVar;
        if (this.f5378n != null) {
            return this.f5378n;
        }
        synchronized (this) {
            try {
                if (this.f5378n == null) {
                    this.f5378n = new i(this);
                }
                iVar = this.f5378n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l r() {
        l lVar;
        if (this.f5379o != null) {
            return this.f5379o;
        }
        synchronized (this) {
            try {
                if (this.f5379o == null) {
                    this.f5379o = new l(this);
                }
                lVar = this.f5379o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n s() {
        n nVar;
        if (this.f5380p != null) {
            return this.f5380p;
        }
        synchronized (this) {
            try {
                if (this.f5380p == null) {
                    this.f5380p = new n(this);
                }
                nVar = this.f5380p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q t() {
        q qVar;
        if (this.f5375k != null) {
            return this.f5375k;
        }
        synchronized (this) {
            try {
                if (this.f5375k == null) {
                    this.f5375k = new q(this);
                }
                qVar = this.f5375k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s u() {
        s sVar;
        if (this.f5377m != null) {
            return this.f5377m;
        }
        synchronized (this) {
            try {
                if (this.f5377m == null) {
                    this.f5377m = new s(this);
                }
                sVar = this.f5377m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}

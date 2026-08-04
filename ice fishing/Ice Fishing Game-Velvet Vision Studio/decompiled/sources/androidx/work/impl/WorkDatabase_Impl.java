package androidx.work.impl;

import android.content.Context;
import com.gamericefishpro.space.d6.f;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.s5.a;
import com.gamericefishpro.space.s5.g;
import com.gamericefishpro.space.s5.u;
import com.gamericefishpro.space.u6.b;
import com.gamericefishpro.space.u6.c;
import com.gamericefishpro.space.u6.e;
import com.gamericefishpro.space.u6.h;
import com.gamericefishpro.space.u6.i;
import com.gamericefishpro.space.u6.l;
import com.gamericefishpro.space.u6.n;
import com.gamericefishpro.space.u6.q;
import com.gamericefishpro.space.u6.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile q l;
    public volatile c m;
    public volatile s n;
    public volatile i o;
    public volatile l p;
    public volatile n q;
    public volatile e r;

    @Override // androidx.work.impl.WorkDatabase
    public final n A() {
        n nVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    n nVar2 = new n();
                    nVar2.d = this;
                    Intrinsics.checkNotNullParameter(this, "database");
                    nVar2.e = new b(this, 4);
                    nVar2.i = new h(this, 2);
                    nVar2.v = new h(this, 3);
                    this.q = nVar2;
                }
                nVar = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q B() {
        q qVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new q(this);
                }
                qVar = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s C() {
        s sVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new s(this);
                }
                sVar = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // com.gamericefishpro.space.s5.t
    public final g e() {
        return new g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // com.gamericefishpro.space.s5.t
    public final f g(a aVar) {
        u callback = new u(aVar, new d(3, this));
        Context context = aVar.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = aVar.b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        return aVar.c.c(new com.gamericefishpro.space.d6.d(context, str, callback, false, false));
    }

    @Override // com.gamericefishpro.space.s5.t
    public final List h(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new com.gamericefishpro.space.m6.d(13, 14, 9), new com.gamericefishpro.space.m6.d());
    }

    @Override // com.gamericefishpro.space.s5.t
    public final Set l() {
        return new HashSet();
    }

    @Override // com.gamericefishpro.space.s5.t
    public final Map n() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(q.class, list);
        map.put(c.class, list);
        map.put(s.class, list);
        map.put(i.class, list);
        map.put(l.class, list);
        map.put(n.class, list);
        map.put(e.class, list);
        map.put(com.gamericefishpro.space.u6.f.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c w() {
        c cVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    c cVar2 = new c();
                    cVar2.d = this;
                    Intrinsics.checkNotNullParameter(this, "database");
                    cVar2.e = new b(this, 0);
                    this.m = cVar2;
                }
                cVar = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e x() {
        e eVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new e(this);
                }
                eVar = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i y() {
        i iVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new i(this);
                }
                iVar = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l z() {
        l lVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    l lVar2 = new l();
                    lVar2.d = this;
                    Intrinsics.checkNotNullParameter(this, "database");
                    lVar2.e = new b(this, 3);
                    this.p = lVar2;
                }
                lVar = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }
}

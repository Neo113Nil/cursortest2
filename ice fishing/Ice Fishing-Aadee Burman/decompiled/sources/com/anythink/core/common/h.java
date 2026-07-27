package com.anythink.core.common;

import com.anythink.core.common.h.bv;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private String f13305b;

    /* renamed from: c, reason: collision with root package name */
    private d f13306c;

    /* renamed from: d, reason: collision with root package name */
    private b f13307d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13308e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13309f;

    /* renamed from: g, reason: collision with root package name */
    private long f13310g;

    /* renamed from: h, reason: collision with root package name */
    private long f13311h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13312j;

    /* renamed from: k, reason: collision with root package name */
    private g f13313k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f13314l;

    /* renamed from: a, reason: collision with root package name */
    private final String f13304a = "h";

    /* renamed from: m, reason: collision with root package name */
    private final List<a> f13315m = new CopyOnWriteArrayList();

    public class a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f13317b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.core.b.d f13318c;

        /* renamed from: d, reason: collision with root package name */
        private int f13319d;

        public a(com.anythink.core.b.d dVar, int i) {
            this.f13318c = dVar;
            this.f13319d = i;
            if (!h.this.f13309f) {
                a();
                return;
            }
            if (h.this.f13314l) {
                synchronized (h.this.f13315m) {
                    try {
                        h.this.f13315m.add(this);
                    } finally {
                    }
                }
            }
            String unused = h.this.f13304a;
            if (2 == i) {
                long unused2 = h.this.f13310g;
            } else {
                long unused3 = h.this.f13311h;
            }
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.h.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.a();
                }
            }, 2 == i ? h.this.f13310g : h.this.f13311h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a() {
            try {
                if (!this.f13317b) {
                    this.f13317b = true;
                    String unused = h.this.f13304a;
                    if (2 == this.f13319d) {
                        long unused2 = h.this.f13310g;
                    } else {
                        long unused3 = h.this.f13311h;
                    }
                    if (h.this.f13307d != null) {
                        h.this.f13307d.a(this.f13318c, this.f13319d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public interface b {
        void a(com.anythink.core.b.d dVar, int i);
    }

    public class c {
        public c(g gVar) {
            h.this.f13313k = gVar;
            if (h.this.f13309f) {
                com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.h.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.a();
                    }
                }, h.this.i);
            } else {
                h.this.a();
            }
        }
    }

    public interface d {
        void a(g gVar);
    }

    public h(String str) {
        this.f13305b = str;
    }

    public final void b() {
        List<a> list;
        if (this.f13314l) {
            synchronized (this.f13315m) {
                try {
                    try {
                        list = this.f13315m;
                    } catch (Throwable th) {
                        com.anythink.core.common.u.e.b("callAnotherBiddingByOnlyBid error", th.getMessage() + ", " + com.anythink.core.common.v.q.a(th.getStackTrace()), com.anythink.core.common.d.t.b().r());
                    }
                    if (list != null && !list.isEmpty()) {
                        for (a aVar : this.f13315m) {
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final long c() {
        if (this.f13309f) {
            return Math.max(this.f13311h, this.f13310g);
        }
        return 0L;
    }

    public final boolean d() {
        return this.f13308e;
    }

    public final boolean e() {
        return this.f13309f;
    }

    public final void a(com.anythink.core.d.l lVar, boolean z3) {
        if (lVar == null) {
            this.f13309f = false;
            return;
        }
        this.f13314l = z3;
        this.f13309f = lVar.b() == 1;
        this.f13310g = lVar.e();
        this.f13311h = lVar.f();
        this.i = lVar.d();
        if (this.f13309f) {
            return;
        }
        this.f13310g = 0L;
        this.f13311h = 0L;
        this.i = 0L;
    }

    private static boolean a(List<bv> list, bv bvVar) {
        return list == null || list.isEmpty() || com.anythink.core.common.v.l.a(bvVar, list.get(0)) == -1;
    }

    public final void a(g gVar) {
        this.f13308e = true;
        new c(gVar);
    }

    public final synchronized void a() {
        try {
            d dVar = this.f13306c;
            if (dVar != null && !this.f13312j) {
                dVar.a(this.f13313k);
            }
            this.f13312j = true;
            this.f13308e = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(com.anythink.core.b.d dVar, int i) {
        if (dVar != null) {
            new a(dVar, i);
        }
    }

    public final void a(d dVar) {
        this.f13306c = dVar;
    }

    public final void a(b bVar) {
        this.f13307d = bVar;
    }

    private void a(boolean z3) {
        this.f13309f = z3;
    }
}

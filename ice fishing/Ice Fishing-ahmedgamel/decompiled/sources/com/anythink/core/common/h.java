package com.anythink.core.common;

import com.anythink.core.common.h.bv;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    private String f14091b;

    /* renamed from: c, reason: collision with root package name */
    private d f14092c;

    /* renamed from: d, reason: collision with root package name */
    private b f14093d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14094e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14095f;

    /* renamed from: g, reason: collision with root package name */
    private long f14096g;

    /* renamed from: h, reason: collision with root package name */
    private long f14097h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14098j;

    /* renamed from: k, reason: collision with root package name */
    private g f14099k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14100l;

    /* renamed from: a, reason: collision with root package name */
    private final String f14090a = "h";

    /* renamed from: m, reason: collision with root package name */
    private final List<a> f14101m = new CopyOnWriteArrayList();

    public class a {

        /* renamed from: b, reason: collision with root package name */
        private boolean f14103b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.core.b.d f14104c;

        /* renamed from: d, reason: collision with root package name */
        private int f14105d;

        public a(com.anythink.core.b.d dVar, int i) {
            this.f14104c = dVar;
            this.f14105d = i;
            if (!h.this.f14095f) {
                a();
                return;
            }
            if (h.this.f14100l) {
                synchronized (h.this.f14101m) {
                    try {
                        h.this.f14101m.add(this);
                    } finally {
                    }
                }
            }
            String unused = h.this.f14090a;
            if (2 == i) {
                long unused2 = h.this.f14096g;
            } else {
                long unused3 = h.this.f14097h;
            }
            com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.common.h.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.a();
                }
            }, 2 == i ? h.this.f14096g : h.this.f14097h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a() {
            try {
                if (!this.f14103b) {
                    this.f14103b = true;
                    String unused = h.this.f14090a;
                    if (2 == this.f14105d) {
                        long unused2 = h.this.f14096g;
                    } else {
                        long unused3 = h.this.f14097h;
                    }
                    if (h.this.f14093d != null) {
                        h.this.f14093d.a(this.f14104c, this.f14105d);
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
            h.this.f14099k = gVar;
            if (h.this.f14095f) {
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
        this.f14091b = str;
    }

    public final void b() {
        List<a> list;
        if (this.f14100l) {
            synchronized (this.f14101m) {
                try {
                    try {
                        list = this.f14101m;
                    } catch (Throwable th) {
                        com.anythink.core.common.u.e.b("callAnotherBiddingByOnlyBid error", th.getMessage() + ", " + com.anythink.core.common.v.q.a(th.getStackTrace()), com.anythink.core.common.d.t.b().r());
                    }
                    if (list != null && !list.isEmpty()) {
                        for (a aVar : this.f14101m) {
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
        if (this.f14095f) {
            return Math.max(this.f14097h, this.f14096g);
        }
        return 0L;
    }

    public final boolean d() {
        return this.f14094e;
    }

    public final boolean e() {
        return this.f14095f;
    }

    public final void a(com.anythink.core.d.l lVar, boolean z6) {
        if (lVar == null) {
            this.f14095f = false;
            return;
        }
        this.f14100l = z6;
        this.f14095f = lVar.b() == 1;
        this.f14096g = lVar.e();
        this.f14097h = lVar.f();
        this.i = lVar.d();
        if (this.f14095f) {
            return;
        }
        this.f14096g = 0L;
        this.f14097h = 0L;
        this.i = 0L;
    }

    private static boolean a(List<bv> list, bv bvVar) {
        return list == null || list.isEmpty() || com.anythink.core.common.v.l.a(bvVar, list.get(0)) == -1;
    }

    public final void a(g gVar) {
        this.f14094e = true;
        new c(gVar);
    }

    public final synchronized void a() {
        try {
            d dVar = this.f14092c;
            if (dVar != null && !this.f14098j) {
                dVar.a(this.f14099k);
            }
            this.f14098j = true;
            this.f14094e = false;
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
        this.f14092c = dVar;
    }

    public final void a(b bVar) {
        this.f14093d = bVar;
    }

    private void a(boolean z6) {
        this.f14095f = z6;
    }
}

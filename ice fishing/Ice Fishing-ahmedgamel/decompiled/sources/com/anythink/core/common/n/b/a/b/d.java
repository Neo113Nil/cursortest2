package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.C0546a;
import com.anythink.core.common.n.b.a.b.i;
import com.anythink.core.common.n.b.ah;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.b.z;
import java.io.IOException;
import java.net.Socket;
import java.util.List;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f14968a = true;

    /* renamed from: b, reason: collision with root package name */
    private final j f14969b;

    /* renamed from: c, reason: collision with root package name */
    private final C0546a f14970c;

    /* renamed from: d, reason: collision with root package name */
    private final f f14971d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f14972e;

    /* renamed from: f, reason: collision with root package name */
    private final r f14973f;

    /* renamed from: g, reason: collision with root package name */
    private i.a f14974g;

    /* renamed from: h, reason: collision with root package name */
    private final i f14975h;
    private e i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14976j;

    /* renamed from: k, reason: collision with root package name */
    private ah f14977k;

    public d(j jVar, f fVar, C0546a c0546a, com.anythink.core.common.n.b.e eVar, r rVar) {
        this.f14969b = jVar;
        this.f14971d = fVar;
        this.f14970c = c0546a;
        this.f14972e = eVar;
        this.f14973f = rVar;
        this.f14975h = new i(c0546a, fVar.f15000a, eVar, rVar);
    }

    private boolean e() {
        e eVar = this.f14969b.f15020a;
        return eVar != null && eVar.f14982c == 0 && com.anythink.core.common.n.b.a.c.a(eVar.a().a().a(), this.f14970c.a());
    }

    public final com.anythink.core.common.n.b.a.c.c a(z zVar, w.a aVar, boolean z3) {
        try {
            return a(aVar.d(), aVar.e(), aVar.f(), zVar.b(), zVar.p(), z3).a(zVar, aVar);
        } catch (h e9) {
            b();
            throw e9;
        } catch (IOException e10) {
            b();
            throw new h(e10);
        }
    }

    public final void b() {
        if (!f14968a && Thread.holdsLock(this.f14971d)) {
            throw new AssertionError();
        }
        synchronized (this.f14971d) {
            this.f14976j = true;
        }
    }

    public final boolean c() {
        boolean z3;
        synchronized (this.f14971d) {
            z3 = this.f14976j;
        }
        return z3;
    }

    public final boolean d() {
        synchronized (this.f14971d) {
            try {
                boolean z3 = true;
                if (this.f14977k != null) {
                    return true;
                }
                if (e()) {
                    this.f14977k = this.f14969b.f15020a.a();
                    return true;
                }
                i.a aVar = this.f14974g;
                if ((aVar == null || !aVar.a()) && !this.f14975h.a()) {
                    z3 = false;
                }
                return z3;
            } finally {
            }
        }
    }

    private e a(int i, int i6, int i9, int i10, boolean z3, boolean z6) {
        while (true) {
            e a9 = a(i, i6, i9, i10, z3);
            boolean z9 = z3;
            int i11 = i10;
            int i12 = i9;
            int i13 = i6;
            int i14 = i;
            synchronized (this.f14971d) {
                if (a9.f14983d == 0 && !a9.g()) {
                    return a9;
                }
                if (a9.a(z6)) {
                    return a9;
                }
                a9.e();
                i = i14;
                i6 = i13;
                i9 = i12;
                i10 = i11;
                z3 = z9;
            }
        }
    }

    private e a(int i, int i6, int i9, int i10, boolean z3) {
        Socket socket;
        Socket e9;
        e eVar;
        boolean z6;
        ah ahVar;
        boolean z9;
        List<ah> list;
        e eVar2;
        i.a aVar;
        synchronized (this.f14971d) {
            try {
                if (!this.f14969b.j()) {
                    this.f14976j = false;
                    j jVar = this.f14969b;
                    e eVar3 = jVar.f15020a;
                    socket = null;
                    e9 = (eVar3 == null || !eVar3.f14981b) ? null : jVar.e();
                    j jVar2 = this.f14969b;
                    eVar = jVar2.f15020a;
                    if (eVar == null) {
                        eVar = null;
                    }
                    if (eVar == null) {
                        if (this.f14971d.a(this.f14970c, jVar2, null, false)) {
                            eVar = this.f14969b.f15020a;
                            ahVar = null;
                            z6 = true;
                        } else {
                            ahVar = this.f14977k;
                            if (ahVar != null) {
                                this.f14977k = null;
                            } else if (e()) {
                                ahVar = this.f14969b.f15020a.a();
                            }
                            z6 = false;
                        }
                    }
                    z6 = false;
                    ahVar = null;
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        com.anythink.core.common.n.b.a.c.a(e9);
        if (eVar != null) {
            return eVar;
        }
        if (ahVar != null || ((aVar = this.f14974g) != null && aVar.a())) {
            z9 = false;
        } else {
            this.f14974g = this.f14975h.b();
            z9 = true;
        }
        synchronized (this.f14971d) {
            try {
                if (this.f14969b.j()) {
                    throw new IOException("Canceled");
                }
                if (z9) {
                    list = this.f14974g.c();
                    if (this.f14971d.a(this.f14970c, this.f14969b, list, false)) {
                        eVar = this.f14969b.f15020a;
                        z6 = true;
                    }
                } else {
                    list = null;
                }
                if (!z6) {
                    if (ahVar == null) {
                        ahVar = this.f14974g.b();
                    }
                    eVar = new e(this.f14971d, ahVar);
                    this.i = eVar;
                }
                eVar2 = eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            return eVar2;
        }
        eVar2.a(i, i6, i9, i10, z3);
        this.f14971d.f15000a.b(eVar2.a());
        synchronized (this.f14971d) {
            try {
                this.i = null;
                if (this.f14971d.a(this.f14970c, this.f14969b, list, true)) {
                    eVar2.f14981b = true;
                    socket = eVar2.b();
                    eVar2 = this.f14969b.f15020a;
                    this.f14977k = ahVar;
                } else {
                    this.f14971d.a(eVar2);
                    this.f14969b.a(eVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.anythink.core.common.n.b.a.c.a(socket);
        return eVar2;
    }

    public final e a() {
        if (f14968a || Thread.holdsLock(this.f14971d)) {
            return this.i;
        }
        throw new AssertionError();
    }
}

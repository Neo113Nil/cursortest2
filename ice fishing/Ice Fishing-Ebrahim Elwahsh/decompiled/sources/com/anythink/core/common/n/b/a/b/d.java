package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.C0545a;
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
    static final /* synthetic */ boolean f15126a = true;

    /* renamed from: b, reason: collision with root package name */
    private final j f15127b;

    /* renamed from: c, reason: collision with root package name */
    private final C0545a f15128c;

    /* renamed from: d, reason: collision with root package name */
    private final f f15129d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15130e;

    /* renamed from: f, reason: collision with root package name */
    private final r f15131f;

    /* renamed from: g, reason: collision with root package name */
    private i.a f15132g;

    /* renamed from: h, reason: collision with root package name */
    private final i f15133h;
    private e i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15134j;

    /* renamed from: k, reason: collision with root package name */
    private ah f15135k;

    public d(j jVar, f fVar, C0545a c0545a, com.anythink.core.common.n.b.e eVar, r rVar) {
        this.f15127b = jVar;
        this.f15129d = fVar;
        this.f15128c = c0545a;
        this.f15130e = eVar;
        this.f15131f = rVar;
        this.f15133h = new i(c0545a, fVar.f15158a, eVar, rVar);
    }

    private boolean e() {
        e eVar = this.f15127b.f15178a;
        return eVar != null && eVar.f15140c == 0 && com.anythink.core.common.n.b.a.c.a(eVar.a().a().a(), this.f15128c.a());
    }

    public final com.anythink.core.common.n.b.a.c.c a(z zVar, w.a aVar, boolean z8) {
        try {
            return a(aVar.d(), aVar.e(), aVar.f(), zVar.b(), zVar.p(), z8).a(zVar, aVar);
        } catch (h e6) {
            b();
            throw e6;
        } catch (IOException e9) {
            b();
            throw new h(e9);
        }
    }

    public final void b() {
        if (!f15126a && Thread.holdsLock(this.f15129d)) {
            throw new AssertionError();
        }
        synchronized (this.f15129d) {
            this.f15134j = true;
        }
    }

    public final boolean c() {
        boolean z8;
        synchronized (this.f15129d) {
            z8 = this.f15134j;
        }
        return z8;
    }

    public final boolean d() {
        synchronized (this.f15129d) {
            try {
                boolean z8 = true;
                if (this.f15135k != null) {
                    return true;
                }
                if (e()) {
                    this.f15135k = this.f15127b.f15178a.a();
                    return true;
                }
                i.a aVar = this.f15132g;
                if ((aVar == null || !aVar.a()) && !this.f15133h.a()) {
                    z8 = false;
                }
                return z8;
            } finally {
            }
        }
    }

    private e a(int i, int i4, int i9, int i10, boolean z8, boolean z9) {
        while (true) {
            e a9 = a(i, i4, i9, i10, z8);
            boolean z10 = z8;
            int i11 = i10;
            int i12 = i9;
            int i13 = i4;
            int i14 = i;
            synchronized (this.f15129d) {
                if (a9.f15141d == 0 && !a9.g()) {
                    return a9;
                }
                if (a9.a(z9)) {
                    return a9;
                }
                a9.e();
                i = i14;
                i4 = i13;
                i9 = i12;
                i10 = i11;
                z8 = z10;
            }
        }
    }

    private e a(int i, int i4, int i9, int i10, boolean z8) {
        Socket socket;
        Socket e6;
        e eVar;
        boolean z9;
        ah ahVar;
        boolean z10;
        List<ah> list;
        e eVar2;
        i.a aVar;
        synchronized (this.f15129d) {
            try {
                if (!this.f15127b.j()) {
                    this.f15134j = false;
                    j jVar = this.f15127b;
                    e eVar3 = jVar.f15178a;
                    socket = null;
                    e6 = (eVar3 == null || !eVar3.f15139b) ? null : jVar.e();
                    j jVar2 = this.f15127b;
                    eVar = jVar2.f15178a;
                    if (eVar == null) {
                        eVar = null;
                    }
                    if (eVar == null) {
                        if (this.f15129d.a(this.f15128c, jVar2, null, false)) {
                            eVar = this.f15127b.f15178a;
                            ahVar = null;
                            z9 = true;
                        } else {
                            ahVar = this.f15135k;
                            if (ahVar != null) {
                                this.f15135k = null;
                            } else if (e()) {
                                ahVar = this.f15127b.f15178a.a();
                            }
                            z9 = false;
                        }
                    }
                    z9 = false;
                    ahVar = null;
                } else {
                    throw new IOException("Canceled");
                }
            } finally {
            }
        }
        com.anythink.core.common.n.b.a.c.a(e6);
        if (eVar != null) {
            return eVar;
        }
        if (ahVar != null || ((aVar = this.f15132g) != null && aVar.a())) {
            z10 = false;
        } else {
            this.f15132g = this.f15133h.b();
            z10 = true;
        }
        synchronized (this.f15129d) {
            try {
                if (this.f15127b.j()) {
                    throw new IOException("Canceled");
                }
                if (z10) {
                    list = this.f15132g.c();
                    if (this.f15129d.a(this.f15128c, this.f15127b, list, false)) {
                        eVar = this.f15127b.f15178a;
                        z9 = true;
                    }
                } else {
                    list = null;
                }
                if (!z9) {
                    if (ahVar == null) {
                        ahVar = this.f15132g.b();
                    }
                    eVar = new e(this.f15129d, ahVar);
                    this.i = eVar;
                }
                eVar2 = eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            return eVar2;
        }
        eVar2.a(i, i4, i9, i10, z8);
        this.f15129d.f15158a.b(eVar2.a());
        synchronized (this.f15129d) {
            try {
                this.i = null;
                if (this.f15129d.a(this.f15128c, this.f15127b, list, true)) {
                    eVar2.f15139b = true;
                    socket = eVar2.b();
                    eVar2 = this.f15127b.f15178a;
                    this.f15135k = ahVar;
                } else {
                    this.f15129d.a(eVar2);
                    this.f15127b.a(eVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.anythink.core.common.n.b.a.c.a(socket);
        return eVar2;
    }

    public final e a() {
        if (f15126a || Thread.holdsLock(this.f15129d)) {
            return this.i;
        }
        throw new AssertionError();
    }
}

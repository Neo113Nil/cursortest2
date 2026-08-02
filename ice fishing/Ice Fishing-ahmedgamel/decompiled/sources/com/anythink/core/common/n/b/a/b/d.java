package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.C0565a;
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
    static final /* synthetic */ boolean f15755a = true;

    /* renamed from: b, reason: collision with root package name */
    private final j f15756b;

    /* renamed from: c, reason: collision with root package name */
    private final C0565a f15757c;

    /* renamed from: d, reason: collision with root package name */
    private final f f15758d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15759e;

    /* renamed from: f, reason: collision with root package name */
    private final r f15760f;

    /* renamed from: g, reason: collision with root package name */
    private i.a f15761g;

    /* renamed from: h, reason: collision with root package name */
    private final i f15762h;
    private e i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15763j;

    /* renamed from: k, reason: collision with root package name */
    private ah f15764k;

    public d(j jVar, f fVar, C0565a c0565a, com.anythink.core.common.n.b.e eVar, r rVar) {
        this.f15756b = jVar;
        this.f15758d = fVar;
        this.f15757c = c0565a;
        this.f15759e = eVar;
        this.f15760f = rVar;
        this.f15762h = new i(c0565a, fVar.f15787a, eVar, rVar);
    }

    private boolean e() {
        e eVar = this.f15756b.f15807a;
        return eVar != null && eVar.f15769c == 0 && com.anythink.core.common.n.b.a.c.a(eVar.a().a().a(), this.f15757c.a());
    }

    public final com.anythink.core.common.n.b.a.c.c a(z zVar, w.a aVar, boolean z6) {
        try {
            return a(aVar.d(), aVar.e(), aVar.f(), zVar.b(), zVar.p(), z6).a(zVar, aVar);
        } catch (h e9) {
            b();
            throw e9;
        } catch (IOException e10) {
            b();
            throw new h(e10);
        }
    }

    public final void b() {
        if (!f15755a && Thread.holdsLock(this.f15758d)) {
            throw new AssertionError();
        }
        synchronized (this.f15758d) {
            this.f15763j = true;
        }
    }

    public final boolean c() {
        boolean z6;
        synchronized (this.f15758d) {
            z6 = this.f15763j;
        }
        return z6;
    }

    public final boolean d() {
        synchronized (this.f15758d) {
            try {
                boolean z6 = true;
                if (this.f15764k != null) {
                    return true;
                }
                if (e()) {
                    this.f15764k = this.f15756b.f15807a.a();
                    return true;
                }
                i.a aVar = this.f15761g;
                if ((aVar == null || !aVar.a()) && !this.f15762h.a()) {
                    z6 = false;
                }
                return z6;
            } finally {
            }
        }
    }

    private e a(int i, int i4, int i6, int i9, boolean z6, boolean z9) {
        while (true) {
            e a9 = a(i, i4, i6, i9, z6);
            boolean z10 = z6;
            int i10 = i9;
            int i11 = i6;
            int i12 = i4;
            int i13 = i;
            synchronized (this.f15758d) {
                if (a9.f15770d == 0 && !a9.g()) {
                    return a9;
                }
                if (a9.a(z9)) {
                    return a9;
                }
                a9.e();
                i = i13;
                i4 = i12;
                i6 = i11;
                i9 = i10;
                z6 = z10;
            }
        }
    }

    private e a(int i, int i4, int i6, int i9, boolean z6) {
        Socket socket;
        Socket e9;
        e eVar;
        boolean z9;
        ah ahVar;
        boolean z10;
        List<ah> list;
        e eVar2;
        i.a aVar;
        synchronized (this.f15758d) {
            try {
                if (!this.f15756b.j()) {
                    this.f15763j = false;
                    j jVar = this.f15756b;
                    e eVar3 = jVar.f15807a;
                    socket = null;
                    e9 = (eVar3 == null || !eVar3.f15768b) ? null : jVar.e();
                    j jVar2 = this.f15756b;
                    eVar = jVar2.f15807a;
                    if (eVar == null) {
                        eVar = null;
                    }
                    if (eVar == null) {
                        if (this.f15758d.a(this.f15757c, jVar2, null, false)) {
                            eVar = this.f15756b.f15807a;
                            ahVar = null;
                            z9 = true;
                        } else {
                            ahVar = this.f15764k;
                            if (ahVar != null) {
                                this.f15764k = null;
                            } else if (e()) {
                                ahVar = this.f15756b.f15807a.a();
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
        com.anythink.core.common.n.b.a.c.a(e9);
        if (eVar != null) {
            return eVar;
        }
        if (ahVar != null || ((aVar = this.f15761g) != null && aVar.a())) {
            z10 = false;
        } else {
            this.f15761g = this.f15762h.b();
            z10 = true;
        }
        synchronized (this.f15758d) {
            try {
                if (this.f15756b.j()) {
                    throw new IOException("Canceled");
                }
                if (z10) {
                    list = this.f15761g.c();
                    if (this.f15758d.a(this.f15757c, this.f15756b, list, false)) {
                        eVar = this.f15756b.f15807a;
                        z9 = true;
                    }
                } else {
                    list = null;
                }
                if (!z9) {
                    if (ahVar == null) {
                        ahVar = this.f15761g.b();
                    }
                    eVar = new e(this.f15758d, ahVar);
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
        eVar2.a(i, i4, i6, i9, z6);
        this.f15758d.f15787a.b(eVar2.a());
        synchronized (this.f15758d) {
            try {
                this.i = null;
                if (this.f15758d.a(this.f15757c, this.f15756b, list, true)) {
                    eVar2.f15768b = true;
                    socket = eVar2.b();
                    eVar2 = this.f15756b.f15807a;
                    this.f15764k = ahVar;
                } else {
                    this.f15758d.a(eVar2);
                    this.f15756b.a(eVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.anythink.core.common.n.b.a.c.a(socket);
        return eVar2;
    }

    public final e a() {
        if (f15755a || Thread.holdsLock(this.f15758d)) {
            return this.i;
        }
        throw new AssertionError();
    }
}

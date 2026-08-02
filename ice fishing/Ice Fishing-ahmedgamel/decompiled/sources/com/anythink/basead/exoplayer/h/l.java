package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f8462a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f8463b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.b f8464c;

    /* renamed from: d, reason: collision with root package name */
    private r f8465d;

    /* renamed from: e, reason: collision with root package name */
    private r.a f8466e;

    /* renamed from: f, reason: collision with root package name */
    private long f8467f;

    /* renamed from: g, reason: collision with root package name */
    private a f8468g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8469h;
    private long i = com.anythink.basead.exoplayer.b.f7168b;

    public interface a {
        void a(s.a aVar, IOException iOException);
    }

    public l(s sVar, s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        this.f8463b = aVar;
        this.f8464c = bVar;
        this.f8462a = sVar;
    }

    private void h() {
        this.f8466e.a((r.a) this);
    }

    public final void a(a aVar) {
        this.f8468g = aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        this.f8465d.a_(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f8465d.b();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        return this.f8465d.c();
    }

    public final void d(long j6) {
        if (this.f8467f != 0 || j6 == 0) {
            return;
        }
        this.i = j6;
        this.f8467f = j6;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return this.f8465d.e();
    }

    public final void f() {
        r a9 = this.f8462a.a(this.f8463b, this.f8464c);
        this.f8465d = a9;
        if (this.f8466e != null) {
            a9.a(this, this.f8467f);
        }
    }

    public final void g() {
        r rVar = this.f8465d;
        if (rVar != null) {
            this.f8462a.a(rVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        this.f8466e = aVar;
        this.f8467f = j6;
        r rVar = this.f8465d;
        if (rVar != null) {
            rVar.a(this, j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j6) {
        return this.f8465d.b(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        r rVar = this.f8465d;
        return rVar != null && rVar.c(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.f8465d.d();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        try {
            r rVar = this.f8465d;
            if (rVar != null) {
                rVar.a();
            } else {
                this.f8462a.b();
            }
        } catch (IOException e9) {
            a aVar = this.f8468g;
            if (aVar != null) {
                if (this.f8469h) {
                    return;
                }
                this.f8469h = true;
                aVar.a(this.f8463b, e9);
                return;
            }
            throw e9;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j6) {
        long j9;
        long j10 = this.i;
        if (j10 == com.anythink.basead.exoplayer.b.f7168b || j6 != 0) {
            j9 = j6;
        } else {
            this.i = com.anythink.basead.exoplayer.b.f7168b;
            j9 = j10;
        }
        return this.f8465d.a(fVarArr, zArr, yVarArr, zArr2, j9);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z6) {
        this.f8465d.a(j6, z6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j6, com.anythink.basead.exoplayer.ac acVar) {
        return this.f8465d.a(j6, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f8466e.a((r) this);
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f8466e.a((r.a) this);
    }
}

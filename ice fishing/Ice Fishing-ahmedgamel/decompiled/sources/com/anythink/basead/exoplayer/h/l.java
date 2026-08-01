package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.h.r;
import com.anythink.basead.exoplayer.h.s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final s f7676a;

    /* renamed from: b, reason: collision with root package name */
    public final s.a f7677b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.j.b f7678c;

    /* renamed from: d, reason: collision with root package name */
    private r f7679d;

    /* renamed from: e, reason: collision with root package name */
    private r.a f7680e;

    /* renamed from: f, reason: collision with root package name */
    private long f7681f;

    /* renamed from: g, reason: collision with root package name */
    private a f7682g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7683h;
    private long i = com.anythink.basead.exoplayer.b.f6382b;

    public interface a {
        void a(s.a aVar, IOException iOException);
    }

    public l(s sVar, s.a aVar, com.anythink.basead.exoplayer.j.b bVar) {
        this.f7677b = aVar;
        this.f7678c = bVar;
        this.f7676a = sVar;
    }

    private void h() {
        this.f7680e.a((r.a) this);
    }

    public final void a(a aVar) {
        this.f7682g = aVar;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final void a_(long j6) {
        this.f7679d.a_(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final af b() {
        return this.f7679d.b();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long c() {
        return this.f7679d.c();
    }

    public final void d(long j6) {
        if (this.f7681f != 0 || j6 == 0) {
            return;
        }
        this.i = j6;
        this.f7681f = j6;
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long e() {
        return this.f7679d.e();
    }

    public final void f() {
        r a9 = this.f7676a.a(this.f7677b, this.f7678c);
        this.f7679d = a9;
        if (this.f7680e != null) {
            a9.a(this, this.f7681f);
        }
    }

    public final void g() {
        r rVar = this.f7679d;
        if (rVar != null) {
            this.f7676a.a(rVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(r.a aVar, long j6) {
        this.f7680e = aVar;
        this.f7681f = j6;
        r rVar = this.f7679d;
        if (rVar != null) {
            rVar.a(this, j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long b(long j6) {
        return this.f7679d.b(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final boolean c(long j6) {
        r rVar = this.f7679d;
        return rVar != null && rVar.c(j6);
    }

    @Override // com.anythink.basead.exoplayer.h.r, com.anythink.basead.exoplayer.h.z
    public final long d() {
        return this.f7679d.d();
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a() {
        try {
            r rVar = this.f7679d;
            if (rVar != null) {
                rVar.a();
            } else {
                this.f7676a.b();
            }
        } catch (IOException e9) {
            a aVar = this.f7682g;
            if (aVar != null) {
                if (this.f7683h) {
                    return;
                }
                this.f7683h = true;
                aVar.a(this.f7677b, e9);
                return;
            }
            throw e9;
        }
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(com.anythink.basead.exoplayer.i.f[] fVarArr, boolean[] zArr, y[] yVarArr, boolean[] zArr2, long j6) {
        long j9;
        long j10 = this.i;
        if (j10 == com.anythink.basead.exoplayer.b.f6382b || j6 != 0) {
            j9 = j6;
        } else {
            this.i = com.anythink.basead.exoplayer.b.f6382b;
            j9 = j10;
        }
        return this.f7679d.a(fVarArr, zArr, yVarArr, zArr2, j9);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final void a(long j6, boolean z3) {
        this.f7679d.a(j6, z3);
    }

    @Override // com.anythink.basead.exoplayer.h.r
    public final long a(long j6, com.anythink.basead.exoplayer.ac acVar) {
        return this.f7679d.a(j6, acVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.basead.exoplayer.h.r.a
    public final void a(r rVar) {
        this.f7680e.a((r) this);
    }

    @Override // com.anythink.basead.exoplayer.h.z.a
    public final /* bridge */ /* synthetic */ void a(r rVar) {
        this.f7680e.a((r.a) this);
    }
}

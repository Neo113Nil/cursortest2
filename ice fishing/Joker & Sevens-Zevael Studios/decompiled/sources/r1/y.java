package r1;

import bc.a0;
import x.p0;
import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y implements s2.c, fc.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f6001g;

    /* renamed from: h, reason: collision with root package name */
    public final yc.g f6002h;

    /* renamed from: i, reason: collision with root package name */
    public yc.g f6003i;

    /* renamed from: j, reason: collision with root package name */
    public h f6004j = h.f5957h;

    /* renamed from: k, reason: collision with root package name */
    public final fc.j f6005k = fc.j.f2348g;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f6006l;

    public y(z zVar, yc.g gVar) {
        this.f6006l = zVar;
        this.f6001g = zVar;
        this.f6002h = gVar;
    }

    @Override // s2.c
    public final float B(long j3) {
        return this.f6001g.B(j3);
    }

    @Override // s2.c
    public final int D(float f10) {
        return this.f6001g.D(f10);
    }

    @Override // s2.c
    public final long L(long j3) {
        return this.f6001g.L(j3);
    }

    @Override // s2.c
    public final float N(long j3) {
        return this.f6001g.N(j3);
    }

    @Override // s2.c
    public final long U(float f10) {
        return this.f6001g.U(f10);
    }

    public final Object a(h hVar, hc.a aVar) {
        yc.g gVar = new yc.g(1, a0.w(aVar));
        gVar.q();
        this.f6004j = hVar;
        this.f6003i = gVar;
        return gVar.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [yc.b1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [yc.b1] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [oc.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j3, oc.e eVar, hc.a aVar) {
        x xVar;
        int i10;
        yc.g gVar;
        try {
            if (aVar instanceof x) {
                xVar = (x) aVar;
                int i11 = xVar.f6000j;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    xVar.f6000j = i11 - Integer.MIN_VALUE;
                    Object obj = xVar.f5998h;
                    i10 = xVar.f6000j;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        if (j3 <= 0 && (gVar = this.f6003i) != null) {
                            gVar.resumeWith(v6.a.s(new i(j3)));
                        }
                        r1 q10 = yc.a0.q(this.f6006l.f0(), null, new p0(j3, this, null), 3);
                        xVar.f5997g = q10;
                        xVar.f6000j = 1;
                        obj = eVar.invoke(this, xVar);
                        gc.a aVar2 = gc.a.f2559g;
                        j3 = q10;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r1 r1Var = xVar.f5997g;
                        v6.a.W(obj);
                        j3 = r1Var;
                    }
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            return obj;
        } finally {
            j3.a(a.f5926h);
        }
        xVar = new x(this, aVar);
        Object obj2 = xVar.f5998h;
        i10 = xVar.f6000j;
    }

    @Override // s2.c
    public final float c() {
        return this.f6001g.c();
    }

    @Override // s2.c
    public final float d0(float f10) {
        return f10 / this.f6001g.c();
    }

    @Override // fc.d
    public final fc.i getContext() {
        return this.f6005k;
    }

    @Override // s2.c
    public final float m() {
        return this.f6001g.m();
    }

    @Override // fc.d
    public final void resumeWith(Object obj) {
        z zVar = this.f6006l;
        synchronized (zVar.B) {
            zVar.A.j(this);
        }
        this.f6002h.resumeWith(obj);
    }

    @Override // s2.c
    public final long v(float f10) {
        return this.f6001g.v(f10);
    }

    @Override // s2.c
    public final float x(float f10) {
        return this.f6001g.c() * f10;
    }
}

package q1;

import b0.p0;
import b0.t0;
import pc.s;
import s2.p;
import x.z0;
import x1.f;
import x1.z1;
import x4.i;
import y0.m;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends m implements z1 {

    /* renamed from: u, reason: collision with root package name */
    public final b4.m f5740u;

    /* renamed from: v, reason: collision with root package name */
    public final i f5741v;

    /* renamed from: w, reason: collision with root package name */
    public e f5742w;

    /* renamed from: x, reason: collision with root package name */
    public final String f5743x = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public e(b4.m mVar, i iVar) {
        this.f5740u = mVar;
        this.f5741v = iVar;
    }

    @Override // y0.m
    public final void j0() {
        i iVar = this.f5741v;
        iVar.f8303a = this;
        iVar.f8304b = null;
        this.f5742w = null;
        iVar.f8305c = new p0(13, this);
        iVar.f8306d = f0();
    }

    @Override // y0.m
    public final void k0() {
        s sVar = new s();
        f.x(this, new t0(sVar, 1));
        e eVar = (e) ((z1) sVar.f5683g);
        this.f5742w = eVar;
        i iVar = this.f5741v;
        iVar.f8304b = eVar;
        if (((e) iVar.f8303a) == this) {
            iVar.f8303a = null;
        }
    }

    @Override // x1.z1
    public final Object r() {
        return this.f5743x;
    }

    public final y r0() {
        e eVar = this.f8456t ? (e) f.k(this) : null;
        y r02 = eVar != null ? eVar.r0() : null;
        if (r02 != null && a0.p(r02)) {
            return r02;
        }
        y yVar = (y) this.f5741v.f8306d;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s0(long j3, long j6, hc.c cVar) {
        c cVar2;
        int i10;
        long j10;
        long j11;
        long j12;
        boolean z10;
        e eVar;
        long j13;
        long j14;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f5735k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f5735k = i11 - Integer.MIN_VALUE;
                c cVar3 = cVar2;
                Object obj = cVar3.f5733i;
                i10 = cVar3.f5735k;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    cVar3.f5731g = j3;
                    cVar3.f5732h = j6;
                    cVar3.f5735k = 1;
                    obj = this.f5740u.a(j3, j6, cVar3);
                    if (obj != aVar) {
                        j10 = j3;
                        j11 = j6;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j14 = cVar3.f5731g;
                    v6.a.W(obj);
                    j13 = ((p) obj).f6404a;
                    j12 = j14;
                    return new p(p.e(j12, j13));
                }
                j11 = cVar3.f5732h;
                j10 = cVar3.f5731g;
                v6.a.W(obj);
                j12 = ((p) obj).f6404a;
                z10 = this.f8456t;
                if (z10) {
                    eVar = this.f5742w;
                } else {
                    eVar = null;
                    if (z10 && z10) {
                        eVar = (e) f.k(this);
                    }
                }
                if (eVar != null) {
                    j13 = 0;
                    return new p(p.e(j12, j13));
                }
                long e10 = p.e(j10, j12);
                long d10 = p.d(j11, j12);
                cVar3.f5731g = j12;
                cVar3.f5735k = 2;
                obj = eVar.s0(e10, d10, cVar3);
                if (obj != aVar) {
                    j14 = j12;
                    j13 = ((p) obj).f6404a;
                    j12 = j14;
                    return new p(p.e(j12, j13));
                }
                return aVar;
            }
        }
        cVar2 = new c(this, cVar);
        c cVar32 = cVar2;
        Object obj2 = cVar32.f5733i;
        i10 = cVar32.f5735k;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        j12 = ((p) obj2).f6404a;
        z10 = this.f8456t;
        if (z10) {
        }
        if (eVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long t0(long j3, long j6, int i10) {
        long j10;
        boolean z10;
        e eVar;
        b4.m mVar = this.f5740u;
        if (mVar.f1000c) {
            z0 z0Var = (z0) mVar.f999b;
            if (!z0Var.f7951a.b()) {
                j10 = z0Var.g(z0Var.c(z0Var.f7951a.d(z0Var.c(z0Var.f(j6)))));
                z10 = this.f8456t;
                eVar = null;
                if (z10 && z10) {
                    eVar = (e) f.k(this);
                }
                e eVar2 = eVar;
                return e1.b.g(j10, eVar2 != null ? eVar2.t0(e1.b.g(j3, j10), e1.b.f(j6, j10), i10) : 0L);
            }
        }
        j10 = 0;
        z10 = this.f8456t;
        eVar = null;
        if (z10) {
            eVar = (e) f.k(this);
        }
        e eVar22 = eVar;
        return e1.b.g(j10, eVar22 != null ? eVar22.t0(e1.b.g(j3, j10), e1.b.f(j6, j10), i10) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r14 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r14 == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u0(long j3, fc.d dVar) {
        d dVar2;
        int i10;
        long j6;
        long j10;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.f5739j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f5739j = i11 - Integer.MIN_VALUE;
                Object obj = dVar2.f5737h;
                i10 = dVar2.f5739j;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    boolean z10 = this.f8456t;
                    e eVar = null;
                    if (z10 && z10) {
                        eVar = (e) f.k(this);
                    }
                    if (eVar != null) {
                        dVar2.f5736g = j3;
                        dVar2.f5739j = 1;
                        obj = eVar.u0(j3, dVar2);
                    } else {
                        j6 = j3;
                        j10 = 0;
                        p.d(j6, j10);
                        dVar2.f5736g = j10;
                        dVar2.f5739j = 2;
                        obj = new p(0L);
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j10 = dVar2.f5736g;
                        v6.a.W(obj);
                        return new p(p.e(j10, ((p) obj).f6404a));
                    }
                    j3 = dVar2.f5736g;
                    v6.a.W(obj);
                }
                j6 = j3;
                j10 = ((p) obj).f6404a;
                p.d(j6, j10);
                dVar2.f5736g = j10;
                dVar2.f5739j = 2;
                obj = new p(0L);
            }
        }
        dVar2 = new d(this, (hc.c) dVar);
        Object obj2 = dVar2.f5737h;
        i10 = dVar2.f5739j;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        j6 = j3;
        j10 = ((p) obj2).f6404a;
        p.d(j6, j10);
        dVar2.f5736g = j10;
        dVar2.f5739j = 2;
        obj2 = new p(0L);
    }

    public final long v0(int i10, long j3) {
        boolean z10 = this.f8456t;
        e eVar = null;
        if (z10 && z10) {
            eVar = (e) f.k(this);
        }
        long v02 = eVar != null ? eVar.v0(i10, j3) : 0L;
        e1.b.f(j3, v02);
        return e1.b.g(v02, 0L);
    }
}

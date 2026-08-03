package c0;

import ac.o;
import ad.q;
import androidx.work.CoroutineWorker;
import b0.l0;
import bc.a0;
import bd.e0;
import bd.t;
import bd.u;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d8.m;
import hc.j;
import java.util.concurrent.CancellationException;
import m0.a1;
import m0.c2;
import m0.d1;
import m0.l1;
import m0.t1;
import m0.u2;
import pc.k;
import r1.n;
import r1.r;
import s.g0;
import v.e1;
import w.p;
import w.p0;
import w.r0;
import w.s0;
import x.h0;
import x.i1;
import x.l;
import x.x0;
import x.z;
import x.z0;
import x1.f1;
import y.i;
import yc.i0;
import yc.k0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1177g;

    /* renamed from: h, reason: collision with root package name */
    public int f1178h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1179i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1180j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1181k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(f fVar, f1 f1Var, oc.a aVar, fc.d dVar) {
        super(2, dVar);
        this.f1177g = 0;
        this.f1179i = fVar;
        this.f1180j = f1Var;
        this.f1181k = (k) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r1v18, types: [hc.j, oc.e] */
    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f1177g) {
            case 0:
                return new c((f) this.f1179i, (f1) this.f1180j, (oc.a) this.f1181k, dVar);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                c cVar = new c((bd.f) this.f1180j, (cd.f) this.f1181k, dVar, 1);
                cVar.f1179i = obj;
                return cVar;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new c((i0.j) this.f1179i, (i0.c) this.f1180j, (y.k) this.f1181k, dVar, 2);
            case 3:
                c cVar2 = new c((i) this.f1180j, (i0.a) this.f1181k, dVar, 3);
                cVar2.f1179i = obj;
                return cVar2;
            case 4:
                c cVar3 = new c((c2) this.f1180j, (a1) this.f1181k, dVar, 4);
                cVar3.f1179i = obj;
                return cVar3;
            case 5:
                c cVar4 = new c((fc.i) this.f1180j, (bd.e) this.f1181k, dVar, 5);
                cVar4.f1179i = obj;
                return cVar4;
            case 6:
                return new c((o4.i) this.f1180j, (CoroutineWorker) this.f1181k, dVar, 6);
            case 7:
                c cVar5 = new c((e1) this.f1180j, (d1) this.f1181k, dVar, 7);
                cVar5.f1179i = obj;
                return cVar5;
            case 8:
                return new c((i) this.f1179i, (y.h) this.f1180j, (k0) this.f1181k, dVar, 8);
            case 9:
                c cVar6 = new c((m) this.f1180j, (oc.e) this.f1181k, dVar, 9);
                cVar6.f1179i = obj;
                return cVar6;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return new c((m) this.f1179i, (p0) this.f1180j, (oc.e) this.f1181k, dVar, 10);
            case 11:
                c cVar7 = new c((z) this.f1180j, (z0) this.f1181k, dVar, 11);
                cVar7.f1179i = obj;
                return cVar7;
            case 12:
                c cVar8 = new c((z0) this.f1180j, (oc.e) this.f1181k, dVar);
                cVar8.f1179i = obj;
                return cVar8;
            case 13:
                return new c((p) this.f1179i, (h0) this.f1180j, (n) this.f1181k, dVar, 13);
            case 14:
                c cVar9 = new c((r) this.f1180j, (oc.f) this.f1181k, dVar, 14);
                cVar9.f1179i = obj;
                return cVar9;
            case 15:
                return new c((ad.e) this.f1181k, dVar, 15);
            default:
                return new c((yd.a) this.f1181k, dVar, 16);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1177g) {
        }
        return ((c) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x054a, code lost:
    
        if (r13 == r2) goto L279;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x0076, TryCatch #2 {all -> 0x0076, blocks: (B:25:0x0072, B:26:0x009c, B:28:0x00a4, B:29:0x00b2, B:36:0x00c0, B:38:0x008f, B:42:0x00c3, B:45:0x00c8, B:46:0x00c9, B:53:0x0089, B:31:0x00b3, B:33:0x00b9), top: B:21:0x0066, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Type inference failed for: r13v64, types: [hc.j, oc.e] */
    /* JADX WARN: Type inference failed for: r4v26, types: [ad.t] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ad.q, yc.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [oc.a, pc.k] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0099 -> B:25:0x009c). Please report as a decompilation issue!!! */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        o4.i iVar;
        ad.e eVar;
        ad.b bVar;
        e0 e0Var;
        yd.a aVar;
        switch (this.f1177g) {
            case 0:
                o oVar = o.f277a;
                f fVar = (f) this.f1179i;
                gc.a aVar2 = gc.a.f2559g;
                int i10 = this.f1178h;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                x.i iVar2 = fVar.f1192u;
                b bVar2 = new b(fVar, (f1) this.f1180j, (k) this.f1181k);
                this.f1178h = 1;
                iVar2.getClass();
                e1.c cVar = (e1.c) bVar2.invoke();
                if (cVar != null && !iVar2.t0(cVar, iVar2.B)) {
                    yc.g gVar = new yc.g(1, a0.w(this));
                    gVar.q();
                    x.h hVar = new x.h(bVar2, gVar);
                    b0.j jVar = iVar2.f7810x;
                    o0.e eVar2 = jVar.f839a;
                    e1.c cVar2 = (e1.c) bVar2.invoke();
                    if (cVar2 == null) {
                        gVar.resumeWith(oVar);
                    } else {
                        gVar.s(new l0(16, jVar, hVar));
                        int i11 = new uc.d(0, eVar2.f5136i - 1, 1).f6736h;
                        if (i11 >= 0) {
                            while (true) {
                                e1.c cVar3 = (e1.c) ((x.h) eVar2.f5134g[i11]).f7796a.invoke();
                                if (cVar3 != null) {
                                    e1.c c3 = cVar2.c(cVar3);
                                    if (c3.equals(cVar2)) {
                                        eVar2.a(i11 + 1, hVar);
                                    } else if (!c3.equals(cVar3)) {
                                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                        int i12 = eVar2.f5136i - 1;
                                        if (i12 <= i11) {
                                            while (true) {
                                                ((x.h) eVar2.f5134g[i11]).f7797b.n(cancellationException);
                                                if (i12 != i11) {
                                                    i12++;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (i11 != 0) {
                                    i11--;
                                }
                            }
                        }
                        eVar2.a(0, hVar);
                        if (!iVar2.C) {
                            iVar2.u0();
                        }
                    }
                    obj2 = gVar.p();
                    break;
                }
                obj2 = oVar;
                return obj2 == aVar2 ? aVar2 : oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                o oVar2 = o.f277a;
                gc.a aVar3 = gc.a.f2559g;
                int i13 = this.f1178h;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar2;
                }
                v6.a.W(obj);
                y yVar = (y) this.f1179i;
                bd.f fVar2 = (bd.f) this.f1180j;
                cd.f fVar3 = (cd.f) this.f1181k;
                fc.i iVar3 = fVar3.f1348g;
                int i14 = fVar3.f1349h;
                if (i14 == -3) {
                    i14 = -2;
                }
                ad.a aVar4 = fVar3.f1350i;
                yc.z zVar = yc.z.f8923i;
                cd.e eVar3 = new cd.e(fVar3, null, 0);
                ad.e a6 = a.a.a(i14, 4, aVar4);
                fc.i h10 = yc.a0.h(yVar.f(), iVar3, true);
                fd.e eVar4 = i0.f8859a;
                if (h10 != eVar4 && h10.v(fc.e.f2347g) == null) {
                    h10 = h10.d(eVar4);
                }
                ?? qVar = new q(h10, a6);
                qVar.f0(zVar, qVar, eVar3);
                this.f1178h = 1;
                Object d10 = u.d(fVar2, qVar, true, this);
                if (d10 != aVar3) {
                    d10 = oVar2;
                }
                return d10 == aVar3 ? aVar3 : oVar2;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                y.k kVar = (y.k) this.f1181k;
                i0.c cVar4 = (i0.c) this.f1180j;
                g0 g0Var = cVar4.E;
                gc.a aVar5 = gc.a.f2559g;
                int i15 = this.f1178h;
                try {
                    if (i15 == 0) {
                        v6.a.W(obj);
                        i0.j jVar2 = (i0.j) this.f1179i;
                        this.f1178h = 1;
                        if (jVar2.a(this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                    }
                    g0Var.k(kVar);
                    x1.f.m(cVar4);
                    return o.f277a;
                } catch (Throwable th) {
                    g0Var.k(kVar);
                    x1.f.m(cVar4);
                    throw th;
                }
            case 3:
                gc.a aVar6 = gc.a.f2559g;
                int i16 = this.f1178h;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return o.f277a;
                }
                v6.a.W(obj);
                y yVar2 = (y) this.f1179i;
                t tVar = ((i) this.f1180j).f8412a;
                bd.c cVar5 = new bd.c((i0.a) this.f1181k, yVar2, 2);
                this.f1178h = 1;
                tVar.getClass();
                t.j(tVar, cVar5, this);
                return aVar6;
            case 4:
                gc.a aVar7 = gc.a.f2559g;
                int i17 = this.f1178h;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return o.f277a;
                }
                v6.a.W(obj);
                y yVar3 = (y) this.f1179i;
                c2 c2Var = (c2) this.f1180j;
                a1 a1Var = (a1) this.f1181k;
                this.f1178h = 1;
                c2Var.b(yVar3, a1Var, this);
                return aVar7;
            case 5:
                bd.e eVar5 = (bd.e) this.f1181k;
                fc.i iVar4 = (fc.i) this.f1180j;
                gc.a aVar8 = gc.a.f2559g;
                int i18 = this.f1178h;
                if (i18 == 0) {
                    v6.a.W(obj);
                    t1 t1Var = (t1) this.f1179i;
                    if (pc.j.a(iVar4, fc.j.f2348g)) {
                        u2 u2Var = new u2(t1Var, 0);
                        this.f1178h = 1;
                        if (eVar5.c(u2Var, this) == aVar8) {
                            return aVar8;
                        }
                    } else {
                        d dVar = new d(eVar5, t1Var, null, 6);
                        this.f1178h = 2;
                        if (yc.a0.A(iVar4, dVar, this) == aVar8) {
                            return aVar8;
                        }
                    }
                } else {
                    if (i18 != 1 && i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return o.f277a;
            case 6:
                gc.a aVar9 = gc.a.f2559g;
                int i19 = this.f1178h;
                if (i19 == 0) {
                    v6.a.W(obj);
                    o4.i iVar5 = (o4.i) this.f1180j;
                    CoroutineWorker coroutineWorker = (CoroutineWorker) this.f1181k;
                    this.f1179i = iVar5;
                    this.f1178h = 1;
                    Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                    if (foregroundInfo == aVar9) {
                        return aVar9;
                    }
                    iVar = iVar5;
                    obj = foregroundInfo;
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = (o4.i) this.f1179i;
                    v6.a.W(obj);
                }
                iVar.f5213g.i(obj);
                return o.f277a;
            case 7:
                e1 e1Var = (e1) this.f1180j;
                gc.a aVar10 = gc.a.f2559g;
                int i20 = this.f1178h;
                if (i20 == 0) {
                    v6.a.W(obj);
                    t1 t1Var2 = (t1) this.f1179i;
                    f8.c cVar6 = new f8.c(new ld.d(new u.q(e1Var, 0), (fc.d) null));
                    bd.i iVar6 = new bd.i(t1Var2, e1Var, (d1) this.f1181k, 2);
                    this.f1178h = 1;
                    if (cVar6.c(iVar6, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return o.f277a;
            case 8:
                gc.a aVar11 = gc.a.f2559g;
                int i21 = this.f1178h;
                if (i21 == 0) {
                    v6.a.W(obj);
                    i iVar7 = (i) this.f1179i;
                    y.h hVar2 = (y.h) this.f1180j;
                    this.f1178h = 1;
                    if (iVar7.a(hVar2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                k0 k0Var = (k0) this.f1181k;
                if (k0Var != null) {
                    k0Var.a();
                }
                return o.f277a;
            case 9:
                l1 l1Var = (l1) ((m) this.f1180j).f1800d;
                gc.a aVar12 = gc.a.f2559g;
                int i22 = this.f1178h;
                try {
                    if (i22 == 0) {
                        v6.a.W(obj);
                        x.i0 i0Var = (x.i0) this.f1179i;
                        l1Var.setValue(Boolean.TRUE);
                        oc.e eVar6 = (oc.e) this.f1181k;
                        this.f1178h = 1;
                        if (eVar6.invoke(i0Var, this) == aVar12) {
                            return aVar12;
                        }
                    } else {
                        if (i22 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                    }
                    l1Var.setValue(Boolean.FALSE);
                    return o.f277a;
                } catch (Throwable th2) {
                    l1Var.setValue(Boolean.FALSE);
                    throw th2;
                }
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                gc.a aVar13 = gc.a.f2559g;
                int i23 = this.f1178h;
                if (i23 == 0) {
                    v6.a.W(obj);
                    m mVar = (m) this.f1179i;
                    s0 s0Var = (s0) mVar.f1799c;
                    l lVar = (l) mVar.f1798b;
                    p0 p0Var = (p0) this.f1180j;
                    c cVar7 = new c(mVar, (oc.e) this.f1181k, (fc.d) null, 9);
                    this.f1178h = 1;
                    s0Var.getClass();
                    if (yc.a0.e(new r0(p0Var, s0Var, cVar7, lVar, null), this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return o.f277a;
            case 11:
                gc.a aVar14 = gc.a.f2559g;
                int i24 = this.f1178h;
                if (i24 == 0) {
                    v6.a.W(obj);
                    x0 x0Var = (x0) this.f1179i;
                    z zVar2 = (z) this.f1180j;
                    l0 l0Var = new l0(18, x0Var, (z0) this.f1181k);
                    this.f1178h = 1;
                    if (zVar2.invoke(l0Var, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return o.f277a;
            case 12:
                gc.a aVar15 = gc.a.f2559g;
                int i25 = this.f1178h;
                if (i25 == 0) {
                    v6.a.W(obj);
                    x.i0 i0Var2 = (x.i0) this.f1179i;
                    z0 z0Var = (z0) this.f1180j;
                    z0Var.f7958h = i0Var2;
                    ?? r13 = (j) this.f1181k;
                    x0 x0Var2 = z0Var.f7959i;
                    this.f1178h = 1;
                    if (r13.invoke(x0Var2, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return o.f277a;
            case 13:
                o oVar3 = o.f277a;
                gc.a aVar16 = gc.a.f2559g;
                int i26 = this.f1178h;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar3;
                }
                v6.a.W(obj);
                p pVar = (p) this.f1179i;
                h0 h0Var = (h0) this.f1180j;
                long j3 = ((n) this.f1181k).f5965c;
                this.f1178h = 1;
                p pVar2 = new p(pVar.f7479j, this);
                pVar2.f7477h = h0Var;
                pVar2.f7478i = j3;
                return pVar2.invokeSuspend(oVar3) == aVar16 ? aVar16 : oVar3;
            case 14:
                r rVar = (r) this.f1180j;
                gc.a aVar17 = gc.a.f2559g;
                int i27 = this.f1178h;
                if (i27 == 0) {
                    v6.a.W(obj);
                    i1 i1Var = new i1((y) this.f1179i, (oc.f) this.f1181k, new h0(rVar), null);
                    this.f1178h = 1;
                    if (u.l0.c(rVar, i1Var, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return o.f277a;
            case 15:
                gc.a aVar18 = gc.a.f2559g;
                int i28 = this.f1178h;
                try {
                    if (i28 == 0) {
                        v6.a.W(obj);
                        eVar = (ad.e) this.f1181k;
                        bVar = new ad.b(eVar);
                        this.f1179i = eVar;
                        this.f1180j = bVar;
                        this.f1178h = 1;
                        obj = bVar.b(this);
                        eVar = eVar;
                        if (obj == aVar18) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i28 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ad.b) this.f1180j;
                        ?? r42 = (ad.t) this.f1179i;
                        v6.a.W(obj);
                        eVar = r42;
                        if (((Boolean) obj).booleanValue()) {
                            boolean z10 = false;
                            y1.e1.f8507b.set(false);
                            synchronized (w0.m.f7580c) {
                                s.h0 h0Var2 = w0.m.f7587j.f7547h;
                                if (h0Var2 != null && h0Var2.h()) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                w0.m.a();
                            }
                            this.f1179i = eVar;
                            this.f1180j = bVar;
                            this.f1178h = 1;
                            obj = bVar.b(this);
                            eVar = eVar;
                            if (obj == aVar18) {
                                return aVar18;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                eVar.a(null);
                                return o.f277a;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CancellationException cancellationException2 = th3 instanceof CancellationException ? th3 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th3);
                        }
                        eVar.a(cancellationException2);
                        throw th4;
                    }
                }
                break;
            default:
                gc.a aVar19 = gc.a.f2559g;
                int i29 = this.f1178h;
                if (i29 == 0) {
                    v6.a.W(obj);
                    yd.a aVar20 = (yd.a) this.f1181k;
                    e0Var = aVar20.f8928c;
                    a5.c cVar8 = aVar20.f8927b;
                    this.f1179i = e0Var;
                    this.f1180j = aVar20;
                    this.f1178h = 1;
                    cVar8.getClass();
                    Object A = yc.a0.A(i0.f8861c, new ld.d(cVar8, (fc.d) null), this);
                    if (A == aVar19) {
                        return aVar19;
                    }
                    aVar = aVar20;
                    obj = A;
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (yd.a) this.f1180j;
                    e0Var = (e0) this.f1179i;
                    v6.a.W(obj);
                }
                String str = (String) obj;
                aVar.getClass();
                Object bVar3 = str == null ? xd.a.f8405a : new xd.b(str);
                e0Var.getClass();
                e0Var.h(null, bVar3);
                return o.f277a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, fc.d dVar, int i10) {
        super(2, dVar);
        this.f1177g = i10;
        this.f1181k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, fc.d dVar, int i10) {
        super(2, dVar);
        this.f1177g = i10;
        this.f1180j = obj;
        this.f1181k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, fc.d dVar, int i10) {
        super(2, dVar);
        this.f1177g = i10;
        this.f1179i = obj;
        this.f1180j = obj2;
        this.f1181k = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(z0 z0Var, oc.e eVar, fc.d dVar) {
        super(2, dVar);
        this.f1177g = 12;
        this.f1180j = z0Var;
        this.f1181k = (j) eVar;
    }
}

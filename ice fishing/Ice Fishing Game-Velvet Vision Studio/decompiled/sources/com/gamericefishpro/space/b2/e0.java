package com.gamericefishpro.space.b2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.work.CoroutineWorker;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.q0.v0;
import com.gamericefishpro.space.s5.k0;
import com.gamericefishpro.space.w.s0;
import com.gamericefishpro.space.y.g0;
import com.gamericefishpro.space.z.k1;
import com.gamericefishpro.space.z.x0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(k1 k1Var, int i, com.gamericefishpro.space.th.a aVar, int i2) {
        super(2, aVar);
        this.d = i2;
        this.i = k1Var;
        this.e = i;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new e0((f0) this.i, aVar, 0);
            case 1:
                return new e0((com.gamericefishpro.space.db.e) this.i, aVar, 1);
            case 2:
                return new e0((com.gamericefishpro.space.e7.g) this.i, aVar, 2);
            case 3:
                return new e0((com.gamericefishpro.space.f0.w) this.i, this.e, aVar, 3);
            case 4:
                return new e0((com.gamericefishpro.space.g0.v) this.i, this.e, aVar, 4);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return new e0((com.gamericefishpro.space.u6.s) this.i, aVar, 5);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new e0((CoroutineWorker) this.i, aVar, 6);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                e0 e0Var = new e0((com.gamericefishpro.space.l7.e) this.i, aVar, 7);
                e0Var.e = ((Number) obj).intValue();
                return e0Var;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new e0((v0) this.i, aVar, 8);
            case 9:
                return new e0((com.gamericefishpro.space.s5.g) this.i, aVar, 9);
            case 10:
                return new e0((k0) this.i, aVar, 10);
            case RequestError.STOP_TRACKING /* 11 */:
                return new e0((com.gamericefishpro.space.s7.i) this.i, aVar, 11);
            case 12:
                return new e0((com.gamericefishpro.space.si.m) this.i, aVar, 12);
            case 13:
                return new e0((com.gamericefishpro.space.pi.n) this.i, aVar, 13);
            case 14:
                return new e0((s0) this.i, aVar, 14);
            case 15:
                return new e0((com.gamericefishpro.space.y.c0) this.i, aVar, 15);
            case 16:
                return new e0((g0) this.i, aVar, 16);
            default:
                return new e0((com.gamericefishpro.space.p5.a) this.i, aVar, 17);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((e0) create((x0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((e0) create((x0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((e0) create(Integer.valueOf(((Number) obj).intValue()), (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case RequestError.STOP_TRACKING /* 11 */:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((e0) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map mapA;
        int i = 2;
        com.gamericefishpro.space.th.a aVar = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f0 f0Var = (f0) this.i;
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    PointerInputEventHandler pointerInputEventHandler = f0Var.J;
                    this.e = 2;
                    if (pointerInputEventHandler.invoke(f0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.si.e eVarJ = ((com.gamericefishpro.space.db.e) this.i).c.j();
                    this.e = 1;
                    obj = com.gamericefishpro.space.si.e0.j(eVarJ, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                com.gamericefishpro.space.p4.b bVar = (com.gamericefishpro.space.p4.b) obj;
                return (bVar == null || (mapA = bVar.a()) == null) ? m0.c() : mapA;
            case 2:
                com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
                int i4 = this.e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.e7.g gVar = (com.gamericefishpro.space.e7.g) this.i;
                this.e = 1;
                com.gamericefishpro.space.pi.h hVar = new com.gamericefishpro.space.pi.h(1, com.gamericefishpro.space.uh.f.b(this));
                hVar.s();
                gVar.b = hVar;
                String str = (String) gVar.a.getAndSet(null);
                if (str != null && hVar.w()) {
                    gVar.b = null;
                    com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                    hVar.resumeWith(str);
                }
                hVar.u(new z(i, gVar));
                Object objR = hVar.r();
                if (objR == aVar4) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                return objR == aVar4 ? aVar4 : objR;
            case 3:
                com.gamericefishpro.space.uh.a aVar5 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.f0.w wVar = (com.gamericefishpro.space.f0.w) this.i;
                int i5 = this.e;
                com.gamericefishpro.space.f0.s sVar = wVar.e;
                if (sVar.b.g() != i5 || sVar.c.g() != 0) {
                    com.gamericefishpro.space.h0.w wVar2 = wVar.n;
                    wVar2.d();
                    wVar2.b = null;
                }
                sVar.a(i5, 0);
                sVar.e = null;
                com.gamericefishpro.space.h2.f0 f0Var2 = wVar.k;
                if (f0Var2 != null) {
                    f0Var2.k();
                }
                return Unit.a;
            case 4:
                com.gamericefishpro.space.uh.a aVar6 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.g0.v vVar = (com.gamericefishpro.space.g0.v) this.i;
                int i6 = this.e;
                com.gamericefishpro.space.f0.s sVar2 = vVar.d;
                if (sVar2.b.g() != i6 || sVar2.c.g() != 0) {
                    com.gamericefishpro.space.h0.w wVar3 = vVar.m;
                    wVar3.d();
                    wVar3.b = null;
                }
                sVar2.a(i6, 0);
                sVar2.e = null;
                com.gamericefishpro.space.h2.f0 f0Var3 = vVar.j;
                if (f0Var3 != null) {
                    f0Var3.k();
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.uh.a aVar7 = com.gamericefishpro.space.uh.a.d;
                int i7 = this.e;
                if (i7 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.w.j jVar = (com.gamericefishpro.space.w.j) ((com.gamericefishpro.space.u6.s) this.i).i;
                    Float f = new Float(0.0f);
                    com.gamericefishpro.space.w.v0 v0VarN = com.gamericefishpro.space.w.c.n(0.0f, 400.0f, new Float(0.5f), 1);
                    this.e = 1;
                    if (com.gamericefishpro.space.w.c.f(jVar, f, v0VarN, new com.gamericefishpro.space.r2.z(9), this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.i;
                com.gamericefishpro.space.uh.a aVar8 = com.gamericefishpro.space.uh.a.d;
                int i8 = this.e;
                try {
                    if (i8 == 0) {
                        com.gamericefishpro.space.wa.b.P(obj);
                        this.e = 1;
                        obj = coroutineWorker.doWork(this);
                        if (obj == aVar8) {
                            return aVar8;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    coroutineWorker.getFuture$work_runtime_ktx_release().i((com.gamericefishpro.space.l6.o) obj);
                    break;
                } catch (Throwable th) {
                    coroutineWorker.getFuture$work_runtime_ktx_release().j(th);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.uh.a aVar9 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                ((com.gamericefishpro.space.l7.e) this.i).e(new com.gamericefishpro.space.f0.t(this.e, i));
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.uh.a aVar10 = com.gamericefishpro.space.uh.a.d;
                int i9 = this.e;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.ei.y yVar = new com.gamericefishpro.space.ei.y();
                v0 v0Var = (v0) this.i;
                com.gamericefishpro.space.si.d0 d0Var = v0Var.H.a;
                com.gamericefishpro.space.b0.n nVar2 = new com.gamericefishpro.space.b0.n(i, yVar, v0Var);
                this.e = 1;
                d0Var.getClass();
                com.gamericefishpro.space.si.d0.k(d0Var, nVar2, this);
                return aVar10;
            case 9:
                com.gamericefishpro.space.uh.a aVar11 = com.gamericefishpro.space.uh.a.d;
                int i10 = this.e;
                if (i10 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.s5.g gVar2 = (com.gamericefishpro.space.s5.g) this.i;
                    this.e = 1;
                    if (gVar2.a(this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 10:
                com.gamericefishpro.space.uh.a aVar12 = com.gamericefishpro.space.uh.a.d;
                int i11 = this.e;
                if (i11 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    k0 k0Var = (k0) this.i;
                    this.e = 1;
                    if (k0Var.f(this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.uh.a aVar13 = com.gamericefishpro.space.uh.a.d;
                int i12 = this.e;
                if (i12 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar = ((com.gamericefishpro.space.s7.i) this.i).d;
                    this.e = 1;
                    if (cVar.c(this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 12:
                com.gamericefishpro.space.uh.a aVar14 = com.gamericefishpro.space.uh.a.d;
                int i13 = this.e;
                if (i13 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.si.m mVar = (com.gamericefishpro.space.si.m) this.i;
                    this.e = 1;
                    Object objA = mVar.a(com.gamericefishpro.space.ti.s.d, this);
                    if (objA != aVar14) {
                        objA = Unit.a;
                    }
                    if (objA == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 13:
                com.gamericefishpro.space.uh.a aVar15 = com.gamericefishpro.space.uh.a.d;
                int i14 = this.e;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.pi.n nVar3 = (com.gamericefishpro.space.pi.n) this.i;
                this.e = 1;
                Object objR2 = nVar3.r(this);
                return objR2 == aVar15 ? aVar15 : objR2;
            case 14:
                com.gamericefishpro.space.uh.a aVar16 = com.gamericefishpro.space.uh.a.d;
                int i15 = this.e;
                if (i15 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    s0 s0Var = (s0) this.i;
                    this.e = 1;
                    if (s0.t(s0Var, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 15:
                com.gamericefishpro.space.uh.a aVar17 = com.gamericefishpro.space.uh.a.d;
                int i16 = this.e;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.ei.y yVar2 = new com.gamericefishpro.space.ei.y();
                com.gamericefishpro.space.ei.y yVar3 = new com.gamericefishpro.space.ei.y();
                com.gamericefishpro.space.ei.y yVar4 = new com.gamericefishpro.space.ei.y();
                com.gamericefishpro.space.y.c0 c0Var = (com.gamericefishpro.space.y.c0) this.i;
                com.gamericefishpro.space.si.d0 d0Var2 = c0Var.H.a;
                com.gamericefishpro.space.s5.d0 d0Var3 = new com.gamericefishpro.space.s5.d0(yVar2, yVar3, yVar4, c0Var, 2);
                this.e = 1;
                d0Var2.getClass();
                com.gamericefishpro.space.si.d0.k(d0Var2, d0Var3, this);
                return aVar17;
            case 16:
                com.gamericefishpro.space.uh.a aVar18 = com.gamericefishpro.space.uh.a.d;
                int i17 = this.e;
                if (i17 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    g0 g0Var = (g0) this.i;
                    this.e = 1;
                    if (com.gamericefishpro.space.wa.b.f(g0Var, null, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar19 = com.gamericefishpro.space.uh.a.d;
                int i18 = this.e;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.ri.e eVar = (com.gamericefishpro.space.ri.e) ((com.gamericefishpro.space.p5.a) this.i).f;
                this.e = 1;
                Object objH = com.gamericefishpro.space.pi.a0.h(new com.gamericefishpro.space.b0.o(eVar, aVar, 29), this);
                return objH == aVar19 ? aVar19 : objH;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = obj;
    }
}

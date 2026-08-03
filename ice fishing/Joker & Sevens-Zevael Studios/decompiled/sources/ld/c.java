package ld;

import ac.o;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.work.CoroutineWorker;
import bc.a0;
import bd.e0;
import bd.t;
import c0.h;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import hc.j;
import id.i;
import l6.l;
import o4.m;
import pc.q;
import r1.z;
import sd.k;
import td.f;
import w.b0;
import w.u;
import x1.f1;
import yc.g;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4258g;

    /* renamed from: h, reason: collision with root package name */
    public int f4259h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4260i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, fc.d dVar, int i10) {
        super(2, dVar);
        this.f4258g = i10;
        this.f4260i = obj;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f4258g) {
            case 0:
                return new c((b) this.f4260i, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new c((CoroutineWorker) this.f4260i, dVar, 1);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new c((z) this.f4260i, dVar, 2);
            case 3:
                return new c((k) this.f4260i, dVar, 3);
            case 4:
                return new c((f) this.f4260i, dVar, 4);
            case 5:
                return new c((u) this.f4260i, dVar, 5);
            case 6:
                return new c((b0) this.f4260i, dVar, 6);
            default:
                return new c((zd.f) this.f4260i, dVar, 7);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f4258g) {
        }
        return ((c) create(yVar, dVar)).invokeSuspend(o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        if (r12 != r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015a, code lost:
    
        if (r12 == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0143, code lost:
    
        if (r6 == r7) goto L74;
     */
    /* JADX WARN: Type inference failed for: r12v16, types: [hc.j, oc.e] */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        c0.a aVar;
        switch (this.f4258g) {
            case 0:
                int i10 = this.f4259h;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return obj;
                }
                v6.a.W(obj);
                b bVar = (b) this.f4260i;
                this.f4259h = 1;
                g gVar = new g(1, a0.w(this));
                gVar.q();
                try {
                    l lVar = new l((Context) bVar.f4257a);
                    lVar.l(new x4.l(5, gVar, lVar));
                } catch (Exception unused) {
                    if (gVar.u()) {
                        gVar.resumeWith("");
                    }
                }
                Object p8 = gVar.p();
                gc.a aVar2 = gc.a.f2559g;
                return p8 == aVar2 ? aVar2 : p8;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.f4260i;
                int i11 = this.f4259h;
                try {
                    if (i11 == 0) {
                        v6.a.W(obj);
                        this.f4259h = 1;
                        obj = coroutineWorker.doWork(this);
                        gc.a aVar3 = gc.a.f2559g;
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                    }
                    coroutineWorker.getFuture$work_runtime_ktx_release().i((m) obj);
                } catch (Throwable th) {
                    coroutineWorker.getFuture$work_runtime_ktx_release().j(th);
                }
                return o.f277a;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                z zVar = (z) this.f4260i;
                int i12 = this.f4259h;
                if (i12 == 0) {
                    v6.a.W(obj);
                    ?? r12 = zVar.f6009w;
                    gc.a aVar4 = gc.a.f2559g;
                    if (r12 != 0) {
                        this.f4259h = 1;
                        if (r12.invoke(zVar, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        PointerInputEventHandler pointerInputEventHandler = zVar.f6010x;
                        this.f4259h = 2;
                        if (pointerInputEventHandler.invoke(zVar, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return o.f277a;
            case 3:
                k kVar = (k) this.f4260i;
                int i13 = this.f4259h;
                if (i13 == 0) {
                    v6.a.W(obj);
                    i iVar = kVar.f6504b;
                    this.f4259h = 1;
                    obj = iVar.a();
                    gc.a aVar5 = gc.a.f2559g;
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                int intValue = ((Number) obj).intValue();
                e0 e0Var = kVar.f6505c;
                ((sd.j) e0Var.getValue()).getClass();
                sd.j jVar = new sd.j(intValue);
                e0Var.getClass();
                e0Var.h(null, jVar);
                return o.f277a;
            case 4:
                f fVar = (f) this.f4260i;
                i iVar2 = fVar.f6558b;
                int i14 = this.f4259h;
                o oVar = o.f277a;
                gc.a aVar6 = gc.a.f2559g;
                if (i14 == 0) {
                    v6.a.W(obj);
                    this.f4259h = 1;
                    iVar2.d();
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj);
                            return oVar;
                        }
                        v6.a.W(obj);
                        this.f4259h = 3;
                        if (f.e(fVar, this) != aVar6) {
                            return oVar;
                        }
                        return aVar6;
                    }
                    v6.a.W(obj);
                }
                this.f4259h = 2;
                Object c3 = iVar2.e().c(new j0.c(1, fVar), this);
                if (c3 != aVar6) {
                    c3 = oVar;
                    break;
                }
                break;
            case 5:
                int i15 = this.f4259h;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return o.f277a;
                }
                v6.a.W(obj);
                q qVar = new q();
                q qVar2 = new q();
                q qVar3 = new q();
                u uVar = (u) this.f4260i;
                t tVar = uVar.f7509u.f8412a;
                cd.j jVar2 = new cd.j(qVar, qVar2, qVar3, uVar, 1);
                this.f4259h = 1;
                tVar.getClass();
                t.j(tVar, jVar2, this);
                return gc.a.f2559g;
            case 6:
                int i16 = this.f4259h;
                o oVar2 = o.f277a;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar2;
                }
                v6.a.W(obj);
                b0 b0Var = (b0) this.f4260i;
                this.f4259h = 1;
                boolean z10 = b0Var.f8443g.f8456t;
                gc.a aVar7 = gc.a.f2559g;
                if (z10) {
                    f1 u10 = x1.f.u(b0Var);
                    if (b0Var.f8443g.f8456t) {
                        c0.a aVar8 = (c0.a) x1.f.j(b0Var, c0.f.f1191w);
                        if (aVar8 == null) {
                            aVar8 = new c0.g(b0Var);
                        }
                        aVar = aVar8;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        obj2 = aVar.E(u10, new h(u10, 0), this);
                        break;
                    }
                }
                obj2 = oVar2;
                return obj2 == aVar7 ? aVar7 : oVar2;
            default:
                zd.f fVar2 = (zd.f) this.f4260i;
                int i17 = this.f4259h;
                o oVar3 = o.f277a;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar3;
                }
                v6.a.W(obj);
                f8.c Y = x4.f.Y(a0.c(-611369036, new String[]{"high_scores"}, (g5.j) fVar2.f9192b.f3283a.f1234a, "getAllHighScores", "SELECT * FROM high_scores ORDER BY score DESC LIMIT 10", new k2.e(6, new nd.g())));
                fd.d dVar = i0.f8861c;
                pc.j.e(dVar, "context");
                j0.c cVar = new j0.c(3, fVar2);
                this.f4259h = 1;
                Object c7 = Y.c(new e5.c(new id.c(cVar, 0), dVar, 0), this);
                gc.a aVar9 = gc.a.f2559g;
                if (c7 != aVar9) {
                    c7 = oVar3;
                }
                if (c7 != aVar9) {
                    c7 = oVar3;
                }
                return c7 == aVar9 ? aVar9 : oVar3;
        }
    }
}

package v;

import android.view.View;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import m0.a2;
import m0.c2;
import m0.d2;
import y1.w1;
import y1.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6876g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f6877h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6878i;

    /* renamed from: j, reason: collision with root package name */
    public Object f6879j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6880k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6881l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6882m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f6883n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(pc.s sVar, d2 d2Var, androidx.lifecycle.u uVar, w1 w1Var, View view, fc.d dVar) {
        super(2, dVar);
        this.f6879j = sVar;
        this.f6880k = d2Var;
        this.f6881l = uVar;
        this.f6882m = w1Var;
        this.f6883n = view;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hc.j, oc.c] */
    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f6876g) {
            case 0:
                k0 k0Var = new k0((l0) this.f6882m, (hc.j) this.f6883n, dVar);
                k0Var.f6880k = obj;
                return k0Var;
            default:
                k0 k0Var2 = new k0((pc.s) this.f6879j, (d2) this.f6880k, (androidx.lifecycle.u) this.f6881l, (w1) this.f6882m, (View) this.f6883n, dVar);
                k0Var2.f6878i = obj;
                return k0Var2;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f6876g) {
        }
        return ((k0) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [oc.c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [yc.b1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [yc.b1] */
    /* JADX WARN: Type inference failed for: r2v23, types: [yc.b1] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [gd.a] */
    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        gd.d dVar;
        j0 j0Var;
        ?? r12;
        Throwable th;
        j0 j0Var2;
        gd.a aVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        switch (this.f6876g) {
            case 0:
                l0 l0Var = (l0) this.f6882m;
                ?? r13 = this.f6877h;
                gc.a aVar2 = gc.a.f2559g;
                try {
                    try {
                        if (r13 == 0) {
                            v6.a.W(obj);
                            fc.g v10 = ((yc.y) this.f6880k).f().v(yc.v.f8910h);
                            pc.j.b(v10);
                            j0 j0Var3 = new j0((yc.b1) v10);
                            AtomicReference atomicReference3 = l0Var.f6887a;
                            while (true) {
                                j0 j0Var4 = (j0) atomicReference3.get();
                                if (j0Var4 != null && 1 - 1 < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                                while (!atomicReference3.compareAndSet(j0Var4, j0Var3)) {
                                    if (atomicReference3.get() != j0Var4) {
                                        break;
                                    }
                                }
                                if (j0Var4 != null) {
                                    j0Var4.f6873a.a(new i0("Mutation interrupted", 0));
                                }
                                dVar = l0Var.f6888b;
                                hc.j jVar = (hc.j) this.f6883n;
                                this.f6880k = j0Var3;
                                this.f6879j = dVar;
                                this.f6878i = jVar;
                                this.f6881l = l0Var;
                                this.f6877h = 1;
                                if (dVar.c(this) == aVar2) {
                                    return aVar2;
                                }
                                j0Var = j0Var3;
                                r12 = jVar;
                            }
                        } else {
                            if (r13 != 1) {
                                if (r13 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                l0Var = (l0) this.f6878i;
                                aVar = (gd.a) this.f6879j;
                                j0Var2 = (j0) this.f6880k;
                                try {
                                    v6.a.W(obj);
                                    atomicReference2 = l0Var.f6887a;
                                    while (!atomicReference2.compareAndSet(j0Var2, null) && atomicReference2.get() == j0Var2) {
                                    }
                                    ((gd.d) aVar).d(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    atomicReference = l0Var.f6887a;
                                    while (!atomicReference.compareAndSet(j0Var2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            l0Var = (l0) this.f6881l;
                            oc.c cVar = (oc.c) this.f6878i;
                            ?? r32 = (gd.a) this.f6879j;
                            j0Var = (j0) this.f6880k;
                            v6.a.W(obj);
                            dVar = r32;
                            r12 = cVar;
                        }
                        this.f6880k = j0Var;
                        this.f6879j = dVar;
                        this.f6878i = l0Var;
                        this.f6881l = null;
                        this.f6877h = 2;
                        Object invoke = r12.invoke(this);
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        aVar = dVar;
                        obj = invoke;
                        j0Var2 = j0Var;
                        atomicReference2 = l0Var.f6887a;
                        while (!atomicReference2.compareAndSet(j0Var2, null)) {
                        }
                        ((gd.d) aVar).d(null);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                        j0Var2 = j0Var;
                        atomicReference = l0Var.f6887a;
                        while (!atomicReference.compareAndSet(j0Var2, null) && atomicReference.get() == j0Var2) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    ((gd.d) r13).d(null);
                    throw th4;
                }
            default:
                w1 w1Var = (w1) this.f6882m;
                androidx.lifecycle.u uVar = (androidx.lifecycle.u) this.f6881l;
                ?? r22 = this.f6877h;
                ac.o oVar = ac.o.f277a;
                fc.d dVar2 = null;
                try {
                    if (r22 == 0) {
                        v6.a.W(obj);
                        yc.y yVar = (yc.y) this.f6878i;
                        try {
                            y1.h1 h1Var = (y1.h1) ((pc.s) this.f6879j).f5683g;
                            if (h1Var != null) {
                                bd.c0 a6 = x1.a(((View) this.f6883n).getContext().getApplicationContext());
                                h1Var.f8553g.g(((Number) a6.getValue()).floatValue());
                                r22 = yc.a0.q(yVar, null, new c0.d(a6, h1Var, dVar2, 15), 3);
                            } else {
                                r22 = 0;
                            }
                            d2 d2Var = (d2) this.f6880k;
                            this.f6878i = r22;
                            this.f6877h = 1;
                            Object A = yc.a0.A(d2Var.f4549a, new a2(d2Var, new c2(d2Var, null), m0.z.p(getContext()), null), this);
                            gc.a aVar3 = gc.a.f2559g;
                            if (A != aVar3) {
                                A = oVar;
                            }
                            if (A != aVar3) {
                                A = oVar;
                            }
                            if (A == aVar3) {
                                return aVar3;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            r22 = 0;
                            if (r22 != 0) {
                                r22.a(null);
                            }
                            uVar.h().f(w1Var);
                            throw th;
                        }
                    } else {
                        if (r22 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r22 = (yc.b1) this.f6878i;
                        v6.a.W(obj);
                    }
                    if (r22 != 0) {
                        r22.a(null);
                    }
                    uVar.h().f(w1Var);
                    return oVar;
                } catch (Throwable th6) {
                    th = th6;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(l0 l0Var, oc.c cVar, fc.d dVar) {
        super(2, dVar);
        this.f6882m = l0Var;
        this.f6883n = (hc.j) cVar;
    }
}

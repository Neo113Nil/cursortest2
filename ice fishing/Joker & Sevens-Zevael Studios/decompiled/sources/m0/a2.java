package m0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a2 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4514g;

    /* renamed from: h, reason: collision with root package name */
    public int f4515h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4516i;

    /* renamed from: j, reason: collision with root package name */
    public Object f4517j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4518k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4520m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(Object obj, Object obj2, Object obj3, Object obj4, fc.d dVar, int i10) {
        super(2, dVar);
        this.f4514g = i10;
        this.f4517j = obj;
        this.f4518k = obj2;
        this.f4519l = obj3;
        this.f4520m = obj4;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f4514g) {
            case 0:
                a2 a2Var = new a2((d2) this.f4518k, (c2) this.f4519l, (a1) this.f4520m, dVar);
                a2Var.f4516i = obj;
                return a2Var;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                a2 a2Var2 = new a2((x.n1) this.f4517j, (x.i) this.f4518k, (x.d) this.f4519l, (yc.b1) this.f4520m, dVar, 1);
                a2Var2.f4516i = obj;
                return a2Var2;
            default:
                a2 a2Var3 = new a2((r1.r) this.f4517j, (w.p) this.f4518k, (a0.a0) this.f4519l, (x.h0) this.f4520m, dVar, 2);
                a2Var3.f4516i = obj;
                return a2Var3;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4514g) {
            case 0:
                return ((a2) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return ((a2) create((x.x0) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            default:
                return ((a2) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Collection] */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c6.f fVar;
        bd.e0 e0Var;
        Object obj2;
        s0.b bVar;
        yc.b1 b1Var;
        d2 d2Var;
        List w3;
        d2 d2Var2;
        int i10 = 3;
        switch (this.f4514g) {
            case 0:
                gc.a aVar = gc.a.f2559g;
                int i11 = this.f4515h;
                fc.d dVar = null;
                if (i11 == 0) {
                    v6.a.W(obj);
                    yc.b1 k3 = yc.a0.k(((yc.y) this.f4516i).f());
                    d2 d2Var3 = (d2) this.f4518k;
                    synchronized (d2Var3.f4550b) {
                        Throwable th = d2Var3.f4552d;
                        if (th != null) {
                            throw th;
                        }
                        if (((z1) d2Var3.f4568t.getValue()).compareTo(z1.f4847h) <= 0) {
                            throw new IllegalStateException("Recomposer shut down");
                        }
                        if (d2Var3.f4551c != null) {
                            throw new IllegalStateException("Recomposer already running");
                        }
                        d2Var3.f4551c = k3;
                        d2Var3.t();
                    }
                    ae.b bVar2 = new ae.b(3, (d2) this.f4518k);
                    w0.m.f(w0.m.f7578a);
                    synchronized (w0.m.f7580c) {
                        w0.m.f7585h = bc.m.Z(w0.m.f7585h, bVar2);
                    }
                    fVar = new c6.f(13, bVar2);
                    bd.e0 e0Var2 = d2.f4547x;
                    z0 z0Var = ((d2) this.f4518k).f4571w;
                    try {
                        do {
                            e0Var = d2.f4547x;
                            obj2 = (p0.b) e0Var.getValue();
                            bVar = (s0.b) obj2;
                            t0.b bVar3 = t0.b.f6511a;
                            r0.c cVar = bVar.f6373i;
                            if (!cVar.containsKey(z0Var)) {
                                if (bVar.isEmpty()) {
                                    bVar = new s0.b(z0Var, z0Var, cVar.a(z0Var, new s0.a(bVar3, bVar3)));
                                } else {
                                    Object obj3 = bVar.f6372h;
                                    Object obj4 = cVar.get(obj3);
                                    pc.j.b(obj4);
                                    bVar = new s0.b(bVar.f6371g, z0Var, cVar.a(obj3, new s0.a(((s0.a) obj4).f6368a, z0Var)).a(z0Var, new s0.a(obj3, bVar3)));
                                }
                            }
                            if (obj2 != bVar) {
                                Object obj5 = cd.c.f1342b;
                                if (obj2 == null) {
                                    obj2 = obj5;
                                }
                            }
                            d2Var = (d2) this.f4518k;
                            synchronized (d2Var.f4550b) {
                                w3 = d2Var.w();
                            }
                            int size = w3.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                ((y) w3.get(i12)).s();
                            }
                            c0.c cVar2 = new c0.c((c2) this.f4519l, (a1) this.f4520m, dVar, 4);
                            this.f4516i = k3;
                            this.f4517j = fVar;
                            this.f4515h = 1;
                            if (yc.a0.e(cVar2, this) == aVar) {
                                return aVar;
                            }
                            b1Var = k3;
                        } while (!e0Var.h(obj2, bVar));
                        d2Var = (d2) this.f4518k;
                        synchronized (d2Var.f4550b) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        b1Var = k3;
                        Throwable th3 = th;
                        fVar.f();
                        d2Var2 = (d2) this.f4518k;
                        synchronized (d2Var2.f4550b) {
                            try {
                                if (d2Var2.f4551c == b1Var) {
                                    d2Var2.f4551c = null;
                                }
                                d2Var2.t();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        bd.e0 e0Var3 = d2.f4547x;
                        z0.b(((d2) this.f4518k).f4571w);
                        throw th3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = (c6.f) this.f4517j;
                    b1Var = (yc.b1) this.f4516i;
                    try {
                        v6.a.W(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th32 = th;
                        fVar.f();
                        d2Var2 = (d2) this.f4518k;
                        synchronized (d2Var2.f4550b) {
                        }
                    }
                }
                fVar.f();
                d2 d2Var4 = (d2) this.f4518k;
                synchronized (d2Var4.f4550b) {
                    try {
                        if (d2Var4.f4551c == b1Var) {
                            d2Var4.f4551c = null;
                        }
                        d2Var4.t();
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                bd.e0 e0Var4 = d2.f4547x;
                z0.b(((d2) this.f4518k).f4571w);
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                x.d dVar2 = (x.d) this.f4519l;
                x.i iVar = (x.i) this.f4518k;
                x.n1 n1Var = (x.n1) this.f4517j;
                gc.a aVar2 = gc.a.f2559g;
                int i13 = this.f4515h;
                if (i13 == 0) {
                    v6.a.W(obj);
                    x.x0 x0Var = (x.x0) this.f4516i;
                    n1Var.f7859e = x.i.r0(iVar, dVar2);
                    a0.r rVar = new a0.r(iVar, (yc.b1) this.f4520m, x0Var, 6);
                    a0.l lVar = new a0.l(iVar, n1Var, dVar2, i10);
                    this.f4515h = 1;
                    if (n1Var.a(rVar, lVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            default:
                gc.a aVar3 = gc.a.f2559g;
                int i14 = this.f4515h;
                if (i14 == 0) {
                    v6.a.W(obj);
                    yc.y yVar = (yc.y) this.f4516i;
                    r1.r rVar2 = (r1.r) this.f4517j;
                    x.e1 e1Var = new x.e1(yVar, (w.p) this.f4518k, (a0.a0) this.f4519l, (x.h0) this.f4520m, null);
                    this.f4515h = 1;
                    if (u.l0.c(rVar2, e1Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(d2 d2Var, c2 c2Var, a1 a1Var, fc.d dVar) {
        super(2, dVar);
        this.f4514g = 0;
        this.f4518k = d2Var;
        this.f4519l = c2Var;
        this.f4520m = a1Var;
    }
}

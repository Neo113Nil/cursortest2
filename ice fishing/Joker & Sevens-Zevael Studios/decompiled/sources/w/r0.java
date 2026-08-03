package w;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public gd.a f7491g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7492h;

    /* renamed from: i, reason: collision with root package name */
    public x.l f7493i;

    /* renamed from: j, reason: collision with root package name */
    public s0 f7494j;

    /* renamed from: k, reason: collision with root package name */
    public int f7495k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7496l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p0 f7497m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s0 f7498n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c0.c f7499o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x.l f7500p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p0 p0Var, s0 s0Var, c0.c cVar, x.l lVar, fc.d dVar) {
        super(2, dVar);
        this.f7497m = p0Var;
        this.f7498n = s0Var;
        this.f7499o = cVar;
        this.f7500p = lVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        r0 r0Var = new r0(this.f7497m, this.f7498n, this.f7499o, this.f7500p, dVar);
        r0Var.f7496l = obj;
        return r0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [oc.e] */
    /* JADX WARN: Type inference failed for: r6v5, types: [gd.a] */
    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        gd.d dVar;
        c0.c cVar;
        x.l lVar;
        q0 q0Var;
        s0 s0Var;
        q0 q0Var2;
        gd.a aVar;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i10 = this.f7495k;
        gc.a aVar2 = gc.a.f2559g;
        try {
            try {
                if (i10 == 0) {
                    v6.a.W(obj);
                    fc.g v10 = ((yc.y) this.f7496l).f().v(yc.v.f8910h);
                    pc.j.b(v10);
                    q0 q0Var3 = new q0(this.f7497m, (yc.b1) v10);
                    s0 s0Var2 = this.f7498n;
                    AtomicReference atomicReference3 = s0Var2.f7502a;
                    while (true) {
                        q0 q0Var4 = (q0) atomicReference3.get();
                        if (q0Var4 != null && q0Var3.f7487a.compareTo(q0Var4.f7487a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(q0Var4, q0Var3)) {
                            if (atomicReference3.get() != q0Var4) {
                                break;
                            }
                        }
                        if (q0Var4 != null) {
                            q0Var4.f7488b.a(new v.i0("Mutation interrupted", 1));
                        }
                        dVar = s0Var2.f7503b;
                        this.f7496l = q0Var3;
                        this.f7491g = dVar;
                        cVar = this.f7499o;
                        this.f7492h = cVar;
                        x.l lVar2 = this.f7500p;
                        this.f7493i = lVar2;
                        this.f7494j = s0Var2;
                        this.f7495k = 1;
                        if (dVar.c(this) != aVar2) {
                            lVar = lVar2;
                            q0Var = q0Var3;
                            s0Var = s0Var2;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s0Var = (s0) this.f7492h;
                        aVar = this.f7491g;
                        q0Var2 = (q0) this.f7496l;
                        try {
                            v6.a.W(obj);
                            atomicReference2 = s0Var.f7502a;
                            while (!atomicReference2.compareAndSet(q0Var2, null) && atomicReference2.get() == q0Var2) {
                            }
                            ((gd.d) aVar).d(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            atomicReference = s0Var.f7502a;
                            while (!atomicReference.compareAndSet(q0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    s0Var = this.f7494j;
                    lVar = this.f7493i;
                    ?? r5 = (oc.e) this.f7492h;
                    ?? r62 = this.f7491g;
                    q0Var = (q0) this.f7496l;
                    v6.a.W(obj);
                    cVar = r5;
                    dVar = r62;
                }
                this.f7496l = q0Var;
                this.f7491g = dVar;
                this.f7492h = s0Var;
                this.f7493i = null;
                this.f7494j = null;
                this.f7495k = 2;
                obj = cVar.invoke(lVar, this);
                if (obj != aVar2) {
                    aVar = dVar;
                    q0Var2 = q0Var;
                    atomicReference2 = s0Var.f7502a;
                    while (!atomicReference2.compareAndSet(q0Var2, null)) {
                    }
                    ((gd.d) aVar).d(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th2) {
                th = th2;
                q0Var2 = q0Var;
                atomicReference = s0Var.f7502a;
                while (!atomicReference.compareAndSet(q0Var2, null) && atomicReference.get() == q0Var2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((gd.d) 2).d(null);
            throw th3;
        }
    }
}

package D;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final S0.d f230a = S0.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final A.j f231b = new A.j(1);

    /* renamed from: c, reason: collision with root package name */
    public final A.j f232c = new A.j(new k0(2, null));

    public l0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f231b.f30g).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(D0.l lVar, x0.b bVar) {
        i0 i0Var;
        w0.a aVar;
        int i2;
        S0.d dVar;
        Throwable th;
        S0.a aVar2;
        Object i3;
        try {
            if (bVar instanceof i0) {
                i0Var = (i0) bVar;
                int i4 = i0Var.f208m;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    i0Var.f208m = i4 - Integer.MIN_VALUE;
                    Object obj = i0Var.f206k;
                    aVar = w0.a.f3071f;
                    i2 = i0Var.f208m;
                    if (i2 != 0) {
                        o.g.C(obj);
                        i0Var.f204i = lVar;
                        dVar = this.f230a;
                        i0Var.f205j = dVar;
                        i0Var.f208m = 1;
                        if (dVar.c(i0Var) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (S0.a) i0Var.f204i;
                            try {
                                o.g.C(obj);
                                ((S0.d) aVar2).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((S0.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        S0.d dVar2 = i0Var.f205j;
                        D0.l lVar2 = (D0.l) i0Var.f204i;
                        o.g.C(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    i0Var.f204i = dVar;
                    i0Var.f205j = null;
                    i0Var.f208m = 2;
                    i3 = lVar.i(i0Var);
                    if (i3 != aVar) {
                        return aVar;
                    }
                    S0.d dVar3 = dVar;
                    obj = i3;
                    aVar2 = dVar3;
                    ((S0.d) aVar2).e(null);
                    return obj;
                }
            }
            i0Var.f204i = dVar;
            i0Var.f205j = null;
            i0Var.f208m = 2;
            i3 = lVar.i(i0Var);
            if (i3 != aVar) {
            }
        } catch (Throwable th3) {
            S0.d dVar4 = dVar;
            th = th3;
            aVar2 = dVar4;
            ((S0.d) aVar2).e(null);
            throw th;
        }
        i0Var = new i0(this, bVar);
        Object obj2 = i0Var.f206k;
        aVar = w0.a.f3071f;
        i2 = i0Var.f208m;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(D0.p pVar, x0.b bVar) {
        j0 j0Var;
        int i2;
        S0.d dVar;
        Throwable th;
        boolean z2;
        if (bVar instanceof j0) {
            j0Var = (j0) bVar;
            int i3 = j0Var.f217m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j0Var.f217m = i3 - Integer.MIN_VALUE;
                Object obj = j0Var.f215k;
                Object obj2 = w0.a.f3071f;
                i2 = j0Var.f217m;
                if (i2 != 0) {
                    o.g.C(obj);
                    S0.d dVar2 = this.f230a;
                    boolean d2 = dVar2.d(null);
                    try {
                        Object valueOf = Boolean.valueOf(d2);
                        j0Var.f213i = dVar2;
                        j0Var.f214j = d2;
                        j0Var.f217m = 1;
                        Object f2 = pVar.f(valueOf, j0Var);
                        if (f2 == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = f2;
                        z2 = d2;
                    } catch (Throwable th2) {
                        dVar = dVar2;
                        th = th2;
                        z2 = d2;
                        if (z2) {
                            dVar.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = j0Var.f214j;
                    dVar = j0Var.f213i;
                    try {
                        o.g.C(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z2) {
                        }
                        throw th;
                    }
                }
                if (z2) {
                    dVar.e(null);
                }
                return obj;
            }
        }
        j0Var = new j0(this, bVar);
        Object obj3 = j0Var.f215k;
        Object obj22 = w0.a.f3071f;
        i2 = j0Var.f217m;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return obj3;
    }
}

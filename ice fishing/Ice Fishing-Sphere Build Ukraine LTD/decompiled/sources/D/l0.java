package D;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final T0.d f230a = T0.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final A.j f231b = new A.j(1);

    /* renamed from: c, reason: collision with root package name */
    public final A.j f232c = new A.j(new k0(2, null));

    public l0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f231b.f30f).get());
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
        T0.d dVar;
        Throwable th;
        T0.a aVar2;
        Object i3;
        try {
            if (bVar instanceof i0) {
                i0Var = (i0) bVar;
                int i4 = i0Var.f208l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    i0Var.f208l = i4 - Integer.MIN_VALUE;
                    Object obj = i0Var.f206j;
                    aVar = w0.a.f3076e;
                    i2 = i0Var.f208l;
                    if (i2 != 0) {
                        o.g.z(obj);
                        i0Var.f204h = lVar;
                        dVar = this.f230a;
                        i0Var.f205i = dVar;
                        i0Var.f208l = 1;
                        if (dVar.c(i0Var) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (T0.a) i0Var.f204h;
                            try {
                                o.g.z(obj);
                                ((T0.d) aVar2).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((T0.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        T0.d dVar2 = i0Var.f205i;
                        D0.l lVar2 = (D0.l) i0Var.f204h;
                        o.g.z(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    i0Var.f204h = dVar;
                    i0Var.f205i = null;
                    i0Var.f208l = 2;
                    i3 = lVar.i(i0Var);
                    if (i3 != aVar) {
                        return aVar;
                    }
                    T0.d dVar3 = dVar;
                    obj = i3;
                    aVar2 = dVar3;
                    ((T0.d) aVar2).e(null);
                    return obj;
                }
            }
            i0Var.f204h = dVar;
            i0Var.f205i = null;
            i0Var.f208l = 2;
            i3 = lVar.i(i0Var);
            if (i3 != aVar) {
            }
        } catch (Throwable th3) {
            T0.d dVar4 = dVar;
            th = th3;
            aVar2 = dVar4;
            ((T0.d) aVar2).e(null);
            throw th;
        }
        i0Var = new i0(this, bVar);
        Object obj2 = i0Var.f206j;
        aVar = w0.a.f3076e;
        i2 = i0Var.f208l;
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
        T0.d dVar;
        Throwable th;
        boolean z2;
        if (bVar instanceof j0) {
            j0Var = (j0) bVar;
            int i3 = j0Var.f217l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j0Var.f217l = i3 - Integer.MIN_VALUE;
                Object obj = j0Var.f215j;
                Object obj2 = w0.a.f3076e;
                i2 = j0Var.f217l;
                if (i2 != 0) {
                    o.g.z(obj);
                    T0.d dVar2 = this.f230a;
                    boolean d2 = dVar2.d(null);
                    try {
                        Object valueOf = Boolean.valueOf(d2);
                        j0Var.f213h = dVar2;
                        j0Var.f214i = d2;
                        j0Var.f217l = 1;
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
                    z2 = j0Var.f214i;
                    dVar = j0Var.f213h;
                    try {
                        o.g.z(obj);
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
        Object obj3 = j0Var.f215j;
        Object obj22 = w0.a.f3076e;
        i2 = j0Var.f217l;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return obj3;
    }
}

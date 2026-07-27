package N0;

import D.A;
import D.C0017s;
import P0.w;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final A.j f806a;

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f807b;

    static {
        int i2 = 11;
        f806a = new A.j(i2, "NONE");
        f807b = new A.j(i2, "PENDING");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t tVar, C0017s c0017s, Throwable th, x0.b bVar) {
        g gVar;
        int i2;
        try {
            if (bVar instanceof g) {
                gVar = (g) bVar;
                int i3 = gVar.f760k;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.f760k = i3 - Integer.MIN_VALUE;
                    Object obj = gVar.f759j;
                    Object obj2 = w0.a.f3071f;
                    i2 = gVar.f760k;
                    if (i2 != 0) {
                        o.g.C(obj);
                        gVar.f758i = th;
                        gVar.f760k = 1;
                        if (c0017s.p(tVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f758i;
                        o.g.C(obj);
                    }
                    return t0.g.f2989a;
                }
            }
            if (i2 != 0) {
            }
            return t0.g.f2989a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                o.g.a(th2, th);
            }
            throw th2;
        }
        gVar = new g(bVar);
        Object obj3 = gVar.f759j;
        Object obj22 = w0.a.f3071f;
        i2 = gVar.f760k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:19:0x0072, B:21:0x007a, B:23:0x0080, B:25:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [M0.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [M0.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, M0.o oVar, boolean z2, x0.b bVar) {
        f fVar;
        int i2;
        M0.a aVar;
        M0.o oVar2;
        M0.a aVar2;
        e eVar2;
        M0.o oVar3;
        try {
            if (bVar instanceof f) {
                fVar = (f) bVar;
                int i3 = fVar.f757n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.f757n = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.f756m;
                    w0.a aVar3 = w0.a.f3071f;
                    i2 = fVar.f757n;
                    if (i2 != 0) {
                        o.g.C(obj);
                        if (eVar instanceof t) {
                            throw ((t) eVar).f809f;
                        }
                        M0.b bVar2 = oVar.f740i;
                        bVar2.getClass();
                        aVar = new M0.a(bVar2);
                        oVar3 = oVar;
                        fVar.f752i = eVar;
                        fVar.f753j = oVar3;
                        fVar.f754k = aVar;
                        fVar.f755l = z2;
                        fVar.f757n = 1;
                        obj = aVar.b(fVar);
                        if (obj == aVar3) {
                        }
                    } else if (i2 == 1) {
                        z2 = fVar.f755l;
                        aVar2 = fVar.f754k;
                        ?? r9 = fVar.f753j;
                        eVar2 = fVar.f752i;
                        o.g.C(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = fVar.f755l;
                        aVar2 = fVar.f754k;
                        ?? r92 = fVar.f753j;
                        eVar2 = fVar.f752i;
                        o.g.C(obj);
                        M0.o oVar4 = r92;
                        e eVar3 = eVar2;
                        aVar = aVar2;
                        eVar = eVar3;
                        oVar3 = oVar4;
                        fVar.f752i = eVar;
                        fVar.f753j = oVar3;
                        fVar.f754k = aVar;
                        fVar.f755l = z2;
                        fVar.f757n = 1;
                        obj = aVar.b(fVar);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        M0.a aVar4 = aVar;
                        eVar2 = eVar;
                        aVar2 = aVar4;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                oVar2.a(null);
                            }
                            return t0.g.f2989a;
                        }
                        Object obj2 = aVar2.f696f;
                        A.j jVar = M0.d.f726p;
                        if (obj2 == jVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f696f = jVar;
                        if (obj2 == M0.d.f722l) {
                            Throwable m2 = aVar2.f698h.m();
                            int i4 = w.f906a;
                            throw m2;
                        }
                        fVar.f752i = eVar2;
                        fVar.f753j = oVar2;
                        fVar.f754k = aVar2;
                        fVar.f755l = z2;
                        fVar.f757n = 2;
                        oVar4 = oVar2;
                        if (eVar2.b(obj2, fVar) == aVar3) {
                            return aVar3;
                        }
                        e eVar32 = eVar2;
                        aVar = aVar2;
                        eVar = eVar32;
                        oVar3 = oVar4;
                        fVar.f752i = eVar;
                        fVar.f753j = oVar3;
                        fVar.f754k = aVar;
                        fVar.f755l = z2;
                        fVar.f757n = 1;
                        obj = aVar.b(fVar);
                        if (obj == aVar3) {
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z2) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    oVar.a(cancellationException);
                }
                throw th2;
            }
        }
        fVar = new f(bVar);
        Object obj3 = fVar.f756m;
        w0.a aVar32 = w0.a.f3071f;
        i2 = fVar.f757n;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, x0.b bVar) {
        o oVar;
        int i2;
        E0.p pVar;
        O0.a e2;
        A a2;
        if (bVar instanceof o) {
            oVar = (o) bVar;
            int i3 = oVar.f795l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.f795l = i3 - Integer.MIN_VALUE;
                Object obj = oVar.f794k;
                Object obj2 = w0.a.f3071f;
                i2 = oVar.f795l;
                if (i2 != 0) {
                    o.g.C(obj);
                    E0.p pVar2 = new E0.p();
                    A a3 = new A(1, pVar2);
                    try {
                        oVar.f792i = pVar2;
                        oVar.f793j = a3;
                        oVar.f795l = 1;
                        if (dVar.n(a3, oVar) == obj2) {
                            return obj2;
                        }
                        pVar = pVar2;
                    } catch (O0.a e3) {
                        pVar = pVar2;
                        e2 = e3;
                        a2 = a3;
                        if (e2.f810f != a2) {
                        }
                        return pVar.f312f;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a2 = oVar.f793j;
                    pVar = oVar.f792i;
                    try {
                        o.g.C(obj);
                    } catch (O0.a e4) {
                        e2 = e4;
                        if (e2.f810f != a2) {
                            throw e2;
                        }
                        return pVar.f312f;
                    }
                }
                return pVar.f312f;
            }
        }
        oVar = new o(bVar);
        Object obj3 = oVar.f794k;
        Object obj22 = w0.a.f3071f;
        i2 = oVar.f795l;
        if (i2 != 0) {
        }
        return pVar.f312f;
    }
}

package V7;

import E2.C0316m;
import X7.u;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import u7.v;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0316m f3488a = new C0316m("NONE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0316m f3489b = new C0316m("PENDING", 1);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r2.a(r11, r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005a, B:20:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0082, B:28:0x0093, B:29:0x009b, B:30:0x009c, B:31:0x00a3, B:39:0x0049, B:41:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [U7.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [U7.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0090 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, U7.o oVar, boolean z6, B7.c cVar2) {
        d dVar;
        int i;
        U7.b bVar;
        U7.o oVar2;
        U7.b bVar2;
        c cVar3;
        U7.o oVar3;
        try {
            if (cVar2 instanceof d) {
                dVar = (d) cVar2;
                int i4 = dVar.f3457y;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    dVar.f3457y = i4 - Integer.MIN_VALUE;
                    Object obj = dVar.f3456x;
                    A7.a aVar = A7.a.f215n;
                    i = dVar.f3457y;
                    if (i != 0) {
                        Q3.b.s(obj);
                        U7.c cVar4 = oVar.f3387w;
                        cVar4.getClass();
                        bVar = new U7.b(cVar4);
                        oVar3 = oVar;
                        dVar.f3452n = cVar;
                        dVar.f3453u = oVar3;
                        dVar.f3454v = bVar;
                        dVar.f3455w = z6;
                        dVar.f3457y = 1;
                        obj = bVar.b(dVar);
                        if (obj != aVar) {
                        }
                    } else if (i == 1) {
                        z6 = dVar.f3455w;
                        bVar2 = dVar.f3454v;
                        ?? r9 = dVar.f3453u;
                        cVar3 = dVar.f3452n;
                        Q3.b.s(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z6 = dVar.f3455w;
                        bVar2 = dVar.f3454v;
                        ?? r92 = dVar.f3453u;
                        cVar3 = dVar.f3452n;
                        Q3.b.s(obj);
                        U7.o oVar4 = r92;
                        c cVar5 = cVar3;
                        bVar = bVar2;
                        cVar = cVar5;
                        oVar3 = oVar4;
                        dVar.f3452n = cVar;
                        dVar.f3453u = oVar3;
                        dVar.f3454v = bVar;
                        dVar.f3455w = z6;
                        dVar.f3457y = 1;
                        obj = bVar.b(dVar);
                        if (obj != aVar) {
                            return aVar;
                        }
                        U7.b bVar3 = bVar;
                        cVar3 = cVar;
                        bVar2 = bVar3;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z6) {
                                oVar2.a(null);
                            }
                            return v.f41073a;
                        }
                        Object obj2 = bVar2.f3346n;
                        C0316m c0316m = U7.e.f3374p;
                        if (obj2 == c0316m) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.f3346n = c0316m;
                        if (obj2 == U7.e.f3370l) {
                            Throwable p9 = bVar2.f3348v.p();
                            int i6 = u.f3816a;
                            throw p9;
                        }
                        dVar.f3452n = cVar3;
                        dVar.f3453u = oVar2;
                        dVar.f3454v = bVar2;
                        dVar.f3455w = z6;
                        dVar.f3457y = 2;
                        oVar4 = oVar2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z6) {
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
        dVar = new d(cVar2);
        Object obj3 = dVar.f3456x;
        A7.a aVar2 = A7.a.f215n;
        i = dVar.f3457y;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(I0.j jVar, B7.c cVar) {
        j jVar2;
        int i;
        r rVar;
        W7.a e9;
        i iVar;
        if (cVar instanceof j) {
            jVar2 = (j) cVar;
            int i4 = jVar2.f3477w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jVar2.f3477w = i4 - Integer.MIN_VALUE;
                Object obj = jVar2.f3476v;
                Object obj2 = A7.a.f215n;
                i = jVar2.f3477w;
                if (i != 0) {
                    Q3.b.s(obj);
                    r rVar2 = new r();
                    i iVar2 = new i(0, rVar2);
                    try {
                        jVar2.f3474n = rVar2;
                        jVar2.f3475u = iVar2;
                        jVar2.f3477w = 1;
                        if (jVar.l(iVar2, jVar2) == obj2) {
                            return obj2;
                        }
                        rVar = rVar2;
                    } catch (W7.a e10) {
                        rVar = rVar2;
                        e9 = e10;
                        iVar = iVar2;
                        if (e9.f3575n != iVar) {
                            throw e9;
                        }
                        return rVar.f38644n;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = jVar2.f3475u;
                    rVar = jVar2.f3474n;
                    try {
                        Q3.b.s(obj);
                    } catch (W7.a e11) {
                        e9 = e11;
                        if (e9.f3575n != iVar) {
                        }
                        return rVar.f38644n;
                    }
                }
                return rVar.f38644n;
            }
        }
        jVar2 = new j(cVar);
        Object obj3 = jVar2.f3476v;
        Object obj22 = A7.a.f215n;
        i = jVar2.f3477w;
        if (i != 0) {
        }
        return rVar.f38644n;
    }
}

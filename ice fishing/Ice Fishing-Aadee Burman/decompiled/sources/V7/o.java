package V7;

import X7.u;
import g1.C4523c;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import u7.v;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final D2.b f3358a = new D2.b("NONE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final D2.b f3359b = new D2.b("PENDING", 1);

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
    public static final Object a(c cVar, U7.o oVar, boolean z3, B7.c cVar2) {
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
                int i6 = dVar.f3327y;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    dVar.f3327y = i6 - Integer.MIN_VALUE;
                    Object obj = dVar.f3326x;
                    A7.a aVar = A7.a.f58n;
                    i = dVar.f3327y;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj);
                        U7.c cVar4 = oVar.f3264w;
                        cVar4.getClass();
                        bVar = new U7.b(cVar4);
                        oVar3 = oVar;
                        dVar.f3322n = cVar;
                        dVar.f3323u = oVar3;
                        dVar.f3324v = bVar;
                        dVar.f3325w = z3;
                        dVar.f3327y = 1;
                        obj = bVar.b(dVar);
                        if (obj != aVar) {
                        }
                    } else if (i == 1) {
                        z3 = dVar.f3325w;
                        bVar2 = dVar.f3324v;
                        ?? r9 = dVar.f3323u;
                        cVar3 = dVar.f3322n;
                        com.bumptech.glide.d.k(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = dVar.f3325w;
                        bVar2 = dVar.f3324v;
                        ?? r92 = dVar.f3323u;
                        cVar3 = dVar.f3322n;
                        com.bumptech.glide.d.k(obj);
                        U7.o oVar4 = r92;
                        c cVar5 = cVar3;
                        bVar = bVar2;
                        cVar = cVar5;
                        oVar3 = oVar4;
                        dVar.f3322n = cVar;
                        dVar.f3323u = oVar3;
                        dVar.f3324v = bVar;
                        dVar.f3325w = z3;
                        dVar.f3327y = 1;
                        obj = bVar.b(dVar);
                        if (obj != aVar) {
                            return aVar;
                        }
                        U7.b bVar3 = bVar;
                        cVar3 = cVar;
                        bVar2 = bVar3;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z3) {
                                oVar2.a(null);
                            }
                            return v.f41350a;
                        }
                        Object obj2 = bVar2.f3223n;
                        D2.b bVar4 = U7.e.f3251p;
                        if (obj2 == bVar4) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.f3223n = bVar4;
                        if (obj2 == U7.e.f3247l) {
                            Throwable p9 = bVar2.f3225v.p();
                            int i9 = u.f3861a;
                            throw p9;
                        }
                        dVar.f3322n = cVar3;
                        dVar.f3323u = oVar2;
                        dVar.f3324v = bVar2;
                        dVar.f3325w = z3;
                        dVar.f3327y = 2;
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
                if (z3) {
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
        Object obj3 = dVar.f3326x;
        A7.a aVar2 = A7.a.f58n;
        i = dVar.f3327y;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C4523c c4523c, B7.c cVar) {
        j jVar;
        int i;
        r rVar;
        W7.a e9;
        i iVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i6 = jVar.f3347w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                jVar.f3347w = i6 - Integer.MIN_VALUE;
                Object obj = jVar.f3346v;
                Object obj2 = A7.a.f58n;
                i = jVar.f3347w;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    r rVar2 = new r();
                    i iVar2 = new i(0, rVar2);
                    try {
                        jVar.f3344n = rVar2;
                        jVar.f3345u = iVar2;
                        jVar.f3347w = 1;
                        if (c4523c.p(iVar2, jVar) == obj2) {
                            return obj2;
                        }
                        rVar = rVar2;
                    } catch (W7.a e10) {
                        rVar = rVar2;
                        e9 = e10;
                        iVar = iVar2;
                        if (e9.f3413n != iVar) {
                            throw e9;
                        }
                        return rVar.f38717n;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = jVar.f3345u;
                    rVar = jVar.f3344n;
                    try {
                        com.bumptech.glide.d.k(obj);
                    } catch (W7.a e11) {
                        e9 = e11;
                        if (e9.f3413n != iVar) {
                        }
                        return rVar.f38717n;
                    }
                }
                return rVar.f38717n;
            }
        }
        jVar = new j(cVar);
        Object obj3 = jVar.f3346v;
        Object obj22 = A7.a.f58n;
        i = jVar.f3347w;
        if (i != 0) {
        }
        return rVar.f38717n;
    }
}

package R7;

import T7.u;
import T7.v;
import g1.C4523c;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final v f2879a = new v("NONE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final v f2880b = new v("PENDING", 0);

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
    /* JADX WARN: Type inference failed for: r9v4, types: [Q7.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Q7.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0090 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, Q7.o oVar, boolean z8, AbstractC5219c abstractC5219c) {
        d dVar;
        int i;
        Q7.b bVar;
        Q7.o oVar2;
        Q7.b bVar2;
        c cVar2;
        Q7.o oVar3;
        try {
            if (abstractC5219c instanceof d) {
                dVar = (d) abstractC5219c;
                int i4 = dVar.f2848y;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    dVar.f2848y = i4 - Integer.MIN_VALUE;
                    Object obj = dVar.f2847x;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = dVar.f2848y;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        Q7.c cVar3 = oVar.f2776w;
                        cVar3.getClass();
                        bVar = new Q7.b(cVar3);
                        oVar3 = oVar;
                        dVar.f2843n = cVar;
                        dVar.f2844u = oVar3;
                        dVar.f2845v = bVar;
                        dVar.f2846w = z8;
                        dVar.f2848y = 1;
                        obj = bVar.b(dVar);
                        if (obj != enumC5179a) {
                        }
                    } else if (i == 1) {
                        z8 = dVar.f2846w;
                        bVar2 = dVar.f2845v;
                        ?? r9 = dVar.f2844u;
                        cVar2 = dVar.f2843n;
                        com.bumptech.glide.f.r(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z8 = dVar.f2846w;
                        bVar2 = dVar.f2845v;
                        ?? r92 = dVar.f2844u;
                        cVar2 = dVar.f2843n;
                        com.bumptech.glide.f.r(obj);
                        Q7.o oVar4 = r92;
                        c cVar4 = cVar2;
                        bVar = bVar2;
                        cVar = cVar4;
                        oVar3 = oVar4;
                        dVar.f2843n = cVar;
                        dVar.f2844u = oVar3;
                        dVar.f2845v = bVar;
                        dVar.f2846w = z8;
                        dVar.f2848y = 1;
                        obj = bVar.b(dVar);
                        if (obj != enumC5179a) {
                            return enumC5179a;
                        }
                        Q7.b bVar3 = bVar;
                        cVar2 = cVar;
                        bVar2 = bVar3;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z8) {
                                oVar2.a(null);
                            }
                            return q7.v.f40183a;
                        }
                        Object obj2 = bVar2.f2735n;
                        v vVar = Q7.e.f2763p;
                        if (obj2 == vVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.f2735n = vVar;
                        if (obj2 == Q7.e.f2759l) {
                            Throwable p6 = bVar2.f2737v.p();
                            int i9 = u.f3167a;
                            throw p6;
                        }
                        dVar.f2843n = cVar2;
                        dVar.f2844u = oVar2;
                        dVar.f2845v = bVar2;
                        dVar.f2846w = z8;
                        dVar.f2848y = 2;
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
                if (z8) {
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
        dVar = new d(abstractC5219c);
        Object obj3 = dVar.f2847x;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = dVar.f2848y;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C4523c c4523c, AbstractC5219c abstractC5219c) {
        j jVar;
        int i;
        r rVar;
        S7.a e6;
        i iVar;
        if (abstractC5219c instanceof j) {
            jVar = (j) abstractC5219c;
            int i4 = jVar.f2868w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jVar.f2868w = i4 - Integer.MIN_VALUE;
                Object obj = jVar.f2867v;
                Object obj2 = EnumC5179a.f41704n;
                i = jVar.f2868w;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    r rVar2 = new r();
                    i iVar2 = new i(0, rVar2);
                    try {
                        jVar.f2865n = rVar2;
                        jVar.f2866u = iVar2;
                        jVar.f2868w = 1;
                        if (c4523c.j(iVar2, jVar) == obj2) {
                            return obj2;
                        }
                        rVar = rVar2;
                    } catch (S7.a e9) {
                        rVar = rVar2;
                        e6 = e9;
                        iVar = iVar2;
                        if (e6.f2979n != iVar) {
                            throw e6;
                        }
                        return rVar.f38861n;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = jVar.f2866u;
                    rVar = jVar.f2865n;
                    try {
                        com.bumptech.glide.f.r(obj);
                    } catch (S7.a e10) {
                        e6 = e10;
                        if (e6.f2979n != iVar) {
                        }
                        return rVar.f38861n;
                    }
                }
                return rVar.f38861n;
            }
        }
        jVar = new j(abstractC5219c);
        Object obj3 = jVar.f2867v;
        Object obj22 = EnumC5179a.f41704n;
        i = jVar.f2868w;
        if (i != 0) {
        }
        return rVar.f38861n;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class dnu implements ufg {
    public final drf a;
    public final oq7 b;
    public final dy6 c;
    public final z66 d;
    public final xdr e;
    public String f;
    public final qqi g;

    public dnu(drf drfVar, oq7 oq7Var, dy6 dy6Var, z66 z66Var) {
        drfVar.getClass();
        oq7Var.getClass();
        dy6Var.getClass();
        z66Var.getClass();
        this.a = drfVar;
        this.b = oq7Var;
        this.c = dy6Var;
        this.d = z66Var;
        this.e = ydr.a(tmu.a);
        this.g = rqi.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x004f, code lost:
    
        if (r8.a(r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:30:0x0052, B:33:0x0057), top: B:29:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [oqi] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [oqi] */
    /* JADX WARN: Type inference failed for: r4v4, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(dnu dnuVar, cg6 cg6Var) {
        cnu cnuVar;
        int i;
        qqi qqiVar;
        int i2;
        ?? r0;
        amu amuVar;
        String str;
        try {
            if (cg6Var instanceof cnu) {
                cnuVar = (cnu) cg6Var;
                int i3 = cnuVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    cnuVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = cnuVar.l;
                    nm6 nm6Var = nm6.a;
                    i = cnuVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = dnuVar.g;
                        cnuVar.j = qqiVar;
                        i2 = 0;
                        cnuVar.k = 0;
                        cnuVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r0 = cnuVar.j;
                            try {
                                qgg.h0(obj);
                                r0 = r0;
                                amuVar = (amu) obj;
                                if (amuVar != null && (str = amuVar.a) != null) {
                                    dnuVar.f = str;
                                }
                                qqiVar = r0;
                                qqiVar.b(null);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                r0.b(null);
                                throw th;
                            }
                        }
                        i2 = cnuVar.k;
                        ?? r4 = cnuVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    if (dnuVar.f == null) {
                        qqiVar.b(null);
                        return Unit.a;
                    }
                    dy6 dy6Var = dnuVar.c;
                    cnuVar.j = qqiVar;
                    cnuVar.k = i2;
                    cnuVar.n = 2;
                    Object a = dy6Var.a(cnuVar);
                    if (a != nm6Var) {
                        r0 = qqiVar;
                        obj = a;
                        amuVar = (amu) obj;
                        if (amuVar != null) {
                            dnuVar.f = str;
                        }
                        qqiVar = r0;
                        qqiVar.b(null);
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            if (dnuVar.f == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = qqiVar;
            r0.b(null);
            throw th;
        }
        cnuVar = new cnu(dnuVar, cg6Var);
        Object obj2 = cnuVar.l;
        nm6 nm6Var2 = nm6.a;
        i = cnuVar.n;
        if (i != 0) {
        }
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a;
    }

    @Override // defpackage.ufg
    public final pjc f(mm6 mm6Var, boolean z) {
        mm6Var.getClass();
        Continuation continuation = null;
        return zsd.Q(zsd.b0(new y4s(this.b.a.c, 16)), new eno(new h0t(this, continuation, 10)), this.d.c(), new a35(this, continuation, 9));
    }
}

package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.b0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.s0;
import com.yandex.media.ynison.service.w;
import com.yandex.media.ynison.service.x;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class gsw {
    public final qrw a;
    public final qsw b;
    public final kmw c;
    public final amw d;
    public final jyr e;
    public final slw f;
    public final ndw g;
    public final rgw h;

    public gsw(qrw qrwVar, qsw qswVar, kmw kmwVar, amw amwVar, jyr jyrVar, slw slwVar, ndw ndwVar, rgw rgwVar) {
        this.a = qrwVar;
        this.b = qswVar;
        this.c = kmwVar;
        this.d = amwVar;
        this.e = jyrVar;
        this.f = slwVar;
        this.g = ndwVar;
        this.h = rgwVar;
    }

    public static /* synthetic */ Object c(gsw gswVar, cg6 cg6Var) {
        qrw qrwVar = gswVar.a;
        return gswVar.b(qrwVar.a(qrwVar.a.b()), cg6Var);
    }

    public static a0 e(gsw gswVar) {
        s0 a = gswVar.a.a(0L);
        qrl q = c0.q();
        q.j(0L);
        q.h(0L);
        q.i(true);
        q.d();
        c0.h((c0) q.b, 1.0d);
        q.k(a);
        c0 c0Var = (c0) q.b();
        w R = t7g.R(-1, avf.G("restored"), weo.t());
        c5b c5bVar = c5b.a;
        wnl i = b0.i();
        i.d();
        b0.f((b0) i.b, 2);
        x K = v7g.K(R, -1, c5bVar, null, null, null, (b0) i.b(), null, a, null);
        pnl n = a0.n();
        n.j(c0Var);
        n.i(K);
        return (a0) n.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r9 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r9 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        csw cswVar;
        int i;
        if (cg6Var instanceof csw) {
            cswVar = (csw) cg6Var;
            int i2 = cswVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cswVar.l = i2 - Integer.MIN_VALUE;
                csw cswVar2 = cswVar;
                Object obj = cswVar2.j;
                Object obj2 = nm6.a;
                i = cswVar2.l;
                if (i == 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        a0 a0Var = (a0) obj;
                        return a0Var == null ? e(this) : a0Var;
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a0 a0Var2 = (a0) obj;
                    return a0Var2 == null ? e(this) : a0Var2;
                }
                qgg.h0(obj);
                s0 a = this.a.a(this.b.a().a);
                cyk[] cykVarArr = {cyk.a};
                kmw kmwVar = this.c;
                if (kmwVar.a(cykVarArr)) {
                    jmw jmwVar = (jmw) this.e.getValue();
                    cswVar2.l = 1;
                    obj = jmwVar.a(cswVar2);
                } else {
                    if (kmwVar.a(cyk.c, cyk.d)) {
                        return e(this);
                    }
                    cswVar2.l = 2;
                    obj = d(a, 5000L, 500L, cswVar2);
                }
                return obj2;
            }
        }
        cswVar = new csw(this, cg6Var);
        csw cswVar22 = cswVar;
        Object obj3 = cswVar22.j;
        Object obj22 = nm6.a;
        i = cswVar22.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(s0 s0Var, cg6 cg6Var) {
        dsw dswVar;
        int i;
        int i2;
        s0 s0Var2;
        dsw dswVar2;
        int i3;
        a0 a0Var;
        if (cg6Var instanceof dsw) {
            dswVar = (dsw) cg6Var;
            int i4 = dswVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dswVar.n = i4 - Integer.MIN_VALUE;
                Object obj = dswVar.l;
                Object obj2 = nm6.a;
                i = dswVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    i2 = 0;
                    s0Var2 = s0Var;
                    dswVar2 = dswVar;
                    int i5 = i2 + 1;
                    if (i5 <= 10) {
                    }
                    dswVar2.j = s0Var2;
                    dswVar2.k = i3;
                    dswVar2.n = 1;
                    obj = d(s0Var2, 5000L, i3 * 500, dswVar2);
                    if (obj == obj2) {
                    }
                    a0Var = (a0) obj;
                    if (a0Var != null) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = dswVar.k;
                    s0 s0Var3 = dswVar.j;
                    qgg.h0(obj);
                    dswVar2 = dswVar;
                    s0Var2 = s0Var3;
                    a0Var = (a0) obj;
                    if (a0Var != null) {
                        return a0Var;
                    }
                    i2 = i3;
                    int i52 = i2 + 1;
                    i3 = i52 <= 10 ? i52 : 10;
                    dswVar2.j = s0Var2;
                    dswVar2.k = i3;
                    dswVar2.n = 1;
                    obj = d(s0Var2, 5000L, i3 * 500, dswVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                    a0Var = (a0) obj;
                    if (a0Var != null) {
                    }
                }
            }
        }
        dswVar = new dsw(this, cg6Var);
        Object obj3 = dswVar.l;
        Object obj22 = nm6.a;
        i = dswVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(s0 s0Var, long j, long j2, cg6 cg6Var) {
        esw eswVar;
        int i;
        a0 a0Var;
        if (cg6Var instanceof esw) {
            eswVar = (esw) cg6Var;
            int i2 = eswVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eswVar.l = i2 - Integer.MIN_VALUE;
                esw eswVar2 = eswVar;
                Object obj = eswVar2.j;
                nm6 nm6Var = nm6.a;
                i = eswVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    f84 f84Var = new f84(this, s0Var, j2, (Continuation) null, 9);
                    eswVar2.l = 1;
                    obj = tyf.L(j, f84Var, eswVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                a0Var = (a0) obj;
                if (a0Var == null) {
                    g4q g4qVar = this.d.b().a;
                    if (g4qVar != null) {
                        if ((((Boolean) zdg.p(g4qVar, new o6m(8))).booleanValue() ? g4qVar : null) != null) {
                            osw oswVar = this.g.a;
                            oswVar.getClass();
                            vdw[] vdwVarArr = vdw.a;
                            e5b e5bVar = e5b.a;
                            e5bVar.getClass();
                            oswVar.a("YNISON_ERROR_LOCALLY_NOTHING_TO_PLAY", e5bVar);
                        }
                    }
                    nmb nmbVar = w64.a;
                    w64.b(ulb.Logic, w64.a("YnisonCollectorException", "nothing playing"));
                }
                return a0Var;
            }
        }
        eswVar = new esw(this, cg6Var);
        esw eswVar22 = eswVar;
        Object obj2 = eswVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = eswVar22.l;
        if (i != 0) {
        }
        a0Var = (a0) obj2;
        if (a0Var == null) {
        }
        return a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r14 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r9 = r12;
        r12 = r11;
        r11 = r14;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        r12 = r12.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
    
        if (r12 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        r0.j = null;
        r0.k = null;
        r0.l = r11;
        r0.m = r14;
        r0.p = 3;
        r14 = defpackage.u1g.T(r12, r4, r9, r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r14 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        if (r14 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0065, code lost:
    
        if (r14 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0080, code lost:
    
        if (r14 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(amw amwVar, s0 s0Var, boolean z, cg6 cg6Var) {
        fsw fswVar;
        int i;
        xlw b;
        c0 c0Var;
        if (cg6Var instanceof fsw) {
            fswVar = (fsw) cg6Var;
            int i2 = fswVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fswVar.p = i2 - Integer.MIN_VALUE;
                Object obj = fswVar.n;
                nm6 nm6Var = nm6.a;
                i = fswVar.p;
                rgw rgwVar = this.h;
                slw slwVar = this.f;
                if (i != 0) {
                    qgg.h0(obj);
                    b = amwVar.b();
                    if (z) {
                        fswVar.j = s0Var;
                        fswVar.k = b;
                        fswVar.m = z;
                        fswVar.p = 1;
                        obj = w1g.D(b, slwVar, s0Var, fswVar);
                    } else {
                        fswVar.j = s0Var;
                        fswVar.k = b;
                        fswVar.m = z;
                        fswVar.p = 2;
                        obj = w1g.C(b, slwVar, s0Var, rgwVar, fswVar);
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    z = fswVar.m;
                    b = fswVar.k;
                    s0Var = fswVar.j;
                    qgg.h0(obj);
                    c0Var = (c0) obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0 c0Var2 = fswVar.l;
                        qgg.h0(obj);
                        x xVar = (x) obj;
                        if (xVar != null) {
                            boolean z2 = xVar.r() >= 0;
                            if (xVar.z() <= 0 || !z2) {
                                c0Var2.getClass();
                                if (!c0Var2.m()) {
                                    qrl r = c0.r(c0Var2);
                                    r.getClass();
                                    r.i(true);
                                    c0Var2 = (c0) r.b();
                                }
                            }
                            c0Var2.getClass();
                            pnl n = a0.n();
                            n.j(c0Var2);
                            n.i(xVar);
                            return (a0) n.b();
                        }
                        return null;
                    }
                    z = fswVar.m;
                    b = fswVar.k;
                    s0Var = fswVar.j;
                    qgg.h0(obj);
                    c0Var = (c0) obj;
                }
            }
        }
        fswVar = new fsw(this, cg6Var);
        Object obj2 = fswVar.n;
        nm6 nm6Var2 = nm6.a;
        i = fswVar.p;
        rgw rgwVar2 = this.h;
        slw slwVar2 = this.f;
        if (i != 0) {
        }
    }
}

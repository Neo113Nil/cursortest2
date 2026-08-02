package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class uol {
    public static final String m = f1d.g("SharedPlaybackCore:", "PlayerStateOwner");
    public final lum a;
    public final pjc b;
    public final x6l c;
    public final xdh d;
    public final evk e;
    public final tf6 f;
    public final qqi g;
    public rar h;
    public final x0q i;
    public final fkn j;
    public final fkn k;
    public final qzc l;

    public uol(lum lumVar, pjc pjcVar, x6l x6lVar, xdh xdhVar, x0q x0qVar, a aVar, mka mkaVar, evk evkVar) {
        pjcVar.getClass();
        aVar.getClass();
        this.a = lumVar;
        this.b = pjcVar;
        this.c = x6lVar;
        this.d = xdhVar;
        this.e = evkVar;
        tf6 e = gld.e(e.c(a4g.n(), aVar).plus(new im6(m)));
        this.f = e;
        this.g = rqi.a();
        x0q x0qVar2 = (x0q) xdhVar.c;
        this.i = x0qVar2;
        f9l f9lVar = new f9l(1, new a1l(x0qVar2, 21));
        h4q h4qVar = h4q.b;
        t7l t7lVar = lbq.a;
        this.j = zsd.F0(f9lVar, e, t7lVar, h4qVar);
        this.k = zsd.F0(new f9l(2, new a1l(x0qVar2, 22)), e, t7lVar, n4q.b);
        ox6.B(x0qVar, e, new gfl(2, this));
        this.l = new qzc(22, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        ynl ynlVar;
        int i;
        uol uolVar;
        long longValue;
        if (cg6Var instanceof ynl) {
            ynlVar = (ynl) cg6Var;
            int i2 = ynlVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ynlVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ynlVar.k;
                nm6 nm6Var = nm6.a;
                i = ynlVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ynlVar.j = this;
                    ynlVar.m = 1;
                    obj = x97.V(dm6.b(), new r0r((cr) this.a.a, null, 0), ynlVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    uolVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uolVar = ynlVar.j;
                    qgg.h0(obj);
                }
                longValue = ((Number) obj).longValue();
                uolVar.getClass();
                if (longValue < 0) {
                    longValue = 0;
                }
                return new Long(longValue);
            }
        }
        ynlVar = new ynl(this, cg6Var);
        Object obj2 = ynlVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ynlVar.m;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        uolVar.getClass();
        if (longValue < 0) {
        }
        return new Long(longValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        znl znlVar;
        int i;
        uol uolVar;
        long longValue;
        if (cg6Var instanceof znl) {
            znlVar = (znl) cg6Var;
            int i2 = znlVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                znlVar.m = i2 - Integer.MIN_VALUE;
                Object obj = znlVar.k;
                nm6 nm6Var = nm6.a;
                i = znlVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    znlVar.j = this;
                    znlVar.m = 1;
                    obj = x97.V(dm6.b(), new r0r((cr) this.a.a, null, 1), znlVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    uolVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uolVar = znlVar.j;
                    qgg.h0(obj);
                }
                longValue = ((Number) obj).longValue();
                uolVar.getClass();
                if (longValue < 0) {
                    longValue = 0;
                }
                return new Long(longValue);
            }
        }
        znlVar = new znl(this, cg6Var);
        Object obj2 = znlVar.k;
        nm6 nm6Var2 = nm6.a;
        i = znlVar.m;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        uolVar.getClass();
        if (longValue < 0) {
        }
        return new Long(longValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        aol aolVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        x6l x6lVar;
        try {
            if (cg6Var instanceof aol) {
                aolVar = (aol) cg6Var;
                int i3 = aolVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    aolVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = aolVar.l;
                    nm6Var = nm6.a;
                    i = aolVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.g;
                        aolVar.j = qqiVar;
                        i2 = 0;
                        aolVar.k = 0;
                        aolVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = aolVar.j;
                            try {
                                qgg.h0(obj);
                                Unit unit = Unit.a;
                                oqiVar.b(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = aolVar.k;
                        ?? r4 = aolVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    x6lVar = this.c;
                    aolVar.j = qqiVar;
                    aolVar.k = i2;
                    aolVar.n = 2;
                    if (x6lVar.f(aolVar) != nm6Var) {
                        oqiVar = qqiVar;
                        Unit unit2 = Unit.a;
                        oqiVar.b(null);
                        return unit2;
                    }
                    return nm6Var;
                }
            }
            x6lVar = this.c;
            aolVar.j = qqiVar;
            aolVar.k = i2;
            aolVar.n = 2;
            if (x6lVar.f(aolVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        aolVar = new aol(this, cg6Var);
        Object obj2 = aolVar.l;
        nm6Var = nm6.a;
        i = aolVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, uol] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(boolean z, cg6 cg6Var) {
        bol bolVar;
        nm6 nm6Var;
        ?? r1;
        boolean z2;
        oqi oqiVar;
        int i;
        Object f;
        int i2;
        boolean z3;
        oqi oqiVar2;
        lum lumVar;
        int i3;
        long j;
        oqi oqiVar3;
        l8j l8jVar;
        col colVar;
        try {
            try {
                if (cg6Var instanceof bol) {
                    bolVar = (bol) cg6Var;
                    int i4 = bolVar.q;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        bolVar.q = i4 - Integer.MIN_VALUE;
                        bol bolVar2 = bolVar;
                        Object obj = bolVar2.o;
                        nm6Var = nm6.a;
                        r1 = bolVar2.q;
                        int i5 = 0;
                        if (r1 != 0) {
                            qgg.h0(obj);
                            qqi qqiVar = this.g;
                            bolVar2.k = qqiVar;
                            z2 = z;
                            bolVar2.j = z2;
                            bolVar2.l = 0;
                            bolVar2.q = 1;
                            if (qqiVar.a(bolVar2) != nm6Var) {
                                oqiVar = qqiVar;
                                i = 0;
                            }
                            return nm6Var;
                        }
                        if (r1 != 1) {
                            if (r1 != 2) {
                                if (r1 != 3) {
                                    if (r1 != 4) {
                                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    oqi oqiVar4 = bolVar2.k;
                                    qgg.h0(obj);
                                    r1 = oqiVar4;
                                    Unit unit = Unit.a;
                                    r1.b(null);
                                    return unit;
                                }
                                j = bolVar2.n;
                                int i6 = bolVar2.m;
                                i2 = bolVar2.l;
                                z3 = bolVar2.j;
                                oqiVar3 = bolVar2.k;
                                qgg.h0(obj);
                                i3 = i6;
                                int i7 = i2;
                                boolean z4 = z3;
                                l8jVar = l8j.c;
                                colVar = new col(z4, this, j, null, 0);
                                bolVar2.k = oqiVar3;
                                bolVar2.j = z4;
                                bolVar2.l = i7;
                                bolVar2.m = i3;
                                bolVar2.n = j;
                                bolVar2.q = 4;
                                if (x97.V(l8jVar, colVar, bolVar2) != nm6Var) {
                                    r1 = oqiVar3;
                                    Unit unit2 = Unit.a;
                                    r1.b(null);
                                    return unit2;
                                }
                                return nm6Var;
                            }
                            i5 = bolVar2.m;
                            int i8 = bolVar2.l;
                            boolean z5 = bolVar2.j;
                            oqi oqiVar5 = bolVar2.k;
                            try {
                                qgg.h0(obj);
                                i2 = i8;
                                oqiVar2 = oqiVar5;
                                z3 = z5;
                                long longValue = ((Number) obj).longValue();
                                lumVar = this.a;
                                bolVar2.k = oqiVar2;
                                bolVar2.j = z3;
                                bolVar2.l = i2;
                                bolVar2.m = i5;
                                bolVar2.n = longValue;
                                bolVar2.q = 3;
                                if (lumVar.b0(bolVar2) != nm6Var) {
                                    i3 = i5;
                                    j = longValue;
                                    oqiVar3 = oqiVar2;
                                    int i72 = i2;
                                    boolean z42 = z3;
                                    l8jVar = l8j.c;
                                    colVar = new col(z42, this, j, null, 0);
                                    bolVar2.k = oqiVar3;
                                    bolVar2.j = z42;
                                    bolVar2.l = i72;
                                    bolVar2.m = i3;
                                    bolVar2.n = j;
                                    bolVar2.q = 4;
                                    if (x97.V(l8jVar, colVar, bolVar2) != nm6Var) {
                                    }
                                }
                                return nm6Var;
                            } catch (Throwable th) {
                                th = th;
                                r1 = oqiVar5;
                                r1.b(null);
                                throw th;
                            }
                        }
                        int i9 = bolVar2.l;
                        boolean z6 = bolVar2.j;
                        oqiVar = bolVar2.k;
                        qgg.h0(obj);
                        i = i9;
                        z2 = z6;
                        bolVar2.k = oqiVar;
                        bolVar2.j = z2;
                        bolVar2.l = i;
                        bolVar2.m = 0;
                        bolVar2.q = 2;
                        f = f(bolVar2);
                        if (f != nm6Var) {
                            i2 = i;
                            obj = f;
                            z3 = z2;
                            oqiVar2 = oqiVar;
                            long longValue2 = ((Number) obj).longValue();
                            lumVar = this.a;
                            bolVar2.k = oqiVar2;
                            bolVar2.j = z3;
                            bolVar2.l = i2;
                            bolVar2.m = i5;
                            bolVar2.n = longValue2;
                            bolVar2.q = 3;
                            if (lumVar.b0(bolVar2) != nm6Var) {
                            }
                        }
                        return nm6Var;
                    }
                }
                if (r1 != 0) {
                }
                bolVar2.k = oqiVar;
                bolVar2.j = z2;
                bolVar2.l = i;
                bolVar2.m = 0;
                bolVar2.q = 2;
                f = f(bolVar2);
                if (f != nm6Var) {
                }
                return nm6Var;
            } catch (Throwable th2) {
                th = th2;
                r1 = oqiVar3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        bolVar = new bol(this, cg6Var);
        bol bolVar22 = bolVar;
        Object obj2 = bolVar22.o;
        nm6Var = nm6.a;
        r1 = bolVar22.q;
        int i52 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r10.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        dol dolVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        l8j l8jVar;
        eol eolVar;
        try {
            if (cg6Var instanceof dol) {
                dolVar = (dol) cg6Var;
                int i3 = dolVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dolVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = dolVar.l;
                    nm6Var = nm6.a;
                    i = dolVar.n;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.g;
                        dolVar.j = qqiVar;
                        i2 = 0;
                        dolVar.k = 0;
                        dolVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = dolVar.j;
                            try {
                                qgg.h0(obj);
                                Unit unit = Unit.a;
                                oqiVar.b(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = dolVar.k;
                        ?? r4 = dolVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    l8jVar = l8j.c;
                    eolVar = new eol(this, continuation, 0);
                    dolVar.j = qqiVar;
                    dolVar.k = i2;
                    dolVar.n = 2;
                    if (x97.V(l8jVar, eolVar, dolVar) != nm6Var) {
                        oqiVar = qqiVar;
                        Unit unit2 = Unit.a;
                        oqiVar.b(null);
                        return unit2;
                    }
                    return nm6Var;
                }
            }
            l8jVar = l8j.c;
            eolVar = new eol(this, continuation, 0);
            dolVar.j = qqiVar;
            dolVar.k = i2;
            dolVar.n = 2;
            if (x97.V(l8jVar, eolVar, dolVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        dolVar = new dol(this, cg6Var);
        Object obj2 = dolVar.l;
        nm6Var = nm6.a;
        i = dolVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        fol folVar;
        Object obj;
        nm6 nm6Var;
        int i;
        uol uolVar;
        uol uolVar2;
        long j;
        long longValue;
        if (cg6Var instanceof fol) {
            folVar = (fol) cg6Var;
            int i2 = folVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                folVar.n = i2 - Integer.MIN_VALUE;
                obj = folVar.l;
                nm6Var = nm6.a;
                i = folVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    folVar.j = this;
                    folVar.n = 1;
                    obj = x97.V(dm6.b(), new r0r((cr) this.a.a, null, 5), folVar);
                    if (obj != nm6Var) {
                        uolVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = folVar.k;
                    uolVar2 = folVar.j;
                    qgg.h0(obj);
                    longValue = ((Number) obj).longValue();
                    uolVar2.getClass();
                    if (longValue <= 0) {
                        j = yhn.f(j, 0L, longValue);
                    } else if (j < 0) {
                        j = 0;
                    }
                    return new Long(j);
                }
                uolVar = folVar.j;
                qgg.h0(obj);
                long longValue2 = ((Number) obj).longValue();
                folVar.j = uolVar;
                folVar.k = longValue2;
                folVar.n = 2;
                obj = a(folVar);
                if (obj != nm6Var) {
                    uolVar2 = uolVar;
                    j = longValue2;
                    longValue = ((Number) obj).longValue();
                    uolVar2.getClass();
                    if (longValue <= 0) {
                    }
                    return new Long(j);
                }
                return nm6Var;
            }
        }
        folVar = new fol(this, cg6Var);
        obj = folVar.l;
        nm6Var = nm6.a;
        i = folVar.n;
        if (i != 0) {
        }
        long longValue22 = ((Number) obj).longValue();
        folVar.j = uolVar;
        folVar.k = longValue22;
        folVar.n = 2;
        obj = a(folVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    public final long g() {
        lum lumVar = this.a;
        long g = ((s5d) ((cr) lumVar.a).h).g();
        long h = ((s5d) ((cr) lumVar.a).h).h();
        long j = h < 0 ? 0L : h;
        if (j > 0) {
            return yhn.f(g, 0L, j);
        }
        if (g < 0) {
            return 0L;
        }
        return g;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(8:(2:3|(11:5|6|7|(1:(1:(1:(1:(1:(7:14|15|16|(2:18|19)(1:25)|20|21|22)(2:30|31))(10:32|33|34|35|37|38|(1:40)(1:48)|(1:42)(1:46)|(5:45|(0)(0)|20|21|22)|44))(6:53|54|55|56|(7:58|35|37|38|(0)(0)|(0)(0)|(0))|44))(11:60|61|62|63|64|(2:66|(2:68|44))|69|55|56|(0)|44))(1:70))(3:82|(1:84)|44)|71|72|(1:74)|75|76|(8:78|63|64|(0)|69|55|56|(0))|44))|71|72|(0)|75|76|(0)|44)|87|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x007b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x007c, code lost:
    
        r2 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cf A[Catch: all -> 0x01f6, TRY_LEAVE, TryCatch #1 {all -> 0x01f6, blocks: (B:38:0x017c, B:46:0x01cf, B:48:0x01ca), top: B:37:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ca A[Catch: all -> 0x01f6, TryCatch #1 {all -> 0x01f6, blocks: (B:38:0x017c, B:46:0x01cf, B:48:0x01ca), top: B:37:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f A[Catch: all -> 0x007b, TryCatch #2 {all -> 0x007b, blocks: (B:54:0x0076, B:56:0x0150, B:61:0x008e, B:64:0x011b, B:66:0x012f), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9 A[Catch: all -> 0x00de, TryCatch #4 {all -> 0x00de, blocks: (B:72:0x00d5, B:74:0x00d9, B:75:0x00e2), top: B:71:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(n7q n7qVar, long j, boolean z, boolean z2, hln hlnVar, cg6 cg6Var) {
        gol golVar;
        Object obj;
        int i;
        oqi oqiVar;
        n7q n7qVar2;
        long j2;
        boolean z3;
        boolean z4;
        hln hlnVar2;
        int i2;
        oqi oqiVar2;
        rar rarVar;
        lum lumVar;
        n7q n7qVar3;
        gol golVar2;
        boolean z5;
        long j3;
        boolean z6;
        long j4;
        boolean z7;
        boolean z8;
        oqi oqiVar3;
        hln hlnVar3;
        n7q n7qVar4;
        int i3;
        boolean booleanValue;
        rar rarVar2;
        boolean z9;
        int i4;
        hln hlnVar4;
        xdh xdhVar;
        oqi oqiVar4;
        long j5;
        Object L;
        boolean z10;
        try {
            if (cg6Var instanceof gol) {
                golVar = (gol) cg6Var;
                int i5 = golVar.x;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    golVar.x = i5 - Integer.MIN_VALUE;
                    Object obj2 = golVar.v;
                    obj = nm6.a;
                    i = golVar.x;
                    int i6 = 0;
                    if (i != 0) {
                        qgg.h0(obj2);
                        n7qVar2 = n7qVar;
                        golVar.j = n7qVar2;
                        golVar.k = hlnVar;
                        qqi qqiVar = this.g;
                        golVar.l = qqiVar;
                        j2 = j;
                        golVar.p = j2;
                        z3 = z;
                        golVar.q = z3;
                        z4 = z2;
                        golVar.r = z4;
                        golVar.t = 0;
                        golVar.x = 1;
                        if (qqiVar.a(golVar) != obj) {
                            hlnVar2 = hlnVar;
                            i2 = 0;
                            oqiVar2 = qqiVar;
                        }
                        return obj;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            i6 = golVar.u;
                            i2 = golVar.t;
                            boolean z11 = golVar.r;
                            z7 = golVar.q;
                            j4 = golVar.p;
                            oqiVar3 = golVar.l;
                            hlnVar3 = golVar.k;
                            n7qVar4 = golVar.j;
                            qgg.h0(obj2);
                            z8 = z11;
                            i3 = i2;
                            booleanValue = ((Boolean) this.e.invoke(n7qVar4.b())).booleanValue();
                            rarVar2 = this.h;
                            if (rarVar2 != null) {
                                golVar.j = n7qVar4;
                                golVar.k = hlnVar3;
                                golVar.l = oqiVar3;
                                golVar.p = j4;
                                golVar.q = z7;
                                golVar.r = z8;
                                golVar.t = i3;
                                golVar.u = i6;
                                golVar.s = booleanValue;
                                golVar.x = 3;
                                if (rarVar2.j0(golVar) == obj) {
                                    return obj;
                                }
                            }
                            z9 = z8;
                            i4 = i3;
                            hlnVar4 = hlnVar3;
                            xdhVar = this.d;
                            golVar.j = null;
                            golVar.k = null;
                            golVar.l = oqiVar3;
                            golVar.m = hlnVar4;
                            golVar.n = n7qVar4;
                            golVar.o = xdhVar;
                            golVar.p = j4;
                            golVar.q = z7;
                            golVar.r = z9;
                            golVar.t = i4;
                            golVar.u = i6;
                            golVar.s = booleanValue;
                            golVar.x = 4;
                            obj2 = f(golVar);
                            if (obj2 != obj) {
                            }
                            return obj;
                        }
                        if (i == 3) {
                            booleanValue = golVar.s;
                            i6 = golVar.u;
                            i3 = golVar.t;
                            z9 = golVar.r;
                            z7 = golVar.q;
                            j4 = golVar.p;
                            oqiVar3 = golVar.l;
                            hlnVar3 = golVar.k;
                            n7qVar4 = golVar.j;
                            qgg.h0(obj2);
                            i4 = i3;
                            hlnVar4 = hlnVar3;
                            xdhVar = this.d;
                            golVar.j = null;
                            golVar.k = null;
                            golVar.l = oqiVar3;
                            golVar.m = hlnVar4;
                            golVar.n = n7qVar4;
                            golVar.o = xdhVar;
                            golVar.p = j4;
                            golVar.q = z7;
                            golVar.r = z9;
                            golVar.t = i4;
                            golVar.u = i6;
                            golVar.s = booleanValue;
                            golVar.x = 4;
                            obj2 = f(golVar);
                            if (obj2 != obj) {
                                long j6 = j4;
                                oqiVar4 = oqiVar3;
                                j5 = j6;
                                long longValue = ((Number) obj2).longValue();
                                golVar.j = null;
                                golVar.k = null;
                                golVar.l = oqiVar4;
                                golVar.m = null;
                                golVar.n = null;
                                golVar.o = null;
                                golVar.p = j5;
                                golVar.q = z7;
                                golVar.r = z9;
                                golVar.t = i4;
                                golVar.u = i6;
                                golVar.s = booleanValue;
                                golVar.x = 5;
                                vdr vdrVar = (vdr) xdhVar.a;
                                x0q x0qVar = (x0q) xdhVar.b;
                                vdrVar.getClass();
                                x0qVar.getClass();
                                n7qVar4.getClass();
                                es6 es6Var = new es6();
                                es6Var.a = vdrVar;
                                es6Var.b = x0qVar;
                                es6Var.c = n7qVar4;
                                xdhVar.d = es6Var;
                                L = es6Var.L(new l8l(es6Var.O(), longValue, hlnVar4), golVar);
                                if (L == obj) {
                                }
                                if (L == obj) {
                                }
                                if (L != obj) {
                                }
                            }
                            return obj;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z10 = golVar.s;
                            oqiVar = golVar.l;
                            try {
                                qgg.h0(obj2);
                                if (!z10) {
                                    this.h = x97.y(this.f, null, pm6.d, new eol(this, null, 1), 1);
                                }
                                Unit unit = Unit.a;
                                oqiVar.b(null);
                                return unit;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        booleanValue = golVar.s;
                        i6 = golVar.u;
                        i4 = golVar.t;
                        z9 = golVar.r;
                        z7 = golVar.q;
                        j5 = golVar.p;
                        xdhVar = golVar.o;
                        n7qVar4 = golVar.n;
                        hlnVar4 = golVar.m;
                        oqiVar4 = golVar.l;
                        try {
                            qgg.h0(obj2);
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar = oqiVar4;
                            oqiVar.b(null);
                            throw th;
                        }
                        try {
                            long longValue2 = ((Number) obj2).longValue();
                            golVar.j = null;
                            golVar.k = null;
                            golVar.l = oqiVar4;
                            golVar.m = null;
                            golVar.n = null;
                            golVar.o = null;
                            golVar.p = j5;
                            golVar.q = z7;
                            golVar.r = z9;
                            golVar.t = i4;
                            golVar.u = i6;
                            golVar.s = booleanValue;
                            golVar.x = 5;
                            vdr vdrVar2 = (vdr) xdhVar.a;
                            x0q x0qVar2 = (x0q) xdhVar.b;
                            vdrVar2.getClass();
                            x0qVar2.getClass();
                            n7qVar4.getClass();
                            es6 es6Var2 = new es6();
                            es6Var2.a = vdrVar2;
                            es6Var2.b = x0qVar2;
                            es6Var2.c = n7qVar4;
                            xdhVar.d = es6Var2;
                            L = es6Var2.L(new l8l(es6Var2.O(), longValue2, hlnVar4), golVar);
                            if (L == obj) {
                                L = Unit.a;
                            }
                            if (L == obj) {
                                L = Unit.a;
                            }
                            if (L != obj) {
                                z10 = booleanValue;
                                oqiVar = oqiVar4;
                                if (!z10) {
                                }
                                Unit unit2 = Unit.a;
                                oqiVar.b(null);
                                return unit2;
                            }
                            return obj;
                        } catch (Throwable th3) {
                            th = th3;
                            oqiVar = oqiVar4;
                            oqiVar.b(null);
                            throw th;
                        }
                    }
                    i2 = golVar.t;
                    boolean z12 = golVar.r;
                    boolean z13 = golVar.q;
                    long j7 = golVar.p;
                    oqiVar2 = golVar.l;
                    hlnVar2 = golVar.k;
                    n7q n7qVar5 = golVar.j;
                    qgg.h0(obj2);
                    n7qVar2 = n7qVar5;
                    z3 = z13;
                    j2 = j7;
                    z4 = z12;
                    rarVar = this.h;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    lumVar = this.a;
                    golVar.j = n7qVar2;
                    golVar.k = hlnVar2;
                    golVar.l = oqiVar2;
                    golVar.p = j2;
                    golVar.q = z3;
                    golVar.r = z4;
                    golVar.t = i2;
                    golVar.u = 0;
                    golVar.x = 2;
                    n7qVar3 = n7qVar2;
                    golVar2 = golVar;
                    z5 = z3;
                    j3 = j2;
                    z6 = z4;
                    j4 = j3;
                    golVar = golVar2;
                    if (lumVar.d0(n7qVar3, j3, z5, z6, golVar2) != obj) {
                        z7 = z5;
                        z8 = z6;
                        oqiVar3 = oqiVar2;
                        hlnVar3 = hlnVar2;
                        n7qVar4 = n7qVar3;
                        i3 = i2;
                        booleanValue = ((Boolean) this.e.invoke(n7qVar4.b())).booleanValue();
                        rarVar2 = this.h;
                        if (rarVar2 != null) {
                        }
                        z9 = z8;
                        i4 = i3;
                        hlnVar4 = hlnVar3;
                        xdhVar = this.d;
                        golVar.j = null;
                        golVar.k = null;
                        golVar.l = oqiVar3;
                        golVar.m = hlnVar4;
                        golVar.n = n7qVar4;
                        golVar.o = xdhVar;
                        golVar.p = j4;
                        golVar.q = z7;
                        golVar.r = z9;
                        golVar.t = i4;
                        golVar.u = i6;
                        golVar.s = booleanValue;
                        golVar.x = 4;
                        obj2 = f(golVar);
                        if (obj2 != obj) {
                        }
                    }
                    return obj;
                }
            }
            rarVar = this.h;
            if (rarVar != null) {
            }
            lumVar = this.a;
            golVar.j = n7qVar2;
            golVar.k = hlnVar2;
            golVar.l = oqiVar2;
            golVar.p = j2;
            golVar.q = z3;
            golVar.r = z4;
            golVar.t = i2;
            golVar.u = 0;
            golVar.x = 2;
            n7qVar3 = n7qVar2;
            golVar2 = golVar;
            z5 = z3;
            j3 = j2;
            z6 = z4;
            j4 = j3;
            golVar = golVar2;
            if (lumVar.d0(n7qVar3, j3, z5, z6, golVar2) != obj) {
            }
            return obj;
        } catch (Throwable th4) {
            th = th4;
            oqiVar = oqiVar2;
            oqiVar.b(null);
            throw th;
        }
        golVar = new gol(this, cg6Var);
        Object obj22 = golVar.v;
        obj = nm6.a;
        i = golVar.x;
        int i62 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1 A[Catch: all -> 0x004f, TryCatch #3 {all -> 0x004f, blocks: (B:28:0x004a, B:30:0x00f6, B:39:0x00dd, B:41:0x00e1, B:49:0x006c, B:50:0x00ae, B:56:0x00d5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[Catch: all -> 0x004f, TryCatch #3 {all -> 0x004f, blocks: (B:28:0x004a, B:30:0x00f6, B:39:0x00dd, B:41:0x00e1, B:49:0x006c, B:50:0x00ae, B:56:0x00d5), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0091 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:59:0x008d, B:61:0x0091, B:62:0x009b), top: B:58:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r13v0, types: [uol] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(cg6 cg6Var) {
        hol holVar;
        nm6 nm6Var;
        int i;
        ?? r7;
        oqi oqiVar;
        oqi oqiVar2;
        int i2;
        rar rarVar;
        Object f;
        oqi oqiVar3;
        Object V;
        int i3;
        int i4;
        long j;
        oqi oqiVar4;
        rar rarVar2;
        int i5;
        int i6;
        xdh xdhVar;
        oqi oqiVar5;
        try {
            try {
                if (cg6Var instanceof hol) {
                    holVar = (hol) cg6Var;
                    int i7 = holVar.p;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        holVar.p = i7 - Integer.MIN_VALUE;
                        Object obj = holVar.n;
                        nm6Var = nm6.a;
                        i = holVar.p;
                        int i8 = 0;
                        r7 = 2;
                        Continuation continuation = null;
                        if (i != 0) {
                            qgg.h0(obj);
                            oqiVar2 = this.g;
                            holVar.j = oqiVar2;
                            holVar.k = 0;
                            holVar.p = 1;
                            if (oqiVar2.a(holVar) != nm6Var) {
                                i2 = 0;
                            }
                            return nm6Var;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                i8 = holVar.l;
                                i2 = holVar.k;
                                oqi oqiVar6 = holVar.j;
                                qgg.h0(obj);
                                oqiVar3 = oqiVar6;
                                long longValue = ((Number) obj).longValue();
                                lum lumVar = this.a;
                                holVar.j = oqiVar3;
                                holVar.k = i2;
                                holVar.l = i8;
                                holVar.m = longValue;
                                holVar.p = 3;
                                V = x97.V(dm6.b(), new r0r((cr) lumVar.a, continuation, 6), holVar);
                                if (V == nm6Var) {
                                    V = Unit.a;
                                }
                                if (V != nm6Var) {
                                    return nm6Var;
                                }
                                i3 = i2;
                                i4 = i8;
                                j = longValue;
                                oqiVar4 = oqiVar3;
                                rarVar2 = this.h;
                                r7 = oqiVar4;
                                if (rarVar2 != null) {
                                }
                                this.h = null;
                                xdhVar = this.d;
                                holVar.j = r7;
                                holVar.k = i3;
                                holVar.l = i4;
                                holVar.m = j;
                                holVar.p = 5;
                                if (xdhVar.D(j, holVar) != nm6Var) {
                                }
                                return nm6Var;
                            }
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    oqiVar = holVar.j;
                                    try {
                                        qgg.h0(obj);
                                        Unit unit = Unit.a;
                                        oqiVar.b(null);
                                        return unit;
                                    } catch (Throwable th) {
                                        th = th;
                                        oqiVar.b(null);
                                        throw th;
                                    }
                                }
                                j = holVar.m;
                                i5 = holVar.l;
                                i6 = holVar.k;
                                oqi oqiVar7 = holVar.j;
                                qgg.h0(obj);
                                oqiVar5 = oqiVar7;
                                i3 = i6;
                                i4 = i5;
                                r7 = oqiVar5;
                                this.h = null;
                                xdhVar = this.d;
                                holVar.j = r7;
                                holVar.k = i3;
                                holVar.l = i4;
                                holVar.m = j;
                                holVar.p = 5;
                                if (xdhVar.D(j, holVar) != nm6Var) {
                                    oqiVar = r7;
                                    Unit unit2 = Unit.a;
                                    oqiVar.b(null);
                                    return unit2;
                                }
                                return nm6Var;
                            }
                            j = holVar.m;
                            i4 = holVar.l;
                            int i9 = holVar.k;
                            oqi oqiVar8 = holVar.j;
                            try {
                                qgg.h0(obj);
                                i3 = i9;
                                oqiVar4 = oqiVar8;
                                rarVar2 = this.h;
                                r7 = oqiVar4;
                                if (rarVar2 != null) {
                                    holVar.j = oqiVar4;
                                    holVar.k = i3;
                                    holVar.l = i4;
                                    holVar.m = j;
                                    holVar.p = 4;
                                    if (rarVar2.j0(holVar) == nm6Var) {
                                        return nm6Var;
                                    }
                                    i5 = i4;
                                    i6 = i3;
                                    oqiVar5 = oqiVar4;
                                    i3 = i6;
                                    i4 = i5;
                                    r7 = oqiVar5;
                                }
                                this.h = null;
                                xdhVar = this.d;
                                holVar.j = r7;
                                holVar.k = i3;
                                holVar.l = i4;
                                holVar.m = j;
                                holVar.p = 5;
                                if (xdhVar.D(j, holVar) != nm6Var) {
                                }
                                return nm6Var;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar = oqiVar8;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = holVar.k;
                        oqi oqiVar9 = holVar.j;
                        qgg.h0(obj);
                        oqiVar2 = oqiVar9;
                        rarVar = this.h;
                        if (rarVar != null) {
                            rarVar.g(null);
                        }
                        holVar.j = oqiVar2;
                        holVar.k = i2;
                        holVar.l = 0;
                        holVar.p = 2;
                        f = f(holVar);
                        if (f != nm6Var) {
                            oqiVar3 = oqiVar2;
                            obj = f;
                            long longValue2 = ((Number) obj).longValue();
                            lum lumVar2 = this.a;
                            holVar.j = oqiVar3;
                            holVar.k = i2;
                            holVar.l = i8;
                            holVar.m = longValue2;
                            holVar.p = 3;
                            V = x97.V(dm6.b(), new r0r((cr) lumVar2.a, continuation, 6), holVar);
                            if (V == nm6Var) {
                            }
                            if (V != nm6Var) {
                            }
                        }
                        return nm6Var;
                    }
                }
                rarVar = this.h;
                if (rarVar != null) {
                }
                holVar.j = oqiVar2;
                holVar.k = i2;
                holVar.l = 0;
                holVar.p = 2;
                f = f(holVar);
                if (f != nm6Var) {
                }
                return nm6Var;
            } catch (Throwable th3) {
                oqiVar = oqiVar2;
                th = th3;
                oqiVar.b(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
            oqiVar = r7;
        }
        holVar = new hol(this, cg6Var);
        Object obj2 = holVar.n;
        nm6Var = nm6.a;
        i = holVar.p;
        int i82 = 0;
        r7 = 2;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(3:(1:(1:(5:13|14|15|16|17)(2:20|21))(6:22|23|24|25|26|(1:28)(1:31)))(8:37|38|39|40|41|(1:43)(1:50)|(1:45)(1:49)|(2:47|30)(3:48|26|(0)(0)))|35|36)(1:54))(3:62|(1:64)|30)|55|56|(5:58|41|(0)(0)|(0)(0)|(0)(0))|30))|66|6|7|(0)(0)|55|56|(0)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        if (r14 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
    
        r11 = r14;
        r14 = r13;
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0035, code lost:
    
        r14 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:14:0x0030, B:15:0x00f2, B:26:0x00d4, B:31:0x00ed, B:41:0x00a0, B:49:0x00ce, B:50:0x00c9), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:14:0x0030, B:15:0x00f2, B:26:0x00d4, B:31:0x00ed, B:41:0x00a0, B:49:0x00ce, B:50:0x00c9), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9 A[Catch: all -> 0x0035, TryCatch #2 {all -> 0x0035, blocks: (B:14:0x0030, B:15:0x00f2, B:26:0x00d4, B:31:0x00ed, B:41:0x00a0, B:49:0x00ce, B:50:0x00c9), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [uol] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kdl] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2, types: [oqi] */
    /* JADX WARN: Type inference failed for: r13v20, types: [oqi] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8, types: [oqi] */
    /* JADX WARN: Type inference failed for: r13v9, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v5, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v7, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(kdl kdlVar, cg6 cg6Var) {
        iol iolVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        kdl kdlVar2;
        Object f;
        kdl kdlVar3;
        qqi qqiVar2;
        long longValue;
        Object V;
        int i3;
        Object A;
        if (cg6Var instanceof iol) {
            iolVar = (iol) cg6Var;
            int i4 = iolVar.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iolVar.q = i4 - Integer.MIN_VALUE;
                Object obj = iolVar.o;
                nm6Var = nm6.a;
                i = iolVar.q;
                int i5 = 0;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    iolVar.j = kdlVar;
                    qqiVar = this.g;
                    iolVar.k = qqiVar;
                    iolVar.l = 0;
                    iolVar.q = 1;
                    if (qqiVar.a(iolVar) != nm6Var) {
                        i2 = 0;
                        kdlVar2 = kdlVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        i5 = iolVar.m;
                        int i6 = iolVar.l;
                        ?? r2 = iolVar.k;
                        kdl kdlVar4 = iolVar.j;
                        try {
                            qgg.h0(obj);
                            i2 = i6;
                            qqiVar2 = r2;
                            kdlVar3 = kdlVar4;
                            longValue = ((Number) obj).longValue();
                            lum lumVar = this.a;
                            iolVar.j = kdlVar3;
                            iolVar.k = qqiVar2;
                            iolVar.l = i2;
                            iolVar.m = i5;
                            iolVar.n = longValue;
                            iolVar.q = 3;
                            V = x97.V(dm6.b(), new r0r((cr) lumVar.a, continuation, 7), iolVar);
                            if (V == nm6Var) {
                                V = Unit.a;
                            }
                            if (V == nm6Var) {
                                V = Unit.a;
                            }
                            if (V != nm6Var) {
                                return nm6Var;
                            }
                            i3 = i2;
                            kdlVar = qqiVar2;
                            xdh xdhVar = this.d;
                            iolVar.j = null;
                            iolVar.k = kdlVar;
                            iolVar.l = i3;
                            iolVar.m = i5;
                            iolVar.n = longValue;
                            iolVar.q = 4;
                            A = ((b9l) xdhVar.d).A(longValue, kdlVar3, iolVar);
                            if (A == nm6Var) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            kdlVar = r2;
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kdlVar = iolVar.k;
                            qgg.h0(obj);
                            Unit unit = Unit.a;
                            kdlVar.b(null);
                            return unit;
                        }
                        long j = iolVar.n;
                        int i7 = iolVar.m;
                        i3 = iolVar.l;
                        oqi oqiVar = iolVar.k;
                        kdlVar3 = iolVar.j;
                        try {
                            qgg.h0(obj);
                            longValue = j;
                            i5 = i7;
                            kdlVar = oqiVar;
                            xdh xdhVar2 = this.d;
                            iolVar.j = null;
                            iolVar.k = kdlVar;
                            iolVar.l = i3;
                            iolVar.m = i5;
                            iolVar.n = longValue;
                            iolVar.q = 4;
                            A = ((b9l) xdhVar2.d).A(longValue, kdlVar3, iolVar);
                            if (A == nm6Var) {
                                A = Unit.a;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            kdlVar = oqiVar;
                        }
                    }
                    kdlVar.b(null);
                    throw th;
                }
                int i8 = iolVar.l;
                ?? r22 = iolVar.k;
                kdl kdlVar5 = iolVar.j;
                qgg.h0(obj);
                qqiVar = r22;
                i2 = i8;
                kdlVar2 = kdlVar5;
                iolVar.j = kdlVar2;
                iolVar.k = qqiVar;
                iolVar.l = i2;
                iolVar.m = 0;
                iolVar.q = 2;
                f = f(iolVar);
                if (f != nm6Var) {
                    kdlVar3 = kdlVar2;
                    qqiVar2 = qqiVar;
                    obj = f;
                    longValue = ((Number) obj).longValue();
                    lum lumVar2 = this.a;
                    iolVar.j = kdlVar3;
                    iolVar.k = qqiVar2;
                    iolVar.l = i2;
                    iolVar.m = i5;
                    iolVar.n = longValue;
                    iolVar.q = 3;
                    V = x97.V(dm6.b(), new r0r((cr) lumVar2.a, continuation, 7), iolVar);
                    if (V == nm6Var) {
                    }
                    if (V == nm6Var) {
                    }
                    if (V != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        iolVar = new iol(this, cg6Var);
        Object obj2 = iolVar.o;
        nm6Var = nm6.a;
        i = iolVar.q;
        int i52 = 0;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        iolVar.j = kdlVar2;
        iolVar.k = qqiVar;
        iolVar.l = i2;
        iolVar.m = 0;
        iolVar.q = 2;
        f = f(iolVar);
        if (f != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x004f, code lost:
    
        if (r8.a(r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:25:0x0052, B:33:0x0075, B:35:0x0070), top: B:24:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:25:0x0052, B:33:0x0075, B:35:0x0070), top: B:24:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v4, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var) {
        jol jolVar;
        Object obj;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        Object V;
        try {
            if (cg6Var instanceof jol) {
                jolVar = (jol) cg6Var;
                int i3 = jolVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    jolVar.n = i3 - Integer.MIN_VALUE;
                    Object obj2 = jolVar.l;
                    obj = nm6.a;
                    i = jolVar.n;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj2);
                        qqiVar = this.g;
                        jolVar.j = qqiVar;
                        i2 = 0;
                        jolVar.k = 0;
                        jolVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = jolVar.j;
                            try {
                                qgg.h0(obj2);
                                Unit unit = Unit.a;
                                oqiVar.b(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = jolVar.k;
                        ?? r4 = jolVar.j;
                        qgg.h0(obj2);
                        qqiVar = r4;
                    }
                    lum lumVar = this.a;
                    jolVar.j = qqiVar;
                    jolVar.k = i2;
                    jolVar.n = 2;
                    V = x97.V(dm6.b(), new r0r((cr) lumVar.a, continuation, 8), jolVar);
                    if (V == obj) {
                        V = Unit.a;
                    }
                    if (V == obj) {
                        V = Unit.a;
                    }
                    if (V != obj) {
                        oqiVar = qqiVar;
                        Unit unit2 = Unit.a;
                        oqiVar.b(null);
                        return unit2;
                    }
                    return obj;
                }
            }
            lum lumVar2 = this.a;
            jolVar.j = qqiVar;
            jolVar.k = i2;
            jolVar.n = 2;
            V = x97.V(dm6.b(), new r0r((cr) lumVar2.a, continuation, 8), jolVar);
            if (V == obj) {
            }
            if (V == obj) {
            }
            if (V != obj) {
            }
            return obj;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        jolVar = new jol(this, cg6Var);
        Object obj22 = jolVar.l;
        obj = nm6.a;
        i = jolVar.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:28:0x004f, B:29:0x00df, B:35:0x00fb, B:54:0x008d), top: B:8:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:39:0x0060, B:41:0x00a1, B:48:0x00d4, B:50:0x00cf), top: B:38:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:39:0x0060, B:41:0x00a1, B:48:0x00d4, B:50:0x00cf), top: B:38:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(long j, cg6 cg6Var) {
        kol kolVar;
        Object obj;
        Object obj2;
        int i;
        oqi oqiVar;
        int i2;
        long j2;
        oqi oqiVar2;
        oqi oqiVar3;
        Object V;
        int i3;
        oqi oqiVar4;
        long j3;
        int i4;
        long j4;
        Object e;
        try {
            if (cg6Var instanceof kol) {
                kolVar = (kol) cg6Var;
                int i5 = kolVar.q;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    kolVar.q = i5 - Integer.MIN_VALUE;
                    kol kolVar2 = kolVar;
                    obj = kolVar2.o;
                    obj2 = nm6.a;
                    i = kolVar2.q;
                    int i6 = 0;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar = this.g;
                        kolVar2.l = qqiVar;
                        kolVar2.j = j;
                        kolVar2.m = 0;
                        kolVar2.q = 1;
                        if (qqiVar.a(kolVar2) != obj2) {
                            i2 = 0;
                            j2 = j;
                            oqiVar2 = qqiVar;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oqiVar = kolVar2.l;
                                try {
                                    qgg.h0(obj);
                                    Unit unit = Unit.a;
                                    oqiVar.b(null);
                                    return unit;
                                } catch (Throwable th) {
                                    th = th;
                                    oqiVar.b(null);
                                    throw th;
                                }
                            }
                            j4 = kolVar2.k;
                            i3 = kolVar2.n;
                            i4 = kolVar2.m;
                            j3 = kolVar2.j;
                            oqiVar4 = kolVar2.l;
                            qgg.h0(obj);
                            xdh xdhVar = this.d;
                            kolVar2.l = oqiVar4;
                            kolVar2.j = j3;
                            kolVar2.m = i4;
                            kolVar2.n = i3;
                            kolVar2.k = j4;
                            kolVar2.q = 4;
                            e = ((b9l) xdhVar.d).e(j4, j3, kolVar2);
                            if (e == obj2) {
                                e = Unit.a;
                            }
                            if (e != obj2) {
                                oqiVar = oqiVar4;
                                Unit unit2 = Unit.a;
                                oqiVar.b(null);
                                return unit2;
                            }
                            return obj2;
                        }
                        i6 = kolVar2.n;
                        i2 = kolVar2.m;
                        j2 = kolVar2.j;
                        oqiVar3 = kolVar2.l;
                        try {
                            qgg.h0(obj);
                            long j5 = j2;
                            long longValue = ((Number) obj).longValue();
                            lum lumVar = this.a;
                            kolVar2.l = oqiVar3;
                            kolVar2.j = j5;
                            kolVar2.m = i2;
                            kolVar2.n = i6;
                            kolVar2.k = longValue;
                            kolVar2.q = 3;
                            V = x97.V(dm6.b(), new mj0((cr) lumVar.a, j5, continuation, 8), kolVar2);
                            if (V == obj2) {
                                V = Unit.a;
                            }
                            if (V == obj2) {
                                V = Unit.a;
                            }
                            if (V != obj2) {
                                i3 = i6;
                                oqiVar4 = oqiVar3;
                                j3 = j5;
                                i4 = i2;
                                j4 = longValue;
                                xdh xdhVar2 = this.d;
                                kolVar2.l = oqiVar4;
                                kolVar2.j = j3;
                                kolVar2.m = i4;
                                kolVar2.n = i3;
                                kolVar2.k = j4;
                                kolVar2.q = 4;
                                e = ((b9l) xdhVar2.d).e(j4, j3, kolVar2);
                                if (e == obj2) {
                                }
                                if (e != obj2) {
                                }
                            }
                            return obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar = oqiVar3;
                            oqiVar.b(null);
                            throw th;
                        }
                    }
                    i2 = kolVar2.m;
                    j2 = kolVar2.j;
                    oqiVar2 = kolVar2.l;
                    qgg.h0(obj);
                    kolVar2.l = oqiVar2;
                    kolVar2.j = j2;
                    kolVar2.m = i2;
                    kolVar2.n = 0;
                    kolVar2.q = 2;
                    obj = f(kolVar2);
                    if (obj != obj2) {
                        oqiVar3 = oqiVar2;
                        long j52 = j2;
                        long longValue2 = ((Number) obj).longValue();
                        lum lumVar2 = this.a;
                        kolVar2.l = oqiVar3;
                        kolVar2.j = j52;
                        kolVar2.m = i2;
                        kolVar2.n = i6;
                        kolVar2.k = longValue2;
                        kolVar2.q = 3;
                        V = x97.V(dm6.b(), new mj0((cr) lumVar2.a, j52, continuation, 8), kolVar2);
                        if (V == obj2) {
                        }
                        if (V == obj2) {
                        }
                        if (V != obj2) {
                        }
                    }
                    return obj2;
                }
            }
            if (i != 0) {
            }
            kolVar2.l = oqiVar2;
            kolVar2.j = j2;
            kolVar2.m = i2;
            kolVar2.n = 0;
            kolVar2.q = 2;
            obj = f(kolVar2);
            if (obj != obj2) {
            }
            return obj2;
        } catch (Throwable th3) {
            th = th3;
            oqiVar = oqiVar4;
        }
        kolVar = new kol(this, cg6Var);
        kol kolVar22 = kolVar;
        obj = kolVar22.o;
        obj2 = nm6.a;
        i = kolVar22.q;
        int i62 = 0;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r7 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(h4q h4qVar, cg6 cg6Var) {
        lol lolVar;
        Object obj;
        int i;
        Object B;
        if (cg6Var instanceof lol) {
            lolVar = (lol) cg6Var;
            int i2 = lolVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lolVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = lolVar.k;
                obj = nm6.a;
                i = lolVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    lolVar.j = h4qVar;
                    lolVar.m = 1;
                    Object V = x97.V(dm6.b(), new v0r((cr) this.a.a, h4qVar, continuation, 0), lolVar);
                    if (V != obj) {
                        V = Unit.a;
                    }
                    if (V != obj) {
                        V = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h4qVar = lolVar.j;
                    qgg.h0(obj2);
                }
                lolVar.j = null;
                lolVar.m = 2;
                B = ((b9l) this.d.d).B(h4qVar, lolVar);
                if (B != obj) {
                    B = Unit.a;
                }
            }
        }
        lolVar = new lol(this, cg6Var);
        Object obj22 = lolVar.k;
        obj = nm6.a;
        i = lolVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        lolVar.j = null;
        lolVar.m = 2;
        B = ((b9l) this.d.d).B(h4qVar, lolVar);
        if (B != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r9 == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r10 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r9 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(n4q n4qVar, cg6 cg6Var) {
        mol molVar;
        int i;
        xdh xdhVar;
        cr crVar = (cr) this.a.a;
        if (cg6Var instanceof mol) {
            molVar = (mol) cg6Var;
            int i2 = molVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                molVar.m = i2 - Integer.MIN_VALUE;
                Object obj = molVar.k;
                nm6 nm6Var = nm6.a;
                i = molVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    molVar.m = 1;
                    Object V = x97.V(dm6.b(), new v0r(crVar, n4qVar, continuation, 1), molVar);
                    if (V != nm6Var) {
                        V = Unit.a;
                    }
                    if (V != nm6Var) {
                        V = Unit.a;
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdhVar = molVar.j;
                    qgg.h0(obj);
                    molVar.j = null;
                    molVar.m = 3;
                    Object l = ((b9l) xdhVar.d).l((n4q) obj, molVar);
                    if (l != nm6Var) {
                        l = Unit.a;
                    }
                }
                xdhVar = this.d;
                molVar.j = xdhVar;
                molVar.m = 2;
                obj = x97.V(dm6.b(), new r0r(crVar, continuation, 11), molVar);
            }
        }
        molVar = new mol(this, cg6Var);
        Object obj2 = molVar.k;
        nm6 nm6Var2 = nm6.a;
        i = molVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        xdhVar = this.d;
        molVar.j = xdhVar;
        molVar.m = 2;
        obj2 = x97.V(dm6.b(), new r0r(crVar, continuation2, 11), molVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(3:(1:(1:(1:(5:14|15|16|17|18)(2:20|21))(7:22|23|24|25|26|(4:29|16|17|18)|28))(6:35|36|37|38|39|(2:41|(2:43|28)(5:44|25|26|(0)|28))(4:45|26|(0)|28)))(8:49|50|51|52|53|(6:70|(2:81|82)|83|(1:85)(1:92)|(1:87)(1:91)|(2:89|28)(2:90|38))|39|(0)(0))|33|34)(1:96))(3:107|(1:109)|28)|97|98|(1:100)|101|(5:103|53|(13:55|57|59|61|63|65|67|70|(6:72|74|76|78|81|82)|83|(0)(0)|(0)(0)|(0)(0))|39|(0)(0))|28))|111|6|7|(0)(0)|97|98|(0)|101|(0)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00a9, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00aa, code lost:
    
        r12 = r15;
        r15 = r14;
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x003a, code lost:
    
        r15 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a5 A[Catch: all -> 0x00a9, TryCatch #2 {all -> 0x00a9, blocks: (B:98:0x00a1, B:100:0x00a5, B:101:0x00af), top: B:97:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0176 A[Catch: all -> 0x003a, TryCatch #4 {all -> 0x003a, blocks: (B:15:0x0035, B:16:0x01ab, B:26:0x0193, B:39:0x0171, B:41:0x0176, B:53:0x00c4, B:55:0x00d2, B:57:0x00da, B:59:0x00e2, B:61:0x00ea, B:63:0x00f2, B:65:0x00fa, B:67:0x0102, B:70:0x010c, B:72:0x0114, B:74:0x011c, B:76:0x0124, B:78:0x012c, B:81:0x0135, B:82:0x013a, B:83:0x013b, B:91:0x0164, B:92:0x015f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0164 A[Catch: all -> 0x003a, TryCatch #4 {all -> 0x003a, blocks: (B:15:0x0035, B:16:0x01ab, B:26:0x0193, B:39:0x0171, B:41:0x0176, B:53:0x00c4, B:55:0x00d2, B:57:0x00da, B:59:0x00e2, B:61:0x00ea, B:63:0x00f2, B:65:0x00fa, B:67:0x0102, B:70:0x010c, B:72:0x0114, B:74:0x011c, B:76:0x0124, B:78:0x012c, B:81:0x0135, B:82:0x013a, B:83:0x013b, B:91:0x0164, B:92:0x015f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015f A[Catch: all -> 0x003a, TryCatch #4 {all -> 0x003a, blocks: (B:15:0x0035, B:16:0x01ab, B:26:0x0193, B:39:0x0171, B:41:0x0176, B:53:0x00c4, B:55:0x00d2, B:57:0x00da, B:59:0x00e2, B:61:0x00ea, B:63:0x00f2, B:65:0x00fa, B:67:0x0102, B:70:0x010c, B:72:0x0114, B:74:0x011c, B:76:0x0124, B:78:0x012c, B:81:0x0135, B:82:0x013a, B:83:0x013b, B:91:0x0164, B:92:0x015f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r13v0, types: [uol] */
    /* JADX WARN: Type inference failed for: r14v0, types: [mpl] */
    /* JADX WARN: Type inference failed for: r14v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r2v13, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(mpl mplVar, cg6 cg6Var) {
        rol rolVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        mpl mplVar2;
        rar rarVar;
        Object f;
        mpl mplVar3;
        oqi oqiVar;
        long longValue;
        Object V;
        oqi oqiVar2;
        int i3;
        int i4;
        long j;
        mpl mplVar4;
        rar rarVar2;
        int i5;
        int i6;
        long j2;
        oqi oqiVar3;
        int i7;
        xdh xdhVar;
        long j3;
        if (cg6Var instanceof rol) {
            rolVar = (rol) cg6Var;
            int i8 = rolVar.q;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                rolVar.q = i8 - Integer.MIN_VALUE;
                Object obj = rolVar.o;
                nm6Var = nm6.a;
                i = rolVar.q;
                int i9 = 0;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    rolVar.j = mplVar;
                    qqiVar = this.g;
                    rolVar.k = qqiVar;
                    rolVar.l = 0;
                    rolVar.q = 1;
                    if (qqiVar.a(rolVar) != nm6Var) {
                        i2 = 0;
                        mplVar2 = mplVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        i9 = rolVar.m;
                        int i10 = rolVar.l;
                        oqi oqiVar4 = rolVar.k;
                        mpl mplVar5 = rolVar.j;
                        try {
                            qgg.h0(obj);
                            i2 = i10;
                            oqiVar = oqiVar4;
                            mplVar3 = mplVar5;
                            longValue = ((Number) obj).longValue();
                            if (!Intrinsics.d(mplVar3, bpl.a) && !Intrinsics.d(mplVar3, cpl.a) && !Intrinsics.d(mplVar3, dpl.a) && !Intrinsics.d(mplVar3, epl.a) && !Intrinsics.d(mplVar3, fpl.a) && !Intrinsics.d(mplVar3, gpl.a) && !Intrinsics.d(mplVar3, hpl.a) && !Intrinsics.d(mplVar3, ipl.a)) {
                                if (!Intrinsics.d(mplVar3, yol.a) && !Intrinsics.d(mplVar3, zol.a) && !Intrinsics.d(mplVar3, apl.a) && !Intrinsics.d(mplVar3, jpl.a) && !Intrinsics.d(mplVar3, kpl.a)) {
                                    throw new x7j();
                                }
                                lum lumVar = this.a;
                                rolVar.j = mplVar3;
                                rolVar.k = oqiVar;
                                rolVar.l = i2;
                                rolVar.m = i9;
                                rolVar.n = longValue;
                                rolVar.q = 3;
                                V = x97.V(dm6.b(), new r0r((cr) lumVar.a, continuation, 9), rolVar);
                                if (V == nm6Var) {
                                    V = Unit.a;
                                }
                                if (V == nm6Var) {
                                    V = Unit.a;
                                }
                                if (V != nm6Var) {
                                    return nm6Var;
                                }
                                oqiVar2 = oqiVar;
                                i3 = i2;
                                i4 = i9;
                                j = longValue;
                                longValue = j;
                                i2 = i3;
                                i9 = i4;
                                oqiVar = oqiVar2;
                            }
                            mplVar4 = mplVar3;
                            rarVar2 = this.h;
                            if (rarVar2 == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            mplVar = oqiVar4;
                        }
                    } else if (i == 3) {
                        j = rolVar.n;
                        i4 = rolVar.m;
                        i3 = rolVar.l;
                        oqiVar2 = rolVar.k;
                        mplVar3 = rolVar.j;
                        try {
                            qgg.h0(obj);
                            longValue = j;
                            i2 = i3;
                            i9 = i4;
                            oqiVar = oqiVar2;
                            mplVar4 = mplVar3;
                            rarVar2 = this.h;
                            if (rarVar2 == null) {
                                i5 = i2;
                                i6 = i9;
                                j2 = longValue;
                                this.h = null;
                                xdhVar = this.d;
                                rolVar.j = null;
                                rolVar.k = oqiVar;
                                rolVar.l = i5;
                                rolVar.m = i6;
                                rolVar.n = j2;
                                rolVar.q = 5;
                                if (xdhVar.H(j2, mplVar4, rolVar) != nm6Var) {
                                }
                                return nm6Var;
                            }
                            rolVar.j = mplVar4;
                            rolVar.k = oqiVar;
                            rolVar.l = i2;
                            rolVar.m = i9;
                            rolVar.n = longValue;
                            rolVar.q = 4;
                            if (rarVar2.j0(rolVar) == nm6Var) {
                                return nm6Var;
                            }
                            oqiVar3 = oqiVar;
                            i5 = i2;
                            i7 = i9;
                            j2 = longValue;
                            i6 = i7;
                            oqiVar = oqiVar3;
                            this.h = null;
                            xdhVar = this.d;
                            rolVar.j = null;
                            rolVar.k = oqiVar;
                            rolVar.l = i5;
                            rolVar.m = i6;
                            rolVar.n = j2;
                            rolVar.q = 5;
                            if (xdhVar.H(j2, mplVar4, rolVar) != nm6Var) {
                            }
                            return nm6Var;
                        } catch (Throwable th2) {
                            th = th2;
                            mplVar = oqiVar2;
                        }
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j3 = rolVar.n;
                            oqiVar = rolVar.k;
                            qgg.h0(obj);
                            Long l = new Long(j3);
                            oqiVar.b(null);
                            return l;
                        }
                        j2 = rolVar.n;
                        i7 = rolVar.m;
                        i5 = rolVar.l;
                        oqiVar3 = rolVar.k;
                        mplVar4 = rolVar.j;
                        try {
                            qgg.h0(obj);
                            i6 = i7;
                            oqiVar = oqiVar3;
                            this.h = null;
                            xdhVar = this.d;
                            rolVar.j = null;
                            rolVar.k = oqiVar;
                            rolVar.l = i5;
                            rolVar.m = i6;
                            rolVar.n = j2;
                            rolVar.q = 5;
                            if (xdhVar.H(j2, mplVar4, rolVar) != nm6Var) {
                                j3 = j2;
                                Long l2 = new Long(j3);
                                oqiVar.b(null);
                                return l2;
                            }
                            return nm6Var;
                        } catch (Throwable th3) {
                            th = th3;
                            mplVar = oqiVar3;
                        }
                    }
                    mplVar.b(null);
                    throw th;
                }
                int i11 = rolVar.l;
                ?? r2 = rolVar.k;
                mpl mplVar6 = rolVar.j;
                qgg.h0(obj);
                qqiVar = r2;
                i2 = i11;
                mplVar2 = mplVar6;
                rarVar = this.h;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                rolVar.j = mplVar2;
                rolVar.k = qqiVar;
                rolVar.l = i2;
                rolVar.m = 0;
                rolVar.q = 2;
                f = f(rolVar);
                if (f != nm6Var) {
                    mplVar3 = mplVar2;
                    oqiVar = qqiVar;
                    obj = f;
                    longValue = ((Number) obj).longValue();
                    if (!Intrinsics.d(mplVar3, bpl.a)) {
                        if (!Intrinsics.d(mplVar3, yol.a)) {
                            throw new x7j();
                        }
                        lum lumVar2 = this.a;
                        rolVar.j = mplVar3;
                        rolVar.k = oqiVar;
                        rolVar.l = i2;
                        rolVar.m = i9;
                        rolVar.n = longValue;
                        rolVar.q = 3;
                        V = x97.V(dm6.b(), new r0r((cr) lumVar2.a, continuation, 9), rolVar);
                        if (V == nm6Var) {
                        }
                        if (V == nm6Var) {
                        }
                        if (V != nm6Var) {
                        }
                    }
                    mplVar4 = mplVar3;
                    rarVar2 = this.h;
                    if (rarVar2 == null) {
                    }
                }
                return nm6Var;
            }
        }
        rolVar = new rol(this, cg6Var);
        Object obj2 = rolVar.o;
        nm6Var = nm6.a;
        i = rolVar.q;
        int i92 = 0;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        rarVar = this.h;
        if (rarVar != null) {
        }
        rolVar.j = mplVar2;
        rolVar.k = qqiVar;
        rolVar.l = i2;
        rolVar.m = 0;
        rolVar.q = 2;
        f = f(rolVar);
        if (f != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(boolean z, cg6 cg6Var) {
        sol solVar;
        Object obj;
        int i;
        boolean z2;
        oqi oqiVar;
        int i2;
        Object f;
        int i3;
        oqi oqiVar2;
        l8j l8jVar;
        col colVar;
        try {
            if (cg6Var instanceof sol) {
                solVar = (sol) cg6Var;
                int i4 = solVar.p;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    solVar.p = i4 - Integer.MIN_VALUE;
                    sol solVar2 = solVar;
                    Object obj2 = solVar2.n;
                    obj = nm6.a;
                    i = solVar2.p;
                    int i5 = 0;
                    if (i != 0) {
                        qgg.h0(obj2);
                        qqi qqiVar = this.g;
                        solVar2.k = qqiVar;
                        solVar2.j = z;
                        solVar2.l = 0;
                        solVar2.p = 1;
                        if (qqiVar.a(solVar2) != obj) {
                            z2 = z;
                            oqiVar = qqiVar;
                            i2 = 0;
                        }
                        return obj;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar2 = solVar2.k;
                            try {
                                qgg.h0(obj2);
                                Unit unit = Unit.a;
                                oqiVar2.b(null);
                                return unit;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar2.b(null);
                                throw th;
                            }
                        }
                        i5 = solVar2.m;
                        int i6 = solVar2.l;
                        boolean z3 = solVar2.j;
                        oqi oqiVar3 = solVar2.k;
                        try {
                            qgg.h0(obj2);
                            i3 = i6;
                            z2 = z3;
                            oqiVar = oqiVar3;
                            int i7 = i5;
                            long longValue = ((Number) obj2).longValue();
                            l8jVar = l8j.c;
                            colVar = new col(this, z2, longValue, null);
                            solVar2.k = oqiVar;
                            solVar2.j = z2;
                            solVar2.l = i3;
                            solVar2.m = i7;
                            solVar2.p = 3;
                            if (x97.V(l8jVar, colVar, solVar2) != obj) {
                                oqiVar2 = oqiVar;
                                Unit unit2 = Unit.a;
                                oqiVar2.b(null);
                                return unit2;
                            }
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar2 = oqiVar3;
                            oqiVar2.b(null);
                            throw th;
                        }
                    }
                    int i8 = solVar2.l;
                    boolean z4 = solVar2.j;
                    oqiVar = solVar2.k;
                    qgg.h0(obj2);
                    i2 = i8;
                    z2 = z4;
                    solVar2.k = oqiVar;
                    solVar2.j = z2;
                    solVar2.l = i2;
                    solVar2.m = 0;
                    solVar2.p = 2;
                    f = f(solVar2);
                    if (f != obj) {
                        return obj;
                    }
                    i3 = i2;
                    obj2 = f;
                    int i72 = i5;
                    long longValue2 = ((Number) obj2).longValue();
                    l8jVar = l8j.c;
                    colVar = new col(this, z2, longValue2, null);
                    solVar2.k = oqiVar;
                    solVar2.j = z2;
                    solVar2.l = i3;
                    solVar2.m = i72;
                    solVar2.p = 3;
                    if (x97.V(l8jVar, colVar, solVar2) != obj) {
                    }
                    return obj;
                }
            }
            solVar2.k = oqiVar;
            solVar2.j = z2;
            solVar2.l = i2;
            solVar2.m = 0;
            solVar2.p = 2;
            f = f(solVar2);
            if (f != obj) {
            }
        } catch (Throwable th3) {
            th = th3;
            oqiVar2 = oqiVar;
            oqiVar2.b(null);
            throw th;
        }
        solVar = new sol(this, cg6Var);
        sol solVar22 = solVar;
        Object obj22 = solVar22.n;
        obj = nm6.a;
        i = solVar22.p;
        int i52 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        if (r11.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(boolean z, cg6 cg6Var) {
        tol tolVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        oqi oqiVar;
        l8j l8jVar;
        z11 z11Var;
        try {
            if (cg6Var instanceof tol) {
                tolVar = (tol) cg6Var;
                int i3 = tolVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    tolVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = tolVar.m;
                    nm6Var = nm6.a;
                    i = tolVar.o;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.g;
                        tolVar.k = qqiVar;
                        tolVar.j = z;
                        i2 = 0;
                        tolVar.l = 0;
                        tolVar.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = tolVar.k;
                            try {
                                qgg.h0(obj);
                                Unit unit = Unit.a;
                                oqiVar.b(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = tolVar.l;
                        boolean z2 = tolVar.j;
                        ?? r4 = tolVar.k;
                        qgg.h0(obj);
                        i2 = i4;
                        z = z2;
                        qqiVar = r4;
                    }
                    l8jVar = l8j.c;
                    z11Var = new z11(this, z, continuation, 13);
                    tolVar.k = qqiVar;
                    tolVar.j = z;
                    tolVar.l = i2;
                    tolVar.o = 2;
                    if (x97.V(l8jVar, z11Var, tolVar) != nm6Var) {
                        oqiVar = qqiVar;
                        Unit unit2 = Unit.a;
                        oqiVar.b(null);
                        return unit2;
                    }
                    return nm6Var;
                }
            }
            l8jVar = l8j.c;
            z11Var = new z11(this, z, continuation, 13);
            tolVar.k = qqiVar;
            tolVar.j = z;
            tolVar.l = i2;
            tolVar.o = 2;
            if (x97.V(l8jVar, z11Var, tolVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar2 = qqiVar;
            th = th3;
            oqiVar = qqiVar2;
            oqiVar.b(null);
            throw th;
        }
        tolVar = new tol(this, cg6Var);
        Object obj2 = tolVar.m;
        nm6Var = nm6.a;
        i = tolVar.o;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }
}

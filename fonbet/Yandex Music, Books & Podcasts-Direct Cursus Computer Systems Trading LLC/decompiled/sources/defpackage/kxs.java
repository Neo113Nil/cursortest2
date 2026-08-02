package defpackage;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class kxs implements yws {
    public static final /* synthetic */ s9f[] m;
    public final tf6 a;
    public final frt b;
    public final rtl c;
    public final i2m d;
    public final uys e;
    public final fnk f;
    public final wt5 g;
    public final rhp h;
    public final xdr i;
    public final x0q j;
    public long k;
    public long l;

    static {
        opi opiVar = new opi(kxs.class, "updateLikesJob", "getUpdateLikesJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        m = new s9f[]{opiVar};
    }

    public kxs(tf6 tf6Var, frt frtVar, rtl rtlVar, i2m i2mVar, uys uysVar, fnk fnkVar, ehv ehvVar, wt5 wt5Var) {
        rtlVar.getClass();
        i2mVar.getClass();
        uysVar.getClass();
        fnkVar.getClass();
        this.a = tf6Var;
        this.b = frtVar;
        this.c = rtlVar;
        this.d = i2mVar;
        this.e = uysVar;
        this.f = fnkVar;
        this.g = wt5Var;
        this.h = new rhp();
        this.i = ydr.a(null);
        this.j = y0q.b(0, 0, null, 7);
        this.k = -1L;
        this.l = -1L;
        ox6.B(q6k.m(frtVar.g(), new phs(23), q6k.g), tf6Var, new ryp(29, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        if (r4 == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa A[LOOP:0: B:22:0x00a4->B:24:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b A[LOOP:1: B:32:0x0075->B:34:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(kxs kxsVar, String str, Continuation continuation) {
        axs axsVar;
        Object obj;
        int i;
        HashMap hashMap;
        Object h;
        Iterator it;
        Object h2;
        String str2;
        HashMap hashMap2;
        Iterator it2;
        HashMap hashMap3;
        xdr xdrVar = kxsVar.i;
        i2m i2mVar = kxsVar.d;
        if (continuation instanceof axs) {
            axsVar = (axs) continuation;
            int i2 = axsVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                axsVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = axsVar.l;
                obj = nm6.a;
                i = axsVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    ssg.a(4, "TrackLikesCenter", "Initializing track likes from DB", null);
                    hashMap = new HashMap();
                    lxs lxsVar = lxs.b;
                    axsVar.j = str;
                    axsVar.k = hashMap;
                    axsVar.n = 1;
                    h = i2mVar.h(str, lxsVar, axsVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hashMap3 = axsVar.k;
                            qgg.h0(obj2);
                            if (xdrVar.getValue() == null) {
                                xdrVar.l(hashMap3);
                            }
                            return Unit.a;
                        }
                        hashMap2 = axsVar.k;
                        str2 = axsVar.j;
                        qgg.h0(obj2);
                        it2 = ((Iterable) obj2).iterator();
                        while (it2.hasNext()) {
                            hashMap2.put(((unk) it2.next()).a.a, j1g.c);
                        }
                        axsVar.j = null;
                        axsVar.k = hashMap2;
                        axsVar.n = 3;
                        if (kxsVar.k(str2, hashMap2, axsVar) != obj) {
                            hashMap3 = hashMap2;
                            if (xdrVar.getValue() == null) {
                            }
                            return Unit.a;
                        }
                        return obj;
                    }
                    HashMap hashMap4 = axsVar.k;
                    String str3 = axsVar.j;
                    qgg.h0(obj2);
                    hashMap = hashMap4;
                    str = str3;
                    h = obj2;
                }
                it = ((Iterable) h).iterator();
                while (it.hasNext()) {
                    hashMap.put(((unk) it.next()).a.a, j1g.a);
                }
                lxs lxsVar2 = lxs.c;
                axsVar.j = str;
                axsVar.k = hashMap;
                axsVar.n = 2;
                h2 = i2mVar.h(str, lxsVar2, axsVar);
                if (h2 != obj) {
                    str2 = str;
                    hashMap2 = hashMap;
                    obj2 = h2;
                    it2 = ((Iterable) obj2).iterator();
                    while (it2.hasNext()) {
                    }
                    axsVar.j = null;
                    axsVar.k = hashMap2;
                    axsVar.n = 3;
                    if (kxsVar.k(str2, hashMap2, axsVar) != obj) {
                    }
                }
                return obj;
            }
        }
        axsVar = new axs(kxsVar, continuation);
        Object obj22 = axsVar.l;
        obj = nm6.a;
        i = axsVar.n;
        if (i != 0) {
        }
        it = ((Iterable) h).iterator();
        while (it.hasNext()) {
        }
        lxs lxsVar22 = lxs.c;
        axsVar.j = str;
        axsVar.k = hashMap;
        axsVar.n = 2;
        h2 = i2mVar.h(str, lxsVar22, axsVar);
        if (h2 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        if (r22.e.a(r7, r8, r1) != r11) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, long j, rr5 rr5Var, long j2, cg6 cg6Var) {
        zws zwsVar;
        int i;
        long j3;
        rr5 rr5Var2;
        String str2;
        long j4 = j2;
        if (cg6Var instanceof zws) {
            zwsVar = (zws) cg6Var;
            int i2 = zwsVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zwsVar.p = i2 - Integer.MIN_VALUE;
                zws zwsVar2 = zwsVar;
                Object obj = zwsVar2.n;
                nm6 nm6Var = nm6.a;
                i = zwsVar2.p;
                if (i != 0) {
                    qgg.h0(obj);
                    if (j == -1) {
                        return Unit.a;
                    }
                    List c = t75.c(new t2m(rr5Var, new Date(j4)));
                    zwsVar2.j = str;
                    zwsVar2.k = rr5Var;
                    zwsVar2.l = j;
                    zwsVar2.m = j4;
                    zwsVar2.p = 1;
                    if (this.d.a(str, j, c, null, zwsVar2) != nm6Var) {
                        j3 = j;
                        rr5Var2 = rr5Var;
                        str2 = str;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j5 = zwsVar2.m;
                long j6 = zwsVar2.l;
                rr5 rr5Var3 = zwsVar2.k;
                str2 = zwsVar2.j;
                qgg.h0(obj);
                j4 = j5;
                j3 = j6;
                rr5Var2 = rr5Var3;
                Long l = new Long(j4);
                rr5Var2.getClass();
                List c2 = t75.c(new iys(-1L, rr5Var2, kys.INSERT, j3, 0, l));
                zwsVar2.j = null;
                zwsVar2.k = null;
                zwsVar2.l = j3;
                zwsVar2.m = j4;
                zwsVar2.p = 2;
            }
        }
        zwsVar = new zws(this, cg6Var);
        zws zwsVar22 = zwsVar;
        Object obj2 = zwsVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = zwsVar22.p;
        if (i != 0) {
        }
        Long l2 = new Long(j4);
        rr5Var2.getClass();
        List c22 = t75.c(new iys(-1L, rr5Var2, kys.INSERT, j3, 0, l2));
        zwsVar22.j = null;
        zwsVar22.k = null;
        zwsVar22.l = j3;
        zwsVar22.m = j4;
        zwsVar22.p = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cg6 cg6Var) {
        bxs bxsVar;
        int i;
        Long l;
        if (cg6Var instanceof bxs) {
            bxsVar = (bxs) cg6Var;
            int i2 = bxsVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bxsVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bxsVar.j;
                nm6 nm6Var = nm6.a;
                i = bxsVar.l;
                long j = -1;
                if (i != 0) {
                    qgg.h0(obj);
                    long j2 = this.l;
                    if (j2 != -1) {
                        return new Long(j2);
                    }
                    nvl nvlVar = new nvl(this.b.c().a, "-14");
                    bxsVar.l = 1;
                    obj = this.c.i(str, nvlVar, bxsVar);
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
                l = (Long) obj;
                if (l != null) {
                    this.l = l.longValue();
                    j = l.longValue();
                }
                return new Long(j);
            }
        }
        bxsVar = new bxs(this, cg6Var);
        Object obj2 = bxsVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bxsVar.l;
        long j3 = -1;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
        }
        return new Long(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum e(rr5 rr5Var, cg6 cg6Var) {
        cxs cxsVar;
        int i;
        if (cg6Var instanceof cxs) {
            cxsVar = (cxs) cg6Var;
            int i2 = cxsVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cxsVar.m = i2 - Integer.MIN_VALUE;
                Object obj = cxsVar.k;
                nm6 nm6Var = nm6.a;
                i = cxsVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(this.i, 18);
                    cxsVar.j = rr5Var;
                    cxsVar.m = 1;
                    obj = zsd.g0(bcaVar, cxsVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rr5Var = cxsVar.j;
                    qgg.h0(obj);
                }
                j1g j1gVar = (j1g) ((Map) obj).get(rr5Var.a);
                return j1gVar != null ? j1g.b : j1gVar;
            }
        }
        cxsVar = new cxs(this, cg6Var);
        Object obj2 = cxsVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cxsVar.m;
        if (i != 0) {
        }
        j1g j1gVar2 = (j1g) ((Map) obj2).get(rr5Var.a);
        if (j1gVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, cg6 cg6Var) {
        dxs dxsVar;
        int i;
        Long l;
        if (cg6Var instanceof dxs) {
            dxsVar = (dxs) cg6Var;
            int i2 = dxsVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dxsVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dxsVar.j;
                nm6 nm6Var = nm6.a;
                i = dxsVar.l;
                long j = -1;
                if (i != 0) {
                    qgg.h0(obj);
                    long j2 = this.k;
                    if (j2 != -1) {
                        return new Long(j2);
                    }
                    nvl nvlVar = new nvl(this.b.c().a, "3");
                    dxsVar.l = 1;
                    obj = this.c.i(str, nvlVar, dxsVar);
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
                l = (Long) obj;
                if (l != null) {
                    this.k = l.longValue();
                    j = l.longValue();
                }
                return new Long(j);
            }
        }
        dxsVar = new dxs(this, cg6Var);
        Object obj2 = dxsVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dxsVar.l;
        long j3 = -1;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l != null) {
        }
        return new Long(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b2, code lost:
    
        if (r20.e.a(r6, r10, r1) == r8) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, long j, rr5 rr5Var, long j2, cg6 cg6Var) {
        fxs fxsVar;
        Object obj;
        int i;
        long j3;
        long j4;
        String str2;
        rr5 rr5Var2 = rr5Var;
        if (cg6Var instanceof fxs) {
            fxsVar = (fxs) cg6Var;
            int i2 = fxsVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fxsVar.p = i2 - Integer.MIN_VALUE;
                fxs fxsVar2 = fxsVar;
                obj = fxsVar2.n;
                nm6 nm6Var = nm6.a;
                i = fxsVar2.p;
                if (i != 0) {
                    qgg.h0(obj);
                    if (j == -1) {
                        return Unit.a;
                    }
                    List c = t75.c(rr5Var2.a);
                    fxsVar2.j = str;
                    fxsVar2.k = rr5Var2;
                    fxsVar2.l = j;
                    fxsVar2.m = j2;
                    fxsVar2.p = 1;
                    obj = this.d.d(str, j, c, fxsVar2);
                    if (obj != nm6Var) {
                        j3 = j;
                        j4 = j2;
                        str2 = str;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = fxsVar2.m;
                long j5 = fxsVar2.l;
                rr5Var2 = fxsVar2.k;
                str2 = fxsVar2.j;
                qgg.h0(obj);
                j3 = j5;
                rr5 rr5Var3 = rr5Var2;
                if (((Number) obj).intValue() != 0) {
                    return Unit.a;
                }
                Long l = new Long(j4);
                rr5Var3.getClass();
                List c2 = t75.c(new iys(-1L, rr5Var3, kys.DELETE, j3, 0, l));
                fxsVar2.j = null;
                fxsVar2.k = null;
                fxsVar2.l = j3;
                fxsVar2.m = j4;
                fxsVar2.p = 2;
            }
        }
        fxsVar = new fxs(this, cg6Var);
        fxs fxsVar22 = fxsVar;
        obj = fxsVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = fxsVar22.p;
        if (i != 0) {
        }
        rr5 rr5Var32 = rr5Var2;
        if (((Number) obj).intValue() != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0212, code lost:
    
        if (r8.c(r6, r14, r9, r16, r12) != r4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02af, code lost:
    
        if (r8.g(r6, r14, r9, r16, r12) != r4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0342, code lost:
    
        if (r8.c(r6, r14, r9, r16, r12) != r4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0147, code lost:
    
        if (r3 == r4) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(rr5 rr5Var, j1g j1gVar, long j, cg6 cg6Var) {
        gxs gxsVar;
        gxs gxsVar2;
        long j2;
        rr5 rr5Var2;
        int i;
        int ordinal;
        rr5 rr5Var3;
        long j3;
        kxs kxsVar;
        String str;
        String str2;
        int i2;
        int i3;
        int i4;
        rr5 rr5Var4;
        long j4;
        kxs kxsVar2;
        String str3;
        String str4;
        int i5;
        int i6;
        int i7;
        rr5 rr5Var5;
        long j5;
        kxs kxsVar3;
        String str5;
        String str6;
        int i8;
        int i9;
        int i10;
        long longValue;
        int i11;
        long j6;
        int i12;
        rr5 rr5Var6;
        int i13;
        String str7;
        kxs kxsVar4;
        long longValue2;
        int i14;
        long j7;
        int i15;
        rr5 rr5Var7;
        int i16;
        String str8;
        kxs kxsVar5;
        long longValue3;
        int i17;
        long j8;
        int i18;
        rr5 rr5Var8;
        int i19;
        String str9;
        kxs kxsVar6;
        rr5 rr5Var9 = rr5Var;
        j1g j1gVar2 = j1gVar;
        if (cg6Var instanceof gxs) {
            gxsVar = (gxs) cg6Var;
            int i20 = gxsVar.u;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                gxsVar.u = i20 - Integer.MIN_VALUE;
                gxsVar2 = gxsVar;
                Object obj = gxsVar2.s;
                nm6 nm6Var = nm6.a;
                switch (gxsVar2.u) {
                    case 0:
                        qgg.h0(obj);
                        gxsVar2.j = rr5Var9;
                        gxsVar2.k = j1gVar2;
                        j2 = j;
                        gxsVar2.o = j2;
                        gxsVar2.u = 1;
                        obj = j(rr5Var9, j1gVar2, gxsVar2);
                        break;
                    case 1:
                        long j9 = gxsVar2.o;
                        j1g j1gVar3 = gxsVar2.k;
                        rr5 rr5Var10 = gxsVar2.j;
                        qgg.h0(obj);
                        rr5Var9 = rr5Var10;
                        j2 = j9;
                        j1gVar2 = j1gVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            return Unit.a;
                        }
                        gxsVar2.j = rr5Var9;
                        gxsVar2.k = j1gVar2;
                        gxsVar2.o = j2;
                        gxsVar2.p = 0;
                        gxsVar2.u = 2;
                        obj = this.b.f(gxsVar2);
                        if (obj != nm6Var) {
                            rr5Var2 = rr5Var9;
                            i = 0;
                            String str10 = ((xxq) obj).a;
                            str10.getClass();
                            ordinal = j1gVar2.ordinal();
                            if (ordinal != 0) {
                                gxsVar2.j = rr5Var2;
                                gxsVar2.k = null;
                                gxsVar2.l = str10;
                                gxsVar2.m = str10;
                                gxsVar2.n = this;
                                gxsVar2.o = j2;
                                gxsVar2.p = i;
                                gxsVar2.q = 0;
                                gxsVar2.r = 0;
                                gxsVar2.u = 3;
                                Object d = d(str10, gxsVar2);
                                if (d != nm6Var) {
                                    long j10 = j2;
                                    rr5Var3 = rr5Var2;
                                    j3 = j10;
                                    kxsVar = this;
                                    str = str10;
                                    str2 = str;
                                    i2 = 0;
                                    obj = d;
                                    i3 = i;
                                    i4 = 0;
                                    longValue = ((Number) obj).longValue();
                                    gxsVar2.j = rr5Var3;
                                    gxsVar2.k = null;
                                    gxsVar2.l = str2;
                                    gxsVar2.m = null;
                                    gxsVar2.n = null;
                                    gxsVar2.o = j3;
                                    gxsVar2.p = i3;
                                    gxsVar2.q = i4;
                                    gxsVar2.r = i2;
                                    gxsVar2.u = 4;
                                    if (kxsVar.g(str, longValue, rr5Var3, j3, gxsVar2) != nm6Var) {
                                        i11 = i3;
                                        j6 = j3;
                                        i12 = i4;
                                        rr5Var6 = rr5Var3;
                                        i13 = i2;
                                        str7 = str2;
                                        gxsVar2.j = rr5Var6;
                                        gxsVar2.k = null;
                                        gxsVar2.l = null;
                                        gxsVar2.m = str7;
                                        gxsVar2.n = this;
                                        gxsVar2.o = j6;
                                        gxsVar2.p = i11;
                                        gxsVar2.q = i12;
                                        gxsVar2.r = i13;
                                        gxsVar2.u = 5;
                                        obj = f(str7, gxsVar2);
                                        if (obj != nm6Var) {
                                            kxsVar4 = this;
                                            long j11 = j6;
                                            String str11 = str7;
                                            rr5 rr5Var11 = rr5Var6;
                                            long longValue4 = ((Number) obj).longValue();
                                            gxsVar2.j = null;
                                            gxsVar2.k = null;
                                            gxsVar2.l = null;
                                            gxsVar2.m = null;
                                            gxsVar2.n = null;
                                            gxsVar2.o = j11;
                                            gxsVar2.p = i11;
                                            gxsVar2.q = i12;
                                            gxsVar2.r = i13;
                                            gxsVar2.u = 6;
                                            break;
                                        }
                                    }
                                }
                            } else if (ordinal == 1) {
                                gxsVar2.j = rr5Var2;
                                gxsVar2.k = null;
                                gxsVar2.l = str10;
                                gxsVar2.m = str10;
                                gxsVar2.n = this;
                                gxsVar2.o = j2;
                                gxsVar2.p = i;
                                gxsVar2.q = 0;
                                gxsVar2.r = 0;
                                gxsVar2.u = 7;
                                Object d2 = d(str10, gxsVar2);
                                if (d2 != nm6Var) {
                                    long j12 = j2;
                                    rr5Var4 = rr5Var2;
                                    j4 = j12;
                                    kxsVar2 = this;
                                    str3 = str10;
                                    str4 = str3;
                                    i5 = 0;
                                    obj = d2;
                                    i6 = i;
                                    i7 = 0;
                                    longValue2 = ((Number) obj).longValue();
                                    gxsVar2.j = rr5Var4;
                                    gxsVar2.k = null;
                                    gxsVar2.l = str4;
                                    gxsVar2.m = null;
                                    gxsVar2.n = null;
                                    gxsVar2.o = j4;
                                    gxsVar2.p = i6;
                                    gxsVar2.q = i7;
                                    gxsVar2.r = i5;
                                    gxsVar2.u = 8;
                                    if (kxsVar2.g(str3, longValue2, rr5Var4, j4, gxsVar2) != nm6Var) {
                                        i14 = i6;
                                        j7 = j4;
                                        i15 = i7;
                                        rr5Var7 = rr5Var4;
                                        i16 = i5;
                                        str8 = str4;
                                        gxsVar2.j = rr5Var7;
                                        gxsVar2.k = null;
                                        gxsVar2.l = null;
                                        gxsVar2.m = str8;
                                        gxsVar2.n = this;
                                        gxsVar2.o = j7;
                                        gxsVar2.p = i14;
                                        gxsVar2.q = i15;
                                        gxsVar2.r = i16;
                                        gxsVar2.u = 9;
                                        obj = f(str8, gxsVar2);
                                        if (obj != nm6Var) {
                                            kxsVar5 = this;
                                            long j13 = j7;
                                            String str12 = str8;
                                            rr5 rr5Var12 = rr5Var7;
                                            long longValue5 = ((Number) obj).longValue();
                                            gxsVar2.j = null;
                                            gxsVar2.k = null;
                                            gxsVar2.l = null;
                                            gxsVar2.m = null;
                                            gxsVar2.n = null;
                                            gxsVar2.o = j13;
                                            gxsVar2.p = i14;
                                            gxsVar2.q = i15;
                                            gxsVar2.r = i16;
                                            gxsVar2.u = 10;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                if (ordinal != 2) {
                                    b6e.s();
                                    return null;
                                }
                                gxsVar2.j = rr5Var2;
                                gxsVar2.k = null;
                                gxsVar2.l = str10;
                                gxsVar2.m = str10;
                                gxsVar2.n = this;
                                gxsVar2.o = j2;
                                gxsVar2.p = i;
                                gxsVar2.q = 0;
                                gxsVar2.r = 0;
                                gxsVar2.u = 11;
                                Object f = f(str10, gxsVar2);
                                if (f != nm6Var) {
                                    long j14 = j2;
                                    rr5Var5 = rr5Var2;
                                    j5 = j14;
                                    kxsVar3 = this;
                                    str5 = str10;
                                    str6 = str5;
                                    i8 = 0;
                                    obj = f;
                                    i9 = i;
                                    i10 = 0;
                                    longValue3 = ((Number) obj).longValue();
                                    gxsVar2.j = rr5Var5;
                                    gxsVar2.k = null;
                                    gxsVar2.l = str6;
                                    gxsVar2.m = null;
                                    gxsVar2.n = null;
                                    gxsVar2.o = j5;
                                    gxsVar2.p = i9;
                                    gxsVar2.q = i10;
                                    gxsVar2.r = i8;
                                    gxsVar2.u = 12;
                                    if (kxsVar3.g(str5, longValue3, rr5Var5, j5, gxsVar2) != nm6Var) {
                                        i17 = i9;
                                        j8 = j5;
                                        i18 = i10;
                                        rr5Var8 = rr5Var5;
                                        i19 = i8;
                                        str9 = str6;
                                        gxsVar2.j = rr5Var8;
                                        gxsVar2.k = null;
                                        gxsVar2.l = null;
                                        gxsVar2.m = str9;
                                        gxsVar2.n = this;
                                        gxsVar2.o = j8;
                                        gxsVar2.p = i17;
                                        gxsVar2.q = i18;
                                        gxsVar2.r = i19;
                                        gxsVar2.u = 13;
                                        obj = d(str9, gxsVar2);
                                        if (obj != nm6Var) {
                                            kxsVar6 = this;
                                            long j15 = j8;
                                            String str13 = str9;
                                            rr5 rr5Var13 = rr5Var8;
                                            long longValue6 = ((Number) obj).longValue();
                                            gxsVar2.j = null;
                                            gxsVar2.k = null;
                                            gxsVar2.l = null;
                                            gxsVar2.m = null;
                                            gxsVar2.n = null;
                                            gxsVar2.o = j15;
                                            gxsVar2.p = i17;
                                            gxsVar2.q = i18;
                                            gxsVar2.r = i19;
                                            gxsVar2.u = 14;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    case 2:
                        i = gxsVar2.p;
                        j2 = gxsVar2.o;
                        j1gVar2 = gxsVar2.k;
                        rr5 rr5Var14 = gxsVar2.j;
                        qgg.h0(obj);
                        rr5Var2 = rr5Var14;
                        String str102 = ((xxq) obj).a;
                        str102.getClass();
                        ordinal = j1gVar2.ordinal();
                        if (ordinal != 0) {
                        }
                        return nm6Var;
                    case 3:
                        int i21 = gxsVar2.r;
                        i4 = gxsVar2.q;
                        i3 = gxsVar2.p;
                        long j16 = gxsVar2.o;
                        kxs kxsVar7 = gxsVar2.n;
                        String str14 = gxsVar2.m;
                        String str15 = gxsVar2.l;
                        rr5 rr5Var15 = gxsVar2.j;
                        qgg.h0(obj);
                        i2 = i21;
                        str2 = str15;
                        kxsVar = kxsVar7;
                        str = str14;
                        rr5Var3 = rr5Var15;
                        j3 = j16;
                        longValue = ((Number) obj).longValue();
                        gxsVar2.j = rr5Var3;
                        gxsVar2.k = null;
                        gxsVar2.l = str2;
                        gxsVar2.m = null;
                        gxsVar2.n = null;
                        gxsVar2.o = j3;
                        gxsVar2.p = i3;
                        gxsVar2.q = i4;
                        gxsVar2.r = i2;
                        gxsVar2.u = 4;
                        if (kxsVar.g(str, longValue, rr5Var3, j3, gxsVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 4:
                        i13 = gxsVar2.r;
                        i12 = gxsVar2.q;
                        i11 = gxsVar2.p;
                        j6 = gxsVar2.o;
                        String str16 = gxsVar2.l;
                        rr5 rr5Var16 = gxsVar2.j;
                        qgg.h0(obj);
                        rr5Var6 = rr5Var16;
                        str7 = str16;
                        gxsVar2.j = rr5Var6;
                        gxsVar2.k = null;
                        gxsVar2.l = null;
                        gxsVar2.m = str7;
                        gxsVar2.n = this;
                        gxsVar2.o = j6;
                        gxsVar2.p = i11;
                        gxsVar2.q = i12;
                        gxsVar2.r = i13;
                        gxsVar2.u = 5;
                        obj = f(str7, gxsVar2);
                        if (obj != nm6Var) {
                        }
                        return nm6Var;
                    case 5:
                        i13 = gxsVar2.r;
                        i12 = gxsVar2.q;
                        i11 = gxsVar2.p;
                        j6 = gxsVar2.o;
                        kxsVar4 = gxsVar2.n;
                        str7 = gxsVar2.m;
                        rr5Var6 = gxsVar2.j;
                        qgg.h0(obj);
                        long j112 = j6;
                        String str112 = str7;
                        rr5 rr5Var112 = rr5Var6;
                        long longValue42 = ((Number) obj).longValue();
                        gxsVar2.j = null;
                        gxsVar2.k = null;
                        gxsVar2.l = null;
                        gxsVar2.m = null;
                        gxsVar2.n = null;
                        gxsVar2.o = j112;
                        gxsVar2.p = i11;
                        gxsVar2.q = i12;
                        gxsVar2.r = i13;
                        gxsVar2.u = 6;
                        break;
                    case 6:
                    case 10:
                    case 14:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 7:
                        int i22 = gxsVar2.r;
                        i7 = gxsVar2.q;
                        i6 = gxsVar2.p;
                        long j17 = gxsVar2.o;
                        kxs kxsVar8 = gxsVar2.n;
                        String str17 = gxsVar2.m;
                        String str18 = gxsVar2.l;
                        rr5 rr5Var17 = gxsVar2.j;
                        qgg.h0(obj);
                        i5 = i22;
                        str4 = str18;
                        kxsVar2 = kxsVar8;
                        str3 = str17;
                        rr5Var4 = rr5Var17;
                        j4 = j17;
                        longValue2 = ((Number) obj).longValue();
                        gxsVar2.j = rr5Var4;
                        gxsVar2.k = null;
                        gxsVar2.l = str4;
                        gxsVar2.m = null;
                        gxsVar2.n = null;
                        gxsVar2.o = j4;
                        gxsVar2.p = i6;
                        gxsVar2.q = i7;
                        gxsVar2.r = i5;
                        gxsVar2.u = 8;
                        if (kxsVar2.g(str3, longValue2, rr5Var4, j4, gxsVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 8:
                        i16 = gxsVar2.r;
                        i15 = gxsVar2.q;
                        i14 = gxsVar2.p;
                        j7 = gxsVar2.o;
                        String str19 = gxsVar2.l;
                        rr5 rr5Var18 = gxsVar2.j;
                        qgg.h0(obj);
                        rr5Var7 = rr5Var18;
                        str8 = str19;
                        gxsVar2.j = rr5Var7;
                        gxsVar2.k = null;
                        gxsVar2.l = null;
                        gxsVar2.m = str8;
                        gxsVar2.n = this;
                        gxsVar2.o = j7;
                        gxsVar2.p = i14;
                        gxsVar2.q = i15;
                        gxsVar2.r = i16;
                        gxsVar2.u = 9;
                        obj = f(str8, gxsVar2);
                        if (obj != nm6Var) {
                        }
                        return nm6Var;
                    case 9:
                        i16 = gxsVar2.r;
                        i15 = gxsVar2.q;
                        i14 = gxsVar2.p;
                        j7 = gxsVar2.o;
                        kxsVar5 = gxsVar2.n;
                        str8 = gxsVar2.m;
                        rr5Var7 = gxsVar2.j;
                        qgg.h0(obj);
                        long j132 = j7;
                        String str122 = str8;
                        rr5 rr5Var122 = rr5Var7;
                        long longValue52 = ((Number) obj).longValue();
                        gxsVar2.j = null;
                        gxsVar2.k = null;
                        gxsVar2.l = null;
                        gxsVar2.m = null;
                        gxsVar2.n = null;
                        gxsVar2.o = j132;
                        gxsVar2.p = i14;
                        gxsVar2.q = i15;
                        gxsVar2.r = i16;
                        gxsVar2.u = 10;
                        break;
                    case 11:
                        int i23 = gxsVar2.r;
                        i10 = gxsVar2.q;
                        i9 = gxsVar2.p;
                        long j18 = gxsVar2.o;
                        kxs kxsVar9 = gxsVar2.n;
                        String str20 = gxsVar2.m;
                        String str21 = gxsVar2.l;
                        rr5 rr5Var19 = gxsVar2.j;
                        qgg.h0(obj);
                        i8 = i23;
                        str6 = str21;
                        kxsVar3 = kxsVar9;
                        str5 = str20;
                        rr5Var5 = rr5Var19;
                        j5 = j18;
                        longValue3 = ((Number) obj).longValue();
                        gxsVar2.j = rr5Var5;
                        gxsVar2.k = null;
                        gxsVar2.l = str6;
                        gxsVar2.m = null;
                        gxsVar2.n = null;
                        gxsVar2.o = j5;
                        gxsVar2.p = i9;
                        gxsVar2.q = i10;
                        gxsVar2.r = i8;
                        gxsVar2.u = 12;
                        if (kxsVar3.g(str5, longValue3, rr5Var5, j5, gxsVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 12:
                        i19 = gxsVar2.r;
                        i18 = gxsVar2.q;
                        i17 = gxsVar2.p;
                        j8 = gxsVar2.o;
                        String str22 = gxsVar2.l;
                        rr5 rr5Var20 = gxsVar2.j;
                        qgg.h0(obj);
                        rr5Var8 = rr5Var20;
                        str9 = str22;
                        gxsVar2.j = rr5Var8;
                        gxsVar2.k = null;
                        gxsVar2.l = null;
                        gxsVar2.m = str9;
                        gxsVar2.n = this;
                        gxsVar2.o = j8;
                        gxsVar2.p = i17;
                        gxsVar2.q = i18;
                        gxsVar2.r = i19;
                        gxsVar2.u = 13;
                        obj = d(str9, gxsVar2);
                        if (obj != nm6Var) {
                        }
                        return nm6Var;
                    case 13:
                        i19 = gxsVar2.r;
                        i18 = gxsVar2.q;
                        i17 = gxsVar2.p;
                        j8 = gxsVar2.o;
                        kxsVar6 = gxsVar2.n;
                        str9 = gxsVar2.m;
                        rr5Var8 = gxsVar2.j;
                        qgg.h0(obj);
                        long j152 = j8;
                        String str132 = str9;
                        rr5 rr5Var132 = rr5Var8;
                        long longValue62 = ((Number) obj).longValue();
                        gxsVar2.j = null;
                        gxsVar2.k = null;
                        gxsVar2.l = null;
                        gxsVar2.m = null;
                        gxsVar2.n = null;
                        gxsVar2.o = j152;
                        gxsVar2.p = i17;
                        gxsVar2.q = i18;
                        gxsVar2.r = i19;
                        gxsVar2.u = 14;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        gxsVar = new gxs(this, cg6Var);
        gxsVar2 = gxsVar;
        Object obj2 = gxsVar2.s;
        nm6 nm6Var2 = nm6.a;
        switch (gxsVar2.u) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x023e, code lost:
    
        if (r8.c(r6, r13, r2, r18, r11) != r3) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02e9, code lost:
    
        if (r8.g(r6, r13, r2, r18, r11) != r3) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x03b3, code lost:
    
        if (r21.f.b(r8, r2, r11) != r3) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        if (r2 == r3) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(mqs mqsVar, j1g j1gVar, long j, cg6 cg6Var) {
        hxs hxsVar;
        hxs hxsVar2;
        mqs mqsVar2;
        long j2;
        mqs mqsVar3;
        j1g j1gVar2;
        int i;
        int ordinal;
        String str;
        String str2;
        int i2;
        long j3;
        mqs mqsVar4;
        kxs kxsVar;
        int i3;
        String str3;
        String str4;
        int i4;
        long j4;
        mqs mqsVar5;
        kxs kxsVar2;
        int i5;
        String str5;
        String str6;
        int i6;
        long j5;
        mqs mqsVar6;
        kxs kxsVar3;
        int i7;
        long longValue;
        rr5 d;
        int i8;
        long j6;
        int i9;
        int i10;
        String str7;
        int i11;
        int i12;
        String str8;
        kxs kxsVar4;
        long j7;
        mqs mqsVar7;
        String str9;
        long longValue2;
        rr5 d2;
        long j8;
        int i13;
        int i14;
        String str10;
        mqs mqsVar8;
        long longValue3;
        rr5 d3;
        int i15;
        long j9;
        int i16;
        int i17;
        String str11;
        mqs mqsVar9;
        kxs kxsVar5;
        long longValue4;
        rr5 d4;
        int i18;
        long j10;
        int i19;
        int i20;
        String str12;
        mqs mqsVar10;
        kxs kxsVar6;
        j1g j1gVar3 = j1gVar;
        if (cg6Var instanceof hxs) {
            hxsVar = (hxs) cg6Var;
            int i21 = hxsVar.u;
            if ((i21 & Integer.MIN_VALUE) != 0) {
                hxsVar.u = i21 - Integer.MIN_VALUE;
                hxsVar2 = hxsVar;
                Object obj = hxsVar2.s;
                nm6 nm6Var = nm6.a;
                switch (hxsVar2.u) {
                    case 0:
                        qgg.h0(obj);
                        rr5 d5 = mqsVar.d();
                        mqsVar2 = mqsVar;
                        hxsVar2.j = mqsVar2;
                        hxsVar2.k = j1gVar3;
                        j2 = j;
                        hxsVar2.o = j2;
                        hxsVar2.u = 1;
                        obj = j(d5, j1gVar3, hxsVar2);
                        break;
                    case 1:
                        j2 = hxsVar2.o;
                        j1gVar3 = hxsVar2.k;
                        mqsVar2 = hxsVar2.j;
                        qgg.h0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return Unit.a;
                        }
                        hxsVar2.j = mqsVar2;
                        hxsVar2.k = j1gVar3;
                        hxsVar2.o = j2;
                        hxsVar2.p = 0;
                        hxsVar2.u = 2;
                        obj = this.b.f(hxsVar2);
                        if (obj != nm6Var) {
                            mqsVar3 = mqsVar2;
                            j1gVar2 = j1gVar3;
                            i = 0;
                            String str13 = ((xxq) obj).a;
                            str13.getClass();
                            ordinal = j1gVar2.ordinal();
                            if (ordinal != 0) {
                                hxsVar2.j = mqsVar3;
                                hxsVar2.k = null;
                                hxsVar2.l = str13;
                                hxsVar2.m = str13;
                                hxsVar2.n = this;
                                hxsVar2.o = j2;
                                hxsVar2.p = i;
                                hxsVar2.q = 0;
                                hxsVar2.r = 0;
                                hxsVar2.u = 3;
                                Object d6 = d(str13, hxsVar2);
                                if (d6 != nm6Var) {
                                    str = str13;
                                    str2 = str;
                                    obj = d6;
                                    i2 = 0;
                                    j3 = j2;
                                    mqsVar4 = mqsVar3;
                                    kxsVar = this;
                                    i3 = 0;
                                    longValue = ((Number) obj).longValue();
                                    d = mqsVar4.d();
                                    hxsVar2.j = mqsVar4;
                                    hxsVar2.k = null;
                                    hxsVar2.l = str2;
                                    hxsVar2.m = null;
                                    hxsVar2.n = null;
                                    hxsVar2.o = j3;
                                    hxsVar2.p = i;
                                    hxsVar2.q = i3;
                                    hxsVar2.r = i2;
                                    hxsVar2.u = 4;
                                    String str14 = str2;
                                    if (kxsVar.g(str, longValue, d, j3, hxsVar2) != nm6Var) {
                                        i8 = i;
                                        j6 = j3;
                                        i9 = i3;
                                        i10 = i2;
                                        str7 = str14;
                                        hxsVar2.j = mqsVar4;
                                        hxsVar2.k = null;
                                        hxsVar2.l = str7;
                                        hxsVar2.m = str7;
                                        hxsVar2.n = this;
                                        hxsVar2.o = j6;
                                        hxsVar2.p = i8;
                                        hxsVar2.q = i9;
                                        hxsVar2.r = i10;
                                        hxsVar2.u = 5;
                                        obj = f(str7, hxsVar2);
                                        if (obj != nm6Var) {
                                            i11 = i9;
                                            i12 = i8;
                                            str8 = str7;
                                            kxsVar4 = this;
                                            j7 = j6;
                                            mqsVar7 = mqsVar4;
                                            str9 = str8;
                                            longValue2 = ((Number) obj).longValue();
                                            d2 = mqsVar7.d();
                                            hxsVar2.j = mqsVar7;
                                            hxsVar2.k = null;
                                            hxsVar2.l = str9;
                                            hxsVar2.m = null;
                                            hxsVar2.n = null;
                                            hxsVar2.o = j7;
                                            hxsVar2.p = i12;
                                            hxsVar2.q = i11;
                                            hxsVar2.r = i10;
                                            hxsVar2.u = 6;
                                            mqs mqsVar11 = mqsVar7;
                                            if (kxsVar4.c(str8, longValue2, d2, j7, hxsVar2) != nm6Var) {
                                                j8 = j7;
                                                i13 = i11;
                                                i14 = i12;
                                                str10 = str9;
                                                mqsVar8 = mqsVar11;
                                                List c = t75.c(mqsVar8);
                                                hxsVar2.j = null;
                                                hxsVar2.k = null;
                                                hxsVar2.l = null;
                                                hxsVar2.o = j8;
                                                hxsVar2.p = i14;
                                                hxsVar2.q = i13;
                                                hxsVar2.r = i10;
                                                hxsVar2.u = 7;
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else if (ordinal == 1) {
                                hxsVar2.j = mqsVar3;
                                hxsVar2.k = null;
                                hxsVar2.l = str13;
                                hxsVar2.m = str13;
                                hxsVar2.n = this;
                                hxsVar2.o = j2;
                                hxsVar2.p = i;
                                hxsVar2.q = 0;
                                hxsVar2.r = 0;
                                hxsVar2.u = 8;
                                Object d7 = d(str13, hxsVar2);
                                if (d7 != nm6Var) {
                                    str3 = str13;
                                    str4 = str3;
                                    obj = d7;
                                    i4 = 0;
                                    j4 = j2;
                                    mqsVar5 = mqsVar3;
                                    kxsVar2 = this;
                                    i5 = 0;
                                    longValue3 = ((Number) obj).longValue();
                                    d3 = mqsVar5.d();
                                    hxsVar2.j = mqsVar5;
                                    hxsVar2.k = null;
                                    hxsVar2.l = str4;
                                    hxsVar2.m = null;
                                    hxsVar2.n = null;
                                    hxsVar2.o = j4;
                                    hxsVar2.p = i;
                                    hxsVar2.q = i5;
                                    hxsVar2.r = i4;
                                    hxsVar2.u = 9;
                                    mqs mqsVar12 = mqsVar5;
                                    if (kxsVar2.g(str3, longValue3, d3, j4, hxsVar2) != nm6Var) {
                                        i15 = i;
                                        j9 = j4;
                                        i16 = i5;
                                        i17 = i4;
                                        str11 = str4;
                                        mqsVar9 = mqsVar12;
                                        hxsVar2.j = mqsVar9;
                                        hxsVar2.k = null;
                                        hxsVar2.l = null;
                                        hxsVar2.m = str11;
                                        hxsVar2.n = this;
                                        hxsVar2.o = j9;
                                        hxsVar2.p = i15;
                                        hxsVar2.q = i16;
                                        hxsVar2.r = i17;
                                        hxsVar2.u = 10;
                                        obj = f(str11, hxsVar2);
                                        if (obj != nm6Var) {
                                            kxsVar5 = this;
                                            long j11 = j9;
                                            String str15 = str11;
                                            mqs mqsVar13 = mqsVar9;
                                            long longValue5 = ((Number) obj).longValue();
                                            rr5 d8 = mqsVar13.d();
                                            hxsVar2.j = null;
                                            hxsVar2.k = null;
                                            hxsVar2.l = null;
                                            hxsVar2.m = null;
                                            hxsVar2.n = null;
                                            hxsVar2.o = j11;
                                            hxsVar2.p = i15;
                                            hxsVar2.q = i16;
                                            hxsVar2.r = i17;
                                            hxsVar2.u = 11;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                if (ordinal != 2) {
                                    b6e.s();
                                    return null;
                                }
                                hxsVar2.j = mqsVar3;
                                hxsVar2.k = null;
                                hxsVar2.l = str13;
                                hxsVar2.m = str13;
                                hxsVar2.n = this;
                                hxsVar2.o = j2;
                                hxsVar2.p = i;
                                hxsVar2.q = 0;
                                hxsVar2.r = 0;
                                hxsVar2.u = 12;
                                Object f = f(str13, hxsVar2);
                                if (f != nm6Var) {
                                    str5 = str13;
                                    str6 = str5;
                                    obj = f;
                                    i6 = 0;
                                    j5 = j2;
                                    mqsVar6 = mqsVar3;
                                    kxsVar3 = this;
                                    i7 = 0;
                                    longValue4 = ((Number) obj).longValue();
                                    d4 = mqsVar6.d();
                                    hxsVar2.j = mqsVar6;
                                    hxsVar2.k = null;
                                    hxsVar2.l = str6;
                                    hxsVar2.m = null;
                                    hxsVar2.n = null;
                                    hxsVar2.o = j5;
                                    hxsVar2.p = i;
                                    hxsVar2.q = i7;
                                    hxsVar2.r = i6;
                                    hxsVar2.u = 13;
                                    mqs mqsVar14 = mqsVar6;
                                    if (kxsVar3.g(str5, longValue4, d4, j5, hxsVar2) != nm6Var) {
                                        i18 = i;
                                        j10 = j5;
                                        i19 = i7;
                                        i20 = i6;
                                        str12 = str6;
                                        mqsVar10 = mqsVar14;
                                        hxsVar2.j = mqsVar10;
                                        hxsVar2.k = null;
                                        hxsVar2.l = null;
                                        hxsVar2.m = str12;
                                        hxsVar2.n = this;
                                        hxsVar2.o = j10;
                                        hxsVar2.p = i18;
                                        hxsVar2.q = i19;
                                        hxsVar2.r = i20;
                                        hxsVar2.u = 14;
                                        obj = d(str12, hxsVar2);
                                        if (obj != nm6Var) {
                                            kxsVar6 = this;
                                            long j12 = j10;
                                            String str16 = str12;
                                            mqs mqsVar15 = mqsVar10;
                                            long longValue6 = ((Number) obj).longValue();
                                            rr5 d9 = mqsVar15.d();
                                            hxsVar2.j = null;
                                            hxsVar2.k = null;
                                            hxsVar2.l = null;
                                            hxsVar2.m = null;
                                            hxsVar2.n = null;
                                            hxsVar2.o = j12;
                                            hxsVar2.p = i18;
                                            hxsVar2.q = i19;
                                            hxsVar2.r = i20;
                                            hxsVar2.u = 15;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    case 2:
                        i = hxsVar2.p;
                        j2 = hxsVar2.o;
                        j1gVar2 = hxsVar2.k;
                        mqs mqsVar16 = hxsVar2.j;
                        qgg.h0(obj);
                        mqsVar3 = mqsVar16;
                        String str132 = ((xxq) obj).a;
                        str132.getClass();
                        ordinal = j1gVar2.ordinal();
                        if (ordinal != 0) {
                        }
                        return nm6Var;
                    case 3:
                        int i22 = hxsVar2.r;
                        int i23 = hxsVar2.q;
                        int i24 = hxsVar2.p;
                        long j13 = hxsVar2.o;
                        kxs kxsVar7 = hxsVar2.n;
                        String str17 = hxsVar2.m;
                        String str18 = hxsVar2.l;
                        mqs mqsVar17 = hxsVar2.j;
                        qgg.h0(obj);
                        i2 = i22;
                        mqsVar4 = mqsVar17;
                        i3 = i23;
                        i = i24;
                        kxsVar = kxsVar7;
                        str = str17;
                        str2 = str18;
                        j3 = j13;
                        longValue = ((Number) obj).longValue();
                        d = mqsVar4.d();
                        hxsVar2.j = mqsVar4;
                        hxsVar2.k = null;
                        hxsVar2.l = str2;
                        hxsVar2.m = null;
                        hxsVar2.n = null;
                        hxsVar2.o = j3;
                        hxsVar2.p = i;
                        hxsVar2.q = i3;
                        hxsVar2.r = i2;
                        hxsVar2.u = 4;
                        String str142 = str2;
                        if (kxsVar.g(str, longValue, d, j3, hxsVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 4:
                        i10 = hxsVar2.r;
                        i9 = hxsVar2.q;
                        i8 = hxsVar2.p;
                        j6 = hxsVar2.o;
                        String str19 = hxsVar2.l;
                        mqs mqsVar18 = hxsVar2.j;
                        qgg.h0(obj);
                        mqsVar4 = mqsVar18;
                        str7 = str19;
                        hxsVar2.j = mqsVar4;
                        hxsVar2.k = null;
                        hxsVar2.l = str7;
                        hxsVar2.m = str7;
                        hxsVar2.n = this;
                        hxsVar2.o = j6;
                        hxsVar2.p = i8;
                        hxsVar2.q = i9;
                        hxsVar2.r = i10;
                        hxsVar2.u = 5;
                        obj = f(str7, hxsVar2);
                        if (obj != nm6Var) {
                        }
                        return nm6Var;
                    case 5:
                        i10 = hxsVar2.r;
                        int i25 = hxsVar2.q;
                        int i26 = hxsVar2.p;
                        long j14 = hxsVar2.o;
                        kxs kxsVar8 = hxsVar2.n;
                        String str20 = hxsVar2.m;
                        String str21 = hxsVar2.l;
                        mqs mqsVar19 = hxsVar2.j;
                        qgg.h0(obj);
                        i12 = i26;
                        str8 = str20;
                        str9 = str21;
                        j7 = j14;
                        mqsVar7 = mqsVar19;
                        i11 = i25;
                        kxsVar4 = kxsVar8;
                        longValue2 = ((Number) obj).longValue();
                        d2 = mqsVar7.d();
                        hxsVar2.j = mqsVar7;
                        hxsVar2.k = null;
                        hxsVar2.l = str9;
                        hxsVar2.m = null;
                        hxsVar2.n = null;
                        hxsVar2.o = j7;
                        hxsVar2.p = i12;
                        hxsVar2.q = i11;
                        hxsVar2.r = i10;
                        hxsVar2.u = 6;
                        mqs mqsVar112 = mqsVar7;
                        if (kxsVar4.c(str8, longValue2, d2, j7, hxsVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 6:
                        i10 = hxsVar2.r;
                        i13 = hxsVar2.q;
                        i14 = hxsVar2.p;
                        j8 = hxsVar2.o;
                        str10 = hxsVar2.l;
                        mqsVar8 = hxsVar2.j;
                        qgg.h0(obj);
                        List c2 = t75.c(mqsVar8);
                        hxsVar2.j = null;
                        hxsVar2.k = null;
                        hxsVar2.l = null;
                        hxsVar2.o = j8;
                        hxsVar2.p = i14;
                        hxsVar2.q = i13;
                        hxsVar2.r = i10;
                        hxsVar2.u = 7;
                        break;
                    case 7:
                    case 11:
                    case 15:
                        qgg.h0(obj);
                        qxr.a();
                        return Unit.a;
                    case 8:
                        int i27 = hxsVar2.r;
                        int i28 = hxsVar2.q;
                        int i29 = hxsVar2.p;
                        long j15 = hxsVar2.o;
                        kxs kxsVar9 = hxsVar2.n;
                        String str22 = hxsVar2.m;
                        String str23 = hxsVar2.l;
                        mqs mqsVar20 = hxsVar2.j;
                        qgg.h0(obj);
                        i4 = i27;
                        str4 = str23;
                        i5 = i28;
                        i = i29;
                        kxsVar2 = kxsVar9;
                        str3 = str22;
                        j4 = j15;
                        mqsVar5 = mqsVar20;
                        longValue3 = ((Number) obj).longValue();
                        d3 = mqsVar5.d();
                        hxsVar2.j = mqsVar5;
                        hxsVar2.k = null;
                        hxsVar2.l = str4;
                        hxsVar2.m = null;
                        hxsVar2.n = null;
                        hxsVar2.o = j4;
                        hxsVar2.p = i;
                        hxsVar2.q = i5;
                        hxsVar2.r = i4;
                        hxsVar2.u = 9;
                        mqs mqsVar122 = mqsVar5;
                        if (kxsVar2.g(str3, longValue3, d3, j4, hxsVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 9:
                        i17 = hxsVar2.r;
                        i16 = hxsVar2.q;
                        i15 = hxsVar2.p;
                        j9 = hxsVar2.o;
                        String str24 = hxsVar2.l;
                        mqs mqsVar21 = hxsVar2.j;
                        qgg.h0(obj);
                        mqsVar9 = mqsVar21;
                        str11 = str24;
                        hxsVar2.j = mqsVar9;
                        hxsVar2.k = null;
                        hxsVar2.l = null;
                        hxsVar2.m = str11;
                        hxsVar2.n = this;
                        hxsVar2.o = j9;
                        hxsVar2.p = i15;
                        hxsVar2.q = i16;
                        hxsVar2.r = i17;
                        hxsVar2.u = 10;
                        obj = f(str11, hxsVar2);
                        if (obj != nm6Var) {
                        }
                        return nm6Var;
                    case 10:
                        i17 = hxsVar2.r;
                        i16 = hxsVar2.q;
                        i15 = hxsVar2.p;
                        j9 = hxsVar2.o;
                        kxsVar5 = hxsVar2.n;
                        str11 = hxsVar2.m;
                        mqsVar9 = hxsVar2.j;
                        qgg.h0(obj);
                        long j112 = j9;
                        String str152 = str11;
                        mqs mqsVar132 = mqsVar9;
                        long longValue52 = ((Number) obj).longValue();
                        rr5 d82 = mqsVar132.d();
                        hxsVar2.j = null;
                        hxsVar2.k = null;
                        hxsVar2.l = null;
                        hxsVar2.m = null;
                        hxsVar2.n = null;
                        hxsVar2.o = j112;
                        hxsVar2.p = i15;
                        hxsVar2.q = i16;
                        hxsVar2.r = i17;
                        hxsVar2.u = 11;
                        break;
                    case 12:
                        int i30 = hxsVar2.r;
                        int i31 = hxsVar2.q;
                        int i32 = hxsVar2.p;
                        long j16 = hxsVar2.o;
                        kxs kxsVar10 = hxsVar2.n;
                        String str25 = hxsVar2.m;
                        String str26 = hxsVar2.l;
                        mqs mqsVar22 = hxsVar2.j;
                        qgg.h0(obj);
                        i6 = i30;
                        str6 = str26;
                        i7 = i31;
                        i = i32;
                        kxsVar3 = kxsVar10;
                        str5 = str25;
                        j5 = j16;
                        mqsVar6 = mqsVar22;
                        longValue4 = ((Number) obj).longValue();
                        d4 = mqsVar6.d();
                        hxsVar2.j = mqsVar6;
                        hxsVar2.k = null;
                        hxsVar2.l = str6;
                        hxsVar2.m = null;
                        hxsVar2.n = null;
                        hxsVar2.o = j5;
                        hxsVar2.p = i;
                        hxsVar2.q = i7;
                        hxsVar2.r = i6;
                        hxsVar2.u = 13;
                        mqs mqsVar142 = mqsVar6;
                        if (kxsVar3.g(str5, longValue4, d4, j5, hxsVar2) != nm6Var) {
                        }
                        return nm6Var;
                    case 13:
                        i20 = hxsVar2.r;
                        i19 = hxsVar2.q;
                        i18 = hxsVar2.p;
                        j10 = hxsVar2.o;
                        String str27 = hxsVar2.l;
                        mqs mqsVar23 = hxsVar2.j;
                        qgg.h0(obj);
                        mqsVar10 = mqsVar23;
                        str12 = str27;
                        hxsVar2.j = mqsVar10;
                        hxsVar2.k = null;
                        hxsVar2.l = null;
                        hxsVar2.m = str12;
                        hxsVar2.n = this;
                        hxsVar2.o = j10;
                        hxsVar2.p = i18;
                        hxsVar2.q = i19;
                        hxsVar2.r = i20;
                        hxsVar2.u = 14;
                        obj = d(str12, hxsVar2);
                        if (obj != nm6Var) {
                        }
                        return nm6Var;
                    case 14:
                        i20 = hxsVar2.r;
                        i19 = hxsVar2.q;
                        i18 = hxsVar2.p;
                        j10 = hxsVar2.o;
                        kxsVar6 = hxsVar2.n;
                        str12 = hxsVar2.m;
                        mqsVar10 = hxsVar2.j;
                        qgg.h0(obj);
                        long j122 = j10;
                        String str162 = str12;
                        mqs mqsVar152 = mqsVar10;
                        long longValue62 = ((Number) obj).longValue();
                        rr5 d92 = mqsVar152.d();
                        hxsVar2.j = null;
                        hxsVar2.k = null;
                        hxsVar2.l = null;
                        hxsVar2.m = null;
                        hxsVar2.n = null;
                        hxsVar2.o = j122;
                        hxsVar2.p = i18;
                        hxsVar2.q = i19;
                        hxsVar2.r = i20;
                        hxsVar2.u = 15;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        hxsVar = new hxs(this, cg6Var);
        hxsVar2 = hxsVar;
        Object obj2 = hxsVar2.s;
        nm6 nm6Var2 = nm6.a;
        switch (hxsVar2.u) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
    
        if (r11.j.emit(r14, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(rr5 rr5Var, j1g j1gVar, cg6 cg6Var) {
        ixs ixsVar;
        Object obj;
        int i;
        rr5 rr5Var2;
        j1g j1gVar2;
        if (cg6Var instanceof ixs) {
            ixsVar = (ixs) cg6Var;
            int i2 = ixsVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ixsVar.n = i2 - Integer.MIN_VALUE;
                obj = ixsVar.l;
                Object obj2 = nm6.a;
                i = ixsVar.n;
                xdr xdrVar = this.i;
                if (i != 0) {
                    qgg.h0(obj);
                    ixsVar.j = rr5Var;
                    ixsVar.k = j1gVar;
                    ixsVar.n = 1;
                    obj = e(rr5Var, ixsVar);
                } else if (i == 1) {
                    j1gVar = ixsVar.k;
                    rr5Var = ixsVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Boolean.TRUE;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j1gVar2 = ixsVar.k;
                    rr5Var2 = ixsVar.j;
                    qgg.h0(obj);
                    Map map = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(rr5Var2.a, map) : uah.j(map, new Pair(rr5Var2.a, j1gVar2)));
                    rr5Var2.getClass();
                    j1gVar2.getClass();
                    this.g.b(j1gVar2, rr5Var2.e());
                    xws xwsVar = new xws(rr5Var2, j1gVar2);
                    ixsVar.j = null;
                    ixsVar.k = null;
                    ixsVar.n = 3;
                }
                if (obj != j1gVar) {
                    ssg.a(4, "TrackLikesCenter", "Change track " + rr5Var + " like state to " + j1gVar + " skipped", null);
                    return Boolean.FALSE;
                }
                ssg.a(4, "TrackLikesCenter", "Change track " + rr5Var + " like state to " + j1gVar, null);
                bca bcaVar = new bca(xdrVar, 18);
                ixsVar.j = rr5Var;
                ixsVar.k = j1gVar;
                ixsVar.n = 2;
                obj = zsd.g0(bcaVar, ixsVar);
                if (obj != obj2) {
                    j1g j1gVar3 = j1gVar;
                    rr5Var2 = rr5Var;
                    j1gVar2 = j1gVar3;
                    Map map2 = (Map) obj;
                    xdrVar.l(j1gVar2 != j1g.b ? uah.f(rr5Var2.a, map2) : uah.j(map2, new Pair(rr5Var2.a, j1gVar2)));
                    rr5Var2.getClass();
                    j1gVar2.getClass();
                    this.g.b(j1gVar2, rr5Var2.e());
                    xws xwsVar2 = new xws(rr5Var2, j1gVar2);
                    ixsVar.j = null;
                    ixsVar.k = null;
                    ixsVar.n = 3;
                }
                return obj2;
            }
        }
        ixsVar = new ixs(this, cg6Var);
        obj = ixsVar.l;
        Object obj22 = nm6.a;
        i = ixsVar.n;
        xdr xdrVar2 = this.i;
        if (i != 0) {
        }
        if (obj != j1gVar) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x005f, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kxs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, HashMap hashMap, cg6 cg6Var) {
        jxs jxsVar;
        Object obj;
        nm6 nm6Var;
        int i;
        HashMap hashMap2;
        String str2;
        Map map;
        long j;
        Map map2;
        if (cg6Var instanceof jxs) {
            jxsVar = (jxs) cg6Var;
            int i2 = jxsVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jxsVar.o = i2 - Integer.MIN_VALUE;
                obj = jxsVar.m;
                nm6Var = nm6.a;
                i = jxsVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    jxsVar.j = str;
                    jxsVar.k = hashMap;
                    jxsVar.o = 1;
                    obj = f(str, jxsVar);
                    hashMap2 = hashMap;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            j = jxsVar.l;
                            map = jxsVar.k;
                            str2 = jxsVar.j;
                            qgg.h0(obj);
                            List h = u75.h(new Long(j), new Long(((Number) obj).longValue()));
                            jxsVar.j = null;
                            jxsVar.k = map;
                            jxsVar.l = j;
                            jxsVar.o = 3;
                            obj = this.e.e(jxsVar, str2, h);
                            if (obj != nm6Var) {
                                map2 = map;
                                while (r12.hasNext()) {
                                }
                                return Unit.a;
                            }
                            return nm6Var;
                        }
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = jxsVar.l;
                        map2 = jxsVar.k;
                        qgg.h0(obj);
                        for (iys iysVar : (List) obj) {
                            kys kysVar = iysVar.c;
                            String str3 = iysVar.b.a;
                            int ordinal = kysVar.ordinal();
                            if (ordinal == 0) {
                                map2.put(str3, iysVar.d == j ? j1g.a : j1g.c);
                            } else {
                                if (ordinal != 1) {
                                    b6e.s();
                                    return null;
                                }
                                map2.remove(str3);
                            }
                        }
                        return Unit.a;
                    }
                    Map map3 = jxsVar.k;
                    str = jxsVar.j;
                    qgg.h0(obj);
                    hashMap2 = map3;
                }
                long longValue = ((Number) obj).longValue();
                jxsVar.j = str;
                jxsVar.k = hashMap2;
                jxsVar.l = longValue;
                jxsVar.o = 2;
                obj = d(str, jxsVar);
                if (obj != nm6Var) {
                    str2 = str;
                    map = hashMap2;
                    j = longValue;
                    List h2 = u75.h(new Long(j), new Long(((Number) obj).longValue()));
                    jxsVar.j = null;
                    jxsVar.k = map;
                    jxsVar.l = j;
                    jxsVar.o = 3;
                    obj = this.e.e(jxsVar, str2, h2);
                    if (obj != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        jxsVar = new jxs(this, cg6Var);
        obj = jxsVar.m;
        nm6Var = nm6.a;
        i = jxsVar.o;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj).longValue();
        jxsVar.j = str;
        jxsVar.k = hashMap2;
        jxsVar.l = longValue2;
        jxsVar.o = 2;
        obj = d(str, jxsVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }
}

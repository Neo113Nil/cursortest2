package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class ayn {
    public final sml a;
    public final mm6 b;
    public final aqi c;
    public final float d;
    public final i5 e;
    public final dyo f;
    public final nwo g;
    public final xof h;
    public final Function2 i;
    public final qqi j;
    public final x6k k;
    public final zx7 l;
    public final x6k m;
    public final x6k n;
    public final x6k o;
    public final x6k p;
    public long q;
    public final HashSet r;
    public final x6k s;
    public final fk0 t;
    public final eno u;

    public ayn(sml smlVar, mm6 mm6Var, aqi aqiVar, float f, i5 i5Var, dyo dyoVar, xof xofVar, Function2 function2) {
        nwo nwoVar = nwo.a;
        this.a = smlVar;
        this.b = mm6Var;
        this.c = aqiVar;
        this.d = f;
        this.e = i5Var;
        this.f = dyoVar;
        this.g = nwoVar;
        this.h = xofVar;
        this.i = function2;
        this.j = rqi.a();
        this.k = szf.g0(null);
        this.l = szf.U(new rxn(this, 0));
        this.m = szf.g0(new enj(0L));
        this.n = szf.g0(new wpe(0L));
        this.o = szf.g0(null);
        this.p = szf.g0(null);
        this.q = 0L;
        this.r = new HashSet();
        this.s = szf.g0(null);
        this.t = new fk0(new enj(0L), azt.f, null, 12);
        this.u = szf.s0(new rxn(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ca, code lost:
    
        if (r4.a > r15.a) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02fd, code lost:
    
        r13.b(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0302, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02da, code lost:
    
        r0 = defpackage.x97.y(r9.b, null, null, new defpackage.txn(r9, r1, r10, r11, 0), 3);
        r13.b(null);
        r2.j = null;
        r2.k = null;
        r2.n = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02f7, code lost:
    
        if (r0.j0(r2) != r3) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d8, code lost:
    
        if (r4.a < r15.a) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x009c, code lost:
    
        if (r15.a == ((defpackage.fvf) r4.a).h()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r15.a == r8.a.a) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        r13.b(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ayn aynVar, yxo yxoVar, cg6 cg6Var) {
        sxn sxnVar;
        int i;
        ayn aynVar2;
        yxo yxoVar2;
        zxn d;
        w35 w35Var;
        sml smlVar;
        ArrayList arrayList;
        sml smlVar2;
        ayn aynVar3;
        sml smlVar3;
        int ordinal;
        yxo yxoVar3;
        zxn c;
        zxn zxnVar;
        Object obj;
        zxn zxnVar2;
        Object obj2;
        sml smlVar4;
        bxj bxjVar;
        aynVar.getClass();
        if (cg6Var instanceof sxn) {
            sxnVar = (sxn) cg6Var;
            int i2 = sxnVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sxnVar.n = i2 - Integer.MIN_VALUE;
                Object obj3 = sxnVar.l;
                nm6 nm6Var = nm6.a;
                i = sxnVar.n;
                if (i != 0) {
                    qgg.h0(obj3);
                    qqi qqiVar = aynVar.j;
                    sxnVar.j = aynVar;
                    sxnVar.k = yxoVar;
                    sxnVar.n = 1;
                    if (qqiVar.a(sxnVar) != nm6Var) {
                        aynVar2 = aynVar;
                        yxoVar2 = yxoVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj3);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yxoVar2 = sxnVar.k;
                ayn aynVar4 = sxnVar.j;
                qgg.h0(obj3);
                aynVar2 = aynVar4;
                d = aynVar2.d();
                sml smlVar5 = aynVar2.a;
                qqi qqiVar2 = aynVar2.j;
                if (d != null) {
                    qqiVar2.b(null);
                    return Unit.a;
                }
                cvf cvfVar = d.a;
                int ordinal2 = yxoVar2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    zxn zxnVar3 = (zxn) CollectionsKt.Z(smlVar5.s().v());
                    if (zxnVar3 != null) {
                    }
                    long i3 = aynVar2.i(aynVar2.e());
                    aynVar2.j(i3);
                    long a = d.a();
                    long h = enj.h(swf.i((int) (a >> 32), (int) (a & 4294967295L)), i3);
                    long Q = nt0.Q(d.b());
                    ynn c2 = ywf.c(h, swf.i(nmq.d(Q) + enj.e(h), nmq.b(Q) + enj.f(h)));
                    int ordinal3 = aynVar2.g.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            b6e.s();
                            return null;
                        }
                        int ordinal4 = aynVar2.f().ordinal();
                        if (ordinal4 == 0) {
                            bxjVar = bxj.b;
                        } else {
                            if (ordinal4 != 1) {
                                b6e.s();
                                return null;
                            }
                            bxjVar = bxj.a;
                        }
                        int ordinal5 = bxjVar.ordinal();
                        if (ordinal5 == 0) {
                            c2 = ynn.b(c2, 0.0f, 0.0f, Float.POSITIVE_INFINITY, 5);
                        } else {
                            if (ordinal5 != 1) {
                                b6e.s();
                                return null;
                            }
                            c2 = ynn.b(c2, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, 0.0f, 10);
                        }
                    }
                    cib s = smlVar5.s();
                    i5 i5Var = aynVar2.e;
                    i5Var.getClass();
                    bvf bvfVar = (bvf) s.b;
                    bxj bxjVar2 = bvfVar.p;
                    boolean z = bvfVar.o;
                    int ordinal6 = bxjVar2.ordinal();
                    if (ordinal6 == 0) {
                        w35Var = new w35(i5Var.c, i5Var.d);
                    } else {
                        if (ordinal6 != 1) {
                            b6e.s();
                            return null;
                        }
                        w35Var = new w35(i5Var.a, i5Var.b);
                    }
                    if (z) {
                        w35Var = new w35(w35Var.b, w35Var.a);
                    } else if (z) {
                        b6e.s();
                        return null;
                    }
                    s.getClass();
                    bwo u = s.u(w35Var);
                    float f = u.a;
                    float f2 = u.b;
                    int ordinal7 = ((bvf) s.b).p.ordinal();
                    if (ordinal7 == 0) {
                        smlVar = smlVar5;
                        ArrayList v = s.v();
                        arrayList = new ArrayList();
                        Iterator it = v.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            zxn zxnVar4 = (zxn) next;
                            if (((int) (zxnVar4.a() & 4294967295L)) >= f) {
                                int a2 = (int) (zxnVar4.a() & 4294967295L);
                                long b = zxnVar4.b();
                                smlVar2 = smlVar;
                                aynVar3 = aynVar2;
                                if (a2 + ((int) (b & 4294967295L)) <= f2) {
                                    arrayList.add(next);
                                }
                            } else {
                                smlVar2 = smlVar;
                                aynVar3 = aynVar2;
                            }
                            aynVar2 = aynVar3;
                            smlVar = smlVar2;
                        }
                    } else if (ordinal7 == 1) {
                        ArrayList v2 = s.v();
                        arrayList = new ArrayList();
                        Iterator it2 = v2.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            zxn zxnVar5 = (zxn) next2;
                            if (((int) (zxnVar5.a() >> 32)) >= f) {
                                smlVar4 = smlVar5;
                                if (((int) (zxnVar5.a() >> 32)) + ((int) (zxnVar5.b() >> 32)) <= f2) {
                                    arrayList.add(next2);
                                }
                            } else {
                                smlVar4 = smlVar5;
                            }
                            smlVar5 = smlVar4;
                        }
                        smlVar3 = smlVar5;
                        ayn aynVar5 = aynVar2;
                        if (arrayList.isEmpty()) {
                            arrayList = smlVar3.s().v();
                        }
                        ordinal = yxoVar2.ordinal();
                        if (ordinal != 0) {
                            yxoVar3 = yxo.b;
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            yxoVar3 = yxo.a;
                        }
                        ArrayList arrayList2 = arrayList;
                        c = c(aynVar5, c2, arrayList2, yxoVar3, null, 8);
                        if (c == null) {
                            afg afgVar = new afg(26, aynVar5, d);
                            int ordinal8 = yxoVar2.ordinal();
                            if (ordinal8 == 0) {
                                Iterator it3 = arrayList2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it3.next();
                                    if (((Boolean) afgVar.invoke(obj)).booleanValue()) {
                                        break;
                                    }
                                }
                                zxnVar2 = (zxn) obj;
                            } else {
                                if (ordinal8 != 1) {
                                    b6e.s();
                                    return null;
                                }
                                ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = listIterator.previous();
                                    if (((Boolean) afgVar.invoke(obj2)).booleanValue()) {
                                        break;
                                    }
                                }
                                zxnVar2 = (zxn) obj2;
                            }
                            c = zxnVar2;
                        }
                        zxnVar = c;
                        Continuation continuation = null;
                        if (zxnVar != null) {
                            qqiVar2.b(null);
                            return Unit.a;
                        }
                        cvf cvfVar2 = zxnVar.a;
                        int ordinal9 = yxoVar2.ordinal();
                        if (ordinal9 != 0) {
                            if (ordinal9 != 1) {
                                b6e.s();
                                return null;
                            }
                        }
                    } else {
                        smlVar = smlVar5;
                        b6e.s();
                        arrayList = null;
                    }
                    smlVar3 = smlVar;
                    ayn aynVar52 = aynVar2;
                    if (arrayList.isEmpty()) {
                    }
                    ordinal = yxoVar2.ordinal();
                    if (ordinal != 0) {
                    }
                    ArrayList arrayList22 = arrayList;
                    c = c(aynVar52, c2, arrayList22, yxoVar3, null, 8);
                    if (c == null) {
                    }
                    zxnVar = c;
                    Continuation continuation2 = null;
                    if (zxnVar != null) {
                    }
                }
            }
        }
        sxnVar = new sxn(aynVar, cg6Var);
        Object obj32 = sxnVar.l;
        nm6 nm6Var2 = nm6.a;
        i = sxnVar.n;
        if (i != 0) {
        }
        d = aynVar2.d();
        sml smlVar52 = aynVar2.a;
        qqi qqiVar22 = aynVar2.j;
        if (d != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(1:(6:13|14|15|16|17|18)(2:21|22))(6:23|24|25|26|(1:28)(1:32)|29))(8:33|34|35|36|(2:38|31)|26|(0)(0)|29))(3:39|40|41))(2:62|(2:64|65)(1:66))|42|43|44|(3:46|47|48)(5:49|(6:54|36|(0)|26|(0)(0)|29)|55|(7:57|35|36|(0)|26|(0)(0)|29)|31)))|70|6|7|(0)(0)|42|43|44|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0195, code lost:
    
        if (defpackage.tyf.J(1000, r2, r4) != r5) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
    
        if (r3.a(r4) == r5) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0130 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:14:0x003f, B:15:0x0198, B:24:0x0058, B:26:0x0126, B:28:0x0130, B:29:0x0179, B:32:0x0170, B:34:0x006a, B:36:0x00f9), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:14:0x003f, B:15:0x0198, B:24:0x0058, B:26:0x0126, B:28:0x0130, B:29:0x0179, B:32:0x0170, B:34:0x006a, B:36:0x00f9), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae A[Catch: all -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b4, blocks: (B:43:0x00a6, B:46:0x00ae, B:49:0x00b8, B:51:0x00c6, B:55:0x00d7), top: B:42:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8 A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #0 {all -> 0x00b4, blocks: (B:43:0x00a6, B:46:0x00ae, B:49:0x00b8, B:51:0x00c6, B:55:0x00d7), top: B:42:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r0v15, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zxn] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v13, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [oqi] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(ayn aynVar, zxn zxnVar, zxn zxnVar2, cg6 cg6Var) {
        uxn uxnVar;
        int i;
        qqi qqiVar;
        zxn zxnVar3;
        boolean g;
        ayn aynVar2;
        zxn zxnVar4;
        zxn zxnVar5;
        qqi qqiVar2;
        zxn zxnVar6;
        qqi qqiVar3;
        ryc rycVar;
        mm6 mm6Var;
        cvf cvfVar;
        cvf cvfVar2;
        Object obj;
        wpe wpeVar;
        ayn aynVar3 = aynVar;
        ?? r1 = zxnVar;
        zxn zxnVar7 = zxnVar2;
        aynVar3.getClass();
        try {
            try {
                if (cg6Var instanceof uxn) {
                    uxnVar = (uxn) cg6Var;
                    int i2 = uxnVar.p;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        uxnVar.p = i2 - Integer.MIN_VALUE;
                        Object obj2 = uxnVar.n;
                        nm6 nm6Var = nm6.a;
                        i = uxnVar.p;
                        Continuation continuation = null;
                        if (i != 0) {
                            qgg.h0(obj2);
                            if (r1.a.a == zxnVar7.a.a) {
                                return Unit.a;
                            }
                            qqiVar = aynVar3.j;
                            uxnVar.j = aynVar3;
                            uxnVar.k = r1;
                            uxnVar.l = zxnVar7;
                            uxnVar.m = qqiVar;
                            uxnVar.p = 1;
                            zxnVar3 = r1;
                        } else if (i == 1) {
                            ?? r0 = uxnVar.m;
                            zxn zxnVar8 = uxnVar.l;
                            zxn zxnVar9 = (zxn) uxnVar.k;
                            ayn aynVar4 = uxnVar.j;
                            qgg.h0(obj2);
                            zxnVar7 = zxnVar8;
                            zxnVar3 = zxnVar9;
                            qqiVar = r0;
                            aynVar3 = aynVar4;
                        } else if (i == 2) {
                            ?? r12 = uxnVar.m;
                            zxnVar4 = uxnVar.l;
                            zxnVar5 = (zxn) uxnVar.k;
                            aynVar2 = uxnVar.j;
                            qgg.h0(obj2);
                            qqiVar2 = r12;
                            zxnVar6 = zxnVar5;
                            zxnVar7 = zxnVar4;
                            aynVar3 = aynVar2;
                            qqiVar3 = qqiVar2;
                            aynVar3.o.setValue(new Integer(zxnVar6.a.a));
                            rycVar = (ryc) aynVar3.c.getValue();
                            mm6Var = aynVar3.b;
                            cvfVar = zxnVar6.a;
                            cvfVar2 = zxnVar7.a;
                            uxnVar.j = aynVar3;
                            uxnVar.k = zxnVar6;
                            uxnVar.l = zxnVar7;
                            uxnVar.m = qqiVar3;
                            uxnVar.p = 3;
                            obj = qqiVar3;
                            if (rycVar.invoke(mm6Var, cvfVar, cvfVar2, uxnVar) == nm6Var) {
                                return nm6Var;
                            }
                            if (zxnVar7.a.a <= zxnVar6.a.a) {
                            }
                            aynVar3.p.setValue(wpeVar);
                            g2l g2lVar = new g2l(aynVar3, continuation, 26);
                            uxnVar.j = aynVar3;
                            uxnVar.k = obj;
                            uxnVar.l = null;
                            uxnVar.m = null;
                            uxnVar.p = 4;
                            r1 = obj;
                        } else {
                            if (i != 3) {
                                if (i != 4) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oqi oqiVar = (oqi) uxnVar.k;
                                aynVar3 = uxnVar.j;
                                qgg.h0(obj2);
                                r1 = oqiVar;
                                aynVar3.o.setValue(null);
                                aynVar3.p.setValue(null);
                                r1.b(null);
                                return Unit.a;
                            }
                            Object obj3 = uxnVar.m;
                            zxn zxnVar10 = uxnVar.l;
                            zxn zxnVar11 = (zxn) uxnVar.k;
                            ayn aynVar5 = uxnVar.j;
                            qgg.h0(obj2);
                            zxnVar6 = zxnVar11;
                            zxnVar7 = zxnVar10;
                            aynVar3 = aynVar5;
                            obj = obj3;
                            if (zxnVar7.a.a <= zxnVar6.a.a) {
                                long a = zxnVar7.a();
                                long b = zxnVar7.b();
                                long t = xv.t(((int) (a >> 32)) + ((int) (b >> 32)), ((int) (a & 4294967295L)) + ((int) (b & 4294967295L)));
                                long b2 = zxnVar6.b();
                                wpeVar = new wpe(xv.t(((int) (t >> 32)) - ((int) (b2 >> 32)), ((int) (t & 4294967295L)) - ((int) (b2 & 4294967295L))));
                            } else {
                                wpeVar = new wpe(zxnVar7.a());
                            }
                            aynVar3.p.setValue(wpeVar);
                            g2l g2lVar2 = new g2l(aynVar3, continuation, 26);
                            uxnVar.j = aynVar3;
                            uxnVar.k = obj;
                            uxnVar.l = null;
                            uxnVar.m = null;
                            uxnVar.p = 4;
                            r1 = obj;
                        }
                        g = aynVar3.g();
                        sml smlVar = aynVar3.a;
                        if (g) {
                            Unit unit = Unit.a;
                            qqiVar.b(null);
                            return unit;
                        }
                        int i3 = zxnVar3.a.a;
                        fvf fvfVar = (fvf) smlVar.a;
                        if (i3 != fvfVar.h() && zxnVar7.a.a != fvfVar.h()) {
                            qqi qqiVar4 = qqiVar;
                            zxnVar6 = zxnVar3;
                            qqiVar3 = qqiVar4;
                            aynVar3.o.setValue(new Integer(zxnVar6.a.a));
                            rycVar = (ryc) aynVar3.c.getValue();
                            mm6Var = aynVar3.b;
                            cvfVar = zxnVar6.a;
                            cvfVar2 = zxnVar7.a;
                            uxnVar.j = aynVar3;
                            uxnVar.k = zxnVar6;
                            uxnVar.l = zxnVar7;
                            uxnVar.m = qqiVar3;
                            uxnVar.p = 3;
                            obj = qqiVar3;
                            if (rycVar.invoke(mm6Var, cvfVar, cvfVar2, uxnVar) == nm6Var) {
                            }
                            if (zxnVar7.a.a <= zxnVar6.a.a) {
                            }
                            aynVar3.p.setValue(wpeVar);
                            g2l g2lVar22 = new g2l(aynVar3, continuation, 26);
                            uxnVar.j = aynVar3;
                            uxnVar.k = obj;
                            uxnVar.l = null;
                            uxnVar.m = null;
                            uxnVar.p = 4;
                            r1 = obj;
                        }
                        int h = fvfVar.h();
                        int i4 = fvfVar.i();
                        uxnVar.j = aynVar3;
                        uxnVar.k = zxnVar3;
                        uxnVar.l = zxnVar7;
                        uxnVar.m = qqiVar;
                        uxnVar.p = 2;
                        fvfVar.l(h, i4);
                        if (Unit.a != nm6Var) {
                            aynVar2 = aynVar3;
                            zxnVar4 = zxnVar7;
                            zxnVar5 = zxnVar3;
                            qqiVar2 = qqiVar;
                            zxnVar6 = zxnVar5;
                            zxnVar7 = zxnVar4;
                            aynVar3 = aynVar2;
                            qqiVar3 = qqiVar2;
                            aynVar3.o.setValue(new Integer(zxnVar6.a.a));
                            rycVar = (ryc) aynVar3.c.getValue();
                            mm6Var = aynVar3.b;
                            cvfVar = zxnVar6.a;
                            cvfVar2 = zxnVar7.a;
                            uxnVar.j = aynVar3;
                            uxnVar.k = zxnVar6;
                            uxnVar.l = zxnVar7;
                            uxnVar.m = qqiVar3;
                            uxnVar.p = 3;
                            obj = qqiVar3;
                            if (rycVar.invoke(mm6Var, cvfVar, cvfVar2, uxnVar) == nm6Var) {
                            }
                            if (zxnVar7.a.a <= zxnVar6.a.a) {
                            }
                            aynVar3.p.setValue(wpeVar);
                            g2l g2lVar222 = new g2l(aynVar3, continuation, 26);
                            uxnVar.j = aynVar3;
                            uxnVar.k = obj;
                            uxnVar.l = null;
                            uxnVar.m = null;
                            uxnVar.p = 4;
                            r1 = obj;
                        }
                        return nm6Var;
                    }
                }
                g = aynVar3.g();
                sml smlVar2 = aynVar3.a;
                if (g) {
                }
            } catch (Throwable th) {
                th = th;
                r1 = qqiVar;
                r1.b(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        uxnVar = new uxn(aynVar3, cg6Var);
        Object obj22 = uxnVar.n;
        nm6 nm6Var2 = nm6.a;
        i = uxnVar.p;
        Continuation continuation2 = null;
    }

    public static zxn c(ayn aynVar, ynn ynnVar, ArrayList arrayList, yxo yxoVar, ybg ybgVar, int i) {
        if ((i & 4) != 0) {
            yxoVar = yxo.b;
        }
        uif uifVar = ybgVar;
        if ((i & 8) != 0) {
            uifVar = hhm.C;
        }
        aynVar.getClass();
        lma lmaVar = new lma(19, aynVar, ynnVar, uifVar);
        int ordinal = yxoVar.ordinal();
        Object obj = null;
        if (ordinal == 0) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Object previous = listIterator.previous();
                if (((Boolean) lmaVar.invoke(previous)).booleanValue()) {
                    obj = previous;
                    break;
                }
            }
            return (zxn) obj;
        }
        if (ordinal != 1) {
            b6e.s();
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Boolean) lmaVar.invoke(next)).booleanValue()) {
                obj = next;
                break;
            }
        }
        return (zxn) obj;
    }

    public final zxn d() {
        Object value = this.k.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        Iterator it = this.a.s().v().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((zxn) next).a.l.equals(value)) {
                obj = next;
                break;
            }
        }
        return (zxn) obj;
    }

    public final long e() {
        long a;
        zxn d = d();
        if (d == null) {
            return 0L;
        }
        int i = d.a.a;
        x6k x6kVar = this.o;
        Integer num = (Integer) x6kVar.getValue();
        x6k x6kVar2 = this.p;
        if (num == null || i != num.intValue() || ((Integer) x6kVar.getValue()) == null) {
            x6kVar.setValue(null);
            x6kVar2.setValue(null);
            a = d.a();
        } else {
            wpe wpeVar = (wpe) x6kVar2.getValue();
            a = wpeVar != null ? wpeVar.a : d.a();
        }
        long j = ((enj) this.m.getValue()).a;
        long j2 = ((wpe) this.n.getValue()).a;
        long i2 = i(enj.g(swf.i((int) (j2 >> 32), (int) (j2 & 4294967295L)), swf.i((int) (a >> 32), (int) (a & 4294967295L))));
        j(i2);
        return enj.h(j, i2);
    }

    public final bxj f() {
        return ((bvf) this.a.s().b).p;
    }

    public final boolean g() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, long j, cg6 cg6Var) {
        wxn wxnVar;
        int i;
        Object obj2;
        zxn zxnVar;
        long j2;
        ayn aynVar;
        if (cg6Var instanceof wxn) {
            wxnVar = (wxn) cg6Var;
            int i2 = wxnVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wxnVar.p = i2 - Integer.MIN_VALUE;
                Object obj3 = wxnVar.n;
                nm6 nm6Var = nm6.a;
                i = wxnVar.p;
                if (i != 0) {
                    qgg.h0(obj3);
                    sml smlVar = this.a;
                    Iterator it = smlVar.s().v().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((zxn) obj2).a.l.equals(obj)) {
                            break;
                        }
                    }
                    zxnVar = (zxn) obj2;
                    if (zxnVar != null) {
                        long a = zxnVar.a();
                        int ordinal = f().ordinal();
                        if (ordinal == 0) {
                            j2 = a & 4294967295L;
                        } else {
                            if (ordinal != 1) {
                                b6e.s();
                                return null;
                            }
                            j2 = a >> 32;
                        }
                        int i3 = (int) j2;
                        if (i3 < 0) {
                            b9r Q = weo.Q(0.0f, 0.0f, null, 7);
                            wxnVar.j = this;
                            wxnVar.k = obj;
                            wxnVar.l = zxnVar;
                            wxnVar.m = j;
                            wxnVar.p = 1;
                            if (neg.g((fvf) smlVar.a, i3, Q, wxnVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                        aynVar = this;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = wxnVar.m;
                zxn zxnVar2 = wxnVar.l;
                Object obj4 = wxnVar.k;
                aynVar = wxnVar.j;
                qgg.h0(obj3);
                zxnVar = zxnVar2;
                obj = obj4;
                aynVar.k.setValue(obj);
                aynVar.n.setValue(new wpe(zxnVar.a()));
                aynVar.q = j;
                return Unit.a;
            }
        }
        wxnVar = new wxn(this, cg6Var);
        Object obj32 = wxnVar.n;
        nm6 nm6Var2 = nm6.a;
        i = wxnVar.p;
        if (i != 0) {
        }
        aynVar.k.setValue(obj);
        aynVar.n.setValue(new wpe(zxnVar.a()));
        aynVar.q = j;
        return Unit.a;
    }

    public final long i(long j) {
        boolean z = ((bvf) this.a.s().b).o;
        if (z) {
            j = o8g.O(j, f());
        } else if (z) {
            b6e.s();
            return 0L;
        }
        int ordinal = f().ordinal();
        if (ordinal == 0) {
            return j;
        }
        if (ordinal != 1) {
            b6e.s();
            return 0L;
        }
        int ordinal2 = this.h.ordinal();
        if (ordinal2 == 0) {
            return j;
        }
        if (ordinal2 == 1) {
            return o8g.O(j, bxj.b);
        }
        b6e.s();
        return 0L;
    }

    public final long j(long j) {
        int ordinal = this.h.ordinal();
        if (ordinal == 0) {
            return j;
        }
        if (ordinal == 1) {
            return j;
        }
        b6e.s();
        return 0L;
    }
}

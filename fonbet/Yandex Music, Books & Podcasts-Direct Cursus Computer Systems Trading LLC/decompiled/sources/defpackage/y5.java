package defpackage;

import android.graphics.RectF;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.PatternSyntaxException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y5 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(int i, Object obj) {
        super(2);
        this.r = i;
        this.s = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x04dd, code lost:
    
        if (r3.containsKey(r4) != false) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, kotlin.coroutines.CoroutineContext, pm6] */
    /* JADX WARN: Type inference failed for: r11v22 */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean j;
        yt3 yt3Var;
        w35 w35Var;
        long h;
        long t;
        Continuation continuation;
        int i;
        boolean z;
        zxn c;
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    ((z5) this.s).j(0, oq5Var);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                ((tf0) this.s).k(((Number) obj).intValue(), (qfp) obj2);
                return Unit.a;
            case 2:
                e7o e7oVar = (e7o) this.s;
                ynn G = uwf.G((RectF) obj);
                ynn G2 = uwf.G((RectF) obj2);
                switch (e7oVar.a) {
                    case 23:
                        j = G.j(G2);
                        break;
                    default:
                        j = G2.a(G.c());
                        break;
                }
                return Boolean.valueOf(j);
            case 3:
                r8b r8bVar = (r8b) obj;
                r8b r8bVar2 = (r8b) obj2;
                r8b r8bVar3 = r8b.c;
                return Boolean.valueOf(r8bVar == r8bVar3 && r8bVar2 == r8bVar3 && !((vpb) this.s).a.d);
            case 4:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    yci b = d.b(vci.a, 1.0f);
                    rre rreVar = qx0.b;
                    hz2 hz2Var = b2c.l;
                    pyc pycVar = (pyc) this.s;
                    nho a = lho.a(rreVar, hz2Var, oq5Var2, 54);
                    int i2 = oq5Var2.P;
                    a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, b);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a, wp5.f);
                    g0g.U(oq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var2, i2, kb5Var);
                    }
                    g0g.U(oq5Var2, H, wp5.d);
                    pycVar.invoke(qho.a, oq5Var2, 6);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 5:
                long longValue = ((Number) obj2).longValue();
                if (cfp.a((bfp) this.s, longValue)) {
                    return Long.valueOf(longValue);
                }
                return null;
            case 6:
                yci yciVar = (yci) obj;
                yci yciVar2 = (wci) obj2;
                hq5 hq5Var3 = (hq5) this.s;
                if (yciVar2 instanceof fq5) {
                    pyc pycVar2 = ((fq5) yciVar2).b;
                    pycVar2.getClass();
                    wct.o(3, pycVar2);
                    yciVar2 = vnj.G(hq5Var3, (yci) pycVar2.invoke(vci.a, hq5Var3, 0));
                }
                return yciVar.f(yciVar2);
            case 7:
                ((Number) obj2).intValue();
                oq5 oq5Var3 = (oq5) ((hq5) obj);
                oq5Var3.Z(-1744780674);
                String M = rvf.M(((y9s) this.s).a, oq5Var3);
                oq5Var3.p(false);
                return M;
            case 8:
                ((Number) obj2).intValue();
                j66.B((qbs) this.s, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                sf7 sf7Var = (sf7) this.s;
                boolean z2 = sf7Var.c;
                ArrayList arrayList = sf7Var.i;
                ArrayList arrayList2 = sf7Var.h;
                if (z2) {
                    arrayList2.clear();
                    ArrayList y0 = CollectionsKt.y0(list);
                    Collections.reverse(y0);
                    arrayList2.addAll(y0);
                    arrayList.clear();
                    ArrayList y02 = CollectionsKt.y0(list2);
                    Collections.reverse(y02);
                    arrayList.addAll(y02);
                    sf7Var.c(pdr.a(sf7Var.m, false, false, null, list, list2, 7));
                    jtc jtcVar = sf7Var.j;
                    jtcVar.getClass();
                    if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : arrayList2) {
                            if (((LinkedHashSet) jtcVar.a).add((Throwable) obj3)) {
                                arrayList3.add(obj3);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (((LinkedHashSet) jtcVar.b).add((Throwable) next)) {
                                arrayList4.add(next);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            int i3 = i9f.a;
                        }
                        if (!arrayList4.isEmpty()) {
                            int i4 = i9f.a;
                        }
                        if (!arrayList3.isEmpty() || !arrayList4.isEmpty()) {
                            int i5 = i9f.a;
                        }
                    }
                }
                return Unit.a;
            case 10:
                Exception exc = (Exception) obj;
                Function0 function0 = (Function0) obj2;
                if (exc instanceof PatternSyntaxException) {
                    ((dfb) this.s).d(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc).getPattern() + "'."));
                } else {
                    function0.invoke();
                }
                return Unit.a;
            case 11:
                int intValue3 = ((Number) obj2).intValue();
                ((zgc) obj).getClass();
                return Boolean.valueOf(!((s7w) this.s).a.contains(Integer.valueOf(intValue3)));
            case 12:
                q1f q1fVar = (q1f) obj;
                String str = (String) obj2;
                q1fVar.getClass();
                str.getClass();
                w1g.B((LinkedHashMap) ((es6) this.s).c, str, q1fVar);
                return Unit.a;
            case 13:
                fyd fydVar = (fyd) obj;
                fyd fydVar2 = (fyd) obj2;
                fydVar.getClass();
                fydVar2.getClass();
                hiu hiuVar = (hiu) this.s;
                if (ksw.L(hiuVar, fydVar.a, pfg.b)) {
                    fydVar.a = hiuVar;
                    fydVar.b.a(hiuVar);
                }
                if (ksw.L(hiuVar, fydVar2.a, pfg.c)) {
                    fydVar2.a = hiuVar;
                    fydVar2.b.a(hiuVar);
                }
                return Unit.a;
            case 14:
                ((Number) obj2).intValue();
                ((xje) this.s).a(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 15:
                q1f q1fVar2 = (q1f) obj;
                String str2 = (String) obj2;
                q1fVar2.getClass();
                str2.getClass();
                ((ArrayList) this.s).add("\"" + str2 + "\": " + bkp.S(q1fVar2));
                return Unit.a;
            case 16:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Number) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    List list3 = (List) this.s;
                    int size = list3.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        Function2 function2 = (Function2) list3.get(i6);
                        int i7 = oq5Var4.P;
                        xp5.T.getClass();
                        na5 na5Var = wp5.c;
                        oq5Var4.d0();
                        if (oq5Var4.O) {
                            oq5Var4.k(na5Var);
                        } else {
                            oq5Var4.n0();
                        }
                        kb5 kb5Var2 = wp5.g;
                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i7))) {
                            ouj.x(i7, oq5Var4, i7, kb5Var2);
                        }
                        function2.invoke(oq5Var4, 0);
                        oq5Var4.p(true);
                    }
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 17:
                ((Number) obj2).intValue();
                return new ypd(((ypd) ((Function1) this.s).invoke((psf) obj)).a);
            case 18:
                ((has) this.s).d(((enj) obj2).a);
                return Unit.a;
            case 19:
                ((Number) obj2).intValue();
                ((rai) this.s).j(rvf.R(1), (hq5) obj);
                return Unit.a;
            case 20:
                long j2 = ((hqe) obj).a;
                long j3 = ((ga6) obj2).a;
                gdq gdqVar = gdq.a;
                float h2 = ga6.h(j3);
                zcq zcqVar = (zcq) this.s;
                hbi hbiVar = new hbi(h2, j2, zcqVar);
                ooa ooaVar = new ooa();
                hbiVar.invoke(ooaVar);
                LinkedHashMap linkedHashMap = ooaVar.a;
                i9h i9hVar = new i9h(linkedHashMap);
                int ordinal = ((gdq) ((zx7) zcqVar.b.j).getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1 && ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    gdq gdqVar2 = gdq.c;
                    if (!linkedHashMap.containsKey(gdqVar2)) {
                        gdqVar2 = gdq.b;
                        break;
                    }
                    gdqVar = gdqVar2;
                }
                return new Pair(i9hVar, gdqVar);
            case 21:
                long j4 = ((hqe) obj).a;
                float h3 = ga6.h(((ga6) obj2).a);
                bci bciVar = (bci) this.s;
                hbi hbiVar2 = new hbi(h3, bciVar, j4);
                qoa qoaVar = new qoa();
                hbiVar2.invoke(qoaVar);
                LinkedHashMap linkedHashMap2 = qoaVar.a;
                j9h j9hVar = new j9h(linkedHashMap2);
                boolean z3 = bciVar.b.e().a.size() > 0;
                cci b2 = bciVar.b();
                if (z3 || !linkedHashMap2.containsKey(b2)) {
                    int ordinal2 = bciVar.c().ordinal();
                    if (ordinal2 == 0) {
                        b2 = cci.a;
                    } else {
                        if (ordinal2 != 1 && ordinal2 != 2) {
                            b6e.s();
                            return null;
                        }
                        b2 = cci.c;
                        if (!linkedHashMap2.containsKey(b2)) {
                            b2 = cci.b;
                            if (!linkedHashMap2.containsKey(b2)) {
                                b2 = cci.a;
                            }
                        }
                    }
                }
                return new Pair(j9hVar, b2);
            case 22:
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Number) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    oq5Var5.B((jfi) this.s, oq5Var5.l(), null, false);
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 23:
                int intValue6 = ((Number) obj2).intValue();
                o3k o3kVar = (o3k) this.s;
                o3kVar.s.i(o3kVar.i(intValue6));
                return Unit.a;
            case 24:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                ((d1n) this.s).e.h(floatValue);
                return Unit.a;
            case 25:
                Set set = (Set) obj;
                cnn cnnVar = (cnn) this.s;
                synchronized (cnnVar.c) {
                    try {
                        if (((zmn) cnnVar.u.getValue()).compareTo(zmn.e) >= 0) {
                            upi upiVar = cnnVar.h;
                            if (set instanceof yso) {
                                upi upiVar2 = ((yso) set).a;
                                Object[] objArr = upiVar2.b;
                                long[] jArr = upiVar2.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j5 = jArr[i8];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((255 & j5) < 128) {
                                                    Object obj4 = objArr[(i8 << 3) + i10];
                                                    if (!(obj4 instanceof ner) || ((ner) obj4).b(1)) {
                                                        upiVar.a(obj4);
                                                    }
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i9 != 8) {
                                            }
                                        }
                                        if (i8 != length) {
                                            i8++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof ner) || ((ner) obj5).b(1)) {
                                        upiVar.a(obj5);
                                    }
                                }
                            }
                            yt3Var = cnnVar.y();
                        } else {
                            yt3Var = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (yt3Var != null) {
                    r7o r7oVar = z7o.b;
                    ((zt3) yt3Var).resumeWith(Unit.a);
                }
                return Unit.a;
            case 26:
                goo gooVar = (goo) obj;
                aqi aqiVar = (aqi) obj2;
                if (aqiVar instanceof l2r) {
                    Object invoke = ((Function2) ((apo) this.s).b).invoke(gooVar, aqiVar.getValue());
                    if (invoke != null) {
                        n2r f = ((l2r) aqiVar).f();
                        f.getClass();
                        return new x6k(invoke, f);
                    }
                } else {
                    xq0.x("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                return null;
            case 27:
                lfm lfmVar = (lfm) obj;
                long j6 = ((enj) obj2).a;
                lfmVar.getClass();
                lfmVar.a();
                ayn aynVar = ((oxn) this.s).a;
                qqi qqiVar = aynVar.j;
                dyo dyoVar = aynVar.f;
                sml smlVar = aynVar.a;
                x6k x6kVar = aynVar.m;
                x6kVar.setValue(new enj(enj.h(((enj) x6kVar.getValue()).a, j6)));
                zxn d = aynVar.d();
                if (d != null) {
                    long i11 = aynVar.i(aynVar.e());
                    aynVar.j(i11);
                    long a2 = d.a();
                    long h4 = enj.h(swf.i((int) (a2 >> 32), (int) (a2 & 4294967295L)), i11);
                    long Q = nt0.Q(d.b());
                    long i12 = swf.i(nmq.d(Q) + enj.e(h4), nmq.b(Q) + enj.f(h4));
                    cib s = smlVar.s();
                    i5 i5Var = aynVar.e;
                    i5Var.getClass();
                    bvf bvfVar = (bvf) s.b;
                    bxj bxjVar = bvfVar.p;
                    boolean z4 = bvfVar.o;
                    int ordinal3 = bxjVar.ordinal();
                    if (ordinal3 == 0) {
                        w35Var = new w35(i5Var.c, i5Var.d);
                    } else {
                        if (ordinal3 != 1) {
                            b6e.s();
                            return null;
                        }
                        w35Var = new w35(i5Var.a, i5Var.b);
                    }
                    if (z4) {
                        w35Var = new w35(w35Var.b, w35Var.a);
                    } else if (z4) {
                        b6e.s();
                        return null;
                    }
                    bwo u = s.u(w35Var);
                    float f2 = u.a;
                    float f3 = u.b;
                    boolean z5 = ((bvf) smlVar.s().b).o || (aynVar.h == xof.b && aynVar.f() == bxj.b);
                    if (z5) {
                        h = enj.g(i12, aynVar.q);
                    } else {
                        if (z5) {
                            b6e.s();
                            return null;
                        }
                        h = enj.h(h4, aynVar.q);
                    }
                    bxj f4 = aynVar.f();
                    int i13 = -((bvf) smlVar.s().b).l;
                    int ordinal4 = f4.ordinal();
                    if (ordinal4 == 0) {
                        t = xv.t(0, i13);
                    } else {
                        if (ordinal4 != 1) {
                            b6e.s();
                            return null;
                        }
                        t = xv.t(i13, 0);
                    }
                    long h5 = enj.h(h, swf.i((int) (t >> 32), (int) (t & 4294967295L)));
                    float u2 = o8g.u(h5, aynVar.f()) - f2;
                    if (u2 < 0.0f) {
                        u2 = 0.0f;
                    }
                    float u3 = f3 - o8g.u(h5, aynVar.f());
                    float f5 = u3 < 0.0f ? 0.0f : u3;
                    float f6 = aynVar.d;
                    if (u2 < f6) {
                        z = dyoVar.b(yxo.a, (1 - yhn.c((u2 + f6) / (f6 * 2), 0.0f, 1.0f)) * 10, new rxn(aynVar, 2), new vxn(aynVar, null, 0));
                        continuation = 0;
                        i = 1;
                    } else if (f5 < f6) {
                        continuation = 0;
                        i = 1;
                        z = dyoVar.b(yxo.b, (1 - yhn.c((f5 + f6) / (f6 * 2), 0.0f, 1.0f)) * 10, new rxn(aynVar, 3), new vxn(aynVar, null == true ? 1 : 0, i));
                    } else {
                        continuation = 0;
                        i = 1;
                        x97.y(dyoVar.b, null, null, new byo(dyoVar, null == true ? 1 : 0, i), 3);
                        z = false;
                    }
                    if (qqiVar.g()) {
                        rar rarVar = dyoVar.d;
                        if ((rarVar == null || rarVar.b() != i) && !z && (c = ayn.c(aynVar, ywf.c(h4, i12), smlVar.s().v(), null, new ybg(24, d), 4)) != null) {
                            x97.y(aynVar.b, continuation, continuation, new txn(aynVar, d, c, continuation, 1), 3);
                        }
                        qqiVar.b(continuation);
                    }
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                float floatValue2 = ((Number) obj).floatValue();
                float floatValue3 = ((Number) obj2).floatValue();
                lxo lxoVar = (lxo) this.s;
                x97.y(lxoVar.G0(), null, null, new kxo(lxoVar, floatValue2, floatValue3, null), 3);
                return Boolean.TRUE;
            default:
                wof wofVar = (wof) this.s;
                wof c2 = ((ugi) obj).c();
                wof c3 = ((ugi) obj2).c();
                long v = c2 != null ? wofVar.v(c2, 0L) : 0L;
                long v2 = c3 != null ? wofVar.v(c3, 0L) : 0L;
                int i14 = (int) (v & 4294967295L);
                int i15 = (int) (4294967295L & v2);
                return Integer.valueOf(Float.intBitsToFloat(i14) == Float.intBitsToFloat(i15) ? gl5.b(Float.valueOf(Float.intBitsToFloat((int) (v >> 32))), Float.valueOf(Float.intBitsToFloat((int) (v2 >> 32)))) : gl5.b(Float.valueOf(Float.intBitsToFloat(i14)), Float.valueOf(Float.intBitsToFloat(i15))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(Object obj, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = obj;
    }
}

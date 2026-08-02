package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import ru.yandex.video.m3.data.PlaybackParameters;

/* loaded from: classes3.dex */
public final class sea extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sea(List list, n5b n5bVar) {
        super(1);
        this.r = 27;
        this.s = list;
        this.t = n5bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0612  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Pair pair;
        Object mdtVar;
        Object invoke;
        Object obj2;
        List list;
        Typeface typeface;
        int i = 5;
        int i2 = 0;
        switch (this.r) {
            case 0:
                int intValue = ((Number) obj).intValue();
                return ((fp5) this.t).invoke(Integer.valueOf(intValue), ((List) this.s).get(intValue));
            case 1:
                int intValue2 = ((Number) obj).intValue();
                return ((rea) this.t).invoke(Integer.valueOf(intValue2), ((List) this.s).get(intValue2));
            case 2:
                int intValue3 = ((Number) obj).intValue();
                return ((rea) this.t).invoke(Integer.valueOf(intValue3), ((List) this.s).get(intValue3));
            case 3:
                fa0 fa0Var = (fa0) this.t;
                bpa bpaVar = (bpa) this.s;
                long i3 = enj.i(bpaVar.D ? -1.0f : 1.0f, ((wma) obj).a);
                bxj bxjVar = bpaVar.z;
                kr3 kr3Var = zoa.a;
                fa0Var.a(Float.intBitsToFloat((int) (bxjVar == bxj.a ? i3 & 4294967295L : i3 >> 32)));
                return Unit.a;
            case 4:
                int intValue4 = ((Number) obj).intValue();
                return ((rea) this.t).invoke(Integer.valueOf(intValue4), ((ArrayList) this.s).get(intValue4));
            case 5:
                qsb qsbVar = (qsb) obj;
                qsbVar.getClass();
                fcl fclVar = (fcl) this.t;
                qsbVar.o = fclVar.f;
                qsbVar.p = (hr4) this.s;
                qsbVar.g = fclVar.j;
                qsbVar.f = Integer.valueOf(fclVar.k);
                qsbVar.q = new tq4(fclVar.l, fclVar.m, fclVar.n, fclVar.r);
                qsbVar.j = Boolean.valueOf(fclVar.o);
                List list2 = fclVar.s;
                String str = Build.MODEL;
                if (list2.contains(str)) {
                    qsbVar.b = Boolean.TRUE;
                }
                Boolean bool = fclVar.t;
                if (bool != null) {
                    qsbVar.k = bool;
                } else if (Intrinsics.d(str, "SK68Y")) {
                    qsbVar.k = Boolean.FALSE;
                }
                qsbVar.r = Boolean.valueOf(fclVar.u);
                return Unit.a;
            case 6:
                return ((dcb) this.t).invoke(((List) this.s).get(((Number) obj).intValue()));
            case 7:
                if (((Boolean) obj).booleanValue()) {
                    return nif.d(Unit.a);
                }
                oxa oxaVar = (oxa) this.t;
                String str2 = (String) this.s;
                vx6 vx6Var = (vx6) oxaVar.b;
                return quj.C((hg3) vx6Var.c, (hg3) vx6Var.d, new cr4(vx6Var, str2, new mvt(27)));
            case 8:
                ((Unit) obj).getClass();
                oac oacVar = (oac) this.t;
                oxa oxaVar2 = oacVar.a;
                String str3 = (String) oacVar.b.b;
                String str4 = (String) this.s;
                q6b q6bVar = q6b.a;
                str4.getClass();
                vx6 vx6Var2 = (vx6) oxaVar2.b;
                return quj.C((hg3) vx6Var2.c, (hg3) vx6Var2.d, new jm7(vx6Var2, str3, str4, new jkl(), 1));
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                qac qacVar = (qac) this.t;
                if (!booleanValue) {
                    return nif.d(new ghc(new ArrayList(), new LinkedHashMap()));
                }
                oxa oxaVar3 = qacVar.a;
                String str5 = (String) this.s;
                q6b q6bVar2 = q6b.a;
                vx6 vx6Var3 = (vx6) oxaVar3.b;
                return mif.a(mif.a(quj.C((hg3) vx6Var3.c, (hg3) vx6Var3.d, new qs6(vx6Var3, str5, new awc(q6bVar2))), new pac(qacVar, 2), null, 5), lhb.x, null, 5);
            case 10:
                ((uoi) this.t).b((tre) this.s);
                return Unit.a;
            case 11:
                Function1 function1 = (Function1) obj;
                rpc rpcVar = (rpc) this.t;
                wpc wpcVar = rpcVar.d;
                ldt ldtVar = (ldt) this.s;
                vg0 vg0Var = rpcVar.a;
                kma kmaVar = rpcVar.f;
                wpcVar.getClass();
                qpc qpcVar = ldtVar.a;
                if (qpcVar instanceof vpc) {
                    List list3 = ((vpc) qpcVar).f;
                    tqc tqcVar = ldtVar.b;
                    int i4 = ldtVar.c;
                    ArrayList arrayList = new ArrayList(list3.size());
                    List list4 = list3;
                    int size = list4.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        Object obj3 = list3.get(i5);
                        t2o t2oVar = (t2o) obj3;
                        if (Intrinsics.d(t2oVar.b, tqcVar) && t2oVar.c == i4) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list3.size());
                        int size2 = list4.size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            Object obj4 = list3.get(i6);
                            if (((t2o) obj4).c == i4) {
                                arrayList2.add(obj4);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list3 = arrayList2;
                        }
                        List list5 = list3;
                        int compareTo = tqcVar.compareTo(tqc.e);
                        int i7 = tqcVar.a;
                        if (compareTo < 0) {
                            List list6 = list5;
                            int size3 = list6.size();
                            tqc tqcVar2 = null;
                            tqc tqcVar3 = null;
                            int i8 = 0;
                            while (true) {
                                if (i8 < size3) {
                                    tqc tqcVar4 = ((t2o) list5.get(i8)).b;
                                    int i9 = tqcVar4.a;
                                    if (Intrinsics.e(i9, i7) < 0) {
                                        if (tqcVar2 == null || Intrinsics.e(i9, tqcVar2.a) > 0) {
                                            tqcVar2 = tqcVar4;
                                        }
                                    } else if (Intrinsics.e(i9, i7) <= 0) {
                                        tqcVar2 = tqcVar4;
                                        tqcVar3 = tqcVar2;
                                    } else if (tqcVar3 == null || Intrinsics.e(i9, tqcVar3.a) < 0) {
                                        tqcVar3 = tqcVar4;
                                    }
                                    i8++;
                                }
                            }
                            if (tqcVar2 == null) {
                                tqcVar2 = tqcVar3;
                            }
                            arrayList = new ArrayList(list5.size());
                            int size4 = list6.size();
                            for (int i10 = 0; i10 < size4; i10++) {
                                Object obj5 = list5.get(i10);
                                if (Intrinsics.d(((t2o) obj5).b, tqcVar2)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            tqc tqcVar5 = tqc.f;
                            if (tqcVar.compareTo(tqcVar5) > 0) {
                                List list7 = list5;
                                int size5 = list7.size();
                                tqc tqcVar6 = null;
                                tqc tqcVar7 = null;
                                int i11 = 0;
                                while (true) {
                                    if (i11 < size5) {
                                        tqc tqcVar8 = ((t2o) list5.get(i11)).b;
                                        int i12 = tqcVar8.a;
                                        if (Intrinsics.e(i12, i7) < 0) {
                                            if (tqcVar6 == null || Intrinsics.e(i12, tqcVar6.a) > 0) {
                                                tqcVar6 = tqcVar8;
                                            }
                                        } else if (Intrinsics.e(i12, i7) <= 0) {
                                            tqcVar6 = tqcVar8;
                                            tqcVar7 = tqcVar6;
                                        } else if (tqcVar7 == null || Intrinsics.e(i12, tqcVar7.a) < 0) {
                                            tqcVar7 = tqcVar8;
                                        }
                                        i11++;
                                    }
                                }
                                if (tqcVar7 != null) {
                                    tqcVar6 = tqcVar7;
                                }
                                arrayList = new ArrayList(list5.size());
                                int size6 = list7.size();
                                for (int i13 = 0; i13 < size6; i13++) {
                                    Object obj6 = list5.get(i13);
                                    if (Intrinsics.d(((t2o) obj6).b, tqcVar6)) {
                                        arrayList.add(obj6);
                                    }
                                }
                            } else {
                                List list8 = list5;
                                int size7 = list8.size();
                                tqc tqcVar9 = null;
                                tqc tqcVar10 = null;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size7) {
                                        tqc tqcVar11 = ((t2o) list5.get(i14)).b;
                                        list = list8;
                                        if (Intrinsics.e(tqcVar11.a, tqcVar5.a) <= 0) {
                                            int i15 = tqcVar11.a;
                                            if (Intrinsics.e(i15, i7) < 0) {
                                                if (tqcVar9 == null || Intrinsics.e(i15, tqcVar9.a) > 0) {
                                                    tqcVar9 = tqcVar11;
                                                }
                                            } else if (Intrinsics.e(i15, i7) <= 0) {
                                                tqcVar9 = tqcVar11;
                                                tqcVar10 = tqcVar9;
                                            } else if (tqcVar10 == null || Intrinsics.e(i15, tqcVar10.a) < 0) {
                                                tqcVar10 = tqcVar11;
                                            }
                                        }
                                        i14++;
                                        list8 = list;
                                    } else {
                                        list = list8;
                                    }
                                }
                                if (tqcVar10 != null) {
                                    tqcVar9 = tqcVar10;
                                }
                                arrayList = new ArrayList(list5.size());
                                int size8 = list.size();
                                for (int i16 = 0; i16 < size8; i16++) {
                                    Object obj7 = list5.get(i16);
                                    if (Intrinsics.d(((t2o) obj7).b, tqcVar9)) {
                                        arrayList.add(obj7);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    tqc tqcVar12 = tqc.f;
                                    int size9 = list.size();
                                    tqc tqcVar13 = null;
                                    tqc tqcVar14 = null;
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < size9) {
                                            tqc tqcVar15 = ((t2o) list5.get(i17)).b;
                                            if (tqcVar12 == null || Intrinsics.e(tqcVar15.a, tqcVar12.a) >= 0) {
                                                int i18 = tqcVar15.a;
                                                if (Intrinsics.e(i18, i7) < 0) {
                                                    if (tqcVar13 == null || Intrinsics.e(i18, tqcVar13.a) > 0) {
                                                        tqcVar13 = tqcVar15;
                                                    }
                                                } else if (Intrinsics.e(i18, i7) <= 0) {
                                                    tqcVar13 = tqcVar15;
                                                    tqcVar14 = tqcVar13;
                                                } else if (tqcVar14 == null || Intrinsics.e(i18, tqcVar14.a) < 0) {
                                                    tqcVar14 = tqcVar15;
                                                }
                                            }
                                            i17++;
                                        }
                                    }
                                    if (tqcVar14 != null) {
                                        tqcVar13 = tqcVar14;
                                    }
                                    arrayList = new ArrayList(list5.size());
                                    int size10 = list.size();
                                    for (int i19 = 0; i19 < size10; i19++) {
                                        Object obj8 = list5.get(i19);
                                        if (Intrinsics.d(((t2o) obj8).b, tqcVar13)) {
                                            arrayList.add(obj8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    nsh nshVar = wpcVar.a;
                    if (arrayList.size() > 0) {
                        t2o t2oVar2 = (t2o) arrayList.get(0);
                        t2oVar2.getClass();
                        synchronized (((i5l) nshVar.d)) {
                            try {
                                vg0Var.getClass();
                                ot1 ot1Var = new ot1(t2oVar2);
                                nt1 nt1Var = (nt1) ((e0h) nshVar.b).get(ot1Var);
                                if (nt1Var == null) {
                                    nt1Var = (nt1) ((tpi) nshVar.c).g(ot1Var);
                                }
                                if (nt1Var != null) {
                                    obj2 = nt1Var.a;
                                } else {
                                    try {
                                        Context context = vg0Var.a;
                                        if (t2oVar2 instanceof t2o) {
                                            Typeface a = e3o.a(context, t2oVar2.a);
                                            a.getClass();
                                            invoke = Build.VERSION.SDK_INT >= 26 ? fdt.a(a, t2oVar2.d, context) : a;
                                        } else {
                                            invoke = null;
                                        }
                                    } catch (Exception unused) {
                                        invoke = kmaVar.invoke(ldtVar);
                                    }
                                    nshVar.getClass();
                                    vg0Var.getClass();
                                    ot1 ot1Var2 = new ot1(t2oVar2);
                                    synchronized (((i5l) nshVar.d)) {
                                        try {
                                            if (invoke == null) {
                                                ((tpi) nshVar.c).m(ot1Var2, new nt1(null));
                                            } else {
                                                ((e0h) nshVar.b).put(ot1Var2, new nt1(invoke));
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    obj2 = invoke;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (obj2 == null) {
                            obj2 = kmaVar.invoke(ldtVar);
                        }
                        pair = new Pair(null, ild.F(ldtVar.d, obj2, t2oVar2, ldtVar.b, ldtVar.c));
                    } else {
                        pair = new Pair(null, kmaVar.invoke(ldtVar));
                    }
                    List list9 = (List) pair.a;
                    Object obj9 = pair.b;
                    if (list9 == null) {
                        mdtVar = new ndt(obj9, true);
                    } else {
                        ir1 ir1Var = new ir1(list9, obj9, ldtVar, wpcVar.a, function1, vg0Var);
                        x97.y(wpcVar.b, null, pm6.d, new g68(ir1Var, null, 19), 1);
                        mdtVar = new mdt(ir1Var);
                    }
                } else {
                    mdtVar = null;
                }
                if (mdtVar == null) {
                    awc awcVar = ((rpc) this.t).e;
                    ldt ldtVar2 = (ldt) this.s;
                    puk pukVar = (puk) awcVar.a;
                    qpc qpcVar2 = ldtVar2.a;
                    int i20 = ldtVar2.c;
                    tqc tqcVar16 = ldtVar2.b;
                    if (qpcVar2 == null ? true : qpcVar2 instanceof pm7) {
                        typeface = pukVar.b(tqcVar16, i20);
                    } else if (qpcVar2 instanceof l5d) {
                        typeface = pukVar.d((l5d) qpcVar2, tqcVar16, i20);
                    } else if (qpcVar2 instanceof ggg) {
                        typeface = (Typeface) ((ggg) qpcVar2).f.b;
                    } else {
                        mdtVar = null;
                        if (mdtVar == null) {
                            xq0.q("Could not load font");
                            return null;
                        }
                    }
                    mdtVar = new ndt(typeface, true);
                    if (mdtVar == null) {
                    }
                }
                return mdtVar;
            case 12:
                if (((AtomicBoolean) this.t).compareAndSet(false, true)) {
                    ((zi3) this.s).c(Unit.a);
                }
                return Unit.a;
            case 13:
                int intValue5 = ((Number) obj).intValue();
                return ((Function2) this.t).invoke(Integer.valueOf(intValue5), ((List) this.s).get(intValue5));
            case 14:
                MatchResult matchResult = (MatchResult) obj;
                vqn vqnVar = (vqn) this.t;
                if (vqnVar.a == -1) {
                    vqnVar.a = matchResult.b().a;
                }
                ((vqn) this.s).a = matchResult.b().b + 1;
                return "";
            case 15:
                xje xjeVar = (xje) this.t;
                wje wjeVar = (wje) this.s;
                xjeVar.a.d(wjeVar);
                xjeVar.b.setValue(Boolean.TRUE);
                return new mf0(i, xjeVar, wjeVar);
            case 16:
                int intValue6 = ((Number) obj).intValue();
                return ((rea) this.t).invoke(Integer.valueOf(intValue6), ((List) this.s).get(intValue6));
            case 17:
                int intValue7 = ((Number) obj).intValue();
                return ((rea) this.t).invoke(Integer.valueOf(intValue7), ((List) this.s).get(intValue7));
            case 18:
                int intValue8 = ((Number) obj).intValue();
                return ((rea) this.t).invoke(Integer.valueOf(intValue8), ((ArrayList) this.s).get(intValue8));
            case 19:
                int intValue9 = ((Number) obj).intValue();
                return ((rea) this.t).invoke(Integer.valueOf(intValue9), ((ArrayList) this.s).get(intValue9));
            case 20:
                return ((s3f) this.t).invoke(((ArrayList) this.s).get(((Number) obj).intValue()));
            case 21:
                int intValue10 = ((Number) obj).intValue();
                return ((rea) this.t).invoke(Integer.valueOf(intValue10), ((ArrayList) this.s).get(intValue10));
            case 22:
                z0j z0jVar = (z0j) this.t;
                Object obj10 = z0jVar.c;
                zt3 zt3Var = (zt3) this.s;
                synchronized (obj10) {
                    ((ArrayList) z0jVar.d).remove(zt3Var);
                }
                return Unit.a;
            case 23:
                et7 c = ((ukn) this.t).c(((Number) obj).intValue());
                int i21 = c.a;
                List list10 = c.b;
                ArrayList arrayList3 = new ArrayList(list10.size());
                z98 z98Var = (z98) this.s;
                int size11 = list10.size();
                int i22 = 0;
                while (i2 < size11) {
                    int i23 = (int) ((ypd) list10.get(i2)).a;
                    arrayList3.add(new Pair(Integer.valueOf(i21), new ga6(z98Var.a(i22, i23))));
                    i21++;
                    i22 += i23;
                    i2++;
                }
                return arrayList3;
            case 24:
                int intValue11 = ((Number) obj).intValue();
                z98 z98Var2 = (z98) this.t;
                ukn uknVar = (ukn) z98Var2.e;
                int g = uknVar.g(intValue11, uknVar.f);
                long a2 = z98Var2.a(0, g);
                gsf gsfVar = (gsf) this.s;
                return gsfVar.b(intValue11, a2, 0, g, gsfVar.c);
            case 25:
                return new qvf((koo) this.t, (Map) obj, (ioo) this.s);
            case 26:
                qvf qvfVar = (qvf) this.t;
                upi upiVar = qvfVar.c;
                Object obj11 = this.s;
                upiVar.j(obj11);
                return new mf0(6, qvfVar, obj11);
            case 27:
                jsk jskVar = (jsk) obj;
                ArrayList G = j66.G((List) this.s, (Function0) ((n5b) this.t).b);
                if (G != null) {
                    int size12 = G.size();
                    while (i2 < size12) {
                        Pair pair2 = (Pair) G.get(i2);
                        ksk kskVar = (ksk) pair2.a;
                        Function0 function0 = (Function0) pair2.b;
                        jsk.f(jskVar, kskVar, function0 != null ? ((wpe) function0.invoke()).a : 0L);
                        i2++;
                    }
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                o0l o0lVar = (o0l) obj;
                o0lVar.getClass();
                o0lVar.b = ((acg) this.t).y;
                PlaybackParameters playbackParameters = (PlaybackParameters) this.s;
                o0lVar.c = playbackParameters.getAdditionalParameters();
                playbackParameters.getStartQualityConstraint();
                o0lVar.d = playbackParameters.getAdParameters();
                o0lVar.e = playbackParameters.getPlayerAnalyticsData();
                o0lVar.f = Boolean.valueOf(playbackParameters.getDisableAudioFromStart());
                o0lVar.g = Boolean.valueOf(playbackParameters.getPrepareWithoutInitCodecs());
                return Unit.a;
            default:
                paw pawVar = (paw) obj;
                pawVar.getClass();
                acg acgVar = (acg) this.t;
                acgVar.a.H(acgVar.h, "onAttachToView", "Postponed attach view", new Object[0]);
                ((omr) this.s).d((i8l) pawVar.J());
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sea(int i, Object obj, Object obj2) {
        super(1);
        this.r = i;
        this.t = obj;
        this.s = obj2;
    }
}

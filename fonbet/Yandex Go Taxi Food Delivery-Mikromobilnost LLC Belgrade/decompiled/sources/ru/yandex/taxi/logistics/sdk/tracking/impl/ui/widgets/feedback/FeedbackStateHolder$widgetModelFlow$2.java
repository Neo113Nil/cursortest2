package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback;

import defpackage.avu0;
import defpackage.buq;
import defpackage.cgz0;
import defpackage.cuq;
import defpackage.ffz0;
import defpackage.fsx;
import defpackage.ga0;
import defpackage.gfz0;
import defpackage.gri;
import defpackage.hfz0;
import defpackage.ho;
import defpackage.ifz0;
import defpackage.imc;
import defpackage.itq;
import defpackage.ivq;
import defpackage.j00;
import defpackage.j73;
import defpackage.jgz;
import defpackage.jl40;
import defpackage.jtq;
import defpackage.kfz0;
import defpackage.l7x0;
import defpackage.lfz0;
import defpackage.lmc;
import defpackage.ln;
import defpackage.mvg;
import defpackage.n351;
import defpackage.ny61;
import defpackage.osq;
import defpackage.pff;
import defpackage.pgz0;
import defpackage.qv10;
import defpackage.tcc;
import defpackage.tn;
import defpackage.usq;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.xrq;
import defpackage.zei0;
import defpackage.ziq0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.LocalFeedbackRepository;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgri;", "deliveryState", "Lpff;", "currentFeedbackModel", "", "Ln351;", "<anonymous>", "(Lgri;Lpff;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.FeedbackStateHolder$widgetModelFlow$2", f = "FeedbackStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FeedbackStateHolder$widgetModelFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackStateHolder$widgetModelFlow$2(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FeedbackStateHolder$widgetModelFlow$2 feedbackStateHolder$widgetModelFlow$2 = new FeedbackStateHolder$widgetModelFlow$2(this.this$0, (Continuation) obj3);
        feedbackStateHolder$widgetModelFlow$2.L$0 = (gri) obj;
        feedbackStateHolder$widgetModelFlow$2.L$1 = (pff) obj2;
        return feedbackStateHolder$widgetModelFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:305:0x0368, code lost:
    
        if (r4.isEmpty() == false) goto L178;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038f  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r24v1, types: [kfz0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ffz0 ffz0Var;
        ln lnVar;
        EmptySet emptySet;
        ?? r17;
        jtq jtqVar;
        int i;
        boolean z;
        cgz0 cgz0Var;
        List list;
        ArrayList arrayList;
        itq itqVar;
        Iterator it;
        String str;
        usq usqVar;
        ziq0 ziq0Var;
        Iterator it2;
        lfz0 lfz0Var;
        ln lnVar2;
        String str2;
        String format;
        pgz0 pgz0Var;
        String str3;
        boolean z2;
        lmc lmcVar;
        Set set;
        Set set2;
        List list2;
        Integer num;
        Integer num2;
        Object obj2;
        Integer num3;
        List list3;
        fsx fsxVar;
        List list4;
        String str4;
        gri griVar = (gri) this.L$0;
        pff pffVar = (pff) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.c.getClass();
        ArrayList b = j00.b(griVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = b.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (next != null ? next instanceof ln : true) {
                arrayList2.add(next);
            }
        }
        ln lnVar3 = (ln) kotlin.collections.a.R(arrayList2);
        this.this$0.c.getClass();
        ArrayList b2 = j00.b(griVar);
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = b2.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (next2 != null ? next2 instanceof tn : true) {
                arrayList3.add(next2);
            }
        }
        tn tnVar = (tn) kotlin.collections.a.R(arrayList3);
        this.this$0.c.getClass();
        ArrayList b3 = j00.b(griVar);
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = b3.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            if (next3 != null ? next3 instanceof ho : true) {
                arrayList4.add(next3);
            }
        }
        ho hoVar = (ho) kotlin.collections.a.R(arrayList4);
        e eVar = this.this$0;
        ArrayList arrayList5 = hoVar != null ? hoVar.a : null;
        LocalFeedbackRepository localFeedbackRepository = eVar.e;
        if (arrayList5 != null) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (obj3 instanceof ffz0) {
                    arrayList6.add(obj3);
                }
            }
            ffz0Var = (ffz0) kotlin.collections.a.R(arrayList6);
        } else {
            ffz0Var = null;
        }
        if (ffz0Var != null && ((str4 = (String) localFeedbackRepository.e.getValue()) == null || str4.length() == 0)) {
            localFeedbackRepository.e.l(ffz0Var.d);
        }
        itq itqVar2 = this.this$0.a;
        itqVar2.getClass();
        ziq0 ziq0Var2 = pffVar.c;
        Set set3 = pffVar.b;
        EmptySet emptySet2 = EmptySet.a;
        if (set3 == null) {
            set3 = (tnVar == null || (fsxVar = tnVar.d) == null || (list4 = fsxVar.c) == null) ? null : kotlin.collections.a.N0(list4);
            if (set3 == null) {
                set3 = emptySet2;
            }
        }
        boolean z3 = false;
        if (lnVar3 != null) {
            ArrayList<xrq> arrayList7 = lnVar3.b;
            ArrayList arrayList8 = new ArrayList(tcc.n(arrayList7, 10));
            for (xrq xrqVar : arrayList7) {
                String str5 = xrqVar.a;
                arrayList8.add(new cuq(str5, xrqVar.b, EmptyList.a, null, set3.contains(str5)));
            }
            if (arrayList8.isEmpty()) {
                arrayList8 = null;
            }
            jtqVar = new jtq(null, arrayList8 != null ? new zei0(arrayList8, false) : null, set3, null);
            lnVar = lnVar3;
        } else {
            if (tnVar != null || hoVar != null) {
                if (tnVar != null) {
                    Integer num4 = pffVar.a;
                    if (num4 == null) {
                        fsx fsxVar2 = tnVar.d;
                        num4 = fsxVar2 != null ? Integer.valueOf(fsxVar2.a) : null;
                        if (num4 == null) {
                            i = 0;
                            if (hoVar == null) {
                                ArrayList arrayList9 = hoVar.a;
                                HashSet hashSet = new HashSet();
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj4 : arrayList9) {
                                    boolean z4 = z3;
                                    ifz0 ifz0Var = (ifz0) obj4;
                                    if (hashSet.add(ifz0Var instanceof ffz0 ? ((ffz0) ifz0Var).a : ifz0Var instanceof gfz0 ? ((gfz0) ifz0Var).a : null)) {
                                        arrayList10.add(obj4);
                                    }
                                    z3 = z4;
                                }
                                boolean z5 = z3;
                                boolean z6 = arrayList10.size() != arrayList9.size() ? true : z5 ? 1 : 0;
                                boolean z7 = !z6;
                                if (z6) {
                                    jgz jgzVar = jgz.a;
                                    jgz.c(new IllegalStateException("Tips don't have unique ids"));
                                }
                                ziq0 ziq0Var3 = pffVar.c;
                                if (ziq0Var3 == null) {
                                    ziq0Var3 = new ziq0(hoVar.b, null);
                                }
                                String str6 = ziq0Var3.a;
                                ArrayList arrayList11 = new ArrayList();
                                Iterator it6 = arrayList9.iterator();
                                while (it6.hasNext()) {
                                    ifz0 ifz0Var2 = (ifz0) it6.next();
                                    EmptySet emptySet3 = emptySet2;
                                    String str7 = pffVar.e;
                                    if (ifz0Var2 instanceof hfz0) {
                                        lnVar2 = lnVar3;
                                        ziq0Var = ziq0Var3;
                                        it2 = it6;
                                        lfz0Var = null;
                                    } else if (ifz0Var2 instanceof ffz0) {
                                        ffz0 ffz0Var2 = (ffz0) ifz0Var2;
                                        String str8 = ffz0Var2.g;
                                        it2 = it6;
                                        String str9 = ffz0Var2.d;
                                        if (str9 != null) {
                                            str7 = str9;
                                        }
                                        String str10 = jl40.l(ffz0Var2.a, str6) ? ziq0Var3.b : null;
                                        if (str10 != null) {
                                            ziq0Var = ziq0Var3;
                                            str2 = str10;
                                            format = String.format(str8, Arrays.copyOf(new Object[]{str10}, 1));
                                        } else {
                                            ziq0Var = ziq0Var3;
                                            str2 = str10;
                                            format = str7 != null ? String.format(str8, Arrays.copyOf(new Object[]{str7}, 1)) : null;
                                        }
                                        String str11 = ffz0Var2.a;
                                        if (format == null) {
                                            format = ffz0Var2.b;
                                        }
                                        String str12 = format;
                                        boolean l = jl40.l(str11, str6);
                                        String str13 = ffz0Var2.c;
                                        String str14 = str2 == null ? str7 : str2;
                                        lnVar2 = lnVar3;
                                        lfz0Var = new kfz0(str11, str12, l, str13, str14, ffz0Var2.e, ffz0Var2.f);
                                    } else {
                                        ziq0Var = ziq0Var3;
                                        it2 = it6;
                                        if (!(ifz0Var2 instanceof gfz0)) {
                                            w511.b();
                                            return null;
                                        }
                                        gfz0 gfz0Var = (gfz0) ifz0Var2;
                                        String str15 = gfz0Var.a;
                                        lnVar2 = lnVar3;
                                        lfz0Var = new lfz0(str15, gfz0Var.b, gfz0Var.c, jl40.l(str15, str6));
                                    }
                                    if (lfz0Var != null) {
                                        arrayList11.add(lfz0Var);
                                    }
                                    emptySet2 = emptySet3;
                                    lnVar3 = lnVar2;
                                    it6 = it2;
                                    ziq0Var3 = ziq0Var;
                                }
                                lnVar = lnVar3;
                                emptySet = emptySet2;
                                cgz0Var = new cgz0(arrayList11, z7);
                                z = z5;
                            } else {
                                lnVar = lnVar3;
                                emptySet = emptySet2;
                                z = false;
                                cgz0Var = null;
                            }
                            list = tnVar.c;
                            if (list != null) {
                                ArrayList arrayList12 = new ArrayList();
                                for (Object obj5 : list) {
                                    if (((buq) obj5).c.contains(Integer.valueOf(i))) {
                                        arrayList12.add(obj5);
                                    }
                                }
                                arrayList = new ArrayList(tcc.n(arrayList12, 10));
                                Iterator it7 = arrayList12.iterator();
                                while (it7.hasNext()) {
                                    buq buqVar = (buq) it7.next();
                                    String str16 = buqVar.a;
                                    String str17 = buqVar.b;
                                    List list5 = buqVar.c;
                                    ga0 ga0Var = buqVar.d;
                                    if (ga0Var != null) {
                                        it = it7;
                                        str = str16;
                                        l7x0 l7x0Var = itqVar2.a;
                                        itqVar = itqVar2;
                                        usqVar = new usq(l7x0Var.a(ga0Var.a), l7x0Var.a(ga0Var.b));
                                    } else {
                                        itqVar = itqVar2;
                                        it = it7;
                                        str = str16;
                                        usqVar = null;
                                    }
                                    arrayList.add(new cuq(str, str17, list5, usqVar, set3.contains(buqVar.a)));
                                    it7 = it;
                                    itqVar2 = itqVar;
                                }
                            }
                            arrayList = null;
                            jtqVar = new jtq(Integer.valueOf(i), arrayList == null ? new zei0(arrayList, i == 5 ? true : z ? 1 : 0) : null, set3, cgz0Var);
                            r17 = z;
                        }
                    }
                    i = num4.intValue();
                    if (hoVar == null) {
                    }
                    list = tnVar.c;
                    if (list != null) {
                    }
                    arrayList = null;
                    if (arrayList == null) {
                    }
                    jtqVar = new jtq(Integer.valueOf(i), arrayList == null ? new zei0(arrayList, i == 5 ? true : z ? 1 : 0) : null, set3, cgz0Var);
                    r17 = z;
                } else {
                    lnVar = lnVar3;
                    emptySet = emptySet2;
                    r17 = 0;
                    jtqVar = null;
                }
                if (ziq0Var2 != null) {
                    String str18 = ziq0Var2.b;
                    if (!jl40.h(str18 != null ? avu0.i(str18) : null, 0.0d) && str18 != null && hoVar != null && (list3 = hoVar.c) != null) {
                        pgz0Var = new pgz0(list3);
                        osq osqVar = this.this$0.d;
                        if (tnVar != null) {
                            Iterator it8 = tnVar.b.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it8.next();
                                if (((ivq) obj2).b.contains(Integer.valueOf((jtqVar == null || (num3 = jtqVar.c) == null) ? r17 : num3.intValue()))) {
                                    break;
                                }
                            }
                            ivq ivqVar = (ivq) obj2;
                            if (ivqVar != null) {
                                str3 = ivqVar.a;
                                osqVar.a.l(str3);
                                osqVar.b.l(pgz0Var);
                                imc imcVar = this.this$0.b;
                                z2 = ((jtqVar != null || (num2 = jtqVar.c) == null) ? r17 : num2.intValue()) <= 0 ? true : r17;
                                fsx fsxVar3 = tnVar == null ? tnVar.d : null;
                                imcVar.getClass();
                                if (z2) {
                                    lmcVar = null;
                                } else {
                                    String str19 = pffVar.d;
                                    if (str19 == null) {
                                        str19 = fsxVar3 != null ? fsxVar3.b : null;
                                    }
                                    lmcVar = new lmc(str19);
                                }
                                ru.yandex.taxi.logistics.sdk.tracking.impl.data.c cVar = this.this$0.f;
                                ln lnVar4 = lnVar;
                                if (lnVar == null) {
                                    ArrayList arrayList13 = lnVar4.b;
                                    ArrayList arrayList14 = new ArrayList(tcc.n(arrayList13, 10));
                                    Iterator it9 = arrayList13.iterator();
                                    while (it9.hasNext()) {
                                        arrayList14.add(((xrq) it9.next()).a);
                                    }
                                    set = kotlin.collections.a.N0(arrayList14);
                                } else {
                                    set = emptySet;
                                }
                                if (tnVar != null || (list2 = tnVar.c) == null) {
                                    set2 = emptySet;
                                } else {
                                    ArrayList arrayList15 = new ArrayList();
                                    for (Object obj6 : list2) {
                                        if (((buq) obj6).c.contains(Integer.valueOf((jtqVar == null || (num = jtqVar.c) == null) ? r17 : num.intValue()))) {
                                            arrayList15.add(obj6);
                                        }
                                    }
                                    ArrayList arrayList16 = new ArrayList(tcc.n(arrayList15, 10));
                                    Iterator it10 = arrayList15.iterator();
                                    while (it10.hasNext()) {
                                        arrayList16.add(((buq) it10.next()).a);
                                    }
                                    set2 = kotlin.collections.a.N0(arrayList16);
                                }
                                LinkedHashSet h = v4r0.h(set, set2);
                                r0 r0Var = cVar.b;
                                r0Var.getClass();
                                r0Var.m(null, h);
                                qv10.B(lnVar4 == null ? true : r17, cVar.e, null);
                                cVar.h.l(jtqVar == null ? jtqVar.c : null);
                                cVar.c.l(jtqVar == null ? jtqVar.e : null);
                                cVar.g.l(ziq0Var2);
                                cVar.f.l(lmcVar == null ? lmcVar.c : null);
                                n351[] n351VarArr = new n351[2];
                                n351VarArr[r17] = jtqVar;
                                n351VarArr[1] = lmcVar;
                                return j73.A(n351VarArr);
                            }
                        }
                        str3 = null;
                        osqVar.a.l(str3);
                        osqVar.b.l(pgz0Var);
                        imc imcVar2 = this.this$0.b;
                        if (((jtqVar != null || (num2 = jtqVar.c) == null) ? r17 : num2.intValue()) <= 0) {
                        }
                        if (tnVar == null) {
                        }
                        imcVar2.getClass();
                        if (z2) {
                        }
                        ru.yandex.taxi.logistics.sdk.tracking.impl.data.c cVar2 = this.this$0.f;
                        ln lnVar42 = lnVar;
                        if (lnVar == null) {
                        }
                        if (tnVar != null) {
                        }
                        set2 = emptySet;
                        LinkedHashSet h2 = v4r0.h(set, set2);
                        r0 r0Var2 = cVar2.b;
                        r0Var2.getClass();
                        r0Var2.m(null, h2);
                        qv10.B(lnVar42 == null ? true : r17, cVar2.e, null);
                        cVar2.h.l(jtqVar == null ? jtqVar.c : null);
                        cVar2.c.l(jtqVar == null ? jtqVar.e : null);
                        cVar2.g.l(ziq0Var2);
                        cVar2.f.l(lmcVar == null ? lmcVar.c : null);
                        n351[] n351VarArr2 = new n351[2];
                        n351VarArr2[r17] = jtqVar;
                        n351VarArr2[1] = lmcVar;
                        return j73.A(n351VarArr2);
                    }
                }
                pgz0Var = null;
                osq osqVar2 = this.this$0.d;
                if (tnVar != null) {
                }
                str3 = null;
                osqVar2.a.l(str3);
                osqVar2.b.l(pgz0Var);
                imc imcVar22 = this.this$0.b;
                if (((jtqVar != null || (num2 = jtqVar.c) == null) ? r17 : num2.intValue()) <= 0) {
                }
                if (tnVar == null) {
                }
                imcVar22.getClass();
                if (z2) {
                }
                ru.yandex.taxi.logistics.sdk.tracking.impl.data.c cVar22 = this.this$0.f;
                ln lnVar422 = lnVar;
                if (lnVar == null) {
                }
                if (tnVar != null) {
                }
                set2 = emptySet;
                LinkedHashSet h22 = v4r0.h(set, set2);
                r0 r0Var22 = cVar22.b;
                r0Var22.getClass();
                r0Var22.m(null, h22);
                qv10.B(lnVar422 == null ? true : r17, cVar22.e, null);
                cVar22.h.l(jtqVar == null ? jtqVar.c : null);
                cVar22.c.l(jtqVar == null ? jtqVar.e : null);
                cVar22.g.l(ziq0Var2);
                cVar22.f.l(lmcVar == null ? lmcVar.c : null);
                n351[] n351VarArr22 = new n351[2];
                n351VarArr22[r17] = jtqVar;
                n351VarArr22[1] = lmcVar;
                return j73.A(n351VarArr22);
            }
            lnVar = lnVar3;
            jtqVar = null;
        }
        emptySet = emptySet2;
        r17 = 0;
        if (ziq0Var2 != null) {
        }
        pgz0Var = null;
        osq osqVar22 = this.this$0.d;
        if (tnVar != null) {
        }
        str3 = null;
        osqVar22.a.l(str3);
        osqVar22.b.l(pgz0Var);
        imc imcVar222 = this.this$0.b;
        if (((jtqVar != null || (num2 = jtqVar.c) == null) ? r17 : num2.intValue()) <= 0) {
        }
        if (tnVar == null) {
        }
        imcVar222.getClass();
        if (z2) {
        }
        ru.yandex.taxi.logistics.sdk.tracking.impl.data.c cVar222 = this.this$0.f;
        ln lnVar4222 = lnVar;
        if (lnVar == null) {
        }
        if (tnVar != null) {
        }
        set2 = emptySet;
        LinkedHashSet h222 = v4r0.h(set, set2);
        r0 r0Var222 = cVar222.b;
        r0Var222.getClass();
        r0Var222.m(null, h222);
        qv10.B(lnVar4222 == null ? true : r17, cVar222.e, null);
        cVar222.h.l(jtqVar == null ? jtqVar.c : null);
        cVar222.c.l(jtqVar == null ? jtqVar.e : null);
        cVar222.g.l(ziq0Var2);
        cVar222.f.l(lmcVar == null ? lmcVar.c : null);
        n351[] n351VarArr222 = new n351[2];
        n351VarArr222[r17] = jtqVar;
        n351VarArr222[1] = lmcVar;
        return j73.A(n351VarArr222);
    }
}

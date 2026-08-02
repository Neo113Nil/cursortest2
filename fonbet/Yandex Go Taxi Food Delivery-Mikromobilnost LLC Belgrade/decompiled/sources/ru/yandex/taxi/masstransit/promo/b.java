package ru.yandex.taxi.masstransit.promo;

import com.adjust.sdk.Constants;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ax30;
import defpackage.bx30;
import defpackage.cx30;
import defpackage.fnx0;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.lk6;
import defpackage.nmx;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.pex0;
import defpackage.pf10;
import defpackage.scc;
import defpackage.srx;
import defpackage.tcc;
import defpackage.uc4;
import defpackage.v03;
import defpackage.wiq0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.h;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam;

/* loaded from: classes9.dex */
public final class b {
    public final ru.yandex.taxi.persuggest.source.a a;
    public final nmx b;
    public final wiq0 c;
    public final ru.yandex.taxi.preorder.source.userposition.b d;
    public final h e;

    public b(ru.yandex.taxi.persuggest.source.a aVar, nmx nmxVar, wiq0 wiq0Var, ru.yandex.taxi.preorder.source.userposition.b bVar, h hVar) {
        this.a = aVar;
        this.b = nmxVar;
        this.c = wiq0Var;
        this.d = bVar;
        this.e = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType, cx30 cx30Var, zzs zzsVar, ArrayList arrayList, String str, ContinuationImpl continuationImpl) {
        MtSummaryCommunicationsParamFactory$create$1 mtSummaryCommunicationsParamFactory$create$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        MtSummaryCommunicationsParam.CommunicationState.b bVar;
        zzs zzsVar2;
        List list;
        String str2;
        MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType2;
        MtSummaryCommunicationsParam.a aVar;
        jsq0 jsq0Var;
        uc4 uc4Var;
        Object a;
        List list2;
        MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType3;
        List list3;
        String str3;
        String str4;
        zzs zzsVar3;
        List list4;
        MtSummaryCommunicationsParam.a aVar2;
        Integer num;
        String str5;
        jsq0 jsq0Var2;
        String str6;
        pex0 pex0Var;
        if (continuationImpl instanceof MtSummaryCommunicationsParamFactory$create$1) {
            mtSummaryCommunicationsParamFactory$create$1 = (MtSummaryCommunicationsParamFactory$create$1) continuationImpl;
            int i2 = mtSummaryCommunicationsParamFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtSummaryCommunicationsParamFactory$create$1.label = i2 - Integer.MIN_VALUE;
                MtSummaryCommunicationsParamFactory$create$1 mtSummaryCommunicationsParamFactory$create$12 = mtSummaryCommunicationsParamFactory$create$1;
                Object obj = mtSummaryCommunicationsParamFactory$create$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtSummaryCommunicationsParamFactory$create$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pf10 pf10Var = new pf10(ofp0.c, ofp0.b, ofp0.a);
                    List singletonList = Collections.singletonList(new MtSummaryCommunicationsParam.a.C0106a(Collections.singletonList(Constants.DEEPLINK), "promoblock", scc.g("deeplink_arrow_button", "attributed_text")));
                    if (cx30Var != null) {
                        List<ax30> a2 = cx30Var.a();
                        int i3 = 10;
                        ArrayList arrayList2 = new ArrayList(tcc.n(a2, 10));
                        for (ax30 ax30Var : a2) {
                            String a3 = ax30Var.a();
                            List<bx30> b = ax30Var.b();
                            ArrayList arrayList3 = new ArrayList(tcc.n(b, i3));
                            for (bx30 bx30Var : b) {
                                arrayList3.add(new MtSummaryCommunicationsParam.CommunicationState.c(bx30Var.d(), bx30Var.c(), bx30Var.a(), bx30Var.b()));
                            }
                            arrayList2.add(new MtSummaryCommunicationsParam.CommunicationState.a(a3, arrayList3));
                            i3 = 10;
                        }
                        bVar = new MtSummaryCommunicationsParam.CommunicationState.b(arrayList2);
                    } else {
                        bVar = null;
                    }
                    MtSummaryCommunicationsParam.a aVar3 = new MtSummaryCommunicationsParam.a(singletonList, pf10Var);
                    List g = scc.g(CommunicationType.PROMOBLOCK, CommunicationType.OBJECT_OVER_MAP);
                    jsq0 jsq0Var3 = ksq0.a;
                    jsq0 jsq0Var4 = new jsq0(g);
                    mtSummaryCommunicationsParamFactory$create$12.L$0 = mtScreenType;
                    mtSummaryCommunicationsParamFactory$create$12.L$1 = null;
                    mtSummaryCommunicationsParamFactory$create$12.L$2 = zzsVar;
                    mtSummaryCommunicationsParamFactory$create$12.L$3 = arrayList;
                    mtSummaryCommunicationsParamFactory$create$12.L$4 = str;
                    mtSummaryCommunicationsParamFactory$create$12.L$5 = null;
                    mtSummaryCommunicationsParamFactory$create$12.L$6 = null;
                    mtSummaryCommunicationsParamFactory$create$12.L$7 = bVar;
                    mtSummaryCommunicationsParamFactory$create$12.L$8 = aVar3;
                    mtSummaryCommunicationsParamFactory$create$12.L$9 = jsq0Var4;
                    mtSummaryCommunicationsParamFactory$create$12.label = 1;
                    Object b2 = ru.yandex.taxi.persuggest.source.a.b(this.a, null, null, null, null, null, null, null, false, mtSummaryCommunicationsParamFactory$create$12, 255);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zzsVar2 = zzsVar;
                    list = arrayList;
                    str2 = str;
                    mtScreenType2 = mtScreenType;
                    obj = b2;
                    aVar = aVar3;
                    jsq0Var = jsq0Var4;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list5 = (List) mtSummaryCommunicationsParamFactory$create$12.L$22;
                        String str7 = (String) mtSummaryCommunicationsParamFactory$create$12.L$21;
                        List list6 = (List) mtSummaryCommunicationsParamFactory$create$12.L$20;
                        String str8 = (String) mtSummaryCommunicationsParamFactory$create$12.L$19;
                        List list7 = (List) mtSummaryCommunicationsParamFactory$create$12.L$18;
                        zzs zzsVar4 = (zzs) mtSummaryCommunicationsParamFactory$create$12.L$17;
                        str3 = (String) mtSummaryCommunicationsParamFactory$create$12.L$16;
                        zzs zzsVar5 = (zzs) mtSummaryCommunicationsParamFactory$create$12.L$15;
                        uc4 uc4Var2 = (uc4) mtSummaryCommunicationsParamFactory$create$12.L$14;
                        Integer num2 = (Integer) mtSummaryCommunicationsParamFactory$create$12.L$13;
                        String str9 = (String) mtSummaryCommunicationsParamFactory$create$12.L$12;
                        MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType4 = (MtSummaryCommunicationsParam.CommunicationState.MtScreenType) mtSummaryCommunicationsParamFactory$create$12.L$11;
                        jsq0 jsq0Var5 = (jsq0) mtSummaryCommunicationsParamFactory$create$12.L$9;
                        aVar2 = (MtSummaryCommunicationsParam.a) mtSummaryCommunicationsParamFactory$create$12.L$8;
                        MtSummaryCommunicationsParam.CommunicationState.b bVar2 = (MtSummaryCommunicationsParam.CommunicationState.b) mtSummaryCommunicationsParamFactory$create$12.L$7;
                        kotlin.b.b(obj);
                        list4 = list6;
                        str6 = str9;
                        str5 = str8;
                        num = num2;
                        list3 = list7;
                        uc4Var = uc4Var2;
                        zzsVar2 = zzsVar4;
                        zzsVar3 = zzsVar5;
                        list2 = list5;
                        str4 = str7;
                        mtScreenType3 = mtScreenType4;
                        jsq0Var2 = jsq0Var5;
                        bVar = bVar2;
                        return new MtSummaryCommunicationsParam(aVar2, jsq0Var2, new MtSummaryCommunicationsParam.CommunicationState(mtScreenType3, str6, num, uc4Var, zzsVar3, str3, zzsVar2, list3, str5, list4, str4, new srx(list2, ((lk6) obj).b), bVar, 4096));
                    }
                    jsq0Var = (jsq0) mtSummaryCommunicationsParamFactory$create$12.L$9;
                    aVar = (MtSummaryCommunicationsParam.a) mtSummaryCommunicationsParamFactory$create$12.L$8;
                    MtSummaryCommunicationsParam.CommunicationState.b bVar3 = (MtSummaryCommunicationsParam.CommunicationState.b) mtSummaryCommunicationsParamFactory$create$12.L$7;
                    str2 = (String) mtSummaryCommunicationsParamFactory$create$12.L$4;
                    list = (List) mtSummaryCommunicationsParamFactory$create$12.L$3;
                    zzsVar2 = (zzs) mtSummaryCommunicationsParamFactory$create$12.L$2;
                    mtScreenType2 = (MtSummaryCommunicationsParam.CommunicationState.MtScreenType) mtSummaryCommunicationsParamFactory$create$12.L$0;
                    kotlin.b.b(obj);
                    bVar = bVar3;
                }
                v03 v03Var = (v03) obj;
                Integer num3 = v03Var.l;
                uc4Var = v03Var.b;
                zzs zzsVar6 = v03Var.k;
                String str10 = v03Var.m;
                fnx0 n = ((k) this.c).n();
                String str11 = (n != null || (pex0Var = n.c) == null) ? null : pex0Var.b;
                List a4 = this.b.a();
                List b3 = this.e.b();
                mtSummaryCommunicationsParamFactory$create$12.L$0 = null;
                mtSummaryCommunicationsParamFactory$create$12.L$1 = null;
                mtSummaryCommunicationsParamFactory$create$12.L$2 = null;
                mtSummaryCommunicationsParamFactory$create$12.L$3 = null;
                mtSummaryCommunicationsParamFactory$create$12.L$4 = null;
                mtSummaryCommunicationsParamFactory$create$12.L$5 = null;
                mtSummaryCommunicationsParamFactory$create$12.L$6 = null;
                mtSummaryCommunicationsParamFactory$create$12.L$7 = bVar;
                mtSummaryCommunicationsParamFactory$create$12.L$8 = aVar;
                mtSummaryCommunicationsParamFactory$create$12.L$9 = jsq0Var;
                mtSummaryCommunicationsParamFactory$create$12.L$10 = null;
                mtSummaryCommunicationsParamFactory$create$12.L$11 = mtScreenType2;
                mtSummaryCommunicationsParamFactory$create$12.L$12 = "default";
                mtSummaryCommunicationsParamFactory$create$12.L$13 = num3;
                mtSummaryCommunicationsParamFactory$create$12.L$14 = uc4Var;
                mtSummaryCommunicationsParamFactory$create$12.L$15 = zzsVar6;
                mtSummaryCommunicationsParamFactory$create$12.L$16 = str10;
                mtSummaryCommunicationsParamFactory$create$12.L$17 = zzsVar2;
                mtSummaryCommunicationsParamFactory$create$12.L$18 = list;
                mtSummaryCommunicationsParamFactory$create$12.L$19 = str11;
                mtSummaryCommunicationsParamFactory$create$12.L$20 = a4;
                mtSummaryCommunicationsParamFactory$create$12.L$21 = str2;
                mtSummaryCommunicationsParamFactory$create$12.L$22 = b3;
                mtSummaryCommunicationsParamFactory$create$12.label = 2;
                a = this.d.a(mtSummaryCommunicationsParamFactory$create$12);
                if (a != coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                list2 = b3;
                mtScreenType3 = mtScreenType2;
                list3 = list;
                str3 = str10;
                str4 = str2;
                zzsVar3 = zzsVar6;
                list4 = a4;
                aVar2 = aVar;
                num = num3;
                str5 = str11;
                jsq0Var2 = jsq0Var;
                str6 = "default";
                return new MtSummaryCommunicationsParam(aVar2, jsq0Var2, new MtSummaryCommunicationsParam.CommunicationState(mtScreenType3, str6, num, uc4Var, zzsVar3, str3, zzsVar2, list3, str5, list4, str4, new srx(list2, ((lk6) obj).b), bVar, 4096));
            }
        }
        mtSummaryCommunicationsParamFactory$create$1 = new MtSummaryCommunicationsParamFactory$create$1(this, continuationImpl);
        MtSummaryCommunicationsParamFactory$create$1 mtSummaryCommunicationsParamFactory$create$122 = mtSummaryCommunicationsParamFactory$create$1;
        Object obj2 = mtSummaryCommunicationsParamFactory$create$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtSummaryCommunicationsParamFactory$create$122.label;
        if (i != 0) {
        }
        v03 v03Var2 = (v03) obj2;
        Integer num32 = v03Var2.l;
        uc4Var = v03Var2.b;
        zzs zzsVar62 = v03Var2.k;
        String str102 = v03Var2.m;
        fnx0 n2 = ((k) this.c).n();
        if (n2 != null) {
        }
        List a42 = this.b.a();
        List b32 = this.e.b();
        mtSummaryCommunicationsParamFactory$create$122.L$0 = null;
        mtSummaryCommunicationsParamFactory$create$122.L$1 = null;
        mtSummaryCommunicationsParamFactory$create$122.L$2 = null;
        mtSummaryCommunicationsParamFactory$create$122.L$3 = null;
        mtSummaryCommunicationsParamFactory$create$122.L$4 = null;
        mtSummaryCommunicationsParamFactory$create$122.L$5 = null;
        mtSummaryCommunicationsParamFactory$create$122.L$6 = null;
        mtSummaryCommunicationsParamFactory$create$122.L$7 = bVar;
        mtSummaryCommunicationsParamFactory$create$122.L$8 = aVar;
        mtSummaryCommunicationsParamFactory$create$122.L$9 = jsq0Var;
        mtSummaryCommunicationsParamFactory$create$122.L$10 = null;
        mtSummaryCommunicationsParamFactory$create$122.L$11 = mtScreenType2;
        mtSummaryCommunicationsParamFactory$create$122.L$12 = "default";
        mtSummaryCommunicationsParamFactory$create$122.L$13 = num32;
        mtSummaryCommunicationsParamFactory$create$122.L$14 = uc4Var;
        mtSummaryCommunicationsParamFactory$create$122.L$15 = zzsVar62;
        mtSummaryCommunicationsParamFactory$create$122.L$16 = str102;
        mtSummaryCommunicationsParamFactory$create$122.L$17 = zzsVar2;
        mtSummaryCommunicationsParamFactory$create$122.L$18 = list;
        mtSummaryCommunicationsParamFactory$create$122.L$19 = str11;
        mtSummaryCommunicationsParamFactory$create$122.L$20 = a42;
        mtSummaryCommunicationsParamFactory$create$122.L$21 = str2;
        mtSummaryCommunicationsParamFactory$create$122.L$22 = b32;
        mtSummaryCommunicationsParamFactory$create$122.label = 2;
        a = this.d.a(mtSummaryCommunicationsParamFactory$create$122);
        if (a != coroutineSingletons) {
        }
    }
}

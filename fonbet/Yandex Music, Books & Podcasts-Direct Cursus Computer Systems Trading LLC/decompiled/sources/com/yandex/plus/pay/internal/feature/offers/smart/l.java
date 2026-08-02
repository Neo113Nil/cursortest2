package com.yandex.plus.pay.internal.feature.offers.smart;

import com.yandex.passport.internal.methods.performer.v0;
import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.api.model.PlusPaySmartOffer;
import com.yandex.plus.pay.data.acquisition.PlusPayAcquisitionApi;
import com.yandex.plus.pay.data.acquisition.dto.a0;
import com.yandex.plus.pay.data.acquisition.dto.a1;
import com.yandex.plus.pay.data.acquisition.dto.b1;
import com.yandex.plus.pay.data.acquisition.dto.d0;
import com.yandex.plus.pay.data.acquisition.dto.e1;
import com.yandex.plus.pay.data.acquisition.dto.m;
import com.yandex.plus.pay.data.acquisition.dto.m0;
import com.yandex.plus.pay.data.acquisition.dto.p;
import com.yandex.plus.pay.data.acquisition.dto.s;
import com.yandex.plus.pay.data.acquisition.dto.t0;
import com.yandex.plus.pay.data.acquisition.dto.u0;
import com.yandex.plus.pay.data.acquisition.dto.v;
import com.yandex.plus.pay.data.acquisition.dto.w0;
import com.yandex.plus.pay.data.acquisition.dto.z0;
import com.yandex.plus.pay.internal.model.SmartOffersBatch;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.wis;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements g {
    public final PlusPayAcquisitionApi a;
    public final com.yandex.plus.pay.inapp.api.b b;
    public final com.yandex.plus.pay.internal.di.j c;
    public final com.yandex.plus.pay.internal.di.j d;
    public final kotlinx.coroutines.a e;
    public final com.yandex.plus.log.api.b f;

    public l(PlusPayAcquisitionApi plusPayAcquisitionApi, com.yandex.plus.pay.inapp.api.b bVar, com.yandex.plus.core.location.a aVar, com.yandex.plus.pay.internal.di.j jVar, com.yandex.plus.pay.internal.di.j jVar2, kotlinx.coroutines.a aVar2, com.yandex.plus.log.api.b bVar2) {
        plusPayAcquisitionApi.getClass();
        bVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        this.a = plusPayAcquisitionApi;
        this.b = bVar;
        this.c = jVar;
        this.d = jVar2;
        this.e = aVar2;
        this.f = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8 A[LOOP:0: B:17:0x00b2->B:19:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, String str, boolean z, String str2, Set set, Set set2, Set set3, Set set4, Map map, cg6 cg6Var) {
        h hVar;
        int i;
        boolean z2;
        Set set5;
        Set set6;
        Set set7;
        String str3;
        String str4;
        Object obj;
        Set set8;
        Map map2;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.t = i2 - Integer.MIN_VALUE;
                Object obj2 = hVar.r;
                Object obj3 = nm6.a;
                i = hVar.t;
                if (i != 0) {
                    qgg.h0(obj2);
                    hVar.j = str;
                    hVar.k = str2;
                    hVar.l = set;
                    hVar.m = set2;
                    hVar.n = set3;
                    hVar.o = set4;
                    hVar.p = map;
                    z2 = z;
                    hVar.q = z2;
                    hVar.t = 1;
                    Object b = lVar.b(hVar);
                    if (b != obj3) {
                        set5 = set;
                        set6 = set2;
                        set7 = set3;
                        str3 = str;
                        str4 = str2;
                        obj = b;
                        set8 = set4;
                        map2 = map;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj2);
                        return obj2;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z3 = hVar.q;
                map2 = hVar.p;
                Set set9 = hVar.o;
                set7 = hVar.n;
                set6 = hVar.m;
                set5 = hVar.l;
                str4 = hVar.k;
                str3 = hVar.j;
                qgg.h0(obj2);
                obj = obj2;
                set8 = set9;
                z2 = z3;
                PlusPayGoogleBillingConfig plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj;
                PlusPayAcquisitionApi plusPayAcquisitionApi = lVar.a;
                Set<PlusPaySmartOffer.TargetAndFeatures> set10 = set6;
                ArrayList arrayList = new ArrayList(v75.o(set10, 10));
                for (PlusPaySmartOffer.TargetAndFeatures targetAndFeatures : set10) {
                    arrayList.add(new com.yandex.plus.pay.data.acquisition.dto.l(targetAndFeatures.getTarget(), targetAndFeatures.getFeatures()));
                    set8 = set8;
                }
                Set set11 = set8;
                Set A0 = CollectionsKt.A0(arrayList);
                Set set12 = set7;
                Set set13 = set5;
                String str5 = str4;
                m mVar = new m(new com.yandex.plus.pay.data.acquisition.dto.i(str5, set13, A0, set12, set11, map2, plusPayGoogleBillingConfig == null ? plusPayGoogleBillingConfig.getGoogleCountryCode() : null, plusPayGoogleBillingConfig == null ? Boolean.valueOf(plusPayGoogleBillingConfig.isNativePaymentAllowed()) : null, (String) lVar.c.invoke()));
                hVar.j = null;
                hVar.k = null;
                hVar.l = null;
                hVar.m = null;
                hVar.n = null;
                hVar.o = null;
                hVar.p = null;
                hVar.q = z2;
                hVar.t = 2;
                Object smartOffers = plusPayAcquisitionApi.getSmartOffers(str3, z2, mVar, hVar);
                return smartOffers != obj3 ? obj3 : smartOffers;
            }
        }
        hVar = new h(lVar, cg6Var);
        Object obj22 = hVar.r;
        Object obj32 = nm6.a;
        i = hVar.t;
        if (i != 0) {
        }
        PlusPayGoogleBillingConfig plusPayGoogleBillingConfig2 = (PlusPayGoogleBillingConfig) obj;
        PlusPayAcquisitionApi plusPayAcquisitionApi2 = lVar.a;
        Set<PlusPaySmartOffer.TargetAndFeatures> set102 = set6;
        ArrayList arrayList2 = new ArrayList(v75.o(set102, 10));
        while (r9.hasNext()) {
        }
        Set set112 = set8;
        Set A02 = CollectionsKt.A0(arrayList2);
        if (plusPayGoogleBillingConfig2 == null) {
        }
        Set set122 = set7;
        Set set132 = set5;
        String str52 = str4;
        m mVar2 = new m(new com.yandex.plus.pay.data.acquisition.dto.i(str52, set132, A02, set122, set112, map2, plusPayGoogleBillingConfig2 == null ? plusPayGoogleBillingConfig2.getGoogleCountryCode() : null, plusPayGoogleBillingConfig2 == null ? Boolean.valueOf(plusPayGoogleBillingConfig2.isNativePaymentAllowed()) : null, (String) lVar.c.invoke()));
        hVar.j = null;
        hVar.k = null;
        hVar.l = null;
        hVar.m = null;
        hVar.n = null;
        hVar.o = null;
        hVar.p = null;
        hVar.q = z2;
        hVar.t = 2;
        Object smartOffers2 = plusPayAcquisitionApi2.getSmartOffers(str3, z2, mVar2, hVar);
        if (smartOffers2 != obj32) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        i iVar;
        Object obj;
        int i;
        Set set;
        Throwable th;
        wis e;
        t7o t7oVar;
        com.yandex.plus.pay.inapp.api.a aVar;
        String str;
        try {
            if (cg6Var instanceof i) {
                iVar = (i) cg6Var;
                int i2 = iVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iVar.m = i2 - Integer.MIN_VALUE;
                    obj = iVar.k;
                    nm6 nm6Var = nm6.a;
                    i = iVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        Set set2 = (Set) this.d.invoke();
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b bVar = this.b;
                            iVar.j = set2;
                            iVar.m = 1;
                            Object a = bVar.a(iVar);
                            if (a == nm6Var) {
                                return nm6Var;
                            }
                            set = set2;
                            obj = a;
                        } catch (wis e2) {
                            set = set2;
                            e = e2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            if (obj instanceof t7o) {
                            }
                            aVar = (com.yandex.plus.pay.inapp.api.a) obj;
                            if (aVar == null) {
                            }
                        } catch (Throwable th2) {
                            set = set2;
                            th = th2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            if (obj instanceof t7o) {
                            }
                            aVar = (com.yandex.plus.pay.inapp.api.a) obj;
                            if (aVar == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        set = iVar.j;
                        try {
                            qgg.h0(obj);
                        } catch (wis e3) {
                            e = e3;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            obj = t7oVar;
                            if (obj instanceof t7o) {
                            }
                            aVar = (com.yandex.plus.pay.inapp.api.a) obj;
                            if (aVar == null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            obj = t7oVar;
                            if (obj instanceof t7o) {
                            }
                            aVar = (com.yandex.plus.pay.inapp.api.a) obj;
                            if (aVar == null) {
                            }
                        }
                    }
                    r7o r7oVar4 = z7o.b;
                    if (obj instanceof t7o) {
                        obj = null;
                    }
                    aVar = (com.yandex.plus.pay.inapp.api.a) obj;
                    if (aVar == null && (str = aVar.a) != null) {
                        return new PlusPayGoogleBillingConfig(str, set.contains(str));
                    }
                }
            }
            if (i != 0) {
            }
            r7o r7oVar42 = z7o.b;
            if (obj instanceof t7o) {
            }
            aVar = (com.yandex.plus.pay.inapp.api.a) obj;
            return aVar == null ? null : null;
        } catch (CancellationException e4) {
            throw e4;
        }
        iVar = new i(this, cg6Var);
        obj = iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iVar.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Set set, q5b q5bVar, Set set2, Set set3, Map map, String str2, boolean z, cg6 cg6Var) {
        j jVar;
        int i;
        com.yandex.plus.pay.common.api.utils.b r;
        String str3;
        c5b c5bVar;
        PlusPaySmartOffer.Meta meta;
        PlusPaySmartOffer.Legals legals;
        List list;
        PlusPayCompositeOffers.Offer.Tariff tariff;
        PlusPayPrice plusPayPrice;
        PlusPayCompositeOffers.Offer.Vendor vendor;
        PlusPayPrice plusPayPrice2;
        PlusPayCompositeOffers.Offer.Vendor vendor2;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.j;
                nm6 nm6Var = nm6.a;
                i = jVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    k kVar = new k(this, str2, z, str, set, q5bVar, set2, set3, map, null);
                    jVar2.l = 1;
                    obj = x97.V(this.e, kVar, jVar2);
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
                r = com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) obj, new v0(18));
                b1 b1Var = (b1) r.a;
                str3 = b1Var.a;
                if (str3 != null) {
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                    com.yandex.plus.log.api.b bVar = this.f;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "SmartOffersRepositoryImpl", "Session id for smart offers is null");
                    }
                    throw new PlusPayParseException(new com.yandex.plus.home.common.network.e(new IllegalStateException("sessionId is required field for smart offers")));
                }
                List list2 = b1Var.f;
                if (list2 != null) {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        a1 a1Var = (a1) it.next();
                        String str4 = b1Var.b;
                        String str5 = b1Var.e;
                        String str6 = b1Var.c;
                        Long l = b1Var.d;
                        a1Var.getClass();
                        str5.getClass();
                        Boolean bool = a1Var.g;
                        m0 m0Var = a1Var.a;
                        w0 w0Var = a1Var.i;
                        boolean d = Intrinsics.d(bool, Boolean.TRUE);
                        int i3 = a1Var.d;
                        String str7 = a1Var.c;
                        String str8 = a1Var.e;
                        b1 b1Var2 = b1Var;
                        Set set4 = a1Var.f;
                        if (set4 == null) {
                            set4 = q5b.a;
                        }
                        PlusPaySmartOffer.TargetAndFeatures targetAndFeatures = new PlusPaySmartOffer.TargetAndFeatures(str8, set4);
                        String str9 = a1Var.b;
                        z0 z0Var = a1Var.h;
                        PlusPaySmartOffer.Texts texts = new PlusPaySmartOffer.Texts(z0Var.a, z0Var.b, z0Var.c, z0Var.d, z0Var.e, z0Var.f, z0Var.g, z0Var.h, z0Var.i, z0Var.j, z0Var.k, z0Var.l);
                        String str10 = w0Var.a;
                        List list4 = w0Var.c;
                        String str11 = w0Var.b;
                        List<u0> list5 = list4;
                        String str12 = str3;
                        Iterator it2 = it;
                        ArrayList arrayList2 = new ArrayList(v75.o(list5, 10));
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            u0 u0Var = (u0) it3.next();
                            String str13 = str4;
                            String str14 = u0Var.a;
                            t0 t0Var = u0Var.b;
                            arrayList2.add(new PlusPaySmartOffer.Legals.Argument(str14, t0Var.a, t0Var.b));
                            it3 = it3;
                            str4 = str13;
                            str5 = str5;
                        }
                        String str15 = str4;
                        String str16 = str5;
                        PlusPaySmartOffer.Legals legals2 = new PlusPaySmartOffer.Legals(str10, str11, arrayList2);
                        PlusPaySmartOffer.Meta meta2 = new PlusPaySmartOffer.Meta(str12, m0Var.a, m0Var.b, str6, l, m0Var.c);
                        v vVar = a1Var.j;
                        String str17 = m0Var.a;
                        List list6 = vVar.d;
                        e1 e1Var = vVar.c;
                        PlusPayCompositeOffers.Offer.StructureType structureType = (list6.isEmpty() || e1Var == null) ? list6.size() > 1 ? PlusPayCompositeOffers.Offer.StructureType.COMPOSITE : e1Var != null ? PlusPayCompositeOffers.Offer.StructureType.TARIFF : !list6.isEmpty() ? PlusPayCompositeOffers.Offer.StructureType.OPTION : PlusPayCompositeOffers.Offer.StructureType.TARIFF : PlusPayCompositeOffers.Offer.StructureType.COMPOSITE;
                        String str18 = vVar.a;
                        p pVar = vVar.b;
                        String str19 = pVar != null ? pVar.a : null;
                        if (e1Var != null) {
                            String str20 = e1Var.a;
                            String str21 = e1Var.f.a;
                            meta = meta2;
                            String str22 = e1Var.b;
                            String str23 = e1Var.c;
                            String str24 = e1Var.d;
                            String str25 = e1Var.e;
                            legals = legals2;
                            d0 d0Var = e1Var.h;
                            list = list6;
                            PlusPayPrice plusPayPrice3 = new PlusPayPrice(d0Var.a, d0Var.b);
                            String str26 = e1Var.g;
                            c5b c5bVar2 = c5b.a;
                            int ordinal = e1Var.i.ordinal();
                            if (ordinal != 0) {
                                plusPayPrice2 = plusPayPrice3;
                                vendor2 = ordinal != 1 ? PlusPayCompositeOffers.Offer.Vendor.UNKNOWN : PlusPayCompositeOffers.Offer.Vendor.NATIVE;
                            } else {
                                plusPayPrice2 = plusPayPrice3;
                                vendor2 = PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
                            }
                            tariff = new PlusPayCompositeOffers.Offer.Tariff(str20, str21, str22, str23, str24, str25, plusPayPrice2, str26, c5bVar2, vendor2, e1Var.j);
                        } else {
                            meta = meta2;
                            legals = legals2;
                            list = list6;
                            tariff = null;
                        }
                        List list7 = list;
                        ArrayList arrayList3 = new ArrayList(v75.o(list7, 10));
                        Iterator it4 = list7.iterator();
                        while (it4.hasNext()) {
                            a0 a0Var = (a0) it4.next();
                            String str27 = a0Var.a;
                            String str28 = a0Var.f.a;
                            String str29 = a0Var.b;
                            Iterator it5 = it4;
                            String str30 = a0Var.c;
                            String str31 = a0Var.d;
                            String str32 = a0Var.e;
                            d0 d0Var2 = a0Var.h;
                            String str33 = str18;
                            PlusPayPrice plusPayPrice4 = new PlusPayPrice(d0Var2.a, d0Var2.b);
                            String str34 = a0Var.g;
                            c5b c5bVar3 = c5b.a;
                            int ordinal2 = a0Var.i.ordinal();
                            if (ordinal2 != 0) {
                                plusPayPrice = plusPayPrice4;
                                vendor = ordinal2 != 1 ? PlusPayCompositeOffers.Offer.Vendor.UNKNOWN : PlusPayCompositeOffers.Offer.Vendor.NATIVE;
                            } else {
                                plusPayPrice = plusPayPrice4;
                                vendor = PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
                            }
                            arrayList3.add(new PlusPayCompositeOffers.Offer.Option(str27, str28, str29, str30, str31, str32, plusPayPrice, str34, c5bVar3, vendor, a0Var.j));
                            it4 = it5;
                            str18 = str33;
                        }
                        String str35 = str18;
                        ArrayList arrayList4 = new ArrayList(v75.o(list5, 10));
                        for (u0 u0Var2 : list5) {
                            String str36 = u0Var2.a;
                            t0 t0Var2 = u0Var2.b;
                            arrayList4.add(new PlusPayLegalInfo.Item.Link(str36, t0Var2.a, t0Var2.b));
                        }
                        PlusPayLegalInfo plusPayLegalInfo = new PlusPayLegalInfo(str11, arrayList4);
                        c5b c5bVar4 = c5b.a;
                        s sVar = vVar.e;
                        arrayList.add(new PlusPaySmartOffer(i3, str15, str7, targetAndFeatures, str9, d, texts, legals, str16, meta, new PlusPayCompositeOffers.Offer(str35, structureType, str19, tariff, arrayList3, plusPayLegalInfo, c5bVar4, false, new PlusPayCompositeOffers.Offer.Assets(sVar.a, sVar.b, sVar.c), d, new PlusPayCompositeOffers.Offer.Meta(str12, str8, str17))));
                        str3 = str12;
                        b1Var = b1Var2;
                        it = it2;
                    }
                    c5bVar = arrayList;
                } else {
                    c5bVar = null;
                }
                String str37 = str3;
                if (c5bVar == null) {
                    c5bVar = c5b.a;
                }
                return new SmartOffersBatch(str37, c5bVar);
            }
        }
        jVar = new j(this, cg6Var);
        j jVar22 = jVar;
        Object obj2 = jVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = jVar22.l;
        if (i != 0) {
        }
        r = com.yandex.plus.bdui.flex.ui.a.r((NetworkResponse) obj2, new v0(18));
        b1 b1Var3 = (b1) r.a;
        str3 = b1Var3.a;
        if (str3 != null) {
        }
    }
}

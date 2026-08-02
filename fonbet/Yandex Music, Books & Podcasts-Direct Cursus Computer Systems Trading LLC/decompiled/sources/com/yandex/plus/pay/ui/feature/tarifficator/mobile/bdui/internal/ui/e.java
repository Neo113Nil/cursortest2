package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import com.connectsdk.service.DeviceService;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayGoogleBillingConfig;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.eta;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.uah;
import defpackage.v75;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class e {
    public static final Object m = uah.e(new Pair(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.p.a, "showUpsale"), new Pair(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.p.b, "showTopup"), new Pair(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.p.c, "showFamilyInvite"), new Pair(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.p.d, "showCollectContacts"), new Pair(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.p.e, "showSuccess"), new Pair(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.p.f, "showError"));
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final n h;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k i;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k j;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k k;
    public final com.yandex.plus.home.feature.webviews.internal.webview.a l;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, n nVar, com.yandex.plus.core.location.a aVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar3, com.yandex.plus.home.feature.webviews.internal.webview.a aVar2) {
        eta.r(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = nVar;
        this.i = kVar;
        this.j = kVar2;
        this.k = kVar3;
        this.l = aVar2;
    }

    public static Map c(String str, String str2, String str3, String str4, String str5, PlusPayPrice plusPayPrice, String str6, PlusPayCompositeOffers.Offer.Vendor vendor, Map map) {
        String str7;
        Pair pair = new Pair("name", str);
        Pair pair2 = new Pair("title", str2);
        if (str3 == null) {
            str3 = "";
        }
        Pair pair3 = new Pair(DeviceService.KEY_DESC, str3);
        if (str4 == null) {
            str4 = "";
        }
        Pair pair4 = new Pair("text", str4);
        if (str5 == null) {
            str5 = "";
        }
        Pair pair5 = new Pair("additionalText", str5);
        Pair pair6 = new Pair("commonPrice", f(plusPayPrice));
        Pair pair7 = new Pair("commonPeriod", str6);
        int i = b.a[vendor.ordinal()];
        if (i == 1) {
            str7 = "GOOGLE_PLAY";
        } else if (i == 2) {
            str7 = "NATIVE_YANDEX";
        } else {
            if (i != 3) {
                b6e.s();
                return null;
            }
            str7 = "UNKNOWN";
        }
        Pair pair8 = new Pair("vendor", str7);
        if (map == null) {
            map = e5b.a;
            map.getClass();
        }
        return uah.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("payload", map));
    }

    public static Map d(String str, PlusPayPrice plusPayPrice, String str2, List list, PlusPayCompositeOffers.Offer.Vendor vendor) {
        Map map;
        if (vendor != PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PlusPayCompositeOffers.Offer.Plan plan = (PlusPayCompositeOffers.Offer.Plan) it.next();
            String currency = plusPayPrice.getCurrency();
            if (plan instanceof PlusPayCompositeOffers.Offer.Plan.Intro) {
                PlusPayCompositeOffers.Offer.Plan.Intro intro = (PlusPayCompositeOffers.Offer.Plan.Intro) plan;
                map = e(intro.getPeriod(), intro.getPrice(), intro.getRepetitionCount());
            } else if (plan instanceof PlusPayCompositeOffers.Offer.Plan.Trial) {
                BigDecimal valueOf = BigDecimal.valueOf(0L);
                valueOf.getClass();
                map = e(((PlusPayCompositeOffers.Offer.Plan.Trial) plan).getPeriod(), new PlusPayPrice(valueOf, currency), 1);
            } else {
                if (!(plan instanceof PlusPayCompositeOffers.Offer.Plan.IntroUntil) && !(plan instanceof PlusPayCompositeOffers.Offer.Plan.TrialUntil)) {
                    b6e.s();
                    return null;
                }
                map = null;
            }
            if (map != null) {
                arrayList.add(map);
            }
        }
        return uah.e(new Pair("offerName", str), new Pair("purchasePlans", CollectionsKt.h0(arrayList, e(str2, plusPayPrice, 0))));
    }

    public static Map e(String str, PlusPayPrice plusPayPrice, int i) {
        return uah.e(new Pair("commonPeriodDuration", str), new Pair("commonPrice", f(plusPayPrice)), new Pair("quantity", Integer.valueOf(i)));
    }

    public static Map f(PlusPayPrice plusPayPrice) {
        return uah.e(new Pair("amount", plusPayPrice.getAmount().toString()), new Pair("currency", plusPayPrice.getCurrency()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v10, types: [c5b] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [c5b] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.g gVar, com.yandex.plus.pay.api.analytics.c cVar, cg6 cg6Var) {
        c cVar2;
        int i;
        PlusPayGoogleBillingConfig plusPayGoogleBillingConfig;
        List list;
        ArrayList arrayList;
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        ?? r14;
        List w0;
        Set set;
        ?? r9;
        Set set2;
        if (cg6Var instanceof c) {
            cVar2 = (c) cg6Var;
            int i2 = cVar2.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.n = i2 - Integer.MIN_VALUE;
                Object obj = cVar2.l;
                nm6 nm6Var = nm6.a;
                i = cVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    cVar2.j = gVar;
                    cVar2.k = cVar;
                    cVar2.n = 1;
                    obj = this.l.invoke(cVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = cVar2.k;
                    gVar = cVar2.j;
                    qgg.h0(obj);
                }
                plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj;
                Pair pair = new Pair(Constants.KEY_PAGE, gVar.a);
                Pair pair2 = new Pair("places", gVar.b);
                list = gVar.c;
                if (list == null) {
                    List<com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.f> list2 = list;
                    arrayList = new ArrayList(v75.o(list2, 10));
                    for (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.f fVar : list2) {
                        arrayList.add(uah.e(new Pair("target", fVar.a), new Pair("features", fVar.b)));
                    }
                } else {
                    arrayList = null;
                }
                Pair pair3 = new Pair("targetToFeatures", arrayList);
                Pair pair4 = new Pair("customProperties", gVar.d);
                str = this.g;
                if (str == null) {
                    str = "unknown";
                }
                Pair pair5 = new Pair("storeId", str);
                if (plusPayGoogleBillingConfig == null) {
                    str2 = plusPayGoogleBillingConfig.getGoogleCountryCode();
                    bool = null;
                } else {
                    str2 = null;
                    bool = null;
                }
                Pair pair6 = new Pair("googleCountryCode", str2);
                if (plusPayGoogleBillingConfig == null) {
                    bool2 = Boolean.valueOf(plusPayGoogleBillingConfig.isNativePaymentAllowed());
                    r14 = bool;
                } else {
                    bool2 = bool;
                    r14 = bool2;
                }
                Pair pair7 = new Pair("isNativePaymentAllowed", bool2);
                Set set3 = cVar.e;
                w0 = set3 == null ? CollectionsKt.w0(set3) : r14;
                if (w0 == null) {
                    w0 = c5b.a;
                }
                Pair pair8 = new Pair("externalExperimentFlags", w0);
                set = cVar.c;
                if (set == null) {
                    Set set4 = set;
                    r9 = new ArrayList(v75.o(set4, 10));
                    Iterator it = set4.iterator();
                    while (it.hasNext()) {
                        r9.add(((com.yandex.plus.pay.api.analytics.e) it.next()).d());
                    }
                } else {
                    r9 = r14;
                }
                if (r9 == 0) {
                    r9 = c5b.a;
                }
                Pair pair9 = new Pair("externalTestIds", r9);
                set2 = cVar.d;
                if (set2 != null) {
                    Set set5 = set2;
                    r14 = new ArrayList(v75.o(set5, 10));
                    Iterator it2 = set5.iterator();
                    while (it2.hasNext()) {
                        r14.add(((com.yandex.plus.pay.api.analytics.e) it2.next()).d());
                    }
                }
                if (r14 == 0) {
                    r14 = c5b.a;
                }
                return r1.v(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("externalTriggeredTestIds", r14));
            }
        }
        cVar2 = new c(this, cg6Var);
        Object obj2 = cVar2.l;
        nm6 nm6Var2 = nm6.a;
        i = cVar2.n;
        if (i != 0) {
        }
        plusPayGoogleBillingConfig = (PlusPayGoogleBillingConfig) obj2;
        Pair pair10 = new Pair(Constants.KEY_PAGE, gVar.a);
        Pair pair22 = new Pair("places", gVar.b);
        list = gVar.c;
        if (list == null) {
        }
        Pair pair32 = new Pair("targetToFeatures", arrayList);
        Pair pair42 = new Pair("customProperties", gVar.d);
        str = this.g;
        if (str == null) {
        }
        Pair pair52 = new Pair("storeId", str);
        if (plusPayGoogleBillingConfig == null) {
        }
        Pair pair62 = new Pair("googleCountryCode", str2);
        if (plusPayGoogleBillingConfig == null) {
        }
        Pair pair72 = new Pair("isNativePaymentAllowed", bool2);
        Set set32 = cVar.e;
        if (set32 == null) {
        }
        if (w0 == null) {
        }
        Pair pair82 = new Pair("externalExperimentFlags", w0);
        set = cVar.c;
        if (set == null) {
        }
        if (r9 == 0) {
        }
        Pair pair92 = new Pair("externalTestIds", r9);
        set2 = cVar.d;
        if (set2 != null) {
        }
        if (r14 == 0) {
        }
        return r1.v(pair10, pair22, pair32, pair42, pair52, pair62, pair72, pair82, pair92, new Pair("externalTriggeredTestIds", r14));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h hVar, cg6 cg6Var) {
        d dVar;
        int i;
        Pair[] pairArr;
        Pair[] pairArr2;
        String str;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.o = i2 - Integer.MIN_VALUE;
                Object obj = dVar.m;
                Serializable serializable = nm6.a;
                i = dVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    Pair[] pairArr3 = new Pair[5];
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.g gVar = hVar.b;
                    com.yandex.plus.pay.api.analytics.c cVar = hVar.f;
                    dVar.j = pairArr3;
                    dVar.k = pairArr3;
                    dVar.l = "offerContext";
                    dVar.o = 1;
                    Serializable a = a(gVar, cVar, dVar);
                    if (a == serializable) {
                        return serializable;
                    }
                    pairArr = pairArr3;
                    pairArr2 = pairArr;
                    obj = a;
                    str = "offerContext";
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = dVar.l;
                    pairArr2 = dVar.k;
                    pairArr = dVar.j;
                    qgg.h0(obj);
                }
                pairArr2[0] = new Pair(str, obj);
                pairArr[1] = new Pair("geoLocation", null);
                Boolean bool = Boolean.TRUE;
                pairArr[2] = new Pair("getFullOfferList", bool);
                pairArr[3] = new Pair("oneClickSupported", bool);
                pairArr[4] = new Pair("checkFreezes", bool);
                return r1.v(pairArr);
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.m;
        Serializable serializable2 = nm6.a;
        i = dVar.o;
        if (i != 0) {
        }
        pairArr2[0] = new Pair(str, obj2);
        pairArr[1] = new Pair("geoLocation", null);
        Boolean bool2 = Boolean.TRUE;
        pairArr[2] = new Pair("getFullOfferList", bool2);
        pairArr[3] = new Pair("oneClickSupported", bool2);
        pairArr[4] = new Pair("checkFreezes", bool2);
        return r1.v(pairArr);
    }
}

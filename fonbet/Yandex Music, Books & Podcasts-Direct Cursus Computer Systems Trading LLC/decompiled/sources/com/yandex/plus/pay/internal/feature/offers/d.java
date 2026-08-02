package com.yandex.plus.pay.internal.feature.offers;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.data.common.b0;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.api.model.PlusPayPrice;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayOfferSwitchToggle;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleStep;
import com.yandex.plus.pay.internal.model.PlusPayUpsaleType;
import com.yandex.plus.pay.internal.model.PlusPayWebPaymentWidgetTimeoutParams;
import com.yandex.plus.pay.repository.api.model.offers.i1;
import com.yandex.plus.pay.repository.api.model.offers.l1;
import com.yandex.plus.pay.repository.api.model.offers.m0;
import com.yandex.plus.pay.repository.api.model.offers.n0;
import com.yandex.plus.pay.repository.api.model.offers.z;
import defpackage.b6e;
import defpackage.btf;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.n8g;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tah;
import defpackage.u75;
import defpackage.v75;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class d implements a {
    public final com.yandex.plus.pay.graphql.offers.j a;
    public final com.yandex.plus.pay.inapp.api.b b;
    public final com.yandex.plus.pay.log.impl.b c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;

    public d(com.yandex.plus.pay.graphql.offers.j jVar, com.yandex.plus.pay.inapp.api.b bVar, com.yandex.plus.pay.log.impl.b bVar2) {
        jVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.a = jVar;
        this.b = bVar;
        this.c = bVar2;
        this.d = btf.b(new com.yandex.plus.pay.internal.di.g(4));
        this.e = btf.b(new com.yandex.plus.pay.internal.di.g(5));
        this.f = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(17, this));
        this.g = btf.b(new com.yandex.plus.pay.internal.di.g(6));
    }

    public static com.yandex.plus.pay.repository.api.model.offers.d b(r rVar) {
        List list = rVar.a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c((PlusPayUpsaleStep) it.next()));
        }
        List<q> list2 = rVar.b;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        for (q qVar : list2) {
            arrayList2.add(new com.yandex.plus.pay.repository.api.model.offers.c(qVar.a, qVar.b, qVar.c, c(qVar.d), qVar.e));
        }
        return new com.yandex.plus.pay.repository.api.model.offers.d(arrayList, arrayList2);
    }

    public static l1 c(PlusPayUpsaleStep plusPayUpsaleStep) {
        int i = b.a[plusPayUpsaleStep.ordinal()];
        if (i == 1) {
            return l1.a;
        }
        if (i == 2) {
            return l1.b;
        }
        if (i == 3) {
            return l1.c;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:0|1|(2:3|(28:5|6|7|8|(1:(1:(9:12|13|14|15|(1:17)|18|(1:20)|21|(28:23|(3:25|(1:27)(1:234)|28)(1:235)|29|(2:32|30)|33|34|(1:36)(1:233)|37|(4:40|(2:42|43)(2:45|46)|44|38)|47|48|(1:50)|51|(2:54|52)|55|56|(3:59|(23:61|(4:64|(2:66|67)(1:69)|68|62)|70|71|(5:74|(1:76)(1:82)|(2:78|79)(1:81)|80|72)|83|84|(1:86)|87|(2:90|88)|91|92|(4:95|(3:97|98|99)(1:101)|100|93)|102|103|(1:105)|106|(5:109|(9:111|(2:113|(2:115|(2:117|(2:119|(1:121)(3:148|149|150))(1:152))(1:153))(1:154))(1:155)|122|123|(5:125|(1:127)(1:146)|128|(1:130)(1:145)|131)(1:147)|132|(1:134)(1:144)|(1:136)(1:143)|137)(1:156)|(2:139|140)(1:142)|141|107)|157|158|(4:161|(2:163|164)(2:166|167)|165|159)|168|169)(3:170|171|172)|57)|173|174|(11:177|(2:179|(2:181|(1:183)(3:201|202|203))(1:204))(1:205)|184|185|(2:187|(1:189)(3:197|198|199))(1:200)|190|191|(1:193)(1:196)|194|195|175)|206|207|(4:210|(2:212|(2:214|(2:216|217)(3:219|220|221))(2:222|223))(2:224|225)|218|208)|226|227|(1:229)(1:232)|230|231)(2:236|237))(2:244|245))(4:246|247|248|249))(4:310|311|312|(2:314|286))|250|251|(1:253)|254|(4:257|(2:259|260)(1:262)|261|255)|263|264|(1:266)(1:298)|267|(2:270|268)|271|272|273|274|275|276|277|278|(1:280)(1:288)|281|282|283|284))|323|6|7|8|(0)(0)|250|251|(0)|254|(1:255)|263|264|(0)(0)|267|(1:268)|271|272|273|274|275|276|277|278|(0)(0)|281|282|283|284|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0187, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x019f, code lost:
    
        r4 = defpackage.z7o.b;
        r4 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x019c, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0185, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0195, code lost:
    
        r4 = defpackage.z7o.b;
        r4 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x017f, code lost:
    
        if (r0 == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0164, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0165, code lost:
    
        r3 = r6;
        r41 = null;
        r2 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x015d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x015e, code lost:
    
        r3 = r6;
        r41 = null;
        r2 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x018f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0190, code lost:
    
        r3 = r6;
        r41 = null;
        r2 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0189, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x018a, code lost:
    
        r3 = r6;
        r41 = null;
        r2 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0048, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0049, code lost:
    
        r3 = r6;
        r2 = 10;
        r41 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x003e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x003f, code lost:
    
        r3 = r6;
        r2 = 10;
        r41 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0104 A[Catch: all -> 0x003e, CancellationException -> 0x0045, wis -> 0x0048, TryCatch #11 {CancellationException -> 0x0045, blocks: (B:12:0x0035, B:14:0x0182, B:264:0x00fa, B:266:0x0104, B:267:0x010a, B:268:0x0121, B:270:0x0127, B:272:0x0135, B:275:0x014e, B:278:0x0152, B:280:0x0158, B:281:0x016c, B:284:0x017b), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0127 A[Catch: all -> 0x003e, CancellationException -> 0x0045, wis -> 0x0048, LOOP:13: B:268:0x0121->B:270:0x0127, LOOP_END, TryCatch #11 {CancellationException -> 0x0045, blocks: (B:12:0x0035, B:14:0x0182, B:264:0x00fa, B:266:0x0104, B:267:0x010a, B:268:0x0121, B:270:0x0127, B:272:0x0135, B:275:0x014e, B:278:0x0152, B:280:0x0158, B:281:0x016c, B:284:0x017b), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0158 A[Catch: CancellationException -> 0x0045, all -> 0x015d, wis -> 0x0164, TryCatch #11 {CancellationException -> 0x0045, blocks: (B:12:0x0035, B:14:0x0182, B:264:0x00fa, B:266:0x0104, B:267:0x010a, B:268:0x0121, B:270:0x0127, B:272:0x0135, B:275:0x014e, B:278:0x0152, B:280:0x0158, B:281:0x016c, B:284:0x017b), top: B:8:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0072  */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails$TariffOfferDetails] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.yandex.plus.pay.internal.model.PlusPayRichText] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r28v3, types: [com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails$PaymentMethod] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4, types: [com.yandex.plus.pay.internal.model.PlusPayRichText] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [com.yandex.plus.pay.internal.model.PlusPayOfferSwitchToggle] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r36v4, types: [com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails$PaymentMethod$ButtonAsset] */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50, types: [com.yandex.plus.pay.internal.model.PlusPayRichText] */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.yandex.plus.pay.internal.model.PlusPayOfferSwitchToggle] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [com.yandex.plus.pay.internal.model.PlusPayRichText] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.yandex.plus.pay.api.model.PlusPayPrice] */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.yandex.plus.pay.api.model.PlusPayPrice] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, t tVar, cg6 cg6Var) {
        c cVar;
        Object obj;
        int i;
        com.yandex.plus.pay.log.impl.b bVar;
        int i2;
        Throwable th;
        ?? r18;
        PlusPayUpsaleStep plusPayUpsaleStep;
        PlusPayUpsaleStep plusPayUpsaleStep2;
        PlusPayUpsaleType plusPayUpsaleType;
        Iterator it;
        PlusPayCompositeOfferDetails.SuccessScreenDetails successScreenDetails;
        Throwable th2;
        PlusPayCompositeOfferDetails.PaymentMethod.Type type;
        ?? r36;
        Throwable th3;
        t7o t7oVar;
        wis e;
        Iterator it2;
        PlusPayCompositeOffers.Offer offer2 = offer;
        t tVar2 = tVar;
        try {
            try {
                if (cg6Var instanceof c) {
                    cVar = (c) cg6Var;
                    int i3 = cVar.n;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        cVar.n = i3 - Integer.MIN_VALUE;
                        c cVar2 = cVar;
                        obj = cVar2.l;
                        nm6 nm6Var = nm6.a;
                        i = cVar2.n;
                        com.yandex.plus.pay.log.impl.b bVar2 = this.c;
                        if (i != 0) {
                            qgg.h0(obj);
                            com.yandex.plus.pay.log.impl.b.d(bVar2, com.yandex.plus.pay.common.internal.log.a.c, "Start loading composite offer details, offer=" + offer2 + ", configuration=" + tVar2);
                            try {
                                r7o r7oVar = z7o.b;
                                com.yandex.plus.pay.inapp.api.b bVar3 = this.b;
                                com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                                cVar2.j = offer2;
                                cVar2.k = tVar2;
                                cVar2.n = 1;
                                obj = bVar3.b(eVar, cVar2);
                            } catch (wis e2) {
                                e = e2;
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(e);
                                obj = t7oVar;
                                if (z7o.a(obj) != null) {
                                }
                                Iterable<com.yandex.plus.pay.inapp.api.f> iterable = (Iterable) obj;
                                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                                while (r0.hasNext()) {
                                }
                                r7o r7oVar3 = z7o.b;
                                com.yandex.plus.pay.graphql.offers.j jVar = this.a;
                                PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer2.getTariffOffer();
                                if (tariffOffer == null) {
                                }
                                String activeTariffId = offer2.getActiveTariffId();
                                List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer2.getOptionOffers();
                                ArrayList arrayList2 = new ArrayList(v75.o(optionOffers, 10));
                                it2 = optionOffers.iterator();
                                while (it2.hasNext()) {
                                }
                                String productTarget = offer2.getMeta().getProductTarget();
                                ((com.yandex.plus.pay.internal.model.mappers.k) this.g.getValue()).getClass();
                                n8g a = com.yandex.plus.pay.internal.model.mappers.k.a(offer2);
                                boolean z = tVar2.a;
                                boolean z2 = tVar2.b;
                                r rVar = tVar2.c;
                                if (rVar == null) {
                                }
                                cVar2.j = null;
                                cVar2.k = null;
                                cVar2.n = 2;
                                th = null;
                                com.yandex.plus.pay.repository.api.model.offers.d dVar = r3;
                                bVar = bVar2;
                                i2 = 10;
                                obj = jVar.a(r0, activeTariffId, arrayList2, productTarget, a, arrayList, z, z2, dVar, cVar2);
                            } catch (Throwable th4) {
                                th3 = th4;
                                r7o r7oVar4 = z7o.b;
                                t7oVar = new t7o(th3);
                                obj = t7oVar;
                                if (z7o.a(obj) != null) {
                                }
                                Iterable<com.yandex.plus.pay.inapp.api.f> iterable2 = (Iterable) obj;
                                ArrayList arrayList3 = new ArrayList(v75.o(iterable2, 10));
                                while (r0.hasNext()) {
                                }
                                r7o r7oVar32 = z7o.b;
                                com.yandex.plus.pay.graphql.offers.j jVar2 = this.a;
                                PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer2.getTariffOffer();
                                if (tariffOffer2 == null) {
                                }
                                String activeTariffId2 = offer2.getActiveTariffId();
                                List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer2.getOptionOffers();
                                ArrayList arrayList22 = new ArrayList(v75.o(optionOffers2, 10));
                                it2 = optionOffers2.iterator();
                                while (it2.hasNext()) {
                                }
                                String productTarget2 = offer2.getMeta().getProductTarget();
                                ((com.yandex.plus.pay.internal.model.mappers.k) this.g.getValue()).getClass();
                                n8g a2 = com.yandex.plus.pay.internal.model.mappers.k.a(offer2);
                                boolean z3 = tVar2.a;
                                boolean z22 = tVar2.b;
                                r rVar2 = tVar2.c;
                                if (rVar2 == null) {
                                }
                                cVar2.j = null;
                                cVar2.k = null;
                                cVar2.n = 2;
                                th = null;
                                com.yandex.plus.pay.repository.api.model.offers.d dVar2 = r3;
                                bVar = bVar2;
                                i2 = 10;
                                obj = jVar2.a(r0, activeTariffId2, arrayList22, productTarget2, a2, arrayList3, z3, z22, dVar2, cVar2);
                            }
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj);
                                bVar = bVar2;
                                i2 = 10;
                                th = null;
                                r7o r7oVar5 = z7o.b;
                                if (!(obj instanceof t7o)) {
                                    com.yandex.plus.pay.log.impl.b.d(bVar, com.yandex.plus.pay.common.internal.log.a.c, "Got composite offer details successfully");
                                }
                                Throwable a3 = z7o.a(obj);
                                if (a3 != null) {
                                    com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.common.internal.log.a.c, "Error when receiving composite offer details", a3, 8);
                                }
                                Throwable a4 = z7o.a(obj);
                                if (a4 != null) {
                                    throw r1.U(a4);
                                }
                                com.yandex.plus.pay.internal.model.mappers.a aVar = (com.yandex.plus.pay.internal.model.mappers.a) this.f.getValue();
                                com.yandex.plus.pay.repository.api.model.offers.o oVar = (com.yandex.plus.pay.repository.api.model.offers.o) obj;
                                aVar.getClass();
                                oVar.getClass();
                                com.yandex.plus.pay.repository.api.model.offers.n nVar = oVar.a;
                                if (nVar != null) {
                                    String str = nVar.a;
                                    String str2 = nVar.b;
                                    String str3 = nVar.c;
                                    String str4 = nVar.d;
                                    Map map = nVar.e;
                                    Map map2 = nVar.f;
                                    String str5 = nVar.g;
                                    String str6 = nVar.h;
                                    com.yandex.plus.core.data.common.k kVar = nVar.i;
                                    com.yandex.plus.pay.repository.api.model.offers.v vVar = nVar.j;
                                    r18 = new PlusPayCompositeOfferDetails.TariffOfferDetails(str, str2, str3, str4, map, map2, str5, str6, kVar, vVar != null ? com.yandex.plus.pay.internal.model.mappers.e.a(vVar) : th);
                                } else {
                                    r18 = th;
                                }
                                List<com.yandex.plus.pay.repository.api.model.offers.f> list = oVar.b;
                                ArrayList arrayList4 = new ArrayList(v75.o(list, i2));
                                for (com.yandex.plus.pay.repository.api.model.offers.f fVar : list) {
                                    arrayList4.add(new PlusPayCompositeOfferDetails.OptionOfferDetails(fVar.a, fVar.b, fVar.c, fVar.d, fVar.e, fVar.f, fVar.g, fVar.h, fVar.i));
                                }
                                com.yandex.plus.pay.internal.model.mappers.g gVar = aVar.b;
                                z zVar = oVar.c;
                                gVar.getClass();
                                PlusPayLegalInfo a5 = com.yandex.plus.pay.internal.model.mappers.g.a(zVar);
                                i1 i1Var = oVar.d;
                                ?? b = i1Var != null ? com.yandex.plus.pay.internal.model.mappers.j.b(i1Var) : th;
                                com.yandex.plus.pay.repository.api.model.offers.l lVar = oVar.e;
                                PlusPayCompositeOfferDetails.PaymentText paymentText = new PlusPayCompositeOfferDetails.PaymentText(lVar.a, lVar.b);
                                com.yandex.plus.pay.repository.api.model.offers.m mVar = oVar.f;
                                PlusPayCompositeOfferDetails.SuccessScreenDetails successScreenDetails2 = new PlusPayCompositeOfferDetails.SuccessScreenDetails(mVar.a, mVar.b);
                                ArrayList<com.yandex.plus.pay.repository.api.model.offers.e> arrayList5 = oVar.g;
                                com.yandex.plus.pay.internal.model.mappers.i iVar = aVar.a;
                                ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, i2));
                                for (com.yandex.plus.pay.repository.api.model.offers.e eVar2 : arrayList5) {
                                    long j = eVar2.a;
                                    n0 n0Var = eVar2.b;
                                    iVar.getClass();
                                    PlusPayPrice a6 = com.yandex.plus.pay.internal.model.mappers.i.a(n0Var);
                                    n0 n0Var2 = eVar2.c;
                                    arrayList6.add(new PlusPayCompositeOfferDetails.Invoice(j, a6, n0Var2 != null ? com.yandex.plus.pay.internal.model.mappers.i.a(n0Var2) : th));
                                }
                                Boolean bool = oVar.h;
                                String str7 = oVar.j;
                                String str8 = oVar.k;
                                String str9 = oVar.l;
                                ArrayList arrayList7 = oVar.i;
                                ArrayList arrayList8 = oVar.m;
                                int a7 = tah.a(v75.o(arrayList7, i2));
                                if (a7 < 16) {
                                    a7 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
                                for (Object obj2 : arrayList7) {
                                    linkedHashMap.put(((com.yandex.plus.pay.repository.api.model.offers.i) obj2).a, obj2);
                                }
                                ArrayList arrayList9 = new ArrayList(v75.o(arrayList8, i2));
                                int i4 = 0;
                                for (Object obj3 : arrayList8) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        u75.n();
                                        throw th;
                                    }
                                    com.yandex.plus.pay.repository.api.model.offers.j jVar3 = (com.yandex.plus.pay.repository.api.model.offers.j) obj3;
                                    ArrayList arrayList10 = jVar3.b;
                                    List list2 = jVar3.c;
                                    Set A0 = CollectionsKt.A0(arrayList10);
                                    List list3 = list2;
                                    Boolean bool2 = bool;
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj4 : list3) {
                                        String str10 = str7;
                                        ArrayList arrayList12 = arrayList4;
                                        if (((com.yandex.plus.pay.repository.api.model.offers.k) obj4).e == null) {
                                            arrayList11.add(obj4);
                                        }
                                        str7 = str10;
                                        arrayList4 = arrayList12;
                                    }
                                    String str11 = str7;
                                    ArrayList arrayList13 = arrayList4;
                                    ArrayList arrayList14 = new ArrayList();
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        Iterator it4 = it3;
                                        Object next = it4.next();
                                        PlusPayCompositeOfferDetails.PaymentText paymentText2 = paymentText;
                                        String str12 = ((com.yandex.plus.pay.repository.api.model.offers.k) next).e;
                                        if (str12 != null ? A0.contains(str12) : false) {
                                            arrayList14.add(next);
                                        }
                                        it3 = it4;
                                        paymentText = paymentText2;
                                    }
                                    PlusPayCompositeOfferDetails.PaymentText paymentText3 = paymentText;
                                    int a8 = tah.a(v75.o(arrayList14, 10));
                                    if (a8 < 16) {
                                        a8 = 16;
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(a8);
                                    Iterator it5 = arrayList14.iterator();
                                    while (it5.hasNext()) {
                                        Object next2 = it5.next();
                                        linkedHashMap2.put(((com.yandex.plus.pay.repository.api.model.offers.k) next2).e, next2);
                                    }
                                    ArrayList<com.yandex.plus.pay.repository.api.model.offers.k> arrayList15 = new ArrayList();
                                    Iterator it6 = arrayList10.iterator();
                                    while (it6.hasNext()) {
                                        com.yandex.plus.pay.repository.api.model.offers.k kVar2 = (com.yandex.plus.pay.repository.api.model.offers.k) linkedHashMap2.get((String) it6.next());
                                        if (kVar2 != null) {
                                            arrayList15.add(kVar2);
                                        }
                                    }
                                    if (i4 == arrayList8.size() - 1) {
                                        arrayList15 = CollectionsKt.g0(arrayList15, arrayList11);
                                    }
                                    String str13 = jVar3.a;
                                    ArrayList arrayList16 = new ArrayList();
                                    Iterator it7 = arrayList10.iterator();
                                    while (it7.hasNext()) {
                                        com.yandex.plus.pay.repository.api.model.offers.i iVar2 = (com.yandex.plus.pay.repository.api.model.offers.i) linkedHashMap.get((String) it7.next());
                                        if (iVar2 != null) {
                                            String str14 = iVar2.a;
                                            int ordinal = iVar2.b.ordinal();
                                            if (ordinal != 0) {
                                                it = it7;
                                                if (ordinal == 1) {
                                                    type = PlusPayCompositeOfferDetails.PaymentMethod.Type.NEW_YB_CARD;
                                                } else if (ordinal == 2) {
                                                    type = PlusPayCompositeOfferDetails.PaymentMethod.Type.NEW_SBP;
                                                } else if (ordinal == 3) {
                                                    type = PlusPayCompositeOfferDetails.PaymentMethod.Type.CARD;
                                                } else {
                                                    if (ordinal != 4) {
                                                        b6e.s();
                                                        return th;
                                                    }
                                                    type = PlusPayCompositeOfferDetails.PaymentMethod.Type.SBP;
                                                }
                                            } else {
                                                it = it7;
                                                type = PlusPayCompositeOfferDetails.PaymentMethod.Type.NEW_CARD;
                                            }
                                            PlusPayCompositeOfferDetails.PaymentMethod.Type type2 = type;
                                            String str15 = iVar2.c;
                                            String str16 = iVar2.d;
                                            y yVar = iVar2.e;
                                            com.yandex.plus.core.data.common.v vVar2 = iVar2.f;
                                            com.yandex.plus.core.data.common.v vVar3 = iVar2.g;
                                            com.yandex.plus.pay.repository.api.model.offers.g gVar2 = iVar2.h;
                                            if (gVar2 != null) {
                                                successScreenDetails = successScreenDetails2;
                                                i1 i1Var2 = gVar2.a;
                                                ?? b2 = i1Var2 != null ? com.yandex.plus.pay.internal.model.mappers.j.b(i1Var2) : th;
                                                i1 i1Var3 = gVar2.b;
                                                r36 = new PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset(b2, i1Var3 != null ? com.yandex.plus.pay.internal.model.mappers.j.b(i1Var3) : th);
                                            } else {
                                                successScreenDetails = successScreenDetails2;
                                                r36 = th;
                                            }
                                            b0 b0Var = iVar2.i;
                                            com.yandex.plus.pay.repository.api.model.widget.c cVar3 = iVar2.j;
                                            th2 = new PlusPayCompositeOfferDetails.PaymentMethod(str14, type2, str15, str16, yVar, vVar2, vVar3, r36, b0Var, new PlusPayWebPaymentWidgetTimeoutParams(cVar3 != null ? cVar3.a : th, cVar3 != null ? cVar3.b : th));
                                        } else {
                                            it = it7;
                                            successScreenDetails = successScreenDetails2;
                                            th2 = th;
                                        }
                                        if (th2 != null) {
                                            arrayList16.add(th2);
                                        }
                                        it7 = it;
                                        successScreenDetails2 = successScreenDetails;
                                    }
                                    PlusPayCompositeOfferDetails.SuccessScreenDetails successScreenDetails3 = successScreenDetails2;
                                    ArrayList arrayList17 = new ArrayList(v75.o(arrayList15, 10));
                                    for (com.yandex.plus.pay.repository.api.model.offers.k kVar3 : arrayList15) {
                                        PlusPayRichText b3 = com.yandex.plus.pay.internal.model.mappers.j.b(kVar3.a);
                                        i1 i1Var4 = kVar3.b;
                                        arrayList17.add(new PlusPayCompositeOfferDetails.PaymentPromo(b3, i1Var4 != null ? com.yandex.plus.pay.internal.model.mappers.j.b(i1Var4) : th, kVar3.c, kVar3.d, kVar3.e));
                                    }
                                    arrayList9.add(new PlusPayCompositeOfferDetails.PaymentMethodsGroup(str13, arrayList16, arrayList17));
                                    i4 = i5;
                                    successScreenDetails2 = successScreenDetails3;
                                    paymentText = paymentText3;
                                    bool = bool2;
                                    str7 = str11;
                                    arrayList4 = arrayList13;
                                }
                                Boolean bool3 = bool;
                                String str17 = str7;
                                ArrayList arrayList18 = arrayList4;
                                PlusPayCompositeOfferDetails.PaymentText paymentText4 = paymentText;
                                PlusPayCompositeOfferDetails.SuccessScreenDetails successScreenDetails4 = successScreenDetails2;
                                com.yandex.plus.pay.repository.api.model.offers.b bVar4 = oVar.n;
                                String str18 = bVar4.a;
                                String str19 = bVar4.b;
                                ArrayList arrayList19 = bVar4.c;
                                ArrayList arrayList20 = new ArrayList(v75.o(arrayList19, 10));
                                Iterator it8 = arrayList19.iterator();
                                while (it8.hasNext()) {
                                    com.yandex.plus.pay.repository.api.model.offers.a aVar2 = (com.yandex.plus.pay.repository.api.model.offers.a) it8.next();
                                    PlusPayAdditionalOffer.Offer offer3 = new PlusPayAdditionalOffer.Offer(aVar2.a, aVar2.b, aVar2.c);
                                    Iterator it9 = it8;
                                    PlusPayAdditionalOffer.Assets assets = new PlusPayAdditionalOffer.Assets(aVar2.d, aVar2.e, aVar2.f, aVar2.g, aVar2.h, aVar2.i);
                                    boolean z4 = aVar2.j;
                                    boolean z5 = aVar2.k;
                                    ArrayList arrayList21 = aVar2.l;
                                    int ordinal2 = aVar2.m.ordinal();
                                    if (ordinal2 == 0) {
                                        plusPayUpsaleStep2 = PlusPayUpsaleStep.CHECKOUT;
                                    } else if (ordinal2 == 1) {
                                        plusPayUpsaleStep2 = PlusPayUpsaleStep.UPSALE;
                                    } else {
                                        if (ordinal2 != 2) {
                                            b6e.s();
                                            return th;
                                        }
                                        plusPayUpsaleStep2 = PlusPayUpsaleStep.PRESALE;
                                    }
                                    PlusPayUpsaleStep plusPayUpsaleStep3 = plusPayUpsaleStep2;
                                    int ordinal3 = aVar2.n.ordinal();
                                    if (ordinal3 == 0) {
                                        plusPayUpsaleType = PlusPayUpsaleType.ADDITION;
                                    } else {
                                        if (ordinal3 != 1) {
                                            b6e.s();
                                            return th;
                                        }
                                        plusPayUpsaleType = PlusPayUpsaleType.REPLACE;
                                    }
                                    PlusPayUpsaleType plusPayUpsaleType2 = plusPayUpsaleType;
                                    m0 m0Var = aVar2.o;
                                    arrayList20.add(new PlusPayAdditionalOffer(offer3, assets, z4, z5, arrayList21, plusPayUpsaleStep3, plusPayUpsaleType2, m0Var != null ? new PlusPayOfferSwitchToggle(m0Var.a, m0Var.b) : th));
                                    it8 = it9;
                                }
                                List list4 = bVar4.d;
                                ArrayList arrayList23 = new ArrayList(v75.o(list4, 10));
                                Iterator it10 = list4.iterator();
                                while (it10.hasNext()) {
                                    int ordinal4 = ((l1) it10.next()).ordinal();
                                    if (ordinal4 == 0) {
                                        plusPayUpsaleStep = PlusPayUpsaleStep.CHECKOUT;
                                    } else if (ordinal4 == 1) {
                                        plusPayUpsaleStep = PlusPayUpsaleStep.UPSALE;
                                    } else {
                                        if (ordinal4 != 2) {
                                            b6e.s();
                                            return th;
                                        }
                                        plusPayUpsaleStep = PlusPayUpsaleStep.PRESALE;
                                    }
                                    arrayList23.add(plusPayUpsaleStep);
                                }
                                m0 m0Var2 = bVar4.e;
                                return new PlusPayCompositeOfferDetails(r18, arrayList18, a5, b, paymentText4, successScreenDetails4, arrayList6, bool3, str17, str8, str9, arrayList9, new PlusPayAdditionalOffers(str18, str19, arrayList20, arrayList23, m0Var2 != null ? new PlusPayOfferSwitchToggle(m0Var2.a, m0Var2.b) : th));
                            }
                            t tVar3 = cVar2.k;
                            PlusPayCompositeOffers.Offer offer4 = cVar2.j;
                            try {
                                qgg.h0(obj);
                                tVar2 = tVar3;
                                offer2 = offer4;
                            } catch (wis e3) {
                                e = e3;
                                tVar2 = tVar3;
                                offer2 = offer4;
                                r7o r7oVar22 = z7o.b;
                                t7oVar = new t7o(e);
                                obj = t7oVar;
                                if (z7o.a(obj) != null) {
                                }
                                Iterable<com.yandex.plus.pay.inapp.api.f> iterable22 = (Iterable) obj;
                                ArrayList arrayList32 = new ArrayList(v75.o(iterable22, 10));
                                while (r0.hasNext()) {
                                }
                                r7o r7oVar322 = z7o.b;
                                com.yandex.plus.pay.graphql.offers.j jVar22 = this.a;
                                PlusPayCompositeOffers.Offer.Tariff tariffOffer22 = offer2.getTariffOffer();
                                if (tariffOffer22 == null) {
                                }
                                String activeTariffId22 = offer2.getActiveTariffId();
                                List<PlusPayCompositeOffers.Offer.Option> optionOffers22 = offer2.getOptionOffers();
                                ArrayList arrayList222 = new ArrayList(v75.o(optionOffers22, 10));
                                it2 = optionOffers22.iterator();
                                while (it2.hasNext()) {
                                }
                                String productTarget22 = offer2.getMeta().getProductTarget();
                                ((com.yandex.plus.pay.internal.model.mappers.k) this.g.getValue()).getClass();
                                n8g a22 = com.yandex.plus.pay.internal.model.mappers.k.a(offer2);
                                boolean z32 = tVar2.a;
                                boolean z222 = tVar2.b;
                                r rVar22 = tVar2.c;
                                if (rVar22 == null) {
                                }
                                cVar2.j = null;
                                cVar2.k = null;
                                cVar2.n = 2;
                                th = null;
                                com.yandex.plus.pay.repository.api.model.offers.d dVar22 = r3;
                                bVar = bVar2;
                                i2 = 10;
                                obj = jVar22.a(r0, activeTariffId22, arrayList222, productTarget22, a22, arrayList32, z32, z222, dVar22, cVar2);
                            } catch (Throwable th5) {
                                th3 = th5;
                                tVar2 = tVar3;
                                offer2 = offer4;
                                r7o r7oVar42 = z7o.b;
                                t7oVar = new t7o(th3);
                                obj = t7oVar;
                                if (z7o.a(obj) != null) {
                                }
                                Iterable<com.yandex.plus.pay.inapp.api.f> iterable222 = (Iterable) obj;
                                ArrayList arrayList322 = new ArrayList(v75.o(iterable222, 10));
                                while (r0.hasNext()) {
                                }
                                r7o r7oVar3222 = z7o.b;
                                com.yandex.plus.pay.graphql.offers.j jVar222 = this.a;
                                PlusPayCompositeOffers.Offer.Tariff tariffOffer222 = offer2.getTariffOffer();
                                if (tariffOffer222 == null) {
                                }
                                String activeTariffId222 = offer2.getActiveTariffId();
                                List<PlusPayCompositeOffers.Offer.Option> optionOffers222 = offer2.getOptionOffers();
                                ArrayList arrayList2222 = new ArrayList(v75.o(optionOffers222, 10));
                                it2 = optionOffers222.iterator();
                                while (it2.hasNext()) {
                                }
                                String productTarget222 = offer2.getMeta().getProductTarget();
                                ((com.yandex.plus.pay.internal.model.mappers.k) this.g.getValue()).getClass();
                                n8g a222 = com.yandex.plus.pay.internal.model.mappers.k.a(offer2);
                                boolean z322 = tVar2.a;
                                boolean z2222 = tVar2.b;
                                r rVar222 = tVar2.c;
                                if (rVar222 == null) {
                                }
                                cVar2.j = null;
                                cVar2.k = null;
                                cVar2.n = 2;
                                th = null;
                                com.yandex.plus.pay.repository.api.model.offers.d dVar222 = r3;
                                bVar = bVar2;
                                i2 = 10;
                                obj = jVar222.a(r0, activeTariffId222, arrayList2222, productTarget222, a222, arrayList322, z322, z2222, dVar222, cVar2);
                            }
                        }
                        r7o r7oVar6 = z7o.b;
                        if (z7o.a(obj) != null) {
                            obj = c5b.a;
                        }
                        Iterable<com.yandex.plus.pay.inapp.api.f> iterable2222 = (Iterable) obj;
                        ArrayList arrayList3222 = new ArrayList(v75.o(iterable2222, 10));
                        for (com.yandex.plus.pay.inapp.api.f fVar2 : iterable2222) {
                            String str20 = fVar2.e;
                            String str21 = fVar2.a;
                            if (str21 == null) {
                                str21 = "";
                            }
                            arrayList3222.add(new com.yandex.plus.pay.repository.api.model.offers.t(str20, str21, (String) CollectionsKt.Q(fVar2.b)));
                        }
                        r7o r7oVar32222 = z7o.b;
                        com.yandex.plus.pay.graphql.offers.j jVar2222 = this.a;
                        PlusPayCompositeOffers.Offer.Tariff tariffOffer2222 = offer2.getTariffOffer();
                        String id = tariffOffer2222 == null ? tariffOffer2222.getId() : null;
                        String activeTariffId2222 = offer2.getActiveTariffId();
                        List<PlusPayCompositeOffers.Offer.Option> optionOffers2222 = offer2.getOptionOffers();
                        ArrayList arrayList22222 = new ArrayList(v75.o(optionOffers2222, 10));
                        it2 = optionOffers2222.iterator();
                        while (it2.hasNext()) {
                            arrayList22222.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                        }
                        String productTarget2222 = offer2.getMeta().getProductTarget();
                        ((com.yandex.plus.pay.internal.model.mappers.k) this.g.getValue()).getClass();
                        n8g a2222 = com.yandex.plus.pay.internal.model.mappers.k.a(offer2);
                        boolean z3222 = tVar2.a;
                        boolean z22222 = tVar2.b;
                        r rVar2222 = tVar2.c;
                        com.yandex.plus.pay.repository.api.model.offers.d b4 = rVar2222 == null ? b(rVar2222) : null;
                        cVar2.j = null;
                        cVar2.k = null;
                        cVar2.n = 2;
                        th = null;
                        com.yandex.plus.pay.repository.api.model.offers.d dVar2222 = b4;
                        bVar = bVar2;
                        i2 = 10;
                        obj = jVar2222.a(id, activeTariffId2222, arrayList22222, productTarget2222, a2222, arrayList3222, z3222, z22222, dVar2222, cVar2);
                    }
                }
                if (i != 0) {
                }
                r7o r7oVar62 = z7o.b;
                if (z7o.a(obj) != null) {
                }
                Iterable<com.yandex.plus.pay.inapp.api.f> iterable22222 = (Iterable) obj;
                ArrayList arrayList32222 = new ArrayList(v75.o(iterable22222, 10));
                while (r0.hasNext()) {
                }
                r7o r7oVar322222 = z7o.b;
                com.yandex.plus.pay.graphql.offers.j jVar22222 = this.a;
                PlusPayCompositeOffers.Offer.Tariff tariffOffer22222 = offer2.getTariffOffer();
                if (tariffOffer22222 == null) {
                }
                String activeTariffId22222 = offer2.getActiveTariffId();
                List<PlusPayCompositeOffers.Offer.Option> optionOffers22222 = offer2.getOptionOffers();
                ArrayList arrayList222222 = new ArrayList(v75.o(optionOffers22222, 10));
                it2 = optionOffers22222.iterator();
                while (it2.hasNext()) {
                }
                String productTarget22222 = offer2.getMeta().getProductTarget();
                ((com.yandex.plus.pay.internal.model.mappers.k) this.g.getValue()).getClass();
                n8g a22222 = com.yandex.plus.pay.internal.model.mappers.k.a(offer2);
                boolean z32222 = tVar2.a;
                boolean z222222 = tVar2.b;
                r rVar22222 = tVar2.c;
                if (rVar22222 == null) {
                }
                cVar2.j = null;
                cVar2.k = null;
                cVar2.n = 2;
                th = null;
                com.yandex.plus.pay.repository.api.model.offers.d dVar22222 = b4;
                bVar = bVar2;
                i2 = 10;
                obj = jVar22222.a(id, activeTariffId22222, arrayList222222, productTarget22222, a22222, arrayList32222, z32222, z222222, dVar22222, cVar2);
            } catch (CancellationException e4) {
                throw e4;
            }
        } catch (CancellationException e5) {
            throw e5;
        }
        cVar = new c(this, cg6Var);
        c cVar22 = cVar;
        obj = cVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = cVar22.n;
        com.yandex.plus.pay.log.impl.b bVar22 = this.c;
    }
}

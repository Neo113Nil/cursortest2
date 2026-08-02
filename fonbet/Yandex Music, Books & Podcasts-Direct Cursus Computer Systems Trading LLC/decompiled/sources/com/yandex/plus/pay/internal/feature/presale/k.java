package com.yandex.plus.pay.internal.feature.presale;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.t;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.repository.api.model.offers.s;
import defpackage.btf;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.onb;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.z7o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class k implements d {
    public final com.yandex.plus.pay.graphql.offers.j a;
    public final List b;
    public final com.yandex.plus.pay.log.impl.b c;
    public final com.yandex.plus.pay.internal.analytics.j d;
    public final com.yandex.plus.pay.internal.analytics.tarifficator.j e;
    public final jyr f;

    public k(com.yandex.plus.pay.graphql.offers.j jVar, List list, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.internal.analytics.j jVar2, com.yandex.plus.pay.internal.analytics.tarifficator.j jVar3) {
        jVar.getClass();
        list.getClass();
        bVar.getClass();
        jVar2.getClass();
        jVar3.getClass();
        this.a = jVar;
        this.b = list;
        this.c = bVar;
        this.d = jVar2;
        this.e = jVar3;
        this.f = btf.b(new com.yandex.plus.pay.internal.di.g(13));
    }

    public static PlusPayPresale.Assets b(PlusPayCompositeOffers.Offer.Tariff tariff, Map map) {
        PlusPayRichText plusPayRichText;
        PlusPayRichText plusPayRichText2;
        List list;
        String str = (String) map.get("presale_original_price_text");
        PlusPayRichText.Companion companion = PlusPayRichText.INSTANCE;
        PlusPayRichText fromString = companion.fromString(d("presale_loading_text", map));
        String str2 = (String) map.get("presale_benefit_text");
        PlusPayRichText plusPayRichText3 = null;
        r8 = null;
        String str3 = null;
        plusPayRichText3 = null;
        if (str2 != null) {
            plusPayRichText = fromString;
            plusPayRichText2 = companion.fromString(str2);
        } else {
            plusPayRichText = fromString;
            plusPayRichText2 = null;
        }
        PlusPayRichText fromString2 = companion.fromString(d("presale_period_text", map));
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("{{original_price}} ");
        }
        sb.append(d("presale_actual_price_text", map));
        String sb2 = sb.toString();
        if (str != null) {
            list = t75.c(new PlusPayRichText.Item.Strikethrough((String) null, "original_price", str, 1, (DefaultConstructorMarker) null));
        } else {
            list = null;
        }
        if (list == null) {
            list = c5b.a;
        }
        PlusPayRichText plusPayRichText4 = plusPayRichText;
        PlusPayRichText plusPayRichText5 = new PlusPayRichText(sb2, list);
        PlusPayRichText fromString3 = companion.fromString(d("presale_additional_text", map));
        PlusPayRichText fromString4 = companion.fromString(d("presale_suggested_offer_button_text", map));
        PlusPayRichText fromString5 = companion.fromString(d("presale_initial_offer_button_text", map));
        String text = tariff.getText();
        if (text != null) {
            if (StringsKt.U(text)) {
                text = null;
            }
            if (text != null) {
                StringBuilder k = dfi.k(text);
                String additionalText = tariff.getAdditionalText();
                if (additionalText != null) {
                    if (StringsKt.U(additionalText)) {
                        additionalText = null;
                    }
                    if (additionalText != null) {
                        str3 = ", ".concat(additionalText);
                    }
                }
                if (str3 == null) {
                    str3 = "";
                }
                k.append(str3);
                plusPayRichText3 = companion.fromString(k.toString());
            }
        }
        return new PlusPayPresale.Assets(plusPayRichText4, plusPayRichText2, fromString2, plusPayRichText5, fromString3, fromString4, plusPayRichText3, fromString5);
    }

    public static long c(Map map) {
        String d = d("presale_loading_delay_millis", map);
        Long r0 = StringsKt.r0(10, d);
        if (r0 != null) {
            return r0.longValue();
        }
        throw new g(hrg.q("Payload parsing error: (presale_loading_delay_millis, ", d, ") - value must be integer number"));
    }

    public static String d(String str, Map map) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new g("Required field is missing in payload: ".concat(str));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:31|32))(2:33|(2:41|42)(2:37|(1:39)(1:40)))|12|(1:30)(1:16)|17|18|(2:20|21)(2:23|(2:25|26)(2:27|28))))|49|6|7|(0)(0)|12|(1:14)|30|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0038, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r11 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0035, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0032, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        r11 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.yandex.plus.pay.internal.feature.presale.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, cg6 cg6Var) {
        h hVar;
        int i;
        Object t7oVar;
        Throwable a;
        Map<String, String> payload;
        Map<String, String> map;
        long j;
        k kVar;
        PlusPayCompositeOffers.Offer offer2;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.o = i2 - Integer.MIN_VALUE;
                Object obj = hVar.m;
                nm6 nm6Var = nm6.a;
                i = hVar.o;
                com.yandex.plus.pay.log.impl.b bVar = this.c;
                if (i != 0) {
                    qgg.h0(obj);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer.getTariffOffer();
                    if (tariffOffer2 == null || (payload = tariffOffer2.getPayload()) == null) {
                        bVar.g(com.yandex.plus.pay.common.internal.log.a.i, "Offer does not have payload. So, presale is null", null);
                        return null;
                    }
                    r7o r7oVar = z7o.b;
                    String d = d("presale_target", payload);
                    long c = c(payload);
                    String sessionId = offer.getMeta().getSessionId();
                    hVar.j = payload;
                    hVar.k = this;
                    hVar.l = c;
                    hVar.o = 1;
                    Object e = e(sessionId, d, hVar);
                    if (e == nm6Var) {
                        return nm6Var;
                    }
                    map = payload;
                    j = c;
                    obj = e;
                    kVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = hVar.l;
                    kVar = hVar.k;
                    map = hVar.j;
                    qgg.h0(obj);
                }
                offer2 = (PlusPayCompositeOffers.Offer) CollectionsKt.firstOrNull(((PlusPayCompositeOffers) obj).getOffers());
                if (offer2 != null || (tariffOffer = offer2.getTariffOffer()) == null) {
                    t7oVar = null;
                } else {
                    kVar.getClass();
                    t7oVar = new PlusPayPresale(offer2, j, b(tariffOffer, map));
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(t7oVar);
                if (a != null) {
                    return t7oVar;
                }
                if (a instanceof g) {
                    bVar.g(com.yandex.plus.pay.common.internal.log.a.i, a.getMessage(), a);
                    return null;
                }
                com.yandex.plus.pay.log.impl.b.f(bVar, com.yandex.plus.pay.common.internal.log.a.i, a.getMessage(), a, 8);
                throw r1.U(a);
            }
        }
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.m;
        nm6 nm6Var2 = nm6.a;
        i = hVar.o;
        com.yandex.plus.pay.log.impl.b bVar2 = this.c;
        if (i != 0) {
        }
        offer2 = (PlusPayCompositeOffers.Offer) CollectionsKt.firstOrNull(((PlusPayCompositeOffers) obj2).getOffers());
        if (offer2 != null) {
        }
        t7oVar = null;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(t7oVar);
        if (a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
    
        if (r14 == r8) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, cg6 cg6Var) {
        i iVar;
        int i;
        String str3;
        Throwable th;
        xqn xqnVar;
        String str4;
        wis wisVar;
        Object t7oVar;
        Throwable a;
        try {
            if (cg6Var instanceof i) {
                iVar = (i) cg6Var;
                int i2 = iVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iVar.n = i2 - Integer.MIN_VALUE;
                    i iVar2 = iVar;
                    Object obj = iVar2.l;
                    Object obj2 = nm6.a;
                    i = iVar2.n;
                    if (i != 0) {
                        xqn i3 = hrg.i(obj);
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.graphql.offers.j jVar = this.a;
                            com.yandex.plus.pay.internal.feature.offers.k[] kVarArr = com.yandex.plus.pay.internal.feature.offers.k.a;
                            iVar2.j = str2;
                            iVar2.k = i3;
                            iVar2.n = 1;
                            str3 = str2;
                            try {
                                Object b = jVar.b(str, "checkout_presale", str3, null, true, iVar2);
                                if (b != obj2) {
                                    obj = b;
                                    xqnVar = i3;
                                    str4 = str3;
                                }
                            } catch (wis e) {
                                e = e;
                                wisVar = e;
                                xqnVar = i3;
                                str4 = str3;
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new t7o(wisVar);
                                obj = t7oVar;
                                a = z7o.a(obj);
                                if (a == null) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                xqnVar = i3;
                                str4 = str3;
                                r7o r7oVar3 = z7o.b;
                                t7oVar = new t7o(th);
                                obj = t7oVar;
                                a = z7o.a(obj);
                                if (a == null) {
                                }
                            }
                        } catch (wis e2) {
                            e = e2;
                            str3 = str2;
                        } catch (Throwable th3) {
                            th = th3;
                            str3 = str2;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xqnVar = iVar2.k;
                        qgg.h0(obj);
                        PlusPayCompositeOffers plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        ((com.yandex.plus.pay.internal.analytics.evgen.b) this.d).d(plusPayCompositeOffers, new com.yandex.plus.pay.api.analytics.c(null, null, null, null, null, new LinkedHashMap()));
                        if (xqnVar.a == null && plusPayCompositeOffers.getOffers().isEmpty()) {
                            xqnVar.a = com.yandex.plus.pay.internal.analytics.tarifficator.b.b;
                        }
                        t tVar = (t) this.e;
                        tVar.a(plusPayCompositeOffers);
                        com.yandex.plus.pay.internal.analytics.tarifficator.c cVar = (com.yandex.plus.pay.internal.analytics.tarifficator.c) xqnVar.a;
                        if (cVar != null) {
                            tVar.getClass();
                            tVar.a.c(plusPayCompositeOffers.getSessionId(), onb.Default, plusPayCompositeOffers.getTarget(), cVar.a);
                        }
                        return plusPayCompositeOffers;
                    }
                    xqnVar = iVar2.k;
                    str4 = iVar2.j;
                    try {
                        qgg.h0(obj);
                    } catch (wis e3) {
                        wisVar = e3;
                        r7o r7oVar22 = z7o.b;
                        t7oVar = new t7o(wisVar);
                        obj = t7oVar;
                        a = z7o.a(obj);
                        if (a == null) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r7o r7oVar32 = z7o.b;
                        t7oVar = new t7o(th);
                        obj = t7oVar;
                        a = z7o.a(obj);
                        if (a == null) {
                        }
                    }
                    r7o r7oVar4 = z7o.b;
                    a = z7o.a(obj);
                    if (a == null) {
                        com.yandex.plus.pay.log.impl.b.f(this.c, com.yandex.plus.pay.common.internal.log.a.i, "Error when receiving presale offers.", a, 8);
                        throw r1.U(a);
                    }
                    PlusPayCompositeOffers d = ((com.yandex.plus.pay.internal.model.mappers.c) this.f.getValue()).d(str4, ((s) obj).a());
                    if (d.getOffers().isEmpty()) {
                        xqnVar.a = com.yandex.plus.pay.internal.analytics.tarifficator.a.b;
                    }
                    iVar2.j = null;
                    iVar2.k = xqnVar;
                    iVar2.n = 2;
                    obj = f(d, iVar2);
                }
            }
            if (i != 0) {
            }
            r7o r7oVar42 = z7o.b;
            a = z7o.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        iVar = new i(this, cg6Var);
        i iVar22 = iVar;
        Object obj3 = iVar22.l;
        Object obj22 = nm6.a;
        i = iVar22.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0057 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PlusPayCompositeOffers plusPayCompositeOffers, cg6 cg6Var) {
        j jVar;
        int i;
        Iterator it;
        int i2;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i3 = jVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.n = i3 - Integer.MIN_VALUE;
                Object obj = jVar.l;
                nm6 nm6Var = nm6.a;
                i = jVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    it = this.b.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = jVar.k;
                    Iterator it2 = jVar.j;
                    qgg.h0(obj);
                    Iterator it3 = it2;
                    i2 = i4;
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    it = it3;
                    if (it.hasNext()) {
                        com.yandex.plus.pay.internal.feature.offers.post.a aVar = (com.yandex.plus.pay.internal.feature.offers.post.a) it.next();
                        jVar.j = it;
                        jVar.k = i2;
                        jVar.n = 1;
                        Object a = aVar.a(plusPayCompositeOffers, jVar);
                        if (a == nm6Var) {
                            return nm6Var;
                        }
                        Iterator it4 = it;
                        obj = a;
                        i4 = i2;
                        it2 = it4;
                        Iterator it32 = it2;
                        i2 = i4;
                        plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        it = it32;
                        if (it.hasNext()) {
                            return plusPayCompositeOffers;
                        }
                    }
                }
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.l;
        nm6 nm6Var2 = nm6.a;
        i = jVar.n;
        if (i != 0) {
        }
    }
}

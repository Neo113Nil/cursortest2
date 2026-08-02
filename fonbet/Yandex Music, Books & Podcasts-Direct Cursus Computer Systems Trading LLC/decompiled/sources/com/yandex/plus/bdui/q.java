package com.yandex.plus.bdui;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.f2;
import com.yandex.plus.core.templating.render.c0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.n0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p0;
import com.yandex.plus.pay.adapter.api.e0;
import com.yandex.plus.pay.adapter.internal.d0;
import com.yandex.plus.pay.adapter.internal.h1;
import com.yandex.plus.pay.adapter.internal.y0;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.b6e;
import defpackage.bnb;
import defpackage.c4f;
import defpackage.cnb;
import defpackage.dnb;
import defpackage.e5b;
import defpackage.ern;
import defpackage.eta;
import defpackage.ezc;
import defpackage.jyr;
import defpackage.ldi;
import defpackage.lm4;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ome;
import defpackage.pkr;
import defpackage.q5f;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.uah;
import defpackage.v6f;
import defpackage.w4f;
import defpackage.wct;
import defpackage.x4f;
import defpackage.x97;
import defpackage.z7o;
import defpackage.zmb;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class q extends ezc implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [ezc, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f, com.yandex.plus.pay.adapter.api.j, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [ezc, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ezc, kotlin.jvm.functions.Function1] */
    private final Object h(Object obj, Object obj2) {
        ?? r13;
        k0 k0Var;
        com.yandex.plus.pay.adapter.internal.i iVar;
        String str;
        String str2;
        Pair pair;
        com.yandex.plus.pay.adapter.api.g gVar;
        com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar;
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e eVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e) obj;
        Continuation continuation = (Continuation) obj2;
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.c) this.receiver;
        if (eVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.a) {
            com.yandex.plus.bdui.plus.content.controller.f fVar = cVar.c;
            com.yandex.plus.home.feature.webviews.internal.purchase.button.section.a aVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.a) eVar;
            Object a = ((com.yandex.plus.acquisition.adapter.internal.processor.b) fVar.b).a(aVar.b, aVar.c, aVar.d, eta.e(), aVar.e, ((com.yandex.plus.bdui.plus.content.controller.f) fVar.c).f(), continuation);
            nm6 nm6Var = nm6.a;
            if (a != nm6Var) {
                a = Unit.a;
            }
            return a == nm6Var ? a : Unit.a;
        }
        Continuation continuation2 = null;
        if (eVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c) {
            com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar2 = cVar.d;
            com.yandex.plus.acquisition.sdk.common.api.di.b bVar2 = cVar2.b;
            com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c cVar3 = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c) eVar;
            com.yandex.plus.home.repository.api.model.webconfig.a0 a0Var = cVar3.b;
            boolean z = cVar2.e;
            ?? r5 = (ezc) bVar2.g;
            int ordinal = a0Var.c.d.ordinal();
            if (ordinal == 0) {
                k0Var = k0.d;
            } else if (ordinal == 1) {
                k0Var = k0.c;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                k0Var = k0.e;
            }
            com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a aVar2 = cVar3.c;
            if (aVar2 != null) {
                String str3 = aVar2.c;
                com.yandex.plus.pay.adapter.api.j jVar = aVar2.a;
                boolean z2 = aVar2.b;
                ?? r14 = cVar2.f;
                com.yandex.plus.pay.adapter.internal.i iVar2 = (com.yandex.plus.pay.adapter.internal.i) jVar;
                jyr jyrVar = iVar2.d;
                jyr jyrVar2 = iVar2.e;
                boolean z3 = ((com.yandex.plus.pay.adapter.internal.l) ((e0) ((d0) ((com.yandex.plus.pay.adapter.api.c) CollectionsKt.Q((List) jyrVar.getValue()))).b.getValue())).a.getAmount().compareTo(BigDecimal.ZERO) == 0;
                com.yandex.plus.pay.adapter.api.b bVar3 = (com.yandex.plus.pay.adapter.api.b) jyrVar2.getValue();
                if (bVar3 != null) {
                    str = ((com.yandex.plus.pay.adapter.internal.d) bVar3).a.getButtonText();
                    iVar = iVar2;
                } else {
                    iVar = iVar2;
                    str = null;
                }
                com.yandex.plus.pay.adapter.api.b bVar4 = (com.yandex.plus.pay.adapter.api.b) jyrVar2.getValue();
                String buttonTextWithDetails = bVar4 != null ? ((com.yandex.plus.pay.adapter.internal.d) bVar4).a.getButtonTextWithDetails() : null;
                com.yandex.plus.pay.adapter.api.h e = iVar.e();
                if (e != null) {
                    PlusPayCompositeOffers.Offer.Tariff tariff = ((h1) e).a;
                    str2 = str3;
                    pair = new Pair(tariff.getText(), tariff.getAdditionalText());
                } else {
                    str2 = str3;
                    y0 y0Var = (y0) ((com.yandex.plus.pay.adapter.api.e) CollectionsKt.Q(iVar.d()));
                    pair = new Pair(y0Var.a.getText(), y0Var.a.getAdditionalText());
                }
                String str4 = (String) pair.a;
                String str5 = (String) pair.b;
                if (buttonTextWithDetails == null) {
                    buttonTextWithDetails = str5;
                }
                com.yandex.plus.pay.adapter.internal.i iVar3 = iVar;
                r14.invoke(new com.yandex.plus.home.feature.webviews.internal.purchase.pay.common.a(a0Var, str4, buttonTextWithDetails, str, z3, z2 || z));
                k0 k0Var2 = k0Var;
                String str6 = str2;
                com.yandex.plus.acquisition.sdk.common.api.di.b.f(bVar2, str6, k0Var2, i0.b, null, 8);
                if (z2) {
                    str6.getClass();
                    int i = com.yandex.plus.pay.adapter.internal.m.a[iVar3.a.getStructureType().ordinal()];
                    if (i == 1) {
                        gVar = com.yandex.plus.pay.adapter.api.g.a;
                    } else if (i == 2) {
                        gVar = com.yandex.plus.pay.adapter.api.g.b;
                    } else {
                        if (i != 3) {
                            b6e.s();
                            return null;
                        }
                        gVar = com.yandex.plus.pay.adapter.api.g.c;
                    }
                    int ordinal2 = gVar.ordinal();
                    if (ordinal2 == 0) {
                        bVar = com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b.d;
                    } else if (ordinal2 == 1) {
                        bVar = com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b.c;
                    } else {
                        if (ordinal2 != 2) {
                            b6e.s();
                            return null;
                        }
                        bVar = com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b.b;
                    }
                    r5.invoke(new h0(str6, k0Var2, bVar));
                } else {
                    x97.y(cVar2.a, null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.a(cVar2, jVar, continuation2, 1), 3);
                    bVar2.a(a0Var, jVar, null, null);
                    if (z) {
                        str6.getClass();
                        n0 n0Var = o0.Companion;
                        r5.invoke(new p0(str6, k0Var2));
                    }
                }
                if (cVar2.d.c() && (z2 || z)) {
                    cVar2.a(str6, a0Var, jVar);
                }
            } else {
                com.yandex.plus.acquisition.sdk.common.api.di.b.f(bVar2, null, k0Var, i0.c, cVar3.a.s(), 1);
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.a aVar3 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.a.a;
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.c cVar4 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.c.a;
                com.yandex.plus.home.analytics.payment.c cVar5 = (com.yandex.plus.home.analytics.payment.c) bVar2.f;
                cVar5.getClass();
                dnb dnbVar = cVar5.a;
                cnb cnbVar = cVar5.b;
                zmb b = com.yandex.plus.home.analytics.payment.c.b(aVar3);
                bnb c = com.yandex.plus.home.analytics.payment.c.c(cVar4);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                dnbVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("webview_type", cnbVar.a);
                linkedHashMap.put("additional_params", e5bVar);
                linkedHashMap.put("button_type", b.a);
                linkedHashMap.put("payment_type", c.a);
                linkedHashMap.put("_meta", dnb.b(new HashMap()));
                dnbVar.c("Error.WebView.BuySubscription.Button.Loading.Products", linkedHashMap);
            }
        } else {
            if (!(eVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.b)) {
                cVar.getClass();
                b6e.s();
                return null;
            }
            com.yandex.passport.internal.flags.experiments.p pVar = cVar.e;
            com.yandex.plus.acquisition.sdk.common.api.di.b bVar5 = (com.yandex.plus.acquisition.sdk.common.api.di.b) pVar.c;
            com.yandex.plus.home.feature.webviews.internal.purchase.button.section.b bVar6 = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.b) eVar;
            com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a aVar4 = bVar6.c;
            if (aVar4 != null) {
                r13 = 0;
                x97.y((mm6) pVar.b, null, null, new com.yandex.plus.bdui.ui.b(pVar, aVar4, 0 == true ? 1 : 0, 22), 3);
            } else {
                r13 = 0;
            }
            bVar5.a(bVar6.b, r13, r13, r13);
            com.yandex.plus.acquisition.sdk.common.api.di.b.f(bVar5, null, k0.b, i0.b, null, 8);
            ((ezc) pVar.d).invoke();
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0bcb  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Function1 function1;
        Function1 mVar;
        Function1 function12;
        Function1 hVar;
        com.yandex.plus.bdui.plus.content.serializer.h hVar2;
        com.yandex.plus.bdui.plus.content.serializer.h hVar3;
        com.yandex.plus.bdui.plus.content.serializer.m mVar2;
        com.yandex.plus.bdui.plus.content.serializer.m mVar3;
        Class cls;
        Object t7oVar;
        com.yandex.plus.bdui.plus.content.serializer.h hVar4;
        com.yandex.plus.bdui.plus.content.serializer.h hVar5;
        boolean z;
        int i = this.a;
        Class cls2 = Character.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Short.TYPE;
        Class cls7 = Byte.TYPE;
        Class cls8 = Boolean.TYPE;
        Class cls9 = Integer.TYPE;
        Continuation continuation = null;
        switch (i) {
            case 0:
                com.yandex.plus.bdui.flex.utils.b bVar = (com.yandex.plus.bdui.flex.utils.b) obj;
                ldi ldiVar = (ldi) obj2;
                bVar.getClass();
                ldiVar.getClass();
                com.yandex.plus.bdui.flex.action.d dVar = (com.yandex.plus.bdui.flex.action.d) this.receiver;
                dVar.getClass();
                return (com.yandex.plus.bdui.action.c) r1.e(dVar.b, ldiVar, new com.yandex.passport.internal.ui.sloth.ebs.i(4, bVar, ldiVar, dVar));
            case 1:
                ((com.yandex.plus.bdui.content.d) obj).getClass();
                ((com.yandex.plus.bdui.content.d) obj2).getClass();
                ((com.yandex.plus.bdui.ui.a) this.receiver).getClass();
                return Boolean.valueOf(!Intrinsics.d(r0, r2));
            case 2:
                ((com.yandex.plus.bdui.scaffold.b) obj).getClass();
                ((com.yandex.plus.bdui.scaffold.b) obj2).getClass();
                ((com.yandex.plus.bdui.plus.scaffold.controller.e) this.receiver).getClass();
                return Boolean.valueOf(!Intrinsics.d(r0, r2));
            case 3:
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                str.getClass();
                com.yandex.plus.bdui.plus.checkout.content.controller.l lVar = (com.yandex.plus.bdui.plus.checkout.content.controller.l) this.receiver;
                com.yandex.plus.log.api.b bVar2 = lVar.i;
                com.yandex.plus.bdui.content.d dVar2 = lVar.l;
                if (dVar2 != null) {
                    com.yandex.plus.bdui.content.a aVar = dVar2.b;
                    Map e = uah.e(new Pair("additionalOfferChangeSelectionName", str), new Pair("additionalOfferChangeSelectionValue", bool));
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar2)) {
                        bVar2.c(aVar2, "PlusPayCheckoutContentController", "onOnsaleSelectedChanged(); dispatch action = " + ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar)).q + " with payload = " + e);
                    }
                    lVar.e(dVar2, ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar)).q, e);
                } else {
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                    if (bVar2.b(aVar3)) {
                        bVar2.c(aVar3, "PlusPayCheckoutContentController", "onOnsaleSelectedChanged(); update is null!");
                    }
                }
                return Unit.a;
            case 4:
                String str2 = (String) obj;
                w4f w4fVar = (w4f) obj2;
                str2.getClass();
                w4fVar.getClass();
                com.yandex.plus.bdui.plus.content.serializer.q qVar = (com.yandex.plus.bdui.plus.content.serializer.q) this.receiver;
                qVar.getClass();
                v6f v6fVar = w4fVar instanceof v6f ? (v6f) w4fVar : null;
                if (v6fVar == null) {
                    return null;
                }
                ome omeVar = x4f.a;
                Boolean b = pkr.b(v6fVar.a());
                if (b != null) {
                    return new com.yandex.plus.bdui.plus.content.serializer.c(str2, b.booleanValue());
                }
                com.yandex.plus.core.templating.parser.b bVar3 = qVar.a;
                String a = v6fVar.a();
                com.yandex.plus.log.api.b bVar4 = qVar.b;
                lm4 a2 = ern.a(Boolean.class);
                boolean equals = a2.equals(ern.a(cls8));
                com.yandex.plus.core.templating.template.a aVar4 = com.yandex.plus.core.templating.template.a.a;
                if (equals) {
                    mVar = new com.yandex.plus.bdui.plus.content.m(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 25);
                } else if (a2.equals(ern.a(cls7))) {
                    mVar = new com.yandex.plus.bdui.plus.content.m(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 26);
                } else if (a2.equals(ern.a(cls6))) {
                    mVar = new com.yandex.plus.bdui.plus.content.m(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 27);
                } else if (a2.equals(ern.a(cls9))) {
                    mVar = new com.yandex.plus.bdui.plus.content.m(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 28);
                } else if (a2.equals(ern.a(cls5))) {
                    mVar = new com.yandex.plus.bdui.plus.content.m(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 29);
                } else if (a2.equals(ern.a(BigInteger.class))) {
                    mVar = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 0);
                } else if (a2.equals(ern.a(cls4))) {
                    mVar = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 1);
                } else if (a2.equals(ern.a(cls3))) {
                    mVar = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 2);
                } else if (a2.equals(ern.a(BigDecimal.class))) {
                    mVar = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 3);
                } else if (a2.equals(ern.a(cls2))) {
                    mVar = new com.yandex.plus.bdui.plus.content.m(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 23);
                } else {
                    if (!a2.equals(ern.a(String.class))) {
                        function1 = null;
                        if (function1 == null) {
                            wct.o(1, function1);
                        } else {
                            function1 = null;
                        }
                        lm4 a3 = ern.a(Boolean.class);
                        Class b2 = a3.b();
                        b2.getClass();
                        return new com.yandex.plus.bdui.plus.content.serializer.i(str2, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a3, b2, ern.c(cls8)), bVar3, a, bVar4, function1));
                    }
                    mVar = new com.yandex.plus.bdui.plus.content.m(1, aVar4, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 24);
                }
                function1 = mVar;
                if (function1 == null) {
                }
                lm4 a32 = ern.a(Boolean.class);
                Class b22 = a32.b();
                b22.getClass();
                return new com.yandex.plus.bdui.plus.content.serializer.i(str2, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a32, b22, ern.c(cls8)), bVar3, a, bVar4, function1));
            case 5:
                String str3 = (String) obj;
                w4f w4fVar2 = (w4f) obj2;
                str3.getClass();
                w4fVar2.getClass();
                com.yandex.plus.bdui.plus.content.serializer.q qVar2 = (com.yandex.plus.bdui.plus.content.serializer.q) this.receiver;
                qVar2.getClass();
                v6f v6fVar2 = w4fVar2 instanceof v6f ? (v6f) w4fVar2 : null;
                if (v6fVar2 == null) {
                    return null;
                }
                Long h = x4f.h(v6fVar2);
                if (h != null) {
                    return new com.yandex.plus.bdui.plus.content.serializer.f(str3, h.longValue());
                }
                com.yandex.plus.core.templating.parser.b bVar5 = qVar2.a;
                String a4 = v6fVar2.a();
                com.yandex.plus.log.api.b bVar6 = qVar2.b;
                lm4 a5 = ern.a(Long.class);
                boolean equals2 = a5.equals(ern.a(cls8));
                com.yandex.plus.core.templating.template.a aVar5 = com.yandex.plus.core.templating.template.a.a;
                if (equals2) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 28);
                } else if (a5.equals(ern.a(cls7))) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 29);
                } else if (a5.equals(ern.a(cls6))) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 0);
                } else if (a5.equals(ern.a(cls9))) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 1);
                } else if (a5.equals(ern.a(cls5))) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 2);
                } else if (a5.equals(ern.a(BigInteger.class))) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 3);
                } else if (a5.equals(ern.a(cls4))) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 4);
                } else if (a5.equals(ern.a(cls3))) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 5);
                } else if (a5.equals(ern.a(BigDecimal.class))) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 6);
                } else if (a5.equals(ern.a(cls2))) {
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 26);
                } else {
                    if (!a5.equals(ern.a(String.class))) {
                        function12 = null;
                        if (function12 == null) {
                            wct.o(1, function12);
                        } else {
                            function12 = null;
                        }
                        lm4 a6 = ern.a(Long.class);
                        Class b3 = a6.b();
                        b3.getClass();
                        return new com.yandex.plus.bdui.plus.content.serializer.n(str3, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a6, b3, ern.c(cls5)), bVar5, a4, bVar6, function12));
                    }
                    hVar = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar5, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 27);
                }
                function12 = hVar;
                if (function12 == null) {
                }
                lm4 a62 = ern.a(Long.class);
                Class b32 = a62.b();
                b32.getClass();
                return new com.yandex.plus.bdui.plus.content.serializer.n(str3, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a62, b32, ern.c(cls5)), bVar5, a4, bVar6, function12));
            case 6:
                String str4 = (String) obj;
                w4f w4fVar3 = (w4f) obj2;
                str4.getClass();
                w4fVar3.getClass();
                com.yandex.plus.bdui.plus.content.serializer.q qVar3 = (com.yandex.plus.bdui.plus.content.serializer.q) this.receiver;
                qVar3.getClass();
                v6f v6fVar3 = w4fVar3 instanceof v6f ? (v6f) w4fVar3 : null;
                if (v6fVar3 == null) {
                    return null;
                }
                ome omeVar2 = x4f.a;
                Double h2 = kotlin.text.b.h(v6fVar3.a());
                if (h2 != null) {
                    return new com.yandex.plus.bdui.plus.content.serializer.e(str4, h2.doubleValue());
                }
                com.yandex.plus.core.templating.parser.b bVar7 = qVar3.a;
                String a7 = v6fVar3.a();
                com.yandex.plus.log.api.b bVar8 = qVar3.b;
                lm4 a8 = ern.a(Double.class);
                boolean equals3 = a8.equals(ern.a(cls8));
                com.yandex.plus.core.templating.template.a aVar6 = com.yandex.plus.core.templating.template.a.a;
                if (equals3) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 17);
                } else if (a8.equals(ern.a(cls7))) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 18);
                } else if (a8.equals(ern.a(cls6))) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 19);
                } else if (a8.equals(ern.a(cls9))) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 20);
                } else if (a8.equals(ern.a(cls5))) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 21);
                } else if (a8.equals(ern.a(BigInteger.class))) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 22);
                } else if (a8.equals(ern.a(cls4))) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 23);
                } else if (a8.equals(ern.a(cls3))) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 24);
                } else if (a8.equals(ern.a(BigDecimal.class))) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 25);
                } else if (a8.equals(ern.a(cls2))) {
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 15);
                } else {
                    if (!a8.equals(ern.a(String.class))) {
                        hVar2 = null;
                        if (hVar2 == null) {
                            wct.o(1, hVar2);
                        } else {
                            hVar2 = null;
                        }
                        lm4 a9 = ern.a(Double.class);
                        Class b4 = a9.b();
                        b4.getClass();
                        return new com.yandex.plus.bdui.plus.content.serializer.l(str4, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a9, b4, ern.c(cls3)), bVar7, a7, bVar8, hVar2));
                    }
                    hVar3 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar6, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 16);
                }
                hVar2 = hVar3;
                if (hVar2 == null) {
                }
                lm4 a92 = ern.a(Double.class);
                Class b42 = a92.b();
                b42.getClass();
                return new com.yandex.plus.bdui.plus.content.serializer.l(str4, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a92, b42, ern.c(cls3)), bVar7, a7, bVar8, hVar2));
            case 7:
                String str5 = (String) obj;
                w4f w4fVar4 = (w4f) obj2;
                str5.getClass();
                w4fVar4.getClass();
                com.yandex.plus.bdui.plus.content.serializer.q qVar4 = (com.yandex.plus.bdui.plus.content.serializer.q) this.receiver;
                qVar4.getClass();
                v6f v6fVar4 = w4fVar4 instanceof v6f ? (v6f) w4fVar4 : null;
                if (v6fVar4 == null) {
                    return null;
                }
                com.yandex.plus.core.templating.parser.b bVar9 = qVar4.a;
                String a10 = v6fVar4.a();
                com.yandex.plus.log.api.b bVar10 = qVar4.b;
                lm4 a11 = ern.a(String.class);
                boolean equals4 = a11.equals(ern.a(cls8));
                com.yandex.plus.core.templating.template.a aVar7 = com.yandex.plus.core.templating.template.a.a;
                if (equals4) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 9);
                } else if (a11.equals(ern.a(cls7))) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 10);
                } else if (a11.equals(ern.a(cls6))) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 11);
                } else if (a11.equals(ern.a(cls9))) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 12);
                } else if (a11.equals(ern.a(cls5))) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 13);
                } else if (a11.equals(ern.a(BigInteger.class))) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 14);
                } else if (a11.equals(ern.a(cls4))) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 15);
                } else if (a11.equals(ern.a(cls3))) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 16);
                } else if (a11.equals(ern.a(BigDecimal.class))) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 17);
                } else if (a11.equals(ern.a(cls2))) {
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 7);
                } else {
                    if (!a11.equals(ern.a(String.class))) {
                        mVar2 = null;
                        if (mVar2 == null) {
                            wct.o(1, mVar2);
                        } else {
                            mVar2 = null;
                        }
                        lm4 a12 = ern.a(String.class);
                        Class b5 = a12.b();
                        b5.getClass();
                        return new com.yandex.plus.bdui.plus.content.serializer.o(str5, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a12, b5, ern.c(String.class)), bVar9, a10, bVar10, mVar2));
                    }
                    mVar3 = new com.yandex.plus.bdui.plus.content.serializer.m(1, aVar7, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 8);
                }
                mVar2 = mVar3;
                if (mVar2 == null) {
                }
                lm4 a122 = ern.a(String.class);
                Class b52 = a122.b();
                b52.getClass();
                return new com.yandex.plus.bdui.plus.content.serializer.o(str5, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a122, b52, ern.c(String.class)), bVar9, a10, bVar10, mVar2));
            case 8:
                String str6 = (String) obj;
                w4f w4fVar5 = (w4f) obj2;
                str6.getClass();
                w4fVar5.getClass();
                com.yandex.plus.bdui.plus.content.serializer.q qVar5 = (com.yandex.plus.bdui.plus.content.serializer.q) this.receiver;
                qVar5.getClass();
                c4f c4fVar = w4fVar5 instanceof c4f ? (c4f) w4fVar5 : null;
                if (c4fVar == null) {
                    return null;
                }
                return new com.yandex.plus.bdui.plus.content.serializer.g(str6, new com.yandex.plus.core.templating.template.k(new com.yandex.plus.core.templating.render.c((com.yandex.plus.core.templating.render.n) qVar5.d.getValue(), (com.yandex.plus.core.templating.render.e) qVar5.e.getValue(), c4fVar, qVar5.b, "JsonArrayRenderableAdapter", "JsonArray")));
            case 9:
                String str7 = (String) obj;
                w4f w4fVar6 = (w4f) obj2;
                str7.getClass();
                w4fVar6.getClass();
                com.yandex.plus.bdui.plus.content.serializer.q qVar6 = (com.yandex.plus.bdui.plus.content.serializer.q) this.receiver;
                qVar6.getClass();
                q5f q5fVar = w4fVar6 instanceof q5f ? (q5f) w4fVar6 : null;
                if (q5fVar == null) {
                    return null;
                }
                return new com.yandex.plus.bdui.plus.content.serializer.k(str7, new com.yandex.plus.core.templating.template.k(new com.yandex.plus.core.templating.render.c((com.yandex.plus.core.templating.render.n) qVar6.d.getValue(), (com.yandex.plus.core.templating.render.f) qVar6.f.getValue(), q5fVar, qVar6.b, "JsonObjectRenderableAdapter", "JsonObject")));
            case 10:
                String str8 = (String) obj;
                w4f w4fVar7 = (w4f) obj2;
                str8.getClass();
                w4fVar7.getClass();
                com.yandex.plus.bdui.plus.content.serializer.q qVar7 = (com.yandex.plus.bdui.plus.content.serializer.q) this.receiver;
                qVar7.getClass();
                v6f v6fVar5 = w4fVar7 instanceof v6f ? (v6f) w4fVar7 : null;
                if (v6fVar5 == null) {
                    return null;
                }
                Integer e2 = x4f.e(v6fVar5);
                if (e2 != null) {
                    return new com.yandex.plus.bdui.plus.content.serializer.d(str8, e2.intValue());
                }
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = com.yandex.plus.bdui.flex.ui.a.A(v6fVar5.a());
                    cls = String.class;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    cls = String.class;
                    t7oVar = new t7o(th);
                }
                if (t7oVar instanceof t7o) {
                    t7oVar = null;
                }
                Integer num = (Integer) t7oVar;
                if (num != null) {
                    return new com.yandex.plus.bdui.plus.content.serializer.d(str8, num.intValue());
                }
                com.yandex.plus.core.templating.parser.b bVar11 = qVar7.a;
                String a13 = v6fVar5.a();
                com.yandex.plus.log.api.b bVar12 = qVar7.b;
                lm4 a14 = ern.a(Integer.class);
                boolean equals5 = a14.equals(ern.a(cls8));
                com.yandex.plus.core.templating.template.a aVar8 = com.yandex.plus.core.templating.template.a.a;
                if (equals5) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 6);
                } else if (a14.equals(ern.a(cls7))) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 7);
                } else if (a14.equals(ern.a(cls6))) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 8);
                } else if (a14.equals(ern.a(cls9))) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 9);
                } else if (a14.equals(ern.a(cls5))) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 10);
                } else if (a14.equals(ern.a(BigInteger.class))) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 11);
                } else if (a14.equals(ern.a(cls4))) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 12);
                } else if (a14.equals(ern.a(cls3))) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 13);
                } else if (a14.equals(ern.a(BigDecimal.class))) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 14);
                } else if (a14.equals(ern.a(cls2))) {
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 4);
                } else {
                    if (!a14.equals(ern.a(cls))) {
                        hVar4 = null;
                        if (hVar4 == null) {
                            wct.o(1, hVar4);
                        } else {
                            hVar4 = null;
                        }
                        lm4 a15 = ern.a(Integer.class);
                        Class b6 = a15.b();
                        b6.getClass();
                        return new com.yandex.plus.bdui.plus.content.serializer.j(str8, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a15, b6, ern.c(cls9)), bVar11, a13, bVar12, hVar4));
                    }
                    hVar5 = new com.yandex.plus.bdui.plus.content.serializer.h(1, aVar8, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 5);
                }
                hVar4 = hVar5;
                if (hVar4 == null) {
                }
                lm4 a152 = ern.a(Integer.class);
                Class b62 = a152.b();
                b62.getClass();
                return new com.yandex.plus.bdui.plus.content.serializer.j(str8, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a152, b62, ern.c(cls9)), bVar11, a13, bVar12, hVar4));
            case 11:
                String str9 = (String) obj;
                w4f w4fVar8 = (w4f) obj2;
                str9.getClass();
                w4fVar8.getClass();
                com.yandex.plus.bdui.plus.content.serializer.q qVar8 = (com.yandex.plus.bdui.plus.content.serializer.q) this.receiver;
                qVar8.getClass();
                v6f v6fVar6 = w4fVar8 instanceof v6f ? (v6f) w4fVar8 : null;
                if (v6fVar6 == null) {
                    return null;
                }
                return new com.yandex.plus.bdui.plus.content.serializer.p(str9, new com.yandex.plus.core.templating.template.k(new com.yandex.plus.core.templating.render.c((com.yandex.plus.core.templating.render.b0) qVar8.g.getValue(), (c0) qVar8.h.getValue(), Uri.parse(v6fVar6.a()), qVar8.b, "UriRenderableAdapter", "Uri")));
            case 12:
                ((Function1) this.receiver).invoke((com.yandex.plus.core.data.pay.l) obj);
                return Unit.a;
            case 13:
                return ((com.yandex.plus.core.network.okhttp.interceptor.f) this.receiver).b((com.yandex.plus.core.network.interceptor.e) obj, (Continuation) obj2);
            case 14:
                return ((com.yandex.plus.core.network.okhttp.interceptor.f) this.receiver).c((com.yandex.plus.core.network.interceptor.e) obj, (Continuation) obj2);
            case 15:
                return ((com.yandex.plus.core.network.okhttp.interceptor.f) this.receiver).d((com.yandex.plus.core.network.interceptor.e) obj, (Continuation) obj2);
            case 16:
                Throwable th2 = (Throwable) obj;
                com.yandex.plus.core.network.error.k kVar = (com.yandex.plus.core.network.error.k) obj2;
                th2.getClass();
                kVar.getClass();
                return ((com.yandex.plus.core.network.okhttp.error.a) ((com.yandex.plus.core.network.error.b) this.receiver)).a(kVar, th2);
            case 17:
                Throwable th3 = (Throwable) obj;
                com.yandex.plus.core.network.error.k kVar2 = (com.yandex.plus.core.network.error.k) obj2;
                th3.getClass();
                kVar2.getClass();
                return ((com.yandex.plus.core.network.okhttp.error.a) ((com.yandex.plus.core.network.error.b) this.receiver)).a(kVar2, th3);
            case 18:
                Throwable th4 = (Throwable) obj;
                com.yandex.plus.core.network.error.k kVar3 = (com.yandex.plus.core.network.error.k) obj2;
                th4.getClass();
                kVar3.getClass();
                return ((com.yandex.plus.core.network.okhttp.error.a) ((com.yandex.plus.core.network.error.b) this.receiver)).a(kVar3, th4);
            case 19:
                return com.yandex.plus.domain.auth.impl.i.a((com.yandex.plus.domain.auth.impl.i) this.receiver, (Long) obj, (Continuation) obj2);
            case 20:
                com.yandex.plus.core.benchmark.l lVar2 = (com.yandex.plus.core.benchmark.l) obj;
                lVar2.getClass();
                ((com.yandex.plus.home.benchmark.d) this.receiver).c(lVar2, (Map) obj2);
                return Unit.a;
            case 21:
                com.yandex.plus.core.benchmark.l lVar3 = (com.yandex.plus.core.benchmark.l) obj;
                lVar3.getClass();
                ((com.yandex.plus.home.benchmark.d) this.receiver).c(lVar3, (Map) obj2);
                return Unit.a;
            case 22:
                com.yandex.plus.core.benchmark.l lVar4 = (com.yandex.plus.core.benchmark.l) obj;
                lVar4.getClass();
                ((com.yandex.plus.home.benchmark.d) this.receiver).c(lVar4, (Map) obj2);
                return Unit.a;
            case 23:
                com.yandex.plus.home.repository.api.model.panel.d0 d0Var = (com.yandex.plus.home.repository.api.model.panel.d0) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                com.yandex.plus.home.feature.panel.internal.f fVar = (com.yandex.plus.home.feature.panel.internal.f) this.receiver;
                fVar.getClass();
                com.yandex.plus.core.analytics.logging.b bVar13 = com.yandex.plus.core.analytics.logging.b.a;
                com.yandex.plus.core.analytics.logging.e.f("onFamilyShortcutClick action=" + d0Var + " share=" + booleanValue);
                if (booleanValue) {
                    tf6 tf6Var = fVar.l;
                    if (tf6Var != null) {
                        x97.y(tf6Var, null, null, new com.yandex.plus.home.feature.panel.internal.c(fVar, d0Var, continuation, 0), 3);
                    }
                } else {
                    fVar.b(d0Var);
                }
                return Unit.a;
            case 24:
                com.yandex.plus.ui.core.theme.a aVar9 = (com.yandex.plus.ui.core.theme.a) obj;
                Continuation continuation2 = (Continuation) obj2;
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m mVar4 = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m) this.receiver;
                com.yandex.plus.log.api.b bVar14 = mVar4.k;
                com.yandex.plus.log.api.a aVar10 = com.yandex.plus.log.api.a.b;
                if (bVar14.b(aVar10)) {
                    bVar14.c(aVar10, "PlusDailyViewController", "onThemeChanged() theme=" + aVar9);
                }
                com.yandex.plus.core.theme.e eVar = mVar4.e;
                Context context = ((View) mVar4.b).getContext();
                context.getClass();
                mVar4.p = eVar.a(context, aVar9);
                Object Q = mVar4.Q(continuation2);
                return Q == nm6.a ? Q : Unit.a;
            case 25:
                Collection collection = (Collection) obj;
                Function1 function13 = (Function1) obj2;
                collection.getClass();
                function13.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.container.t) ((com.yandex.plus.home.feature.webviews.internal.container.u) this.receiver)).q(collection, function13);
                return Unit.a;
            case 26:
                com.yandex.plus.webview.core.resource.c cVar = (com.yandex.plus.webview.core.resource.c) obj2;
                ((com.yandex.plus.webview.core.d) obj).getClass();
                cVar.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.g gVar = (com.yandex.plus.home.feature.webviews.internal.home.g) this.receiver;
                gVar.getClass();
                return Boolean.valueOf(gVar.F0.g(cVar));
            case 27:
                return h(obj, obj2);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Collection collection2 = (Collection) obj;
                Function1 function14 = (Function1) obj2;
                collection2.getClass();
                function14.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.container.t) ((com.yandex.plus.home.feature.webviews.internal.container.u) this.receiver)).q(collection2, function14);
                return Unit.a;
            default:
                com.yandex.plus.webview.core.resource.c cVar2 = (com.yandex.plus.webview.core.resource.c) obj2;
                ((com.yandex.plus.webview.core.d) obj).getClass();
                cVar2.getClass();
                com.yandex.plus.home.feature.webviews.internal.simple.j jVar = (com.yandex.plus.home.feature.webviews.internal.simple.j) this.receiver;
                jVar.getClass();
                if (cVar2 instanceof com.yandex.plus.webview.core.resource.a) {
                    com.yandex.plus.webview.core.resource.a aVar11 = (com.yandex.plus.webview.core.resource.a) cVar2;
                    if (aVar11.c != com.yandex.plus.webview.core.resource.d.b) {
                        Object r = jVar.m.r(aVar11.a);
                        Throwable a16 = z7o.a(r);
                        if (a16 == null) {
                            com.yandex.plus.home.feature.webviews.internal.uri.j jVar2 = (com.yandex.plus.home.feature.webviews.internal.uri.j) r;
                            if ((jVar2 instanceof com.yandex.plus.home.feature.webviews.internal.uri.b) || (jVar2 instanceof com.yandex.plus.home.feature.webviews.internal.uri.f) || (jVar2 instanceof com.yandex.plus.home.feature.webviews.internal.uri.g) || (jVar2 instanceof com.yandex.plus.home.feature.webviews.internal.uri.a) || (jVar2 instanceof com.yandex.plus.home.feature.webviews.internal.uri.h) || (jVar2 instanceof com.yandex.plus.home.feature.webviews.internal.uri.c)) {
                                com.yandex.plus.home.feature.webviews.internal.container.u.b(jVar.l, jVar2, true, null, 60);
                            } else {
                                if (!(jVar2 instanceof com.yandex.plus.home.feature.webviews.internal.uri.e)) {
                                    b6e.s();
                                    return null;
                                }
                                x97.y(jVar.l(), null, null, new com.yandex.plus.bdui.ui.b((com.yandex.plus.home.feature.webviews.internal.uri.e) jVar2, jVar, continuation, 23), 3);
                            }
                        } else {
                            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, com.yandex.plus.core.analytics.logging.b.b, "handleUrlLoading(" + cVar2 + ") error", a16);
                        }
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                String uri = cVar2.getUri().toString();
                uri.getClass();
                jVar.u = uri;
                z = false;
                return Boolean.valueOf(z);
        }
    }
}

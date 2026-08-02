package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.plus.checkout.content.serializer.a2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.b2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.d2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.f2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.y1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.z1;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.CheckoutContentView;
import defpackage.ab8;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.gld;
import defpackage.ihp;
import defpackage.lcc;
import defpackage.lhc;
import defpackage.nm6;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.r0w;
import defpackage.s3f;
import defpackage.s9f;
import defpackage.tah;
import defpackage.tf6;
import defpackage.u75;
import defpackage.uah;
import defpackage.uop;
import defpackage.v75;
import defpackage.wz0;
import defpackage.xq0;
import defpackage.z75;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class l extends a {
    public final com.yandex.plus.core.imageloader.b b;
    public final com.yandex.plus.pay.ui.design.api.api.a c;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k d;
    public final com.yandex.plus.pay.ui.core.api.common.a e;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d f;
    public final com.yandex.plus.home.internal.di.y g;
    public final com.yandex.plus.bdui.plus.checkout.utils.a h;
    public final com.yandex.plus.log.api.b i;
    public final tf6 j;
    public com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j k;
    public com.yandex.plus.bdui.content.d l;
    public Boolean m;
    public LinkedHashMap n;
    public String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.yandex.plus.bdui.m mVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.pay.ui.design.api.api.a aVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar, com.yandex.plus.pay.ui.core.api.common.a aVar2, com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.d dVar, com.yandex.plus.home.internal.di.y yVar, com.yandex.plus.log.api.b bVar2) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        dVar.getClass();
        yVar.getClass();
        bVar2.getClass();
        this.b = bVar;
        this.c = aVar;
        this.d = kVar;
        this.e = aVar2;
        this.f = dVar;
        this.g = yVar;
        this.h = com.yandex.plus.bdui.plus.checkout.utils.a.a;
        this.i = bVar2;
        this.j = gld.B();
    }

    public static z1 g(com.yandex.passport.common.network.n nVar) {
        Object obj;
        Iterator it = ((ArrayList) nVar.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((z1) obj).h != null) {
                break;
            }
        }
        return (z1) obj;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        this.k = null;
        this.l = null;
        this.m = null;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        Context context = viewGroup.getContext();
        context.getClass();
        int i = 0;
        CheckoutContentView checkoutContentView = new CheckoutContentView(context, null, 0, 6, null);
        this.l = null;
        this.m = null;
        com.yandex.passport.internal.ui.challenge.vpn.c cVar = new com.yandex.passport.internal.ui.challenge.vpn.c(1, this, l.class, "onPaymentMethodClick", "onPaymentMethodClick(Ljava/lang/String;)V", i, 14);
        int i2 = 0;
        com.yandex.plus.bdui.flex.factory.d dVar = new com.yandex.plus.bdui.flex.factory.d(i2, this, l.class, "onPaymentButtonClick", "onPaymentButtonClick()V", i, 22);
        com.yandex.plus.bdui.flex.factory.d dVar2 = new com.yandex.plus.bdui.flex.factory.d(i2, this, l.class, "onCloseButtonClick", "onCloseButtonClick()V", i, 23);
        com.yandex.plus.bdui.flex.factory.d dVar3 = new com.yandex.plus.bdui.flex.factory.d(i2, this, l.class, "onLegalTextShown", "onLegalTextShown()V", i, 24);
        com.yandex.plus.bdui.q qVar = new com.yandex.plus.bdui.q(2, this, l.class, "onOnsaleSelectedChanged", "onOnsaleSelectedChanged(Ljava/lang/String;Z)V", i, 3);
        final int i3 = 0;
        final int i4 = 1;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j(checkoutContentView, cVar, new com.yandex.plus.bdui.flex.ui.content.c(16), new Function1(this) { // from class: com.yandex.plus.bdui.plus.checkout.content.controller.f
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.yandex.plus.bdui.plus.checkout.content.e eVar;
                com.yandex.passport.common.network.n nVar;
                z1 g;
                Boolean bool = (Boolean) obj;
                switch (i3) {
                    case 0:
                        boolean booleanValue = bool.booleanValue();
                        l lVar = this.b;
                        com.yandex.plus.log.api.b bVar = lVar.i;
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar)) {
                            bVar.c(aVar, "PlusPayCheckoutContentController", "onMailingAdsAgreementStatusChanged(); status = " + booleanValue);
                        }
                        lVar.m = bool;
                        break;
                    default:
                        bool.getClass();
                        l lVar2 = this.b;
                        com.yandex.plus.bdui.content.d dVar4 = lVar2.l;
                        if (dVar4 != null && (eVar = (com.yandex.plus.bdui.plus.checkout.content.e) dVar4.b) != null && (nVar = ((f2) eVar).k) != null && (g = l.g(nVar)) != null) {
                            String str = g.a;
                            com.yandex.plus.log.api.b bVar2 = lVar2.i;
                            com.yandex.plus.bdui.content.d dVar5 = lVar2.l;
                            if (dVar5 != null) {
                                com.yandex.plus.bdui.content.a aVar2 = dVar5.b;
                                Map e = uah.e(new Pair("additionalOfferChangeSelectionName", str), new Pair("additionalOfferChangeSelectionValue", bool));
                                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                                if (bVar2.b(aVar3)) {
                                    bVar2.c(aVar3, "PlusPayCheckoutContentController", "onOfferSwitchSelectedChanged(); dispatch action = " + ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar2)).p + " with payload = " + e);
                                }
                                lVar2.e(dVar5, ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar2)).p, e);
                            } else {
                                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                                if (bVar2.b(aVar4)) {
                                    bVar2.c(aVar4, "PlusPayCheckoutContentController", "onOfferSwitchSelectedChanged(); update is null!");
                                }
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }, dVar, dVar2, dVar3, qVar, new Function1(this) { // from class: com.yandex.plus.bdui.plus.checkout.content.controller.f
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.yandex.plus.bdui.plus.checkout.content.e eVar;
                com.yandex.passport.common.network.n nVar;
                z1 g;
                Boolean bool = (Boolean) obj;
                switch (i4) {
                    case 0:
                        boolean booleanValue = bool.booleanValue();
                        l lVar = this.b;
                        com.yandex.plus.log.api.b bVar = lVar.i;
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar)) {
                            bVar.c(aVar, "PlusPayCheckoutContentController", "onMailingAdsAgreementStatusChanged(); status = " + booleanValue);
                        }
                        lVar.m = bool;
                        break;
                    default:
                        bool.getClass();
                        l lVar2 = this.b;
                        com.yandex.plus.bdui.content.d dVar4 = lVar2.l;
                        if (dVar4 != null && (eVar = (com.yandex.plus.bdui.plus.checkout.content.e) dVar4.b) != null && (nVar = ((f2) eVar).k) != null && (g = l.g(nVar)) != null) {
                            String str = g.a;
                            com.yandex.plus.log.api.b bVar2 = lVar2.i;
                            com.yandex.plus.bdui.content.d dVar5 = lVar2.l;
                            if (dVar5 != null) {
                                com.yandex.plus.bdui.content.a aVar2 = dVar5.b;
                                Map e = uah.e(new Pair("additionalOfferChangeSelectionName", str), new Pair("additionalOfferChangeSelectionValue", bool));
                                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                                if (bVar2.b(aVar3)) {
                                    bVar2.c(aVar3, "PlusPayCheckoutContentController", "onOfferSwitchSelectedChanged(); dispatch action = " + ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar2)).p + " with payload = " + e);
                                }
                                lVar2.e(dVar5, ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar2)).p, e);
                            } else {
                                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                                if (bVar2.b(aVar4)) {
                                    bVar2.c(aVar4, "PlusPayCheckoutContentController", "onOfferSwitchSelectedChanged(); update is null!");
                                }
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }, this.b, this.c);
        this.k = jVar;
        com.yandex.plus.core.insets.d dVar4 = new com.yandex.plus.core.insets.d(0);
        g gVar = new g(0, jVar);
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar4.b.put(gVar, aVar);
        dVar4.b(checkoutContentView);
        return checkoutContentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.plus.bdui.ui.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        h hVar;
        int i;
        com.yandex.plus.log.api.b bVar;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar;
        Object i2;
        com.yandex.plus.log.api.a aVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i3 = hVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.n = i3 - Integer.MIN_VALUE;
                Object obj = hVar.l;
                Object obj2 = nm6.a;
                i = hVar.n;
                bVar = this.i;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = dVar.d;
                    com.yandex.plus.bdui.content.a aVar2 = dVar.b;
                    if (!z) {
                        jVar = this.k;
                        if (jVar != null) {
                            this.l = dVar;
                            com.yandex.plus.bdui.plus.checkout.content.e eVar = (com.yandex.plus.bdui.plus.checkout.content.e) aVar2;
                            f2 f2Var = (f2) eVar;
                            List list = f2Var.b;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                z75.t(arrayList, ((y1) it.next()).b);
                            }
                            int a = tah.a(v75.o(arrayList, 10));
                            if (a < 16) {
                                a = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                linkedHashMap.put(((b2) next).b, next);
                            }
                            this.n = linkedHashMap;
                            String str = f2Var.i;
                            if (str == null) {
                                b2 b2Var = (b2) CollectionsKt.firstOrNull(arrayList);
                                str = b2Var != null ? b2Var.b : null;
                            }
                            this.o = str;
                            hVar.j = dVar;
                            hVar.k = jVar;
                            hVar.n = 1;
                            i2 = i(eVar, str, hVar);
                            if (i2 == obj2) {
                                return obj2;
                            }
                        } else {
                            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                            if (bVar.b(aVar3)) {
                                bVar.c(aVar3, "PlusPayCheckoutContentController", "onUpdateStateAsync(); content view controller not found!");
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j jVar2 = hVar.k;
                com.yandex.plus.bdui.content.d dVar2 = hVar.j;
                qgg.h0(obj);
                jVar = jVar2;
                dVar = dVar2;
                i2 = obj;
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g gVar = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g) i2;
                aVar = com.yandex.plus.log.api.a.c;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusPayCheckoutContentController", "onUpdateStateAsync(); set checkout content = " + gVar);
                }
                jVar.h(gVar);
                com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d = a.d(((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) dVar.b)).h);
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "PlusPayCheckoutContentController", "onUpdateStateAsync(); apply toolbar state = " + d);
                }
                jVar.u.a(d);
                return Unit.a;
            }
        }
        hVar = new h(this, continuation);
        Object obj3 = hVar.l;
        Object obj22 = nm6.a;
        i = hVar.n;
        bVar = this.i;
        if (i != 0) {
        }
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g gVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g) i2;
        aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
        }
        jVar.h(gVar2);
        com.yandex.plus.pay.ui.core.mobile.view.toolbar.h d2 = a.d(((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) dVar.b)).h);
        if (bVar.b(aVar)) {
        }
        jVar.u.a(d2);
        return Unit.a;
    }

    public final void e(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.action.a aVar, Map map) {
        if (aVar != null) {
            this.a.a.a(aVar, new com.yandex.plus.bdui.action.h(dVar.c), map);
            return;
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
        com.yandex.plus.log.api.b bVar = this.i;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "PlusPayCheckoutContentController", "dispatchAction(); action is null!");
        }
    }

    public final LinkedHashMap f(String str, String str2) {
        this.h.getClass();
        Map b = com.yandex.plus.bdui.plus.checkout.utils.a.b(str);
        Map n = str2 != null ? dfi.n("selectedBoundPaymentMethodId", str2) : null;
        LinkedHashMap v = r1.v(new Pair("mailAgreementCheckboxValue", this.m));
        if (b == null) {
            b = e5b.a;
            b.getClass();
        }
        LinkedHashMap i = uah.i(v, b);
        if (n == null) {
            n = e5b.a;
            n.getClass();
        }
        return uah.i(i, n);
    }

    public final Object h(PlusPayRichText plusPayRichText, cg6 cg6Var) {
        return ((com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.h) this.f).a(plusPayRichText, new r0w(19, this), cg6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0422  */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Boolean, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v18, types: [c5b] */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Iterator, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.c] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.yandex.plus.bdui.plus.checkout.content.controller.l] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x03f6 -> B:87:0x041a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0540 -> B:68:0x0546). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x047a -> B:86:0x0487). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(com.yandex.plus.bdui.plus.checkout.content.e eVar, String str, cg6 cg6Var) {
        i iVar;
        int i;
        int i2;
        int i3;
        Set set;
        ArrayList arrayList;
        int i4;
        i iVar2;
        String str2;
        int i5;
        int i6;
        String str3;
        ArrayList arrayList2;
        Iterator it;
        com.yandex.plus.bdui.plus.checkout.content.e eVar2;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c cVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj;
        String str4;
        String str5;
        ArrayList arrayList5;
        Iterator it2;
        int i7;
        y1 y1Var;
        String str6;
        int i8;
        int i9;
        com.yandex.plus.bdui.plus.checkout.content.e eVar3;
        String str7;
        String str8;
        l lVar;
        int i10;
        int i11;
        List list;
        int i12;
        ArrayList arrayList6;
        Iterator it3;
        Object obj2;
        String str9;
        int i13;
        String str10;
        String str11;
        l lVar2;
        ArrayList arrayList7;
        String str12;
        List list2;
        int i14;
        int i15;
        int i16;
        Iterator it4;
        ArrayList arrayList8;
        com.yandex.plus.bdui.plus.checkout.content.e eVar4;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.f fVar;
        ArrayList arrayList9;
        ArrayList arrayList10;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a aVar;
        Object h;
        com.yandex.plus.bdui.plus.checkout.content.c cVar2;
        ArrayList arrayList11;
        f2 f2Var;
        com.yandex.passport.common.network.n nVar;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.f fVar2;
        ?? r19;
        ?? r37;
        Object obj3;
        com.yandex.plus.bdui.plus.checkout.content.d dVar;
        Object cVar3;
        l lVar3 = this;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i17 = iVar.H;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                iVar.H = i17 - Integer.MIN_VALUE;
                Object obj4 = iVar.F;
                nm6 nm6Var = nm6.a;
                i = iVar.H;
                String str13 = "dark";
                String str14 = "light";
                ?? r192 = 0;
                if (i != 0) {
                    i2 = 2;
                    i3 = 0;
                    qgg.h0(obj4);
                    f2 f2Var2 = (f2) eVar;
                    com.yandex.passport.common.network.n nVar2 = f2Var2.k;
                    z1 g = nVar2 != null ? g(nVar2) : null;
                    com.yandex.passport.common.network.n nVar3 = f2Var2.k;
                    if (nVar3 != null) {
                        ab8 ab8Var = new ab8(new lhc(new lcc(new wz0(1, (ArrayList) nVar3.b), true, new com.yandex.plus.bdui.flex.ui.content.c(14)), new com.yandex.plus.bdui.flex.ui.content.c(15), ihp.a).iterator(), new s3f(3));
                        if (ab8Var.hasNext()) {
                            Object next = ab8Var.next();
                            if (ab8Var.hasNext()) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                linkedHashSet.add(next);
                                while (ab8Var.hasNext()) {
                                    linkedHashSet.add(ab8Var.next());
                                }
                                set = linkedHashSet;
                            } else {
                                set = uop.b(next);
                            }
                        } else {
                            set = q5b.a;
                        }
                    } else {
                        set = null;
                    }
                    if (set == null) {
                        set = q5b.a;
                    }
                    String str15 = (String) f2Var2.a.d(f2.s[0]);
                    List a = f2Var2.a();
                    arrayList = new ArrayList(v75.o(a, 10));
                    int i18 = 0;
                    for (Object obj5 : a) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            u75.n();
                            throw r192;
                        }
                        d2 d2Var = (d2) obj5;
                        if (i18 == 0 && g != null && g.b) {
                            String str16 = g.a;
                            Map map = g.f;
                            com.yandex.plus.core.data.common.y yVar = new com.yandex.plus.core.data.common.y((String) map.get("light"), (String) map.get("dark"));
                            String str17 = g.c;
                            String str18 = g.d;
                            List list3 = g.g;
                            str16.getClass();
                            list3.getClass();
                            cVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c(str16, yVar, str17, str18, list3, (Boolean) r192, (63 & 64) != 0 ? false : set.contains(str16));
                        } else {
                            Object obj6 = r192;
                            String str19 = d2Var.a;
                            com.yandex.plus.core.templating.template.j jVar = d2Var.c;
                            if (str19 == null && (str19 = (String) jVar.d(d2.f[0])) == null) {
                                str19 = "";
                            }
                            com.yandex.plus.core.data.common.y yVar2 = d2Var.b;
                            s9f[] s9fVarArr = d2.f;
                            r192 = obj6;
                            String str20 = (String) jVar.d(s9fVarArr[0]);
                            String str21 = (String) d2Var.d.d(s9fVarArr[1]);
                            String str22 = (String) d2Var.e.d(s9fVarArr[2]);
                            c5b c5bVar = c5b.a;
                            c5bVar.getClass();
                            StringBuilder sb = new StringBuilder();
                            boolean z = str21 == null || StringsKt.U(str21);
                            boolean z2 = str22 == null || StringsKt.U(str22);
                            sb.append(str21);
                            if (!z && !z2) {
                                sb.append(", ");
                            }
                            sb.append(str22);
                            cVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c(str19, yVar2, str20, sb.toString(), c5bVar, (Boolean) null, (63 & 64) != 0 ? false : set.contains(str19));
                        }
                        arrayList.add(cVar);
                        i18 = i19;
                        r192 = r192;
                    }
                    List list4 = f2Var2.b;
                    i4 = 10;
                    iVar2 = iVar;
                    str2 = str15;
                    i5 = 0;
                    i6 = 0;
                    str3 = str;
                    arrayList2 = new ArrayList(v75.o(list4, 10));
                    it = list4.iterator();
                    eVar2 = eVar;
                    obj = r192;
                    if (it.hasNext()) {
                    }
                } else if (i == 1) {
                    i2 = 2;
                    int i20 = iVar.D;
                    int i21 = iVar.C;
                    int i22 = iVar.B;
                    int i23 = iVar.A;
                    int i24 = iVar.z;
                    Collection collection = iVar.x;
                    Collection collection2 = iVar.w;
                    Iterator it5 = iVar.v;
                    Collection collection3 = iVar.u;
                    String str23 = (String) iVar.t;
                    y1 y1Var2 = iVar.s;
                    Iterator it6 = (Iterator) iVar.q;
                    ?? r1 = (Collection) iVar.p;
                    List list5 = iVar.o;
                    List list6 = iVar.n;
                    List list7 = iVar.m;
                    String str24 = iVar.l;
                    String str25 = iVar.k;
                    com.yandex.plus.bdui.plus.checkout.content.e eVar5 = iVar.j;
                    qgg.h0(obj4);
                    it = it6;
                    arrayList4 = list7;
                    str4 = "light";
                    i8 = i20;
                    str5 = "dark";
                    i9 = i21;
                    i6 = i23;
                    i5 = i24;
                    str2 = str24;
                    arrayList2 = r1;
                    iVar2 = iVar;
                    eVar3 = eVar5;
                    collection2.add((com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c) obj4);
                    lVar3 = lVar3;
                    arrayList3 = collection;
                    str6 = str23;
                    y1Var = y1Var2;
                    str7 = str25;
                    i7 = i22;
                    it2 = it5;
                    arrayList5 = collection3;
                    obj = null;
                    i3 = 0;
                    while (it2.hasNext()) {
                    }
                    str8 = str7;
                    lVar = lVar3;
                    List list8 = y1Var.c;
                    Object arrayList12 = new ArrayList(v75.o(list8, 10));
                    i10 = i5;
                    i11 = i6;
                    list = arrayList5;
                    i12 = 0;
                    arrayList6 = arrayList3;
                    it3 = list8.iterator();
                    obj2 = arrayList12;
                    str9 = str6;
                    i13 = 0;
                    String str26 = str8;
                    if (!it3.hasNext()) {
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cVar2 = (com.yandex.plus.bdui.plus.checkout.content.c) iVar.p;
                            arrayList9 = iVar.o;
                            List list9 = iVar.n;
                            list2 = iVar.m;
                            str12 = iVar.l;
                            eVar4 = iVar.j;
                            qgg.h0(obj4);
                            str10 = "dark";
                            str11 = "light";
                            fVar = null;
                            h = obj4;
                            lVar2 = lVar3;
                            arrayList11 = list9;
                            aVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a((CharSequence) h, cVar2.b);
                            arrayList10 = arrayList11;
                            List list10 = arrayList9;
                            List list11 = list2;
                            String str27 = str12;
                            f2Var = (f2) eVar4;
                            com.yandex.plus.core.templating.template.j jVar2 = f2Var.e;
                            s9f[] s9fVarArr2 = f2.s;
                            String str28 = (String) jVar2.d(s9fVarArr2[1]);
                            nVar = f2Var.k;
                            String str29 = (String) f2Var.f.d(s9fVarArr2[2]);
                            if (f2Var.j) {
                                Locale locale = (Locale) lVar2.d.invoke();
                                fVar2 = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.f((kotlin.text.c.o(locale.getLanguage(), "RU", true) && kotlin.text.c.o(locale.getCountry(), "RU", true)) ? R.drawable.pay_sdk_pay_logo_ru : R.drawable.pay_sdk_pay_logo_en, lVar2.e.get(R.string.PlusPay_Checkout_YPay_PaymentVia));
                            } else {
                                fVar2 = fVar;
                            }
                            String str30 = (String) f2Var.g.d(s9fVarArr2[3]);
                            if (nVar != null) {
                                z1 g2 = g(nVar);
                                ArrayList arrayList13 = (ArrayList) nVar.b;
                                ArrayList arrayList14 = new ArrayList();
                                for (Object obj7 : arrayList13) {
                                    if (!Intrinsics.d(((z1) obj7).a, g2 != null ? g2.a : fVar)) {
                                        arrayList14.add(obj7);
                                    }
                                }
                                ArrayList arrayList15 = new ArrayList(v75.o(arrayList14, 10));
                                Iterator it7 = arrayList14.iterator();
                                while (it7.hasNext()) {
                                    z1 z1Var = (z1) it7.next();
                                    String str31 = z1Var.c;
                                    Map map2 = z1Var.f;
                                    arrayList15.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.d(str31, new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.c(z1Var.a, new com.yandex.plus.core.data.common.y((String) map2.get(str11), (String) map2.get(str10)), z1Var.d, z1Var.e, z1Var.g, Boolean.valueOf(z1Var.b), 64)));
                                }
                                r19 = arrayList15;
                            } else {
                                r19 = fVar;
                            }
                            if (r19 == 0) {
                                r19 = c5b.a;
                            }
                            List list12 = r19;
                            if (nVar != null) {
                                com.yandex.plus.bdui.plus.checkout.content.d dVar2 = (com.yandex.plus.bdui.plus.checkout.content.d) nVar.c;
                                if (dVar2 != null) {
                                    Iterator it8 = ((ArrayList) nVar.b).iterator();
                                    while (true) {
                                        if (!it8.hasNext()) {
                                            obj3 = fVar;
                                            break;
                                        }
                                        obj3 = it8.next();
                                        if (((z1) obj3).h != null) {
                                            break;
                                        }
                                    }
                                    z1 z1Var2 = (z1) obj3;
                                    if (z1Var2 != null && (dVar = z1Var2.h) != null) {
                                        cVar3 = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.c(dVar2.a, dVar.a, dVar.b, z1Var2.b);
                                        r37 = cVar3;
                                    }
                                }
                                cVar3 = fVar;
                                r37 = cVar3;
                            } else {
                                r37 = fVar;
                            }
                            return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g(str27, list11, arrayList10, aVar, list10, str28, str29, fVar2, str30, list12, r37);
                        }
                        i14 = iVar.E;
                        int i25 = iVar.B;
                        i15 = iVar.A;
                        i16 = iVar.z;
                        Collection collection4 = (Collection) iVar.t;
                        it4 = iVar.r;
                        ?? r12 = (Collection) iVar.q;
                        List list13 = iVar.o;
                        List list14 = iVar.n;
                        List list15 = iVar.m;
                        String str32 = iVar.l;
                        Object obj8 = obj4;
                        com.yandex.plus.bdui.plus.checkout.content.e eVar6 = iVar.j;
                        qgg.h0(obj8);
                        str10 = "dark";
                        str11 = "light";
                        i iVar3 = iVar;
                        eVar4 = eVar6;
                        lVar2 = lVar3;
                        arrayList8 = r12;
                        list2 = list15;
                        arrayList7 = list14;
                        collection4.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.b(i14, (CharSequence) obj8));
                        iVar2 = iVar3;
                        i14 = i25;
                        str12 = str32;
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i26 = i14 + 1;
                            if (i14 < 0) {
                                u75.n();
                                throw null;
                            }
                            iVar2.j = eVar4;
                            iVar2.k = null;
                            iVar2.l = str12;
                            iVar2.m = list2;
                            iVar2.n = arrayList7;
                            iVar2.o = null;
                            iVar2.p = null;
                            iVar2.q = arrayList8;
                            iVar2.r = it4;
                            iVar2.s = null;
                            iVar2.t = arrayList8;
                            iVar2.u = null;
                            iVar2.v = null;
                            iVar2.w = null;
                            iVar2.x = null;
                            iVar2.y = null;
                            iVar2.z = i16;
                            iVar2.A = i15;
                            iVar2.B = i26;
                            iVar2.C = i14;
                            iVar2.D = 0;
                            iVar2.E = i14;
                            iVar2.H = 3;
                            Object h2 = lVar2.h((PlusPayRichText) next2, iVar2);
                            if (h2 != nm6Var) {
                                obj8 = h2;
                                iVar3 = iVar2;
                                str32 = str12;
                                collection4 = arrayList8;
                                i25 = i26;
                                collection4.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.b(i14, (CharSequence) obj8));
                                iVar2 = iVar3;
                                i14 = i25;
                                str12 = str32;
                                if (it4.hasNext()) {
                                    fVar = null;
                                    arrayList9 = arrayList8;
                                    com.yandex.plus.bdui.plus.checkout.content.c cVar4 = ((f2) eVar4).d;
                                    if (cVar4 == null) {
                                        arrayList10 = arrayList7;
                                        aVar = null;
                                        List list102 = arrayList9;
                                        List list112 = list2;
                                        String str272 = str12;
                                        f2Var = (f2) eVar4;
                                        com.yandex.plus.core.templating.template.j jVar22 = f2Var.e;
                                        s9f[] s9fVarArr22 = f2.s;
                                        String str282 = (String) jVar22.d(s9fVarArr22[1]);
                                        nVar = f2Var.k;
                                        String str292 = (String) f2Var.f.d(s9fVarArr22[2]);
                                        if (f2Var.j) {
                                        }
                                        String str302 = (String) f2Var.g.d(s9fVarArr22[3]);
                                        if (nVar != null) {
                                        }
                                        if (r19 == 0) {
                                        }
                                        List list122 = r19;
                                        if (nVar != null) {
                                        }
                                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g(str272, list112, arrayList10, aVar, list102, str282, str292, fVar2, str302, list122, r37);
                                    }
                                    PlusPayRichText plusPayRichText = cVar4.a;
                                    iVar2.j = eVar4;
                                    iVar2.k = null;
                                    iVar2.l = str12;
                                    iVar2.m = list2;
                                    iVar2.n = arrayList7;
                                    iVar2.o = arrayList9;
                                    iVar2.p = cVar4;
                                    iVar2.q = null;
                                    iVar2.r = null;
                                    iVar2.s = null;
                                    iVar2.t = null;
                                    iVar2.u = null;
                                    iVar2.v = null;
                                    iVar2.w = null;
                                    iVar2.x = null;
                                    iVar2.y = null;
                                    iVar2.z = 0;
                                    iVar2.H = 4;
                                    h = lVar2.h(plusPayRichText, iVar2);
                                    if (h != nm6Var) {
                                        cVar2 = cVar4;
                                        arrayList11 = arrayList7;
                                        aVar = new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.a((CharSequence) h, cVar2.b);
                                        arrayList10 = arrayList11;
                                        List list1022 = arrayList9;
                                        List list1122 = list2;
                                        String str2722 = str12;
                                        f2Var = (f2) eVar4;
                                        com.yandex.plus.core.templating.template.j jVar222 = f2Var.e;
                                        s9f[] s9fVarArr222 = f2.s;
                                        String str2822 = (String) jVar222.d(s9fVarArr222[1]);
                                        nVar = f2Var.k;
                                        String str2922 = (String) f2Var.f.d(s9fVarArr222[2]);
                                        if (f2Var.j) {
                                        }
                                        String str3022 = (String) f2Var.g.d(s9fVarArr222[3]);
                                        if (nVar != null) {
                                        }
                                        if (r19 == 0) {
                                        }
                                        List list1222 = r19;
                                        if (nVar != null) {
                                        }
                                        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g(str2722, list1122, arrayList10, aVar, list1022, str2822, str2922, fVar2, str3022, list1222, r37);
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    }
                    Object obj9 = obj4;
                    int i27 = iVar.D;
                    int i28 = iVar.C;
                    int i29 = iVar.B;
                    int i30 = iVar.A;
                    int i31 = iVar.z;
                    Collection collection5 = iVar.y;
                    Collection collection6 = iVar.x;
                    List list16 = (List) iVar.w;
                    it3 = iVar.v;
                    Object obj10 = (Collection) iVar.u;
                    String str33 = (String) iVar.t;
                    Iterator it9 = (Iterator) iVar.q;
                    ?? r13 = (Collection) iVar.p;
                    List list17 = iVar.o;
                    List list18 = iVar.n;
                    List list19 = iVar.m;
                    String str34 = iVar.l;
                    String str35 = iVar.k;
                    com.yandex.plus.bdui.plus.checkout.content.e eVar7 = iVar.j;
                    qgg.h0(obj9);
                    it = it9;
                    arrayList4 = list19;
                    str4 = "light";
                    i10 = i31;
                    str2 = str34;
                    str8 = str35;
                    List list20 = list16;
                    int i32 = i28;
                    int i33 = i30;
                    ArrayList arrayList16 = collection5;
                    i13 = i27;
                    arrayList2 = r13;
                    str5 = "dark";
                    str9 = str33;
                    int i34 = i29;
                    iVar2 = iVar;
                    eVar3 = eVar7;
                    lVar = lVar3;
                    Object obj11 = obj10;
                    collection6.add((com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f) obj9);
                    i12 = i32;
                    obj2 = obj11;
                    i7 = i34;
                    list = list20;
                    i11 = i33;
                    arrayList6 = arrayList16;
                    i2 = 2;
                    String str262 = str8;
                    if (!it3.hasNext()) {
                        list20 = list;
                        a2 a2Var = (a2) it3.next();
                        iVar2.j = eVar3;
                        iVar2.k = str262;
                        iVar2.l = str2;
                        str8 = str262;
                        iVar2.m = arrayList4;
                        iVar2.n = null;
                        iVar2.o = null;
                        iVar2.p = arrayList2;
                        iVar2.q = it;
                        iVar2.r = null;
                        iVar2.s = null;
                        iVar2.t = str9;
                        ArrayList arrayList17 = (Collection) obj2;
                        iVar2.u = arrayList17;
                        iVar2.v = it3;
                        com.yandex.plus.bdui.plus.checkout.content.e eVar8 = eVar3;
                        iVar2.w = list20;
                        iVar2.x = arrayList17;
                        iVar2.y = arrayList6;
                        iVar2.z = i10;
                        iVar2.A = i11;
                        iVar2.B = i7;
                        iVar2.C = i12;
                        iVar2.D = i13;
                        iVar2.E = 0;
                        iVar2.H = i2;
                        Object j = lVar.j(a2Var, iVar2);
                        if (j != nm6Var) {
                            i32 = i12;
                            arrayList16 = arrayList6;
                            eVar3 = eVar8;
                            collection6 = obj2;
                            obj9 = j;
                            i33 = i11;
                            i34 = i7;
                            obj11 = collection6;
                            collection6.add((com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f) obj9);
                            i12 = i32;
                            obj2 = obj11;
                            i7 = i34;
                            list = list20;
                            i11 = i33;
                            arrayList6 = arrayList16;
                            i2 = 2;
                            String str2622 = str8;
                            if (!it3.hasNext()) {
                                com.yandex.plus.bdui.plus.checkout.content.e eVar9 = eVar3;
                                arrayList6.add(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.e(str9, list, (List) obj2));
                                arrayList = arrayList4;
                                lVar3 = lVar;
                                i5 = i10;
                                i6 = i11;
                                str13 = str5;
                                str14 = str4;
                                str3 = str2622;
                                eVar2 = eVar9;
                                i4 = 10;
                                obj = null;
                                i2 = 2;
                                i3 = 0;
                                if (it.hasNext()) {
                                    com.yandex.plus.bdui.plus.checkout.content.e eVar10 = eVar2;
                                    str10 = str13;
                                    str11 = str14;
                                    lVar2 = lVar3;
                                    arrayList7 = arrayList2;
                                    List list21 = ((f2) eVar10).c;
                                    ArrayList arrayList18 = new ArrayList(v75.o(list21, 10));
                                    str12 = str2;
                                    list2 = arrayList;
                                    i14 = 0;
                                    i15 = 0;
                                    i16 = 0;
                                    it4 = list21.iterator();
                                    arrayList8 = arrayList18;
                                    eVar4 = eVar10;
                                    if (it4.hasNext()) {
                                    }
                                } else {
                                    y1 y1Var3 = (y1) it.next();
                                    String str36 = y1Var3.a;
                                    com.yandex.plus.bdui.plus.checkout.content.e eVar11 = eVar2;
                                    ArrayList arrayList19 = y1Var3.b;
                                    String str37 = str3;
                                    ArrayList arrayList20 = new ArrayList(v75.o(arrayList19, i4));
                                    str5 = str13;
                                    str4 = str14;
                                    y1Var = y1Var3;
                                    it = it;
                                    i9 = i3;
                                    i8 = i9;
                                    i7 = i8;
                                    arrayList5 = arrayList20;
                                    eVar3 = eVar11;
                                    arrayList4 = arrayList;
                                    str6 = str36;
                                    it2 = arrayList19.iterator();
                                    str7 = str37;
                                    arrayList3 = arrayList2;
                                    while (it2.hasNext()) {
                                        nm6 nm6Var2 = nm6Var;
                                        b2 b2Var = (b2) it2.next();
                                        boolean d = Intrinsics.d(b2Var.b, str7);
                                        iVar2.j = eVar3;
                                        iVar2.k = str7;
                                        iVar2.l = str2;
                                        String str38 = str7;
                                        iVar2.m = arrayList4;
                                        ?? r14 = obj;
                                        iVar2.n = r14;
                                        iVar2.o = r14;
                                        iVar2.p = arrayList2;
                                        iVar2.q = it;
                                        iVar2.r = r14;
                                        iVar2.s = y1Var;
                                        iVar2.t = str6;
                                        ArrayList arrayList21 = arrayList5;
                                        iVar2.u = arrayList21;
                                        iVar2.v = it2;
                                        iVar2.w = arrayList21;
                                        iVar2.x = arrayList3;
                                        iVar2.y = null;
                                        iVar2.z = i5;
                                        iVar2.A = i6;
                                        iVar2.B = i7;
                                        iVar2.C = i9;
                                        iVar2.D = i8;
                                        iVar2.E = i3;
                                        iVar2.H = 1;
                                        Object k = k(b2Var, d, iVar2);
                                        nm6Var = nm6Var2;
                                        if (k == nm6Var) {
                                            break;
                                        }
                                        int i35 = i7;
                                        Iterator it10 = it2;
                                        ArrayList arrayList22 = arrayList5;
                                        String str39 = str6;
                                        y1 y1Var4 = y1Var;
                                        ArrayList arrayList23 = arrayList3;
                                        arrayList22.add((com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c) k);
                                        lVar3 = this;
                                        arrayList3 = arrayList23;
                                        str6 = str39;
                                        y1Var = y1Var4;
                                        str7 = str38;
                                        i7 = i35;
                                        it2 = it10;
                                        arrayList5 = arrayList22;
                                        obj = null;
                                        i3 = 0;
                                    }
                                    str8 = str7;
                                    lVar = lVar3;
                                    List list82 = y1Var.c;
                                    Object arrayList122 = new ArrayList(v75.o(list82, 10));
                                    i10 = i5;
                                    i11 = i6;
                                    list = arrayList5;
                                    i12 = 0;
                                    arrayList6 = arrayList3;
                                    it3 = list82.iterator();
                                    obj2 = arrayList122;
                                    str9 = str6;
                                    i13 = 0;
                                    String str26222 = str8;
                                    if (!it3.hasNext()) {
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    }
                }
            }
        }
        iVar = new i(lVar3, cg6Var);
        Object obj42 = iVar.F;
        nm6 nm6Var3 = nm6.a;
        i = iVar.H;
        String str132 = "dark";
        String str142 = "light";
        ?? r1922 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(a2 a2Var, cg6 cg6Var) {
        k kVar;
        int i;
        String str;
        PlusPayRichText plusPayRichText;
        CharSequence charSequence;
        String str2;
        CharSequence charSequence2;
        a2 a2Var2;
        CharSequence charSequence3;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.o = i2 - Integer.MIN_VALUE;
                Object obj = kVar.m;
                Object obj2 = nm6.a;
                i = kVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    String str3 = a2Var.e;
                    PlusPayRichText plusPayRichText2 = a2Var.a;
                    kVar.j = a2Var;
                    kVar.k = str3;
                    kVar.o = 1;
                    Object h = h(plusPayRichText2, kVar);
                    if (h != obj2) {
                        str = str3;
                        obj = h;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence3 = kVar.l;
                    str2 = kVar.k;
                    a2Var2 = kVar.j;
                    qgg.h0(obj);
                    charSequence2 = charSequence3;
                    charSequence = (CharSequence) obj;
                    a2Var = a2Var2;
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f(str2, charSequence2, charSequence, a2Var.c, a2Var.d);
                }
                String str4 = kVar.k;
                a2 a2Var3 = kVar.j;
                qgg.h0(obj);
                str = str4;
                a2Var = a2Var3;
                CharSequence charSequence4 = (CharSequence) obj;
                plusPayRichText = a2Var.b;
                if (plusPayRichText != null) {
                    charSequence = null;
                    str2 = str;
                    charSequence2 = charSequence4;
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f(str2, charSequence2, charSequence, a2Var.c, a2Var.d);
                }
                kVar.j = a2Var;
                kVar.k = str;
                kVar.l = charSequence4;
                kVar.o = 2;
                Object h2 = h(plusPayRichText, kVar);
                if (h2 != obj2) {
                    a2Var2 = a2Var;
                    charSequence3 = charSequence4;
                    obj = h2;
                    str2 = str;
                    charSequence2 = charSequence3;
                    charSequence = (CharSequence) obj;
                    a2Var = a2Var2;
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f(str2, charSequence2, charSequence, a2Var.c, a2Var.d);
                }
                return obj2;
            }
        }
        kVar = new k(this, cg6Var);
        Object obj3 = kVar.m;
        Object obj22 = nm6.a;
        i = kVar.o;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj3;
        plusPayRichText = a2Var.b;
        if (plusPayRichText != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(b2 b2Var, boolean z, cg6 cg6Var) {
        j jVar;
        int i;
        String str;
        CharSequence charSequence;
        String str2;
        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar;
        boolean z2;
        Object h;
        PlusPayRichText plusPayRichText;
        CharSequence charSequence2;
        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar2;
        String str3;
        String str4;
        boolean z3;
        b2 b2Var2;
        boolean z4;
        String str5;
        CharSequence charSequence3;
        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar3;
        String str6;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.s = i2 - Integer.MIN_VALUE;
                Object obj = jVar.q;
                Object obj2 = nm6.a;
                i = jVar.s;
                if (i != 0) {
                    qgg.h0(obj);
                    String str7 = b2Var.b;
                    com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar4 = new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a(!b2Var.a, b2Var.g);
                    str = b2Var.c;
                    PlusPayRichText plusPayRichText2 = b2Var.d;
                    if (plusPayRichText2 != null) {
                        jVar.j = b2Var;
                        jVar.k = str7;
                        jVar.l = aVar4;
                        jVar.m = str;
                        jVar.o = z;
                        jVar.p = z;
                        jVar.s = 1;
                        h = h(plusPayRichText2, jVar);
                        if (h != obj2) {
                            str2 = str7;
                            aVar = aVar4;
                            z2 = z;
                        }
                        return obj2;
                    }
                    charSequence = null;
                    str2 = str7;
                    aVar = aVar4;
                    z2 = z;
                    plusPayRichText = b2Var.e;
                    if (plusPayRichText == null) {
                        com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar5 = aVar;
                        charSequence2 = null;
                        aVar2 = aVar5;
                        str3 = str;
                        str4 = str2;
                        z3 = z;
                        return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c(str4, z3, aVar2, str3, charSequence, charSequence2, b2Var.f, b2Var.h, b2Var.i);
                    }
                    jVar.j = b2Var;
                    jVar.k = str2;
                    jVar.l = aVar;
                    jVar.m = str;
                    jVar.n = charSequence;
                    jVar.o = z2;
                    jVar.p = z;
                    jVar.s = 2;
                    obj = h(plusPayRichText, jVar);
                    if (obj != obj2) {
                        b2Var2 = b2Var;
                        z4 = z;
                        str5 = str;
                        charSequence3 = charSequence;
                        aVar3 = aVar;
                        str6 = str2;
                        charSequence = charSequence3;
                        charSequence2 = (CharSequence) obj;
                        str3 = str5;
                        str4 = str6;
                        aVar2 = aVar3;
                        z3 = z4;
                        b2Var = b2Var2;
                        return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c(str4, z3, aVar2, str3, charSequence, charSequence2, b2Var.f, b2Var.h, b2Var.i);
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z4 = jVar.p;
                    charSequence3 = jVar.n;
                    str5 = jVar.m;
                    aVar3 = jVar.l;
                    str6 = jVar.k;
                    b2Var2 = jVar.j;
                    qgg.h0(obj);
                    charSequence = charSequence3;
                    charSequence2 = (CharSequence) obj;
                    str3 = str5;
                    str4 = str6;
                    aVar2 = aVar3;
                    z3 = z4;
                    b2Var = b2Var2;
                    return new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c(str4, z3, aVar2, str3, charSequence, charSequence2, b2Var.f, b2Var.h, b2Var.i);
                }
                z = jVar.p;
                boolean z5 = jVar.o;
                str = jVar.m;
                com.yandex.plus.pay.ui.core.mobile.view.payment.methods.a aVar6 = jVar.l;
                String str8 = jVar.k;
                b2 b2Var3 = jVar.j;
                qgg.h0(obj);
                z2 = z5;
                b2Var = b2Var3;
                str2 = str8;
                aVar = aVar6;
                h = obj;
                charSequence = (CharSequence) h;
                plusPayRichText = b2Var.e;
                if (plusPayRichText == null) {
                }
            }
        }
        jVar = new j(this, cg6Var);
        Object obj3 = jVar.q;
        Object obj22 = nm6.a;
        i = jVar.s;
        if (i != 0) {
        }
        charSequence = (CharSequence) h;
        plusPayRichText = b2Var.e;
        if (plusPayRichText == null) {
        }
    }
}

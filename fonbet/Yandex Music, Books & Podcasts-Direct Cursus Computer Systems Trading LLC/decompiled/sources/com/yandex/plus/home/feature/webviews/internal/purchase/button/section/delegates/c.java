package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import com.appsflyer.internal.k;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.plus.bdui.q;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.n0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r4;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.pay.adapter.api.j;
import defpackage.b6e;
import defpackage.bca;
import defpackage.btf;
import defpackage.ezc;
import defpackage.gld;
import defpackage.jyr;
import defpackage.omb;
import defpackage.pjc;
import defpackage.rar;
import defpackage.tf6;
import defpackage.tkb;
import defpackage.vdr;
import defpackage.wkb;
import defpackage.x77;
import defpackage.x97;
import defpackage.xdr;
import defpackage.ydr;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class c {
    public final com.yandex.plus.acquisition.sdk.common.api.di.b a;
    public final p b;
    public final com.yandex.plus.bdui.plus.content.controller.f c;
    public final com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c d;
    public final p e;
    public final tf6 f;
    public final xdr g;
    public final xdr h;
    public rar i;
    public final jyr j;

    public c(kotlinx.coroutines.a aVar, com.yandex.plus.acquisition.sdk.common.api.di.b bVar, p pVar, com.yandex.plus.bdui.plus.content.controller.f fVar, com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar, p pVar2) {
        aVar.getClass();
        this.a = bVar;
        this.b = pVar;
        this.c = fVar;
        this.d = cVar;
        this.e = pVar2;
        this.f = gld.e(aVar);
        Boolean bool = Boolean.FALSE;
        this.g = ydr.a(bool);
        this.h = ydr.a(bool);
        this.j = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(4, this));
    }

    public final void a(Function1 function1) {
        com.yandex.plus.bdui.flex.ui.a.j(new com.yandex.passport.common.mvi.d(new bca(c(), 18), function1, 14), this.f, new q(2, this, c.class, "showNativePayButton", "showNativePayButton(Lcom/yandex/plus/home/feature/webviews/internal/purchase/button/section/ButtonSectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 27));
    }

    public final void b(String str) {
        String concat = str.concat(" is not supported for composite offers");
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.e;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, concat, null);
        ((com.yandex.plus.home.analytics.payment.c) this.a.f).a(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.a.b, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.c.a, concat);
    }

    public final vdr c() {
        return (vdr) this.j.getValue();
    }

    public abstract pjc d();

    public final void e(com.yandex.plus.home.feature.webviews.internalapi.authorization.d dVar) {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a aVar;
        Function0 function0;
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d dVar2;
        dVar.getClass();
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e eVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e) c().getValue();
        if (!(eVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d)) {
            eVar = null;
        }
        if (eVar != null) {
            com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d dVar3 = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d) eVar;
            com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.a;
            com.yandex.plus.home.analytics.payment.b bVar2 = (com.yandex.plus.home.analytics.payment.b) bVar.i;
            a0 a = dVar3.a();
            com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a c = dVar3.c();
            com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e c2 = com.yandex.plus.acquisition.sdk.common.api.di.b.c(bVar, a, c != null ? c.a : null);
            if (c2 != null) {
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f fVar = c2.b;
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar4 = c2.c;
                String str = c2.d;
                List list = c2.e;
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar = c2.a;
                if (dVar instanceof com.yandex.plus.home.feature.webviews.internalapi.authorization.c) {
                    bVar2.getClass();
                    omb ombVar = bVar2.a;
                    dVar2 = dVar3;
                    int ordinal = gVar.ordinal();
                    if (ordinal == 0) {
                        wkb I = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                        tkb G = com.yandex.plus.bdui.plus.analytics.b.G(dVar4);
                        String str2 = str == null ? "no_value" : str;
                        ombVar.getClass();
                        list.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("purchase_session_id", "no_value");
                        linkedHashMap.put("purchase_type", I.a);
                        linkedHashMap.put("purchase_button", G.a);
                        linkedHashMap.put("product_id", str2);
                        k.z(linkedHashMap, "options_id", list, false, "is_one_click_payment");
                        linkedHashMap.put("is_tarifficator", String.valueOf(true));
                        HashMap hashMap = new HashMap();
                        k.w("version", 1, hashMap, "Payment");
                        linkedHashMap.put("_meta", omb.a(1, hashMap));
                        ombVar.d("PlusHome.BuySubscription.Authentication.Success", linkedHashMap);
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return;
                        }
                        wkb I2 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                        tkb G2 = com.yandex.plus.bdui.plus.analytics.b.G(dVar4);
                        String str3 = str == null ? "no_value" : str;
                        ombVar.getClass();
                        list.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("purchase_session_id", "no_value");
                        linkedHashMap2.put("purchase_type", I2.a);
                        linkedHashMap2.put("purchase_button", G2.a);
                        linkedHashMap2.put("product_id", str3);
                        k.z(linkedHashMap2, "options_id", list, false, "is_one_click_payment");
                        linkedHashMap2.put("is_tarifficator", String.valueOf(true));
                        HashMap hashMap2 = new HashMap();
                        k.w("version", 1, hashMap2, "Payment");
                        linkedHashMap2.put("_meta", omb.a(1, hashMap2));
                        ombVar.d("PlusStories.BuySubscription.Authentication.Success", linkedHashMap2);
                    }
                } else {
                    dVar2 = dVar3;
                    if (dVar.equals(com.yandex.plus.home.feature.webviews.internalapi.authorization.a.a)) {
                        bVar2.getClass();
                        omb ombVar2 = bVar2.a;
                        int ordinal2 = gVar.ordinal();
                        if (ordinal2 == 0) {
                            wkb I3 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                            tkb G3 = com.yandex.plus.bdui.plus.analytics.b.G(dVar4);
                            String str4 = str == null ? "no_value" : str;
                            ombVar2.getClass();
                            list.getClass();
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            linkedHashMap3.put("purchase_session_id", "no_value");
                            linkedHashMap3.put("purchase_type", I3.a);
                            linkedHashMap3.put("purchase_button", G3.a);
                            linkedHashMap3.put("product_id", str4);
                            k.z(linkedHashMap3, "options_id", list, false, "is_one_click_payment");
                            linkedHashMap3.put("is_tarifficator", String.valueOf(true));
                            HashMap hashMap3 = new HashMap();
                            k.w("version", 1, hashMap3, "Payment");
                            linkedHashMap3.put("_meta", omb.a(1, hashMap3));
                            ombVar2.d("PlusHome.BuySubscription.Authentication.Cancelled", linkedHashMap3);
                        } else {
                            if (ordinal2 != 1) {
                                b6e.s();
                                return;
                            }
                            wkb I4 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                            tkb G4 = com.yandex.plus.bdui.plus.analytics.b.G(dVar4);
                            String str5 = str == null ? "no_value" : str;
                            ombVar2.getClass();
                            list.getClass();
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap4.put("purchase_session_id", "no_value");
                            linkedHashMap4.put("purchase_type", I4.a);
                            linkedHashMap4.put("purchase_button", G4.a);
                            linkedHashMap4.put("product_id", str5);
                            k.z(linkedHashMap4, "options_id", list, false, "is_one_click_payment");
                            linkedHashMap4.put("is_tarifficator", String.valueOf(true));
                            HashMap hashMap4 = new HashMap();
                            k.w("version", 1, hashMap4, "Payment");
                            linkedHashMap4.put("_meta", omb.a(1, hashMap4));
                            ombVar2.d("PlusStories.BuySubscription.Authentication.Cancelled", linkedHashMap4);
                        }
                    } else {
                        if (!dVar.equals(com.yandex.plus.home.feature.webviews.internalapi.authorization.b.a)) {
                            b6e.s();
                            return;
                        }
                        bVar2.getClass();
                        omb ombVar3 = bVar2.a;
                        int ordinal3 = gVar.ordinal();
                        if (ordinal3 == 0) {
                            wkb I5 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                            tkb G5 = com.yandex.plus.bdui.plus.analytics.b.G(dVar4);
                            String str6 = str == null ? "no_value" : str;
                            ombVar3.getClass();
                            list.getClass();
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            linkedHashMap5.put("purchase_session_id", "no_value");
                            linkedHashMap5.put("purchase_type", I5.a);
                            linkedHashMap5.put("purchase_button", G5.a);
                            linkedHashMap5.put("product_id", str6);
                            k.z(linkedHashMap5, "options_id", list, false, "is_one_click_payment");
                            linkedHashMap5.put("is_tarifficator", String.valueOf(true));
                            HashMap hashMap5 = new HashMap();
                            k.w("version", 1, hashMap5, "Payment");
                            linkedHashMap5.put("_meta", omb.a(1, hashMap5));
                            ombVar3.d("PlusHome.BuySubscription.Authentication.Failed", linkedHashMap5);
                        } else {
                            if (ordinal3 != 1) {
                                b6e.s();
                                return;
                            }
                            wkb I6 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                            tkb G6 = com.yandex.plus.bdui.plus.analytics.b.G(dVar4);
                            String str7 = str == null ? "no_value" : str;
                            ombVar3.getClass();
                            list.getClass();
                            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                            linkedHashMap6.put("purchase_session_id", "no_value");
                            linkedHashMap6.put("purchase_type", I6.a);
                            linkedHashMap6.put("purchase_button", G6.a);
                            linkedHashMap6.put("product_id", str7);
                            k.z(linkedHashMap6, "options_id", list, false, "is_one_click_payment");
                            linkedHashMap6.put("is_tarifficator", String.valueOf(true));
                            HashMap hashMap6 = new HashMap();
                            k.w("version", 1, hashMap6, "Payment");
                            linkedHashMap6.put("_meta", omb.a(1, hashMap6));
                            ombVar3.d("PlusStories.BuySubscription.Authentication.Failed", linkedHashMap6);
                        }
                    }
                }
                dVar3 = dVar2;
            }
            if ((dVar3 instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c) && (aVar = ((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c) dVar3).c) != null && aVar.b) {
                if ((dVar instanceof com.yandex.plus.home.feature.webviews.internalapi.authorization.c) || (function0 = this.d.g) == null) {
                    return;
                }
                function0.invoke();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ezc, kotlin.jvm.functions.Function1] */
    public final void f() {
        k0 k0Var;
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e eVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e) c().getValue();
        Continuation continuation = null;
        if (!(eVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c)) {
            eVar = null;
        }
        if (eVar != null) {
            com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c) eVar;
            com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.c cVar2 = this.d;
            com.yandex.plus.acquisition.sdk.common.api.di.b bVar = cVar2.b;
            com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a aVar = cVar.c;
            a0 a0Var = cVar.b;
            if (aVar != null) {
                String str = aVar.c;
                j jVar = aVar.a;
                int ordinal = a0Var.c.d.ordinal();
                if (ordinal == 0) {
                    k0Var = k0.d;
                } else if (ordinal == 1) {
                    k0Var = k0.c;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return;
                    }
                    k0Var = k0.e;
                }
                x97.y(cVar2.a, null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.a(cVar2, jVar, continuation, 0), 3);
                bVar.e(cVar);
                str.getClass();
                ?? r0 = (ezc) bVar.g;
                n0 n0Var = o0.Companion;
                r0.invoke(new p0(str, k0Var));
                if (cVar2.d.c()) {
                    cVar2.a(str, a0Var, jVar);
                }
            }
        }
    }

    public final void g() {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e eVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e) c().getValue();
        if (!(eVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d)) {
            eVar = null;
        }
        if (eVar != null) {
            this.a.e((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d) eVar);
        }
    }

    public final void h() {
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e eVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e) c().getValue();
        if (!(eVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d)) {
            eVar = null;
        }
        if (eVar != null) {
            com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d dVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d) eVar;
            a0 a = dVar.a();
            com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a c = dVar.c();
            j jVar = c != null ? c.a : null;
            com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.a;
            com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e c2 = com.yandex.plus.acquisition.sdk.common.api.di.b.c(bVar, a, jVar);
            if (c2 != null) {
                com.yandex.plus.home.analytics.payment.b bVar2 = (com.yandex.plus.home.analytics.payment.b) bVar.i;
                bVar2.getClass();
                omb ombVar = bVar2.a;
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g gVar = c2.a;
                List list = c2.e;
                String str = c2.d;
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar2 = c2.c;
                com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f fVar = c2.b;
                int ordinal = gVar.ordinal();
                if (ordinal == 0) {
                    wkb I = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                    tkb G = com.yandex.plus.bdui.plus.analytics.b.G(dVar2);
                    String str2 = str == null ? "no_value" : str;
                    ombVar.getClass();
                    list.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("purchase_session_id", "no_value");
                    linkedHashMap.put("purchase_type", I.a);
                    linkedHashMap.put("purchase_button", G.a);
                    linkedHashMap.put("product_id", str2);
                    k.z(linkedHashMap, "options_id", list, false, "is_one_click_payment");
                    linkedHashMap.put("is_tarifficator", String.valueOf(true));
                    HashMap hashMap = new HashMap();
                    k.w("version", 1, hashMap, "Payment");
                    linkedHashMap.put("_meta", omb.a(1, hashMap));
                    ombVar.d("PlusHome.BuySubscription.Authentication.Shown", linkedHashMap);
                    return;
                }
                if (ordinal != 1) {
                    b6e.s();
                    return;
                }
                wkb I2 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                tkb G2 = com.yandex.plus.bdui.plus.analytics.b.G(dVar2);
                String str3 = str == null ? "no_value" : str;
                ombVar.getClass();
                list.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("purchase_session_id", "no_value");
                linkedHashMap2.put("purchase_type", I2.a);
                linkedHashMap2.put("purchase_button", G2.a);
                linkedHashMap2.put("product_id", str3);
                k.z(linkedHashMap2, "options_id", list, false, "is_one_click_payment");
                linkedHashMap2.put("is_tarifficator", String.valueOf(true));
                HashMap hashMap2 = new HashMap();
                k.w("version", 1, hashMap2, "Payment");
                linkedHashMap2.put("_meta", omb.a(1, hashMap2));
                ombVar.d("PlusStories.BuySubscription.Authentication.Shown", linkedHashMap2);
            }
        }
    }

    public final void i(r4 r4Var) {
        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f fVar;
        r4Var.getClass();
        com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e eVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.e) c().getValue();
        if (!(eVar instanceof com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c)) {
            eVar = null;
        }
        if (eVar != null) {
            com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c cVar = (com.yandex.plus.home.feature.webviews.internal.purchase.button.section.c) eVar;
            int ordinal = r4Var.b.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                fVar = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f.a;
            } else if (ordinal == 2) {
                fVar = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f.d;
            } else if (ordinal == 3) {
                fVar = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f.b;
            } else if (ordinal == 4) {
                fVar = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f.c;
            } else {
                if (ordinal != 5) {
                    b6e.s();
                    return;
                }
                fVar = null;
            }
            a0 a0Var = cVar.b;
            com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a aVar = cVar.c;
            this.a.a(a0Var, aVar != null ? aVar.a : null, fVar, r4Var.c);
        }
    }

    public final void j(Function1 function1) {
        rar rarVar = this.i;
        if (rarVar == null || !rarVar.b()) {
            this.i = x97.y(this.f, null, null, new x77(function1, null, 7), 3);
        }
    }
}

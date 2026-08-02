package com.yandex.plus.bdui.plus.checkout;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.btf;
import defpackage.c5b;
import defpackage.c76;
import defpackage.jk6;
import defpackage.os;
import defpackage.pyc;
import defpackage.rh1;
import defpackage.tf6;
import defpackage.u75;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements pyc {
    public final /* synthetic */ p a;
    public final /* synthetic */ PlusPayCompositeOffers.Offer b;
    public final /* synthetic */ com.yandex.plus.core.analytics.h c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ List i;
    public final /* synthetic */ tf6 j;
    public final /* synthetic */ com.yandex.plus.log.api.b k;

    public /* synthetic */ k(p pVar, PlusPayCompositeOffers.Offer offer, com.yandex.plus.pay.internal.common.e eVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar3, com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k kVar4, jk6 jk6Var, List list, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        this.a = pVar;
        this.b = offer;
        this.c = eVar;
        this.d = kVar;
        this.e = kVar2;
        this.f = kVar3;
        this.g = kVar4;
        this.h = jk6Var;
        this.i = list;
        this.j = tf6Var;
        this.k = bVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) obj;
        Function0 function02 = (Function0) obj2;
        Function0 function03 = (Function0) obj3;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        this.a.getClass();
        final int i = 0;
        final com.yandex.plus.core.analytics.h hVar = this.c;
        final com.yandex.plus.log.api.b bVar = this.k;
        final Function0 function04 = this.e;
        com.yandex.plus.bdui.analytics.b bVar2 = new com.yandex.plus.bdui.analytics.b("AppMetrica", new c76(btf.b(new Function0() { // from class: com.yandex.plus.bdui.plus.checkout.l
            /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.plus.bdui.plus.checkout.j] */
            /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.plus.bdui.plus.checkout.j] */
            /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.plus.bdui.plus.checkout.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        final int i2 = 1;
                        final Function0 function05 = function04;
                        return new com.yandex.plus.bdui.plus.analytics.g(hVar, bVar, new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) obj4;
                                switch (i2) {
                                    case 0:
                                        cVar.getClass();
                                        break;
                                    case 1:
                                        cVar.getClass();
                                        break;
                                    default:
                                        cVar.getClass();
                                        break;
                                }
                                return com.yandex.plus.bdui.plus.analytics.b.k(cVar, function05);
                            }
                        });
                    case 1:
                        final int i3 = 0;
                        final Function0 function06 = function04;
                        return new com.yandex.plus.bdui.plus.analytics.e(hVar, bVar, new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) obj4;
                                switch (i3) {
                                    case 0:
                                        cVar.getClass();
                                        break;
                                    case 1:
                                        cVar.getClass();
                                        break;
                                    default:
                                        cVar.getClass();
                                        break;
                                }
                                return com.yandex.plus.bdui.plus.analytics.b.k(cVar, function06);
                            }
                        });
                    default:
                        final int i4 = 2;
                        final Function0 function07 = function04;
                        return new com.yandex.plus.bdui.plus.analytics.e(hVar, bVar, new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) obj4;
                                switch (i4) {
                                    case 0:
                                        cVar.getClass();
                                        break;
                                    case 1:
                                        cVar.getClass();
                                        break;
                                    default:
                                        cVar.getClass();
                                        break;
                                }
                                return com.yandex.plus.bdui.plus.analytics.b.k(cVar, function07);
                            }
                        }, (byte) 0);
                }
            }
        }), 28));
        final int i2 = 1;
        com.yandex.plus.bdui.analytics.b bVar3 = new com.yandex.plus.bdui.analytics.b("Statbox", new Function0() { // from class: com.yandex.plus.bdui.plus.checkout.l
            /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.plus.bdui.plus.checkout.j] */
            /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.plus.bdui.plus.checkout.j] */
            /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.plus.bdui.plus.checkout.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        final int i22 = 1;
                        final Function0 function05 = function04;
                        return new com.yandex.plus.bdui.plus.analytics.g(hVar, bVar, new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) obj4;
                                switch (i22) {
                                    case 0:
                                        cVar.getClass();
                                        break;
                                    case 1:
                                        cVar.getClass();
                                        break;
                                    default:
                                        cVar.getClass();
                                        break;
                                }
                                return com.yandex.plus.bdui.plus.analytics.b.k(cVar, function05);
                            }
                        });
                    case 1:
                        final int i3 = 0;
                        final Function0 function06 = function04;
                        return new com.yandex.plus.bdui.plus.analytics.e(hVar, bVar, new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) obj4;
                                switch (i3) {
                                    case 0:
                                        cVar.getClass();
                                        break;
                                    case 1:
                                        cVar.getClass();
                                        break;
                                    default:
                                        cVar.getClass();
                                        break;
                                }
                                return com.yandex.plus.bdui.plus.analytics.b.k(cVar, function06);
                            }
                        });
                    default:
                        final int i4 = 2;
                        final Function0 function07 = function04;
                        return new com.yandex.plus.bdui.plus.analytics.e(hVar, bVar, new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) obj4;
                                switch (i4) {
                                    case 0:
                                        cVar.getClass();
                                        break;
                                    case 1:
                                        cVar.getClass();
                                        break;
                                    default:
                                        cVar.getClass();
                                        break;
                                }
                                return com.yandex.plus.bdui.plus.analytics.b.k(cVar, function07);
                            }
                        }, (byte) 0);
                }
            }
        });
        final int i3 = 2;
        List h = u75.h(bVar2, bVar3, new com.yandex.plus.bdui.analytics.b("Diagnostic", new Function0() { // from class: com.yandex.plus.bdui.plus.checkout.l
            /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.plus.bdui.plus.checkout.j] */
            /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.plus.bdui.plus.checkout.j] */
            /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.plus.bdui.plus.checkout.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        final int i22 = 1;
                        final Function0 function05 = function04;
                        return new com.yandex.plus.bdui.plus.analytics.g(hVar, bVar, new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) obj4;
                                switch (i22) {
                                    case 0:
                                        cVar.getClass();
                                        break;
                                    case 1:
                                        cVar.getClass();
                                        break;
                                    default:
                                        cVar.getClass();
                                        break;
                                }
                                return com.yandex.plus.bdui.plus.analytics.b.k(cVar, function05);
                            }
                        });
                    case 1:
                        final int i32 = 0;
                        final Function0 function06 = function04;
                        return new com.yandex.plus.bdui.plus.analytics.e(hVar, bVar, new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) obj4;
                                switch (i32) {
                                    case 0:
                                        cVar.getClass();
                                        break;
                                    case 1:
                                        cVar.getClass();
                                        break;
                                    default:
                                        cVar.getClass();
                                        break;
                                }
                                return com.yandex.plus.bdui.plus.analytics.b.k(cVar, function06);
                            }
                        });
                    default:
                        final int i4 = 2;
                        final Function0 function07 = function04;
                        return new com.yandex.plus.bdui.plus.analytics.e(hVar, bVar, new Function1() { // from class: com.yandex.plus.bdui.plus.checkout.j
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                com.yandex.plus.bdui.analytics.c cVar = (com.yandex.plus.bdui.analytics.c) obj4;
                                switch (i4) {
                                    case 0:
                                        cVar.getClass();
                                        break;
                                    case 1:
                                        cVar.getClass();
                                        break;
                                    default:
                                        cVar.getClass();
                                        break;
                                }
                                return com.yandex.plus.bdui.plus.analytics.b.k(cVar, function07);
                            }
                        }, (byte) 0);
                }
            }
        }), new com.yandex.plus.bdui.analytics.b("DWH", new rh1(this.d, bVar, hVar, this.f, this.g, 14)), new com.yandex.plus.bdui.analytics.b("Pulse", new os(this.h, function0, function02, function03, bVar, this.b, 4)));
        Iterable iterable = this.i;
        if (iterable == null) {
            iterable = c5b.a;
        }
        return new com.yandex.plus.bdui.plus.analytics.c(CollectionsKt.g0(h, iterable), this.j, bVar);
    }
}

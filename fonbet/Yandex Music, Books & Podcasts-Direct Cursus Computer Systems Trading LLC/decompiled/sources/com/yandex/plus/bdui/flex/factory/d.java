package com.yandex.plus.bdui.flex.factory;

import com.yandex.plus.bdui.plus.checkout.content.controller.q;
import com.yandex.plus.bdui.plus.checkout.content.controller.u;
import com.yandex.plus.bdui.plus.checkout.content.controller.x;
import com.yandex.plus.bdui.plus.checkout.content.serializer.f2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.j4;
import com.yandex.plus.bdui.plus.checkout.content.serializer.p3;
import com.yandex.plus.bdui.plus.checkout.content.serializer.z2;
import defpackage.ezc;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class d extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                com.yandex.plus.bdui.plus.checkout.content.controller.d dVar = (com.yandex.plus.bdui.plus.checkout.content.controller.d) this.receiver;
                com.yandex.plus.bdui.content.d dVar2 = dVar.f;
                com.yandex.plus.log.api.b bVar = dVar.d;
                if (dVar2 != null) {
                    com.yandex.plus.bdui.content.a aVar = dVar2.b;
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar2)) {
                        com.appsflyer.internal.k.x(new StringBuilder("closeClickListener(); dispatch close action = "), ((com.yandex.plus.bdui.plus.checkout.content.a) aVar).b, bVar, aVar2, "PlusPayAppBarContentController");
                    }
                    dVar.a.a.a(((com.yandex.plus.bdui.plus.checkout.content.a) aVar).b, new com.yandex.plus.bdui.action.h(dVar2.c), null);
                } else {
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                    if (bVar.b(aVar3)) {
                        bVar.c(aVar3, "PlusPayAppBarContentController", "closeClickListener(); update is null!");
                    }
                }
                break;
            case 22:
                com.yandex.plus.bdui.plus.checkout.content.controller.l lVar = (com.yandex.plus.bdui.plus.checkout.content.controller.l) this.receiver;
                com.yandex.plus.log.api.b bVar2 = lVar.i;
                com.yandex.plus.bdui.content.d dVar3 = lVar.l;
                if (dVar3 != null) {
                    com.yandex.plus.bdui.content.a aVar4 = dVar3.b;
                    LinkedHashMap f = lVar.f(lVar.o, null);
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar5)) {
                        bVar2.c(aVar5, "PlusPayCheckoutContentController", "onPaymentButtonClick(); dispatch next action = " + ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar4)).l + " with payload = " + f);
                    }
                    lVar.e(dVar3, ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar4)).l, f);
                } else {
                    com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.d;
                    if (bVar2.b(aVar6)) {
                        bVar2.c(aVar6, "PlusPayCheckoutContentController", "onPaymentButtonClick(); update is null!");
                    }
                }
                break;
            case 23:
                com.yandex.plus.bdui.plus.checkout.content.controller.l lVar2 = (com.yandex.plus.bdui.plus.checkout.content.controller.l) this.receiver;
                com.yandex.plus.bdui.content.d dVar4 = lVar2.l;
                com.yandex.plus.log.api.b bVar3 = lVar2.i;
                if (dVar4 != null) {
                    com.yandex.plus.bdui.content.a aVar7 = dVar4.b;
                    com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.c;
                    if (bVar3.b(aVar8)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onCloseButtonClick(); dispatch close action = "), ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar7)).m, bVar3, aVar8, "PlusPayCheckoutContentController");
                    }
                    lVar2.e(dVar4, ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar7)).m, null);
                } else {
                    com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.d;
                    if (bVar3.b(aVar9)) {
                        bVar3.c(aVar9, "PlusPayCheckoutContentController", "onCloseButtonClick(); update is null!");
                    }
                }
                break;
            case 24:
                com.yandex.plus.bdui.plus.checkout.content.controller.l lVar3 = (com.yandex.plus.bdui.plus.checkout.content.controller.l) this.receiver;
                com.yandex.plus.bdui.content.d dVar5 = lVar3.l;
                com.yandex.plus.log.api.b bVar4 = lVar3.i;
                if (dVar5 != null) {
                    com.yandex.plus.bdui.content.a aVar10 = dVar5.b;
                    com.yandex.plus.log.api.a aVar11 = com.yandex.plus.log.api.a.c;
                    if (bVar4.b(aVar11)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onLegalTextShown(); dispatch legal text shown action = "), ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar10)).n, bVar4, aVar11, "PlusPayCheckoutContentController");
                    }
                    lVar3.e(dVar5, ((f2) ((com.yandex.plus.bdui.plus.checkout.content.e) aVar10)).n, null);
                } else {
                    com.yandex.plus.log.api.a aVar12 = com.yandex.plus.log.api.a.d;
                    if (bVar4.b(aVar12)) {
                        bVar4.c(aVar12, "PlusPayCheckoutContentController", "onLegalTextShown(); update is null!");
                    }
                }
                break;
            case 25:
                q qVar = (q) this.receiver;
                com.yandex.plus.bdui.content.d dVar6 = qVar.h;
                com.yandex.plus.log.api.b bVar5 = qVar.f;
                if (dVar6 != null) {
                    com.yandex.plus.bdui.content.a aVar13 = dVar6.b;
                    com.yandex.plus.log.api.a aVar14 = com.yandex.plus.log.api.a.c;
                    if (bVar5.b(aVar14)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onCloseButtonClick(); dispatch close action = "), ((z2) ((com.yandex.plus.bdui.plus.checkout.content.h) aVar13)).k, bVar5, aVar14, "PlusPayClosingOfferContentController");
                    }
                    qVar.e(dVar6, ((z2) ((com.yandex.plus.bdui.plus.checkout.content.h) aVar13)).k);
                } else {
                    com.yandex.plus.log.api.a aVar15 = com.yandex.plus.log.api.a.d;
                    if (bVar5.b(aVar15)) {
                        bVar5.c(aVar15, "PlusPayClosingOfferContentController", "onCloseButtonClick(); update is null!");
                    }
                }
                break;
            case 26:
                q qVar2 = (q) this.receiver;
                com.yandex.plus.bdui.content.d dVar7 = qVar2.h;
                com.yandex.plus.log.api.b bVar6 = qVar2.f;
                if (dVar7 != null) {
                    com.yandex.plus.bdui.content.a aVar16 = dVar7.b;
                    com.yandex.plus.log.api.a aVar17 = com.yandex.plus.log.api.a.c;
                    if (bVar6.b(aVar17)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onPrimaryButtonClick(); dispatch next action = "), ((z2) ((com.yandex.plus.bdui.plus.checkout.content.h) aVar16)).i, bVar6, aVar17, "PlusPayClosingOfferContentController");
                    }
                    qVar2.e(dVar7, ((z2) ((com.yandex.plus.bdui.plus.checkout.content.h) aVar16)).i);
                } else {
                    com.yandex.plus.log.api.a aVar18 = com.yandex.plus.log.api.a.d;
                    if (bVar6.b(aVar18)) {
                        bVar6.c(aVar18, "PlusPayClosingOfferContentController", "onPrimaryButtonClick(); update is null!");
                    }
                }
                break;
            case 27:
                q qVar3 = (q) this.receiver;
                com.yandex.plus.bdui.content.d dVar8 = qVar3.h;
                com.yandex.plus.log.api.b bVar7 = qVar3.f;
                if (dVar8 != null) {
                    com.yandex.plus.bdui.content.a aVar19 = dVar8.b;
                    com.yandex.plus.log.api.a aVar20 = com.yandex.plus.log.api.a.c;
                    if (bVar7.b(aVar20)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onSecondaryButtonClick(); dispatch close action = "), ((z2) ((com.yandex.plus.bdui.plus.checkout.content.h) aVar19)).j, bVar7, aVar20, "PlusPayClosingOfferContentController");
                    }
                    qVar3.e(dVar8, ((z2) ((com.yandex.plus.bdui.plus.checkout.content.h) aVar19)).j);
                } else {
                    com.yandex.plus.log.api.a aVar21 = com.yandex.plus.log.api.a.d;
                    if (bVar7.b(aVar21)) {
                        bVar7.c(aVar21, "PlusPayClosingOfferContentController", "onSecondaryButtonClick(); update is null!");
                    }
                }
                break;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                u uVar = (u) this.receiver;
                com.yandex.plus.bdui.content.d dVar9 = uVar.h;
                com.yandex.plus.log.api.b bVar8 = uVar.f;
                if (dVar9 != null) {
                    com.yandex.plus.bdui.content.a aVar22 = dVar9.b;
                    com.yandex.plus.log.api.a aVar23 = com.yandex.plus.log.api.a.c;
                    if (bVar8.b(aVar23)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onCloseClick(); dispatch close action = "), ((p3) aVar22).l, bVar8, aVar23, "PlusPayCounterOffersContentController");
                    }
                    uVar.e(dVar9, ((p3) aVar22).l, null);
                } else {
                    com.yandex.plus.log.api.a aVar24 = com.yandex.plus.log.api.a.d;
                    if (bVar8.b(aVar24)) {
                        bVar8.c(aVar24, "PlusPayCounterOffersContentController", "onCloseClick(); update is null!");
                    }
                }
                break;
            default:
                x xVar = (x) this.receiver;
                com.yandex.plus.bdui.content.d dVar10 = xVar.h;
                com.yandex.plus.log.api.b bVar9 = xVar.e;
                if (dVar10 != null) {
                    com.yandex.plus.bdui.content.a aVar25 = dVar10.b;
                    com.yandex.plus.log.api.a aVar26 = com.yandex.plus.log.api.a.c;
                    if (bVar9.b(aVar26)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onPrimaryButtonClick(); dispatch primary action = "), ((j4) ((com.yandex.plus.bdui.plus.checkout.content.j) aVar25)).h, bVar9, aVar26, "PlusPayErrorContentController");
                    }
                    xVar.e(dVar10, ((j4) ((com.yandex.plus.bdui.plus.checkout.content.j) aVar25)).h);
                } else {
                    com.yandex.plus.log.api.a aVar27 = com.yandex.plus.log.api.a.d;
                    if (bVar9.b(aVar27)) {
                        bVar9.c(aVar27, "PlusPayErrorContentController", "onPrimaryButtonClick(); update is null!");
                    }
                }
                break;
        }
        return Unit.a;
    }
}

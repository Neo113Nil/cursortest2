package com.yandex.plus.bdui.plus.checkout.content.controller;

import com.yandex.plus.bdui.plus.checkout.content.serializer.g7;
import com.yandex.plus.bdui.plus.checkout.content.serializer.j4;
import com.yandex.plus.bdui.plus.checkout.content.serializer.v7;
import com.yandex.plus.bdui.plus.checkout.content.serializer.x5;
import defpackage.ezc;
import defpackage.jyr;
import defpackage.tf6;
import defpackage.vdr;
import defpackage.xdr;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class w extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0444, code lost:
    
        if (r11 == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04fb, code lost:
    
        if (r11 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
    
        if (r11 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
    
        if (r11 == null) goto L76;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        com.yandex.plus.experiments.api.a aVar;
        String str;
        com.yandex.plus.experiments.api.a aVar2;
        String str2;
        Unit unit = null;
        switch (this.a) {
            case 0:
                x xVar = (x) this.receiver;
                com.yandex.plus.log.api.b bVar = xVar.e;
                com.yandex.plus.bdui.content.d dVar = xVar.h;
                if (dVar != null) {
                    com.yandex.plus.bdui.action.a aVar3 = ((j4) ((com.yandex.plus.bdui.plus.checkout.content.j) dVar.b)).j;
                    if (aVar3 != null) {
                        com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar4)) {
                            bVar.c(aVar4, "PlusPayErrorContentController", "onSecondaryButtonClick(); dispatch secondary action = " + aVar3);
                        }
                        xVar.e(dVar, aVar3);
                        unit = Unit.a;
                        break;
                    }
                }
                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.d;
                if (bVar.b(aVar5)) {
                    bVar.c(aVar5, "PlusPayErrorContentController", "onSecondaryButtonClick(); update is null!");
                }
                return Unit.a;
            case 1:
                x xVar2 = (x) this.receiver;
                com.yandex.plus.bdui.content.d dVar2 = xVar2.h;
                com.yandex.plus.log.api.b bVar2 = xVar2.e;
                if (dVar2 != null) {
                    com.yandex.plus.bdui.content.a aVar6 = dVar2.b;
                    com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar7)) {
                        bVar2.c(aVar7, "PlusPayErrorContentController", "onCloseButtonClick(); dispatch close action = " + ((j4) ((com.yandex.plus.bdui.plus.checkout.content.j) aVar6)).k);
                    }
                    xVar2.e(dVar2, ((j4) ((com.yandex.plus.bdui.plus.checkout.content.j) aVar6)).k);
                } else {
                    com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.d;
                    if (bVar2.b(aVar8)) {
                        bVar2.c(aVar8, "PlusPayErrorContentController", "onCloseButtonClick(); update is null!");
                    }
                }
                return Unit.a;
            case 2:
                z zVar = (z) this.receiver;
                com.yandex.plus.log.api.b bVar3 = zVar.g;
                y yVar = zVar.j;
                if (yVar != null) {
                    com.yandex.plus.bdui.action.a aVar9 = yVar.a;
                    com.yandex.plus.log.api.a aVar10 = com.yandex.plus.log.api.a.c;
                    if (bVar3.b(aVar10)) {
                        bVar3.c(aVar10, "PlusPayFailureController", "onPrimaryButtonClick(); dispatch primary action = " + aVar9);
                    }
                    zVar.d(yVar, aVar9);
                } else {
                    com.yandex.plus.log.api.a aVar11 = com.yandex.plus.log.api.a.d;
                    if (bVar3.b(aVar11)) {
                        bVar3.c(aVar11, "PlusPayFailureController", "onPrimaryButtonClick(); failure info is null!");
                    }
                }
                return Unit.a;
            case 3:
                z zVar2 = (z) this.receiver;
                com.yandex.plus.log.api.b bVar4 = zVar2.g;
                y yVar2 = zVar2.j;
                if (yVar2 != null) {
                    com.yandex.plus.bdui.action.a aVar12 = yVar2.b;
                    if (aVar12 != null) {
                        com.yandex.plus.log.api.a aVar13 = com.yandex.plus.log.api.a.c;
                        if (bVar4.b(aVar13)) {
                            bVar4.c(aVar13, "PlusPayFailureController", "onSecondaryButtonClick(); dispatch secondary action = " + aVar12);
                        }
                        zVar2.d(yVar2, aVar12);
                        unit = Unit.a;
                        break;
                    }
                }
                com.yandex.plus.log.api.a aVar14 = com.yandex.plus.log.api.a.d;
                if (bVar4.b(aVar14)) {
                    bVar4.c(aVar14, "PlusPayFailureController", "onSecondaryButtonClick(); failure info is null!");
                }
                return Unit.a;
            case 4:
                z zVar3 = (z) this.receiver;
                com.yandex.plus.log.api.b bVar5 = zVar3.g;
                y yVar3 = zVar3.j;
                if (yVar3 != null) {
                    com.yandex.plus.bdui.action.a aVar15 = yVar3.c;
                    com.yandex.plus.log.api.a aVar16 = com.yandex.plus.log.api.a.c;
                    if (bVar5.b(aVar16)) {
                        bVar5.c(aVar16, "PlusPayFailureController", "onCloseButtonClick(); dispatch close action = " + aVar15);
                    }
                    zVar3.d(yVar3, aVar15);
                } else {
                    com.yandex.plus.log.api.a aVar17 = com.yandex.plus.log.api.a.d;
                    if (bVar5.b(aVar17)) {
                        bVar5.c(aVar17, "PlusPayFailureController", "onCloseButtonClick(); failure info is null!");
                    }
                }
                return Unit.a;
            case 5:
                f0 f0Var = (f0) this.receiver;
                com.yandex.plus.bdui.content.d dVar3 = f0Var.i;
                com.yandex.plus.log.api.b bVar6 = f0Var.f;
                if (dVar3 != null) {
                    com.yandex.plus.bdui.content.a aVar18 = dVar3.b;
                    com.yandex.plus.log.api.a aVar19 = com.yandex.plus.log.api.a.c;
                    if (bVar6.b(aVar19)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onCloseClick(); dispatch close action = "), ((x5) aVar18).g, bVar6, aVar19, "PlusPayPresaleContentController");
                    }
                    f0Var.f(dVar3, ((x5) aVar18).g);
                } else {
                    com.yandex.plus.log.api.a aVar20 = com.yandex.plus.log.api.a.d;
                    if (bVar6.b(aVar20)) {
                        bVar6.c(aVar20, "PlusPayPresaleContentController", "onCloseClick(); update is null!");
                    }
                }
                return Unit.a;
            case 6:
                f0 f0Var2 = (f0) this.receiver;
                com.yandex.plus.bdui.content.d dVar4 = f0Var2.i;
                com.yandex.plus.log.api.b bVar7 = f0Var2.f;
                if (dVar4 != null) {
                    com.yandex.plus.bdui.content.a aVar21 = dVar4.b;
                    com.yandex.plus.log.api.a aVar22 = com.yandex.plus.log.api.a.c;
                    if (bVar7.b(aVar22)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onSuggestedOfferButtonClick(); dispatch suggested offer click action = "), ((x5) aVar21).h, bVar7, aVar22, "PlusPayPresaleContentController");
                    }
                    f0Var2.f(dVar4, ((x5) aVar21).h);
                } else {
                    com.yandex.plus.log.api.a aVar23 = com.yandex.plus.log.api.a.d;
                    if (bVar7.b(aVar23)) {
                        bVar7.c(aVar23, "PlusPayPresaleContentController", "onSuggestedOfferButtonClick(); update is null!");
                    }
                }
                return Unit.a;
            case 7:
                f0 f0Var3 = (f0) this.receiver;
                com.yandex.plus.bdui.content.d dVar5 = f0Var3.i;
                com.yandex.plus.log.api.b bVar8 = f0Var3.f;
                if (dVar5 != null) {
                    com.yandex.plus.bdui.content.a aVar24 = dVar5.b;
                    com.yandex.plus.log.api.a aVar25 = com.yandex.plus.log.api.a.c;
                    if (bVar8.b(aVar25)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onOriginalOfferButtonClick(); dispatch original offer click action = "), ((x5) aVar24).i, bVar8, aVar25, "PlusPayPresaleContentController");
                    }
                    f0Var3.f(dVar5, ((x5) aVar24).i);
                } else {
                    com.yandex.plus.log.api.a aVar26 = com.yandex.plus.log.api.a.d;
                    if (bVar8.b(aVar26)) {
                        bVar8.c(aVar26, "PlusPayPresaleContentController", "onOriginalOfferButtonClick(); update is null!");
                    }
                }
                return Unit.a;
            case 8:
                f0 f0Var4 = (f0) this.receiver;
                com.yandex.plus.bdui.content.d dVar6 = f0Var4.i;
                com.yandex.plus.log.api.b bVar9 = f0Var4.f;
                if (dVar6 != null) {
                    com.yandex.plus.bdui.content.a aVar27 = dVar6.b;
                    com.yandex.plus.log.api.a aVar28 = com.yandex.plus.log.api.a.c;
                    if (bVar9.b(aVar28)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onLegalTextShown(); dispatch legal text shown action = "), ((x5) aVar27).j, bVar9, aVar28, "PlusPayPresaleContentController");
                    }
                    f0Var4.f(dVar6, ((x5) aVar27).j);
                } else {
                    com.yandex.plus.log.api.a aVar29 = com.yandex.plus.log.api.a.d;
                    if (bVar9.b(aVar29)) {
                        bVar9.c(aVar29, "PlusPayPresaleContentController", "onLegalTextShown(); update is null!");
                    }
                }
                return Unit.a;
            case 9:
                j0 j0Var = (j0) this.receiver;
                com.yandex.plus.bdui.content.d dVar7 = j0Var.g;
                com.yandex.plus.log.api.b bVar10 = j0Var.d;
                if (dVar7 != null) {
                    com.yandex.plus.bdui.content.a aVar30 = dVar7.b;
                    com.yandex.plus.log.api.a aVar31 = com.yandex.plus.log.api.a.c;
                    if (bVar10.b(aVar31)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onButtonClick(); dispatch action = "), ((g7) ((com.yandex.plus.bdui.plus.checkout.content.p) aVar30)).f, bVar10, aVar31, "PlusPaySuccessContentController");
                    }
                    j0Var.a.a.a(((g7) ((com.yandex.plus.bdui.plus.checkout.content.p) aVar30)).f, new com.yandex.plus.bdui.action.h(dVar7.c), null);
                } else {
                    com.yandex.plus.log.api.a aVar32 = com.yandex.plus.log.api.a.d;
                    if (bVar10.b(aVar32)) {
                        bVar10.c(aVar32, "PlusPaySuccessContentController", "onButtonClick(); update is null!");
                    }
                }
                return Unit.a;
            case 10:
                j0 j0Var2 = (j0) this.receiver;
                com.yandex.plus.bdui.content.d dVar8 = j0Var2.g;
                com.yandex.plus.log.api.b bVar11 = j0Var2.d;
                if (dVar8 != null) {
                    com.yandex.plus.bdui.content.a aVar33 = dVar8.b;
                    com.yandex.plus.log.api.a aVar34 = com.yandex.plus.log.api.a.c;
                    if (bVar11.b(aVar34)) {
                        bVar11.c(aVar34, "PlusPaySuccessContentController", "onCloseButtonClick(); dispatch close action = " + ((g7) ((com.yandex.plus.bdui.plus.checkout.content.p) aVar33)).g);
                    }
                    j0Var2.a.a.a(((g7) ((com.yandex.plus.bdui.plus.checkout.content.p) aVar33)).g, new com.yandex.plus.bdui.action.h(dVar8.c), null);
                } else {
                    com.yandex.plus.log.api.a aVar35 = com.yandex.plus.log.api.a.d;
                    if (bVar11.b(aVar35)) {
                        bVar11.c(aVar35, "PlusPaySuccessContentController", "onCloseButtonClick(); update is null!");
                    }
                }
                return Unit.a;
            case 11:
                l0 l0Var = (l0) this.receiver;
                com.yandex.plus.bdui.content.d dVar9 = l0Var.g;
                com.yandex.plus.log.api.b bVar12 = l0Var.e;
                if (dVar9 != null) {
                    com.yandex.plus.bdui.content.a aVar36 = dVar9.b;
                    com.yandex.plus.log.api.a aVar37 = com.yandex.plus.log.api.a.c;
                    if (bVar12.b(aVar37)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onUpsaleAccept(); dispatch accept action = "), ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) aVar36)).j, bVar12, aVar37, "PlusPayUpsaleContentController");
                    }
                    l0Var.d(dVar9, ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) aVar36)).j);
                } else {
                    com.yandex.plus.log.api.a aVar38 = com.yandex.plus.log.api.a.d;
                    if (bVar12.b(aVar38)) {
                        bVar12.c(aVar38, "PlusPayUpsaleContentController", "onUpsaleAccept(); update is null!");
                    }
                }
                return Unit.a;
            case 12:
                l0 l0Var2 = (l0) this.receiver;
                com.yandex.plus.bdui.content.d dVar10 = l0Var2.g;
                com.yandex.plus.log.api.b bVar13 = l0Var2.e;
                if (dVar10 != null) {
                    com.yandex.plus.bdui.content.a aVar39 = dVar10.b;
                    com.yandex.plus.log.api.a aVar40 = com.yandex.plus.log.api.a.c;
                    if (bVar13.b(aVar40)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onUpsaleReject(); dispatch reject action = "), ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) aVar39)).k, bVar13, aVar40, "PlusPayUpsaleContentController");
                    }
                    l0Var2.d(dVar10, ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) aVar39)).k);
                } else {
                    com.yandex.plus.log.api.a aVar41 = com.yandex.plus.log.api.a.d;
                    if (bVar13.b(aVar41)) {
                        bVar13.c(aVar41, "PlusPayUpsaleContentController", "onUpsaleReject(); update is null!");
                    }
                }
                return Unit.a;
            case 13:
                l0 l0Var3 = (l0) this.receiver;
                com.yandex.plus.bdui.content.d dVar11 = l0Var3.g;
                com.yandex.plus.log.api.b bVar14 = l0Var3.e;
                if (dVar11 != null) {
                    com.yandex.plus.bdui.content.a aVar42 = dVar11.b;
                    com.yandex.plus.log.api.a aVar43 = com.yandex.plus.log.api.a.c;
                    if (bVar14.b(aVar43)) {
                        com.appsflyer.internal.k.x(new StringBuilder("onLegalTextShown(); dispatch legal text shown action = "), ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) aVar42)).l, bVar14, aVar43, "PlusPayUpsaleContentController");
                    }
                    l0Var3.d(dVar11, ((v7) ((com.yandex.plus.bdui.plus.checkout.content.q) aVar42)).l);
                } else {
                    com.yandex.plus.log.api.a aVar44 = com.yandex.plus.log.api.a.d;
                    if (bVar14.b(aVar44)) {
                        bVar14.c(aVar44, "PlusPayUpsaleContentController", "onLegalTextShown(); update is null!");
                    }
                }
                return Unit.a;
            case 14:
                r0 r0Var = (r0) this.receiver;
                com.yandex.plus.log.api.b bVar15 = r0Var.f;
                q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    com.yandex.plus.bdui.action.a aVar45 = q0Var.a;
                    if (aVar45 != null) {
                        com.yandex.plus.log.api.a aVar46 = com.yandex.plus.log.api.a.c;
                        if (bVar15.b(aVar46)) {
                            bVar15.c(aVar46, "PlusPayWebFailureContentController", "onPrimaryButtonClick(); dispatch primary action = " + aVar45);
                        }
                        r0Var.a.a.a(aVar45, new com.yandex.plus.bdui.action.h(q0Var.c), null);
                        unit = Unit.a;
                        break;
                    }
                }
                com.yandex.plus.log.api.a aVar47 = com.yandex.plus.log.api.a.d;
                if (bVar15.b(aVar47)) {
                    bVar15.c(aVar47, "PlusPayWebFailureContentController", "onPrimaryButtonClick(); failure info is null!");
                }
                return Unit.a;
            case 15:
                r0 r0Var2 = (r0) this.receiver;
                com.yandex.plus.log.api.b bVar16 = r0Var2.f;
                q0 q0Var2 = r0Var2.h;
                if (q0Var2 != null) {
                    com.yandex.plus.bdui.action.a aVar48 = q0Var2.b;
                    if (aVar48 != null) {
                        com.yandex.plus.log.api.a aVar49 = com.yandex.plus.log.api.a.c;
                        if (bVar16.b(aVar49)) {
                            bVar16.c(aVar49, "PlusPayWebFailureContentController", "onSecondaryButtonClick(); dispatch secondary action = " + aVar48);
                        }
                        r0Var2.a.a.a(aVar48, new com.yandex.plus.bdui.action.h(q0Var2.c), null);
                        unit = Unit.a;
                        break;
                    }
                }
                com.yandex.plus.log.api.a aVar50 = com.yandex.plus.log.api.a.d;
                if (bVar16.b(aVar50)) {
                    bVar16.c(aVar50, "PlusPayWebFailureContentController", "onSecondaryButtonClick(); failure info is null!");
                }
                return Unit.a;
            case 16:
                return ((com.yandex.plus.metrica.utils.i) this.receiver).b();
            case 17:
                return ((com.yandex.plus.metrica.utils.i) this.receiver).a();
            case 18:
                com.yandex.plus.bdui.flex.ui.s sVar = ((com.yandex.plus.core.debug.panel.internal.presentation.controller.b) this.receiver).a;
                com.yandex.plus.bdui.plus.analytics.b.d((tf6) sVar.e);
                ((com.yandex.plus.home.feature.webviews.internal.container.t) sVar.c).r();
                return Unit.a;
            case 19:
                com.yandex.plus.bdui.flex.ui.s sVar2 = ((com.yandex.plus.core.debug.panel.internal.presentation.controller.b) this.receiver).a;
                xdr xdrVar = (xdr) sVar2.g;
                com.yandex.plus.core.debug.panel.internal.presentation.state.c cVar = new com.yandex.plus.core.debug.panel.internal.presentation.state.c((vdr) sVar2.b);
                xdrVar.getClass();
                xdrVar.m(null, cVar);
                return Unit.a;
            case 20:
                com.yandex.plus.bdui.flex.ui.s sVar3 = (com.yandex.plus.bdui.flex.ui.s) ((com.yandex.passport.sloth.ui.c) ((com.yandex.plus.core.debug.panel.internal.presentation.controller.b) this.receiver).a.d).b;
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                ReentrantLock reentrantLock = com.yandex.plus.core.analytics.logging.f.b;
                reentrantLock.lock();
                try {
                    com.yandex.plus.core.analytics.logging.f.c.clear();
                    reentrantLock.unlock();
                    sVar3.B();
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 21:
                return ((com.yandex.plus.core.analytics.d) this.receiver).d();
            case 22:
                com.yandex.plus.core.network.retrofit.client.a aVar51 = (com.yandex.plus.core.network.retrofit.client.a) this.receiver;
                aVar51.getClass();
                com.yandex.plus.core.network.okhttp.client.b bVar17 = new com.yandex.plus.core.network.okhttp.client.b(aVar51, 0);
                com.yandex.plus.core.network.okhttp.client.b bVar18 = new com.yandex.plus.core.network.okhttp.client.b(aVar51, 1);
                int i = com.yandex.plus.pay.internal.di.d.a;
                return new com.yandex.plus.core.network.impl.c(bVar17, bVar18);
            case 23:
                return ((com.yandex.plus.metrica.utils.x) ((com.yandex.plus.metrica.utils.z) this.receiver)).j();
            case 24:
                return ((com.yandex.plus.metrica.utils.x) ((com.yandex.plus.metrica.utils.z) this.receiver)).k();
            case 25:
                return ((com.yandex.plus.core.analytics.h) this.receiver).e();
            case 26:
                ((com.yandex.plus.core.benchmark.y) this.receiver).getClass();
                return Boolean.TRUE;
            case 27:
                return ((com.yandex.plus.home.graphql.plusstate.f) this.receiver).c();
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.plus.home.k kVar = ((com.yandex.plus.home.analytics.evgen.d) this.receiver).j;
                return (kVar == null || (aVar = (com.yandex.plus.experiments.api.a) kVar.invoke()) == null || (str = aVar.a) == null) ? "no_value" : str;
            default:
                com.yandex.plus.home.k kVar2 = ((com.yandex.plus.home.analytics.evgen.d) this.receiver).j;
                return (kVar2 == null || (aVar2 = (com.yandex.plus.experiments.api.a) kVar2.invoke()) == null || (str2 = aVar2.b) == null) ? "no_value" : str2;
        }
    }
}

package com.yandex.plus.home.feature.webviews.internal.webview;

import android.content.Intent;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.passport.sloth.ui.q;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.e2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.g5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.k6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.l4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.n1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.n6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.o4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.s5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.y5;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.m;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.n;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.TarifficatorBduiScenarioActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import com.yandex.plus.pay.ui.webview.paymentwidget.domain.k;
import com.yandex.plus.plaquesdk.plaque.api.models.c0;
import com.yandex.plus.plaquesdk.plaque.api.models.d0;
import com.yandex.plus.plaquesdk.plaque.api.models.g0;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import com.yandex.plus.plaquesdk.plaque.api.models.s;
import com.yandex.plus.plaquesdk.plaque.api.models.x;
import defpackage.b6e;
import defpackage.bsd;
import defpackage.c5b;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.ezc;
import defpackage.ihp;
import defpackage.inr;
import defpackage.irn;
import defpackage.kcc;
import defpackage.lhc;
import defpackage.omb;
import defpackage.ot0;
import defpackage.ouj;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.t7o;
import defpackage.u75;
import defpackage.uah;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        n1 n1Var;
        String str;
        String str2;
        Parcelable nVar;
        int i;
        Object obj2;
        boolean z;
        switch (this.a) {
            case 0:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                ((b) this.receiver).C(v1Var);
                return Unit.a;
            case 1:
                g5 g5Var = (g5) obj;
                g5Var.getClass();
                b bVar = (b) this.receiver;
                com.yandex.plus.log.api.b bVar2 = bVar.u;
                String A = bVar.A();
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                if (bVar2.b(aVar)) {
                    bVar2.c(aVar, A, "handleMetricsEvent() outMessage=" + g5Var);
                }
                com.yandex.plus.home.analytics.f fVar = bVar.h;
                String str3 = g5Var.b;
                String str4 = g5Var.c;
                fVar.getClass();
                str3.getClass();
                str4.getClass();
                com.yandex.plus.core.analytics.f fVar2 = (com.yandex.plus.core.analytics.f) fVar.b.getValue();
                if (fVar2 != null) {
                    fVar2.reportEvent(str3, str4);
                }
                return Unit.a;
            case 2:
                l4 l4Var = (l4) obj;
                l4Var.getClass();
                ((b) this.receiver).B(l4Var);
                return Unit.a;
            case 3:
                e2 e2Var = (e2) obj;
                e2Var.getClass();
                b bVar3 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar4 = bVar3.u;
                String A2 = bVar3.A();
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                if (bVar4.b(aVar2)) {
                    bVar4.c(aVar2, A2, "handleCloseCurrentWebView() outMessage=" + e2Var);
                }
                bVar3.p.o();
                return Unit.a;
            case 4:
                x4 x4Var = (x4) obj;
                x4Var.getClass();
                b bVar5 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar6 = bVar5.u;
                String A3 = bVar5.A();
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.b;
                if (bVar6.b(aVar3)) {
                    bVar6.c(aVar3, A3, "handleReady() outMessage=" + x4Var);
                }
                bVar5.e.c();
                return Unit.a;
            case 5:
                o3 o3Var = (o3) obj;
                o3Var.getClass();
                b bVar7 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar8 = bVar7.u;
                String A4 = bVar7.A();
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.b;
                if (bVar8.b(aVar4)) {
                    bVar8.c(aVar4, A4, "handleNeedAuthorization() outMessage=" + o3Var);
                }
                bVar7.p.d(o3Var);
                return Unit.a;
            case 6:
                x2 x2Var = (x2) obj;
                x2Var.getClass();
                b bVar9 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar10 = bVar9.u;
                String A5 = bVar9.A();
                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.b;
                if (bVar10.b(aVar5)) {
                    bVar10.c(aVar5, A5, "handleLogoutRequest() outMessage=" + x2Var);
                }
                bVar9.p.e(x2Var);
                return Unit.a;
            case 7:
                d5 d5Var = (d5) obj;
                d5Var.getClass();
                b bVar11 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar12 = bVar11.u;
                String A6 = bVar11.A();
                com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.b;
                if (bVar12.b(aVar6)) {
                    bVar12.c(aVar6, A6, "handleSendBroadcastEvent() outMessage=" + d5Var);
                }
                x97.y(bVar11.d, null, null, new com.yandex.plus.home.feature.webviews.internal.treasury.d(bVar11, d5Var, null, 1), 3);
                return Unit.a;
            case 8:
                s5 s5Var = (s5) obj;
                s5Var.getClass();
                b bVar13 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar14 = bVar13.u;
                String A7 = bVar13.A();
                com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.b;
                if (bVar14.b(aVar7)) {
                    bVar14.c(aVar7, A7, "handleShowServiceInfo() outMessage=" + s5Var);
                }
                bVar13.p.p(s5Var.b);
                return Unit.a;
            case 9:
                b6 b6Var = (b6) obj;
                b6Var.getClass();
                b bVar15 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar16 = bVar15.u;
                String A8 = bVar15.A();
                com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.b;
                if (bVar16.b(aVar8)) {
                    bVar16.c(aVar8, A8, "handleTreasuryStateRequest() outMessage=" + b6Var);
                }
                com.yandex.plus.home.feature.webviews.internal.treasury.e eVar = (com.yandex.plus.home.feature.webviews.internal.treasury.e) bVar15.x.getValue();
                if (eVar != null) {
                    x97.y(bVar15.d, null, null, new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(eVar, b6Var, bVar15, (Continuation) null, 2), 3);
                } else {
                    String A9 = bVar15.A();
                    if (bVar16.b(aVar8)) {
                        bVar16.c(aVar8, A9, "onMessageUnhandled() outMessage=" + b6Var + ", cause=TREASURY_ABSENT");
                    }
                    bVar15.m.b(b6Var.toString(), "TREASURY_ABSENT");
                }
                return Unit.a;
            case 10:
                y1 y1Var = (y1) obj;
                y1Var.getClass();
                b bVar17 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar18 = bVar17.u;
                String A10 = bVar17.A();
                com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.b;
                if (bVar18.b(aVar9)) {
                    bVar18.c(aVar9, A10, "handleCallbackEvent() outMessage=" + y1Var);
                }
                bVar17.p.f(y1Var.b);
                return Unit.a;
            case 11:
                o4 o4Var = (o4) obj;
                o4Var.getClass();
                b bVar19 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar20 = bVar19.u;
                String A11 = bVar19.A();
                com.yandex.plus.log.api.a aVar10 = com.yandex.plus.log.api.a.b;
                if (bVar20.b(aVar10)) {
                    bVar20.c(aVar10, A11, "handleOptionStatusRequest() outMessage=" + o4Var);
                }
                x97.y(bVar19.d, bVar19.w, null, new q(bVar19, o4Var, false, null, 9), 2);
                return Unit.a;
            case 12:
                j3 j3Var = (j3) obj;
                j3Var.getClass();
                b bVar21 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar22 = bVar21.u;
                String A12 = bVar21.A();
                com.yandex.plus.log.api.a aVar11 = com.yandex.plus.log.api.a.b;
                if (bVar22.b(aVar11)) {
                    bVar22.c(aVar11, A12, "handleVibrateRequest() outMessage=" + j3Var);
                }
                bVar21.p.q(com.yandex.plus.bdui.flex.ui.a.O(j3Var.b));
                return Unit.a;
            case 13:
                o2 o2Var = (o2) obj;
                o2Var.getClass();
                b bVar23 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar24 = bVar23.u;
                String A13 = bVar23.A();
                com.yandex.plus.log.api.a aVar12 = com.yandex.plus.log.api.a.b;
                if (bVar24.b(aVar12)) {
                    bVar24.c(aVar12, A13, "handleDisableSwipeClose() outMessage=" + o2Var);
                }
                t tVar = (t) bVar23.g;
                com.yandex.plus.log.api.b bVar25 = tVar.u;
                if (bVar25.b(aVar12)) {
                    bVar25.c(aVar12, "WebViewsControllerImpl", "disableSwipeClose()");
                }
                com.yandex.plus.home.feature.webviews.internal.container.a l = tVar.l();
                if (l != null) {
                    l.n();
                }
                return Unit.a;
            case 14:
                r2 r2Var = (r2) obj;
                r2Var.getClass();
                b bVar26 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar27 = bVar26.u;
                String A14 = bVar26.A();
                com.yandex.plus.log.api.a aVar13 = com.yandex.plus.log.api.a.b;
                if (bVar27.b(aVar13)) {
                    bVar27.c(aVar13, A14, "handleEnableSwipeClose() outMessage=" + r2Var);
                }
                t tVar2 = (t) bVar26.g;
                com.yandex.plus.log.api.b bVar28 = tVar2.u;
                if (bVar28.b(aVar13)) {
                    bVar28.c(aVar13, "WebViewsControllerImpl", "enableSwipeClose()");
                }
                com.yandex.plus.home.feature.webviews.internal.container.a l2 = tVar2.l();
                if (l2 != null) {
                    l2.m();
                }
                return Unit.a;
            case 15:
                b2 b2Var = (b2) obj;
                b2Var.getClass();
                b bVar29 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar30 = bVar29.u;
                String A15 = bVar29.A();
                com.yandex.plus.log.api.a aVar14 = com.yandex.plus.log.api.a.b;
                if (bVar30.b(aVar14)) {
                    bVar30.c(aVar14, A15, "handleChangeOptionStatusRequest() outMessage=" + b2Var);
                }
                x97.y(bVar29.d, bVar29.v, null, new inr(bVar29, b2Var, (Continuation) null, 26), 2);
                return Unit.a;
            case 16:
                k6 k6Var = (k6) obj;
                k6Var.getClass();
                b bVar31 = (b) this.receiver;
                com.yandex.plus.home.analytics.payment.e eVar2 = bVar31.n;
                com.yandex.plus.log.api.b bVar32 = bVar31.u;
                String A16 = bVar31.A();
                com.yandex.plus.log.api.a aVar15 = com.yandex.plus.log.api.a.b;
                if (bVar32.b(aVar15)) {
                    bVar32.c(aVar15, A16, "handleUserBoughtSubscription() outMessage=" + k6Var);
                }
                o oVar = bVar31.r;
                if (oVar != null) {
                    oVar.a.a(com.yandex.plus.home.api.purchase.b.a);
                }
                x97.y(bVar31.d, null, null, new com.yandex.passport.internal.ui.social.i(bVar31, null, 20), 3);
                int ordinal = bVar31.t.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1 && eVar2 != null) {
                        eVar2.R(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.b, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f.c, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.c, k6Var.b, c5b.a);
                    }
                } else if (eVar2 != null) {
                    eVar2.R(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g.a, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f.c, com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.c, k6Var.b, c5b.a);
                }
                return Unit.a;
            case 17:
                h6 h6Var = (h6) obj;
                h6Var.getClass();
                b bVar33 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar34 = bVar33.u;
                String A17 = bVar33.A();
                com.yandex.plus.log.api.a aVar16 = com.yandex.plus.log.api.a.b;
                if (bVar34.b(aVar16)) {
                    bVar34.c(aVar16, A17, "handleUpdateTargetsState() outMessage=" + h6Var);
                }
                bVar33.o.j(h6Var.b);
                return Unit.a;
            case 18:
                l2 l2Var = (l2) obj;
                l2Var.getClass();
                String str5 = l2Var.b;
                b bVar35 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar36 = bVar35.u;
                String A18 = bVar35.A();
                com.yandex.plus.log.api.a aVar17 = com.yandex.plus.log.api.a.b;
                if (bVar36.b(aVar17)) {
                    bVar36.c(aVar17, A18, "handleCriticalError() Close with critical error: " + str5);
                }
                bVar35.m.a(str5);
                bVar35.p.r(str5);
                return Unit.a;
            case 19:
                n6 n6Var = (n6) obj;
                n6Var.getClass();
                b bVar37 = (b) this.receiver;
                Function0 function0 = bVar37.q;
                if (function0 != null) {
                    String str6 = (String) function0.invoke();
                    com.yandex.plus.log.api.b bVar38 = bVar37.u;
                    String A19 = bVar37.A();
                    com.yandex.plus.log.api.a aVar18 = com.yandex.plus.log.api.a.b;
                    if (bVar38.b(aVar18)) {
                        bVar38.c(aVar18, A19, "get card info from host - handleUserCardRequest() outMessage=" + n6Var + " cardId=" + str6);
                    }
                    String str7 = n6Var.a;
                    if (str6 != null) {
                        if (StringsKt.U(str6)) {
                            str6 = null;
                        }
                        if (str6 != null) {
                            n1Var = new n1(str6);
                            bVar37.C(new o1(str7, n1Var));
                        }
                    }
                    n1Var = null;
                    bVar37.C(new o1(str7, n1Var));
                }
                return Unit.a;
            case 20:
                y5 y5Var = (y5) obj;
                y5Var.getClass();
                b bVar39 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar40 = bVar39.u;
                String A20 = bVar39.A();
                com.yandex.plus.log.api.a aVar19 = com.yandex.plus.log.api.a.b;
                if (bVar40.b(aVar19)) {
                    bVar40.c(aVar19, A20, "handleSuccessScreenShown() outMessage=" + y5Var);
                }
                bVar39.p.i(y5Var.b);
                return Unit.a;
            case 21:
                v5 v5Var = (v5) obj;
                v5Var.getClass();
                b bVar41 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar42 = bVar41.u;
                String A21 = bVar41.A();
                com.yandex.plus.log.api.a aVar20 = com.yandex.plus.log.api.a.b;
                if (bVar42.b(aVar20)) {
                    bVar42.c(aVar20, A21, "handleSuccessScreenButtonTapped() outMessage=" + v5Var);
                }
                bVar41.p.l(v5Var.b);
                return Unit.a;
            case 22:
                u3 u3Var = (u3) obj;
                u3Var.getClass();
                b bVar43 = (b) this.receiver;
                com.yandex.plus.log.api.b bVar44 = bVar43.u;
                String A22 = bVar43.A();
                com.yandex.plus.log.api.a aVar21 = com.yandex.plus.log.api.a.b;
                if (bVar44.b(aVar21)) {
                    bVar44.c(aVar21, A22, "handleOpenSmart() outMessage=" + u3Var);
                }
                bVar43.f.getClass();
                Object B = l.B(u3Var);
                r7o r7oVar = z7o.b;
                if (!(B instanceof t7o)) {
                    u.b(bVar43.g, (com.yandex.plus.home.feature.webviews.internal.uri.f) B, true, null, 60);
                }
                Throwable a = z7o.a(B);
                if (a != null) {
                    com.yandex.plus.log.api.a aVar22 = com.yandex.plus.log.api.a.e;
                    if (bVar44.b(aVar22)) {
                        bVar44.a(aVar22, "BaseCommonWebViewContract", "handleOpenSmart() error", a);
                    }
                    bVar43.m.c(u3Var.b);
                }
                return Unit.a;
            case 23:
                x xVar = (x) obj;
                xVar.getClass();
                com.yandex.plus.home.plaque.feature.internal.presentation.h hVar = (com.yandex.plus.home.plaque.feature.internal.presentation.h) this.receiver;
                hVar.getClass();
                com.yandex.plus.log.api.b bVar45 = hVar.g;
                com.yandex.plus.log.api.a aVar23 = com.yandex.plus.log.api.a.c;
                if (bVar45.b(aVar23)) {
                    bVar45.c(aVar23, "PlaqueViewModel", "onWidgetClicked()");
                }
                c0 q = xVar.q();
                y yVar = hVar.a;
                p pVar = (p) yVar.a;
                if (q != null) {
                    com.yandex.plus.home.plaque.repository.api.model.c cVar = (com.yandex.plus.home.plaque.repository.api.model.c) hVar.k.getValue();
                    com.yandex.plus.home.plaque.feature.api.context.b bVar46 = (com.yandex.plus.home.plaque.feature.api.context.b) ((xdr) pVar.d).getValue();
                    if (cVar != null) {
                        if (cVar instanceof com.yandex.plus.home.plaque.repository.api.model.a) {
                            String str8 = ((com.yandex.plus.home.plaque.repository.api.model.a) cVar).a.a;
                            str8.getClass();
                            com.yandex.plus.log.api.b bVar47 = (com.yandex.plus.log.api.b) yVar.b;
                            if (bVar47.b(aVar23)) {
                                bVar47.c(aVar23, "PlaqueContextObservableImpl", ouj.k(')', "onPlaqueInteracted(", str8));
                            }
                            Set set = (Set) pVar.c;
                            xdr xdrVar = (xdr) pVar.d;
                            while (true) {
                                Object value = xdrVar.getValue();
                                com.yandex.plus.home.plaque.feature.api.context.b bVar48 = (com.yandex.plus.home.plaque.feature.api.context.b) value;
                                set.add(str8);
                                Set set2 = set;
                                if (xdrVar.k(value, com.yandex.plus.home.plaque.feature.api.context.b.a(bVar48, uah.j(bVar48.a, new Pair("PlaquesInteracted", CollectionsKt.A0(set)))))) {
                                    str = null;
                                    x97.y(hVar.h, null, null, new com.yandex.plus.home.api.prefetch.j(hVar, cVar, q, false ? 1 : 0, 15), 3);
                                } else {
                                    set = set2;
                                }
                            }
                        } else {
                            str = null;
                        }
                        com.yandex.plus.home.dailyquests.plugin.internal.proxy.a aVar24 = hVar.d;
                        bVar46.getClass();
                        j0 b = cVar.b();
                        Map a2 = cVar.a();
                        omb ombVar = aVar24.a;
                        String str9 = b.a;
                        Object obj3 = bVar46.a.get("screen");
                        String str10 = obj3 instanceof String ? (String) obj3 : str;
                        if (str10 == null) {
                            str10 = "no_value";
                        }
                        g0 g0Var = b.c;
                        d0 d0Var = g0Var instanceof d0 ? (d0) g0Var : str;
                        String num = d0Var != null ? Integer.valueOf(d0Var.a).toString() : str;
                        str2 = num != null ? num : "no_value";
                        List a3 = com.yandex.plus.home.dailyquests.plugin.internal.proxy.a.a(b.b);
                        ArrayList arrayList = new ArrayList(v75.o(a3, 10));
                        Iterator it = a3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(com.yandex.plus.home.dailyquests.plugin.internal.proxy.a.d((s) it.next(), bVar46));
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("element_id", xVar.getId());
                        if (xVar instanceof s) {
                            linkedHashMap.put("element_type", "widget");
                            linkedHashMap.putAll(com.yandex.plus.home.dailyquests.plugin.internal.proxy.a.d((s) xVar, bVar46));
                        } else {
                            if (!(xVar instanceof com.yandex.plus.plaquesdk.plaque.api.models.o)) {
                                b6e.s();
                                return null;
                            }
                            linkedHashMap.put("element_type", "group");
                            linkedHashMap.putAll(com.yandex.plus.home.dailyquests.plugin.internal.proxy.a.c(xVar.q()));
                        }
                        ombVar.getClass();
                        str9.getClass();
                        a2.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("plaque_id", str9);
                        linkedHashMap2.put("screen", str10);
                        linkedHashMap2.put("notification_count", str2);
                        linkedHashMap2.put("widget_list", arrayList);
                        linkedHashMap2.put("metric_context", a2);
                        linkedHashMap2.put("element_clicked", linkedHashMap);
                        linkedHashMap2.put("_meta", omb.a(1, new HashMap()));
                        ombVar.d("CashbackBadge.Tapped", linkedHashMap2);
                    }
                    x97.y(hVar.n, null, null, new com.yandex.plus.home.api.prefetch.j(q, bVar46, hVar, null, 16), 3);
                }
                return Unit.a;
            case 24:
                String str11 = (String) obj;
                str11.getClass();
                ((irn) this.receiver).getClass();
                String quote = Pattern.quote(str11);
                quote.getClass();
                return quote;
            case 25:
                Function0 function02 = (Function0) obj;
                function02.getClass();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i iVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i) this.receiver;
                iVar.getClass();
                com.yandex.passport.internal.ui.common.screen.d dVar = new com.yandex.passport.internal.ui.common.screen.d(2, function02);
                k kVar = (k) iVar.A.getValue();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g gVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.g) iVar.z.getValue();
                com.yandex.plus.pay.log.impl.b bVar49 = iVar.o;
                ((com.yandex.plus.core.dispatcher.a) iVar.a().q).getClass();
                bsd bsdVar = com.yandex.plus.core.dispatcher.a.c;
                ((com.yandex.plus.core.dispatcher.a) iVar.a().q).getClass();
                return new com.yandex.plus.pay.ui.webview.paymentwidget.ui.c(dVar, kVar, gVar, bVar49, bsdVar, com.yandex.plus.core.dispatcher.a.f);
            case 26:
                return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.i) this.receiver).a().G.invoke((Continuation) obj);
            case 27:
                com.yandex.plus.bdui.l lVar = (com.yandex.plus.bdui.l) obj;
                lVar.getClass();
                TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity = (TarifficatorBduiScenarioActivity) this.receiver;
                s9f[] s9fVarArr = TarifficatorBduiScenarioActivity.g;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.u uVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.u) tarifficatorBduiScenarioActivity.d.getValue();
                com.yandex.plus.bdui.k kVar2 = lVar.a;
                Map map = lVar.b;
                if (Intrinsics.d(kVar2, com.yandex.plus.bdui.i.a)) {
                    nVar = new n(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.k(map, false));
                } else if (Intrinsics.d(kVar2, com.yandex.plus.bdui.e.a)) {
                    nVar = new n(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.i(map));
                } else {
                    boolean z2 = kVar2 instanceof com.yandex.plus.bdui.g;
                    com.yandex.plus.pay.ui.api.feature.payment.f fVar3 = com.yandex.plus.pay.ui.api.feature.payment.f.a;
                    if (z2) {
                        nVar = (((com.yandex.plus.bdui.g) kVar2).a != com.yandex.plus.bdui.f.b || uVar.l.d) ? m.a : new n(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.j(map, fVar3, false));
                    } else if (Intrinsics.d(kVar2, com.yandex.plus.bdui.d.a)) {
                        nVar = new n(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.j(map, new com.yandex.plus.pay.ui.api.feature.payment.a(com.yandex.plus.pay.api.exception.c.o), false));
                    } else if (Intrinsics.d(kVar2, com.yandex.plus.bdui.j.a)) {
                        nVar = new n(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.j(map, com.yandex.plus.pay.ui.api.feature.payment.b.a, false));
                    } else {
                        if (!(kVar2 instanceof com.yandex.plus.bdui.h)) {
                            b6e.s();
                            return null;
                        }
                        nVar = new n(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.j(map, fVar3, false));
                    }
                }
                Intent putExtra = new Intent().putExtra(CameraService.RESULT, nVar);
                putExtra.getClass();
                tarifficatorBduiScenarioActivity.setResult(-1, putExtra);
                tarifficatorBduiScenarioActivity.finish();
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar25 = (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) obj;
                aVar25.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar50 = (com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b) this.receiver;
                bVar50.getClass();
                aVar25.getClass();
                bVar50.a = aVar25;
                return Unit.a;
            default:
                String str12 = (String) obj;
                str12.getClass();
                h0 h0Var = (h0) this.receiver;
                h0Var.getClass();
                PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) h0Var.D.getValue();
                if (plusPayCompositeOfferDetails != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a4 = h0Var.l.a.a();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar = a4.b;
                    PlusPayCompositeOfferDetails.PaymentMethod a5 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.a.a(plusPayCompositeOfferDetails, str12);
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a aVar26 = h0Var.w;
                    List<PlusPayCompositeOfferDetails.PaymentMethod> allPaymentMethods = plusPayCompositeOfferDetails.getAllPaymentMethods();
                    ArrayList arrayList2 = new ArrayList(v75.o(allPaymentMethods, 10));
                    Iterator<T> it2 = allPaymentMethods.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOfferDetails.PaymentMethod) it2.next()).getId());
                    }
                    String bankName = a5 != null ? a5.getBankName() : null;
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c) aVar26;
                    cVar2.getClass();
                    PlusPayCompositeOffers.Offer offer = jVar.a;
                    cdk cdkVar = cVar2.a;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a4.a);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String str13 = id == null ? "no_value" : id;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    ArrayList arrayList3 = new ArrayList(v75.o(optionOffers, 10));
                    Iterator<T> it3 = optionOffers.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    if (arrayList2.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it4 = arrayList2.iterator();
                        i = 0;
                        while (it4.hasNext()) {
                            PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = plusPayCompositeOfferDetails;
                            String str14 = bankName;
                            if (!kotlin.text.c.v((String) it4.next(), "new", false) && (i = i + 1) < 0) {
                                u75.m();
                                throw null;
                            }
                            plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
                            bankName = str14;
                        }
                    }
                    PlusPayCompositeOfferDetails plusPayCompositeOfferDetails3 = plusPayCompositeOfferDetails;
                    String str15 = bankName;
                    boolean z3 = i > 0;
                    str2 = str15 != null ? str15 : "no_value";
                    LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar, d, "purchase_session_id", d);
                    t.put("product_id", str13);
                    dfi.u(t, "options_id", arrayList3, true, "is_tarifficator");
                    t.put("card_linked", String.valueOf(z3));
                    t.put("payment_method_id", str12);
                    t.put("bank_name", str2);
                    t.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("PaymentMethods.Clicked", t);
                    kcc kccVar = new kcc(new lhc(CollectionsKt.F(plusPayCompositeOfferDetails3.getPaymentMethodsGroups()), new com.yandex.plus.pay.ui.common.internal.error.content.b(16), ihp.a));
                    while (true) {
                        if (kccVar.hasNext()) {
                            obj2 = kccVar.next();
                            if (Intrinsics.d(((PlusPayCompositeOfferDetails.PaymentMethod) obj2).getId(), str12)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) obj2;
                    PlusPayCompositeOfferDetails.PaymentMethod.Type type = paymentMethod != null ? paymentMethod.getType() : null;
                    int i2 = type == null ? -1 : com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.offer.details.a.a[type.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                            z = true;
                            if (z) {
                                xdr xdrVar2 = h0Var.C;
                                xdrVar2.getClass();
                                xdrVar2.m(null, str12);
                            } else {
                                h0Var.K(a4);
                                x97.y(ot0.F(h0Var), null, null, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.c0(h0Var, jVar, str12, plusPayCompositeOfferDetails3, a4, null), 3);
                            }
                        } else if (i2 != 4 && i2 != 5) {
                            b6e.s();
                            return null;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
                return Unit.a;
        }
    }
}

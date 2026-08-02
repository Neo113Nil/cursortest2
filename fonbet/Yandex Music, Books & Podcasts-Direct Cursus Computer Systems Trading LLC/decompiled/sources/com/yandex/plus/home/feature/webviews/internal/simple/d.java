package com.yandex.plus.home.feature.webviews.internal.simple;

import android.webkit.WebResourceRequest;
import com.yandex.passport.data.network.l;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.stories.k;
import com.yandex.plus.home.feature.webviews.internal.stories.n;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.c4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.h2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.j5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.m5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.q6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x3;
import com.yandex.pulse.metrics.o;
import defpackage.ezc;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xdr;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class d extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((WebResourceRequest) obj).getClass();
                j jVar = (j) this.receiver;
                jVar.getClass();
                if (jVar.s.f()) {
                    break;
                }
                break;
            case 1:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                ((t) ((u) this.receiver)).m(function1);
                break;
            case 2:
                com.yandex.plus.home.feature.webviews.internalapi.toolbar.b bVar = (com.yandex.plus.home.feature.webviews.internalapi.toolbar.b) obj;
                bVar.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.toolbar.c) this.receiver).a(bVar);
                break;
            case 3:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.smart.c) this.receiver).A(v1Var);
                break;
            case 4:
                v1 v1Var2 = (v1) obj;
                v1Var2.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.smart.c) this.receiver).A(v1Var2);
                break;
            case 5:
                v1 v1Var3 = (v1) obj;
                v1Var3.getClass();
                com.yandex.plus.home.feature.webviews.internal.smart.contract.c cVar = (com.yandex.plus.home.feature.webviews.internal.smart.contract.c) this.receiver;
                cVar.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.smart.contract.a) cVar.u.getValue()).C(v1Var3);
                break;
            case 6:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                ((t) ((u) this.receiver)).m(function12);
                break;
            case 7:
                com.yandex.plus.home.feature.webviews.internalapi.toolbar.b bVar2 = (com.yandex.plus.home.feature.webviews.internalapi.toolbar.b) obj;
                bVar2.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.toolbar.c) this.receiver).a(bVar2);
                break;
            case 8:
                a5 a5Var = (a5) obj;
                a5Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.smart.contract.a aVar = (com.yandex.plus.home.feature.webviews.internal.smart.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar3 = aVar.z;
                String str = aVar.B;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                if (bVar3.b(aVar2)) {
                    bVar3.c(aVar2, str, "handleReadyForMessaging() outMessage=" + a5Var);
                }
                break;
            case 9:
                r3 r3Var = (r3) obj;
                r3Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.smart.contract.a aVar3 = (com.yandex.plus.home.feature.webviews.internal.smart.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar4 = aVar3.z;
                String str2 = aVar3.B;
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.b;
                if (bVar4.b(aVar4)) {
                    bVar4.c(aVar4, str2, "handleOpenNativeSharing() outMessage=" + r3Var);
                }
                ((t) aVar3.y).t(r3Var.b, r3Var.c, r3Var.d);
                break;
            case 10:
                x3 x3Var = (x3) obj;
                x3Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.smart.contract.a aVar5 = (com.yandex.plus.home.feature.webviews.internal.smart.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar5 = aVar5.z;
                String str3 = aVar5.B;
                com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.b;
                if (bVar5.b(aVar6)) {
                    bVar5.c(aVar6, str3, "handleOpenStoriesMessage() outMessage=" + x3Var);
                }
                aVar5.f.getClass();
                Object C = l.C(x3Var);
                r7o r7oVar = z7o.b;
                if (!(C instanceof t7o)) {
                    u.b(aVar5.y, (com.yandex.plus.home.feature.webviews.internal.uri.g) C, true, x3Var.d, 56);
                }
                Throwable a = z7o.a(C);
                if (a != null) {
                    com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.e;
                    if (bVar5.b(aVar7)) {
                        bVar5.a(aVar7, str3, "handleOpenStoriesMessage() outMessage=" + x3Var, a);
                    }
                    aVar5.A.c(x3Var.b);
                }
                break;
            case 11:
                d4 d4Var = (d4) obj;
                d4Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.smart.contract.a aVar8 = (com.yandex.plus.home.feature.webviews.internal.smart.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar6 = aVar8.z;
                String str4 = aVar8.B;
                com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.b;
                if (bVar6.b(aVar9)) {
                    bVar6.c(aVar9, str4, "handleOpenStoriesListMessage() outMessage=" + d4Var);
                }
                u uVar = aVar8.y;
                List<c4> list = d4Var.b;
                ArrayList arrayList = new ArrayList();
                for (c4 c4Var : list) {
                    aVar8.f.getClass();
                    Object D = l.D(c4Var);
                    r7o r7oVar2 = z7o.b;
                    if (!(D instanceof t7o)) {
                        D = new com.yandex.plus.home.feature.webviews.internal.stories.list.j((com.yandex.plus.home.feature.webviews.internal.uri.g) D, c4Var.b, c4Var.c);
                    }
                    Throwable a2 = z7o.a(D);
                    if (a2 != null) {
                        com.yandex.plus.log.api.a aVar10 = com.yandex.plus.log.api.a.e;
                        if (bVar6.b(aVar10)) {
                            bVar6.a(aVar10, str4, "handleOpenStoriesListMessage() outMessage=" + d4Var, a2);
                        }
                        aVar8.A.c(c4Var.a);
                        D = null;
                    }
                    com.yandex.plus.home.feature.webviews.internal.stories.list.j jVar2 = (com.yandex.plus.home.feature.webviews.internal.stories.list.j) D;
                    if (jVar2 != null) {
                        arrayList.add(jVar2);
                    }
                }
                u.a(uVar, arrayList);
                break;
            case 12:
                v1 v1Var4 = (v1) obj;
                v1Var4.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.stories.f) this.receiver).A(v1Var4);
                break;
            case 13:
                v1 v1Var5 = (v1) obj;
                v1Var5.getClass();
                ((k) this.receiver).l0(v1Var5);
                break;
            case 14:
                com.yandex.plus.home.feature.webviews.internalapi.authorization.d dVar = (com.yandex.plus.home.feature.webviews.internalapi.authorization.d) obj;
                dVar.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.g) this.receiver).e(dVar);
                break;
            case 15:
                v1 v1Var6 = (v1) obj;
                v1Var6.getClass();
                ((k) this.receiver).l0(v1Var6);
                break;
            case 16:
                com.yandex.plus.home.pay.a aVar11 = (com.yandex.plus.home.pay.a) obj;
                aVar11.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.stories.c) this.receiver).m(aVar11);
                break;
            case 17:
                com.yandex.plus.home.feature.webviews.internal.purchase.pay.common.a aVar12 = (com.yandex.plus.home.feature.webviews.internal.purchase.pay.common.a) obj;
                aVar12.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.stories.c) this.receiver).o(aVar12);
                break;
            case 18:
                v1 v1Var7 = (v1) obj;
                v1Var7.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.c cVar2 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.c) this.receiver;
                cVar2.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.stories.contract.a) cVar2.v.getValue()).C(v1Var7);
                break;
            case 19:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                ((t) ((u) this.receiver)).m(function13);
                break;
            case 20:
                r4 r4Var = (r4) obj;
                r4Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar13 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar7 = aVar13.A;
                String str5 = aVar13.B;
                com.yandex.plus.log.api.a aVar14 = com.yandex.plus.log.api.a.b;
                if (bVar7.b(aVar14)) {
                    bVar7.c(aVar14, str5, "handlePurchaseButtonShown() outMessage=" + r4Var);
                }
                n nVar = aVar13.z;
                nVar.getClass();
                k kVar = nVar.a.a;
                kVar.getClass();
                kVar.h0().i(r4Var);
                break;
            case 21:
                h2 h2Var = (h2) obj;
                h2Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar15 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar8 = aVar15.A;
                String str6 = aVar15.B;
                com.yandex.plus.log.api.a aVar16 = com.yandex.plus.log.api.a.b;
                if (bVar8.b(aVar16)) {
                    bVar8.c(aVar16, str6, "handleCloseStories() outMessage=" + h2Var);
                }
                aVar15.y.o();
                break;
            case 22:
                a5 a5Var2 = (a5) obj;
                a5Var2.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar17 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar9 = aVar17.A;
                String str7 = aVar17.B;
                com.yandex.plus.log.api.a aVar18 = com.yandex.plus.log.api.a.b;
                if (bVar9.b(aVar18)) {
                    bVar9.c(aVar18, str7, "handleReadyForMessaging() outMessage=" + a5Var2);
                }
                aVar17.z.a.a.w0.i();
                break;
            case 23:
                a3 a3Var = (a3) obj;
                a3Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar19 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar10 = aVar19.A;
                String str8 = aVar19.B;
                com.yandex.plus.log.api.a aVar20 = com.yandex.plus.log.api.a.b;
                if (bVar10.b(aVar20)) {
                    bVar10.c(aVar20, str8, "handleMiniStoryIsReadyEvent() outMessage=" + a3Var);
                }
                xdr xdrVar = aVar19.z.a.a.y0;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 24:
                j5 j5Var = (j5) obj;
                j5Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar21 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar11 = aVar21.A;
                String str9 = aVar21.B;
                com.yandex.plus.log.api.a aVar22 = com.yandex.plus.log.api.a.b;
                if (bVar11.b(aVar22)) {
                    bVar11.c(aVar22, str9, "handleShowNextStoryEvent() outMessage=" + j5Var);
                }
                aVar21.z.a.m.a(com.yandex.plus.home.feature.webviews.internal.stories.b.a);
                break;
            case 25:
                m5 m5Var = (m5) obj;
                m5Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar23 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar12 = aVar23.A;
                String str10 = aVar23.B;
                com.yandex.plus.log.api.a aVar24 = com.yandex.plus.log.api.a.b;
                if (bVar12.b(aVar24)) {
                    bVar12.c(aVar24, str10, "handleShowPrevStoryEvent() outMessage=" + m5Var);
                }
                aVar23.z.a.m.a(com.yandex.plus.home.feature.webviews.internal.stories.b.b);
                break;
            case 26:
                q6 q6Var = (q6) obj;
                q6Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar25 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar13 = aVar25.A;
                String str11 = aVar25.B;
                com.yandex.plus.log.api.a aVar26 = com.yandex.plus.log.api.a.b;
                if (bVar13.b(aVar26)) {
                    bVar13.c(aVar26, str11, "handleUserTappedSubscription() outMessage=" + q6Var);
                }
                k kVar2 = aVar25.z.a.a;
                kVar2.h0().g();
                kVar2.w.a.a(com.yandex.plus.home.api.state.a.c);
                break;
            case 27:
                p5 p5Var = (p5) obj;
                p5Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar27 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar14 = aVar27.A;
                String str12 = aVar27.B;
                com.yandex.plus.log.api.a aVar28 = com.yandex.plus.log.api.a.b;
                if (bVar14.b(aVar28)) {
                    bVar14.c(aVar28, str12, "handleShowPurchaseButton() outMessage=" + p5Var);
                }
                n nVar2 = aVar27.z;
                String str13 = p5Var.a;
                k kVar3 = nVar2.a.a;
                kVar3.h.c.e = str13;
                xdr xdrVar2 = kVar3.h0().h;
                Boolean bool2 = Boolean.TRUE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                u2 u2Var = (u2) obj;
                u2Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar29 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar15 = aVar29.A;
                String str14 = aVar29.B;
                com.yandex.plus.log.api.a aVar30 = com.yandex.plus.log.api.a.b;
                if (bVar15.b(aVar30)) {
                    bVar15.c(aVar30, str14, "handleGetProductsRequest() outMessage=" + u2Var);
                }
                aVar29.z.a.a.h0().b("GetProductsRequest");
                break;
            default:
                u4 u4Var = (u4) obj;
                u4Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.stories.contract.a aVar31 = (com.yandex.plus.home.feature.webviews.internal.stories.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar16 = aVar31.A;
                String str15 = aVar31.B;
                com.yandex.plus.log.api.a aVar32 = com.yandex.plus.log.api.a.b;
                if (bVar16.b(aVar32)) {
                    bVar16.c(aVar32, str15, "handlePurchaseProductRequest() outMessage=" + u4Var);
                }
                n nVar3 = aVar31.z;
                nVar3.getClass();
                nVar3.a.a.h0().b("PurchaseProductRequest");
                break;
        }
        return Unit.a;
    }
}

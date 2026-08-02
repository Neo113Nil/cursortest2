package com.yandex.plus.core.debug.panel.internal.presentation.controller;

import android.content.Context;
import com.appsflyer.internal.k;
import com.yandex.passport.data.network.l;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.core.debug.panel.internal.presentation.view.f;
import com.yandex.plus.core.debug.panel.internal.presentation.view.o;
import com.yandex.plus.home.feature.panel.internalapi.analytics.d;
import com.yandex.plus.home.feature.panel.internalapi.analytics.e;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.home.g;
import com.yandex.plus.home.feature.webviews.internal.home.j;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.a5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.c4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.p5;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.q6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r3;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.r4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u2;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.u4;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.v1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.x3;
import com.yandex.plus.home.repository.api.model.panel.d0;
import defpackage.as7;
import defpackage.b6e;
import defpackage.c85;
import defpackage.eta;
import defpackage.ezc;
import defpackage.lpt;
import defpackage.omb;
import defpackage.ouj;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.skb;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.ukb;
import defpackage.xdr;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04a2  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object d;
        skb skbVar;
        int ordinal;
        skb skbVar2;
        ukb ukbVar;
        switch (this.a) {
            case 0:
                ((String) obj).getClass();
                b bVar = (b) this.receiver;
                bVar.getClass();
                Iterator it = ((ArrayList) bVar.a.f).iterator();
                while (it.hasNext()) {
                    ((com.yandex.plus.core.debug.panel.internal.model.ui.a) it.next()).getClass();
                }
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                b bVar2 = (b) this.receiver;
                if (booleanValue) {
                    s sVar = bVar2.a;
                    xdr xdrVar = (xdr) sVar.g;
                    com.yandex.plus.core.debug.panel.internal.presentation.state.b bVar3 = new com.yandex.plus.core.debug.panel.internal.presentation.state.b((ArrayList) sVar.a, (ArrayList) sVar.f);
                    xdrVar.getClass();
                    xdrVar.m(null, bVar3);
                } else {
                    s sVar2 = bVar2.a;
                    com.yandex.plus.bdui.plus.analytics.b.d((tf6) sVar2.e);
                    ((t) sVar2.c).r();
                }
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                f fVar = (f) this.receiver;
                s9f[] s9fVarArr = f.t;
                Context context = fVar.getContext();
                context.getClass();
                com.yandex.plus.bdui.plus.analytics.b.g(context, str);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                o oVar = (o) this.receiver;
                s9f[] s9fVarArr2 = o.I;
                Context context2 = oVar.getContext();
                context2.getClass();
                com.yandex.plus.bdui.plus.analytics.b.g(context2, str2);
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                break;
            case 5:
                String str4 = (String) obj;
                str4.getClass();
                break;
            case 6:
                obj.getClass();
                break;
            case 7:
                obj.getClass();
                ((com.yandex.plus.divkit.utils.c) this.receiver).getClass();
                break;
            case 8:
                obj.getClass();
                break;
            case 9:
                obj.getClass();
                com.yandex.plus.divkit.utils.c cVar = (com.yandex.plus.divkit.utils.c) this.receiver;
                cVar.getClass();
                if (obj instanceof JSONArray) {
                    if (obj instanceof String) {
                        break;
                    } else {
                        JSONArray jSONArray = (JSONArray) obj;
                        ArrayList arrayList = new ArrayList(jSONArray.length());
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            Object opt = jSONArray.opt(i);
                            if (opt != null && (d = cVar.d(opt, new as7(cVar, i, 7))) != null) {
                                arrayList.add(d);
                            }
                        }
                        break;
                    }
                } else if (obj instanceof JSONObject) {
                    break;
                } else if (obj instanceof c85) {
                    break;
                } else if (obj instanceof lpt) {
                    break;
                } else if (obj.equals(Boolean.valueOf(com.yandex.plus.divkit.utils.c.e.b(obj)))) {
                    break;
                }
                break;
            case 10:
                ((com.yandex.plus.home.feature.panel.internal.f) this.receiver).b((d0) obj);
                break;
            case 11:
                com.yandex.plus.home.feature.panel.internalapi.analytics.f fVar2 = (com.yandex.plus.home.feature.panel.internalapi.analytics.f) obj;
                fVar2.getClass();
                omb ombVar = ((com.yandex.plus.home.analytics.c) this.receiver).a;
                if (fVar2 instanceof e) {
                    e eVar = (e) fVar2;
                    String str5 = eVar.a;
                    String str6 = eVar.b;
                    String str7 = eVar.c;
                    String str8 = eVar.d;
                    String str9 = eVar.f;
                    String str10 = eVar.e;
                    com.yandex.plus.home.feature.panel.internalapi.analytics.a aVar = eVar.g;
                    int i2 = aVar.b;
                    int i3 = aVar.a;
                    int i4 = aVar.d;
                    int i5 = aVar.c;
                    ombVar.getClass();
                    str9.getClass();
                    str10.getClass();
                    str8.getClass();
                    str7.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("shortcut_name", str9);
                    linkedHashMap.put("shortcut_id", str10);
                    linkedHashMap.put("section_name", str8);
                    eta.m(i2, "section_id", str7, "grid_columns_count", linkedHashMap);
                    ouj.y(i3, linkedHashMap, "grid_rows_count", i4, "shortcut_position_row");
                    k.u(i5, "shortcut_position_column", "config_id", str5, linkedHashMap);
                    linkedHashMap.put("config_name", str6);
                    linkedHashMap.put("_meta", omb.a(1, new HashMap()));
                    ombVar.d("PlusPult.Shortcut.Loaded", linkedHashMap);
                } else if (fVar2 instanceof com.yandex.plus.home.feature.panel.internalapi.analytics.c) {
                    com.yandex.plus.home.feature.panel.internalapi.analytics.c cVar2 = (com.yandex.plus.home.feature.panel.internalapi.analytics.c) fVar2;
                    String str11 = cVar2.a;
                    String str12 = cVar2.b;
                    String str13 = cVar2.c;
                    String str14 = cVar2.d;
                    String str15 = cVar2.f;
                    String str16 = cVar2.e;
                    com.yandex.plus.home.feature.panel.internalapi.analytics.a aVar2 = cVar2.g;
                    int i6 = aVar2.b;
                    int i7 = aVar2.a;
                    int i8 = aVar2.d;
                    int i9 = aVar2.c;
                    ombVar.getClass();
                    str15.getClass();
                    str16.getClass();
                    str14.getClass();
                    str13.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("shortcut_name", str15);
                    linkedHashMap2.put("shortcut_id", str16);
                    linkedHashMap2.put("section_name", str14);
                    eta.m(i6, "section_id", str13, "grid_columns_count", linkedHashMap2);
                    ouj.y(i7, linkedHashMap2, "grid_rows_count", i8, "shortcut_position_row");
                    k.u(i9, "shortcut_position_column", "config_id", str11, linkedHashMap2);
                    linkedHashMap2.put("config_name", str12);
                    linkedHashMap2.put("_meta", omb.a(1, new HashMap()));
                    ombVar.d("PlusPult.Shortcut.Shown", linkedHashMap2);
                } else if (!(fVar2 instanceof d)) {
                    b6e.s();
                    break;
                } else {
                    d dVar = (d) fVar2;
                    String str17 = dVar.a;
                    String str18 = dVar.b;
                    String str19 = dVar.c;
                    String str20 = dVar.d;
                    String str21 = dVar.f;
                    String str22 = dVar.e;
                    com.yandex.plus.home.feature.panel.internalapi.analytics.a aVar3 = dVar.g;
                    int i10 = aVar3.b;
                    int i11 = aVar3.a;
                    int i12 = aVar3.d;
                    int i13 = aVar3.c;
                    int ordinal2 = dVar.h.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            skbVar = skb.Popup;
                        } else if (ordinal2 != 2) {
                            skbVar = skb.Modal;
                        }
                        ordinal = dVar.i.ordinal();
                        if (ordinal == 0) {
                            skbVar2 = skbVar;
                            if (ordinal == 1) {
                                ukbVar = ukb.Image;
                            } else if (ordinal != 2) {
                                b6e.s();
                                break;
                            } else {
                                ukbVar = ukb.Shortcut;
                            }
                        } else {
                            skbVar2 = skbVar;
                            ukbVar = ukb.Button;
                        }
                        String str23 = dVar.j;
                        ombVar.getClass();
                        str21.getClass();
                        str22.getClass();
                        str20.getClass();
                        str19.getClass();
                        str17.getClass();
                        str18.getClass();
                        str23.getClass();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        linkedHashMap3.put("shortcut_name", str21);
                        linkedHashMap3.put("shortcut_id", str22);
                        linkedHashMap3.put("section_name", str20);
                        eta.m(i10, "section_id", str19, "grid_columns_count", linkedHashMap3);
                        ouj.y(i11, linkedHashMap3, "grid_rows_count", i12, "shortcut_position_row");
                        k.u(i13, "shortcut_position_column", "config_id", str17, linkedHashMap3);
                        linkedHashMap3.put("config_name", str18);
                        linkedHashMap3.put("action_type", skbVar2.a);
                        linkedHashMap3.put("click_area", ukbVar.a);
                        linkedHashMap3.put("link_url", str23);
                        linkedHashMap3.put("_meta", omb.a(1, new HashMap()));
                        ombVar.d("PlusPult.Shortcut.Clicked", linkedHashMap3);
                    }
                    skbVar = skb.Link;
                    ordinal = dVar.i.ordinal();
                    if (ordinal == 0) {
                    }
                    String str232 = dVar.j;
                    ombVar.getClass();
                    str21.getClass();
                    str22.getClass();
                    str20.getClass();
                    str19.getClass();
                    str17.getClass();
                    str18.getClass();
                    str232.getClass();
                    LinkedHashMap linkedHashMap32 = new LinkedHashMap();
                    linkedHashMap32.put("shortcut_name", str21);
                    linkedHashMap32.put("shortcut_id", str22);
                    linkedHashMap32.put("section_name", str20);
                    eta.m(i10, "section_id", str19, "grid_columns_count", linkedHashMap32);
                    ouj.y(i11, linkedHashMap32, "grid_rows_count", i12, "shortcut_position_row");
                    k.u(i13, "shortcut_position_column", "config_id", str17, linkedHashMap32);
                    linkedHashMap32.put("config_name", str18);
                    linkedHashMap32.put("action_type", skbVar2.a);
                    linkedHashMap32.put("click_area", ukbVar.a);
                    linkedHashMap32.put("link_url", str232);
                    linkedHashMap32.put("_meta", omb.a(1, new HashMap()));
                    ombVar.d("PlusPult.Shortcut.Clicked", linkedHashMap32);
                }
                break;
            case 12:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.home.d) this.receiver).A(v1Var);
                break;
            case 13:
                v1 v1Var2 = (v1) obj;
                v1Var2.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.home.d) this.receiver).A(v1Var2);
                break;
            case 14:
                v1 v1Var3 = (v1) obj;
                v1Var3.getClass();
                ((g) this.receiver).l0(v1Var3);
                break;
            case 15:
                com.yandex.plus.home.pay.a aVar4 = (com.yandex.plus.home.pay.a) obj;
                aVar4.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.home.a) this.receiver).m(aVar4);
                break;
            case 16:
                com.yandex.plus.home.feature.webviews.internal.purchase.pay.common.a aVar5 = (com.yandex.plus.home.feature.webviews.internal.purchase.pay.common.a) obj;
                aVar5.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.home.a) this.receiver).o(aVar5);
                break;
            case 17:
                v1 v1Var4 = (v1) obj;
                v1Var4.getClass();
                ((g) this.receiver).l0(v1Var4);
                break;
            case 18:
                com.yandex.plus.home.feature.webviews.internalapi.authorization.d dVar2 = (com.yandex.plus.home.feature.webviews.internalapi.authorization.d) obj;
                dVar2.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f) this.receiver).e(dVar2);
                break;
            case 19:
                v1 v1Var5 = (v1) obj;
                v1Var5.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.c cVar3 = (com.yandex.plus.home.feature.webviews.internal.home.contract.c) this.receiver;
                cVar3.getClass();
                ((com.yandex.plus.home.feature.webviews.internal.home.contract.a) cVar3.u.getValue()).C(v1Var5);
                break;
            case 20:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                ((t) ((u) this.receiver)).m(function1);
                break;
            case 21:
                a5 a5Var = (a5) obj;
                a5Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.a aVar6 = (com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar4 = aVar6.B;
                String str24 = aVar6.C;
                com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.b;
                if (bVar4.b(aVar7)) {
                    bVar4.c(aVar7, str24, "handleReadyForMessaging() outMessage=" + a5Var);
                }
                aVar6.y.a.a.C0.i();
                break;
            case 22:
                q6 q6Var = (q6) obj;
                q6Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.a aVar8 = (com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar5 = aVar8.B;
                String str25 = aVar8.C;
                com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.b;
                if (bVar5.b(aVar9)) {
                    bVar5.c(aVar9, str25, "handleUserTappedSubscription() outMessage=" + q6Var);
                }
                g gVar = aVar8.y.a.a;
                gVar.h0().g();
                gVar.o.a.a(com.yandex.plus.home.api.state.a.c);
                break;
            case 23:
                p5 p5Var = (p5) obj;
                p5Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.a aVar10 = (com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar6 = aVar10.B;
                String str26 = aVar10.C;
                com.yandex.plus.log.api.a aVar11 = com.yandex.plus.log.api.a.b;
                if (bVar6.b(aVar11)) {
                    bVar6.c(aVar11, str26, "handleShowPurchaseButton() outMessage=" + p5Var);
                }
                j jVar = aVar10.y;
                String str27 = p5Var.a;
                g gVar2 = jVar.a.a;
                gVar2.h.e = str27;
                xdr xdrVar2 = gVar2.h0().h;
                Boolean bool = Boolean.TRUE;
                xdrVar2.getClass();
                xdrVar2.m(null, bool);
                break;
            case 24:
                u2 u2Var = (u2) obj;
                u2Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.a aVar12 = (com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar7 = aVar12.B;
                String str28 = aVar12.C;
                com.yandex.plus.log.api.a aVar13 = com.yandex.plus.log.api.a.b;
                if (bVar7.b(aVar13)) {
                    bVar7.c(aVar13, str28, "handleGetProductsRequest() outMessage=" + u2Var);
                }
                aVar12.y.a.a.h0().b("GetProductsRequest");
                break;
            case 25:
                u4 u4Var = (u4) obj;
                u4Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.a aVar14 = (com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar8 = aVar14.B;
                String str29 = aVar14.C;
                com.yandex.plus.log.api.a aVar15 = com.yandex.plus.log.api.a.b;
                if (bVar8.b(aVar15)) {
                    bVar8.c(aVar15, str29, "handlePurchaseProductRequest() outMessage=" + u4Var);
                }
                j jVar2 = aVar14.y;
                jVar2.getClass();
                jVar2.a.a.h0().b("PurchaseProductRequest");
                break;
            case 26:
                r4 r4Var = (r4) obj;
                r4Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.a aVar16 = (com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar9 = aVar16.B;
                String str30 = aVar16.C;
                com.yandex.plus.log.api.a aVar17 = com.yandex.plus.log.api.a.b;
                if (bVar9.b(aVar17)) {
                    bVar9.c(aVar17, str30, "handlePurchaseButtonShown() outMessage=" + r4Var);
                }
                j jVar3 = aVar16.y;
                jVar3.getClass();
                g gVar3 = jVar3.a.a;
                gVar3.getClass();
                gVar3.h0().i(r4Var);
                break;
            case 27:
                r3 r3Var = (r3) obj;
                r3Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.a aVar18 = (com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar10 = aVar18.B;
                String str31 = aVar18.C;
                com.yandex.plus.log.api.a aVar19 = com.yandex.plus.log.api.a.b;
                if (bVar10.b(aVar19)) {
                    bVar10.c(aVar19, str31, "handleOpenNativeSharing() outMessage=" + r3Var);
                }
                ((t) aVar18.z).t(r3Var.b, r3Var.c, r3Var.d);
                break;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                x3 x3Var = (x3) obj;
                x3Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.a aVar20 = (com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar11 = aVar20.B;
                String str32 = aVar20.C;
                com.yandex.plus.log.api.a aVar21 = com.yandex.plus.log.api.a.b;
                if (bVar11.b(aVar21)) {
                    bVar11.c(aVar21, str32, "handleOpenStoriesMessage() outMessage=" + x3Var);
                }
                aVar20.f.getClass();
                Object C = l.C(x3Var);
                r7o r7oVar = z7o.b;
                if (!(C instanceof t7o)) {
                    u.b(aVar20.z, (com.yandex.plus.home.feature.webviews.internal.uri.g) C, true, x3Var.d, 56);
                }
                Throwable a = z7o.a(C);
                if (a != null) {
                    com.yandex.plus.log.api.a aVar22 = com.yandex.plus.log.api.a.e;
                    if (bVar11.b(aVar22)) {
                        bVar11.a(aVar22, str32, "handleOpenStoriesMessage() outMessage=" + x3Var, a);
                    }
                    aVar20.A.c(x3Var.b);
                }
                break;
            default:
                d4 d4Var = (d4) obj;
                d4Var.getClass();
                com.yandex.plus.home.feature.webviews.internal.home.contract.a aVar23 = (com.yandex.plus.home.feature.webviews.internal.home.contract.a) this.receiver;
                com.yandex.plus.log.api.b bVar12 = aVar23.B;
                String str33 = aVar23.C;
                com.yandex.plus.log.api.a aVar24 = com.yandex.plus.log.api.a.b;
                if (bVar12.b(aVar24)) {
                    bVar12.c(aVar24, str33, "handleOpenStoriesListMessage() outMessage=" + d4Var);
                }
                u uVar = aVar23.z;
                List<c4> list = d4Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (c4 c4Var : list) {
                    aVar23.f.getClass();
                    Object D = l.D(c4Var);
                    r7o r7oVar2 = z7o.b;
                    if (!(D instanceof t7o)) {
                        D = new com.yandex.plus.home.feature.webviews.internal.stories.list.j((com.yandex.plus.home.feature.webviews.internal.uri.g) D, c4Var.b, c4Var.c);
                    }
                    Throwable a2 = z7o.a(D);
                    if (a2 != null) {
                        com.yandex.plus.log.api.a aVar25 = com.yandex.plus.log.api.a.e;
                        if (bVar12.b(aVar25)) {
                            bVar12.a(aVar25, str33, "handleOpenStoriesListMessage() outMessage=" + d4Var, a2);
                        }
                        aVar23.A.c(c4Var.a);
                        D = null;
                    }
                    com.yandex.plus.home.feature.webviews.internal.stories.list.j jVar4 = (com.yandex.plus.home.feature.webviews.internal.stories.list.j) D;
                    if (jVar4 != null) {
                        arrayList2.add(jVar4);
                    }
                }
                u.a(uVar, arrayList2);
                break;
        }
        return Unit.a;
    }
}

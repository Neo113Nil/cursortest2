package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivText$Image$Accessibility;
import com.yandex.div2.DivText$Image$IndexingDirection;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.h2;
import com.yandex.div2.o;
import com.yandex.div2.v2;
import com.yandex.div2.x2;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class udk implements qfy0 {
    public final /* synthetic */ int a;
    public final JsonParserComponent b;

    public /* synthetic */ udk(JsonParserComponent jsonParserComponent, int i) {
        this.a = i;
        this.b = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v50, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v60, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v66, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v68, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v72, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v81, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v89, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r1v98, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.qfy0
    public final Object a(yf90 yf90Var, hex hexVar, JSONObject jSONObject) {
        int i = this.a;
        JsonParserComponent jsonParserComponent = this.b;
        switch (i) {
            case 0:
                vdk vdkVar = (vdk) hexVar;
                exq exqVar = vdkVar.a;
                tms tmsVar = wm11.b;
                tls tlsVar = b.h;
                dac dacVar = o.g;
                kvo kvoVar = o.a;
                ?? n = xcx.n(yf90Var, exqVar, jSONObject, "duration", tmsVar, tlsVar, dacVar, kvoVar);
                kvo kvoVar2 = n == 0 ? kvoVar : n;
                exq exqVar2 = vdkVar.b;
                sms smsVar = wm11.d;
                tls tlsVar2 = b.g;
                Expression l = xcx.l(yf90Var, exqVar2, jSONObject, "end_value", smsVar, tlsVar2);
                exq exqVar3 = vdkVar.c;
                qkj qkjVar = o.e;
                tls tlsVar3 = DivAnimationInterpolator.FROM_STRING;
                kvo kvoVar3 = o.b;
                ?? o = xcx.o(yf90Var, exqVar3, jSONObject, "interpolator", qkjVar, tlsVar3, kvoVar3);
                kvo kvoVar4 = o == 0 ? kvoVar3 : o;
                List s = xcx.s(yf90Var, vdkVar.d, jSONObject, "items", jsonParserComponent.B1, jsonParserComponent.z1);
                Expression d = xcx.d(yf90Var, vdkVar.e, jSONObject, "name", o.f, DivAnimation$Name.FROM_STRING);
                pkk pkkVar = (pkk) xcx.h(yf90Var, vdkVar.f, jSONObject, "repeat", jsonParserComponent.G2, jsonParserComponent.E2);
                if (pkkVar == null) {
                    pkkVar = o.c;
                }
                pkk pkkVar2 = pkkVar;
                exq exqVar4 = vdkVar.g;
                dac dacVar2 = o.h;
                kvo kvoVar5 = o.d;
                ?? n2 = xcx.n(yf90Var, exqVar4, jSONObject, "start_delay", tmsVar, tlsVar, dacVar2, kvoVar5);
                if (n2 != 0) {
                    kvoVar5 = n2;
                }
                return new pdk(kvoVar2, l, kvoVar4, s, d, pkkVar2, kvoVar5, xcx.l(yf90Var, vdkVar.h, jSONObject, "start_value", smsVar, tlsVar2));
            case 1:
                vgk vgkVar = (vgk) hexVar;
                Expression m = xcx.m(yf90Var, vgkVar.a, jSONObject, "corner_radius", wm11.b, b.h, tgk.b);
                jkk jkkVar = (jkk) xcx.h(yf90Var, vgkVar.b, jSONObject, "corners_radius", jsonParserComponent.D2, jsonParserComponent.B2);
                exq exqVar5 = vgkVar.c;
                wms wmsVar = wm11.a;
                tls tlsVar4 = b.f;
                kvo kvoVar6 = tgk.a;
                ?? o2 = xcx.o(yf90Var, exqVar5, jSONObject, "has_shadow", wmsVar, tlsVar4, kvoVar6);
                if (o2 != 0) {
                    kvoVar6 = o2;
                }
                return new DivBorder(m, jkkVar, kvoVar6, (m8l) xcx.h(yf90Var, vgkVar.d, jSONObject, "shadow", jsonParserComponent.e7, jsonParserComponent.c7), (bcl) xcx.h(yf90Var, vgkVar.e, jSONObject, "stroke", jsonParserComponent.a8, jsonParserComponent.Y7));
            case 2:
                dkk dkkVar = (dkk) hexVar;
                DivEdgeInsets divEdgeInsets = (DivEdgeInsets) xcx.h(yf90Var, dkkVar.a, jSONObject, "margins", jsonParserComponent.i3, jsonParserComponent.g3);
                exq exqVar6 = dkkVar.b;
                wms wmsVar2 = wm11.a;
                tls tlsVar5 = b.f;
                kvo kvoVar7 = ckk.a;
                ?? o3 = xcx.o(yf90Var, exqVar6, jSONObject, "show_at_end", wmsVar2, tlsVar5, kvoVar7);
                kvo kvoVar8 = o3 == 0 ? kvoVar7 : o3;
                exq exqVar7 = dkkVar.c;
                kvo kvoVar9 = ckk.b;
                ?? o4 = xcx.o(yf90Var, exqVar7, jSONObject, "show_at_start", wmsVar2, tlsVar5, kvoVar9);
                kvo kvoVar10 = o4 == 0 ? kvoVar9 : o4;
                exq exqVar8 = dkkVar.d;
                kvo kvoVar11 = ckk.c;
                ?? o5 = xcx.o(yf90Var, exqVar8, jSONObject, "show_between", wmsVar2, tlsVar5, kvoVar11);
                if (o5 != 0) {
                    kvoVar11 = o5;
                }
                return new vjk(divEdgeInsets, kvoVar8, kvoVar10, kvoVar11, (aok) xcx.b(yf90Var, dkkVar.e, jSONObject, "style", jsonParserComponent.f3, jsonParserComponent.d3));
            case 3:
                mbl mblVar = (mbl) hexVar;
                exq exqVar9 = mblVar.a;
                i3y i3yVar = jsonParserComponent.B1;
                i3y i3yVar2 = jsonParserComponent.z1;
                return new cbl((pdk) xcx.h(yf90Var, exqVar9, jSONObject, "animation_in", i3yVar, i3yVar2), (pdk) xcx.h(yf90Var, mblVar.b, jSONObject, "animation_out", jsonParserComponent.B1, i3yVar2), (m3k) xcx.h(yf90Var, mblVar.c, jSONObject, "div", jsonParserComponent.Z9, jsonParserComponent.X9), (String) xcx.a(mblVar.d, jSONObject, StateEntry.COLUMN_STATE_ID, q5z.c, q5z.b), xcx.s(yf90Var, mblVar.e, jSONObject, "swipe_out_actions", jsonParserComponent.v1, jsonParserComponent.t1));
            case 4:
                xcl xclVar = (xcl) hexVar;
                Expression d2 = xcx.d(yf90Var, xclVar.a, jSONObject, "color", wm11.f, b.b);
                gcl gclVar = (gcl) xcx.h(yf90Var, xclVar.b, jSONObject, "style", jsonParserComponent.X7, jsonParserComponent.V7);
                if (gclVar == null) {
                    gclVar = h2.a;
                }
                gcl gclVar2 = gclVar;
                exq exqVar10 = xclVar.c;
                qkj qkjVar2 = h2.d;
                tls tlsVar6 = DivSizeUnit.FROM_STRING;
                kvo kvoVar12 = h2.b;
                ?? o6 = xcx.o(yf90Var, exqVar10, jSONObject, "unit", qkjVar2, tlsVar6, kvoVar12);
                kvo kvoVar13 = o6 == 0 ? kvoVar12 : o6;
                exq exqVar11 = xclVar.d;
                sms smsVar2 = wm11.d;
                tls tlsVar7 = b.g;
                i8l i8lVar = h2.e;
                kvo kvoVar14 = h2.c;
                ?? n3 = xcx.n(yf90Var, exqVar11, jSONObject, "width", smsVar2, tlsVar7, i8lVar, kvoVar14);
                if (n3 != 0) {
                    kvoVar14 = n3;
                }
                return new bcl(d2, gclVar2, kvoVar13, kvoVar14);
            case 5:
                rhl rhlVar = (rhl) hexVar;
                return new afl(xcx.c(yf90Var, rhlVar.d, jSONObject, "text", wm11.c), xcx.s(yf90Var, rhlVar.a, jSONObject, "actions", jsonParserComponent.v1, jsonParserComponent.t1), xcx.s(yf90Var, rhlVar.b, jSONObject, "images", jsonParserComponent.S8, jsonParserComponent.Q8), xcx.s(yf90Var, rhlVar.c, jSONObject, "ranges", jsonParserComponent.P8, jsonParserComponent.N8));
            case 6:
                shl shlVar = (shl) hexVar;
                exq exqVar12 = shlVar.a;
                i3y i3yVar3 = jsonParserComponent.V8;
                i3y i3yVar4 = jsonParserComponent.E3;
                i3y i3yVar5 = jsonParserComponent.G3;
                DivText$Image$Accessibility divText$Image$Accessibility = (DivText$Image$Accessibility) xcx.h(yf90Var, exqVar12, jSONObject, "accessibility", i3yVar3, jsonParserComponent.T8);
                exq exqVar13 = shlVar.b;
                qkj qkjVar3 = v2.g;
                tls tlsVar8 = DivTextAlignmentVertical.FROM_STRING;
                kvo kvoVar15 = v2.a;
                ?? o7 = xcx.o(yf90Var, exqVar13, jSONObject, "alignment_vertical", qkjVar3, tlsVar8, kvoVar15);
                kvo kvoVar16 = o7 == 0 ? kvoVar15 : o7;
                sqk sqkVar = (sqk) xcx.h(yf90Var, shlVar.c, jSONObject, "height", i3yVar5, i3yVar4);
                if (sqkVar == null) {
                    sqkVar = v2.b;
                }
                sqk sqkVar2 = sqkVar;
                exq exqVar14 = shlVar.d;
                qkj qkjVar4 = v2.h;
                tls tlsVar9 = DivText$Image$IndexingDirection.FROM_STRING;
                kvo kvoVar17 = v2.c;
                ?? o8 = xcx.o(yf90Var, exqVar14, jSONObject, "indexing_direction", qkjVar4, tlsVar9, kvoVar17);
                kvo kvoVar18 = o8 == 0 ? kvoVar17 : o8;
                exq exqVar15 = shlVar.e;
                wms wmsVar3 = wm11.a;
                tls tlsVar10 = b.f;
                kvo kvoVar19 = v2.d;
                ?? o9 = xcx.o(yf90Var, exqVar15, jSONObject, "preload_required", wmsVar3, tlsVar10, kvoVar19);
                kvo kvoVar20 = o9 == 0 ? kvoVar19 : o9;
                Expression e = xcx.e(yf90Var, shlVar.f, jSONObject, "start", wm11.b, b.h, v2.j);
                Expression l2 = xcx.l(yf90Var, shlVar.g, jSONObject, "tint_color", wm11.f, b.b);
                exq exqVar16 = shlVar.h;
                qkj qkjVar5 = v2.i;
                tls tlsVar11 = DivBlendMode.FROM_STRING;
                kvo kvoVar21 = v2.e;
                ?? o10 = xcx.o(yf90Var, exqVar16, jSONObject, "tint_mode", qkjVar5, tlsVar11, kvoVar21);
                if (o10 != 0) {
                    kvoVar21 = o10;
                }
                Expression d3 = xcx.d(yf90Var, shlVar.i, jSONObject, "url", wm11.e, b.e);
                sqk sqkVar3 = (sqk) xcx.h(yf90Var, shlVar.j, jSONObject, "width", i3yVar5, i3yVar4);
                if (sqkVar3 == null) {
                    sqkVar3 = v2.f;
                }
                return new cfl(divText$Image$Accessibility, kvoVar16, sqkVar2, kvoVar18, kvoVar20, e, l2, kvoVar21, d3, sqkVar3);
            default:
                thl thlVar = (thl) hexVar;
                List s2 = xcx.s(yf90Var, thlVar.a, jSONObject, "actions", jsonParserComponent.v1, jsonParserComponent.t1);
                Expression l3 = xcx.l(yf90Var, thlVar.b, jSONObject, "alignment_vertical", x2.d, DivTextAlignmentVertical.FROM_STRING);
                agl aglVar = (agl) xcx.h(yf90Var, thlVar.c, jSONObject, C0553n3.g, jsonParserComponent.v8, jsonParserComponent.t8);
                exq exqVar17 = thlVar.d;
                sms smsVar3 = wm11.d;
                tls tlsVar12 = b.g;
                kvo kvoVar22 = x2.a;
                ?? o11 = xcx.o(yf90Var, exqVar17, jSONObject, "baseline_offset", smsVar3, tlsVar12, kvoVar22);
                kvo kvoVar23 = o11 == 0 ? kvoVar22 : o11;
                hgl hglVar = (hgl) xcx.h(yf90Var, thlVar.e, jSONObject, "border", jsonParserComponent.y8, jsonParserComponent.w8);
                exq exqVar18 = thlVar.f;
                tms tmsVar2 = wm11.b;
                tls tlsVar13 = b.h;
                Expression m2 = xcx.m(yf90Var, exqVar18, jSONObject, "end", tmsVar2, tlsVar13, x2.i);
                exq exqVar19 = thlVar.g;
                ums umsVar = wm11.c;
                Expression k = xcx.k(yf90Var, exqVar19, jSONObject, "font_family", umsVar);
                Expression k2 = xcx.k(yf90Var, thlVar.h, jSONObject, "font_feature_settings", umsVar);
                Expression m3 = xcx.m(yf90Var, thlVar.i, jSONObject, "font_size", tmsVar2, tlsVar13, x2.j);
                exq exqVar20 = thlVar.j;
                qkj qkjVar6 = x2.e;
                tls tlsVar14 = DivSizeUnit.FROM_STRING;
                kvo kvoVar24 = x2.b;
                ?? o12 = xcx.o(yf90Var, exqVar20, jSONObject, "font_size_unit", qkjVar6, tlsVar14, kvoVar24);
                kvo kvoVar25 = o12 == 0 ? kvoVar24 : o12;
                Expression k3 = xcx.k(yf90Var, thlVar.k, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h);
                Expression l4 = xcx.l(yf90Var, thlVar.l, jSONObject, FontsContractCompat$Columns.WEIGHT, x2.f, DivFontWeight.FROM_STRING);
                Expression m4 = xcx.m(yf90Var, thlVar.m, jSONObject, "font_weight_value", tmsVar2, tlsVar13, x2.k);
                Expression l5 = xcx.l(yf90Var, thlVar.n, jSONObject, "letter_spacing", smsVar3, tlsVar12);
                Expression m5 = xcx.m(yf90Var, thlVar.o, jSONObject, "line_height", tmsVar2, tlsVar13, x2.l);
                pgl pglVar = (pgl) xcx.h(yf90Var, thlVar.p, jSONObject, "mask", jsonParserComponent.J8, jsonParserComponent.H8);
                exq exqVar21 = thlVar.q;
                i8l i8lVar2 = x2.m;
                kvo kvoVar26 = x2.c;
                ?? n4 = xcx.n(yf90Var, exqVar21, jSONObject, "start", tmsVar2, tlsVar13, i8lVar2, kvoVar26);
                if (n4 != 0) {
                    kvoVar26 = n4;
                }
                exq exqVar22 = thlVar.r;
                qkj qkjVar7 = x2.g;
                tls tlsVar15 = DivLineStyle.FROM_STRING;
                return new dfl(s2, l3, aglVar, kvoVar23, hglVar, m2, k, k2, m3, kvoVar25, k3, l4, m4, l5, m5, pglVar, kvoVar26, xcx.l(yf90Var, exqVar22, jSONObject, "strike", qkjVar7, tlsVar15), xcx.l(yf90Var, thlVar.s, jSONObject, "text_color", wm11.f, b.b), (m8l) xcx.h(yf90Var, thlVar.t, jSONObject, "text_shadow", jsonParserComponent.e7, jsonParserComponent.c7), xcx.m(yf90Var, thlVar.u, jSONObject, "top_offset", tmsVar2, tlsVar13, x2.n), xcx.l(yf90Var, thlVar.v, jSONObject, "underline", x2.h, tlsVar15));
        }
    }
}

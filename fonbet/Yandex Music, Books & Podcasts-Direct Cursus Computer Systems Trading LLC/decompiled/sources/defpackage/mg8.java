package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mg8 implements u8s {
    public final /* synthetic */ int a;
    public final t6f b;

    public /* synthetic */ mg8(t6f t6fVar, int i) {
        this.a = i;
        this.b = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v43, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v81, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v92, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v116, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v123, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v125, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v127, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v139, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v141, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v146, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v165, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v180, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v185, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v187, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v189, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v195, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v197, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v199, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v205, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v207, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v209, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v219, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v22, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v225, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v227, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v231, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v242, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v25, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v250, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v259, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v267, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v28, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v3, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v36, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v43, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v58, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v60, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v62, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v70, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v79, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v83, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v86, types: [szb] */
    @Override // defpackage.u8s
    public final Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        List T;
        switch (this.a) {
            case 0:
                pj8 pj8Var = (pj8) d7fVar;
                c9c c9cVar = pj8Var.a;
                t6f t6fVar = this.b;
                zw8 zw8Var = (zw8) h4a.K(t7kVar, c9cVar, jSONObject, "download_callbacks", t6fVar.d3, t6fVar.b3);
                c9c c9cVar2 = pj8Var.b;
                ox8 ox8Var = vct.a;
                kzj kzjVar = kzj.B;
                ozb ozbVar = ng8.a;
                ?? P = h4a.P(t7kVar, c9cVar2, jSONObject, "is_enabled", ox8Var, kzjVar, ozbVar);
                if (P != 0) {
                    ozbVar = P;
                }
                szb F = h4a.F(t7kVar, pj8Var.c, jSONObject, "log_id", vct.c);
                c9c c9cVar3 = pj8Var.d;
                px8 px8Var = vct.e;
                kzj kzjVar2 = kzj.C;
                szb O = h4a.O(t7kVar, c9cVar3, jSONObject, "log_url", px8Var, kzjVar2);
                List V = h4a.V(t7kVar, pj8Var.e, jSONObject, "menu_items", t6fVar.y1, t6fVar.w1);
                c9c c9cVar4 = pj8Var.f;
                s3f s3fVar = bcx.i;
                return new bd8(zw8Var, ozbVar, F, O, V, (JSONObject) h4a.L(c9cVar4, t7kVar, "payload", s3fVar, jSONObject), h4a.O(t7kVar, pj8Var.g, jSONObject, "referer", px8Var, kzjVar2), (String) h4a.L(pj8Var.h, t7kVar, "scope_id", s3fVar, jSONObject), h4a.O(t7kVar, pj8Var.i, jSONObject, "target", ng8.b, va8.x), (uk8) h4a.K(t7kVar, pj8Var.j, jSONObject, "typed", t6fVar.m1, t6fVar.k1), h4a.O(t7kVar, pj8Var.k, jSONObject, "url", px8Var, kzjVar2));
            case 1:
                oj8 oj8Var = (oj8) d7fVar;
                c9c c9cVar5 = oj8Var.a;
                t6f t6fVar2 = this.b;
                jyr jyrVar = t6fVar2.v1;
                jyr jyrVar2 = t6fVar2.t1;
                return new zc8((bd8) h4a.K(t7kVar, c9cVar5, jSONObject, Constants.KEY_ACTION, jyrVar, jyrVar2), h4a.V(t7kVar, oj8Var.b, jSONObject, "actions", t6fVar2.v1, jyrVar2), h4a.F(t7kVar, oj8Var.c, jSONObject, "text", vct.c));
            case 2:
                mj8 mj8Var = (mj8) d7fVar;
                c9c c9cVar6 = mj8Var.a;
                t6f t6fVar3 = this.b;
                List V2 = h4a.V(t7kVar, c9cVar6, jSONObject, "headers", t6fVar3.g1, t6fVar3.e1);
                c9c c9cVar7 = mj8Var.b;
                tct tctVar = kj8.b;
                va8 va8Var = va8.I;
                ozb ozbVar2 = kj8.a;
                ?? P2 = h4a.P(t7kVar, c9cVar7, jSONObject, "method", tctVar, va8Var, ozbVar2);
                if (P2 != 0) {
                    ozbVar2 = P2;
                }
                return new bj8(V2, ozbVar2, h4a.G(t7kVar, mj8Var.c, jSONObject, "url", vct.e, kzj.C));
            case 3:
                ym8 ym8Var = (ym8) d7fVar;
                c9c c9cVar8 = ym8Var.a;
                ox8 ox8Var2 = vct.b;
                kzj kzjVar3 = kzj.F;
                lc8 lc8Var = xm8.g;
                ozb ozbVar3 = xm8.a;
                ?? R = h4a.R(t7kVar, c9cVar8, jSONObject, "duration", ox8Var2, kzjVar3, lc8Var, ozbVar3);
                ozb ozbVar4 = R == 0 ? ozbVar3 : R;
                c9c c9cVar9 = ym8Var.b;
                ox8 ox8Var3 = vct.d;
                kzj kzjVar4 = kzj.E;
                szb O2 = h4a.O(t7kVar, c9cVar9, jSONObject, "end_value", ox8Var3, kzjVar4);
                c9c c9cVar10 = ym8Var.c;
                tct tctVar2 = xm8.e;
                qm8 qm8Var = qm8.v;
                ozb ozbVar5 = xm8.b;
                ?? P3 = h4a.P(t7kVar, c9cVar10, jSONObject, "interpolator", tctVar2, qm8Var, ozbVar5);
                ozb ozbVar6 = P3 == 0 ? ozbVar5 : P3;
                c9c c9cVar11 = ym8Var.d;
                t6f t6fVar4 = this.b;
                List V3 = h4a.V(t7kVar, c9cVar11, jSONObject, "items", t6fVar4.B1, t6fVar4.z1);
                szb G = h4a.G(t7kVar, ym8Var.e, jSONObject, "name", xm8.f, va8.B0);
                lu8 lu8Var = (lu8) h4a.K(t7kVar, ym8Var.f, jSONObject, "repeat", t6fVar4.G2, t6fVar4.E2);
                if (lu8Var == null) {
                    lu8Var = xm8.c;
                }
                lu8 lu8Var2 = lu8Var;
                c9c c9cVar12 = ym8Var.g;
                lc8 lc8Var2 = xm8.h;
                ozb ozbVar7 = xm8.d;
                ?? R2 = h4a.R(t7kVar, c9cVar12, jSONObject, "start_delay", ox8Var2, kzjVar3, lc8Var2, ozbVar7);
                if (R2 != 0) {
                    ozbVar7 = R2;
                }
                return new sm8(ozbVar4, O2, ozbVar6, V3, G, lu8Var2, ozbVar7, h4a.O(t7kVar, ym8Var.h, jSONObject, "start_value", ox8Var3, kzjVar4));
            case 4:
                aq8 aq8Var = (aq8) d7fVar;
                szb Q = h4a.Q(t7kVar, aq8Var.a, jSONObject, "corner_radius", vct.b, kzj.F, xp8.b);
                c9c c9cVar13 = aq8Var.b;
                t6f t6fVar5 = this.b;
                fu8 fu8Var = (fu8) h4a.K(t7kVar, c9cVar13, jSONObject, "corners_radius", t6fVar5.D2, t6fVar5.B2);
                c9c c9cVar14 = aq8Var.c;
                ox8 ox8Var4 = vct.a;
                kzj kzjVar5 = kzj.B;
                ozb ozbVar8 = xp8.a;
                ?? P4 = h4a.P(t7kVar, c9cVar14, jSONObject, "has_shadow", ox8Var4, kzjVar5, ozbVar8);
                if (P4 != 0) {
                    ozbVar8 = P4;
                }
                return new op8(Q, fu8Var, ozbVar8, (dj9) h4a.K(t7kVar, aq8Var.d, jSONObject, "shadow", t6fVar5.g7, t6fVar5.e7), (ln9) h4a.K(t7kVar, aq8Var.e, jSONObject, "stroke", t6fVar5.c8, t6fVar5.a8));
            case 5:
                wr8 wr8Var = (wr8) d7fVar;
                szb F2 = h4a.F(t7kVar, wr8Var.a, jSONObject, "data", vct.g);
                String str = (String) h4a.L(wr8Var.b, t7kVar, "data_element_name", bcx.i, jSONObject);
                if (str == null) {
                    str = "it";
                }
                String str2 = str;
                c9c c9cVar15 = wr8Var.c;
                t6f t6fVar6 = this.b;
                return new pr8(F2, str2, h4a.J(t7kVar, c9cVar15, jSONObject, "prototypes", t6fVar6.r2, t6fVar6.p2, vq2.o));
            case 6:
                vr8 vr8Var = (vr8) d7fVar;
                c9c c9cVar16 = vr8Var.a;
                t6f t6fVar7 = this.b;
                jc8 jc8Var = (jc8) h4a.D(t7kVar, c9cVar16, jSONObject, "div", t6fVar7.ca, t6fVar7.aa);
                szb N = h4a.N(t7kVar, vr8Var.b, jSONObject, ConnectableDevice.KEY_ID, vct.c);
                c9c c9cVar17 = vr8Var.c;
                ox8 ox8Var5 = vct.a;
                kzj kzjVar6 = kzj.B;
                ozb ozbVar9 = ur8.a;
                ?? P5 = h4a.P(t7kVar, c9cVar17, jSONObject, "selector", ox8Var5, kzjVar6, ozbVar9);
                if (P5 != 0) {
                    ozbVar9 = P5;
                }
                return new or8(jc8Var, N, ozbVar9);
            case 7:
                zt8 zt8Var = (zt8) d7fVar;
                c9c c9cVar18 = zt8Var.a;
                t6f t6fVar8 = this.b;
                ix8 ix8Var = (ix8) h4a.K(t7kVar, c9cVar18, jSONObject, "margins", t6fVar8.j3, t6fVar8.h3);
                c9c c9cVar19 = zt8Var.b;
                ox8 ox8Var6 = vct.a;
                kzj kzjVar7 = kzj.B;
                ozb ozbVar10 = yt8.a;
                ?? P6 = h4a.P(t7kVar, c9cVar19, jSONObject, "show_at_end", ox8Var6, kzjVar7, ozbVar10);
                ozb ozbVar11 = P6 == 0 ? ozbVar10 : P6;
                c9c c9cVar20 = zt8Var.c;
                ozb ozbVar12 = yt8.b;
                ?? P7 = h4a.P(t7kVar, c9cVar20, jSONObject, "show_at_start", ox8Var6, kzjVar7, ozbVar12);
                ozb ozbVar13 = P7 == 0 ? ozbVar12 : P7;
                c9c c9cVar21 = zt8Var.d;
                ozb ozbVar14 = yt8.c;
                ?? P8 = h4a.P(t7kVar, c9cVar21, jSONObject, "show_between", ox8Var6, kzjVar7, ozbVar14);
                if (P8 != 0) {
                    ozbVar14 = P8;
                }
                return new ht8(ix8Var, ozbVar11, ozbVar13, ozbVar14, (dx8) h4a.D(t7kVar, zt8Var.e, jSONObject, "style", t6fVar8.g3, t6fVar8.e3));
            case 8:
                fw8 fw8Var = (fw8) d7fVar;
                c9c c9cVar22 = fw8Var.a;
                t6f t6fVar9 = this.b;
                List V4 = h4a.V(t7kVar, c9cVar22, jSONObject, "functions", t6fVar9.W3, t6fVar9.U3);
                String str3 = (String) h4a.C(fw8Var.b, jSONObject, "log_id", bcx.i, bcx.h);
                List J = h4a.J(t7kVar, fw8Var.c, jSONObject, "states", t6fVar9.R2, t6fVar9.P2, yv8.c);
                List V5 = h4a.V(t7kVar, fw8Var.d, jSONObject, "timers", t6fVar9.d9, t6fVar9.b9);
                c9c c9cVar23 = fw8Var.e;
                tct tctVar3 = yv8.b;
                vq9 vq9Var = vq9.x0;
                ozb ozbVar15 = yv8.a;
                ?? P9 = h4a.P(t7kVar, c9cVar23, jSONObject, "transition_animation_selector", tctVar3, vq9Var, ozbVar15);
                if (P9 != 0) {
                    ozbVar15 = P9;
                }
                return new rv8(V4, str3, J, V5, ozbVar15, h4a.V(t7kVar, fw8Var.f, jSONObject, "variable_triggers", t6fVar9.E9, t6fVar9.C9), h4a.V(t7kVar, fw8Var.g, jSONObject, "variables", t6fVar9.K9, t6fVar9.I9), null);
            case 9:
                ew8 ew8Var = (ew8) d7fVar;
                c9c c9cVar24 = ew8Var.a;
                t6f t6fVar10 = this.b;
                return new qv8((jc8) h4a.D(t7kVar, c9cVar24, jSONObject, "div", t6fVar10.ca, t6fVar10.aa), ((Number) h4a.C(ew8Var.b, jSONObject, "state_id", kzj.F, bcx.h)).longValue());
            case 10:
                yw8 yw8Var = (yw8) d7fVar;
                c9c c9cVar25 = yw8Var.a;
                ox8 ox8Var7 = vct.b;
                kzj kzjVar8 = kzj.F;
                lc8 lc8Var3 = xw8.e;
                ozb ozbVar16 = xw8.a;
                ?? R3 = h4a.R(t7kVar, c9cVar25, jSONObject, "disappear_duration", ox8Var7, kzjVar8, lc8Var3, ozbVar16);
                ozb ozbVar17 = R3 == 0 ? ozbVar16 : R3;
                c9c c9cVar26 = yw8Var.b;
                t6f t6fVar11 = this.b;
                zw8 zw8Var2 = (zw8) h4a.K(t7kVar, c9cVar26, jSONObject, "download_callbacks", t6fVar11.d3, t6fVar11.b3);
                c9c c9cVar27 = yw8Var.c;
                ox8 ox8Var8 = vct.a;
                kzj kzjVar9 = kzj.B;
                ozb ozbVar18 = xw8.b;
                ?? P10 = h4a.P(t7kVar, c9cVar27, jSONObject, "is_enabled", ox8Var8, kzjVar9, ozbVar18);
                ozb ozbVar19 = P10 == 0 ? ozbVar18 : P10;
                szb F3 = h4a.F(t7kVar, yw8Var.d, jSONObject, "log_id", vct.c);
                c9c c9cVar28 = yw8Var.e;
                uw8 uw8Var = xw8.f;
                ozb ozbVar20 = xw8.c;
                ?? R4 = h4a.R(t7kVar, c9cVar28, jSONObject, "log_limit", ox8Var7, kzjVar8, uw8Var, ozbVar20);
                ozb ozbVar21 = R4 == 0 ? ozbVar20 : R4;
                c9c c9cVar29 = yw8Var.f;
                s3f s3fVar2 = bcx.i;
                JSONObject jSONObject2 = (JSONObject) h4a.L(c9cVar29, t7kVar, "payload", s3fVar2, jSONObject);
                c9c c9cVar30 = yw8Var.g;
                px8 px8Var2 = vct.e;
                kzj kzjVar10 = kzj.C;
                szb O3 = h4a.O(t7kVar, c9cVar30, jSONObject, "referer", px8Var2, kzjVar10);
                String str4 = (String) h4a.L(yw8Var.h, t7kVar, "scope_id", s3fVar2, jSONObject);
                uk8 uk8Var = (uk8) h4a.K(t7kVar, yw8Var.i, jSONObject, "typed", t6fVar11.m1, t6fVar11.k1);
                szb O4 = h4a.O(t7kVar, yw8Var.j, jSONObject, "url", px8Var2, kzjVar10);
                c9c c9cVar31 = yw8Var.k;
                uw8 uw8Var2 = xw8.g;
                ozb ozbVar22 = xw8.d;
                ?? R5 = h4a.R(t7kVar, c9cVar31, jSONObject, "visibility_percentage", ox8Var7, kzjVar8, uw8Var2, ozbVar22);
                return new tw8(uk8Var, zw8Var2, ozbVar17, ozbVar19, F3, ozbVar21, O3, O4, R5 == 0 ? ozbVar22 : R5, str4, jSONObject2);
            case 11:
                cx8 cx8Var = (cx8) d7fVar;
                c9c c9cVar32 = cx8Var.a;
                t6f t6fVar12 = this.b;
                jyr jyrVar3 = t6fVar12.v1;
                jyr jyrVar4 = t6fVar12.t1;
                return new zw8(h4a.V(t7kVar, c9cVar32, jSONObject, "on_fail_actions", jyrVar3, jyrVar4), h4a.V(t7kVar, cx8Var.b, jSONObject, "on_success_actions", t6fVar12.v1, jyrVar4));
            case 12:
                d09 d09Var = (d09) d7fVar;
                c9c c9cVar33 = d09Var.a;
                t6f t6fVar13 = this.b;
                List V6 = h4a.V(t7kVar, c9cVar33, jSONObject, C0479n3.g, t6fVar13.Q1, t6fVar13.O1);
                op8 op8Var = (op8) h4a.K(t7kVar, d09Var.b, jSONObject, "border", t6fVar13.W1, t6fVar13.U1);
                vz8 vz8Var = (vz8) h4a.K(t7kVar, d09Var.c, jSONObject, "next_focus_ids", t6fVar13.Q3, t6fVar13.O3);
                c9c c9cVar34 = d09Var.d;
                jyr jyrVar5 = t6fVar13.v1;
                jyr jyrVar6 = t6fVar13.t1;
                return new wz8(V6, op8Var, vz8Var, h4a.V(t7kVar, c9cVar34, jSONObject, "on_blur", jyrVar5, jyrVar6), h4a.V(t7kVar, d09Var.e, jSONObject, "on_focus", jyrVar5, jyrVar6));
            case 13:
                n09 n09Var = (n09) d7fVar;
                c9c c9cVar35 = n09Var.a;
                t6f t6fVar14 = this.b;
                jyr jyrVar7 = t6fVar14.T3;
                jyr jyrVar8 = t6fVar14.R3;
                if (c9cVar35.b && jSONObject.has("arguments")) {
                    T = etn.T(t7kVar, jSONObject, "arguments", jyrVar8);
                } else {
                    int i = c9cVar35.a;
                    if (i == 2) {
                        List list = (List) ((a9c) c9cVar35).c;
                        int size = list.size();
                        ArrayList arrayList = new ArrayList(size);
                        u8s u8sVar = (u8s) jyrVar7.getValue();
                        for (int i2 = 0; i2 < size; i2++) {
                            Object M = h4a.M(t7kVar, (d7f) list.get(i2), jSONObject, u8sVar);
                            if (M != null) {
                                arrayList.add(M);
                            }
                        }
                        T = arrayList;
                    } else {
                        if (i != 3) {
                            throw a8k.g("arguments", jSONObject);
                        }
                        T = etn.T(t7kVar, jSONObject, ((z8c) c9cVar35).c, jyrVar8);
                    }
                }
                c9c c9cVar36 = n09Var.b;
                s3f s3fVar3 = bcx.i;
                ns9 ns9Var = bcx.h;
                return new g09(T, (String) h4a.C(c9cVar36, jSONObject, "body", s3fVar3, ns9Var), (String) h4a.C(n09Var.c, jSONObject, "name", s3fVar3, sk3.g), (nx8) h4a.C(n09Var.d, jSONObject, "return_type", vv8.v, ns9Var));
            case 14:
                ed9 ed9Var = (ed9) d7fVar;
                String str5 = (String) h4a.C(ed9Var.a, jSONObject, ConnectableDevice.KEY_ID, bcx.i, bcx.h);
                c9c c9cVar37 = ed9Var.b;
                t6f t6fVar15 = this.b;
                return new uc9(str5, h4a.V(t7kVar, c9cVar37, jSONObject, "items", t6fVar15.ca, t6fVar15.aa));
            case 15:
                fd9 fd9Var = (fd9) d7fVar;
                c9c c9cVar38 = fd9Var.a;
                t6f t6fVar16 = this.b;
                jyr jyrVar9 = t6fVar16.S5;
                jyr jyrVar10 = t6fVar16.t1;
                jyr jyrVar11 = t6fVar16.v1;
                List J2 = h4a.J(t7kVar, c9cVar38, jSONObject, "changes", jyrVar9, t6fVar16.Q5, cd9.c);
                c9c c9cVar39 = fd9Var.b;
                tct tctVar4 = cd9.b;
                i49 i49Var = i49.z0;
                ozb ozbVar23 = cd9.a;
                ?? P11 = h4a.P(t7kVar, c9cVar39, jSONObject, "mode", tctVar4, i49Var, ozbVar23);
                if (P11 != 0) {
                    ozbVar23 = P11;
                }
                return new wc9(ozbVar23, J2, h4a.V(t7kVar, fd9Var.c, jSONObject, "on_applied_actions", jyrVar11, jyrVar10), h4a.V(t7kVar, fd9Var.d, jSONObject, "on_failed_actions", jyrVar11, jyrVar10));
            case 16:
                ef9 ef9Var = (ef9) d7fVar;
                c9c c9cVar40 = ef9Var.a;
                t6f t6fVar17 = this.b;
                jyr jyrVar12 = t6fVar17.X2;
                jyr jyrVar13 = t6fVar17.V2;
                return new bf9((ow8) h4a.D(t7kVar, c9cVar40, jSONObject, "x", jyrVar12, jyrVar13), (ow8) h4a.D(t7kVar, ef9Var.b, jSONObject, "y", t6fVar17.X2, jyrVar13));
            case 17:
                hj9 hj9Var = (hj9) d7fVar;
                c9c c9cVar41 = hj9Var.a;
                ox8 ox8Var9 = vct.d;
                kzj kzjVar11 = kzj.E;
                mb9 mb9Var = gj9.d;
                ozb ozbVar24 = gj9.a;
                ?? R6 = h4a.R(t7kVar, c9cVar41, jSONObject, "alpha", ox8Var9, kzjVar11, mb9Var, ozbVar24);
                ozb ozbVar25 = R6 == 0 ? ozbVar24 : R6;
                c9c c9cVar42 = hj9Var.b;
                ox8 ox8Var10 = vct.b;
                kzj kzjVar12 = kzj.F;
                mb9 mb9Var2 = gj9.e;
                ozb ozbVar26 = gj9.b;
                ?? R7 = h4a.R(t7kVar, c9cVar42, jSONObject, "blur", ox8Var10, kzjVar12, mb9Var2, ozbVar26);
                if (R7 != 0) {
                    ozbVar26 = R7;
                }
                c9c c9cVar43 = hj9Var.c;
                ox8 ox8Var11 = vct.f;
                kzj kzjVar13 = kzj.G;
                ozb ozbVar27 = gj9.c;
                ?? P12 = h4a.P(t7kVar, c9cVar43, jSONObject, "color", ox8Var11, kzjVar13, ozbVar27);
                if (P12 != 0) {
                    ozbVar27 = P12;
                }
                c9c c9cVar44 = hj9Var.d;
                t6f t6fVar18 = this.b;
                return new dj9(ozbVar25, ozbVar26, ozbVar27, (bf9) h4a.D(t7kVar, c9cVar44, jSONObject, "offset", t6fVar18.n6, t6fVar18.l6));
            case 18:
                ql9 ql9Var = (ql9) d7fVar;
                c9c c9cVar45 = ql9Var.a;
                ox8 ox8Var12 = vct.b;
                kzj kzjVar14 = kzj.F;
                szb O5 = h4a.O(t7kVar, c9cVar45, jSONObject, "end", ox8Var12, kzjVar14);
                c9c c9cVar46 = ql9Var.b;
                t6f t6fVar19 = this.b;
                ix8 ix8Var2 = (ix8) h4a.K(t7kVar, c9cVar46, jSONObject, "margins", t6fVar19.j3, t6fVar19.h3);
                szb O6 = h4a.O(t7kVar, ql9Var.c, jSONObject, "start", ox8Var12, kzjVar14);
                c9c c9cVar47 = ql9Var.d;
                jyr jyrVar14 = t6fVar19.g3;
                jyr jyrVar15 = t6fVar19.e3;
                return new xk9(O5, ix8Var2, O6, (dx8) h4a.K(t7kVar, c9cVar47, jSONObject, "track_active_style", jyrVar14, jyrVar15), (dx8) h4a.K(t7kVar, ql9Var.e, jSONObject, "track_inactive_style", jyrVar14, jyrVar15));
            case 19:
                rl9 rl9Var = (rl9) d7fVar;
                szb N2 = h4a.N(t7kVar, rl9Var.a, jSONObject, "font_family", vct.c);
                c9c c9cVar48 = rl9Var.b;
                ox8 ox8Var13 = vct.b;
                kzj kzjVar15 = kzj.F;
                mb9 mb9Var3 = vl9.g;
                ozb ozbVar28 = vl9.a;
                ?? R8 = h4a.R(t7kVar, c9cVar48, jSONObject, "font_size", ox8Var13, kzjVar15, mb9Var3, ozbVar28);
                if (R8 != 0) {
                    ozbVar28 = R8;
                }
                c9c c9cVar49 = rl9Var.c;
                tct tctVar5 = vl9.e;
                gd9 gd9Var = gd9.w0;
                ozb ozbVar29 = vl9.b;
                ?? P13 = h4a.P(t7kVar, c9cVar49, jSONObject, "font_size_unit", tctVar5, gd9Var, ozbVar29);
                ozb ozbVar30 = P13 == 0 ? ozbVar29 : P13;
                szb N3 = h4a.N(t7kVar, rl9Var.d, jSONObject, "font_variation_settings", vct.h);
                szb O7 = h4a.O(t7kVar, rl9Var.e, jSONObject, "font_weight", vl9.f, vv8.B);
                szb Q2 = h4a.Q(t7kVar, rl9Var.f, jSONObject, "font_weight_value", ox8Var13, kzjVar15, vl9.h);
                c9c c9cVar50 = rl9Var.g;
                ox8 ox8Var14 = vct.d;
                kzj kzjVar16 = kzj.E;
                ozb ozbVar31 = vl9.c;
                ?? P14 = h4a.P(t7kVar, c9cVar50, jSONObject, "letter_spacing", ox8Var14, kzjVar16, ozbVar31);
                ozb ozbVar32 = P14 == 0 ? ozbVar31 : P14;
                c9c c9cVar51 = rl9Var.h;
                t6f t6fVar20 = this.b;
                bf9 bf9Var = (bf9) h4a.K(t7kVar, c9cVar51, jSONObject, "offset", t6fVar20.n6, t6fVar20.l6);
                c9c c9cVar52 = rl9Var.i;
                ox8 ox8Var15 = vct.f;
                kzj kzjVar17 = kzj.G;
                ozb ozbVar33 = vl9.d;
                ?? P15 = h4a.P(t7kVar, c9cVar52, jSONObject, "text_color", ox8Var15, kzjVar17, ozbVar33);
                return new yk9(N2, ozbVar28, ozbVar30, N3, O7, Q2, ozbVar32, bf9Var, P15 == 0 ? ozbVar33 : P15);
            case 20:
                sm9 sm9Var = (sm9) d7fVar;
                c9c c9cVar53 = sm9Var.a;
                t6f t6fVar21 = this.b;
                jyr jyrVar16 = t6fVar21.B1;
                jyr jyrVar17 = t6fVar21.z1;
                return new cm9((sm8) h4a.K(t7kVar, c9cVar53, jSONObject, "animation_in", jyrVar16, jyrVar17), (sm8) h4a.K(t7kVar, sm9Var.b, jSONObject, "animation_out", t6fVar21.B1, jyrVar17), (jc8) h4a.K(t7kVar, sm9Var.c, jSONObject, "div", t6fVar21.ca, t6fVar21.aa), (String) h4a.C(sm9Var.d, jSONObject, "state_id", bcx.i, bcx.h), h4a.V(t7kVar, sm9Var.e, jSONObject, "swipe_out_actions", t6fVar21.v1, t6fVar21.t1));
            case 21:
                io9 io9Var = (io9) d7fVar;
                szb G2 = h4a.G(t7kVar, io9Var.a, jSONObject, "color", vct.f, kzj.G);
                c9c c9cVar54 = io9Var.b;
                t6f t6fVar22 = this.b;
                rn9 rn9Var = (rn9) h4a.K(t7kVar, c9cVar54, jSONObject, "style", t6fVar22.Z7, t6fVar22.X7);
                if (rn9Var == null) {
                    rn9Var = on9.a;
                }
                rn9 rn9Var2 = rn9Var;
                c9c c9cVar55 = io9Var.c;
                tct tctVar6 = on9.d;
                gd9 gd9Var2 = gd9.w0;
                ozb ozbVar34 = on9.b;
                ?? P16 = h4a.P(t7kVar, c9cVar55, jSONObject, "unit", tctVar6, gd9Var2, ozbVar34);
                ozb ozbVar35 = P16 == 0 ? ozbVar34 : P16;
                c9c c9cVar56 = io9Var.d;
                ox8 ox8Var16 = vct.d;
                kzj kzjVar18 = kzj.E;
                hm9 hm9Var = on9.e;
                ozb ozbVar36 = on9.c;
                ?? R9 = h4a.R(t7kVar, c9cVar56, jSONObject, CameraProperty.WIDTH, ox8Var16, kzjVar18, hm9Var, ozbVar36);
                if (R9 != 0) {
                    ozbVar36 = R9;
                }
                return new ln9(G2, rn9Var2, ozbVar35, ozbVar36);
            case 22:
                sp9 sp9Var = (sp9) d7fVar;
                c9c c9cVar57 = sp9Var.a;
                t6f t6fVar23 = this.b;
                return new ro9((jc8) h4a.D(t7kVar, c9cVar57, jSONObject, "div", t6fVar23.ca, t6fVar23.aa), h4a.F(t7kVar, sp9Var.b, jSONObject, "title", vct.c), (bd8) h4a.K(t7kVar, sp9Var.c, jSONObject, "title_click_action", t6fVar23.v1, t6fVar23.t1));
            case 23:
                tp9 tp9Var = (tp9) d7fVar;
                c9c c9cVar58 = tp9Var.a;
                t6f t6fVar24 = this.b;
                jyr jyrVar18 = t6fVar24.H3;
                jyr jyrVar19 = t6fVar24.F3;
                jz8 jz8Var = (jz8) h4a.K(t7kVar, c9cVar58, jSONObject, CameraProperty.HEIGHT, jyrVar18, jyrVar19);
                if (jz8Var == null) {
                    jz8Var = op9.a;
                }
                jz8 jz8Var2 = jz8Var;
                szb G3 = h4a.G(t7kVar, tp9Var.b, jSONObject, "image_url", vct.e, kzj.C);
                jz8 jz8Var3 = (jz8) h4a.K(t7kVar, tp9Var.c, jSONObject, CameraProperty.WIDTH, t6fVar24.H3, jyrVar19);
                if (jz8Var3 == null) {
                    jz8Var3 = op9.b;
                }
                return new so9(jz8Var2, G3, jz8Var3);
            case 24:
                up9 up9Var = (up9) d7fVar;
                c9c c9cVar59 = up9Var.a;
                ox8 ox8Var17 = vct.f;
                kzj kzjVar19 = kzj.G;
                ozb ozbVar37 = rp9.a;
                ?? P17 = h4a.P(t7kVar, c9cVar59, jSONObject, "active_background_color", ox8Var17, kzjVar19, ozbVar37);
                ozb ozbVar38 = P17 == 0 ? ozbVar37 : P17;
                c9c c9cVar60 = up9Var.b;
                px8 px8Var3 = vct.h;
                szb N4 = h4a.N(t7kVar, c9cVar60, jSONObject, "active_font_variation_settings", px8Var3);
                c9c c9cVar61 = up9Var.c;
                tct tctVar7 = rp9.l;
                vv8 vv8Var = vv8.B;
                szb O8 = h4a.O(t7kVar, c9cVar61, jSONObject, "active_font_weight", tctVar7, vv8Var);
                c9c c9cVar62 = up9Var.d;
                ox8 ox8Var18 = vct.b;
                kzj kzjVar20 = kzj.F;
                szb Q3 = h4a.Q(t7kVar, c9cVar62, jSONObject, "active_font_weight_value", ox8Var18, kzjVar20, rp9.q);
                c9c c9cVar63 = up9Var.e;
                ozb ozbVar39 = rp9.b;
                ?? P18 = h4a.P(t7kVar, c9cVar63, jSONObject, "active_text_color", ox8Var17, kzjVar19, ozbVar39);
                ozb ozbVar40 = P18 == 0 ? ozbVar39 : P18;
                c9c c9cVar64 = up9Var.f;
                hm9 hm9Var2 = rp9.r;
                ozb ozbVar41 = rp9.c;
                ?? R10 = h4a.R(t7kVar, c9cVar64, jSONObject, "animation_duration", ox8Var18, kzjVar20, hm9Var2, ozbVar41);
                ozb ozbVar42 = R10 == 0 ? ozbVar41 : R10;
                c9c c9cVar65 = up9Var.g;
                tct tctVar8 = rp9.m;
                rk9 rk9Var = rk9.H;
                ozb ozbVar43 = rp9.d;
                ?? P19 = h4a.P(t7kVar, c9cVar65, jSONObject, "animation_type", tctVar8, rk9Var, ozbVar43);
                ozb ozbVar44 = P19 == 0 ? ozbVar43 : P19;
                szb Q4 = h4a.Q(t7kVar, up9Var.h, jSONObject, "corner_radius", ox8Var18, kzjVar20, rp9.s);
                c9c c9cVar66 = up9Var.i;
                t6f t6fVar25 = this.b;
                fu8 fu8Var2 = (fu8) h4a.K(t7kVar, c9cVar66, jSONObject, "corners_radius", t6fVar25.D2, t6fVar25.B2);
                szb N5 = h4a.N(t7kVar, up9Var.j, jSONObject, "font_family", vct.c);
                c9c c9cVar67 = up9Var.k;
                hm9 hm9Var3 = rp9.t;
                ozb ozbVar45 = rp9.e;
                ?? R11 = h4a.R(t7kVar, c9cVar67, jSONObject, "font_size", ox8Var18, kzjVar20, hm9Var3, ozbVar45);
                ozb ozbVar46 = R11 == 0 ? ozbVar45 : R11;
                c9c c9cVar68 = up9Var.l;
                tct tctVar9 = rp9.n;
                gd9 gd9Var3 = gd9.w0;
                ozb ozbVar47 = rp9.f;
                ?? P20 = h4a.P(t7kVar, c9cVar68, jSONObject, "font_size_unit", tctVar9, gd9Var3, ozbVar47);
                ozb ozbVar48 = P20 == 0 ? ozbVar47 : P20;
                c9c c9cVar69 = up9Var.m;
                tct tctVar10 = rp9.o;
                ozb ozbVar49 = rp9.g;
                ?? P21 = h4a.P(t7kVar, c9cVar69, jSONObject, "font_weight", tctVar10, vv8Var, ozbVar49);
                ozb ozbVar50 = P21 == 0 ? ozbVar49 : P21;
                szb O9 = h4a.O(t7kVar, up9Var.n, jSONObject, "inactive_background_color", ox8Var17, kzjVar19);
                szb N6 = h4a.N(t7kVar, up9Var.o, jSONObject, "inactive_font_variation_settings", px8Var3);
                szb O10 = h4a.O(t7kVar, up9Var.p, jSONObject, "inactive_font_weight", rp9.p, vv8Var);
                szb Q5 = h4a.Q(t7kVar, up9Var.q, jSONObject, "inactive_font_weight_value", ox8Var18, kzjVar20, rp9.u);
                c9c c9cVar70 = up9Var.r;
                ozb ozbVar51 = rp9.h;
                ?? P22 = h4a.P(t7kVar, c9cVar70, jSONObject, "inactive_text_color", ox8Var17, kzjVar19, ozbVar51);
                ozb ozbVar52 = P22 == 0 ? ozbVar51 : P22;
                c9c c9cVar71 = up9Var.s;
                hm9 hm9Var4 = rp9.v;
                ozb ozbVar53 = rp9.i;
                ?? R12 = h4a.R(t7kVar, c9cVar71, jSONObject, "item_spacing", ox8Var18, kzjVar20, hm9Var4, ozbVar53);
                if (R12 != 0) {
                    ozbVar53 = R12;
                }
                c9c c9cVar72 = up9Var.t;
                ox8 ox8Var19 = vct.d;
                kzj kzjVar21 = kzj.E;
                ozb ozbVar54 = rp9.j;
                ?? P23 = h4a.P(t7kVar, c9cVar72, jSONObject, "letter_spacing", ox8Var19, kzjVar21, ozbVar54);
                ozb ozbVar55 = P23 == 0 ? ozbVar54 : P23;
                szb Q6 = h4a.Q(t7kVar, up9Var.u, jSONObject, "line_height", ox8Var18, kzjVar20, rp9.w);
                ix8 ix8Var3 = (ix8) h4a.K(t7kVar, up9Var.v, jSONObject, "paddings", t6fVar25.j3, t6fVar25.h3);
                if (ix8Var3 == null) {
                    ix8Var3 = rp9.k;
                }
                return new uo9(ozbVar38, N4, O8, Q3, ozbVar40, ozbVar42, ozbVar44, Q4, fu8Var2, N5, ozbVar46, ozbVar48, ozbVar50, O9, N6, O10, Q5, ozbVar52, ozbVar53, ozbVar55, Q6, ix8Var3);
            case 25:
                vt9 vt9Var = (vt9) d7fVar;
                c9c c9cVar73 = vt9Var.a;
                t6f t6fVar26 = this.b;
                return new pq9(h4a.F(t7kVar, vt9Var.d, jSONObject, "text", vct.c), h4a.V(t7kVar, c9cVar73, jSONObject, "actions", t6fVar26.v1, t6fVar26.t1), h4a.V(t7kVar, vt9Var.b, jSONObject, "images", t6fVar26.U8, t6fVar26.S8), h4a.V(t7kVar, vt9Var.c, jSONObject, "ranges", t6fVar26.R8, t6fVar26.P8));
            case 26:
                xt9 xt9Var = (xt9) d7fVar;
                c9c c9cVar74 = xt9Var.a;
                t6f t6fVar27 = this.b;
                jyr jyrVar20 = t6fVar27.X8;
                jyr jyrVar21 = t6fVar27.F3;
                jyr jyrVar22 = t6fVar27.H3;
                rq9 rq9Var = (rq9) h4a.K(t7kVar, c9cVar74, jSONObject, "accessibility", jyrVar20, t6fVar27.V8);
                c9c c9cVar75 = xt9Var.b;
                tct tctVar11 = vr9.g;
                vq9 vq9Var2 = vq9.t;
                ozb ozbVar56 = vr9.a;
                ?? P24 = h4a.P(t7kVar, c9cVar75, jSONObject, "alignment_vertical", tctVar11, vq9Var2, ozbVar56);
                ozb ozbVar57 = P24 == 0 ? ozbVar56 : P24;
                jz8 jz8Var4 = (jz8) h4a.K(t7kVar, xt9Var.c, jSONObject, CameraProperty.HEIGHT, jyrVar22, jyrVar21);
                if (jz8Var4 == null) {
                    jz8Var4 = vr9.b;
                }
                jz8 jz8Var5 = jz8Var4;
                c9c c9cVar76 = xt9Var.d;
                tct tctVar12 = vr9.h;
                rk9 rk9Var2 = rk9.z0;
                ozb ozbVar58 = vr9.c;
                ?? P25 = h4a.P(t7kVar, c9cVar76, jSONObject, "indexing_direction", tctVar12, rk9Var2, ozbVar58);
                ozb ozbVar59 = P25 == 0 ? ozbVar58 : P25;
                c9c c9cVar77 = xt9Var.e;
                ox8 ox8Var20 = vct.a;
                kzj kzjVar22 = kzj.B;
                ozb ozbVar60 = vr9.d;
                ?? P26 = h4a.P(t7kVar, c9cVar77, jSONObject, "preload_required", ox8Var20, kzjVar22, ozbVar60);
                ozb ozbVar61 = P26 == 0 ? ozbVar60 : P26;
                szb H = h4a.H(t7kVar, xt9Var.f, jSONObject, "start", vct.b, kzj.F, vr9.j);
                szb O11 = h4a.O(t7kVar, xt9Var.g, jSONObject, "tint_color", vct.f, kzj.G);
                c9c c9cVar78 = xt9Var.h;
                tct tctVar13 = vr9.i;
                qm8 qm8Var2 = qm8.z;
                ozb ozbVar62 = vr9.e;
                ?? P27 = h4a.P(t7kVar, c9cVar78, jSONObject, "tint_mode", tctVar13, qm8Var2, ozbVar62);
                if (P27 != 0) {
                    ozbVar62 = P27;
                }
                szb G4 = h4a.G(t7kVar, xt9Var.i, jSONObject, "url", vct.e, kzj.C);
                jz8 jz8Var6 = (jz8) h4a.K(t7kVar, xt9Var.j, jSONObject, CameraProperty.WIDTH, jyrVar22, jyrVar21);
                if (jz8Var6 == null) {
                    jz8Var6 = vr9.f;
                }
                return new tq9(rq9Var, ozbVar57, jz8Var5, ozbVar59, ozbVar61, H, O11, ozbVar62, G4, jz8Var6);
            case 27:
                ms9 ms9Var = (ms9) d7fVar;
                szb Q7 = h4a.Q(t7kVar, ms9Var.a, jSONObject, "corner_radius", vct.b, kzj.F, up6.l);
                c9c c9cVar79 = ms9Var.b;
                t6f t6fVar28 = this.b;
                return new js9(Q7, (ln9) h4a.K(t7kVar, c9cVar79, jSONObject, "stroke", t6fVar28.c8, t6fVar28.a8));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                yt9 yt9Var = (yt9) d7fVar;
                c9c c9cVar80 = yt9Var.a;
                t6f t6fVar29 = this.b;
                List V7 = h4a.V(t7kVar, c9cVar80, jSONObject, "actions", t6fVar29.v1, t6fVar29.t1);
                szb O12 = h4a.O(t7kVar, yt9Var.b, jSONObject, "alignment_vertical", qs9.d, vq9.t);
                cs9 cs9Var = (cs9) h4a.K(t7kVar, yt9Var.c, jSONObject, C0479n3.g, t6fVar29.x8, t6fVar29.v8);
                c9c c9cVar81 = yt9Var.d;
                ox8 ox8Var21 = vct.d;
                kzj kzjVar23 = kzj.E;
                ozb ozbVar63 = qs9.a;
                ?? P28 = h4a.P(t7kVar, c9cVar81, jSONObject, "baseline_offset", ox8Var21, kzjVar23, ozbVar63);
                ozb ozbVar64 = P28 == 0 ? ozbVar63 : P28;
                js9 js9Var = (js9) h4a.K(t7kVar, yt9Var.e, jSONObject, "border", t6fVar29.A8, t6fVar29.y8);
                c9c c9cVar82 = yt9Var.f;
                ox8 ox8Var22 = vct.b;
                kzj kzjVar24 = kzj.F;
                szb Q8 = h4a.Q(t7kVar, c9cVar82, jSONObject, "end", ox8Var22, kzjVar24, qs9.i);
                c9c c9cVar83 = yt9Var.g;
                ox8 ox8Var23 = vct.c;
                szb N7 = h4a.N(t7kVar, c9cVar83, jSONObject, "font_family", ox8Var23);
                szb N8 = h4a.N(t7kVar, yt9Var.h, jSONObject, "font_feature_settings", ox8Var23);
                szb Q9 = h4a.Q(t7kVar, yt9Var.i, jSONObject, "font_size", ox8Var22, kzjVar24, qs9.j);
                c9c c9cVar84 = yt9Var.j;
                tct tctVar14 = qs9.e;
                gd9 gd9Var4 = gd9.w0;
                ozb ozbVar65 = qs9.b;
                ?? P29 = h4a.P(t7kVar, c9cVar84, jSONObject, "font_size_unit", tctVar14, gd9Var4, ozbVar65);
                ozb ozbVar66 = P29 == 0 ? ozbVar65 : P29;
                szb N9 = h4a.N(t7kVar, yt9Var.k, jSONObject, "font_variation_settings", vct.h);
                szb O13 = h4a.O(t7kVar, yt9Var.l, jSONObject, "font_weight", qs9.f, vv8.B);
                szb Q10 = h4a.Q(t7kVar, yt9Var.m, jSONObject, "font_weight_value", ox8Var22, kzjVar24, qs9.k);
                szb O14 = h4a.O(t7kVar, yt9Var.n, jSONObject, "letter_spacing", ox8Var21, kzjVar23);
                szb Q11 = h4a.Q(t7kVar, yt9Var.o, jSONObject, "line_height", ox8Var22, kzjVar24, qs9.l);
                ts9 ts9Var = (ts9) h4a.K(t7kVar, yt9Var.p, jSONObject, "mask", t6fVar29.L8, t6fVar29.J8);
                c9c c9cVar85 = yt9Var.q;
                ns9 ns9Var2 = qs9.m;
                ozb ozbVar67 = qs9.c;
                ?? R13 = h4a.R(t7kVar, c9cVar85, jSONObject, "start", ox8Var22, kzjVar24, ns9Var2, ozbVar67);
                if (R13 != 0) {
                    ozbVar67 = R13;
                }
                c9c c9cVar86 = yt9Var.r;
                tct tctVar15 = qs9.g;
                i49 i49Var2 = i49.D;
                return new uq9(V7, O12, cs9Var, ozbVar64, js9Var, Q8, N7, N8, Q9, ozbVar66, N9, O13, Q10, O14, Q11, ts9Var, ozbVar67, h4a.O(t7kVar, c9cVar86, jSONObject, "strike", tctVar15, i49Var2), h4a.O(t7kVar, yt9Var.s, jSONObject, "text_color", vct.f, kzj.G), (dj9) h4a.K(t7kVar, yt9Var.t, jSONObject, "text_shadow", t6fVar29.g7, t6fVar29.e7), h4a.Q(t7kVar, yt9Var.u, jSONObject, "top_offset", ox8Var22, kzjVar24, qs9.n), h4a.O(t7kVar, yt9Var.v, jSONObject, "underline", qs9.h, i49Var2));
            default:
                gu9 gu9Var = (gu9) d7fVar;
                c9c c9cVar87 = gu9Var.a;
                ox8 ox8Var24 = vct.b;
                kzj kzjVar25 = kzj.F;
                ns9 ns9Var3 = fu9.b;
                ozb ozbVar68 = fu9.a;
                ?? R14 = h4a.R(t7kVar, c9cVar87, jSONObject, "duration", ox8Var24, kzjVar25, ns9Var3, ozbVar68);
                if (R14 != 0) {
                    ozbVar68 = R14;
                }
                c9c c9cVar88 = gu9Var.b;
                t6f t6fVar30 = this.b;
                jyr jyrVar23 = t6fVar30.v1;
                jyr jyrVar24 = t6fVar30.t1;
                List V8 = h4a.V(t7kVar, c9cVar88, jSONObject, "end_actions", jyrVar23, jyrVar24);
                c9c c9cVar89 = gu9Var.c;
                s3f s3fVar4 = bcx.i;
                return new au9(ozbVar68, V8, (String) h4a.C(c9cVar89, jSONObject, ConnectableDevice.KEY_ID, s3fVar4, bcx.h), h4a.V(t7kVar, gu9Var.d, jSONObject, "tick_actions", t6fVar30.v1, jyrVar24), h4a.Q(t7kVar, gu9Var.e, jSONObject, "tick_interval", ox8Var24, kzjVar25, fu9.c), (String) h4a.L(gu9Var.f, t7kVar, "value_variable", s3fVar4, jSONObject));
        }
    }
}

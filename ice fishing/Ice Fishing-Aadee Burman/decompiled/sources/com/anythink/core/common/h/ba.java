package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.common.e.g;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ba extends y {

    /* renamed from: o, reason: collision with root package name */
    protected int f13605o;

    private void aK(int i) {
        this.f13605o = i;
    }

    public static ba u(String str) {
        ba baVar = new ba();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                baVar.u(jSONObject.optInt("f_t"));
                baVar.v(jSONObject.optInt("v_c"));
                baVar.w(jSONObject.optInt("s_b_t"));
                baVar.y(jSONObject.optInt("e_c_a"));
                baVar.z(jSONObject.optInt("v_m"));
                baVar.A(jSONObject.optInt("s_c_t"));
                baVar.n(jSONObject.optInt("m_t"));
                baVar.c(jSONObject.optLong("o_c_t", com.anythink.core.d.h.f17290f));
                baVar.o(jSONObject.optInt("ak_cfm"));
                baVar.b(jSONObject.optLong("ctdown_time"));
                baVar.r(jSONObject.optInt("sk_able"));
                baVar.s(jSONObject.optInt("orient"));
                baVar.e(jSONObject.optString("size"));
                baVar.t(jSONObject.optInt("cl_btn"));
                baVar.B(jSONObject.optInt("ec_r"));
                baVar.C(jSONObject.optInt("ec_s_t"));
                baVar.D(jSONObject.optInt("ec_l_t"));
                baVar.f(jSONObject.optString(com.anythink.core.common.k.aF));
                baVar.f13605o = jSONObject.optInt("spl_type");
                baVar.a(jSONObject.optLong("or_t"));
                baVar.g(jSONObject.optInt("rv_fail_reward"));
                baVar.h(jSONObject.optInt("cl_sz"));
                baVar.k(jSONObject.optInt("si_fit"));
                if (jSONObject.has("at_cl_sw")) {
                    baVar.E(jSONObject.optInt("at_cl_sw"));
                }
                if (jSONObject.has("at_ct_ti")) {
                    baVar.F(jSONObject.optInt("at_ct_ti"));
                }
                if (jSONObject.has("int_cl_sw")) {
                    baVar.G(jSONObject.optInt("int_cl_sw"));
                }
                if (jSONObject.has("int_cl_ti")) {
                    baVar.H(jSONObject.optInt("int_cl_ti"));
                }
                if (jSONObject.has("sh_ec")) {
                    baVar.I(jSONObject.optInt("sh_ec"));
                }
                if (jSONObject.has("ipua")) {
                    baVar.e(jSONObject.optInt("ipua"));
                }
                if (jSONObject.has("clua")) {
                    baVar.f(jSONObject.optInt("clua"));
                }
                if (jSONObject.has("ap_arpt")) {
                    baVar.J(jSONObject.optInt("ap_arpt"));
                }
                if (jSONObject.has("ap_pasbl")) {
                    baVar.K(jSONObject.optInt("ap_pasbl"));
                }
                if (jSONObject.has("shk_sw")) {
                    baVar.L(jSONObject.optInt("shk_sw"));
                }
                if (jSONObject.has("shk_strength_and")) {
                    baVar.M(jSONObject.optInt("shk_strength_and"));
                }
                if (jSONObject.has("shk_time")) {
                    baVar.d(jSONObject.optLong("shk_time"));
                }
                if (jSONObject.has("click_cache_time")) {
                    baVar.N(jSONObject.optInt("click_cache_time"));
                } else {
                    baVar.N(3600000);
                }
                if (jSONObject.has("click_nt_sw")) {
                    baVar.O(jSONObject.optInt("click_nt_sw"));
                } else {
                    baVar.O(1);
                }
                if (jSONObject.has("ft_cl_sz")) {
                    baVar.i(jSONObject.optInt("ft_cl_sz"));
                } else {
                    baVar.i(1);
                }
                if (jSONObject.has("sh_cl_itp")) {
                    baVar.j(jSONObject.optInt("sh_cl_itp"));
                } else {
                    baVar.j(2);
                }
                baVar.P(jSONObject.optInt("shm_t", -1));
                if (jSONObject.has("ready_rate")) {
                    baVar.Q(jSONObject.optInt("ready_rate"));
                } else {
                    baVar.Q(100);
                }
                if (jSONObject.has("rsdl_rate")) {
                    baVar.R(jSONObject.optInt("rsdl_rate"));
                } else {
                    baVar.R(0);
                }
                if (jSONObject.has("video_ctn_type")) {
                    baVar.S(jSONObject.optInt("video_ctn_type"));
                } else {
                    baVar.S(2);
                }
                baVar.c(jSONObject.optInt("at_cl_img", 2) == 1);
                baVar.d(jSONObject.optInt("at_cl_video", 2) == 1);
                baVar.e(jSONObject.optInt("at_cl_ec", 2) == 1);
                baVar.e(jSONObject.optLong("at_cl_pt", com.anythink.basead.exoplayer.f.f7187a));
                baVar.f(jSONObject.optLong("at_cl_pct", com.anythink.basead.exoplayer.f.f7187a));
                baVar.g(jSONObject.optLong("at_cl_ec_pt", com.anythink.basead.exoplayer.f.f7187a));
                baVar.h(jSONObject.optLong("at_cl_ec_pct", com.anythink.basead.exoplayer.f.f7187a));
                baVar.k(jSONObject.optLong("sub_splash_time", 0L));
                baVar.l(jSONObject.optLong("s_b_t_top", com.anythink.basead.exoplayer.i.a.f7883f));
                baVar.m(jSONObject.optLong("s_b_d_top", com.anythink.basead.exoplayer.f.f7187a));
                baVar.Z(jSONObject.optInt(g.a.f12969j, 1));
                baVar.aa(jSONObject.optInt("apk_redown", 2));
                baVar.ab(jSONObject.optInt("install_bg", 1));
                baVar.ad(jSONObject.optInt("click_close", 2));
                baVar.ae(jSONObject.optInt("cta_type", 1));
                baVar.af(jSONObject.optInt("cd_play_sw", 2));
                baVar.ag(2);
                baVar.ai(baVar.X());
                baVar.ah(800);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Double.valueOf(15.0d));
                arrayList.add(Double.valueOf(10.0d));
                baVar.a(arrayList);
                return baVar;
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
        return baVar;
    }

    public final int a() {
        return this.f13605o;
    }
}

package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.common.e.g;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bk extends y {

    /* renamed from: o, reason: collision with root package name */
    private int f14432o;

    /* renamed from: p, reason: collision with root package name */
    private int f14433p;

    /* renamed from: q, reason: collision with root package name */
    private int f14434q;

    private void aK(int i) {
        this.f14433p = i;
    }

    private void aL(int i) {
        this.f14432o = i;
    }

    private void aM(int i) {
        this.f14434q = i;
    }

    public static bk u(String str) {
        int i;
        bk bkVar = new bk();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                bkVar.u(jSONObject.optInt("f_t"));
                int optInt = jSONObject.optInt("v_c");
                if (optInt == 1) {
                    optInt = 0;
                } else if (optInt == 2) {
                    optInt = 1;
                }
                bkVar.v(optInt);
                bkVar.w(jSONObject.optInt("s_b_t"));
                if (jSONObject.has("s_b_d")) {
                    bkVar.x(jSONObject.optInt("s_b_d"));
                }
                int optInt2 = jSONObject.optInt("e_c_a");
                if (optInt2 == 1) {
                    optInt2 = 0;
                } else if (optInt2 == 2) {
                    optInt2 = 1;
                } else if (optInt2 == 3) {
                    optInt2 = 2;
                }
                bkVar.y(optInt2);
                int optInt3 = jSONObject.optInt("ak_cfm");
                if (optInt3 == 1) {
                    optInt3 = 0;
                } else if (optInt3 == 2) {
                    optInt3 = 1;
                }
                bkVar.o(optInt3);
                try {
                    JSONArray optJSONArray = jSONObject.optJSONArray("ak_cfm_c");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int i4 = 0;
                        while (i4 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                            int optInt4 = jSONObject2.optInt("link_type");
                            int i6 = i4;
                            int optInt5 = jSONObject2.optInt("scene");
                            if (optInt4 == 4) {
                                bkVar.p(optInt5);
                            }
                            if (optInt4 == 1) {
                                bkVar.q(optInt5);
                            }
                            i4 = i6 + 1;
                        }
                    }
                } catch (Throwable unused) {
                }
                bkVar.n(jSONObject.optInt("m_t"));
                int optInt6 = jSONObject.optInt("cm");
                if (optInt6 == 1) {
                    optInt6 = 0;
                } else if (optInt6 == 2) {
                    optInt6 = 1;
                }
                bkVar.f14432o = optInt6;
                bkVar.e(jSONObject.optInt("ipua"));
                bkVar.f(jSONObject.optInt("clua"));
                bkVar.m(jSONObject.optInt("dp_cm"));
                bkVar.f14433p = jSONObject.optInt("l_o_num");
                bkVar.l(jSONObject.optInt("ld_t"));
                bkVar.B(jSONObject.optInt("ec_r"));
                bkVar.C(jSONObject.optInt("ec_s_t"));
                bkVar.D(jSONObject.optInt("ec_l_t"));
                bkVar.a(jSONObject.optLong("or_t"));
                bkVar.g(jSONObject.optInt("rv_fail_reward"));
                bkVar.h(jSONObject.optInt("cl_sz"));
                bkVar.k(jSONObject.optInt("si_fit"));
                if (jSONObject.has("at_cl_sw")) {
                    bkVar.E(jSONObject.optInt("at_cl_sw"));
                }
                if (jSONObject.has("at_ct_ti")) {
                    bkVar.F(jSONObject.optInt("at_ct_ti"));
                }
                if (jSONObject.has("int_cl_sw")) {
                    bkVar.G(jSONObject.optInt("int_cl_sw"));
                }
                if (jSONObject.has("int_cl_ti")) {
                    bkVar.H(jSONObject.optInt("int_cl_ti"));
                }
                if (jSONObject.has("sh_ec")) {
                    bkVar.I(jSONObject.optInt("sh_ec"));
                }
                if (jSONObject.has("ap_arpt")) {
                    bkVar.J(jSONObject.optInt("ap_arpt"));
                }
                if (jSONObject.has("ap_pasbl")) {
                    bkVar.K(jSONObject.optInt("ap_pasbl"));
                }
                if (jSONObject.has(com.anythink.core.common.k.aF)) {
                    bkVar.f(jSONObject.optString(com.anythink.core.common.k.aF));
                }
                if (jSONObject.has("shk_sw")) {
                    bkVar.L(jSONObject.optInt("shk_sw"));
                }
                if (jSONObject.has("shk_strength_and")) {
                    bkVar.M(jSONObject.optInt("shk_strength_and"));
                }
                if (jSONObject.has("shk_time")) {
                    bkVar.d(jSONObject.optLong("shk_time"));
                }
                if (jSONObject.has("click_cache_time")) {
                    bkVar.N(jSONObject.optInt("click_cache_time"));
                }
                if (jSONObject.has("click_nt_sw")) {
                    bkVar.O(jSONObject.optInt("click_nt_sw"));
                }
                if (jSONObject.has("ft_cl_sz")) {
                    bkVar.i(jSONObject.optInt("ft_cl_sz"));
                } else {
                    bkVar.i(1);
                }
                if (jSONObject.has("sh_cl_itp")) {
                    bkVar.j(jSONObject.optInt("sh_cl_itp"));
                } else {
                    bkVar.j(2);
                }
                bkVar.P(jSONObject.optInt("shm_t", -1));
                if (jSONObject.has("ready_rate")) {
                    bkVar.Q(jSONObject.optInt("ready_rate"));
                } else {
                    bkVar.Q(100);
                }
                if (jSONObject.has("rsdl_rate")) {
                    bkVar.R(jSONObject.optInt("rsdl_rate"));
                } else {
                    bkVar.R(0);
                }
                if (jSONObject.has("video_ctn_type")) {
                    bkVar.S(jSONObject.optInt("video_ctn_type"));
                } else {
                    bkVar.S(2);
                }
                if (jSONObject.has("preload_offer_html")) {
                    bkVar.a(jSONObject.optInt("preload_offer_html") == 1);
                } else {
                    bkVar.a(true);
                }
                if (jSONObject.has("re_monitor")) {
                    bkVar.b(jSONObject.optInt("re_monitor") == 1);
                    i = 0;
                } else {
                    i = 0;
                    bkVar.b(false);
                }
                bkVar.f14434q = jSONObject.optInt(com.anythink.core.common.k.ar, i);
                bkVar.c(jSONObject.optInt("at_cl_img", 2) == 1);
                bkVar.d(jSONObject.optInt("at_cl_video", 2) == 1);
                bkVar.e(jSONObject.optInt("at_cl_ec", 2) == 1);
                bkVar.e(jSONObject.optLong("at_cl_pt", com.anythink.basead.exoplayer.f.f7973a));
                bkVar.f(jSONObject.optLong("at_cl_pct", com.anythink.basead.exoplayer.f.f7973a));
                bkVar.g(jSONObject.optLong("at_cl_ec_pt", com.anythink.basead.exoplayer.f.f7973a));
                bkVar.h(jSONObject.optLong("at_cl_ec_pct", com.anythink.basead.exoplayer.f.f7973a));
                bkVar.i(jSONObject.optLong("or_img_t", com.anythink.basead.exoplayer.f.f7973a));
                bkVar.U(jSONObject.optInt("animate_type", -1));
                bkVar.T(jSONObject.optInt("render_wv_ld", 2));
                bkVar.V(jSONObject.optInt("cl_invalid_sw", 2));
                bkVar.W(jSONObject.optInt("stc_sw", 1));
                bkVar.X(jSONObject.optInt("close_button_m", 0));
                bkVar.Y(jSONObject.optInt("cgf_sw", 1));
                bkVar.j(jSONObject.optLong("cgf_t", 0L));
                bkVar.g(jSONObject.optString("cgf_list", ""));
                bkVar.h(jSONObject.optString("qa_po", ""));
                bkVar.b(jSONObject.optInt("lp_pop", 2));
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("shk_obj");
                    if (optJSONObject != null) {
                        bkVar.a(optJSONObject.optInt("shk_type", 3));
                        bkVar.a(optJSONObject.optString("shk_icon", ""));
                        bkVar.b(optJSONObject.optString("shk_text_l", ""));
                        bkVar.c(optJSONObject.optString("shk_text_m", ""));
                        bkVar.d(optJSONObject.optString("shk_text_s", ""));
                    }
                } catch (Throwable unused2) {
                }
                bkVar.A(jSONObject.optInt("s_c_t", 0));
                bkVar.ac(jSONObject.optInt("v_cls", 1));
                bkVar.k(jSONObject.optLong("sub_splash_time", 0L));
                bkVar.l(jSONObject.optLong("s_b_t_top", com.anythink.basead.exoplayer.i.a.f8669f));
                bkVar.m(jSONObject.optLong("s_b_d_top", com.anythink.basead.exoplayer.f.f7973a));
                bkVar.af(jSONObject.optInt("cd_play_sw", 2));
                bkVar.Z(jSONObject.optInt(g.a.f13755j, 1));
                bkVar.aa(jSONObject.optInt("apk_redown", 2));
                bkVar.ab(jSONObject.optInt("install_bg", 1));
                bkVar.c(jSONObject.optInt("adx_cache_time", 604800000));
                bkVar.ad(jSONObject.optInt("click_close", 2));
                bkVar.ae(jSONObject.optInt("cta_type", 1));
                bkVar.ag(jSONObject.optInt("a_s_way", 1));
                bkVar.ah(jSONObject.optInt("s_m_t", 800));
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("s_m_a");
                    if (optJSONArray2 != null) {
                        for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                            arrayList.add(Double.valueOf(optJSONArray2.getDouble(i9)));
                        }
                    } else {
                        arrayList.add(Double.valueOf(15.0d));
                        arrayList.add(Double.valueOf(10.0d));
                    }
                } catch (Throwable unused3) {
                    arrayList.clear();
                    arrayList.add(Double.valueOf(15.0d));
                    arrayList.add(Double.valueOf(10.0d));
                }
                bkVar.a(arrayList);
                bkVar.ai(jSONObject.optInt("s_s_a", 10));
                bkVar.g(jSONObject.optInt("cta_pause", 2) == 1);
                if (bkVar.aO()) {
                    bkVar.K(1);
                }
                bkVar.ap(jSONObject.optInt("nv_tmpt", -1));
                bkVar.aj(jSONObject.optInt("cta_style", 1));
                try {
                    String string = jSONObject.getString("dcta_txt");
                    if (!TextUtils.isEmpty(string)) {
                        bkVar.m(new JSONObject(string).optString("lb_txt", ""));
                    }
                } catch (Throwable unused4) {
                }
                bkVar.ak(jSONObject.optInt("ec_style", 1));
                int aQ = bkVar.aQ();
                int i10 = aQ != 2 ? (aQ == 3 || aQ == 4) ? 5 : 0 : 3;
                bkVar.n(jSONObject.optInt("ec_cd_n", i10));
                bkVar.al(jSONObject.optInt("ec_rp_style", 1));
                bkVar.am(jSONObject.optInt("ec_rp_ca", 0));
                try {
                    String string2 = jSONObject.getString("ec_rp_txt");
                    if (!TextUtils.isEmpty(string2)) {
                        JSONObject jSONObject3 = new JSONObject(string2);
                        bkVar.i(jSONObject3.optString("rp_t", ""));
                        bkVar.j(jSONObject3.optString("rp_g", ""));
                        bkVar.k(jSONObject3.optString("dl", ""));
                        bkVar.l(jSONObject3.optString("n", ""));
                    }
                } catch (Throwable unused5) {
                }
                bkVar.o(jSONObject.optInt("sec_cd", i10));
                bkVar.an(jSONObject.optInt("sec_ca", 1));
                bkVar.ao(jSONObject.optInt("ec_wd_ca", 1));
                try {
                    String string3 = jSONObject.getString("ec_wd_txt");
                    if (!TextUtils.isEmpty(string3)) {
                        JSONObject jSONObject4 = new JSONObject(string3);
                        bkVar.n(jSONObject4.optString("wd_v", ""));
                        bkVar.o(jSONObject4.optString("wd_i", ""));
                        bkVar.p(jSONObject4.optString("wd_c_t", ""));
                        bkVar.q(jSONObject4.optString("wd_c_i", ""));
                        bkVar.r(jSONObject4.optString("wd_c_b_t", ""));
                    }
                } catch (Throwable unused6) {
                }
                bkVar.aq(jSONObject.optInt("cls_style", 1));
                bkVar.s(jSONObject.optString("cls_style_cw", ""));
                bkVar.q(jSONObject.optLong("v_cd_style", 1L));
                bkVar.p(jSONObject.optLong("rv_reward_tip", 0L));
                bkVar.ar(jSONObject.optInt("wf_dl_sw", 1));
                bkVar.as(jSONObject.optInt("dp_b_sw", 2));
                bkVar.at(jSONObject.optInt("ac_b", 1));
                bkVar.au(jSONObject.optInt("it_cfg_type", 1));
                bkVar.r(jSONObject.optLong("it_cfg_d_t", com.anythink.basead.exoplayer.f.f7973a));
                bkVar.s(jSONObject.optLong("it_cfg_r_t", 10000L));
                bkVar.t(jSONObject.optLong("it_cfg_h_t", com.anythink.basead.exoplayer.f.f7973a));
                bkVar.av(jSONObject.optInt("p_a_style", 1));
                bkVar.aw(jSONObject.optInt("s_style", 1));
                bkVar.ax(jSONObject.optInt("s_cta_style", 1));
                bkVar.ay(jSONObject.optInt("ins_m_sw", 1));
                bkVar.a(jSONObject.optDouble("o_c_b", 1.0d));
                bkVar.u(jSONObject.optLong("s_d_t", 50L));
                bkVar.az(jSONObject.optInt("deeplink_c_sw", 2));
                try {
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("ic_link_list");
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                            arrayList2.add(optJSONArray3.getString(i11));
                        }
                    }
                    bkVar.b(arrayList2);
                } catch (Throwable unused7) {
                }
                bkVar.aA(jSONObject.optInt("h5_ad_sw", 2));
                bkVar.aC(jSONObject.optInt("h5_n_f", 2));
                bkVar.aB(jSONObject.optInt("h5_ad_pre", 2));
                try {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("h5_ad_t");
                    if (optJSONObject2 != null) {
                        bkVar.t(optJSONObject2.optString("t_url"));
                        bkVar.aD(optJSONObject2.optInt("id"));
                    }
                } catch (Throwable unused8) {
                }
                bkVar.aE(jSONObject.optInt("x_cl", 0));
                bkVar.aF(1);
                bkVar.aG(jSONObject.optInt("o_h_w_load_sw", 2));
                bkVar.v(jSONObject.optLong("h5_l_l", com.anythink.basead.exoplayer.f.f7973a));
                bkVar.w(jSONObject.optLong("h5_r_t", com.anythink.expressad.video.module.a.a.m.ai));
                bkVar.aH(jSONObject.optInt("offer_d_c", 1));
                bkVar.aI(jSONObject.optInt("check_w_f", 1));
                bkVar.aJ(jSONObject.optInt("s_full", 2));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return bkVar;
    }

    public final int a() {
        return this.f14433p;
    }

    public final int b() {
        return this.f14432o;
    }

    public final int c() {
        return this.f14434q;
    }
}

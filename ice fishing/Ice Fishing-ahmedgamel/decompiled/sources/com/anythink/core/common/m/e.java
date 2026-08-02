package com.anythink.core.common.m;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.ATUserDeviceInfo;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.by;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public static final String f15396A = "ps_id";

    /* renamed from: B, reason: collision with root package name */
    public static final String f15397B = "it_src";

    /* renamed from: C, reason: collision with root package name */
    public static final String f15398C = "lat";

    /* renamed from: D, reason: collision with root package name */
    public static final String f15399D = "lon";

    /* renamed from: E, reason: collision with root package name */
    public static final String f15400E = "inst_wx";

    /* renamed from: F, reason: collision with root package name */
    public static final String f15401F = "mini_sdk";

    /* renamed from: G, reason: collision with root package name */
    public static final String f15402G = "ms_type";

    /* renamed from: H, reason: collision with root package name */
    public static final String f15403H = "device_set";

    /* renamed from: I, reason: collision with root package name */
    public static final String f15404I = "gdpr_cs";
    public static final String J = "abtest_id";

    /* renamed from: K, reason: collision with root package name */
    public static final String f15405K = "first_init_time";

    /* renamed from: L, reason: collision with root package name */
    public static final String f15406L = "days_from_first_init";

    /* renamed from: M, reason: collision with root package name */
    public static final String f15407M = "cs_cl";

    /* renamed from: N, reason: collision with root package name */
    public static final String f15408N = "is_ofm";

    /* renamed from: O, reason: collision with root package name */
    public static final String f15409O = "app_id";

    /* renamed from: P, reason: collision with root package name */
    public static final String f15410P = "api_ver";

    /* renamed from: Q, reason: collision with root package name */
    public static final String f15411Q = "custom";

    /* renamed from: R, reason: collision with root package name */
    public static final String f15412R = "data";

    /* renamed from: S, reason: collision with root package name */
    public static final String f15413S = "tcp_tk_da_type";

    /* renamed from: T, reason: collision with root package name */
    public static final String f15414T = "ofl";

    /* renamed from: U, reason: collision with root package name */
    public static final String f15415U = "tcp_rate";

    /* renamed from: V, reason: collision with root package name */
    public static final String f15416V = "p";

    /* renamed from: W, reason: collision with root package name */
    public static final String f15417W = "p2";

    /* renamed from: X, reason: collision with root package name */
    public static final String f15418X = "sign";
    public static final String Y = "common";

    /* renamed from: Z, reason: collision with root package name */
    public static final int f15419Z = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final String f15420a = "platform";
    public static final String aA = "b_p";
    public static final String aB = "d_s";
    public static final String aC = "s_d";
    public static final String aD = "a_cl";
    public static final String aE = "ip_v4";
    public static final String aF = "ip_v6";
    public static final String aG = "cpu";
    public static final String aH = "isroot";
    public static final String aI = "isagent";
    public static final String aJ = "is_sim";
    public static final String aK = "is_mul";
    public static final String aL = "is_vpn";
    public static final String aM = "is_charge";
    public static final String aN = "battery";
    public static final String aO = "http_able";
    public static final String aP = "bld_type";
    public static final String aQ = "bld_tags";
    public static final String aR = "bld_user";
    public static final String aS = "bld_radio";
    public static final String aT = "bld_bootloader";
    public static final String aU = "bld_hardware";
    public static final String aV = "bld_host";
    public static final String aW = "bld_codename";
    public static final String aX = "bld_incremental";
    public static final String aY = "bld_serial";
    public static final String aZ = "bld_display";
    public static final int aa = 2;
    public static final int ab = 3;
    public static final String ac = "area_type";
    public static final String ad = "sp_http";
    public static final String ae = "os_fw";
    public static final String af = "is_test";
    public static final String ag = "user_num";
    public static final String ah = "cp_device_id";
    public static final String ai = "cp_pl_id";
    public static int aj = -1;
    public static int ak = -1;
    public static final String al = "al_it_apil";
    public static final String am = "wx_data";
    public static final String an = "cached";
    public static final String ao = "cached";
    public static final String ap = "n_cache";
    public static final String aq = "get_1st_rl";
    public static final String ar = "value_d";
    public static final String as = "pl_type";
    public static final String at = "amazon_id";
    public static final String au = "amazon_lat";
    public static final String av = "t_mem";
    public static final String aw = "c_num";
    public static final String ax = "t_store";
    public static final String ay = "s_c";
    public static final String az = "u_a";

    /* renamed from: b, reason: collision with root package name */
    public static final String f15421b = "os_vn";
    public static final String ba = "bld_version_codes";
    public static final String bb = "bld_board";
    public static final String bc = "ps";
    public static final String bd = "pm";
    public static final String be = "is_s";
    public static final String bf = "m_data";
    public static final String bg = "sdk_ext";
    public static final String bh = "pil_s_fu";
    public static final String bi = "al_it_apil_t";
    public static final String bj = "demand_ids";
    public static final String bk = "pl_id";
    public static final String bl = "session_id";
    public static final String bm = "debug_key";
    public static final String bn = "wf";
    public static final String bo = "u_t";
    public static final String bp = "channel_from";
    public static final String bq = "is_fdevice";
    public static final String br = "d_r_ls";
    public static final String bs = "sensor_deny";
    public static final String bt = "device_minor_data_deny";
    public static final String bu = "ail_deny";
    public static final String bv = "bil_deny";
    public static final String bw = "sys_ua";
    public static final String bx = "sp_nw";

    /* renamed from: c, reason: collision with root package name */
    public static final String f15422c = "os_vc";

    /* renamed from: d, reason: collision with root package name */
    public static final String f15423d = "package_name";

    /* renamed from: e, reason: collision with root package name */
    public static final String f15424e = "app_vn";

    /* renamed from: f, reason: collision with root package name */
    public static final String f15425f = "app_vc";

    /* renamed from: g, reason: collision with root package name */
    public static final String f15426g = "brand";

    /* renamed from: h, reason: collision with root package name */
    public static final String f15427h = "model";
    public static final String i = "screen";

    /* renamed from: j, reason: collision with root package name */
    public static final String f15428j = "network_type";

    /* renamed from: k, reason: collision with root package name */
    public static final String f15429k = "mnc";

    /* renamed from: l, reason: collision with root package name */
    public static final String f15430l = "mcc";

    /* renamed from: m, reason: collision with root package name */
    public static final String f15431m = "language";

    /* renamed from: n, reason: collision with root package name */
    public static final String f15432n = "timezone";

    /* renamed from: o, reason: collision with root package name */
    public static final String f15433o = "sdk_ver";

    /* renamed from: p, reason: collision with root package name */
    public static final String f15434p = "gp_ver";

    /* renamed from: q, reason: collision with root package name */
    public static final String f15435q = "nw_ver";

    /* renamed from: r, reason: collision with root package name */
    public static final String f15436r = "ua";

    /* renamed from: s, reason: collision with root package name */
    public static final String f15437s = "orient";

    /* renamed from: t, reason: collision with root package name */
    public static final String f15438t = "system";

    /* renamed from: u, reason: collision with root package name */
    public static final String f15439u = "oaid";

    /* renamed from: v, reason: collision with root package name */
    public static final String f15440v = "android_id";

    /* renamed from: w, reason: collision with root package name */
    public static final String f15441w = "gaid";

    /* renamed from: x, reason: collision with root package name */
    public static final String f15442x = "channel";

    /* renamed from: y, reason: collision with root package name */
    public static final String f15443y = "sub_channel";

    /* renamed from: z, reason: collision with root package name */
    public static final String f15444z = "upid";

    public static JSONObject a(int i4) {
        JSONObject aV2;
        com.anythink.core.common.v.m.s(com.anythink.core.common.d.t.b().g());
        JSONObject jSONObject = new JSONObject();
        Context g9 = com.anythink.core.common.d.t.b().g();
        try {
            jSONObject.put("cpu", com.anythink.core.common.v.m.q());
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", com.anythink.core.common.v.m.e());
            jSONObject.put("os_vc", com.anythink.core.common.v.m.d());
            jSONObject.put("package_name", com.anythink.core.common.v.m.m(g9));
            jSONObject.put("app_vn", com.anythink.core.common.v.m.i(g9));
            jSONObject.put("app_vc", com.anythink.core.common.v.m.h(g9));
            jSONObject.put("brand", com.anythink.core.common.v.m.b());
            jSONObject.put("model", com.anythink.core.common.v.m.a());
            jSONObject.put("screen", com.anythink.core.common.v.m.l(g9));
            jSONObject.put("network_type", com.anythink.core.common.v.m.o(g9));
            jSONObject.put("mnc", com.anythink.core.common.v.m.c(g9));
            jSONObject.put("mcc", com.anythink.core.common.v.m.b(g9));
            jSONObject.put("language", com.anythink.core.common.v.m.e(g9));
            jSONObject.put("timezone", com.anythink.core.common.v.m.c());
            jSONObject.put("sdk_ver", com.anythink.core.common.v.p.a());
            jSONObject.put("gp_ver", com.anythink.core.common.v.m.p(g9));
            jSONObject.put("ua", com.anythink.core.common.v.m.h());
            jSONObject.put("orient", com.anythink.core.common.v.m.f(g9));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(com.anythink.core.common.d.t.b().n())) {
                jSONObject.put("channel", com.anythink.core.common.d.t.b().n());
            }
            if (!TextUtils.isEmpty(com.anythink.core.common.d.t.b().o())) {
                jSONObject.put("sub_channel", com.anythink.core.common.d.t.b().o());
            }
            String str = "";
            jSONObject.put("upid", com.anythink.core.common.d.v.a(g9).b() ? com.anythink.core.common.d.t.b().B() : "");
            jSONObject.put("ps_id", com.anythink.core.common.d.t.b().r());
            com.anythink.core.d.b b9 = com.anythink.core.d.d.a(g9).b(com.anythink.core.common.d.t.b().p());
            if (b9 != null) {
                if (!TextUtils.isEmpty(b9.M())) {
                    str = b9.M();
                }
                jSONObject.put(J, str);
            }
            jSONObject.put(f15405K, com.anythink.core.common.d.t.b().h());
            jSONObject.put(f15406L, com.anythink.core.common.d.t.b().i());
            StringBuilder sb = new StringBuilder();
            sb.append(com.anythink.core.common.d.t.b().e());
            sb.append(com.anythink.core.common.d.v.a(g9).a());
            jSONObject.put(f15404I, sb.toString());
            if (com.anythink.core.common.d.t.b().j() == 1) {
                jSONObject.put(f15408N, 1);
            }
            jSONObject.put(bx, 1);
            jSONObject.put(ad, com.anythink.core.common.d.t.b().K() ? com.anythink.core.common.d.t.b().L() ? "1" : "3" : com.anythink.core.common.d.t.b().L() ? "2" : "4");
            com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
            if (c9 != null) {
                c9.fillRequestDeviceData(jSONObject, i4);
            }
            String k9 = com.anythink.core.common.v.m.k();
            if (!TextUtils.isEmpty(k9)) {
                jSONObject.put(ae, Integer.parseInt(k9));
            }
            if ((i4 & 4) == 4) {
                try {
                    com.anythink.core.d.b b10 = com.anythink.core.d.d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
                    if (b10 != null && (aV2 = b10.aV()) != null) {
                        jSONObject.put("a_c", aV2);
                    }
                } catch (Exception unused) {
                }
            }
            if ((i4 & 16) == 16) {
                List<com.anythink.core.common.c.c> d9 = com.anythink.core.common.c.b.a().d();
                if (d9.size() > 0) {
                    for (int i6 = 0; i6 < d9.size(); i6++) {
                        com.anythink.core.common.c.c cVar = d9.get(i6);
                        if (cVar != null && !TextUtils.isEmpty(cVar.e()) && !TextUtils.isEmpty(cVar.c())) {
                            jSONObject.put(cVar.e(), cVar.c());
                        }
                    }
                }
            }
            if ((i4 & 64) == 64) {
                jSONObject.put("isroot", com.anythink.core.common.v.m.r());
                jSONObject.put("isagent", com.anythink.core.common.v.m.v(g9));
                jSONObject.put(aJ, com.anythink.core.common.v.m.x(g9));
                jSONObject.put(aK, com.anythink.core.common.v.m.y(g9));
                jSONObject.put(aL, com.anythink.core.common.v.m.w(g9));
                jSONObject.put(aM, com.anythink.core.common.v.m.z(g9));
                jSONObject.put("battery", com.anythink.core.common.v.m.A(g9));
                jSONObject.put(aO, com.anythink.core.common.v.m.s());
            }
            if ((i4 & 128) == 128) {
                JSONArray[] c10 = com.anythink.core.common.c.b.a().c();
                JSONArray jSONArray = c10[0];
                if (jSONArray != null && jSONArray.length() > 0) {
                    jSONObject.put(al, jSONArray);
                }
                JSONArray jSONArray2 = c10[1];
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    jSONObject.put(bi, jSONArray2);
                }
            }
            jSONObject.put(bc, com.anythink.core.common.v.o.b(com.anythink.core.common.v.m.c(g9, bc)));
            jSONObject.put(bd, com.anythink.core.common.v.o.b(com.anythink.core.common.v.m.d(g9, bd)));
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public static JSONObject b(int i4) {
        return a(i4, (List<String>) null);
    }

    private static void b(JSONObject jSONObject) {
        ATUserDeviceInfo Q8 = com.anythink.core.common.d.t.b().Q();
        if (Q8 != null) {
            String devGaid = Q8.getDevGaid();
            String devImei = Q8.getDevImei();
            String devOaid = Q8.getDevOaid();
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(devGaid)) {
                jSONObject2.put("set_gaid", devGaid);
            }
            if (!TextUtils.isEmpty(devImei)) {
                jSONObject2.put("set_imei", devImei);
            }
            if (!TextUtils.isEmpty(devOaid)) {
                jSONObject2.put("set_oaid", devOaid);
            }
            jSONObject.put(f15403H, jSONObject2);
            String devUID2Token = Q8.getDevUID2Token();
            if (TextUtils.isEmpty(devUID2Token)) {
                return;
            }
            jSONObject.put(bo, devUID2Token);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(46:0|1|(2:160|161)(1:3)|4|5|(3:152|153|(2:155|(40:157|8|(1:10)(1:151)|11|(1:13)|14|15|(1:17)(1:150)|18|(1:20)|21|(1:23)|24|(1:26)|27|28|(1:(1:31))(5:140|(1:142)(1:149)|(1:145)|(1:147)|148)|32|33|(1:(1:36))(3:136|(1:138)|139)|37|(8:39|(1:41)|42|(1:44)|45|(1:47)|48|(1:50))|51|52|53|(1:55)|57|58|(1:60)|62|(1:64)|65|(1:67)|68|(6:70|(1:72)|73|(1:75)|76|(1:78))|79|(26:81|(1:83)|84|(1:86)|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)|99|(1:101)|102|(1:104)|105|(1:107)|108|(1:110)|111|(1:113)|114|(1:116)|117|(1:119))|(3:123|124|125)|132|130)))|7|8|(0)(0)|11|(0)|14|15|(0)(0)|18|(0)|21|(0)|24|(0)|27|28|(0)(0)|32|33|(0)(0)|37|(0)|51|52|53|(0)|57|58|(0)|62|(0)|65|(0)|68|(0)|79|(0)|(4:121|123|124|125)|132|130) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ef A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00ca A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x006e A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[Catch: all -> 0x0308, TRY_ENTER, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104 A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a A[Catch: all -> 0x0167, TRY_LEAVE, TryCatch #1 {all -> 0x0167, blocks: (B:53:0x0152, B:55:0x015a), top: B:52:0x0152 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016f A[Catch: all -> 0x0178, TRY_LEAVE, TryCatch #2 {all -> 0x0178, blocks: (B:58:0x0167, B:60:0x016f), top: B:57:0x0167 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182 A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198 A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e6 A[Catch: all -> 0x0308, TryCatch #3 {all -> 0x0308, blocks: (B:161:0x001b, B:4:0x0021, B:153:0x0028, B:155:0x0033, B:10:0x0041, B:11:0x0047, B:13:0x005d, B:14:0x0060, B:17:0x0068, B:18:0x0073, B:20:0x0081, B:21:0x0093, B:23:0x00a1, B:24:0x00aa, B:27:0x00b3, B:31:0x00c6, B:32:0x00e3, B:36:0x00eb, B:37:0x00fa, B:39:0x0104, B:41:0x011b, B:42:0x0120, B:44:0x0126, B:45:0x012b, B:47:0x0131, B:48:0x0136, B:50:0x0145, B:51:0x014a, B:62:0x0178, B:64:0x0182, B:65:0x0187, B:67:0x018d, B:68:0x0192, B:70:0x0198, B:72:0x01a2, B:73:0x01af, B:75:0x01b9, B:76:0x01c6, B:78:0x01d4, B:79:0x01e1, B:81:0x01e6, B:83:0x01f0, B:84:0x01f5, B:86:0x01ff, B:87:0x0204, B:89:0x020e, B:90:0x0213, B:92:0x021d, B:93:0x0222, B:95:0x022c, B:96:0x0231, B:98:0x023b, B:99:0x0240, B:101:0x024a, B:102:0x024f, B:104:0x0259, B:105:0x025e, B:107:0x0268, B:108:0x026d, B:110:0x0277, B:111:0x027c, B:113:0x0286, B:114:0x028b, B:116:0x0295, B:117:0x029a, B:119:0x02a4, B:121:0x02ab, B:123:0x02b3, B:125:0x02d7, B:128:0x02f3, B:132:0x02f6, B:136:0x00ef, B:138:0x00f5, B:139:0x00f8, B:140:0x00ca, B:147:0x00de, B:148:0x00e1, B:150:0x006e), top: B:160:0x001b, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.anythink.core.common.d.s] */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject a(int i4, List<String> list) {
        String R8;
        JSONObject jSONObject;
        boolean z6;
        ?? c9;
        Location s9;
        String t6;
        int i6;
        int i9;
        ATUserDeviceInfo Q8;
        String o4;
        int p9;
        Object obj;
        Object obj2;
        Context g9 = com.anythink.core.common.d.t.b().g();
        ?? jSONObject2 = new JSONObject();
        com.anythink.core.d.b k9 = com.IceFishing.LiveIceFishing.k.k(com.anythink.core.d.d.a(g9));
        if (k9 != null) {
            try {
                R8 = k9.R();
            } catch (Throwable unused) {
            }
        } else {
            R8 = "";
        }
        if (!TextUtils.isEmpty(R8)) {
            try {
                jSONObject = new JSONObject(R8);
            } catch (Exception unused2) {
            }
            if (!jSONObject.isNull("a")) {
                if (jSONObject.optInt("a") != 1) {
                    z6 = false;
                    jSONObject2.put("android_id", !z6 ? com.anythink.core.common.v.m.d(g9) : "");
                    jSONObject2.put("gaid", com.anythink.core.common.v.m.f());
                    c9 = com.anythink.core.common.d.t.b().c();
                    if (c9 != 0) {
                        c9.fillRequestData(jSONObject2, k9, i4);
                    }
                    if (!ATSDK.isCnSDK()) {
                        jSONObject2.put("is_cn_sdk", "1");
                    } else {
                        jSONObject2.put("is_cn_sdk", "0");
                    }
                    String n9 = com.anythink.core.common.v.m.n(g9);
                    s9 = com.anythink.core.common.d.t.b().s();
                    if (s9 != null) {
                        jSONObject2.put("lat", s9.getLatitude());
                        jSONObject2.put(f15399D, s9.getLongitude());
                    }
                    t6 = com.anythink.core.common.d.t.b().t();
                    if (!TextUtils.isEmpty(t6)) {
                        jSONObject2.put(f15400E, Integer.parseInt(t6));
                    }
                    jSONObject2.put("it_src", TextUtils.isEmpty(n9) ? "" : n9);
                    jSONObject2.put(ac, j.f.f13247a);
                    i6 = aj;
                    if (i6 != -1) {
                        boolean c10 = com.anythink.core.common.v.p.c(g9);
                        boolean b9 = com.anythink.core.common.v.p.b(g9);
                        ?? r62 = b9 ? 2 : c10;
                        if (c10 && b9) {
                            r62 = 3;
                        }
                        if (r62 > 0) {
                            jSONObject2.put(f15402G, r62);
                        }
                        aj = r62;
                    } else if (i6 > 0) {
                        jSONObject2.put(f15402G, i6);
                    }
                    i9 = ak;
                    if (i9 != -1) {
                        boolean c11 = com.anythink.core.common.v.p.c();
                        if (c11) {
                            jSONObject2.put(f15401F, 1);
                        }
                        ak = c11 ? 1 : 0;
                    } else if (i9 == 1) {
                        jSONObject2.put(f15401F, i9);
                    }
                    Q8 = com.anythink.core.common.d.t.b().Q();
                    if (Q8 != null) {
                        String devGaid = Q8.getDevGaid();
                        String devImei = Q8.getDevImei();
                        String devOaid = Q8.getDevOaid();
                        JSONObject jSONObject3 = new JSONObject();
                        if (!TextUtils.isEmpty(devGaid)) {
                            jSONObject3.put("set_gaid", devGaid);
                        }
                        if (!TextUtils.isEmpty(devImei)) {
                            jSONObject3.put("set_imei", devImei);
                        }
                        if (!TextUtils.isEmpty(devOaid)) {
                            jSONObject3.put("set_oaid", devOaid);
                        }
                        jSONObject2.put(f15403H, jSONObject3);
                        String devUID2Token = Q8.getDevUID2Token();
                        if (!TextUtils.isEmpty(devUID2Token)) {
                            jSONObject2.put(bo, devUID2Token);
                        }
                    }
                    Map<String, Object> m9 = com.anythink.core.common.d.t.b().m();
                    obj2 = m9.get(ATCustomRuleKeys.USER_NUMBER);
                    if (obj2 != null) {
                        jSONObject2.put(ag, Long.parseLong(obj2.toString()));
                    }
                    obj = m9.get(ATCustomRuleKeys.USER_DEVICE_ID);
                    if (obj != null) {
                        jSONObject2.put(ah, obj.toString());
                    }
                    o4 = com.anythink.core.common.v.m.o();
                    if (!TextUtils.isEmpty(o4)) {
                        jSONObject2.put("amazon_id", o4);
                    }
                    p9 = com.anythink.core.common.v.m.p();
                    if (p9 > 0) {
                        jSONObject2.put(au, p9);
                    }
                    if ((i4 & 32) == 32) {
                        if (com.anythink.core.common.o.e.a().f() > 0) {
                            jSONObject2.put("t_mem", com.anythink.core.common.o.e.a().f());
                        }
                        if (com.anythink.core.common.o.e.a().g() > 0) {
                            jSONObject2.put("c_num", com.anythink.core.common.o.e.a().g());
                        }
                        if (com.anythink.core.common.o.e.a().h() > 0) {
                            jSONObject2.put("t_store", com.anythink.core.common.o.e.a().h());
                        }
                    }
                    if ((i4 & 64) == 64) {
                        String t9 = com.anythink.core.common.v.m.t();
                        if (!TextUtils.isEmpty(t9)) {
                            jSONObject2.put("bld_type", t9);
                        }
                        String u6 = com.anythink.core.common.v.m.u();
                        if (!TextUtils.isEmpty(u6)) {
                            jSONObject2.put("bld_tags", u6);
                        }
                        String v9 = com.anythink.core.common.v.m.v();
                        if (!TextUtils.isEmpty(v9)) {
                            jSONObject2.put("bld_user", v9);
                        }
                        String w3 = com.anythink.core.common.v.m.w();
                        if (!TextUtils.isEmpty(w3)) {
                            jSONObject2.put("bld_radio", w3);
                        }
                        String x9 = com.anythink.core.common.v.m.x();
                        if (!TextUtils.isEmpty(x9)) {
                            jSONObject2.put("bld_bootloader", x9);
                        }
                        String y7 = com.anythink.core.common.v.m.y();
                        if (!TextUtils.isEmpty(y7)) {
                            jSONObject2.put("bld_hardware", y7);
                        }
                        String z9 = com.anythink.core.common.v.m.z();
                        if (!TextUtils.isEmpty(z9)) {
                            jSONObject2.put("bld_host", z9);
                        }
                        String A9 = com.anythink.core.common.v.m.A();
                        if (!TextUtils.isEmpty(A9)) {
                            jSONObject2.put("bld_codename", A9);
                        }
                        String B3 = com.anythink.core.common.v.m.B();
                        if (!TextUtils.isEmpty(B3)) {
                            jSONObject2.put("bld_incremental", B3);
                        }
                        String C8 = com.anythink.core.common.v.m.C();
                        if (!TextUtils.isEmpty(C8)) {
                            jSONObject2.put("bld_serial", C8);
                        }
                        String D8 = com.anythink.core.common.v.m.D();
                        if (!TextUtils.isEmpty(D8)) {
                            jSONObject2.put("bld_display", D8);
                        }
                        String E8 = com.anythink.core.common.v.m.E();
                        if (!TextUtils.isEmpty(E8)) {
                            jSONObject2.put("bld_version_codes", E8);
                        }
                        String F8 = com.anythink.core.common.v.m.F();
                        if (!TextUtils.isEmpty(F8)) {
                            jSONObject2.put("bld_board", F8);
                        }
                    }
                    if (list != null && list.contains(j.aa.f13177a)) {
                        jSONObject2.put("s_c", com.anythink.core.common.v.m.C(g9));
                        jSONObject2.put("u_a", com.anythink.core.common.v.m.D(g9));
                        jSONObject2.put(aA, com.anythink.core.common.v.m.E(g9));
                        jSONObject2.put("d_s", com.anythink.core.common.v.m.F(g9));
                        try {
                            jSONObject2.put(aC, Integer.parseInt(com.anythink.core.common.v.m.x(g9)));
                            jSONObject2.put(aD, Integer.parseInt(com.anythink.core.common.v.m.y(g9)));
                        } catch (Exception e9) {
                            e9.printStackTrace();
                        }
                    }
                    jSONObject2.put("ip_v4", com.anythink.core.common.v.m.H());
                    jSONObject2.put("ip_v6", com.anythink.core.common.v.m.I());
                    return jSONObject2;
                }
            }
        }
        z6 = true;
        jSONObject2.put("android_id", !z6 ? com.anythink.core.common.v.m.d(g9) : "");
        jSONObject2.put("gaid", com.anythink.core.common.v.m.f());
        c9 = com.anythink.core.common.d.t.b().c();
        if (c9 != 0) {
        }
        if (!ATSDK.isCnSDK()) {
        }
        String n92 = com.anythink.core.common.v.m.n(g9);
        s9 = com.anythink.core.common.d.t.b().s();
        if (s9 != null) {
        }
        t6 = com.anythink.core.common.d.t.b().t();
        if (!TextUtils.isEmpty(t6)) {
        }
        jSONObject2.put("it_src", TextUtils.isEmpty(n92) ? "" : n92);
        jSONObject2.put(ac, j.f.f13247a);
        i6 = aj;
        if (i6 != -1) {
        }
        i9 = ak;
        if (i9 != -1) {
        }
        Q8 = com.anythink.core.common.d.t.b().Q();
        if (Q8 != null) {
        }
        Map<String, Object> m92 = com.anythink.core.common.d.t.b().m();
        obj2 = m92.get(ATCustomRuleKeys.USER_NUMBER);
        if (obj2 != null) {
        }
        obj = m92.get(ATCustomRuleKeys.USER_DEVICE_ID);
        if (obj != null) {
        }
        o4 = com.anythink.core.common.v.m.o();
        if (!TextUtils.isEmpty(o4)) {
        }
        p9 = com.anythink.core.common.v.m.p();
        if (p9 > 0) {
        }
        if ((i4 & 32) == 32) {
        }
        if ((i4 & 64) == 64) {
        }
        if (list != null) {
            jSONObject2.put("s_c", com.anythink.core.common.v.m.C(g9));
            jSONObject2.put("u_a", com.anythink.core.common.v.m.D(g9));
            jSONObject2.put(aA, com.anythink.core.common.v.m.E(g9));
            jSONObject2.put("d_s", com.anythink.core.common.v.m.F(g9));
            jSONObject2.put(aC, Integer.parseInt(com.anythink.core.common.v.m.x(g9)));
            jSONObject2.put(aD, Integer.parseInt(com.anythink.core.common.v.m.y(g9)));
        }
        jSONObject2.put("ip_v4", com.anythink.core.common.v.m.H());
        jSONObject2.put("ip_v6", com.anythink.core.common.v.m.I());
        return jSONObject2;
    }

    private static void a(Context context, JSONObject jSONObject) {
        int i4 = aj;
        if (i4 == -1) {
            boolean c9 = com.anythink.core.common.v.p.c(context);
            boolean b9 = com.anythink.core.common.v.p.b(context);
            int i6 = b9 ? 2 : c9 ? 1 : 0;
            if (c9 && b9) {
                i6 = 3;
            }
            if (i6 > 0) {
                jSONObject.put(f15402G, i6);
            }
            aj = i6;
        } else if (i4 > 0) {
            jSONObject.put(f15402G, i4);
        }
        int i9 = ak;
        if (i9 != -1) {
            if (i9 == 1) {
                jSONObject.put(f15401F, i9);
            }
        } else {
            boolean c10 = com.anythink.core.common.v.p.c();
            if (c10) {
                jSONObject.put(f15401F, 1);
            }
            ak = c10 ? 1 : 0;
        }
    }

    public static void a(JSONObject jSONObject) {
        try {
            by R8 = com.anythink.core.common.d.t.b().R();
            JSONObject jSONObject2 = new JSONObject();
            int i4 = 1;
            if (R8.b() != 1) {
                i4 = 0;
            }
            jSONObject2.put("has_sdk", i4);
            jSONObject2.put("sdk_ver", String.valueOf(R8.c()));
            jSONObject2.put("sdk_api_ver", String.valueOf(R8.d()));
            jSONObject2.put("open_app_id", com.anythink.core.common.v.m.m());
            jSONObject.put(am, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public static JSONObject a() {
        return a(com.anythink.core.common.d.t.b().m());
    }

    public static JSONObject a(String str) {
        return a(com.anythink.core.common.d.t.b().d(str));
    }

    public static JSONObject a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        try {
                            jSONObject.put(str, obj.toString());
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            return jSONObject;
        } catch (Throwable unused3) {
            return null;
        }
    }
}

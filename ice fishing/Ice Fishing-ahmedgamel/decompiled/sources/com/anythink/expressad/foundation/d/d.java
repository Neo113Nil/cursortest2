package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.basead.c.b;
import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.foundation.h.z;
import com.google.android.gms.internal.ads.Wv;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends j implements com.anythink.expressad.g.b, Serializable {

    /* renamed from: A, reason: collision with root package name */
    public static final String f19340A = "encrypt_p";

    /* renamed from: B, reason: collision with root package name */
    public static final String f19341B = "view_com_time";

    /* renamed from: C, reason: collision with root package name */
    public static final String f19342C = "adspace_t";

    /* renamed from: D, reason: collision with root package name */
    public static final String f19343D = "cbd";

    /* renamed from: E, reason: collision with root package name */
    public static final String f19344E = "vst";

    /* renamed from: F, reason: collision with root package name */
    public static final int f19345F = -2;

    /* renamed from: G, reason: collision with root package name */
    public static final int f19346G = -2;

    /* renamed from: H, reason: collision with root package name */
    public static final int f19347H = 1;

    /* renamed from: I, reason: collision with root package name */
    public static final String f19348I = "id";
    public static final String J = "unitId";

    /* renamed from: K, reason: collision with root package name */
    public static final String f19349K = "title";

    /* renamed from: L, reason: collision with root package name */
    public static final String f19350L = "desc";

    /* renamed from: M, reason: collision with root package name */
    public static final String f19351M = "package_name";

    /* renamed from: N, reason: collision with root package name */
    public static final String f19352N = "icon_url";

    /* renamed from: O, reason: collision with root package name */
    public static final String f19353O = "image_url";

    /* renamed from: P, reason: collision with root package name */
    public static final String f19354P = "image_size";

    /* renamed from: Q, reason: collision with root package name */
    public static final String f19355Q = "app_size";

    /* renamed from: R, reason: collision with root package name */
    public static final String f19356R = "impression_url";

    /* renamed from: S, reason: collision with root package name */
    public static final String f19357S = "click_url";

    /* renamed from: T, reason: collision with root package name */
    public static final String f19358T = "wtick";

    /* renamed from: U, reason: collision with root package name */
    public static final String f19359U = "deep_link";

    /* renamed from: V, reason: collision with root package name */
    public static final String f19360V = "user_activation";

    /* renamed from: W, reason: collision with root package name */
    public static final String f19361W = "notice_url";

    /* renamed from: X, reason: collision with root package name */
    public static final String f19362X = "template";
    public static final String Y = "ad_source_id";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f19363Z = "fca";

    /* renamed from: a, reason: collision with root package name */
    public static final String f19364a = "d";
    public static final String aA = "c_toi";
    public static final int aB = 2;
    public static final String aC = "5";
    public static final String aD = "rtins_type";
    public static final String aE = "ad_url_list";
    public static final String aF = "retarget_offer";
    public static final String aG = "flb";
    public static final String aH = "flb_skiptime";
    public static final String aI = "vctn_t";
    public static final String aJ = "vck_t";
    public static final String aK = "rs_ignc_r";
    public static final String aL = "privacy_url";
    public static final String aM = "show_privacy_btn";
    public static final String aN = "aab";
    public static final int aO = 1;
    public static final int aP = 2;
    public static final String aQ = "rw_pl";
    public static final String aR = "jm_pd";
    public static final String aT = "oc_type";
    public static final String aU = "oc_time";
    public static final String aV = "t_list";
    public static final String aW = "adchoice";
    public static final String aX = "omid";
    public static final String aY = "ia_icon";
    public static final String aZ = "ia_rst";
    public static final String aa = "fcb";
    public static final String ab = "click_mode";
    public static final String ac = "landing_type";
    public static final String ad = "link_type";
    public static final String ae = "rating";
    public static final String af = "number_rating";
    public static final String ag = "ctatext";
    public static final String ah = "c_ct";
    public static final String ai = "video_url";
    public static final String aj = "video_length";
    public static final String ak = "video_size";
    public static final String al = "video_resolution";
    public static final String am = "watch_mile";
    public static final String an = "endcard_click_result";
    public static final String ao = "ctype";
    public static final String ap = "adv_imp";
    public static final String aq = "t_imp";
    public static final String ar = "sec";
    public static final String as = "url";
    public static final String at = "guidelines";
    public static final String au = "offer_type";
    public static final String av = "reward_amount";
    public static final String aw = "reward_name";
    public static final String ax = "use_skip_time";
    public static final String ay = "prog_bar";
    public static final String az = "md5_file";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19365b = "ad_tpl_url";
    public static final int bA = 4;
    public static final int bB = 1;
    public static final int bC = 2;
    public static final int bD = 3;
    public static final int bE = 1;
    public static final int bF = 2;
    public static final int bG = 1;
    public static final int bH = 2;
    public static final int bI = 3;
    public static final int bJ = 4;
    public static final int bK = 8;
    public static final int bL = 9;
    public static final int bM = 12;
    public static final int bN = 0;
    public static final int bO = 0;
    public static final String bP = "video_end_type";
    public static final int bQ = 1;
    public static final int bR = 2;
    public static final int bS = 3;
    public static final int bT = 4;
    public static final int bU = 5;
    public static final int bV = 100;
    public static final int bW = 2;
    public static final String bY = "ready_rate";
    public static final String bZ = "tmp_ids";
    public static final String ba = "ia_url";
    public static final String bb = "ia_ori";
    public static final String bc = "ad_type";
    public static final String bd = "ia_ext1";
    public static final String be = "ia_ext2";
    public static final String bf = "is_download_zip";
    public static final String bg = "ia_cache";
    public static final String bh = "imp_ua";
    public static final String bi = "c_ua";
    public static final int bj = 1;
    public static final int bk = 1;
    public static final String bl = "iex";
    public static final String bm = "ts";
    public static final String bn = "nv_t2";
    public static final String bo = "impression_t2";
    public static final String bp = "gif_url";
    public static final String bq = "dropout_track";
    public static final String br = "plycmpt_track";
    public static final String bs = "aks";
    public static final String bt = "k";
    public static final String bu = "q";
    public static final String bv = "r";
    public static final String bw = "al";
    public static final String bx = "mp";
    public static final String by = "pv_urls";
    public static final int bz = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final String f19366c = "ad_html";
    public static final int cA = 0;
    public static final String ca = "ext_data";
    public static final String cb = "endcard_url";
    public static final String cc = "playable_ads_without_video";
    public static final int cd = 1;
    public static final int ce = 2;
    public static final String cf = "impression";
    public static final String cg = "start";
    public static final String ch = "first_quartile";
    public static final String ci = "midpoint";
    public static final String cj = "third_quartile";
    public static final String ck = "complete";
    public static final String cl = "mute";
    public static final String cm = "unmute";
    public static final String cn = "click";
    public static final String co = "pause";
    public static final String cp = "resume";
    public static final String cq = "error";
    public static final String cr = "endcard";
    public static final String cs = "close";
    public static final String ct = "video_click";
    public static final String cu = "endcard_show";
    public static final String cv = "play_percentage";
    public static final String cw = "ad_tracking";
    public static final String cx = "rv";
    public static final int cy = -1;
    public static final int cz = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final String f19367d = "cmpt=1";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19368e = "tp_offer";
    private static final long em = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final String f19369f = "fac";
    private static final int fq = 100;

    /* renamed from: g, reason: collision with root package name */
    public static final String f19370g = "at_cd_rate";

    /* renamed from: h, reason: collision with root package name */
    public static final String f19371h = "imp_report_type";
    public static final String i = "at_ac_b";

    /* renamed from: j, reason: collision with root package name */
    public static final String f19372j = "plct";

    /* renamed from: k, reason: collision with root package name */
    public static final String f19373k = "plctb";

    /* renamed from: l, reason: collision with root package name */
    public static final String f19374l = "banner_url";

    /* renamed from: m, reason: collision with root package name */
    public static final String f19375m = "banner_html";

    /* renamed from: n, reason: collision with root package name */
    public static final String f19376n = "creative_id";

    /* renamed from: o, reason: collision with root package name */
    public static final String f19377o = "vid_crtv_id";

    /* renamed from: p, reason: collision with root package name */
    public static final String f19378p = "ec_crtv_id";

    /* renamed from: q, reason: collision with root package name */
    public static final String f19379q = "local_rid";

    /* renamed from: r, reason: collision with root package name */
    public static final String f19380r = "ec_temp_id";

    /* renamed from: s, reason: collision with root package name */
    public static final String f19381s = "mraid";

    /* renamed from: t, reason: collision with root package name */
    public static final String f19382t = "mraid_src";

    /* renamed from: u, reason: collision with root package name */
    public static final String f19383u = "timestamp";

    /* renamed from: v, reason: collision with root package name */
    public static final String f19384v = "hb";

    /* renamed from: w, reason: collision with root package name */
    public static final String f19385w = "maitve";

    /* renamed from: x, reason: collision with root package name */
    public static final String f19386x = "maitve_src";

    /* renamed from: y, reason: collision with root package name */
    public static final String f19387y = "vcn";

    /* renamed from: z, reason: collision with root package name */
    public static final String f19388z = "token_r";
    public r aS;
    private boolean dG;
    private int dQ;
    private int dR;
    private int dS;
    private int dT;
    private int dU;
    private int dV;
    private String dW;
    private int dX;
    private String dY;
    private int dZ;

    /* renamed from: do, reason: not valid java name */
    private List<String> f2do;
    private long dp;
    private int dv;
    private int eA;
    private String eB;
    private String eC;
    private String eD;
    private String eE;
    private String eF;
    private int eG;
    private boolean eH;
    private boolean eJ;
    private int eK;
    private int eM;
    private String eN;
    private int eO;
    private int eP;
    private String eQ;
    private int eR;
    private int eS;
    private int eT;
    private String eU;
    private int eV;
    private String eW;
    private String eX;
    private int eY;
    private String eZ;
    private int ea;
    private String eb;
    private String ec;
    private int ed;
    private String ee;
    private a ef;
    private int eh;
    private String ei;
    private String eo;
    private int ey;
    private int ez;
    private p fB;
    private String fC;
    private String fD;
    private int fE;
    private long fF;
    private String fG;
    private String fH;
    private int fI;
    private String fJ;
    private int fK;
    private b fL;
    private c fM;
    private com.anythink.expressad.b.a.b fN;
    private int fQ;
    private ArrayList<Integer> fS;
    private com.anythink.expressad.foundation.d.a fW;
    private String fZ;
    private int fa;
    private String fb;
    private HashMap<String, String> fc;
    private String fd;
    private String fe;
    private String ff;
    private String fg;
    private String fh;
    private boolean fi;
    private String fk;
    private boolean fl;
    private boolean fm;
    private int fo;
    private String fr;
    private String ft;
    private String fu;
    private int fv;
    private String fw;
    private String fz;
    private int gb;
    private int gd;
    private int ge;
    private int dk = 1;
    private String dl = "";
    private String dm = "";
    private boolean dn = false;
    private int dq = 0;
    private int dr = 0;
    private int ds = 0;
    private int dt = 0;
    private int du = 0;
    private int dw = -2;
    private int dx = -2;
    private long dy = 0;
    private long dz = 0;
    private String dA = "";
    private String dB = "";
    private long dC = 0;
    private long dD = 0;
    private long dE = 0;
    private long dF = 0;
    private int dH = 0;
    private int dI = 0;
    private String dJ = "";
    private boolean dK = false;
    private int dL = 0;
    private boolean dM = false;
    private String dN = "";
    private int dO = 0;
    private int dP = -1;
    private int eg = 0;
    private String ej = "";
    private int ek = 1;
    private int el = 1;
    private int en = 6;
    private int ep = -1;
    private String eq = "";
    private String er = "";
    private String es = "";
    private int et = 0;
    private String eu = "";
    private boolean ev = false;
    private String ew = "";
    private String ex = "";
    private boolean eI = false;
    private String eL = "";
    private String fj = "";
    private int fn = 2;
    public String bX = "";
    private int fp = -1;
    private int fs = 1;
    private int fx = 0;
    private int fy = 2;
    private int fA = 1;
    private boolean fO = false;
    private String fP = null;
    private String fR = "";
    private int fT = 2;
    private int fU = 1;
    private int fV = -1;
    private boolean fX = false;
    private boolean fY = false;
    public boolean cB = false;
    private int ga = 0;
    public boolean cC = false;
    private int gc = 0;
    private int gf = j.g.b.f13259a;
    private int gg = 1;

    public static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final String f19389a = "ad_logo_link";

        /* renamed from: b, reason: collision with root package name */
        public static final String f19390b = "adchoice_link";

        /* renamed from: c, reason: collision with root package name */
        public static final String f19391c = "adchoice_icon";

        /* renamed from: d, reason: collision with root package name */
        public static final String f19392d = "adchoice_size";

        /* renamed from: e, reason: collision with root package name */
        public static final String f19393e = "platform_name";

        /* renamed from: f, reason: collision with root package name */
        public static final String f19394f = "platform_logo";

        /* renamed from: g, reason: collision with root package name */
        public static final String f19395g = "adv_name";

        /* renamed from: h, reason: collision with root package name */
        public static final String f19396h = "adv_logo";
        private String i = "";

        /* renamed from: j, reason: collision with root package name */
        private String f19397j = "";

        /* renamed from: k, reason: collision with root package name */
        private String f19398k = "";

        /* renamed from: l, reason: collision with root package name */
        private String f19399l = "";

        /* renamed from: m, reason: collision with root package name */
        private String f19400m = "";

        /* renamed from: n, reason: collision with root package name */
        private String f19401n = "";

        /* renamed from: o, reason: collision with root package name */
        private String f19402o = "";

        /* renamed from: p, reason: collision with root package name */
        private String f19403p = "";

        /* renamed from: q, reason: collision with root package name */
        private int f19404q = 0;

        /* renamed from: r, reason: collision with root package name */
        private int f19405r = 0;

        /* renamed from: s, reason: collision with root package name */
        private String f19406s = "";

        private void a(int i) {
            this.f19404q = i;
        }

        private void b(int i) {
            this.f19405r = i;
        }

        private void c(String str) {
            this.f19406s = str;
        }

        private void d(String str) {
            this.i = str;
        }

        private int e() {
            return this.f19404q;
        }

        private int f() {
            return this.f19405r;
        }

        private String g() {
            return this.i;
        }

        private String h() {
            return this.f19400m;
        }

        private String i() {
            return this.f19401n;
        }

        private String j() {
            return this.f19402o;
        }

        private String k() {
            return this.f19403p;
        }

        private boolean l() {
            return (TextUtils.isEmpty(this.f19397j) || TextUtils.isEmpty(this.f19399l) || TextUtils.isEmpty(this.f19398k)) ? false : true;
        }

        private void e(String str) {
            this.f19398k = str;
        }

        private void f(String str) {
            this.f19399l = str;
        }

        private void g(String str) {
            this.f19400m = str;
        }

        private void h(String str) {
            this.f19401n = str;
        }

        private void i(String str) {
            this.f19402o = str;
        }

        private void j(String str) {
            this.f19403p = str;
        }

        private static int k(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 1) {
                    return Integer.parseInt(split[1]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        public final String a() {
            return this.f19406s;
        }

        public final String b() {
            return this.f19397j;
        }

        public final String c() {
            return this.f19398k;
        }

        public final String d() {
            return this.f19399l;
        }

        public static a b(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return a(new JSONObject(str));
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f18405a) {
                    e9.printStackTrace();
                }
                return null;
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f18405a) {
                    th.printStackTrace();
                }
                return null;
            }
        }

        private static int l(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 0) {
                    return Integer.parseInt(split[0]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        public final void a(String str) {
            this.f19397j = str;
        }

        private static a a(JSONObject jSONObject) {
            a aVar = null;
            try {
                a aVar2 = new a();
                try {
                    aVar2.f19398k = jSONObject.optString("adchoice_icon");
                    aVar2.f19397j = jSONObject.optString("adchoice_link");
                    String optString = jSONObject.optString("adchoice_size");
                    aVar2.f19399l = optString;
                    aVar2.i = jSONObject.optString(f19389a);
                    aVar2.f19403p = jSONObject.optString(f19396h);
                    aVar2.f19402o = jSONObject.optString(f19395g);
                    aVar2.f19401n = jSONObject.optString("platform_logo");
                    aVar2.f19400m = jSONObject.optString("platform_name");
                    aVar2.f19405r = k(optString);
                    aVar2.f19404q = l(optString);
                    aVar2.f19406s = jSONObject.toString();
                    return aVar2;
                } catch (Exception e9) {
                    e = e9;
                    aVar = aVar2;
                    if (com.anythink.expressad.a.f18405a) {
                        e.printStackTrace();
                    }
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar2;
                    if (com.anythink.expressad.a.f18405a) {
                        th.printStackTrace();
                    }
                    return aVar;
                }
            } catch (Exception e10) {
                e = e10;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19407a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19408b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19409c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f19410d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f19411e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f19412f = false;

        /* renamed from: g, reason: collision with root package name */
        public boolean f19413g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f19414h = false;
        public boolean i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f19415j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f19416k = false;

        /* renamed from: l, reason: collision with root package name */
        public Map<Integer, String> f19417l;
    }

    public static final class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final String f19418a = "video_template";

        /* renamed from: b, reason: collision with root package name */
        public static final String f19419b = "template_url";

        /* renamed from: c, reason: collision with root package name */
        public static final String f19420c = "orientation";

        /* renamed from: d, reason: collision with root package name */
        public static final String f19421d = "paused_url";

        /* renamed from: e, reason: collision with root package name */
        public static final String f19422e = "image";

        /* renamed from: f, reason: collision with root package name */
        private static final int f19423f = 1;

        /* renamed from: g, reason: collision with root package name */
        private String f19424g;

        /* renamed from: h, reason: collision with root package name */
        private int f19425h;
        private int i;

        /* renamed from: j, reason: collision with root package name */
        private String f19426j;

        /* renamed from: k, reason: collision with root package name */
        private String f19427k;

        /* renamed from: l, reason: collision with root package name */
        private List<a> f19428l;

        public static final class a implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            public String f19429a;

            /* renamed from: b, reason: collision with root package name */
            public List<String> f19430b = new ArrayList();
        }

        private c(String str) {
            this.f19424g = str;
        }

        private void b(String str) {
            this.f19424g = str;
        }

        public final int c() {
            return this.i;
        }

        public final String d() {
            return this.f19426j;
        }

        public final String e() {
            return this.f19427k;
        }

        public final List<a> f() {
            return this.f19428l;
        }

        private void c(String str) {
            this.f19426j = str;
        }

        private static c d(String str) {
            try {
                if (y.b(str)) {
                    return a(new JSONObject(str));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final String a() {
            return this.f19424g;
        }

        public final int b() {
            return this.f19425h;
        }

        private void a(int i) {
            this.f19425h = i;
        }

        private void b(int i) {
            this.i = i;
        }

        public final void a(String str) {
            this.f19427k = z.d(str);
        }

        private void a(List<a> list) {
            this.f19428l = list;
        }

        public static c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                if (!y.b(jSONObject.toString())) {
                    return null;
                }
                c cVar = new c(jSONObject.toString());
                cVar.f19425h = jSONObject.optInt(f19418a, 1);
                cVar.a(jSONObject.optString("template_url"));
                cVar.i = jSONObject.optInt("orientation");
                cVar.f19426j = jSONObject.optString(f19421d);
                JSONObject optJSONObject = jSONObject.optJSONObject(f19422e);
                if (optJSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        List<String> a9 = v.a(optJSONObject.optJSONArray(next));
                        if (a9 != null && a9.size() > 0) {
                            a aVar = new a();
                            aVar.f19429a = next;
                            aVar.f19430b.addAll(a9);
                            arrayList.add(aVar);
                        }
                    }
                    cVar.f19428l = arrayList;
                }
                return cVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private void A(int i4) {
        this.dQ = i4;
    }

    private void B(int i4) {
        this.dR = i4;
    }

    private void C(int i4) {
        this.eg = i4;
    }

    private void D(String str) {
        this.dN = str;
    }

    private void E(String str) {
        this.ei = str;
    }

    private void F(String str) {
        this.ee = str;
    }

    private void G(int i4) {
        this.dT = i4;
    }

    private void H(int i4) {
        this.dU = i4;
    }

    private void I(int i4) {
        this.dS = i4;
    }

    private void J(int i4) {
        this.en = i4;
    }

    private void K(String str) {
        this.fg = str;
    }

    private void L(String str) {
        this.fh = str;
    }

    private void M(String str) {
        this.fj = str;
    }

    private void N(String str) {
        this.bX = str;
    }

    private void O(int i4) {
        this.fA = i4;
    }

    private void P(String str) {
        this.fb = str;
    }

    private void Q(String str) {
        this.fG = str;
    }

    private void R(String str) {
        this.fH = str;
    }

    private void S(String str) {
        this.eU = str;
    }

    private void T(int i4) {
        this.eY = i4;
    }

    private void U(int i4) {
        this.eS = i4;
    }

    private void V(int i4) {
        this.eP = i4;
    }

    private void W(int i4) {
        this.eR = i4;
    }

    private void X(int i4) {
        this.eM = i4;
    }

    private void Y(int i4) {
        this.eO = i4;
    }

    private void Z(int i4) {
        this.eK = i4;
    }

    private void aa(int i4) {
        this.eG = i4;
    }

    private void ab(int i4) {
        this.fy = i4;
    }

    private void an(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split(",");
        if (split.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String str2 : split) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            this.fS = arrayList;
        }
    }

    private long bA() {
        return this.dz;
    }

    private long bB() {
        return this.dD;
    }

    private long bC() {
        return this.dE;
    }

    private r bD() {
        return this.aS;
    }

    private int bE() {
        return this.eg;
    }

    private int bF() {
        return this.eh;
    }

    private String bG() {
        return this.ei;
    }

    private String bH() {
        return this.ee;
    }

    private int bI() {
        return this.ed;
    }

    private String bJ() {
        return this.ej;
    }

    private String bK() {
        return this.eb;
    }

    private String bL() {
        return this.ec;
    }

    private String bM() {
        return this.dW;
    }

    private int bN() {
        return this.dX;
    }

    private String bO() {
        return this.dY;
    }

    private int bP() {
        return this.dZ;
    }

    private int bQ() {
        return this.dV;
    }

    private int bR() {
        return this.dS;
    }

    private int bS() {
        return this.dT;
    }

    private int bT() {
        return this.dU;
    }

    private int bU() {
        return this.eT;
    }

    private String bV() {
        return this.fd;
    }

    private String bW() {
        return this.fe;
    }

    private String bX() {
        return this.ff;
    }

    private String bY() {
        return this.fg;
    }

    private String bZ() {
        return this.fh;
    }

    private int br() {
        return this.ds;
    }

    private int bs() {
        return this.dt;
    }

    private int bt() {
        return this.dq;
    }

    private int bu() {
        return this.dr;
    }

    private int bv() {
        return this.dk;
    }

    private String bw() {
        return this.dJ;
    }

    private int bx() {
        int i4 = this.dI;
        if (i4 == 1) {
            return i4;
        }
        return 0;
    }

    private int by() {
        int i4 = this.dH;
        if (i4 > 0) {
            return i4;
        }
        return 1;
    }

    private void bz() {
        this.dK = true;
    }

    private String cA() {
        return this.fr;
    }

    private String cB() {
        return this.fw;
    }

    private int cC() {
        return this.fI;
    }

    private String cD() {
        return this.fJ;
    }

    private String cE() {
        return this.fP;
    }

    private String cF() {
        return this.fR;
    }

    private long cG() {
        return this.dp;
    }

    private String cH() {
        ArrayList<Integer> arrayList = this.fS;
        if (arrayList == null || arrayList.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Integer> it = this.fS.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
            return !TextUtils.isEmpty(sb) ? sb.toString() : "";
        } catch (Throwable th) {
            th.getMessage();
            return "";
        }
    }

    private int cI() {
        return this.fT;
    }

    private int cJ() {
        return this.fV;
    }

    private boolean cK() {
        return this.fY;
    }

    private int cL() {
        return this.gb;
    }

    private String ca() {
        return this.bX;
    }

    private String cb() {
        return this.fC;
    }

    private String cc() {
        return this.fb;
    }

    private String cd() {
        return this.fG;
    }

    private String ce() {
        return this.fH;
    }

    private int cf() {
        return this.fE;
    }

    private long cg() {
        return this.fF;
    }

    private b ch() {
        return this.fL;
    }

    private int ci() {
        return this.fa;
    }

    private String cj() {
        return this.eU;
    }

    private String ck() {
        return this.eW;
    }

    private int cl() {
        return this.eY;
    }

    private String cm() {
        return this.eZ;
    }

    private int cn() {
        return this.eP;
    }

    private String co() {
        return this.eQ;
    }

    private int cp() {
        return this.eR;
    }

    private int cq() {
        return this.eO;
    }

    private int cr() {
        return this.eK;
    }

    private boolean cs() {
        return this.eI;
    }

    private int ct() {
        return this.eG;
    }

    private int cu() {
        return this.ez;
    }

    private int cv() {
        return this.eA;
    }

    private int cw() {
        return this.ep;
    }

    private boolean cx() {
        return this.ev;
    }

    private int cy() {
        return this.ey;
    }

    private String cz() {
        return this.ex;
    }

    private void u(int i4) {
        this.du = i4;
    }

    private void v(int i4) {
        this.dq = i4;
    }

    private void w(int i4) {
        this.dr = i4;
    }

    private void x(int i4) {
        this.dv = i4;
    }

    private void y(int i4) {
        this.dw = i4;
    }

    private void z(int i4) {
        this.dL = v.a(i4);
    }

    public final void a(int i4) {
        this.ds = i4;
    }

    public final boolean aA() {
        return (TextUtils.isEmpty(this.fP) || TextUtils.isEmpty(com.anythink.expressad.a.f18427x)) ? false : true;
    }

    public final int aB() {
        return this.fQ;
    }

    public final boolean aC() {
        return b(this);
    }

    public final com.anythink.expressad.foundation.d.a aD() {
        return this.fW;
    }

    public final ArrayList<Integer> aE() {
        return this.fS;
    }

    public final int aF() {
        return this.fU;
    }

    public final boolean aG() {
        return this.fX;
    }

    public final String aH() {
        return this.fZ;
    }

    public final int aI() {
        return this.ga;
    }

    public final int aJ() {
        return this.gd;
    }

    public final int aK() {
        return this.ge;
    }

    public final int aL() {
        return this.gc;
    }

    public final int aM() {
        return this.gf;
    }

    public final boolean aN() {
        return this.gg == 1;
    }

    public final String ac() {
        try {
            if (!TextUtils.isEmpty(this.eF)) {
                return this.eF;
            }
            if (TextUtils.isEmpty(this.er)) {
                return "";
            }
            Uri parse = Uri.parse(this.er);
            if (parse != null) {
                this.eF = parse.getQueryParameter("k");
            }
            return this.eF;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String ad() {
        return this.eB;
    }

    public final String ae() {
        return this.eC;
    }

    public final String af() {
        return this.es;
    }

    public final int ag() {
        return this.et;
    }

    public final String ah() {
        return this.eu;
    }

    public final String ai() {
        try {
            String str = this.eq;
            StringBuilder sb = new StringBuilder();
            sb.append(com.anythink.expressad.foundation.h.n.k());
            String a9 = v.a(str, "&tun=", sb.toString());
            this.eq = a9;
            return a9;
        } catch (Exception e9) {
            e9.getMessage();
            return this.eq;
        }
    }

    public final String aj() {
        try {
            String str = this.er;
            StringBuilder sb = new StringBuilder();
            sb.append(com.anythink.expressad.foundation.h.n.k());
            String a9 = v.a(str, "&tun=", sb.toString());
            this.er = a9;
            return a9;
        } catch (Exception e9) {
            e9.getMessage();
            return this.er;
        }
    }

    public final String ak() {
        try {
            String str = this.ew;
            StringBuilder sb = new StringBuilder();
            sb.append(com.anythink.expressad.foundation.h.n.k());
            String a9 = v.a(str, "&tun=", sb.toString());
            this.ew = a9;
            return a9;
        } catch (Exception e9) {
            e9.getMessage();
            return this.ew;
        }
    }

    @Override // com.anythink.expressad.foundation.d.j
    public final com.anythink.expressad.b.a.b al() {
        return this.fN;
    }

    public final String am() {
        if (TextUtils.isEmpty(aj())) {
            return "";
        }
        try {
            URL url = new URL(aj());
            return url.getProtocol() + "://" + url.getHost();
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    public final boolean ao() {
        return this.fm;
    }

    public final void ap() {
        this.fm = true;
    }

    public final int aq() {
        return this.fp;
    }

    public final int ar() {
        return this.fs;
    }

    public final String as() {
        return this.ft;
    }

    public final String at() {
        return this.fu;
    }

    public final int au() {
        return this.fv;
    }

    public final boolean av() {
        return this.dn;
    }

    public final void aw() {
        this.dn = true;
    }

    public final int ax() {
        return this.fx;
    }

    public final boolean ay() {
        return this.fO;
    }

    public final void az() {
        this.fO = true;
    }

    public final void b(int i4) {
        this.dt = i4;
    }

    public final String c() {
        return this.dm;
    }

    public final List<String> d() {
        return this.f2do;
    }

    public final int e() {
        return this.dv;
    }

    public final int f() {
        return this.dw;
    }

    public final int g() {
        return this.dx;
    }

    public final String h() {
        return this.dN;
    }

    public final int i() {
        return this.dO;
    }

    public final boolean j() {
        return this.dK;
    }

    public final int k() {
        return this.dL;
    }

    public final boolean l() {
        return this.dM;
    }

    public final void m() {
        this.dM = true;
    }

    public final int n() {
        return this.dP;
    }

    public final long o() {
        return this.dy;
    }

    public final String p() {
        return this.dA;
    }

    public final String q() {
        return this.dB;
    }

    public final long r() {
        return this.dC;
    }

    public final long s() {
        return this.dF;
    }

    public final boolean t() {
        return this.dG;
    }

    private void D(int i4) {
        this.eh = i4;
    }

    private void E(int i4) {
        this.ed = i4;
    }

    private void F(int i4) {
        this.dV = i4;
    }

    private void G(String str) {
        this.eo = str;
    }

    private void H(String str) {
        this.fd = str;
    }

    private void I(String str) {
        this.fe = str;
    }

    private void J(String str) {
        this.ff = str;
    }

    private void K(int i4) {
        this.fo = i4;
    }

    private void L(int i4) {
        this.ek = i4;
    }

    private void M(int i4) {
        this.el = i4;
    }

    private void N(int i4) {
        this.fn = i4;
    }

    private void O(String str) {
        this.fC = str;
    }

    private void P(int i4) {
        this.fE = i4;
    }

    private void Q(int i4) {
        this.fK = i4;
    }

    private void R(int i4) {
        this.fa = i4;
    }

    private void S(int i4) {
        this.eV = i4;
    }

    private void T(String str) {
        this.eZ = str;
    }

    private void U(String str) {
        this.eQ = str;
    }

    private void V(String str) {
        this.eL = str;
    }

    private void W(String str) {
        this.eN = str;
    }

    public static String ab() {
        return "";
    }

    private void ad(int i4) {
        this.eA = i4;
    }

    private void ae(int i4) {
        this.ep = i4;
    }

    private void af(int i4) {
        this.et = i4;
    }

    private void ag(int i4) {
        this.ey = i4;
    }

    private void ah(int i4) {
        this.fp = i4;
    }

    private void al(String str) {
        this.fP = str;
    }

    private void ao(int i4) {
        this.gd = i4;
    }

    private void ap(int i4) {
        this.ge = i4;
    }

    private void aq(int i4) {
        this.gc = i4;
        if (i4 == 1) {
            int i6 = this.ea;
            if (i6 == 296 || i6 == 42) {
                String ai2 = ai();
                String ak2 = ak();
                if (!TextUtils.isEmpty(ai2) && !ai2.contains(f19371h)) {
                    this.eq = ai2 + "&imp_report_type=" + i4;
                }
                if (TextUtils.isEmpty(ak2) || ak2.contains(f19371h)) {
                    return;
                }
                this.ew = ak2 + "&imp_report_type=" + i4;
            }
        }
    }

    private void ar(int i4) {
        this.gf = i4;
    }

    public final HashMap<String, String> A() {
        return this.fc;
    }

    public final boolean B() {
        return this.fi;
    }

    public final String C() {
        return this.fj;
    }

    public final boolean X() {
        return this.eJ;
    }

    public final void Y() {
        this.eJ = true;
    }

    public final int Z() {
        return this.fy;
    }

    public final int a() {
        return this.du;
    }

    public final String aa() {
        try {
            if (!TextUtils.isEmpty(this.eD)) {
                return this.eD;
            }
            if (TextUtils.isEmpty(this.ew)) {
                return null;
            }
            Uri parse = Uri.parse(this.ew);
            if (parse != null) {
                this.eD = parse.getQueryParameter("k");
            }
            return this.eD;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String b() {
        return this.dl;
    }

    public final void c(int i4) {
        this.dx = i4;
    }

    public final void d(int i4) {
        this.dO = i4;
    }

    public final void e(int i4) {
        this.dI = i4;
    }

    public final void f(int i4) {
        this.dH = i4;
    }

    public final void g(int i4) {
        this.dP = i4;
    }

    public final void h(int i4) {
        this.ea = i4;
    }

    public final void i(int i4) {
        this.dX = i4;
    }

    public final void j(int i4) {
        this.dZ = i4;
    }

    public final void k(int i4) {
        this.eT = i4;
    }

    public final void l(String str) {
        this.fD = str;
    }

    public final void m(String str) {
        this.eW = str;
    }

    public final void n(String str) {
        this.eX = z.d(str);
    }

    @Override // com.anythink.expressad.out.k
    public final void o(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.eS != 2 ? "Learn more" : "Install";
        }
        super.o(str);
    }

    public final void p(String str) {
        this.es = str;
    }

    public final void q(String str) {
        this.eu = str;
    }

    public final void r(String str) {
        this.er = str;
    }

    public final void s(String str) {
        this.ft = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.fu = str;
        boolean e9 = v.e(str);
        int g9 = v.g(str);
        if (e9) {
            this.dK = true;
            z(g9);
        }
        this.fX = v.d(str);
    }

    public final void t(String str) {
        this.fw = str;
    }

    public final int u() {
        return this.dQ;
    }

    public final int v() {
        return this.dR;
    }

    public final a w() {
        return this.ef;
    }

    public final int x() {
        return this.ea;
    }

    public final int y() {
        return this.en;
    }

    public final String z() {
        return this.eo;
    }

    private void X(String str) {
        this.eD = str;
    }

    private void Y(String str) {
        this.eE = str;
    }

    private void Z(String str) {
        this.eF = str;
    }

    private void ab(String str) {
        this.eC = str;
    }

    private void ad(String str) {
        this.ew = str;
    }

    private void ae(String str) {
        this.ex = str;
    }

    private static p af(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                p pVar = new p();
                pVar.r(a(jSONObject.optJSONArray("impression")));
                pVar.g(a(jSONObject.optJSONArray(cg)));
                pVar.h(a(jSONObject.optJSONArray(ch)));
                pVar.i(a(jSONObject.optJSONArray(ci)));
                pVar.j(a(jSONObject.optJSONArray(cj)));
                pVar.k(a(jSONObject.optJSONArray(ck)));
                pVar.a(b(jSONObject.optJSONArray(cv)));
                pVar.l(a(jSONObject.optJSONArray("mute")));
                pVar.m(a(jSONObject.optJSONArray(cm)));
                pVar.n(a(jSONObject.optJSONArray("click")));
                pVar.o(a(jSONObject.optJSONArray(co)));
                pVar.p(a(jSONObject.optJSONArray(cp)));
                pVar.q(a(jSONObject.optJSONArray("error")));
                pVar.s(a(jSONObject.optJSONArray(cr)));
                pVar.u(a(jSONObject.optJSONArray(cs)));
                pVar.t(a(jSONObject.optJSONArray(cu)));
                pVar.v(a(jSONObject.optJSONArray(ct)));
                pVar.f(a(jSONObject.optJSONArray(bo)));
                pVar.d(a(jSONObject.optJSONArray(bq)));
                pVar.e(a(jSONObject.optJSONArray(br)));
                pVar.a(a(jSONObject.optJSONArray(j.cZ)));
                pVar.b(a(jSONObject.optJSONArray(j.da)));
                pVar.c(a(jSONObject.optJSONArray(j.db)));
                return pVar;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    private static Map<Integer, String> ag(String str) {
        HashMap hashMap = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    HashMap hashMap2 = new HashMap();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        try {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                            int optInt = optJSONObject.optInt(ar);
                            hashMap2.put(Integer.valueOf(optInt), optJSONObject.optString("url"));
                        } catch (Exception e9) {
                            e = e9;
                            hashMap = hashMap2;
                            e.printStackTrace();
                            return hashMap;
                        }
                    }
                    return hashMap2;
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        return hashMap;
    }

    private void ah(String str) {
        this.fr = str;
    }

    private void al(int i4) {
        if (i4 <= 2 && i4 > 0) {
            this.fU = i4;
        } else {
            this.fU = 1;
        }
    }

    private void f(long j6) {
        this.dE = j6;
    }

    private void g(long j6) {
        this.dF = j6;
    }

    public final int D() {
        return this.fo;
    }

    public final int E() {
        return this.ek;
    }

    public final int F() {
        return this.el;
    }

    public final int G() {
        return this.fn;
    }

    public final String H() {
        return this.fk;
    }

    public final boolean I() {
        return this.fl;
    }

    public final String J() {
        if (!TextUtils.isEmpty(this.fz)) {
            return Wv.i(new StringBuilder(), this.fz, "&n_logo=0");
        }
        return this.fz;
    }

    public final int K() {
        return this.fA;
    }

    public final String L() {
        return this.fD;
    }

    public final p M() {
        return this.fB;
    }

    public final c N() {
        return this.fM;
    }

    public final int O() {
        return this.fK;
    }

    public final int P() {
        return this.eV;
    }

    public final String Q() {
        return this.eX;
    }

    public final int R() {
        return this.eS;
    }

    public final Map<Integer, String> S() {
        return ag(this.eQ);
    }

    public final String T() {
        return this.eL;
    }

    public final int U() {
        return this.eM;
    }

    public final String V() {
        return this.eN;
    }

    public final boolean W() {
        return this.eH;
    }

    public final void a(String str) {
        this.dl = str;
        boolean e9 = v.e(str);
        int g9 = v.g(str);
        if (e9) {
            this.dK = true;
            z(g9);
        }
    }

    public final void b(String str) {
        this.dm = str;
    }

    public final void c(String str) {
        this.dJ = str;
    }

    public final void d(String str) {
        this.dA = z.d(str);
    }

    public final void e(String str) {
        this.dB = str;
    }

    public final void h(String str) {
        this.dW = str;
    }

    public final void i(String str) {
        this.dY = str;
    }

    public final void j(String str) {
        this.fk = str;
    }

    public final void k(String str) {
        c cVar;
        this.fz = str;
        if (TextUtils.isEmpty(this.ft) && (((cVar = this.fM) == null || TextUtils.isEmpty(cVar.f19427k)) && !TextUtils.isEmpty(str) && str.contains(f19367d))) {
            this.fu = str;
        }
        this.fY = v.d(str);
        b(str, "endcard_url");
    }

    public final void l(int i4) {
        this.fs = i4;
    }

    public final void m(int i4) {
        this.fv = i4;
    }

    public final void n(int i4) {
        this.fx = i4;
    }

    public final void p(int i4) {
        this.ga = i4;
    }

    public final void q(int i4) {
        this.gg = i4;
    }

    public final void u(String str) {
        this.fZ = str;
    }

    private void ai(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals(this.ft) || !this.dK) {
            boolean e9 = v.e(str);
            int g9 = v.g(str);
            if (e9) {
                this.dK = true;
                z(g9);
            }
        }
    }

    private void aj(String str) {
        this.fu = str;
    }

    private void ak(String str) {
        this.fJ = str;
    }

    private void b(long j6) {
        this.dy = j6;
    }

    private void c(long j6) {
        this.dz = j6;
    }

    private void d(long j6) {
        this.dC = j6;
    }

    private void e(long j6) {
        this.dD = j6;
    }

    private void h(long j6) {
        this.fF = j6;
    }

    private boolean i(long j6) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.dy > 0) {
            return (this.dy * 1000) + bo() >= currentTimeMillis;
        }
        return bo() + j6 >= currentTimeMillis;
    }

    private void j(long j6) {
        this.dp = j6;
    }

    public final void f(String str) {
        this.eb = str;
    }

    public final void g(String str) {
        this.ec = str;
    }

    private void aj(int i4) {
        this.fI = i4;
    }

    private void ak(int i4) {
        if (i4 <= 2 && i4 > 0) {
            this.fT = i4;
        } else {
            this.fT = 2;
        }
    }

    private void d(boolean z6) {
        this.fi = z6;
    }

    private void e(boolean z6) {
        this.eI = z6;
    }

    private void f(boolean z6) {
        this.ev = z6;
    }

    private void g(boolean z6) {
        this.fX = z6;
    }

    private void h(boolean z6) {
        this.fY = z6;
    }

    public final void b(boolean z6) {
        this.fl = z6;
    }

    public final void c(boolean z6) {
        this.eH = z6;
    }

    private void am(String str) {
        this.fR = str;
    }

    private void b(String str, String str2) {
        JSONObject jSONObject;
        try {
            int b9 = v.b(str, com.anythink.expressad.a.f18395P);
            if (b9 == 0) {
                return;
            }
            if (TextUtils.isEmpty(this.ej)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(this.ej);
            }
            int b10 = v.b(str, com.anythink.expressad.a.f18396Q);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.expressad.a.f18395P, b9);
            jSONObject2.put(com.anythink.expressad.a.f18396Q, b10);
            jSONObject.put(str2, jSONObject2);
            this.ej = jSONObject.toString();
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private static JSONObject c(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            if (jSONObject.has(bZ) && (optJSONArray = jSONObject.optJSONArray(bZ)) != null && optJSONArray.length() > 0) {
                jSONObject.remove(bZ);
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    JSONObject a9 = com.anythink.expressad.foundation.c.a.a.a().a(optJSONArray.getString(i4));
                    if (a9 != null) {
                        Iterator<String> keys = a9.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject.put(next, a9.opt(next));
                        }
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private void am(int i4) {
        this.fV = i4;
    }

    public final void o(int i4) {
        this.fQ = i4;
    }

    private void an(int i4) {
        this.gb = i4;
    }

    public final void a(List<String> list) {
        this.f2do = list;
    }

    private void aa(String str) {
        this.eB = str;
    }

    private void ac(int i4) {
        this.ez = i4;
    }

    public final void a(boolean z6) {
        this.dG = z6;
    }

    public final List<String> an() {
        Exception e9;
        ArrayList arrayList;
        String str = this.fb;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            arrayList = new ArrayList();
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                try {
                    arrayList.add(jSONArray.optString(i4));
                } catch (Exception e10) {
                    e9 = e10;
                    e9.printStackTrace();
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Exception e11) {
            e9 = e11;
            arrayList = null;
        }
    }

    private void a(a aVar) {
        this.ef = aVar;
    }

    private void ac(String str) {
        this.eq = str;
    }

    private void ai(int i4) {
        this.dk = i4;
    }

    private void a(r rVar) {
        this.aS = rVar;
    }

    private void a(HashMap<String, String> hashMap) {
        this.fc = hashMap;
    }

    private void a(p pVar) {
        this.fB = pVar;
    }

    private void a(b bVar) {
        this.fL = bVar;
    }

    private void a(c cVar) {
        this.fM = cVar;
        if (cVar == null || TextUtils.isEmpty(cVar.e())) {
            return;
        }
        if (TextUtils.isEmpty(this.ft) && cVar.e().contains(f19367d)) {
            this.fu = cVar.e();
        }
        boolean e9 = v.e(cVar.e());
        int g9 = v.g(cVar.e());
        if (e9) {
            this.dK = true;
            z(g9);
        }
        b(cVar.e(), "template_url");
    }

    public static d b(JSONObject jSONObject) {
        ArrayList arrayList;
        d dVar = null;
        if (jSONObject != null) {
            try {
                d dVar2 = new d();
                try {
                    dVar2.w(jSONObject.optString("id"));
                    dVar2.y(jSONObject.optString("title"));
                    dVar2.z(jSONObject.optString("desc"));
                    dVar2.x(jSONObject.optString("package_name"));
                    dVar2.eT = jSONObject.optInt("rtins_type");
                    dVar2.A(jSONObject.optString("icon_url"));
                    dVar2.B(jSONObject.optString("image_url"));
                    dVar2.C(jSONObject.optString(f19355Q));
                    dVar2.ex = jSONObject.optString(f19354P);
                    dVar2.eq = jSONObject.optString(f19356R);
                    dVar2.es = jSONObject.optString("click_url");
                    dVar2.aS = r.a(jSONObject.optString(aQ));
                    dVar2.et = jSONObject.optInt("wtick");
                    dVar2.eu = jSONObject.optString(f19359U);
                    dVar2.ev = jSONObject.optBoolean(f19360V, false);
                    dVar2.er = jSONObject.optString("notice_url");
                    dVar2.ey = jSONObject.optInt("template");
                    dVar2.s(jSONObject.optInt("ad_source_id", 1));
                    dVar2.ez = jSONObject.optInt(f19363Z);
                    dVar2.eA = jSONObject.optInt(aa);
                    dVar2.fo = jSONObject.optInt(an);
                    if (!TextUtils.isEmpty(jSONObject.optString(ae))) {
                        dVar2.a(Double.parseDouble(jSONObject.optString(ae, "0")));
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString(af))) {
                        dVar2.r(jSONObject.optInt(af, 333333));
                    }
                    dVar2.eB = jSONObject.optString("click_mode");
                    dVar2.eC = jSONObject.optString("landing_type");
                    dVar2.eS = jSONObject.optInt("link_type", 4);
                    dVar2.eG = jSONObject.optInt(ah);
                    dVar2.o(jSONObject.optString(ag));
                    dVar2.fb = jSONObject.optString(aE);
                    dVar2.fK = jSONObject.optInt("retarget_offer", 2);
                    dVar2.eL = jSONObject.optString("video_url");
                    dVar2.t(jSONObject.optInt("video_length"));
                    dVar2.eM = jSONObject.optInt("video_size");
                    dVar2.eN = jSONObject.optString(al);
                    dVar2.eO = jSONObject.optInt(am);
                    dVar2.a(System.currentTimeMillis());
                    dVar2.eP = jSONObject.optInt("ctype");
                    dVar2.eQ = jSONObject.optString(ap);
                    dVar2.eR = jSONObject.optInt(aq);
                    dVar2.eW = jSONObject.optString(e.f19447f);
                    dVar2.n(jSONObject.optString(e.f19451k));
                    dVar2.eU = jSONObject.optString(at);
                    dVar2.eV = jSONObject.optInt("offer_type");
                    dVar2.eZ = jSONObject.optString("reward_name");
                    dVar2.eY = jSONObject.optInt("reward_amount");
                    dVar2.gd = jSONObject.optInt(ax, 0);
                    dVar2.ge = jSONObject.optInt(ay, 0);
                    try {
                        String optString = jSONObject.optString(cw);
                        if (!TextUtils.isEmpty(optString)) {
                            dVar2.fC = optString;
                            dVar2.fB = af(optString);
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        dVar2.fp = jSONObject.optInt("ready_rate", -1);
                        JSONObject optJSONObject = jSONObject.optJSONObject(ca);
                        if (optJSONObject != null) {
                            dVar2.fr = optJSONObject.toString();
                        }
                        dVar2.fv = jSONObject.optInt(e.f19438H);
                        dVar2.s(jSONObject.optString(e.f19437G));
                        dVar2.fs = jSONObject.optInt(e.f19436F);
                        new JSONArray();
                        JSONArray optJSONArray = jSONObject.optJSONArray("pv_urls");
                        if (optJSONArray == null || optJSONArray.length() <= 0) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(optJSONArray.length());
                            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                                arrayList.add(optJSONArray.optString(i4));
                            }
                        }
                        dVar2.f2do = arrayList;
                        JSONObject optJSONObject2 = jSONObject.optJSONObject(e.f19439I);
                        if (optJSONObject2 != null) {
                            dVar2.fw = optJSONObject2.toString();
                        }
                    } catch (Exception unused2) {
                    }
                    dVar2.fn = jSONObject.optInt(bP, 2);
                    if (a(dVar2, jSONObject.optString("endcard_url"))) {
                        return null;
                    }
                    dVar2.fA = jSONObject.optInt(cc, 1);
                    dVar2.bX = "";
                    if (jSONObject.has(bn)) {
                        dVar2.en = jSONObject.optInt(bn);
                    }
                    if (jSONObject.has(bp)) {
                        dVar2.eo = jSONObject.optString(bp);
                    }
                    dVar2.a(c.a(jSONObject.optJSONObject(cx)));
                    dVar2.fy = jSONObject.optInt(aA, 2);
                    dVar2.ek = jSONObject.optInt(bh, 1);
                    dVar2.el = jSONObject.optInt(bi, 1);
                    dVar2.dS = jSONObject.optInt(aR);
                    dVar2.dW = jSONObject.optString("ia_icon");
                    dVar2.dX = jSONObject.optInt("ia_rst");
                    dVar2.dY = jSONObject.optString("ia_url");
                    dVar2.dZ = jSONObject.optInt("ia_ori");
                    dVar2.ea = jSONObject.optInt("ad_type");
                    dVar2.dq = jSONObject.optInt(f19368e);
                    dVar2.dr = jSONObject.optInt(f19369f);
                    dVar2.eb = jSONObject.optString(bd);
                    dVar2.ec = jSONObject.optString(be);
                    dVar2.ed = jSONObject.optInt(bf);
                    dVar2.ee = jSONObject.optString(bg);
                    dVar2.eh = jSONObject.optInt(aU);
                    dVar2.eg = jSONObject.optInt(aT);
                    dVar2.ei = jSONObject.optString(aV);
                    dVar2.ef = a.b(jSONObject.optString(aW, ""));
                    dVar2.dy = jSONObject.optLong("plct");
                    dVar2.dz = jSONObject.optLong("plctb");
                    JSONArray optJSONArray2 = jSONObject.optJSONArray(aX);
                    if (optJSONArray2 == null) {
                        if (!TextUtils.isEmpty(jSONObject.optString(aX))) {
                            dVar2.fP = jSONObject.optString(aX);
                        } else {
                            dVar2.fP = null;
                        }
                    } else {
                        dVar2.fP = optJSONArray2.toString();
                    }
                    dVar2.dC = jSONObject.optInt("creative_id");
                    dVar2.dD = jSONObject.optLong(f19377o);
                    dVar2.dE = jSONObject.optLong(f19378p);
                    dVar2.dF = jSONObject.optLong("ec_temp_id");
                    dVar2.eE = jSONObject.optString(f19379q, "");
                    String optString2 = jSONObject.optString("cam_tpl_url");
                    Uri parse = Uri.parse(optString2);
                    if (!TextUtils.isEmpty(parse.getPath()) && (parse.getPath().endsWith(".zip") || parse.getPath().endsWith(".ZIP"))) {
                        dVar2.a(optString2);
                    } else {
                        dVar2.d(optString2);
                    }
                    dVar2.dB = jSONObject.optString("cam_html");
                    dVar2.dm = jSONObject.optString("cam_html");
                    dVar2.fD = jSONObject.optString("unitId");
                    String optString3 = jSONObject.optString(f19381s);
                    if (TextUtils.isEmpty(optString3)) {
                        optString3 = jSONObject.optString(f19382t);
                    }
                    if (!TextUtils.isEmpty(optString3)) {
                        dVar2.fl = true;
                        dVar2.fk = optString3;
                    } else if (!TextUtils.isEmpty(dVar2.dm) && !dVar2.dm.contains("<MBTPLMARK>")) {
                        dVar2.fl = true;
                    } else {
                        dVar2.fl = false;
                    }
                    try {
                        String optString4 = jSONObject.optString(e.f19448g);
                        if (!TextUtils.isEmpty(optString4)) {
                            dVar2.ew = optString4;
                            Uri parse2 = Uri.parse(optString4);
                            if (parse2 != null) {
                                dVar2.eD = parse2.getQueryParameter("k");
                            }
                        }
                        String optString5 = jSONObject.optString("notice_url");
                        if (!TextUtils.isEmpty(optString5)) {
                            dVar2.er = optString5;
                            Uri parse3 = Uri.parse(optString5);
                            if (parse3 != null) {
                                dVar2.eF = parse3.getQueryParameter("k");
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    dVar2.fi = jSONObject.optBoolean("hb", false);
                    dVar2.fI = jSONObject.optInt(f19385w);
                    dVar2.fJ = jSONObject.optString(f19386x);
                    dVar2.dQ = jSONObject.optInt(aG);
                    dVar2.dR = jSONObject.optInt(aH);
                    dVar2.dw = jSONObject.optInt(f19343D, -2);
                    dVar2.dx = jSONObject.optInt(f19344E, -2);
                    dVar2.dv = jSONObject.optInt("adspace_t", 1);
                    dVar = j.a(jSONObject, dVar2);
                    dVar.dH = jSONObject.optInt("vcn");
                    dVar.dI = jSONObject.optInt("token_r");
                    dVar.dJ = jSONObject.optString("encrypt_p");
                    dVar.dO = jSONObject.optInt(f19341B);
                    dVar.ak(jSONObject.optInt(aJ, 2));
                    dVar.al(jSONObject.optInt(aI, 1));
                    JSONArray optJSONArray3 = jSONObject.optJSONArray(aK);
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                            arrayList2.add(Integer.valueOf(optJSONArray3.optInt(i6)));
                        }
                        if (arrayList2.size() > 0) {
                            dVar.fS = arrayList2;
                        }
                    }
                    if (jSONObject.has(aN)) {
                        dVar.fW = com.anythink.expressad.foundation.d.a.a(jSONObject.getString(aN));
                    }
                    try {
                        dVar.dN = jSONObject.optString(aL, "");
                        dVar.du = jSONObject.optInt(aM, 0);
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                    dVar.gb = jSONObject.optInt(f19370g, 0);
                    dVar.aq(jSONObject.optInt(f19371h, 0));
                    dVar.gf = jSONObject.optInt(e.f19458r, j.g.b.f13259a);
                    dVar.gg = jSONObject.optInt(i, 1);
                    return dVar;
                } catch (Exception e10) {
                    e = e10;
                    dVar = dVar2;
                    e.printStackTrace();
                    return dVar;
                }
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                return dVar;
            }
        }
        return dVar;
    }

    @Override // com.anythink.expressad.foundation.d.j
    public final void a(com.anythink.expressad.b.a.b bVar) {
        this.fN = bVar;
    }

    public static d a(JSONObject jSONObject) {
        d dVar = new d();
        dVar.w(jSONObject.optString("campaignid"));
        dVar.x(jSONObject.optString("packageName"));
        dVar.y(jSONObject.optString("title"));
        dVar.o(jSONObject.optString(b.a.f6874k));
        dVar.z(jSONObject.optString("desc"));
        dVar.eq = jSONObject.optString(f19356R);
        dVar.B(jSONObject.optString("image_url"));
        dVar.dy = jSONObject.optLong("plct");
        dVar.dz = jSONObject.optLong("plctb");
        dVar.dm = jSONObject.optString(f19366c);
        dVar.a(jSONObject.optString(f19365b));
        dVar.d(jSONObject.optString(f19374l));
        dVar.dB = jSONObject.optString(f19375m);
        dVar.dC = jSONObject.optInt("creative_id");
        dVar.dD = jSONObject.optLong(f19377o);
        dVar.dE = jSONObject.optLong(f19378p);
        dVar.dF = jSONObject.optLong("ec_temp_id");
        return dVar;
    }

    private static boolean a(d dVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (com.anythink.expressad.foundation.b.a.c().i() == 2 && "1".equals(Uri.parse(str).getQueryParameter("dpwgl"))) {
            return true;
        }
        dVar.k(str);
        return false;
    }

    private static d a(JSONObject jSONObject, String str, String str2, String str3, boolean z6, e eVar) {
        return a(jSONObject, str, str2, str3, z6, eVar, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    public static d a(JSONObject jSONObject, String str, String str2, String str3, boolean z6, e eVar, String str4) {
        d dVar;
        d dVar2;
        ?? r14;
        JSONObject c9 = c(jSONObject);
        if (c9 == null) {
            return null;
        }
        try {
            d dVar3 = new d();
            try {
                String optString = c9.optString(bs);
                if (TextUtils.isEmpty(optString)) {
                    dVar2 = null;
                } else {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap<String, String> hashMap = new HashMap<>();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    dVar2 = null;
                    dVar3.fc = hashMap;
                }
                if (!TextUtils.isEmpty(str4)) {
                    dVar3.fj = str4;
                    dVar3.fi = true;
                }
                try {
                    dVar3.fp = c9.optInt("ready_rate", -1);
                    JSONObject optJSONObject = c9.optJSONObject(ca);
                    if (optJSONObject != null) {
                        dVar3.fr = optJSONObject.toString();
                    }
                    dVar3.fv = c9.optInt(e.f19438H);
                    dVar3.s(c9.optString(e.f19437G));
                    dVar3.fs = c9.optInt(e.f19436F);
                    new JSONArray();
                    JSONArray optJSONArray = c9.optJSONArray("pv_urls");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        r14 = dVar2;
                    } else {
                        r14 = new ArrayList(optJSONArray.length());
                        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                            r14.add(optJSONArray.optString(i4));
                        }
                    }
                    dVar3.f2do = r14;
                    JSONObject optJSONObject2 = c9.optJSONObject(e.f19439I);
                    if (optJSONObject2 != null) {
                        dVar3.fw = optJSONObject2.toString();
                    }
                } catch (Exception unused) {
                }
                dVar3.w(c9.optString("id"));
                dVar3.y(c9.optString("title"));
                dVar3.fD = c9.optString("unitId", "");
                dVar3.z(c9.optString("desc"));
                dVar3.x(c9.optString("package_name"));
                dVar3.eT = c9.optInt("rtins_type");
                dVar3.A(c9.optString("icon_url"));
                dVar3.B(c9.optString("image_url"));
                dVar3.C(c9.optString(f19355Q));
                dVar3.ex = c9.optString(f19354P);
                dVar3.eq = j.a(eVar, dVar3, c9.optString(f19356R));
                dVar3.es = j.a(eVar, dVar3, c9.optString("click_url"));
                dVar3.aS = r.a(c9.optString(aQ));
                dVar3.et = c9.optInt("wtick");
                dVar3.eu = j.a(eVar, dVar3, c9.optString(f19359U));
                dVar3.ev = c9.optBoolean(f19360V, false);
                dVar3.er = j.a(eVar, dVar3, c9.optString("notice_url"));
                dVar3.ey = c9.optInt("template");
                dVar3.s(c9.optInt("ad_source_id", 1));
                dVar3.ez = c9.optInt(f19363Z);
                dVar3.eA = c9.optInt(aa);
                dVar3.fo = c9.optInt(an);
                if (!TextUtils.isEmpty(c9.optString(ae))) {
                    dVar3.a(Double.parseDouble(c9.optString(ae, "0")));
                }
                if (!TextUtils.isEmpty(c9.optString(af))) {
                    dVar3.r(c9.optInt(af, 333333));
                }
                dVar3.eB = c9.optString("click_mode");
                dVar3.eC = c9.optString("landing_type");
                dVar3.eS = c9.optInt("link_type", 4);
                dVar3.eG = c9.optInt(ah);
                dVar3.o(c9.optString(ag));
                dVar3.fb = c9.optString(aE);
                dVar3.fK = c9.optInt("retarget_offer", 2);
                dVar3.gd = c9.optInt(ax, 0);
                dVar3.ge = c9.optInt(ay, 0);
                String optString2 = c9.optString("video_url");
                if (!TextUtils.isEmpty(optString2)) {
                    if (z6) {
                        dVar3.eL = optString2;
                    } else {
                        dVar3.eL = com.anythink.core.express.a.a.b(optString2);
                    }
                }
                dVar3.dO = c9.optInt(f19341B);
                dVar3.t(c9.optInt("video_length"));
                dVar3.eM = c9.optInt("video_size");
                dVar3.eN = c9.optString(al);
                dVar3.eO = c9.optInt(am);
                dVar3.a(System.currentTimeMillis());
                dVar3.ew = j.a(eVar, dVar3, str);
                dVar3.eP = c9.optInt("ctype");
                dVar3.eQ = c9.optString(ap);
                dVar3.eR = c9.optInt(aq);
                dVar3.eW = str2;
                dVar3.n(str3);
                dVar3.eU = c9.optString(at);
                dVar3.eV = c9.optInt("offer_type");
                dVar3.eZ = c9.optString("reward_name");
                dVar3.eY = c9.optInt("reward_amount");
                try {
                    String a9 = j.a(eVar, dVar3, c9.optString(cw));
                    if (!TextUtils.isEmpty(a9)) {
                        dVar3.fC = a9;
                        dVar3.fB = af(a9);
                    }
                } catch (Exception unused2) {
                }
                dVar3.fn = c9.optInt(bP, 2);
                if (a(dVar3, c9.optString("endcard_url"))) {
                    return dVar2;
                }
                dVar3.fA = c9.optInt(cc, 1);
                dVar3.bX = "";
                if (c9.has(bn)) {
                    dVar3.en = c9.optInt(bn);
                }
                if (c9.has(bp)) {
                    dVar3.eo = c9.optString(bp);
                }
                dVar3.a(c.a(c9.optJSONObject(cx)));
                dVar3.fy = c9.optInt(aA, 2);
                dVar3.ek = c9.optInt(bh, 1);
                dVar3.el = c9.optInt(bi, 1);
                dVar3.dS = c9.optInt(aR);
                dVar3.dW = c9.optString("ia_icon");
                dVar3.dX = c9.optInt("ia_rst");
                dVar3.dY = c9.optString("ia_url");
                dVar3.dZ = c9.optInt("ia_ori");
                dVar3.ea = eVar.d();
                dVar3.dq = c9.optInt(f19368e);
                dVar3.dr = c9.optInt(f19369f);
                dVar3.eb = c9.optString(bd);
                dVar3.ec = c9.optString(be);
                dVar3.ed = c9.optInt(bf);
                dVar3.ee = c9.optString(bg);
                dVar3.eh = c9.optInt(aU);
                dVar3.eg = c9.optInt(aT);
                dVar3.ei = c9.optString(aV);
                dVar3.ef = a.b(c9.optString(aW, ""));
                dVar3.dy = c9.optLong("plct");
                dVar3.dz = c9.optLong("plctb");
                dVar3.dC = c9.optLong("creative_id");
                dVar3.dD = c9.optLong(f19377o);
                dVar3.dE = c9.optLong(f19378p);
                dVar3.dF = c9.optLong("ec_temp_id");
                String optString3 = c9.optString("cam_tpl_url");
                Uri parse = Uri.parse(optString3);
                if (!TextUtils.isEmpty(parse.getPath()) && (parse.getPath().endsWith(".zip") || parse.getPath().endsWith(".ZIP"))) {
                    dVar3.a(optString3);
                } else {
                    dVar3.d(optString3);
                }
                dVar3.dB = c9.optString("cam_html");
                dVar3.dm = c9.optString("cam_html");
                String optString4 = c9.optString(f19381s);
                if (!TextUtils.isEmpty(optString4)) {
                    dVar3.fl = true;
                    dVar3.fk = optString4;
                } else if (!TextUtils.isEmpty(dVar3.dm) && !dVar3.dm.contains("<MBTPLMARK>")) {
                    dVar3.fl = true;
                } else {
                    dVar3.fl = false;
                }
                JSONArray optJSONArray2 = c9.optJSONArray(aX);
                if (optJSONArray2 == null) {
                    if (!TextUtils.isEmpty(c9.optString(aX))) {
                        dVar3.fP = c9.optString(aX);
                    } else {
                        dVar3.fP = dVar2;
                    }
                } else {
                    dVar3.fP = optJSONArray2.toString();
                }
                dVar3.fI = c9.optInt(f19385w);
                dVar3.fJ = c9.optString(f19386x);
                dVar3.dQ = c9.optInt(aG);
                dVar3.dw = c9.optInt(f19343D, -2);
                dVar3.dx = c9.optInt(f19344E, -2);
                dVar3.dv = c9.optInt("adspace_t", 1);
                dVar3.dR = c9.optInt(aH);
                d b9 = j.b(c9, dVar3);
                try {
                    try {
                        b9.eq = v.a(com.anythink.core.common.d.t.b().g(), b9.bi(), b9.ai());
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                    b9.ak(c9.optInt(aJ, 2));
                    b9.al(c9.optInt(aI, 1));
                    JSONArray optJSONArray3 = c9.optJSONArray(aK);
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        for (int i6 = 0; i6 < optJSONArray3.length(); i6++) {
                            arrayList.add(Integer.valueOf(optJSONArray3.optInt(i6)));
                        }
                        if (arrayList.size() > 0) {
                            b9.fS = arrayList;
                        }
                    }
                    if (c9.has(aN)) {
                        b9.fW = com.anythink.expressad.foundation.d.a.a(c9.getString(aN));
                    }
                    try {
                        b9.dN = c9.optString(aL, "");
                        b9.du = c9.optInt(aM, 0);
                    } catch (Exception e10) {
                        e10.getMessage();
                    }
                    b9.gb = c9.optInt(f19370g, 0);
                    b9.aq(c9.optInt(f19371h, 0));
                    b9.gf = c9.optInt(e.f19458r, j.g.b.f13259a);
                    b9.gg = c9.optInt(i, 1);
                    return b9;
                } catch (Exception e11) {
                    e = e11;
                    dVar = b9;
                    e.printStackTrace();
                    return dVar;
                }
            } catch (Exception e12) {
                e = e12;
                dVar = dVar3;
            }
        } catch (Exception e13) {
            e = e13;
            dVar = null;
        }
    }

    public static JSONArray b(List<d> list) {
        JSONArray jSONArray = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        Iterator<d> it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                jSONArray2.put(a(it.next()));
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        return jSONArray2;
                    } catch (Exception e9) {
                        e = e9;
                        jSONArray = jSONArray2;
                        e.printStackTrace();
                        return jSONArray;
                    }
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        return jSONArray;
    }

    private static List<Map<Integer, String>> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                try {
                    String string = jSONArray.getString(i4);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        HashMap hashMap = new HashMap();
                        int i6 = jSONObject.getInt("rate");
                        hashMap.put(Integer.valueOf(i6), jSONObject.getString("url"));
                        arrayList.add(hashMap);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    private static p a(JSONObject jSONObject, p pVar) {
        pVar.a(a(jSONObject.optJSONArray(j.cZ)));
        pVar.b(a(jSONObject.optJSONArray(j.da)));
        pVar.c(a(jSONObject.optJSONArray(j.db)));
        return pVar;
    }

    private static String[] a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            strArr[i4] = jSONArray.optString(i4);
        }
        return strArr;
    }

    public static JSONObject a(d dVar, boolean z6, boolean z9) {
        JSONObject a9 = a(dVar);
        a9.put("isReady", z6);
        a9.put("expired", z9);
        return a9;
    }

    public static JSONObject a(d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", dVar.bh());
        jSONObject.put(aG, dVar.dQ);
        jSONObject.put(aH, dVar.dR);
        jSONObject.put("adspace_t", dVar.dv);
        jSONObject.put(f19344E, dVar.dx);
        jSONObject.put(f19343D, dVar.dw);
        if (!TextUtils.isEmpty(dVar.fD)) {
            jSONObject.put("unitId", dVar.fD);
        }
        if (!TextUtils.isEmpty(dVar.fr)) {
            try {
                jSONObject.put(ca, new JSONObject(dVar.fr));
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(dVar.fw)) {
            try {
                jSONObject.put(e.f19439I, new JSONObject(dVar.fw));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        List<String> list = dVar.f2do;
        if (list != null && list.size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = dVar.f2do.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("pv_urls", jSONArray);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(dVar.ft)) {
            jSONObject.put(e.f19438H, dVar.fv);
            jSONObject.put(e.f19437G, dVar.ft);
            jSONObject.put(e.f19436F, dVar.fs);
        }
        jSONObject.put("ready_rate", dVar.fp);
        jSONObject.put("title", dVar.bj());
        jSONObject.put("desc", dVar.bk());
        jSONObject.put("package_name", dVar.bi());
        jSONObject.put("rtins_type", dVar.eT);
        jSONObject.put("icon_url", dVar.bl());
        jSONObject.put("image_url", dVar.bm());
        jSONObject.put(f19355Q, dVar.bp());
        jSONObject.put(f19354P, dVar.ex);
        jSONObject.put(f19356R, dVar.ai());
        jSONObject.put("click_url", dVar.es);
        r rVar = dVar.aS;
        if (rVar != null) {
            jSONObject.put(aQ, rVar.c());
        }
        jSONObject.put("wtick", dVar.et);
        jSONObject.put(f19359U, dVar.eu);
        jSONObject.put(f19360V, dVar.ev);
        jSONObject.put("notice_url", dVar.aj());
        jSONObject.put("template", dVar.ey);
        jSONObject.put("ad_source_id", dVar.bn());
        jSONObject.put(f19363Z, dVar.ez);
        jSONObject.put(aa, dVar.eA);
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.bf());
        jSONObject.put(ae, sb.toString());
        jSONObject.put(af, dVar.bg());
        jSONObject.put("click_mode", dVar.eB);
        jSONObject.put("landing_type", dVar.eC);
        jSONObject.put("link_type", dVar.eS);
        jSONObject.put(ah, dVar.eG);
        jSONObject.put(ag, dVar.dj);
        jSONObject.put(an, dVar.fo);
        jSONObject.put("retarget_offer", dVar.fK);
        jSONObject.put("video_url", dVar.eL);
        jSONObject.put("video_length", dVar.bq());
        jSONObject.put("video_size", dVar.eM);
        jSONObject.put(al, dVar.eN);
        jSONObject.put(am, dVar.eO);
        jSONObject.put(aE, dVar.fb);
        jSONObject.put(e.f19448g, dVar.ak());
        jSONObject.put("ctype", dVar.eP);
        jSONObject.put(aq, dVar.eR);
        jSONObject.put(ap, dVar.eQ);
        jSONObject.put(e.f19447f, dVar.eW);
        jSONObject.put(e.f19451k, dVar.eX);
        jSONObject.put(at, dVar.eU);
        jSONObject.put("offer_type", dVar.eV);
        jSONObject.put("reward_amount", dVar.eY);
        jSONObject.put("reward_name", dVar.eZ);
        jSONObject.put(bp, dVar.eo);
        if (y.b(dVar.fC)) {
            jSONObject.put(cw, new JSONObject(dVar.fC));
        }
        jSONObject.put(bP, dVar.fn);
        jSONObject.put("endcard_url", dVar.J());
        jSONObject.put(cc, dVar.fA);
        c cVar = dVar.fM;
        if (cVar != null && y.b(cVar.a())) {
            jSONObject.put(cx, new JSONObject(dVar.fM.a()));
        }
        jSONObject.put(az, dVar.bX);
        jSONObject.put(aA, dVar.fy);
        jSONObject.put(bi, dVar.el);
        jSONObject.put(bh, dVar.ek);
        jSONObject.put(aR, dVar.dS);
        jSONObject.put("ia_icon", dVar.dW);
        jSONObject.put("ia_rst", dVar.dX);
        jSONObject.put("ia_url", dVar.dY);
        jSONObject.put("ia_ori", dVar.dZ);
        jSONObject.put("ad_type", dVar.ea);
        jSONObject.put(bd, dVar.eb);
        jSONObject.put(be, dVar.ec);
        jSONObject.put(bf, dVar.ed);
        jSONObject.put(bg, dVar.ee);
        jSONObject.put(aT, dVar.eg);
        jSONObject.put(aU, dVar.eh);
        jSONObject.put(aV, dVar.ei);
        a aVar = dVar.ef;
        if (aVar != null) {
            jSONObject.put(aW, new JSONObject(aVar.a()));
        }
        jSONObject.put("plct", dVar.dy);
        jSONObject.put("plctb", dVar.dz);
        jSONObject.put(aX, dVar.fP);
        jSONObject.put("creative_id", dVar.dC);
        jSONObject.put("cam_html", dVar.dB);
        String str = dVar.dA;
        if (str == null) {
            str = dVar.dl;
        }
        jSONObject.put("cam_tpl_url", str);
        jSONObject.put(f19381s, dVar.fk);
        jSONObject.put(f19382t, dVar.fk);
        jSONObject.put(f19383u, dVar.bo());
        jSONObject.put("hb", dVar.fi);
        jSONObject.put(f19385w, dVar.fI);
        jSONObject.put(f19386x, dVar.fJ);
        int i4 = dVar.dH;
        if (i4 <= 0) {
            i4 = 1;
        }
        jSONObject.put("vcn", i4);
        int i6 = dVar.dI;
        if (i6 != 1) {
            i6 = 0;
        }
        jSONObject.put("token_r", i6);
        jSONObject.put("encrypt_p", dVar.dJ);
        jSONObject.put(f19341B, dVar.dO);
        jSONObject.put(aK, dVar.fS);
        jSONObject.put(aJ, dVar.fT);
        jSONObject.put(aI, dVar.fU);
        jSONObject.put(f19368e, dVar.dq);
        jSONObject.put(f19369f, dVar.dr);
        jSONObject.put(f19379q, "");
        jSONObject.put(aL, dVar.dN);
        jSONObject.put(aM, dVar.du);
        try {
            jSONObject.put("misk_spt", com.anythink.core.common.o.a().c());
            com.anythink.core.common.o.a();
            jSONObject.put("misk_spt_det", com.anythink.core.common.o.b());
        } catch (JSONException unused) {
        }
        com.anythink.expressad.foundation.d.a aVar2 = dVar.fW;
        if (aVar2 != null) {
            jSONObject.put(aN, aVar2.a());
        }
        jSONObject.put(f19377o, dVar.dD);
        jSONObject.put(f19378p, dVar.dE);
        jSONObject.put("ec_temp_id", dVar.dF);
        jSONObject.put(f19379q, "");
        jSONObject.put(f19370g, dVar.gb);
        jSONObject.put(f19371h, dVar.gc);
        jSONObject.put(i, dVar.gg);
        jSONObject.put(j.cL, dVar.be());
        jSONObject.put(j.cM, dVar.bd());
        jSONObject.put(j.cP, dVar.bc());
        jSONObject.put("ttc_type", dVar.bb());
        jSONObject.put(j.cR, dVar.ba());
        jSONObject.put(j.cS, dVar.aV());
        jSONObject.put(j.cT, com.anythink.core.express.a.a.a(dVar.aW()));
        jSONObject.put(j.cU, dVar.aX());
        jSONObject.put(j.cE, dVar.aQ());
        jSONObject.put(j.cF, dVar.aP());
        if (dVar.aO() != null) {
            jSONObject.put(j.cG, dVar.aO().g());
        }
        jSONObject.put(j.cV, dVar.aY());
        jSONObject.put(j.cW, dVar.aZ());
        jSONObject.put(bn, dVar.en);
        jSONObject.put(j.cI, dVar.aS());
        jSONObject.put(j.cH, dVar.aR());
        jSONObject.put(j.cJ, dVar.aT());
        jSONObject.put(j.cK, dVar.aU());
        return jSONObject;
    }

    private void a(com.anythink.expressad.foundation.d.a aVar) {
        this.fW = aVar;
    }

    private void a(ArrayList<Integer> arrayList) {
        this.fS = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if ((bo() + r13) < r11) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        if ((bo() + r11) >= r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((r10.dy * 1000) + bo()) >= r0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        r11 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r10.dz <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (((r10.dz * 1000) + bo()) < r11) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j6, long j9) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.dy > 0) {
        }
    }
}

package com.anythink.core.d;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.v;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.ap;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.ba;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.bt;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17335a = "Placement";

    /* renamed from: b, reason: collision with root package name */
    public static final int f17336b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17337c = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17338e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f17339f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f17340g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f17341h = 3;

    /* renamed from: A, reason: collision with root package name */
    private long f17342A;

    /* renamed from: B, reason: collision with root package name */
    private long f17343B;

    /* renamed from: C, reason: collision with root package name */
    private long f17344C;

    /* renamed from: D, reason: collision with root package name */
    private int f17345D;

    /* renamed from: E, reason: collision with root package name */
    private String f17346E;

    /* renamed from: F, reason: collision with root package name */
    private bt f17347F;

    /* renamed from: G, reason: collision with root package name */
    private int f17348G;

    /* renamed from: H, reason: collision with root package name */
    private String f17349H;

    /* renamed from: I, reason: collision with root package name */
    private int f17350I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private String f17351K;

    /* renamed from: L, reason: collision with root package name */
    private Map<String, Object> f17352L;

    /* renamed from: M, reason: collision with root package name */
    private Map<String, ATRewardInfo> f17353M;

    /* renamed from: N, reason: collision with root package name */
    private ATRewardInfo f17354N;

    /* renamed from: O, reason: collision with root package name */
    private String f17355O;

    /* renamed from: P, reason: collision with root package name */
    private String f17356P;

    /* renamed from: Q, reason: collision with root package name */
    private long f17357Q;

    /* renamed from: R, reason: collision with root package name */
    private String f17358R;

    /* renamed from: S, reason: collision with root package name */
    private long f17359S;

    /* renamed from: T, reason: collision with root package name */
    private int f17360T;

    /* renamed from: U, reason: collision with root package name */
    private long f17361U;

    /* renamed from: V, reason: collision with root package name */
    private int f17362V;

    /* renamed from: W, reason: collision with root package name */
    private List<ay> f17363W;

    /* renamed from: X, reason: collision with root package name */
    private ba f17364X;
    private long Y;

    /* renamed from: Z, reason: collision with root package name */
    private double f17365Z;
    private int aA;
    private int aB;
    private int aD;
    private double[][] aH;
    private int aJ;
    private f aK;
    private boolean aM;
    private int aN;
    private int aO;
    private int aP;
    private long aQ;
    private long aR;
    private long aS;
    private int aT;
    private int aU;
    private JSONArray aV;
    private JSONArray aW;
    private JSONArray aX;
    private JSONArray aY;
    private JSONArray aZ;
    private String aa;
    private List<String> ab;
    private String ac;
    private String ad;
    private String ae;
    private String af;
    private long ag;
    private String ah;
    private String ai;
    private double aj;
    private long ak;
    private long al;
    private long am;
    private long an;
    private int ao;
    private int ap;
    private int aq;
    private long ar;
    private JSONObject as;
    private JSONObject at;
    private String au;
    private String av;
    private int aw;
    private int ax;
    private List<Integer> ay;
    private int az;
    private int bA;
    private ai bB;
    private List<String> bC;
    private JSONObject bD;
    private JSONObject bH;
    private long bJ;
    private int bK;
    private int bM;
    private String bN;
    private String bO;
    private long bP;
    private double bQ;
    private int bR;
    private int bS;
    private int bT;
    private int bU;
    private JSONObject bV;
    private JSONArray ba;
    private JSONArray bb;
    private JSONArray bc;
    private JSONArray bd;
    private JSONArray be;
    private JSONArray bf;
    private JSONArray bg;
    private long bh;
    private int bi;
    private int bj;
    private int bk;
    private List<Integer> bl;
    private int bn;
    private String bo;
    private int bp;
    private int bq;
    private int[] br;
    private Boolean bt;
    private int bu;
    private String bv;
    private ap bw;
    private int bx;
    private int by;
    private int bz;
    ATAdRequest i;

    /* renamed from: j, reason: collision with root package name */
    private String f17366j;

    /* renamed from: k, reason: collision with root package name */
    private long f17367k;

    /* renamed from: l, reason: collision with root package name */
    private long f17368l;

    /* renamed from: m, reason: collision with root package name */
    private int f17369m;

    /* renamed from: n, reason: collision with root package name */
    private int f17370n;

    /* renamed from: o, reason: collision with root package name */
    private int f17371o;

    /* renamed from: p, reason: collision with root package name */
    private long f17372p;

    /* renamed from: q, reason: collision with root package name */
    private long f17373q;

    /* renamed from: r, reason: collision with root package name */
    private long f17374r;

    /* renamed from: s, reason: collision with root package name */
    private int f17375s;

    /* renamed from: t, reason: collision with root package name */
    private int f17376t;

    /* renamed from: u, reason: collision with root package name */
    private int f17377u;

    /* renamed from: v, reason: collision with root package name */
    private int f17378v;

    /* renamed from: w, reason: collision with root package name */
    private List<bv> f17379w;

    /* renamed from: x, reason: collision with root package name */
    private Map<String, bv> f17380x;

    /* renamed from: y, reason: collision with root package name */
    private int f17381y;

    /* renamed from: z, reason: collision with root package name */
    private int f17382z;
    private int aC = 0;
    private int aE = 10;
    private int aF = 10;
    private int aG = 2;
    private int aI = 1;
    private com.anythink.core.common.h.q aL = new com.anythink.core.common.h.q();
    private int bm = 2;
    private int bs = 2;
    private int bE = 1;
    private int bF = 10000;
    private int bG = 3000;
    private int bI = 1;
    private int bL = 2;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final String f17383A = "req_w_time";

        /* renamed from: B, reason: collision with root package name */
        public static final String f17384B = "wf_loadts";

        /* renamed from: C, reason: collision with root package name */
        public static final String f17385C = "req_ug_type";

        /* renamed from: D, reason: collision with root package name */
        public static final String f17386D = "req_ug_numsp";

        /* renamed from: E, reason: collision with root package name */
        public static final String f17387E = "bf_ldf_rf_sw";

        /* renamed from: F, reason: collision with root package name */
        public static final String f17388F = "hb_start_time";

        /* renamed from: G, reason: collision with root package name */
        public static final String f17389G = "dsp_list";

        /* renamed from: H, reason: collision with root package name */
        public static final String f17390H = "bid_floor";

        /* renamed from: I, reason: collision with root package name */
        public static final String f17391I = "max_unit_ids";
        public static final String J = "xdb_list";

        /* renamed from: K, reason: collision with root package name */
        public static final String f17392K = "s2s_bd_max";

        /* renamed from: L, reason: collision with root package name */
        public static final String f17393L = "req_merge";

        /* renamed from: M, reason: collision with root package name */
        public static final String f17394M = "exclude_id_max";

        /* renamed from: N, reason: collision with root package name */
        public static final String f17395N = "install_id_max";

        /* renamed from: O, reason: collision with root package name */
        public static final String f17396O = "install_ids";

        /* renamed from: P, reason: collision with root package name */
        public static final String f17397P = "exclude_ids";

        /* renamed from: Q, reason: collision with root package name */
        public static final String f17398Q = "is_test";

        /* renamed from: R, reason: collision with root package name */
        public static final String f17399R = "gsp_rates";

        /* renamed from: S, reason: collision with root package name */
        public static final String f17400S = "adx_ext";

        /* renamed from: T, reason: collision with root package name */
        public static final String f17401T = "wf_id";

        /* renamed from: U, reason: collision with root package name */
        public static final String f17402U = "sysh_mtg_sw";

        /* renamed from: V, reason: collision with root package name */
        public static final String f17403V = "mid_gdt_sw";

        /* renamed from: W, reason: collision with root package name */
        public static final String f17404W = "lm_lrqf_interval_sws";

        /* renamed from: X, reason: collision with root package name */
        public static final String f17405X = "wf_lscb_type";
        public static final String Y = "reqid_pg_sw";

        /* renamed from: Z, reason: collision with root package name */
        public static final String f17406Z = "sr_sw";

        /* renamed from: a, reason: collision with root package name */
        public static final String f17407a = "hb_bid_timeout";
        public static final String aA = "unique_id";
        public static final String aB = "e_key_data";
        public static final String aC = "c_pub_key";
        public static final String aD = "s_id";
        public static final String aE = "c_id";
        public static final String aF = "sp_sdk_pri_timeout";
        public static final String aG = "dn_c2shb_list";
        public static final String aH = "dn_s2shb_list";
        public static final String aI = "bid_wait_other_time";
        public static final String aJ = "h_s_t_auto_sdk_to_time";
        public static final String aK = "ps_ct_out_cus";
        public static final String aL = "autoload_t";
        public static final String aM = "ads_lg_st";
        public static final String aN = "rotation_num";
        public static final String aO = "rotation_inter";
        public static final String aP = "rotation_cache_ts";
        public static final String aQ = "adx_id_b_sw";
        public static final String aR = "addr_st";
        public static final String aS = "i_r_sw";
        private static final String aT = "ps_id_timeout";
        private static final String aU = "ps_ct";
        private static final String aV = "ps_ct_out";
        private static final String aW = "pucs";
        private static final String aX = "ad_delivery_sw";
        private static final String aY = "req_ug_num";
        private static final String aZ = "unit_caps_d";
        public static final String aa = "p_c";
        public static final String ab = "has_1st_rl";
        public static final String ac = "updateTime";
        public static final String ad = "upd_type";
        public static final String ae = "upd_th";
        public static final String af = "value_n";
        public static final String ag = "bid_value_n";
        public static final String ah = "sto_stg";
        public static final String ai = "lf_rt_itr";
        public static final String aj = "wf2_mode_sw";
        public static final String ak = "wf2_req_ug_type";
        public static final String al = "wf2_mode_req_num";
        public static final String am = "am_est_num";
        public static final String an = "share_pl_id";
        public static final String ao = "s2s_sw";
        public static final String ap = "bd_req_bid_sw";
        public static final String aq = "bn_template_id";
        public static final String ar = "mix_click_type";
        public static final String as = "auto_refresh_type";
        public static final String at = "wf_sw";
        public static final String au = "wf_obj";
        public static final String av = "pl_wf_st_type";
        public static final String aw = "presetwf_reload_sw";
        public static final String ax = "wf2_nf_sw";
        public static final String ay = "ps_ct_max";
        public static final String az = "adx_dsp";

        /* renamed from: b, reason: collision with root package name */
        public static final String f17408b = "addr_bid";
        private static final String bA = "sc_list";
        private static final String bB = "rw_n";
        private static final String bC = "rw_num";
        private static final String bD = "reward";
        private static final String bE = "currency";
        private static final String bF = "cc";
        private static final String bG = "exch_r";
        private static final String bH = "acct_cy";
        private static final String bI = "req_ug_type_v2";
        private static final String bJ = "device_perf_sw";
        private static final String bK = "max_cached_num";
        private static final String bL = "wf_req_wait_t";
        private static final String bM = "c2s_req_wait_t";
        private static final String bN = "s2s_req_wait_t";
        private static final String bO = "auto_req_type";
        private static final String bP = "auto_refresh_type_v2";
        private static final String ba = "unit_caps_h";
        private static final String bb = "unit_pacing";
        private static final String bc = "wifi_auto_sw";
        private static final String bd = "show_type";
        private static final String be = "refresh";
        private static final String bf = "ug_list";
        private static final String bg = "ol_list";
        private static final String bh = "gro_id";
        private static final String bi = "hb_list";
        private static final String bj = "s2shb_list";
        private static final String bk = "format";
        private static final String bl = "auto_refresh";
        private static final String bm = "auto_refresh_time";
        private static final String bn = "s_t";
        private static final String bo = "l_s_t";
        private static final String bp = "ra";
        private static final String bq = "asid";
        private static final String br = "tp_ps";
        private static final String bs = "t_g_id";
        private static final String bt = "s_id";
        private static final String bu = "u_n_f_sw";
        private static final String bv = "m_o";
        private static final String bw = "m_o_s";
        private static final String bx = "m_o_ks";
        private static final String by = "p_m_o";
        private static final String bz = "callback";

        /* renamed from: c, reason: collision with root package name */
        public static final String f17409c = "load_fail_wtime";

        /* renamed from: d, reason: collision with root package name */
        public static final String f17410d = "load_cap";

        /* renamed from: e, reason: collision with root package name */
        public static final String f17411e = "load_cap_time";

        /* renamed from: f, reason: collision with root package name */
        public static final String f17412f = "cached_offers_num";

        /* renamed from: g, reason: collision with root package name */
        public static final String f17413g = "adx_list";

        /* renamed from: h, reason: collision with root package name */
        public static final String f17414h = "adx_st";
        public static final String i = "ilrd";

        /* renamed from: j, reason: collision with root package name */
        public static final String f17415j = "hb_list";

        /* renamed from: k, reason: collision with root package name */
        public static final String f17416k = "inh_list";

        /* renamed from: l, reason: collision with root package name */
        public static final String f17417l = "fbhb_bid_wtime";

        /* renamed from: m, reason: collision with root package name */
        public static final String f17418m = "burl_nt_firm";

        /* renamed from: n, reason: collision with root package name */
        public static final String f17419n = "wf_bid_addr";

        /* renamed from: o, reason: collision with root package name */
        public static final String f17420o = "ss_data";

        /* renamed from: p, reason: collision with root package name */
        public static final String f17421p = "cn_addr_bid";

        /* renamed from: q, reason: collision with root package name */
        public static final String f17422q = "cn_wf_bid_addr";

        /* renamed from: r, reason: collision with root package name */
        public static final String f17423r = "byuid_wt";

        /* renamed from: s, reason: collision with root package name */
        public static final String f17424s = "addr_bks";

        /* renamed from: t, reason: collision with root package name */
        public static final String f17425t = "addr_subbks";

        /* renamed from: u, reason: collision with root package name */
        public static final String f17426u = "s2sbks_list";

        /* renamed from: v, reason: collision with root package name */
        public static final String f17427v = "exch_rate_c2u";

        /* renamed from: w, reason: collision with root package name */
        public static final String f17428w = "doffer_list";

        /* renamed from: x, reason: collision with root package name */
        public static final String f17429x = "bottom_list";

        /* renamed from: y, reason: collision with root package name */
        public static final String f17430y = "bottom_reqts";

        /* renamed from: z, reason: collision with root package name */
        public static final String f17431z = "cb_w_time";
    }

    private l(String str) {
        this.f17366j = str;
    }

    private void G(int i) {
        this.f17360T = i;
    }

    private JSONObject bK() {
        return this.as;
    }

    private String bL() {
        return this.bO;
    }

    private String bM() {
        return this.f17358R;
    }

    private int bN() {
        return this.f17345D;
    }

    private int bO() {
        return this.f17370n;
    }

    private int bP() {
        return this.f17375s;
    }

    private int bQ() {
        return this.f17376t;
    }

    private int bR() {
        return this.f17377u;
    }

    private bt bS() {
        return this.f17347F;
    }

    private long bT() {
        return this.bP;
    }

    private String bU() {
        return this.ae;
    }

    private long bV() {
        return this.al;
    }

    private long bW() {
        return this.am;
    }

    private int bX() {
        return this.ax;
    }

    private int bY() {
        return this.aA;
    }

    private int[] bZ() {
        return this.br;
    }

    private void c(int i) {
        this.aN = i;
    }

    private int ca() {
        return this.bm;
    }

    private bv cb() {
        List<bv> a9 = u.a(this, this.aY);
        if (a9.size() > 0) {
            return a9.get(0);
        }
        return null;
    }

    private void d(int i) {
        this.aO = i;
    }

    private void e(int i) {
        this.aP = i;
    }

    private void q(int i) {
        this.aq = i;
    }

    public final String A() {
        return this.av;
    }

    public final String B() {
        return this.au;
    }

    public final JSONObject C() {
        return this.at;
    }

    public final int D() {
        return this.bM;
    }

    public final long E() {
        return this.ar;
    }

    public final int F() {
        return this.aq;
    }

    public final int H() {
        int i = this.ao;
        if (i == 1) {
            return this.f17371o;
        }
        if (i != 2) {
            return 1;
        }
        return this.ap;
    }

    public final long I() {
        return this.an;
    }

    public final JSONArray J() {
        return this.be;
    }

    public final long K() {
        return this.ak;
    }

    public final double L() {
        return this.aj;
    }

    public final String M() {
        return this.ah;
    }

    public final String N() {
        return this.ai;
    }

    public final JSONArray O() {
        return this.bb;
    }

    public final long P() {
        return this.ag;
    }

    public final String Q() {
        return this.ad;
    }

    public final String R() {
        return this.ac;
    }

    public final List<String> S() {
        return this.ab;
    }

    public final double T() {
        return this.f17365Z;
    }

    public final String U() {
        return this.aa;
    }

    public final long V() {
        return this.Y;
    }

    public final JSONArray W() {
        return this.ba;
    }

    public final String X() {
        return this.bN;
    }

    public final JSONArray Y() {
        return this.aY;
    }

    public final ba Z() {
        return this.f17364X;
    }

    public final int a() {
        return this.aN;
    }

    public final JSONArray aA() {
        return this.aW;
    }

    public final JSONArray aB() {
        return this.aX;
    }

    public final JSONArray aC() {
        return this.aZ;
    }

    public final long aD() {
        return this.f17359S;
    }

    public final int aE() {
        return this.f17360T;
    }

    public final long aF() {
        return this.f17361U;
    }

    public final int aG() {
        return this.f17362V;
    }

    public final String aH() {
        return this.af;
    }

    public final JSONArray aI() {
        return this.bc;
    }

    public final JSONArray aJ() {
        return this.bd;
    }

    public final int aK() {
        return this.bS;
    }

    public final int aL() {
        return this.bR;
    }

    public final double aM() {
        return this.bQ;
    }

    public final int aN() {
        return this.bT;
    }

    public final int aO() {
        return this.bU;
    }

    public final int aP() {
        return this.aw;
    }

    public final JSONObject aQ() {
        return this.bV;
    }

    public final boolean aR() {
        return this.aC == 1;
    }

    public final boolean aS() {
        return this.aD == 1;
    }

    public final boolean aT() {
        return this.aC == 2;
    }

    public final boolean aU() {
        return this.aC == 0;
    }

    public final int aV() {
        return this.aE;
    }

    public final int aW() {
        return this.aF;
    }

    public final int aX() {
        return this.aG;
    }

    public final double[][] aY() {
        return this.aH;
    }

    public final int aZ() {
        return this.aC;
    }

    public final List<ay> aa() {
        return this.f17363W;
    }

    public final long ab() {
        return this.f17357Q;
    }

    public final Map<String, ATRewardInfo> ac() {
        return this.f17353M;
    }

    public final String ad() {
        return this.f17355O;
    }

    public final String ae() {
        return this.f17356P;
    }

    public final ATRewardInfo af() {
        return this.f17354N;
    }

    public final Map<String, Object> ag() {
        return this.f17352L;
    }

    public final int ah() {
        return this.J;
    }

    public final int ai() {
        return this.f17348G;
    }

    public final String aj() {
        return this.f17349H;
    }

    public final int ak() {
        return this.f17350I;
    }

    public final long al() {
        return this.f17343B;
    }

    public final long am() {
        return this.f17344C;
    }

    public final String an() {
        return this.f17346E;
    }

    public final int ao() {
        return this.f17382z;
    }

    public final long ap() {
        return this.f17342A;
    }

    public final int aq() {
        return this.f17381y;
    }

    public final long ar() {
        return this.f17367k;
    }

    public final long as() {
        return this.f17368l;
    }

    public final int at() {
        return this.f17369m;
    }

    public final int au() {
        return this.f17371o;
    }

    public final long av() {
        return this.f17372p;
    }

    public final long aw() {
        return this.f17373q;
    }

    public final long ax() {
        return this.f17374r;
    }

    public final int ay() {
        return this.f17378v;
    }

    public final JSONArray az() {
        return this.aV;
    }

    public final int b() {
        return this.aO;
    }

    public final JSONObject bA() {
        return this.bD;
    }

    public final int bB() {
        return this.bE;
    }

    public final int bC() {
        return this.bF;
    }

    public final int bD() {
        return this.bG;
    }

    public final int bE() {
        return this.bL;
    }

    public final JSONObject bF() {
        return this.bH;
    }

    public final int bG() {
        return this.bI;
    }

    public final long bH() {
        return this.bJ;
    }

    public final int bI() {
        return this.bK;
    }

    public final boolean bJ() {
        int i = this.bK;
        return i == 2 || i == 5;
    }

    public final int bc() {
        return this.aI;
    }

    public final int bd() {
        return this.bq;
    }

    public final boolean be() {
        return this.bs == 1;
    }

    public final com.anythink.core.common.h.q bf() {
        return this.aL;
    }

    public final boolean bg() {
        return this.bi == 1;
    }

    public final boolean bh() {
        return this.bm == 1;
    }

    public final ap bi() {
        return this.bw;
    }

    public final boolean bj() {
        return this.f17370n == 1;
    }

    public final boolean bk() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.bP > this.f17367k;
    }

    public final boolean bl() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.bP > ((long) this.bu);
    }

    public final boolean bm() {
        return !TextUtils.isEmpty(this.bo);
    }

    public final Boolean bn() {
        return this.bt;
    }

    public final int bo() {
        return this.bu;
    }

    public final String bp() {
        return this.bv;
    }

    public final int bq() {
        return this.bx;
    }

    public final boolean br() {
        return this.aM;
    }

    public final void bs() {
        this.aM = true;
    }

    public final JSONArray bt() {
        return this.bf;
    }

    public final JSONArray bu() {
        return this.bg;
    }

    public final int bv() {
        return this.by;
    }

    public final int bw() {
        return this.bz;
    }

    public final int bx() {
        return this.bA;
    }

    public final ai by() {
        return this.bB;
    }

    public final List<String> bz() {
        return this.bC;
    }

    public final long f() {
        return this.aS;
    }

    public final int g() {
        return this.aT;
    }

    public final int h() {
        return this.aU;
    }

    public final String i() {
        return this.f17366j;
    }

    public final f j() {
        return this.aK;
    }

    public final int k() {
        return this.aJ;
    }

    public final int l() {
        return this.aB;
    }

    public final List<Integer> m() {
        return this.bl;
    }

    public final int n() {
        return this.bj;
    }

    public final int o() {
        return this.bk;
    }

    public final int p() {
        return this.bi;
    }

    public final long r() {
        return this.bh;
    }

    public final ATAdRequest s() {
        return this.i;
    }

    public final int t() {
        return this.bn;
    }

    public final String u() {
        return this.bo;
    }

    public final int v() {
        return this.bp;
    }

    public final Map<String, bv> w() {
        return this.f17380x;
    }

    public final List<bv> x() {
        return this.f17379w;
    }

    public final int y() {
        return this.az;
    }

    public final List<Integer> z() {
        return this.ay;
    }

    private void A(int i) {
        this.f17370n = i;
    }

    private void B(int i) {
        this.f17371o = i;
    }

    private void C(int i) {
        this.f17375s = i;
    }

    private void D(int i) {
        this.f17376t = i;
    }

    private void E(int i) {
        this.f17377u = i;
    }

    private void F(int i) {
        this.f17378v = i;
    }

    private void I(int i) {
        this.bS = i;
    }

    private void J(int i) {
        this.bR = i;
    }

    private void K(int i) {
        this.bT = i;
    }

    private void L(int i) {
        this.bU = i;
    }

    private void M(int i) {
        this.aw = i;
    }

    private void N(int i) {
        this.ax = i;
    }

    private void O(int i) {
        this.aA = i;
    }

    private void P(int i) {
        this.aD = i;
    }

    private void Q(int i) {
        this.aE = i;
    }

    private void R(int i) {
        this.aF = i;
    }

    private void S(int i) {
        this.aG = i;
    }

    private void T(int i) {
        this.aI = i;
    }

    private void U(int i) {
        this.bq = i;
    }

    private void V(int i) {
        this.bs = i;
    }

    private void W(int i) {
        this.bm = i;
    }

    private void X(int i) {
        this.bu = i;
    }

    private void Y(int i) {
        this.bx = i;
    }

    private void Z(int i) {
        this.by = i;
    }

    private void a(long j6) {
        this.aQ = j6;
    }

    private void aa(int i) {
        this.bz = i;
    }

    private void ab(int i) {
        this.bA = i;
    }

    private void ac(int i) {
        this.bE = i;
    }

    private void ad(int i) {
        this.bF = i;
    }

    private void ae(int i) {
        this.bG = i;
    }

    private void af(int i) {
        this.bL = i;
    }

    private void ag(int i) {
        this.bI = i;
    }

    private void b(long j6) {
        this.aR = j6;
    }

    private void f(int i) {
        this.aT = i;
    }

    private void g(int i) {
        this.aU = i;
    }

    private void h(int i) {
        this.aJ = i;
    }

    private void i(int i) {
        this.aB = i;
    }

    private void j(int i) {
        this.bj = i;
    }

    private void k(int i) {
        this.bk = i;
    }

    private void l(int i) {
        this.bi = i;
    }

    private void m(int i) {
        this.bn = i;
    }

    private void n(int i) {
        this.bp = i;
    }

    private void o(int i) {
        this.az = i;
    }

    private void p(int i) {
        this.bM = i;
    }

    private void q(String str) {
        this.f17346E = str;
    }

    private void r(int i) {
        this.ao = i;
    }

    private void s(int i) {
        this.ap = i;
    }

    private void t(int i) {
        this.J = i;
    }

    private void u(int i) {
        this.f17348G = i;
    }

    private void v(int i) {
        this.f17350I = i;
    }

    private void w(int i) {
        this.f17345D = i;
    }

    private void x(int i) {
        this.f17382z = i;
    }

    private void y(int i) {
        this.f17381y = i;
    }

    private void z(int i) {
        this.f17369m = i;
    }

    public final int G() {
        int i = this.aN;
        if (i != -1 && this.aO == 1) {
            this.ao = i;
        }
        return this.ao;
    }

    public final int c() {
        return this.aP;
    }

    public final long d() {
        return this.aQ;
    }

    public final long e() {
        return this.aR;
    }

    private void a(f fVar) {
        this.aK = fVar;
    }

    private static l b(String str, JSONObject jSONObject) {
        l lVar;
        long optLong;
        l lVar2;
        l lVar3;
        int i;
        JSONArray optJSONArray;
        int length;
        if (jSONObject == null) {
            return null;
        }
        try {
            l lVar4 = new l(str);
            lVar4.bJ = System.currentTimeMillis();
            lVar4.b(jSONObject);
            lVar4.c(jSONObject);
            lVar4.d(jSONObject);
            if (jSONObject.isNull("ps_ct")) {
                lVar4.f17367k = 0L;
            } else {
                lVar4.f17367k = jSONObject.optLong("ps_ct");
            }
            if (jSONObject.isNull("ps_ct_out")) {
                lVar4.f17368l = 0L;
            } else {
                lVar4.f17368l = jSONObject.optLong("ps_ct_out");
            }
            if (jSONObject.isNull("pucs")) {
                lVar4.f17369m = 1;
            } else {
                lVar4.f17369m = jSONObject.optInt("pucs");
            }
            if (jSONObject.isNull("ad_delivery_sw")) {
                lVar4.f17370n = 1;
            } else {
                lVar4.f17370n = jSONObject.optInt("ad_delivery_sw");
            }
            if (jSONObject.isNull("req_ug_num")) {
                lVar4.f17371o = 1;
            } else {
                int optInt = jSONObject.optInt("req_ug_num", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                lVar4.f17371o = optInt;
            }
            if (jSONObject.isNull("unit_caps_d")) {
                lVar4.f17372p = -1L;
            } else {
                lVar4.f17372p = jSONObject.optLong("unit_caps_d");
            }
            if (jSONObject.isNull("unit_caps_h")) {
                lVar4.f17373q = -1L;
            } else {
                lVar4.f17373q = jSONObject.optLong("unit_caps_h");
            }
            if (jSONObject.isNull("unit_pacing")) {
                lVar4.f17374r = -1L;
            } else {
                lVar4.f17374r = jSONObject.optLong("unit_pacing");
            }
            if (jSONObject.isNull("wifi_auto_sw")) {
                lVar4.f17375s = 0;
            } else {
                lVar4.f17375s = jSONObject.optInt("wifi_auto_sw");
            }
            if (jSONObject.isNull("show_type")) {
                lVar4.f17376t = 0;
            } else {
                lVar4.f17376t = jSONObject.optInt("show_type");
            }
            if (jSONObject.isNull(ToolBar.REFRESH)) {
                lVar4.f17377u = 0;
            } else {
                lVar4.f17377u = jSONObject.optInt(ToolBar.REFRESH);
            }
            if (jSONObject.isNull("gro_id")) {
                lVar4.f17378v = 0;
            } else {
                lVar4.f17378v = jSONObject.optInt("gro_id");
            }
            if (jSONObject.isNull("format")) {
                lVar4.f17381y = 0;
            } else {
                lVar4.f17381y = jSONObject.optInt("format");
            }
            if (jSONObject.isNull("auto_refresh")) {
                lVar4.f17382z = 0;
            } else {
                lVar4.f17382z = jSONObject.optInt("auto_refresh");
            }
            if (jSONObject.isNull("auto_refresh_time")) {
                lVar4.f17342A = 0L;
            } else {
                lVar4.f17342A = jSONObject.optLong("auto_refresh_time");
            }
            if (jSONObject.isNull("s_t")) {
                lVar4.f17343B = 900000L;
            } else {
                lVar4.f17343B = jSONObject.optLong("s_t");
            }
            if (jSONObject.isNull(com.anythink.core.common.k.f14290N)) {
                lVar4.f17344C = 1800000L;
            } else {
                lVar4.f17344C = jSONObject.optLong(com.anythink.core.common.k.f14290N);
            }
            if (jSONObject.isNull("ra")) {
                lVar4.f17345D = -1;
            } else {
                lVar4.f17345D = jSONObject.optInt("ra");
            }
            if (jSONObject.isNull("asid")) {
                lVar4.f17346E = "";
            } else {
                lVar4.f17346E = jSONObject.optString("asid");
            }
            if (jSONObject.isNull("tp_ps")) {
                lVar = null;
                try {
                    lVar4.f17347F = null;
                } catch (Exception unused) {
                    return lVar;
                }
            } else {
                try {
                    bt btVar = new bt();
                    JSONObject optJSONObject = jSONObject.optJSONObject("tp_ps");
                    btVar.f13752a = optJSONObject.optInt("pucs") == 1;
                    btVar.f13753b = optJSONObject.optLong("apdt");
                    btVar.f13754c = optJSONObject.optInt("aprn");
                    btVar.f13755d = optJSONObject.optInt("puas") == 1;
                    btVar.f13756e = optJSONObject.optLong("cdt");
                    btVar.f13757f = optJSONObject.optInt("ski_swt") == 1;
                    btVar.f13758g = optJSONObject.optInt("aut_swt") == 1;
                    lVar4.f17347F = btVar;
                } catch (Exception unused2) {
                }
            }
            if (jSONObject.isNull("ug_list")) {
                lVar4.aV = new JSONArray();
            } else {
                lVar4.aV = jSONObject.optJSONArray("ug_list");
            }
            if (jSONObject.isNull("ol_list")) {
                lVar4.aW = new JSONArray();
            } else {
                lVar4.aW = jSONObject.optJSONArray("ol_list");
            }
            if (jSONObject.isNull("s2shb_list")) {
                lVar4.aX = new JSONArray();
            } else {
                lVar4.aX = jSONObject.optJSONArray("s2shb_list");
            }
            if (jSONObject.isNull(a.f17413g)) {
                lVar4.aY = new JSONArray();
            } else {
                lVar4.aY = jSONObject.optJSONArray(a.f17413g);
            }
            if (jSONObject.isNull(a.f17415j)) {
                lVar4.aZ = new JSONArray();
            } else {
                lVar4.aZ = jSONObject.optJSONArray(a.f17415j);
            }
            if (jSONObject.isNull(a.f17416k)) {
                lVar4.ba = new JSONArray();
            } else {
                lVar4.ba = jSONObject.optJSONArray(a.f17416k);
            }
            if (jSONObject.isNull(a.f17426u)) {
                lVar4.bb = new JSONArray();
            } else {
                lVar4.bb = jSONObject.optJSONArray(a.f17426u);
            }
            if (jSONObject.isNull(a.f17428w)) {
                lVar4.bc = new JSONArray();
            } else {
                lVar4.bc = jSONObject.optJSONArray(a.f17428w);
            }
            if (jSONObject.isNull(a.ac)) {
                lVar4.bP = 0L;
                optLong = 0;
            } else {
                optLong = jSONObject.optLong(a.ac);
                lVar4.bP = optLong;
            }
            if (jSONObject.isNull("t_g_id")) {
                lVar4.f17348G = -1;
            } else {
                lVar4.f17348G = jSONObject.optInt("t_g_id");
            }
            if (jSONObject.isNull(a.aD)) {
                lVar4.f17349H = "";
            } else {
                lVar4.f17349H = jSONObject.optString(a.aD);
            }
            if (jSONObject.isNull("u_n_f_sw")) {
                lVar4.f17350I = 0;
            } else {
                lVar4.f17350I = jSONObject.optInt("u_n_f_sw");
            }
            if (!jSONObject.isNull("m_o_s")) {
                lVar4.f17364X = ba.u(jSONObject.optString("m_o_s"));
            }
            if (jSONObject.isNull("m_o")) {
                lVar2 = null;
                try {
                    lVar4.f17363W = null;
                } catch (Exception unused3) {
                    return lVar2;
                }
            } else {
                lVar4.f17363W = a(jSONObject.optString("m_o"), jSONObject.optString("m_o_ks"), optLong, lVar4.f17364X);
            }
            if (jSONObject.isNull("p_m_o")) {
                lVar4.J = 0;
            } else {
                lVar4.J = jSONObject.optInt("p_m_o");
            }
            if (jSONObject.isNull(com.anythink.core.common.m.s.f14711b)) {
                lVar = null;
                lVar4.f17352L = null;
            } else {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(com.anythink.core.common.m.s.f14711b));
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.opt(next));
                }
                lVar4.f17352L = hashMap;
            }
            if (!jSONObject.isNull("callback")) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString("callback"));
                if (!jSONObject3.isNull("sc_list")) {
                    JSONObject jSONObject4 = new JSONObject(jSONObject3.optString("sc_list"));
                    HashMap hashMap2 = new HashMap();
                    Iterator<String> keys2 = jSONObject4.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        JSONObject jSONObject5 = new JSONObject(jSONObject4.optString(next2));
                        ATRewardInfo aTRewardInfo = new ATRewardInfo();
                        aTRewardInfo.rewardName = jSONObject5.optString("rw_n");
                        aTRewardInfo.rewardNumber = jSONObject5.optInt("rw_num");
                        hashMap2.put(next2, aTRewardInfo);
                    }
                    lVar4.f17353M = hashMap2;
                }
                if (!jSONObject3.isNull("reward")) {
                    JSONObject jSONObject6 = new JSONObject(jSONObject3.optString("reward"));
                    ATRewardInfo aTRewardInfo2 = new ATRewardInfo();
                    if (!jSONObject6.isNull("rw_n")) {
                        aTRewardInfo2.rewardName = jSONObject6.optString("rw_n");
                    }
                    if (!jSONObject6.isNull("rw_num")) {
                        aTRewardInfo2.rewardNumber = jSONObject6.optInt("rw_num");
                    }
                    lVar4.f17354N = aTRewardInfo2;
                }
                if (!jSONObject3.isNull("currency")) {
                    lVar4.f17355O = jSONObject3.optString("currency");
                }
                if (!jSONObject3.isNull(com.anythink.expressad.f.a.b.f18418h)) {
                    lVar4.f17356P = jSONObject3.optString(com.anythink.expressad.f.a.b.f18418h);
                }
                if (!jSONObject3.isNull("exch_r")) {
                    lVar4.f17365Z = jSONObject3.optDouble("exch_r", 0.0d);
                }
                if (!jSONObject3.isNull("acct_cy")) {
                    lVar4.aa = jSONObject3.optString("acct_cy");
                }
            }
            if (jSONObject.isNull(a.f17407a)) {
                lVar4.f17357Q = 10000L;
            } else {
                lVar4.f17357Q = jSONObject.optLong(a.f17407a);
            }
            if (jSONObject.isNull(a.f17408b)) {
                lVar4.f17358R = "";
            } else {
                lVar4.f17358R = jSONObject.optString(a.f17408b);
            }
            if (jSONObject.isNull(a.f17409c)) {
                lVar4.f17359S = 10000L;
            } else {
                lVar4.f17359S = jSONObject.optLong(a.f17409c);
            }
            if (jSONObject.isNull(a.f17410d)) {
                lVar4.f17360T = -1;
            } else {
                lVar4.f17360T = jSONObject.optInt(a.f17410d);
            }
            if (jSONObject.isNull(a.f17411e)) {
                lVar4.f17361U = 900000L;
            } else {
                lVar4.f17361U = jSONObject.optLong(a.f17411e);
            }
            if (jSONObject.isNull(a.f17412f)) {
                lVar4.f17362V = 2;
            } else {
                int optInt2 = jSONObject.optInt(a.f17412f, 1);
                if (optInt2 <= 0) {
                    optInt2 = 1;
                }
                lVar4.f17362V = optInt2;
            }
            if (jSONObject.isNull(a.i)) {
                lVar2 = null;
                lVar4.bN = null;
            } else {
                lVar4.bN = jSONObject.optString(a.i);
            }
            if (jSONObject.isNull(a.f17414h)) {
                lVar4.bO = "";
            } else {
                lVar4.bO = jSONObject.optString(a.f17414h);
            }
            if (jSONObject.isNull(a.f17417l)) {
                lVar4.Y = 4000L;
            } else {
                lVar4.Y = jSONObject.optLong(a.f17417l);
            }
            if (jSONObject.isNull(a.f17418m)) {
                lVar3 = null;
                try {
                    lVar4.ab = null;
                } catch (Exception unused4) {
                    return lVar3;
                }
            } else {
                JSONArray optJSONArray2 = jSONObject.optJSONArray(a.f17418m);
                ArrayList arrayList = new ArrayList(3);
                for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                    arrayList.add(optJSONArray2.optString(i6));
                }
                lVar4.ab = arrayList;
            }
            if (jSONObject.isNull(a.f17419n)) {
                lVar4.ac = "";
            } else {
                lVar4.ac = jSONObject.optString(a.f17419n);
            }
            if (jSONObject.isNull(a.f17420o)) {
                lVar4.ad = "";
            } else {
                lVar4.ad = jSONObject.optString(a.f17420o);
            }
            if (jSONObject.isNull(a.f17421p)) {
                lVar4.ae = "";
            } else {
                lVar4.ae = jSONObject.optString(a.f17421p);
            }
            if (jSONObject.isNull(a.f17422q)) {
                lVar4.af = "";
            } else {
                lVar4.af = jSONObject.optString(a.f17422q);
            }
            if (jSONObject.isNull(a.f17423r)) {
                lVar4.ag = 500L;
            } else {
                lVar4.ag = jSONObject.optLong(a.f17423r);
            }
            if (jSONObject.isNull(a.f17424s)) {
                lVar4.ah = "";
            } else {
                lVar4.ah = jSONObject.optString(a.f17424s);
            }
            if (jSONObject.isNull(a.f17425t)) {
                lVar4.ai = "";
            } else {
                lVar4.ai = jSONObject.optString(a.f17425t);
            }
            if (jSONObject.isNull(a.f17427v)) {
                lVar4.aj = 0.1614d;
            } else {
                lVar4.aj = jSONObject.optDouble(a.f17427v);
            }
            if (jSONObject.isNull(a.f17429x)) {
                lVar4.be = new JSONArray();
            } else {
                lVar4.be = jSONObject.optJSONArray(a.f17429x);
            }
            if (jSONObject.isNull(a.f17430y)) {
                lVar4.ak = 1000L;
            } else {
                lVar4.ak = jSONObject.optLong(a.f17430y);
            }
            if (jSONObject.isNull(a.f17431z)) {
                lVar4.al = 0L;
            } else {
                lVar4.al = jSONObject.optLong(a.f17431z);
            }
            if (jSONObject.isNull(a.f17383A)) {
                lVar4.am = com.anythink.basead.exoplayer.i.a.f7883f;
            } else {
                lVar4.am = jSONObject.optLong(a.f17383A);
            }
            if (jSONObject.isNull(a.f17384B)) {
                lVar4.an = -1L;
            } else {
                lVar4.an = jSONObject.optLong(a.f17384B);
            }
            if (jSONObject.isNull(a.f17385C)) {
                lVar4.ao = 1;
            } else {
                int optInt3 = jSONObject.optInt(a.f17385C);
                if (optInt3 != 1 && optInt3 != 2) {
                    optInt3 = 1;
                }
                lVar4.ao = optInt3;
            }
            if (jSONObject.isNull(a.f17386D)) {
                lVar4.ap = 1;
            } else {
                lVar4.ap = jSONObject.optInt(a.f17386D);
            }
            if (jSONObject.isNull(a.f17387E)) {
                lVar4.aq = 2;
            } else {
                lVar4.aq = jSONObject.optInt(a.f17387E);
            }
            if (jSONObject.isNull(a.f17388F)) {
                lVar4.ar = com.anythink.basead.exoplayer.i.a.f7883f;
            } else {
                lVar4.ar = jSONObject.optLong(a.f17388F);
            }
            if (jSONObject.isNull(a.f17389G)) {
                lVar4.bd = new JSONArray();
            } else {
                lVar4.bd = jSONObject.optJSONArray(a.f17389G);
            }
            if (jSONObject.isNull("bid_floor")) {
                lVar4.bQ = 0.0d;
            } else {
                lVar4.bQ = jSONObject.optDouble("bid_floor");
            }
            if (jSONObject.isNull(a.f17391I)) {
                lVar4.as = null;
            } else {
                lVar4.as = jSONObject.optJSONObject(a.f17391I);
            }
            if (jSONObject.isNull(a.f17392K)) {
                lVar4.bR = 0;
            } else {
                lVar4.bR = jSONObject.optInt(a.f17392K);
            }
            if (jSONObject.isNull(a.f17393L)) {
                lVar4.bS = 2;
            } else {
                lVar4.bS = jSONObject.optInt(a.f17393L);
            }
            if (jSONObject.isNull(a.f17394M)) {
                lVar4.bU = 0;
            } else {
                lVar4.bU = jSONObject.optInt(a.f17394M);
            }
            if (jSONObject.isNull(a.f17395N)) {
                lVar4.bT = 0;
            } else {
                lVar4.bT = jSONObject.optInt(a.f17395N);
            }
            if (jSONObject.isNull("is_test")) {
                lVar4.bM = 2;
            } else {
                lVar4.bM = jSONObject.optInt("is_test");
            }
            lVar4.at = jSONObject.optJSONObject(a.f17399R);
            if (jSONObject.isNull(a.f17400S)) {
                lVar4.au = "";
            } else {
                lVar4.au = jSONObject.optString(a.f17400S);
            }
            if (jSONObject.isNull(a.f17401T)) {
                lVar4.av = "";
            } else {
                lVar4.av = jSONObject.optString(a.f17401T);
            }
            if (!jSONObject.isNull(a.f17402U)) {
                lVar4.aw = jSONObject.optInt(a.f17402U);
            } else {
                lVar4.aw = 2;
            }
            if (!jSONObject.isNull(a.f17403V)) {
                lVar4.ax = jSONObject.optInt(a.f17403V);
                i = 1;
            } else {
                i = 1;
                lVar4.ax = 1;
            }
            if (jSONObject.isNull(a.f17404W)) {
                lVar4.ay = new ArrayList(i);
            } else {
                ArrayList arrayList2 = new ArrayList(3);
                JSONArray optJSONArray3 = jSONObject.optJSONArray(a.f17404W);
                if (optJSONArray3 != null) {
                    int length2 = optJSONArray3.length();
                    for (int i9 = 0; i9 < length2; i9++) {
                        arrayList2.add(Integer.valueOf(optJSONArray3.optInt(i9)));
                    }
                }
                lVar4.ay = arrayList2;
            }
            if (jSONObject.isNull(a.f17405X)) {
                lVar4.az = 2;
            } else {
                lVar4.az = jSONObject.optInt(a.f17405X);
            }
            if (!jSONObject.isNull(a.Y)) {
                lVar4.aA = jSONObject.optInt(a.Y);
            } else {
                lVar4.aA = 1;
            }
            if (jSONObject.isNull(a.f17406Z)) {
                lVar4.aB = 2;
            } else {
                lVar4.aB = jSONObject.optInt(a.f17406Z);
            }
            if (!jSONObject.isNull(a.aa)) {
                lVar4.bV = jSONObject.optJSONObject(a.aa);
            }
            if (!jSONObject.isNull(a.ab)) {
                lVar4.aD = jSONObject.optInt(a.ab);
            }
            if (!jSONObject.isNull(a.af)) {
                lVar4.aE = jSONObject.optInt(a.af);
            }
            if (!jSONObject.isNull(a.ag)) {
                lVar4.aF = jSONObject.optInt(a.ag);
            }
            if (!jSONObject.isNull(a.ad)) {
                lVar4.aG = jSONObject.optInt(a.ad);
            }
            if (!jSONObject.isNull(a.ae)) {
                try {
                    JSONArray optJSONArray4 = jSONObject.optJSONArray(a.ae);
                    if (optJSONArray4 != null) {
                        double[][] dArr = new double[optJSONArray4.length()][];
                        for (int i10 = 0; i10 < optJSONArray4.length(); i10++) {
                            Object obj = optJSONArray4.get(i10);
                            if (obj instanceof JSONArray) {
                                JSONArray jSONArray = (JSONArray) obj;
                                dArr[i10] = new double[]{Double.parseDouble(String.valueOf(jSONArray.get(0))), Double.parseDouble(String.valueOf(jSONArray.get(1)))};
                            }
                        }
                        lVar4.aH = dArr;
                    }
                } catch (Exception unused5) {
                }
            }
            if (!jSONObject.isNull(a.ah)) {
                lVar4.aI = jSONObject.optInt(a.ah);
            }
            lVar4.bh = jSONObject.optLong(a.ai, com.anythink.basead.exoplayer.i.a.f7883f);
            lVar4.bi = jSONObject.optInt(a.aj, 2);
            int optInt4 = jSONObject.optInt(a.ak, 1);
            if (optInt4 != 1 && optInt4 != 2) {
                optInt4 = 1;
            }
            lVar4.bj = optInt4;
            int optInt5 = jSONObject.optInt(a.al, 1);
            if (optInt5 <= 0) {
                optInt5 = 1;
            }
            lVar4.bk = optInt5;
            lVar4.bn = jSONObject.optInt(a.am, 0);
            lVar4.bo = jSONObject.optString(a.an, "");
            lVar4.bp = jSONObject.optInt("s2s_sw", 2);
            JSONArray optJSONArray5 = jSONObject.optJSONArray(a.ap);
            if (optJSONArray5 != null && (length = optJSONArray5.length()) > 0) {
                ArrayList arrayList3 = new ArrayList();
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj2 = optJSONArray5.get(i11);
                    if (obj2 instanceof Integer) {
                        arrayList3.add((Integer) obj2);
                    }
                }
                lVar4.bl = arrayList3;
            }
            lVar4.bq = jSONObject.optInt(a.aq, 1);
            int[] iArr = {1, 2, 3, 4, 5};
            if (!jSONObject.isNull(a.ar) && (optJSONArray = jSONObject.optJSONArray(a.ar)) != null && optJSONArray.length() > 0) {
                try {
                    iArr = new int[optJSONArray.length()];
                    for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                        iArr[i12] = optJSONArray.getInt(i12);
                    }
                } catch (Exception unused6) {
                    iArr = new int[]{1, 2, 3, 4, 5};
                }
            }
            lVar4.br = iArr;
            lVar4.aJ = jSONObject.optInt(a.as, 1);
            if (jSONObject.optInt(a.at, 2) == 1) {
                lVar4.aK = f.a(jSONObject.optString(a.au));
            } else {
                lVar3 = null;
                lVar4.aK = null;
            }
            lVar4.aC = jSONObject.optInt(a.av, 0);
            lVar4.bs = jSONObject.optInt(a.aw, 2);
            lVar4.bm = jSONObject.optInt(a.ax);
            lVar4.bu = jSONObject.optInt(a.ay, 604800000);
            lVar4.bv = jSONObject.optString(a.az);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(a.aB);
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                ap apVar = new ap();
                apVar.a(jSONObject.optString("unique_id"));
                apVar.c(optJSONObject2.optString(a.aC));
                apVar.a(optJSONObject2.optInt(a.aD));
                apVar.b(optJSONObject2.optInt(a.aE));
                lVar4.bw = apVar;
            }
            com.anythink.core.common.v.t.a(lVar4.aj);
            lVar4.bx = jSONObject.optInt(a.aF, -1);
            JSONArray optJSONArray6 = jSONObject.optJSONArray(a.aG);
            if (optJSONArray6 == null) {
                optJSONArray6 = new JSONArray();
            }
            lVar4.bf = optJSONArray6;
            JSONArray optJSONArray7 = jSONObject.optJSONArray(a.aH);
            if (optJSONArray7 == null) {
                optJSONArray7 = new JSONArray();
            }
            lVar4.bg = optJSONArray7;
            lVar4.by = jSONObject.optInt(a.aI, -1);
            lVar4.bz = jSONObject.optInt(a.aJ, -1);
            lVar4.bA = jSONObject.optInt(a.aK, 2000);
            lVar4.bB = ai.a(jSONObject);
            lVar4.bC = com.anythink.core.common.v.q.b(jSONObject.optJSONArray(a.aL));
            JSONObject optJSONObject3 = jSONObject.optJSONObject(a.aM);
            if (optJSONObject3 != null) {
                lVar4.bD = optJSONObject3;
            }
            lVar4.bE = jSONObject.optInt(a.aN, 1);
            lVar4.bF = jSONObject.optInt(a.aO, 10000);
            lVar4.bG = jSONObject.optInt(a.aP, 3000);
            lVar4.bL = jSONObject.optInt(a.aQ, 2);
            JSONObject optJSONObject4 = jSONObject.optJSONObject(a.aR);
            if (optJSONObject4 != null) {
                lVar4.bH = optJSONObject4;
            }
            lVar4.bI = jSONObject.optInt(a.aS, 2);
            lVar4.aN = jSONObject.optInt("req_ug_type_v2", -1);
            lVar4.aO = jSONObject.optInt("device_perf_sw", 0);
            lVar4.aP = jSONObject.optInt("max_cached_num", -1);
            lVar4.aQ = jSONObject.optLong("wf_req_wait_t", 0L);
            lVar4.aR = jSONObject.optLong("c2s_req_wait_t", 0L);
            lVar4.aS = jSONObject.optLong("s2s_req_wait_t", 0L);
            lVar4.aT = jSONObject.optInt("auto_req_type", -1);
            lVar4.aU = jSONObject.optInt("auto_refresh_type_v2", -1);
            return lVar4;
        } catch (Exception unused7) {
            return null;
        }
    }

    private void c(long j6) {
        this.aS = j6;
    }

    private void d(long j6) {
        this.bh = j6;
    }

    private void e(String str) {
        this.au = str;
    }

    private void f(long j6) {
        this.an = j6;
    }

    private void g(long j6) {
        this.ak = j6;
    }

    private void h(long j6) {
        this.ag = j6;
    }

    private void i(String str) {
        this.ac = str;
    }

    private void j(String str) {
        this.aa = str;
    }

    private void k(String str) {
        this.bN = str;
    }

    private void l(String str) {
        this.bO = str;
    }

    private void m(String str) {
        this.f17358R = str;
    }

    private void n(String str) {
        this.f17355O = str;
    }

    private void o(String str) {
        this.f17356P = str;
    }

    private void p(String str) {
        this.f17349H = str;
    }

    private void q(long j6) {
        this.f17373q = j6;
    }

    private void r(long j6) {
        this.f17374r = j6;
    }

    private void s(long j6) {
        this.bP = j6;
    }

    private void t(long j6) {
        this.f17359S = j6;
    }

    private void u(long j6) {
        this.f17361U = j6;
    }

    private void v(long j6) {
        this.al = j6;
    }

    private void w(long j6) {
        this.am = j6;
    }

    private void H(int i) {
        this.f17362V = i;
    }

    private void a(List<Integer> list) {
        this.bl = list;
    }

    private void c(String str) {
        this.bo = str;
    }

    private void d(String str) {
        this.av = str;
    }

    private void e(JSONObject jSONObject) {
        this.as = jSONObject;
    }

    private void f(String str) {
        this.ah = str;
    }

    private void g(String str) {
        this.ai = str;
    }

    private void h(String str) {
        this.ad = str;
    }

    private void i(long j6) {
        this.Y = j6;
    }

    private void j(long j6) {
        this.f17357Q = j6;
    }

    private void k(long j6) {
        this.f17343B = j6;
    }

    private void l(long j6) {
        this.f17344C = j6;
    }

    private void m(long j6) {
        this.f17342A = j6;
    }

    private void n(long j6) {
        this.f17367k = j6;
    }

    private void o(long j6) {
        this.f17368l = j6;
    }

    private void p(long j6) {
        this.f17372p = j6;
    }

    private void r(String str) {
        this.ae = str;
    }

    private void s(String str) {
        this.af = str;
    }

    private void t(String str) {
        this.bv = str;
    }

    public final int q() {
        return this.bi == 1 ? 2 : 1;
    }

    private void c(List<Integer> list) {
        this.ay = list;
    }

    private void d(List<String> list) {
        this.ab = list;
    }

    private void e(long j6) {
        this.ar = j6;
    }

    private void f(JSONArray jSONArray) {
        this.aW = jSONArray;
    }

    private void g(JSONArray jSONArray) {
        this.aX = jSONArray;
    }

    private void h(JSONArray jSONArray) {
        this.aZ = jSONArray;
    }

    private void i(JSONArray jSONArray) {
        this.bc = jSONArray;
    }

    private void j(JSONArray jSONArray) {
        this.bd = jSONArray;
    }

    private void k(JSONArray jSONArray) {
        this.bf = jSONArray;
    }

    private void l(JSONArray jSONArray) {
        this.bg = jSONArray;
    }

    public final void a(ATAdRequest aTAdRequest) {
        this.i = aTAdRequest;
    }

    private void a(Map<String, bv> map) {
        this.f17380x = map;
    }

    private void c(JSONArray jSONArray) {
        this.ba = jSONArray;
    }

    private void d(JSONArray jSONArray) {
        this.aY = jSONArray;
    }

    private void e(List<ay> list) {
        this.f17363W = list;
    }

    private void f(JSONObject jSONObject) {
        this.bV = jSONObject;
    }

    private void g(JSONObject jSONObject) {
        this.bD = jSONObject;
    }

    private void h(JSONObject jSONObject) {
        this.bH = jSONObject;
    }

    private void c(Map<String, Object> map) {
        this.f17352L = map;
    }

    private void e(JSONArray jSONArray) {
        this.aV = jSONArray;
    }

    private void f(List<String> list) {
        this.bC = list;
    }

    public final bv a(String str) {
        Map<String, bv> map = this.f17380x;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private void c(double d2) {
        this.bQ = d2;
    }

    private void a(JSONObject jSONObject) {
        this.at = jSONObject;
    }

    private void a(JSONArray jSONArray) {
        this.be = jSONArray;
    }

    private void a(double d2) {
        this.aj = d2;
    }

    private void a(ba baVar) {
        this.f17364X = baVar;
    }

    private void a(ATRewardInfo aTRewardInfo) {
        this.f17354N = aTRewardInfo;
    }

    private void a(bt btVar) {
        this.f17347F = btVar;
    }

    private void a(double[][] dArr) {
        this.aH = dArr;
    }

    public final void a(int i) {
        this.aC = i;
    }

    private void a(int[] iArr) {
        this.br = iArr;
    }

    public static l a(String str, JSONObject jSONObject) {
        l b9 = b(str, jSONObject);
        if (b9 != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            ArrayList arrayList = new ArrayList();
            u.a(b9, concurrentHashMap, arrayList);
            b9.f17379w = arrayList;
            b9.f17380x = concurrentHashMap;
        }
        return b9;
    }

    private static List<ay> a(String str, String str2, long j6, ba baVar) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                ay ayVar = new ay();
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                ayVar.k(optJSONObject.optString("o_id"));
                ayVar.l(optJSONObject.optString(a.aE));
                ayVar.m(optJSONObject.optString("t"));
                ayVar.x(optJSONObject.optString("p_g"));
                ayVar.n(optJSONObject.optString("d"));
                ayVar.o(optJSONObject.optString("ic_u"));
                ayVar.p(optJSONObject.optString("im_u"));
                ayVar.q(optJSONObject.optString("f_i_u"));
                ayVar.r(optJSONObject.optString("a_c_u"));
                ayVar.s(optJSONObject.optString("c_t"));
                ayVar.t(optJSONObject.optString("v_u"));
                ayVar.h(optJSONObject.optInt("l_t"));
                ayVar.u(optJSONObject.optString("p_u"));
                ayVar.v(optJSONObject.optString("dl"));
                ayVar.w(optJSONObject.optString("c_u"));
                ayVar.aa(optJSONObject.optString("ip_u"));
                ayVar.ab(optJSONObject.optString("t_u"));
                ayVar.ac(optJSONObject.optString("t_u_25"));
                ayVar.ad(optJSONObject.optString("t_u_50"));
                ayVar.ae(optJSONObject.optString("t_u_75"));
                ayVar.af(optJSONObject.optString("t_u_100"));
                ayVar.ag(optJSONObject.optString("s_e_c_t_u"));
                ayVar.ah(optJSONObject.optString("c_t_u"));
                ayVar.ai(optJSONObject.optString("ip_n_u"));
                ayVar.aj(optJSONObject.optString("c_n_u"));
                ayVar.f13598c = optJSONObject.optInt("o_a_d_c");
                ayVar.f13599d = optJSONObject.optLong("o_a_p");
                ayVar.b(j6);
                ayVar.g(optJSONObject.optInt("unit_type"));
                ayVar.a(optJSONObject.optInt("c_m"));
                ayVar.b(optJSONObject.optString("ext_h_pic"));
                ayVar.X(optJSONObject.optString("ext_big_h_pic"));
                ayVar.Y(optJSONObject.optString("ext_rect_h_pic"));
                ayVar.Z(optJSONObject.optString("ext_home_h_pic"));
                ayVar.a(str2);
                ayVar.z(optJSONObject.optString("pub"));
                ayVar.A(optJSONObject.optString("app_vc"));
                ayVar.B(optJSONObject.optString("pvc"));
                ayVar.C(optJSONObject.optString("pms"));
                ayVar.c((y) baVar);
                arrayList.add(ayVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    public final Map<String, Object> a(String str, String str2, bv bvVar, ATAdRequest aTAdRequest) {
        String str3;
        com.anythink.core.common.h.q qVar;
        ad R8;
        Map<String, Object> l9 = bvVar.l();
        boolean b9 = com.anythink.core.common.v.p.b();
        b g4 = D.y.g(D.y.h());
        if (!TextUtils.isEmpty(bvVar.E())) {
            l9.put("payload", bvVar.E());
            if (bvVar.R() != null && !TextUtils.isEmpty(bvVar.R().r())) {
                l9.put(j.w.f12616c, bvVar.R().r());
            }
        }
        if (!TextUtils.isEmpty(bvVar.W())) {
            l9.put("custom_inhouse_bid_result", bvVar.W());
        }
        boolean z3 = false;
        l9.put(j.w.f12617d, Boolean.valueOf(g4.B() == 3));
        if (g4.C() == 2 && b9) {
            z3 = true;
        }
        l9.put(j.w.f12618e, Boolean.valueOf(z3));
        l9.put(j.w.f12619f, Boolean.valueOf(v.a(com.anythink.core.common.d.t.b().g()).b(bvVar.g())));
        if (bvVar.g() == 66 && bvVar.R() != null) {
            int a9 = bvVar.R().a(this.f17381y);
            if (a9 >= 0) {
                l9.put("ad_type", Integer.valueOf(a9));
            } else {
                l9.put("ad_type", Integer.valueOf(bvVar.ae()));
            }
        } else {
            l9.put("ad_type", Integer.valueOf(bvVar.ae()));
        }
        if (this.ax == 1) {
            StringBuilder c9 = AbstractC5049e.c(str, "_");
            c9.append(this.f17348G);
            c9.append("_");
            c9.append(this.f17378v);
            c9.append("_");
            c9.append(str2);
            l9.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.MEDIATION_WF_ID, c9.toString());
        }
        l9.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.STACK_INFO, com.anythink.core.common.u.a().f(str));
        if (bvVar.g() == 28 && (R8 = bvVar.R()) != null) {
            l9.put(j.w.f12625m, Double.valueOf(com.anythink.core.common.v.p.a(bvVar) * R8.f13429l));
        }
        String m4 = com.anythink.core.common.v.m.m();
        if (!TextUtils.isEmpty(m4)) {
            l9.put(ATAdConst.KEY.WECHAT_APPID, m4);
        }
        if (bvVar.g() == 35 || bvVar.q() == 3 || bvVar.q() == 4 || bvVar.q() == 7) {
            x xVar = new x();
            xVar.f14155a = bvVar.E();
            xVar.f14160f = bvVar.g();
            xVar.f14157c = bvVar.z();
            xVar.f14158d = str2;
            xVar.f14156b = str;
            xVar.f14162h = this.f17348G;
            xVar.i = this.f17378v;
            xVar.f14163j = this.f17381y;
            xVar.f14161g = bvVar.h();
            if (aTAdRequest != null) {
                xVar.f14174u = aTAdRequest.getChannelSource();
            }
            xVar.f14175v = bvVar.k();
            ad R9 = bvVar.R();
            if (R9 != null) {
                xVar.f14164k = R9.a(this.f17381y);
                xVar.f14172s = R9.x();
                xVar.f14173t = R9.getOriginRequestId();
            } else {
                xVar.f14164k = -1;
            }
            xVar.f14165l = R9 != null ? R9.f13425g : "";
            if (R9 == null) {
                str3 = "";
            } else {
                str3 = R9.f13426h;
            }
            xVar.f14166m = str3;
            if (bvVar.g() == 35) {
                xVar.f14168o = this.f17364X;
            } else {
                xVar.f14168o = bk.u(this.bO);
            }
            y yVar = xVar.f14168o;
            if (yVar != null) {
                yVar.u(this.f17381y);
            }
            xVar.f14167n = R9 != null ? R9.f13424f : 0L;
            if (TextUtils.equals(String.valueOf(this.f17381y), "0")) {
                xVar.f14169p = TextUtils.equals(ATInitMediation.getStringFromMap(l9, "layout_type", ""), "1");
                xVar.f14170q = g4.aW();
            }
            xVar.f14171r = this.bv;
            l9.put(j.w.f12614a, xVar);
        }
        if (bvVar.g() == 50 && this.aA == 1) {
            l9.put(j.w.f12627o, str2);
        }
        ATAdConst.CURRENCY currency = ATAdConst.CURRENCY.RMB;
        if (TextUtils.equals(bvVar.au(), j.C0076j.f12485a)) {
            currency = ATAdConst.CURRENCY.USD;
        }
        l9.put(j.w.f12628p, currency);
        if (bvVar.g() == 2) {
            l9.put(j.w.f12630r, bvVar.aD());
            l9.put(j.w.f12610G, Integer.valueOf(g4.aF()));
            l9.put(j.w.f12611H, bvVar.z());
            if (bvVar.aN() == 1 && (qVar = this.aL) != null) {
                l9.put(j.w.f12632t, Boolean.valueOf(qVar.a()));
                if (this.aL.a() || this.aL.f14038b) {
                    l9.put(j.w.f12631s, str2);
                }
            }
        }
        if (bvVar.ae() == 0) {
            l9.put(a.aq, Integer.valueOf(this.bq));
            if (bvVar.aF() == null) {
                l9.put(a.ar, this.br);
            } else {
                l9.put(a.ar, bvVar.aF());
            }
            l9.put("nw_firm_id", Integer.valueOf(bvVar.g()));
        }
        JSONObject ac = g4.ac();
        if (ac != null) {
            try {
                String string = ac.getString(String.valueOf(bvVar.g()));
                if (!TextUtils.isEmpty(string)) {
                    l9.put("network_ext", string);
                }
            } catch (Exception unused) {
            }
        }
        JSONArray aI = bvVar.aI();
        if (aI != null && aI.length() > 0) {
            l9.put("web_content_urls", aI);
        }
        int aJ = bvVar.aJ();
        if (aJ > 0) {
            l9.put(com.anythink.core.common.k.az, Integer.valueOf(aJ));
        }
        l9.put("ad_s_reqf_mode", Integer.valueOf(bvVar.aK()));
        l9.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, Integer.valueOf(this.f17381y));
        l9.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GM_REFRESH_KEY, Boolean.valueOf(g4.aC()));
        if (bvVar.g() == 8) {
            l9.put(j.w.f12637y, Integer.valueOf(bvVar.aT()));
        }
        if (bvVar.g() == 39) {
            l9.put(j.w.f12612I, Long.valueOf(bvVar.ba()));
            l9.put(j.w.J, Integer.valueOf(bvVar.bd()));
        }
        if (bvVar.g() == 77) {
            l9.put(j.w.f12631s, str2);
        }
        if (bvVar.g() == 22) {
            l9.put(j.w.f12613K, Integer.valueOf(bvVar.al()));
        }
        return l9;
    }

    public final void a(Boolean bool) {
        this.bt = bool;
    }

    private void a(ap apVar) {
        this.bw = apVar;
    }

    private void a(ai aiVar) {
        this.bB = aiVar;
    }

    private boolean a(l lVar) {
        if (lVar == null) {
            return true;
        }
        return (TextUtils.equals(this.f17346E, lVar.f17346E) || ba()) ? false : true;
    }

    private void b(List<bv> list) {
        this.f17379w = list;
    }

    private void b(JSONArray jSONArray) {
        this.bb = jSONArray;
    }

    private void b(double d2) {
        this.f17365Z = d2;
    }

    private void b(Map<String, ATRewardInfo> map) {
        this.f17353M = map;
    }

    public final ay b(String str) {
        List<ay> list = this.f17363W;
        if (list == null) {
            return null;
        }
        for (ay ayVar : list) {
            if (ayVar.r() == null) {
                ayVar.c((y) this.f17364X);
            }
            if (TextUtils.equals(str, ayVar.v()) && !ayVar.a2(this.f17364X)) {
                return ayVar;
            }
        }
        return null;
    }

    public final void b(int i) {
        this.bK = i;
    }
}

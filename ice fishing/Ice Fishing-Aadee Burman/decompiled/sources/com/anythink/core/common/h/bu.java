package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.d.l;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class bu {

    /* renamed from: S, reason: collision with root package name */
    public static final String f13759S = "ofm_tid_key";

    /* renamed from: T, reason: collision with root package name */
    public static final int f13760T = 1;

    /* renamed from: U, reason: collision with root package name */
    public static final int f13761U = 2;

    /* renamed from: V, reason: collision with root package name */
    public static final int f13762V = 3;

    /* renamed from: W, reason: collision with root package name */
    public static final int f13763W = 4;

    /* renamed from: X, reason: collision with root package name */
    public static final int f13764X = 5;
    public static final int Y = 6;

    /* renamed from: Z, reason: collision with root package name */
    public static final int f13765Z = 7;
    public static final int aA = 5;
    public static final int aB = 8;
    public static final int aC = 5;
    public static final int aD = 6;
    public static final int aE = 7;
    public static final String aF = "0";
    public static final String aG = "1";
    public static final String aH = "2";
    public static final String aI = "3";
    public static final String aJ = "4";
    public static final String aK = "50";
    public static final int aa = 8;
    public static final int ab = 9;
    public static final int ac = 10;
    public static final int ad = 18;
    public static final int ae = 21;
    public static final int af = 25;
    public static final int ag = 26;
    public static final int ah = 27;
    public static final int ai = 28;
    public static final int aj = 29;
    public static final int ak = 30;
    public static final int al = 31;
    public static final int am = 32;
    public static final int an = 33;
    public static final int ao = 34;
    public static final int ap = 0;
    public static final int aq = 1;
    public static final int ar = 2;
    public static final int as = 8;
    public static final int at = 9;
    public static final int au = 10;
    public static final int av = 11;
    public static final int aw = 3;
    public static final int ax = 12;
    public static final int ay = 13;
    public static final int az = 4;

    /* renamed from: a, reason: collision with root package name */
    private String f13766a;
    protected String aL;
    protected String aM;
    protected String aN;
    protected String aO;
    public String aP;
    public int aQ;
    public int aR;
    protected String aS;
    protected int aT;
    protected int aU;
    protected int aV;
    protected int aW = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f13767b;

    /* renamed from: c, reason: collision with root package name */
    private int f13768c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f13769d;

    /* renamed from: e, reason: collision with root package name */
    private int f13770e;

    /* renamed from: f, reason: collision with root package name */
    private Object f13771f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f13772g;

    /* renamed from: h, reason: collision with root package name */
    private String f13773h;
    private String i;

    private int c() {
        return this.aT;
    }

    private String d() {
        return this.aP;
    }

    private int e() {
        return this.aQ;
    }

    private int f() {
        return this.aR;
    }

    public final void D(String str) {
        this.f13773h = str;
    }

    public final void E(String str) {
        this.f13766a = str;
    }

    public final void F(String str) {
        this.f13767b = str;
    }

    public final void G(String str) {
        this.aS = str;
    }

    public final void H(String str) {
        this.aO = str;
    }

    public final void I(String str) {
        this.aL = str;
    }

    public final void J(String str) {
        this.aM = str;
    }

    public final void K(String str) {
        this.aN = str;
    }

    public final void L(String str) {
        this.i = str;
    }

    public JSONObject O(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", i);
            jSONObject.put(com.anythink.core.common.m.e.bk, this.aL);
            jSONObject.put("req_id", this.aM);
            if (!TextUtils.isEmpty(this.aN)) {
                jSONObject.put("format", Integer.parseInt(this.aN));
            }
            jSONObject.put("ps_id", com.anythink.core.common.d.t.b().r());
            String g4 = com.anythink.core.common.d.t.b().g(this.aL);
            if (!TextUtils.isEmpty(g4)) {
                jSONObject.put("sessionid", g4);
            }
            int i6 = this.aW;
            if (i6 != -1) {
                jSONObject.put("traffic_group_id", i6);
            }
            if (this.aV == 1) {
                jSONObject.put("ofm_tid", this.aU);
                jSONObject.put("ofm_system", this.aT);
                jSONObject.put(com.anythink.core.common.m.e.f14622N, this.aV);
            }
            jSONObject.put("asid", this.aO);
            jSONObject.put(l.a.f17401T, this.f13766a);
            jSONObject.put(com.anythink.core.common.m.e.ai, this.f13767b);
            JSONObject jSONObject2 = this.f13769d;
            if (jSONObject2 != null) {
                jSONObject.put(l.a.aa, jSONObject2);
            }
            int i9 = this.f13770e;
            if (i9 > 0) {
                jSONObject.put("wf2_mode", i9);
            }
            JSONObject jSONObject3 = this.f13772g;
            if (jSONObject3 != null) {
                jSONObject.put("adap_c", jSONObject3);
            }
            if (!TextUtils.isEmpty(this.f13773h)) {
                jSONObject.put("x_c", new JSONArray(this.f13773h));
            }
            if (!TextUtils.isEmpty(aM())) {
                jSONObject.put("o_r", aM());
                return jSONObject;
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    public final void a(JSONObject jSONObject) {
        this.f13772g = jSONObject;
    }

    public final int aA() {
        return this.f13768c;
    }

    public final String aB() {
        return this.f13766a;
    }

    public final String aC() {
        return this.f13767b;
    }

    public final void aD() {
        this.aT = 1;
    }

    public final int aE() {
        return this.aU;
    }

    public final String aF() {
        return this.aS;
    }

    public final int aG() {
        return this.aW;
    }

    public final String aH() {
        return this.aO;
    }

    public final String aI() {
        return this.aL;
    }

    public final String aJ() {
        return this.aM;
    }

    public final String aK() {
        return this.aN;
    }

    public final String aL() {
        String str = this.aN;
        str.getClass();
        switch (str) {
            case "0":
                return com.anythink.expressad.foundation.g.a.f.f19119a;
            case "1":
                return "reward";
            case "2":
                return com.anythink.expressad.foundation.g.a.f.f19123e;
            case "3":
                return "inter";
            case "4":
                return com.anythink.expressad.foundation.g.a.f.f19124f;
            case "50":
                return "media_video";
            default:
                return "none";
        }
    }

    public final String aM() {
        return TextUtils.isEmpty(this.i) ? this.aM : this.i;
    }

    public final void al(int i) {
        this.f13770e = i;
    }

    public final void am(int i) {
        this.f13768c = i;
    }

    public final void an(int i) {
        this.aV = i;
    }

    public final void ao(int i) {
        this.aU = i;
    }

    public final void ap(int i) {
        this.aW = i;
    }

    public final JSONObject ax() {
        return this.f13772g;
    }

    public final Object ay() {
        return this.f13771f;
    }

    public final String az() {
        return this.f13773h;
    }

    public final void b(JSONObject jSONObject) {
        this.f13769d = jSONObject;
    }

    private int b() {
        return this.aV;
    }

    public final void a(Object obj) {
        this.f13771f = obj;
    }

    private JSONObject a() {
        return this.f13769d;
    }

    private void b(int i) {
        this.aR = i;
    }

    private void a(String str) {
        this.aP = str;
    }

    private void a(int i) {
        this.aQ = i;
    }
}

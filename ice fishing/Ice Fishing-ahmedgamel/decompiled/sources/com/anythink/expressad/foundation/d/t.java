package com.anythink.expressad.foundation.d;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.v;
import com.google.android.gms.internal.ads.Wv;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public static final int f19676A = 22;

    /* renamed from: B, reason: collision with root package name */
    public static final int f19677B = 21;

    /* renamed from: C, reason: collision with root package name */
    public static final int f19678C = 10;

    /* renamed from: D, reason: collision with root package name */
    public static final int f19679D = 11;

    /* renamed from: E, reason: collision with root package name */
    public static final int f19680E = 12;

    /* renamed from: F, reason: collision with root package name */
    public static final String f19681F = "1";

    /* renamed from: G, reason: collision with root package name */
    public static final String f19682G = "2";

    /* renamed from: H, reason: collision with root package name */
    public static final int f19683H = 1;

    /* renamed from: I, reason: collision with root package name */
    public static final int f19684I = 2;
    public static final int J = 3;

    /* renamed from: K, reason: collision with root package name */
    public static final int f19685K = 0;

    /* renamed from: L, reason: collision with root package name */
    public static final int f19686L = 1;

    /* renamed from: M, reason: collision with root package name */
    public static final int f19687M = 2;

    /* renamed from: N, reason: collision with root package name */
    public static final int f19688N = 3;

    /* renamed from: O, reason: collision with root package name */
    public static final int f19689O = 4;

    /* renamed from: P, reason: collision with root package name */
    public static final int f19690P = 5;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f19691Q = 6;

    /* renamed from: R, reason: collision with root package name */
    public static final int f19692R = 1;

    /* renamed from: S, reason: collision with root package name */
    public static final int f19693S = 2;

    /* renamed from: T, reason: collision with root package name */
    public static final int f19694T = 3;

    /* renamed from: U, reason: collision with root package name */
    public static final int f19695U = 4;

    /* renamed from: V, reason: collision with root package name */
    public static final String f19696V = "key";

    /* renamed from: W, reason: collision with root package name */
    public static final String f19697W = "network_type";

    /* renamed from: X, reason: collision with root package name */
    public static final String f19698X = "network_str";
    public static final String Y = "is_complete_view";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f19699Z = "watched_millis";

    /* renamed from: a, reason: collision with root package name */
    public static final String f19700a = "2000020";
    public static final String aA = "ad_type";
    public static final String aB = "resource_type";
    public static final String aC = "devid";
    public static final String aD = "creative";
    public static final String aE = "mraid_type";
    public static final String aF = "adspace_t";
    public static final String aG = "1";
    public static final String aH = "2";
    public static final String aI = "1";
    public static final String aJ = "2";
    public static final String aK = "3";
    public static final String aL = "4";
    public static final String aM = "5";
    public static final String aN = "6";
    public static final String aO = "7";
    public static final String aP = "8";
    public static int aQ = 1;
    public static int aR = 0;
    private static final String aS = "VideoReportData";
    public static final String aa = "video_length";
    public static final String ab = "offer_url";
    public static final String ac = "reason";
    public static final String ad = "case";
    public static final String ae = "time";
    public static final String af = "platform";
    public static final String ag = "duration";
    public static final String ah = "result";
    public static final String ai = "video_size";
    public static final String aj = "ctype";
    public static final String ak = "unit_id";
    public static final String al = "cid";
    public static final String am = "endscreen_type";
    public static final String an = "error";
    public static final String ao = "template_url";
    public static final String ap = "template";
    public static final String aq = "aback";
    public static final String ar = "event";
    public static final String as = "layout";
    public static final String at = "type";
    public static final String au = "endcard_url";
    public static final String av = "video_url";
    public static final String aw = "template_url";
    public static final String ax = "rid";
    public static final String ay = "rid_n";
    public static final String az = "image_url";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19701b = "2000021";

    /* renamed from: c, reason: collision with root package name */
    public static final String f19702c = "2000054";

    /* renamed from: d, reason: collision with root package name */
    public static final String f19703d = "2000022";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19704e = "2000023";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19705f = "2000024";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19706g = "2000025";

    /* renamed from: h, reason: collision with root package name */
    public static final String f19707h = "2000030";
    public static final String i = "2000037";

    /* renamed from: j, reason: collision with root package name */
    public static final String f19708j = "2000039";

    /* renamed from: k, reason: collision with root package name */
    public static final String f19709k = "2000043";

    /* renamed from: l, reason: collision with root package name */
    public static final String f19710l = "2000044";

    /* renamed from: m, reason: collision with root package name */
    public static final String f19711m = "2000045";

    /* renamed from: n, reason: collision with root package name */
    public static final String f19712n = "2000060";

    /* renamed from: o, reason: collision with root package name */
    public static final String f19713o = "2000059";

    /* renamed from: p, reason: collision with root package name */
    public static final String f19714p = "2000063";

    /* renamed from: q, reason: collision with root package name */
    public static final String f19715q = "2000061";

    /* renamed from: r, reason: collision with root package name */
    public static final String f19716r = "2000062";

    /* renamed from: s, reason: collision with root package name */
    public static final String f19717s = "2000073";

    /* renamed from: t, reason: collision with root package name */
    public static final String f19718t = "2000074";

    /* renamed from: u, reason: collision with root package name */
    public static final String f19719u = "2000075";

    /* renamed from: v, reason: collision with root package name */
    public static final String f19720v = "2000076";

    /* renamed from: w, reason: collision with root package name */
    public static final int f19721w = 14;

    /* renamed from: x, reason: collision with root package name */
    public static final int f19722x = 2;

    /* renamed from: y, reason: collision with root package name */
    public static final int f19723y = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f19724z = 20;
    private String aT;
    private String aU;
    private String aV;
    private String aW;
    private int aX;
    private String aY;
    private int aZ;
    private String bA;
    private int bB;
    private int bC;
    private int ba;
    private int bb;
    private String bc;
    private String bd;
    private int be;
    private int bf;
    private String bg;
    private long bh;
    private int bi;
    private int bj;
    private String bk;
    private String bl;
    private String bm;
    private String bn;
    private int bo;
    private String bp;
    private String bq;
    private String br;
    private String bs;
    private String bt;
    private String bu;
    private String bv;
    private String bw;
    private String bx;
    private String by;
    private String bz;

    private t(String str, int i4, int i6, int i9, int i10, String str2, String str3, int i11, String str4, int i12, String str5) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aX = i4;
        this.aY = str5;
        this.aZ = i6;
        this.ba = i9;
        this.bb = i10;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bR);
            }
        } catch (UnsupportedEncodingException e9) {
            e9.printStackTrace();
        }
        this.bd = str3;
        this.bf = i11;
        this.bg = str4;
        this.bh = i12;
    }

    private int A() {
        return this.ba;
    }

    private int B() {
        return this.bb;
    }

    private String C() {
        return this.bc;
    }

    private String D() {
        return TextUtils.isEmpty(this.bd) ? "" : this.bd;
    }

    private String E() {
        return this.bg;
    }

    private long F() {
        return this.bh;
    }

    private int G() {
        return this.aX;
    }

    private String H() {
        return this.aY;
    }

    private int I() {
        return this.aZ;
    }

    private int J() {
        return this.bf;
    }

    private int a() {
        return this.be;
    }

    private String b() {
        return this.aT;
    }

    private void c(int i4) {
        this.be = i4;
    }

    private String d() {
        return this.aV;
    }

    private String e() {
        return this.bz;
    }

    private String f() {
        return this.by;
    }

    private String g() {
        return this.bx;
    }

    private String h() {
        return this.bw;
    }

    private void i(String str) {
        this.aT = str;
    }

    private void j(String str) {
        this.aU = str;
    }

    private void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.aV = URLEncoder.encode(str);
    }

    private void l(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.bz = URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bR);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.by = URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bR);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.bx = URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bR);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void o(String str) {
        this.bw = str;
    }

    private void p(String str) {
        this.bA = str;
    }

    private void q(String str) {
        this.bs = str;
    }

    private void r(String str) {
        this.bq = str;
    }

    private void s(String str) {
        this.bt = str;
    }

    private void t(String str) {
        this.bu = str;
    }

    private void u(String str) {
        this.bv = str;
    }

    private String v() {
        return this.bl;
    }

    private String w() {
        return this.bm;
    }

    private String x() {
        return this.bn;
    }

    private int y() {
        return this.bo;
    }

    private String z() {
        return this.aW;
    }

    public final String toString() {
        return "RewardReportData [key=" + this.aW + ", networkType=" + this.aX + ", isCompleteView=" + this.aZ + ", watchedMillis=" + this.ba + ", videoLength=" + this.bb + ", offerUrl=" + this.bc + ", reason=" + this.bd + ", result=" + this.bf + ", duration=" + this.bg + ", videoSize=" + this.bh + "]";
    }

    private String c() {
        return this.aU;
    }

    private void d(int i4) {
        this.bj = i4;
    }

    private void e(int i4) {
        this.bi = i4;
    }

    private void f(int i4) {
        this.bC = i4;
    }

    private void g(int i4) {
        this.bo = i4;
    }

    private void h(int i4) {
        this.ba = i4;
    }

    private String i() {
        return this.bA;
    }

    private int j() {
        return this.bj;
    }

    private String o() {
        return this.bq;
    }

    private String p() {
        return this.bt;
    }

    private String q() {
        return this.bu;
    }

    private String r() {
        return this.bv;
    }

    private int s() {
        return this.bB;
    }

    private int t() {
        return this.bC;
    }

    private String u() {
        return this.bk;
    }

    private void v(String str) {
        this.bc = str;
    }

    private void w(String str) {
        this.bd = str;
    }

    private void x(String str) {
        this.bg = str;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.bp = URLEncoder.encode(str, com.anythink.expressad.foundation.g.a.bR);
        } catch (UnsupportedEncodingException e9) {
            e9.printStackTrace();
        }
    }

    public final void b(String str) {
        this.br = str;
    }

    private void i(int i4) {
        this.bb = i4;
    }

    private void j(int i4) {
        this.bh = i4;
    }

    private int k() {
        return this.bi;
    }

    public final void b(int i4) {
        this.aX = i4;
    }

    public final void c(String str) {
        this.bk = str;
    }

    public final void d(String str) {
        this.bl = str;
    }

    public final void e(String str) {
        this.bm = str;
    }

    public final void f(String str) {
        this.bn = str;
    }

    public final void g(String str) {
        this.aW = str;
    }

    public final void h(String str) {
        this.aY = str;
    }

    private static String b(t tVar) {
        if (tVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m9 = Wv.m(Wv.m(Wv.m(new StringBuilder("key="), tVar.aW, "&", stringBuffer, "cid="), tVar.bn, "&", stringBuffer, "unit_id="), tVar.bm, "&", stringBuffer, "network_type=");
        m9.append(tVar.aX);
        m9.append("&");
        stringBuffer.append(m9.toString());
        StringBuilder m10 = Wv.m(Wv.m(new StringBuilder("rid="), tVar.bk, "&", stringBuffer, "rid_n="), tVar.bl, "&", stringBuffer, "reason=");
        m10.append(tVar.D());
        stringBuffer.append(m10.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    private static String c(t tVar) {
        if (tVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m9 = Wv.m(Wv.m(Wv.m(new StringBuilder("key="), tVar.aW, "&", stringBuffer, "cid="), tVar.bn, "&", stringBuffer, "unit_id="), tVar.bm, "&", stringBuffer, "network_type=");
        m9.append(tVar.aX);
        m9.append("&");
        stringBuffer.append(m9.toString());
        stringBuffer.append("mraid_type=" + tVar.bB + "&");
        StringBuilder m10 = Wv.m(new StringBuilder("rid_n="), tVar.bl, "&", stringBuffer, "rid=");
        m10.append(tVar.bk);
        stringBuffer.append(m10.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    private static String d(t tVar) {
        if (tVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m9 = Wv.m(new StringBuilder("key="), tVar.aW, "&", stringBuffer, "result=");
        m9.append(tVar.bf);
        m9.append("&");
        stringBuffer.append(m9.toString());
        StringBuilder m10 = Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(new StringBuilder("duration="), tVar.bg, "&", stringBuffer, "cid="), tVar.bn, "&", stringBuffer, "reason="), tVar.D(), "&", stringBuffer, "ad_type="), tVar.bA, "&", stringBuffer, "unit_id="), tVar.bm, "&", stringBuffer, "devid="), tVar.aU, "&", stringBuffer, "mraid_type=");
        m10.append(tVar.bB);
        m10.append("&");
        stringBuffer.append(m10.toString());
        stringBuffer.append("network_type=" + tVar.aX + "&");
        if (!TextUtils.isEmpty(tVar.bx)) {
            stringBuffer.append("endcard_url=" + tVar.bx + "&");
        }
        if (!TextUtils.isEmpty(tVar.bw)) {
            stringBuffer.append("type=" + tVar.bw + "&");
        }
        if (tVar.aT != null) {
            stringBuffer.append("resource_type=" + tVar.aT + "&");
        }
        StringBuilder m11 = Wv.m(new StringBuilder("rid_n="), tVar.bl, "&", stringBuffer, "rid=");
        m11.append(tVar.bk);
        stringBuffer.append(m11.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    private static String e(t tVar) {
        if (tVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder m9 = Wv.m(new StringBuilder("key="), tVar.aW, "&", stringBuffer, "result=");
        m9.append(tVar.bf);
        m9.append("&");
        stringBuffer.append(m9.toString());
        StringBuilder m10 = Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(new StringBuilder("duration="), tVar.bg, "&", stringBuffer, "cid="), tVar.bn, "&", stringBuffer, "unit_id="), tVar.bm, "&", stringBuffer, "reason="), tVar.D(), "&", stringBuffer, "ad_type="), tVar.bA, "&", stringBuffer, "rid="), tVar.bk, "&", stringBuffer, "rid_n="), tVar.bl, "&", stringBuffer, "network_type=");
        m10.append(tVar.aX);
        m10.append("&");
        stringBuffer.append(m10.toString());
        stringBuffer.append("mraid_type=" + tVar.bB + "&");
        stringBuffer.append("devid=" + tVar.aU + "&");
        if (tVar.aT != null) {
            stringBuffer.append("resource_type=" + tVar.aT + "&");
        }
        if (!TextUtils.isEmpty(tVar.bx)) {
            stringBuffer.append("endcard_url=" + tVar.bx + "&");
        }
        stringBuffer.append("type=" + tVar.bw);
        return stringBuffer.toString();
    }

    private static String f(t tVar) {
        if (tVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder m9 = Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(new StringBuilder("key="), tVar.aW, "&", stringBuffer, "cid="), tVar.bn, "&", stringBuffer, "rid="), tVar.bk, "&", stringBuffer, "rid_n="), tVar.bl, "&", stringBuffer, "unit_id="), tVar.bm, "&", stringBuffer, "network_type=");
            m9.append(tVar.aX);
            m9.append("&");
            stringBuffer.append(m9.toString());
            stringBuffer.append("mraid_type=" + tVar.bB + "&");
            stringBuffer.append("platform=1");
            return stringBuffer.toString();
        }
        return "";
    }

    private static String g(t tVar) {
        if (tVar != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuilder m9 = Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(new StringBuilder("key="), tVar.aW, "&", stringBuffer, "cid="), tVar.bn, "&", stringBuffer, "rid="), tVar.bk, "&", stringBuffer, "rid_n="), tVar.bl, "&", stringBuffer, "unit_id="), tVar.bm, "&", stringBuffer, "reason="), tVar.D(), "&", stringBuffer, "case=");
            m9.append(tVar.be);
            m9.append("&");
            stringBuffer.append(m9.toString());
            stringBuffer.append("network_type=" + tVar.aX);
            return stringBuffer.toString();
        }
        return "";
    }

    private void k(int i4) {
        this.aZ = i4;
    }

    private String l() {
        return this.bp;
    }

    private String m() {
        return this.br;
    }

    private String n() {
        return this.bs;
    }

    private void l(int i4) {
        this.bf = i4;
    }

    public final void a(int i4) {
        this.bB = i4;
    }

    private static String a(List<t> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (t tVar : list) {
            StringBuilder m9 = Wv.m(new StringBuilder("key="), tVar.aW, "&", stringBuffer, "result=");
            m9.append(tVar.bf);
            m9.append("&");
            stringBuffer.append(m9.toString());
            StringBuilder m10 = Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(Wv.m(new StringBuilder("duration="), tVar.bg, "&", stringBuffer, "endcard_url="), tVar.bx, "&", stringBuffer, "cid="), tVar.bn, "&", stringBuffer, "unit_id="), tVar.bm, "&", stringBuffer, "reason="), tVar.D(), "&", stringBuffer, "ad_type="), tVar.bA, "&", stringBuffer, "rid="), tVar.bk, "&", stringBuffer, "rid_n="), tVar.bl, "&", stringBuffer, "type="), tVar.bw, "&", stringBuffer, "adspace_t=");
            m10.append(tVar.bC);
            stringBuffer.append(m10.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public t() {
        this.bj = 0;
        this.bB = 0;
    }

    private t(String str, int i4, int i6, String str2, int i9, int i10, String str3) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aX = i4;
        this.aY = str3;
        this.bb = i6;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bR);
            } catch (UnsupportedEncodingException e9) {
                e9.printStackTrace();
            }
        }
        this.bi = i9;
        this.bj = i10;
    }

    private t(String str, int i4, int i6, int i9, int i10, String str2, int i11, String str3) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aY = str3;
        this.aX = i4;
        this.aZ = i6;
        this.ba = i9;
        this.bb = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bR);
            } catch (UnsupportedEncodingException e9) {
                e9.printStackTrace();
            }
        }
        this.bj = i11;
    }

    private t(String str, int i4, String str2, String str3, String str4) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aY = str4;
        this.aX = i4;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bR);
            } catch (UnsupportedEncodingException e9) {
                e9.printStackTrace();
            }
        }
        this.bd = str3;
    }

    private t(String str, int i4, int i6, String str2, int i9, String str3, int i10, String str4) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.aX = i4;
        this.aY = str4;
        this.bb = i6;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.bc = URLEncoder.encode(str2, com.anythink.expressad.foundation.g.a.bR);
            } catch (UnsupportedEncodingException e9) {
                e9.printStackTrace();
            }
        }
        this.bf = i9;
        this.bg = str3;
        this.bh = i10;
    }

    private static String b(List<t> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<t> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().bv);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private t(Context context, d dVar, int i4, String str, long j6, int i6) {
        this.bj = 0;
        this.bB = 0;
        if (i6 == 1) {
            this.aW = f19703d;
        } else if (i6 == 287 || i6 == 94) {
            this.aW = f19703d;
        } else if (i6 == 95) {
            this.aW = f19706g;
        }
        int b9 = com.anythink.expressad.foundation.h.n.b();
        this.aX = b9;
        this.aY = com.anythink.expressad.foundation.h.n.a(context, b9);
        this.bb = dVar.bq();
        this.bk = dVar.aa();
        this.bl = dVar.ac();
        if (!TextUtils.isEmpty(this.bc)) {
            try {
                this.bc = URLEncoder.encode(dVar.aj() == null ? dVar.af() : dVar.aj(), com.anythink.expressad.foundation.g.a.bR);
            } catch (UnsupportedEncodingException e9) {
                e9.printStackTrace();
            }
        }
        this.bf = i4;
        this.bg = str;
        this.bh = j6 == 0 ? dVar.U() : j6;
    }

    private t(String str, String str2, String str3, String str4, int i4, String str5, int i6, String str6) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bk = str2;
        this.bl = str3;
        this.bm = str4;
        this.aX = i4;
        this.aY = str6;
        this.bn = str5;
        this.bo = i6;
    }

    public t(String str, String str2, String str3, String str4, String str5, String str6, int i4, String str7) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bt = str2;
        this.bq = str3;
        this.bu = str4;
        this.bm = str5;
        this.bn = str6;
        this.aX = i4;
        this.aY = str7;
    }

    public static String a(t tVar) {
        String str;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=" + tVar.aW + "&");
            stringBuffer.append("error=" + v.c(tVar.br) + "&");
            stringBuffer.append("template_url=" + v.c(tVar.bp) + "&");
            stringBuffer.append("unit_id=" + v.c(tVar.bm) + "&");
            stringBuffer.append("cid=" + v.c(tVar.bn) + "&");
            String str2 = "";
            if (TextUtils.isEmpty(tVar.aY)) {
                str = "";
            } else {
                str = "network_str=" + tVar.aY + "&";
            }
            stringBuffer.append(str);
            if (!TextUtils.isEmpty(tVar.aY)) {
                str2 = "network_type=" + tVar.aX;
            }
            stringBuffer.append(str2);
            return stringBuffer.toString();
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private t(String str) {
        this.bj = 0;
        this.bB = 0;
        this.bv = str;
    }

    private t(String str, int i4, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bf = i4;
        this.bg = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.bx = URLEncoder.encode(str3, com.anythink.expressad.foundation.g.a.bR);
            }
        } catch (UnsupportedEncodingException e9) {
            e9.printStackTrace();
        }
        this.bn = str4;
        this.bm = str5;
        this.bd = str6;
        this.bw = str7;
        if (Integer.valueOf(str2).intValue() > com.anythink.expressad.foundation.g.a.cu) {
            this.bf = 2;
        }
    }

    public t(String str, String str2, String str3, String str4, String str5, int i4) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bn = str2;
        this.bk = str3;
        this.bl = str4;
        this.bm = str5;
        this.aX = i4;
    }

    public t(String str, String str2, String str3, String str4, String str5, int i4, int i6, String str6) {
        this.bj = 0;
        this.bB = 0;
        this.aW = str;
        this.bn = str2;
        this.bk = str3;
        this.bl = str4;
        this.bm = str5;
        this.aX = i4;
        this.bd = str6;
        this.be = i6;
    }
}

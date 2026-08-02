package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Oj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2730Oj {

    /* renamed from: a, reason: collision with root package name */
    public final C3661np f27415a;

    /* renamed from: b, reason: collision with root package name */
    public final C3075cu f27416b;

    /* renamed from: c, reason: collision with root package name */
    public final Lu f27417c;

    /* renamed from: d, reason: collision with root package name */
    public final S0.c f27418d;

    /* renamed from: e, reason: collision with root package name */
    public final C2965ar f27419e;

    /* renamed from: f, reason: collision with root package name */
    public final C3549ll f27420f;

    /* renamed from: g, reason: collision with root package name */
    public Yt f27421g;

    /* renamed from: h, reason: collision with root package name */
    public final C4297ze f27422h;
    public final G3.j i;

    /* renamed from: j, reason: collision with root package name */
    public final RD f27423j;

    /* renamed from: k, reason: collision with root package name */
    public final C4146wp f27424k;

    /* renamed from: l, reason: collision with root package name */
    public final C3608mq f27425l;

    public C2730Oj(C3661np c3661np, C3075cu c3075cu, Lu lu, S0.c cVar, C2965ar c2965ar, C3549ll c3549ll, Yt yt, C4297ze c4297ze, G3.j jVar, RD rd, C4146wp c4146wp, C3608mq c3608mq) {
        this.f27415a = c3661np;
        this.f27416b = c3075cu;
        this.f27417c = lu;
        this.f27418d = cVar;
        this.f27419e = c2965ar;
        this.f27420f = c3549ll;
        this.f27421g = yt;
        this.f27422h = c4297ze;
        this.i = jVar;
        this.f27423j = rd;
        this.f27424k = c4146wp;
        this.f27425l = c3608mq;
    }

    public final Iu a(P3.a aVar) {
        if (this.f27421g != null) {
            Lu lu = this.f27417c;
            Ju ju = Ju.SERVER_TRANSACTION;
            Objects.requireNonNull(lu);
            return new T8(lu, ju, null, Lu.f26979d, Collections.EMPTY_LIST, QC.c(this.f27421g)).s();
        }
        T8 t82 = C4906k.f40186C.f40197j;
        t82.getClass();
        C3324ha c3324ha = AbstractC3592ma.f33036g5;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            synchronized (t82.f28480v) {
                try {
                    t82.w();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) t82.f28478n;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    t82.f28478n = AbstractC3436jg.f32058d.schedule((RunnableC3134e) t82.f28479u, ((Long) rVar.f40509c.a(AbstractC3592ma.f33045h5)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f27417c.a(aVar, Ju.SERVER_TRANSACTION).j(new C4187xc(4, this.f27424k)).s();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0271 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0209 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:31:0x0091, B:33:0x00b0, B:36:0x00b8, B:38:0x00c5, B:40:0x00dd, B:41:0x0109, B:43:0x0114, B:45:0x011c, B:46:0x0123, B:50:0x012c, B:53:0x0164, B:56:0x0140, B:59:0x014f, B:61:0x0169, B:64:0x00f5, B:66:0x017d, B:70:0x019c, B:74:0x01a4, B:76:0x01c7, B:78:0x01dd, B:80:0x01ff, B:81:0x0216, B:84:0x022a, B:90:0x023d, B:91:0x023e, B:92:0x024b, B:95:0x0250, B:96:0x0251, B:102:0x0267, B:104:0x0277, B:109:0x0269, B:112:0x026d, B:116:0x026f, B:117:0x0270, B:120:0x0276, B:124:0x028a, B:125:0x0209, B:126:0x01f0, B:129:0x01b3, B:132:0x018b, B:133:0x0190, B:119:0x0271, B:98:0x0252, B:100:0x025c, B:86:0x022b, B:88:0x0235), top: B:30:0x0091, inners: #0, #4, #5, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:31:0x0091, B:33:0x00b0, B:36:0x00b8, B:38:0x00c5, B:40:0x00dd, B:41:0x0109, B:43:0x0114, B:45:0x011c, B:46:0x0123, B:50:0x012c, B:53:0x0164, B:56:0x0140, B:59:0x014f, B:61:0x0169, B:64:0x00f5, B:66:0x017d, B:70:0x019c, B:74:0x01a4, B:76:0x01c7, B:78:0x01dd, B:80:0x01ff, B:81:0x0216, B:84:0x022a, B:90:0x023d, B:91:0x023e, B:92:0x024b, B:95:0x0250, B:96:0x0251, B:102:0x0267, B:104:0x0277, B:109:0x0269, B:112:0x026d, B:116:0x026f, B:117:0x0270, B:120:0x0276, B:124:0x028a, B:125:0x0209, B:126:0x01f0, B:129:0x01b3, B:132:0x018b, B:133:0x0190, B:119:0x0271, B:98:0x0252, B:100:0x025c, B:86:0x022b, B:88:0x0235), top: B:30:0x0091, inners: #0, #4, #5, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Iu b() {
        AbstractC3310hD k9;
        String str;
        int i;
        String str2;
        String str3;
        String string;
        C3075cu c3075cu = this.f27416b;
        if (!c3075cu.f30410v) {
            s2.c1 c1Var = c3075cu.f30393d;
            if (c1Var.f40411Q != null || c1Var.f40406L != null) {
                Lu lu = this.f27417c;
                Ju ju = Ju.PRELOADED_LOADER;
                Objects.requireNonNull(lu);
                C3661np c3661np = this.f27415a;
                C3324ha c3324ha = AbstractC3592ma.L2;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    c3661np.f33571o = c3661np.f33561d.f30408t;
                    com.IceFishing.LiveIceFishing.k.v(C4906k.f40186C.f40198k, c3661np.i, "scar-preloader-ready");
                }
                String str4 = c3661np.f33561d.f30393d.f40411Q;
                if (!TextUtils.isEmpty(str4)) {
                    String d9 = C3661np.d(str4);
                    C3324ha c3324ha2 = AbstractC3592ma.f32937V7;
                    if (((Boolean) rVar.f40509c.a(c3324ha2)).booleanValue() && d9.isEmpty()) {
                        int lastIndexOf = str4.lastIndexOf("&request_id=");
                        d9 = lastIndexOf != -1 ? str4.substring(lastIndexOf + 12) : "";
                    }
                    String str5 = d9;
                    if (TextUtils.isEmpty(str5)) {
                        k9 = QC.k(new Zq(15, "Invalid ad string."));
                    } else {
                        synchronized (c3661np.f33568l) {
                            try {
                                E2.J j6 = (E2.J) c3661np.f33558a.f31631X.f();
                                C3069co c3069co = c3661np.i;
                                String a9 = j6.a(str5, c3069co);
                                if (((Boolean) rVar.f40509c.a(c3324ha2)).booleanValue() && !TextUtils.isEmpty(a9)) {
                                    try {
                                        JSONObject optJSONObject = new JSONObject(a9).optJSONObject("extras");
                                        if (optJSONObject != null) {
                                            if ((((Boolean) rVar.f40509c.a(AbstractC3592ma.f32954X7)).booleanValue() ? Arrays.asList(((String) rVar.f40509c.a(AbstractC3592ma.Y7)).split(",")) : Arrays.asList(((String) rVar.f40509c.a(AbstractC3592ma.f32945W7)).split(","))).contains(t8.g.s(optJSONObject.optString("query_info_type", "")))) {
                                                int lastIndexOf2 = str4.lastIndexOf("&");
                                                String substring = lastIndexOf2 != -1 ? str4.substring(0, lastIndexOf2) : null;
                                                if (!TextUtils.isEmpty(substring)) {
                                                    try {
                                                        byte[] decode = Base64.decode(substring, 11);
                                                        byte[] bytes = str5.getBytes(StandardCharsets.UTF_8);
                                                        if (!TextUtils.isEmpty(a9)) {
                                                            try {
                                                                string = new JSONObject(a9).getString("arek");
                                                            } catch (JSONException e9) {
                                                                w2.z.k("Failed to get key from QueryJSONMap".concat(e9.toString()));
                                                                C4906k.f40186C.f40196h.d("CryptoUtils.getKeyFromQueryJsonMap", e9);
                                                            }
                                                            str4 = C3396iu.a(decode, bytes, string, c3069co);
                                                        }
                                                        string = null;
                                                        str4 = C3396iu.a(decode, bytes, string, c3069co);
                                                    } catch (IllegalArgumentException e10) {
                                                        w2.z.k("Failed to decode the adResponse. ".concat(e10.toString()));
                                                        C4906k.f40186C.f40196h.d("PreloadedLoader.decryptAdResponseIfNecessary", e10);
                                                    }
                                                }
                                            }
                                        }
                                    } catch (JSONException unused) {
                                    }
                                }
                                if (TextUtils.isEmpty(str4)) {
                                    str = "";
                                } else {
                                    try {
                                        str = new JSONObject(str4).optString("render_id", "");
                                    } catch (JSONException unused2) {
                                        str = "";
                                    }
                                }
                                String str6 = str;
                                if (!TextUtils.isEmpty(str6)) {
                                    String str7 = "";
                                    try {
                                        str7 = new String(Base64.decode(str6, 0), StandardCharsets.UTF_8);
                                    } catch (IllegalArgumentException e11) {
                                        w2.z.k("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str6)));
                                        C4906k.f40186C.f40196h.d("PreloadedLoader.decodeRenderId", e11);
                                    }
                                    List q8 = com.bumptech.glide.manager.o.d(new PA(':')).q(str7);
                                    if (q8.size() == 2) {
                                        str2 = (String) q8.get(0);
                                        i = Integer.parseInt((String) q8.get(1));
                                        Pair pair = str2 == null ? new Pair(str2, Integer.valueOf(i)) : new Pair("", 0);
                                        str3 = (String) pair.first;
                                        int intValue = ((Integer) pair.second).intValue();
                                        if (!TextUtils.isEmpty(str3) && intValue > 0) {
                                            synchronized (j6) {
                                                try {
                                                    E2.H h3 = (E2.H) j6.f750e.get(str5);
                                                    if (h3 != null) {
                                                        if (h3.f740c.contains(str3)) {
                                                            k9 = QC.k(new Zq(10, "The ad has already been shown."));
                                                        }
                                                    }
                                                    synchronized (j6) {
                                                        E2.H h9 = (E2.H) j6.f750e.get(str5);
                                                        if (h9 != null) {
                                                            HashSet hashSet = h9.f740c;
                                                            hashSet.add(str3);
                                                            if (hashSet.size() < intValue) {
                                                            }
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(a9)) {
                                                        k9 = c3661np.a(str4, c3661np.c(a9));
                                                    }
                                                } finally {
                                                }
                                            }
                                        }
                                        synchronized (j6) {
                                            j6.f750e.remove(str5);
                                        }
                                        if (!TextUtils.isEmpty(a9)) {
                                        }
                                    } else {
                                        w2.z.k("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str6)));
                                    }
                                }
                                i = 0;
                                str2 = null;
                                if (str2 == null) {
                                }
                                str3 = (String) pair.first;
                                int intValue2 = ((Integer) pair.second).intValue();
                                if (!TextUtils.isEmpty(str3)) {
                                    synchronized (j6) {
                                    }
                                }
                                synchronized (j6) {
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return new T8(lu, ju, null, Lu.f26979d, Collections.EMPTY_LIST, k9).s();
                }
                s2.O o4 = c3661np.f33561d.f30393d.f40406L;
                if (o4 != null) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32866N7)).booleanValue()) {
                        String str8 = o4.f40369n;
                        String str9 = o4.f40370u;
                        String d10 = C3661np.d(str8);
                        String d11 = C3661np.d(str9);
                        if (TextUtils.isEmpty(d11) || !d10.equals(d11)) {
                            c3661np.i.f30367a.put("ridmm", "true");
                        } else {
                            E2.J j9 = (E2.J) c3661np.f33558a.f31631X.f();
                            synchronized (j9) {
                                j9.f750e.remove(d10);
                            }
                            c3661np.i.f30367a.put("request_id", d10);
                        }
                    }
                    k9 = c3661np.a(o4.f40369n, c3661np.c(o4.f40370u));
                    return new T8(lu, ju, null, Lu.f26979d, Collections.EMPTY_LIST, k9).s();
                }
                k9 = QC.k(new Zq(14, "Mismatch request IDs."));
                return new T8(lu, ju, null, Lu.f26979d, Collections.EMPTY_LIST, k9).s();
            }
        }
        return a(this.i.d());
    }

    public final Iu c(P3.a aVar) {
        T8 j6 = this.f27417c.a(aVar, Ju.RENDERER).g(new Qx(17, this)).j(this.f27419e);
        C3324ha c3324ha = AbstractC3592ma.z6;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            long intValue = ((Integer) rVar.f40509c.a(AbstractC3592ma.f32756A6)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            j6 = j6.r(intValue);
        }
        return j6.s();
    }
}

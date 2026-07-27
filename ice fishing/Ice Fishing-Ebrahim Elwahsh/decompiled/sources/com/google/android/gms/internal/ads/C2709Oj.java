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

/* renamed from: com.google.android.gms.internal.ads.Oj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2709Oj {

    /* renamed from: a, reason: collision with root package name */
    public final C3813qp f26737a;

    /* renamed from: b, reason: collision with root package name */
    public final C3226fu f26738b;

    /* renamed from: c, reason: collision with root package name */
    public final Ou f26739c;

    /* renamed from: d, reason: collision with root package name */
    public final C4237yi f26740d;

    /* renamed from: e, reason: collision with root package name */
    public final C3113dr f26741e;

    /* renamed from: f, reason: collision with root package name */
    public final C3485kl f26742f;

    /* renamed from: g, reason: collision with root package name */
    public C2953au f26743g;

    /* renamed from: h, reason: collision with root package name */
    public final C4017ue f26744h;
    public final C3.j i;

    /* renamed from: j, reason: collision with root package name */
    public final SD f26745j;

    /* renamed from: k, reason: collision with root package name */
    public final C4298zp f26746k;

    /* renamed from: l, reason: collision with root package name */
    public final C3706oq f26747l;

    public C2709Oj(C3813qp c3813qp, C3226fu c3226fu, Ou ou, C4237yi c4237yi, C3113dr c3113dr, C3485kl c3485kl, C2953au c2953au, C4017ue c4017ue, C3.j jVar, SD sd, C4298zp c4298zp, C3706oq c3706oq) {
        this.f26737a = c3813qp;
        this.f26738b = c3226fu;
        this.f26739c = ou;
        this.f26740d = c4237yi;
        this.f26741e = c3113dr;
        this.f26742f = c3485kl;
        this.f26743g = c2953au;
        this.f26744h = c4017ue;
        this.i = jVar;
        this.f26745j = sd;
        this.f26746k = c4298zp;
        this.f26747l = c3706oq;
    }

    public final Ku a(J3.a aVar) {
        if (this.f26743g != null) {
            Ou ou = this.f26739c;
            Lu lu = Lu.SERVER_TRANSACTION;
            Objects.requireNonNull(ou);
            return new Q8(ou, lu, null, Ou.f26776d, Collections.EMPTY_LIST, C3686oN.c(this.f26743g)).r();
        }
        Q8 q82 = p2.j.f39798C.f39809j;
        q82.getClass();
        C3151ea c3151ea = AbstractC3368ia.f31674g5;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            synchronized (q82.f27121v) {
                try {
                    q82.w();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) q82.f27119n;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    q82.f27119n = AbstractC3212fg.f30741d.schedule((RunnableC3068d) q82.f27120u, ((Long) rVar.f40119c.a(AbstractC3368ia.f31684h5)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f26739c.a(aVar, Lu.SERVER_TRANSACTION).h(new C3907sc(4, this.f26746k)).r();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0271 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0209 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:31:0x0091, B:33:0x00b0, B:36:0x00b8, B:38:0x00c5, B:40:0x00dd, B:41:0x0109, B:43:0x0114, B:45:0x011c, B:46:0x0123, B:50:0x012c, B:53:0x0164, B:56:0x0140, B:59:0x014f, B:61:0x0169, B:64:0x00f5, B:66:0x017d, B:70:0x019c, B:74:0x01a4, B:76:0x01c7, B:78:0x01dd, B:80:0x01ff, B:81:0x0216, B:84:0x022a, B:90:0x023d, B:91:0x023e, B:92:0x024b, B:95:0x0250, B:96:0x0251, B:102:0x0267, B:104:0x0277, B:109:0x0269, B:112:0x026d, B:116:0x026f, B:117:0x0270, B:120:0x0276, B:124:0x028a, B:125:0x0209, B:126:0x01f0, B:129:0x01b3, B:132:0x018b, B:133:0x0190, B:119:0x0271, B:98:0x0252, B:100:0x025c, B:86:0x022b, B:88:0x0235), top: B:30:0x0091, inners: #0, #4, #5, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:31:0x0091, B:33:0x00b0, B:36:0x00b8, B:38:0x00c5, B:40:0x00dd, B:41:0x0109, B:43:0x0114, B:45:0x011c, B:46:0x0123, B:50:0x012c, B:53:0x0164, B:56:0x0140, B:59:0x014f, B:61:0x0169, B:64:0x00f5, B:66:0x017d, B:70:0x019c, B:74:0x01a4, B:76:0x01c7, B:78:0x01dd, B:80:0x01ff, B:81:0x0216, B:84:0x022a, B:90:0x023d, B:91:0x023e, B:92:0x024b, B:95:0x0250, B:96:0x0251, B:102:0x0267, B:104:0x0277, B:109:0x0269, B:112:0x026d, B:116:0x026f, B:117:0x0270, B:120:0x0276, B:124:0x028a, B:125:0x0209, B:126:0x01f0, B:129:0x01b3, B:132:0x018b, B:133:0x0190, B:119:0x0271, B:98:0x0252, B:100:0x025c, B:86:0x022b, B:88:0x0235), top: B:30:0x0091, inners: #0, #4, #5, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Ku b() {
        AbstractC3354iD l9;
        String str;
        int i;
        String str2;
        String str3;
        String string;
        C3226fu c3226fu = this.f26738b;
        if (!c3226fu.f30918v) {
            q2.d1 d1Var = c3226fu.f30901d;
            if (d1Var.f40023Q != null || d1Var.f40018L != null) {
                Ou ou = this.f26739c;
                Lu lu = Lu.PRELOADED_LOADER;
                Objects.requireNonNull(ou);
                C3813qp c3813qp = this.f26737a;
                C3151ea c3151ea = AbstractC3368ia.f31485L2;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    c3813qp.f33894o = c3813qp.f33884d.f30916t;
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3813qp.i, "scar-preloader-ready");
                }
                String str4 = c3813qp.f33884d.f30901d.f40023Q;
                if (!TextUtils.isEmpty(str4)) {
                    String d2 = C3813qp.d(str4);
                    C3151ea c3151ea2 = AbstractC3368ia.f31577V7;
                    if (((Boolean) rVar.f40119c.a(c3151ea2)).booleanValue() && d2.isEmpty()) {
                        int lastIndexOf = str4.lastIndexOf("&request_id=");
                        d2 = lastIndexOf != -1 ? str4.substring(lastIndexOf + 12) : "";
                    }
                    String str5 = d2;
                    if (TextUtils.isEmpty(str5)) {
                        l9 = C3686oN.l(new C3059cr(15, "Invalid ad string."));
                    } else {
                        synchronized (c3813qp.f33891l) {
                            try {
                                B2.K k6 = (B2.K) c3813qp.f33881a.f30790W.d();
                                C3002bo c3002bo = c3813qp.i;
                                String a9 = k6.a(str5, c3002bo);
                                if (((Boolean) rVar.f40119c.a(c3151ea2)).booleanValue() && !TextUtils.isEmpty(a9)) {
                                    try {
                                        JSONObject optJSONObject = new JSONObject(a9).optJSONObject("extras");
                                        if (optJSONObject != null) {
                                            if ((((Boolean) rVar.f40119c.a(AbstractC3368ia.f31595X7)).booleanValue() ? Arrays.asList(((String) rVar.f40119c.a(AbstractC3368ia.f31603Y7)).split(",")) : Arrays.asList(((String) rVar.f40119c.a(AbstractC3368ia.f31586W7)).split(","))).contains(K3.b.I(optJSONObject.optString("query_info_type", "")))) {
                                                int lastIndexOf2 = str4.lastIndexOf("&");
                                                String substring = lastIndexOf2 != -1 ? str4.substring(0, lastIndexOf2) : null;
                                                if (!TextUtils.isEmpty(substring)) {
                                                    try {
                                                        byte[] decode = Base64.decode(substring, 11);
                                                        byte[] bytes = str5.getBytes(StandardCharsets.UTF_8);
                                                        if (!TextUtils.isEmpty(a9)) {
                                                            try {
                                                                string = new JSONObject(a9).getString("arek");
                                                            } catch (JSONException e6) {
                                                                t2.C.k("Failed to get key from QueryJSONMap".concat(e6.toString()));
                                                                p2.j.f39798C.f39808h.d("CryptoUtils.getKeyFromQueryJsonMap", e6);
                                                            }
                                                            str4 = C3440ju.a(decode, bytes, string, c3002bo);
                                                        }
                                                        string = null;
                                                        str4 = C3440ju.a(decode, bytes, string, c3002bo);
                                                    } catch (IllegalArgumentException e9) {
                                                        t2.C.k("Failed to decode the adResponse. ".concat(e9.toString()));
                                                        p2.j.f39798C.f39808h.d("PreloadedLoader.decryptAdResponseIfNecessary", e9);
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
                                    } catch (IllegalArgumentException e10) {
                                        t2.C.k("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str6)));
                                        p2.j.f39798C.f39808h.d("PreloadedLoader.decodeRenderId", e10);
                                    }
                                    List r9 = com.bumptech.glide.manager.o.d(new TA(':')).r(str7);
                                    if (r9.size() == 2) {
                                        str2 = (String) r9.get(0);
                                        i = Integer.parseInt((String) r9.get(1));
                                        Pair pair = str2 == null ? new Pair(str2, Integer.valueOf(i)) : new Pair("", 0);
                                        str3 = (String) pair.first;
                                        int intValue = ((Integer) pair.second).intValue();
                                        if (!TextUtils.isEmpty(str3) && intValue > 0) {
                                            synchronized (k6) {
                                                try {
                                                    B2.I i4 = (B2.I) k6.f185e.get(str5);
                                                    if (i4 != null) {
                                                        if (i4.f175c.contains(str3)) {
                                                            l9 = C3686oN.l(new C3059cr(10, "The ad has already been shown."));
                                                        }
                                                    }
                                                    synchronized (k6) {
                                                        B2.I i9 = (B2.I) k6.f185e.get(str5);
                                                        if (i9 != null) {
                                                            HashSet hashSet = i9.f175c;
                                                            hashSet.add(str3);
                                                            if (hashSet.size() < intValue) {
                                                            }
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(a9)) {
                                                        l9 = c3813qp.a(str4, c3813qp.c(a9));
                                                    }
                                                } finally {
                                                }
                                            }
                                        }
                                        synchronized (k6) {
                                            k6.f185e.remove(str5);
                                        }
                                        if (!TextUtils.isEmpty(a9)) {
                                        }
                                    } else {
                                        t2.C.k("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str6)));
                                    }
                                }
                                i = 0;
                                str2 = null;
                                if (str2 == null) {
                                }
                                str3 = (String) pair.first;
                                int intValue2 = ((Integer) pair.second).intValue();
                                if (!TextUtils.isEmpty(str3)) {
                                    synchronized (k6) {
                                    }
                                }
                                synchronized (k6) {
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return new Q8(ou, lu, null, Ou.f26776d, Collections.EMPTY_LIST, l9).r();
                }
                q2.O o9 = c3813qp.f33884d.f30901d.f40018L;
                if (o9 != null) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31508N7)).booleanValue()) {
                        String str8 = o9.f39977n;
                        String str9 = o9.f39978u;
                        String d3 = C3813qp.d(str8);
                        String d9 = C3813qp.d(str9);
                        if (TextUtils.isEmpty(d9) || !d3.equals(d9)) {
                            c3813qp.i.f29588a.put("ridmm", "true");
                        } else {
                            B2.K k9 = (B2.K) c3813qp.f33881a.f30790W.d();
                            synchronized (k9) {
                                k9.f185e.remove(d3);
                            }
                            c3813qp.i.f29588a.put("request_id", d3);
                        }
                    }
                    l9 = c3813qp.a(o9.f39977n, c3813qp.c(o9.f39978u));
                    return new Q8(ou, lu, null, Ou.f26776d, Collections.EMPTY_LIST, l9).r();
                }
                l9 = C3686oN.l(new C3059cr(14, "Mismatch request IDs."));
                return new Q8(ou, lu, null, Ou.f26776d, Collections.EMPTY_LIST, l9).r();
            }
        }
        return a(this.i.d());
    }

    public final Ku c(J3.a aVar) {
        Q8 h9 = this.f26739c.a(aVar, Lu.RENDERER).f(new Rx(17, this)).h(this.f26741e);
        C3151ea c3151ea = AbstractC3368ia.f31849z6;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            long intValue = ((Integer) rVar.f40119c.a(AbstractC3368ia.f31398A6)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            h9 = h9.q(intValue);
        }
        return h9.r();
    }
}

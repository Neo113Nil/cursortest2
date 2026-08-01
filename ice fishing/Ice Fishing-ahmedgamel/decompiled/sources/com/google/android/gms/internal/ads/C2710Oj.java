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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Oj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2710Oj {

    /* renamed from: a, reason: collision with root package name */
    public final C3638np f26639a;

    /* renamed from: b, reason: collision with root package name */
    public final C3052cu f26640b;

    /* renamed from: c, reason: collision with root package name */
    public final Lu f26641c;

    /* renamed from: d, reason: collision with root package name */
    public final S0.c f26642d;

    /* renamed from: e, reason: collision with root package name */
    public final C2942ar f26643e;

    /* renamed from: f, reason: collision with root package name */
    public final C3526ll f26644f;

    /* renamed from: g, reason: collision with root package name */
    public Yt f26645g;

    /* renamed from: h, reason: collision with root package name */
    public final C4274ze f26646h;
    public final E3.j i;

    /* renamed from: j, reason: collision with root package name */
    public final RD f26647j;

    /* renamed from: k, reason: collision with root package name */
    public final C4123wp f26648k;

    /* renamed from: l, reason: collision with root package name */
    public final C3585mq f26649l;

    public C2710Oj(C3638np c3638np, C3052cu c3052cu, Lu lu, S0.c cVar, C2942ar c2942ar, C3526ll c3526ll, Yt yt, C4274ze c4274ze, E3.j jVar, RD rd, C4123wp c4123wp, C3585mq c3585mq) {
        this.f26639a = c3638np;
        this.f26640b = c3052cu;
        this.f26641c = lu;
        this.f26642d = cVar;
        this.f26643e = c2942ar;
        this.f26644f = c3526ll;
        this.f26645g = yt;
        this.f26646h = c4274ze;
        this.i = jVar;
        this.f26647j = rd;
        this.f26648k = c4123wp;
        this.f26649l = c3585mq;
    }

    public final Iu a(N3.a aVar) {
        if (this.f26645g != null) {
            Lu lu = this.f26641c;
            Ju ju = Ju.SERVER_TRANSACTION;
            Objects.requireNonNull(lu);
            return new T8(lu, ju, null, Lu.f26188d, Collections.EMPTY_LIST, QC.c(this.f26645g)).s();
        }
        T8 t82 = C4835j.f39733C.f39744j;
        t82.getClass();
        C3301ha c3301ha = AbstractC3569ma.f32255g5;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            synchronized (t82.f27697v) {
                try {
                    t82.w();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) t82.f27695n;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    t82.f27695n = AbstractC3413jg.f31271d.schedule((RunnableC3111e) t82.f27696u, ((Long) rVar.f40210c.a(AbstractC3569ma.f32265h5)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f26641c.a(aVar, Ju.SERVER_TRANSACTION).j(new C4164xc(4, this.f26648k)).s();
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
        AbstractC3287hD k9;
        String str;
        int i;
        String str2;
        String str3;
        String string;
        C3052cu c3052cu = this.f26640b;
        if (!c3052cu.f29640v) {
            q2.c1 c1Var = c3052cu.f29623d;
            if (c1Var.f40112Q != null || c1Var.f40107L != null) {
                Lu lu = this.f26641c;
                Ju ju = Ju.PRELOADED_LOADER;
                Objects.requireNonNull(lu);
                C3638np c3638np = this.f26639a;
                C3301ha c3301ha = AbstractC3569ma.f32065L2;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    c3638np.f32784o = c3638np.f32774d.f29638t;
                    com.anythink.basead.exoplayer.f.f.s(C4835j.f39733C.f39745k, c3638np.i, "scar-preloader-ready");
                }
                String str4 = c3638np.f32774d.f29623d.f40112Q;
                if (!TextUtils.isEmpty(str4)) {
                    String d2 = C3638np.d(str4);
                    C3301ha c3301ha2 = AbstractC3569ma.f32157V7;
                    if (((Boolean) rVar.f40210c.a(c3301ha2)).booleanValue() && d2.isEmpty()) {
                        int lastIndexOf = str4.lastIndexOf("&request_id=");
                        d2 = lastIndexOf != -1 ? str4.substring(lastIndexOf + 12) : "";
                    }
                    String str5 = d2;
                    if (TextUtils.isEmpty(str5)) {
                        k9 = QC.k(new Zq(15, "Invalid ad string."));
                    } else {
                        synchronized (c3638np.f32781l) {
                            try {
                                C2.K k10 = (C2.K) c3638np.f32771a.f30870X.f();
                                C2993bo c2993bo = c3638np.i;
                                String a9 = k10.a(str5, c2993bo);
                                if (((Boolean) rVar.f40210c.a(c3301ha2)).booleanValue() && !TextUtils.isEmpty(a9)) {
                                    try {
                                        JSONObject optJSONObject = new JSONObject(a9).optJSONObject("extras");
                                        if (optJSONObject != null) {
                                            if ((((Boolean) rVar.f40210c.a(AbstractC3569ma.f32175X7)).booleanValue() ? Arrays.asList(((String) rVar.f40210c.a(AbstractC3569ma.Y7)).split(",")) : Arrays.asList(((String) rVar.f40210c.a(AbstractC3569ma.f32166W7)).split(","))).contains(com.bumptech.glide.d.m(optJSONObject.optString("query_info_type", "")))) {
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
                                                                u2.z.k("Failed to get key from QueryJSONMap".concat(e9.toString()));
                                                                C4835j.f39733C.f39743h.d("CryptoUtils.getKeyFromQueryJsonMap", e9);
                                                            }
                                                            str4 = C3373iu.a(decode, bytes, string, c2993bo);
                                                        }
                                                        string = null;
                                                        str4 = C3373iu.a(decode, bytes, string, c2993bo);
                                                    } catch (IllegalArgumentException e10) {
                                                        u2.z.k("Failed to decode the adResponse. ".concat(e10.toString()));
                                                        C4835j.f39733C.f39743h.d("PreloadedLoader.decryptAdResponseIfNecessary", e10);
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
                                        u2.z.k("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str6)));
                                        C4835j.f39733C.f39743h.d("PreloadedLoader.decodeRenderId", e11);
                                    }
                                    List q8 = com.bumptech.glide.manager.p.d(new PA(':')).q(str7);
                                    if (q8.size() == 2) {
                                        str2 = (String) q8.get(0);
                                        i = Integer.parseInt((String) q8.get(1));
                                        Pair pair = str2 == null ? new Pair(str2, Integer.valueOf(i)) : new Pair("", 0);
                                        str3 = (String) pair.first;
                                        int intValue = ((Integer) pair.second).intValue();
                                        if (!TextUtils.isEmpty(str3) && intValue > 0) {
                                            synchronized (k10) {
                                                try {
                                                    C2.I i6 = (C2.I) k10.f290e.get(str5);
                                                    if (i6 != null) {
                                                        if (i6.f280c.contains(str3)) {
                                                            k9 = QC.k(new Zq(10, "The ad has already been shown."));
                                                        }
                                                    }
                                                    synchronized (k10) {
                                                        C2.I i9 = (C2.I) k10.f290e.get(str5);
                                                        if (i9 != null) {
                                                            HashSet hashSet = i9.f280c;
                                                            hashSet.add(str3);
                                                            if (hashSet.size() < intValue) {
                                                            }
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(a9)) {
                                                        k9 = c3638np.a(str4, c3638np.c(a9));
                                                    }
                                                } finally {
                                                }
                                            }
                                        }
                                        synchronized (k10) {
                                            k10.f290e.remove(str5);
                                        }
                                        if (!TextUtils.isEmpty(a9)) {
                                        }
                                    } else {
                                        u2.z.k("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str6)));
                                    }
                                }
                                i = 0;
                                str2 = null;
                                if (str2 == null) {
                                }
                                str3 = (String) pair.first;
                                int intValue2 = ((Integer) pair.second).intValue();
                                if (!TextUtils.isEmpty(str3)) {
                                    synchronized (k10) {
                                    }
                                }
                                synchronized (k10) {
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return new T8(lu, ju, null, Lu.f26188d, Collections.EMPTY_LIST, k9).s();
                }
                q2.O o6 = c3638np.f32774d.f29623d.f40107L;
                if (o6 != null) {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32087N7)).booleanValue()) {
                        String str8 = o6.f40070n;
                        String str9 = o6.f40071u;
                        String d9 = C3638np.d(str8);
                        String d10 = C3638np.d(str9);
                        if (TextUtils.isEmpty(d10) || !d9.equals(d10)) {
                            c3638np.i.f29325a.put("ridmm", "true");
                        } else {
                            C2.K k11 = (C2.K) c3638np.f32771a.f30870X.f();
                            synchronized (k11) {
                                k11.f290e.remove(d9);
                            }
                            c3638np.i.f29325a.put("request_id", d9);
                        }
                    }
                    k9 = c3638np.a(o6.f40070n, c3638np.c(o6.f40071u));
                    return new T8(lu, ju, null, Lu.f26188d, Collections.EMPTY_LIST, k9).s();
                }
                k9 = QC.k(new Zq(14, "Mismatch request IDs."));
                return new T8(lu, ju, null, Lu.f26188d, Collections.EMPTY_LIST, k9).s();
            }
        }
        return a(this.i.d());
    }

    public final Iu c(N3.a aVar) {
        T8 j6 = this.f26641c.a(aVar, Ju.RENDERER).g(new Qx(17, this)).j(this.f26643e);
        C3301ha c3301ha = AbstractC3569ma.z6;
        q2.r rVar = q2.r.f40207e;
        if (!((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            long intValue = ((Integer) rVar.f40210c.a(AbstractC3569ma.f31975A6)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            j6 = j6.r(intValue);
        }
        return j6.s();
    }
}

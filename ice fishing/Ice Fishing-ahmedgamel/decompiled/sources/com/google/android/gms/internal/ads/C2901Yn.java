package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.Yn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2901Yn implements InterfaceC3013bl, InterfaceC2663Kk, InterfaceC4195xk, InterfaceC2664Kl {

    /* renamed from: n, reason: collision with root package name */
    public final C3069co f29517n;

    /* renamed from: u, reason: collision with root package name */
    public final C3391io f29518u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f29519v;

    public C2901Yn(C3069co c3069co, C3391io c3391io, Context context) {
        this.f29517n = c3069co;
        this.f29518u = c3391io;
        this.f29519v = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4195xk
    public final void I(C4969z0 c4969z0) {
        C3069co c3069co = this.f29517n;
        c3069co.f30367a.put(NativeAdvancedJsUtils.f18693p, "ftl");
        c3069co.b("ftl", String.valueOf(c4969z0.f40512n));
        c3069co.b("ed", c4969z0.f40514v);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33029f8)).booleanValue()) {
            c3069co.b("emsg", c4969z0.f40513u);
        }
        c3069co.d();
        this.f29518u.b(c3069co.f30367a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void O(Yt yt) {
        C3069co c3069co = this.f29517n;
        c3069co.getClass();
        C2590Gf c2590Gf = yt.f29533b;
        List list = (List) c2590Gf.f25830u;
        if (!list.isEmpty()) {
            int i = ((St) list.get(0)).f28391b;
            c3069co.b(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, St.a(i));
            if (i == 6) {
                c3069co.f30367a.put("as", true != c3069co.f30368b.f31074z ? "0" : "1");
            }
        }
        C3324ha c3324ha = AbstractC3592ma.L2;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            c3069co.b("mwl", Integer.toString(list.size()));
        }
        c3069co.b("gqi", ((Ut) c2590Gf.f25831v).f28801b);
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Sa)).booleanValue()) {
            e();
        }
    }

    public final void a(Bundle bundle, C3523lC c3523lC) {
        C3324ha c3324ha = AbstractC3592ma.f32828J2;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() || bundle == null) {
            return;
        }
        C4906k.f40186C.f40198k.getClass();
        bundle.putLong("public-api-callback", System.currentTimeMillis());
        C3069co c3069co = this.f29517n;
        c3069co.getClass();
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Re)).booleanValue()) {
            c3069co.b("brr", true != c3069co.f30369c.f30405q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            c3069co.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int i = c3523lC.f32527w;
        for (int i4 = 0; i4 < i; i4++) {
            C2917Zn c2917Zn = (C2917Zn) c3523lC.get(i4);
            long j6 = bundle.getLong(com.IceFishing.LiveIceFishing.k.a(c2917Zn.f29731b), -1L);
            long j9 = bundle.getLong(com.IceFishing.LiveIceFishing.k.a(c2917Zn.f29732c), -1L);
            if (j6 > 0 && j9 > 0) {
                c3069co.b(c2917Zn.f29730a, String.valueOf(j9 - j6));
            }
        }
        d(bundle.getBundle("client_sig_latency_key"));
        d(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2664Kl
    public final void b(String str) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32893Q7)).booleanValue()) {
            C3069co c3069co = this.f29517n;
            c3069co.f30367a.put(NativeAdvancedJsUtils.f18693p, "sgf");
            c3069co.b("sgf_reason", str);
            c3069co.d();
            this.f29518u.b(c3069co.f30367a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2664Kl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(E2.s sVar) {
        String str;
        C3324ha c3324ha = AbstractC3592ma.f32893Q7;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            return;
        }
        C3391io c3391io = this.f29518u;
        C3069co c3069co = this.f29517n;
        if (sVar == null) {
            c3069co.f30367a.put(NativeAdvancedJsUtils.f18693p, "sgs");
            ConcurrentHashMap concurrentHashMap = c3069co.f30367a;
            concurrentHashMap.put("request_id", "-1");
            c3391io.b(concurrentHashMap);
            return;
        }
        C2759Qe c2759Qe = sVar.f868c;
        if (c2759Qe != null) {
            a(c2759Qe.f27825F, C2917Zn.f29728d);
        }
        try {
            JSONObject jSONObject = new JSONObject(sVar.f867b);
            c3069co.f30367a.put(NativeAdvancedJsUtils.f18693p, "sgs");
            ConcurrentHashMap concurrentHashMap2 = c3069co.f30367a;
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.cb)).booleanValue()) {
                try {
                    str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                } catch (JSONException e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("Error retrieving JSONObject from the requestJson, ", e9);
                }
                concurrentHashMap2.put("tpc", str);
                if (c2759Qe != null) {
                    c3069co.a(c2759Qe.f27826n);
                }
                c3069co.d();
                c3391io.b(concurrentHashMap2);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ua)).booleanValue()) {
                    return;
                }
                e();
                return;
            }
            str = "na";
            concurrentHashMap2.put("tpc", str);
            if (c2759Qe != null) {
            }
            c3069co.d();
            c3391io.b(concurrentHashMap2);
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ua)).booleanValue()) {
            }
        } catch (JSONException unused) {
            c3069co.f30367a.put(NativeAdvancedJsUtils.f18693p, "sgf");
            ConcurrentHashMap concurrentHashMap3 = c3069co.f30367a;
            concurrentHashMap3.put("sgf_reason", "request_invalid");
            c3391io.b(concurrentHashMap3);
        }
    }

    public final void d(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j6 = bundle.getLong(str);
            if (j6 >= 0) {
                this.f29517n.b(str, String.valueOf(j6));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r3 = r4.getHistoricalProcessExitReasons(r3.getPackageName(), 0, 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        List historicalProcessExitReasons;
        int reason;
        if (((Boolean) AbstractC2840Va.f28998d.r()).booleanValue() || C4906k.f40186C.f40196h.f30317q.getAndSet(true) || !V2.b.g()) {
            return;
        }
        String str = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.Va);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.f29519v;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || historicalProcessExitReasons == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            reason = O.D0.e(historicalProcessExitReasons.get(0)).getReason();
            com.bumptech.glide.manager.o m9 = com.bumptech.glide.manager.o.d(new PA(',')).m(SA.f28132v);
            com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o((InterfaceC3146eB) m9.f24256w, true, (QA) m9.f24255v);
            str.getClass();
            Iterator j6 = ((InterfaceC3146eB) oVar.f24256w).j(oVar, str);
            while (true) {
                AbstractC3093dB abstractC3093dB = (AbstractC3093dB) j6;
                if (!abstractC3093dB.hasNext()) {
                    return;
                }
                String str2 = (String) abstractC3093dB.next();
                try {
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53);
                    sb.append("Invalid number format in appExitInfoReasonAllowlist: ");
                    sb.append(str2);
                    w2.z.k(sb.toString());
                }
                if (Integer.parseInt(str2) == reason) {
                    C3391io c3391io = this.f29518u;
                    c3391io.getClass();
                    HashMap hashMap = new HashMap(c3391io.f31897a);
                    hashMap.put(NativeAdvancedJsUtils.f18693p, "aei");
                    hashMap.put("aeir", String.valueOf(reason));
                    c3391io.c(hashMap);
                    return;
                }
            }
        } catch (NoClassDefFoundError e9) {
            e = e9;
            C4906k.f40186C.f40196h.d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        } catch (NoSuchMethodError e10) {
            e = e10;
            C4906k.f40186C.f40196h.d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        } catch (RuntimeException e11) {
            e = e11;
            C4906k.f40186C.f40196h.d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        Bundle bundle;
        C3069co c3069co = this.f29517n;
        c3069co.f30367a.put(NativeAdvancedJsUtils.f18693p, "loaded");
        synchronized (c3069co) {
            bundle = c3069co.f30371e;
        }
        a(bundle, C2917Zn.f29729e);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ce)).booleanValue()) {
            c3069co.f30367a.put("mafe", true != com.bumptech.glide.f.m("MUTE_AUDIO") ? "0" : "1");
        }
        c3069co.d();
        this.f29518u.b(c3069co.f30367a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void i(C2759Qe c2759Qe) {
        this.f29517n.a(c2759Qe.f27826n);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ta)).booleanValue()) {
            e();
        }
    }
}

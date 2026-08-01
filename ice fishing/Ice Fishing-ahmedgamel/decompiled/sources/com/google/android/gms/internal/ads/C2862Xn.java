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
import p2.C4835j;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.Xn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2862Xn implements InterfaceC2990bl, InterfaceC2643Kk, InterfaceC4172xk, InterfaceC2627Jl {

    /* renamed from: n, reason: collision with root package name */
    public final C2993bo f28572n;

    /* renamed from: u, reason: collision with root package name */
    public final C3315ho f28573u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f28574v;

    public C2862Xn(C2993bo c2993bo, C3315ho c3315ho, Context context) {
        this.f28572n = c2993bo;
        this.f28573u = c3315ho;
        this.f28574v = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void O(Yt yt) {
        C2993bo c2993bo = this.f28572n;
        c2993bo.getClass();
        C2570Gf c2570Gf = yt.f28754b;
        List list = (List) c2570Gf.f25042u;
        if (!list.isEmpty()) {
            int i = ((St) list.get(0)).f27608b;
            c2993bo.b(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, St.a(i));
            if (i == 6) {
                c2993bo.f29325a.put("as", true != c2993bo.f29326b.f30286z ? "0" : "1");
            }
        }
        C3301ha c3301ha = AbstractC3569ma.f32065L2;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            c2993bo.b("mwl", Integer.toString(list.size()));
        }
        c2993bo.b("gqi", ((Ut) c2570Gf.f25043v).f28004b);
        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Sa)).booleanValue()) {
            e();
        }
    }

    public final void a(Bundle bundle, C3500lC c3500lC) {
        C3301ha c3301ha = AbstractC3569ma.J2;
        q2.r rVar = q2.r.f40207e;
        if (!((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() || bundle == null) {
            return;
        }
        C4835j.f39733C.f39745k.getClass();
        bundle.putLong("public-api-callback", System.currentTimeMillis());
        C2993bo c2993bo = this.f28572n;
        c2993bo.getClass();
        if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Re)).booleanValue()) {
            c2993bo.b("brr", true != c2993bo.f29327c.f29635q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            c2993bo.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int i = c3500lC.f31747w;
        for (int i6 = 0; i6 < i; i6++) {
            C2878Yn c2878Yn = (C2878Yn) c3500lC.get(i6);
            long j6 = bundle.getLong(com.anythink.basead.exoplayer.f.f.a(c2878Yn.f28739b), -1L);
            long j9 = bundle.getLong(com.anythink.basead.exoplayer.f.f.a(c2878Yn.f28740c), -1L);
            if (j6 > 0 && j9 > 0) {
                c2993bo.b(c2878Yn.f28738a, String.valueOf(j9 - j6));
            }
        }
        d(bundle.getBundle("client_sig_latency_key"));
        d(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2627Jl
    public final void b(String str) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32113Q7)).booleanValue()) {
            C2993bo c2993bo = this.f28572n;
            c2993bo.f29325a.put(NativeAdvancedJsUtils.f17906p, "sgf");
            c2993bo.b("sgf_reason", str);
            c2993bo.d();
            this.f28573u.b(c2993bo.f29325a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2627Jl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C2.t tVar) {
        String str;
        C3301ha c3301ha = AbstractC3569ma.f32113Q7;
        q2.r rVar = q2.r.f40207e;
        if (!((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            return;
        }
        C3315ho c3315ho = this.f28573u;
        C2993bo c2993bo = this.f28572n;
        if (tVar == null) {
            c2993bo.f29325a.put(NativeAdvancedJsUtils.f17906p, "sgs");
            ConcurrentHashMap concurrentHashMap = c2993bo.f29325a;
            concurrentHashMap.put("request_id", "-1");
            c3315ho.b(concurrentHashMap);
            return;
        }
        C2739Qe c2739Qe = tVar.f409c;
        if (c2739Qe != null) {
            a(c2739Qe.f27040F, C2878Yn.f28736d);
        }
        try {
            JSONObject jSONObject = new JSONObject(tVar.f408b);
            c2993bo.f29325a.put(NativeAdvancedJsUtils.f17906p, "sgs");
            ConcurrentHashMap concurrentHashMap2 = c2993bo.f29325a;
            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.cb)).booleanValue()) {
                try {
                    str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                } catch (JSONException e9) {
                    int i = u2.z.f41322b;
                    v2.i.d("Error retrieving JSONObject from the requestJson, ", e9);
                }
                concurrentHashMap2.put("tpc", str);
                if (c2739Qe != null) {
                    c2993bo.a(c2739Qe.f27041n);
                }
                c2993bo.d();
                c3315ho.b(concurrentHashMap2);
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ua)).booleanValue()) {
                    return;
                }
                e();
                return;
            }
            str = "na";
            concurrentHashMap2.put("tpc", str);
            if (c2739Qe != null) {
            }
            c2993bo.d();
            c3315ho.b(concurrentHashMap2);
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ua)).booleanValue()) {
            }
        } catch (JSONException unused) {
            c2993bo.f29325a.put(NativeAdvancedJsUtils.f17906p, "sgf");
            ConcurrentHashMap concurrentHashMap3 = c2993bo.f29325a;
            concurrentHashMap3.put("sgf_reason", "request_invalid");
            c3315ho.b(concurrentHashMap3);
        }
    }

    public final void d(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j6 = bundle.getLong(str);
            if (j6 >= 0) {
                this.f28572n.b(str, String.valueOf(j6));
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
        if (((Boolean) AbstractC2817Va.f28201d.r()).booleanValue() || C4835j.f39733C.f39743h.f29532q.getAndSet(true) || !T2.b.g()) {
            return;
        }
        String str = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.Va);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.f28574v;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || historicalProcessExitReasons == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            reason = O.D0.e(historicalProcessExitReasons.get(0)).getReason();
            com.bumptech.glide.manager.p m4 = com.bumptech.glide.manager.p.d(new PA(',')).m(SA.f27418v);
            com.bumptech.glide.manager.p pVar = new com.bumptech.glide.manager.p((InterfaceC3123eB) m4.f23471w, true, (QA) m4.f23470v);
            str.getClass();
            Iterator j6 = ((InterfaceC3123eB) pVar.f23471w).j(pVar, str);
            while (true) {
                AbstractC3070dB abstractC3070dB = (AbstractC3070dB) j6;
                if (!abstractC3070dB.hasNext()) {
                    return;
                }
                String str2 = (String) abstractC3070dB.next();
                try {
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53);
                    sb.append("Invalid number format in appExitInfoReasonAllowlist: ");
                    sb.append(str2);
                    u2.z.k(sb.toString());
                }
                if (Integer.parseInt(str2) == reason) {
                    C3315ho c3315ho = this.f28573u;
                    c3315ho.getClass();
                    HashMap hashMap = new HashMap(c3315ho.f30940a);
                    hashMap.put(NativeAdvancedJsUtils.f17906p, "aei");
                    hashMap.put("aeir", String.valueOf(reason));
                    c3315ho.c(hashMap);
                    return;
                }
            }
        } catch (NoClassDefFoundError e9) {
            e = e9;
            C4835j.f39733C.f39743h.d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        } catch (NoSuchMethodError e10) {
            e = e10;
            C4835j.f39733C.f39743h.d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        } catch (RuntimeException e11) {
            e = e11;
            C4835j.f39733C.f39743h.d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        Bundle bundle;
        C2993bo c2993bo = this.f28572n;
        c2993bo.f29325a.put(NativeAdvancedJsUtils.f17906p, "loaded");
        synchronized (c2993bo) {
            bundle = c2993bo.f29329e;
        }
        a(bundle, C2878Yn.f28737e);
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.ce)).booleanValue()) {
            c2993bo.f29325a.put("mafe", true != com.bumptech.glide.f.o("MUTE_AUDIO") ? "0" : "1");
        }
        c2993bo.d();
        this.f28573u.b(c2993bo.f29325a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void i(C2739Qe c2739Qe) {
        this.f28572n.a(c2739Qe.f27041n);
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ta)).booleanValue()) {
            e();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4172xk
    public final void v(C4920z0 c4920z0) {
        C2993bo c2993bo = this.f28572n;
        c2993bo.f29325a.put(NativeAdvancedJsUtils.f17906p, "ftl");
        c2993bo.b("ftl", String.valueOf(c4920z0.f40213n));
        c2993bo.b("ed", c4920z0.f40215v);
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32249f8)).booleanValue()) {
            c2993bo.b("emsg", c4920z0.f40214u);
        }
        c2993bo.d();
        this.f28573u.b(c2993bo.f29325a);
    }
}

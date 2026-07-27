package com.google.android.gms.internal.ads;

import C2.C0269b;
import android.content.Context;
import android.os.Bundle;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.ya, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4216ya {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f35162a;

    /* renamed from: b, reason: collision with root package name */
    public final C2.D f35163b;

    /* renamed from: c, reason: collision with root package name */
    public final C0269b f35164c;

    /* renamed from: d, reason: collision with root package name */
    public final C3315ho f35165d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC3111e f35166e;

    /* renamed from: f, reason: collision with root package name */
    public C4162xa f35167f;

    /* renamed from: g, reason: collision with root package name */
    public S0.i f35168g;

    /* renamed from: h, reason: collision with root package name */
    public String f35169h;
    public long i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f35170j;

    /* renamed from: k, reason: collision with root package name */
    public JSONArray f35171k;

    /* renamed from: l, reason: collision with root package name */
    public Context f35172l;

    public C4216ya(ScheduledExecutorService scheduledExecutorService, C2.D d2, C0269b c0269b, C3315ho c3315ho) {
        this.f35162a = scheduledExecutorService;
        this.f35163b = d2;
        this.f35164c = c0269b;
        this.f35165d = c3315ho;
    }

    public final void a(String str) {
        try {
            S0.i iVar = this.f35168g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f35170j).toString());
            e(jSONObject);
            if (((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue()) {
                jSONObject.put("as", this.f35164c.b());
            }
            iVar.k(jSONObject.toString());
            C2.v vVar = new C2.v(this, str);
            if (((Boolean) AbstractC2801Ua.f27929e.r()).booleanValue()) {
                this.f35163b.a(this.f35168g, vVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            F2.a.a(this.f35172l, k2.b.BANNER, new k2.g((k2.f) new k2.f(2).e(bundle)), vVar);
        } catch (JSONException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Error creating JSON: ", e9);
        }
    }

    public final JSONObject b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC2801Ua.f27929e.r()).booleanValue() ? ((Long) AbstractC2801Ua.f27932h.r()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue()) {
            jSONObject.put("as", this.f35164c.b());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC2801Ua.f27929e.r()).booleanValue() ? ((Long) AbstractC2801Ua.f27932h.r()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC2801Ua.f27927c.r()).booleanValue()) {
            jSONObject.put("as", this.f35164c.b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() <= r6.i) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r1 = r6.f35168g;
        r2 = android.net.Uri.parse(r6.f35169h);
        r1.getClass();
        r3 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r4 = new android.os.Bundle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r4.isEmpty() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r5 = (p.BinderC4815e) r1.f2790w;
        r1 = (b.InterfaceC0510d) r1.f2789v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        r3.putAll(r4);
        ((b.C0508b) r1).H0(r5, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        ((b.C0508b) r1).F0(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        if (((java.lang.Boolean) q2.r.f40204e.f40207c.a(com.google.android.gms.internal.ads.AbstractC3569ma.mb)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ScheduledExecutorService scheduledExecutorService;
        C4162xa c4162xa = this.f35167f;
        if (c4162xa == null) {
            int i = u2.z.f41319b;
            v2.i.c("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        } else {
            if (c4162xa.f35023a.get()) {
                return;
            }
            if (this.f35169h != null && this.f35168g != null && (scheduledExecutorService = this.f35162a) != null) {
                if (this.i != 0) {
                    C4835j.f39730C.f39742k.getClass();
                }
            }
            u2.z.k("PACT max retry connection duration timed out");
            return;
        }
        scheduledExecutorService.schedule(this.f35166e, ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.nb)).longValue(), TimeUnit.MILLISECONDS);
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.f35171k == null) {
                this.f35171k = new JSONArray((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.pb));
            }
            jSONObject.put("eids", this.f35171k);
        } catch (JSONException e9) {
            int i = u2.z.f41319b;
            v2.i.d("Error fetching the PACT active eids JSON: ", e9);
        }
    }
}

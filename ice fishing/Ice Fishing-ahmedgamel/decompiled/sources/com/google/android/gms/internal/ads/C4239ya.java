package com.google.android.gms.internal.ads;

import E2.C0305b;
import android.content.Context;
import android.os.Bundle;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.ya, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4239ya {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f35952a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.C f35953b;

    /* renamed from: c, reason: collision with root package name */
    public final C0305b f35954c;

    /* renamed from: d, reason: collision with root package name */
    public final C3391io f35955d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC3134e f35956e;

    /* renamed from: f, reason: collision with root package name */
    public C4185xa f35957f;

    /* renamed from: g, reason: collision with root package name */
    public S0.i f35958g;

    /* renamed from: h, reason: collision with root package name */
    public String f35959h;
    public long i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f35960j;

    /* renamed from: k, reason: collision with root package name */
    public JSONArray f35961k;

    /* renamed from: l, reason: collision with root package name */
    public Context f35962l;

    public C4239ya(ScheduledExecutorService scheduledExecutorService, E2.C c9, C0305b c0305b, C3391io c3391io) {
        this.f35952a = scheduledExecutorService;
        this.f35953b = c9;
        this.f35954c = c0305b;
        this.f35955d = c3391io;
    }

    public final void a(String str) {
        try {
            S0.i iVar = this.f35958g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f35960j).toString());
            e(jSONObject);
            if (((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue()) {
                jSONObject.put("as", this.f35954c.b());
            }
            iVar.e(jSONObject.toString());
            E2.u uVar = new E2.u(this, str);
            if (((Boolean) AbstractC2823Ua.f28727e.r()).booleanValue()) {
                this.f35953b.a(this.f35958g, uVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            H2.a.a(this.f35962l, m2.b.BANNER, new m2.g((m2.f) new m2.f(3).e(bundle)), uVar);
        } catch (JSONException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Error creating JSON: ", e9);
        }
    }

    public final JSONObject b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC2823Ua.f28727e.r()).booleanValue() ? ((Long) AbstractC2823Ua.f28730h.r()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue()) {
            jSONObject.put("as", this.f35954c.b());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC2823Ua.f28727e.r()).booleanValue() ? ((Long) AbstractC2823Ua.f28730h.r()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC2823Ua.f28725c.r()).booleanValue()) {
            jSONObject.put("as", this.f35954c.b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() <= r6.i) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r1 = r6.f35958g;
        r2 = android.net.Uri.parse(r6.f35959h);
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
    
        r5 = (p.BinderC4819e) r1.f2919w;
        r1 = (b.InterfaceC0514d) r1.f2918v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        r3.putAll(r4);
        ((b.C0512b) r1).F0(r5, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        ((b.C0512b) r1).D0(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.mb)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ScheduledExecutorService scheduledExecutorService;
        C4185xa c4185xa = this.f35957f;
        if (c4185xa == null) {
            int i = w2.z.f41712b;
            x2.i.c("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        } else {
            if (c4185xa.f35802a.get()) {
                return;
            }
            if (this.f35959h != null && this.f35958g != null && (scheduledExecutorService = this.f35952a) != null) {
                if (this.i != 0) {
                    C4906k.f40186C.f40198k.getClass();
                }
            }
            w2.z.k("PACT max retry connection duration timed out");
            return;
        }
        scheduledExecutorService.schedule(this.f35956e, ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.nb)).longValue(), TimeUnit.MILLISECONDS);
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.f35961k == null) {
                this.f35961k = new JSONArray((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.pb));
            }
            jSONObject.put("eids", this.f35961k);
        } catch (JSONException e9) {
            int i = w2.z.f41712b;
            x2.i.d("Error fetching the PACT active eids JSON: ", e9);
        }
    }
}

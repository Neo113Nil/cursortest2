package com.google.android.gms.internal.ads;

import B2.C0268b;
import android.content.Context;
import android.os.Bundle;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import k2.C4635f;
import k2.C4636g;
import k2.EnumC4631b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.va, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4067va {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f34801a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.E f34802b;

    /* renamed from: c, reason: collision with root package name */
    public final C0268b f34803c;

    /* renamed from: d, reason: collision with root package name */
    public final C3381io f34804d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC3068d f34805e;

    /* renamed from: f, reason: collision with root package name */
    public C3959ta f34806f;

    /* renamed from: g, reason: collision with root package name */
    public f4.p f34807g;

    /* renamed from: h, reason: collision with root package name */
    public String f34808h;
    public long i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f34809j;

    /* renamed from: k, reason: collision with root package name */
    public JSONArray f34810k;

    /* renamed from: l, reason: collision with root package name */
    public Context f34811l;

    public C4067va(ScheduledExecutorService scheduledExecutorService, B2.E e6, C0268b c0268b, C3381io c3381io) {
        this.f34801a = scheduledExecutorService;
        this.f34802b = e6;
        this.f34803c = c0268b;
        this.f34804d = c3381io;
    }

    public final void a(String str) {
        try {
            f4.p pVar = this.f34807g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f34809j).toString());
            e(jSONObject);
            if (((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue()) {
                jSONObject.put("as", this.f34803c.b());
            }
            pVar.k(jSONObject.toString());
            B2.w wVar = new B2.w(this, str);
            if (((Boolean) AbstractC2734Qa.f27167e.r()).booleanValue()) {
                this.f34802b.a(this.f34807g, wVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            E2.a.a(this.f34811l, EnumC4631b.BANNER, new C4636g((C4635f) new C4635f(1).e(bundle)), wVar);
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Error creating JSON: ", e6);
        }
    }

    public final JSONObject b(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC2734Qa.f27167e.r()).booleanValue() ? ((Long) AbstractC2734Qa.f27170h.r()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue()) {
            jSONObject.put("as", this.f34803c.b());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC2734Qa.f27167e.r()).booleanValue() ? ((Long) AbstractC2734Qa.f27170h.r()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC2734Qa.f27165c.r()).booleanValue()) {
            jSONObject.put("as", this.f34803c.b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() <= r6.i) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r1 = r6.f34807g;
        r2 = android.net.Uri.parse(r6.f34808h);
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
    
        r5 = (p.BinderC4845e) r1.f37765w;
        r1 = (b.InterfaceC0520d) r1.f37764v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        r3.putAll(r4);
        ((b.C0518b) r1).G0(r5, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        ((b.C0518b) r1).D0(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        if (((java.lang.Boolean) q2.r.f40116e.f40119c.a(com.google.android.gms.internal.ads.AbstractC3368ia.mb)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ScheduledExecutorService scheduledExecutorService;
        C3959ta c3959ta = this.f34806f;
        if (c3959ta == null) {
            int i = t2.C.f40822b;
            u2.i.c("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        } else {
            if (c3959ta.f34416a.get()) {
                return;
            }
            if (this.f34808h != null && this.f34807g != null && (scheduledExecutorService = this.f34801a) != null) {
                if (this.i != 0) {
                    p2.j.f39798C.f39810k.getClass();
                }
            }
            t2.C.k("PACT max retry connection duration timed out");
            return;
        }
        scheduledExecutorService.schedule(this.f34805e, ((Long) q2.r.f40116e.f40119c.a(AbstractC3368ia.nb)).longValue(), TimeUnit.MILLISECONDS);
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.f34810k == null) {
                this.f34810k = new JSONArray((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.pb));
            }
            jSONObject.put("eids", this.f34810k);
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Error fetching the PACT active eids JSON: ", e6);
        }
    }
}

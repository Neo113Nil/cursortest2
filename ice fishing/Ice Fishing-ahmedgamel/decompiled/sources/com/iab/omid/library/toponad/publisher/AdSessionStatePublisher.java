package com.iab.omid.library.toponad.publisher;

import android.webkit.WebView;
import com.anythink.expressad.foundation.d.d;
import com.iab.omid.library.toponad.adsession.AdEvents;
import com.iab.omid.library.toponad.adsession.AdSessionConfiguration;
import com.iab.omid.library.toponad.adsession.AdSessionContext;
import com.iab.omid.library.toponad.adsession.ErrorType;
import com.iab.omid.library.toponad.adsession.VerificationScriptResource;
import com.iab.omid.library.toponad.adsession.media.MediaEvents;
import com.iab.omid.library.toponad.internal.g;
import com.iab.omid.library.toponad.internal.h;
import com.iab.omid.library.toponad.utils.c;
import com.iab.omid.library.toponad.utils.f;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private String f36273a;

    /* renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.toponad.weakreference.b f36274b;

    /* renamed from: c, reason: collision with root package name */
    private AdEvents f36275c;

    /* renamed from: d, reason: collision with root package name */
    private MediaEvents f36276d;

    /* renamed from: e, reason: collision with root package name */
    private a f36277e;

    /* renamed from: f, reason: collision with root package name */
    private long f36278f;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f36273a = str;
        this.f36274b = new com.iab.omid.library.toponad.weakreference.b(null);
    }

    public void a() {
        this.f36278f = f.b();
        this.f36277e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f36274b.clear();
    }

    public AdEvents c() {
        return this.f36275c;
    }

    public MediaEvents d() {
        return this.f36276d;
    }

    public boolean e() {
        return this.f36274b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f36273a);
    }

    public void g() {
        h.a().b(getWebView(), this.f36273a);
    }

    public WebView getWebView() {
        return this.f36274b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f3) {
        h.a().a(getWebView(), this.f36273a, f3);
    }

    public void b(String str, long j6) {
        if (j6 >= this.f36278f) {
            this.f36277e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f36273a, str);
        }
    }

    public void a(WebView webView) {
        this.f36274b = new com.iab.omid.library.toponad.weakreference.b(webView);
    }

    public void b(boolean z3) {
        if (e()) {
            h.a().a(getWebView(), this.f36273a, z3 ? "locked" : "unlocked");
        }
    }

    public void a(AdEvents adEvents) {
        this.f36275c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f36273a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f36273a, errorType, str);
    }

    public void a(com.iab.omid.library.toponad.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.toponad.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.toponad.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.toponad.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.5.2-Toponad");
        c.a(jSONObject4, com.anythink.expressad.videocommon.e.b.f22407u, g.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        h.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f36276d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j6) {
        if (j6 >= this.f36278f) {
            a aVar = this.f36277e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f36277e = aVar2;
                h.a().b(getWebView(), this.f36273a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f36273a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, d.f18596u, Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f36273a, jSONObject);
    }

    public void a(boolean z3) {
        if (e()) {
            h.a().c(getWebView(), this.f36273a, z3 ? "foregrounded" : "backgrounded");
        }
    }
}

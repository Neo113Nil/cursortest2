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
    private String f37040a;

    /* renamed from: b, reason: collision with root package name */
    private com.iab.omid.library.toponad.weakreference.b f37041b;

    /* renamed from: c, reason: collision with root package name */
    private AdEvents f37042c;

    /* renamed from: d, reason: collision with root package name */
    private MediaEvents f37043d;

    /* renamed from: e, reason: collision with root package name */
    private a f37044e;

    /* renamed from: f, reason: collision with root package name */
    private long f37045f;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        a();
        this.f37040a = str;
        this.f37041b = new com.iab.omid.library.toponad.weakreference.b(null);
    }

    public void a() {
        this.f37045f = f.b();
        this.f37044e = a.AD_STATE_IDLE;
    }

    public void b() {
        this.f37041b.clear();
    }

    public AdEvents c() {
        return this.f37042c;
    }

    public MediaEvents d() {
        return this.f37043d;
    }

    public boolean e() {
        return this.f37041b.get() != null;
    }

    public void f() {
        h.a().a(getWebView(), this.f37040a);
    }

    public void g() {
        h.a().b(getWebView(), this.f37040a);
    }

    public WebView getWebView() {
        return this.f37041b.get();
    }

    public void h() {
        a((JSONObject) null);
    }

    public void i() {
    }

    public void a(float f2) {
        h.a().a(getWebView(), this.f37040a, f2);
    }

    public void b(String str, long j6) {
        if (j6 >= this.f37045f) {
            this.f37044e = a.AD_STATE_VISIBLE;
            h.a().b(getWebView(), this.f37040a, str);
        }
    }

    public void a(WebView webView) {
        this.f37041b = new com.iab.omid.library.toponad.weakreference.b(webView);
    }

    public void b(boolean z6) {
        if (e()) {
            h.a().a(getWebView(), this.f37040a, z6 ? "locked" : "unlocked");
        }
    }

    public void a(AdEvents adEvents) {
        this.f37042c = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        h.a().a(getWebView(), this.f37040a, adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        h.a().a(getWebView(), this.f37040a, errorType, str);
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
        c.a(jSONObject4, com.anythink.expressad.videocommon.e.b.f23194u, g.b().a().getApplicationContext().getPackageName());
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
        this.f37043d = mediaEvents;
    }

    public void a(String str) {
        a(str, (JSONObject) null);
    }

    public void a(String str, long j6) {
        if (j6 >= this.f37045f) {
            a aVar = this.f37044e;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f37044e = aVar2;
                h.a().b(getWebView(), this.f37040a, str);
            }
        }
    }

    public void a(String str, JSONObject jSONObject) {
        h.a().a(getWebView(), this.f37040a, str, jSONObject);
    }

    public void a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, d.f19383u, Long.valueOf(date.getTime()));
        h.a().a(getWebView(), jSONObject);
    }

    public void a(JSONObject jSONObject) {
        h.a().b(getWebView(), this.f37040a, jSONObject);
    }

    public void a(boolean z6) {
        if (e()) {
            h.a().c(getWebView(), this.f37040a, z6 ? "foregrounded" : "backgrounded");
        }
    }
}

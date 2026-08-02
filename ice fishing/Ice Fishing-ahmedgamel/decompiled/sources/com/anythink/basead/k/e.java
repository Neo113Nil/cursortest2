package com.anythink.basead.k;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.ac;
import com.anythink.core.common.v.n;
import com.anythink.core.common.v.p;
import com.iab.omid.library.toponad.Omid;
import com.iab.omid.library.toponad.ScriptInjector;
import com.iab.omid.library.toponad.adsession.AdSession;
import com.iab.omid.library.toponad.adsession.AdSessionConfiguration;
import com.iab.omid.library.toponad.adsession.AdSessionContext;
import com.iab.omid.library.toponad.adsession.CreativeType;
import com.iab.omid.library.toponad.adsession.ImpressionType;
import com.iab.omid.library.toponad.adsession.Owner;
import com.iab.omid.library.toponad.adsession.Partner;
import com.iab.omid.library.toponad.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9925a = "e";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9926b = "topon-omid";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9927c = "Toponad";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9928d = "[AT H5 JS CONTENT]";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9929e = "[AT VERIFICATION URL]";

    /* renamed from: f, reason: collision with root package name */
    private static final String f9930f = "[AT VERIFICATION PARAMS]";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9931g = "vk";

    /* renamed from: h, reason: collision with root package name */
    private static final String f9932h = "jr";
    private static final String i = "vp";

    public static String a(String str, w wVar, x xVar) {
        JSONArray au;
        if (!TextUtils.isEmpty(str)) {
            String b9 = ac.a().b();
            if (!TextUtils.isEmpty(b9)) {
                try {
                    String injectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(b9, str);
                    if (wVar != null && (au = wVar.au()) != null && au.length() != 0) {
                        String str2 = "";
                        for (int i4 = 0; i4 < au.length(); i4++) {
                            try {
                                JSONObject jSONObject = au.getJSONObject(i4);
                                if (TextUtils.equals(f9926b, jSONObject.getString(f9931g))) {
                                    str2 = jSONObject.getString(f9932h);
                                }
                            } catch (Throwable th) {
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(str2)) {
                            n.a(f9925a, "verificationUrl is empty,no need to inject");
                        } else {
                            String c9 = ac.a().c();
                            if (!TextUtils.isEmpty(c9)) {
                                if (t.b().F()) {
                                    n.a(f9925a, "Offer Html Contain MACRO_INSERT_WEBVIEW_CONTENT [AT H5 JS CONTENT]:" + injectScriptContentIntoHtml.contains(f9928d));
                                }
                                String replace = injectScriptContentIntoHtml.replace(f9928d, c9);
                                if (t.b().F()) {
                                    n.a(f9925a, "Offer Html Contain MACRO_INSERT_VERIFICATION_URL [AT VERIFICATION URL]:" + replace.contains(f9929e));
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    replace = replace.replace(f9929e, str2);
                                }
                                if (t.b().F()) {
                                    n.a(f9925a, "Offer Html Contain MACRO_INSERT_VERIFICATION_PARAMS [AT VERIFICATION PARAMS]:" + replace.contains(f9930f));
                                }
                                return (xVar == null || TextUtils.isEmpty(xVar.f14951l)) ? replace : replace.replace(f9930f, xVar.f14951l);
                            }
                        }
                    }
                    return injectScriptContentIntoHtml;
                } catch (Throwable th2) {
                    th2.getMessage();
                    k.x("Omsdk Exception", "injectScriptContentIntoHtml fail with throwable:" + th2.getMessage());
                    return str;
                }
            }
        }
        return str;
    }

    public static com.anythink.basead.j.b a(Context context, boolean z6, w wVar, x xVar) {
        String str;
        JSONArray jSONArray;
        String str2;
        b bVar;
        String b9 = ac.a().b();
        b bVar2 = null;
        if (TextUtils.isEmpty(b9)) {
            com.anythink.core.common.u.e.a(xVar, wVar, a(), z6 ? "3" : "2", false, "3", "");
            return null;
        }
        String str3 = "";
        if (wVar == null) {
            str = "";
            jSONArray = null;
        } else {
            jSONArray = wVar.au();
            str = wVar.E();
        }
        if (jSONArray != null && jSONArray.length() != 0) {
            try {
                a(context);
                Partner createPartner = Partner.createPartner(f9927c, p.a());
                CreativeType creativeType = z6 ? CreativeType.VIDEO : CreativeType.NATIVE_DISPLAY;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                Owner owner = Owner.NATIVE;
                AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, z6 ? owner : Owner.NONE, false);
                if (xVar == null) {
                    str2 = "";
                } else {
                    str2 = xVar.f14944d;
                }
                if (xVar != null) {
                    str3 = xVar.f14951l;
                }
                List<VerificationScriptResource> a9 = a(jSONArray, str3);
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                bVar = new b(AdSession.createAdSession(createAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(createPartner, b9, a9, str, str2)), z6);
            } catch (Throwable th) {
                th = th;
            }
            try {
                com.anythink.core.common.u.e.a(xVar, wVar, a(), z6 ? "3" : "2");
                return bVar;
            } catch (Throwable th2) {
                th = th2;
                bVar2 = bVar;
                th.getMessage();
                com.anythink.core.common.u.e.a(xVar, wVar, a(), z6 ? "3" : "2", false, "4", th.getMessage());
                return bVar2;
            }
        }
        return bVar2;
    }

    public static com.anythink.basead.j.b a(Context context, WebView webView, w wVar, x xVar) {
        w wVar2;
        x xVar2;
        b bVar = null;
        if (TextUtils.isEmpty(ac.a().b())) {
            com.anythink.core.common.u.e.a(xVar, wVar, a(), "1", false, "3", "");
            return null;
        }
        try {
            a(context);
            b bVar2 = new b(AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(f9927c, p.a()), webView, null, null)), false);
            try {
                wVar2 = wVar;
                xVar2 = xVar;
                try {
                    com.anythink.core.common.u.e.a(xVar2, wVar2, a(), "1");
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    th.getMessage();
                    com.anythink.core.common.u.e.a(xVar2, wVar2, a(), "1", false, "4", th.getMessage());
                    return bVar;
                }
            } catch (Throwable th2) {
                th = th2;
                wVar2 = wVar;
                xVar2 = xVar;
            }
        } catch (Throwable th3) {
            th = th3;
            wVar2 = wVar;
            xVar2 = xVar;
        }
    }

    private static void a(Context context) {
        if (Omid.isActive()) {
            return;
        }
        Omid.activate(context);
    }

    private static List<VerificationScriptResource> a(JSONArray jSONArray, String str) {
        VerificationScriptResource createVerificationScriptResourceWithParameters;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                try {
                    try {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                        String optString = optJSONObject.optString(f9931g, "");
                        String optString2 = optJSONObject.optString(f9932h, "");
                        String optString3 = optJSONObject.optString(i, "");
                        if (TextUtils.equals(optString, f9926b)) {
                            optString3 = str;
                        }
                        if (!TextUtils.isEmpty(optString2)) {
                            URL url = new URL(optString2);
                            if (TextUtils.isEmpty(optString3)) {
                                createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                            } else {
                                createVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(optString, url, optString3);
                            }
                            arrayList.add(createVerificationScriptResourceWithParameters);
                        }
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th) {
                    th.getMessage();
                    k.x("Omsdk Exception", "getMeasureResource fail:" + th.getMessage());
                }
            }
        }
        return arrayList;
    }

    private static String a() {
        try {
            return Omid.getVersion();
        } catch (Throwable unused) {
            return "";
        }
    }
}

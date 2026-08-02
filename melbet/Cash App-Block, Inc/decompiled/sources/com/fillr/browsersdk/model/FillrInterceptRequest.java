package com.fillr.browsersdk.model;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.camera.core.FocusMeteringAction;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.FillrContentType;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.browsersdk.tls.CertificateRegistry;
import com.fillr.browsersdk.utilities.FillrUtils;
import com.fillr.n;
import com.google.android.gms.tasks.zzb;
import com.google.mlkit.vision.text.zzd;
import com.nimbusds.jose.JWECryptoParts;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FillrInterceptRequest extends n.a {
    public static final zzd FEATURE_MANAGER = zzd.getInstance();

    public static String appendWidget(String str, FillrContentType fillrContentType, String str2) {
        String str3;
        StringBuilder sb;
        Fillr fillr = Fillr.getInstance();
        if (fillr != null) {
            FillrWidget.WidgetType widgetType = FillrWidget.WidgetType.MOBILE;
            JWECryptoParts jWECryptoParts = fillr.widgetManager;
            if (jWECryptoParts == null ? false : jWECryptoParts.isWidgetAvailable(widgetType)) {
                str3 = fillr.getWidgetManager().buildPayloadForUrl(str2);
                if (fillrContentType == FillrContentType.HTML_CONTENT) {
                    str3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("<script type=\"text/javascript\">", str3, "</script>");
                }
                sb = new StringBuilder(str);
                if (str3 != null && (sb.length() > 0 || fillrContentType != FillrContentType.HTML_CONTENT)) {
                    sb.append(str3);
                }
                return sb.toString();
            }
        }
        str3 = null;
        sb = new StringBuilder(str);
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public static boolean isHtml(WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            String str = webResourceRequest.getRequestHeaders() != null ? webResourceRequest.getRequestHeaders().get("Accept") : null;
            if (str != null && (str.contains("text/html") || str.contains("application/xhtml") || str.contains("application/xml"))) {
                return webResourceRequest.getRequestHeaders() == null || !"xmlhttprequest".equalsIgnoreCase(webResourceRequest.getRequestHeaders().get("HTTP_X_REQUESTED_WITH"));
            }
        }
        return false;
    }

    public static WebResourceResponse mergeResults(WebResourceResponse webResourceResponse, String str) {
        if (webResourceResponse == null) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            FillrContentType fillrContentType = FillrContentType.HTML_CONTENT;
            return new WebResourceResponse("fillr/json", "utf-8", new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)));
        }
        if (TextUtils.isEmpty(str)) {
            return webResourceResponse;
        }
        try {
            String streamToString = FillrUtils.streamToString(webResourceResponse.getData());
            JSONObject jSONObject = new JSONObject();
            FillrContentType fillrContentType2 = FillrContentType.HTML_CONTENT;
            jSONObject.put("text/html", streamToString);
            jSONObject.put("fillr/json", str);
            return new WebResourceResponse("fillr/mixed", "utf-8", new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            SVG svg = Fillr.getInstance().fillrConfig;
            e.printStackTrace();
            return webResourceResponse;
        }
    }

    public static String processPageEvent(WebResourceRequest webResourceRequest, String str, String str2) {
        if (!TextUtils.isEmpty(str2) && webResourceRequest.getRequestHeaders() != null && !"xmlhttprequest".equalsIgnoreCase(webResourceRequest.getRequestHeaders().get("HTTP_X_REQUESTED_WITH"))) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                long currentTimeMillis = System.currentTimeMillis();
                long j = jSONObject.getLong("time");
                long j2 = currentTimeMillis - j;
                if (j > 0) {
                    jSONObject.put("elapsedMs", j2);
                }
                boolean hasGesture = webResourceRequest.hasGesture();
                if (!hasGesture && j2 < 1000) {
                    hasGesture = true;
                }
                FocusMeteringAction focusMeteringAction = new FocusMeteringAction(str);
                focusMeteringAction.mMeteringPointsAwb = jSONObject;
                focusMeteringAction.mMeteringPointsAe = hasGesture ? FillrWidgetPageEvent.NAVIGATION : FillrWidgetPageEvent.CLOSE;
                JSONObject buildJson = focusMeteringAction.buildJson();
                if (buildJson != null) {
                    return buildJson.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.fillr.n.a
    public final void configure(HttpURLConnection httpURLConnection, WebResourceRequest webResourceRequest) {
        super.configure(httpURLConnection, webResourceRequest);
        CookieManager cookieManager = (CookieManager) zzb.getInstance().zza;
        Iterator it = (cookieManager == null ? zzb.getMultilineCookieHeaders("") : zzb.getMultilineCookieHeaders(cookieManager.getCookie(httpURLConnection.getURL().toString()))).iterator();
        while (it.hasNext()) {
            httpURLConnection.addRequestProperty("Cookie", (String) it.next());
        }
    }

    public final WebResourceResponse defaultInterceptionStrategy(String str, WebResourceRequest webResourceRequest) {
        if (isHtml(webResourceRequest) && !webResourceRequest.isForMainFrame() && "get".equalsIgnoreCase(webResourceRequest.getMethod())) {
            SVG svg = Fillr.getInstance().fillrConfig;
            FillrContentType fillrContentType = FillrContentType.HTML_CONTENT;
            try {
                String intercept = intercept(webResourceRequest);
                if (intercept != null) {
                    if (FillrUtils.isWebContentLikelyHtml(intercept, this.b)) {
                        intercept = appendWidget(intercept, fillrContentType, str);
                    }
                    return wrapResponse(intercept, "text/html");
                }
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
                e.getMessage().getClass();
                SVG svg2 = Fillr.getInstance().fillrConfig;
            }
        }
        return null;
    }

    @Override // com.fillr.n.a
    public final String getMimeFromHeaders(HttpURLConnection httpURLConnection, WebResourceRequest webResourceRequest, String str) {
        CookieManager cookieManager = (CookieManager) zzb.getInstance().zza;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        List<String> list = headerFields == null ? null : headerFields.get("Set-Cookie");
        if (cookieManager != null && list != null && !list.isEmpty()) {
            for (String str2 : list) {
                SVG svg = Fillr.getInstance().fillrConfig;
                cookieManager.setCookie(httpURLConnection.getURL().toString(), str2);
            }
        }
        return super.getMimeFromHeaders(httpURLConnection, webResourceRequest, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0014, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000b, B:8:0x0027, B:10:0x002d, B:12:0x0039, B:14:0x003f, B:15:0x004b, B:16:0x0052, B:26:0x0017), top: B:3:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000b, B:8:0x0027, B:10:0x002d, B:12:0x0039, B:14:0x003f, B:15:0x004b, B:16:0x0052, B:26:0x0017), top: B:3:0x0002, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized WebResourceResponse proxiedRequestStrategy(Object obj, String str, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        URI uri;
        String[] split;
        webResourceResponse = null;
        try {
            split = str.split("\\?");
        } catch (Exception e) {
            e.getMessage().getClass();
            SVG svg = Fillr.getInstance().fillrConfig;
        }
        if (split.length > 0) {
            uri = new URI(split[0]);
            if (uri != null && FillrWebView.isRunningProxyForView(obj)) {
                if (CertificateRegistry.generateSelfSignedCertificate(uri.getHost(), WebviewProxy.KEY_PAIR) == null) {
                    if (webResourceRequest.isForMainFrame()) {
                        uri.getHost();
                        FillrWebView.resetTlsStateForHost(obj);
                        SVG svg2 = Fillr.getInstance().fillrConfig;
                    }
                    SVG svg3 = Fillr.getInstance().fillrConfig;
                } else {
                    SVG svg4 = Fillr.getInstance().fillrConfig;
                    webResourceResponse = defaultInterceptionStrategy(str, webResourceRequest);
                }
            }
        }
        uri = null;
        if (uri != null) {
            if (CertificateRegistry.generateSelfSignedCertificate(uri.getHost(), WebviewProxy.KEY_PAIR) == null) {
            }
        }
        return webResourceResponse;
    }

    @Override // com.fillr.n.a
    public final boolean shouldBypassProxy() {
        SVG svg = Fillr.getInstance().fillrConfig;
        return true;
    }

    @Override // com.fillr.n.a
    public final boolean shouldIntercept(WebResourceRequest webResourceRequest) {
        return true;
    }
}

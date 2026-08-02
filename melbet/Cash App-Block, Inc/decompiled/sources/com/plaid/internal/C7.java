package com.plaid.internal;

import android.webkit.WebResourceResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C7 {
    public static final String a(WebResourceResponse webResourceResponse) {
        webResourceResponse.getClass();
        String mimeType = webResourceResponse.getMimeType();
        String encoding2 = webResourceResponse.getEncoding();
        int statusCode = webResourceResponse.getStatusCode();
        String reasonPhrase = webResourceResponse.getReasonPhrase();
        Map<String, String> responseHeaders = webResourceResponse.getResponseHeaders();
        InputStream data = webResourceResponse.getData();
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WebResourceResponse{, MimeType='", mimeType, "', Encoding='", encoding2, "', StatusCode=");
        m.append(statusCode);
        m.append(", ReasonPhrase='");
        m.append(reasonPhrase);
        m.append("', ResponseHeaders=");
        m.append(responseHeaders);
        m.append(", data=");
        m.append(data);
        m.append("}");
        return m.toString();
    }
}

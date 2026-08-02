package com.bugsnag.android;

import android.net.Uri;
import com.bugsnag.android.JsonStream;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class Request extends AbstractHttpEntity implements JsonStream.Streamable {
    public final String httpMethod;
    public final String httpVersion;
    public final LinkedHashMap params;
    public String url;

    public Request(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.params = linkedHashMap;
        this.httpMethod = str2;
        this.httpVersion = str;
        if (str3 == null) {
            this.url = "";
            linkedHashMap.clear();
            return;
        }
        int indexOf = str3.indexOf(63);
        if (indexOf <= 0) {
            this.url = str3;
            return;
        }
        try {
            tryUrlWithQueryString(str3);
        } catch (RuntimeException unused) {
            this.url = str3.substring(0, indexOf);
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        jsonStream.name("httpMethod");
        jsonStream.value(this.httpMethod);
        jsonStream.name("httpVersion");
        jsonStream.value(this.httpVersion);
        jsonStream.name("url");
        jsonStream.value(this.url);
        jsonStream.name("body");
        jsonStream.value(this.body);
        long j = this.bodyLength;
        if (j >= 0) {
            jsonStream.name("bodyLength");
            jsonStream.value(j);
        }
        jsonStream.name("headers");
        jsonStream.value(this.headers, true);
        jsonStream.name("params");
        jsonStream.value(this.params, true);
        jsonStream.endObject();
    }

    public final void tryUrlWithQueryString(String str) {
        Uri parse = Uri.parse(str);
        LinkedHashMap linkedHashMap = this.params;
        linkedHashMap.clear();
        for (String str2 : parse.getQueryParameterNames()) {
            linkedHashMap.put(str2, parse.getQueryParameter(str2));
        }
        this.url = parse.buildUpon().clearQuery().build().toString();
    }
}

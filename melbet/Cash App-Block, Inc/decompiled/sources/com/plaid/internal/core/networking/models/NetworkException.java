package com.plaid.internal.core.networking.models;

import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/plaid/internal/core/networking/models/NetworkException;", "", "a", "networking_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkException extends Throwable {
    public static final /* synthetic */ int c = 0;
    public final String a;
    public final String b;

    public static final class a {
        public static NetworkException a(Request request, Response response) {
            request.getClass();
            response.getClass();
            HttpUrl httpUrl = request.url;
            String concat = "Request failed - ".concat(httpUrl.encodedPath());
            int i = response.code;
            ResponseBody responseBody = response.body;
            return new NetworkException(concat, StringsKt__IndentKt.replaceIndent("\n        \n        \n        Url: " + httpUrl + "\n        Response code: " + i + "\n        Error message: " + (responseBody != null ? new com.plaid.internal.core.networking.models.a(responseBody) : null) + "\n        \n        Stacktrace:\n      "));
        }
    }

    public NetworkException(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}

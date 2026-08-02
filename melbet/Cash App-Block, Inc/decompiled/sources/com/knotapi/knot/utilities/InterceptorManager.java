package com.knotapi.knot.utilities;

import android.net.Uri;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Set;

/* loaded from: classes4.dex */
public class InterceptorManager {
    public static String replaceUrlParameter(String str, String str2, String str3) {
        try {
            Uri parse = Uri.parse(URLDecoder.decode(str, StandardCharsets.UTF_8.name()));
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str4 : queryParameterNames) {
                clearQuery.appendQueryParameter(str4, str4.equals(str2) ? str3 : parse.getQueryParameter(str4));
            }
            return clearQuery.build().toString();
        } catch (Exception unused) {
            return str;
        }
    }
}

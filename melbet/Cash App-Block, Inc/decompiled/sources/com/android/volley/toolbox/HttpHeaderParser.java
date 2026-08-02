package com.android.volley.toolbox;

import android.util.Log;
import com.android.volley.Cache$Entry;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyLog;
import com.squareup.cash.clientroutes.ClientRoute;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract class HttpHeaderParser {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLimits.deepLinkSpecs;
    }

    public static Cache$Entry parseCacheHeaders(NetworkResponse networkResponse) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = (Map) networkResponse.headers;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long parseDateAsEpoch = str != null ? parseDateAsEpoch(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long parseDateAsEpoch2 = str3 != null ? parseDateAsEpoch(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = currentTimeMillis;
            j5 = parseDateAsEpoch(str4);
        } else {
            j4 = currentTimeMillis;
            j5 = j;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j8 = (j2 * 1000) + j4;
            j7 = z ? j8 : (j3 * 1000) + j8;
            j6 = j8;
        } else {
            j6 = (parseDateAsEpoch <= j || parseDateAsEpoch2 < parseDateAsEpoch) ? j : (parseDateAsEpoch2 - parseDateAsEpoch) + j4;
            j7 = j6;
        }
        Cache$Entry cache$Entry = new Cache$Entry();
        cache$Entry.data = (byte[]) networkResponse.data;
        cache$Entry.etag = str5;
        cache$Entry.softTtl = j6;
        cache$Entry.ttl = j7;
        cache$Entry.serverDate = parseDateAsEpoch;
        cache$Entry.lastModified = j5;
        cache$Entry.responseHeaders = map;
        cache$Entry.allResponseHeaders = (List) networkResponse.allHeaders;
        return cache$Entry;
    }

    public static String parseCharset(Map map) {
        String str;
        if (map == null || (str = (String) map.get("Content-Type")) == null) {
            return "utf-8";
        }
        String[] split = str.split(";", 0);
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=", 0);
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return "utf-8";
    }

    public static long parseDateAsEpoch(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                VolleyLog.v("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", VolleyLog.buildMessage("Unable to parse dateStr: %s, falling back to 0", str), e);
            return 0L;
        }
    }
}

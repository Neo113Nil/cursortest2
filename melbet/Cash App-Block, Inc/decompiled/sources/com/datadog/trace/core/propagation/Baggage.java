package com.datadog.trace.core.propagation;

import com.datadog.trace.api.Platform;
import com.datadog.trace.util.PercentEscaper;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Baggage {
    public static final PercentEscaper UTF_ESCAPER = new PercentEscaper();
    public final HashMap values = new HashMap();

    public static Baggage from(String str) {
        if (str == null) {
            return new Baggage();
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            indexOf = str.length();
        }
        int indexOf2 = str.indexOf(61);
        Baggage baggage = new Baggage();
        int i = 0;
        while (indexOf2 != -1) {
            if (indexOf2 > indexOf) {
                return new Baggage();
            }
            String trim = str.substring(i, indexOf2).trim();
            try {
                trim = URLDecoder.decode(trim, "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            }
            String trim2 = str.substring(indexOf2 + 1, indexOf).trim();
            try {
                trim2 = URLDecoder.decode(trim2, "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException unused2) {
            }
            if (trim.isEmpty() || trim2.isEmpty()) {
                return new Baggage();
            }
            baggage.values.put(trim, trim2);
            i = indexOf + 1;
            indexOf2 = str.indexOf(61, i);
            indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
        }
        return baggage;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry entry : new HashMap(this.values).entrySet()) {
            if (i > 0) {
                sb.append(',');
            }
            String str = (String) entry.getKey();
            boolean[] zArr = PercentEscaper.unsafeKeyOctets;
            UTF_ESCAPER.getClass();
            Platform.JvmRuntime escape = PercentEscaper.escape(str, zArr);
            Platform.JvmRuntime escape2 = PercentEscaper.escape((String) entry.getValue(), PercentEscaper.unsafeValOctets);
            sb.append(escape.vendorVersion);
            sb.append('=');
            sb.append(escape2.vendorVersion);
            i++;
        }
        return sb.toString();
    }
}

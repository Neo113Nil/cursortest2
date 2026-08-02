package com.fillr.core.apiclientv2;

import android.net.TrafficStats;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public enum APIEndpoint {
    GET_MAPPED_FIELDS(1, "mappings", "MappingFields", 3),
    FILL_PERFORMANCE_STAT(2, "filled", "Send Fill performance stats", 3),
    GET_PLACE_DETAILS(4, "place/details/json", "Google Place API Request", 1),
    GET_PARSED_ADDRESS(6, "address/parse", "Fillr Address Parser", 3),
    PAGE_EVENT(7, "page-event", "Send page events", 3),
    GET_PLACE_AUTOCOMPLETE(8, "place/autocomplete/json", "Google Places Autocomplete Request", 1),
    AFFILIATES(9, "affiliates", "Get affiliate links", 3);

    public final int mCode;
    public final String mDescription;
    public final String mEndPoint;
    public final int mMethod;
    public static final EnumSet GOOGLE_PLACES_APIS = EnumSet.of(GET_PLACE_DETAILS, GET_PLACE_AUTOCOMPLETE);

    /* renamed from: com.fillr.core.apiclientv2.APIEndpoint$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$fillr$core$apiclientv2$APIEndpoint$Method;

        static {
            int[] iArr = new int[CameraSelector$$ExternalSyntheticOutline0.values(4).length];
            $SwitchMap$com$fillr$core$apiclientv2$APIEndpoint$Method = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fillr$core$apiclientv2$APIEndpoint$Method[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fillr$core$apiclientv2$APIEndpoint$Method[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fillr$core$apiclientv2$APIEndpoint$Method[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    APIEndpoint(int i, String str, String str2, int i2) {
        this.mCode = i;
        this.mEndPoint = str;
        this.mDescription = str2;
        this.mMethod = i2;
    }

    public final String getEndpointPath() {
        Matcher matcher = Pattern.compile("\\{([^}]*)\\}").matcher(this.mEndPoint);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, "{" + matcher.group(1) + "}");
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final HttpURLConnection getHttpRequest(String str, URL url) {
        TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        int i = this.mMethod;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        httpURLConnection.setRequestMethod(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : "DELETE" : "POST" : "PUT" : "GET");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        int i2 = AnonymousClass1.$SwitchMap$com$fillr$core$apiclientv2$APIEndpoint$Method[CameraSelector$$ExternalSyntheticOutline0.ordinal(i)];
        if (i2 != 2 && i2 != 3) {
            return httpURLConnection;
        }
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
        new DataOutputStream(httpURLConnection.getOutputStream()).write(bytes);
        return httpURLConnection;
    }
}

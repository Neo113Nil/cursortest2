package bo.app;

import android.net.TrafficStats;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.AppUpdateData;

/* loaded from: classes3.dex */
public final class w8 {
    public static final int b = 15000;
    public final int a;

    public w8(int i) {
        this.a = i;
    }

    public final HttpURLConnection a(URL url, JSONObject jSONObject, Map map) {
        url.getClass();
        jSONObject.getClass();
        map.getClass();
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        byte[] bytes = jSONObject2.getBytes(forName);
        bytes.getClass();
        HttpURLConnection a = wg.a.a(url);
        for (Map.Entry entry : map.entrySet()) {
            a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        a.setConnectTimeout(b);
        a.setReadTimeout(this.a);
        a.setUseCaches(false);
        a.setInstanceFollowRedirects(false);
        a.setRequestMethod("POST");
        a.setDoOutput(true);
        a.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = a.getOutputStream();
        try {
            outputStream.write(bytes);
            outputStream.close();
            return a;
        } finally {
        }
    }

    public static final String a(kd kdVar) {
        return "Failed request to [" + kdVar + "]";
    }

    public final n9 a(kd kdVar, Map map, JSONObject jSONObject) {
        kdVar.getClass();
        map.getClass();
        jSONObject.getClass();
        TrafficStats.setThreadStatsTag(1337);
        URL url = kdVar.c;
        Map map2 = EmptyMap.INSTANCE;
        map2.getClass();
        int i = -1;
        try {
            HttpURLConnection a = a(url, jSONObject, map);
            i = a.getResponseCode();
            Map<String, List<String>> headerFields = a.getHeaderFields();
            headerFields.getClass();
            map2 = com.braze.support.h.a(headerFields);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(v8.a(a), Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                String readText = AppUpdateData.readText(bufferedReader);
                bufferedReader.close();
                return new n9(i, map2, new JSONObject(readText));
            } finally {
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w8$$ExternalSyntheticLambda0(kdVar, 0), 4, (Object) null);
            return new n9(i, map2, 4);
        }
    }
}

package bo.app;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public abstract class v8 {
    public static FilterInputStream a(HttpURLConnection httpURLConnection) {
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode / 100 == 2) {
            return "gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding()) ? new GZIPInputStream(httpURLConnection.getInputStream()) : new BufferedInputStream(httpURLConnection.getInputStream());
        }
        throw new ab("Bad HTTP response code from Braze: [" + responseCode + "] to url: " + httpURLConnection.getURL());
    }
}

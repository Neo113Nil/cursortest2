package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.SSLException;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class op {
    public final String a;
    public final String b;

    public /* synthetic */ op(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
    }

    public xen a() {
        m3o m3oVar;
        String str = this.b;
        URLConnection openConnection = new URL(this.a).openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        int i = 2;
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty(HttpMessage.CONTENT_TYPE_HEADER, "application/x-www-form-urlencoded");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                bytes.getClass();
                outputStream.write(bytes);
                outputStream.close();
                outputStream.close();
                m3oVar = new m3o(null, httpURLConnection.getResponseCode(), 2);
            } finally {
            }
        } catch (Throwable th) {
            try {
                m3o m3oVar2 = new m3o(th, 0, 1);
                httpURLConnection.disconnect();
                m3oVar = m3oVar2;
            } finally {
                httpURLConnection.disconnect();
            }
        }
        Object obj = m3oVar.b;
        if (obj == null || !(obj instanceof Throwable)) {
            return new xen(m3oVar.a);
        }
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof SSLException) {
            i = 3;
        } else if (!(th2 instanceof IOException)) {
            i = 1;
        }
        return new xen(i, null);
    }

    public op(String str, String str2, aaw aawVar) {
        this.a = str;
        this.b = str2;
    }

    public op(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}

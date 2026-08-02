package defpackage;

import android.net.Uri;
import com.connectsdk.etc.helper.HttpMessage;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public class sr1 {
    public final String a;
    public final Uri b;
    public final qzc c;
    public String f;
    public long h;
    public final boolean d = true;
    public int e = 30000;
    public int g = -1;

    public sr1(Uri uri, String str) {
        this.c = new qzc(2, (byte) 0);
        this.a = str;
        this.b = uri;
        qzc qzcVar = new qzc(2, (byte) 0);
        this.c = qzcVar;
        if (uri != null) {
            String host = uri.getHost();
            if (uri.getPort() != -1) {
                StringBuilder m = tlm.m(host, StringUtils.PROCESS_POSTFIX_DELIMITER);
                m.append(uri.getPort());
                host = m.toString();
            }
            if (host != null) {
                qzcVar.H("Host", host);
            }
        }
        String property = System.getProperty("http.agent");
        if (property == null) {
            property = "Java" + System.getProperty("java.version");
        }
        qzcVar.H(HttpMessage.USER_AGENT, property);
        qzcVar.H("Accept-Encoding", "gzip, deflate");
        qzcVar.H("Connection", "keep-alive");
        qzcVar.H("Accept", "*/*");
    }

    public final String toString() {
        qzc qzcVar = this.c;
        return qzcVar == null ? super.toString() : qzcVar.I(this.b.toString());
    }
}

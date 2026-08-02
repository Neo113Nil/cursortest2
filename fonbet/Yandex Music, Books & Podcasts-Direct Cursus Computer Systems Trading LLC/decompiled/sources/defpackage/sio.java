package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class sio {
    public final zde a;

    static {
        new sio(new z6n(4));
    }

    public sio(z6n z6nVar) {
        zde zdeVar;
        xk5 xk5Var = (xk5) ((qzc) z6nVar.b).b;
        if (xk5Var == null) {
            zdeVar = a5b.f;
        } else {
            Collection entrySet = xk5Var.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                zdeVar = a5b.f;
            } else {
                vk5 vk5Var = (vk5) entrySet;
                x0 x0Var = new x0(vk5Var.b.size());
                Iterator it = vk5Var.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    qsn f = ((tde) entry.getValue()).f();
                    x0Var.V(key, f);
                    i += f.d;
                }
                zdeVar = new zde((vsn) x0Var.r(), i);
            }
        }
        this.a = zdeVar;
    }

    public static String a(String str) {
        return ltg.C(str, "Accept") ? "Accept" : ltg.C(str, "Allow") ? "Allow" : ltg.C(str, "Authorization") ? "Authorization" : ltg.C(str, "Bandwidth") ? "Bandwidth" : ltg.C(str, "Blocksize") ? "Blocksize" : ltg.C(str, "Cache-Control") ? "Cache-Control" : ltg.C(str, "Connection") ? "Connection" : ltg.C(str, "Content-Base") ? "Content-Base" : ltg.C(str, "Content-Encoding") ? "Content-Encoding" : ltg.C(str, "Content-Language") ? "Content-Language" : ltg.C(str, "Content-Length") ? "Content-Length" : ltg.C(str, "Content-Location") ? "Content-Location" : ltg.C(str, HttpMessage.CONTENT_TYPE_HEADER) ? HttpMessage.CONTENT_TYPE_HEADER : ltg.C(str, "CSeq") ? "CSeq" : ltg.C(str, "Date") ? "Date" : ltg.C(str, "Expires") ? "Expires" : ltg.C(str, "Location") ? "Location" : ltg.C(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : ltg.C(str, "Proxy-Require") ? "Proxy-Require" : ltg.C(str, "Public") ? "Public" : ltg.C(str, "Range") ? "Range" : ltg.C(str, "RTP-Info") ? "RTP-Info" : ltg.C(str, "RTCP-Interval") ? "RTCP-Interval" : ltg.C(str, "Scale") ? "Scale" : ltg.C(str, "Session") ? "Session" : ltg.C(str, "Speed") ? "Speed" : ltg.C(str, "Supported") ? "Supported" : ltg.C(str, "Timestamp") ? "Timestamp" : ltg.C(str, "Transport") ? "Transport" : ltg.C(str, HttpMessage.USER_AGENT) ? HttpMessage.USER_AGENT : ltg.C(str, "Via") ? "Via" : ltg.C(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final String b(String str) {
        yde d = this.a.d(a(str));
        if (d.isEmpty()) {
            return null;
        }
        return (String) ild.x(d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sio) {
            return this.a.equals(((sio) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

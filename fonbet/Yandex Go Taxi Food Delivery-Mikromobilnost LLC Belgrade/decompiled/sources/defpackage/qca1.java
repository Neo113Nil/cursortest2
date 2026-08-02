package defpackage;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.c63;

/* loaded from: classes7.dex */
public abstract class qca1 {
    public static volatile g191 a;
    public static final Object b = new Object();

    public static gl61 a(SSLException sSLException) {
        String str;
        String message = sSLException.getMessage();
        String lowerCase = message != null ? message.toLowerCase(Locale.ROOT) : "";
        String str2 = ((sSLException instanceof SSLHandshakeException) || evu0.y(lowerCase, "handshake", false)) ? "ssl_handshake" : evu0.y(lowerCase, "certificate", false) ? "ssl_certificate" : evu0.y(lowerCase, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, false) ? "ssl_protocol" : "ssl_error";
        int hashCode = str2.hashCode();
        if (hashCode == -1027298332) {
            if (str2.equals("ssl_certificate")) {
                str = "SSL certificate error";
            }
            str = "SSL error";
        } else if (hashCode != 362550660) {
            if (hashCode == 821366635 && str2.equals("ssl_protocol")) {
                str = "SSL protocol error";
            }
            str = "SSL error";
        } else {
            if (str2.equals("ssl_handshake")) {
                str = "SSL handshake error";
            }
            str = "SSL error";
        }
        c63 c63Var = c63.g;
        if (message == null) {
            message = str;
        }
        return new gl61(c63Var, str2, message, null);
    }

    public static final d9g0 b(h9g0 h9g0Var) {
        g9g0 g9g0Var = h9g0Var.a;
        f9g0 f9g0Var = g9g0Var instanceof f9g0 ? (f9g0) g9g0Var : null;
        if (f9g0Var instanceof d9g0) {
            return (d9g0) f9g0Var;
        }
        return null;
    }

    public static final e9g0 c(h9g0 h9g0Var) {
        g9g0 g9g0Var = h9g0Var.a;
        f9g0 f9g0Var = g9g0Var instanceof f9g0 ? (f9g0) g9g0Var : null;
        if (f9g0Var instanceof e9g0) {
            return (e9g0) f9g0Var;
        }
        return null;
    }

    public static final void d(Exception exc, String str) {
        String d = qoi0.a(exc.getClass()).d();
        String concat = d != null ? Extension.DOT_CHAR.concat(d) : null;
        if (concat == null) {
            concat = "";
        }
        jst.e.h(null, str.concat(concat), exc);
    }
}

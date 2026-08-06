package L1;

import J1.x;
import J1.y;

/* loaded from: classes.dex */
public final class a {
    public static final y a(y yVar) {
        if ((yVar == null ? null : yVar.f1006g) == null) {
            return yVar;
        }
        x b2 = yVar.b();
        b2.f993g = null;
        return b2.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}

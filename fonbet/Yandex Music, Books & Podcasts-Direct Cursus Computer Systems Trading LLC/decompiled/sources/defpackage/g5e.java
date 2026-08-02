package defpackage;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class g5e {
    public static final Logger a = Logger.getLogger(d5e.class.getName());
    public static final pn3 b;

    static {
        pn3 pn3Var = pn3.d;
        b = ovn.C("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(ikn iknVar) {
        return (iknVar.readByte() & 255) | ((iknVar.readByte() & 255) << 16) | ((iknVar.readByte() & 255) << 8);
    }

    public static int b(short s, int i, byte b2) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public static void c(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}

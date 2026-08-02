package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public abstract class oe4 {
    public static final Charset a;

    static {
        Charset.forName("ISO-8859-1");
        Charset.forName("US-ASCII");
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        a = Charset.forName("UTF-8");
    }
}

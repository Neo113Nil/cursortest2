package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes9.dex */
public abstract class uza {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final Charset e;
    public static volatile Charset f;
    public static volatile Charset g;

    static {
        Charset.forName("UTF-16");
        b = Charset.forName("UTF-16BE");
        c = Charset.forName("UTF-16LE");
        d = Charset.forName("US-ASCII");
        e = Charset.forName("ISO-8859-1");
    }
}

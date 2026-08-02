package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes3.dex */
public abstract class blr {
    public static final Charset a = Charset.defaultCharset();
    public static final Charset b = Charset.forName("SJIS");

    static {
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused) {
        }
        Charset forName = Charset.forName("EUC_JP");
        Charset charset = b;
        Charset charset2 = a;
        if (charset.equals(charset2)) {
            return;
        }
        forName.equals(charset2);
    }
}

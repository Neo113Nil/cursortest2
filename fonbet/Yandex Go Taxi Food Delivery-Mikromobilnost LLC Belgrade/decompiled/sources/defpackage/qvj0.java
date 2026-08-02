package defpackage;

import java.nio.charset.Charset;
import kotlin.Pair;
import okio.ByteString;

/* loaded from: classes9.dex */
public final class qvj0 {
    public static pvj0 a(wg10 wg10Var, ByteString byteString) {
        yp6 yp6Var = new yp6();
        yp6Var.b0(byteString);
        return new pvj0(wg10Var, byteString.h(), yp6Var);
    }

    public static pvj0 b(String str, wg10 wg10Var) {
        Pair a = sqw.a(wg10Var);
        Charset charset = (Charset) a.getFirst();
        wg10 wg10Var2 = (wg10) a.getSecond();
        yp6 yp6Var = new yp6();
        yp6Var.v0(str, 0, str.length(), charset);
        return new pvj0(wg10Var2, yp6Var.b, yp6Var);
    }
}

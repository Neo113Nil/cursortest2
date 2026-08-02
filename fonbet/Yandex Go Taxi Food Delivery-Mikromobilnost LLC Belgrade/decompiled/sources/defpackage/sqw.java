package defpackage;

import java.nio.charset.Charset;
import kotlin.Pair;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public abstract class sqw {
    public static final Pair a(wg10 wg10Var) {
        Charset charset = uza.a;
        if (wg10Var != null) {
            Regex regex = wg10.e;
            Charset a = wg10Var.a(null);
            if (a == null) {
                try {
                    wg10Var = qje.o(wg10Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    wg10Var = null;
                }
            } else {
                charset = a;
            }
        }
        return new Pair(charset, wg10Var);
    }
}

package defpackage;

import java.util.Locale;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class spi0 extends of8 {
    @Override // defpackage.of8
    public final up8 b(nf8 nf8Var) {
        if (new Regex("^((\\+7|7|8)+([0-9]){10})$").h(((jl8) nf8Var).a.toLowerCase(Locale.US))) {
            return null;
        }
        return up8.b;
    }
}

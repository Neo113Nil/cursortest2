package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vi70 {
    public final mi31 a;
    public final bj70 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public vi70(mi31 mi31Var, bj70 bj70Var, boolean z, boolean z2, boolean z3) {
        this.a = mi31Var;
        this.b = bj70Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static wi70 a(vi70 vi70Var, CharSequence charSequence, boolean z) {
        CharSequence charSequence2;
        if (vi70Var.d) {
            return hay.g(charSequence, "", vi70Var.b, z, 8);
        }
        if ("".length() == 0) {
            charSequence2 = charSequence;
        } else {
            charSequence2 = ((Object) charSequence) + Extension.FIX_SPACE + ((Object) "");
        }
        return new wi70(charSequence, "", charSequence2, bj70.e, false, false, z);
    }
}

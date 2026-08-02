package yads;

import defpackage.zi71;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class lb3 extends RuntimeException {
    public final zi71 b;
    public final kb3 c;

    public lb3(zi71 zi71Var, kb3 kb3Var) {
        super("Verification not executed with reason = ".concat(kb3Var.name().toLowerCase(Locale.US)));
        this.b = zi71Var;
        this.c = kb3Var;
    }
}

package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class jwd {
    public final jyr a;

    public jwd(Context context) {
        ly4 ly4Var = new ly4();
        if (ly4Var.a != null) {
            xq0.q("Di already initialized");
            throw null;
        }
        o18 o18Var = new o18();
        o18Var.c = hag.I(fw1.class);
        rp7 rp7Var = o18Var.b;
        rp7Var.getClass();
        rp7Var.E(new kwd(context, 0));
        ly4Var.a = new qdc(new ix6(o18Var.a));
        this.a = ly4Var.b(hag.I(fw1.class), true);
    }
}

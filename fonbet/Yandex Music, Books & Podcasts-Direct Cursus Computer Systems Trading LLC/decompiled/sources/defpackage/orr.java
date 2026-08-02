package defpackage;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class orr {
    public final Context a;
    public final jyr b;
    public final jyr c;
    public final tf6 d;
    public final HashMap e;

    public orr(Context context) {
        this.a = context;
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(tc.class), true);
        this.d = gld.e(dm6.b);
        this.e = new HashMap();
    }

    public final pst a() {
        xxq c = ((frt) this.b.getValue()).c();
        c.getClass();
        return new pst(this.a, c.a, "support_info");
    }
}

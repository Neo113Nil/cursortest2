package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import yads.jk3;

/* loaded from: classes7.dex */
public final class w071 {
    public final dy61 a;
    public final Context b;
    public final xl81 c;
    public final HashMap d;
    public final HashMap e;
    public final Handler f;
    public jy31 g;

    public w071(dy61 dy61Var, Context context) {
        xl81 xl81Var = new xl81();
        this.a = dy61Var;
        this.b = context;
        this.c = xl81Var;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new Handler(Looper.getMainLooper());
    }

    public final void a(String str, ki61 ki61Var, Drawable drawable, jk3 jk3Var) {
        this.e.put(str, new lm61(ki61Var, drawable, jk3Var));
        if (this.g == null) {
            jy31 jy31Var = new jy31(17, this);
            this.f.postDelayed(jy31Var, 100L);
            this.g = jy31Var;
        }
    }
}

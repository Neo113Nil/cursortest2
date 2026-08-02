package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.a;
import yads.wi0;

/* loaded from: classes7.dex */
public final class rs81 implements lml {
    public final Context b;
    public final i3y c;

    public rs81(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext != null ? applicationContext : context;
        this.c = a.a(new wi0(this));
    }

    @Override // defpackage.lml
    public final Typeface a() {
        z771 z771Var = (z771) this.c.getValue();
        if (z771Var != null) {
            return z771Var.b;
        }
        return null;
    }

    @Override // defpackage.lml
    public final Typeface b() {
        z771 z771Var = (z771) this.c.getValue();
        if (z771Var != null) {
            return z771Var.c;
        }
        return null;
    }

    @Override // defpackage.lml
    public final Typeface c() {
        Typeface typeface;
        z771 z771Var = (z771) this.c.getValue();
        return (z771Var == null || (typeface = z771Var.d) == null) ? Typeface.DEFAULT_BOLD : typeface;
    }

    @Override // defpackage.lml
    public final Typeface getLight() {
        z771 z771Var = (z771) this.c.getValue();
        if (z771Var != null) {
            return z771Var.a;
        }
        return null;
    }
}

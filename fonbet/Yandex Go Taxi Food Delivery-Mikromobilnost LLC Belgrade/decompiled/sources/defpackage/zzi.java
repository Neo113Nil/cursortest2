package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class zzi {
    public final qgu0 a;
    public final xam b;
    public final tk51 c;
    public final hbm d;
    public final int e = yyg0.ic_pin_destination_picker;

    public zzi(qgu0 qgu0Var, xam xamVar, tk51 tk51Var, hbm hbmVar) {
        this.a = qgu0Var;
        this.b = xamVar;
        this.c = tk51Var;
        this.d = hbmVar;
    }

    public final Drawable a(String str) {
        Drawable t = vng.t(this.e, this.b.a);
        if (str != null && str.length() != 0) {
            this.d.getClass();
            Integer S = q5z.S(str);
            if (S != null) {
                int intValue = S.intValue();
                if (t == null) {
                    return null;
                }
                t.mutate();
                t.setTint(intValue);
            }
        }
        return t;
    }

    public final Drawable b(String str) {
        Drawable a = this.a.a();
        return (str == null || str.length() == 0) ? a : this.d.a(str, a);
    }

    public final Drawable c(String str) {
        tk51 tk51Var = this.c;
        Drawable a = tk51Var.b.d ? tk51Var.a(f1h0.ic_destination_pin_two_flag_24) : tk51Var.b.a() ? tk51Var.a(f1h0.ic_destination_pin_two_flag_24) : null;
        if (a != null) {
            return a;
        }
        Drawable a2 = this.a.a();
        return (str == null || str.length() == 0) ? a2 : this.d.a(str, a2);
    }
}

package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class wdt0 {
    public final tk51 a;
    public final xam b;
    public final hbm c;

    public wdt0(tk51 tk51Var, xam xamVar, hbm hbmVar) {
        this.a = tk51Var;
        this.b = xamVar;
        this.c = hbmVar;
    }

    public final Drawable a(String str) {
        xam xamVar = this.b;
        if (str == null || evu0.J(str)) {
            return vng.t(yyg0.ic_summary_source_point, xamVar.a);
        }
        return this.c.a(str, vng.t(yyg0.ic_summary_source_point, xamVar.a));
    }

    public final Drawable b(String str) {
        xam xamVar = this.b;
        if (str == null || evu0.J(str)) {
            return vng.t(yyg0.ic_order_card_source, xamVar.a);
        }
        return this.c.a(str, vng.t(yyg0.ic_order_card_source, xamVar.a));
    }

    public final Drawable c(String str) {
        tk51 tk51Var = this.a;
        Drawable a = tk51Var.b.d ? tk51Var.a(q2h0.ic_transport_source) : tk51Var.b.a() ? tk51Var.a(f1h0.ic_source_pin_24) : null;
        if (a != null) {
            return a;
        }
        if (str == null || evu0.J(str)) {
            return vng.t(yyg0.ic_order_card_source, this.b.a);
        }
        return this.c.a(str, vng.t(yyg0.ic_order_card_source, this.b.a));
    }
}

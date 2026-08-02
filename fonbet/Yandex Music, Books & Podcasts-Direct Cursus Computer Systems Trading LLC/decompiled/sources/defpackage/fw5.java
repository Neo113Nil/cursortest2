package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class fw5 {
    public final gs4 a;

    public fw5(gs4 gs4Var) {
        this.a = gs4Var;
    }

    public final uu5 a() {
        htr htrVar;
        gs4 gs4Var = this.a;
        Context context = (Context) ((jyr) gs4Var.d).getValue();
        wy5 wy5Var = (wy5) gs4Var.b;
        ((o6c) gs4Var.e).getClass();
        quk qukVar = htr.f;
        String language = swf.I().getLanguage();
        language.getClass();
        qukVar.getClass();
        int hashCode = language.hashCode();
        if (hashCode == 3424) {
            if (language.equals("kk")) {
                htrVar = htr.j;
            }
            htrVar = htr.g;
        } else if (hashCode != 3651) {
            if (hashCode == 3749 && language.equals("uz")) {
                htrVar = htr.i;
            }
            htrVar = htr.g;
        } else {
            if (language.equals("ru")) {
                htrVar = htr.h;
            }
            htrVar = htr.g;
        }
        return new uu5(context, wy5Var, htrVar.c, (ju5) ((jyr) gs4Var.c).getValue());
    }

    public final fu5 b() {
        return new fu5(this.a, a());
    }
}

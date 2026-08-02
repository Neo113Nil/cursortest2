package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class p37 implements gfu {
    public final x3n a;
    public final String b;
    public final aro c;
    public final vx6 d;
    public final SharedPreferences e;
    public final String f;
    public final k1o g;
    public final g0c h;
    public final hpo i;

    public p37(vx6 vx6Var, g0c g0cVar, x3n x3nVar, k1o k1oVar, hpo hpoVar, aro aroVar, SharedPreferences sharedPreferences, String str, String str2) {
        this.a = x3nVar;
        this.b = str;
        this.c = aroVar;
        this.d = vx6Var;
        this.e = sharedPreferences;
        this.f = str2;
        this.g = k1oVar;
        this.h = g0cVar;
        this.i = hpoVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        if (!cls.equals(g47.class)) {
            xq0.q("Unknown view model");
            return null;
        }
        return new g47(this.d, this.h, this.a, this.g, this.i, this.c, this.e, this.b, this.f);
    }
}

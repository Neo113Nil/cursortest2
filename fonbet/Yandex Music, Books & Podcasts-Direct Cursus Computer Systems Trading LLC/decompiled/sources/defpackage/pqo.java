package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class pqo implements gfu {
    public final sdk a;
    public final jek b;
    public final String c;
    public final aro d;
    public final SharedPreferences e;
    public final String f;
    public final g0c g;

    public pqo(sdk sdkVar, jek jekVar, String str, aro aroVar, SharedPreferences sharedPreferences, String str2, g0c g0cVar) {
        sdkVar.getClass();
        jekVar.getClass();
        sharedPreferences.getClass();
        g0cVar.getClass();
        this.a = sdkVar;
        this.b = jekVar;
        this.c = str;
        this.d = aroVar;
        this.e = sharedPreferences;
        this.f = str2;
        this.g = g0cVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        if (!cls.equals(rro.class)) {
            xq0.q("Unknown view model");
            return null;
        }
        return new rro(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}

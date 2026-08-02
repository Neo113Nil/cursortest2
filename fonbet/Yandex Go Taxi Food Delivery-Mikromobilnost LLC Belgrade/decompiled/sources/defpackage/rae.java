package defpackage;

/* loaded from: classes6.dex */
public final class rae implements vni {
    public final nde a;
    public final czh b;
    public final up21 c;

    public rae(nde ndeVar, czh czhVar, up21 up21Var) {
        this.a = ndeVar;
        this.b = czhVar;
        this.c = up21Var;
    }

    public final s9e a(boolean z, s9e s9eVar) {
        String str;
        String a = this.c.a();
        if (!z) {
            return s9eVar;
        }
        String str2 = s9eVar != null ? s9eVar.b : null;
        if ((str2 != null && !evu0.J(str2)) || evu0.J(a)) {
            return s9eVar;
        }
        if (s9eVar == null || (str = s9eVar.a) == null) {
            str = "";
        }
        return new s9e(str, a);
    }
}

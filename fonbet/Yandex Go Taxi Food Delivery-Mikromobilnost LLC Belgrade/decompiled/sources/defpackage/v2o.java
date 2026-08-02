package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class v2o {
    public static final w2o a = new w2o(new hy01((z7p) null, (sns0) null, (rf9) null, (tkm0) null, (LinkedHashMap) null, HProv.PP_VERSION_TIMESTAMP));

    public final w2o a(v2o v2oVar) {
        z7p z7pVar = ((w2o) v2oVar).b.a;
        if (z7pVar == null) {
            z7pVar = ((w2o) this).b.a;
        }
        hy01 hy01Var = ((w2o) v2oVar).b;
        sns0 sns0Var = hy01Var.b;
        if (sns0Var == null) {
            sns0Var = ((w2o) this).b.b;
        }
        rf9 rf9Var = hy01Var.c;
        if (rf9Var == null) {
            rf9Var = ((w2o) this).b.c;
        }
        tkm0 tkm0Var = hy01Var.d;
        if (tkm0Var == null) {
            tkm0Var = ((w2o) this).b.d;
        }
        return new w2o(new hy01(z7pVar, sns0Var, rf9Var, tkm0Var, b.n(((w2o) this).b.f, hy01Var.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v2o) && ((w2o) ((v2o) obj)).b.equals(((w2o) this).b);
    }

    public final int hashCode() {
        return ((w2o) this).b.hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        hy01 hy01Var = ((w2o) this).b;
        z7p z7pVar = hy01Var.a;
        sb.append(z7pVar != null ? z7pVar.toString() : null);
        sb.append(",\nSlide - ");
        sns0 sns0Var = hy01Var.b;
        sb.append(sns0Var != null ? sns0Var.toString() : null);
        sb.append(",\nShrink - ");
        rf9 rf9Var = hy01Var.c;
        sb.append(rf9Var != null ? rf9Var.toString() : null);
        sb.append(",\nScale - ");
        tkm0 tkm0Var = hy01Var.d;
        sb.append(tkm0Var != null ? tkm0Var.toString() : null);
        return sb.toString();
    }
}

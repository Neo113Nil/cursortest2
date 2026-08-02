package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class ymo {
    public static final zmo a = new zmo(new hy01((z7p) null, (sns0) null, (rf9) null, (tkm0) null, (LinkedHashMap) null, HProv.PP_VERSION_TIMESTAMP));
    public static final zmo b = new zmo(new hy01((z7p) null, (sns0) null, (rf9) null, (tkm0) null, (LinkedHashMap) null, 95));

    public final zmo a(ymo ymoVar) {
        z7p z7pVar = ((zmo) ymoVar).c.a;
        if (z7pVar == null) {
            z7pVar = ((zmo) this).c.a;
        }
        hy01 hy01Var = ((zmo) ymoVar).c;
        sns0 sns0Var = hy01Var.b;
        if (sns0Var == null) {
            sns0Var = ((zmo) this).c.b;
        }
        rf9 rf9Var = hy01Var.c;
        if (rf9Var == null) {
            rf9Var = ((zmo) this).c.c;
        }
        tkm0 tkm0Var = hy01Var.d;
        if (tkm0Var == null) {
            tkm0Var = ((zmo) this).c.d;
        }
        boolean z = hy01Var.e;
        hy01 hy01Var2 = ((zmo) this).c;
        return new zmo(new hy01(z7pVar, sns0Var, rf9Var, tkm0Var, z || hy01Var2.e, b.n(hy01Var2.f, hy01Var.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ymo) && ((zmo) ((ymo) obj)).c.equals(((zmo) this).c);
    }

    public final int hashCode() {
        return ((zmo) this).c.hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "ExitTransition.None";
        }
        if (equals(b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        hy01 hy01Var = ((zmo) this).c;
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(hy01Var.e);
        return sb.toString();
    }
}

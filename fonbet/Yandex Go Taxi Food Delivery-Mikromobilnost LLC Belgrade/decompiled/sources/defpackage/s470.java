package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class s470 implements ig5 {
    public static final r470 Companion = new r470();
    public static final i3y[] e;
    public final String a;
    public final Boolean b;
    public final vm50 c;
    public final vm50 d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new oi60(26)), a.b(lazyThreadSafetyMode, new oi60(27))};
    }

    public /* synthetic */ s470(int i, String str, Boolean bool, vm50 vm50Var, vm50 vm50Var2) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, q470.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vm50Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = vm50Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s470)) {
            return false;
        }
        s470 s470Var = (s470) obj;
        return jl40.l(this.a, s470Var.a) && jl40.l(this.b, s470Var.b) && jl40.l(this.c, s470Var.c) && jl40.l(this.d, s470Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        vm50 vm50Var = this.c;
        int hashCode3 = (hashCode2 + (vm50Var == null ? 0 : vm50Var.hashCode())) * 31;
        vm50 vm50Var2 = this.d;
        return hashCode3 + (vm50Var2 != null ? vm50Var2.hashCode() : 0);
    }

    public final String toString() {
        return "OpenDeeplinkAction(deeplink=" + this.a + ", universalLinksOnly=" + this.b + ", onSuccess=" + this.c + ", onFail=" + this.d + Extension.C_BRAKE;
    }
}

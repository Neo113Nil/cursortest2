package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rg00 implements tg00 {
    public final lww0 a;

    public rg00(lww0 lww0Var) {
        this.a = lww0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg00) && jl40.l(this.a, ((rg00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SurgeWidgetAction(surgeWidgetUiAction=" + this.a + Extension.C_BRAKE;
    }
}

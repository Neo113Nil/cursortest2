package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zdx0 implements bex0 {
    public final kmq0 a;

    public zdx0(kmq0 kmq0Var) {
        this.a = kmq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdx0) && jl40.l(this.a, ((zdx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectorAction(selectorUiAction=" + this.a + Extension.C_BRAKE;
    }
}

package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class w8x0 implements r9x0 {
    public final v8x0 a;

    public w8x0(v8x0 v8x0Var) {
        this.a = v8x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8x0) && jl40.l(this.a, ((w8x0) obj).a);
    }

    public final int hashCode() {
        v8x0 v8x0Var = this.a;
        if (v8x0Var == null) {
            return 0;
        }
        return v8x0Var.hashCode();
    }

    public final String toString() {
        return "CloseModalAction(closePolicy=" + this.a + Extension.C_BRAKE;
    }
}

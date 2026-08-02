package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vf51 {
    public final fu5 a;

    public vf51(fu5 fu5Var) {
        this.a = fu5Var;
    }

    public final fu5 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf51) && jl40.l(this.a, ((vf51) obj).a);
    }

    public final int hashCode() {
        fu5 fu5Var = this.a;
        if (fu5Var == null) {
            return 0;
        }
        return fu5Var.hashCode();
    }

    public final String toString() {
        return "YBPayloadItem(userWithoutPayCardSheetItem=" + this.a + Extension.C_BRAKE;
    }
}

package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class zjs0 {
    public final tg2 a;

    public zjs0(tg2 tg2Var) {
        this.a = tg2Var;
    }

    public final tg2 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zjs0.class == obj.getClass() && jl40.l(this.a, ((zjs0) obj).a);
    }

    public final int hashCode() {
        tg2 tg2Var = this.a;
        if (tg2Var != null) {
            return tg2Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Animations(onShow=" + this.a + Extension.C_BRAKE;
    }
}

package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class te20 {
    public static final re20 d;
    public static final te20 e;
    public final ee20 a;
    public final re20 b;
    public final boolean c;

    static {
        l76 l76Var = l76.G;
        d = new re20(l76Var, l76Var, l76Var, l76Var);
        e = new te20(vvb1.F, new re20(new ke20(0.0f), new ke20(0.0f), new ke20(0.0f), new ke20(0.0f)), false);
    }

    public te20(ee20 ee20Var, re20 re20Var, boolean z) {
        this.a = ee20Var;
        this.b = re20Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te20)) {
            return false;
        }
        te20 te20Var = (te20) obj;
        return this.a.equals(te20Var.a) && this.b.equals(te20Var.b) && this.c == te20Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MicroWidgetBackgroundSettings(background=");
        sb.append(this.a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", withRipple=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}

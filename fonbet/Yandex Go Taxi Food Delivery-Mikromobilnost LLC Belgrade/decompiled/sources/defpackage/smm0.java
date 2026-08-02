package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class smm0 {
    public final v4v a;
    public final float b;
    public final float c;

    public smm0(v4v v4vVar, float f, float f2) {
        this.a = v4vVar;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smm0)) {
            return false;
        }
        smm0 smm0Var = (smm0) obj;
        return this.a.equals(smm0Var.a) && y7m.b(this.b, smm0Var.b) && y7m.b(this.c, smm0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String c = y7m.c(this.b);
        String c2 = y7m.c(this.c);
        StringBuilder sb = new StringBuilder("ScenarioSelectorImage(image=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(c);
        sb.append(", height=");
        return oyr.t(sb, c2, Extension.C_BRAKE);
    }
}

package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class q930 implements r930 {
    public final g930 a;

    public q930(g930 g930Var) {
        this.a = g930Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q930) && this.a.equals(((q930) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(init=" + this.a + Extension.C_BRAKE;
    }
}

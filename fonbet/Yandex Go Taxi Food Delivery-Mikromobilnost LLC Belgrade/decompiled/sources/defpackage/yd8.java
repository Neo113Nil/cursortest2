package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yd8 implements ae8 {
    public final bq51 a;

    public yd8(bq51 bq51Var) {
        this.a = bq51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd8) && jl40.l(this.a, ((yd8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Card(card=" + this.a + Extension.C_BRAKE;
    }
}

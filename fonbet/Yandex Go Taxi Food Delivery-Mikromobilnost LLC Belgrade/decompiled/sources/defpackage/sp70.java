package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sp70 implements fq70 {
    public final o2y0 a;

    public sp70(o2y0 o2y0Var) {
        this.a = o2y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sp70) && this.a == ((sp70) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CancelOrder(orderHolder=" + this.a + Extension.C_BRAKE;
    }
}

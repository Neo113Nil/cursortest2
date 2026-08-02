package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yd31 implements ge31 {
    public final p011 a;

    public yd31(p011 p011Var) {
        this.a = p011Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd31) && this.a.equals(((yd31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnTransportCardTapped(analyticsData=" + this.a + Extension.C_BRAKE;
    }
}

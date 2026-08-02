package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class yn4 implements uhx0, e6v {
    public final wl4 a;
    public final String b;

    public yn4(wl4 wl4Var) {
        this.a = wl4Var;
        this.b = wl4Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn4) && jl40.l(this.a, ((yn4) obj).a);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BadgesListContentItem(badgeModel=" + this.a + Extension.C_BRAKE;
    }
}

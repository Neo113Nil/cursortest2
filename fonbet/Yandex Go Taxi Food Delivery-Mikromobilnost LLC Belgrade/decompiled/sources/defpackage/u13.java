package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes.dex */
public final class u13 extends kr {
    public static final s13 Companion = new s13();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(25))};
    public final String a;
    public final kr b;

    public /* synthetic */ u13(int i, String str, kr krVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, q13.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u13)) {
            return false;
        }
        u13 u13Var = (u13) obj;
        return jl40.l(this.a, u13Var.a) && jl40.l(this.b, u13Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ApplinkNavigationAction(applink=" + this.a + ", fallbackAction=" + this.b + Extension.C_BRAKE;
    }
}

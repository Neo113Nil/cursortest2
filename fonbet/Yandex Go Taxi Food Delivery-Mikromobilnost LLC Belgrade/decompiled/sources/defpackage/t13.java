package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class t13 extends kr {
    public static final r13 Companion = new r13();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(24))};
    public final String a;
    public final kr b;

    public /* synthetic */ t13(int i, String str, kr krVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, p13.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t13)) {
            return false;
        }
        t13 t13Var = (t13) obj;
        return jl40.l(this.a, t13Var.a) && jl40.l(this.b, t13Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ApplinkNavigationAction(applink=" + this.a + ", fallbackAction=" + this.b + Extension.C_BRAKE;
    }
}

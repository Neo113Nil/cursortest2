package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class xzy0 extends kr {
    public static final wzy0 Companion = new wzy0();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(1)), null, null};
    public final kr a;
    public final long b;
    public final String c;

    public /* synthetic */ xzy0(int i, long j, kr krVar, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, vzy0.a.getDescriptor());
            throw null;
        }
        this.a = krVar;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xzy0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xzy0 xzy0Var = (xzy0) obj;
        return jl40.l(this.a, xzy0Var.a) && this.b == xzy0Var.b && jl40.l(this.c, xzy0Var.c);
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThrottleAction(action=");
        sb.append(this.a);
        sb.append(", throttleMillis=");
        sb.append(this.b);
        return unr0.r(sb, ", actionId=", this.c, Extension.C_BRAKE);
    }
}

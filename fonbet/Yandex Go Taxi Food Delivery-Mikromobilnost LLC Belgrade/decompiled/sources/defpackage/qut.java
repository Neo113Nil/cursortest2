package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class qut implements ig5 {
    public static final put Companion = new put();
    public static final i3y[] d;
    public final vm50 a;
    public final vm50 b;
    public final vm50 c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new sss(27)), a.b(lazyThreadSafetyMode, new sss(28)), a.b(lazyThreadSafetyMode, new sss(29))};
    }

    public /* synthetic */ qut(int i, vm50 vm50Var, vm50 vm50Var2, vm50 vm50Var3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, out.a.getDescriptor());
            throw null;
        }
        this.a = vm50Var;
        this.b = vm50Var2;
        this.c = vm50Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qut)) {
            return false;
        }
        qut qutVar = (qut) obj;
        return jl40.l(this.a, qutVar.a) && jl40.l(this.b, qutVar.b) && jl40.l(this.c, qutVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GooglePayAction(cancelAction=" + this.a + ", failureAction=" + this.b + ", successAction=" + this.c + Extension.C_BRAKE;
    }
}

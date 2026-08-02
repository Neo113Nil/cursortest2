package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class t9s extends kr {
    public static final s9s Companion = new s9s();
    public static final i3y[] e;
    public final u1m a;
    public final ywl b;
    public final Boolean c;
    public final s9i0 d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new v5r(19)), a.b(lazyThreadSafetyMode, new v5r(20)), null, null};
    }

    public t9s(int i, u1m u1mVar, ywl ywlVar, Boolean bool, s9i0 s9i0Var) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, r9s.a.getDescriptor());
            throw null;
        }
        this.a = u1mVar;
        this.b = ywlVar;
        this.c = bool;
        if ((i & 8) != 0) {
            this.d = s9i0Var;
        } else {
            s9i0.Companion.getClass();
            this.d = s9i0.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9s) || !t9s.class.equals(obj.getClass())) {
            return false;
        }
        t9s t9sVar = (t9s) obj;
        return jl40.l(this.a, t9sVar.a) && jl40.l(this.b, t9sVar.b) && jl40.l(this.c, t9sVar.c) && jl40.l(this.d, t9sVar.d);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = (u1mVar != null ? u1mVar.hashCode() : 0) * 31;
        ywl ywlVar = this.b;
        int hashCode2 = (hashCode + (ywlVar != null ? ywlVar.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        return this.d.a.hashCode() + ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ForwardAction(query=" + this.a + ", document=" + this.b + ", animated=" + this.c + ", customProps=" + this.d + Extension.C_BRAKE;
    }
}

package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class w090 extends kr {
    public static final v090 Companion = new v090();
    public static final i3y[] f;
    public final u1m a;
    public final ywl b;
    public final Boolean c;
    public final Boolean d;
    public final s9i0 e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{a.b(lazyThreadSafetyMode, new aw80(9)), a.b(lazyThreadSafetyMode, new aw80(10)), null, null, null};
    }

    public w090(int i, u1m u1mVar, ywl ywlVar, Boolean bool, Boolean bool2, s9i0 s9i0Var) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, u090.a.getDescriptor());
            throw null;
        }
        this.a = u1mVar;
        this.b = ywlVar;
        this.c = bool;
        this.d = bool2;
        if ((i & 16) != 0) {
            this.e = s9i0Var;
        } else {
            s9i0.Companion.getClass();
            this.e = s9i0.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w090.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        w090 w090Var = (w090) obj;
        return jl40.l(this.a, w090Var.a) && jl40.l(this.b, w090Var.b) && jl40.l(this.c, w090Var.c) && jl40.l(this.d, w090Var.d) && jl40.l(this.e, w090Var.e);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = (u1mVar != null ? u1mVar.hashCode() : 0) * 31;
        ywl ywlVar = this.b;
        int hashCode2 = (hashCode + (ywlVar != null ? ywlVar.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.d;
        return this.e.a.hashCode() + ((hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OverlayAction(query=" + this.a + ", document=" + this.b + ", animated=" + this.c + ", fullscreen=" + this.d + ", customProps=" + this.e + Extension.C_BRAKE;
    }
}

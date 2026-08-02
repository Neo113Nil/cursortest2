package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class w8s0 extends kr {
    public static final v8s0 Companion = new v8s0();
    public static final i3y[] k;
    public final u1m a;
    public final ywl b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Float g;
    public final Boolean h;
    public final s9i0 i;
    public final kr j;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new i3y[]{a.b(lazyThreadSafetyMode, new s7s0(1)), a.b(lazyThreadSafetyMode, new s7s0(2)), null, null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new s7s0(3))};
    }

    public w8s0(int i, u1m u1mVar, ywl ywlVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Float f, Boolean bool5, s9i0 s9i0Var, kr krVar) {
        if (767 != (i & 767)) {
            qje.Z(i, 767, t8s0.a.getDescriptor());
            throw null;
        }
        this.a = u1mVar;
        this.b = ywlVar;
        this.c = bool;
        this.d = bool2;
        this.e = bool3;
        this.f = bool4;
        this.g = f;
        this.h = bool5;
        if ((i & 256) == 0) {
            s9i0.Companion.getClass();
            this.i = s9i0.b;
        } else {
            this.i = s9i0Var;
        }
        this.j = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8s0) || !w8s0.class.equals(obj.getClass())) {
            return false;
        }
        w8s0 w8s0Var = (w8s0) obj;
        return jl40.l(this.a, w8s0Var.a) && jl40.l(this.b, w8s0Var.b) && jl40.l(this.c, w8s0Var.c) && jl40.l(this.d, w8s0Var.d) && jl40.l(this.e, w8s0Var.e) && jl40.l(this.f, w8s0Var.f) && jl40.k(this.g, w8s0Var.g) && jl40.l(this.h, w8s0Var.h) && jl40.l(this.i, w8s0Var.i) && jl40.l(this.j, w8s0Var.j);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = (u1mVar != null ? u1mVar.hashCode() : 0) * 31;
        ywl ywlVar = this.b;
        int hashCode2 = (hashCode + (ywlVar != null ? ywlVar.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.d;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.e;
        int hashCode5 = (hashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f;
        int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Float f = this.g;
        int hashCode7 = (hashCode6 + (f != null ? f.hashCode() : 0)) * 31;
        Boolean bool5 = this.h;
        int hashCode8 = (this.i.a.hashCode() + ((hashCode7 + (bool5 != null ? bool5.hashCode() : 0)) * 31)) * 31;
        kr krVar = this.j;
        return hashCode8 + (krVar != null ? krVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowPopupAction(query=" + this.a + ", document=" + this.b + ", fullscreen=" + this.c + ", closeOnSlideDown=" + this.d + ", closeOnTapOutside=" + this.e + ", dimBackground=" + this.f + ", defaultHeight=" + this.g + ", shouldLoadByQuery=" + this.h + ", customProps=" + this.i + ", completionAction=" + this.j + Extension.C_BRAKE;
    }
}

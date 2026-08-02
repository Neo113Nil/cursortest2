package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class w4t0 extends x4t0 {
    public static final v4t0 Companion = new v4t0();
    public static final i3y[] f;
    public final kr a;
    public final kr b;
    public final Boolean c;
    public final Integer d;
    public final j4t0 e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{a.b(lazyThreadSafetyMode, new s7s0(13)), a.b(lazyThreadSafetyMode, new s7s0(14)), null, null, null};
    }

    public w4t0(int i, kr krVar, kr krVar2, Boolean bool, Integer num, j4t0 j4t0Var) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, u4t0.a.getDescriptor());
            throw null;
        }
        this.a = krVar;
        this.b = krVar2;
        this.c = bool;
        this.d = num;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = j4t0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w4t0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        w4t0 w4t0Var = (w4t0) obj;
        return jl40.l(this.a, w4t0Var.a) && jl40.l(this.b, w4t0Var.b) && jl40.l(this.c, w4t0Var.c) && jl40.l(this.d, w4t0Var.d) && jl40.l(this.e, w4t0Var.e);
    }

    public final int hashCode() {
        kr krVar = this.a;
        int hashCode = (krVar != null ? krVar.hashCode() : 0) * 31;
        kr krVar2 = this.b;
        int hashCode2 = (hashCode + (krVar2 != null ? krVar2.hashCode() : 0)) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.d;
        int intValue = (hashCode3 + (num != null ? num.intValue() : 0)) * 31;
        j4t0 j4t0Var = this.e;
        return intValue + (j4t0Var != null ? j4t0Var.hashCode() : 0);
    }

    public final String toString() {
        return "StickyForDocumentStart(onStick=" + this.a + ", onUnstick=" + this.b + ", collapseOnScroll=" + this.c + ", extraTopInset=" + this.d + ", safeAreaSettings=" + this.e + Extension.C_BRAKE;
    }

    public w4t0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}

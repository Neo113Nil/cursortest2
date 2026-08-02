package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls5p0;", "Lrjx0;", "Companion", "q5p0", "r5p0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class s5p0 extends rjx0 {
    public static final r5p0 Companion = new r5p0();
    public final String a;
    public final boolean b;

    public s5p0(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.rjx0
    /* renamed from: a, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5p0)) {
            return false;
        }
        s5p0 s5p0Var = (s5p0) obj;
        return jl40.l(this.a, s5p0Var.a) && this.b == s5p0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return xvz.k("ScootersTariffOverrideExtra(routeTime=", this.a, ", overrideVerticals=", this.b, Extension.C_BRAKE);
    }

    public s5p0() {
        this(null, 3);
    }

    public s5p0(String str, int i) {
        this.a = (i & 1) != 0 ? null : str;
        this.b = false;
    }
}

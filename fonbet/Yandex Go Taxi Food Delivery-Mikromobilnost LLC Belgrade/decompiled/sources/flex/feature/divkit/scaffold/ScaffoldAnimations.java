package flex.feature.divkit.scaffold;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.ojm0;
import defpackage.vj2;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lflex/feature/divkit/scaffold/ScaffoldAnimations;", "", "Companion", "njm0", "ojm0", "flex-divkit-scaffold-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScaffoldAnimations {
    public static final ojm0 Companion = new ojm0();
    public final vj2 a;
    public final vj2 b;
    public final vj2 c;
    public final vj2 d;

    public /* synthetic */ ScaffoldAnimations(int i, vj2 vj2Var, vj2 vj2Var2, vj2 vj2Var3, vj2 vj2Var4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = vj2Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vj2Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vj2Var3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = vj2Var4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ScaffoldAnimations.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ScaffoldAnimations scaffoldAnimations = (ScaffoldAnimations) obj;
        return jl40.l(this.a, scaffoldAnimations.a) && jl40.l(this.b, scaffoldAnimations.b) && jl40.l(this.c, scaffoldAnimations.c) && jl40.l(this.d, scaffoldAnimations.d);
    }

    public final int hashCode() {
        vj2 vj2Var = this.a;
        int hashCode = (vj2Var != null ? vj2Var.hashCode() : 0) * 31;
        vj2 vj2Var2 = this.b;
        int hashCode2 = (hashCode + (vj2Var2 != null ? vj2Var2.hashCode() : 0)) * 31;
        vj2 vj2Var3 = this.c;
        int hashCode3 = (hashCode2 + (vj2Var3 != null ? vj2Var3.hashCode() : 0)) * 31;
        vj2 vj2Var4 = this.d;
        return hashCode3 + (vj2Var4 != null ? vj2Var4.hashCode() : 0);
    }

    public final String toString() {
        return "ScaffoldAnimations(topView=" + this.a + ", bottomView=" + this.b + ", overlayView=" + this.c + ", backgroundView=" + this.d + Extension.C_BRAKE;
    }

    public ScaffoldAnimations() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}

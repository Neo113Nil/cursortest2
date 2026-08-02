package defpackage;

import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vjb0 extends yjb0 {
    public final ujb0 a;
    public final tjb0 b;
    public final rbv c;
    public final rbv d;
    public final stz0 e;
    public final n38 f;
    public final tr7 g;
    public final YbButtonViewGroup.b h;

    public vjb0(ujb0 ujb0Var, tjb0 tjb0Var, nbv nbvVar, pbv pbvVar, stz0 stz0Var, n38 n38Var, tr7 tr7Var, YbButtonViewGroup.b bVar) {
        this.a = ujb0Var;
        this.b = tjb0Var;
        this.c = nbvVar;
        this.d = pbvVar;
        this.e = stz0Var;
        this.f = n38Var;
        this.g = tr7Var;
        this.h = bVar;
    }

    public final YbButtonViewGroup.b a() {
        return this.h;
    }

    public final tr7 b() {
        return this.g;
    }

    public final n38 c() {
        return this.f;
    }

    public final tjb0 d() {
        return this.b;
    }

    public final rbv e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjb0)) {
            return false;
        }
        vjb0 vjb0Var = (vjb0) obj;
        return jl40.l(this.a, vjb0Var.a) && jl40.l(this.b, vjb0Var.b) && jl40.l(this.c, vjb0Var.c) && jl40.l(this.d, vjb0Var.d) && this.e.equals(vjb0Var.e) && this.f.equals(vjb0Var.f) && this.g.equals(vjb0Var.g) && jl40.l(this.h, vjb0Var.h);
    }

    public final rbv f() {
        return this.d;
    }

    public final ujb0 g() {
        return this.a;
    }

    public final stz0 h() {
        return this.e;
    }

    public final int hashCode() {
        ujb0 ujb0Var = this.a;
        int hashCode = (ujb0Var == null ? 0 : ujb0Var.hashCode()) * 31;
        tjb0 tjb0Var = this.b;
        int hashCode2 = (hashCode + (tjb0Var == null ? 0 : tjb0Var.hashCode())) * 31;
        rbv rbvVar = this.c;
        int hashCode3 = (hashCode2 + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        rbv rbvVar2 = this.d;
        int hashCode4 = (this.g.a.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (rbvVar2 == null ? 0 : rbvVar2.hashCode())) * 31)) * 31)) * 31)) * 31;
        YbButtonViewGroup.b bVar = this.h;
        return hashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "Content(tip=" + this.a + ", flash=" + this.b + ", frame=" + this.c + ", photoPreview=" + this.d + ", toolbarState=" + this.e + ", captionState=" + this.f + ", cameraParams=" + this.g + ", buttonsGroupState=" + this.h + Extension.C_BRAKE;
    }
}

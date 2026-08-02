package defpackage;

import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qox extends tox {
    public final pox a;
    public final oox b;
    public final rbv c;
    public final rbv d;
    public final stz0 e;
    public final n38 f;
    public final tr7 g;
    public final YbButtonViewGroup.b h;

    public qox(pox poxVar, oox ooxVar, nbv nbvVar, pbv pbvVar, stz0 stz0Var, n38 n38Var, tr7 tr7Var, YbButtonViewGroup.b bVar) {
        this.a = poxVar;
        this.b = ooxVar;
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

    public final oox d() {
        return this.b;
    }

    public final rbv e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qox)) {
            return false;
        }
        qox qoxVar = (qox) obj;
        return jl40.l(this.a, qoxVar.a) && jl40.l(this.b, qoxVar.b) && jl40.l(this.c, qoxVar.c) && jl40.l(this.d, qoxVar.d) && this.e.equals(qoxVar.e) && this.f.equals(qoxVar.f) && this.g.equals(qoxVar.g) && jl40.l(this.h, qoxVar.h);
    }

    public final rbv f() {
        return this.d;
    }

    public final pox g() {
        return this.a;
    }

    public final stz0 h() {
        return this.e;
    }

    public final int hashCode() {
        pox poxVar = this.a;
        int hashCode = (poxVar == null ? 0 : poxVar.hashCode()) * 31;
        oox ooxVar = this.b;
        int hashCode2 = (hashCode + (ooxVar == null ? 0 : ooxVar.hashCode())) * 31;
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

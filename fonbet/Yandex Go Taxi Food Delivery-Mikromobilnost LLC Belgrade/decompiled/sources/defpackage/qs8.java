package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;
import ru.yandex.logistics.care.camera.di.Config$Orientation;

/* loaded from: classes4.dex */
public final class qs8 {
    public final boolean a;
    public final boolean b;
    public final ozd c;
    public final ps8 d;
    public final Config$Orientation e;
    public final Config$CameraLens f;
    public final pzd g;
    public final jzd h;

    public qs8(boolean z, boolean z2, ozd ozdVar, ps8 ps8Var, Config$Orientation config$Orientation, Config$CameraLens config$CameraLens, pzd pzdVar, jzd jzdVar) {
        this.a = z;
        this.b = z2;
        this.c = ozdVar;
        this.d = ps8Var;
        this.e = config$Orientation;
        this.f = config$CameraLens;
        this.g = pzdVar;
        this.h = jzdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs8)) {
            return false;
        }
        qs8 qs8Var = (qs8) obj;
        return this.a == qs8Var.a && this.b == qs8Var.b && jl40.l(this.c, qs8Var.c) && jl40.l(this.d, qs8Var.d) && this.e == qs8Var.e && this.f == qs8Var.f && jl40.l(this.g, qs8Var.g) && jl40.l(this.h, qs8Var.h);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        ozd ozdVar = this.c;
        int hashCode = (e + (ozdVar == null ? 0 : ozdVar.hashCode())) * 31;
        ps8 ps8Var = this.d;
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (ps8Var == null ? 0 : ps8Var.hashCode())) * 31)) * 31)) * 31;
        pzd pzdVar = this.g;
        int hashCode3 = (hashCode2 + (pzdVar == null ? 0 : pzdVar.hashCode())) * 31;
        jzd jzdVar = this.h;
        return hashCode3 + (jzdVar != null ? jzdVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("Step(isShowLens=", ", isShowFlash=", ", overlayConfig=", this.a, this.b);
        u.append(this.c);
        u.append(", header=");
        u.append(this.d);
        u.append(", orientation=");
        u.append(this.e);
        u.append(", camera=");
        u.append(this.f);
        u.append(", selfTimerConfig=");
        u.append(this.g);
        u.append(", exposureConfig=");
        u.append(this.h);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}

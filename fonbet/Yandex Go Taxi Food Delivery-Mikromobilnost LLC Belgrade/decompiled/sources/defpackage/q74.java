package defpackage;

/* loaded from: classes10.dex */
public final class q74 extends ty80 {
    public final sy80 a;
    public final sy80 b;
    public final sy80 c;
    public final sy80 d;

    public q74(p74 p74Var, p74 p74Var2, p74 p74Var3, p74 p74Var4) {
        if (p74Var == null) {
            ny61.t("Null previewOutputSurface");
            throw null;
        }
        this.a = p74Var;
        if (p74Var2 == null) {
            ny61.t("Null imageCaptureOutputSurface");
            throw null;
        }
        this.b = p74Var2;
        this.c = p74Var3;
        this.d = p74Var4;
    }

    @Override // defpackage.ty80
    public final sy80 a() {
        return this.c;
    }

    @Override // defpackage.ty80
    public final sy80 b() {
        return this.b;
    }

    @Override // defpackage.ty80
    public final sy80 c() {
        return this.d;
    }

    @Override // defpackage.ty80
    public final sy80 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ty80)) {
            return false;
        }
        ty80 ty80Var = (ty80) obj;
        if (!this.a.equals(ty80Var.d()) || !this.b.equals(ty80Var.b())) {
            return false;
        }
        sy80 sy80Var = this.c;
        if (sy80Var == null) {
            if (ty80Var.a() != null) {
                return false;
            }
        } else if (!sy80Var.equals(ty80Var.a())) {
            return false;
        }
        sy80 sy80Var2 = this.d;
        return sy80Var2 == null ? ty80Var.c() == null : sy80Var2.equals(ty80Var.c());
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        sy80 sy80Var = this.c;
        int hashCode2 = (hashCode ^ (sy80Var == null ? 0 : sy80Var.hashCode())) * 1000003;
        sy80 sy80Var2 = this.d;
        return hashCode2 ^ (sy80Var2 != null ? sy80Var2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.a + ", imageCaptureOutputSurface=" + this.b + ", imageAnalysisOutputSurface=" + this.c + ", postviewOutputSurface=" + this.d + "}";
    }
}

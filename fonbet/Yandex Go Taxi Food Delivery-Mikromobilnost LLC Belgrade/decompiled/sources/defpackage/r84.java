package defpackage;

import android.view.Surface;
import java.util.List;

/* loaded from: classes10.dex */
public final class r84 extends rnw0 {
    public final int a;
    public final int b;
    public final String c;
    public final List d;
    public final Surface e;

    public r84(int i, int i2, String str, List list, Surface surface) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (list == null) {
            ny61.t("Null surfaceSharingOutputConfigs");
            throw null;
        }
        this.d = list;
        if (surface != null) {
            this.e = surface;
        } else {
            ny61.t("Null surface");
            throw null;
        }
    }

    @Override // defpackage.xn7
    public final int a() {
        return this.b;
    }

    @Override // defpackage.xn7
    public final String b() {
        return this.c;
    }

    @Override // defpackage.xn7
    public final List c() {
        return this.d;
    }

    @Override // defpackage.rnw0
    public final Surface d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rnw0)) {
            return false;
        }
        rnw0 rnw0Var = (rnw0) obj;
        r84 r84Var = (r84) rnw0Var;
        if (this.a != r84Var.a || this.b != r84Var.b) {
            return false;
        }
        String str = r84Var.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.d.equals(r84Var.d) && this.e.equals(rnw0Var.d());
    }

    @Override // defpackage.xn7
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        return this.e.hashCode() ^ ((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceOutputConfig{id=" + this.a + ", surfaceGroupId=" + this.b + ", physicalCameraId=" + this.c + ", surfaceSharingOutputConfigs=" + this.d + ", surface=" + this.e + "}";
    }
}

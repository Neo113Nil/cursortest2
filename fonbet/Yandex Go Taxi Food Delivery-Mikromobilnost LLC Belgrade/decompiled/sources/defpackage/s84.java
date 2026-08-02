package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes10.dex */
public final class s84 extends onw0 {
    public final Size a;
    public final Rect b;
    public final br7 c;
    public final int d;
    public final boolean e;

    public s84(Size size, Rect rect, br7 br7Var, int i, boolean z) {
        if (size == null) {
            ny61.t("Null inputSize");
            throw null;
        }
        this.a = size;
        if (rect == null) {
            ny61.t("Null inputCropRect");
            throw null;
        }
        this.b = rect;
        this.c = br7Var;
        this.d = i;
        this.e = z;
    }

    @Override // defpackage.onw0
    public final br7 a() {
        return this.c;
    }

    @Override // defpackage.onw0
    public final Rect b() {
        return this.b;
    }

    @Override // defpackage.onw0
    public final Size c() {
        return this.a;
    }

    @Override // defpackage.onw0
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.onw0
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof onw0)) {
            return false;
        }
        onw0 onw0Var = (onw0) obj;
        if (!this.a.equals(onw0Var.c()) || !this.b.equals(onw0Var.b())) {
            return false;
        }
        br7 br7Var = this.c;
        if (br7Var == null) {
            if (onw0Var.a() != null) {
                return false;
            }
        } else if (!br7Var.equals(onw0Var.a())) {
            return false;
        }
        return this.d == onw0Var.e() && this.e == onw0Var.d();
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        br7 br7Var = this.c;
        return (this.e ? 1231 : 1237) ^ ((((hashCode ^ (br7Var == null ? 0 : br7Var.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return x4e.i(sb, this.e, "}");
    }
}

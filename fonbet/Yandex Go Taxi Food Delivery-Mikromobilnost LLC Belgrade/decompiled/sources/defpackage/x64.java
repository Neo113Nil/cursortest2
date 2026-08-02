package defpackage;

import android.util.Size;
import java.util.List;

/* loaded from: classes10.dex */
public final class x64 extends mdv {
    public final int a;
    public final int b;
    public final String c;
    public final List d;
    public final Size e;
    public final int f;
    public final int g;

    public x64(int i, int i2, String str, List list, Size size, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (list == null) {
            ny61.t("Null surfaceSharingOutputConfigs");
            throw null;
        }
        this.d = list;
        if (size == null) {
            ny61.t("Null size");
            throw null;
        }
        this.e = size;
        this.f = i3;
        this.g = i4;
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

    @Override // defpackage.mdv
    public final int d() {
        return this.f;
    }

    @Override // defpackage.mdv
    public final int e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mdv)) {
            return false;
        }
        mdv mdvVar = (mdv) obj;
        x64 x64Var = (x64) mdvVar;
        if (this.a != x64Var.a || this.b != x64Var.b) {
            return false;
        }
        String str = x64Var.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.d.equals(x64Var.d) && this.e.equals(mdvVar.f()) && this.f == mdvVar.d() && this.g == mdvVar.e();
    }

    @Override // defpackage.mdv
    public final Size f() {
        return this.e;
    }

    @Override // defpackage.xn7
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        return this.g ^ ((((((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageReaderOutputConfig{id=");
        sb.append(this.a);
        sb.append(", surfaceGroupId=");
        sb.append(this.b);
        sb.append(", physicalCameraId=");
        sb.append(this.c);
        sb.append(", surfaceSharingOutputConfigs=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", imageFormat=");
        sb.append(this.f);
        sb.append(", maxImages=");
        return oyr.m(this.g, "}", sb);
    }
}

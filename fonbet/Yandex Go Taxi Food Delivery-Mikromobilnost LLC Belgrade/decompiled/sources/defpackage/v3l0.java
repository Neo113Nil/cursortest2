package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class v3l0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final Point e;

    public v3l0(String str, String str2, boolean z, String str3, Point point) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3l0)) {
            return false;
        }
        v3l0 v3l0Var = (v3l0) obj;
        return jl40.l(this.a, v3l0Var.a) && jl40.l(this.b, v3l0Var.b) && this.c == v3l0Var.c && jl40.l(this.d, v3l0Var.d) && jl40.l(this.e, v3l0Var.e);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Stop(id=", this.a, ", name=", this.b, ", isCurrent=");
        unr0.A(", arrivalTime=", this.d, ", point=", v, this.c);
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TextFormat;

/* loaded from: classes5.dex */
public final class w4z0 extends mcu {
    public final String a;
    public final String b;
    public final ldc c;
    public final ldc d;
    public final TextFormat e;

    public w4z0(String str, String str2, ldc ldcVar, ldc ldcVar2, TextFormat textFormat) {
        this.a = str;
        this.b = str2;
        this.c = ldcVar;
        this.d = ldcVar2;
        this.e = textFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4z0)) {
            return false;
        }
        w4z0 w4z0Var = (w4z0) obj;
        return jl40.l(this.a, w4z0Var.a) && jl40.l(this.b, w4z0Var.b) && jl40.l(this.c, w4z0Var.c) && jl40.l(this.d, w4z0Var.d) && this.e == w4z0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ldc ldcVar = this.c;
        int hashCode3 = (hashCode2 + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.d;
        return this.e.hashCode() + ((hashCode3 + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TileHeaderState(title=", this.a, ", subtitle=", this.b, ", titleColor=");
        v.append(this.c);
        v.append(", subtitleColor=");
        v.append(this.d);
        v.append(", textFormat=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

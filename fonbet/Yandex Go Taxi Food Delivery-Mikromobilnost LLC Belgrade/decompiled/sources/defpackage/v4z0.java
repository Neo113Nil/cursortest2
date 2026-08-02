package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.TextFormat;

/* loaded from: classes5.dex */
public final class v4z0 extends yau {
    public final String a;
    public final String b;
    public final qfc c;
    public final qfc d;
    public final TextFormat e;

    public v4z0(String str, String str2, qfc qfcVar, qfc qfcVar2, TextFormat textFormat) {
        this.a = str;
        this.b = str2;
        this.c = qfcVar;
        this.d = qfcVar2;
        this.e = textFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4z0)) {
            return false;
        }
        v4z0 v4z0Var = (v4z0) obj;
        return jl40.l(this.a, v4z0Var.a) && jl40.l(this.b, v4z0Var.b) && jl40.l(this.c, v4z0Var.c) && jl40.l(this.d, v4z0Var.d) && this.e == v4z0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        qfc qfcVar = this.c;
        int hashCode3 = (hashCode2 + (qfcVar == null ? 0 : qfcVar.hashCode())) * 31;
        qfc qfcVar2 = this.d;
        return this.e.hashCode() + ((hashCode3 + (qfcVar2 != null ? qfcVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TileHeaderModel(title=", this.a, ", subtitle=", this.b, ", titleColor=");
        v.append(this.c);
        v.append(", subtitleColor=");
        v.append(this.d);
        v.append(", textFormat=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

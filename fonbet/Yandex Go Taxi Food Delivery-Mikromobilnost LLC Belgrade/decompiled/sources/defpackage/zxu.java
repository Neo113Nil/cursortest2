package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.y;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zxu {
    public final String a;
    public final String b;
    public final wp2 c;
    public final nvi0 d;
    public final wp2 e;
    public final y f;
    public final List g;
    public final String h;
    public final i1v i;
    public final boolean j;

    public zxu(String str, String str2, wp2 wp2Var, ovi0 ovi0Var, wp2 wp2Var2, y yVar, List list, String str3, i1v i1vVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = wp2Var;
        this.d = ovi0Var;
        this.e = wp2Var2;
        this.f = yVar;
        this.g = list;
        this.h = str3;
        this.i = i1vVar;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxu)) {
            return false;
        }
        zxu zxuVar = (zxu) obj;
        return jl40.l(this.a, zxuVar.a) && jl40.l(this.b, zxuVar.b) && jl40.l(this.c, zxuVar.c) && jl40.l(this.d, zxuVar.d) && jl40.l(this.e, zxuVar.e) && jl40.l(this.f, zxuVar.f) && jl40.l(this.g, zxuVar.g) && jl40.l(this.h, zxuVar.h) && jl40.l(this.i, zxuVar.i) && this.j == zxuVar.j;
    }

    public final int hashCode() {
        int b = n.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
        nvi0 nvi0Var = this.d;
        int b2 = n.b(this.e, (b + (nvi0Var == null ? 0 : nvi0Var.hashCode())) * 31, 31);
        y yVar = this.f;
        int c = unr0.c((b2 + (yVar == null ? 0 : yVar.hashCode())) * 31, 31, this.g);
        String str = this.h;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        i1v i1vVar = this.i;
        return Boolean.hashCode(this.j) + ((hashCode + (i1vVar != null ? i1vVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("HubFilterV2UiState(id=", this.a, ", text=", this.b, ", textAppColor=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(", bgAppColor=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(", availableFilters=");
        oyr.D(", contentDescription=", this.h, ", resetAction=", v, this.g);
        v.append(this.i);
        v.append(", isSelected=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

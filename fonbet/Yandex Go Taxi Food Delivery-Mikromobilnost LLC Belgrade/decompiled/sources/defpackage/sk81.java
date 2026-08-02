package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class sk81 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final kh81 g;
    public final ArrayList h;

    public sk81(String str, String str2, boolean z, String str3, String str4, String str5, kh81 kh81Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = kh81Var;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk81)) {
            return false;
        }
        sk81 sk81Var = (sk81) obj;
        return jl40.l(this.a, sk81Var.a) && jl40.l(this.b, sk81Var.b) && this.c == sk81Var.c && jl40.l(this.d, sk81Var.d) && jl40.l(this.e, sk81Var.e) && jl40.l(this.f, sk81Var.f) && jl40.l(this.g, sk81Var.g) && this.h.equals(sk81Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int hashCode2 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugPanelAdapterData(name=", this.a, ", logoUrl=", this.b, ", adapterIntegrationStatus=");
        unr0.A(", adapterVersion=", this.d, ", latestAdapterVersion=", v, this.c);
        g8e.D(v, this.e, ", sdkVersion=", this.f, ", adapterStatus=");
        v.append(this.g);
        v.append(", formats=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

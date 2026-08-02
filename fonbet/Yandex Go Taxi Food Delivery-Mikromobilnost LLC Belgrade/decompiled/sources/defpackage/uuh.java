package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class uuh {
    public final r0i a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public uuh(r0i r0iVar, String str, String str2, List list, String str3, String str4, String str5, String str6) {
        this.a = r0iVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuh)) {
            return false;
        }
        uuh uuhVar = (uuh) obj;
        return jl40.l(this.a, uuhVar.a) && jl40.l(this.b, uuhVar.b) && jl40.l(this.c, uuhVar.c) && jl40.l(this.d, uuhVar.d) && jl40.l(this.e, uuhVar.e) && jl40.l(this.f, uuhVar.f) && jl40.l(this.g, uuhVar.g) && jl40.l(this.h, uuhVar.h);
    }

    public final int hashCode() {
        r0i r0iVar = this.a;
        int hashCode = (r0iVar == null ? 0 : r0iVar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int c = unr0.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int hashCode3 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryAddress(contact=");
        sb.append(this.a);
        sb.append(", porchNumber=");
        sb.append(this.b);
        sb.append(", comment=");
        tse0.x(this.c, ", photocomments=", ", floorNumber=", sb, this.d);
        g8e.D(sb, this.e, ", apartment=", this.f, ", doorPhone=");
        return g8e.r(sb, this.g, ", shortText=", this.h, Extension.C_BRAKE);
    }

    public uuh() {
        this(null, null, null, EmptyList.a, null, null, null, null);
    }
}

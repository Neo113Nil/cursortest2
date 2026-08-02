package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class vuh {
    public static final vuh j;
    public final r0i a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final List h;
    public final String i;

    static {
        r0i r0iVar = r0i.d;
        j = new vuh(r0i.d, "", "", "", "", "", false, EmptyList.a, "");
    }

    public vuh(r0i r0iVar, String str, String str2, String str3, String str4, String str5, boolean z, List list, String str6) {
        this.a = r0iVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = list;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuh)) {
            return false;
        }
        vuh vuhVar = (vuh) obj;
        return jl40.l(this.a, vuhVar.a) && jl40.l(this.b, vuhVar.b) && jl40.l(this.c, vuhVar.c) && jl40.l(this.d, vuhVar.d) && jl40.l(this.e, vuhVar.e) && jl40.l(this.f, vuhVar.f) && this.g == vuhVar.g && this.h.equals(vuhVar.h) && jl40.l(this.i, vuhVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + unr0.c(unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryAddressAdditionalInfo(contact=");
        sb.append(this.a);
        sb.append(", porch=");
        sb.append(this.b);
        sb.append(", floor=");
        g8e.D(sb, this.c, ", comment=", this.d, ", apartment=");
        g8e.D(sb, this.e, ", doorPhone=", this.f, ", showContactAutofillBubble=");
        sb.append(this.g);
        sb.append(", photoComments=");
        sb.append(this.h);
        sb.append(", uuid=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}

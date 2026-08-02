package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qae implements uni {
    public final boolean a;
    public final String b;
    public final String c;
    public final s9e w;
    public final List x;

    public qae(boolean z, String str, String str2, s9e s9eVar, List list) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.w = s9eVar;
        this.x = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qae)) {
            return false;
        }
        qae qaeVar = (qae) obj;
        return this.a == qaeVar.a && jl40.l(this.b, qaeVar.b) && jl40.l(this.c, qaeVar.c) && jl40.l(this.w, qaeVar.w) && this.x.equals(qaeVar.x);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        s9e s9eVar = this.w;
        return this.x.hashCode() + ((hashCode3 + (s9eVar != null ? s9eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("ContactPickerArgs(source=", ", screenTitle=", this.b, ", screenDescription=", this.a);
        v.append(this.c);
        v.append(", selectedContact=");
        v.append(this.w);
        v.append(", defaultContacts=");
        return ly3.s(v, this.x, Extension.C_BRAKE);
    }
}

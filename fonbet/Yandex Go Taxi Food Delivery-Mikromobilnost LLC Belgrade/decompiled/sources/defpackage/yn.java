package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yn extends nr {
    public final String a;
    public final String b;
    public final Boolean c;
    public final Expansion d;

    public yn(String str, String str2, Boolean bool, Expansion expansion) {
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = expansion;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj;
        return jl40.l(this.a, ynVar.a) && jl40.l(this.b, ynVar.b) && jl40.l(this.c, ynVar.c) && this.d == ynVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return this.d.hashCode() + ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionOrderMore(title=", this.a, ", verticalId=", this.b, ", isTrapMode=");
        v.append(this.c);
        v.append(", expansion=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

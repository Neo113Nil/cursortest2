package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPhotocheckSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class uho0 {
    public final ScootersPhotocheckSection a;
    public final String b;
    public final String c;

    public uho0(ScootersPhotocheckSection scootersPhotocheckSection, String str, String str2) {
        this.a = scootersPhotocheckSection;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uho0)) {
            return false;
        }
        uho0 uho0Var = (uho0) obj;
        return this.a == uho0Var.a && jl40.l(this.b, uho0Var.b) && jl40.l(this.c, uho0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersPhotocheckDeeplink(section=");
        sb.append(this.a);
        sb.append(", examType=");
        sb.append(this.b);
        sb.append(", onboardingId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}

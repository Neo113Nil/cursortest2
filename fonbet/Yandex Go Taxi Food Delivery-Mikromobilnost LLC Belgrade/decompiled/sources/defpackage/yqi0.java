package defpackage;

import com.ybsdk.screens.registration.domain.RegistrationPhone;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class yqi0 {
    public final String a;
    public final RegistrationPhone b;
    public final String c;

    public yqi0(String str, RegistrationPhone registrationPhone, String str2) {
        this.a = str;
        this.b = registrationPhone;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqi0)) {
            return false;
        }
        yqi0 yqi0Var = (yqi0) obj;
        return jl40.l(this.a, yqi0Var.a) && jl40.l(this.b, yqi0Var.b) && jl40.l(this.c, yqi0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RegistrationPhone registrationPhone = this.b;
        int hashCode2 = (hashCode + (registrationPhone == null ? 0 : registrationPhone.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationDataEntity(applicationId=");
        sb.append(this.a);
        sb.append(", phone=");
        sb.append(this.b);
        sb.append(", agreement=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}

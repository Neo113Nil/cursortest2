package defpackage;

import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qgs0 {
    public final String a;
    public final String b;
    public final YbCardStatusEntity c;

    public qgs0(String str, String str2, YbCardStatusEntity ybCardStatusEntity) {
        this.a = str;
        this.b = str2;
        this.c = ybCardStatusEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgs0)) {
            return false;
        }
        qgs0 qgs0Var = (qgs0) obj;
        return jl40.l(this.a, qgs0Var.a) && jl40.l(this.b, qgs0Var.b) && this.c == qgs0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SingleCardPublicDetailsEntity(lastPanDigits=", this.a, ", expirationDate=", this.b, ", status=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

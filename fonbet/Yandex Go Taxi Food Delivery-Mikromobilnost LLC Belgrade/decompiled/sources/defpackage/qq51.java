package defpackage;

import com.yandex.go.yb.data.model.YbCardStatusNotification$YbCardStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qq51 {
    public final String a;
    public final String b;
    public final String c;
    public final YbCardStatusNotification$YbCardStatus d;

    public qq51(String str, String str2, String str3, YbCardStatusNotification$YbCardStatus ybCardStatusNotification$YbCardStatus) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ybCardStatusNotification$YbCardStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq51)) {
            return false;
        }
        qq51 qq51Var = (qq51) obj;
        return jl40.l(this.a, qq51Var.a) && this.b.equals(qq51Var.b) && this.c.equals(qq51Var.c) && this.d == qq51Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("YbCardStatusNotification(id=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", status=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}

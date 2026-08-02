package defpackage;

import com.yandex.messaging.domain.user.UserNameType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qp21 {
    public final String a;
    public final UserNameType b;

    public qp21(String str, UserNameType userNameType) {
        this.a = str;
        this.b = userNameType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp21)) {
            return false;
        }
        qp21 qp21Var = (qp21) obj;
        return jl40.l(this.a, qp21Var.a) && this.b == qp21Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "UserNameResult(name=" + this.a + ", nameType=" + this.b + Extension.C_BRAKE;
    }

    public qp21() {
        this("", UserNameType.NORMAL);
    }
}

package defpackage;

import com.yandex.fintechsdk.data.auth.api.TokenSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qk3 implements xk3 {
    public final ek a;
    public final TokenSource b;

    public qk3(ek ekVar, TokenSource tokenSource) {
        this.a = ekVar;
        this.b = tokenSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk3)) {
            return false;
        }
        qk3 qk3Var = (qk3) obj;
        return jl40.l(this.a, qk3Var.a) && this.b == qk3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Authorized(credentials=" + this.a + ", source=" + this.b + Extension.C_BRAKE;
    }
}

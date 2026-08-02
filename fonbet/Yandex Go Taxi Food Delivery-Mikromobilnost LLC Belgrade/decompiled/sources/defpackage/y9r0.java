package defpackage;

import com.yandex.go.slot.dto.b2;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class y9r0 {
    public final String a;
    public final b2 b;

    public y9r0(String str, b2 b2Var) {
        this.a = str;
        this.b = b2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9r0)) {
            return false;
        }
        y9r0 y9r0Var = (y9r0) obj;
        return jl40.l(this.a, y9r0Var.a) && jl40.l(this.b, y9r0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b2 b2Var = this.b;
        return hashCode + (b2Var == null ? 0 : b2Var.hashCode());
    }

    public final String toString() {
        return "Button(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}

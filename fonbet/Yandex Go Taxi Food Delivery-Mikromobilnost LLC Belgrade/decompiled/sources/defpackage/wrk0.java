package defpackage;

import com.yandex.div.json.expressions.Expression;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class wrk0 {
    public final Expression a;
    public final boolean b;

    public wrk0(Expression expression, boolean z) {
        this.a = expression;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrk0)) {
            return false;
        }
        wrk0 wrk0Var = (wrk0) obj;
        return this.a.equals(wrk0Var.a) && this.b == wrk0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RippleData(color=" + this.a + ", preserveDivKitAnimations=" + this.b + Extension.C_BRAKE;
    }
}

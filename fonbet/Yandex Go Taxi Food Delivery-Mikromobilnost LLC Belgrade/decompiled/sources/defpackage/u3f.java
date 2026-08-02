package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u3f {
    public final String a;
    public final Text.Constant b;
    public final Text.Constant c;

    public u3f(Text.Constant constant, Text.Constant constant2, String str) {
        this.a = str;
        this.b = constant;
        this.c = constant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3f)) {
            return false;
        }
        u3f u3fVar = (u3f) obj;
        return jl40.l(this.a, u3fVar.a) && this.b.equals(u3fVar.b) && this.c.equals(u3fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xvz.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CreateApplicationEntity(applicationId=" + this.a + ", title=" + this.b + ", description=" + this.c + Extension.C_BRAKE;
    }
}

package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class riw0 {
    public final Text.Resource a;
    public final nbv b;

    public riw0(nbv nbvVar, Text.Resource resource) {
        this.a = resource;
        this.b = nbvVar;
    }

    public final rbv a() {
        return this.b;
    }

    public final Text b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof riw0)) {
            return false;
        }
        riw0 riw0Var = (riw0) obj;
        return this.a.equals(riw0Var.a) && this.b.equals(riw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SupportButton(supportMessageDescriptionText=" + this.a + ", supportButtonIcon=" + this.b + Extension.C_BRAKE;
    }
}

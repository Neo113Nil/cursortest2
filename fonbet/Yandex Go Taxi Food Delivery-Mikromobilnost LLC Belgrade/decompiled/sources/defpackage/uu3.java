package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uu3 implements zu3 {
    public final jv3 a;
    public final YbButtonView.a b;
    public final YbButtonView.a c;

    public uu3(jv3 jv3Var, YbButtonView.a aVar, YbButtonView.a aVar2) {
        this.a = jv3Var;
        this.b = aVar;
        this.c = aVar2;
    }

    public final YbButtonView.a a() {
        return this.b;
    }

    public final YbButtonView.a b() {
        return this.c;
    }

    public final jv3 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu3)) {
            return false;
        }
        uu3 uu3Var = (uu3) obj;
        return this.a.equals(uu3Var.a) && this.b.equals(uu3Var.b) && this.c.equals(uu3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AutoTopupEdit(viewState=" + this.a + ", primaryButtonState=" + this.b + ", secondaryButtonState=" + this.c + Extension.C_BRAKE;
    }
}

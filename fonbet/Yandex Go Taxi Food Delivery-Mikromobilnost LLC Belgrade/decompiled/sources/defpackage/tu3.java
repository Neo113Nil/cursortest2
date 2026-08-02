package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tu3 implements zu3 {
    public final kr3 a;
    public final YbButtonView.a b;
    public final YbButtonView.a c;

    public tu3(kr3 kr3Var, YbButtonView.a aVar, YbButtonView.a aVar2) {
        this.a = kr3Var;
        this.b = aVar;
        this.c = aVar2;
    }

    public final YbButtonView.a a() {
        return this.b;
    }

    public final YbButtonView.a b() {
        return this.c;
    }

    public final kr3 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu3)) {
            return false;
        }
        tu3 tu3Var = (tu3) obj;
        return this.a.equals(tu3Var.a) && this.b.equals(tu3Var.b) && this.c.equals(tu3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AutoFundEdit(viewState=" + this.a + ", primaryButtonState=" + this.b + ", secondaryButtonState=" + this.c + Extension.C_BRAKE;
    }
}

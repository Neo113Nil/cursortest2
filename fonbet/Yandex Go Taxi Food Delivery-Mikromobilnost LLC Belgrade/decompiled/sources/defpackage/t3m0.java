package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class t3m0 implements u3m0 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final s3m0 c;
    public final s3m0 d;
    public final YbButtonViewGroup.b e;

    public t3m0(Text.Constant constant, Text.Constant constant2, s3m0 s3m0Var, s3m0 s3m0Var2, YbButtonViewGroup.b bVar) {
        this.a = constant;
        this.b = constant2;
        this.c = s3m0Var;
        this.d = s3m0Var2;
        this.e = bVar;
    }

    public final YbButtonViewGroup.b a() {
        return this.e;
    }

    public final s3m0 b() {
        return this.d;
    }

    public final s3m0 c() {
        return this.c;
    }

    public final Text d() {
        return this.b;
    }

    public final Text e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3m0)) {
            return false;
        }
        t3m0 t3m0Var = (t3m0) obj;
        return this.a.equals(t3m0Var.a) && this.b.equals(t3m0Var.b) && this.c.equals(t3m0Var.c) && this.d.equals(t3m0Var.d) && this.e.equals(t3m0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + xvz.d(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = ly3.u("Content(title=", this.a, ", subtitle=", this.b, ", profitScary=");
        u.append(this.c);
        u.append(", profitPossible=");
        u.append(this.d);
        u.append(", buttonsGroupState=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}

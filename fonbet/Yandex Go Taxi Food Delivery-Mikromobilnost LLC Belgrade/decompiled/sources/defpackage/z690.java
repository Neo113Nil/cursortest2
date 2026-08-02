package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z690 implements b790 {
    public final jbv a;
    public final jbv b;
    public final Text.Constant c;
    public final Text.Constant d;
    public final Text.Constant e;

    public z690(jbv jbvVar, jbv jbvVar2, Text.Constant constant, Text.Constant constant2, Text.Constant constant3) {
        this.a = jbvVar;
        this.b = jbvVar2;
        this.c = constant;
        this.d = constant2;
        this.e = constant3;
    }

    @Override // defpackage.b790
    public final rbv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z690)) {
            return false;
        }
        z690 z690Var = (z690) obj;
        return this.a.equals(z690Var.a) && this.b.equals(z690Var.b) && this.c.equals(z690Var.c) && this.d.equals(z690Var.d) && this.e.equals(z690Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xvz.d(this.d, xvz.d(this.c, (this.b.a.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "BottomSheet(toolbarImage=" + this.a + ", bottomSheetImage=" + this.b + ", title=" + this.c + ", description=" + this.d + ", buttonText=" + this.e + Extension.C_BRAKE;
    }
}

package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zj11 implements e6v {
    public final int a;
    public final ArrayList b;

    public zj11(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj11)) {
            return false;
        }
        zj11 zj11Var = (zj11) obj;
        return this.a == zj11Var.a && this.b.equals(zj11Var.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return "BUTTONS_CONTAINER";
    }

    public final int hashCode() {
        return this.b.hashCode() + oyr.b(this.a, 977601373, 31);
    }

    public final String toString() {
        return "TurboButtonsModel(id=BUTTONS_CONTAINER, heightMinusIconSize=" + this.a + ", buttons=" + this.b + Extension.C_BRAKE;
    }
}

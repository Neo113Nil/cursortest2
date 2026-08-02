package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zei0 {
    public final ArrayList a;
    public final boolean b;

    public zei0(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zei0)) {
            return false;
        }
        zei0 zei0Var = (zei0) obj;
        return this.a.equals(zei0Var.a) && this.b == zei0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReasonListModel(reasons=" + this.a + ", shouldDisplayWithIcons=" + this.b + Extension.C_BRAKE;
    }
}

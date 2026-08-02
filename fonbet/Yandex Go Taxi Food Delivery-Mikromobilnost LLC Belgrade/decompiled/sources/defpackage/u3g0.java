package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class u3g0 {
    public final List a;
    public final List b;
    public final boolean c;

    public u3g0(List list, List list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public static u3g0 a(u3g0 u3g0Var, ArrayList arrayList, int i) {
        List list = u3g0Var.b;
        boolean z = (i & 4) != 0 ? u3g0Var.c : false;
        u3g0Var.getClass();
        return new u3g0(arrayList, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3g0)) {
            return false;
        }
        u3g0 u3g0Var = (u3g0) obj;
        return this.a.equals(u3g0Var.a) && this.b.equals(u3g0Var.b) && this.c == u3g0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.v("PushSettingsModel(settingsListItems=", this.a, ", channels=", this.b, ", isFromApi="), this.c, Extension.C_BRAKE);
    }
}

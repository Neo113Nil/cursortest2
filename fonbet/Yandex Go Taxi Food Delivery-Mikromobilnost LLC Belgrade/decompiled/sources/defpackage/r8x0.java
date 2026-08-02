package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r8x0 implements r9x0 {
    public final ArrayList a;

    public r8x0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8x0) && this.a.equals(((r8x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("ChangeRouteDetailsAction(routePoints=", Extension.C_BRAKE, this.a);
    }
}

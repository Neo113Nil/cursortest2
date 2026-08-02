package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qwz0 extends wgj0 {
    public final ArrayList a;

    public qwz0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwz0) && this.a.equals(((qwz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("TopRequirementsGroup(topRequirementsListItems=", Extension.C_BRAKE, this.a);
    }
}

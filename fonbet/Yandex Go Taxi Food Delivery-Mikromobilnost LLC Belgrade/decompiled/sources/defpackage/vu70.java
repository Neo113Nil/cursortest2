package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vu70 extends pw21 {
    public final ArrayList f;

    public vu70(ArrayList arrayList) {
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu70) && this.f.equals(((vu70) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return g8e.q("C2COrderEditPayload(editOptions=", Extension.C_BRAKE, this.f);
    }
}

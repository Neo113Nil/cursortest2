package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ztb extends n351 {
    public final ArrayList c;

    public ztb(ArrayList arrayList) {
        super("action-buttons-key", !arrayList.isEmpty(), 12);
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ztb) && jl40.l(this.c, ((ztb) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return g8e.q("CircleButtonsModel(circleButtons=", Extension.C_BRAKE, this.c);
    }
}

package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z8n extends b9n {
    public final ArrayList a;

    public z8n(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8n) && this.a.equals(((z8n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("DynamicSearchAnimatableTimelines(timelines=", Extension.C_BRAKE, this.a);
    }
}

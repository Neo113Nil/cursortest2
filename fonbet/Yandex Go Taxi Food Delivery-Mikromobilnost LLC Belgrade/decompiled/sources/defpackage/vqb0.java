package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vqb0 {
    public final Map a;

    public vqb0() {
        this(b.f());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqb0) && jl40.l(this.a, ((vqb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("PickupPointsContactModel(contactMap=", Extension.C_BRAKE, this.a);
    }

    public vqb0(Map map) {
        this.a = map;
    }
}

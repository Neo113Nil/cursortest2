package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vyd {
    public final List a;

    public vyd(int i) {
        this.a = EmptyList.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyd) && jl40.l(this.a, ((vyd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ConditionsData(title=null, buttonTitle=null, items=", Extension.C_BRAKE, this.a);
    }

    public vyd() {
        this(0);
    }
}

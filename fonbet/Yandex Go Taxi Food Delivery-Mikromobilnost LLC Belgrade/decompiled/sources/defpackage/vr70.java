package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vr70 {
    public final List a;

    public vr70(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr70) && jl40.l(this.a, ((vr70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("OrderDefaultModalUiState(items=", Extension.C_BRAKE, this.a);
    }
}

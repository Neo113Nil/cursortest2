package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rhu0 {
    public final CharSequence a;
    public final List b;

    public rhu0(CharSequence charSequence, List list) {
        this.a = charSequence;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhu0)) {
            return false;
        }
        rhu0 rhu0Var = (rhu0) obj;
        return jl40.l(this.a, rhu0Var.a) && jl40.l(this.b, rhu0Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "StopSelectorUiState(title=" + ((Object) this.a) + ", items=" + this.b + Extension.C_BRAKE;
    }

    public rhu0() {
        this(null, EmptyList.a);
    }
}

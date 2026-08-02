package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ylj {
    public final CharSequence a;
    public final List b;

    public ylj(CharSequence charSequence, List list) {
        this.a = charSequence;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylj)) {
            return false;
        }
        ylj yljVar = (ylj) obj;
        return jl40.l(this.a, yljVar.a) && jl40.l(this.b, yljVar.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "DirectionSelectorUiState(title=" + ((Object) this.a) + ", items=" + this.b + Extension.C_BRAKE;
    }

    public ylj() {
        this(null, EmptyList.a);
    }
}

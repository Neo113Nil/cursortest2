package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v5a {
    public final CharSequence a;
    public final n5a b;
    public final List c;
    public final u5a d;

    public v5a(CharSequence charSequence, n5a n5aVar, List list, u5a u5aVar) {
        this.a = charSequence;
        this.b = n5aVar;
        this.c = list;
        this.d = u5aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5a)) {
            return false;
        }
        v5a v5aVar = (v5a) obj;
        return jl40.l(this.a, v5aVar.a) && jl40.l(this.b, v5aVar.b) && jl40.l(this.c, v5aVar.c) && jl40.l(this.d, v5aVar.d);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        n5a n5aVar = this.b;
        int c = unr0.c((hashCode + (n5aVar == null ? 0 : n5aVar.hashCode())) * 31, 31, this.c);
        u5a u5aVar = this.d;
        return c + (u5aVar != null ? u5aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChargersMultiOrderUiState(title=" + ((Object) this.a) + ", headerItem=" + this.b + ", ui=" + this.c + ", tabsConfig=" + this.d + Extension.C_BRAKE;
    }

    public v5a() {
        this(null, null, EmptyList.a, null);
    }
}

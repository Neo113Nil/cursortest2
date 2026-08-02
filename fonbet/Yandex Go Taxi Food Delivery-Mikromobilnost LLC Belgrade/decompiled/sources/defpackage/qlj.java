package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qlj {
    public final CharSequence a;
    public final List b;
    public final String c;

    public qlj(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlj)) {
            return false;
        }
        qlj qljVar = (qlj) obj;
        return jl40.l(this.a, qljVar.a) && jl40.l(this.b, qljVar.b) && jl40.l(this.c, qljVar.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int c = unr0.c((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectionSelectorData(title=");
        sb.append((Object) this.a);
        sb.append(", directions=");
        sb.append(this.b);
        sb.append(", propertyName=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public qlj() {
        this(0);
    }

    public /* synthetic */ qlj(int i) {
        this(null, EmptyList.a, null);
    }
}

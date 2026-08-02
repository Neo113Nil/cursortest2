package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
/* loaded from: classes2.dex */
public final class s9d0 {
    public static final r9d0 Companion = new r9d0();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new q2d0(22))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ s9d0(int i, String str, String str2, List list) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, k9d0.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9d0)) {
            return false;
        }
        s9d0 s9d0Var = (s9d0) obj;
        return jl40.l(this.a, s9d0Var.a) && jl40.l(this.b, s9d0Var.b) && jl40.l(this.c, s9d0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Legals(oneClickDisclaimer=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append(this.b);
        sb.append(", arguments=");
        return unr0.t(sb, this.c, ')');
    }
}

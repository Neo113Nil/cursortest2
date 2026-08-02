package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
/* loaded from: classes2.dex */
public final class q3k0 {
    public static final l3k0 Companion = new l3k0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(16))};
    public final String a;
    public final List b;

    public /* synthetic */ q3k0(int i, String str, List list) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, k3k0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3k0)) {
            return false;
        }
        q3k0 q3k0Var = (q3k0) obj;
        return jl40.l(this.a, q3k0Var.a) && jl40.l(this.b, q3k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RichTextDto(text=");
        sb.append(this.a);
        sb.append(", items=");
        return unr0.t(sb, this.b, ')');
    }
}

package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class vcm {
    public final String a;
    public final String b;
    public final l94 c;
    public final List d;

    public vcm(String str, String str2, l94 l94Var, List list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = l94Var;
        this.d = list;
    }

    public static vcm a(vcm vcmVar, List list) {
        String str = vcmVar.a;
        String str2 = vcmVar.b;
        l94 l94Var = vcmVar.c;
        list.getClass();
        return new vcm(str, str2, l94Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcm)) {
            return false;
        }
        vcm vcmVar = (vcm) obj;
        return Intrinsics.d(this.a, vcmVar.a) && this.b.equals(vcmVar.b) && this.c == vcmVar.c && Intrinsics.d(this.d, vcmVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PodcastsCatalog(title=", this.a, ", id=", this.b, ", type=");
        m.append(this.c);
        m.append(", blocks=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}

package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ari {
    public final String a;
    public final String b;
    public final List c;
    public final int d;

    public ari(int i, String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ari)) {
            return false;
        }
        ari ariVar = (ari) obj;
        return this.a.equals(ariVar.a) && Intrinsics.d(this.b, ariVar.b) && this.c.equals(ariVar.c) && this.d == ariVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + k5r.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("MyShelfBlock(id=", this.a, ", title=", this.b, ", elements=");
        m.append(this.c);
        m.append(", position=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}

package defpackage;

import java.util.List;

/* loaded from: classes12.dex */
public final class w8w implements y8w {
    public final String a;
    public final w53 b;
    public final List c;

    public w8w(String str, w53 w53Var, List list) {
        this.a = str;
        this.b = w53Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8w)) {
            return false;
        }
        w8w w8wVar = (w8w) obj;
        return jl40.l(this.a, w8wVar.a) && this.b.equals(w8wVar.b) && this.c.equals(w8wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

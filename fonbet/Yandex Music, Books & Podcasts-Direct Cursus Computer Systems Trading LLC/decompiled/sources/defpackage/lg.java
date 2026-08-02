package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lg {
    public final kg a;
    public final Object b;

    public lg(kg kgVar, Object obj) {
        this.a = kgVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lg)) {
            return false;
        }
        lg lgVar = (lg) obj;
        return this.a.equals(lgVar.a) && Intrinsics.d(this.b, lgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a.a);
        sb.append(", ");
        return f1d.j(sb, this.b, ')');
    }
}

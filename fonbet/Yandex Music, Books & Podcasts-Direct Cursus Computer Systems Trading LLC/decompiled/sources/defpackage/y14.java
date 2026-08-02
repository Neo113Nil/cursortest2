package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y14 implements c24 {
    public final x1g a;
    public final lt b;
    public final int c;
    public final List d;

    public y14(x1g x1gVar, lt ltVar, int i, List list) {
        list.getClass();
        this.a = x1gVar;
        this.b = ltVar;
        this.c = i;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y14)) {
            return false;
        }
        y14 y14Var = (y14) obj;
        return this.a.equals(y14Var.a) && this.b.equals(y14Var.b) && this.c == y14Var.c && Intrinsics.d(this.d, y14Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "NonMusic(uiData=" + this.a + ", album=" + this.b + ", likesCount=" + this.c + ", artists=" + this.d + ")";
    }
}

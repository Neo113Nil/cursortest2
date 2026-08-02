package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b4c {
    public final Object a;
    public final wn5 b;

    public b4c(g1r g1rVar, wn5 wn5Var) {
        this.a = g1rVar;
        this.b = wn5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4c)) {
            return false;
        }
        b4c b4cVar = (b4c) obj;
        return Intrinsics.d(this.a, b4cVar.a) && this.b.equals(b4cVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}

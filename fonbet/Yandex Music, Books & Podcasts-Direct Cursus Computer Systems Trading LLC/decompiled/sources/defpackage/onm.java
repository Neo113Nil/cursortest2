package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class onm {
    public final jnm a;
    public final nnm b;

    public onm(jnm jnmVar, nnm nnmVar) {
        jnmVar.getClass();
        this.a = jnmVar;
        this.b = nnmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onm)) {
            return false;
        }
        onm onmVar = (onm) obj;
        return Intrinsics.d(this.a, onmVar.a) && this.b.equals(onmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PriorityHolder(priority=" + this.a + ", parent=" + this.b + ')';
    }
}

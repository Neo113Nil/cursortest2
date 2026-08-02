package app.cash.redwood;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes3.dex */
public final class CombinedModifier implements Modifier {
    public final Modifier inner;
    public final Modifier outer;

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        modifier.getClass();
        modifier2.getClass();
        this.outer = modifier;
        this.inner = modifier2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        return Intrinsics.areEqual(this.outer, combinedModifier.outer) && Intrinsics.areEqual(this.inner, combinedModifier.inner);
    }

    @Override // app.cash.redwood.Modifier
    public final void forEach(Function1 function1) {
        this.outer.forEach(function1);
        this.inner.forEach(function1);
    }

    @Override // app.cash.redwood.Modifier
    public final void forEachScoped(Function1 function1) {
        this.outer.forEachScoped(function1);
        this.inner.forEachScoped(function1);
    }

    @Override // app.cash.redwood.Modifier
    public final void forEachUnscoped(Function1 function1) {
        this.outer.forEachUnscoped(function1);
        this.inner.forEachUnscoped(function1);
    }

    public final int hashCode() {
        return (this.inner.hashCode() * 31) + this.outer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        CombinedModifier$$ExternalSyntheticLambda0 combinedModifier$$ExternalSyntheticLambda0 = new CombinedModifier$$ExternalSyntheticLambda0(0, ref$BooleanRef, sb);
        this.outer.forEach(combinedModifier$$ExternalSyntheticLambda0);
        this.inner.forEach(combinedModifier$$ExternalSyntheticLambda0);
        sb.append(']');
        return sb.toString();
    }
}

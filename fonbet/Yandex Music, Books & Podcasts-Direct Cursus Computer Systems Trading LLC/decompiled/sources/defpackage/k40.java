package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k40 extends bcx {
    public final Function1 l;

    public k40(Function1 function1) {
        this.l = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k40) && Intrinsics.d(this.l, ((k40) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    @Override // defpackage.bcx
    public final int s(ksk kskVar) {
        return ((Number) this.l.invoke(kskVar)).intValue();
    }

    public final String toString() {
        return "Block(lineProviderBlock=" + this.l + ')';
    }
}

package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rs5 implements vwt {
    public final uif a;

    /* JADX WARN: Multi-variable type inference failed */
    public rs5(Function1 function1) {
        this.a = (uif) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.vwt
    public final Object a(a aVar) {
        return this.a.invoke(aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rs5) && this.a.equals(((rs5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}

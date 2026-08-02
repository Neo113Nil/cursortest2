package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ta6 implements zci {
    public final Function1 a;
    public opv b;

    public ta6(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.zci
    public final void d(ddi ddiVar) {
        opv opvVar = (opv) ddiVar.d(sqv.a);
        if (Intrinsics.d(opvVar, this.b)) {
            return;
        }
        this.b = opvVar;
        this.a.invoke(opvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta6) && ((ta6) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

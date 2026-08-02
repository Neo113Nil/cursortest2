package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class fpu implements kpu {
    public final Function0 a;

    public fpu(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpu) && this.a.equals(((fpu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(onRetry=" + this.a + ")";
    }
}

package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tbf extends fq5 {
    public final Object c;

    public tbf(Function0 function0, Function1 function1, f0g f0gVar) {
        super(f0gVar, function1);
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tbf) && Intrinsics.d(this.c, ((tbf) obj).c);
    }

    public final int hashCode() {
        Object obj = this.c;
        return 2094744723 + (obj != null ? obj.hashCode() : 0);
    }
}

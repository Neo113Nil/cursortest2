package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class szb {
    public abstract Object a(xzb xzbVar);

    public abstract Object b();

    public abstract ja8 c(xzb xzbVar, Function1 function1);

    public ja8 d(xzb xzbVar, Function1 function1) {
        Object obj;
        try {
            obj = a(xzbVar);
        } catch (z7k unused) {
            obj = null;
        }
        if (obj != null) {
            function1.invoke(obj);
        }
        return c(xzbVar, function1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof szb) {
            return Intrinsics.d(b(), ((szb) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode() * 16;
    }
}

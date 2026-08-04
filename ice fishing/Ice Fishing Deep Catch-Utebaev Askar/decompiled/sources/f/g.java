package f;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f124c;

    public g(Function0 initializer, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i2 & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f122a = initializer;
        this.f123b = h.f125a;
        this.f124c = obj == null ? this : obj;
    }

    public final Object a() {
        Object objInvoke;
        Object obj = this.f123b;
        h hVar = h.f125a;
        if (obj != hVar) {
            return obj;
        }
        synchronized (this.f124c) {
            objInvoke = this.f123b;
            if (objInvoke == hVar) {
                Function0 function0 = this.f122a;
                Intrinsics.b(function0);
                objInvoke = function0.invoke();
                this.f123b = objInvoke;
                this.f122a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f123b != h.f125a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class jyr implements arf, Serializable {
    public Function0 a;
    public volatile Object b;
    public final Object c;

    public jyr(Object obj, Function0 function0) {
        function0.getClass();
        this.a = function0;
        this.b = set.a;
        this.c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new kme(getValue());
    }

    @Override // defpackage.arf
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        set setVar = set.a;
        if (obj2 != setVar) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == setVar) {
                Function0 function0 = this.a;
                function0.getClass();
                obj = function0.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    @Override // defpackage.arf
    public final boolean isInitialized() {
        return this.b != set.a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ jyr(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 2) != 0 ? null : obj, function0);
    }
}

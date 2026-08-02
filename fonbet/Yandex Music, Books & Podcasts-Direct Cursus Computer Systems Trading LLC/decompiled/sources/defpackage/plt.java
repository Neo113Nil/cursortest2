package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class plt implements arf, Serializable {
    public Function0 a;
    public Object b;

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new kme(getValue());
    }

    @Override // defpackage.arf
    public final Object getValue() {
        if (this.b == set.a) {
            Function0 function0 = this.a;
            function0.getClass();
            this.b = function0.invoke();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.arf
    public final boolean isInitialized() {
        return this.b != set.a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

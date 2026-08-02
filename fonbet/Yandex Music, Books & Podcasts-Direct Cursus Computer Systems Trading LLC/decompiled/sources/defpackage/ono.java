package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ono implements arf, Serializable {

    @NotNull
    public static final nno c = new nno(null);
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(ono.class, Object.class, "b");
    public volatile Function0 a;
    public volatile Object b;

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new kme(getValue());
    }

    @Override // defpackage.arf
    public final Object getValue() {
        Object obj = this.b;
        set setVar = set.a;
        if (obj != setVar) {
            return obj;
        }
        Function0 function0 = this.a;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, setVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != setVar) {
                }
            }
            this.a = null;
            return invoke;
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

package kotlin;

import defpackage.i3y;
import defpackage.sls;
import defpackage.tse0;
import defpackage.xw91;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Li3y;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "Lkotlin/Function0;", "initializer", "Lsls;", "_value", "Ljava/lang/Object;", "final", "getFinal$annotations", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SafePublicationLazyImpl<T> implements i3y, Serializable {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;
    private final Object final;
    private volatile sls initializer;

    public SafePublicationLazyImpl(sls slsVar) {
        this.initializer = slsVar;
        xw91 xw91Var = xw91.G;
        this._value = xw91Var;
        this.final = xw91Var;
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // defpackage.i3y
    public final Object getValue() {
        Object obj = this._value;
        if (obj != xw91.G) {
            return obj;
        }
        sls slsVar = this.initializer;
        if (slsVar != null) {
            Object invoke = slsVar.invoke();
            if (tse0.D(a, this, invoke)) {
                this.initializer = null;
                return invoke;
            }
        }
        return this._value;
    }

    @Override // defpackage.i3y
    public final boolean isInitialized() {
        return this._value != xw91.G;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

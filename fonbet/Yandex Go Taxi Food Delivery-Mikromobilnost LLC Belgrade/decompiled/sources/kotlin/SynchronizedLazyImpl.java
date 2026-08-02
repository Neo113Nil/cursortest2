package kotlin;

import defpackage.i3y;
import defpackage.sls;
import defpackage.xw91;
import java.io.Serializable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Li3y;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Lkotlin/Function0;", "initializer", "Lsls;", "_value", "Ljava/lang/Object;", "lock", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
final class SynchronizedLazyImpl<T> implements i3y, Serializable {
    private sls initializer;
    private volatile Object _value = xw91.G;
    private final Object lock = this;

    public SynchronizedLazyImpl(sls slsVar) {
        this.initializer = slsVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // defpackage.i3y
    public final Object getValue() {
        Object obj;
        Object obj2 = this._value;
        xw91 xw91Var = xw91.G;
        if (obj2 != xw91Var) {
            return obj2;
        }
        synchronized (this.lock) {
            obj = this._value;
            if (obj == xw91Var) {
                obj = this.initializer.invoke();
                this._value = obj;
                this.initializer = null;
            }
        }
        return obj;
    }

    @Override // defpackage.i3y
    public final boolean isInitialized() {
        return this._value != xw91.G;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

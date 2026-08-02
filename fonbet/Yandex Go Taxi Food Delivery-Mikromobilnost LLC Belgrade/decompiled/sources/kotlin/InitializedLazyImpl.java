package kotlin;

import defpackage.i3y;
import java.io.Serializable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/InitializedLazyImpl;", "T", "Li3y;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InitializedLazyImpl<T> implements i3y, Serializable {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    public InitializedLazyImpl(Object obj) {
        this.value = obj;
    }

    @Override // defpackage.i3y
    public final Object getValue() {
        return this.value;
    }

    @Override // defpackage.i3y
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}

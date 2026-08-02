package androidx.datastore.core;

/* loaded from: classes3.dex */
public final class Final extends State {
    public final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(Throwable th) {
        super(Integer.MAX_VALUE);
        th.getClass();
        this.finalException = th;
    }

    public final Throwable getFinalException() {
        return this.finalException;
    }
}

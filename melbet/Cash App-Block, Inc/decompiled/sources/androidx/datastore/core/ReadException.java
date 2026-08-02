package androidx.datastore.core;

/* loaded from: classes.dex */
public final class ReadException extends State {
    public final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable th, int i) {
        super(i);
        th.getClass();
        this.readException = th;
    }
}

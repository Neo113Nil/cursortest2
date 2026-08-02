package defpackage;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class dq4 implements Closeable {
    public boolean a;
    public final uob b;

    public dq4() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        newSingleThreadExecutor.getClass();
        this.b = new uob(newSingleThreadExecutor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        this.b.close();
        this.a = true;
    }
}

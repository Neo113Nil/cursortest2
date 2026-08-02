package defpackage;

import com.google.android.datatransport.runtime.scheduling.persistence.e;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class sbg implements Closeable {
    public yvf0 a;
    public k5m b;
    public yvf0 c;
    public e w;
    public yvf0 x;
    public yvf0 y;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((ugo) this.x.get()).close();
    }
}

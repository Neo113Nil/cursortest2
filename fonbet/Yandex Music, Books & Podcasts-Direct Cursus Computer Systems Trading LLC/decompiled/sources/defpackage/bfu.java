package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class bfu {
    private final cfu impl;

    public bfu() {
        this.impl = new cfu();
    }

    public final void addCloseable(@NotNull String str, @NotNull AutoCloseable autoCloseable) {
        str.getClass();
        autoCloseable.getClass();
        cfu cfuVar = this.impl;
        if (cfuVar != null) {
            cfuVar.b(str, autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        cfu cfuVar = this.impl;
        if (cfuVar != null && !cfuVar.d) {
            cfuVar.d = true;
            synchronized (cfuVar.a) {
                try {
                    Iterator it = cfuVar.b.values().iterator();
                    while (it.hasNext()) {
                        cfu.c((AutoCloseable) it.next());
                    }
                    Iterator it2 = cfuVar.c.iterator();
                    while (it2.hasNext()) {
                        cfu.c((AutoCloseable) it2.next());
                    }
                    cfuVar.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(@NotNull String str) {
        T t;
        str.getClass();
        cfu cfuVar = this.impl;
        if (cfuVar == null) {
            return null;
        }
        synchronized (cfuVar.a) {
            t = (T) cfuVar.b.get(str);
        }
        return t;
    }

    public bfu(tf6 tf6Var) {
        this.impl = new cfu(tf6Var);
    }

    public void addCloseable(@NotNull AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        cfu cfuVar = this.impl;
        if (cfuVar != null) {
            cfuVar.a(autoCloseable);
        }
    }

    @vx7
    public /* synthetic */ void addCloseable(Closeable closeable) {
        closeable.getClass();
        cfu cfuVar = this.impl;
        if (cfuVar != null) {
            cfuVar.a(closeable);
        }
    }

    public void onCleared() {
    }
}

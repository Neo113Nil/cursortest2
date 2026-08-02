package defpackage;

import coil3.disk.a;

/* loaded from: classes.dex */
public final class txj implements AutoCloseable {
    public final oxj a;
    public boolean b;
    public final /* synthetic */ a c;

    public txj(a aVar, oxj oxjVar) {
        this.c = aVar;
        this.a = oxjVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        a aVar = this.c;
        synchronized (aVar.A) {
            oxj oxjVar = this.a;
            int i = oxjVar.h - 1;
            oxjVar.h = i;
            if (i == 0 && oxjVar.f) {
                aVar.w(oxjVar);
            }
        }
    }
}

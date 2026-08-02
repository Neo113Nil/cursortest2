package defpackage;

import java.io.Closeable;

/* loaded from: classes15.dex */
public final class q43 implements Closeable {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public Object c;

    public q43(yab yabVar) {
        this.c = yabVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                this.c = null;
                this.b = true;
                break;
            default:
                ((yab) this.c).close();
                break;
        }
    }

    public /* synthetic */ q43() {
    }
}

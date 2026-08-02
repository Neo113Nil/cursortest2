package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class doj extends o3o {
    public final o3o b;
    public final ikn c;
    public IOException d;

    public doj(o3o o3oVar) {
        this.b = o3oVar;
        this.c = new ikn(new d33(this, o3oVar.z()));
    }

    @Override // defpackage.o3o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.o3o
    public final long g() {
        return this.b.g();
    }

    @Override // defpackage.o3o
    public final twh o() {
        return this.b.o();
    }

    @Override // defpackage.o3o
    public final ij3 z() {
        return this.c;
    }
}

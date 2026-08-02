package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;

/* loaded from: classes4.dex */
public final class vs10 implements Closeable {
    public final boolean a;
    public final yp6 b;
    public final Deflater c;
    public final dph w;

    public vs10(boolean z) {
        this.a = z;
        yp6 yp6Var = new yp6();
        this.b = yp6Var;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.w = new dph(yp6Var, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w.close();
    }
}

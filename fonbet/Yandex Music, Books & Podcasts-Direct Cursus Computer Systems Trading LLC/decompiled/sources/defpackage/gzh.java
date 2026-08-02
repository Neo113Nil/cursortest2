package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class gzh implements Closeable {
    public final /* synthetic */ int a;
    public final boolean b;
    public final hi3 c;
    public final Object d;
    public final Closeable e;

    public gzh(int i, boolean z) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = z;
                hi3 hi3Var = new hi3();
                this.c = hi3Var;
                Inflater inflater = new Inflater(true);
                this.d = inflater;
                this.e = new ake(new ikn(hi3Var), inflater);
                break;
            default:
                this.b = z;
                hi3 hi3Var2 = new hi3();
                this.c = hi3Var2;
                Deflater deflater = new Deflater(-1, true);
                this.d = deflater;
                this.e = new vu7(hi3Var2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((vu7) this.e).close();
                break;
            default:
                ((ake) this.e).close();
                break;
        }
    }
}

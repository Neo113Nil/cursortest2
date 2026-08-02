package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* loaded from: classes9.dex */
public final class sa7 implements Closeable, Flushable {
    public final dyj a;

    public sa7(File file, long j) {
        hfx hfxVar = r1r.a;
        String str = oq90.b;
        this.a = new dyj(hfxVar, sms.e(file), j, mtx0.l);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }
}

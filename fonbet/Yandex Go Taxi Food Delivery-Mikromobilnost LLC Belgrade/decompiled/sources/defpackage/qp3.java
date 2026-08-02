package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes15.dex */
public class qp3 implements xbi0 {
    public final AtomicReference a = new AtomicReference();

    public final Closeable a() {
        return (Closeable) this.a.get();
    }

    public final void b(Closeable closeable) {
        Closeable closeable2 = (Closeable) this.a.getAndSet(closeable);
        if (closeable2 != null) {
            try {
                closeable2.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.vbi0
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, kgx kgxVar) {
        return a();
    }

    @Override // defpackage.xbi0
    public final /* bridge */ /* synthetic */ void setValue(Object obj, kgx kgxVar, Object obj2) {
        b((Closeable) obj2);
    }
}

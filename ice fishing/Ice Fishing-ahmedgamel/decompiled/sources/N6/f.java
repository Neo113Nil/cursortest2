package N6;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class f {
    public abstract int a();

    public final void b(OutputStream outputStream) {
        m mVar = new m(outputStream);
        try {
            c(mVar);
            mVar.close();
        } catch (Throwable th) {
            try {
                mVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract void c(o oVar);
}

package defpackage;

import com.yandex.quark.utils.Disposable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class vjd implements Disposable {
    public final ArrayList a = new ArrayList();
    public final Object b = new Object();

    public final void a(Disposable disposable) {
        synchronized (this.b) {
            this.a.add(disposable);
        }
    }

    @Override // com.yandex.quark.utils.Disposable
    public final void dispose() {
        synchronized (this.b) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((Disposable) it.next()).dispose();
                }
                this.a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

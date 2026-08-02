package defpackage;

import com.yandex.quark.js.QuarkJsState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class srd implements zhg0, eq60 {
    public final LinkedHashSet a = new LinkedHashSet();
    public volatile QuarkJsState b = QuarkJsState.NOT_CONNECTED;

    @Override // defpackage.eq60
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized void e(zhg0 zhg0Var) {
        QuarkJsState quarkJsState = this.b;
        QuarkJsState quarkJsState2 = QuarkJsState.DESTROYED;
        if (quarkJsState == quarkJsState2) {
            zhg0Var.d(quarkJsState2);
        } else {
            this.a.add(zhg0Var);
            zhg0Var.d(this.b);
        }
    }

    @Override // defpackage.zhg0
    public final void d(QuarkJsState quarkJsState) {
        if (this.b.a(quarkJsState)) {
            synchronized (this) {
                try {
                    if (this.b.a(quarkJsState)) {
                        this.b = quarkJsState;
                        Iterator it = a.J0(this.a).iterator();
                        while (it.hasNext()) {
                            ((zhg0) it.next()).d(quarkJsState);
                        }
                        if (quarkJsState == QuarkJsState.DESTROYED) {
                            this.a.clear();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.eq60
    public final void f(Object obj) {
        zhg0 zhg0Var = (zhg0) obj;
        synchronized (this) {
            this.a.remove(zhg0Var);
        }
    }
}

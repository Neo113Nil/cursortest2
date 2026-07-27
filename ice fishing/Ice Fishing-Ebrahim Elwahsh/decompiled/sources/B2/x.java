package B2;

import android.net.Uri;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f316b;

    public /* synthetic */ x(int i, Object obj) {
        this.f315a = i;
        this.f316b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f315a) {
            case 0:
                return ((C0267a) this.f316b).getViewSignals();
            case 1:
                synchronized (((q1.c) this.f316b)) {
                    try {
                        q1.c cVar = (q1.c) this.f316b;
                        if (cVar.f39898B == null) {
                            return null;
                        }
                        cVar.G();
                        if (((q1.c) this.f316b).z()) {
                            ((q1.c) this.f316b).E();
                            ((q1.c) this.f316b).f39900D = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            default:
                t2.D d2 = t2.G.f40858l;
                t2.G g9 = p2.j.f39798C.f39803c;
                return t2.G.o((Uri) this.f316b);
        }
    }
}

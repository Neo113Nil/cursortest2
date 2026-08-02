package E2;

import android.net.Uri;
import java.util.concurrent.Callable;
import r2.C4906k;
import w2.HandlerC5139A;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f879b;

    public /* synthetic */ v(int i, Object obj) {
        this.f878a = i;
        this.f879b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f878a) {
            case 0:
                return ((C0304a) this.f879b).getViewSignals();
            case 1:
                synchronized (((s1.c) this.f879b)) {
                    try {
                        s1.c cVar = (s1.c) this.f879b;
                        if (cVar.f40290B == null) {
                            return null;
                        }
                        cVar.G();
                        if (((s1.c) this.f879b).z()) {
                            ((s1.c) this.f879b).E();
                            ((s1.c) this.f879b).f40292D = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            default:
                HandlerC5139A handlerC5139A = w2.D.f41627l;
                w2.D d9 = C4906k.f40186C.f40191c;
                return w2.D.o((Uri) this.f879b);
        }
    }
}

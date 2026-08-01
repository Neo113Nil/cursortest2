package C2;

import android.net.Uri;
import java.util.concurrent.Callable;
import p2.C4835j;
import u2.HandlerC5068A;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f420b;

    public /* synthetic */ w(int i, Object obj) {
        this.f419a = i;
        this.f420b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f419a) {
            case 0:
                return ((C0268a) this.f420b).getViewSignals();
            case 1:
                synchronized (((q1.c) this.f420b)) {
                    try {
                        q1.c cVar = (q1.c) this.f420b;
                        if (cVar.f39991B == null) {
                            return null;
                        }
                        cVar.G();
                        if (((q1.c) this.f420b).z()) {
                            ((q1.c) this.f420b).E();
                            ((q1.c) this.f420b).f39993D = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            default:
                HandlerC5068A handlerC5068A = u2.D.f41237l;
                u2.D d2 = C4835j.f39733C.f39738c;
                return u2.D.o((Uri) this.f420b);
        }
    }
}

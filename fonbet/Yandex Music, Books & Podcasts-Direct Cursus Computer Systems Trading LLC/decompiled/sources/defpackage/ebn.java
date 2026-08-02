package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ebn implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ kbn b;

    public /* synthetic */ ebn(kbn kbnVar, int i) {
        this.a = i;
        this.b = kbnVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    str = "unknown";
                }
                kbn kbnVar = this.b;
                ReentrantLock reentrantLock = kbnVar.k;
                reentrantLock.lock();
                try {
                    ssg.a(4, "QueueRestoreFacade", "cancelRestore  trigger=".concat(str), null);
                    rar rarVar = kbnVar.p;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    kbnVar.p = null;
                    reentrantLock.unlock();
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                Object f = this.b.f((String) obj, false, continuation);
                return f == nm6.a ? f : Unit.a;
        }
    }
}

package o6;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t extends a7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Looper looper, int i10) {
        super(looper, 2);
        this.f5347a = i10;
        this.f5348b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f5347a) {
            case 0:
                v vVar = (v) this.f5348b;
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        v.f(vVar);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
                    return;
                }
                ReentrantLock reentrantLock = vVar.f5350b;
                reentrantLock.lock();
                try {
                    if (vVar.g()) {
                        vVar.i();
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    Log.w("GACStateManager", "Unknown message id: " + i11);
                    return;
                }
                x xVar = (x) message.obj;
                y yVar = (y) this.f5348b;
                xVar.getClass();
                yVar.f5373d.lock();
                try {
                    if (yVar.f5383n == xVar.f5372a) {
                        xVar.a();
                    }
                    return;
                } finally {
                    yVar.f5373d.unlock();
                }
        }
    }
}

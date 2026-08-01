package O2;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: O2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0370u extends a3.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2293c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0370u(Object obj, Looper looper, int i) {
        super(looper, 0, false);
        this.f2292b = i;
        this.f2293c = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ReentrantLock reentrantLock;
        switch (this.f2292b) {
            case 0:
                int i = message.what;
                w wVar = (w) this.f2293c;
                if (i == 1) {
                    ReentrantLock reentrantLock2 = wVar.f2310u;
                    reentrantLock2.lock();
                    try {
                        if (wVar.d()) {
                            wVar.g();
                        }
                        return;
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
                if (i == 2) {
                    w.c(wVar);
                    return;
                }
                StringBuilder sb = new StringBuilder(31);
                sb.append("Unknown message id: ");
                sb.append(i);
                Log.w("GoogleApiClientImpl", sb.toString());
                return;
            default:
                int i6 = message.what;
                if (i6 != 1) {
                    if (i6 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Unknown message id: ");
                    sb2.append(i6);
                    Log.w("GACStateManager", sb2.toString());
                    return;
                }
                y yVar = (y) message.obj;
                z zVar = (z) this.f2293c;
                yVar.getClass();
                zVar.f2324n.lock();
                try {
                    if (zVar.f2320D != yVar.f2316a) {
                        reentrantLock = zVar.f2324n;
                    } else {
                        yVar.a();
                        reentrantLock = zVar.f2324n;
                    }
                    reentrantLock.unlock();
                    return;
                } catch (Throwable th) {
                    zVar.f2324n.unlock();
                    throw th;
                }
        }
    }
}

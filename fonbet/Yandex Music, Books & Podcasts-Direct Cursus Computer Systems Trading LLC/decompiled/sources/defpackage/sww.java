package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class sww extends fsn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sww(Object obj, Looper looper, int i) {
        super(looper, 1);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                uww uwwVar = (uww) this.b;
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        uww.j(uwwVar);
                        return;
                    }
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + i);
                    return;
                }
                ReentrantLock reentrantLock = uwwVar.b;
                reentrantLock.lock();
                try {
                    if (uwwVar.k()) {
                        uwwVar.m();
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    Log.w("GACStateManager", "Unknown message id: " + i2);
                    return;
                }
                www wwwVar = (www) message.obj;
                xww xwwVar = (xww) this.b;
                wwwVar.getClass();
                xwwVar.a.lock();
                try {
                    if (xwwVar.q == wwwVar.a) {
                        wwwVar.a();
                    }
                    return;
                } finally {
                    xwwVar.a.unlock();
                }
        }
    }
}

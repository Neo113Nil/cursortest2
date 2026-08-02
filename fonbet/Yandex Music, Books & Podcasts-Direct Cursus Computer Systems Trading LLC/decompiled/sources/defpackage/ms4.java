package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public abstract class ms4 extends p9 {
    public final void G(jyd jydVar) {
        yyd yydVar = (yyd) this.a;
        yydVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ReentrantLock reentrantLock = yydVar.a;
        reentrantLock.lock();
        try {
            yydVar.b.put(jydVar, new tyd(jydVar, elapsedRealtime));
            reentrantLock.unlock();
            Log.d("Pulse", jydVar.z().concat(" - start"));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

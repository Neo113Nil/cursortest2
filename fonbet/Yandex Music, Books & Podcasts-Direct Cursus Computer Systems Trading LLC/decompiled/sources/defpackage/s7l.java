package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;

/* loaded from: classes4.dex */
public final class s7l implements q7l {
    public final k1l a;
    public final f7l b;
    public rar d;
    public rar e;
    public final tf6 c = gld.e(e.c(a4g.n(), new im6("PlaybackStopperImpl")).plus(dm6.b));
    public final ReentrantLock f = new ReentrantLock();

    public s7l(k1l k1lVar, f7l f7lVar) {
        this.a = k1lVar;
        this.b = f7lVar;
    }

    @Override // defpackage.q7l
    public final void a() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            rar rarVar = this.d;
            Continuation continuation = null;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.d = x97.y(this.c, null, null, new r7l(this, continuation, 0), 3);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.q7l
    public final void b() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            rar rarVar = this.e;
            Continuation continuation = null;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.e = x97.y(this.c, null, null, new r7l(this, continuation, 1), 3);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

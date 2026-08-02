package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import ru.yandex.music.YMApplication;

/* loaded from: classes6.dex */
public final class tdq implements erc {
    public final /* synthetic */ tqn a;
    public final /* synthetic */ YMApplication b;
    public final /* synthetic */ tqn c;

    public tdq(tqn tqnVar, YMApplication yMApplication, tqn tqnVar2) {
        this.a = tqnVar;
        this.b = yMApplication;
        this.c = tqnVar2;
    }

    @Override // defpackage.erc
    public final void a() {
        sdq sdqVar = new sdq(this.a, this.b, 0);
        if (lbr.a.get() == gcr.c) {
            sdqVar.invoke();
            return;
        }
        ReentrantLock reentrantLock = lbr.e;
        reentrantLock.lock();
        try {
            lbr.f.add(sdqVar);
            reentrantLock.unlock();
            lbr.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.erc
    public final void b() {
        sdq sdqVar = new sdq(this.c, this.b, 1);
        if (lbr.a.get() == gcr.c) {
            sdqVar.invoke();
            return;
        }
        ReentrantLock reentrantLock = lbr.e;
        reentrantLock.lock();
        try {
            lbr.f.add(sdqVar);
            reentrantLock.unlock();
            lbr.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

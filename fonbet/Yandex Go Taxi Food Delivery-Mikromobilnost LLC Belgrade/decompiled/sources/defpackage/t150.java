package defpackage;

import com.google.android.gms.common.api.internal.zabh;
import java.util.concurrent.locks.Lock;

/* loaded from: classes11.dex */
public abstract class t150 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ t150(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public abstract void a();

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String name = Thread.currentThread().getName();
                Thread currentThread = Thread.currentThread();
                StringBuilder v = oyr.v(name, "-");
                v.append((String) obj);
                currentThread.setName(v.toString());
                try {
                    a();
                    return;
                } finally {
                    Thread.currentThread().setName(name);
                }
            default:
                yx81 yx81Var = (yx81) obj;
                Lock lock = yx81Var.b;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            b();
                        }
                    } catch (RuntimeException e) {
                        zabh zabhVar = yx81Var.a.x;
                        zabhVar.sendMessage(zabhVar.obtainMessage(2, e));
                    }
                    return;
                } finally {
                    lock.unlock();
                }
        }
    }
}

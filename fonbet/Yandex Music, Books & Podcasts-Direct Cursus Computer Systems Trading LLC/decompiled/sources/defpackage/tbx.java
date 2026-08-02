package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tbx implements pjx, tqj, zpj, spj {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public tbx(Executor executor, spj spjVar) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.d = spjVar;
    }

    @Override // defpackage.pjx
    public final void a(Task task) {
        switch (this.a) {
            case 0:
                if (task.j()) {
                    synchronized (this.c) {
                    }
                    this.b.execute(new yyo(23, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.c) {
                    try {
                        if (((OnCompleteListener) this.d) == null) {
                            return;
                        }
                        this.b.execute(new rxw(13, this, task));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (task.l() || task.j()) {
                    return;
                }
                synchronized (this.c) {
                }
                this.b.execute(new rxw(14, this, task));
                return;
            case 3:
                if (task.l()) {
                    synchronized (this.c) {
                    }
                    this.b.execute(new rxw(15, this, task));
                    return;
                }
                return;
            default:
                this.b.execute(new rxw(17, this, task));
                return;
        }
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        ((onx) this.d).p(exc);
    }

    @Override // defpackage.spj
    public void e() {
        ((onx) this.d).r();
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        ((onx) this.d).q(obj);
    }

    public tbx(Executor executor, zpj zpjVar) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.d = zpjVar;
    }

    public tbx(Executor executor, tqj tqjVar) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.d = tqjVar;
    }

    public tbx(Executor executor, aqr aqrVar, onx onxVar) {
        this.a = 4;
        this.b = executor;
        this.c = aqrVar;
        this.d = onxVar;
    }

    public tbx(Executor executor, OnCompleteListener onCompleteListener) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.d = onCompleteListener;
    }
}

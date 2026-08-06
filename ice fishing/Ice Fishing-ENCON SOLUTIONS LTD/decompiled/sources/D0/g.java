package D0;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g implements b, i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f217b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f218c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f219d;

    public g(l lVar, Z0.i iVar, m mVar) {
        this.f216a = 0;
        this.f217b = lVar;
        this.f218c = iVar;
        this.f219d = mVar;
    }

    @Override // D0.i
    public final void a(Task task) {
        switch (this.f216a) {
            case 0:
                ((l) this.f217b).execute(new f(0, this, task));
                return;
            case 1:
                synchronized (this.f218c) {
                    try {
                        if (((a) this.f219d) == null) {
                            return;
                        }
                        this.f217b.execute(new f(1, this, task));
                        return;
                    } finally {
                    }
                }
            default:
                if (task.d()) {
                    synchronized (this.f218c) {
                        try {
                            if (((b) this.f219d) != null) {
                                this.f217b.execute(new f(2, this, task));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // D0.b
    public void onSuccess(Object obj) {
        ((m) this.f219d).f(obj);
    }

    public g(Executor executor, a aVar) {
        this.f216a = 1;
        this.f218c = new Object();
        this.f217b = executor;
        this.f219d = aVar;
    }

    public g(Executor executor, b bVar) {
        this.f216a = 2;
        this.f218c = new Object();
        this.f217b = executor;
        this.f219d = bVar;
    }
}

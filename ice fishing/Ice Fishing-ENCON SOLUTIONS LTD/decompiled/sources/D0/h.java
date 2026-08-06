package D0;

import com.google.android.gms.tasks.Task;
import p0.AbstractC1021r;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220a;

    /* renamed from: b, reason: collision with root package name */
    public final k f221b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f222c;

    /* renamed from: d, reason: collision with root package name */
    public final g f223d;

    public h(k kVar, g gVar, int i2) {
        this.f220a = i2;
        switch (i2) {
            case 1:
                this.f222c = new Object();
                this.f221b = kVar;
                this.f223d = gVar;
                break;
            default:
                this.f222c = new Object();
                this.f221b = kVar;
                this.f223d = gVar;
                break;
        }
    }

    @Override // D0.i
    public final void a(Task task) {
        switch (this.f220a) {
            case 0:
                if (((m) task).f232d) {
                    synchronized (this.f222c) {
                        try {
                            if (this.f223d != null) {
                                k kVar = this.f221b;
                                C.b bVar = new C.b(1, this);
                                kVar.getClass();
                                bVar.run();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                if (task.d() || ((m) task).f232d) {
                    return;
                }
                synchronized (this.f222c) {
                    try {
                        if (this.f223d != null) {
                            this.f221b.getClass();
                            synchronized (this.f222c) {
                                try {
                                    g gVar = this.f223d;
                                    if (gVar != null) {
                                        Exception b2 = task.b();
                                        AbstractC1021r.c(b2);
                                        ((m) gVar.f219d).e(b2);
                                    }
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}

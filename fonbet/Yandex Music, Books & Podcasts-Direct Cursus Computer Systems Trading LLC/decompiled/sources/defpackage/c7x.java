package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c7x implements pjx, tqj, zpj, spj {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ag6 c;
    public final onx d;

    public /* synthetic */ c7x(Executor executor, ag6 ag6Var, onx onxVar, int i) {
        this.a = i;
        this.b = executor;
        this.c = ag6Var;
        this.d = onxVar;
    }

    @Override // defpackage.pjx
    public final void a(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new rxw(9, this, task));
                break;
            default:
                this.b.execute(new rxw(10, this, task));
                break;
        }
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        this.d.p(exc);
    }

    @Override // defpackage.spj
    public void e() {
        this.d.r();
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        this.d.q(obj);
    }
}

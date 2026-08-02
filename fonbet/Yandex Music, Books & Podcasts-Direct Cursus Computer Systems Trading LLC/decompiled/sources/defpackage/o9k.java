package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes6.dex */
public final class o9k implements spj, OnCompleteListener {
    public final /* synthetic */ zt3 a;

    public /* synthetic */ o9k(zt3 zt3Var) {
        this.a = zt3Var;
    }

    @Override // defpackage.spj
    public void e() {
        this.a.h(null);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception g = task.g();
        zt3 zt3Var = this.a;
        if (g != null) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(g));
        } else if (task.j()) {
            zt3Var.h(null);
        } else {
            r7o r7oVar2 = z7o.b;
            zt3Var.resumeWith(task.h());
        }
    }
}

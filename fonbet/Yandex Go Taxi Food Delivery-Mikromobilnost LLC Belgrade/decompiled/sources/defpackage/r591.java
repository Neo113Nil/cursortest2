package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class r591 implements o25, wx60 {
    public final atx0 a;

    public r591(int i, atx0 atx0Var) {
        switch (i) {
            case 1:
                this.a = atx0Var;
                break;
            default:
                cvw.l(atx0Var);
                this.a = atx0Var;
                break;
        }
    }

    @Override // defpackage.o25
    public /* synthetic */ void a(uyj0 uyj0Var) {
        ntx0.a((Status) uyj0Var, null, this.a);
    }

    @Override // defpackage.wx60
    public /* synthetic */ void onComplete(Task task) {
        if (task.o()) {
            return;
        }
        Exception j = task.j();
        Objects.requireNonNull(j);
        this.a.b(j);
    }
}

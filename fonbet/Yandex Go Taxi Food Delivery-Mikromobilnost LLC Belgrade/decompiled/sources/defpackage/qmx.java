package defpackage;

import com.google.android.gms.tasks.Task;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import retrofit2.Call;
import retrofit2.HttpException;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class qmx implements yk7, wx60 {
    public final /* synthetic */ j18 a;

    public /* synthetic */ qmx(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // defpackage.yk7
    public void k(Call call, Throwable th) {
        this.a.resumeWith(new Result.Failure(th));
    }

    @Override // defpackage.yk7
    public void o(Call call, Response response) {
        boolean z = response.a.J;
        j18 j18Var = this.a;
        if (!z) {
            j18Var.resumeWith(new Result.Failure(new HttpException(response)));
            return;
        }
        Object obj = response.b;
        if (obj != null) {
            j18Var.resumeWith(obj);
            return;
        }
        bxw bxwVar = (bxw) call.k().c(bxw.class);
        j18Var.resumeWith(new Result.Failure(new KotlinNullPointerException("Response from " + bxwVar.a.getName() + '.' + bxwVar.c.getName() + " was null but response body type was declared as non-null")));
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        Exception j = task.j();
        j18 j18Var = this.a;
        if (j != null) {
            j18Var.resumeWith(new Result.Failure(j));
        } else if (task.m()) {
            j18Var.b(null);
        } else {
            j18Var.resumeWith(task.k());
        }
    }
}

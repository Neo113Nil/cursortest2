package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes8.dex */
public final class vut implements wx60, yk7 {
    public final /* synthetic */ j18 a;

    public /* synthetic */ vut(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // defpackage.yk7
    public void k(Call call, Throwable th) {
        this.a.resumeWith(new Result.Failure(th));
    }

    @Override // defpackage.yk7
    public void o(Call call, Response response) {
        this.a.resumeWith(response);
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        j18 j18Var = this.a;
        try {
            Boolean bool = (Boolean) task.l(ApiException.class);
            j18Var.resumeWith(Boolean.valueOf(bool != null && bool.booleanValue()));
        } catch (ApiException e) {
            j18Var.b(new RuntimeException("request google pay availability failed", e));
        }
    }
}

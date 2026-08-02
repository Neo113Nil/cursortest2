package defpackage;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class ms3 implements Call {
    public final Call a;
    public final Annotation[] b;
    public final boolean c;
    public final Gson d;
    public final sfm e;

    public ms3(Call call, Annotation[] annotationArr, boolean z, Gson gson, sfm sfmVar) {
        call.getClass();
        annotationArr.getClass();
        sfmVar.getClass();
        this.a = call;
        this.b = annotationArr;
        this.c = z;
        this.d = gson;
        this.e = sfmVar;
    }

    @Override // retrofit2.Call
    public final void D(os3 os3Var) {
        this.a.D(new xiu(11, this, os3Var));
    }

    @Override // retrofit2.Call
    public final d0o a() {
        d0o a = this.a.a();
        a.getClass();
        return a;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.a.cancel();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new ms3(this.a.clone(), this.b, this.c, this.d, this.e);
    }

    @Override // retrofit2.Call
    public final boolean o() {
        return this.a.o();
    }
}

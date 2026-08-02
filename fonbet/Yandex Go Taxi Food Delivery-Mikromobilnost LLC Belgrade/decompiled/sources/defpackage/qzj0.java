package defpackage;

import kotlin.Result;

/* loaded from: classes9.dex */
public final class qzj0 implements nk3 {
    public final tls b;
    public final sls c;

    public qzj0(sls slsVar, tls tlsVar) {
        this.b = tlsVar;
        this.c = slsVar;
    }

    @Override // defpackage.nk3
    public final void a() {
        sls slsVar = this.c;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // defpackage.nk3
    public final void b(Throwable th) {
        if (th == null) {
            th = new Exception();
        }
        this.b.invoke(new Result(new Result.Failure(th)));
    }

    @Override // defpackage.nk3
    public final void onSuccess() {
        this.b.invoke(new Result(zy11.a));
    }
}

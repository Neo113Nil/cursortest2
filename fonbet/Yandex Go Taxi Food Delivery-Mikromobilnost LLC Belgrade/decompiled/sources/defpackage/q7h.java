package defpackage;

import java.util.concurrent.Executor;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes15.dex */
public final class q7h implements Call {
    public final Executor a;
    public final Call b;

    public q7h(Executor executor, Call call) {
        this.a = executor;
        this.b = call;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.b.cancel();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new q7h(this.a, this.b.clone());
    }

    @Override // retrofit2.Call
    public final Response execute() {
        return this.b.execute();
    }

    @Override // retrofit2.Call
    public final d5j0 k() {
        return this.b.k();
    }

    @Override // retrofit2.Call
    public final void k0(yk7 yk7Var) {
        this.b.k0(new j0g(this, yk7Var, false));
    }

    @Override // retrofit2.Call
    public final boolean l1() {
        return this.b.l1();
    }

    @Override // retrofit2.Call
    public final boolean n() {
        return this.b.n();
    }
}

package defpackage;

import java.util.concurrent.Executor;
import retrofit2.Call;

/* loaded from: classes5.dex */
public final class mk7 implements Call {
    public final Executor a;
    public final Call b;

    public mk7(Executor executor, Call call) {
        this.a = executor;
        this.b = call;
    }

    @Override // retrofit2.Call
    public final void D(os3 os3Var) {
        this.b.D(new yfx(this, os3Var, false, 18));
    }

    @Override // retrofit2.Call
    public final d0o a() {
        return this.b.a();
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.b.cancel();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new mk7(this.a, this.b.clone());
    }

    @Override // retrofit2.Call
    public final boolean o() {
        return this.b.o();
    }
}

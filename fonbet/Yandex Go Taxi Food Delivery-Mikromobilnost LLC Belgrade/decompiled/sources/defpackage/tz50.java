package defpackage;

import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes8.dex */
public final class tz50 implements Call {
    public final Call a;

    public tz50(Call call) {
        this.a = call;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.a.cancel();
    }

    public final Object clone() {
        return new tz50(this.a.clone());
    }

    @Override // retrofit2.Call
    public final Response execute() {
        throw new UnsupportedOperationException("NetworkResultCall does not support execute.");
    }

    @Override // retrofit2.Call
    public final d5j0 k() {
        return this.a.k();
    }

    @Override // retrofit2.Call
    public final void k0(yk7 yk7Var) {
        this.a.k0(new kjz(11, yk7Var, this));
    }

    @Override // retrofit2.Call
    public final boolean l1() {
        return this.a.l1();
    }

    @Override // retrofit2.Call
    public final boolean n() {
        return this.a.n();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new tz50(this.a.clone());
    }
}

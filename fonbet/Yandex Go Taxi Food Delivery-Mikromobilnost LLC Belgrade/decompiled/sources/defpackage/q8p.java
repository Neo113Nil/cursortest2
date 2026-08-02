package defpackage;

import okhttp3.internal.connection.RealConnection;

/* loaded from: classes9.dex */
public final class q8p implements f7l0 {
    public final e7l0 a;

    public q8p(Throwable th) {
        this.a = new e7l0(this, null, th, 2);
    }

    @Override // defpackage.f7l0
    public final RealConnection a() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.f7l0
    public final e7l0 c() {
        return this.a;
    }

    @Override // defpackage.f7l0, defpackage.ojo
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.f7l0
    public final e7l0 d() {
        return this.a;
    }

    @Override // defpackage.f7l0
    public final f7l0 f() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.f7l0
    public final boolean isReady() {
        return false;
    }
}

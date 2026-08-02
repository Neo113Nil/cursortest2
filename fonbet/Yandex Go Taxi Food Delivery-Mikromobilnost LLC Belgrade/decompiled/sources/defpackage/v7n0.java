package defpackage;

import com.yandex.go.scooters.domain.f;

/* loaded from: classes13.dex */
public final class v7n0 implements cwn0 {
    public final ah00 a;
    public final tse b;
    public final rqo c;
    public boolean d;
    public pzt0 e;

    public v7n0(ah00 ah00Var, tse tseVar, rqo rqoVar) {
        this.a = ah00Var;
        this.b = tseVar;
        this.c = rqoVar;
    }

    @Override // defpackage.cwn0
    public final void b() {
        ((gh00) this.a).q(new f(this, 1));
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        ((gh00) this.a).q(new f(this, 0));
    }
}

package defpackage;

import androidx.compose.runtime.h;

/* loaded from: classes.dex */
public final class qwd extends h {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public qwd(tls tlsVar) {
        super(new bgc(19));
        this.c = new rwd(tlsVar);
    }

    @Override // androidx.compose.runtime.h
    public final vvf0 a(Object obj) {
        switch (this.b) {
            case 0:
                return new vvf0(this, obj, obj == null, null, true);
            default:
                return new vvf0(this, obj, obj == null, (e3t0) this.c, true);
        }
    }

    @Override // androidx.compose.runtime.h
    public j131 b() {
        switch (this.b) {
            case 0:
                return (rwd) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwd(sls slsVar) {
        super(slsVar);
        ngd0 ngd0Var = ngd0.F;
        this.c = ngd0Var;
    }
}

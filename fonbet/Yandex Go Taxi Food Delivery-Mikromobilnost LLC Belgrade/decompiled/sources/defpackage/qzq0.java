package defpackage;

import com.google.firebase.sessions.settings.b;

/* loaded from: classes.dex */
public final class qzq0 implements wvf0 {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final wvf0 c;

    public /* synthetic */ qzq0(wvf0 wvf0Var, wvf0 wvf0Var2, int i) {
        this.a = i;
        this.b = wvf0Var;
        this.c = wvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        wvf0 wvf0Var = this.c;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                return new pzq0((e7z0) yvf0Var.get(), (by21) wvf0Var.get());
            default:
                return new b((xcr0) yvf0Var.get(), (xcr0) wvf0Var.get());
        }
    }
}

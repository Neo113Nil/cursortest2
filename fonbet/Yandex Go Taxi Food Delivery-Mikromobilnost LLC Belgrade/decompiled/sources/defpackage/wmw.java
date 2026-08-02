package defpackage;

import java.util.Collections;

/* loaded from: classes5.dex */
public final class wmw implements rdq0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m230 b;

    public /* synthetic */ wmw(m230 m230Var, int i) {
        this.a = i;
        this.b = m230Var;
    }

    @Override // defpackage.rdq0
    public final void I(bgq0 bgq0Var) {
        int i = this.a;
        m230 m230Var = this.b;
        switch (i) {
            case 0:
                ((e9w) ((xmw) m230Var).I).c(bgq0Var);
                break;
            default:
                cpw cpwVar = (cpw) m230Var;
                ((e9w) cpwVar.H).c(bgq0Var);
                cir cirVar = cpwVar.G;
                ((dir) cirVar).a.g(new zhr(Collections.singletonList("reload_parcel_recipient")));
                break;
        }
    }
}

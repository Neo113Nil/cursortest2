package flex.feature.timed.action;

import defpackage.dw;
import defpackage.kr;
import defpackage.n6u;
import defpackage.tje;
import defpackage.tse;
import defpackage.uph;

/* loaded from: classes4.dex */
public final class b implements dw {
    public final tse a;

    public b(tse tseVar) {
        this.a = tseVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        tje.N(this.a, null, null, new DelayedActionHandler$handle$1((uph) krVar, n6uVar, null), 3);
    }
}

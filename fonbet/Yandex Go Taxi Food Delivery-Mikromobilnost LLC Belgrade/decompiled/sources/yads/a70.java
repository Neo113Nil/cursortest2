package yads;

import defpackage.ez71;
import defpackage.h971;
import defpackage.mo71;
import defpackage.pl61;
import defpackage.sbx;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class a70 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a70(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        mo71 mo71Var = new mo71();
        sbx sbxVar = (sbx) this.b.s.getValue();
        new ez71();
        return new pl61(mo71Var, sbxVar);
    }
}

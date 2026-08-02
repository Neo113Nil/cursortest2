package yads;

import defpackage.dt81;
import defpackage.h971;
import defpackage.sls;
import defpackage.tv81;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class t60 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new dt81((tv81) this.b.g.getValue());
    }
}

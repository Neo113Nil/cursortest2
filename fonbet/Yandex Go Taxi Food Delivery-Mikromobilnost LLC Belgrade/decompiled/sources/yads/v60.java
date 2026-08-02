package yads;

import defpackage.h971;
import defpackage.j291;
import defpackage.sls;
import defpackage.tv81;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class v60 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new j291((tv81) this.b.g.getValue());
    }
}

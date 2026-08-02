package yads;

import defpackage.b881;
import defpackage.h971;
import defpackage.sls;
import defpackage.vd81;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class f60 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new vd81((b881) this.b.C.getValue());
    }
}

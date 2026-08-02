package yads;

import defpackage.b881;
import defpackage.h971;
import defpackage.s681;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class e60 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new s681((b881) this.b.C.getValue());
    }
}

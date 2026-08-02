package yads;

import defpackage.h971;
import defpackage.ir81;
import defpackage.sbx;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class k60 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new ir81((sbx) this.b.s.getValue());
    }
}

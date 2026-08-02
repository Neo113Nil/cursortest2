package yads;

import defpackage.h971;
import defpackage.i671;
import defpackage.k471;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class e70 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new i671(((k471) this.b.a.getValue()).a);
    }
}

package yads;

import defpackage.dt81;
import defpackage.f181;
import defpackage.h971;
import defpackage.kt71;
import defpackage.mj81;
import defpackage.pz61;
import defpackage.sls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class x50 extends Lambda implements sls {
    public final /* synthetic */ h971 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(h971 h971Var) {
        super(0);
        this.b = h971Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new f181((kt71) this.b.f.getValue(), (dt81) this.b.h.getValue(), (pz61) this.b.i.getValue(), (mj81) this.b.j.getValue());
    }
}

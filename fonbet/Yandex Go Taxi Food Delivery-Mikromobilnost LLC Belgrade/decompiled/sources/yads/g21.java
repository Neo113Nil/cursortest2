package yads;

import defpackage.mf71;
import defpackage.sls;
import defpackage.vb71;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class g21 extends Lambda implements sls {
    public final /* synthetic */ vb71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g21(vb71 vb71Var) {
        super(0);
        this.b = vb71Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return mf71.d.a(this.b.a);
    }
}

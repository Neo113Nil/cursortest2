package yads;

import defpackage.f771;
import defpackage.gw71;
import defpackage.se71;
import defpackage.tls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ll1 extends Lambda implements tls {
    public final /* synthetic */ gw71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll1(gw71 gw71Var) {
        super(1);
        this.b = gw71Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        f771 f771Var = this.b.a;
        return f771.a((se71) obj);
    }
}

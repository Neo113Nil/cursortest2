package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class q1p implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;

    public q1p(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jfp jfpVar = (jfp) obj;
        jfpVar.getClass();
        wfp.q(jfpVar, 4);
        wfp.r(jfpVar, this.a);
        wfp.j(jfpVar, new my4(0, 1, this.b, 1));
        return Unit.a;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class jv6 implements pjc {
    public final /* synthetic */ yc4 a;
    public final /* synthetic */ u2q b;
    public final /* synthetic */ boolean c;

    public jv6(yc4 yc4Var, u2q u2qVar, boolean z) {
        this.a = yc4Var;
        this.b = u2qVar;
        this.c = z;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new iv6(rjcVar, this.b, this.c, 0), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}

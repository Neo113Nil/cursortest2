package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j1r extends uif implements Function1 {
    public final /* synthetic */ ksk r;
    public final /* synthetic */ int s;
    public final /* synthetic */ ksk t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1r(ksk kskVar, int i, ksk kskVar2, int i2, int i3) {
        super(1);
        this.r = kskVar;
        this.s = i;
        this.t = kskVar2;
        this.u = i2;
        this.v = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jsk jskVar = (jsk) obj;
        jsk.g(jskVar, this.r, 0, this.s);
        jsk.g(jskVar, this.t, this.u, this.v);
        return Unit.a;
    }
}

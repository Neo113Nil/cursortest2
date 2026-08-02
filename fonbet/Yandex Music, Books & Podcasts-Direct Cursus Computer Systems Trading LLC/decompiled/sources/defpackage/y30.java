package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y30 extends uif implements Function2 {
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ wn5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(float f, float f2, wn5 wn5Var, int i) {
        super(2);
        this.r = f;
        this.s = f2;
        this.t = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(439);
        z30.c(this.r, this.s, this.t, (hq5) obj, R);
        return Unit.a;
    }
}

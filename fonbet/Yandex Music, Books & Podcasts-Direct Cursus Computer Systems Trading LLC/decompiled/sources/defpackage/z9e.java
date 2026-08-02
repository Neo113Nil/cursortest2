package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z9e extends uif implements Function2 {
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ y9e u;
    public final /* synthetic */ wn5 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9e(Function0 function0, yci yciVar, boolean z, y9e y9eVar, wn5 wn5Var, int i, int i2) {
        super(2);
        this.r = function0;
        this.s = yciVar;
        this.t = z;
        this.u = y9eVar;
        this.v = wn5Var;
        this.w = i;
        this.x = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ff7.n(this.r, this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1), this.x);
        return Unit.a;
    }
}

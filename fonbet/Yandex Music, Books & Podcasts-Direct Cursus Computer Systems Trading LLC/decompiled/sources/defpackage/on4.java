package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class on4 extends uif implements Function2 {
    public final /* synthetic */ mn0 r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ ges t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ Function1 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on4(mn0 mn0Var, yci yciVar, ges gesVar, boolean z, int i, int i2, Function1 function1, Function1 function12, int i3) {
        super(2);
        this.r = mn0Var;
        this.s = yciVar;
        this.t = gesVar;
        this.u = z;
        this.v = i;
        this.w = i2;
        this.x = function1;
        this.y = function12;
        this.z = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vq2.e(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (hq5) obj, rvf.R(this.z | 1));
        return Unit.a;
    }
}

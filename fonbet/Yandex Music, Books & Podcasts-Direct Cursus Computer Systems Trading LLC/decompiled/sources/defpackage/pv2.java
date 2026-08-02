package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pv2 extends uif implements Function2 {
    public final /* synthetic */ a95 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ mn0 r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ ges t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv2(mn0 mn0Var, yci yciVar, ges gesVar, Function1 function1, int i, boolean z, int i2, int i3, Map map, a95 a95Var, int i4, int i5) {
        super(2);
        this.r = mn0Var;
        this.s = yciVar;
        this.t = gesVar;
        this.u = function1;
        this.v = i;
        this.w = z;
        this.x = i2;
        this.y = i3;
        this.z = map;
        this.A = a95Var;
        this.B = i4;
        this.C = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j66.e(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (hq5) obj, rvf.R(this.B | 1), this.C);
        return Unit.a;
    }
}

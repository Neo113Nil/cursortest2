package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vv2 extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ppc B;
    public final /* synthetic */ iep C;
    public final /* synthetic */ a95 D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ yci r;
    public final /* synthetic */ mn0 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Map v;
    public final /* synthetic */ ges w;
    public final /* synthetic */ int x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv2(yci yciVar, mn0 mn0Var, Function1 function1, boolean z, Map map, ges gesVar, int i, boolean z2, int i2, int i3, ppc ppcVar, iep iepVar, a95 a95Var, Function1 function12, int i4, int i5) {
        super(2);
        this.r = yciVar;
        this.s = mn0Var;
        this.t = function1;
        this.u = z;
        this.v = map;
        this.w = gesVar;
        this.x = i;
        this.y = z2;
        this.z = i2;
        this.A = i3;
        this.B = ppcVar;
        this.C = iepVar;
        this.D = a95Var;
        this.E = function12;
        this.F = i4;
        this.G = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.F | 1);
        int R2 = rvf.R(this.G);
        j66.t(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (hq5) obj, R, R2);
        return Unit.a;
    }
}

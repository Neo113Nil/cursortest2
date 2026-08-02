package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class mv2 extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ tiu B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ uoi D;
    public final /* synthetic */ f3r E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ pyc J;
    public final /* synthetic */ int r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ ges v;
    public final /* synthetic */ rbf w;
    public final /* synthetic */ pbf x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv2(Object obj, Function1 function1, yci yciVar, boolean z, ges gesVar, rbf rbfVar, pbf pbfVar, boolean z2, int i, int i2, tiu tiuVar, Function1 function12, uoi uoiVar, f3r f3rVar, pyc pycVar, int i3, int i4, int i5, int i6) {
        super(2);
        this.r = i6;
        this.I = obj;
        this.s = function1;
        this.t = yciVar;
        this.u = z;
        this.v = gesVar;
        this.w = rbfVar;
        this.x = pbfVar;
        this.y = z2;
        this.z = i;
        this.A = i2;
        this.B = tiuVar;
        this.C = function12;
        this.D = uoiVar;
        this.E = f3rVar;
        this.J = pycVar;
        this.F = i3;
        this.G = i4;
        this.H = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                nv2.a((ybs) this.I, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.J, hq5Var, rvf.R(this.F | 1), rvf.R(this.G), this.H);
                break;
            default:
                ((Number) obj2).intValue();
                nv2.b((String) this.I, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (wn5) this.J, hq5Var, rvf.R(this.F | 1), rvf.R(this.G), this.H);
                break;
        }
        return Unit.a;
    }
}

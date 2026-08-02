package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ml6 extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ ide C;
    public final /* synthetic */ pbf D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ pyc F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ ybs r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ ges u;
    public final /* synthetic */ tiu v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ uoi x;
    public final /* synthetic */ f3r y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml6(ybs ybsVar, Function1 function1, yci yciVar, ges gesVar, tiu tiuVar, Function1 function12, uoi uoiVar, f3r f3rVar, boolean z, int i, int i2, ide ideVar, pbf pbfVar, boolean z2, pyc pycVar, int i3, int i4) {
        super(2);
        this.r = ybsVar;
        this.s = function1;
        this.t = yciVar;
        this.u = gesVar;
        this.v = tiuVar;
        this.w = function12;
        this.x = uoiVar;
        this.y = f3rVar;
        this.z = z;
        this.A = i;
        this.B = i2;
        this.C = ideVar;
        this.D = pbfVar;
        this.E = z2;
        this.F = pycVar;
        this.G = i3;
        this.H = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.G | 1);
        int R2 = rvf.R(this.H);
        j66.j(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (hq5) obj, R, R2);
        return Unit.a;
    }
}

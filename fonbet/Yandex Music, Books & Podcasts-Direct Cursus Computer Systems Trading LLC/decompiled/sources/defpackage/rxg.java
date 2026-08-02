package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rxg extends uif implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int r;
    public final /* synthetic */ ayg s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ yci u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ wwn w;
    public final /* synthetic */ dzg x;
    public final /* synthetic */ g40 y;
    public final /* synthetic */ jd6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rxg(ayg aygVar, Function0 function0, yci yciVar, boolean z, wwn wwnVar, dzg dzgVar, g40 g40Var, jd6 jd6Var, boolean z2, int i, int i2, int i3, int i4) {
        super(2);
        this.r = i4;
        this.s = aygVar;
        this.t = function0;
        this.u = yciVar;
        this.v = z;
        this.w = wwnVar;
        this.x = dzgVar;
        this.y = g40Var;
        this.z = jd6Var;
        this.A = z2;
        this.B = i;
        this.C = i2;
        this.D = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                u1g.d(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (hq5) obj, rvf.R(this.B | 1), rvf.R(this.C), this.D);
                break;
            default:
                ((Number) obj2).intValue();
                u1g.d(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (hq5) obj, rvf.R(this.B | 1), rvf.R(this.C), this.D);
                break;
        }
        return Unit.a;
    }
}

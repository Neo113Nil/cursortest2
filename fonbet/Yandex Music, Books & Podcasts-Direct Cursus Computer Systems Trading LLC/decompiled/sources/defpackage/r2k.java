package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r2k extends uif implements Function2 {
    public final /* synthetic */ wxi A;
    public final /* synthetic */ z1r B;
    public final /* synthetic */ qg0 C;
    public final /* synthetic */ wn5 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ o3k r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ q0k t;
    public final /* synthetic */ d2k u;
    public final /* synthetic */ int v;
    public final /* synthetic */ float w;
    public final /* synthetic */ gz2 x;
    public final /* synthetic */ s1r y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2k(o3k o3kVar, yci yciVar, q0k q0kVar, d2k d2kVar, int i, float f, gz2 gz2Var, s1r s1rVar, boolean z, wxi wxiVar, z1r z1rVar, qg0 qg0Var, wn5 wn5Var, int i2, int i3) {
        super(2);
        this.r = o3kVar;
        this.s = yciVar;
        this.t = q0kVar;
        this.u = d2kVar;
        this.v = i;
        this.w = f;
        this.x = gz2Var;
        this.y = s1rVar;
        this.z = z;
        this.A = wxiVar;
        this.B = z1rVar;
        this.C = qg0Var;
        this.D = wn5Var;
        this.E = i2;
        this.F = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.E | 1);
        int R2 = rvf.R(this.F);
        rvf.p(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (hq5) obj, R, R2);
        return Unit.a;
    }
}

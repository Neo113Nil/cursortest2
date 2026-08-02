package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p2k extends uif implements Function2 {
    public final /* synthetic */ Function1 A;
    public final /* synthetic */ wxi B;
    public final /* synthetic */ z1r C;
    public final /* synthetic */ qg0 D;
    public final /* synthetic */ wn5 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ o3k r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ o0k t;
    public final /* synthetic */ d2k u;
    public final /* synthetic */ int v;
    public final /* synthetic */ float w;
    public final /* synthetic */ hz2 x;
    public final /* synthetic */ s1r y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2k(o3k o3kVar, yci yciVar, o0k o0kVar, d2k d2kVar, int i, float f, hz2 hz2Var, s1r s1rVar, boolean z, Function1 function1, wxi wxiVar, z1r z1rVar, qg0 qg0Var, wn5 wn5Var, int i2, int i3, int i4) {
        super(2);
        this.r = o3kVar;
        this.s = yciVar;
        this.t = o0kVar;
        this.u = d2kVar;
        this.v = i;
        this.w = f;
        this.x = hz2Var;
        this.y = s1rVar;
        this.z = z;
        this.A = function1;
        this.B = wxiVar;
        this.C = z1rVar;
        this.D = qg0Var;
        this.E = wn5Var;
        this.F = i2;
        this.G = i3;
        this.H = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.F | 1);
        int R2 = rvf.R(this.G);
        int i = this.H;
        rvf.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (hq5) obj, R, R2, i);
        return Unit.a;
    }
}

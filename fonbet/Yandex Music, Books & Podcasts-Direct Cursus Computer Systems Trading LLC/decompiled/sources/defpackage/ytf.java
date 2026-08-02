package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ytf extends uif implements Function2 {
    public final /* synthetic */ d2k A;
    public final /* synthetic */ wxi B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ gz2 D;
    public final /* synthetic */ hz2 E;
    public final /* synthetic */ z1r F;
    public final /* synthetic */ wn5 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ yci r;
    public final /* synthetic */ o3k s;
    public final /* synthetic */ o0k t;
    public final /* synthetic */ bxj u;
    public final /* synthetic */ s1r v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ qg0 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytf(yci yciVar, o3k o3kVar, o0k o0kVar, bxj bxjVar, s1r s1rVar, boolean z, qg0 qg0Var, int i, float f, d2k d2kVar, wxi wxiVar, Function1 function1, gz2 gz2Var, hz2 hz2Var, z1r z1rVar, wn5 wn5Var, int i2, int i3) {
        super(2);
        this.r = yciVar;
        this.s = o3kVar;
        this.t = o0kVar;
        this.u = bxjVar;
        this.v = s1rVar;
        this.w = z;
        this.x = qg0Var;
        this.y = i;
        this.z = f;
        this.A = d2kVar;
        this.B = wxiVar;
        this.C = function1;
        this.D = gz2Var;
        this.E = hz2Var;
        this.F = z1rVar;
        this.G = wn5Var;
        this.H = i2;
        this.I = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.H | 1);
        int R2 = rvf.R(this.I);
        bow.j(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (hq5) obj, R, R2);
        return Unit.a;
    }
}

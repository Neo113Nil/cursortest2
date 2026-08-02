package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class yro extends uif implements Function2 {
    public final /* synthetic */ dup A;
    public final /* synthetic */ float B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ wn5 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ ufc r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ hso t;
    public final /* synthetic */ wn5 u;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ pyc w;
    public final /* synthetic */ Function2 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yro(ufc ufcVar, yci yciVar, hso hsoVar, wn5 wn5Var, Function2 function2, pyc pycVar, Function2 function22, int i, boolean z, dup dupVar, float f, long j, long j2, long j3, long j4, long j5, wn5 wn5Var2, int i2, int i3) {
        super(2);
        this.r = ufcVar;
        this.s = yciVar;
        this.t = hsoVar;
        this.u = wn5Var;
        this.v = function2;
        this.w = pycVar;
        this.x = function22;
        this.y = i;
        this.z = z;
        this.A = dupVar;
        this.B = f;
        this.C = j;
        this.D = j2;
        this.E = j3;
        this.F = j4;
        this.G = j5;
        this.H = wn5Var2;
        this.I = i2;
        this.J = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.I | 1);
        int R2 = rvf.R(this.J);
        eso.b(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (hq5) obj, R, R2);
        return Unit.a;
    }
}

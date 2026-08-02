package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zro extends uif implements Function2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ wn5 G;
    public final /* synthetic */ yci r;
    public final /* synthetic */ hso s;
    public final /* synthetic */ wn5 t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ pyc v;
    public final /* synthetic */ Function2 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ dup z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zro(yci yciVar, hso hsoVar, wn5 wn5Var, Function2 function2, pyc pycVar, Function2 function22, int i, boolean z, dup dupVar, float f, long j, long j2, long j3, long j4, long j5, wn5 wn5Var2, int i2) {
        super(2);
        this.r = yciVar;
        this.s = hsoVar;
        this.t = wn5Var;
        this.u = function2;
        this.v = pycVar;
        this.w = function22;
        this.x = i;
        this.y = z;
        this.z = dupVar;
        this.A = f;
        this.B = j;
        this.C = j2;
        this.D = j3;
        this.E = j4;
        this.F = j5;
        this.G = wn5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(385);
        eso.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (hq5) obj, R);
        return Unit.a;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kbi extends uif implements Function2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ float B;
    public final /* synthetic */ wn5 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ wn5 E;
    public final /* synthetic */ fk0 r;
    public final /* synthetic */ mm6 s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ yci v;
    public final /* synthetic */ zcq w;
    public final /* synthetic */ float x;
    public final /* synthetic */ dup y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbi(fk0 fk0Var, mm6 mm6Var, Function0 function0, Function1 function1, yci yciVar, zcq zcqVar, float f, dup dupVar, long j, long j2, float f2, wn5 wn5Var, Function2 function2, wn5 wn5Var2, int i) {
        super(2);
        this.r = fk0Var;
        this.s = mm6Var;
        this.t = function0;
        this.u = function1;
        this.v = yciVar;
        this.w = zcqVar;
        this.x = f;
        this.y = dupVar;
        this.z = j;
        this.A = j2;
        this.B = f2;
        this.C = wn5Var;
        this.D = function2;
        this.E = wn5Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(71);
        sbi.b(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (hq5) obj, R);
        return Unit.a;
    }
}

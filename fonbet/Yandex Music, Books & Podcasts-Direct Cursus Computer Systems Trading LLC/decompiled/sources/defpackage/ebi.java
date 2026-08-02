package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ebi extends uif implements Function2 {
    public final /* synthetic */ wn5 A;
    public final /* synthetic */ Function2 B;
    public final /* synthetic */ tbi C;
    public final /* synthetic */ wn5 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ zcq t;
    public final /* synthetic */ float u;
    public final /* synthetic */ dup v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ float y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebi(Function0 function0, yci yciVar, zcq zcqVar, float f, dup dupVar, long j, long j2, float f2, long j3, wn5 wn5Var, Function2 function2, tbi tbiVar, wn5 wn5Var2, int i) {
        super(2);
        this.r = function0;
        this.s = yciVar;
        this.t = zcqVar;
        this.u = f;
        this.v = dupVar;
        this.w = j;
        this.x = j2;
        this.y = f2;
        this.z = j3;
        this.A = wn5Var;
        this.B = function2;
        this.C = tbiVar;
        this.D = wn5Var2;
        this.E = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.E | 1);
        sbi.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (hq5) obj, R);
        return Unit.a;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ptr extends uif implements Function2 {
    public final /* synthetic */ wn5 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ dup u;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ dd3 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ uoi z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptr(Function0 function0, yci yciVar, boolean z, dup dupVar, long j, long j2, dd3 dd3Var, float f, uoi uoiVar, wn5 wn5Var, int i, int i2) {
        super(2);
        this.r = function0;
        this.s = yciVar;
        this.t = z;
        this.u = dupVar;
        this.v = j;
        this.w = j2;
        this.x = dd3Var;
        this.y = f;
        this.z = uoiVar;
        this.A = wn5Var;
        this.B = i;
        this.C = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.B | 1);
        int i = this.C;
        q5g.l(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (hq5) obj, R, i);
        return Unit.a;
    }
}

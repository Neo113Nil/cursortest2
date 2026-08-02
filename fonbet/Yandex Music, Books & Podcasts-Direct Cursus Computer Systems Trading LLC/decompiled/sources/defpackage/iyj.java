package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class iyj extends uif implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ dup D;
    public final /* synthetic */ hs7 E;
    public final /* synthetic */ String r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ ges v;
    public final /* synthetic */ Function2 w;
    public final /* synthetic */ tiu x;
    public final /* synthetic */ rbf y;
    public final /* synthetic */ pbf z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyj(String str, Function1 function1, yci yciVar, boolean z, ges gesVar, Function2 function2, tiu tiuVar, rbf rbfVar, pbf pbfVar, boolean z2, int i, int i2, dup dupVar, hs7 hs7Var, int i3) {
        super(2);
        this.r = str;
        this.s = function1;
        this.t = yciVar;
        this.u = z;
        this.v = gesVar;
        this.w = function2;
        this.x = tiuVar;
        this.y = rbfVar;
        this.z = pbfVar;
        this.A = z2;
        this.B = i;
        this.C = i2;
        this.D = dupVar;
        this.E = hs7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(12582913);
        lyj.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (hq5) obj, R);
        return Unit.a;
    }
}

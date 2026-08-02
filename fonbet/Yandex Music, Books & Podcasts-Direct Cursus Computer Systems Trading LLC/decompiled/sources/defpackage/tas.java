package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tas extends uif implements Function2 {
    public final /* synthetic */ hs7 A;
    public final /* synthetic */ o0k B;
    public final /* synthetic */ wn5 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ uas r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ tiu w;
    public final /* synthetic */ uoi x;
    public final /* synthetic */ Function2 y;
    public final /* synthetic */ dup z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tas(uas uasVar, String str, Function2 function2, boolean z, boolean z2, tiu tiuVar, uoi uoiVar, Function2 function22, dup dupVar, hs7 hs7Var, o0k o0kVar, wn5 wn5Var, int i) {
        super(2);
        this.r = uasVar;
        this.s = str;
        this.t = function2;
        this.u = z;
        this.v = z2;
        this.w = tiuVar;
        this.x = uoiVar;
        this.y = function22;
        this.z = dupVar;
        this.A = hs7Var;
        this.B = o0kVar;
        this.C = wn5Var;
        this.D = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.r.b(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (hq5) obj, rvf.R(this.D | 1));
        return Unit.a;
    }
}

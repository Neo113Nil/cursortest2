package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zas extends uif implements Function2 {
    public final /* synthetic */ hs7 A;
    public final /* synthetic */ wn5 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ String r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ tiu t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ uoi x;
    public final /* synthetic */ o0k y;
    public final /* synthetic */ dup z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zas(String str, Function2 function2, tiu tiuVar, Function2 function22, boolean z, boolean z2, uoi uoiVar, o0k o0kVar, dup dupVar, hs7 hs7Var, wn5 wn5Var, int i, int i2) {
        super(2);
        xbs xbsVar = xbs.a;
        this.r = str;
        this.s = function2;
        this.t = tiuVar;
        this.u = function22;
        this.v = z;
        this.w = z2;
        this.x = uoiVar;
        this.y = o0kVar;
        this.z = dupVar;
        this.A = hs7Var;
        this.B = wn5Var;
        this.C = i;
        this.D = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        xbs xbsVar = xbs.a;
        cbs.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, hq5Var, rvf.R(this.C | 1), rvf.R(this.D));
        return Unit.a;
    }
}

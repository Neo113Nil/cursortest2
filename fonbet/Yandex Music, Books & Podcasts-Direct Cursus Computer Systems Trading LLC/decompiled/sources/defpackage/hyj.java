package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hyj extends uif implements pyc {
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ tiu u;
    public final /* synthetic */ uoi v;
    public final /* synthetic */ Function2 w;
    public final /* synthetic */ dup x;
    public final /* synthetic */ hs7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyj(String str, boolean z, boolean z2, tiu tiuVar, uoi uoiVar, Function2 function2, dup dupVar, hs7 hs7Var) {
        super(3);
        this.r = str;
        this.s = z;
        this.t = z2;
        this.u = tiuVar;
        this.v = uoiVar;
        this.w = function2;
        this.x = dupVar;
        this.y = hs7Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((oq5) hq5Var).h(function2) ? 4 : 2;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
            int i = intValue;
            uas uasVar = uas.a;
            boolean z = this.s;
            uoi uoiVar = this.v;
            hs7 hs7Var = this.y;
            dup dupVar = this.x;
            uasVar.b(this.r, function2, z, this.t, this.u, uoiVar, this.w, dupVar, hs7Var, null, ild.C(1757478222, new gyj(z, uoiVar, hs7Var, dupVar), oq5Var), oq5Var, (i << 3) & 112);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}

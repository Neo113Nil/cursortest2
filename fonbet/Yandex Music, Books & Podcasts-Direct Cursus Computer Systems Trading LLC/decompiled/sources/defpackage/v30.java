package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v30 extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ wn5 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ dup v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(wn5 wn5Var, yci yciVar, Function2 function2, dup dupVar, long j, long j2) {
        super(2);
        this.s = wn5Var;
        this.t = yciVar;
        this.u = function2;
        this.v = dupVar;
        this.w = j;
        this.x = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                z30.b(this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(1));
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    z30.b(this.s, this.t, this.u, this.v, this.w, this.x, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(wn5 wn5Var, yci yciVar, Function2 function2, dup dupVar, long j, long j2, int i) {
        super(2);
        this.s = wn5Var;
        this.t = yciVar;
        this.u = function2;
        this.v = dupVar;
        this.w = j;
        this.x = j2;
    }
}

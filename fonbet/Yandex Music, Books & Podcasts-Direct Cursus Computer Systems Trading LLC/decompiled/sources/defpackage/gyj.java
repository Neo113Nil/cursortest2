package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gyj extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyj(i6r i6rVar, Long l, boolean z, yci yciVar, int i) {
        super(2);
        this.t = i6rVar;
        this.u = l;
        this.s = z;
        this.v = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    uas.a.a(this.s, (uoi) this.t, (hs7) this.u, (dup) this.v, 0.0f, 0.0f, oq5Var, 12582912);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Number) obj2).intValue();
                y5g.O((i6r) this.t, (Long) this.u, this.s, (yci) this.v, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyj(boolean z, uoi uoiVar, hs7 hs7Var, dup dupVar) {
        super(2);
        this.s = z;
        this.t = uoiVar;
        this.u = hs7Var;
        this.v = dupVar;
    }
}

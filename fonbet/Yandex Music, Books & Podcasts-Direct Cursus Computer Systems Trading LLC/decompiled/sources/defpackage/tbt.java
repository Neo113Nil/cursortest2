package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class tbt extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ovn s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ zbt u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tbt(ovn ovnVar, yci yciVar, zbt zbtVar, boolean z, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = ovnVar;
        this.t = yciVar;
        this.u = zbtVar;
        this.v = z;
        this.w = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                this.s.w(this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                this.s.c(this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1));
                break;
            default:
                ((Number) obj2).intValue();
                this.s.c(this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1));
                break;
        }
        return Unit.a;
    }
}

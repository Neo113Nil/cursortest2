package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ra5 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra5(int i, String str, int i2, int i3, int i4, yci yciVar, int i5) {
        super(2);
        this.r = 2;
        this.t = i;
        this.s = str;
        this.u = i2;
        this.w = i3;
        this.x = i4;
        this.v = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                ukd ukdVar = (ukd) this.s;
                wn5 wn5Var = (wn5) this.v;
                ot0.h(ukdVar, this.t, this.u, wn5Var, (hq5) obj, this.w | 1, this.x);
                break;
            case 1:
                ((Number) obj2).intValue();
                ukd ukdVar2 = (ukd) this.s;
                wn5 wn5Var2 = (wn5) this.v;
                y1g.l(ukdVar2, this.t, this.u, wn5Var2, (hq5) obj, this.w | 1, this.x);
                break;
            default:
                ((Number) obj2).intValue();
                String str = (String) this.s;
                yci yciVar = (yci) this.v;
                h4a.k(this.t, str, this.u, this.w, this.x, yciVar, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra5(ukd ukdVar, int i, int i2, wn5 wn5Var, int i3, int i4, int i5) {
        super(2);
        this.r = i5;
        this.s = ukdVar;
        this.t = i;
        this.u = i2;
        this.v = wn5Var;
        this.w = i3;
        this.x = i4;
    }
}

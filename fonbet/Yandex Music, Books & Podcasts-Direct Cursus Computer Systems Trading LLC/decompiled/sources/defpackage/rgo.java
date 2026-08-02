package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class rgo implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rgo(float f, ukd ukdVar, plv plvVar, boolean z, wn5 wn5Var, int i) {
        this.c = f;
        this.e = ukdVar;
        this.f = plvVar;
        this.b = z;
        this.g = wn5Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                p1g.j(this.c, (ukd) this.e, (plv) this.f, this.b, (wn5) this.g, (hq5) obj, rvf.R(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                e9q.c((lnu) this.e, (owu) this.f, this.b, (yci) this.g, this.c, (hq5) obj, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ rgo(lnu lnuVar, owu owuVar, boolean z, yci yciVar, float f, int i) {
        this.e = lnuVar;
        this.f = owuVar;
        this.b = z;
        this.g = yciVar;
        this.c = f;
        this.d = i;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class cq implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ cq(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, boolean z, boolean z2, yci yciVar, onu onuVar, int i, int i2) {
        this.g = wn5Var;
        this.h = wn5Var2;
        this.i = wn5Var3;
        this.b = z;
        this.c = z2;
        this.d = yciVar;
        this.j = onuVar;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                rb.n((klu) this.g, (qmu) this.h, this.b, this.d, (uoi) this.i, (d85) this.j, this.c, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                z0v.a((wn5) this.g, (wn5) this.h, (wn5) this.i, this.b, this.c, this.d, (onu) this.j, (hq5) obj, rvf.R(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cq(klu kluVar, qmu qmuVar, boolean z, yci yciVar, uoi uoiVar, d85 d85Var, boolean z2, int i, int i2) {
        this.g = kluVar;
        this.h = qmuVar;
        this.b = z;
        this.d = yciVar;
        this.i = uoiVar;
        this.j = d85Var;
        this.c = z2;
        this.e = i;
        this.f = i2;
    }
}

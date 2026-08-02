package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class v04 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ yci b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ v04(f14 f14Var, zpd zpdVar, yci yciVar, o0k o0kVar, float f, int i, int i2) {
        this.f = f14Var;
        this.g = zpdVar;
        this.b = yciVar;
        this.h = o0kVar;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                bg3.c((f14) this.f, (zpd) this.g, this.b, (o0k) this.h, this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                e9q.b((lnu) this.f, (owu) this.g, (qy7) this.h, this.b, this.c, (hq5) obj, rvf.R(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v04(lnu lnuVar, owu owuVar, qy7 qy7Var, yci yciVar, float f, int i, int i2) {
        this.f = lnuVar;
        this.g = owuVar;
        this.h = qy7Var;
        this.b = yciVar;
        this.c = f;
        this.d = i;
        this.e = i2;
    }
}

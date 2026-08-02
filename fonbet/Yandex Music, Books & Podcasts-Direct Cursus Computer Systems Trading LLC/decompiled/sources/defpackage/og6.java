package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class og6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ og6(nav navVar, owu owuVar, yci yciVar, float f, int i) {
        this.a = 4;
        this.d = navVar;
        this.e = owuVar;
        this.f = yciVar;
        this.b = f;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                leu.h((oho) this.d, (String) this.e, this.b, (wn5) this.f, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gh6.d((kh6) this.d, (zg6) this.e, this.b, (yci) this.f, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                w1g.d((mgt) this.d, (eaj) this.e, this.b, (yci) this.f, (hq5) obj, rvf.R(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                y5g.f((pck) this.d, (kck) this.e, this.b, (yci) this.f, (hq5) obj, rvf.R(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                qgg.s((nav) this.d, (owu) this.e, (yci) this.f, this.b, (hq5) obj, rvf.R(this.c | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ og6(float f, int i, int i2, Object obj, Object obj2, Object obj3) {
        this.a = i2;
        this.d = obj;
        this.e = obj2;
        this.b = f;
        this.f = obj3;
        this.c = i;
    }
}

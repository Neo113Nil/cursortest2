package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class z8q implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lnu b;
    public final /* synthetic */ owu c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ z8q(lnu lnuVar, owu owuVar, yci yciVar, float f, int i, int i2, int i3) {
        this.a = i3;
        this.b = lnuVar;
        this.c = owuVar;
        this.d = yciVar;
        this.e = f;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                e9q.a(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                a4g.o(this.b, this.c, this.d, this.e, (hq5) obj, rvf.R(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }
}

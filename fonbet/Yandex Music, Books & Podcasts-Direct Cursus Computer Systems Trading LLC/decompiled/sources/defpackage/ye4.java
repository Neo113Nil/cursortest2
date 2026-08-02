package defpackage;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ye4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ um0 e;
    public final /* synthetic */ Locale f;
    public final /* synthetic */ d85 g;

    public /* synthetic */ ye4(ve4 ve4Var, int i, int i2, um0 um0Var, Locale locale, d85 d85Var, int i3, int i4) {
        this.a = i4;
        this.b = ve4Var;
        this.c = i;
        this.d = i2;
        this.e = um0Var;
        this.f = locale;
        this.g = d85Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(1);
                qwp.e(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                qwp.g(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj, R2);
                break;
        }
        return Unit.a;
    }
}

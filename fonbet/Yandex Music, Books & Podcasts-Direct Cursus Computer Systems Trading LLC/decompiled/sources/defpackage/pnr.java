package defpackage;

import androidx.compose.animation.c;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class pnr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qor b;

    public /* synthetic */ pnr(qor qorVar, int i) {
        this.a = i;
        this.b = qorVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((hl0) obj).getClass();
                e9b e = c.e(weo.S(1000, 0, null, 6), 2);
                act S = weo.S(500, 0, null, 6);
                qor qorVar = this.b;
                return new zd6(e.a(c.l(S, new pnr(qorVar, 1))), c.f(weo.S(1000, 0, null, 6), 2).a(c.n(weo.S(500, 0, null, 6), new pnr(qorVar, 2))));
            case 1:
                int intValue = ((Integer) obj).intValue();
                if (!this.b.d) {
                    intValue = -intValue;
                }
                return Integer.valueOf(intValue / 2);
            default:
                int intValue2 = ((Integer) obj).intValue();
                if (this.b.d) {
                    intValue2 = -intValue2;
                }
                return Integer.valueOf(intValue2 / 2);
        }
    }
}

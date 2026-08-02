package defpackage;

import android.graphics.Rect;
import androidx.compose.runtime.internal.a;
import defpackage.d541;
import defpackage.t441;
import defpackage.tje;
import defpackage.zy11;

/* loaded from: classes14.dex */
public final /* synthetic */ class r441 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ t441 b;

    public /* synthetic */ r441(t441 t441Var, int i) {
        this.a = i;
        this.b = t441Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final t441 t441Var = this.b;
        switch (i) {
            case 0:
                final yfd yfdVar = (yfd) obj;
                agd agdVar = (agd) yfdVar;
                agdVar.c = t441Var.H.a(((f541) ((agd) yfdVar).a).c);
                agdVar.e = new tls() { // from class: com.yandex.go.walking.navigation.impl.overview.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        t441 t441Var2 = t441.this;
                        tje.N(t441Var2.o(), null, null, new WalkNavOverviewRouter$content$1$1$1(t441Var2, yfdVar, (d541) obj2, null), 3);
                        return zy11.a;
                    }
                };
                fpb1.e(yfdVar, new sls() { // from class: com.yandex.go.walking.navigation.impl.overview.b
                    @Override // defpackage.sls
                    public final Object invoke() {
                        t441 t441Var2 = t441.this;
                        tje.N(t441Var2.o(), null, null, new WalkNavOverviewRouter$content$1$2$1(t441Var2, yfdVar, null), 3);
                        return zy11.a;
                    }
                });
                agdVar.g = new a(-922816016, new ic01(3, t441Var), true);
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                int i2 = (int) (t441Var.F.getResources().getDisplayMetrics().density * 16.0f);
                t441Var.K.Lc(t441Var, new Rect(i2, i2, i2, intValue + i2));
                break;
        }
        return zy11Var;
    }
}

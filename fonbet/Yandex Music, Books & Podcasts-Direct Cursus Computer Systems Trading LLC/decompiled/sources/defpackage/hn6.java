package defpackage;

import androidx.compose.foundation.layout.d;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class hn6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ un6 b;

    public /* synthetic */ hn6(un6 un6Var, int i) {
        this.a = i;
        this.b = un6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                swf.d(this.b.a, gce.d, null, d.c(vci.a, 0.3f), 0L, 0L, false, hq5Var, 3120, BuildConfig.API_LEVEL);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                swf.d(this.b.a, gce.d, null, d.c(vci.a, 0.3f), 0L, 0L, false, hq5Var2, 3120, BuildConfig.API_LEVEL);
            default:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                swf.d(this.b.a, gce.d, null, d.c(vci.a, 0.3f), 0L, 0L, false, hq5Var3, 3120, BuildConfig.API_LEVEL);
        }
        return Unit.a;
    }
}

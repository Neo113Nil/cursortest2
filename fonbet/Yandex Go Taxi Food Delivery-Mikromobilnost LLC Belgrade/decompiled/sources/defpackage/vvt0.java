package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.persistence.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class vvt0 implements uvt0 {
    public final b a;
    public final com.ybsdk.rconfig.b b;
    public final AppAnalyticsReporter c;
    public final r0 d;
    public final n0 e;

    public vvt0(b bVar, com.ybsdk.rconfig.b bVar2, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = bVar;
        this.b = bVar2;
        this.c = appAnalyticsReporter;
        boolean b = bVar.b();
        ew2 ew2Var = bVar.d;
        kgx kgxVar = b.l[1];
        ew2Var.d(b);
        this.d = bvf0.c(Boolean.FALSE);
        this.e = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public final boolean a() {
        b bVar = this.a;
        ew2 ew2Var = bVar.d;
        dfr dfrVar = wlp.C;
        com.ybsdk.rconfig.b bVar2 = this.b;
        if (!((CommonFeatureFlag) bVar2.d(dfrVar).getData()).isEnabled()) {
            kgx[] kgxVarArr = b.l;
            kgx kgxVar = kgxVarArr[1];
            if (ew2Var.a().booleanValue()) {
                ew2 ew2Var2 = bVar.d;
                kgx kgxVar2 = kgxVarArr[1];
                ew2Var2.d(false);
            }
        }
        if (bVar.a()) {
            kgx kgxVar3 = b.l[1];
            if (ew2Var.a().booleanValue() && ((CommonFeatureFlag) bVar2.d(dfrVar).getData()).isEnabled()) {
                return true;
            }
        }
        return false;
    }
}

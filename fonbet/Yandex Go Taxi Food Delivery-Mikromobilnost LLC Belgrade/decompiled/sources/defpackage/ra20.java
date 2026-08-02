package defpackage;

import com.yandex.plus.core.config.Environment;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmConfig;

/* loaded from: classes8.dex */
public final class ra20 extends k95 {
    public final String d;
    public final Environment e;
    public final sls f;

    public ra20(String str, Environment environment, sls slsVar) {
        this.d = str;
        this.e = environment;
        this.f = slsVar;
    }

    @Override // defpackage.k95
    public final void b() {
        RtmConfig.Environment environment;
        IReporterYandex iReporterYandex = (IReporterYandex) this.f.invoke();
        if (iReporterYandex == null) {
            return;
        }
        RtmConfig.Builder withProjectName = RtmConfig.newBuilder().withProjectName(this.d);
        int i = qa20.a[this.e.ordinal()];
        if (i == 1) {
            environment = RtmConfig.Environment.TESTING;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            environment = RtmConfig.Environment.PRODUCTION;
        }
        iReporterYandex.updateRtmConfig(withProjectName.withEnvironment(environment).withUserId(this.b).withSlot(this.c).build());
    }
}

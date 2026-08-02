package defpackage;

import io.appmetrica.analytics.IReporter;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class p46 {
    public final IReporter a;
    public final EnumSet b;

    public p46(IReporter iReporter, EnumSet enumSet) {
        this.a = iReporter;
        this.b = enumSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p46)) {
            return false;
        }
        p46 p46Var = (p46) obj;
        return Intrinsics.d(this.a, p46Var.a) && this.b.equals(p46Var.b);
    }

    public final int hashCode() {
        int a = f1d.a(10000, f1d.a(2000, f1d.a(1, f1d.a(10, f1d.a(10000, f1d.a(5, f1d.a(1000, -1944320925, 31), 31), 31), 31), 31), 31), 31);
        IReporter iReporter = this.a;
        return (this.b.hashCode() + ((a + (iReporter == null ? 0 : iReporter.hashCode())) * 31)) * 887503681;
    }

    public final String toString() {
        return "Config(backendUrl=https://quasar.yandex.net, metricaKey=3b4132c5-4c62-4cfd-acff-158a2797d5bf, discoveryServiceType=_yandexio._tcp., discoveryServiceNamePrefix=YandexIOReceiver-, discoveryMdnsResolveTimeout=1000, discoveryMdnsResolveRetries=5, deviceConnectionTimeout=10000, deviceRestoreConnectionTries=10, deviceCreateConnectionTries=1, deviceReconnectionDelay=2000, deviceReadTimeout=10000, externalMetricaReporter=" + this.a + ", deviceScopes=" + this.b + ", logsDiscoveryEnabled=false, logsConversationEnabled=false, logsConversationExtraEnabled=false, logsRawDeviceAnswerEnabled=false, logsMdnsEnabled=false, strictSSLDisabled=false)";
    }
}

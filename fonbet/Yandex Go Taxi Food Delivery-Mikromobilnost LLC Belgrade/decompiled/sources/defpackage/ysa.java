package defpackage;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes.dex */
public final class ysa {
    public static final /* synthetic */ kgx[] e = {new MutablePropertyReference1Impl("lowBatteryTimeLastSentMs", 0, "getLowBatteryTimeLastSentMs()J", ysa.class), new MutablePropertyReference1Impl("pollingExecutionIds", 0, "getPollingExecutionIds()Ljava/util/Set;", ysa.class)};
    public final dne0 a;
    public final cne0 b;
    public final sme0 c;
    public final sme0 d;

    public ysa(dne0 dne0Var) {
        this.a = dne0Var;
        cne0 a = dne0Var.a("com.yandex.go.chargers.STORAGE");
        this.b = a;
        this.c = new sme0(0, a, a, "lowBatteryTimeLastSentMs");
        this.d = new sme0(1, a, a, "polling_execution_ids");
    }
}

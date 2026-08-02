package com.datadog.android.core.internal.net.info;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class CallbackNetworkInfoProvider$register$1 extends Lambda implements Function0 {
    public static final CallbackNetworkInfoProvider$register$1 INSTANCE;
    public static final CallbackNetworkInfoProvider$register$1 INSTANCE$1;
    public static final CallbackNetworkInfoProvider$register$1 INSTANCE$2;
    public static final CallbackNetworkInfoProvider$register$1 INSTANCE$3;
    public static final CallbackNetworkInfoProvider$register$1 INSTANCE$4;
    public static final CallbackNetworkInfoProvider$register$1 INSTANCE$5;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new CallbackNetworkInfoProvider$register$1(i, 0);
        INSTANCE$1 = new CallbackNetworkInfoProvider$register$1(i, 1);
        INSTANCE$2 = new CallbackNetworkInfoProvider$register$1(i, 2);
        INSTANCE$3 = new CallbackNetworkInfoProvider$register$1(i, 3);
        INSTANCE$4 = new CallbackNetworkInfoProvider$register$1(i, 4);
        INSTANCE$5 = new CallbackNetworkInfoProvider$register$1(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CallbackNetworkInfoProvider$register$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
        }
        return "We couldn't unregister the Network Callback";
    }
}

package com.datadog.android.rum.tracking;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class ActivityLifecycleTrackingStrategy$register$1 extends Lambda implements Function0 {
    public static final ActivityLifecycleTrackingStrategy$register$1 INSTANCE;
    public static final ActivityLifecycleTrackingStrategy$register$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new ActivityLifecycleTrackingStrategy$register$1(i, 0);
        INSTANCE$1 = new ActivityLifecycleTrackingStrategy$register$1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivityLifecycleTrackingStrategy$register$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "In order to use the RUM automatic tracking feature you will have to use the Application context when initializing the SDK";
            default:
                return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot provide SDK instance for view tracking.";
        }
    }
}

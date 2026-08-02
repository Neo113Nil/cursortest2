package com.datadog.android.rum.internal.vitals;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class FrameStatesAggregator$onActivityStopped$1 extends Lambda implements Function0 {
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE;
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE$1;
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE$2;
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE$3;
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE$4;
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE$5;
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE$6;
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE$7;
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE$8;
    public static final FrameStatesAggregator$onActivityStopped$1 INSTANCE$9;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new FrameStatesAggregator$onActivityStopped$1(i, 0);
        INSTANCE$1 = new FrameStatesAggregator$onActivityStopped$1(i, 1);
        INSTANCE$2 = new FrameStatesAggregator$onActivityStopped$1(i, 2);
        INSTANCE$3 = new FrameStatesAggregator$onActivityStopped$1(i, 3);
        INSTANCE$4 = new FrameStatesAggregator$onActivityStopped$1(i, 4);
        INSTANCE$5 = new FrameStatesAggregator$onActivityStopped$1(i, 5);
        INSTANCE$6 = new FrameStatesAggregator$onActivityStopped$1(i, 6);
        INSTANCE$7 = new FrameStatesAggregator$onActivityStopped$1(i, 7);
        INSTANCE$8 = new FrameStatesAggregator$onActivityStopped$1(i, 8);
        INSTANCE$9 = new FrameStatesAggregator$onActivityStopped$1(i, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrameStatesAggregator$onActivityStopped$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Activity stopped but window was not tracked";
            case 1:
                return "Trying to disable JankStats instance which was already disabled before, this shouldn't happen.";
            case 2:
                return "Failed to disable JankStats tracking";
            case 3:
                return "Failed to disable JankStats tracking";
            case 4:
                return "Unable to attach JankStatsListener to window, decorView is null";
            case 5:
                return "Unable to attach JankStatsListener to window, decorView is not hardware accelerated";
            case 6:
                return "Unable to attach JankStatsListener to window";
            case 7:
                return "Unable to create JankStats";
            case 8:
                return "Unable to detach JankStatsListener to window, most probably because it wasn't attached";
            default:
                return "Unable to attach JankStats to the current window";
        }
    }
}

package com.datadog.android.rum.internal.domain.scope;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class RumViewScope$stopScope$1 extends Lambda implements Function0 {
    public static final RumViewScope$stopScope$1 INSTANCE;
    public static final RumViewScope$stopScope$1 INSTANCE$1;
    public static final RumViewScope$stopScope$1 INSTANCE$2;
    public static final RumViewScope$stopScope$1 INSTANCE$3;
    public static final RumViewScope$stopScope$1 INSTANCE$4;
    public static final RumViewScope$stopScope$1 INSTANCE$5;
    public static final RumViewScope$stopScope$1 INSTANCE$6;
    public static final RumViewScope$stopScope$1 INSTANCE$7;
    public static final RumViewScope$stopScope$1 INSTANCE$8;
    public static final RumViewScope$stopScope$1 INSTANCE$9;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new RumViewScope$stopScope$1(i, 1);
        INSTANCE$2 = new RumViewScope$stopScope$1(i, 2);
        INSTANCE$3 = new RumViewScope$stopScope$1(i, 3);
        INSTANCE$4 = new RumViewScope$stopScope$1(i, 4);
        INSTANCE$5 = new RumViewScope$stopScope$1(i, 5);
        INSTANCE$6 = new RumViewScope$stopScope$1(i, 6);
        INSTANCE$7 = new RumViewScope$stopScope$1(i, 7);
        INSTANCE$8 = new RumViewScope$stopScope$1(i, 8);
        INSTANCE$9 = new RumViewScope$stopScope$1(i, 9);
        INSTANCE = new RumViewScope$stopScope$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RumViewScope$stopScope$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return "Application has multiple active sessions, this shouldn't happen.";
            case 2:
                return "Application has multiple active sessions when starting a new session";
            case 3:
                return "Failed to truncate payload";
            case 4:
                return "Multiple views are active at the same time, this shouldn't happen.";
            case 5:
                return "No active view found to add the loading time.";
            case 6:
                return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
            case 7:
                return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
            case 8:
                return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
            default:
                return "An RUM event was detected, but no view is active, its missed type is unknown";
        }
    }
}

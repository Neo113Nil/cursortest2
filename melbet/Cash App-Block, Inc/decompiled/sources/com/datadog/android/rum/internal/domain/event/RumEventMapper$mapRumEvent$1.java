package com.datadog.android.rum.internal.domain.event;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class RumEventMapper$mapRumEvent$1 extends Lambda implements Function0 {
    public static final RumEventMapper$mapRumEvent$1 INSTANCE;
    public static final RumEventMapper$mapRumEvent$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new RumEventMapper$mapRumEvent$1(i, 0);
        INSTANCE$1 = new RumEventMapper$mapRumEvent$1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RumEventMapper$mapRumEvent$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "RumEventMapper: the return from the ErrorEvent mapper was null for a crash. Dropping crashes in from the event mapper is not supported. The original event object will be used instead.";
            default:
                return "Failed to deserialize RUM event meta";
        }
    }
}

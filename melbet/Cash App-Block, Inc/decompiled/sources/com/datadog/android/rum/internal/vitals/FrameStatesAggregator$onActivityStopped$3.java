package com.datadog.android.rum.internal.vitals;

import android.view.Window;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class FrameStatesAggregator$onActivityStopped$3 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Window $window;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrameStatesAggregator$onActivityStopped$3(Window window, int i) {
        super(0);
        this.$r8$classId = i;
        this.$window = window;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Window window = this.$window;
        switch (i) {
            case 0:
                return "Disabling jankStats for window " + window;
            case 1:
                return "Resuming jankStats for window " + window;
            default:
                return "Starting jankStats for window " + window;
        }
    }
}

package com.squareup.cash.activity.backend;

import com.squareup.cash.activity.backend.ActivityUpdatesNotifier$UpdateScope;
import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes.dex */
public final class RealActivityUpdatesNotifier {
    public final SharedFlowImpl feedUpdates;
    public final ReadonlySharedFlow notifications;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public static final MetroFactory INSTANCE = new MetroFactory(0);

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new RealActivityUpdatesNotifier();
                default:
                    return new ActivityZiplineManifestWatcher();
            }
        }
    }

    public RealActivityUpdatesNotifier() {
        SharedFlowImpl MutableSharedFlow = FlowKt.MutableSharedFlow(1, 10, BufferOverflow.DROP_OLDEST);
        this.feedUpdates = MutableSharedFlow;
        this.notifications = FlowKt.asSharedFlow(MutableSharedFlow);
    }

    public final void notifyItemUpdated(String str) {
        str.getClass();
        this.feedUpdates.tryEmit(new ActivityUpdatesNotifier$UpdateScope.Item(str));
    }
}

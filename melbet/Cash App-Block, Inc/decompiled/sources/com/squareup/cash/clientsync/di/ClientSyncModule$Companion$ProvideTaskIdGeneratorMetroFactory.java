package com.squareup.cash.clientsync.di;

import com.squareup.cash.clientsync.pipeline.MutableClientSyncCompletionTracker;
import com.squareup.cash.clientsync.pipeline.TaskClientSyncObserver;
import com.squareup.cash.clientsync.pipeline.TaskIdGenerator;
import dev.zacsweers.metro.internal.Factory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ClientSyncModule$Companion$ProvideTaskIdGeneratorMetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public static final ClientSyncModule$Companion$ProvideTaskIdGeneratorMetroFactory INSTANCE$1 = new ClientSyncModule$Companion$ProvideTaskIdGeneratorMetroFactory(1);
    public static final ClientSyncModule$Companion$ProvideTaskIdGeneratorMetroFactory INSTANCE$2 = new ClientSyncModule$Companion$ProvideTaskIdGeneratorMetroFactory(2);
    public static final ClientSyncModule$Companion$ProvideTaskIdGeneratorMetroFactory INSTANCE = new ClientSyncModule$Companion$ProvideTaskIdGeneratorMetroFactory(0);

    public /* synthetic */ ClientSyncModule$Companion$ProvideTaskIdGeneratorMetroFactory(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new TaskIdGenerator();
            case 1:
                return new MutableClientSyncCompletionTracker();
            default:
                TaskClientSyncObserver taskClientSyncObserver = new TaskClientSyncObserver();
                taskClientSyncObserver.syncObservers = new ArrayList();
                return taskClientSyncObserver;
        }
    }
}

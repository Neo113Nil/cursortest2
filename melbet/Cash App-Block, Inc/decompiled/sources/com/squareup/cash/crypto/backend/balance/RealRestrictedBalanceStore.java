package com.squareup.cash.crypto.backend.balance;

import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager$syncValueBased$1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes.dex */
public final class RealRestrictedBalanceStore {
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final SyncValueReader syncValueReader;

    public RealRestrictedBalanceStore(SyncValueReader syncValueReader, RealBalanceSnapshotManager realBalanceSnapshotManager) {
        this.syncValueReader = syncValueReader;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
    }

    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 select() {
        CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = new CardModelView$iconTexture$$inlined$map$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CrowRestrictionsData), 29);
        RealBalanceSnapshotManager realBalanceSnapshotManager = this.balanceSnapshotManager;
        Continuation continuation = null;
        int i = 0;
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(cardModelView$iconTexture$$inlined$map$1, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realBalanceSnapshotManager.profileManager.currencyCode(), realBalanceSnapshotManager.syncValueReader.getAllValues(AndroidSyncValueSpecs.BalanceSnapshot), new RealBalanceSnapshotManager$syncValueBased$1(realBalanceSnapshotManager, continuation, 1), i), new CardModelView$getActiveHeat$2$2(this, continuation, 5), i);
    }
}

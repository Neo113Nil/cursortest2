package com.squareup.cash.moneybot.backend.real.managers;

import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.stripe.android.cards.CardAccountRangeSource;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes6.dex */
public final class RealMoneybotDisclosureManager implements CardAccountRangeSource {
    public final ReadonlyStateFlow persistentDisclosure;

    public RealMoneybotDisclosureManager(SyncValueReader syncValueReader, CoroutineScope coroutineScope) {
        this.persistentDisclosure = FlowKt.stateIn(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(syncValueReader.getSingleValue(AndroidSyncValueSpecs.KgooseGlobalUserSettings), 7), coroutineScope, SharingStarted.Companion.Eagerly, null);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public ReadonlyStateFlow getLoading() {
        return this.persistentDisclosure;
    }

    public RealMoneybotDisclosureManager() {
        this.persistentDisclosure = IblLoaderKt.stateFlowOf(Boolean.FALSE);
    }
}

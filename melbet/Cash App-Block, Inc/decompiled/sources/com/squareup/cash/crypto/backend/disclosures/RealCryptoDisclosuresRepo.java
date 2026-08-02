package com.squareup.cash.crypto.backend.disclosures;

import androidx.room.util.DBUtil;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes6.dex */
public final class RealCryptoDisclosuresRepo {
    public final ReadonlyStateFlow disclosureStateFlow;
    public final CoroutineContext ioContext;
    public final AndroidStringManager stringManager;

    public RealCryptoDisclosuresRepo(CoroutineContext coroutineContext, AndroidStringManager androidStringManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineScope coroutineScope) {
        this.ioContext = coroutineContext;
        this.stringManager = androidStringManager;
        this.disclosureStateFlow = FlowKt.stateIn(new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(cashAccountDatabaseImpl.investingSettingsQueries.select$2()), coroutineContext), 7), coroutineScope, SharingStarted.Companion.Eagerly, null);
    }
}

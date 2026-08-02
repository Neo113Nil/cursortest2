package com.squareup.cash.instruments.backend.real;

import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class RealInstrumentRowLoader {
    public final AppConfigManager appConfigManager;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final RealInstrumentManager instrumentManager;
    public final RealInstrumentSelectorManager instrumentSelectorManager;
    public final RealProfileManager profileManager;
    public final RealFamilyAccountsManager sponsorshipStateProvider;
    public final RealStatusAndLimitsManager statusAndLimitsManager;

    public RealInstrumentRowLoader(RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, AppConfigManager appConfigManager, RealStatusAndLimitsManager realStatusAndLimitsManager, RealInstrumentSelectorManager realInstrumentSelectorManager, RealProfileManager realProfileManager, RealFamilyAccountsManager realFamilyAccountsManager) {
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.instrumentManager = realInstrumentManager;
        this.appConfigManager = appConfigManager;
        this.statusAndLimitsManager = realStatusAndLimitsManager;
        this.instrumentSelectorManager = realInstrumentSelectorManager;
        this.profileManager = realProfileManager;
        this.sponsorshipStateProvider = realFamilyAccountsManager;
    }

    public final FlowExtensionsKt$combine$$inlined$combine$1 models(Money money, List list, InstrumentSelection instrumentSelection, boolean z, boolean z2, boolean z3, boolean z4) {
        money.getClass();
        list.getClass();
        Orientation orientation = Orientation.CASH;
        return new FlowExtensionsKt$combine$$inlined$combine$1(0, new Flow[]{this.balanceSnapshotManager.select(), this.instrumentManager.select(), ((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig(), this.profileManager.profile(), this.statusAndLimitsManager.hasPassedIdv(), this.sponsorshipStateProvider.isSponsored()}, new RealInstrumentRowLoader$models$1(z, orientation, list, instrumentSelection, money, z4, this, z3, z2, null));
    }
}

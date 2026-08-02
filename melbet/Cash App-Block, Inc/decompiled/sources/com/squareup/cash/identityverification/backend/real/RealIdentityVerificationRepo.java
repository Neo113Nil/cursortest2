package com.squareup.cash.identityverification.backend.real;

import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.contacts.RealContactSync$setup$1$2$2;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.session.backend.SessionManager;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes.dex */
public final class RealIdentityVerificationRepo {
    public final CoroutineContext ioDispatcher;
    public final SessionManager sessionManager;
    public final RealSettingsEligibilityManager settingsEligibilityManager;
    public final RealFamilyAccountsManager sponsorshipStateProvider;
    public final SyncValueReader syncValueReader;

    public RealIdentityVerificationRepo(RealFamilyAccountsManager realFamilyAccountsManager, CoroutineContext coroutineContext, SyncValueReader syncValueReader, RealSettingsEligibilityManager realSettingsEligibilityManager, SessionManager sessionManager) {
        this.sponsorshipStateProvider = realFamilyAccountsManager;
        this.ioDispatcher = coroutineContext;
        this.syncValueReader = syncValueReader;
        this.settingsEligibilityManager = realSettingsEligibilityManager;
        this.sessionManager = sessionManager;
    }

    public final Flow status() {
        Continuation continuation = null;
        return FlowKt.flowOn(FlowKt.transformLatest(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.sponsorshipStateProvider.isSponsored(), new FinishSetupTileBadgeCounter(14, this.sessionManager.getSessionState(), this), new RealContactSync$setup$1$2$2(3, continuation, 1), 0), new Badger$collect$$inlined$combine$2$3(continuation, this, 4)), this.ioDispatcher);
    }
}

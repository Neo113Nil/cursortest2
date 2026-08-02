package com.squareup.cash.onboarding.check.checkers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import com.squareup.cash.session.backend.SyncState$Progress;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ProfileIntegrityCheck implements IntegrityCheck {
    public final InstrumentQueries profileQueries;
    public final TimeToLiveSyncState profileSyncState;

    /* renamed from: type, reason: collision with root package name */
    public final IntegrityCheckFactory$Type f1178type = IntegrityCheckFactory$Type.PROFILE;

    public ProfileIntegrityCheck(TimeToLiveSyncState timeToLiveSyncState, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.profileSyncState = timeToLiveSyncState;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.squareup.cash.onboarding.check.IntegrityCheck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object check(ContinuationImpl continuationImpl) {
        ProfileIntegrityCheck$check$1 profileIntegrityCheck$check$1;
        int i;
        boolean z;
        SyncState$Progress syncState$Progress;
        if (continuationImpl instanceof ProfileIntegrityCheck$check$1) {
            profileIntegrityCheck$check$1 = (ProfileIntegrityCheck$check$1) continuationImpl;
            int i2 = profileIntegrityCheck$check$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                profileIntegrityCheck$check$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = profileIntegrityCheck$check$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileIntegrityCheck$check$1.label;
                z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.profileQueries.select$2().executeAsOneOrNull() == null) {
                        MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(this.profileSyncState.progress, 17);
                        profileIntegrityCheck$check$1.L$0 = this;
                        profileIntegrityCheck$check$1.label = 1;
                        obj = FlowKt.firstOrNull(moneyTabPresenter$models$lambda$31$$inlined$map$1, profileIntegrityCheck$check$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return z ? new IntegrityChecker$Result.Success(this) : new IntegrityChecker$Result.Failure(this);
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = profileIntegrityCheck$check$1.L$0;
                SafeTrace.throwOnFailure(obj);
                syncState$Progress = (SyncState$Progress) obj;
                if (syncState$Progress != null || syncState$Progress != SyncState$Progress.SUCCESS) {
                    z = false;
                }
                if (z) {
                }
            }
        }
        profileIntegrityCheck$check$1 = new ProfileIntegrityCheck$check$1(this, continuationImpl);
        Object obj2 = profileIntegrityCheck$check$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileIntegrityCheck$check$1.label;
        z = true;
        if (i != 0) {
        }
        syncState$Progress = (SyncState$Progress) obj2;
        if (syncState$Progress != null) {
        }
        z = false;
        if (z) {
        }
    }

    @Override // com.squareup.cash.onboarding.check.IntegrityCheck
    public final IntegrityCheckFactory$Type getType() {
        return this.f1178type;
    }
}

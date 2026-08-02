package com.squareup.cash.onboarding.check.checkers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.onboarding.check.IntegrityCheckFactory$Type;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import com.squareup.protos.franklin.ui.UiAccess;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AppLockSyncValueIntegrityCheck implements IntegrityCheck {
    public final SyncValueReader syncValueReader;
    public final long timeout;

    /* renamed from: type, reason: collision with root package name */
    public final IntegrityCheckFactory$Type f1177type;

    public AppLockSyncValueIntegrityCheck(SyncValueReader syncValueReader) {
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(10, DurationUnit.SECONDS);
        this.syncValueReader = syncValueReader;
        this.timeout = duration;
        this.f1177type = IntegrityCheckFactory$Type.APP_LOCK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.onboarding.check.IntegrityCheck
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object check(ContinuationImpl continuationImpl) {
        AppLockSyncValueIntegrityCheck$check$1 appLockSyncValueIntegrityCheck$check$1;
        int i;
        if (continuationImpl instanceof AppLockSyncValueIntegrityCheck$check$1) {
            appLockSyncValueIntegrityCheck$check$1 = (AppLockSyncValueIntegrityCheck$check$1) continuationImpl;
            int i2 = appLockSyncValueIntegrityCheck$check$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                appLockSyncValueIntegrityCheck$check$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = appLockSyncValueIntegrityCheck$check$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appLockSyncValueIntegrityCheck$check$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MusicPresenter$models$3$1 musicPresenter$models$3$1 = new MusicPresenter$models$3$1(this, continuation, 12);
                    appLockSyncValueIntegrityCheck$check$1.label = 1;
                    obj = JobKt.m4185withTimeoutOrNullKLykuaI(this.timeout, musicPresenter$models$3$1, appLockSyncValueIntegrityCheck$check$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ((UiAccess) obj) == null ? new IntegrityChecker$Result.Success(this) : new IntegrityChecker$Result.Failure(this);
            }
        }
        appLockSyncValueIntegrityCheck$check$1 = new AppLockSyncValueIntegrityCheck$check$1(this, continuationImpl);
        Object obj2 = appLockSyncValueIntegrityCheck$check$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appLockSyncValueIntegrityCheck$check$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((UiAccess) obj2) == null) {
        }
    }

    @Override // com.squareup.cash.onboarding.check.IntegrityCheck
    public final IntegrityCheckFactory$Type getType() {
        return this.f1177type;
    }
}

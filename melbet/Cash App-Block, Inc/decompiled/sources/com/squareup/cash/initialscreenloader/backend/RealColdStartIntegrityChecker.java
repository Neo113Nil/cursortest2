package com.squareup.cash.initialscreenloader.backend;

import app.cash.passcode.backend.RealAppLockState;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.check.IntegrityCheck;
import com.squareup.cash.onboarding.check.RealIntegrityChecker;
import com.squareup.cash.onboarding.check.checkers.RealIntegrityCheckFactory;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class RealColdStartIntegrityChecker {
    public static final long SYNC_APP_LOCK_ANALYTICS_DELAY;
    public static final long SYNC_APP_LOCK_TIMEOUT;
    public final StateFlow accessSyncValue;
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final RealAppLockState appLockState;
    public final RealClientSyncer clientSyncer;
    public final AndroidClock clock;
    public final RealIntegrityCheckFactory integrityCheckFactory;
    public final RealProfileSyncer profileSyncer;

    /* loaded from: classes6.dex */
    public final class IntegrityCheckItem {
        public final IntegrityCheck integrityCheck;
        public final boolean retryEnabled;

        public IntegrityCheckItem(IntegrityCheck integrityCheck, boolean z) {
            integrityCheck.getClass();
            this.integrityCheck = integrityCheck;
            this.retryEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntegrityCheckItem)) {
                return false;
            }
            IntegrityCheckItem integrityCheckItem = (IntegrityCheckItem) obj;
            return Intrinsics.areEqual(this.integrityCheck, integrityCheckItem.integrityCheck) && this.retryEnabled == integrityCheckItem.retryEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.integrityCheck.hashCode() * 31, 31, this.retryEnabled);
        }

        public final String toString() {
            return "IntegrityCheckItem(integrityCheck=" + this.integrityCheck + ", retryEnabled=" + this.retryEnabled + ", mandatory=true)";
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        SYNC_APP_LOCK_TIMEOUT = DurationKt.toDuration(60, durationUnit);
        SYNC_APP_LOCK_ANALYTICS_DELAY = DurationKt.toDuration(5, durationUnit);
    }

    public RealColdStartIntegrityChecker(RealProfileSyncer realProfileSyncer, AppConfigManager appConfigManager, RealIntegrityCheckFactory realIntegrityCheckFactory, RealIntegrityChecker realIntegrityChecker, RealClientSyncer realClientSyncer, SyncValueReader syncValueReader, Analytics analytics, RealAppLockState realAppLockState, AndroidClock androidClock) {
        this.profileSyncer = realProfileSyncer;
        this.appConfig = appConfigManager;
        this.integrityCheckFactory = realIntegrityCheckFactory;
        this.clientSyncer = realClientSyncer;
        this.analytics = analytics;
        this.appLockState = realAppLockState;
        this.clock = androidClock;
        this.accessSyncValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.Access);
    }

    public static final String access$toAnalyticsChecksString(RealColdStartIntegrityChecker realColdStartIntegrityChecker, Iterable iterable) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String lowerCase = ((IntegrityCheck) it.next()).getType().name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList.add(lowerCase);
        }
        return CollectionsKt.joinToString$default(CollectionsKt.sorted(arrayList), ",", null, null, 0, null, null, 62);
    }
}

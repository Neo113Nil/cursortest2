package com.squareup.cash.money.applets.sections;

import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.discover.api.app.v2.service.AppletsService;
import com.squareup.protos.cash.money.content.MoneyTab;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class RealAppletTileServerRecommendationProvider {
    public final Map appletIdsByMoneyTabAppletId;
    public final AppletsService appletsService;
    public final Lazy cachedUninstalledSectionSortValues$delegate;
    public final AndroidClock clock;
    public final Lazy enabled$delegate;
    public final ErrorReporter errorReporter;
    public final ArrayList expectedAppletIds;
    public final FeatureFlagManager flags;
    public final CoroutineContext ioDispatcher;
    public final AtomicLong lastRefreshAtMillis;
    public final AtomicReference lastReportedResponseAppletIds;
    public final AtomicReference lastResponseAppletIds;
    public final RealPromotedAppletTileStore promotedAppletTileStore;
    public final long refreshIntervalMillis;
    public final SessionManager sessionManager;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/money/applets/sections/RealAppletTileServerRecommendationProvider$AppletBannerError", "Lcom/squareup/cash/observability/types/ReportedError;", "sections"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class AppletBannerError extends ReportedError {
        public final String message;

        public AppletBannerError(String str) {
            this.message = str;
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return SetsKt__SetsJVMKt.setOf(ErrorFeature.Money.INSTANCE);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Set getTargets() {
            return SetsKt__SetsJVMKt.setOf(ReportedError.ErrorReportingTarget.BUGSNAG);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/money/applets/sections/RealAppletTileServerRecommendationProvider$AppletsServiceError", "Lcom/squareup/cash/observability/types/ReportedError;", "sections"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class AppletsServiceError extends ReportedError {
        public final String message;

        public AppletsServiceError(String str) {
            this.message = str;
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return SetsKt__SetsJVMKt.setOf(ErrorFeature.Money.INSTANCE);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Set getTargets() {
            return SetsKt__SetsJVMKt.setOf(ReportedError.ErrorReportingTarget.BUGSNAG);
        }
    }

    public RealAppletTileServerRecommendationProvider(SessionManager sessionManager, FeatureFlagManager featureFlagManager, AppletsService appletsService, ErrorReporter errorReporter, RealPromotedAppletTileStore realPromotedAppletTileStore, AndroidClock androidClock, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.sessionManager = sessionManager;
        this.flags = featureFlagManager;
        this.appletsService = appletsService;
        this.errorReporter = errorReporter;
        this.promotedAppletTileStore = realPromotedAppletTileStore;
        this.clock = androidClock;
        this.ioDispatcher = coroutineContext;
        Duration.Companion companion = Duration.Companion;
        this.refreshIntervalMillis = Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(12, DurationUnit.HOURS));
        this.enabled$delegate = LazyKt.lazy(new RealGooglePayer$$ExternalSyntheticLambda0(this, 29));
        this.lastResponseAppletIds = new AtomicReference(null);
        this.lastReportedResponseAppletIds = new AtomicReference(null);
        this.lastRefreshAtMillis = new AtomicLong(-1L);
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair(MoneyTab.Applet.Id.BANKING_CARD, AppletId.CARD), new Pair(MoneyTab.Applet.Id.BANKING_BENEFITS, AppletId.BANKING_BENEFITS), new Pair(MoneyTab.Applet.Id.TAXES, AppletId.TAXES), new Pair(MoneyTab.Applet.Id.SAVINGS, AppletId.SAVINGS), new Pair(MoneyTab.Applet.Id.BORROW, AppletId.BORROW), new Pair(MoneyTab.Applet.Id.PAYCHECKS, AppletId.PAYCHECKS), new Pair(MoneyTab.Applet.Id.BITCOIN, AppletId.BITCOIN), new Pair(MoneyTab.Applet.Id.STOCKS, AppletId.STOCKS), new Pair(MoneyTab.Applet.Id.EARNINGS, AppletId.EARNINGS), new Pair(MoneyTab.Applet.Id.FAMILY, AppletId.FAMILY), new Pair(MoneyTab.Applet.Id.AFTERPAY, AppletId.AFTERPAY), new Pair(MoneyTab.Applet.Id.POOLS, AppletId.POOLS), new Pair(MoneyTab.Applet.Id.PHONE_PLAN, AppletId.PHONE_PLANS));
        this.appletIdsByMoneyTabAppletId = mapOf;
        Collection values = mapOf.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            AppletId appletId = (AppletId) obj;
            appletId.getClass();
            switch (appletId.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 20:
                case 23:
                case 26:
                case 30:
                    switch (appletId.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 8:
                        case 10:
                        case 11:
                        case 13:
                        case 18:
                        case 19:
                        case 20:
                        case 26:
                            arrayList.add(obj);
                            break;
                        case 7:
                        case 9:
                        case 12:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            throw null;
                    }
                case 1:
                case 2:
                case 18:
                case 19:
                case 21:
                case 22:
                case 24:
                case 25:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    throw null;
            }
        }
        this.expectedAppletIds = arrayList;
        this.cachedUninstalledSectionSortValues$delegate = LazyKt.lazy(new IntentLauncher$$ExternalSyntheticLambda0(27, this, coroutineScope));
    }
}

package com.squareup.cash;

import app.cash.cdp.integration.CdpConfigUpdateSetupTeardown;
import com.squareup.cash.beacondetection.real.BeaconDetectionSetupTeardown;
import com.squareup.cash.blockers.analytics.RealBlockerFlowAnalytics;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.clientrouting.routers.account.RoutableAccountsProvider;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.investing.backend.real.InvestingSetupTeardown;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.localization.ClientSyncLocaleChangeIoSetupTeardown;
import com.squareup.cash.money.applets.sections.PromotedAppletTileLocaleChangeIoSetupTeardown;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.security.backend.impl.RealPasswordManager;
import com.squareup.cash.shortcut.RealDynamicShortcutManager;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.storage.TempStorageCleaner;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyReporter;
import com.squareup.util.coroutines.IoSetupTeardown;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class IoSandboxedSetupTeardowns {
    public final List setupTeardowns;

    public final class MetroFactory implements Factory {
        public final AttestedKeyMetrics$MetroFactory appAnalyticsRelay;
        public final Provider beaconDetectionSetupTeardown;
        public final Provider blockerFlowAnalytics;
        public final BorrowUiFactory.MetroFactory cdpConfigUpdateSetupTeardown;
        public final Provider dynamicShortcutManager;
        public final Provider flowStarter;
        public final Provider investingWorker;
        public final RetroUiFactory.MetroFactory languageExperimentSetupTeardown;
        public final Provider localeChangeIoSetupTeardown;
        public final RetroUiFactory.MetroFactory localeConfigSetupTeardown;
        public final Provider observabilitySetupTeardown;
        public final Provider offlineManager;
        public final SandboxJanitor.MetroFactory passwordManager;
        public final TemporaryStorage.MetroFactory playIntegrityTokenProviderTeardown;
        public final Provider promotedAppletTileLocaleChangeIoSetupTeardown;
        public final Provider realFeatureEligibilityRepository;
        public final MusicViewFactory$MetroFactory reportedErrorCacheSetupTeardown;
        public final Provider routableAccountsProvider;
        public final SandboxJanitor.MetroFactory sandboxJanitor;
        public final BreadcrumbListener.MetroFactory tempStorageCleaner;
        public final Provider userJourneyReporterSetupTeardown;

        public MetroFactory(SandboxJanitor.MetroFactory metroFactory, BreadcrumbListener.MetroFactory metroFactory2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DelegateFactory delegateFactory, DoubleCheck doubleCheck3, RetroUiFactory.MetroFactory metroFactory3, DelegateFactory delegateFactory2, DoubleCheck doubleCheck4, SandboxJanitor.MetroFactory metroFactory4, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, BorrowUiFactory.MetroFactory metroFactory5, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8, RetroUiFactory.MetroFactory metroFactory6, TemporaryStorage.MetroFactory metroFactory7, DoubleCheck doubleCheck9, DoubleCheck doubleCheck10) {
            this.sandboxJanitor = metroFactory;
            this.tempStorageCleaner = metroFactory2;
            this.observabilitySetupTeardown = doubleCheck;
            this.dynamicShortcutManager = doubleCheck2;
            this.localeChangeIoSetupTeardown = delegateFactory;
            this.promotedAppletTileLocaleChangeIoSetupTeardown = doubleCheck3;
            this.localeConfigSetupTeardown = metroFactory3;
            this.offlineManager = delegateFactory2;
            this.flowStarter = doubleCheck4;
            this.passwordManager = metroFactory4;
            this.appAnalyticsRelay = attestedKeyMetrics$MetroFactory;
            this.investingWorker = doubleCheck5;
            this.blockerFlowAnalytics = doubleCheck6;
            this.cdpConfigUpdateSetupTeardown = metroFactory5;
            this.reportedErrorCacheSetupTeardown = musicViewFactory$MetroFactory;
            this.userJourneyReporterSetupTeardown = doubleCheck7;
            this.realFeatureEligibilityRepository = doubleCheck8;
            this.languageExperimentSetupTeardown = metroFactory6;
            this.playIntegrityTokenProviderTeardown = metroFactory7;
            this.beaconDetectionSetupTeardown = doubleCheck9;
            this.routableAccountsProvider = doubleCheck10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SandboxJanitor sandboxJanitor = (SandboxJanitor) this.sandboxJanitor.invoke();
            TempStorageCleaner tempStorageCleaner = (TempStorageCleaner) this.tempStorageCleaner.invoke();
            ObservabilitySetupTeardown observabilitySetupTeardown = (ObservabilitySetupTeardown) this.observabilitySetupTeardown.invoke();
            RealDynamicShortcutManager realDynamicShortcutManager = (RealDynamicShortcutManager) this.dynamicShortcutManager.invoke();
            ClientSyncLocaleChangeIoSetupTeardown clientSyncLocaleChangeIoSetupTeardown = (ClientSyncLocaleChangeIoSetupTeardown) this.localeChangeIoSetupTeardown.invoke();
            PromotedAppletTileLocaleChangeIoSetupTeardown promotedAppletTileLocaleChangeIoSetupTeardown = (PromotedAppletTileLocaleChangeIoSetupTeardown) this.promotedAppletTileLocaleChangeIoSetupTeardown.invoke();
            CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown = (CdpConfigUpdateSetupTeardown) this.localeConfigSetupTeardown.invoke();
            RealOfflineManager realOfflineManager = (RealOfflineManager) this.offlineManager.invoke();
            RealFlowStarter realFlowStarter = (RealFlowStarter) this.flowStarter.invoke();
            RealPasswordManager realPasswordManager = (RealPasswordManager) this.passwordManager.invoke();
            CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown2 = (CdpConfigUpdateSetupTeardown) this.appAnalyticsRelay.invoke();
            InvestingSetupTeardown investingSetupTeardown = (InvestingSetupTeardown) this.investingWorker.invoke();
            RealBlockerFlowAnalytics realBlockerFlowAnalytics = (RealBlockerFlowAnalytics) this.blockerFlowAnalytics.invoke();
            CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown3 = (CdpConfigUpdateSetupTeardown) this.cdpConfigUpdateSetupTeardown.invoke();
            TempStorageCleaner tempStorageCleaner2 = (TempStorageCleaner) this.reportedErrorCacheSetupTeardown.invoke();
            RealUserJourneyReporter realUserJourneyReporter = (RealUserJourneyReporter) this.userJourneyReporterSetupTeardown.invoke();
            RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) this.realFeatureEligibilityRepository.invoke();
            CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown4 = (CdpConfigUpdateSetupTeardown) this.languageExperimentSetupTeardown.invoke();
            CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown5 = (CdpConfigUpdateSetupTeardown) this.playIntegrityTokenProviderTeardown.invoke();
            BeaconDetectionSetupTeardown beaconDetectionSetupTeardown = (BeaconDetectionSetupTeardown) this.beaconDetectionSetupTeardown.invoke();
            RoutableAccountsProvider routableAccountsProvider = (RoutableAccountsProvider) this.routableAccountsProvider.invoke();
            observabilitySetupTeardown.getClass();
            realDynamicShortcutManager.getClass();
            clientSyncLocaleChangeIoSetupTeardown.getClass();
            promotedAppletTileLocaleChangeIoSetupTeardown.getClass();
            realOfflineManager.getClass();
            realFlowStarter.getClass();
            investingSetupTeardown.getClass();
            realBlockerFlowAnalytics.getClass();
            realUserJourneyReporter.getClass();
            realFeatureEligibilityRepository.getClass();
            beaconDetectionSetupTeardown.getClass();
            routableAccountsProvider.getClass();
            return new IoSandboxedSetupTeardowns(sandboxJanitor, tempStorageCleaner, observabilitySetupTeardown, realDynamicShortcutManager, clientSyncLocaleChangeIoSetupTeardown, promotedAppletTileLocaleChangeIoSetupTeardown, cdpConfigUpdateSetupTeardown, realOfflineManager, realFlowStarter, realPasswordManager, cdpConfigUpdateSetupTeardown2, investingSetupTeardown, realBlockerFlowAnalytics, cdpConfigUpdateSetupTeardown3, tempStorageCleaner2, realUserJourneyReporter, realFeatureEligibilityRepository, cdpConfigUpdateSetupTeardown4, cdpConfigUpdateSetupTeardown5, beaconDetectionSetupTeardown, routableAccountsProvider);
        }
    }

    public IoSandboxedSetupTeardowns(SandboxJanitor sandboxJanitor, TempStorageCleaner tempStorageCleaner, ObservabilitySetupTeardown observabilitySetupTeardown, RealDynamicShortcutManager realDynamicShortcutManager, ClientSyncLocaleChangeIoSetupTeardown clientSyncLocaleChangeIoSetupTeardown, PromotedAppletTileLocaleChangeIoSetupTeardown promotedAppletTileLocaleChangeIoSetupTeardown, CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown, RealOfflineManager realOfflineManager, RealFlowStarter realFlowStarter, RealPasswordManager realPasswordManager, CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown2, InvestingSetupTeardown investingSetupTeardown, RealBlockerFlowAnalytics realBlockerFlowAnalytics, CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown3, TempStorageCleaner tempStorageCleaner2, RealUserJourneyReporter realUserJourneyReporter, RealFeatureEligibilityRepository realFeatureEligibilityRepository, CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown4, CdpConfigUpdateSetupTeardown cdpConfigUpdateSetupTeardown5, BeaconDetectionSetupTeardown beaconDetectionSetupTeardown, RoutableAccountsProvider routableAccountsProvider) {
        this.setupTeardowns = CollectionsKt__CollectionsKt.listOf((Object[]) new IoSetupTeardown[]{sandboxJanitor, tempStorageCleaner, observabilitySetupTeardown, realDynamicShortcutManager, clientSyncLocaleChangeIoSetupTeardown, promotedAppletTileLocaleChangeIoSetupTeardown, cdpConfigUpdateSetupTeardown, realOfflineManager, realFlowStarter, realPasswordManager, cdpConfigUpdateSetupTeardown2, investingSetupTeardown, realBlockerFlowAnalytics, cdpConfigUpdateSetupTeardown3, tempStorageCleaner2, realUserJourneyReporter, realFeatureEligibilityRepository, cdpConfigUpdateSetupTeardown4, cdpConfigUpdateSetupTeardown5, beaconDetectionSetupTeardown, routableAccountsProvider});
    }
}

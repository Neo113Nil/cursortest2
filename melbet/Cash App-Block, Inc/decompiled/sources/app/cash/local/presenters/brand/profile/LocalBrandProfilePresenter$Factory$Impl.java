package app.cash.local.presenters.brand.profile;

import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealLocalBrandProfileBannerDismissalTracker;
import app.cash.local.backend.real.RealLocalBrandProfileCheckedInSheetTracker;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.RealBrandFollowPresenter$Factory$Impl;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.service.LocalService;
import app.cash.local.views.LocalViewFactory;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.presenters.ArticlePresenter;

/* loaded from: classes.dex */
public final class LocalBrandProfilePresenter$Factory$Impl {
    public final ArticlePresenter.MetroFactory delegateFactory;

    public LocalBrandProfilePresenter$Factory$Impl(ArticlePresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final LocalBrandProfilePresenter create(LocalBrandProfileScreen localBrandProfileScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        localBrandProfileScreen.getClass();
        ArticlePresenter.MetroFactory metroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.contactSupportNavigator.invoke();
        RealLocalBrandSyncer realLocalBrandSyncer = (RealLocalBrandSyncer) metroFactory.linkNavigator.invoke();
        RealLocalBrandRepository realLocalBrandRepository = (RealLocalBrandRepository) metroFactory.viewedArticlesStore.invoke();
        RealMarketingMessageRepository realMarketingMessageRepository = (RealMarketingMessageRepository) metroFactory.supportStatus.invoke();
        RealClipboardManager realClipboardManager = (RealClipboardManager) metroFactory.launcher.invoke();
        RealLocalLauncher realLocalLauncher = (RealLocalLauncher) metroFactory.routerFactory.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.articlesService.invoke();
        CartBuilderManager cartBuilderManager = (CartBuilderManager) metroFactory.transactionService.invoke();
        BuyerIntentManager buyerIntentManager = (BuyerIntentManager) metroFactory.analytics.invoke();
        LocalService localService = (LocalService) metroFactory.supportPhoneService.invoke();
        RealProfileManager realProfileManager = (RealProfileManager) metroFactory.incidentsService.invoke();
        SessionManager sessionManager = (SessionManager) metroFactory.activityDataBridge.invoke();
        Analytics analytics = (Analytics) metroFactory.viewTokenGenerator.invoke();
        LocalInstalledStore localInstalledStore = (LocalInstalledStore) metroFactory.stringManager.invoke();
        LocalBrandProfileContentFactory localBrandProfileContentFactory = (LocalBrandProfileContentFactory) ((LocalViewFactory.MetroFactory) metroFactory.dateFormatManager).invoke();
        RealBrandFollowPresenter$Factory$Impl realBrandFollowPresenter$Factory$Impl = (RealBrandFollowPresenter$Factory$Impl) metroFactory.clock.invoke();
        RealLocalBrandProfileBannerDismissalTracker realLocalBrandProfileBannerDismissalTracker = (RealLocalBrandProfileBannerDismissalTracker) metroFactory.observabilityManager.invoke();
        RealLocalBrandProfileCheckedInSheetTracker realLocalBrandProfileCheckedInSheetTracker = (RealLocalBrandProfileCheckedInSheetTracker) metroFactory.moshi.invoke();
        androidStringManager.getClass();
        realLocalBrandSyncer.getClass();
        realLocalBrandRepository.getClass();
        realMarketingMessageRepository.getClass();
        realClipboardManager.getClass();
        realLocalLauncher.getClass();
        realRouter$Factory$Impl.getClass();
        cartBuilderManager.getClass();
        buyerIntentManager.getClass();
        localService.getClass();
        realProfileManager.getClass();
        sessionManager.getClass();
        analytics.getClass();
        localInstalledStore.getClass();
        realBrandFollowPresenter$Factory$Impl.getClass();
        realLocalBrandProfileBannerDismissalTracker.getClass();
        realLocalBrandProfileCheckedInSheetTracker.getClass();
        return new LocalBrandProfilePresenter(androidStringManager, realLocalBrandSyncer, realLocalBrandRepository, realMarketingMessageRepository, realClipboardManager, realLocalLauncher, realRouter$Factory$Impl, cartBuilderManager, buyerIntentManager, localService, realProfileManager, sessionManager, analytics, localInstalledStore, localBrandProfileContentFactory, realBrandFollowPresenter$Factory$Impl, realLocalBrandProfileBannerDismissalTracker, realLocalBrandProfileCheckedInSheetTracker, localBrandProfileScreen, screenNavigator);
    }
}

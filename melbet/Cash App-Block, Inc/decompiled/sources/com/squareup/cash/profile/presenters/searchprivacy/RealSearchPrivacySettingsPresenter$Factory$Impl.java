package com.squareup.cash.profile.presenters.searchprivacy;

import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.views.LocalViewFactory;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealContactAliasFetcher;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class RealSearchPrivacySettingsPresenter$Factory$Impl {
    public final Reward$Adapter delegateFactory;

    public RealSearchPrivacySettingsPresenter$Factory$Impl(Reward$Adapter reward$Adapter) {
        this.delegateFactory = reward$Adapter;
    }

    public final LocalEditorialPresenter create$1(BetterNavigator.ScreenNavigator screenNavigator) {
        Reward$Adapter reward$Adapter = this.delegateFactory;
        CustomerSearchClientService customerSearchClientService = (CustomerSearchClientService) ((Provider) reward$Adapter.avatarsAdapter).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) reward$Adapter.reward_selection_stateAdapter).invoke();
        RealProfileAliasRepository realProfileAliasRepository = (RealProfileAliasRepository) ((Provider) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
        RealContactAliasFetcher realContactAliasFetcher = (RealContactAliasFetcher) ((LocalViewFactory.MetroFactory) reward$Adapter.app_linksAdapter).invoke();
        Analytics analytics = (Analytics) ((Provider) reward$Adapter.program_detail_rowsAdapter).invoke();
        SessionManager sessionManager = (SessionManager) ((Provider) reward$Adapter.boost_detail_rowsAdapter).invoke();
        RealProfileManager realProfileManager = (RealProfileManager) ((Provider) reward$Adapter.boost_attributesAdapter).invoke();
        customerSearchClientService.getClass();
        androidStringManager.getClass();
        realProfileAliasRepository.getClass();
        analytics.getClass();
        sessionManager.getClass();
        realProfileManager.getClass();
        return new LocalEditorialPresenter(customerSearchClientService, androidStringManager, realProfileAliasRepository, realContactAliasFetcher, analytics, sessionManager, realProfileManager, screenNavigator);
    }
}

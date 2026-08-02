package app.cash.local.presenters;

import androidx.emoji2.text.MetadataRepo;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.internal.LocalResponseContextHandler$Factory$Impl;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.service.LocalService;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.android.volley.toolbox.HurlStack;
import com.squareup.cash.braze.BrazeInitializer;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.google.pay.RealGooglePayer;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class RealOrderBuilder$Factory$Impl {
    public final Profile.Adapter delegateFactory;

    public RealOrderBuilder$Factory$Impl(Profile.Adapter adapter) {
        this.delegateFactory = adapter;
    }

    public final RealOrderBuilder create(BrandSpot brandSpot, CreateCartResponse createCartResponse, AttributionKey attributionKey, Navigator navigator, String str, OrderBuilder$Payload orderBuilder$Payload, boolean z, BrandSpotSyncTokens brandSpotSyncTokens, BuyerIntentScope buyerIntentScope) {
        brandSpot.getClass();
        createCartResponse.getClass();
        attributionKey.getClass();
        navigator.getClass();
        str.getClass();
        brandSpotSyncTokens.getClass();
        Profile.Adapter adapter = this.delegateFactory;
        ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2 = (ExoPlayerImplInternal$$ExternalSyntheticLambda2) ((BrazeInitializer.MetroFactory) adapter.nearby_visibilityAdapter).invoke();
        MetadataRepo metadataRepo = (MetadataRepo) ((RealGooglePayer.MetroFactory) adapter.rate_planAdapter).invoke();
        boolean booleanValue = ((Boolean) ((RealPasscodeFlowStarter.MetroFactory) adapter.deposit_preferenceAdapter).invoke()).booleanValue();
        HurlStack hurlStack = new HurlStack(17);
        Analytics analytics = (Analytics) ((Provider) adapter.country_codeAdapter).invoke();
        LocalService localService = (LocalService) ((Provider) adapter.default_currencyAdapter).invoke();
        CartBuilderManager cartBuilderManager = (CartBuilderManager) ((Provider) adapter.incoming_request_policyAdapter).invoke();
        LocalInstalledStore localInstalledStore = (LocalInstalledStore) ((Provider) adapter.regionAdapter).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) adapter.bitcoin_display_unitsAdapter).invoke();
        SessionManager sessionManager = (SessionManager) ((Provider) adapter.bitcoin_amount_entry_currency_preferenceAdapter).invoke();
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0 providesCardEntryActivityResultHandler = LocalPresenterModule$Companion.providesCardEntryActivityResultHandler();
        RealMarketingMessageRepository realMarketingMessageRepository = (RealMarketingMessageRepository) ((Provider) adapter.addressAdapter).invoke();
        RealLocalBrandSyncer realLocalBrandSyncer = (RealLocalBrandSyncer) ((Provider) adapter.deposit_preference_dataAdapter).invoke();
        LocalResponseContextHandler$Factory$Impl localResponseContextHandler$Factory$Impl = (LocalResponseContextHandler$Factory$Impl) ((Provider) adapter.available_p2p_target_regionsAdapter).invoke();
        analytics.getClass();
        localService.getClass();
        cartBuilderManager.getClass();
        localInstalledStore.getClass();
        androidStringManager.getClass();
        sessionManager.getClass();
        realMarketingMessageRepository.getClass();
        realLocalBrandSyncer.getClass();
        localResponseContextHandler$Factory$Impl.getClass();
        return new RealOrderBuilder(exoPlayerImplInternal$$ExternalSyntheticLambda2, metadataRepo, booleanValue, hurlStack, analytics, localService, cartBuilderManager, localInstalledStore, androidStringManager, sessionManager, providesCardEntryActivityResultHandler, realMarketingMessageRepository, realLocalBrandSyncer, localResponseContextHandler$Factory$Impl, brandSpot, createCartResponse, attributionKey, navigator, str, orderBuilder$Payload, z, brandSpotSyncTokens, buyerIntentScope);
    }
}

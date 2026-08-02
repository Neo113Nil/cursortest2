package com.squareup.cash.localization;

import android.telephony.TelephonyManager;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import coil3.size.SizeKt;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.activity.backend.RealPreLoadedActivitiesManager$Factory$Impl;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.discover.api.app.v2.service.GlobalSearchService;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.android.RealCarrierInfo;
import com.squareup.util.cash.Countries;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealRegionProvider {
    public final RealCarrierInfo carrierInfo;
    public final KeyValue country;
    public final CoroutineContext ioDispatcher;
    public final RealLocaleManager localeManager;
    public Region profileRegion;
    public final Flow signOut;

    public RealRegionProvider(Flow flow, RealCarrierInfo realCarrierInfo, RealLocaleManager realLocaleManager, CoroutineContext coroutineContext, KeyValue keyValue, CoroutineScope coroutineScope, CashAccountDatabaseImpl cashAccountDatabaseImpl) {
        this.signOut = flow;
        this.carrierInfo = realCarrierInfo;
        this.localeManager = realLocaleManager;
        this.ioDispatcher = coroutineContext;
        this.country = keyValue;
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, coroutineContext, null, new CashApp$onCreate$4$1$1(this, continuation, 28), 2);
        JobKt.launch$default(coroutineScope, coroutineContext, null, new RealBoostSelector.AnonymousClass1(cashAccountDatabaseImpl, this, continuation, 22), 2);
    }

    public final Region get() {
        Region region = this.profileRegion;
        if (region == null) {
            Country country = (Country) this.country.blockingGet();
            region = country != null ? Countries.toRegion(country) : null;
            if (region == null) {
                return Countries.toRegion(guessCountry());
            }
        }
        return region;
    }

    public final Country guessCountry() {
        Country access$parseCountry;
        String networkCountryIso;
        String simCountryIso;
        TelephonyManager telephonyManager = this.carrierInfo.telephony;
        if (telephonyManager == null || (simCountryIso = telephonyManager.getSimCountryIso()) == null || (access$parseCountry = SizeKt.access$parseCountry(simCountryIso)) == null) {
            access$parseCountry = (telephonyManager == null || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) ? null : SizeKt.access$parseCountry(networkCountryIso);
        }
        if (access$parseCountry != null) {
            return access$parseCountry;
        }
        Locale systemLocale = RealLocaleManager.getSystemLocale();
        if (systemLocale.getCountry().length() != 2) {
            systemLocale = (Locale) this.localeManager.resolvedLocale.$$delegate_0.getValue();
        }
        String country = systemLocale.getCountry();
        country.getClass();
        return Country.valueOf(country);
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 1;
        public final DoubleCheck carrierInfo;
        public final Provider cashDatabase;
        public final Provider country;
        public final Provider ioDispatcher;
        public final Provider localeManager;
        public final InstanceFactory scope;
        public final Provider signOut;

        public MetroFactory(DoubleCheck doubleCheck, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, RealPasscodeFlowStarter.MetroFactory metroFactory) {
            this.carrierInfo = doubleCheck;
            this.signOut = broadwayModule$ProvideBroadwayMetroFactory;
            this.localeManager = doubleCheck2;
            this.ioDispatcher = lambdaProvider;
            this.country = doubleCheck3;
            this.scope = instanceFactory;
            this.cashDatabase = metroFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.cashDatabase;
            InstanceFactory instanceFactory = this.scope;
            Provider provider2 = this.country;
            Provider provider3 = this.ioDispatcher;
            Provider provider4 = this.localeManager;
            Provider provider5 = this.signOut;
            DoubleCheck doubleCheck = this.carrierInfo;
            switch (i) {
                case 0:
                    Flow flow = (Flow) provider5.invoke();
                    RealCarrierInfo realCarrierInfo = (RealCarrierInfo) doubleCheck.getValue();
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider4.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider3.invoke();
                    KeyValue keyValue = (KeyValue) provider2.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                    flow.getClass();
                    realCarrierInfo.getClass();
                    realLocaleManager.getClass();
                    coroutineContext.getClass();
                    keyValue.getClass();
                    coroutineScope.getClass();
                    cashAccountDatabaseImpl.getClass();
                    return new RealRegionProvider(flow, realCarrierInfo, realLocaleManager, coroutineContext, keyValue, coroutineScope, cashAccountDatabaseImpl);
                default:
                    GlobalSearchService globalSearchService = (GlobalSearchService) doubleCheck.getValue();
                    RealRecipientSuggestionsProvider realRecipientSuggestionsProvider = (RealRecipientSuggestionsProvider) provider5.invoke();
                    RealClientRouteFormatter realClientRouteFormatter = (RealClientRouteFormatter) provider4.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider3.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    RealPreLoadedActivitiesManager$Factory$Impl realPreLoadedActivitiesManager$Factory$Impl = (RealPreLoadedActivitiesManager$Factory$Impl) instanceFactory.value;
                    RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) provider.invoke();
                    globalSearchService.getClass();
                    realRecipientSuggestionsProvider.getClass();
                    realClientRouteFormatter.getClass();
                    androidStringManager.getClass();
                    featureFlagManager.getClass();
                    realPreLoadedActivitiesManager$Factory$Impl.getClass();
                    realActivityTokenFactory.getClass();
                    return new RealGlobalSearchRepository(globalSearchService, realRecipientSuggestionsProvider, realClientRouteFormatter, androidStringManager, featureFlagManager, realPreLoadedActivitiesManager$Factory$Impl, realActivityTokenFactory);
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, InstanceFactory instanceFactory, DoubleCheck doubleCheck3) {
            this.signOut = doubleCheck;
            this.carrierInfo = doubleCheck2;
            this.localeManager = lambdaProvider;
            this.ioDispatcher = lambdaProvider2;
            this.country = lambdaProvider3;
            this.scope = instanceFactory;
            this.cashDatabase = doubleCheck3;
        }
    }
}

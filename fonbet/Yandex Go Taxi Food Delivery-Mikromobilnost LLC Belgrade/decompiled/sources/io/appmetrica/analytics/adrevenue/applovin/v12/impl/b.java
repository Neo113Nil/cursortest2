package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import defpackage.j73;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class b implements ModuleAdRevenueProcessor {
    public final a a;
    public final ClientContext b;

    public b(a aVar, ClientContext clientContext) {
        this.a = aVar;
        this.b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        String str;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            return false;
        }
        MaxAd maxAd = (MaxAd) j73.G(0, objArr);
        AppLovinSdk appLovinSdk = (AppLovinSdk) j73.G(1, objArr);
        this.a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : format.equals(MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : format.equals(MaxAdFormat.BANNER) ? ModuleAdType.BANNER : format.equals(MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : format.equals(MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : format.equals(MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        Pair pair = new Pair("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        Pair pair2 = new Pair(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (str = format2.getLabel()) == null) {
            str = "null";
        }
        this.b.getInternalClientModuleFacade().reportAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0d)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), kotlin.collections.b.i(pair, pair2, new Pair(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str), new Pair("source", "applovin")), false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}

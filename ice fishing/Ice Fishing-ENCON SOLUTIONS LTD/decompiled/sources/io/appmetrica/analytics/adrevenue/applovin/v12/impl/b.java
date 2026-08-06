package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import a.AbstractC0083a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.yandex.varioqub.config.model.ConfigValue;
import h1.C0234d;
import i1.AbstractC0251h;
import i1.u;
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
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final a f3516a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientContext f3517b;

    public b(a aVar, ClientContext clientContext) {
        this.f3516a = aVar;
        this.f3517b = clientContext;
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
        Object Q2 = AbstractC0251h.Q(0, objArr);
        if (Q2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) Q2;
        Object Q3 = AbstractC0251h.Q(1, objArr);
        if (Q3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) Q3;
        this.f3516a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : i.a(format, MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : i.a(format, MaxAdFormat.BANNER) ? ModuleAdType.BANNER : i.a(format, MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : i.a(format, MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : i.a(format, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        C0234d s2 = AbstractC0083a.s("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        C0234d s3 = AbstractC0083a.s(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (str = format2.getLabel()) == null) {
            str = "null";
        }
        this.f3517b.getInternalClientModuleFacade().reportAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), ConfigValue.DOUBLE_DEFAULT_VALUE)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), u.I(s2, s3, AbstractC0083a.s(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str), AbstractC0083a.s(AdRevenueConstants.SOURCE_KEY, "applovin")), false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}

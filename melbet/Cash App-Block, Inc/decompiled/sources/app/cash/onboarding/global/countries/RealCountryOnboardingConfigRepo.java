package app.cash.onboarding.global.countries;

import app.cash.onboarding.global.countries.CountryOnboardingConfig;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.protos.franklin.api.Region;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealCountryOnboardingConfigRepo {
    public final LinkedHashSet allProductionOnboardableCountries;
    public final Set countryOnboardingConfigs;
    public final RealRegionProvider regionProvider;

    public RealCountryOnboardingConfigRepo(RealRegionProvider realRegionProvider) {
        CountryOnboardingConfig countryOnboardingConfig;
        Object obj;
        Set set = CountriesKt.ALL_ONBOARDABLE_COUNTRIES;
        set.getClass();
        this.regionProvider = realRegionProvider;
        this.countryOnboardingConfigs = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (((CountryOnboardingConfig) obj2) instanceof CountryOnboardingConfig.InProduction) {
                arrayList.add(obj2);
            }
        }
        LinkedHashSet mutableSet = CollectionsKt.toMutableSet(arrayList);
        Iterator it = this.countryOnboardingConfigs.iterator();
        while (true) {
            countryOnboardingConfig = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((CountryOnboardingConfig) obj).countryConfig.getRegion() == this.regionProvider.get()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CountryOnboardingConfig countryOnboardingConfig2 = (CountryOnboardingConfig) obj;
        if (!(countryOnboardingConfig2 instanceof CountryOnboardingConfig.InProduction) && (countryOnboardingConfig2 instanceof CountryOnboardingConfig.BTCx)) {
            countryOnboardingConfig = countryOnboardingConfig2;
        }
        if (countryOnboardingConfig != null) {
            mutableSet.add(countryOnboardingConfig);
        }
        this.allProductionOnboardableCountries = mutableSet;
    }

    public final CountryOnboardingConfig getConfig(Region region) {
        Object obj;
        region.getClass();
        Iterator it = this.allProductionOnboardableCountries.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CountryOnboardingConfig) obj).countryConfig.getRegion() == region) {
                break;
            }
        }
        CountryOnboardingConfig countryOnboardingConfig = (CountryOnboardingConfig) obj;
        if (countryOnboardingConfig != null) {
            return countryOnboardingConfig;
        }
        CountryOnboardingConfig.DefaultUSWithSmsV2 defaultUSWithSmsV2 = CountryOnboardingConfig.DefaultUSWithSmsV2.INSTANCE;
        Timber.Forest.e(new IllegalStateException("CountryOnboardingConfigRepo - region not matching; region: " + region + " + regionProvider.get: " + this.regionProvider.get()));
        return defaultUSWithSmsV2;
    }
}

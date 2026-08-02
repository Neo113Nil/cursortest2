package com.squareup.cash.gcl.delegate;

import app.cash.onboarding.global.countries.CountriesKt;
import app.cash.onboarding.global.countries.CountryOnboardingConfig;
import com.squareup.cash.gcl.InstrumentLinkingPostcodeItem;
import com.squareup.cash.gcl.data.MarketAttributes;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.cash.Regions;
import dev.zacsweers.metro.internal.Factory;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class ShouldEnableLinkCardPostalCodeDelegate implements GlobalConfigItemDelegate {
    public final /* synthetic */ int $r8$classId;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public static final MetroFactory INSTANCE$2 = new MetroFactory(2);
        public static final MetroFactory INSTANCE$3 = new MetroFactory(3);
        public static final MetroFactory INSTANCE = new MetroFactory(0);

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new ShouldEnableLinkCardPostalCodeDelegate(0);
                case 1:
                    return new ShouldEnableLinkCardPostalCodeDelegate(1);
                case 2:
                    return new ShouldEnableLinkCardPostalCodeDelegate(2);
                default:
                    return new ShouldEnableLinkCardPostalCodeDelegate(3);
            }
        }
    }

    public /* synthetic */ ShouldEnableLinkCardPostalCodeDelegate(int i) {
        this.$r8$classId = i;
    }

    @Override // com.squareup.cash.gcl.delegate.GlobalConfigItemDelegate
    public final Object get(MarketAttributes marketAttributes) {
        Object obj;
        switch (this.$r8$classId) {
            case 0:
                Region region = marketAttributes.region;
                if (!CollectionsKt__CollectionsKt.listOf((Object[]) new Region[]{Region.XXL, Region.AUS}).contains(region)) {
                    Country country = Regions.toCountry(region);
                    Iterator it = CountriesKt.ALL_ONBOARDABLE_COUNTRIES.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((CountryOnboardingConfig) obj).countryConfig.getCountry() == country) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    if (!(obj instanceof CountryOnboardingConfig.BTCx)) {
                        r0 = true;
                    }
                }
                return Boolean.valueOf(r0);
            case 1:
                return Boolean.valueOf(CustomerDocumentStatementsConfigItemDelegate$WhenMappings.$EnumSwitchMapping$0[marketAttributes.region.ordinal()] != 1);
            case 2:
                return Boolean.valueOf(CustomerLegalDocumentsConfigItemDelegate$WhenMappings.$EnumSwitchMapping$0[marketAttributes.region.ordinal()] == 1);
            default:
                return Boolean.valueOf(InstrumentLinkingShowNameFieldConfigItemDelegate$WhenMappings.$EnumSwitchMapping$0[marketAttributes.region.ordinal()] == 1);
        }
    }

    @Override // com.squareup.cash.gcl.delegate.GlobalConfigItemDelegate
    public final /* bridge */ /* synthetic */ InstrumentLinkingPostcodeItem getItem() {
        switch (this.$r8$classId) {
            case 0:
                return InstrumentLinkingPostcodeItem.INSTANCE$6;
            case 1:
                return InstrumentLinkingPostcodeItem.INSTANCE$1;
            case 2:
                return InstrumentLinkingPostcodeItem.INSTANCE$2;
            default:
                return InstrumentLinkingPostcodeItem.INSTANCE$5;
        }
    }
}

package com.squareup.cash.data.profile;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class JurisdictionConfigManager$JurisdictionConfig {
    public final List availableP2pTargetRegions;
    public final Country countryCode;
    public final CurrencyCode defaultCurrency;

    public JurisdictionConfigManager$JurisdictionConfig(CurrencyCode currencyCode, Country country, List list) {
        list.getClass();
        this.defaultCurrency = currencyCode;
        this.countryCode = country;
        this.availableP2pTargetRegions = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JurisdictionConfigManager$JurisdictionConfig)) {
            return false;
        }
        JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
        return this.defaultCurrency == jurisdictionConfigManager$JurisdictionConfig.defaultCurrency && this.countryCode == jurisdictionConfigManager$JurisdictionConfig.countryCode && Intrinsics.areEqual(this.availableP2pTargetRegions, jurisdictionConfigManager$JurisdictionConfig.availableP2pTargetRegions);
    }

    public final int hashCode() {
        CurrencyCode currencyCode = this.defaultCurrency;
        int hashCode = (currencyCode == null ? 0 : currencyCode.hashCode()) * 31;
        Country country = this.countryCode;
        return this.availableP2pTargetRegions.hashCode() + ((hashCode + (country != null ? country.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JurisdictionConfig(defaultCurrency=");
        sb.append(this.defaultCurrency);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", availableP2pTargetRegions=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.availableP2pTargetRegions, ")");
    }
}

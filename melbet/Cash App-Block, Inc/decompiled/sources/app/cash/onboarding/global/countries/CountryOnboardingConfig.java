package app.cash.onboarding.global.countries;

import androidx.collection.ArrayMap;
import app.cash.paraphrase.FormattedResource;
import com.squareup.cash.R;
import com.squareup.cash.util.country.CountryConfig;
import com.squareup.cash.util.country.SupportedCountryConfig;
import com.squareup.cash.util.legal.LegalUrl;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;

/* loaded from: classes.dex */
public abstract class CountryOnboardingConfig implements CountryConfig {
    public final CountryConfig countryConfig;

    public final class AR extends BTCx {
        public static final AR INSTANCE = new AR(SupportedCountryConfig.AR);
    }

    public final class AU extends CountryOnboardingConfig {
        public static final AU INSTANCE = new AU(SupportedCountryConfig.AU);
        public static final AliasRequirement aliasRequirement = AliasRequirement.NONE;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AU);
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final AliasRequirement getAliasRequirement() {
            return aliasRequirement;
        }

        public final int hashCode() {
            return 1871542671;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource termsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_terms_url_au, arrayMap);
        }

        public final String toString() {
            return "AU";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AliasRequirement {
        public static final /* synthetic */ AliasRequirement[] $VALUES;
        public static final AliasRequirement NONE;
        public static final AliasRequirement SMS_ENCOURAGED;
        public static final AliasRequirement SMS_ONLY;

        static {
            AliasRequirement aliasRequirement = new AliasRequirement("SMS_ONLY", 0);
            SMS_ONLY = aliasRequirement;
            AliasRequirement aliasRequirement2 = new AliasRequirement("SMS_ENCOURAGED", 1);
            SMS_ENCOURAGED = aliasRequirement2;
            AliasRequirement aliasRequirement3 = new AliasRequirement("NONE", 2);
            NONE = aliasRequirement3;
            $VALUES = new AliasRequirement[]{aliasRequirement, aliasRequirement2, aliasRequirement3};
        }

        public static AliasRequirement valueOf(String str) {
            return (AliasRequirement) Enum.valueOf(AliasRequirement.class, str);
        }

        public static AliasRequirement[] values() {
            return (AliasRequirement[]) $VALUES.clone();
        }
    }

    public final class BD extends CountryOnboardingConfig {
        public static final BD INSTANCE = new BD(SupportedCountryConfig.BD);
        public static final AliasRequirement aliasRequirement = AliasRequirement.NONE;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BD);
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final AliasRequirement getAliasRequirement() {
            return aliasRequirement;
        }

        public final int hashCode() {
            return 1871542685;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource termsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_terms_url_us, arrayMap);
        }

        public final String toString() {
            return "BD";
        }
    }

    public final class BM extends BTCx {
        public static final BM INSTANCE = new BM(SupportedCountryConfig.BM);
    }

    public abstract class BTCx extends CountryOnboardingConfig implements SmsEditorV2FlagBypass {
        public final AliasRequirement aliasRequirement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BTCx(CountryConfig countryConfig) {
            super(countryConfig);
            countryConfig.getClass();
            this.aliasRequirement = AliasRequirement.SMS_ONLY;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final AliasRequirement getAliasRequirement() {
            return this.aliasRequirement;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource termsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_terms_url_btcx, arrayMap);
        }
    }

    public final class CA extends CountryOnboardingConfig implements InProduction {
        public static final CA INSTANCE = new CA(SupportedCountryConfig.CA);
        public static final AliasRequirement aliasRequirement = AliasRequirement.NONE;

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final AliasRequirement getAliasRequirement() {
            return aliasRequirement;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource termsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_terms_url_ca, arrayMap);
        }
    }

    public final class CR extends BTCx {
        public static final CR INSTANCE = new CR(SupportedCountryConfig.CR);
    }

    /* loaded from: classes3.dex */
    public final class DefaultUSWithSmsV2 extends CountryOnboardingConfig implements InProduction, SmsEditorV2FlagBypass {
        public static final DefaultUSWithSmsV2 INSTANCE = new DefaultUSWithSmsV2(SupportedCountryConfig.US);
        public static final AliasRequirement aliasRequirement = AliasRequirement.NONE;
        public static final int termsPlain = R.string.blockers_terms_plain_us;

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final AliasRequirement getAliasRequirement() {
            return aliasRequirement;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final Integer getTermsPlain() {
            return Integer.valueOf(termsPlain);
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource termsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_terms_url_us, arrayMap);
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource updatedTermsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_updated_terms_url_us, arrayMap);
        }
    }

    public final class GB extends CountryOnboardingConfig implements InProduction {
        public static final GB INSTANCE = new GB(SupportedCountryConfig.GB);
        public static final AliasRequirement aliasRequirement = AliasRequirement.SMS_ENCOURAGED;

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final AliasRequirement getAliasRequirement() {
            return aliasRequirement;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource termsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            ArrayMap arrayMap = new ArrayMap(3);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str4);
            return new FormattedResource(R.string.blockers_terms_url_uk, arrayMap);
        }
    }

    public final class GT extends BTCx {
        public static final GT INSTANCE = new GT(SupportedCountryConfig.GT);
    }

    public final class IE extends CountryOnboardingConfig implements InProduction {
        public static final IE INSTANCE = new IE(SupportedCountryConfig.IE);
        public static final AliasRequirement aliasRequirement = AliasRequirement.NONE;

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final AliasRequirement getAliasRequirement() {
            return aliasRequirement;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource termsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_terms_url_ie, arrayMap);
        }
    }

    public interface InProduction {
    }

    public final class KE extends BTCx {
        public static final KE INSTANCE = new KE(SupportedCountryConfig.KE);
    }

    public final class MX extends BTCx {
        public static final MX INSTANCE = new MX(SupportedCountryConfig.MX);
    }

    public final class NG extends CountryOnboardingConfig {
        public static final NG INSTANCE = new NG(SupportedCountryConfig.NG);
        public static final AliasRequirement aliasRequirement = AliasRequirement.NONE;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NG);
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final AliasRequirement getAliasRequirement() {
            return aliasRequirement;
        }

        public final int hashCode() {
            return 1871543060;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource termsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_terms_url_us, arrayMap);
        }

        public final String toString() {
            return "NG";
        }
    }

    public final class SV extends BTCx {
        public static final SV INSTANCE = new SV(SupportedCountryConfig.SV);
    }

    public interface SmsEditorV2FlagBypass {
    }

    public final class US extends CountryOnboardingConfig implements InProduction {
        public static final US INSTANCE = new US(SupportedCountryConfig.US);
        public static final AliasRequirement aliasRequirement = AliasRequirement.NONE;
        public static final int termsPlain = R.string.blockers_terms_plain_us;

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final AliasRequirement getAliasRequirement() {
            return aliasRequirement;
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final Integer getTermsPlain() {
            return Integer.valueOf(termsPlain);
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource termsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_terms_url_us, arrayMap);
        }

        @Override // app.cash.onboarding.global.countries.CountryOnboardingConfig
        public final FormattedResource updatedTermsUrl(String str) {
            str.getClass();
            String str2 = LegalUrl.ESign;
            String str3 = LegalUrl.TermsOfService;
            String str4 = LegalUrl.ESign;
            String str5 = LegalUrl.Privacy;
            str.getClass();
            str3.getClass();
            str4.getClass();
            str5.getClass();
            ArrayMap arrayMap = new ArrayMap(4);
            arrayMap.put("esign_url", str4);
            arrayMap.put("tos_url", str3);
            arrayMap.put("next_button", str);
            arrayMap.put("privacy_url", str5);
            return new FormattedResource(R.string.blockers_updated_terms_url_us, arrayMap);
        }
    }

    public CountryOnboardingConfig(CountryConfig countryConfig) {
        this.countryConfig = countryConfig;
    }

    public abstract AliasRequirement getAliasRequirement();

    @Override // com.squareup.cash.util.country.CountryConfig
    public final Country getCountry() {
        return this.countryConfig.getCountry();
    }

    @Override // com.squareup.cash.util.country.CountryConfig
    public final Region getRegion() {
        return this.countryConfig.getRegion();
    }

    public Integer getTermsPlain() {
        return null;
    }

    public abstract FormattedResource termsUrl(String str);

    public FormattedResource updatedTermsUrl(String str) {
        str.getClass();
        return null;
    }
}

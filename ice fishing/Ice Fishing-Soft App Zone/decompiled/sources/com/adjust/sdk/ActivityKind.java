package com.adjust.sdk;

import com.google.android.datatransport.WinterFlowJSONLibrary;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT,
    PURCHASE_VERIFICATION;

    public static ActivityKind fromString(String str) {
        return "session".equals(str) ? SESSION : "event".equals(str) ? EVENT : "click".equals(str) ? CLICK : "attribution".equals(str) ? ATTRIBUTION : "info".equals(str) ? INFO : "gdpr".equals(str) ? GDPR : "ad_revenue".equals(str) ? AD_REVENUE : "subscription".equals(str) ? SUBSCRIPTION : "third_party_sharing".equals(str) ? THIRD_PARTY_SHARING : "measurement_consent".equals(str) ? MEASUREMENT_CONSENT : "purchase_verification".equals(str) ? PURCHASE_VERIFICATION : UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (ordinal()) {
            case 1:
                return "session";
            case 2:
                return "event";
            case 3:
                return "click";
            case 4:
                return "attribution";
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
            case 10:
            default:
                return "unknown";
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return "info";
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return "gdpr";
            case 9:
                return "ad_revenue";
            case 11:
                return "subscription";
            case 12:
                return "third_party_sharing";
            case 13:
                return "measurement_consent";
            case 14:
                return "purchase_verification";
        }
    }
}

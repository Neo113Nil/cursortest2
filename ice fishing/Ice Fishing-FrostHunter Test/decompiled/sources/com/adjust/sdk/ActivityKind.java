package com.adjust.sdk;

import android.content.Context.FrostHunterObjectAnimatorOlympianNeoMaster6315;
import android.content.Context.FrostHunterRemoteModelManagerCyberLegend2797;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
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
        switch (FrostHunterObjectAnimatorOlympianNeoMaster6315.FrostHunterAlphaAnimationNeoCosmos5761[ordinal()]) {
            case 1:
                return "session";
            case 2:
                return "event";
            case 3:
                return "click";
            case 4:
                return "attribution";
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                return "info";
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                return "gdpr";
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                return "ad_revenue";
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                return "subscription";
            case 9:
                return "third_party_sharing";
            case 10:
                return "measurement_consent";
            case 11:
                return "purchase_verification";
            default:
                return "unknown";
        }
    }
}

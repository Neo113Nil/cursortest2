package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ComplianceData;

/* loaded from: classes4.dex */
public final class AutoValue_ComplianceData extends ComplianceData {
    public final AutoValue_ExternalPrivacyContext privacyContext;

    public AutoValue_ComplianceData(AutoValue_ExternalPrivacyContext autoValue_ExternalPrivacyContext) {
        ComplianceData.ProductIdOrigin productIdOrigin = ComplianceData.ProductIdOrigin.EVENT_OVERRIDE;
        this.privacyContext = autoValue_ExternalPrivacyContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplianceData)) {
            return false;
        }
        if (!this.privacyContext.equals(((AutoValue_ComplianceData) ((ComplianceData) obj)).privacyContext)) {
            return false;
        }
        Object obj2 = ComplianceData.ProductIdOrigin.EVENT_OVERRIDE;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.privacyContext.hashCode() ^ 1000003) * 1000003) ^ ComplianceData.ProductIdOrigin.EVENT_OVERRIDE.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.privacyContext + ", productIdOrigin=" + ComplianceData.ProductIdOrigin.EVENT_OVERRIDE + "}";
    }
}

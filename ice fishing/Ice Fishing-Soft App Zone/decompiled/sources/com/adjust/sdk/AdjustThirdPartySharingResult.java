package com.adjust.sdk;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class AdjustThirdPartySharingResult {
    private final String thirdPartySharingSettingsJson;

    public AdjustThirdPartySharingResult(String str) {
        this.thirdPartySharingSettingsJson = str;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdjustThirdPartySharingResult) {
            return Util.equalString(this.thirdPartySharingSettingsJson, ((AdjustThirdPartySharingResult) obj).thirdPartySharingSettingsJson);
        }
        return false;
    }

    public String getThirdPartySharingSettingsJson() {
        return this.thirdPartySharingSettingsJson;
    }

    public int hashCode() {
        String str = this.thirdPartySharingSettingsJson;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}

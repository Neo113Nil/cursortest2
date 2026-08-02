package com.google.android.datatransport.cct.internal;

/* loaded from: classes4.dex */
public final class AutoValue_ExternalPrivacyContext extends ExternalPrivacyContext {
    public final AutoValue_ExternalPRequestContext prequest;

    public AutoValue_ExternalPrivacyContext(AutoValue_ExternalPRequestContext autoValue_ExternalPRequestContext) {
        this.prequest = autoValue_ExternalPRequestContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPrivacyContext)) {
            return false;
        }
        return this.prequest.equals(((AutoValue_ExternalPrivacyContext) ((ExternalPrivacyContext) obj)).prequest);
    }

    public final int hashCode() {
        return this.prequest.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.prequest + "}";
    }
}

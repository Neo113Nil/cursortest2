package com.createyourself.policy;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PolicyGate.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/createyourself/policy/PolicyWebViewConfig;", "", "mixedContentMode", "", "allowFileAccess", "", "allowContentAccess", "acceptThirdPartyCookies", "databaseEnabled", "<init>", "(IZZZZ)V", "getMixedContentMode", "()I", "getAllowFileAccess", "()Z", "getAllowContentAccess", "getAcceptThirdPartyCookies", "getDatabaseEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "policy_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final /* data */ class PolicyWebViewConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean acceptThirdPartyCookies;
    private final boolean allowContentAccess;
    private final boolean allowFileAccess;
    private final boolean databaseEnabled;
    private final int mixedContentMode;

    public static /* synthetic */ PolicyWebViewConfig copy$default(PolicyWebViewConfig policyWebViewConfig, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = policyWebViewConfig.mixedContentMode;
        }
        if ((i2 & 2) != 0) {
            z = policyWebViewConfig.allowFileAccess;
        }
        if ((i2 & 4) != 0) {
            z2 = policyWebViewConfig.allowContentAccess;
        }
        if ((i2 & 8) != 0) {
            z3 = policyWebViewConfig.acceptThirdPartyCookies;
        }
        if ((i2 & 16) != 0) {
            z4 = policyWebViewConfig.databaseEnabled;
        }
        boolean z5 = z4;
        boolean z6 = z2;
        return policyWebViewConfig.copy(i, z, z6, z3, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMixedContentMode() {
        return this.mixedContentMode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAllowFileAccess() {
        return this.allowFileAccess;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAllowContentAccess() {
        return this.allowContentAccess;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAcceptThirdPartyCookies() {
        return this.acceptThirdPartyCookies;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDatabaseEnabled() {
        return this.databaseEnabled;
    }

    public final PolicyWebViewConfig copy(int mixedContentMode, boolean allowFileAccess, boolean allowContentAccess, boolean acceptThirdPartyCookies, boolean databaseEnabled) {
        return new PolicyWebViewConfig(mixedContentMode, allowFileAccess, allowContentAccess, acceptThirdPartyCookies, databaseEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolicyWebViewConfig)) {
            return false;
        }
        PolicyWebViewConfig policyWebViewConfig = (PolicyWebViewConfig) other;
        return this.mixedContentMode == policyWebViewConfig.mixedContentMode && this.allowFileAccess == policyWebViewConfig.allowFileAccess && this.allowContentAccess == policyWebViewConfig.allowContentAccess && this.acceptThirdPartyCookies == policyWebViewConfig.acceptThirdPartyCookies && this.databaseEnabled == policyWebViewConfig.databaseEnabled;
    }

    public int hashCode() {
        return (((((((this.mixedContentMode * 31) + PolicyGateKt$$ExternalSyntheticBackport0.m(this.allowFileAccess)) * 31) + PolicyGateKt$$ExternalSyntheticBackport0.m(this.allowContentAccess)) * 31) + PolicyGateKt$$ExternalSyntheticBackport0.m(this.acceptThirdPartyCookies)) * 31) + PolicyGateKt$$ExternalSyntheticBackport0.m(this.databaseEnabled);
    }

    public String toString() {
        return "PolicyWebViewConfig(mixedContentMode=" + this.mixedContentMode + ", allowFileAccess=" + this.allowFileAccess + ", allowContentAccess=" + this.allowContentAccess + ", acceptThirdPartyCookies=" + this.acceptThirdPartyCookies + ", databaseEnabled=" + this.databaseEnabled + ")";
    }

    public PolicyWebViewConfig(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.mixedContentMode = i;
        this.allowFileAccess = z;
        this.allowContentAccess = z2;
        this.acceptThirdPartyCookies = z3;
        this.databaseEnabled = z4;
    }

    public final int getMixedContentMode() {
        return this.mixedContentMode;
    }

    public final boolean getAllowFileAccess() {
        return this.allowFileAccess;
    }

    public final boolean getAllowContentAccess() {
        return this.allowContentAccess;
    }

    public final boolean getAcceptThirdPartyCookies() {
        return this.acceptThirdPartyCookies;
    }

    public final boolean getDatabaseEnabled() {
        return this.databaseEnabled;
    }

    /* compiled from: PolicyGate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/createyourself/policy/PolicyWebViewConfig$Companion;", "", "<init>", "()V", "production", "Lcom/createyourself/policy/PolicyWebViewConfig;", "compatibility", "policy_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PolicyWebViewConfig production() {
            return new PolicyWebViewConfig(1, false, false, false, true);
        }

        public final PolicyWebViewConfig compatibility() {
            return new PolicyWebViewConfig(2, true, true, true, true);
        }
    }
}

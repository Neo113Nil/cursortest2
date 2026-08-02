package io.appmetrica.analytics.egress.internal.config;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b\u000f\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b\u0010\u0010\u0019¨\u0006("}, d2 = {"Lio/appmetrica/analytics/egress/internal/config/EgressConfig;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", BackendConfig.Restrictions.ENABLED, "url", "repeatedDelay", "randomDelayWindow", "isBackgroundAllowed", "isDiagnosticsEnabled", "copy", "toString", "hashCode", "other", "equals", "a", "Z", "getEnabled", "()Z", "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "c", CA20Status.STATUS_USER_I, "getRepeatedDelay", "()I", "d", "getRandomDelayWindow", "e", "f", "<init>", "(ZLjava/lang/String;IIZZ)V", "egress_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final /* data */ class EgressConfig {

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean enabled;

    /* renamed from: b, reason: from kotlin metadata */
    private final String url;

    /* renamed from: c, reason: from kotlin metadata */
    private final int repeatedDelay;

    /* renamed from: d, reason: from kotlin metadata */
    private final int randomDelayWindow;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean isBackgroundAllowed;

    /* renamed from: f, reason: from kotlin metadata */
    private final boolean isDiagnosticsEnabled;

    public EgressConfig(boolean z, String str, int i, int i2, boolean z2, boolean z3) {
        this.enabled = z;
        this.url = str;
        this.repeatedDelay = i;
        this.randomDelayWindow = i2;
        this.isBackgroundAllowed = z2;
        this.isDiagnosticsEnabled = z3;
    }

    public static /* synthetic */ EgressConfig copy$default(EgressConfig egressConfig, boolean z, String str, int i, int i2, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = egressConfig.enabled;
        }
        if ((i3 & 2) != 0) {
            str = egressConfig.url;
        }
        if ((i3 & 4) != 0) {
            i = egressConfig.repeatedDelay;
        }
        if ((i3 & 8) != 0) {
            i2 = egressConfig.randomDelayWindow;
        }
        if ((i3 & 16) != 0) {
            z2 = egressConfig.isBackgroundAllowed;
        }
        if ((i3 & 32) != 0) {
            z3 = egressConfig.isDiagnosticsEnabled;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return egressConfig.copy(z, str, i, i2, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRepeatedDelay() {
        return this.repeatedDelay;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRandomDelayWindow() {
        return this.randomDelayWindow;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBackgroundAllowed() {
        return this.isBackgroundAllowed;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDiagnosticsEnabled() {
        return this.isDiagnosticsEnabled;
    }

    public final EgressConfig copy(boolean enabled, String url, int repeatedDelay, int randomDelayWindow, boolean isBackgroundAllowed, boolean isDiagnosticsEnabled) {
        return new EgressConfig(enabled, url, repeatedDelay, randomDelayWindow, isBackgroundAllowed, isDiagnosticsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EgressConfig)) {
            return false;
        }
        EgressConfig egressConfig = (EgressConfig) other;
        return this.enabled == egressConfig.enabled && jl40.l(this.url, egressConfig.url) && this.repeatedDelay == egressConfig.repeatedDelay && this.randomDelayWindow == egressConfig.randomDelayWindow && this.isBackgroundAllowed == egressConfig.isBackgroundAllowed && this.isDiagnosticsEnabled == egressConfig.isDiagnosticsEnabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getRandomDelayWindow() {
        return this.randomDelayWindow;
    }

    public final int getRepeatedDelay() {
        return this.repeatedDelay;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDiagnosticsEnabled) + unr0.e(oyr.b(this.randomDelayWindow, oyr.b(this.repeatedDelay, unr0.b(Boolean.hashCode(this.enabled) * 31, 31, this.url), 31), 31), 31, this.isBackgroundAllowed);
    }

    public final boolean isBackgroundAllowed() {
        return this.isBackgroundAllowed;
    }

    public final boolean isDiagnosticsEnabled() {
        return this.isDiagnosticsEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EgressConfig(enabled=");
        sb.append(this.enabled);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", repeatedDelay=");
        sb.append(this.repeatedDelay);
        sb.append(", randomDelayWindow=");
        sb.append(this.randomDelayWindow);
        sb.append(", isBackgroundAllowed=");
        sb.append(this.isBackgroundAllowed);
        sb.append(", isDiagnosticsEnabled=");
        return unr0.u(sb, this.isDiagnosticsEnabled, ')');
    }
}

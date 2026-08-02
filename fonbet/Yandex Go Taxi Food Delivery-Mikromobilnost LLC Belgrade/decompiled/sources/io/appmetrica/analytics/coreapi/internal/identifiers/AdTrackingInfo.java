package io.appmetrica.analytics.coreapi.internal.identifiers;

import defpackage.oo31;

/* loaded from: classes9.dex */
public class AdTrackingInfo {
    public final String advId;
    public final Boolean limitedAdTracking;
    public final Provider provider;

    /* loaded from: classes4.dex */
    public enum Provider {
        GOOGLE,
        HMS,
        YANDEX
    }

    public AdTrackingInfo(Provider provider, String str, Boolean bool) {
        this.provider = provider;
        this.advId = str;
        this.limitedAdTracking = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdTrackingInfo{provider=");
        sb.append(this.provider);
        sb.append(", advId='");
        sb.append(this.advId);
        sb.append("', limitedAdTracking=");
        return oo31.i(sb, this.limitedAdTracking, '}');
    }
}

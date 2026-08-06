package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f3484a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f3485b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f3486a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f3487b;

        public /* synthetic */ Builder(String str, int i2) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f3487b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f3486a = str;
            this.f3487b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i2) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f3485b;
    }

    public String getTrackingId() {
        return this.f3484a;
    }

    private PreloadInfo(Builder builder) {
        this.f3484a = builder.f3486a;
        this.f3485b = CollectionUtils.unmodifiableMapCopy(builder.f3487b);
    }
}

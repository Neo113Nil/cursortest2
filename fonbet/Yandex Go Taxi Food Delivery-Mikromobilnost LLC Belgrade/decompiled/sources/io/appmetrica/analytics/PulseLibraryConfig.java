package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C0260cr;
import io.appmetrica.analytics.impl.Ki;
import io.appmetrica.analytics.impl.Vr;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public class PulseLibraryConfig extends CommonPulseConfig {
    public final String libPackage;
    public final String libVersion;

    private PulseLibraryConfig(Builder builder) {
        super(builder.a, builder.b, builder.c, builder.d, builder.g, builder.h, null, Boolean.FALSE);
        this.libPackage = builder.e;
        this.libVersion = builder.f;
    }

    public static Builder newBuilder(String str, String str2, String str3) {
        return new Builder(str, str2, str3, new C0260cr(new Ki()), 0);
    }

    public static class Builder {
        private final String a;
        private Integer b;
        private final LinkedHashMap c;
        private final ArrayList d;
        private final String e;
        private final String f;
        private Executor g;
        private Boolean h;
        private final Vr i;

        private Builder(String str, String str2, String str3, C0260cr c0260cr) {
            this.c = new LinkedHashMap();
            this.d = new ArrayList();
            this.a = str;
            this.i = c0260cr;
            this.e = str2;
            this.f = str3;
        }

        @Deprecated
        public Builder addVariation(String str, String str2) {
            this.c.put(str, str2);
            return this;
        }

        public Builder addVariationFromAB(int i) {
            this.d.add(Integer.valueOf(i));
            return this;
        }

        public PulseLibraryConfig build() {
            PulseLibraryConfig pulseLibraryConfig = new PulseLibraryConfig(this, 0);
            this.i.a(pulseLibraryConfig);
            return pulseLibraryConfig;
        }

        public Builder withChannelId(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public Builder withExecutor(Executor executor) {
            this.g = executor;
            return this;
        }

        public Builder withHistogramsReporting(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, C0260cr c0260cr, int i) {
            this(str, str2, str3, c0260cr);
        }
    }

    public /* synthetic */ PulseLibraryConfig(Builder builder, int i) {
        this(builder);
    }
}

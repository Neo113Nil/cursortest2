package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.C0260cr;
import io.appmetrica.analytics.impl.Ii;
import io.appmetrica.analytics.impl.Vr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public class PulseConfig extends CommonPulseConfig {
    public final Long cpuMonitoringBackgroundInterval;
    public final Long cpuMonitoringForegroundInterval;
    public final MviConfig mviConfig;
    public final Set<String> processes;

    private PulseConfig(Builder builder) {
        super(builder.a, builder.e, builder.f, builder.g, builder.h, builder.i, builder.k, builder.l);
        this.processes = builder.b;
        this.mviConfig = builder.j;
        this.cpuMonitoringForegroundInterval = builder.c;
        this.cpuMonitoringBackgroundInterval = builder.d;
    }

    public static Builder newBuilder(Context context, String str) {
        return new Builder(str, new C0260cr(new Ii(context)));
    }

    public static class Builder {
        private final String a;
        private final HashSet b;
        private Long c;
        private Long d;
        private Integer e;
        private final LinkedHashMap f;
        private final ArrayList g;
        private Executor h;
        private Boolean i;
        private MviConfig j;
        private String k;
        private Boolean l;
        private final Vr m;

        private Builder(C0260cr c0260cr, String str) {
            this.b = new HashSet();
            this.f = new LinkedHashMap();
            this.g = new ArrayList();
            this.a = str;
            this.m = c0260cr;
        }

        public Builder addProcesses(String... strArr) {
            this.b.addAll(Arrays.asList(strArr));
            return this;
        }

        @Deprecated
        public Builder addVariation(String str, String str2) {
            this.f.put(str, str2);
            return this;
        }

        public Builder addVariationFromAB(int i) {
            this.g.add(Integer.valueOf(i));
            return this;
        }

        public PulseConfig build() {
            PulseConfig pulseConfig = new PulseConfig(this, 0);
            this.m.a(pulseConfig);
            return pulseConfig;
        }

        public Builder withChannelId(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public Builder withCpuMonitoringBackgroundInterval(Long l) {
            this.d = l;
            return this;
        }

        public Builder withCpuMonitoringForegroundInterval(Long l) {
            this.c = l;
            return this;
        }

        public Builder withEnableLogging(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public Builder withExecutor(Executor executor) {
            this.h = executor;
            return this;
        }

        public Builder withHistogramsReporting(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public Builder withMviConfig(MviConfig mviConfig) {
            this.j = mviConfig;
            return this;
        }

        public Builder withUploadUrl(String str) {
            this.k = str;
            return this;
        }

        public /* synthetic */ Builder(String str, C0260cr c0260cr) {
            this(c0260cr, str);
        }
    }

    public /* synthetic */ PulseConfig(Builder builder, int i) {
        this(builder);
    }
}

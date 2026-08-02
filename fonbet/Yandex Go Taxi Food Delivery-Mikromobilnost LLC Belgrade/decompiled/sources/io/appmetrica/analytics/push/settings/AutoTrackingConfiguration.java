package io.appmetrica.analytics.push.settings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class AutoTrackingConfiguration {
    public final Set<String> disabledActionIdSet;
    public final boolean trackingAllAdditionalAction;
    public final boolean trackingDismissAction;
    public final boolean trackingOpenAction;
    public final boolean trackingProcessedAction;
    public final boolean trackingReceiveAction;

    private AutoTrackingConfiguration(Builder builder) {
        this.trackingReceiveAction = true;
        this.trackingDismissAction = true;
        this.trackingOpenAction = builder.a;
        this.trackingAllAdditionalAction = builder.b;
        this.trackingProcessedAction = true;
        this.disabledActionIdSet = Collections.unmodifiableSet(builder.c);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public boolean isTrackingAdditionalAction(String str) {
        return this.trackingAllAdditionalAction && !this.disabledActionIdSet.contains(str);
    }

    public static class Builder {
        private boolean a;
        private boolean b;
        private final HashSet c;

        private Builder() {
            this.a = true;
            this.b = true;
            this.c = new HashSet();
        }

        public AutoTrackingConfiguration build() {
            return new AutoTrackingConfiguration(this, 0);
        }

        public Builder disableTrackingAdditionalAction(String str) {
            this.c.add(str);
            return this;
        }

        public Builder disableTrackingAllAdditionalAction() {
            this.b = false;
            return this;
        }

        public Builder disableTrackingOpenAction() {
            this.a = false;
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public /* synthetic */ AutoTrackingConfiguration(Builder builder, int i) {
        this(builder);
    }
}

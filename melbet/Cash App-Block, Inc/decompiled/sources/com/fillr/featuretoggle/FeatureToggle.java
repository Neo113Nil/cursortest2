package com.fillr.featuretoggle;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeatureToggle {
    private final boolean enabled;
    private final String name;
    private final List<ActivationStrategy> strategies;

    public FeatureToggle(String str, List list, boolean z) {
        this.name = str;
        this.enabled = z;
        this.strategies = list;
    }

    public final String getName() {
        return this.name;
    }

    public final List getStrategies() {
        return this.strategies;
    }

    public final boolean isEnabled() {
        return this.enabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append(": ");
        sb.append(this.enabled ? "enabled" : "disabled");
        sb.append("\n");
        Iterator<ActivationStrategy> it = this.strategies.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

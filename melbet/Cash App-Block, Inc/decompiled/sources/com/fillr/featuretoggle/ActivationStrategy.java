package com.fillr.featuretoggle;

import java.util.Map;

/* loaded from: classes4.dex */
public final class ActivationStrategy {
    public final String name;
    public final Map parameters;

    public ActivationStrategy(String str, Map map) {
        this.name = str;
        this.parameters = map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.parameters.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }
}

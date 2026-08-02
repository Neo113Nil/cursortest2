package androidx.camera.core.featuregroup.impl;

import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class ResolvedFeatureGroup {
    public final LinkedHashSet features;

    public ResolvedFeatureGroup(LinkedHashSet linkedHashSet) {
        this.features = linkedHashSet;
    }

    public final String toString() {
        return "ResolvedFeatureGroup(features=" + this.features + ')';
    }
}

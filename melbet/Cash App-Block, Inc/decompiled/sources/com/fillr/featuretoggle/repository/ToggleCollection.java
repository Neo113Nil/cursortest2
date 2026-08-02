package com.fillr.featuretoggle.repository;

import com.fillr.featuretoggle.FeatureToggle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ToggleCollection {
    public final transient HashMap cache;
    public String deployment_version;
    public final Collection features;

    public ToggleCollection(Collection collection) {
        collection = collection == null ? Collections.EMPTY_LIST : collection;
        this.features = collection;
        this.cache = new HashMap();
        for (FeatureToggle featureToggle : collection) {
            this.cache.put(featureToggle.getName(), featureToggle);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deployment Version: " + this.deployment_version + "\n\n");
        Iterator it = this.features.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            sb.append(i + ". " + ((FeatureToggle) it.next()).toString() + "\n");
        }
        return sb.toString();
    }
}

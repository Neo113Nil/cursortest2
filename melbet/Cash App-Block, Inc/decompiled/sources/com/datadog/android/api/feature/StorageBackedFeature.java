package com.datadog.android.api.feature;

import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.FeatureStorageConfiguration;

/* loaded from: classes4.dex */
public interface StorageBackedFeature extends Feature {
    RequestFactory getRequestFactory();

    FeatureStorageConfiguration getStorageConfiguration();
}

package com.bugsnag.android.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public interface InternalMetrics {
    void notifyAddCallback(String str);

    void setBreadcrumbTrimMetrics(int i, int i2);

    void setCallbackCounts(HashMap hashMap);

    void setConfigDifferences(Map map);

    void setMetadataTrimMetrics(int i, int i2);

    Map toJsonableMap();
}

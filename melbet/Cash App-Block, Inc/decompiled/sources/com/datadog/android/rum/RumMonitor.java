package com.datadog.android.rum;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes.dex */
public interface RumMonitor {
    /* renamed from: _getInternal */
    /* synthetic */ _RumInternalProxy getInternalProxy();

    void addAction(RumActionType rumActionType, String str, Map map);

    void addAttribute(Object obj, String str);

    void addError(String str, int i, Throwable th, Map map);

    void addErrorWithStacktrace(String str, String str2, Map map);

    void addFeatureFlagEvaluation(String str, String str2);

    void addTiming(String str);

    void addViewAttributes(Map map);

    void addViewLoadingTime();

    Map getAttributes();

    void removeAttribute(String str);

    void reportAppFullyDisplayed();

    void startAction(LinkedHashMap linkedHashMap);

    void startResource(String str, String str2, Map map);

    void startView(String str, Object obj, Map map);

    void stopAction(RumActionType rumActionType, LinkedHashMap linkedHashMap);

    void stopResource(String str, Integer num, EmptyMap emptyMap);

    void stopResourceWithError(String str, String str2, Throwable th, Map map);

    void stopView(Map map, Object obj);
}

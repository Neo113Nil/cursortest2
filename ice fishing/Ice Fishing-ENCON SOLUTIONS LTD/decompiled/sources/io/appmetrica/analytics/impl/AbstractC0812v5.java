package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0812v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f7039a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("google", AdTrackingInfo.Provider.GOOGLE);
        hashMap.put("huawei", AdTrackingInfo.Provider.HMS);
        hashMap.put("yandex", AdTrackingInfo.Provider.YANDEX);
        f7039a = Collections.unmodifiableMap(hashMap);
    }
}

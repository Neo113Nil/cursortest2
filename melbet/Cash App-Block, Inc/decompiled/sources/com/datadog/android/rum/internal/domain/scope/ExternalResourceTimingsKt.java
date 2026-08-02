package com.datadog.android.rum.internal.domain.scope;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public abstract class ExternalResourceTimingsKt {
    public static final List ALL_TIMINGS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"firstByte", "download", "ssl", "connect", "dns"});
}

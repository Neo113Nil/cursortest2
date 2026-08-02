package com.lyft.kronos;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public abstract class DefaultParam {
    public static final List NTP_HOSTS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org"});
    public static final long TIMEOUT_MS = 6000;
    public static final long MAX_NTP_RESPONSE_TIME_MS = 5000;
}

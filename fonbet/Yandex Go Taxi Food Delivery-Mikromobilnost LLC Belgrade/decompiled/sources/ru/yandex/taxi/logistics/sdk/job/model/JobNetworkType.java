package ru.yandex.taxi.logistics.sdk.job.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/job/model/JobNetworkType;", "", "CONNECTED", "ANY", "sdk-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JobNetworkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ JobNetworkType[] $VALUES;
    public static final JobNetworkType ANY;
    public static final JobNetworkType CONNECTED;

    static {
        JobNetworkType jobNetworkType = new JobNetworkType("CONNECTED", 0);
        CONNECTED = jobNetworkType;
        JobNetworkType jobNetworkType2 = new JobNetworkType("ANY", 1);
        ANY = jobNetworkType2;
        JobNetworkType[] jobNetworkTypeArr = {jobNetworkType, jobNetworkType2};
        $VALUES = jobNetworkTypeArr;
        $ENTRIES = a.a(jobNetworkTypeArr);
    }

    public static JobNetworkType valueOf(String str) {
        return (JobNetworkType) Enum.valueOf(JobNetworkType.class, str);
    }

    public static JobNetworkType[] values() {
        return (JobNetworkType[]) $VALUES.clone();
    }
}

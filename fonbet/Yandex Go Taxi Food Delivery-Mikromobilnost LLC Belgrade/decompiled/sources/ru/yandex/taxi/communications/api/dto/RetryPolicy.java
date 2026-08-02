package ru.yandex.taxi.communications.api.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/communications/api/dto/RetryPolicy;", "", "DEFAULT", "SINGLE_ATTEMPT", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RetryPolicy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RetryPolicy[] $VALUES;
    public static final RetryPolicy DEFAULT;
    public static final RetryPolicy SINGLE_ATTEMPT;

    static {
        RetryPolicy retryPolicy = new RetryPolicy("DEFAULT", 0);
        DEFAULT = retryPolicy;
        RetryPolicy retryPolicy2 = new RetryPolicy("SINGLE_ATTEMPT", 1);
        SINGLE_ATTEMPT = retryPolicy2;
        RetryPolicy[] retryPolicyArr = {retryPolicy, retryPolicy2};
        $VALUES = retryPolicyArr;
        $ENTRIES = kotlin.enums.a.a(retryPolicyArr);
    }

    public static RetryPolicy valueOf(String str) {
        return (RetryPolicy) Enum.valueOf(RetryPolicy.class, str);
    }

    public static RetryPolicy[] values() {
        return (RetryPolicy[]) $VALUES.clone();
    }
}

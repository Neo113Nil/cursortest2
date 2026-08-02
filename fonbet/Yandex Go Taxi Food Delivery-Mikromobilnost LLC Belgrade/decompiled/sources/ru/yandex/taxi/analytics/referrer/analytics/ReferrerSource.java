package ru.yandex.taxi.analytics.referrer.analytics;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/analytics/referrer/analytics/ReferrerSource;", "", "", "source", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "GOOGLE", "BROADCAST_RECEIVER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReferrerSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReferrerSource[] $VALUES;
    public static final ReferrerSource BROADCAST_RECEIVER;
    public static final ReferrerSource GOOGLE;
    private final String source;

    static {
        ReferrerSource referrerSource = new ReferrerSource("GOOGLE", 0, Constants.REFERRER_API_GOOGLE);
        GOOGLE = referrerSource;
        ReferrerSource referrerSource2 = new ReferrerSource("BROADCAST_RECEIVER", 1, "broadcast_receiver");
        BROADCAST_RECEIVER = referrerSource2;
        ReferrerSource[] referrerSourceArr = {referrerSource, referrerSource2};
        $VALUES = referrerSourceArr;
        $ENTRIES = a.a(referrerSourceArr);
    }

    public ReferrerSource(String str, int i, String str2) {
        this.source = str2;
    }

    public static ReferrerSource valueOf(String str) {
        return (ReferrerSource) Enum.valueOf(ReferrerSource.class, str);
    }

    public static ReferrerSource[] values() {
        return (ReferrerSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getSource() {
        return this.source;
    }
}

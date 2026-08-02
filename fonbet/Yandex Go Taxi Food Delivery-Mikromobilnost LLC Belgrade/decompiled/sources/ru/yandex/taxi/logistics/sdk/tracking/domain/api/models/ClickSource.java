package ru.yandex.taxi.logistics.sdk.tracking.domain.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/domain/api/models/ClickSource;", "", "ACTIONS_BLOCK", "DYNAMIC_CONTENT_BLOCK", "domain"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClickSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClickSource[] $VALUES;
    public static final ClickSource ACTIONS_BLOCK;
    public static final ClickSource DYNAMIC_CONTENT_BLOCK;

    static {
        ClickSource clickSource = new ClickSource("ACTIONS_BLOCK", 0);
        ACTIONS_BLOCK = clickSource;
        ClickSource clickSource2 = new ClickSource("DYNAMIC_CONTENT_BLOCK", 1);
        DYNAMIC_CONTENT_BLOCK = clickSource2;
        ClickSource[] clickSourceArr = {clickSource, clickSource2};
        $VALUES = clickSourceArr;
        $ENTRIES = a.a(clickSourceArr);
    }

    public static ClickSource valueOf(String str) {
        return (ClickSource) Enum.valueOf(ClickSource.class, str);
    }

    public static ClickSource[] values() {
        return (ClickSource[]) $VALUES.clone();
    }
}

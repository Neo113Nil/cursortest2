package ru.yandex.sdk.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/sdk/common/StopWordRule$RuleType", "", "Lru/yandex/sdk/common/StopWordRule$RuleType;", "PREFIX", "SUBSTRING", "WORD", "common"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StopWordRule$RuleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StopWordRule$RuleType[] $VALUES;
    public static final StopWordRule$RuleType PREFIX;
    public static final StopWordRule$RuleType SUBSTRING;
    public static final StopWordRule$RuleType WORD;

    static {
        StopWordRule$RuleType stopWordRule$RuleType = new StopWordRule$RuleType("PREFIX", 0);
        PREFIX = stopWordRule$RuleType;
        StopWordRule$RuleType stopWordRule$RuleType2 = new StopWordRule$RuleType("SUBSTRING", 1);
        SUBSTRING = stopWordRule$RuleType2;
        StopWordRule$RuleType stopWordRule$RuleType3 = new StopWordRule$RuleType("WORD", 2);
        WORD = stopWordRule$RuleType3;
        StopWordRule$RuleType[] stopWordRule$RuleTypeArr = {stopWordRule$RuleType, stopWordRule$RuleType2, stopWordRule$RuleType3};
        $VALUES = stopWordRule$RuleTypeArr;
        $ENTRIES = a.a(stopWordRule$RuleTypeArr);
    }

    public static StopWordRule$RuleType valueOf(String str) {
        return (StopWordRule$RuleType) Enum.valueOf(StopWordRule$RuleType.class, str);
    }

    public static StopWordRule$RuleType[] values() {
        return (StopWordRule$RuleType[]) $VALUES.clone();
    }
}

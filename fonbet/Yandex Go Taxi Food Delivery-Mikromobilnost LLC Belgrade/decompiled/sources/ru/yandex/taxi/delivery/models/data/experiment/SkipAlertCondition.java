package ru.yandex.taxi.delivery.models.data.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.s7s0;
import defpackage.tms0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/delivery/models/data/experiment/SkipAlertCondition;", "", "Companion", "tms0", "REQUIREMENT_NOT_SELECTED", "NEVER", "ALWAYS", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SkipAlertCondition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SkipAlertCondition[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SkipAlertCondition ALWAYS;
    public static final tms0 Companion;
    public static final SkipAlertCondition NEVER;
    public static final SkipAlertCondition REQUIREMENT_NOT_SELECTED;

    static {
        SkipAlertCondition skipAlertCondition = new SkipAlertCondition("REQUIREMENT_NOT_SELECTED", 0);
        REQUIREMENT_NOT_SELECTED = skipAlertCondition;
        SkipAlertCondition skipAlertCondition2 = new SkipAlertCondition("NEVER", 1);
        NEVER = skipAlertCondition2;
        SkipAlertCondition skipAlertCondition3 = new SkipAlertCondition("ALWAYS", 2);
        ALWAYS = skipAlertCondition3;
        SkipAlertCondition[] skipAlertConditionArr = {skipAlertCondition, skipAlertCondition2, skipAlertCondition3};
        $VALUES = skipAlertConditionArr;
        $ENTRIES = a.a(skipAlertConditionArr);
        Companion = new tms0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s7s0(5));
    }

    public static SkipAlertCondition valueOf(String str) {
        return (SkipAlertCondition) Enum.valueOf(SkipAlertCondition.class, str);
    }

    public static SkipAlertCondition[] values() {
        return (SkipAlertCondition[]) $VALUES.clone();
    }
}

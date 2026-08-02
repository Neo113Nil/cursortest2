package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/locationsdk/processor_on_jump_or_divergence/OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition", "", "Lru/yandex/taxi/locationsdk/processor_on_jump_or_divergence/OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition;", "Always", "OnSelection", "OnSelectionAndWhenReferenceAppears", "processor-on-jump-or-divergence"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition[] $VALUES;
    public static final OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition Always;
    public static final OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition OnSelection;
    public static final OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition OnSelectionAndWhenReferenceAppears;

    static {
        OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition = new OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition("Always", 0);
        Always = onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition;
        OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition2 = new OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition("OnSelection", 1);
        OnSelection = onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition2;
        OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition3 = new OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition("OnSelectionAndWhenReferenceAppears", 2);
        OnSelectionAndWhenReferenceAppears = onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition3;
        OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition[] onJumpOrDivergenceProcessorConfig$ReferenceMatchingConditionArr = {onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition, onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition2, onJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition3};
        $VALUES = onJumpOrDivergenceProcessorConfig$ReferenceMatchingConditionArr;
        $ENTRIES = a.a(onJumpOrDivergenceProcessorConfig$ReferenceMatchingConditionArr);
    }

    public static OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition valueOf(String str) {
        return (OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition) Enum.valueOf(OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition.class, str);
    }

    public static OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition[] values() {
        return (OnJumpOrDivergenceProcessorConfig$ReferenceMatchingCondition[]) $VALUES.clone();
    }
}

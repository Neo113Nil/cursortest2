package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/ScenarioSelectorState;", "", "COLLAPSED", "EXPANDED", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScenarioSelectorState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScenarioSelectorState[] $VALUES;
    public static final ScenarioSelectorState COLLAPSED;
    public static final ScenarioSelectorState EXPANDED;

    static {
        ScenarioSelectorState scenarioSelectorState = new ScenarioSelectorState("COLLAPSED", 0);
        COLLAPSED = scenarioSelectorState;
        ScenarioSelectorState scenarioSelectorState2 = new ScenarioSelectorState("EXPANDED", 1);
        EXPANDED = scenarioSelectorState2;
        ScenarioSelectorState[] scenarioSelectorStateArr = {scenarioSelectorState, scenarioSelectorState2};
        $VALUES = scenarioSelectorStateArr;
        $ENTRIES = a.a(scenarioSelectorStateArr);
    }

    public static ScenarioSelectorState valueOf(String str) {
        return (ScenarioSelectorState) Enum.valueOf(ScenarioSelectorState.class, str);
    }

    public static ScenarioSelectorState[] values() {
        return (ScenarioSelectorState[]) $VALUES.clone();
    }
}

package com.datadog.android.internal.attributes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ViewScopeInstrumentationType {
    public static final /* synthetic */ ViewScopeInstrumentationType[] $VALUES = {new ViewScopeInstrumentationType("MANUAL", 0), new ViewScopeInstrumentationType("COMPOSE", 1), new ViewScopeInstrumentationType("ACTIVITY", 2), new ViewScopeInstrumentationType("FRAGMENT", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ViewScopeInstrumentationType EF5;

    public static ViewScopeInstrumentationType valueOf(String str) {
        return (ViewScopeInstrumentationType) Enum.valueOf(ViewScopeInstrumentationType.class, str);
    }

    public static ViewScopeInstrumentationType[] values() {
        return (ViewScopeInstrumentationType[]) $VALUES.clone();
    }
}

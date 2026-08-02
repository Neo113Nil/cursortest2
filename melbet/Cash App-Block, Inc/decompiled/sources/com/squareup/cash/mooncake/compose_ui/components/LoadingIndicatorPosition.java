package com.squareup.cash.mooncake.compose_ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class LoadingIndicatorPosition {
    public static final /* synthetic */ LoadingIndicatorPosition[] $VALUES;
    public static final LoadingIndicatorPosition CENTER;

    /* JADX INFO: Fake field, exist only in values array */
    LoadingIndicatorPosition EF0;

    static {
        LoadingIndicatorPosition loadingIndicatorPosition = new LoadingIndicatorPosition("TOP_START", 0);
        LoadingIndicatorPosition loadingIndicatorPosition2 = new LoadingIndicatorPosition("CENTER", 1);
        CENTER = loadingIndicatorPosition2;
        $VALUES = new LoadingIndicatorPosition[]{loadingIndicatorPosition, loadingIndicatorPosition2};
    }

    public static LoadingIndicatorPosition valueOf(String str) {
        return (LoadingIndicatorPosition) Enum.valueOf(LoadingIndicatorPosition.class, str);
    }

    public static LoadingIndicatorPosition[] values() {
        return (LoadingIndicatorPosition[]) $VALUES.clone();
    }
}

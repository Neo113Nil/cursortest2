package com.squareup.cash.account.settings.viewmodels;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ViewMode {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ ViewMode[] $VALUES;
    public static final ViewMode EDIT;

    static {
        ViewMode viewMode = new ViewMode("EDIT", 0);
        EDIT = viewMode;
        ViewMode[] viewModeArr = {viewMode, new ViewMode("PREVIEW", 1)};
        $VALUES = viewModeArr;
        $ENTRIES = new EnumEntriesList(viewModeArr);
    }

    public static ViewMode valueOf(String str) {
        return (ViewMode) Enum.valueOf(ViewMode.class, str);
    }

    public static ViewMode[] values() {
        return (ViewMode[]) $VALUES.clone();
    }
}

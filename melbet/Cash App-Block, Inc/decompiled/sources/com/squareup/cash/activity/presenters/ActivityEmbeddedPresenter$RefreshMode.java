package com.squareup.cash.activity.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ActivityEmbeddedPresenter$RefreshMode {
    public static final /* synthetic */ ActivityEmbeddedPresenter$RefreshMode[] $VALUES;
    public static final ActivityEmbeddedPresenter$RefreshMode AlwaysOnBack;
    public static final ActivityEmbeddedPresenter$RefreshMode FirstLoadOnly;
    public static final ActivityEmbeddedPresenter$RefreshMode Never;

    static {
        ActivityEmbeddedPresenter$RefreshMode activityEmbeddedPresenter$RefreshMode = new ActivityEmbeddedPresenter$RefreshMode("Never", 0);
        Never = activityEmbeddedPresenter$RefreshMode;
        ActivityEmbeddedPresenter$RefreshMode activityEmbeddedPresenter$RefreshMode2 = new ActivityEmbeddedPresenter$RefreshMode("FirstLoadOnly", 1);
        FirstLoadOnly = activityEmbeddedPresenter$RefreshMode2;
        ActivityEmbeddedPresenter$RefreshMode activityEmbeddedPresenter$RefreshMode3 = new ActivityEmbeddedPresenter$RefreshMode("AlwaysOnBack", 2);
        AlwaysOnBack = activityEmbeddedPresenter$RefreshMode3;
        $VALUES = new ActivityEmbeddedPresenter$RefreshMode[]{activityEmbeddedPresenter$RefreshMode, activityEmbeddedPresenter$RefreshMode2, activityEmbeddedPresenter$RefreshMode3};
    }

    public static ActivityEmbeddedPresenter$RefreshMode valueOf(String str) {
        return (ActivityEmbeddedPresenter$RefreshMode) Enum.valueOf(ActivityEmbeddedPresenter$RefreshMode.class, str);
    }

    public static ActivityEmbeddedPresenter$RefreshMode[] values() {
        return (ActivityEmbeddedPresenter$RefreshMode[]) $VALUES.clone();
    }
}

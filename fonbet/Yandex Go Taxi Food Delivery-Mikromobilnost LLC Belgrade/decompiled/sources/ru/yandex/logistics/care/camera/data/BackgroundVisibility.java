package ru.yandex.logistics.care.camera.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/logistics/care/camera/data/BackgroundVisibility;", "", "Visible", "Hidden", "None", "sdk-care-camera"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BackgroundVisibility {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BackgroundVisibility[] $VALUES;
    public static final BackgroundVisibility Hidden;
    public static final BackgroundVisibility None;
    public static final BackgroundVisibility Visible;

    static {
        BackgroundVisibility backgroundVisibility = new BackgroundVisibility("Visible", 0);
        Visible = backgroundVisibility;
        BackgroundVisibility backgroundVisibility2 = new BackgroundVisibility("Hidden", 1);
        Hidden = backgroundVisibility2;
        BackgroundVisibility backgroundVisibility3 = new BackgroundVisibility("None", 2);
        None = backgroundVisibility3;
        BackgroundVisibility[] backgroundVisibilityArr = {backgroundVisibility, backgroundVisibility2, backgroundVisibility3};
        $VALUES = backgroundVisibilityArr;
        $ENTRIES = a.a(backgroundVisibilityArr);
    }

    public static BackgroundVisibility valueOf(String str) {
        return (BackgroundVisibility) Enum.valueOf(BackgroundVisibility.class, str);
    }

    public static BackgroundVisibility[] values() {
        return (BackgroundVisibility[]) $VALUES.clone();
    }
}

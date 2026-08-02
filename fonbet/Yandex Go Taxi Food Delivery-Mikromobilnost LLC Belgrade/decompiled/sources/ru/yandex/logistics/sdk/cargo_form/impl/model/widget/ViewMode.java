package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/ViewMode;", "", "ROW", "BOX", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ViewMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ViewMode[] $VALUES;
    public static final ViewMode BOX;
    public static final ViewMode ROW;

    static {
        ViewMode viewMode = new ViewMode("ROW", 0);
        ROW = viewMode;
        ViewMode viewMode2 = new ViewMode("BOX", 1);
        BOX = viewMode2;
        ViewMode[] viewModeArr = {viewMode, viewMode2};
        $VALUES = viewModeArr;
        $ENTRIES = a.a(viewModeArr);
    }

    public static ViewMode valueOf(String str) {
        return (ViewMode) Enum.valueOf(ViewMode.class, str);
    }

    public static ViewMode[] values() {
        return (ViewMode[]) $VALUES.clone();
    }
}

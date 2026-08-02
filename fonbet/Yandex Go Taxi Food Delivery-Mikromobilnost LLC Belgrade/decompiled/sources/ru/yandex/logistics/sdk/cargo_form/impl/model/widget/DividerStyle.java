package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/DividerStyle;", "", "GROUP_TITLE", "LINE", "LINE_MARGIN", "LINE_SLOT", "LINE_SLOT_MARGIN", "FOCUS", "FOCUS_MARGIN", "SPACER", "GROUP_SEPARATE_TITLES", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DividerStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DividerStyle[] $VALUES;
    public static final DividerStyle FOCUS;
    public static final DividerStyle FOCUS_MARGIN;
    public static final DividerStyle GROUP_SEPARATE_TITLES;
    public static final DividerStyle GROUP_TITLE;
    public static final DividerStyle LINE;
    public static final DividerStyle LINE_MARGIN;
    public static final DividerStyle LINE_SLOT;
    public static final DividerStyle LINE_SLOT_MARGIN;
    public static final DividerStyle SPACER;

    static {
        DividerStyle dividerStyle = new DividerStyle("GROUP_TITLE", 0);
        GROUP_TITLE = dividerStyle;
        DividerStyle dividerStyle2 = new DividerStyle("LINE", 1);
        LINE = dividerStyle2;
        DividerStyle dividerStyle3 = new DividerStyle("LINE_MARGIN", 2);
        LINE_MARGIN = dividerStyle3;
        DividerStyle dividerStyle4 = new DividerStyle("LINE_SLOT", 3);
        LINE_SLOT = dividerStyle4;
        DividerStyle dividerStyle5 = new DividerStyle("LINE_SLOT_MARGIN", 4);
        LINE_SLOT_MARGIN = dividerStyle5;
        DividerStyle dividerStyle6 = new DividerStyle("FOCUS", 5);
        FOCUS = dividerStyle6;
        DividerStyle dividerStyle7 = new DividerStyle("FOCUS_MARGIN", 6);
        FOCUS_MARGIN = dividerStyle7;
        DividerStyle dividerStyle8 = new DividerStyle("SPACER", 7);
        SPACER = dividerStyle8;
        DividerStyle dividerStyle9 = new DividerStyle("GROUP_SEPARATE_TITLES", 8);
        GROUP_SEPARATE_TITLES = dividerStyle9;
        DividerStyle[] dividerStyleArr = {dividerStyle, dividerStyle2, dividerStyle3, dividerStyle4, dividerStyle5, dividerStyle6, dividerStyle7, dividerStyle8, dividerStyle9};
        $VALUES = dividerStyleArr;
        $ENTRIES = a.a(dividerStyleArr);
    }

    public static DividerStyle valueOf(String str) {
        return (DividerStyle) Enum.valueOf(DividerStyle.class, str);
    }

    public static DividerStyle[] values() {
        return (DividerStyle[]) $VALUES.clone();
    }
}

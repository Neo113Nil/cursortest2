package ru.yandex.taxi.surge.models.dto;

import defpackage.bhw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.mow0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/surge/models/dto/SurgeButtonActionDto$ActionButtonStyle", "", "Lru/yandex/taxi/surge/models/dto/SurgeButtonActionDto$ActionButtonStyle;", "Companion", "mow0", "DEFAULT", "ACCENT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurgeButtonActionDto$ActionButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SurgeButtonActionDto$ActionButtonStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final SurgeButtonActionDto$ActionButtonStyle ACCENT;
    public static final mow0 Companion;
    public static final SurgeButtonActionDto$ActionButtonStyle DEFAULT;

    static {
        SurgeButtonActionDto$ActionButtonStyle surgeButtonActionDto$ActionButtonStyle = new SurgeButtonActionDto$ActionButtonStyle("DEFAULT", 0);
        DEFAULT = surgeButtonActionDto$ActionButtonStyle;
        SurgeButtonActionDto$ActionButtonStyle surgeButtonActionDto$ActionButtonStyle2 = new SurgeButtonActionDto$ActionButtonStyle("ACCENT", 1);
        ACCENT = surgeButtonActionDto$ActionButtonStyle2;
        SurgeButtonActionDto$ActionButtonStyle[] surgeButtonActionDto$ActionButtonStyleArr = {surgeButtonActionDto$ActionButtonStyle, surgeButtonActionDto$ActionButtonStyle2};
        $VALUES = surgeButtonActionDto$ActionButtonStyleArr;
        $ENTRIES = kotlin.enums.a.a(surgeButtonActionDto$ActionButtonStyleArr);
        Companion = new mow0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(6));
    }

    public static SurgeButtonActionDto$ActionButtonStyle valueOf(String str) {
        return (SurgeButtonActionDto$ActionButtonStyle) Enum.valueOf(SurgeButtonActionDto$ActionButtonStyle.class, str);
    }

    public static SurgeButtonActionDto$ActionButtonStyle[] values() {
        return (SurgeButtonActionDto$ActionButtonStyle[]) $VALUES.clone();
    }
}

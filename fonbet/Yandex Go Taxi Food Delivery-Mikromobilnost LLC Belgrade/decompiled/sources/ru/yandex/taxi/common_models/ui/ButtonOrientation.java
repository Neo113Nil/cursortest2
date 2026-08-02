package ru.yandex.taxi.common_models.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/common_models/ui/ButtonOrientation;", "", "HORIZONTAL", "VERTICAL", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonOrientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonOrientation[] $VALUES;
    public static final ButtonOrientation HORIZONTAL;
    public static final ButtonOrientation VERTICAL;

    static {
        ButtonOrientation buttonOrientation = new ButtonOrientation("HORIZONTAL", 0);
        HORIZONTAL = buttonOrientation;
        ButtonOrientation buttonOrientation2 = new ButtonOrientation("VERTICAL", 1);
        VERTICAL = buttonOrientation2;
        ButtonOrientation[] buttonOrientationArr = {buttonOrientation, buttonOrientation2};
        $VALUES = buttonOrientationArr;
        $ENTRIES = a.a(buttonOrientationArr);
    }

    public static ButtonOrientation valueOf(String str) {
        return (ButtonOrientation) Enum.valueOf(ButtonOrientation.class, str);
    }

    public static ButtonOrientation[] values() {
        return (ButtonOrientation[]) $VALUES.clone();
    }
}

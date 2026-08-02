package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/ButtonSize;", "", "XS", "S", "M", "L", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonSize {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonSize[] $VALUES;
    public static final ButtonSize L;
    public static final ButtonSize M;
    public static final ButtonSize S;
    public static final ButtonSize XS;

    static {
        ButtonSize buttonSize = new ButtonSize("XS", 0);
        XS = buttonSize;
        ButtonSize buttonSize2 = new ButtonSize("S", 1);
        S = buttonSize2;
        ButtonSize buttonSize3 = new ButtonSize("M", 2);
        M = buttonSize3;
        ButtonSize buttonSize4 = new ButtonSize("L", 3);
        L = buttonSize4;
        ButtonSize[] buttonSizeArr = {buttonSize, buttonSize2, buttonSize3, buttonSize4};
        $VALUES = buttonSizeArr;
        $ENTRIES = a.a(buttonSizeArr);
    }

    public static ButtonSize valueOf(String str) {
        return (ButtonSize) Enum.valueOf(ButtonSize.class, str);
    }

    public static ButtonSize[] values() {
        return (ButtonSize[]) $VALUES.clone();
    }
}

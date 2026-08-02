package ru.yandex.taxi.tariffs.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/tariffs/model/ButtonStyleModel;", "", "MAIN", "MINOR", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonStyleModel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonStyleModel[] $VALUES;
    public static final ButtonStyleModel MAIN;
    public static final ButtonStyleModel MINOR;

    static {
        ButtonStyleModel buttonStyleModel = new ButtonStyleModel("MAIN", 0);
        MAIN = buttonStyleModel;
        ButtonStyleModel buttonStyleModel2 = new ButtonStyleModel("MINOR", 1);
        MINOR = buttonStyleModel2;
        ButtonStyleModel[] buttonStyleModelArr = {buttonStyleModel, buttonStyleModel2};
        $VALUES = buttonStyleModelArr;
        $ENTRIES = kotlin.enums.a.a(buttonStyleModelArr);
    }

    public static ButtonStyleModel valueOf(String str) {
        return (ButtonStyleModel) Enum.valueOf(ButtonStyleModel.class, str);
    }

    public static ButtonStyleModel[] values() {
        return (ButtonStyleModel[]) $VALUES.clone();
    }
}

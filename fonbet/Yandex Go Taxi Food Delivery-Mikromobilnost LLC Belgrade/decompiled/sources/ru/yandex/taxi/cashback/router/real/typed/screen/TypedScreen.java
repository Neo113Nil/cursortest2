package ru.yandex.taxi.cashback.router.real.typed.screen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/cashback/router/real/typed/screen/TypedScreen;", "", "PLUS_BURNS", "CATCHING_UP_CASHBACK", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TypedScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TypedScreen[] $VALUES;
    public static final TypedScreen CATCHING_UP_CASHBACK;
    public static final TypedScreen PLUS_BURNS;

    static {
        TypedScreen typedScreen = new TypedScreen("PLUS_BURNS", 0);
        PLUS_BURNS = typedScreen;
        TypedScreen typedScreen2 = new TypedScreen("CATCHING_UP_CASHBACK", 1);
        CATCHING_UP_CASHBACK = typedScreen2;
        TypedScreen[] typedScreenArr = {typedScreen, typedScreen2};
        $VALUES = typedScreenArr;
        $ENTRIES = a.a(typedScreenArr);
    }

    public static TypedScreen valueOf(String str) {
        return (TypedScreen) Enum.valueOf(TypedScreen.class, str);
    }

    public static TypedScreen[] values() {
        return (TypedScreen[]) $VALUES.clone();
    }
}

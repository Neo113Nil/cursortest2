package ru.yandex.taxi.locationsdk.core.priority;

import defpackage.k4o;
import defpackage.p0w;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/locationsdk/core/priority/InputSourcePriority$Active", "Lp0w;", "", "Lru/yandex/taxi/locationsdk/core/priority/InputSourcePriority$Active;", "Low", "Normal", "core2"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputSourcePriority$Active implements p0w {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InputSourcePriority$Active[] $VALUES;
    public static final InputSourcePriority$Active Low;
    public static final InputSourcePriority$Active Normal;

    static {
        InputSourcePriority$Active inputSourcePriority$Active = new InputSourcePriority$Active("Low", 0);
        Low = inputSourcePriority$Active;
        InputSourcePriority$Active inputSourcePriority$Active2 = new InputSourcePriority$Active("Normal", 1);
        Normal = inputSourcePriority$Active2;
        InputSourcePriority$Active[] inputSourcePriority$ActiveArr = {inputSourcePriority$Active, inputSourcePriority$Active2};
        $VALUES = inputSourcePriority$ActiveArr;
        $ENTRIES = a.a(inputSourcePriority$ActiveArr);
    }

    public static InputSourcePriority$Active valueOf(String str) {
        return (InputSourcePriority$Active) Enum.valueOf(InputSourcePriority$Active.class, str);
    }

    public static InputSourcePriority$Active[] values() {
        return (InputSourcePriority$Active[]) $VALUES.clone();
    }
}

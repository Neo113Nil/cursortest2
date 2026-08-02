package ru.yandex.taxi.order.map.controller.internal;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/order/map/controller/internal/Command$CommandType", "", "Lru/yandex/taxi/order/map/controller/internal/Command$CommandType;", "Add", "Remove", "Update", "nearestdrivers"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Command$CommandType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Command$CommandType[] $VALUES;
    public static final Command$CommandType Add;
    public static final Command$CommandType Remove;
    public static final Command$CommandType Update;

    static {
        Command$CommandType command$CommandType = new Command$CommandType("Add", 0);
        Add = command$CommandType;
        Command$CommandType command$CommandType2 = new Command$CommandType("Remove", 1);
        Remove = command$CommandType2;
        Command$CommandType command$CommandType3 = new Command$CommandType("Update", 2);
        Update = command$CommandType3;
        Command$CommandType[] command$CommandTypeArr = {command$CommandType, command$CommandType2, command$CommandType3};
        $VALUES = command$CommandTypeArr;
        $ENTRIES = kotlin.enums.a.a(command$CommandTypeArr);
    }

    public static Command$CommandType valueOf(String str) {
        return (Command$CommandType) Enum.valueOf(Command$CommandType.class, str);
    }

    public static Command$CommandType[] values() {
        return (Command$CommandType[]) $VALUES.clone();
    }
}

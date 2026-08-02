package ru.yandex.taxi.scooters.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.m3e;
import defpackage.rle;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/data/model/ControlAction;", "", "Companion", "rle", "OPEN_LOCK", "WHERE_IS", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ControlAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ControlAction[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final rle Companion;
    public static final ControlAction OPEN_LOCK;
    public static final ControlAction WHERE_IS;

    static {
        ControlAction controlAction = new ControlAction("OPEN_LOCK", 0);
        OPEN_LOCK = controlAction;
        ControlAction controlAction2 = new ControlAction("WHERE_IS", 1);
        WHERE_IS = controlAction2;
        ControlAction[] controlActionArr = {controlAction, controlAction2};
        $VALUES = controlActionArr;
        $ENTRIES = a.a(controlActionArr);
        Companion = new rle();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(15));
    }

    public static ControlAction valueOf(String str) {
        return (ControlAction) Enum.valueOf(ControlAction.class, str);
    }

    public static ControlAction[] values() {
        return (ControlAction[]) $VALUES.clone();
    }
}

package ru.yandex.taxi.common_models.net.map_object;

import defpackage.cdx;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ie11;
import defpackage.k4o;
import defpackage.z411;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/Trigger;", "", "Companion", "ie11", "SELECT", "TAP", "DRAG", "SHOW", "UNKNOWN", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Trigger {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Trigger[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ie11 Companion;
    public static final Trigger DRAG;

    @cdx(names = {"choose"})
    public static final Trigger SELECT;
    public static final Trigger SHOW;
    public static final Trigger TAP;
    public static final Trigger UNKNOWN;

    static {
        Trigger trigger = new Trigger("SELECT", 0);
        SELECT = trigger;
        Trigger trigger2 = new Trigger("TAP", 1);
        TAP = trigger2;
        Trigger trigger3 = new Trigger("DRAG", 2);
        DRAG = trigger3;
        Trigger trigger4 = new Trigger("SHOW", 3);
        SHOW = trigger4;
        Trigger trigger5 = new Trigger("UNKNOWN", 4);
        UNKNOWN = trigger5;
        Trigger[] triggerArr = {trigger, trigger2, trigger3, trigger4, trigger5};
        $VALUES = triggerArr;
        $ENTRIES = kotlin.enums.a.a(triggerArr);
        Companion = new ie11();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z411(22));
    }

    public static Trigger valueOf(String str) {
        return (Trigger) Enum.valueOf(Trigger.class, str);
    }

    public static Trigger[] values() {
        return (Trigger[]) $VALUES.clone();
    }
}

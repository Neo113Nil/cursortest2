package ru.yandex.taxi.settings.api.dto.settings.types;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iwq0;
import defpackage.k4o;
import defpackage.k4r0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/settings/api/dto/settings/types/SetSettingType;", "", "Companion", "k4r0", "PUSH_SETTINGS", JCP.RAW_PREFIX, "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetSettingType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SetSettingType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final k4r0 Companion;
    public static final SetSettingType NONE;
    public static final SetSettingType PUSH_SETTINGS;

    static {
        SetSettingType setSettingType = new SetSettingType("PUSH_SETTINGS", 0);
        PUSH_SETTINGS = setSettingType;
        SetSettingType setSettingType2 = new SetSettingType(JCP.RAW_PREFIX, 1);
        NONE = setSettingType2;
        SetSettingType[] setSettingTypeArr = {setSettingType, setSettingType2};
        $VALUES = setSettingTypeArr;
        $ENTRIES = a.a(setSettingTypeArr);
        Companion = new k4r0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(15));
    }

    public static SetSettingType valueOf(String str) {
        return (SetSettingType) Enum.valueOf(SetSettingType.class, str);
    }

    public static SetSettingType[] values() {
        return (SetSettingType[]) $VALUES.clone();
    }
}

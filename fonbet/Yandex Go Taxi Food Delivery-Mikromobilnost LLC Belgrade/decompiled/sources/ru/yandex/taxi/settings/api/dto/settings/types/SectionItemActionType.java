package ru.yandex.taxi.settings.api.dto.settings.types;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.p1q0;
import defpackage.w0q0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/settings/api/dto/settings/types/SectionItemActionType;", "", "Companion", "p1q0", "SETTING", JCP.RAW_PREFIX, "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SectionItemActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SectionItemActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final p1q0 Companion;
    public static final SectionItemActionType NONE;
    public static final SectionItemActionType SETTING;

    static {
        SectionItemActionType sectionItemActionType = new SectionItemActionType("SETTING", 0);
        SETTING = sectionItemActionType;
        SectionItemActionType sectionItemActionType2 = new SectionItemActionType(JCP.RAW_PREFIX, 1);
        NONE = sectionItemActionType2;
        SectionItemActionType[] sectionItemActionTypeArr = {sectionItemActionType, sectionItemActionType2};
        $VALUES = sectionItemActionTypeArr;
        $ENTRIES = a.a(sectionItemActionTypeArr);
        Companion = new p1q0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(2));
    }

    public static SectionItemActionType valueOf(String str) {
        return (SectionItemActionType) Enum.valueOf(SectionItemActionType.class, str);
    }

    public static SectionItemActionType[] values() {
        return (SectionItemActionType[]) $VALUES.clone();
    }
}

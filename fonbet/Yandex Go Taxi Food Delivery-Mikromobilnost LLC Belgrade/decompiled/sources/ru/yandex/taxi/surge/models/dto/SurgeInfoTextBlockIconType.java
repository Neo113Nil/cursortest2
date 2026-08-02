package ru.yandex.taxi.surge.models.dto;

import defpackage.bhw0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.ztw0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/surge/models/dto/SurgeInfoTextBlockIconType;", "", "Companion", "ztw0", "ROTATE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurgeInfoTextBlockIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SurgeInfoTextBlockIconType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final ztw0 Companion;
    public static final SurgeInfoTextBlockIconType ROTATE;

    static {
        SurgeInfoTextBlockIconType surgeInfoTextBlockIconType = new SurgeInfoTextBlockIconType("ROTATE", 0);
        ROTATE = surgeInfoTextBlockIconType;
        SurgeInfoTextBlockIconType[] surgeInfoTextBlockIconTypeArr = {surgeInfoTextBlockIconType};
        $VALUES = surgeInfoTextBlockIconTypeArr;
        $ENTRIES = kotlin.enums.a.a(surgeInfoTextBlockIconTypeArr);
        Companion = new ztw0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(26));
    }

    public static SurgeInfoTextBlockIconType valueOf(String str) {
        return (SurgeInfoTextBlockIconType) Enum.valueOf(SurgeInfoTextBlockIconType.class, str);
    }

    public static SurgeInfoTextBlockIconType[] values() {
        return (SurgeInfoTextBlockIconType[]) $VALUES.clone();
    }
}

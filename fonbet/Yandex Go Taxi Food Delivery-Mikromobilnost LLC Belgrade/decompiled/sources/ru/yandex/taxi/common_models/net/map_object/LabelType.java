package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.vix;
import defpackage.yqx;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/LabelType;", "", "Companion", "yqx", "LAST", "DEFAULT", "ZONE_POINT", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LabelType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LabelType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final yqx Companion;
    public static final LabelType DEFAULT;
    public static final LabelType LAST;
    public static final LabelType ZONE_POINT;

    static {
        LabelType labelType = new LabelType("LAST", 0);
        LAST = labelType;
        LabelType labelType2 = new LabelType("DEFAULT", 1);
        DEFAULT = labelType2;
        LabelType labelType3 = new LabelType("ZONE_POINT", 2);
        ZONE_POINT = labelType3;
        LabelType[] labelTypeArr = {labelType, labelType2, labelType3};
        $VALUES = labelTypeArr;
        $ENTRIES = kotlin.enums.a.a(labelTypeArr);
        Companion = new yqx();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vix(10));
    }

    public static LabelType valueOf(String str) {
        return (LabelType) Enum.valueOf(LabelType.class, str);
    }

    public static LabelType[] values() {
        return (LabelType[]) $VALUES.clone();
    }
}

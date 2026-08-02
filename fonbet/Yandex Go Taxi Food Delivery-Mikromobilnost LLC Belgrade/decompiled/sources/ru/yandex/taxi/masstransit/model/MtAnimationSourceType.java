package ru.yandex.taxi.masstransit.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/model/MtAnimationSourceType;", "", "UNKNOWN_SOURCE", "LOTTIE_ANIMATION", "STATIC_IMAGE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtAnimationSourceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtAnimationSourceType[] $VALUES;
    public static final MtAnimationSourceType LOTTIE_ANIMATION;
    public static final MtAnimationSourceType STATIC_IMAGE;
    public static final MtAnimationSourceType UNKNOWN_SOURCE;

    static {
        MtAnimationSourceType mtAnimationSourceType = new MtAnimationSourceType("UNKNOWN_SOURCE", 0);
        UNKNOWN_SOURCE = mtAnimationSourceType;
        MtAnimationSourceType mtAnimationSourceType2 = new MtAnimationSourceType("LOTTIE_ANIMATION", 1);
        LOTTIE_ANIMATION = mtAnimationSourceType2;
        MtAnimationSourceType mtAnimationSourceType3 = new MtAnimationSourceType("STATIC_IMAGE", 2);
        STATIC_IMAGE = mtAnimationSourceType3;
        MtAnimationSourceType[] mtAnimationSourceTypeArr = {mtAnimationSourceType, mtAnimationSourceType2, mtAnimationSourceType3};
        $VALUES = mtAnimationSourceTypeArr;
        $ENTRIES = kotlin.enums.a.a(mtAnimationSourceTypeArr);
    }

    public static MtAnimationSourceType valueOf(String str) {
        return (MtAnimationSourceType) Enum.valueOf(MtAnimationSourceType.class, str);
    }

    public static MtAnimationSourceType[] values() {
        return (MtAnimationSourceType[]) $VALUES.clone();
    }
}

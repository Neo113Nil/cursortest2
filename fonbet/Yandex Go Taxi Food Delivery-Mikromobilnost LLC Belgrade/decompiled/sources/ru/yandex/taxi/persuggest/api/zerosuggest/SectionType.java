package ru.yandex.taxi.persuggest.api.zerosuggest;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/persuggest/api/zerosuggest/SectionType;", "", "LINES_SECTION", "UNKNOWN", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SectionType[] $VALUES;
    public static final SectionType LINES_SECTION;
    public static final SectionType UNKNOWN;

    static {
        SectionType sectionType = new SectionType("LINES_SECTION", 0);
        LINES_SECTION = sectionType;
        SectionType sectionType2 = new SectionType("UNKNOWN", 1);
        UNKNOWN = sectionType2;
        SectionType[] sectionTypeArr = {sectionType, sectionType2};
        $VALUES = sectionTypeArr;
        $ENTRIES = a.a(sectionTypeArr);
    }

    public static SectionType valueOf(String str) {
        return (SectionType) Enum.valueOf(SectionType.class, str);
    }

    public static SectionType[] values() {
        return (SectionType[]) $VALUES.clone();
    }
}

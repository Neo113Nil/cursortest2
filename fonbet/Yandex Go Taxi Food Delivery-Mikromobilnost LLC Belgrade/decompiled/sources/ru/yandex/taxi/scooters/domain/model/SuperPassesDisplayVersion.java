package ru.yandex.taxi.scooters.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/scooters/domain/model/SuperPassesDisplayVersion;", "", "V1", "V2", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuperPassesDisplayVersion {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperPassesDisplayVersion[] $VALUES;
    public static final SuperPassesDisplayVersion V1;
    public static final SuperPassesDisplayVersion V2;

    static {
        SuperPassesDisplayVersion superPassesDisplayVersion = new SuperPassesDisplayVersion("V1", 0);
        V1 = superPassesDisplayVersion;
        SuperPassesDisplayVersion superPassesDisplayVersion2 = new SuperPassesDisplayVersion("V2", 1);
        V2 = superPassesDisplayVersion2;
        SuperPassesDisplayVersion[] superPassesDisplayVersionArr = {superPassesDisplayVersion, superPassesDisplayVersion2};
        $VALUES = superPassesDisplayVersionArr;
        $ENTRIES = a.a(superPassesDisplayVersionArr);
    }

    public static SuperPassesDisplayVersion valueOf(String str) {
        return (SuperPassesDisplayVersion) Enum.valueOf(SuperPassesDisplayVersion.class, str);
    }

    public static SuperPassesDisplayVersion[] values() {
        return (SuperPassesDisplayVersion[]) $VALUES.clone();
    }
}

package ru.yandex.taxi.scooters.data.model;

import defpackage.aw80;
import defpackage.dk90;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/data/model/PassItemType;", "", "Companion", "dk90", "TARIFF", "PACKAGE", "SUPER_PASS", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PassItemType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassItemType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final dk90 Companion;
    public static final PassItemType PACKAGE;
    public static final PassItemType SUPER_PASS;
    public static final PassItemType TARIFF;

    static {
        PassItemType passItemType = new PassItemType("TARIFF", 0);
        TARIFF = passItemType;
        PassItemType passItemType2 = new PassItemType("PACKAGE", 1);
        PACKAGE = passItemType2;
        PassItemType passItemType3 = new PassItemType("SUPER_PASS", 2);
        SUPER_PASS = passItemType3;
        PassItemType[] passItemTypeArr = {passItemType, passItemType2, passItemType3};
        $VALUES = passItemTypeArr;
        $ENTRIES = a.a(passItemTypeArr);
        Companion = new dk90();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(24));
    }

    public static PassItemType valueOf(String str) {
        return (PassItemType) Enum.valueOf(PassItemType.class, str);
    }

    public static PassItemType[] values() {
        return (PassItemType[]) $VALUES.clone();
    }
}

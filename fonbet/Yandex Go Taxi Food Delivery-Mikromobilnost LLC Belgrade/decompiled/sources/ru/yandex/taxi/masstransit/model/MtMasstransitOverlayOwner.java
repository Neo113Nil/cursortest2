package ru.yandex.taxi.masstransit.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/masstransit/model/MtMasstransitOverlayOwner;", "", "SUPER_APP_DISCOVERY_MAP_FEATURE", "MASSTRANSIT_FEATURE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtMasstransitOverlayOwner {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtMasstransitOverlayOwner[] $VALUES;
    public static final MtMasstransitOverlayOwner MASSTRANSIT_FEATURE;
    public static final MtMasstransitOverlayOwner SUPER_APP_DISCOVERY_MAP_FEATURE;

    static {
        MtMasstransitOverlayOwner mtMasstransitOverlayOwner = new MtMasstransitOverlayOwner("SUPER_APP_DISCOVERY_MAP_FEATURE", 0);
        SUPER_APP_DISCOVERY_MAP_FEATURE = mtMasstransitOverlayOwner;
        MtMasstransitOverlayOwner mtMasstransitOverlayOwner2 = new MtMasstransitOverlayOwner("MASSTRANSIT_FEATURE", 1);
        MASSTRANSIT_FEATURE = mtMasstransitOverlayOwner2;
        MtMasstransitOverlayOwner[] mtMasstransitOverlayOwnerArr = {mtMasstransitOverlayOwner, mtMasstransitOverlayOwner2};
        $VALUES = mtMasstransitOverlayOwnerArr;
        $ENTRIES = kotlin.enums.a.a(mtMasstransitOverlayOwnerArr);
    }

    public static MtMasstransitOverlayOwner valueOf(String str) {
        return (MtMasstransitOverlayOwner) Enum.valueOf(MtMasstransitOverlayOwner.class, str);
    }

    public static MtMasstransitOverlayOwner[] values() {
        return (MtMasstransitOverlayOwner[]) $VALUES.clone();
    }
}

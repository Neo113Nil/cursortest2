package ru.yandex.taxi.eatskit.dto;

import defpackage.c0t;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.sss;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/eatskit/dto/GeoPointSource;", "", "Companion", "c0t", "FROM_GEO", "FROM_MODAL", "GEO_REQUEST", "MODAL_REQUEST", "FORCE_FROM_GEO", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GeoPointSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GeoPointSource[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final c0t Companion;
    public static final GeoPointSource FORCE_FROM_GEO;
    public static final GeoPointSource FROM_GEO;
    public static final GeoPointSource FROM_MODAL;
    public static final GeoPointSource GEO_REQUEST;
    public static final GeoPointSource MODAL_REQUEST;

    static {
        GeoPointSource geoPointSource = new GeoPointSource("FROM_GEO", 0);
        FROM_GEO = geoPointSource;
        GeoPointSource geoPointSource2 = new GeoPointSource("FROM_MODAL", 1);
        FROM_MODAL = geoPointSource2;
        GeoPointSource geoPointSource3 = new GeoPointSource("GEO_REQUEST", 2);
        GEO_REQUEST = geoPointSource3;
        GeoPointSource geoPointSource4 = new GeoPointSource("MODAL_REQUEST", 3);
        MODAL_REQUEST = geoPointSource4;
        GeoPointSource geoPointSource5 = new GeoPointSource("FORCE_FROM_GEO", 4);
        FORCE_FROM_GEO = geoPointSource5;
        GeoPointSource[] geoPointSourceArr = {geoPointSource, geoPointSource2, geoPointSource3, geoPointSource4, geoPointSource5};
        $VALUES = geoPointSourceArr;
        $ENTRIES = kotlin.enums.a.a(geoPointSourceArr);
        Companion = new c0t();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sss(3));
    }

    public static GeoPointSource valueOf(String str) {
        return (GeoPointSource) Enum.valueOf(GeoPointSource.class, str);
    }

    public static GeoPointSource[] values() {
        return (GeoPointSource[]) $VALUES.clone();
    }
}

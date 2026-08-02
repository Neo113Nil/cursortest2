package ru.yandex.taxi.scooters.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j4n0;
import defpackage.k4o;
import defpackage.s3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/data/model/ScootersCard;", "", "Companion", "j4n0", "V2", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersCard {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersCard[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final j4n0 Companion;
    public static final ScootersCard V2;

    static {
        ScootersCard scootersCard = new ScootersCard("V2", 0);
        V2 = scootersCard;
        ScootersCard[] scootersCardArr = {scootersCard};
        $VALUES = scootersCardArr;
        $ENTRIES = a.a(scootersCardArr);
        Companion = new j4n0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(4));
    }

    public static ScootersCard valueOf(String str) {
        return (ScootersCard) Enum.valueOf(ScootersCard.class, str);
    }

    public static ScootersCard[] values() {
        return (ScootersCard[]) $VALUES.clone();
    }
}

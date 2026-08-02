package ru.yandex.taxi.masstransit.promo;

import defpackage.dtc;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.z2c;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/promo/CommunicationType;", "", "Companion", "dtc", "PROMOBLOCK", "OBJECT_OVER_MAP", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CommunicationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommunicationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final dtc Companion;
    public static final CommunicationType OBJECT_OVER_MAP;
    public static final CommunicationType PROMOBLOCK;

    static {
        CommunicationType communicationType = new CommunicationType("PROMOBLOCK", 0);
        PROMOBLOCK = communicationType;
        CommunicationType communicationType2 = new CommunicationType("OBJECT_OVER_MAP", 1);
        OBJECT_OVER_MAP = communicationType2;
        CommunicationType[] communicationTypeArr = {communicationType, communicationType2};
        $VALUES = communicationTypeArr;
        $ENTRIES = kotlin.enums.a.a(communicationTypeArr);
        Companion = new dtc();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(25));
    }

    public static CommunicationType valueOf(String str) {
        return (CommunicationType) Enum.valueOf(CommunicationType.class, str);
    }

    public static CommunicationType[] values() {
        return (CommunicationType[]) $VALUES.clone();
    }
}

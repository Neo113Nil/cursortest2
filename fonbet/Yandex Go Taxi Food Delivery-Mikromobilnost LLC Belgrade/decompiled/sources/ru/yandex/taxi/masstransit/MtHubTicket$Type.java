package ru.yandex.taxi.masstransit;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/masstransit/MtHubTicket$Type", "", "Lru/yandex/taxi/masstransit/MtHubTicket$Type;", "MASSTRANSIT", "AEROEXPRESS", "SUBURBAN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtHubTicket$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtHubTicket$Type[] $VALUES;
    public static final MtHubTicket$Type AEROEXPRESS;
    public static final MtHubTicket$Type MASSTRANSIT;
    public static final MtHubTicket$Type SUBURBAN;

    static {
        MtHubTicket$Type mtHubTicket$Type = new MtHubTicket$Type("MASSTRANSIT", 0);
        MASSTRANSIT = mtHubTicket$Type;
        MtHubTicket$Type mtHubTicket$Type2 = new MtHubTicket$Type("AEROEXPRESS", 1);
        AEROEXPRESS = mtHubTicket$Type2;
        MtHubTicket$Type mtHubTicket$Type3 = new MtHubTicket$Type("SUBURBAN", 2);
        SUBURBAN = mtHubTicket$Type3;
        MtHubTicket$Type[] mtHubTicket$TypeArr = {mtHubTicket$Type, mtHubTicket$Type2, mtHubTicket$Type3};
        $VALUES = mtHubTicket$TypeArr;
        $ENTRIES = kotlin.enums.a.a(mtHubTicket$TypeArr);
    }

    public static MtHubTicket$Type valueOf(String str) {
        return (MtHubTicket$Type) Enum.valueOf(MtHubTicket$Type.class, str);
    }

    public static MtHubTicket$Type[] values() {
        return (MtHubTicket$Type[]) $VALUES.clone();
    }
}

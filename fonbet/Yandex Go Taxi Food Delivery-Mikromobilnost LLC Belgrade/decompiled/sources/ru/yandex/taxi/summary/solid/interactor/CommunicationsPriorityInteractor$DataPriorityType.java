package ru.yandex.taxi.summary.solid.interactor;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/summary/solid/interactor/CommunicationsPriorityInteractor$DataPriorityType", "", "Lru/yandex/taxi/summary/solid/interactor/CommunicationsPriorityInteractor$DataPriorityType;", "ALL", "HIDE_BUBBLES", "HIDE_NOTIFICATION", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommunicationsPriorityInteractor$DataPriorityType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommunicationsPriorityInteractor$DataPriorityType[] $VALUES;
    public static final CommunicationsPriorityInteractor$DataPriorityType ALL;
    public static final CommunicationsPriorityInteractor$DataPriorityType HIDE_BUBBLES;
    public static final CommunicationsPriorityInteractor$DataPriorityType HIDE_NOTIFICATION;

    static {
        CommunicationsPriorityInteractor$DataPriorityType communicationsPriorityInteractor$DataPriorityType = new CommunicationsPriorityInteractor$DataPriorityType("ALL", 0);
        ALL = communicationsPriorityInteractor$DataPriorityType;
        CommunicationsPriorityInteractor$DataPriorityType communicationsPriorityInteractor$DataPriorityType2 = new CommunicationsPriorityInteractor$DataPriorityType("HIDE_BUBBLES", 1);
        HIDE_BUBBLES = communicationsPriorityInteractor$DataPriorityType2;
        CommunicationsPriorityInteractor$DataPriorityType communicationsPriorityInteractor$DataPriorityType3 = new CommunicationsPriorityInteractor$DataPriorityType("HIDE_NOTIFICATION", 2);
        HIDE_NOTIFICATION = communicationsPriorityInteractor$DataPriorityType3;
        CommunicationsPriorityInteractor$DataPriorityType[] communicationsPriorityInteractor$DataPriorityTypeArr = {communicationsPriorityInteractor$DataPriorityType, communicationsPriorityInteractor$DataPriorityType2, communicationsPriorityInteractor$DataPriorityType3};
        $VALUES = communicationsPriorityInteractor$DataPriorityTypeArr;
        $ENTRIES = kotlin.enums.a.a(communicationsPriorityInteractor$DataPriorityTypeArr);
    }

    public static CommunicationsPriorityInteractor$DataPriorityType valueOf(String str) {
        return (CommunicationsPriorityInteractor$DataPriorityType) Enum.valueOf(CommunicationsPriorityInteractor$DataPriorityType.class, str);
    }

    public static CommunicationsPriorityInteractor$DataPriorityType[] values() {
        return (CommunicationsPriorityInteractor$DataPriorityType[]) $VALUES.clone();
    }
}

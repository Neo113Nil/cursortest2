package ru.yandex.taxi.promotions.storage;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/promotions/storage/CommunicationsCacheMode;", "", "DISK", "RAM", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CommunicationsCacheMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommunicationsCacheMode[] $VALUES;
    public static final CommunicationsCacheMode DISK;
    public static final CommunicationsCacheMode RAM;

    static {
        CommunicationsCacheMode communicationsCacheMode = new CommunicationsCacheMode("DISK", 0);
        DISK = communicationsCacheMode;
        CommunicationsCacheMode communicationsCacheMode2 = new CommunicationsCacheMode("RAM", 1);
        RAM = communicationsCacheMode2;
        CommunicationsCacheMode[] communicationsCacheModeArr = {communicationsCacheMode, communicationsCacheMode2};
        $VALUES = communicationsCacheModeArr;
        $ENTRIES = kotlin.enums.a.a(communicationsCacheModeArr);
    }

    public static CommunicationsCacheMode valueOf(String str) {
        return (CommunicationsCacheMode) Enum.valueOf(CommunicationsCacheMode.class, str);
    }

    public static CommunicationsCacheMode[] values() {
        return (CommunicationsCacheMode[]) $VALUES.clone();
    }
}

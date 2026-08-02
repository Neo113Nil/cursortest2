package ru.yandex.taxi.messenger;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/messenger/MessengerWebSdkParamsSupplier$MessengerType", "", "Lru/yandex/taxi/messenger/MessengerWebSdkParamsSupplier$MessengerType;", "Taxi", "Delivery", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessengerWebSdkParamsSupplier$MessengerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessengerWebSdkParamsSupplier$MessengerType[] $VALUES;
    public static final MessengerWebSdkParamsSupplier$MessengerType Delivery;
    public static final MessengerWebSdkParamsSupplier$MessengerType Taxi;

    static {
        MessengerWebSdkParamsSupplier$MessengerType messengerWebSdkParamsSupplier$MessengerType = new MessengerWebSdkParamsSupplier$MessengerType("Taxi", 0);
        Taxi = messengerWebSdkParamsSupplier$MessengerType;
        MessengerWebSdkParamsSupplier$MessengerType messengerWebSdkParamsSupplier$MessengerType2 = new MessengerWebSdkParamsSupplier$MessengerType("Delivery", 1);
        Delivery = messengerWebSdkParamsSupplier$MessengerType2;
        MessengerWebSdkParamsSupplier$MessengerType[] messengerWebSdkParamsSupplier$MessengerTypeArr = {messengerWebSdkParamsSupplier$MessengerType, messengerWebSdkParamsSupplier$MessengerType2};
        $VALUES = messengerWebSdkParamsSupplier$MessengerTypeArr;
        $ENTRIES = kotlin.enums.a.a(messengerWebSdkParamsSupplier$MessengerTypeArr);
    }

    public static MessengerWebSdkParamsSupplier$MessengerType valueOf(String str) {
        return (MessengerWebSdkParamsSupplier$MessengerType) Enum.valueOf(MessengerWebSdkParamsSupplier$MessengerType.class, str);
    }

    public static MessengerWebSdkParamsSupplier$MessengerType[] values() {
        return (MessengerWebSdkParamsSupplier$MessengerType[]) $VALUES.clone();
    }
}

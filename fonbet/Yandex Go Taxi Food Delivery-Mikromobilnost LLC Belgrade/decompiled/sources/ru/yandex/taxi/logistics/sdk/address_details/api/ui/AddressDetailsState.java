package ru.yandex.taxi.logistics.sdk.address_details.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/sdk/address_details/api/ui/AddressDetailsState;", "", "LOADING", "READY", "sdk-address-details"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressDetailsState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressDetailsState[] $VALUES;
    public static final AddressDetailsState LOADING;
    public static final AddressDetailsState READY;

    static {
        AddressDetailsState addressDetailsState = new AddressDetailsState("LOADING", 0);
        LOADING = addressDetailsState;
        AddressDetailsState addressDetailsState2 = new AddressDetailsState("READY", 1);
        READY = addressDetailsState2;
        AddressDetailsState[] addressDetailsStateArr = {addressDetailsState, addressDetailsState2};
        $VALUES = addressDetailsStateArr;
        $ENTRIES = a.a(addressDetailsStateArr);
    }

    public static AddressDetailsState valueOf(String str) {
        return (AddressDetailsState) Enum.valueOf(AddressDetailsState.class, str);
    }

    public static AddressDetailsState[] values() {
        return (AddressDetailsState[]) $VALUES.clone();
    }
}

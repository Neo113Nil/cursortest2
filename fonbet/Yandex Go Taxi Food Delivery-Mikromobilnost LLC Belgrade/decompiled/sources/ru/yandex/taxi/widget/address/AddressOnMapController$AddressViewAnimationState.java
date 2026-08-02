package ru.yandex.taxi.widget.address;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/widget/address/AddressOnMapController$AddressViewAnimationState", "", "Lru/yandex/taxi/widget/address/AddressOnMapController$AddressViewAnimationState;", "VISIBLE", "FADE_OUTED", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AddressOnMapController$AddressViewAnimationState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressOnMapController$AddressViewAnimationState[] $VALUES;
    public static final AddressOnMapController$AddressViewAnimationState FADE_OUTED;
    public static final AddressOnMapController$AddressViewAnimationState VISIBLE;

    static {
        AddressOnMapController$AddressViewAnimationState addressOnMapController$AddressViewAnimationState = new AddressOnMapController$AddressViewAnimationState("VISIBLE", 0);
        VISIBLE = addressOnMapController$AddressViewAnimationState;
        AddressOnMapController$AddressViewAnimationState addressOnMapController$AddressViewAnimationState2 = new AddressOnMapController$AddressViewAnimationState("FADE_OUTED", 1);
        FADE_OUTED = addressOnMapController$AddressViewAnimationState2;
        AddressOnMapController$AddressViewAnimationState[] addressOnMapController$AddressViewAnimationStateArr = {addressOnMapController$AddressViewAnimationState, addressOnMapController$AddressViewAnimationState2};
        $VALUES = addressOnMapController$AddressViewAnimationStateArr;
        $ENTRIES = kotlin.enums.a.a(addressOnMapController$AddressViewAnimationStateArr);
    }

    public static AddressOnMapController$AddressViewAnimationState valueOf(String str) {
        return (AddressOnMapController$AddressViewAnimationState) Enum.valueOf(AddressOnMapController$AddressViewAnimationState.class, str);
    }

    public static AddressOnMapController$AddressViewAnimationState[] values() {
        return (AddressOnMapController$AddressViewAnimationState[]) $VALUES.clone();
    }
}

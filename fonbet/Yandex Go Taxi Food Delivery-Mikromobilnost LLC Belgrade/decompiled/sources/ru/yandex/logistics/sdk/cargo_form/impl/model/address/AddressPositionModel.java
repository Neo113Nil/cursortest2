package ru.yandex.logistics.sdk.cargo_form.impl.model.address;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/address/AddressPositionModel;", "", "TITLE", "SUBTITLE", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressPositionModel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressPositionModel[] $VALUES;
    public static final AddressPositionModel SUBTITLE;
    public static final AddressPositionModel TITLE;

    static {
        AddressPositionModel addressPositionModel = new AddressPositionModel("TITLE", 0);
        TITLE = addressPositionModel;
        AddressPositionModel addressPositionModel2 = new AddressPositionModel("SUBTITLE", 1);
        SUBTITLE = addressPositionModel2;
        AddressPositionModel[] addressPositionModelArr = {addressPositionModel, addressPositionModel2};
        $VALUES = addressPositionModelArr;
        $ENTRIES = a.a(addressPositionModelArr);
    }

    public static AddressPositionModel valueOf(String str) {
        return (AddressPositionModel) Enum.valueOf(AddressPositionModel.class, str);
    }

    public static AddressPositionModel[] values() {
        return (AddressPositionModel[]) $VALUES.clone();
    }
}

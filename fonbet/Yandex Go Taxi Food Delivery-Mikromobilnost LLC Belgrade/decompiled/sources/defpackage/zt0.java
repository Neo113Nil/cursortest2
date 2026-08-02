package defpackage;

import ru.yandex.taxi.logistics.sdk.address_details.api.ui.AddressDetailsState;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class zt0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddressDetailsState.values().length];
        try {
            iArr[AddressDetailsState.READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressDetailsState.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

package defpackage;

import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class w11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddressMapPickerAddressStateRepository.State.values().length];
        try {
            iArr[AddressMapPickerAddressStateRepository.State.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressMapPickerAddressStateRepository.State.Loaded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddressMapPickerAddressStateRepository.State.Loading.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AddressMapPickerAddressStateRepository.State.Error.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}

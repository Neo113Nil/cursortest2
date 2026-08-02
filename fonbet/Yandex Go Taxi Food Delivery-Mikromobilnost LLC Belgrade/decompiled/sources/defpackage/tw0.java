package defpackage;

import ru.yandex.taxi.address.experiment.AddressItemMode;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class tw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddressItemMode.values().length];
        try {
            iArr[AddressItemMode.EDITABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressItemMode.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddressItemMode.READ_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

package defpackage;

import ru.yandex.taxi.address.repository.AddressResolveRepository;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class z11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AddressResolveRepository.State.values().length];
        try {
            iArr[AddressResolveRepository.State.LOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AddressResolveRepository.State.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AddressResolveRepository.State.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

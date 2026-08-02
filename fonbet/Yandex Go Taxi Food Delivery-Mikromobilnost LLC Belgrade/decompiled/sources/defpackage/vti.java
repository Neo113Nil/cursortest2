package defpackage;

import ru.yandex.taxi.logistics.payment_method_selector.requirement.state.ToggleSource;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class vti {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ToggleSource.values().length];
        try {
            iArr[ToggleSource.SUMMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToggleSource.CONTACTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

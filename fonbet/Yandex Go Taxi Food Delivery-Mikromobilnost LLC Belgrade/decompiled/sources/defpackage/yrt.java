package defpackage;

import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class yrt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserCardProfileName.values().length];
        try {
            iArr[UserCardProfileName.YANDEX_DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserCardProfileName.YANGO_COM_DH1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserCardProfileName.YANDEX_COM_DH2.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserCardProfileName.YANGO_COM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}

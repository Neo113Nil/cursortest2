package defpackage;

import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class qza0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Permission.values().length];
        try {
            iArr[Permission.CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Permission.LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Permission.CAMERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Permission.NOTIFICATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Permission.READ_CONTACTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}

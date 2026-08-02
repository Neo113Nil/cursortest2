package defpackage;

import ru.yandex.taxi.promotions.storage.CommunicationsCacheMode;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class ziu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CommunicationsCacheMode.values().length];
        try {
            iArr[CommunicationsCacheMode.DISK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CommunicationsCacheMode.RAM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

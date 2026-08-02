package defpackage;

import ru.yandex.taxi.logistics.sdk.job.model.JobNetworkType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class sci {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JobNetworkType.values().length];
        try {
            iArr[JobNetworkType.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JobNetworkType.ANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

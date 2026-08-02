package defpackage;

import ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionStatusDto;
import ru.yandex.taxi.plus.net.response.Status;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class xjd0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SubscriptionStatusDto.values().length];
        try {
            iArr[SubscriptionStatusDto.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionStatusDto.PURCHASING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionStatusDto.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SubscriptionStatusDto.NOT_AVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SubscriptionStatusDto.UNRECOGNIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[Status.values().length];
        try {
            iArr2[Status.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}

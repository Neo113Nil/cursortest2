package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.LimitedCountShowPolicyDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class yri {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LimitedCountShowPolicyDto.PolicyLifetimeDto.values().length];
        try {
            iArr[LimitedCountShowPolicyDto.PolicyLifetimeDto.PERSISTENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LimitedCountShowPolicyDto.PolicyLifetimeDto.SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

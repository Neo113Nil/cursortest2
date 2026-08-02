package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ForwardingIdDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class qsc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ForwardingIdDto.values().length];
        try {
            iArr[ForwardingIdDto.PERFORMER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ForwardingIdDto.INAPP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

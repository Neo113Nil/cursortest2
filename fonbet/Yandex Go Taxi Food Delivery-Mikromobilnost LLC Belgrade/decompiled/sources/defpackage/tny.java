package defpackage;

import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderTypeDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class tny {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LinkedOrderTypeDto.values().length];
        try {
            iArr[LinkedOrderTypeDto.AMBULANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkedOrderTypeDto.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

package defpackage;

import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderIconTypeDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class toy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LinkedOrderIconTypeDto.values().length];
        try {
            iArr[LinkedOrderIconTypeDto.B2C.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkedOrderIconTypeDto.C2C.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

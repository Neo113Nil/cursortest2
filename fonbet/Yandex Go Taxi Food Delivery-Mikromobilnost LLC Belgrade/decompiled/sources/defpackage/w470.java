package defpackage;

import com.yandex.go.places.models.data.entities.network.DeliveryPointTypeDto;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class w470 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryPointTypeDto.values().length];
        try {
            iArr[DeliveryPointTypeDto.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryPointTypeDto.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

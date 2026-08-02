package defpackage;

import com.yandex.go.chargers.passes.data.ChargersPassTypeDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class rla {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersPassTypeDto.values().length];
        try {
            iArr[ChargersPassTypeDto.RENTAL_PACKAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersPassTypeDto.SUBSCRIPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersPassTypeDto.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

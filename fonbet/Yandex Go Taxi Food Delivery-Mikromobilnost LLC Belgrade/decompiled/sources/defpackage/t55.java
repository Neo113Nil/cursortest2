package defpackage;

import com.yandex.go.places.map.domain.entities.PinLayer;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class t55 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PinLayer.values().length];
        try {
            iArr[PinLayer.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinLayer.SOCIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

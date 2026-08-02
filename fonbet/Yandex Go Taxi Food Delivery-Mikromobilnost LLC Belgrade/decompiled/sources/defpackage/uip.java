package defpackage;

import com.yandex.go.address.models.PlaceType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class uip {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlaceType.values().length];
        try {
            iArr[PlaceType.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlaceType.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

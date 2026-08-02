package defpackage;

import ru.yandex.taxi.masstransit.model.MtPositionOverMap;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class zq30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtPositionOverMap.values().length];
        try {
            iArr[MtPositionOverMap.CENTER_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtPositionOverMap.CENTER_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

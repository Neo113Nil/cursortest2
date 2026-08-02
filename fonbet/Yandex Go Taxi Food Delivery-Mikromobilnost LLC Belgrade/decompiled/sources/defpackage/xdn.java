package defpackage;

import ru.yandex.taxi.eatskit.dto.GeoPointSource;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class xdn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GeoPointSource.values().length];
        try {
            iArr[GeoPointSource.GEO_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GeoPointSource.MODAL_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

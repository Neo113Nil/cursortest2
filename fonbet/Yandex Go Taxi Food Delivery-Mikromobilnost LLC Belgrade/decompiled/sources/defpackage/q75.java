package defpackage;

import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class q75 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlacesNavigationMode.values().length];
        try {
            iArr[PlacesNavigationMode.DEEPLINK_NAVIGATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesNavigationMode.NATIVE_NAVIGATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PlacesMapMode.values().length];
        try {
            iArr2[PlacesMapMode.NO_MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PlacesMapMode.WITH_MAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}

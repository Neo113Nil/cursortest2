package defpackage;

import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class u75 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlacesWebAuthType.values().length];
        try {
            iArr[PlacesWebAuthType.COOKIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesWebAuthType.OAUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

package defpackage;

import com.yandex.go.platform.js_api.models.JsPermission;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class wax {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsPermission.values().length];
        try {
            iArr[JsPermission.ENABLE_NOTIFICATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JsPermission.ENABLE_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JsPermission.LOCATION_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

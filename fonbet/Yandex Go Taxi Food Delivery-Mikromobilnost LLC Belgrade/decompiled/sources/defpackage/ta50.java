package defpackage;

import com.yandex.go.navigator.permission.NavigatorPermissionRequestRouter$ExitListener$State;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ta50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NavigatorPermissionRequestRouter$ExitListener$State.values().length];
        try {
            iArr[NavigatorPermissionRequestRouter$ExitListener$State.GRANTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NavigatorPermissionRequestRouter$ExitListener$State.DENIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.authorization.LogoutResult;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class rrd0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LogoutResult.values().length];
        try {
            iArr[LogoutResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogoutResult.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogoutResult.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

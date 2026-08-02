package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes.dex */
public abstract /* synthetic */ class rep0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BaseRootNavigationRouter.Background.values().length];
        try {
            iArr[BaseRootNavigationRouter.Background.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BaseRootNavigationRouter.Background.BLANK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BaseRootNavigationRouter.Background.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

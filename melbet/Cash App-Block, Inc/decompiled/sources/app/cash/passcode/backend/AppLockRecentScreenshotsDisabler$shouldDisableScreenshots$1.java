package app.cash.passcode.backend;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes.dex */
public final /* synthetic */ class AppLockRecentScreenshotsDisabler$shouldDisableScreenshots$1 extends AdaptedFunctionReference implements Function3 {
    public static final AppLockRecentScreenshotsDisabler$shouldDisableScreenshots$1 INSTANCE = new AppLockRecentScreenshotsDisabler$shouldDisableScreenshots$1(3, Boolean.TYPE, "and", "and(Z)Z", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() & ((Boolean) obj2).booleanValue());
    }
}

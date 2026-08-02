package defpackage;

import android.os.Build;
import android.window.BackEvent;
import com.yandex.go.account.api.superapp.CookieInjectionResult$Failure$Reason;
import com.yandex.passport.api.exception.PassportAccountNotAuthorizedException;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportIOException;

/* loaded from: classes11.dex */
public abstract class rrb1 {
    public static au2 a;

    public static final i750 a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new i750(progress, touchX, touchY, swipeEdge, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final CookieInjectionResult$Failure$Reason b(Throwable th) {
        return th instanceof PassportIOException ? CookieInjectionResult$Failure$Reason.NETWORK_ERROR : th instanceof PassportAccountNotFoundException ? CookieInjectionResult$Failure$Reason.ACCOUNT_NOT_FOUND : th instanceof PassportAccountNotAuthorizedException ? CookieInjectionResult$Failure$Reason.ACCOUNT_NOT_AUTHORIZED : CookieInjectionResult$Failure$Reason.UNKNOWN;
    }
}

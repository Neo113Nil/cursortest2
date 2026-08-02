package defpackage;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import java.io.IOException;
import kotlin.collections.a;
import ru.yandex.taxi.network.api.models.GoApiOtherException;

/* loaded from: classes15.dex */
public final class ru8 extends d7 implements mse {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru8(i8y0 i8y0Var) {
        super(lse.a);
        this.a = 9;
    }

    private final void o(fse fseVar, Throwable th) {
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        switch (this.a) {
            case 0:
                if (!(th instanceof IOException)) {
                    throw th;
                }
                jst.e.j(th);
                return;
            case 1:
                jst.e.k(th, "Location services are not available");
                return;
            case 2:
                hst hstVar = jst.e;
                String X = a.X(scc.g("B2B.TOKEN_ERROR:ANTI_FRAUD_ACCOUNT_ERROR_TOKEN", "CEH"), ":", null, null, null, 62);
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                xby.l(hstVar, X, null, th, message, 2);
                return;
            case 3:
                jst.e.k(th, "Update GeoPosition for superapp webview failed");
                return;
            case 4:
                jst.e.k(th, "Update `autoShowActiveOrderDisabled` on superapp webview failed");
                return;
            case 5:
                zgz.a("Catched in ScootersCoroutineBridgeRepository", th);
                return;
            case 6:
                xby.l(jst.e, "ORGANIZATIONS_DISCOVERY_ERROR", null, th, "ORGANIZATIONS_DISCOVERY_SEARCH_COMMON_ERROR", 2);
                return;
            case 7:
                return;
            case 8:
                jst.e.j(th);
                return;
            case 9:
                if (th instanceof GoApiOtherException) {
                    th = ((GoApiOtherException) th).getOriginal();
                }
                jst.e.g("PANORAMA_ERROR_TOKEN_V1", "PanoramaLoggerTag", "PANORAMA_ERROR_TOKEN_V1:DEFAULT_CEH", th);
                return;
            default:
                c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "HostProcessForegroundObserver failed " + th, 8);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru8() {
        super(lse.a);
        this.a = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ru8(ese eseVar, int i) {
        super(eseVar);
        this.a = i;
    }
}

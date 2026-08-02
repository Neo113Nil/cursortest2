package defpackage;

import android.util.Log;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.common.logger.d;
import kotlin.coroutines.a;
import kotlin.coroutines.f;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class b43 extends a implements fm6 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b43(skn sknVar) {
        super(rre.f);
        this.c = 11;
    }

    @Override // defpackage.fm6
    public final void N(Throwable th) {
        switch (this.c) {
            case 0:
                Timber.INSTANCE.tag("YP:BlckBaseUrlsManager").e(th);
                break;
            case 1:
                Log.e("CommonBandwidthMeter", "Exception in CommonBandwidthMeter processingScope!!!", th);
                break;
            case 2:
                Log.e("AbConfigInteractor", fob.b(th));
                break;
            case 3:
                Log.e("CodecDebugReporter", Log.getStackTraceString(th));
                break;
            case 4:
            case 5:
                break;
            case 6:
                ssg.a(6, null, "Unhandled exception in NewLandingCenter", th);
                break;
            case 7:
                Log.e("LYPMProvider", fob.b(th));
                break;
            case 8:
                break;
            case 9:
                Log.e("YP:NetworkTypeProvider", fob.b(th));
                break;
            case 10:
                Log.e("YP:OpYandexPlayerImpl", "Failed to release player. " + Log.getStackTraceString(th));
                break;
            case 11:
                break;
            case 12:
                Log.e("StrmManagerImpl", "Exception occurred in player's event tracker coroutine scope.", th);
                break;
            case 13:
                Log.e("YP:YandexPlayerImpl", "Failed to release player. " + Log.getStackTraceString(th));
                break;
            case 14:
                d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(b.e, null, "ForegroundDetector in passport process failed", th);
                    break;
                }
                break;
            case 15:
                d dVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(b.e, null, "Error in push registration", th);
                    break;
                }
                break;
            default:
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(b.b, null, "HostProcessForegroundObserver failed " + th, 8);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b43(f fVar, int i) {
        super(fVar);
        this.c = i;
    }

    private final void F0(Throwable th) {
    }

    private final void G0(Throwable th) {
    }

    private final void H0(Throwable th) {
    }

    private final void I0(Throwable th) {
    }
}

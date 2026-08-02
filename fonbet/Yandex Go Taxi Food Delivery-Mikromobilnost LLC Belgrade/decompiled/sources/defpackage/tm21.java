package defpackage;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.taxi.persuggest.fingerprint.UserFingerprintGnssSession$start$measCallback$1;
import ru.yandex.taxi.persuggest.fingerprint.UserFingerprintGnssSession$start$statusCallback$1;

/* loaded from: classes9.dex */
public final class tm21 {
    public final k0b0 a;
    public final LocationManager b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final AtomicReference d = new AtomicReference(sm21.c);
    public volatile boolean e;
    public UserFingerprintGnssSession$start$measCallback$1 f;
    public UserFingerprintGnssSession$start$statusCallback$1 g;

    public tm21(Context context, k0b0 k0b0Var) {
        this.a = k0b0Var;
        this.b = (LocationManager) context.getSystemService("location");
    }

    public final void a() {
        if (!this.e && this.a.g()) {
            UserFingerprintGnssSession$start$measCallback$1 userFingerprintGnssSession$start$measCallback$1 = new UserFingerprintGnssSession$start$measCallback$1(this);
            UserFingerprintGnssSession$start$statusCallback$1 userFingerprintGnssSession$start$statusCallback$1 = new UserFingerprintGnssSession$start$statusCallback$1(this);
            try {
                LocationManager locationManager = this.b;
                Handler handler = this.c;
                locationManager.registerGnssMeasurementsCallback(userFingerprintGnssSession$start$measCallback$1, handler);
                locationManager.registerGnssStatusCallback(userFingerprintGnssSession$start$statusCallback$1, handler);
                this.e = true;
                this.f = userFingerprintGnssSession$start$measCallback$1;
                this.g = userFingerprintGnssSession$start$statusCallback$1;
            } catch (Exception e) {
                try {
                    this.b.unregisterGnssMeasurementsCallback(userFingerprintGnssSession$start$measCallback$1);
                } catch (Throwable unused) {
                }
                try {
                    this.b.unregisterGnssStatusCallback(userFingerprintGnssSession$start$statusCallback$1);
                    throw e;
                } catch (Throwable unused2) {
                    throw e;
                }
            }
        }
    }
}

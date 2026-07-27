package kotlin.text;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class CatchingFishJUnitMVI {
    public int CatchingFishCoroutine;
    public final CatchingFishMVIRoomMoshi CatchingFishParcelableFAB;
    public long CatchingFishSnackbar;
    public static final long CatchingFishReduxKtor = TimeUnit.HOURS.toMillis(24);
    public static final long CatchingFishDaggerWebsocket = TimeUnit.MINUTES.toMillis(30);

    public CatchingFishJUnitMVI() {
        if (CatchingFishMoshiGson.CatchingFishParcelableFAB == null) {
            Pattern pattern = CatchingFishMVIRoomMoshi.CatchingFishCoroutine;
            CatchingFishMoshiGson.CatchingFishParcelableFAB = new CatchingFishMoshiGson();
        }
        CatchingFishMoshiGson catchingFishMoshiGson = CatchingFishMoshiGson.CatchingFishParcelableFAB;
        if (CatchingFishMVIRoomMoshi.CatchingFishReduxKtor == null) {
            CatchingFishMVIRoomMoshi.CatchingFishReduxKtor = new CatchingFishMVIRoomMoshi(catchingFishMoshiGson);
        }
        this.CatchingFishParcelableFAB = CatchingFishMVIRoomMoshi.CatchingFishReduxKtor;
    }

    public final synchronized boolean CatchingFishParcelableFAB() {
        boolean z;
        if (this.CatchingFishCoroutine != 0) {
            this.CatchingFishParcelableFAB.CatchingFishParcelableFAB.getClass();
            z = System.currentTimeMillis() > this.CatchingFishSnackbar;
        }
        return z;
    }

    public final synchronized void CatchingFishSnackbar(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.CatchingFishCoroutine = 0;
            }
            return;
        }
        this.CatchingFishCoroutine++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double pow = Math.pow(2.0d, this.CatchingFishCoroutine);
                this.CatchingFishParcelableFAB.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), CatchingFishDaggerWebsocket);
            } else {
                min = CatchingFishReduxKtor;
            }
            this.CatchingFishParcelableFAB.CatchingFishParcelableFAB.getClass();
            this.CatchingFishSnackbar = System.currentTimeMillis() + min;
        }
        return;
    }
}

package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import kotlin.text.CatchingFishIntentKtor;

/* loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(CatchingFishIntentKtor catchingFishIntentKtor) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(catchingFishIntentKtor);
    }

    public static void write(RemoteActionCompat remoteActionCompat, CatchingFishIntentKtor catchingFishIntentKtor) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, catchingFishIntentKtor);
    }
}

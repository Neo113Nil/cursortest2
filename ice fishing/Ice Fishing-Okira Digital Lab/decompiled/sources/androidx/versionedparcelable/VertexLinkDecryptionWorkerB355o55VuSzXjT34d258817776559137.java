package androidx.versionedparcelable;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class VertexLinkDecryptionWorkerB355o55VuSzXjT34d258817776559137 {
    public static final AtomicInteger ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !CrimsonRouteInterpreterOverridingONJhE2k6QRooQDZhCt39507633608441.WhiteFieldUnificationOverridingEBdwjF0noilpOVdrsu81945136372121(resources.getDrawable(i, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}

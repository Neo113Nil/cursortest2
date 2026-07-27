package android.content.Context;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterEventUltraFusion6240 {
    public static final AtomicInteger FrostHunterAlphaAnimationNeoCosmos5761 = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean FrostHunterAlphaAnimationNeoCosmos5761(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !FrostHunterHandlerSparkNebula5537.FrostHunterMeteringPointBetaCyber9571(resources.getDrawable(i, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}

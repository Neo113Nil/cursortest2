package android.content.Context;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterViewPager2PulsePulse2235 {
    public static final ReentrantLock FrostHunterBundlePulseFusionHero2475 = new ReentrantLock();
    public static FrostHunterViewPager2PulsePulse2235 FrostHunterServiceEliteCelestialThunder1757;
    public final ReentrantLock FrostHunterAlphaAnimationNeoCosmos5761 = new ReentrantLock();
    public final SharedPreferences FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterViewPager2PulsePulse2235(Context context) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        ReentrantLock reentrantLock = this.FrostHunterAlphaAnimationNeoCosmos5761;
        reentrantLock.lock();
        try {
            return this.FrostHunterConstraintSetCloneMasterUltraRogue2633.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}

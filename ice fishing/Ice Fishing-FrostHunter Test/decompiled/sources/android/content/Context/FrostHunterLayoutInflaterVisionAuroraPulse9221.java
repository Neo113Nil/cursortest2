package android.content.Context;

import java.net.URL;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLayoutInflaterVisionAuroraPulse9221 {
    public int FrostHunterAlphaAnimationNeoCosmos5761;
    public Object FrostHunterBundlePulseFusionHero2475;
    public long FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterLayoutInflaterVisionAuroraPulse9221(int i, URL url, long j) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterBundlePulseFusionHero2475 = url;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = j;
    }

    public synchronized boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        boolean z;
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 != 0) {
            ((FrostHunterObjectAnimatorQuantumRogueInferno9713) this.FrostHunterBundlePulseFusionHero2475).FrostHunterAlphaAnimationNeoCosmos5761.getClass();
            z = System.currentTimeMillis() > this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        }
        return z;
    }

    public synchronized void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
            }
            return;
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761++;
        synchronized (this) {
            if (i != 429 && (i < 500 || i >= 600)) {
                min = 86400000;
                ((FrostHunterObjectAnimatorQuantumRogueInferno9713) this.FrostHunterBundlePulseFusionHero2475).FrostHunterAlphaAnimationNeoCosmos5761.getClass();
                this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = System.currentTimeMillis() + min;
            }
            double pow = Math.pow(2.0d, this.FrostHunterAlphaAnimationNeoCosmos5761);
            ((FrostHunterObjectAnimatorQuantumRogueInferno9713) this.FrostHunterBundlePulseFusionHero2475).getClass();
            min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            ((FrostHunterObjectAnimatorQuantumRogueInferno9713) this.FrostHunterBundlePulseFusionHero2475).FrostHunterAlphaAnimationNeoCosmos5761.getClass();
            this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = System.currentTimeMillis() + min;
        }
        return;
    }
}

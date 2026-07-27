package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterWorkManagerHyperionSpeed9013 implements FrostHunterAdapterDelegateForceForce1151 {
    public static final Object FrostHunterBundlePulseFusionHero2475 = new Object();
    public volatile Object FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterBundlePulseFusionHero2475;
    public volatile FrostHunterAdapterDelegateForceForce1151 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterWorkManagerHyperionSpeed9013(FrostHunterAdapterDelegateForceForce1151 frostHunterAdapterDelegateForceForce1151) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterAdapterDelegateForceForce1151;
    }

    @Override // android.content.Context.FrostHunterAdapterDelegateForceForce1151
    public final Object get() {
        Object obj;
        Object obj2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj3 = FrostHunterBundlePulseFusionHero2475;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.FrostHunterAlphaAnimationNeoCosmos5761;
                if (obj == obj3) {
                    obj = this.FrostHunterConstraintSetCloneMasterUltraRogue2633.get();
                    this.FrostHunterAlphaAnimationNeoCosmos5761 = obj;
                    this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}

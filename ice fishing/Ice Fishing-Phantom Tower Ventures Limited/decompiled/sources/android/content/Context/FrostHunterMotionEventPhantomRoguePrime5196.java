package android.content.Context;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterMotionEventPhantomRoguePrime5196 {
    public final Unsafe FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterMotionEventPhantomRoguePrime5196(Unsafe unsafe) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = unsafe;
    }

    public abstract void FrostHunterAlertDialogAuroraDelta3200(Object obj, long j, boolean z);

    public final int FrostHunterAlphaAnimationNeoCosmos5761(Class cls) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.arrayBaseOffset(cls);
    }

    public abstract boolean FrostHunterBundlePulseFusionHero2475(long j, Object obj);

    public final Object FrostHunterCameraXPixelTurboCosmos9814(long j, Object obj) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.getObject(obj, j);
    }

    public abstract boolean FrostHunterCameraXTurboCelestialHero5430();

    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633(Class cls) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.arrayIndexScale(cls);
    }

    public final void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(long j, Object obj, Object obj2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.putObject(obj, j, obj2);
    }

    public final long FrostHunterFlowMaxDragonHero5809(Field field) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.objectFieldOffset(field);
    }

    public abstract void FrostHunterFragmentBetaMegaVortex6025(Object obj, long j, double d);

    public abstract void FrostHunterKeyframeGammaGamma1197(Object obj, long j, byte b);

    public final int FrostHunterLevelListDrawableFusionDragonHero2232(long j, Object obj) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.getInt(obj, j);
    }

    public abstract float FrostHunterLifecycleBlazeGammaElite2889(long j, Object obj);

    public final void FrostHunterLightSensorForceFusion4241(Object obj, long j, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.putInt(obj, j, i);
    }

    public boolean FrostHunterLintTitanVortexQuantum9911() {
        Unsafe unsafe = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            FrostHunterLightSensorCosmosStorm9710.FrostHunterAlphaAnimationNeoCosmos5761(th);
            return false;
        }
    }

    public final long FrostHunterRemoteConfigSpeedSpeed8566(long j, Object obj) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.getLong(obj, j);
    }

    public final void FrostHunterScaleAnimationStrikeSpark5059(Object obj, long j, long j2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.putLong(obj, j, j2);
    }

    public abstract void FrostHunterServiceConnectionTurboPhoenixOmega6719(Object obj, long j, float f);

    public abstract double FrostHunterServiceEliteCelestialThunder1757(long j, Object obj);
}

package android.content.Context;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterLightSensorCosmosStorm9710 {
    public static final Unsafe FrostHunterAlphaAnimationNeoCosmos5761;
    public static final FrostHunterMotionEventPhantomRoguePrime5196 FrostHunterBundlePulseFusionHero2475;
    public static final Class FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final long FrostHunterLevelListDrawableFusionDragonHero2232;
    public static final boolean FrostHunterLifecycleBlazeGammaElite2889;
    public static final boolean FrostHunterRemoteConfigSpeedSpeed8566;
    public static final boolean FrostHunterServiceEliteCelestialThunder1757;

    static {
        Unsafe FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809();
        FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterFlowMaxDragonHero5809;
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterShapeAppearanceQuantumHeroSpark5567.FrostHunterAlphaAnimationNeoCosmos5761;
        boolean FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterCameraXPixelTurboCosmos9814(Long.TYPE);
        boolean FrostHunterCameraXPixelTurboCosmos98142 = FrostHunterCameraXPixelTurboCosmos9814(Integer.TYPE);
        char c = 1;
        int i = 0;
        FrostHunterMotionEventPhantomRoguePrime5196 frostHunterMotionEventPhantomRoguePrime5196 = null;
        if (FrostHunterFlowMaxDragonHero5809 != null) {
            if (!FrostHunterShapeAppearanceQuantumHeroSpark5567.FrostHunterAlphaAnimationNeoCosmos5761()) {
                frostHunterMotionEventPhantomRoguePrime5196 = new FrostHunterSensorManagerUltraSolar6019(FrostHunterFlowMaxDragonHero5809);
            } else if (FrostHunterCameraXPixelTurboCosmos9814) {
                frostHunterMotionEventPhantomRoguePrime5196 = new FrostHunterRoomDaoPhoenixSpectraHero3312(FrostHunterFlowMaxDragonHero5809, c == true ? 1 : 0);
            } else if (FrostHunterCameraXPixelTurboCosmos98142) {
                frostHunterMotionEventPhantomRoguePrime5196 = new FrostHunterRoomDaoPhoenixSpectraHero3312(FrostHunterFlowMaxDragonHero5809, i);
            }
        }
        FrostHunterBundlePulseFusionHero2475 = frostHunterMotionEventPhantomRoguePrime5196;
        FrostHunterServiceEliteCelestialThunder1757 = frostHunterMotionEventPhantomRoguePrime5196 == null ? false : frostHunterMotionEventPhantomRoguePrime5196.FrostHunterCameraXTurboCelestialHero5430();
        FrostHunterLifecycleBlazeGammaElite2889 = frostHunterMotionEventPhantomRoguePrime5196 == null ? false : frostHunterMotionEventPhantomRoguePrime5196.FrostHunterLintTitanVortexQuantum9911();
        FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterLifecycleBlazeGammaElite2889(byte[].class);
        FrostHunterLifecycleBlazeGammaElite2889(boolean[].class);
        FrostHunterLevelListDrawableFusionDragonHero2232(boolean[].class);
        FrostHunterLifecycleBlazeGammaElite2889(int[].class);
        FrostHunterLevelListDrawableFusionDragonHero2232(int[].class);
        FrostHunterLifecycleBlazeGammaElite2889(long[].class);
        FrostHunterLevelListDrawableFusionDragonHero2232(long[].class);
        FrostHunterLifecycleBlazeGammaElite2889(float[].class);
        FrostHunterLevelListDrawableFusionDragonHero2232(float[].class);
        FrostHunterLifecycleBlazeGammaElite2889(double[].class);
        FrostHunterLevelListDrawableFusionDragonHero2232(double[].class);
        FrostHunterLifecycleBlazeGammaElite2889(Object[].class);
        FrostHunterLevelListDrawableFusionDragonHero2232(Object[].class);
        Field FrostHunterRemoteConfigSpeedSpeed85662 = FrostHunterRemoteConfigSpeedSpeed8566();
        if (FrostHunterRemoteConfigSpeedSpeed85662 != null && frostHunterMotionEventPhantomRoguePrime5196 != null) {
            frostHunterMotionEventPhantomRoguePrime5196.FrostHunterFlowMaxDragonHero5809(FrostHunterRemoteConfigSpeedSpeed85662);
        }
        FrostHunterRemoteConfigSpeedSpeed8566 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void FrostHunterAlertDialogAuroraDelta3200(byte[] bArr, long j, byte b) {
        FrostHunterBundlePulseFusionHero2475.FrostHunterKeyframeGammaGamma1197(bArr, FrostHunterLevelListDrawableFusionDragonHero2232 + j, b);
    }

    public static void FrostHunterAlphaAnimationNeoCosmos5761(Throwable th) {
        Logger.getLogger(FrostHunterLightSensorCosmosStorm9710.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean FrostHunterBundlePulseFusionHero2475(long j, Object obj) {
        return ((byte) ((FrostHunterBundlePulseFusionHero2475.FrostHunterLevelListDrawableFusionDragonHero2232((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean FrostHunterCameraXPixelTurboCosmos9814(Class cls) {
        if (!FrostHunterShapeAppearanceQuantumHeroSpark5567.FrostHunterAlphaAnimationNeoCosmos5761()) {
            return false;
        }
        try {
            Class cls2 = FrostHunterConstraintSetCloneMasterUltraRogue2633;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(long j, Object obj) {
        return ((byte) ((FrostHunterBundlePulseFusionHero2475.FrostHunterLevelListDrawableFusionDragonHero2232((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static Unsafe FrostHunterFlowMaxDragonHero5809() {
        try {
            return (Unsafe) AccessController.doPrivileged(new FrostHunterAdapterVortexMaxSpeed1482());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void FrostHunterFragmentBetaMegaVortex6025(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        FrostHunterServiceConnectionTurboPhoenixOmega6719(obj, j2, ((255 & b) << i) | (FrostHunterBundlePulseFusionHero2475.FrostHunterLevelListDrawableFusionDragonHero2232(j2, obj) & (~(255 << i))));
    }

    public static void FrostHunterKeyframeGammaGamma1197(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterBundlePulseFusionHero2475.FrostHunterLevelListDrawableFusionDragonHero2232(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        FrostHunterServiceConnectionTurboPhoenixOmega6719(obj, j2, ((255 & b) << i) | (FrostHunterLevelListDrawableFusionDragonHero22322 & (~(255 << i))));
    }

    public static void FrostHunterLevelListDrawableFusionDragonHero2232(Class cls) {
        if (FrostHunterLifecycleBlazeGammaElite2889) {
            FrostHunterBundlePulseFusionHero2475.FrostHunterConstraintSetCloneMasterUltraRogue2633(cls);
        }
    }

    public static int FrostHunterLifecycleBlazeGammaElite2889(Class cls) {
        if (FrostHunterLifecycleBlazeGammaElite2889) {
            return FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761(cls);
        }
        return -1;
    }

    public static void FrostHunterLightSensorForceFusion4241(Object obj, long j, long j2) {
        FrostHunterBundlePulseFusionHero2475.FrostHunterScaleAnimationStrikeSpark5059(obj, j, j2);
    }

    public static Field FrostHunterRemoteConfigSpeedSpeed8566() {
        Field field;
        Field field2;
        if (FrostHunterShapeAppearanceQuantumHeroSpark5567.FrostHunterAlphaAnimationNeoCosmos5761()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static void FrostHunterScaleAnimationStrikeSpark5059(long j, Object obj, Object obj2) {
        FrostHunterBundlePulseFusionHero2475.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(j, obj, obj2);
    }

    public static void FrostHunterServiceConnectionTurboPhoenixOmega6719(Object obj, long j, int i) {
        FrostHunterBundlePulseFusionHero2475.FrostHunterLightSensorForceFusion4241(obj, j, i);
    }

    public static Object FrostHunterServiceEliteCelestialThunder1757(Class cls) {
        try {
            return FrostHunterAlphaAnimationNeoCosmos5761.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }
}

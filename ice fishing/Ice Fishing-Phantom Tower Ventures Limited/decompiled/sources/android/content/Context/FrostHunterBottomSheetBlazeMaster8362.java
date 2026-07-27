package android.content.Context;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBottomSheetBlazeMaster8362 extends Handler {
    public final /* synthetic */ FrostHunterTransitionRogueDelta1533 FrostHunterAlphaAnimationNeoCosmos5761;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterBottomSheetBlazeMaster8362(FrostHunterTransitionRogueDelta1533 frostHunterTransitionRogueDelta1533, Looper looper) {
        super(looper);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTransitionRogueDelta1533;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        FrostHunterTransitionRogueDelta1533 frostHunterTransitionRogueDelta1533 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i = message.what;
        FrostHunterLooperSolarDragon9122 frostHunterLooperSolarDragon9122 = null;
        if (i == 1) {
            FrostHunterLooperSolarDragon9122 frostHunterLooperSolarDragon91222 = (FrostHunterLooperSolarDragon9122) message.obj;
            try {
                frostHunterTransitionRogueDelta1533.FrostHunterCameraXPixelTurboCosmos9814.queueInputBuffer(frostHunterLooperSolarDragon91222.FrostHunterAlphaAnimationNeoCosmos5761, 0, frostHunterLooperSolarDragon91222.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterLooperSolarDragon91222.FrostHunterServiceEliteCelestialThunder1757, frostHunterLooperSolarDragon91222.FrostHunterLifecycleBlazeGammaElite2889);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = frostHunterTransitionRogueDelta1533.FrostHunterKeyframeGammaGamma1197;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            frostHunterLooperSolarDragon9122 = frostHunterLooperSolarDragon91222;
        } else if (i == 2) {
            FrostHunterLooperSolarDragon9122 frostHunterLooperSolarDragon91223 = (FrostHunterLooperSolarDragon9122) message.obj;
            int i2 = frostHunterLooperSolarDragon91223.FrostHunterAlphaAnimationNeoCosmos5761;
            MediaCodec.CryptoInfo cryptoInfo = frostHunterLooperSolarDragon91223.FrostHunterBundlePulseFusionHero2475;
            long j = frostHunterLooperSolarDragon91223.FrostHunterServiceEliteCelestialThunder1757;
            int i3 = frostHunterLooperSolarDragon91223.FrostHunterLifecycleBlazeGammaElite2889;
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    frostHunterTransitionRogueDelta1533.FrostHunterCameraXPixelTurboCosmos9814.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                } else {
                    synchronized (FrostHunterTransitionRogueDelta1533.FrostHunterScaleAnimationStrikeSpark5059) {
                        frostHunterTransitionRogueDelta1533.FrostHunterCameraXPixelTurboCosmos9814.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = frostHunterTransitionRogueDelta1533.FrostHunterKeyframeGammaGamma1197;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            frostHunterLooperSolarDragon9122 = frostHunterLooperSolarDragon91223;
        } else if (i == 3) {
            frostHunterTransitionRogueDelta1533.FrostHunterFragmentBetaMegaVortex6025.FrostHunterBundlePulseFusionHero2475();
        } else if (i != 4) {
            AtomicReference atomicReference3 = frostHunterTransitionRogueDelta1533.FrostHunterKeyframeGammaGamma1197;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                frostHunterTransitionRogueDelta1533.FrostHunterCameraXPixelTurboCosmos9814.setParameters((Bundle) message.obj);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference4 = frostHunterTransitionRogueDelta1533.FrostHunterKeyframeGammaGamma1197;
                while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                }
            }
        }
        if (frostHunterLooperSolarDragon9122 != null) {
            ArrayDeque arrayDeque = FrostHunterTransitionRogueDelta1533.FrostHunterLightSensorForceFusion4241;
            synchronized (arrayDeque) {
                arrayDeque.add(frostHunterLooperSolarDragon9122);
            }
        }
    }
}

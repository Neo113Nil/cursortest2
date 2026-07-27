package android.content.Context;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDataBindingNovaXMax2962 implements ServiceConnection {
    public int FrostHunterAlphaAnimationNeoCosmos5761 = 0;
    public FrostHunterProximitySensorEpicSolar3138 FrostHunterBundlePulseFusionHero2475;
    public final Messenger FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final /* synthetic */ FrostHunterCardViewFusionHeroSpectra3749 FrostHunterLevelListDrawableFusionDragonHero2232;
    public final SparseArray FrostHunterLifecycleBlazeGammaElite2889;
    public final ArrayDeque FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterDataBindingNovaXMax2962(FrostHunterCardViewFusionHeroSpectra3749 frostHunterCardViewFusionHeroSpectra3749) {
        this.FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterCardViewFusionHeroSpectra3749;
        FrostHunterValueAnimatorHyperNebulaUltra9912 frostHunterValueAnimatorHyperNebulaUltra9912 = new FrostHunterValueAnimatorHyperNebulaUltra9912(Looper.getMainLooper(), new FrostHunterLaunchVortexStrike8895(0, this));
        Looper.getMainLooper();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = new Messenger(frostHunterValueAnimatorHyperNebulaUltra9912);
        this.FrostHunterServiceEliteCelestialThunder1757 = new ArrayDeque();
        this.FrostHunterLifecycleBlazeGammaElite2889 = new SparseArray();
    }

    public final synchronized void FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        FrostHunterConstraintSetCloneMasterUltraRogue2633(str, null);
    }

    public final synchronized void FrostHunterBundlePulseFusionHero2475() {
        if (this.FrostHunterAlphaAnimationNeoCosmos5761 == 2 && this.FrostHunterServiceEliteCelestialThunder1757.isEmpty() && this.FrostHunterLifecycleBlazeGammaElite2889.size() == 0) {
            this.FrostHunterAlphaAnimationNeoCosmos5761 = 3;
            FrostHunterLayoutInflaterTurboHyperion3832.FrostHunterCameraXPixelTurboCosmos9814().FrostHunterScaleAnimationStrikeSpark5059((Context) this.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterConstraintSetCloneMasterUltraRogue2633, this);
        }
    }

    public final synchronized void FrostHunterConstraintSetCloneMasterUltraRogue2633(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.FrostHunterAlphaAnimationNeoCosmos5761 = 4;
                return;
            }
            this.FrostHunterAlphaAnimationNeoCosmos5761 = 4;
            FrostHunterLayoutInflaterTurboHyperion3832.FrostHunterCameraXPixelTurboCosmos9814().FrostHunterScaleAnimationStrikeSpark5059((Context) this.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterConstraintSetCloneMasterUltraRogue2633, this);
            FrostHunterRotateAnimationSpectraPhoenixPhantom3899 frostHunterRotateAnimationSpectraPhoenixPhantom3899 = new FrostHunterRotateAnimationSpectraPhoenixPhantom3899(str, securityException);
            Iterator it = this.FrostHunterServiceEliteCelestialThunder1757.iterator();
            while (it.hasNext()) {
                ((FrostHunterShapeAppearanceNebulaAurora4980) it.next()).FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterRotateAnimationSpectraPhoenixPhantom3899);
            }
            this.FrostHunterServiceEliteCelestialThunder1757.clear();
            int i2 = 0;
            while (true) {
                int size = this.FrostHunterLifecycleBlazeGammaElite2889.size();
                SparseArray sparseArray = this.FrostHunterLifecycleBlazeGammaElite2889;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((FrostHunterShapeAppearanceNebulaAurora4980) sparseArray.valueAt(i2)).FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterRotateAnimationSpectraPhoenixPhantom3899);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean FrostHunterServiceEliteCelestialThunder1757(FrostHunterShapeAppearanceNebulaAurora4980 frostHunterShapeAppearanceNebulaAurora4980) {
        FrostHunterDataBindingNovaXMax2962 frostHunterDataBindingNovaXMax2962;
        Throwable th;
        FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterCameraXPixelTurboCosmos9814;
        try {
            try {
                int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
                if (i != 0) {
                    try {
                        if (i == 1) {
                            this.FrostHunterServiceEliteCelestialThunder1757.add(frostHunterShapeAppearanceNebulaAurora4980);
                            return true;
                        }
                        int i2 = 0;
                        if (i != 2) {
                            return false;
                        }
                        this.FrostHunterServiceEliteCelestialThunder1757.add(frostHunterShapeAppearanceNebulaAurora4980);
                        ((ScheduledExecutorService) this.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterBundlePulseFusionHero2475).execute(new FrostHunterDelayQuantumEliteNeo8679(this, i2));
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        frostHunterDataBindingNovaXMax2962 = this;
                    }
                } else {
                    this.FrostHunterServiceEliteCelestialThunder1757.add(frostHunterShapeAppearanceNebulaAurora4980);
                    try {
                        if (this.FrostHunterAlphaAnimationNeoCosmos5761 == 0) {
                            this.FrostHunterAlphaAnimationNeoCosmos5761 = 1;
                            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                            intent.setPackage("com.google.android.gms");
                            try {
                                FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterLayoutInflaterTurboHyperion3832.FrostHunterCameraXPixelTurboCosmos9814();
                            } catch (SecurityException e) {
                                e = e;
                                frostHunterDataBindingNovaXMax2962 = this;
                            }
                            try {
                                Context context = (Context) this.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                try {
                                    frostHunterDataBindingNovaXMax2962 = this;
                                    try {
                                        try {
                                            if (FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLintTitanVortexQuantum9911(context, context.getClass().getName(), intent, frostHunterDataBindingNovaXMax2962, 1, null)) {
                                                ((ScheduledExecutorService) frostHunterDataBindingNovaXMax2962.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterBundlePulseFusionHero2475).schedule(new FrostHunterDelayQuantumEliteNeo8679(frostHunterDataBindingNovaXMax2962, 1), 30L, TimeUnit.SECONDS);
                                            } else {
                                                frostHunterDataBindingNovaXMax2962.FrostHunterAlphaAnimationNeoCosmos5761("Unable to bind to service");
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (SecurityException e2) {
                                        e = e2;
                                        frostHunterDataBindingNovaXMax2962.FrostHunterConstraintSetCloneMasterUltraRogue2633("Unable to bind to service", e);
                                        return true;
                                    }
                                    return true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    frostHunterDataBindingNovaXMax2962 = this;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                frostHunterDataBindingNovaXMax2962 = this;
                            }
                        } else {
                            frostHunterDataBindingNovaXMax2962 = this;
                            try {
                                throw new IllegalStateException();
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                    th = th;
                }
            } catch (Throwable th8) {
                th = th8;
                th = th;
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            frostHunterDataBindingNovaXMax2962 = this;
            th = th;
            throw th;
        }
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterBundlePulseFusionHero2475).execute(new FrostHunterDrawableSparkSparkSolar5692(0, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterBundlePulseFusionHero2475).execute(new FrostHunterDelayQuantumEliteNeo8679(this, 2));
    }
}

package android.content.Context;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterLaunchVortexStrike8895 implements Handler.Callback {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterLaunchVortexStrike8895(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = message.arg1;
                FrostHunterDataBindingNovaXMax2962 frostHunterDataBindingNovaXMax2962 = (FrostHunterDataBindingNovaXMax2962) this.FrostHunterFlowMaxDragonHero5809;
                synchronized (frostHunterDataBindingNovaXMax2962) {
                    try {
                        FrostHunterShapeAppearanceNebulaAurora4980 frostHunterShapeAppearanceNebulaAurora4980 = (FrostHunterShapeAppearanceNebulaAurora4980) frostHunterDataBindingNovaXMax2962.FrostHunterLifecycleBlazeGammaElite2889.get(i);
                        if (frostHunterShapeAppearanceNebulaAurora4980 != null) {
                            frostHunterDataBindingNovaXMax2962.FrostHunterLifecycleBlazeGammaElite2889.remove(i);
                            frostHunterDataBindingNovaXMax2962.FrostHunterBundlePulseFusionHero2475();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (frostHunterShapeAppearanceNebulaAurora4980.FrostHunterLifecycleBlazeGammaElite2889) {
                                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                        if (!data.getBoolean("ack", false)) {
                                            frostHunterShapeAppearanceNebulaAurora4980.FrostHunterConstraintSetCloneMasterUltraRogue2633(new FrostHunterRotateAnimationSpectraPhoenixPhantom3899("Invalid response to one way request", null));
                                            break;
                                        } else {
                                            if (Log.isLoggable("MessengerIpcClient", 3)) {
                                                frostHunterShapeAppearanceNebulaAurora4980.toString();
                                            }
                                            frostHunterShapeAppearanceNebulaAurora4980.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(null);
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                                            frostHunterShapeAppearanceNebulaAurora4980.toString();
                                            String.valueOf(bundle);
                                        }
                                        frostHunterShapeAppearanceNebulaAurora4980.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761(bundle);
                                        break;
                                }
                            } else {
                                frostHunterShapeAppearanceNebulaAurora4980.FrostHunterConstraintSetCloneMasterUltraRogue2633(new FrostHunterRotateAnimationSpectraPhoenixPhantom3899("Not supported by GmsCore", null));
                            }
                        }
                    } finally {
                    }
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 0) {
                    synchronized (((FrostHunterTextRecognitionNebulaUltraHero1792) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761) {
                        try {
                            FrostHunterDebugHyperionMega2950 frostHunterDebugHyperionMega2950 = (FrostHunterDebugHyperionMega2950) message.obj;
                            FrostHunterContentResolverForceVortex3863 frostHunterContentResolverForceVortex3863 = (FrostHunterContentResolverForceVortex3863) ((FrostHunterTextRecognitionNebulaUltraHero1792) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761.get(frostHunterDebugHyperionMega2950);
                            if (frostHunterContentResolverForceVortex3863 != null && frostHunterContentResolverForceVortex3863.FrostHunterAlphaAnimationNeoCosmos5761.isEmpty()) {
                                if (frostHunterContentResolverForceVortex3863.FrostHunterBundlePulseFusionHero2475) {
                                    frostHunterContentResolverForceVortex3863.FrostHunterRemoteConfigSpeedSpeed8566.FrostHunterBundlePulseFusionHero2475.removeMessages(1, frostHunterContentResolverForceVortex3863.FrostHunterLifecycleBlazeGammaElite2889);
                                    FrostHunterTextRecognitionNebulaUltraHero1792 frostHunterTextRecognitionNebulaUltraHero1792 = frostHunterContentResolverForceVortex3863.FrostHunterRemoteConfigSpeedSpeed8566;
                                    frostHunterTextRecognitionNebulaUltraHero1792.FrostHunterServiceEliteCelestialThunder1757.FrostHunterScaleAnimationStrikeSpark5059(frostHunterTextRecognitionNebulaUltraHero1792.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterContentResolverForceVortex3863);
                                    frostHunterContentResolverForceVortex3863.FrostHunterBundlePulseFusionHero2475 = false;
                                    frostHunterContentResolverForceVortex3863.FrostHunterConstraintSetCloneMasterUltraRogue2633 = 2;
                                }
                                ((FrostHunterTextRecognitionNebulaUltraHero1792) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761.remove(frostHunterDebugHyperionMega2950);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                if (i2 != 1) {
                    return false;
                }
                synchronized (((FrostHunterTextRecognitionNebulaUltraHero1792) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761) {
                    try {
                        FrostHunterDebugHyperionMega2950 frostHunterDebugHyperionMega29502 = (FrostHunterDebugHyperionMega2950) message.obj;
                        FrostHunterContentResolverForceVortex3863 frostHunterContentResolverForceVortex38632 = (FrostHunterContentResolverForceVortex3863) ((FrostHunterTextRecognitionNebulaUltraHero1792) this.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761.get(frostHunterDebugHyperionMega29502);
                        if (frostHunterContentResolverForceVortex38632 != null && frostHunterContentResolverForceVortex38632.FrostHunterConstraintSetCloneMasterUltraRogue2633 == 3) {
                            String.valueOf(frostHunterDebugHyperionMega29502);
                            new Exception();
                            ComponentName componentName2 = frostHunterContentResolverForceVortex38632.FrostHunterLevelListDrawableFusionDragonHero2232;
                            if (componentName2 == null) {
                                frostHunterDebugHyperionMega29502.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = frostHunterDebugHyperionMega29502.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            frostHunterContentResolverForceVortex38632.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }
}

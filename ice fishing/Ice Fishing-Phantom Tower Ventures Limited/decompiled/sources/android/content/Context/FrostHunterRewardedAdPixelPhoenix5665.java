package android.content.Context;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRewardedAdPixelPhoenix5665 implements FrostHunterFragmentCyberGammaDragon1939 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterRewardedAdPixelPhoenix5665(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // android.content.Context.FrostHunterFragmentCyberGammaDragon1939
    public final void FrostHunterAlertDialogAuroraDelta3200(FrostHunterNotificationSpectraTurbo8770 frostHunterNotificationSpectraTurbo8770, FrostHunterMaterialCardViewLegendDragon2868 frostHunterMaterialCardViewLegendDragon2868) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterTimerPixelAurora2235 frostHunterTimerPixelAurora2235 = (FrostHunterTimerPixelAurora2235) obj;
                if (frostHunterMaterialCardViewLegendDragon2868 != FrostHunterMaterialCardViewLegendDragon2868.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                frostHunterNotificationSpectraTurbo8770.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterLevelListDrawableFusionDragonHero2232(this);
                Bundle FrostHunterFlowMaxDragonHero5809 = frostHunterTimerPixelAurora2235.FrostHunterConstraintSetCloneMasterUltraRogue2633().FrostHunterFlowMaxDragonHero5809("androidx.savedstate.Restarter");
                if (FrostHunterFlowMaxDragonHero5809 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = FrostHunterFlowMaxDragonHero5809.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, FrostHunterRewardedAdPixelPhoenix5665.class.getClassLoader()).asSubclass(FrostHunterConstraintSetCloneOmegaAlphaTitan4505.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(frostHunterTimerPixelAurora2235 instanceof FrostHunterFragmentManagerOlympianNovaAlpha1516)) {
                                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterTimerPixelAurora2235, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                FrostHunterPropertyValuesHolderMaxSpeed2945 FrostHunterLevelListDrawableFusionDragonHero2232 = ((FrostHunterFragmentManagerOlympianNovaAlpha1516) frostHunterTimerPixelAurora2235).FrostHunterLevelListDrawableFusionDragonHero2232();
                                FrostHunterKotlinQuantumRogue5892 FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterTimerPixelAurora2235.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                                FrostHunterLevelListDrawableFusionDragonHero2232.getClass();
                                LinkedHashMap linkedHashMap = FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterAlphaAnimationNeoCosmos5761;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    FrostHunterFragmentCosmosSolar3628 frostHunterFragmentCosmosSolar3628 = (FrostHunterFragmentCosmosSolar3628) linkedHashMap.get(str3);
                                    if (frostHunterFragmentCosmosSolar3628 != null) {
                                        FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterLevelListDrawableFusionDragonHero2232(frostHunterFragmentCosmosSolar3628, FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterTimerPixelAurora2235.FrostHunterRemoteConfigSpeedSpeed8566());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterMotionSceneAuroraMega2271();
                                }
                            } catch (Exception e) {
                                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterKeyframeGammaGamma1197("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterKeyframeGammaGamma1197("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i3 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                if (componentActivity.FrostHunterFragmentBetaMegaVortex6025 == null) {
                    FrostHunterVectorDrawableCosmosHyperPrime4312 frostHunterVectorDrawableCosmosHyperPrime4312 = (FrostHunterVectorDrawableCosmosHyperPrime4312) componentActivity.getLastNonConfigurationInstance();
                    if (frostHunterVectorDrawableCosmosHyperPrime4312 != null) {
                        componentActivity.FrostHunterFragmentBetaMegaVortex6025 = frostHunterVectorDrawableCosmosHyperPrime4312.FrostHunterAlphaAnimationNeoCosmos5761;
                    }
                    if (componentActivity.FrostHunterFragmentBetaMegaVortex6025 == null) {
                        componentActivity.FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterPropertyValuesHolderMaxSpeed2945();
                    }
                }
                componentActivity.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterLevelListDrawableFusionDragonHero2232(this);
                return;
            case 2:
                new HashMap();
                FrostHunterStrictModeVortexDragonPhoenix7996[] frostHunterStrictModeVortexDragonPhoenix7996Arr = (FrostHunterStrictModeVortexDragonPhoenix7996[]) obj;
                if (frostHunterStrictModeVortexDragonPhoenix7996Arr.length > 0) {
                    FrostHunterStrictModeVortexDragonPhoenix7996 frostHunterStrictModeVortexDragonPhoenix7996 = frostHunterStrictModeVortexDragonPhoenix7996Arr[0];
                    throw null;
                }
                if (frostHunterStrictModeVortexDragonPhoenix7996Arr.length <= 0) {
                    return;
                }
                FrostHunterStrictModeVortexDragonPhoenix7996 frostHunterStrictModeVortexDragonPhoenix79962 = frostHunterStrictModeVortexDragonPhoenix7996Arr[0];
                throw null;
            default:
                if (frostHunterMaterialCardViewLegendDragon2868 != FrostHunterMaterialCardViewLegendDragon2868.ON_CREATE) {
                    FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterServiceConnectionTurboPhoenixOmega6719(frostHunterMaterialCardViewLegendDragon2868, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    frostHunterNotificationSpectraTurbo8770.FrostHunterRemoteConfigSpeedSpeed8566().FrostHunterLevelListDrawableFusionDragonHero2232(this);
                    ((FrostHunterStorageFusionHyperion4662) obj).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                    return;
                }
        }
    }
}

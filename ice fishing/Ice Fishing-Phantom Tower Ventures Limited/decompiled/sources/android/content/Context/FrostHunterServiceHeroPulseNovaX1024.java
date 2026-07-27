package android.content.Context;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterServiceHeroPulseNovaX1024 implements FrostHunterAccelerometerPulseTitaniumMaster6945 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ Object FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterServiceHeroPulseNovaX1024(int i, Object obj) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    @Override // android.content.Context.FrostHunterAccelerometerPulseTitaniumMaster6945
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle FrostHunterAlphaAnimationNeoCosmos5761() {
        char c;
        long j;
        long j2;
        long j3;
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275;
        Map map;
        int i;
        int i2;
        char c2;
        long j4;
        FrostHunterLaunchHeroForce4010[] frostHunterLaunchHeroForce4010Arr;
        int i3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        int i4 = 0;
        Object obj = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        switch (i3) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i5 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                Bundle bundle = new Bundle();
                FrostHunterChipNebulaCyberThunder6252 frostHunterChipNebulaCyberThunder6252 = ((ComponentActivity) obj).FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                frostHunterChipNebulaCyberThunder6252.getClass();
                LinkedHashMap linkedHashMap = frostHunterChipNebulaCyberThunder6252.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(frostHunterChipNebulaCyberThunder6252.FrostHunterServiceEliteCelestialThunder1757));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(frostHunterChipNebulaCyberThunder6252.FrostHunterRemoteConfigSpeedSpeed8566));
                return bundle;
            case 1:
                FrostHunterLinearLayoutNeoSpectraEclipse6191 frostHunterLinearLayoutNeoSpectraEclipse6191 = (FrostHunterLinearLayoutNeoSpectraEclipse6191) obj;
                FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder22752 = frostHunterLinearLayoutNeoSpectraEclipse6191.FrostHunterAlphaAnimationNeoCosmos5761;
                if (frostHunterToastHyperTitanThunder22752 == null && frostHunterLinearLayoutNeoSpectraEclipse6191.FrostHunterConstraintSetCloneMasterUltraRogue2633 == null) {
                    map = FrostHunterLayoutInfernoStrike4529.FrostHunterCameraXPixelTurboCosmos9814;
                } else {
                    int i6 = frostHunterToastHyperTitanThunder22752 != null ? frostHunterToastHyperTitanThunder22752.FrostHunterLifecycleBlazeGammaElite2889 : 0;
                    FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder22753 = frostHunterLinearLayoutNeoSpectraEclipse6191.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    HashMap hashMap = new HashMap(i6 + (frostHunterToastHyperTitanThunder22753 != null ? frostHunterToastHyperTitanThunder22753.FrostHunterLifecycleBlazeGammaElite2889 : 0));
                    char c3 = 7;
                    long j5 = -9187201950435737472L;
                    int i7 = 8;
                    if (frostHunterToastHyperTitanThunder22752 != null) {
                        Object[] objArr = frostHunterToastHyperTitanThunder22752.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        Object[] objArr2 = frostHunterToastHyperTitanThunder22752.FrostHunterBundlePulseFusionHero2475;
                        long[] jArr = frostHunterToastHyperTitanThunder22752.FrostHunterAlphaAnimationNeoCosmos5761;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            j2 = 128;
                            while (true) {
                                long j6 = jArr[i8];
                                j3 = 255;
                                if ((((~j6) << c3) & j6 & j5) != j5) {
                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                    int i10 = 0;
                                    while (i10 < i9) {
                                        if ((j6 & 255) < 128) {
                                            int i11 = (i8 << 3) + i10;
                                            c2 = c3;
                                            j4 = j5;
                                            hashMap.put((String) objArr[i11], (List) objArr2[i11]);
                                        } else {
                                            c2 = c3;
                                            j4 = j5;
                                        }
                                        j6 >>= 8;
                                        i10++;
                                        c3 = c2;
                                        j5 = j4;
                                    }
                                    c = c3;
                                    j = j5;
                                    if (i9 != 8) {
                                    }
                                } else {
                                    c = c3;
                                    j = j5;
                                }
                                if (i8 != length) {
                                    i8++;
                                    c3 = c;
                                    j5 = j;
                                }
                            }
                            frostHunterToastHyperTitanThunder2275 = frostHunterLinearLayoutNeoSpectraEclipse6191.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                            if (frostHunterToastHyperTitanThunder2275 != null) {
                                Object[] objArr3 = frostHunterToastHyperTitanThunder2275.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                Object[] objArr4 = frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475;
                                long[] jArr2 = frostHunterToastHyperTitanThunder2275.FrostHunterAlphaAnimationNeoCosmos5761;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i12 = 0;
                                    while (true) {
                                        long j7 = jArr2[i12];
                                        if ((((~j7) << c) & j7 & j) != j) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = i4;
                                            while (i14 < i13) {
                                                if ((j7 & j3) < j2) {
                                                    int i15 = (i12 << 3) + i14;
                                                    Object obj2 = objArr3[i15];
                                                    List list = (List) objArr4[i15];
                                                    String str = (String) obj2;
                                                    if (list.size() == 1) {
                                                        Object FrostHunterConstraintSetCloneMasterUltraRogue2633 = ((FrostHunterNotificationGammaBlazePhoenix7595) list.get(i4)).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                                                        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != null) {
                                                            if (!FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                                                                throw new IllegalStateException(FrostHunterPaintCyberPulse5979.FrostHunterMeteringPointBetaCyber9571(FrostHunterConstraintSetCloneMasterUltraRogue2633).toString());
                                                            }
                                                            hashMap.put(str, FrostHunterCardViewHyperionAurora3829.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterConstraintSetCloneMasterUltraRogue2633));
                                                        }
                                                    } else {
                                                        int size = list.size();
                                                        ArrayList arrayList = new ArrayList(size);
                                                        while (i4 < size) {
                                                            int i16 = i7;
                                                            Object FrostHunterConstraintSetCloneMasterUltraRogue26332 = ((FrostHunterNotificationGammaBlazePhoenix7595) list.get(i4)).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                                                            if (FrostHunterConstraintSetCloneMasterUltraRogue26332 != null && !FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterFlowMaxDragonHero5809(FrostHunterConstraintSetCloneMasterUltraRogue26332)) {
                                                                throw new IllegalStateException(FrostHunterPaintCyberPulse5979.FrostHunterMeteringPointBetaCyber9571(FrostHunterConstraintSetCloneMasterUltraRogue26332).toString());
                                                            }
                                                            arrayList.add(FrostHunterConstraintSetCloneMasterUltraRogue26332);
                                                            i4++;
                                                            i7 = i16;
                                                        }
                                                        i2 = i7;
                                                        hashMap.put(str, arrayList);
                                                        j7 >>= i2;
                                                        i14++;
                                                        i7 = i2;
                                                        i4 = 0;
                                                    }
                                                }
                                                i2 = i7;
                                                j7 >>= i2;
                                                i14++;
                                                i7 = i2;
                                                i4 = 0;
                                            }
                                            i = i7;
                                            if (i13 != i) {
                                            }
                                        } else {
                                            i = i7;
                                        }
                                        if (i12 != length2) {
                                            i12++;
                                            i7 = i;
                                            i4 = 0;
                                        }
                                    }
                                }
                            }
                            map = hashMap;
                        }
                    }
                    c = 7;
                    j = -9187201950435737472L;
                    j2 = 128;
                    j3 = 255;
                    frostHunterToastHyperTitanThunder2275 = frostHunterLinearLayoutNeoSpectraEclipse6191.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    if (frostHunterToastHyperTitanThunder2275 != null) {
                    }
                    map = hashMap;
                }
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str2, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
                }
                return bundle2;
            default:
                FrostHunterOnItemLongClickListenerRogueDeltaStrike7658 frostHunterOnItemLongClickListenerRogueDeltaStrike7658 = (FrostHunterOnItemLongClickListenerRogueDeltaStrike7658) obj;
                for (Map.Entry entry2 : FrostHunterBroadcastHeroSpectra7879.FrostHunterNestedScrollViewPixelPhantom8605((LinkedHashMap) frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterKeyframeGammaGamma1197).entrySet()) {
                    frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterDialogFragmentTurboPhoenixDragon7627(((FrostHunterPreviewPixelBetaQuantum7840) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : FrostHunterBroadcastHeroSpectra7879.FrostHunterNestedScrollViewPixelPhantom8605((LinkedHashMap) frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterFlowMaxDragonHero5809).entrySet()) {
                    frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterDialogFragmentTurboPhoenixDragon7627(((FrostHunterAccelerometerPulseTitaniumMaster6945) entry3.getValue()).FrostHunterAlphaAnimationNeoCosmos5761(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) frostHunterOnItemLongClickListenerRogueDeltaStrike7658.FrostHunterCameraXPixelTurboCosmos9814;
                if (linkedHashMap2.isEmpty()) {
                    frostHunterLaunchHeroForce4010Arr = new FrostHunterLaunchHeroForce4010[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList2.add(new FrostHunterLaunchHeroForce4010((String) entry4.getKey(), entry4.getValue()));
                    }
                    frostHunterLaunchHeroForce4010Arr = (FrostHunterLaunchHeroForce4010[]) arrayList2.toArray(new FrostHunterLaunchHeroForce4010[0]);
                }
                return FrostHunterVectorDrawableForceMax1351.FrostHunterAlertDialogAuroraDelta3200((FrostHunterLaunchHeroForce4010[]) Arrays.copyOf(frostHunterLaunchHeroForce4010Arr, frostHunterLaunchHeroForce4010Arr.length));
        }
    }
}

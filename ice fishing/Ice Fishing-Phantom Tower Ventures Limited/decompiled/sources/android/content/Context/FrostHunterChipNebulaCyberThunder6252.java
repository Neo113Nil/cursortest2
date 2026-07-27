package android.content.Context;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterChipNebulaCyberThunder6252 {
    public final /* synthetic */ ComponentActivity FrostHunterCameraXPixelTurboCosmos9814;
    public final LinkedHashMap FrostHunterAlphaAnimationNeoCosmos5761 = new LinkedHashMap();
    public final LinkedHashMap FrostHunterConstraintSetCloneMasterUltraRogue2633 = new LinkedHashMap();
    public final LinkedHashMap FrostHunterBundlePulseFusionHero2475 = new LinkedHashMap();
    public final ArrayList FrostHunterServiceEliteCelestialThunder1757 = new ArrayList();
    public final transient LinkedHashMap FrostHunterLifecycleBlazeGammaElite2889 = new LinkedHashMap();
    public final LinkedHashMap FrostHunterLevelListDrawableFusionDragonHero2232 = new LinkedHashMap();
    public final Bundle FrostHunterRemoteConfigSpeedSpeed8566 = new Bundle();

    public FrostHunterChipNebulaCyberThunder6252(ComponentActivity componentActivity) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = componentActivity;
    }

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(int i, int i2, Intent intent) {
        String str = (String) this.FrostHunterAlphaAnimationNeoCosmos5761.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        FrostHunterTextViewMaxSparkHyper5316 frostHunterTextViewMaxSparkHyper5316 = (FrostHunterTextViewMaxSparkHyper5316) this.FrostHunterLifecycleBlazeGammaElite2889.get(str);
        if ((frostHunterTextViewMaxSparkHyper5316 != null ? frostHunterTextViewMaxSparkHyper5316.FrostHunterAlphaAnimationNeoCosmos5761 : null) != null) {
            ArrayList arrayList = this.FrostHunterServiceEliteCelestialThunder1757;
            if (arrayList.contains(str)) {
                frostHunterTextViewMaxSparkHyper5316.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterTextViewMaxSparkHyper5316.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterRewardedAdSpectraElite8288(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.FrostHunterLevelListDrawableFusionDragonHero2232.remove(str);
        this.FrostHunterRemoteConfigSpeedSpeed8566.putParcelable(str, new FrostHunterRealtimeDatabasePulseStormOlympian4721(intent, i2));
        return true;
    }

    public final void FrostHunterBundlePulseFusionHero2475(String str) {
        LinkedHashMap linkedHashMap = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        FrostHunterNavigationViewSpectraBlazeOmega1546 frostHunterNavigationViewSpectraBlazeOmega1546 = new FrostHunterNavigationViewSpectraBlazeOmega1546(0);
        Iterator it = new FrostHunterCameraXNovaCelestialCelestial7906(new FrostHunterThemeOverlayNovaXMaster6614(frostHunterNavigationViewSpectraBlazeOmega1546, new FrostHunterDatabaseMasterPrimeSpeed8049(19, frostHunterNavigationViewSpectraBlazeOmega1546), 1)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i, FrostHunterTransitionGammaTitanSpeed7178 frostHunterTransitionGammaTitanSpeed7178, Object obj) {
        Bundle bundle;
        int i2;
        ComponentActivity componentActivity = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterViewPhantomNeo1634 = frostHunterTransitionGammaTitanSpeed7178.FrostHunterViewPhantomNeo1634(componentActivity, obj);
        int i3 = 0;
        if (FrostHunterViewPhantomNeo1634 != null) {
            new Handler(Looper.getMainLooper()).post(new FrostHunterPaintVortexMax7729(i, i3, this, FrostHunterViewPhantomNeo1634));
            return;
        }
        Intent FrostHunterMotionSceneAuroraMega2271 = frostHunterTransitionGammaTitanSpeed7178.FrostHunterMotionSceneAuroraMega2271(componentActivity, obj);
        if (FrostHunterMotionSceneAuroraMega2271.getExtras() != null) {
            Bundle extras = FrostHunterMotionSceneAuroraMega2271.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                FrostHunterMotionSceneAuroraMega2271.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (FrostHunterMotionSceneAuroraMega2271.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = FrostHunterMotionSceneAuroraMega2271.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            FrostHunterMotionSceneAuroraMega2271.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(FrostHunterMotionSceneAuroraMega2271.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(FrostHunterMotionSceneAuroraMega2271.getAction())) {
                componentActivity.startActivityForResult(FrostHunterMotionSceneAuroraMega2271, i, bundle2);
                return;
            }
            FrostHunterKotlinNebulaSpectraOlympian6969 frostHunterKotlinNebulaSpectraOlympian6969 = (FrostHunterKotlinNebulaSpectraOlympian6969) FrostHunterMotionSceneAuroraMega2271.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                frostHunterKotlinNebulaSpectraOlympian6969.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                componentActivity.startIntentSenderForResult(frostHunterKotlinNebulaSpectraOlympian6969.FrostHunterCameraXPixelTurboCosmos9814, i2, frostHunterKotlinNebulaSpectraOlympian6969.FrostHunterFlowMaxDragonHero5809, frostHunterKotlinNebulaSpectraOlympian6969.FrostHunterAlertDialogAuroraDelta3200, frostHunterKotlinNebulaSpectraOlympian6969.FrostHunterKeyframeGammaGamma1197, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new FrostHunterPaintVortexMax7729(i2, 1, this, e));
                return;
            }
        }
        String[] stringArrayExtra = FrostHunterMotionSceneAuroraMega2271.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
            if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i5 = 0;
            while (i3 < stringArrayExtra.length) {
                if (!hashSet.contains(Integer.valueOf(i3))) {
                    strArr[i5] = stringArrayExtra[i3];
                    i5++;
                }
                i3++;
            }
        }
        componentActivity.requestPermissions(stringArrayExtra, i);
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(String str) {
        Integer num;
        str.getClass();
        if (!this.FrostHunterServiceEliteCelestialThunder1757.contains(str) && (num = (Integer) this.FrostHunterConstraintSetCloneMasterUltraRogue2633.remove(str)) != null) {
            this.FrostHunterAlphaAnimationNeoCosmos5761.remove(num);
        }
        this.FrostHunterLifecycleBlazeGammaElite2889.remove(str);
        LinkedHashMap linkedHashMap = this.FrostHunterLevelListDrawableFusionDragonHero2232;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.FrostHunterRemoteConfigSpeedSpeed8566;
        if (bundle.containsKey(str)) {
            Objects.toString((FrostHunterRealtimeDatabasePulseStormOlympian4721) FrostHunterRemoteConfigPhantomDelta1739.FrostHunterCardViewSpectraCyber7714(bundle, str));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.FrostHunterBundlePulseFusionHero2475;
        FrostHunterRoomDaoAuroraShadowThunder3844 frostHunterRoomDaoAuroraShadowThunder3844 = (FrostHunterRoomDaoAuroraShadowThunder3844) linkedHashMap2.get(str);
        if (frostHunterRoomDaoAuroraShadowThunder3844 != null) {
            ArrayList arrayList = frostHunterRoomDaoAuroraShadowThunder3844.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                frostHunterRoomDaoAuroraShadowThunder3844.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232((FrostHunterFragmentCyberGammaDragon1939) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}

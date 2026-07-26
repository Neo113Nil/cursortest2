package android.content.Context;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.WindowInsetsAnimation;
import com.android.installreferrer.api.InstallReferrerClient;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import com.google.android.gms.common.api.Status;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterProximitySensorEpicSolar3138 implements FrostHunterIntentSpeedCyber8582, FrostHunterPermissionAuroraQuantumCyber5289, FrostHunterActionBarHyperMax6338, FrostHunterLocationManagerEpicAlphaQuantum9711, FrostHunterViewMegaStrike3894 {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final Object FrostHunterFlowMaxDragonHero5809;

    public FrostHunterProximitySensorEpicSolar3138(int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterObjectAnimatorNeoStrike7090(new Reference[16]);
                this.FrostHunterAlertDialogAuroraDelta3200 = new ReferenceQueue();
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterLicensingSpectraPulse8868();
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterConstraintSetCloneTitanOmega1925();
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            default:
                this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterServiceInfoEclipseAurora7011(27);
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterVectorDrawablePulseMaxStorm8774(16);
                break;
            case 10:
                this.FrostHunterFlowMaxDragonHero5809 = Collections.synchronizedMap(new WeakHashMap());
                this.FrostHunterAlertDialogAuroraDelta3200 = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 11:
                FrostHunterFragmentLegendHyperion4464 frostHunterFragmentLegendHyperion4464 = FrostHunterFragmentLegendHyperion4464.FrostHunterBundlePulseFusionHero2475;
                this.FrostHunterFlowMaxDragonHero5809 = new SparseIntArray();
                this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterFragmentLegendHyperion4464;
                break;
        }
    }

    public static void FrostHunterMeteringPointBetaCyber9571(FrostHunterProximitySensorEpicSolar3138 frostHunterProximitySensorEpicSolar3138, boolean z, boolean z2) {
        synchronized (frostHunterProximitySensorEpicSolar3138) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) frostHunterProximitySensorEpicSolar3138.FrostHunterAlertDialogAuroraDelta3200) == null) {
                    if (((Context) frostHunterProximitySensorEpicSolar3138.FrostHunterFlowMaxDragonHero5809).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) frostHunterProximitySensorEpicSolar3138.FrostHunterFlowMaxDragonHero5809).getSystemService("power");
                    if (powerManager == null) {
                        FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        frostHunterProximitySensorEpicSolar3138.FrostHunterAlertDialogAuroraDelta3200 = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) frostHunterProximitySensorEpicSolar3138.FrostHunterAlertDialogAuroraDelta3200;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterAlphaAnimationNeoCosmos5761() {
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = (FrostHunterTraceHyperionAuroraNebula9947) this.FrostHunterAlertDialogAuroraDelta3200;
        MediaCodec mediaCodec = (MediaCodec) this.FrostHunterFlowMaxDragonHero5809;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && frostHunterTraceHyperionAuroraNebula9947 != null) {
                frostHunterTraceHyperionAuroraNebula9947.FrostHunterMotionSceneAuroraMega2271(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && frostHunterTraceHyperionAuroraNebula9947 != null) {
                frostHunterTraceHyperionAuroraNebula9947.FrostHunterMotionSceneAuroraMega2271(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterBitmapTurboDeltaNebula8743(ArrayList arrayList) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).subscribeToVendorParameters(arrayList);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterCameraXPixelTurboCosmos9814(int i) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).releaseOutputBuffer(i, false);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public ByteBuffer FrostHunterCameraXTurboCelestialHero5430(int i) {
        return ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).getOutputBuffer(i);
    }

    @Override // android.content.Context.FrostHunterPermissionAuroraQuantumCyber5289
    public void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        FrostHunterFCMStrikeStorm6982 frostHunterFCMStrikeStorm6982 = (FrostHunterFCMStrikeStorm6982) this.FrostHunterAlertDialogAuroraDelta3200;
        SparseArray sparseArray = frostHunterFCMStrikeStorm6982.FrostHunterRemoteConfigSpeedSpeed8566;
        FrostHunterCountDownTimerStormPulseFusion5949 frostHunterCountDownTimerStormPulseFusion5949 = (FrostHunterCountDownTimerStormPulseFusion5949) this.FrostHunterFlowMaxDragonHero5809;
        if (frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571() == 0 && (frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571() & 128) != 0) {
            frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(6);
            int FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() / 4;
            for (int i = 0; i < FrostHunterAlphaAnimationNeoCosmos5761; i++) {
                frostHunterLicensingSpectraPulse8868.FrostHunterKeyframeGammaGamma1197(frostHunterCountDownTimerStormPulseFusion5949.FrostHunterConstraintSetCloneMasterUltraRogue2633, 0, 4);
                frostHunterCountDownTimerStormPulseFusion5949.FrostHunterServiceConnectionTurboPhoenixOmega6719(0);
                int FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(16);
                frostHunterCountDownTimerStormPulseFusion5949.FrostHunterScaleAnimationStrikeSpark5059(3);
                if (FrostHunterRemoteConfigSpeedSpeed8566 == 0) {
                    frostHunterCountDownTimerStormPulseFusion5949.FrostHunterScaleAnimationStrikeSpark5059(13);
                } else {
                    int FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterCountDownTimerStormPulseFusion5949.FrostHunterRemoteConfigSpeedSpeed8566(13);
                    if (sparseArray.get(FrostHunterRemoteConfigSpeedSpeed85662) == null) {
                        sparseArray.put(FrostHunterRemoteConfigSpeedSpeed85662, new FrostHunterLocationListenerPixelRogue7697(new FrostHunterSurfaceViewPhantomHyperion3032(frostHunterFCMStrikeStorm6982, FrostHunterRemoteConfigSpeedSpeed85662)));
                        frostHunterFCMStrikeStorm6982.FrostHunterServiceConnectionTurboPhoenixOmega6719++;
                    }
                }
            }
            sparseArray.remove(0);
        }
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterLocationManagerBlazeTitanium3991 frostHunterLocationManagerBlazeTitanium3991, Handler handler) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).setOnFrameRenderedListener(new FrostHunterOnItemLongClickListenerForcePhantom5597(this, frostHunterLocationManagerBlazeTitanium3991, 1), handler);
    }

    public void FrostHunterEditTextPulseHyperion1262(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.FrostHunterFlowMaxDragonHero5809)) {
            hashMap = new HashMap((Map) this.FrostHunterFlowMaxDragonHero5809);
        }
        synchronized (((Map) this.FrostHunterAlertDialogAuroraDelta3200)) {
            hashMap2 = new HashMap((Map) this.FrostHunterAlertDialogAuroraDelta3200);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterAlphaAnimationNeoCosmos5761();
                return;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((FrostHunterIntentBetaElite8730) entry2.getKey()).FrostHunterConstraintSetCloneMasterUltraRogue2633(new FrostHunterRotateAnimationSpectraPhoenixPhantom3899(status));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a1, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0116, code lost:
    
        if (")".equals(android.content.Context.FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterConstraintSetCloneMasterUltraRogue2633(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // android.content.Context.FrostHunterActionBarHyperMax6338
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(byte[] bArr, int i, int i2, FrostHunterLaunchGammaTitanium8407 frostHunterLaunchGammaTitanium8407, FrostHunterLayoutInflaterNebulaVision6522 frostHunterLayoutInflaterNebulaVision6522) {
        FrostHunterVideoCaptureOmegaQuantumSpeed9487 frostHunterVideoCaptureOmegaQuantumSpeed9487;
        String str;
        ?? r0;
        String sb;
        int i3;
        char c;
        FrostHunterProximitySensorEpicSolar3138 frostHunterProximitySensorEpicSolar3138 = this;
        FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868 = (FrostHunterLicensingSpectraPulse8868) frostHunterProximitySensorEpicSolar3138.FrostHunterFlowMaxDragonHero5809;
        frostHunterLicensingSpectraPulse8868.FrostHunterMagnetometerFusionTitanium8202(bArr, i + i2);
        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i);
        ArrayList arrayList = new ArrayList();
        try {
            FrostHunterAlertDialogHeroHeroPrime2342.FrostHunterBundlePulseFusionHero2475(frostHunterLicensingSpectraPulse8868);
            while (!TextUtils.isEmpty(frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                int i4 = -1;
                int i5 = 0;
                char c2 = 65535;
                while (true) {
                    ?? r9 = 1;
                    if (c2 == 65535) {
                        i5 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                        String FrostHunterLightSensorForceFusion4241 = frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(StandardCharsets.UTF_8);
                        c2 = FrostHunterLightSensorForceFusion4241 == null ? (char) 0 : "STYLE".equals(FrostHunterLightSensorForceFusion4241) ? (char) 2 : FrostHunterLightSensorForceFusion4241.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i5);
                        if (c2 == 0) {
                            FrostHunterDrawerLayoutUltraStrike3303.FrostHunterPreviewBlazeAurora1020(new FrostHunterServicePhantomGammaTitan7103(arrayList2), frostHunterLaunchGammaTitanium8407, frostHunterLayoutInflaterNebulaVision6522);
                            return;
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("A style block was found after the first cue.");
                                    return;
                                }
                                frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(StandardCharsets.UTF_8);
                                FrostHunterConstraintSetCloneTitanOmega1925 frostHunterConstraintSetCloneTitanOmega1925 = (FrostHunterConstraintSetCloneTitanOmega1925) frostHunterProximitySensorEpicSolar3138.FrostHunterAlertDialogAuroraDelta3200;
                                FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse88682 = frostHunterConstraintSetCloneTitanOmega1925.FrostHunterAlphaAnimationNeoCosmos5761;
                                StringBuilder sb2 = frostHunterConstraintSetCloneTitanOmega1925.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                sb2.setLength(0);
                                int i6 = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                while (!TextUtils.isEmpty(frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(StandardCharsets.UTF_8))) {
                                }
                                frostHunterLicensingSpectraPulse88682.FrostHunterMagnetometerFusionTitanium8202(frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                                frostHunterLicensingSpectraPulse88682.FrostHunterR8MasterNebulaSpark7247(i6);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterBundlePulseFusionHero2475(frostHunterLicensingSpectraPulse88682);
                                    if (frostHunterLicensingSpectraPulse88682.FrostHunterAlphaAnimationNeoCosmos5761() >= 5 && "::cue".equals(frostHunterLicensingSpectraPulse88682.FrostHunterDialogFragmentTurboPhoenixDragon7627(5, StandardCharsets.UTF_8))) {
                                        int i7 = frostHunterLicensingSpectraPulse88682.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                        String FrostHunterConstraintSetCloneMasterUltraRogue2633 = FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterLicensingSpectraPulse88682, sb2);
                                        if (FrostHunterConstraintSetCloneMasterUltraRogue2633 != null) {
                                            if ("{".equals(FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                                                frostHunterLicensingSpectraPulse88682.FrostHunterR8MasterNebulaSpark7247(i7);
                                                str = "";
                                            } else if ("(".equals(FrostHunterConstraintSetCloneMasterUltraRogue2633)) {
                                                int i8 = frostHunterLicensingSpectraPulse88682.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                                int i9 = frostHunterLicensingSpectraPulse88682.FrostHunterBundlePulseFusionHero2475;
                                                boolean z2 = z ? 1 : 0;
                                                while (i8 < i9 && z2 == 0) {
                                                    int i10 = i8 + 1;
                                                    z2 = ((char) frostHunterLicensingSpectraPulse88682.FrostHunterAlphaAnimationNeoCosmos5761[i8]) == ')' ? r9 : z ? 1 : 0;
                                                    i8 = i10;
                                                }
                                                str = frostHunterLicensingSpectraPulse88682.FrostHunterDialogFragmentTurboPhoenixDragon7627((i8 - 1) - frostHunterLicensingSpectraPulse88682.FrostHunterConstraintSetCloneMasterUltraRogue2633, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterLicensingSpectraPulse88682, sb2))) {
                                                FrostHunterAuthInfernoStormTitan6980 frostHunterAuthInfernoStormTitan6980 = new FrostHunterAuthInfernoStormTitan6980();
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterAlphaAnimationNeoCosmos5761 = "";
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterConstraintSetCloneMasterUltraRogue2633 = "";
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterBundlePulseFusionHero2475 = Collections.EMPTY_SET;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterServiceEliteCelestialThunder1757 = "";
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterLifecycleBlazeGammaElite2889 = str2;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterRemoteConfigSpeedSpeed8566 = z;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterFlowMaxDragonHero5809 = z;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterAlertDialogAuroraDelta3200 = i4;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterKeyframeGammaGamma1197 = i4;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterFragmentBetaMegaVortex6025 = i4;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterServiceConnectionTurboPhoenixOmega6719 = i4;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterLightSensorForceFusion4241 = i4;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = i4;
                                                frostHunterAuthInfernoStormTitan6980.FrostHunterLintTitanVortexQuantum9911 = z;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i4) {
                                                        ?? matcher = FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterBundlePulseFusionHero2475.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r9);
                                                            group.getClass();
                                                            frostHunterAuthInfernoStormTitan6980.FrostHunterServiceEliteCelestialThunder1757 = group;
                                                        }
                                                        str = str.substring(z ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
                                                    String[] split = str.split("\\.", i4);
                                                    String str4 = split[z ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i4) {
                                                        frostHunterAuthInfernoStormTitan6980.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str4.substring(z ? 1 : 0, indexOf2);
                                                        frostHunterAuthInfernoStormTitan6980.FrostHunterAlphaAnimationNeoCosmos5761 = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        frostHunterAuthInfernoStormTitan6980.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str4;
                                                    }
                                                    if (split.length > r9) {
                                                        int length = split.length;
                                                        FrostHunterCanvasInfernoVortex4700.FrostHunterResourcesTitanHyperVision5823(length <= split.length ? r9 : z ? 1 : 0);
                                                        frostHunterAuthInfernoStormTitan6980.FrostHunterBundlePulseFusionHero2475 = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r9, length)));
                                                    }
                                                }
                                                boolean z3 = z ? 1 : 0;
                                                String str5 = str2;
                                                boolean z4 = r9;
                                                while (z3 == 0) {
                                                    int i11 = frostHunterLicensingSpectraPulse88682.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                                    str5 = FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterLicensingSpectraPulse88682, sb2);
                                                    boolean z5 = (str5 == null || "}".equals(str5)) ? z4 : z;
                                                    if (z5 == 0) {
                                                        frostHunterLicensingSpectraPulse88682.FrostHunterR8MasterNebulaSpark7247(i11);
                                                        FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterBundlePulseFusionHero2475(frostHunterLicensingSpectraPulse88682);
                                                        String FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterAlphaAnimationNeoCosmos5761(frostHunterLicensingSpectraPulse88682, sb2);
                                                        if (!FrostHunterAlphaAnimationNeoCosmos5761.isEmpty() && ":".equals(FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterLicensingSpectraPulse88682, sb2))) {
                                                            FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterBundlePulseFusionHero2475(frostHunterLicensingSpectraPulse88682);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z6 = false;
                                                            while (true) {
                                                                if (z6) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i12 = frostHunterLicensingSpectraPulse88682.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                                                    String FrostHunterConstraintSetCloneMasterUltraRogue26332 = FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterLicensingSpectraPulse88682, sb2);
                                                                    if (FrostHunterConstraintSetCloneMasterUltraRogue26332 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(FrostHunterConstraintSetCloneMasterUltraRogue26332) || ";".equals(FrostHunterConstraintSetCloneMasterUltraRogue26332)) {
                                                                        frostHunterLicensingSpectraPulse88682.FrostHunterR8MasterNebulaSpark7247(i12);
                                                                        z6 = true;
                                                                    } else {
                                                                        sb3.append(FrostHunterConstraintSetCloneMasterUltraRogue26332);
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !sb.isEmpty()) {
                                                                int i13 = frostHunterLicensingSpectraPulse88682.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                                                                String FrostHunterConstraintSetCloneMasterUltraRogue26333 = FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterConstraintSetCloneMasterUltraRogue2633(frostHunterLicensingSpectraPulse88682, sb2);
                                                                if (!";".equals(FrostHunterConstraintSetCloneMasterUltraRogue26333)) {
                                                                    if ("}".equals(FrostHunterConstraintSetCloneMasterUltraRogue26333)) {
                                                                        frostHunterLicensingSpectraPulse88682.FrostHunterR8MasterNebulaSpark7247(i13);
                                                                    }
                                                                }
                                                                if ("color".equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                    i3 = 1;
                                                                    frostHunterAuthInfernoStormTitan6980.FrostHunterLevelListDrawableFusionDragonHero2232 = FrostHunterZoomStateMaxEpicSpectra5366.FrostHunterAlphaAnimationNeoCosmos5761(sb, true);
                                                                    frostHunterAuthInfernoStormTitan6980.FrostHunterRemoteConfigSpeedSpeed8566 = true;
                                                                } else {
                                                                    i3 = 1;
                                                                    if ("background-color".equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                        frostHunterAuthInfernoStormTitan6980.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterZoomStateMaxEpicSpectra5366.FrostHunterAlphaAnimationNeoCosmos5761(sb, true);
                                                                        frostHunterAuthInfernoStormTitan6980.FrostHunterFlowMaxDragonHero5809 = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                            if ("over".equals(sb)) {
                                                                                frostHunterAuthInfernoStormTitan6980.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                frostHunterAuthInfernoStormTitan6980.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = 2;
                                                                                r0 = 1;
                                                                                z4 = r0;
                                                                                z3 = z5;
                                                                                z = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                            frostHunterAuthInfernoStormTitan6980.FrostHunterLintTitanVortexQuantum9911 = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                            if ("underline".equals(sb)) {
                                                                                i3 = 1;
                                                                                frostHunterAuthInfernoStormTitan6980.FrostHunterKeyframeGammaGamma1197 = 1;
                                                                            }
                                                                        } else if ("font-family".equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                            frostHunterAuthInfernoStormTitan6980.FrostHunterLifecycleBlazeGammaElite2889 = FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(sb);
                                                                        } else if (!"font-weight".equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                            i3 = 1;
                                                                            if ("font-style".equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                                if ("italic".equals(sb)) {
                                                                                    frostHunterAuthInfernoStormTitan6980.FrostHunterServiceConnectionTurboPhoenixOmega6719 = 1;
                                                                                }
                                                                            } else if ("font-size".equals(FrostHunterAlphaAnimationNeoCosmos5761)) {
                                                                                ?? matcher2 = FrostHunterConstraintSetCloneTitanOmega1925.FrostHunterServiceEliteCelestialThunder1757.matcher(FrostHunterCoroutineNovaXMasterMaster7803.FrostHunterConstraintSetCloneOmegaHyperion9304(sb));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    switch (c) {
                                                                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                                                                            r0 = 1;
                                                                                            frostHunterAuthInfernoStormTitan6980.FrostHunterLightSensorForceFusion4241 = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r0 = 1;
                                                                                            frostHunterAuthInfernoStormTitan6980.FrostHunterLightSensorForceFusion4241 = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r0 = 1;
                                                                                            frostHunterAuthInfernoStormTitan6980.FrostHunterLightSensorForceFusion4241 = 1;
                                                                                            break;
                                                                                        default:
                                                                                            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterScaleAnimationStrikeSpark5059();
                                                                                            return;
                                                                                    }
                                                                                    String group3 = matcher2.group(r0);
                                                                                    group3.getClass();
                                                                                    frostHunterAuthInfernoStormTitan6980.FrostHunterScaleAnimationStrikeSpark5059 = Float.parseFloat(group3);
                                                                                    z4 = r0;
                                                                                    z3 = z5;
                                                                                    z = false;
                                                                                } else {
                                                                                    FrostHunterDrawerLayoutUltraStrike3303.FrostHunterColorStateListInflaterNovaQuantum4229("Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb)) {
                                                                            i3 = 1;
                                                                            frostHunterAuthInfernoStormTitan6980.FrostHunterFragmentBetaMegaVortex6025 = 1;
                                                                        }
                                                                        z4 = r0;
                                                                        z3 = z5;
                                                                        z = false;
                                                                    }
                                                                }
                                                                r0 = i3;
                                                                z4 = r0;
                                                                z3 = z5;
                                                                z = false;
                                                            }
                                                            r0 = 1;
                                                            z4 = r0;
                                                            z3 = z5;
                                                            z = false;
                                                        }
                                                    }
                                                    r0 = z4;
                                                    z4 = r0;
                                                    z3 = z5;
                                                    z = false;
                                                }
                                                boolean z7 = z4;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(frostHunterAuthInfernoStormTitan6980);
                                                }
                                                r9 = z7;
                                                z = false;
                                                i4 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c2 == 3) {
                                Pattern pattern = FrostHunterFlowOnBlazeSpectraStorm5265.FrostHunterAlphaAnimationNeoCosmos5761;
                                Charset charset = StandardCharsets.UTF_8;
                                String FrostHunterLightSensorForceFusion42412 = frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(charset);
                                if (FrostHunterLightSensorForceFusion42412 == null) {
                                    frostHunterVideoCaptureOmegaQuantumSpeed9487 = null;
                                } else {
                                    Pattern pattern2 = FrostHunterFlowOnBlazeSpectraStorm5265.FrostHunterAlphaAnimationNeoCosmos5761;
                                    Matcher matcher3 = pattern2.matcher(FrostHunterLightSensorForceFusion42412);
                                    if (matcher3.matches()) {
                                        frostHunterVideoCaptureOmegaQuantumSpeed9487 = FrostHunterFlowOnBlazeSpectraStorm5265.FrostHunterServiceEliteCelestialThunder1757(null, matcher3, frostHunterLicensingSpectraPulse8868, arrayList);
                                    } else {
                                        frostHunterVideoCaptureOmegaQuantumSpeed9487 = null;
                                        String FrostHunterLightSensorForceFusion42413 = frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(charset);
                                        if (FrostHunterLightSensorForceFusion42413 != null) {
                                            Matcher matcher4 = pattern2.matcher(FrostHunterLightSensorForceFusion42413);
                                            if (matcher4.matches()) {
                                                frostHunterVideoCaptureOmegaQuantumSpeed9487 = FrostHunterFlowOnBlazeSpectraStorm5265.FrostHunterServiceEliteCelestialThunder1757(FrostHunterLightSensorForceFusion42412.trim(), matcher4, frostHunterLicensingSpectraPulse8868, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (frostHunterVideoCaptureOmegaQuantumSpeed9487 != null) {
                                    arrayList2.add(frostHunterVideoCaptureOmegaQuantumSpeed9487);
                                }
                            }
                            frostHunterProximitySensorEpicSolar3138 = this;
                        }
                    }
                }
            }
        } catch (FrostHunterDiffUtilTurboSpark8131 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // android.content.Context.FrostHunterViewMegaStrike3894
    public Object FrostHunterFlowMaxDragonHero5809(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        FrostHunterFlowCollectorMegaTitaniumFusion9321 frostHunterFlowCollectorMegaTitaniumFusion9321 = (FrostHunterFlowCollectorMegaTitaniumFusion9321) this.FrostHunterFlowMaxDragonHero5809;
        Bundle bundle = (Bundle) this.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterFlowCollectorMegaTitaniumFusion9321.getClass();
        if (!frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterCameraXPixelTurboCosmos9814()) {
            return frostHunterGradientDrawablePrimeSpectraUltra1716;
        }
        Bundle bundle2 = (Bundle) frostHunterGradientDrawablePrimeSpectraUltra1716.FrostHunterLevelListDrawableFusionDragonHero2232();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? frostHunterGradientDrawablePrimeSpectraUltra1716 : frostHunterFlowCollectorMegaTitaniumFusion9321.FrostHunterAlphaAnimationNeoCosmos5761(bundle).FrostHunterFlowMaxDragonHero5809(FrostHunterTextInputEditTextBetaTitanDelta2402.FrostHunterAlertDialogAuroraDelta3200, FrostHunterChipSpeedTitan5326.FrostHunterServiceInfoHyperionSparkMax9966);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterKeyframeGammaGamma1197(int i) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).setVideoScalingMode(i);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLevelListDrawableFusionDragonHero2232(int i, int i2, long j, int i3) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLifecycleBlazeGammaElite2889(int i, FrostHunterObjectDetectionDeltaQuantumHyperion3304 frostHunterObjectDetectionDeltaQuantumHyperion3304, long j, int i2) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).queueSecureInputBuffer(i, 0, frostHunterObjectDetectionDeltaQuantumHyperion3304.FrostHunterFlowMaxDragonHero5809, j, i2);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLightSensorForceFusion4241() {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).detachOutputSurface();
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLintTitanVortexQuantum9911(Surface surface) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).setOutputSurface(surface);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLooperHyperionForce4133(ArrayList arrayList) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).unsubscribeFromVendorParameters(arrayList);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterLooperThreadBetaHyperionMax1000(int i, long j) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).releaseOutputBuffer(i, j);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public int FrostHunterMotionSceneAuroraMega2271() {
        return ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).dequeueInputBuffer(0L);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public int FrostHunterRemoteConfigSpeedSpeed8566(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public ByteBuffer FrostHunterScaleAnimationStrikeSpark5059(int i) {
        return ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).getInputBuffer(i);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public MediaFormat FrostHunterServiceConnectionTurboPhoenixOmega6719() {
        return ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).getOutputFormat();
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void FrostHunterServiceEliteCelestialThunder1757(Bundle bundle) {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).setParameters(bundle);
    }

    public String FrostHunterServiceInfoHyperionSparkMax9966(String str) {
        String str2 = (String) this.FrostHunterAlertDialogAuroraDelta3200;
        Resources resources = (Resources) this.FrostHunterFlowMaxDragonHero5809;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // android.content.Context.FrostHunterLocationManagerEpicAlphaQuantum9711
    public void FrostHunterTextViewDragonStormMega4297(FrostHunterGradientDrawablePrimeSpectraUltra1716 frostHunterGradientDrawablePrimeSpectraUltra1716) {
        ((Map) ((FrostHunterProximitySensorEpicSolar3138) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlertDialogAuroraDelta3200).remove((FrostHunterIntentBetaElite8730) this.FrostHunterFlowMaxDragonHero5809);
    }

    @Override // android.content.Context.FrostHunterIntentSpeedCyber8582
    public void flush() {
        ((MediaCodec) this.FrostHunterFlowMaxDragonHero5809).flush();
    }

    public String toString() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                return "Bounds{lower=" + ((FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995) this.FrostHunterFlowMaxDragonHero5809) + " upper=" + ((FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995) this.FrostHunterAlertDialogAuroraDelta3200) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ FrostHunterProximitySensorEpicSolar3138(int i, Object obj, Object obj2, boolean z) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj;
        this.FrostHunterFlowMaxDragonHero5809 = obj2;
    }

    public FrostHunterProximitySensorEpicSolar3138(Context context, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        switch (i) {
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                this.FrostHunterFlowMaxDragonHero5809 = context;
                break;
            default:
                FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(context);
                Resources resources = context.getResources();
                this.FrostHunterFlowMaxDragonHero5809 = resources;
                this.FrostHunterAlertDialogAuroraDelta3200 = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
        }
    }

    public FrostHunterProximitySensorEpicSolar3138(IBinder iBinder) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 13;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.FrostHunterFlowMaxDragonHero5809 = new Messenger(iBinder);
            this.FrostHunterAlertDialogAuroraDelta3200 = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterAnalyticsCelestialBeta2989(iBinder);
            this.FrostHunterFlowMaxDragonHero5809 = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        }
    }

    public FrostHunterProximitySensorEpicSolar3138(MediaCodec mediaCodec, FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947) {
        boolean addMediaCodec;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
        this.FrostHunterFlowMaxDragonHero5809 = mediaCodec;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterTraceHyperionAuroraNebula9947;
        if (Build.VERSION.SDK_INT < 35 || frostHunterTraceHyperionAuroraNebula9947 == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        FrostHunterCanvasInfernoVortex4700.FrostHunterMeteringPointMegaCyber7955(((HashSet) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200).add(mediaCodec));
    }

    public /* synthetic */ FrostHunterProximitySensorEpicSolar3138(int i, Object obj, Object obj2) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = obj2;
    }

    public FrostHunterProximitySensorEpicSolar3138(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.FrostHunterCameraXPixelTurboCosmos9814 = 8;
        lowerBound = bounds.getLowerBound();
        this.FrostHunterFlowMaxDragonHero5809 = FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterBundlePulseFusionHero2475(lowerBound);
        upperBound = bounds.getUpperBound();
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterOnAttachStateChangeListenerNovaXHeroHyper7995.FrostHunterBundlePulseFusionHero2475(upperBound);
    }

    public FrostHunterProximitySensorEpicSolar3138(FrostHunterFCMStrikeStorm6982 frostHunterFCMStrikeStorm6982) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = 2;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterFCMStrikeStorm6982;
        this.FrostHunterFlowMaxDragonHero5809 = new FrostHunterCountDownTimerStormPulseFusion5949(new byte[4], 4);
    }

    @Override // android.content.Context.FrostHunterPermissionAuroraQuantumCyber5289
    public void FrostHunterBundlePulseFusionHero2475(FrostHunterPaintFlagsDrawFilterPhantomRogue4543 frostHunterPaintFlagsDrawFilterPhantomRogue4543, FrostHunterAnimatorAlphaBetaNeo3591 frostHunterAnimatorAlphaBetaNeo3591, FrostHunterAnalyticsOlympianFusionOlympian6086 frostHunterAnalyticsOlympianFusionOlympian6086) {
    }
}

package android.content.Context;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterGradlePulseOlympianTurbo1196 implements FrostHunterFlingGestureEpicPhantom3524, FrostHunterSoundPoolDeltaSparkOlympian6376, FrostHunterAdapterPixelMax1447, FrostHunterObjectAnimatorOlympianSpectra1864 {
    public Object FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public static final byte[] FrostHunterKeyframeGammaGamma1197 = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] FrostHunterFragmentBetaMegaVortex6025 = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final long[] FrostHunterServiceConnectionTurboPhoenixOmega6719 = {128, 64, 32, 16, 8, 4, 2, 1};

    public FrostHunterGradlePulseOlympianTurbo1196(int i) {
        switch (i) {
            case 3:
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterKotlinQuantumRogue5892(1);
                this.FrostHunterCameraXPixelTurboCosmos9814 = 8000;
                this.FrostHunterFlowMaxDragonHero5809 = 8000;
                break;
            case 4:
            default:
                this.FrostHunterAlertDialogAuroraDelta3200 = new byte[8];
                break;
            case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterGradlePulseOlympianTurbo1196[256];
                this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
                this.FrostHunterFlowMaxDragonHero5809 = 0;
                break;
        }
    }

    public static void FrostHunterBitmapTurboDeltaNebula8743(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(FrostHunterLiveDataScopeOmegaBeta9836.FrostHunterAlphaAnimationNeoCosmos5761(i2));
    }

    public static long FrostHunterTextViewDragonStormMega4297(int i, boolean z, byte[] bArr) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~FrostHunterServiceConnectionTurboPhoenixOmega6719[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public Object FrostHunterAlertDialogAuroraDelta3200() {
        return ((FrostHunterAdapterPixelMax1447) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlertDialogAuroraDelta3200();
    }

    @Override // android.content.Context.FrostHunterFlingGestureEpicPhantom3524
    public int FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterCameraXPixelTurboCosmos9814(int i, int i2, int i3) {
        int i4 = this.FrostHunterFlowMaxDragonHero5809 == 0 ? this.FrostHunterCameraXPixelTurboCosmos9814 : 0;
        ((FrostHunterAdapterPixelMax1447) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCameraXPixelTurboCosmos9814(i + i4, i2 + i4, i3);
    }

    @Override // android.content.Context.FrostHunterObjectAnimatorOlympianSpectra1864
    public int FrostHunterCameraXTurboCelestialHero5430() {
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    public synchronized int FrostHunterDialogFragmentTurboPhoenixDragon7627() {
        PackageInfo packageInfo;
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == 0) {
            try {
                packageInfo = FrostHunterScaleDrawableDragonStormUltra4635.FrostHunterAlphaAnimationNeoCosmos5761((Context) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterAlphaAnimationNeoCosmos5761.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.FrostHunterCameraXPixelTurboCosmos9814 = packageInfo.versionCode;
            }
        }
        return this.FrostHunterCameraXPixelTurboCosmos9814;
    }

    @Override // android.content.Context.FrostHunterSoundPoolDeltaSparkOlympian6376
    public FrostHunterDigitalInkRecognitionForceHyper4284 FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        return new FrostHunterOnDeviceTranslatorMegaRogue9992(this.FrostHunterCameraXPixelTurboCosmos9814, this.FrostHunterFlowMaxDragonHero5809, (FrostHunterKotlinQuantumRogue5892) this.FrostHunterAlertDialogAuroraDelta3200);
    }

    @Override // android.content.Context.FrostHunterFlingGestureEpicPhantom3524
    public int FrostHunterFlowMaxDragonHero5809() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterFragmentBetaMegaVortex6025(FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574, Object obj) {
        ((FrostHunterAdapterPixelMax1447) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFragmentBetaMegaVortex6025(frostHunterFontFamilyNeoBetaEpic8574, obj);
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterKeyframeGammaGamma1197(int i, int i2) {
        ((FrostHunterAdapterPixelMax1447) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterKeyframeGammaGamma1197(i + (this.FrostHunterFlowMaxDragonHero5809 == 0 ? this.FrostHunterCameraXPixelTurboCosmos9814 : 0), i2);
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterLevelListDrawableFusionDragonHero2232() {
        ((FrostHunterAdapterPixelMax1447) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterLevelListDrawableFusionDragonHero2232();
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterLifecycleBlazeGammaElite2889(Object obj) {
        this.FrostHunterFlowMaxDragonHero5809++;
        ((FrostHunterAdapterPixelMax1447) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterLifecycleBlazeGammaElite2889(obj);
    }

    @Override // android.content.Context.FrostHunterObjectAnimatorOlympianSpectra1864
    public int FrostHunterLightSensorForceFusion4241() {
        return this.FrostHunterFlowMaxDragonHero5809;
    }

    @Override // android.content.Context.FrostHunterFlingGestureEpicPhantom3524
    public int FrostHunterLintTitanVortexQuantum9911() {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        return i == -1 ? ((FrostHunterLicensingSpectraPulse8868) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterCardViewSpectraCyber7714() : i;
    }

    public synchronized int FrostHunterLooperHyperionForce4133() {
        try {
            int i = this.FrostHunterFlowMaxDragonHero5809;
            if (i != 0) {
                return i;
            }
            Context context = (Context) this.FrostHunterAlertDialogAuroraDelta3200;
            PackageManager packageManager = context.getPackageManager();
            if (FrostHunterScaleDrawableDragonStormUltra4635.FrostHunterAlphaAnimationNeoCosmos5761(context).FrostHunterAlphaAnimationNeoCosmos5761.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            int i2 = 1;
            if (!FrostHunterVectorDrawableForceMax1351.FrostHunterBitmapTurboDeltaNebula8743()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    this.FrostHunterFlowMaxDragonHero5809 = i2;
                    return i2;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                i2 = 2;
                this.FrostHunterFlowMaxDragonHero5809 = i2;
                return i2;
            }
            if (true == FrostHunterVectorDrawableForceMax1351.FrostHunterBitmapTurboDeltaNebula8743()) {
                i2 = 2;
            }
            this.FrostHunterFlowMaxDragonHero5809 = i2;
            return i2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterLooperThreadBetaHyperionMax1000() {
        if (this.FrostHunterFlowMaxDragonHero5809 <= 0) {
            FrostHunterSupervisorJobEliteSparkEclipse7300.FrostHunterBundlePulseFusionHero2475("OffsetApplier up called with no corresponding down");
        }
        this.FrostHunterFlowMaxDragonHero5809--;
        ((FrostHunterAdapterPixelMax1447) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterLooperThreadBetaHyperionMax1000();
    }

    public long FrostHunterMotionSceneAuroraMega2271(FrostHunterPreviewNeoBeta3393 frostHunterPreviewNeoBeta3393, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.FrostHunterAlertDialogAuroraDelta3200;
        if (this.FrostHunterCameraXPixelTurboCosmos9814 == 0) {
            if (!frostHunterPreviewNeoBeta3393.FrostHunterConstraintSetCloneMasterUltraRogue2633(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((FrostHunterServiceConnectionTurboPhoenixOmega6719[i4] & i3) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.FrostHunterFlowMaxDragonHero5809 = i2;
            if (i2 == -1) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("No valid varint length mask found");
                return 0L;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = 1;
        }
        int i5 = this.FrostHunterFlowMaxDragonHero5809;
        if (i5 > i) {
            this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
            return -2L;
        }
        if (i5 != 1) {
            frostHunterPreviewNeoBeta3393.readFully(bArr, 1, i5 - 1);
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
        return FrostHunterTextViewDragonStormMega4297(this.FrostHunterFlowMaxDragonHero5809, z2, bArr);
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterRemoteConfigSpeedSpeed8566(int i, Object obj) {
        ((FrostHunterAdapterPixelMax1447) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterRemoteConfigSpeedSpeed8566(i + (this.FrostHunterFlowMaxDragonHero5809 == 0 ? this.FrostHunterCameraXPixelTurboCosmos9814 : 0), obj);
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public FrostHunterMaterialCardViewEliteRogue2483 FrostHunterResourcesTitanHyperVision5823(long j, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        return ((FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterResourcesTitanHyperVision5823(j, frostHunterMaterialCardViewEliteRogue2483, frostHunterMaterialCardViewEliteRogue24832, frostHunterMaterialCardViewEliteRogue24833);
    }

    @Override // android.content.Context.FrostHunterThemeOverlaySparkInfernoAurora4808
    public FrostHunterMaterialCardViewEliteRogue2483 FrostHunterScaleAnimationStrikeSpark5059(long j, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue2483, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24832, FrostHunterMaterialCardViewEliteRogue2483 frostHunterMaterialCardViewEliteRogue24833) {
        return ((FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterScaleAnimationStrikeSpark5059(j, frostHunterMaterialCardViewEliteRogue2483, frostHunterMaterialCardViewEliteRogue24832, frostHunterMaterialCardViewEliteRogue24833);
    }

    @Override // android.content.Context.FrostHunterAdapterPixelMax1447
    public void FrostHunterServiceEliteCelestialThunder1757(int i, Object obj) {
        ((FrostHunterAdapterPixelMax1447) this.FrostHunterAlertDialogAuroraDelta3200).FrostHunterServiceEliteCelestialThunder1757(i + (this.FrostHunterFlowMaxDragonHero5809 == 0 ? this.FrostHunterCameraXPixelTurboCosmos9814 : 0), obj);
    }

    public FrostHunterGradlePulseOlympianTurbo1196(int i, int i2, FrostHunterAnalyticsMasterAurora3691 frostHunterAnalyticsMasterAurora3691) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = i2;
        this.FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849(new FrostHunterPlaceholderPhoenixTitan8469(i, i2, frostHunterAnalyticsMasterAurora3691));
    }
}

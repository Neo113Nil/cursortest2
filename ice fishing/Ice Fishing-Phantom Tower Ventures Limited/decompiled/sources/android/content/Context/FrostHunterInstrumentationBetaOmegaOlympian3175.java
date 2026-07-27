package android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterInstrumentationBetaOmegaOlympian3175 extends FrostHunterRemoteModelManagerPrimeStrikePrime5960 {
    @Override // android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public final FrostHunterProfilerPhantomLegendPhoenix6109 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        frostHunterCoroutineScopePrimeSpark1417.getClass();
        return new FrostHunterLooperQuantumSpeed3060(new FileOutputStream(frostHunterCoroutineScopePrimeSpark1417.toFile(), true), new FrostHunterAdMobBlazeEclipseGamma6684());
    }

    @Override // android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public final FrostHunterProfilerPhantomLegendPhoenix6109 FrostHunterBitmapTurboDeltaNebula8743(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417, boolean z) {
        frostHunterCoroutineScopePrimeSpark1417.getClass();
        if (!z || !FrostHunterAlertDialogAuroraDelta3200(frostHunterCoroutineScopePrimeSpark1417)) {
            return new FrostHunterLooperQuantumSpeed3060(new FileOutputStream(frostHunterCoroutineScopePrimeSpark1417.toFile(), false), new FrostHunterAdMobBlazeEclipseGamma6684());
        }
        throw new IOException(frostHunterCoroutineScopePrimeSpark1417 + " already exists.");
    }

    @Override // android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public final void FrostHunterCameraXPixelTurboCosmos9814(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        frostHunterCoroutineScopePrimeSpark1417.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = frostHunterCoroutineScopePrimeSpark1417.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterLintTitanVortexQuantum9911(frostHunterCoroutineScopePrimeSpark1417, "failed to delete ");
    }

    @Override // android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public final FrostHunterFontFamilySolarSpeedCelestial8941 FrostHunterDialogFragmentTurboPhoenixDragon7627(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        frostHunterCoroutineScopePrimeSpark1417.getClass();
        return new FrostHunterButtonOmegaGammaSpectra9562(new FileInputStream(frostHunterCoroutineScopePrimeSpark1417.toFile()), FrostHunterAdMobBlazeEclipseGamma6684.FrostHunterServiceEliteCelestialThunder1757);
    }

    @Override // android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public final List FrostHunterKeyframeGammaGamma1197(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        File file = frostHunterCoroutineScopePrimeSpark1417.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterLintTitanVortexQuantum9911(frostHunterCoroutineScopePrimeSpark1417, "failed to list ");
                return null;
            }
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterKeyframeGammaGamma1197(frostHunterCoroutineScopePrimeSpark1417, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(frostHunterCoroutineScopePrimeSpark1417.FrostHunterLifecycleBlazeGammaElite2889(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public final void FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        frostHunterCoroutineScopePrimeSpark1417.getClass();
        if (frostHunterCoroutineScopePrimeSpark1417.toFile().mkdir()) {
            return;
        }
        FrostHunterContextBetaOmega1136 FrostHunterLightSensorForceFusion4241 = FrostHunterLightSensorForceFusion4241(frostHunterCoroutineScopePrimeSpark1417);
        if (FrostHunterLightSensorForceFusion4241 == null || !FrostHunterLightSensorForceFusion4241.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
            FrostHunterMaterialCardViewShadowBlazeBlaze3823.FrostHunterLintTitanVortexQuantum9911(frostHunterCoroutineScopePrimeSpark1417, "failed to create directory: ");
        }
    }

    @Override // android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public FrostHunterContextBetaOmega1136 FrostHunterLightSensorForceFusion4241(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        frostHunterCoroutineScopePrimeSpark1417.getClass();
        File file = frostHunterCoroutineScopePrimeSpark1417.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new FrostHunterContextBetaOmega1136(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public void FrostHunterServiceEliteCelestialThunder1757(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417, FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark14172) {
        frostHunterCoroutineScopePrimeSpark1417.getClass();
        frostHunterCoroutineScopePrimeSpark14172.getClass();
        if (frostHunterCoroutineScopePrimeSpark1417.toFile().renameTo(frostHunterCoroutineScopePrimeSpark14172.toFile())) {
            return;
        }
        throw new IOException("failed to move " + frostHunterCoroutineScopePrimeSpark1417 + " to " + frostHunterCoroutineScopePrimeSpark14172);
    }

    @Override // android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public final FrostHunterOnItemClickListenerHeroSpark8665 FrostHunterTextViewDragonStormMega4297(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        return new FrostHunterOnItemClickListenerHeroSpark8665(new RandomAccessFile(frostHunterCoroutineScopePrimeSpark1417.toFile(), "r"));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}

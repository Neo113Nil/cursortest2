package android.content.Context;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.text.LineBreakConfig;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterLiveDataEpicNeoPrime2305 {
    public static void FrostHunterAlertDialogAuroraDelta3200(FrostHunterContentResolverPixelNovaXOmega9269 frostHunterContentResolverPixelNovaXOmega9269, FrostHunterContentResolverPixelNovaXOmega9269 frostHunterContentResolverPixelNovaXOmega92692, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473) {
        if (frostHunterContentResolverPixelNovaXOmega9269 != frostHunterContentResolverPixelNovaXOmega92692) {
            frostHunterContentResolverPixelNovaXOmega92692.getClass();
            FrostHunterContentResolverPixelNovaXOmega9269.FrostHunterLintTitanVortexQuantum9911(frostHunterContentResolverPixelNovaXOmega9269);
            frostHunterContentResolverPixelNovaXOmega92692.FrostHunterBundlePulseFusionHero2475();
        } else if (frostHunterContentResolverPixelNovaXOmega9269 instanceof FrostHunterServiceInfoInfernoOmegaTitan4036) {
            ((FrostHunterServiceInfoInfernoOmegaTitan4036) frostHunterContentResolverPixelNovaXOmega9269).FrostHunterCameraXTurboCelestialHero5430 = frostHunterCombineLegendMegaPrime5473;
        } else if (frostHunterContentResolverPixelNovaXOmega9269 instanceof FrostHunterRemoteConfigBlazeNova8248) {
            ((FrostHunterRemoteConfigBlazeNova8248) frostHunterContentResolverPixelNovaXOmega9269).FrostHunterCameraXPixelTurboCosmos9814 = frostHunterCombineLegendMegaPrime5473;
        } else {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterServiceEliteCelestialThunder1757(frostHunterContentResolverPixelNovaXOmega9269, "Non-transparent snapshot was reused: ");
        }
    }

    public static final long FrostHunterAlphaAnimationNeoCosmos5761(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static boolean FrostHunterBundlePulseFusionHero2475(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static MappedByteBuffer FrostHunterCameraXPixelTurboCosmos9814(Uri uri, Context context) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static boolean FrostHunterConstraintSetCloneMasterUltraRogue2633(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean FrostHunterBundlePulseFusionHero2475 = FrostHunterBundlePulseFusionHero2475(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return FrostHunterBundlePulseFusionHero2475;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static Object FrostHunterFlowMaxDragonHero5809(FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595) {
        FrostHunterContentResolverPixelNovaXOmega9269 frostHunterServiceInfoInfernoOmegaTitan4036;
        if (frostHunterCombineLegendMegaPrime5473 == null) {
            return frostHunterNotificationGammaBlazePhoenix7595.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
        FrostHunterContentResolverPixelNovaXOmega9269 frostHunterContentResolverPixelNovaXOmega9269 = (FrostHunterContentResolverPixelNovaXOmega9269) FrostHunterProfilerUltraCyber8296.FrostHunterConstraintSetCloneMasterUltraRogue2633.get();
        if (frostHunterContentResolverPixelNovaXOmega9269 instanceof FrostHunterServiceInfoInfernoOmegaTitan4036) {
            FrostHunterServiceInfoInfernoOmegaTitan4036 frostHunterServiceInfoInfernoOmegaTitan40362 = (FrostHunterServiceInfoInfernoOmegaTitan4036) frostHunterContentResolverPixelNovaXOmega9269;
            if (frostHunterServiceInfoInfernoOmegaTitan40362.FrostHunterTextViewDragonStormMega4297 == FrostHunterGestureDetectorNovaPrimeHero2555.FrostHunterServiceEliteCelestialThunder1757()) {
                FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54732 = frostHunterServiceInfoInfernoOmegaTitan40362.FrostHunterCameraXTurboCelestialHero5430;
                FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime54733 = frostHunterServiceInfoInfernoOmegaTitan40362.FrostHunterResourcesTitanHyperVision5823;
                try {
                    ((FrostHunterServiceInfoInfernoOmegaTitan4036) frostHunterContentResolverPixelNovaXOmega9269).FrostHunterCameraXTurboCelestialHero5430 = FrostHunterProfilerUltraCyber8296.FrostHunterFragmentBetaMegaVortex6025(frostHunterCombineLegendMegaPrime5473, frostHunterCombineLegendMegaPrime54732, true);
                    ((FrostHunterServiceInfoInfernoOmegaTitan4036) frostHunterContentResolverPixelNovaXOmega9269).FrostHunterResourcesTitanHyperVision5823 = frostHunterCombineLegendMegaPrime54733;
                    return frostHunterNotificationGammaBlazePhoenix7595.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                } finally {
                    frostHunterServiceInfoInfernoOmegaTitan40362.FrostHunterCameraXTurboCelestialHero5430 = frostHunterCombineLegendMegaPrime54732;
                    frostHunterServiceInfoInfernoOmegaTitan40362.FrostHunterResourcesTitanHyperVision5823 = frostHunterCombineLegendMegaPrime54733;
                }
            }
        }
        if (frostHunterContentResolverPixelNovaXOmega9269 == null || (frostHunterContentResolverPixelNovaXOmega9269 instanceof FrostHunterGradlePluginFusionVisionMega9569)) {
            frostHunterServiceInfoInfernoOmegaTitan4036 = new FrostHunterServiceInfoInfernoOmegaTitan4036(frostHunterContentResolverPixelNovaXOmega9269 instanceof FrostHunterGradlePluginFusionVisionMega9569 ? (FrostHunterGradlePluginFusionVisionMega9569) frostHunterContentResolverPixelNovaXOmega9269 : null, frostHunterCombineLegendMegaPrime5473, null, true, false);
        } else {
            if (frostHunterCombineLegendMegaPrime5473 == null) {
                return frostHunterNotificationGammaBlazePhoenix7595.FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
            frostHunterServiceInfoInfernoOmegaTitan4036 = frostHunterContentResolverPixelNovaXOmega9269.FrostHunterLooperThreadBetaHyperionMax1000(frostHunterCombineLegendMegaPrime5473);
        }
        try {
            FrostHunterContentResolverPixelNovaXOmega9269 FrostHunterAlertDialogAuroraDelta3200 = frostHunterServiceInfoInfernoOmegaTitan4036.FrostHunterAlertDialogAuroraDelta3200();
            try {
                Object FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterNotificationGammaBlazePhoenix7595.FrostHunterConstraintSetCloneMasterUltraRogue2633();
                FrostHunterContentResolverPixelNovaXOmega9269.FrostHunterLintTitanVortexQuantum9911(FrostHunterAlertDialogAuroraDelta3200);
                frostHunterServiceInfoInfernoOmegaTitan4036.FrostHunterBundlePulseFusionHero2475();
                return FrostHunterConstraintSetCloneMasterUltraRogue2633;
            } catch (Throwable th) {
                FrostHunterContentResolverPixelNovaXOmega9269.FrostHunterLintTitanVortexQuantum9911(FrostHunterAlertDialogAuroraDelta3200);
                throw th;
            }
        } catch (Throwable th2) {
            frostHunterServiceInfoInfernoOmegaTitan4036.FrostHunterBundlePulseFusionHero2475();
            throw th2;
        }
    }

    public static File FrostHunterLevelListDrawableFusionDragonHero2232(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static String FrostHunterLifecycleBlazeGammaElite2889(FrostHunterManifestEclipseGammaTitanium1788 frostHunterManifestEclipseGammaTitanium1788) {
        StringBuilder sb = new StringBuilder(frostHunterManifestEclipseGammaTitanium1788.size());
        for (int i = 0; i < frostHunterManifestEclipseGammaTitanium1788.size(); i++) {
            byte FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterManifestEclipseGammaTitanium1788.FrostHunterAlphaAnimationNeoCosmos5761(i);
            if (FrostHunterAlphaAnimationNeoCosmos5761 == 34) {
                sb.append("\\\"");
            } else if (FrostHunterAlphaAnimationNeoCosmos5761 == 39) {
                sb.append("\\'");
            } else if (FrostHunterAlphaAnimationNeoCosmos5761 != 92) {
                switch (FrostHunterAlphaAnimationNeoCosmos5761) {
                    case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (FrostHunterAlphaAnimationNeoCosmos5761 < 32 || FrostHunterAlphaAnimationNeoCosmos5761 > 126) {
                            sb.append('\\');
                            sb.append((char) (((FrostHunterAlphaAnimationNeoCosmos5761 >>> 6) & 3) + 48));
                            sb.append((char) (((FrostHunterAlphaAnimationNeoCosmos5761 >>> 3) & 7) + 48));
                            sb.append((char) ((FrostHunterAlphaAnimationNeoCosmos5761 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) FrostHunterAlphaAnimationNeoCosmos5761);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static FrostHunterContentResolverPixelNovaXOmega9269 FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterContentResolverPixelNovaXOmega9269 frostHunterContentResolverPixelNovaXOmega9269) {
        if (frostHunterContentResolverPixelNovaXOmega9269 instanceof FrostHunterServiceInfoInfernoOmegaTitan4036) {
            FrostHunterServiceInfoInfernoOmegaTitan4036 frostHunterServiceInfoInfernoOmegaTitan4036 = (FrostHunterServiceInfoInfernoOmegaTitan4036) frostHunterContentResolverPixelNovaXOmega9269;
            if (frostHunterServiceInfoInfernoOmegaTitan4036.FrostHunterTextViewDragonStormMega4297 == FrostHunterGestureDetectorNovaPrimeHero2555.FrostHunterServiceEliteCelestialThunder1757()) {
                frostHunterServiceInfoInfernoOmegaTitan4036.FrostHunterCameraXTurboCelestialHero5430 = null;
                return frostHunterContentResolverPixelNovaXOmega9269;
            }
        }
        if (frostHunterContentResolverPixelNovaXOmega9269 instanceof FrostHunterRemoteConfigBlazeNova8248) {
            FrostHunterRemoteConfigBlazeNova8248 frostHunterRemoteConfigBlazeNova8248 = (FrostHunterRemoteConfigBlazeNova8248) frostHunterContentResolverPixelNovaXOmega9269;
            if (frostHunterRemoteConfigBlazeNova8248.FrostHunterFlowMaxDragonHero5809 == FrostHunterGestureDetectorNovaPrimeHero2555.FrostHunterServiceEliteCelestialThunder1757()) {
                frostHunterRemoteConfigBlazeNova8248.FrostHunterCameraXPixelTurboCosmos9814 = null;
                return frostHunterContentResolverPixelNovaXOmega9269;
            }
        }
        FrostHunterContentResolverPixelNovaXOmega9269 FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterProfilerUltraCyber8296.FrostHunterCameraXPixelTurboCosmos9814(frostHunterContentResolverPixelNovaXOmega9269, null, false);
        FrostHunterCameraXPixelTurboCosmos9814.FrostHunterAlertDialogAuroraDelta3200();
        return FrostHunterCameraXPixelTurboCosmos9814;
    }

    public static StaticLayout FrostHunterServiceEliteCelestialThunder1757(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i2 < 0) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("invalid end value");
        }
        if (i3 < 0) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("invalid maxLines value");
        }
        if (i < 0) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("invalid width value");
        }
        if (i4 < 0) {
            FrostHunterRippleDrawableNeoDelta6594.FrostHunterAlphaAnimationNeoCosmos5761("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            lineBreakStyle = FrostHunterOnItemLongClickListenerNovaDragon3849.FrostHunterLifecycleBlazeGammaElite2889().setLineBreakStyle(i7);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i8);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public abstract void FrostHunterFragmentBetaMegaVortex6025(boolean z);

    public void FrostHunterKeyframeGammaGamma1197(boolean z) {
    }
}

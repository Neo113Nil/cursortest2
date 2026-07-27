package android.content.Context;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPaintFlagsDrawFilterNovaXHeroFusion6981 extends FrostHunterKeyEventSolarVortex1388 {
    public long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final Context FrostHunterFragmentBetaMegaVortex6025;
    public AssetFileDescriptor FrostHunterLightSensorForceFusion4241;
    public boolean FrostHunterLintTitanVortexQuantum9911;
    public FileInputStream FrostHunterScaleAnimationStrikeSpark5059;
    public FrostHunterStateListAnimatorQuantumHyperionTitanium1903 FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterPaintFlagsDrawFilterNovaXHeroFusion6981(Context context) {
        super(false);
        this.FrostHunterFragmentBetaMegaVortex6025 = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final long FrostHunterKeyframeGammaGamma1197(FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903) {
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterStateListAnimatorQuantumHyperionTitanium1903;
        FrostHunterFragmentBetaMegaVortex6025();
        Uri uri = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761;
        long j = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLevelListDrawableFusionDragonHero2232;
        long j2 = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLifecycleBlazeGammaElite2889;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.FrostHunterFragmentBetaMegaVortex6025;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new FrostHunterOnTouchListenerInfernoRogue9807("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FrostHunterOnTouchListenerInfernoRogue9807("Resource identifier must be an integer.", null, ErrorCodes.PROTOCOL_EXCEPTION);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new FrostHunterOnTouchListenerInfernoRogue9807("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, ErrorCodes.PROTOCOL_EXCEPTION);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new FrostHunterOnTouchListenerInfernoRogue9807("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new FrostHunterOnTouchListenerInfernoRogue9807("Resource identifier must be an integer.", null, ErrorCodes.PROTOCOL_EXCEPTION);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (parseInt == 0) {
                    throw new FrostHunterOnTouchListenerInfernoRogue9807("Resource not found.", null, 2005);
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new FrostHunterOnTouchListenerInfernoRogue9807("Resource is compressed: " + normalizeScheme, null, 2000);
            }
            this.FrostHunterLightSensorForceFusion4241 = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.FrostHunterLightSensorForceFusion4241.getFileDescriptor());
            this.FrostHunterScaleAnimationStrikeSpark5059 = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new FrostHunterOnTouchListenerInfernoRogue9807(null, null, 2008);
                }
                long startOffset = this.FrostHunterLightSensorForceFusion4241.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new FrostHunterOnTouchListenerInfernoRogue9807(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = size;
                        if (size < 0) {
                            throw new FrostHunterOnTouchListenerInfernoRogue9807(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = j3;
                    if (j3 < 0) {
                        throw new FrostHunterMotionSceneTitaniumMega7732(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                    this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.FrostHunterLintTitanVortexQuantum9911 = true;
                FrostHunterResourcesTitanHyperVision5823(frostHunterStateListAnimatorQuantumHyperionTitanium1903);
                return j != -1 ? j : this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            } catch (FrostHunterOnTouchListenerInfernoRogue9807 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new FrostHunterOnTouchListenerInfernoRogue9807(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new FrostHunterOnTouchListenerInfernoRogue9807(null, e4, 2005);
        }
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final Uri FrostHunterLightSensorForceFusion4241() {
        FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        if (frostHunterStateListAnimatorQuantumHyperionTitanium1903 != null) {
            return frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final void close() {
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = null;
        try {
            try {
                FileInputStream fileInputStream = this.FrostHunterScaleAnimationStrikeSpark5059;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.FrostHunterScaleAnimationStrikeSpark5059 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.FrostHunterLightSensorForceFusion4241;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new FrostHunterOnTouchListenerInfernoRogue9807(null, e, 2000);
                    }
                } finally {
                    this.FrostHunterLightSensorForceFusion4241 = null;
                    if (this.FrostHunterLintTitanVortexQuantum9911) {
                        this.FrostHunterLintTitanVortexQuantum9911 = false;
                        FrostHunterRemoteConfigSpeedSpeed8566();
                    }
                }
            } catch (IOException e2) {
                throw new FrostHunterOnTouchListenerInfernoRogue9807(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.FrostHunterScaleAnimationStrikeSpark5059 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.FrostHunterLightSensorForceFusion4241;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.FrostHunterLightSensorForceFusion4241 = null;
                    if (this.FrostHunterLintTitanVortexQuantum9911) {
                        this.FrostHunterLintTitanVortexQuantum9911 = false;
                        FrostHunterRemoteConfigSpeedSpeed8566();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new FrostHunterOnTouchListenerInfernoRogue9807(null, e3, 2000);
                }
            } finally {
                this.FrostHunterLightSensorForceFusion4241 = null;
                if (this.FrostHunterLintTitanVortexQuantum9911) {
                    this.FrostHunterLintTitanVortexQuantum9911 = false;
                    FrostHunterRemoteConfigSpeedSpeed8566();
                }
            }
        }
    }

    @Override // android.content.Context.FrostHunterRoomDaoMaxPrimeQuantum2063
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new FrostHunterOnTouchListenerInfernoRogue9807(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.FrostHunterScaleAnimationStrikeSpark5059;
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            if (read != -1) {
                if (j2 != -1) {
                    this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = j2 - read;
                }
                FrostHunterBundlePulseFusionHero2475(read);
                return read;
            }
            if (j2 != -1) {
                throw new FrostHunterOnTouchListenerInfernoRogue9807("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}

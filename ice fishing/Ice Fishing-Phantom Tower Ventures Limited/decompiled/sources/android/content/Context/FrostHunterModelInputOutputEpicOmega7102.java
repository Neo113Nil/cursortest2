package android.content.Context;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterModelInputOutputEpicOmega7102 extends FrostHunterKeyEventSolarVortex1388 {
    public long FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
    public final ContentResolver FrostHunterFragmentBetaMegaVortex6025;
    public AssetFileDescriptor FrostHunterLightSensorForceFusion4241;
    public boolean FrostHunterLintTitanVortexQuantum9911;
    public FileInputStream FrostHunterScaleAnimationStrikeSpark5059;
    public Uri FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public FrostHunterModelInputOutputEpicOmega7102(Context context) {
        super(false);
        this.FrostHunterFragmentBetaMegaVortex6025 = context.getContentResolver();
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final long FrostHunterKeyframeGammaGamma1197(FrostHunterStateListAnimatorQuantumHyperionTitanium1903 frostHunterStateListAnimatorQuantumHyperionTitanium1903) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterAlphaAnimationNeoCosmos5761;
                long j = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLevelListDrawableFusionDragonHero2232;
                long j2 = frostHunterStateListAnimatorQuantumHyperionTitanium1903.FrostHunterLifecycleBlazeGammaElite2889;
                Uri normalizeScheme = uri.normalizeScheme();
                this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = normalizeScheme;
                FrostHunterFragmentBetaMegaVortex6025();
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.FrostHunterFragmentBetaMegaVortex6025;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.FrostHunterLightSensorForceFusion4241 = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new FrostHunterTextViewNeoVortex1898(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        throw new FrostHunterTextViewNeoVortex1898(e, e instanceof FileNotFoundException ? 2005 : i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.FrostHunterScaleAnimationStrikeSpark5059 = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new FrostHunterTextViewNeoVortex1898(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new FrostHunterTextViewNeoVortex1898(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = -1L;
                    } else {
                        long position = size - channel.position();
                        this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = position;
                        if (position < 0) {
                            throw new FrostHunterTextViewNeoVortex1898(null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = j3;
                    if (j3 < 0) {
                        throw new FrostHunterTextViewNeoVortex1898(null, 2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                    this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.FrostHunterLintTitanVortexQuantum9911 = true;
                FrostHunterResourcesTitanHyperVision5823(frostHunterStateListAnimatorQuantumHyperionTitanium1903);
                return j != -1 ? j : this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (FrostHunterTextViewNeoVortex1898 e3) {
            throw e3;
        }
    }

    @Override // android.content.Context.FrostHunterDigitalInkRecognitionForceHyper4284
    public final Uri FrostHunterLightSensorForceFusion4241() {
        return this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
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
                        throw new FrostHunterTextViewNeoVortex1898(e, 2000);
                    }
                } finally {
                    this.FrostHunterLightSensorForceFusion4241 = null;
                    if (this.FrostHunterLintTitanVortexQuantum9911) {
                        this.FrostHunterLintTitanVortexQuantum9911 = false;
                        FrostHunterRemoteConfigSpeedSpeed8566();
                    }
                }
            } catch (IOException e2) {
                throw new FrostHunterTextViewNeoVortex1898(e2, 2000);
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
                    throw new FrostHunterTextViewNeoVortex1898(e3, 2000);
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
                    throw new FrostHunterTextViewNeoVortex1898(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.FrostHunterScaleAnimationStrikeSpark5059;
            String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223;
                if (j2 != -1) {
                    this.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223 = j2 - read;
                }
                FrostHunterBundlePulseFusionHero2475(read);
                return read;
            }
        }
        return -1;
    }
}

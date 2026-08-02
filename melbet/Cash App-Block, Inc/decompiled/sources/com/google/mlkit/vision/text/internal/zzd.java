package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.common.FlagSet;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.SystemClock;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.StandaloneMediaClock;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.zzc;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class zzd implements MediaClock, zzm {
    public final Object zza;
    public final Object zzb;
    public boolean zzc;
    public boolean zzd;
    public Object zze;
    public Object zzf;

    public zzd(ExoPlayerImplInternal exoPlayerImplInternal, SystemClock systemClock) {
        this.zzb = exoPlayerImplInternal;
        this.zza = new StandaloneMediaClock(systemClock);
        this.zzc = true;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        MediaClock mediaClock = (MediaClock) this.zzf;
        return mediaClock != null ? mediaClock.getPlaybackParameters() : ((StandaloneMediaClock) this.zza).playbackParameters;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        if (this.zzc) {
            return ((StandaloneMediaClock) this.zza).getPositionUs();
        }
        MediaClock mediaClock = (MediaClock) this.zzf;
        mediaClock.getClass();
        return mediaClock.getPositionUs();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        if (this.zzc) {
            ((StandaloneMediaClock) this.zza).getClass();
            return false;
        }
        MediaClock mediaClock = (MediaClock) this.zzf;
        mediaClock.getClass();
        return mediaClock.hasSkippedSilenceSinceLastCall();
    }

    public void onRendererEnabled(BaseRenderer baseRenderer) {
        MediaClock mediaClock;
        MediaClock mediaClock2 = baseRenderer.getMediaClock();
        if (mediaClock2 == null || mediaClock2 == (mediaClock = (MediaClock) this.zzf)) {
            return;
        }
        if (mediaClock != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
        }
        this.zzf = mediaClock2;
        this.zze = baseRenderer;
        ((MediaCodecAudioRenderer) mediaClock2).setPlaybackParameters(((StandaloneMediaClock) this.zza).playbackParameters);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = (MediaClock) this.zzf;
        if (mediaClock != null) {
            mediaClock.setPlaybackParameters(playbackParameters);
            playbackParameters = ((MediaClock) this.zzf).getPlaybackParameters();
        }
        ((StandaloneMediaClock) this.zza).setPlaybackParameters(playbackParameters);
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public Text zza(InputImage inputImage) {
        TextRecognizerOptions textRecognizerOptions = (TextRecognizerOptions) this.zzb;
        if (((zzuv) this.zzf) == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) this.zzf;
        zzae.checkNotNull(zzuvVar);
        if (!this.zzc) {
            try {
                zzuvVar.zzc(zzuvVar.zza(), 1);
                this.zzc = true;
            } catch (RemoteException e) {
                throw new MlKitException(13, e, "Failed to init text recognizer ".concat(textRecognizerOptions.getLoggingLibraryName()));
            }
        }
        int i = inputImage.zzg;
        int i2 = inputImage.zzd;
        int i3 = inputImage.zze;
        int convertToMVRotation = CommonConvertUtils.convertToMVRotation(inputImage.zzf);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ObjectWrapper imageDataWrapper = zzc.getImageDataWrapper(inputImage);
        try {
            Parcel zza = zzuvVar.zza();
            int i4 = com.google.android.gms.internal.mlkit_vision_text_common.zzc.$r8$clinit;
            zza.writeStrongBinder(imageDataWrapper);
            zza.writeInt(1);
            int zzb = MooncakeHeaderViewKt.zzb(zza, 20293);
            MooncakeHeaderViewKt.zza(zza, 1, 4);
            zza.writeInt(i);
            MooncakeHeaderViewKt.zza(zza, 2, 4);
            zza.writeInt(i2);
            MooncakeHeaderViewKt.zza(zza, 3, 4);
            zza.writeInt(i3);
            MooncakeHeaderViewKt.zza(zza, 4, 4);
            zza.writeInt(convertToMVRotation);
            MooncakeHeaderViewKt.zza(zza, 5, 8);
            zza.writeLong(elapsedRealtime);
            MooncakeHeaderViewKt.zzc(zza, zzb);
            Parcel zzb2 = zzuvVar.zzb(zza, 3);
            zzvf createFromParcel = zzb2.readInt() == 0 ? null : zzvf.CREATOR.createFromParcel(zzb2);
            zzb2.recycle();
            return new Text(createFromParcel);
        } catch (RemoteException e2) {
            throw new MlKitException(13, e2, "Failed to run text recognizer ".concat(textRecognizerOptions.getLoggingLibraryName()));
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public void zzb() {
        zzuv zzd;
        zzuc zzucVar = (zzuc) this.zze;
        Context context = (Context) this.zza;
        TextRecognizerOptions textRecognizerOptions = (TextRecognizerOptions) this.zzb;
        if (((zzuv) this.zzf) != null) {
            return;
        }
        int i = 9;
        try {
            IInterface iInterface = null;
            if (textRecognizerOptions.getIsThickClient()) {
                Log.d("DecoupledTextDelegate", "Start loading thick OCR module.");
                IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_LOCAL, true != textRecognizerOptions.getIsThickClient() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin").instantiate("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator");
                int i2 = zzux.$r8$clinit;
                if (instantiate != null) {
                    IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    iInterface = queryLocalInterface instanceof zzuy ? (zzuy) queryLocalInterface : new zzuw(instantiate, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", 9);
                }
                zzd = ((zzuw) iInterface).zze(new ObjectWrapper(context), new zzvh(textRecognizerOptions.zzc, "optional-module-text-latin", null, true, 1, "en", false));
            } else {
                Log.d("DecoupledTextDelegate", "Start loading thin OCR module.");
                IBinder instantiate2 = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, true != textRecognizerOptions.getIsThickClient() ? "com.google.android.gms.vision.ocr" : "com.google.mlkit.dynamite.text.latin").instantiate("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator");
                int i3 = zzux.$r8$clinit;
                if (instantiate2 != null) {
                    IInterface queryLocalInterface2 = instantiate2.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
                    iInterface = queryLocalInterface2 instanceof zzuy ? (zzuy) queryLocalInterface2 : new zzuw(instantiate2, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator", 9);
                }
                zzd = ((zzuw) iInterface).zzd(new ObjectWrapper(context));
            }
            this.zzf = zzd;
            zzucVar.zzf(new FlagSet.Builder(textRecognizerOptions.getIsThickClient(), zzou.NO_ERROR, i), zzov.ON_DEVICE_TEXT_LOAD);
        } catch (RemoteException e) {
            zzucVar.zzf(new FlagSet.Builder(textRecognizerOptions.getIsThickClient(), zzou.OPTIONAL_MODULE_INIT_ERROR, i), zzov.ON_DEVICE_TEXT_LOAD);
            throw new MlKitException(13, e, "Failed to create text recognizer ".concat(textRecognizerOptions.getLoggingLibraryName()));
        } catch (DynamiteModule.LoadingException e2) {
            zzucVar.zzf(new FlagSet.Builder(textRecognizerOptions.getIsThickClient(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE, i), zzov.ON_DEVICE_TEXT_LOAD);
            if (textRecognizerOptions.getIsThickClient()) {
                throw new MlKitException(13, e2, CameraSelector$$ExternalSyntheticOutline0.m("Failed to load text module ", textRecognizerOptions.getLoggingLibraryName(), ". ", e2.getMessage()));
            }
            if (!this.zzd) {
                OptionalModuleUtils.requestDownload(context, textRecognizerOptions.getIsThickClient() ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_OCR});
                this.zzd = true;
            }
            throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public void zzc() {
        zzuv zzuvVar = (zzuv) this.zzf;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzc(zzuvVar.zza(), 2);
            } catch (RemoteException e) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(((TextRecognizerOptions) this.zzb).getLoggingLibraryName()), e);
            }
            this.zzf = null;
        }
        this.zzc = false;
    }

    public zzd(Context context, TextRecognizerOptions textRecognizerOptions, zzuc zzucVar) {
        this.zza = context;
        this.zzb = textRecognizerOptions;
        this.zze = zzucVar;
    }
}

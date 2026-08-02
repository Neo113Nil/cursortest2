package com.google.mlkit.vision.face.internal;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import androidx.camera.video.internal.audio.AutoValue_AudioStream_PacketInfo;
import androidx.room.TransactorKt;
import com.fillr.e0;
import com.google.android.filament.Box;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.mlkit_vision_face.zzkf;
import com.google.android.gms.internal.mlkit_vision_face.zzkh;
import com.google.android.gms.internal.mlkit_vision_face.zzkl;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzll;
import com.google.android.gms.internal.mlkit_vision_face.zzoa;
import com.google.mlkit.vision.common.InputImage;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.moneybot.genie.TextViewKt;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.brotli.dec.HuffmanTreeGroup;
import utils.StringUtilsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzf implements AudioStream, zzoa {
    public final Object zza;
    public long zzb;
    public final Serializable zzc;
    public final int zzd;
    public final int zze;
    public Object zzf;

    public zzf(AutoValue_AudioSettings autoValue_AudioSettings) {
        this.zza = new AtomicBoolean(false);
        this.zzc = new AtomicBoolean(false);
        this.zzd = autoValue_AudioSettings.getBytesPerFrame();
        this.zze = autoValue_AudioSettings.captureSampleRate;
    }

    public void checkNotReleasedOrThrow$2() {
        TransactorKt.checkState("AudioStream has been released.", !((AtomicBoolean) this.zzc).get());
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public AutoValue_AudioStream_PacketInfo read(ByteBuffer byteBuffer) {
        checkNotReleasedOrThrow$2();
        TransactorKt.checkState("AudioStream has not been started.", ((AtomicBoolean) this.zza).get());
        long remaining = byteBuffer.remaining();
        int i = this.zzd;
        long sizeToFrameCount = TextViewKt.sizeToFrameCount(i, remaining);
        long j = i;
        TransactorKt.checkArgument("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * sizeToFrameCount);
        if (i2 <= 0) {
            return new AutoValue_AudioStream_PacketInfo(0, this.zzb);
        }
        long frameCountToDurationNs = this.zzb + TextViewKt.frameCountToDurationNs(this.zze, sizeToFrameCount);
        long nanoTime = frameCountToDurationNs - System.nanoTime();
        if (nanoTime > 0) {
            try {
                Thread.sleep(nanoTime / 1000000);
            } catch (InterruptedException e) {
                StringUtilsKt.w("SilentAudioStream", "Ignore interruption", e);
            }
        }
        TransactorKt.checkState(null, i2 <= byteBuffer.remaining());
        byte[] bArr = (byte[]) this.zzf;
        if (bArr == null || bArr.length < i2) {
            this.zzf = new byte[i2];
        }
        int position = byteBuffer.position();
        byteBuffer.put((byte[]) this.zzf, 0, i2).limit(position + i2).position(position);
        AutoValue_AudioStream_PacketInfo autoValue_AudioStream_PacketInfo = new AutoValue_AudioStream_PacketInfo(i2, this.zzb);
        this.zzb = frameCountToDurationNs;
        return autoValue_AudioStream_PacketInfo;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzoa
    public HuffmanTreeGroup zza$6() {
        int limit;
        zzh zzhVar = (zzh) this.zza;
        long j = this.zzb;
        zzks zzksVar = (zzks) this.zzc;
        int i = this.zzd;
        int i2 = this.zze;
        InputImage inputImage = (InputImage) this.zzf;
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        JWECryptoParts jWECryptoParts2 = new JWECryptoParts();
        jWECryptoParts2.header = Long.valueOf(j & Long.MAX_VALUE);
        jWECryptoParts2.encryptedKey = zzksVar;
        jWECryptoParts2.iv = Boolean.valueOf(zzh.zza.get());
        Boolean bool = Boolean.TRUE;
        jWECryptoParts2.cipherText = bool;
        jWECryptoParts2.authenticationTag = bool;
        jWECryptoParts.header = new zzkl(jWECryptoParts2);
        jWECryptoParts.iv = zzj.zza(zzhVar.zzc);
        jWECryptoParts.cipherText = Integer.valueOf(i & Integer.MAX_VALUE);
        jWECryptoParts.authenticationTag = Integer.valueOf(i2 & Integer.MAX_VALUE);
        zzh.zzb.getClass();
        int i3 = inputImage.zzg;
        int i4 = 17;
        if (i3 == -1) {
            Bitmap bitmap = inputImage.zza;
            zzae.checkNotNull(bitmap);
            limit = bitmap.getAllocationByteCount();
        } else if (i3 == 17 || i3 == 842094169) {
            ByteBuffer byteBuffer = inputImage.zzb;
            zzae.checkNotNull(byteBuffer);
            limit = byteBuffer.limit();
        } else if (i3 != 35) {
            limit = 0;
        } else {
            Image.Plane[] planes = inputImage.getPlanes();
            zzae.checkNotNull(planes);
            limit = (planes[0].getBuffer().limit() * 3) / 2;
        }
        Box box = new Box(i4);
        box.mCenter = i3 != -1 ? i3 != 35 ? i3 != 842094169 ? i3 != 16 ? i3 != 17 ? zzkf.UNKNOWN_FORMAT : zzkf.NV21 : zzkf.NV16 : zzkf.YV12 : zzkf.YUV_420_888 : zzkf.BITMAP;
        box.mHalfExtent = Integer.valueOf(limit & Integer.MAX_VALUE);
        jWECryptoParts.encryptedKey = new zzkh(box);
        zzll zzllVar = new zzll(jWECryptoParts);
        e0 e0Var = new e0(19);
        e0Var.c = zzhVar.zzg ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
        e0Var.i = zzllVar;
        return new HuffmanTreeGroup(e0Var, 0);
    }

    public /* synthetic */ zzf(zzh zzhVar, long j, zzks zzksVar, int i, int i2, InputImage inputImage) {
        this.zza = zzhVar;
        this.zzb = j;
        this.zzc = zzksVar;
        this.zzd = i;
        this.zze = i2;
        this.zzf = inputImage;
    }
}

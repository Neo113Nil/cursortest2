package com.google.mlkit.vision.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.SystemClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.Fillr;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.mlkit_common.zzsr;
import com.google.android.gms.internal.mlkit_vision_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzio;
import com.google.android.gms.internal.mlkit_vision_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zziv;
import com.google.android.gms.internal.mlkit_vision_common.zzma;
import com.google.android.gms.internal.mlkit_vision_common.zzmj;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.sdkinternal.zzh;
import com.squareup.workflow1.internal.SubtreeManager;
import java.nio.ByteBuffer;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.types.KTypeSubstitutorKt;

/* loaded from: classes4.dex */
public final class InputImage {
    public volatile Bitmap zza;
    public volatile ByteBuffer zzb;
    public volatile zzb zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    public InputImage(ByteBuffer byteBuffer, int i, int i2, int i3) {
        zzae.checkNotNull(byteBuffer);
        this.zzb = byteBuffer;
        zzae.checkArgument("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
        byteBuffer.rewind();
        this.zzd = i;
        this.zze = i2;
        zza(i3);
        this.zzf = i3;
        this.zzg = 17;
    }

    public static InputImage fromMediaImage(Image image, int i) {
        InputImage inputImage;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzae.checkNotNull(image, "Please provide a valid image");
        zza(i);
        zzae.checkArgument("Only JPEG and YUV_420_888 are supported now", image.getFormat() == 256 || image.getFormat() == 35);
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            zzae.checkArgument("Only JPEG is supported now", image.getFormat() == 256);
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                a$$ExternalSyntheticBUOutline0.m$3("Unexpected image format, JPEG should have exactly 1 image plane");
                return null;
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            inputImage = new InputImage(KTypeSubstitutorKt.zza(decodeByteArray, i, decodeByteArray.getWidth(), decodeByteArray.getHeight()), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            inputImage = new InputImage(image, image.getWidth(), image.getHeight(), i);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        InputImage inputImage2 = inputImage;
        zzc(image.getFormat(), 5, image.getHeight(), image.getWidth(), limit, i, elapsedRealtime);
        return inputImage2;
    }

    public static void zza(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        zzae.checkArgument("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzc(int i, int i2, int i3, int i4, int i5, int i6, long j) {
        zzmj zzmjVar;
        zziv zzivVar;
        long elapsedRealtime;
        HashMap hashMap;
        synchronized (zzms.class) {
            zzma zzmaVar = new zzma();
            synchronized (zzms.class) {
                try {
                    int i7 = 3;
                    if (zzms.zza == null) {
                        zzms.zza = new zzsr(i7);
                    }
                    zzmjVar = (zzmj) zzms.zza.get(zzmaVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - j;
            zzivVar = zziv.INPUT_IMAGE_CONSTRUCTION;
            zzw zzwVar = zzmjVar.zzg;
            elapsedRealtime = SystemClock.elapsedRealtime();
            hashMap = zzmjVar.zzk;
            if (hashMap.get(zzivVar) != null && elapsedRealtime - ((Long) hashMap.get(zzivVar)).longValue() <= 30000) {
                return;
            }
            hashMap.put(zzivVar, Long.valueOf(elapsedRealtime));
            SubtreeManager subtreeManager = new SubtreeManager();
            subtreeManager.emitActionToParent = i == -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21 : zzii.NV16 : zzii.YV12 : zzii.YUV_420_888 : zzii.BITMAP;
            subtreeManager.contextForChildren = i2 == 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH : zzio.BYTEBUFFER : zzio.BYTEARRAY : zzio.BITMAP;
            subtreeManager.workflowSession = Integer.valueOf(i5 & Integer.MAX_VALUE);
            subtreeManager.idCounter = Integer.valueOf(i3 & Integer.MAX_VALUE);
            subtreeManager.interceptor = Integer.valueOf(i4 & Integer.MAX_VALUE);
            subtreeManager.snapshotCache = Long.valueOf(elapsedRealtime2 & Long.MAX_VALUE);
            subtreeManager.children = Integer.valueOf(i6 & Integer.MAX_VALUE);
            zziq zziqVar = new zziq(subtreeManager);
            zzah zzahVar = new zzah(7, false);
            zzahVar.zzc = zziqVar;
            zzh.zza.execute(new Fillr.AnonymousClass2(zzmjVar, new zbc(zzahVar), !zzwVar.isSuccessful() ? (String) zzwVar.getResult() : LibraryVersion.zzb.getVersion(zzmjVar.zzi)));
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime() - j;
        zzivVar = zziv.INPUT_IMAGE_CONSTRUCTION;
        zzw zzwVar2 = zzmjVar.zzg;
        elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap = zzmjVar.zzk;
        if (hashMap.get(zzivVar) != null) {
            return;
        }
        hashMap.put(zzivVar, Long.valueOf(elapsedRealtime));
        SubtreeManager subtreeManager2 = new SubtreeManager();
        subtreeManager2.emitActionToParent = i == -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21 : zzii.NV16 : zzii.YV12 : zzii.YUV_420_888 : zzii.BITMAP;
        subtreeManager2.contextForChildren = i2 == 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH : zzio.BYTEBUFFER : zzio.BYTEARRAY : zzio.BITMAP;
        subtreeManager2.workflowSession = Integer.valueOf(i5 & Integer.MAX_VALUE);
        subtreeManager2.idCounter = Integer.valueOf(i3 & Integer.MAX_VALUE);
        subtreeManager2.interceptor = Integer.valueOf(i4 & Integer.MAX_VALUE);
        subtreeManager2.snapshotCache = Long.valueOf(elapsedRealtime22 & Long.MAX_VALUE);
        subtreeManager2.children = Integer.valueOf(i6 & Integer.MAX_VALUE);
        zziq zziqVar2 = new zziq(subtreeManager2);
        zzah zzahVar2 = new zzah(7, false);
        zzahVar2.zzc = zziqVar2;
        zzh.zza.execute(new Fillr.AnonymousClass2(zzmjVar, new zbc(zzahVar2), !zzwVar2.isSuccessful() ? (String) zzwVar2.getResult() : LibraryVersion.zzb.getVersion(zzmjVar.zzi)));
    }

    public final Image.Plane[] getPlanes() {
        if (this.zzc == null) {
            return null;
        }
        return ((Image) this.zzc.zza).getPlanes();
    }

    public InputImage(Image image, int i, int i2, int i3) {
        zzae.checkNotNull(image);
        this.zzc = new zzb(image);
        this.zzd = i;
        this.zze = i2;
        zza(i3);
        this.zzf = i3;
        this.zzg = 35;
    }

    public InputImage(Bitmap bitmap, int i) {
        zzae.checkNotNull(bitmap);
        this.zza = bitmap;
        this.zzd = bitmap.getWidth();
        this.zze = bitmap.getHeight();
        zza(i);
        this.zzf = i;
        this.zzg = -1;
    }
}

package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class BarhopperV3 implements Closeable {
    public long nativePointer;

    private native void closeNative(long j);

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    public static BarhopperProto$BarhopperResponse toProto(byte[] bArr) {
        bArr.getClass();
        try {
            zzds zzdsVar = zzds.zza;
            zzfu zzfuVar = zzfu.zzb;
            return BarhopperProto$BarhopperResponse.zzb(bArr, zzds.zza);
        } catch (zzer e) {
            a$$ExternalSyntheticBUOutline0.m("Received unexpected BarhopperResponse buffer: {0}", e);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.nativePointer;
        if (j != 0) {
            closeNative(j);
            this.nativePointer = 0L;
        }
    }

    public final void create(BarhopperV3Options barhopperV3Options) {
        if (this.nativePointer != 0) {
            Log.w("BarhopperV3", "Native pointer already exists.");
            return;
        }
        try {
            int zzF = barhopperV3Options.zzF();
            byte[] bArr = new byte[zzF];
            zzdk zzdkVar = new zzdk(bArr, zzF);
            barhopperV3Options.zzab(zzdkVar);
            if (zzF - zzdkVar.zzd != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
            this.nativePointer = createNativeWithClientOptions;
            if (createNativeWithClientOptions != 0) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Failed to create native pointer with client options.");
        } catch (IOException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Serializing ", BarhopperV3Options.class.getName(), " to a byte array threw an IOException (should never happen)."), (Throwable) e);
        }
    }

    public final BarhopperProto$BarhopperResponse recognize(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.nativePointer == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Native pointer does not exist.");
            return null;
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d("BarhopperV3", "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return toProto(recognizeBitmapNative(this.nativePointer, bitmap, recognitionOptions));
    }

    public final BarhopperProto$BarhopperResponse recognize(int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j = this.nativePointer;
        if (j != 0) {
            return toProto(recognizeNative(j, i, i2, bArr, recognitionOptions));
        }
        a$$ExternalSyntheticBUOutline0.m$1("Native pointer does not exist.");
        return null;
    }

    public final BarhopperProto$BarhopperResponse recognize(int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j = this.nativePointer;
        if (j != 0) {
            return toProto(recognizeBufferNative(j, i, i2, byteBuffer, recognitionOptions));
        }
        a$$ExternalSyntheticBUOutline0.m$1("Native pointer does not exist.");
        return null;
    }
}

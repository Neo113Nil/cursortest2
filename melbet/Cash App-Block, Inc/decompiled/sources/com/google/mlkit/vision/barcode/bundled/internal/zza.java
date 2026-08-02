package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import android.os.Parcel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbt;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.MultiScaleDecodingOptions;
import com.google.android.libraries.barhopper.MultiScaleDetectionOptions;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.barhopper.deeplearning.BarhopperV3Options;
import com.google.barhopper.deeplearning.zzab;
import com.google.barhopper.deeplearning.zzac;
import com.google.barhopper.deeplearning.zze;
import com.google.barhopper.deeplearning.zzf;
import com.google.barhopper.deeplearning.zzh;
import com.google.barhopper.deeplearning.zzi;
import com.google.barhopper.deeplearning.zzk;
import com.google.photos.vision.barhopper.BarhopperProto$BarhopperResponse;
import com.google.photos.vision.barhopper.zzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class zza extends zzb implements zzbn {
    public static final int[] zza = {5, 7, 7, 7, 5, 5};
    public static final double[][] zzb = {new double[]{0.075d, 1.0d}, new double[]{0.1d, 1.0d}, new double[]{0.125d, 1.0d}, new double[]{0.2d, 2.0d}, new double[]{0.2d, 0.5d}, new double[]{0.15d, 1.0d}, new double[]{0.2d, 1.0d}, new double[]{0.25d, 1.0d}, new double[]{0.35d, 2.0d}, new double[]{0.35d, 0.5d}, new double[]{0.35d, 3.0d}, new double[]{0.35d, 0.3333d}, new double[]{0.3d, 1.0d}, new double[]{0.4d, 1.0d}, new double[]{0.5d, 1.0d}, new double[]{0.5d, 2.0d}, new double[]{0.5d, 0.5d}, new double[]{0.5d, 3.0d}, new double[]{0.5d, 0.3333d}, new double[]{0.6d, 1.0d}, new double[]{0.8d, 1.0d}, new double[]{1.0d, 1.0d}, new double[]{0.65d, 2.0d}, new double[]{0.65d, 0.5d}, new double[]{0.65d, 3.0d}, new double[]{0.65d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.8d, 2.0d}, new double[]{0.8d, 0.5d}, new double[]{0.8d, 3.0d}, new double[]{0.8d, 0.3333d}, new double[]{1.0d, 1.0d}, new double[]{0.95d, 2.0d}, new double[]{0.95d, 0.5d}, new double[]{0.95d, 3.0d}, new double[]{0.95d, 0.3333d}};
    public final Context zzc;
    public final zzba zzd;
    public BarhopperV3 zze;

    public zza(Context context, zzba zzbaVar) {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        this.zzc = context;
        this.zzd = zzbaVar;
    }

    public static zzan zzh(zzl zzlVar, String str, String str2) {
        if (zzlVar == null || str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int zzf = zzlVar.zzf();
        int zzd = zzlVar.zzd();
        int zza2 = zzlVar.zza();
        int zzb2 = zzlVar.zzb();
        int zzc = zzlVar.zzc();
        int zze = zzlVar.zze();
        return new zzan(matcher.find() ? matcher.group(1) : null, zzf, zzd, zza2, zzb2, zzlVar.zzj(), zzc, zze);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            BarhopperV3 barhopperV3 = this.zze;
            if (barhopperV3 != null) {
                barhopperV3.close();
                this.zze = null;
            }
            parcel2.writeNoException();
            return true;
        }
        zzba zzbaVar = this.zzd;
        if (i == 3) {
            IObjectWrapper asInterface = ObjectWrapper.asInterface(parcel.readStrongBinder());
            zzcc zzccVar = (zzcc) zzc.zza(parcel, zzcc.CREATOR);
            zzc.zzb(parcel);
            RecognitionOptions recognitionOptions = new RecognitionOptions();
            recognitionOptions.setBarcodeFormats(zzbaVar.zza);
            recognitionOptions.setOutputUnrecognizedBarcodes(zzbaVar.zzb);
            recognitionOptions.setEnableQrAlignmentGrid();
            recognitionOptions.setEnableUseKeypointAsFinderPattern();
            ArrayList zzj = zzj(asInterface, zzccVar, recognitionOptions);
            parcel2.writeNoException();
            parcel2.writeTypedList(zzj);
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return false;
            }
            zzc.zzb(parcel);
            zzd();
            parcel2.writeNoException();
            return true;
        }
        IObjectWrapper asInterface2 = ObjectWrapper.asInterface(parcel.readStrongBinder());
        zzcc zzccVar2 = (zzcc) zzc.zza(parcel, zzcc.CREATOR);
        zzbc zzbcVar = (zzbc) zzc.zza(parcel, zzbc.CREATOR);
        zzc.zzb(parcel);
        RecognitionOptions recognitionOptions2 = new RecognitionOptions();
        recognitionOptions2.setBarcodeFormats(zzbaVar.zza);
        recognitionOptions2.setOutputUnrecognizedBarcodes(zzbaVar.zzb);
        recognitionOptions2.setEnableQrAlignmentGrid();
        recognitionOptions2.setEnableUseKeypointAsFinderPattern();
        MultiScaleDecodingOptions multiScaleDecodingOptions = new MultiScaleDecodingOptions();
        multiScaleDecodingOptions.setExtraScales(zzbcVar.zza.zza);
        zzbt zzbtVar = zzbcVar.zza;
        multiScaleDecodingOptions.setMinimumDetectedDimension(zzbtVar.zzb);
        multiScaleDecodingOptions.setSkipProcessingIfBarcodeFound(zzbtVar.zzc);
        recognitionOptions2.setMultiScaleDecodingOptions(multiScaleDecodingOptions);
        MultiScaleDetectionOptions multiScaleDetectionOptions = new MultiScaleDetectionOptions();
        multiScaleDetectionOptions.setExtraScales(zzbtVar.zza);
        recognitionOptions2.setMultiScaleDetectionOptions(multiScaleDetectionOptions);
        recognitionOptions2.setQrEnableFourthCornerApproximation(zzbcVar.zzd);
        ArrayList zzj2 = zzj(asInterface2, zzccVar2, recognitionOptions2);
        parcel2.writeNoException();
        parcel2.writeTypedList(zzj2);
        return true;
    }

    public final void zzd() {
        Context context = this.zzc;
        if (this.zze != null) {
            return;
        }
        BarhopperV3 barhopperV3 = new BarhopperV3();
        System.loadLibrary("barhopper_v3");
        this.zze = barhopperV3;
        zzh zza$1 = zzi.zza$1();
        zze zza$12 = zzf.zza$1();
        int i = 16;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            com.google.barhopper.deeplearning.zzb zza$13 = com.google.barhopper.deeplearning.zzc.zza$1();
            zza$13.zzm();
            com.google.barhopper.deeplearning.zzc.zzf((com.google.barhopper.deeplearning.zzc) zza$13.zza, i);
            zza$13.zzm();
            com.google.barhopper.deeplearning.zzc.zzc((com.google.barhopper.deeplearning.zzc) zza$13.zza, i);
            for (int i4 = 0; i4 < zza[i3]; i4++) {
                double[] dArr = zzb[i2];
                double d = dArr[0] * 320.0d;
                float sqrt = (float) Math.sqrt(dArr[1]);
                float f = (float) d;
                zza$13.zzm();
                com.google.barhopper.deeplearning.zzc.zzd((com.google.barhopper.deeplearning.zzc) zza$13.zza, f / sqrt);
                zza$13.zzm();
                com.google.barhopper.deeplearning.zzc.zze((com.google.barhopper.deeplearning.zzc) zza$13.zza, f * sqrt);
                i2++;
            }
            i += i;
            zza$12.zzm();
            zzf.zzc((zzf) zza$12.zza, (com.google.barhopper.deeplearning.zzc) zza$13.zzh());
        }
        zza$1.zzm();
        zzi.zzc((zzi) zza$1.zza, (zzf) zza$12.zzh());
        try {
            InputStream open = context.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
            try {
                InputStream open2 = context.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                try {
                    InputStream open3 = context.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                    try {
                        BarhopperV3 barhopperV32 = this.zze;
                        zzae.checkNotNull(barhopperV32);
                        zzk zza2 = BarhopperV3Options.zza();
                        zzdf zzs = zzdf.zzs(open);
                        zza$1.zzm();
                        zzi.zzd((zzi) zza$1.zza, zzs);
                        zza2.zzm();
                        BarhopperV3Options.zzc((BarhopperV3Options) zza2.zza, (zzi) zza$1.zzh());
                        zzab zza$14 = zzac.zza$1();
                        zzdf zzs2 = zzdf.zzs(open2);
                        zza$14.zzm();
                        zzac.zzd((zzac) zza$14.zza, zzs2);
                        zzdf zzs3 = zzdf.zzs(open3);
                        zza$14.zzm();
                        zzac.zzc((zzac) zza$14.zza, zzs3);
                        zza2.zzm();
                        BarhopperV3Options.zzd((BarhopperV3Options) zza2.zza, (zzac) zza$14.zzh());
                        barhopperV32.create((BarhopperV3Options) zza2.zzh());
                        if (open3 != null) {
                            open3.close();
                        }
                        if (open2 != null) {
                            open2.close();
                        }
                        if (open != null) {
                            open.close();
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m("Failed to open Barcode models", e);
        }
    }

    public final BarhopperProto$BarhopperResponse zzi(ByteBuffer byteBuffer, zzcc zzccVar, RecognitionOptions recognitionOptions) {
        BarhopperV3 barhopperV3 = this.zze;
        zzae.checkNotNull(barhopperV3);
        zzae.checkNotNull(byteBuffer);
        if (byteBuffer.isDirect()) {
            return barhopperV3.recognize(zzccVar.zzb, zzccVar.zzc, byteBuffer, recognitionOptions);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV3.recognize(zzccVar.zzb, zzccVar.zzc, byteBuffer.array(), recognitionOptions);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV3.recognize(zzccVar.zzb, zzccVar.zzc, bArr, recognitionOptions);
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    public final java.util.ArrayList zzj(com.google.android.gms.dynamic.IObjectWrapper r49, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc r50, com.google.android.libraries.barhopper.RecognitionOptions r51) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.barcode.bundled.internal.zza.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcc, com.google.android.libraries.barhopper.RecognitionOptions):java.util.ArrayList");
    }
}

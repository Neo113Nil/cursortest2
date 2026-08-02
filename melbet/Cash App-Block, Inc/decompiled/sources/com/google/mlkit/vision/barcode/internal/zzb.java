package com.google.mlkit.vision.barcode.internal;

import android.util.SparseArray;
import coil3.request.OneShotDisposable;
import com.google.android.gms.internal.fido.zzfz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.squareup.scannerview.SizeMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class zzb {
    public static final AtomicReference zza;
    public static final SparseArray zzb;
    public static final SparseArray zzc;
    public static final HashMap zzd;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        zzc = sparseArray2;
        zza = new AtomicReference();
        sparseArray.put(-1, zzrn.FORMAT_UNKNOWN);
        sparseArray.put(1, zzrn.FORMAT_CODE_128);
        sparseArray.put(2, zzrn.FORMAT_CODE_39);
        sparseArray.put(4, zzrn.FORMAT_CODE_93);
        sparseArray.put(8, zzrn.FORMAT_CODABAR);
        sparseArray.put(16, zzrn.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzrn.FORMAT_EAN_13);
        sparseArray.put(64, zzrn.FORMAT_EAN_8);
        sparseArray.put(128, zzrn.FORMAT_ITF);
        sparseArray.put(256, zzrn.FORMAT_QR_CODE);
        sparseArray.put(512, zzrn.FORMAT_UPC_A);
        sparseArray.put(1024, zzrn.FORMAT_UPC_E);
        sparseArray.put(2048, zzrn.FORMAT_PDF417);
        sparseArray.put(4096, zzrn.FORMAT_AZTEC);
        sparseArray2.put(0, zzro.TYPE_UNKNOWN);
        sparseArray2.put(1, zzro.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzro.TYPE_EMAIL);
        sparseArray2.put(3, zzro.TYPE_ISBN);
        sparseArray2.put(4, zzro.TYPE_PHONE);
        sparseArray2.put(5, zzro.TYPE_PRODUCT);
        sparseArray2.put(6, zzro.TYPE_SMS);
        sparseArray2.put(7, zzro.TYPE_TEXT);
        sparseArray2.put(8, zzro.TYPE_URL);
        sparseArray2.put(9, zzro.TYPE_WIFI);
        sparseArray2.put(10, zzro.TYPE_GEO);
        sparseArray2.put(11, zzro.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzro.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        zzd = hashMap;
        hashMap.put(1, zzvw.CODE_128);
        hashMap.put(2, zzvw.CODE_39);
        hashMap.put(4, zzvw.CODE_93);
        hashMap.put(8, zzvw.CODABAR);
        hashMap.put(16, zzvw.DATA_MATRIX);
        hashMap.put(32, zzvw.EAN_13);
        hashMap.put(64, zzvw.EAN_8);
        hashMap.put(128, zzvw.ITF);
        hashMap.put(256, zzvw.QR_CODE);
        hashMap.put(512, zzvw.UPC_A);
        hashMap.put(1024, zzvw.UPC_E);
        hashMap.put(2048, zzvw.PDF417);
        hashMap.put(4096, zzvw.AZTEC);
    }

    public static zzvz zzc(BarcodeScannerOptions barcodeScannerOptions) {
        int i = barcodeScannerOptions.zza;
        zzfz zzfzVar = new zzfz();
        HashMap hashMap = zzd;
        if (i == 0) {
            Collection values = hashMap.values();
            if (values instanceof Collection) {
                Collection collection = values;
                zzfzVar.zzd(collection.size() + zzfzVar.zzb);
                if (collection instanceof zzcn) {
                    zzfzVar.zzb = ((zzcn) collection).zza(zzfzVar.zzb, (Object[]) zzfzVar.zza);
                }
            }
            Iterator it = values.iterator();
            while (it.hasNext()) {
                zzfzVar.zza$com$google$android$gms$internal$mlkit_vision_barcode$zzcl(it.next());
            }
        } else {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & i) != 0) {
                    zzfzVar.zza$com$google$android$gms$internal$mlkit_vision_barcode$zzcl((zzvw) entry.getValue());
                }
            }
        }
        OneShotDisposable oneShotDisposable = new OneShotDisposable(20, false);
        oneShotDisposable.job = zzfzVar.zzf();
        return new zzvz(oneShotDisposable);
    }

    public static String zzd() {
        return true != zzf() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static void zze(zzwp zzwpVar, zzrb zzrbVar) {
        zzwpVar.zzf(new SizeMap(zzrbVar, 8), zzrc.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean zzf() {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zzd2 = zzo.zzd(MlKitContext.getInstance().getApplicationContext());
        atomicReference.set(Boolean.valueOf(zzd2));
        return zzd2;
    }
}

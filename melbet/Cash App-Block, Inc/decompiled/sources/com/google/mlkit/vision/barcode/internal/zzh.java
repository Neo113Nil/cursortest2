package com.google.mlkit.vision.barcode.internal;

import com.bugsnag.android.Client;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzee;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzh extends MobileVisionBase implements BarcodeScanner {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final zzxk zzb;
    public final boolean zze;
    public final BarcodeScannerOptions zzf;
    public int zzg;
    public boolean zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(BarcodeScannerOptions barcodeScannerOptions, zzl zzlVar, Executor executor, zzwp zzwpVar, MlKitContext mlKitContext) {
        super(zzlVar, executor);
        ZoomSuggestionOptions zoomSuggestionOptions = barcodeScannerOptions.zzd;
        zzxk zzxkVar = null;
        if (zoomSuggestionOptions != null) {
            zzxk zzxkVar2 = new zzxk(mlKitContext.getApplicationContext(), zzxf.zza, mlKitContext.getApplicationContext().getPackageName());
            com.google.mlkit.vision.common.zzb zzbVar = new com.google.mlkit.vision.common.zzb(zoomSuggestionOptions);
            zzee zzeeVar = zzee.zza;
            zzxkVar2.zzs = zzbVar;
            zzxkVar2.zzm = zzeeVar;
            synchronized (zzxkVar2.zzh) {
                try {
                    int i = zzxkVar2.zze;
                    if (i != 2 && i != 4) {
                        zzxkVar2.zzr(true);
                        zzxkVar2.zzc = zzxkVar2.zzi.scheduleWithFixedDelay(new Client.AnonymousClass7(zzxkVar2, 28), 500L, 500L, TimeUnit.MILLISECONDS);
                        if (zzxkVar2.zze == 1) {
                            zzxkVar2.zzd = UUID.randomUUID().toString();
                            zzxkVar2.zzq = zzxkVar2.zzj.zza();
                            zzxkVar2.zzr = false;
                            zzrc zzrcVar = zzrc.SCANNER_AUTO_ZOOM_START;
                            float f = zzxkVar2.zzn;
                            zzxkVar2.zzq(zzrcVar, f, f, null);
                        } else {
                            zzrc zzrcVar2 = zzrc.SCANNER_AUTO_ZOOM_RESUME;
                            float f2 = zzxkVar2.zzn;
                            zzxkVar2.zzq(zzrcVar2, f2, f2, null);
                        }
                        zzxkVar2.zze = 2;
                    }
                } finally {
                }
            }
            zzxkVar = zzxkVar2;
        }
        this.zzf = barcodeScannerOptions;
        boolean zzf = zzb.zzf();
        this.zze = zzf;
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.encryptedKey = zzb.zzc(barcodeScannerOptions);
        zzrr zzrrVar = new zzrr(jWECryptoParts);
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.emitActionToParent = zzf ? zzra.TYPE_THICK : zzra.TYPE_THIN;
        subtreeManager.workflowSession = zzrrVar;
        com.google.mlkit.common.sdkinternal.zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) zzwpVar, (Object) new HuffmanTreeGroup(subtreeManager, 1), (Enum) zzrc.ON_DEVICE_BARCODE_CREATE, zzwpVar.zzj(), 6));
        this.zzb = zzxkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002f, code lost:
    
        throw r0;
     */
    @Override // com.google.mlkit.vision.common.internal.MobileVisionBase, java.io.Closeable, java.lang.AutoCloseable, com.google.mlkit.vision.barcode.BarcodeScanner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void close() {
        try {
            zzxk zzxkVar = this.zzb;
            if (zzxkVar != null) {
                zzxkVar.zzn(this.zzh);
                zzxk zzxkVar2 = this.zzb;
                synchronized (zzxkVar2.zzh) {
                    if (zzxkVar2.zze != 4) {
                        zzxkVar2.zzn(false);
                        zzxkVar2.zzi.shutdown();
                        zzxkVar2.zze = 4;
                    }
                }
            }
            super.close();
        } finally {
        }
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.zze ? OptionalModuleUtils.EMPTY_FEATURES : new Feature[]{OptionalModuleUtils.FEATURE_BARCODE};
    }
}

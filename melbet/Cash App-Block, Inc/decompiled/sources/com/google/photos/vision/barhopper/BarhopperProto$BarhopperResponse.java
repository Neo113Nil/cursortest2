package com.google.photos.vision.barhopper;

import com.datadog.trace.core.LongRunningTracesTracker;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfu;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfv;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgr;
import com.google.barhopper.deeplearning.zzm;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class BarhopperProto$BarhopperResponse extends zzeh implements zzfn {
    private static final BarhopperProto$BarhopperResponse zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private zzeo zze = zzfv.zza;
    private String zzg = "";
    private zzdf zzh = zzdf.zzb;

    static {
        BarhopperProto$BarhopperResponse barhopperProto$BarhopperResponse = new BarhopperProto$BarhopperResponse();
        zzb = barhopperProto$BarhopperResponse;
        zzeh.zzV(BarhopperProto$BarhopperResponse.class, barhopperProto$BarhopperResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh, java.lang.Object] */
    public static BarhopperProto$BarhopperResponse zzb(byte[] bArr, zzds zzdsVar) {
        BarhopperProto$BarhopperResponse barhopperProto$BarhopperResponse = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r2 = (zzeh) barhopperProto$BarhopperResponse.zzg(4, null);
            try {
                ?? zzb2 = zzfu.zzb.zzb(r2.getClass());
                zzb2.zzh(r2, bArr, 0, length, new LongRunningTracesTracker(zzdsVar));
                zzb2.zzf(r2);
                barhopperProto$BarhopperResponse = r2;
            } catch (zzer e) {
                throw e;
            } catch (zzgr e2) {
                TransportImpl$$ExternalSyntheticLambda0.m(e2.getMessage());
                return null;
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzer) {
                    throw ((zzer) e3.getCause());
                }
                throw new zzer(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                TransportImpl$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        if (barhopperProto$BarhopperResponse == null || zzeh.zzX(barhopperProto$BarhopperResponse, true)) {
            return barhopperProto$BarhopperResponse;
        }
        TransportImpl$$ExternalSyntheticLambda0.m(new zzgr().getMessage());
        return null;
    }

    public final zzeo zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    public final Object zzg(int i, zzeh zzehVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i2 == 2) {
            return new zzfw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", zzc.class, "zzf", zzd.zza$1, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new BarhopperProto$BarhopperResponse();
        }
        if (i2 == 4) {
            return new zzm(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzi = zzehVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

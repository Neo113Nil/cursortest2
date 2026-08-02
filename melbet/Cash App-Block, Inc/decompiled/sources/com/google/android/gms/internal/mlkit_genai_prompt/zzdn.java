package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes4.dex */
public final class zzdn extends zzer {
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzer
    public final zzal zze(Object obj, Object obj2, zzeo zzeoVar) {
        zzal zzajVar;
        zzao zzaoVar = (zzao) obj;
        zzdb zzdbVar = (zzdb) obj2;
        zzij zzijVar = zzil.zza;
        zzir zzirVar = zzir.zza;
        zzil.zzj(zzirVar);
        byte b = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (0 | 1)) | 2)) | 4)) | 16)) | PnmConstants.PNM_SEPARATOR)) | Byte.MIN_VALUE);
        if (zzirVar == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null cortanaStateFileDescriptorsToRead");
            return null;
        }
        zzdbVar.getClass();
        zzdh zzdhVar = new zzdh(zzdbVar, this.zzb);
        zzil zzj = zzil.zzj(zzirVar);
        byte b2 = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) (b | 8)) | 64)) | 1)) | 2)) | 4)) | 8)) | 16)) | PnmConstants.PNM_SEPARATOR)) | Byte.MIN_VALUE);
        if (b2 != -1 || zzj == null) {
            StringBuilder sb = new StringBuilder();
            if (zzj == null) {
                sb.append(" messages");
            }
            if ((b2 & 1) == 0) {
                sb.append(" temperature");
            }
            if ((b2 & 2) == 0) {
                sb.append(" topK");
            }
            if ((b2 & 4) == 0) {
                sb.append(" targetReplyLengthMax");
            }
            if ((b2 & 8) == 0) {
                sb.append(" numSamples");
            }
            if ((b2 & 16) == 0) {
                sb.append(" preferredImageWidth");
            }
            if ((b2 & PnmConstants.PNM_SEPARATOR) == 0) {
                sb.append(" preferredImageHeight");
            }
            if ((b2 & 64) == 0) {
                sb.append(" tokenOffset");
            }
            if ((b2 & 128) == 0) {
                sb.append(" numSoftTokens");
            }
            a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
            return null;
        }
        zzx zzxVar = new zzx(zzj, 1, 500, 1, zzdhVar, zzirVar, "cortana_type_prefix_caching", -1);
        zzdm zzdmVar = new zzdm(this, zzdbVar, zzeoVar);
        Parcel zza = zzaoVar.zza();
        int i = zzl.$r8$clinit;
        zza.writeInt(1);
        zzxVar.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzdmVar);
        Parcel zzb = zzaoVar.zzb(zza, 2);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzajVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
            zzajVar = queryLocalInterface instanceof zzal ? (zzal) queryLocalInterface : new zzaj(readStrongBinder);
        }
        zzb.recycle();
        try {
            if (!zzj.isEmpty()) {
                int size = zzj.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ParcelFileDescriptor parcelFileDescriptor = ((zzs) zzj.get(i2)).zze;
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                }
            }
            return zzajVar;
        } catch (IOException unused) {
            zzajVar.zzd$1();
            ((CallbackToFutureAdapter$Completer) zzeoVar.f67zza).setException(new zzcm(2, 14, "Inference failed.", null));
            return zzajVar;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzer
    public final Object zzg(zzad zzadVar) {
        zzao zzaoVar;
        zzm zze = this.zza.zze();
        zzab zzabVar = (zzab) zzadVar;
        Parcel zza = zzabVar.zza();
        int i = zzl.$r8$clinit;
        zza.writeInt(1);
        zze.writeToParcel(zza, 0);
        Parcel zzb = zzabVar.zzb(zza, 35);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzaoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICortanaService");
            zzaoVar = queryLocalInterface instanceof zzao ? (zzao) queryLocalInterface : new zzao(readStrongBinder, "com.google.android.apps.aicore.aidl.ICortanaService", 6);
        }
        zzb.recycle();
        return zzaoVar;
    }
}

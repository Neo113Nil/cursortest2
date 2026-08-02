package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.model.parsers.TokenJsonParser;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

/* loaded from: classes4.dex */
public final class zzgw extends zzer {
    public final Optional zzg;

    public zzgw(zzct zzctVar, zzfn zzfnVar, zzzx zzzxVar) {
        super(zzctVar, zzfnVar, zzzxVar);
        this.zzg = Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d4  */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.android.gms.internal.mlkit_genai_prompt.zzbw] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.google.android.gms.internal.mlkit_genai_prompt.zzgq] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.google.android.gms.internal.mlkit_genai_prompt.zzal] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzal zze(Object obj, Object obj2, zzeo zzeoVar) {
        Throwable th;
        zzbr zzbrVar;
        ?? r11;
        IBinder readStrongBinder;
        ?? r6;
        zzba zzbaVar = (zzba) obj;
        zzgg zzggVar = (zzgg) obj2;
        Throwable th2 = null;
        if (zzggVar.zza.stream().anyMatch(new zzgu()) && this.zza.zzd != 12) {
            Log.w("zzgw", "Audio input is only supported for LEGION features");
            ((CallbackToFutureAdapter$Completer) zzeoVar.f67zza).setException(new zzcm(2, 3, "Inference failed.", null));
            return new zzfx("com.google.android.apps.aicore.aidl.ICancellationCallback", 4);
        }
        Parcelable.Creator<zzbw> creator = zzbw.CREATOR;
        zzij zzijVar = zzil.zza;
        zzil.zzj(zzir.zza);
        zzgc zzgcVar = zzggVar.zzl;
        if (zzgcVar != null) {
            ParcelFileDescriptor parcelFileDescriptor = zzgcVar.zzb;
            long statSize = parcelFileDescriptor.getStatSize();
            long statSize2 = parcelFileDescriptor.getStatSize();
            if (statSize <= 209715200) {
                zzil zzilVar = zzgcVar.zza;
                if (zzilVar.size() <= 1) {
                    ArrayList arrayList = new ArrayList();
                    int size = zzilVar.size();
                    int i = 0;
                    while (i < size) {
                        zzfz zzfzVar = (zzfz) zzilVar.get(i);
                        th = th2;
                        int i2 = zzfzVar.zzc;
                        if (i2 != 0) {
                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Only TEXT type is supported for now. Received type: "));
                            break;
                        }
                        String str = zzfzVar.zza;
                        str.getClass();
                        arrayList.add(new zzbp(0, str, null, 0, null, false, null));
                        i++;
                        th2 = th;
                    }
                    th = th2;
                    zzbrVar = new zzbr(arrayList, parcelFileDescriptor);
                } else {
                    th = null;
                    a$$ExternalSyntheticBUOutline0.m$3("Only single message is supported for now.");
                }
            } else {
                th = null;
                a$$ExternalSyntheticBUOutline0.m$3(zzhx.zzb("Cache file should be less than %s bytes: %s", 209715200, Long.valueOf(statSize2)));
            }
            r11 = th;
            zzdm zzdmVar = new zzdm(this, zzeoVar, (zzbw) r11);
            Parcel zza = zzbaVar.zza();
            int i3 = zzl.$r8$clinit;
            zza.writeInt(1);
            r11.writeToParcel(zza, 0);
            zza.writeStrongBinder(zzdmVar);
            Parcel zzb = zzbaVar.zzb(zza, 3);
            readStrongBinder = zzb.readStrongBinder();
            if (readStrongBinder == null) {
                r6 = th;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
                r6 = queryLocalInterface instanceof zzal ? (zzal) queryLocalInterface : new zzaj(readStrongBinder);
            }
            zzb.recycle();
            return r6;
        }
        th = null;
        zzbrVar = null;
        zzeo zzeoVar2 = zzggVar.zzm;
        ?? zzgqVar = zzeoVar2 != null ? new zzgq(zzggVar, zzeoVar2) : th;
        Bundle bundle = new Bundle();
        zzij zzijVar2 = zzil.zza;
        Object[] objArr = new Object[4];
        new ArrayList();
        zzil zzilVar2 = zzggVar.zza;
        int size2 = zzilVar2.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size2) {
            zzfz zzfzVar2 = (zzfz) zzilVar2.get(i4);
            if (zzfzVar2.zzc != 0) {
                th.getClass();
                throw th;
            }
            String str2 = zzfzVar2.zza;
            str2.getClass();
            zzbp zzbpVar = new zzbp(0, str2, null, 0, null, false, null);
            int length = objArr.length;
            int i6 = i5 + 1;
            int zza2 = TokenJsonParser.zza(length, i6);
            if (zza2 > length) {
                objArr = Arrays.copyOf(objArr, zza2);
            }
            objArr[i5] = zzbpVar;
            i4++;
            i5 = i6;
        }
        ?? r23 = bundle.hasFileDescriptors() ? bundle : th;
        zzil zzj = zzil.zzj(zzil.zzi(i5, objArr));
        float f = zzggVar.zzb;
        int i7 = zzggVar.zzc;
        zzil zzj2 = zzil.zzj(zzggVar.zzd);
        int i8 = zzggVar.zze;
        int i9 = zzggVar.zzf;
        boolean z = zzggVar.zzh;
        int i10 = zzggVar.zzg;
        int i11 = zzggVar.zzi;
        int i12 = zzggVar.zzj;
        int i13 = zzggVar.zzk;
        if (zzj != null && zzj2 != null) {
            r11 = new zzbw(zzj, f, i7, zzj2, i8, i9, zzgqVar, z, i10, i11, i12, r23, i13, zzbrVar);
            zzdm zzdmVar2 = new zzdm(this, zzeoVar, (zzbw) r11);
            Parcel zza3 = zzbaVar.zza();
            int i32 = zzl.$r8$clinit;
            zza3.writeInt(1);
            r11.writeToParcel(zza3, 0);
            zza3.writeStrongBinder(zzdmVar2);
            Parcel zzb2 = zzbaVar.zzb(zza3, 3);
            readStrongBinder = zzb2.readStrongBinder();
            if (readStrongBinder == null) {
            }
            zzb2.recycle();
            return r6;
        }
        StringBuilder sb = new StringBuilder();
        if (zzj == null) {
            sb.append(" messages");
        }
        if (zzj2 == null) {
            sb.append(" stopTokensList");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        r11 = th;
        zzdm zzdmVar22 = new zzdm(this, zzeoVar, (zzbw) r11);
        Parcel zza32 = zzbaVar.zza();
        int i322 = zzl.$r8$clinit;
        zza32.writeInt(1);
        r11.writeToParcel(zza32, 0);
        zza32.writeStrongBinder(zzdmVar22);
        Parcel zzb22 = zzbaVar.zzb(zza32, 3);
        readStrongBinder = zzb22.readStrongBinder();
        if (readStrongBinder == null) {
        }
        zzb22.recycle();
        return r6;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzer
    public final Object zzg(zzad zzadVar) {
        zzba zzbaVar;
        this.zzg.isPresent();
        zzm zze = this.zza.zze();
        zzab zzabVar = (zzab) zzadVar;
        Parcel zza = zzabVar.zza();
        int i = zzl.$r8$clinit;
        zza.writeInt(1);
        zze.writeToParcel(zza, 0);
        Parcel zzb = zzabVar.zzb(zza, 5);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzbaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMService");
            zzbaVar = queryLocalInterface instanceof zzba ? (zzba) queryLocalInterface : new zzba(readStrongBinder, "com.google.android.apps.aicore.aidl.ILLMService", 6);
        }
        zzb.recycle();
        return zzbaVar;
    }
}

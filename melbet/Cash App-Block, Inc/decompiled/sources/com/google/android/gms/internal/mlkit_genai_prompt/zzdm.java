package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.util.Log;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import com.google.android.gms.internal.maps.zzb;
import com.stripe.android.model.parsers.TokenJsonParser;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzdm extends zzb {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ zzeo zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdm(zzdn zzdnVar, zzdb zzdbVar, zzeo zzeoVar) {
        super("com.google.android.apps.aicore.aidl.ICortanaResultCallback", 4);
        this.zza = zzdbVar;
        this.zzb = zzeoVar;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(Parcel parcel, int i) {
        int i2 = this.$r8$classId;
        int i3 = 0;
        zzeo zzeoVar = this.zzb;
        Object obj = this.zza;
        switch (i2) {
            case 0:
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) zzeoVar.f67zza;
                if (i == 2) {
                    zzz zzzVar = (zzz) zzl.zza(parcel, zzz.CREATOR);
                    zzl.zzb(parcel);
                    ((zzdb) obj).getClass();
                    zzbl zzblVar = zzzVar.zzb;
                    int i4 = zzzVar.zzc;
                    zzij zzijVar = zzil.zza;
                    callbackToFutureAdapter$Completer.set(new zzdc(zzir.zza, zzblVar, i4));
                } else if (i == 3) {
                    int readInt = parcel.readInt();
                    zzl.zzb(parcel);
                    callbackToFutureAdapter$Completer.setException(new zzcm(2, readInt, "Inference failed.", null));
                }
                break;
            default:
                zzbw zzbwVar = (zzbw) obj;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) zzeoVar.f67zza;
                if (i == 2) {
                    zzby zzbyVar = (zzby) zzl.zza(parcel, zzby.CREATOR);
                    zzl.zzb(parcel);
                    zzij zzijVar2 = zzil.zza;
                    Object[] objArr = new Object[4];
                    zzil zzilVar = zzbyVar.zza;
                    int size = zzilVar.size();
                    int i5 = 0;
                    while (i3 < size) {
                        zzbt zzbtVar = (zzbt) zzilVar.get(i3);
                        zzgd zzgdVar = new zzgd(zzbtVar.zze, zzbtVar.zza, zzbtVar.zzc);
                        int length = objArr.length;
                        int i6 = i5 + 1;
                        int zza = TokenJsonParser.zza(length, i6);
                        if (zza > length) {
                            objArr = Arrays.copyOf(objArr, zza);
                        }
                        objArr[i5] = zzgdVar;
                        i3++;
                        i5 = i6;
                    }
                    callbackToFutureAdapter$Completer2.set(new zzgh(zzil.zzj(zzil.zzi(i5, objArr)), zzbyVar.zzb));
                    try {
                        zzbwVar.zzb();
                    } catch (IOException e) {
                        Log.e("zzgw", "Failed to close all file descriptors", e);
                    }
                } else if (i == 3) {
                    int readInt2 = parcel.readInt();
                    zzl.zzb(parcel);
                    callbackToFutureAdapter$Completer2.setException(new zzcm(2, readInt2, "Inference failed.", null));
                    try {
                        zzbwVar.zzb();
                    } catch (IOException e2) {
                        Log.e("zzgw", "Failed to close all file descriptors", e2);
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdm(zzgw zzgwVar, zzeo zzeoVar, zzbw zzbwVar) {
        super("com.google.android.apps.aicore.aidl.ILLMResultCallback", 4);
        this.zzb = zzeoVar;
        this.zza = zzbwVar;
    }
}

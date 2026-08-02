package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.model.parsers.WalletJsonParser;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzn(8);
    public static final zzir zza;
    public final zzil zzb;
    public final float zzc;
    public final int zzd;
    public final zzil zze;
    public final int zzf;
    public final int zzg;
    public final zzbd zzh;
    public final boolean zzi;
    public final int zzj;
    public final int zzk;
    public final int zzl;
    public final int zzm;
    public final String zzn;
    public final Bundle zzo;
    public final int zzp;
    public final zzce zzq;
    public final int zzr;
    public final zzbr zzs;
    public final zzax zzt;

    static {
        zzij zzijVar = zzil.zza;
        Object[] objArr = {"auxiliary_lora_file", "auxiliary_drafter_lora_file", "auxiliary_session_state_file"};
        WalletJsonParser.zza(3, objArr);
        zza = zzil.zzi(3, objArr);
    }

    public zzbw(ArrayList arrayList, float f, int i, ArrayList arrayList2, int i2, int i3, IBinder iBinder, boolean z, int i4, IBinder iBinder2, int i5, int i6, String str, Bundle bundle, int i7, zzce zzceVar, int i8, zzbr zzbrVar, int i9) {
        zzbd zzbbVar;
        this.zzb = zzil.zzj(arrayList);
        this.zzc = f;
        this.zzd = i;
        this.zze = zzil.zzj(arrayList2);
        this.zzf = i2;
        this.zzg = i3;
        zzax zzaxVar = null;
        if (iBinder == null) {
            zzbbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMStreamingCallback");
            zzbbVar = queryLocalInterface instanceof zzbd ? (zzbd) queryLocalInterface : new zzbb(iBinder, "com.google.android.apps.aicore.aidl.ILLMStreamingCallback", 6);
        }
        this.zzh = zzbbVar;
        this.zzi = z;
        this.zzj = i4;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageEmbeddingCallback");
            zzaxVar = queryLocalInterface2 instanceof zzax ? (zzax) queryLocalInterface2 : new zzax(iBinder2, "com.google.android.apps.aicore.aidl.IImageEmbeddingCallback", 6);
        }
        this.zzt = zzaxVar;
        this.zzk = i5;
        this.zzl = i6;
        this.zzn = str;
        this.zzo = bundle;
        this.zzp = i7;
        this.zzq = zzceVar == null ? zzce.zza : zzceVar;
        this.zzr = i8;
        this.zzs = zzbrVar;
        this.zzm = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedList(parcel, 1, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeFloat(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.writeStringList(parcel, 4, this.zze);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zzf);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zzg);
        zzbd zzbdVar = this.zzh;
        MooncakeHeaderViewKt.writeIBinder(parcel, 7, zzbdVar == null ? null : zzbdVar.asBinder());
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeInt(this.zzi ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeInt(this.zzj);
        zzax zzaxVar = this.zzt;
        MooncakeHeaderViewKt.writeIBinder(parcel, 10, zzaxVar != null ? zzaxVar.zaa : null);
        MooncakeHeaderViewKt.zza(parcel, 11, 4);
        parcel.writeInt(this.zzk);
        MooncakeHeaderViewKt.zza(parcel, 12, 4);
        parcel.writeInt(this.zzl);
        MooncakeHeaderViewKt.writeString(parcel, 13, this.zzn);
        MooncakeHeaderViewKt.writeBundle(parcel, 14, this.zzo);
        MooncakeHeaderViewKt.zza(parcel, 15, 4);
        parcel.writeInt(this.zzp);
        MooncakeHeaderViewKt.writeParcelable(parcel, 16, this.zzq, i);
        MooncakeHeaderViewKt.zza(parcel, 17, 4);
        parcel.writeInt(this.zzr);
        MooncakeHeaderViewKt.writeParcelable(parcel, 18, this.zzs, i);
        MooncakeHeaderViewKt.zza(parcel, 19, 4);
        parcel.writeInt(this.zzm);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final void zzb() {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        zzil zzilVar = this.zzb;
        int size = zzilVar.size();
        for (int i = 0; i < size; i++) {
            zzbp zzbpVar = (zzbp) zzilVar.get(i);
            ParcelFileDescriptor parcelFileDescriptor3 = zzbpVar.zze;
            if (parcelFileDescriptor3 != null) {
                parcelFileDescriptor3.close();
            }
            zzbn zzbnVar = zzbpVar.zzg;
            if (zzbnVar != null && (parcelFileDescriptor2 = zzbnVar.zza) != null) {
                parcelFileDescriptor2.close();
            }
        }
        Bundle bundle = this.zzo;
        if (bundle != null) {
            zzir zzirVar = zza;
            int i2 = zzirVar.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                ParcelFileDescriptor parcelFileDescriptor4 = (ParcelFileDescriptor) bundle.getParcelable((String) zzirVar.get(i3), ParcelFileDescriptor.class);
                if (parcelFileDescriptor4 != null) {
                    parcelFileDescriptor4.close();
                }
            }
        }
        zzbr zzbrVar = this.zzs;
        if (zzbrVar == null || (parcelFileDescriptor = zzbrVar.zzb) == null) {
            return;
        }
        parcelFileDescriptor.close();
    }

    public zzbw(zzil zzilVar, float f, int i, zzil zzilVar2, int i2, int i3, zzgq zzgqVar, boolean z, int i4, int i5, int i6, Bundle bundle, int i7, zzbr zzbrVar) {
        this.zzb = zzilVar;
        this.zzc = f;
        this.zzd = i;
        this.zze = zzilVar2;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = zzgqVar;
        this.zzi = z;
        this.zzj = i4;
        this.zzt = null;
        this.zzk = i5;
        this.zzl = i6;
        this.zzn = null;
        this.zzo = bundle;
        this.zzp = i7;
        this.zzq = zzce.zza;
        this.zzr = 0;
        this.zzs = zzbrVar;
        this.zzm = 0;
    }
}

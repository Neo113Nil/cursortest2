package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zzab(21);
    public String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;
    public final int zzi;
    public final ArrayList zzj;
    public final TimeInterval zzk;
    public final ArrayList zzl;
    public final String zzm;
    public final String zzn;
    public final ArrayList zzo;
    public final boolean zzp;
    public final ArrayList zzq;
    public final ArrayList zzr;
    public final ArrayList zzs;

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = i;
        this.zzj = arrayList;
        this.zzk = timeInterval;
        this.zzl = arrayList2;
        this.zzm = str9;
        this.zzn = str10;
        this.zzo = arrayList3;
        this.zzp = z;
        this.zzq = arrayList4;
        this.zzr = arrayList5;
        this.zzs = arrayList6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zze);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzf);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzg);
        MooncakeHeaderViewKt.writeString(parcel, 9, this.zzh);
        MooncakeHeaderViewKt.zza(parcel, 10, 4);
        parcel.writeInt(this.zzi);
        MooncakeHeaderViewKt.writeTypedList(parcel, 11, this.zzj);
        MooncakeHeaderViewKt.writeParcelable(parcel, 12, this.zzk, i);
        MooncakeHeaderViewKt.writeTypedList(parcel, 13, this.zzl);
        MooncakeHeaderViewKt.writeString(parcel, 14, this.zzm);
        MooncakeHeaderViewKt.writeString(parcel, 15, this.zzn);
        MooncakeHeaderViewKt.writeTypedList(parcel, 16, this.zzo);
        MooncakeHeaderViewKt.zza(parcel, 17, 4);
        parcel.writeInt(this.zzp ? 1 : 0);
        MooncakeHeaderViewKt.writeTypedList(parcel, 18, this.zzq);
        MooncakeHeaderViewKt.writeTypedList(parcel, 19, this.zzr);
        MooncakeHeaderViewKt.writeTypedList(parcel, 20, this.zzs);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public CommonWalletObject() {
        this.zzj = new ArrayList();
        this.zzl = new ArrayList();
        this.zzo = new ArrayList();
        this.zzq = new ArrayList();
        this.zzr = new ArrayList();
        this.zzs = new ArrayList();
    }
}

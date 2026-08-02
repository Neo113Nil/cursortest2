package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zzab(23);
    public final String zza;
    public final String zzb;
    public final ArrayList zzc;

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeTypedList(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

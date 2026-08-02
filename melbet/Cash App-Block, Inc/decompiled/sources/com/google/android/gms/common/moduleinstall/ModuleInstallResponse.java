package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zzd(29);
    public final int zaa;
    public final boolean zab;

    public ModuleInstallResponse(int i, boolean z) {
        this.zaa = i;
        this.zab = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zaa);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zab ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new com.google.android.gms.appset.zzd(18);
    public final String packageName;
    public final int uid;

    public ClientIdentity(int i, String str) {
        this.uid = i;
        this.packageName = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.uid == this.uid && zzae.equal(clientIdentity.packageName, this.packageName);
    }

    public final int hashCode() {
        return this.uid;
    }

    public final String toString() {
        int i = this.uid;
        int length = String.valueOf(i).length();
        String str = this.packageName;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.uid);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.packageName);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

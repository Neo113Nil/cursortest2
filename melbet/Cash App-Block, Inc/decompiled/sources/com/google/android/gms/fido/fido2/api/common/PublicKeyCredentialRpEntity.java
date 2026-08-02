package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new com.google.android.gms.common.zzs(13);
    public final String zza;
    public final String zzb;
    public final String zzc;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        zzae.checkNotNull(str);
        this.zza = str;
        zzae.checkNotNull(str2);
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return zzae.equal(this.zza, publicKeyCredentialRpEntity.zza) && zzae.equal(this.zzb, publicKeyCredentialRpEntity.zzb) && zzae.equal(this.zzc, publicKeyCredentialRpEntity.zzc);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.zza);
        sb.append("', \n name='");
        sb.append(this.zzb);
        sb.append("', \n icon='");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.zzc, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

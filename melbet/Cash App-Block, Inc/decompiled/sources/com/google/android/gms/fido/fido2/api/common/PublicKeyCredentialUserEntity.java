package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import coil3.size.SizeKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzgu;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new com.google.android.gms.common.zzs(15);
    public final zzgu zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;

    public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
        zzae.checkNotNull(bArr);
        this.zza = zzgu.zzl(bArr.length, bArr);
        zzae.checkNotNull(str);
        this.zzb = str;
        this.zzc = str2;
        zzae.checkNotNull(str3);
        this.zzd = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return zzae.equal(this.zza, publicKeyCredentialUserEntity.zza) && zzae.equal(this.zzb, publicKeyCredentialUserEntity.zzb) && zzae.equal(this.zzc, publicKeyCredentialUserEntity.zzc) && zzae.equal(this.zzd, publicKeyCredentialUserEntity.zzd);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final String toString() {
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("PublicKeyCredentialUserEntity{\n id=", SizeKt.encodeUrlSafeNoPadding(this.zza.zzm()), ", \n name='");
        m3m.append(this.zzb);
        m3m.append("', \n icon='");
        m3m.append(this.zzc);
        m3m.append("', \n displayName='");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m3m, this.zzd, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, this.zza.zzm());
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

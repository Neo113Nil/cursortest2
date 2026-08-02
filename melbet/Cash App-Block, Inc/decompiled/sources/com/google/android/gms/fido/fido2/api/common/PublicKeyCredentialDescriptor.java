package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import coil3.size.SizeKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgu;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final PublicKeyCredentialType zzb;
    public final zzgu zzc;
    public final List zzd;

    public final class UnsupportedPubKeyCredDescriptorException extends Exception {
    }

    static {
        zzcf.zzf(2, com.google.android.gms.internal.fido.zzh.zza, com.google.android.gms.internal.fido.zzh.zzb);
        CREATOR = new com.google.android.gms.common.zzs(11);
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
        zzgu zzguVar = zzgu.zzb;
        zzgu zzl = zzgu.zzl(bArr.length, bArr);
        zzae.checkNotNull(str);
        try {
            this.zzb = PublicKeyCredentialType.fromString(str);
            this.zzc = zzl;
            this.zzd = arrayList;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        List list = publicKeyCredentialDescriptor.zzd;
        if (!this.zzb.equals(publicKeyCredentialDescriptor.zzb) || !zzae.equal(this.zzc, publicKeyCredentialDescriptor.zzc)) {
            return false;
        }
        List list2 = this.zzd;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String encodeUrlSafeNoPadding = SizeKt.encodeUrlSafeNoPadding(this.zzc.zzm());
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", encodeUrlSafeNoPadding, ", \n transports="), String.valueOf(this.zzd), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        this.zzb.getClass();
        MooncakeHeaderViewKt.writeString(parcel, 2, "public-key");
        MooncakeHeaderViewKt.writeByteArray(parcel, 3, this.zzc.zzm());
        MooncakeHeaderViewKt.writeTypedList(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

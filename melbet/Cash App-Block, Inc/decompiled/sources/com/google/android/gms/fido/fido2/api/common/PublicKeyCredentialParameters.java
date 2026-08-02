package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new com.google.android.gms.common.zzs(12);
    public final PublicKeyCredentialType zza;
    public final COSEAlgorithmIdentifier zzb;

    public PublicKeyCredentialParameters(String str, int i) {
        zzae.checkNotNull(str);
        try {
            this.zza = PublicKeyCredentialType.fromString(str);
            try {
                this.zzb = COSEAlgorithmIdentifier.fromCoseValue(i);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
                throw null;
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.zza.equals(publicKeyCredentialParameters.zza) && this.zzb.equals(publicKeyCredentialParameters.zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("PublicKeyCredentialParameters{\n type=", String.valueOf(this.zza), ", \n algorithm=", String.valueOf(this.zzb), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        this.zza.getClass();
        MooncakeHeaderViewKt.writeString(parcel, 2, "public-key");
        MooncakeHeaderViewKt.writeIntegerObject(parcel, 3, Integer.valueOf(this.zzb.zza.getAlgoValue()));
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

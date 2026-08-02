package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.internal.location.zzef;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzef(4);
    public final Attachment zza;
    public final Boolean zzb;
    public final UserVerificationRequirement zzc;
    public final ResidentKeyRequirement zzd;

    public AuthenticatorSelectionCriteria(Boolean bool, String str, String str2, String str3) {
        Attachment fromString;
        if (str == null) {
            fromString = null;
        } else {
            try {
                fromString = Attachment.fromString(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e) {
                Path$$ExternalSyntheticBUOutline0.m(e);
                throw null;
            }
        }
        this.zza = fromString;
        this.zzb = bool;
        this.zzc = str2 == null ? null : UserVerificationRequirement.fromString(str2);
        this.zzd = str3 == null ? null : ResidentKeyRequirement.fromString(str3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return zzae.equal(this.zza, authenticatorSelectionCriteria.zza) && zzae.equal(this.zzb, authenticatorSelectionCriteria.zzb) && zzae.equal(this.zzc, authenticatorSelectionCriteria.zzc) && zzae.equal(getResidentKeyRequirement(), authenticatorSelectionCriteria.getResidentKeyRequirement());
    }

    public final ResidentKeyRequirement getResidentKeyRequirement() {
        ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement == null) {
            residentKeyRequirement = null;
            Boolean bool = this.zzb;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
                }
                return null;
            }
        }
        return residentKeyRequirement;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, getResidentKeyRequirement()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        Thread$State$EnumUnboxingLocalUtility.m(m3m, this.zzb, ", \n requireUserVerification=", valueOf2, ", \n residentKeyRequirement=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m3m, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        Attachment attachment = this.zza;
        MooncakeHeaderViewKt.writeString(parcel, 2, attachment == null ? null : attachment.zzb);
        Boolean bool = this.zzb;
        if (bool != null) {
            MooncakeHeaderViewKt.zza(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        UserVerificationRequirement userVerificationRequirement = this.zzc;
        MooncakeHeaderViewKt.writeString(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.zze);
        ResidentKeyRequirement residentKeyRequirement = getResidentKeyRequirement();
        MooncakeHeaderViewKt.writeString(parcel, 5, residentKeyRequirement != null ? residentKeyRequirement.zzb : null);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

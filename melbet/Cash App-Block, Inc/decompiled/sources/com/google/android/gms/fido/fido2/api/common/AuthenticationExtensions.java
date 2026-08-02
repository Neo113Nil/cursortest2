package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new com.google.android.gms.common.zzs(26);
    public final FidoAppIdExtension zza;
    public final zzs zzb;
    public final UserVerificationMethodExtension zzc;
    public final zzz zzd;
    public final zzab zze;
    public final zzad zzf;
    public final zzu zzg;
    public final zzag zzh;
    public final GoogleThirdPartyPaymentExtension zzi;
    public final zzak zzj;
    public final zzaw zzk;
    public final zzai zzl;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzsVar;
        this.zzd = zzzVar;
        this.zze = zzabVar;
        this.zzf = zzadVar;
        this.zzg = zzuVar;
        this.zzh = zzagVar;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzakVar;
        this.zzk = zzawVar;
        this.zzl = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return zzae.equal(this.zza, authenticationExtensions.zza) && zzae.equal(this.zzb, authenticationExtensions.zzb) && zzae.equal(this.zzc, authenticationExtensions.zzc) && zzae.equal(this.zzd, authenticationExtensions.zzd) && zzae.equal(this.zze, authenticationExtensions.zze) && zzae.equal(this.zzf, authenticationExtensions.zzf) && zzae.equal(this.zzg, authenticationExtensions.zzg) && zzae.equal(this.zzh, authenticationExtensions.zzh) && zzae.equal(this.zzi, authenticationExtensions.zzi) && zzae.equal(this.zzj, authenticationExtensions.zzj) && zzae.equal(this.zzk, authenticationExtensions.zzk) && zzae.equal(this.zzl, authenticationExtensions.zzl);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String valueOf4 = String.valueOf(this.zzd);
        String valueOf5 = String.valueOf(this.zze);
        String valueOf6 = String.valueOf(this.zzf);
        String valueOf7 = String.valueOf(this.zzg);
        String valueOf8 = String.valueOf(this.zzh);
        String valueOf9 = String.valueOf(this.zzi);
        String valueOf10 = String.valueOf(this.zzj);
        String valueOf11 = String.valueOf(this.zzk);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        Boxes$$ExternalSyntheticOutline1.m(m, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        Boxes$$ExternalSyntheticOutline1.m(m, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        Boxes$$ExternalSyntheticOutline1.m(m, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        Boxes$$ExternalSyntheticOutline1.m(m, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzb, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzc, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zzd, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.zze, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzf, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 8, this.zzg, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 9, this.zzh, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 10, this.zzi, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 11, this.zzj, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 12, this.zzk, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 13, this.zzl, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

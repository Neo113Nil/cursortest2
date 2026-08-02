package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import coil3.size.SizeKt;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzgc;
import com.google.android.gms.internal.fido.zzge;
import com.google.android.gms.internal.fido.zzgu;
import com.google.android.gms.internal.location.zzef;
import com.google.android.gms.maps.zzah;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzef(1);
    public final zzgu zza;
    public final zzgu zzb;
    public final zzgu zzc;
    public final zzgu zzd;
    public final zzgu zze;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        zzae.checkNotNull(bArr);
        zzgu zzl = zzgu.zzl(bArr.length, bArr);
        zzae.checkNotNull(bArr2);
        zzgu zzl2 = zzgu.zzl(bArr2.length, bArr2);
        zzae.checkNotNull(bArr3);
        zzgu zzl3 = zzgu.zzl(bArr3.length, bArr3);
        zzae.checkNotNull(bArr4);
        zzgu zzl4 = zzgu.zzl(bArr4.length, bArr4);
        zzgu zzl5 = bArr5 == null ? null : zzgu.zzl(bArr5.length, bArr5);
        this.zza = zzl;
        this.zzb = zzl2;
        this.zzc = zzl3;
        this.zzd = zzl4;
        this.zze = zzl5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return zzae.equal(this.zza, authenticatorAssertionResponse.zza) && zzae.equal(this.zzb, authenticatorAssertionResponse.zzb) && zzae.equal(this.zzc, authenticatorAssertionResponse.zzc) && zzae.equal(this.zzd, authenticatorAssertionResponse.zzd) && zzae.equal(this.zze, authenticatorAssertionResponse.zze);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.zza})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzb})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzc})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zzd})), Integer.valueOf(Arrays.hashCode(new Object[]{this.zze}))});
    }

    public final String toString() {
        zzah zzahVar = new zzah(getClass().getSimpleName(), 1);
        zzgc zzgcVar = zzge.zze;
        byte[] zzm = this.zza.zzm();
        zzahVar.zzb(zzgcVar.zzg(zzm.length, zzm), "keyHandle");
        byte[] zzm2 = this.zzb.zzm();
        zzahVar.zzb(zzgcVar.zzg(zzm2.length, zzm2), "clientDataJSON");
        byte[] zzm3 = this.zzc.zzm();
        zzahVar.zzb(zzgcVar.zzg(zzm3.length, zzm3), "authenticatorData");
        byte[] zzm4 = this.zzd.zzm();
        zzahVar.zzb(zzgcVar.zzg(zzm4.length, zzm4), "signature");
        zzgu zzguVar = this.zze;
        byte[] zzm5 = zzguVar == null ? null : zzguVar.zzm();
        if (zzm5 != null) {
            zzahVar.zzb(zzgcVar.zzg(zzm5.length, zzm5), "userHandle");
        }
        return zzahVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, this.zza.zzm());
        MooncakeHeaderViewKt.writeByteArray(parcel, 3, this.zzb.zzm());
        MooncakeHeaderViewKt.writeByteArray(parcel, 4, this.zzc.zzm());
        MooncakeHeaderViewKt.writeByteArray(parcel, 5, this.zzd.zzm());
        zzgu zzguVar = this.zze;
        MooncakeHeaderViewKt.writeByteArray(parcel, 6, zzguVar == null ? null : zzguVar.zzm());
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", SizeKt.encodeUrlSafeNoPadding(this.zzb.zzm()));
            jSONObject.put("authenticatorData", SizeKt.encodeUrlSafeNoPadding(this.zzc.zzm()));
            jSONObject.put("signature", SizeKt.encodeUrlSafeNoPadding(this.zzd.zzm()));
            zzgu zzguVar = this.zze;
            if (zzguVar == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", SizeKt.encodeUrlSafeNoPadding(zzguVar == null ? null : zzguVar.zzm()));
            return jSONObject;
        } catch (JSONException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Error encoding AuthenticatorAssertionResponse to JSON object", (Throwable) e);
            return null;
        }
    }
}

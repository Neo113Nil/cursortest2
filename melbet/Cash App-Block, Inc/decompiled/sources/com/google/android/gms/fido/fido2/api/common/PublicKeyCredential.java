package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.size.SizeKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzgu;
import com.google.android.gms.internal.fido.zzic;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new com.google.android.gms.common.zzs(10);
    public final String zza;
    public final String zzb;
    public final zzgu zzc;
    public final AuthenticatorAttestationResponse zzd;
    public final AuthenticatorAssertionResponse zze;
    public final AuthenticatorErrorResponse zzf;
    public final AuthenticationExtensionsClientOutputs zzg;
    public final String zzh;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        zzgu zzl = bArr == null ? null : zzgu.zzl(bArr.length, bArr);
        boolean z = false;
        zzae.checkArgument("Must provide a response object.", (authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null));
        if (authenticatorErrorResponse != null || (str != null && zzl != null)) {
            z = true;
        }
        zzae.checkArgument("Must provide id and rawId if not an error response.", z);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzl;
        this.zzd = authenticatorAttestationResponse;
        this.zze = authenticatorAssertionResponse;
        this.zzf = authenticatorErrorResponse;
        this.zzg = authenticationExtensionsClientOutputs;
        this.zzh = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return zzae.equal(this.zza, publicKeyCredential.zza) && zzae.equal(this.zzb, publicKeyCredential.zzb) && zzae.equal(this.zzc, publicKeyCredential.zzc) && zzae.equal(this.zzd, publicKeyCredential.zzd) && zzae.equal(this.zze, publicKeyCredential.zze) && zzae.equal(this.zzf, publicKeyCredential.zzf) && zzae.equal(this.zzg, publicKeyCredential.zzg) && zzae.equal(this.zzh, publicKeyCredential.zzh);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zze, this.zzd, this.zzf, this.zzg, this.zzh});
    }

    public final String toString() {
        zzgu zzguVar = this.zzc;
        String encodeUrlSafeNoPadding = SizeKt.encodeUrlSafeNoPadding(zzguVar == null ? null : zzguVar.zzm());
        String valueOf = String.valueOf(this.zzd);
        String valueOf2 = String.valueOf(this.zze);
        String valueOf3 = String.valueOf(this.zzf);
        String valueOf4 = String.valueOf(this.zzg);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PublicKeyCredential{\n id='", this.zza, "', \n type='", this.zzb, "', \n rawId=");
        Boxes$$ExternalSyntheticOutline1.m(m, encodeUrlSafeNoPadding, ", \n registerResponse=", valueOf, ", \n signResponse=");
        Boxes$$ExternalSyntheticOutline1.m(m, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, valueOf4, ", \n authenticatorAttachment='", this.zzh, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzic.zzk.zza();
        throw null;
    }
}

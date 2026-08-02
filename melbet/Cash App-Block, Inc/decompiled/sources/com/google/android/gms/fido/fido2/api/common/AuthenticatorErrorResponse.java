package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.caverock.androidsvg.SVG;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.internal.fido.zzbf;
import com.google.android.gms.internal.location.zzef;
import com.google.android.gms.maps.zzah;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new zzef(3);
    public final ErrorCode zza;
    public final String zzb;
    public final int zzc;

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.zza = ErrorCode.toErrorCode(i);
            this.zzb = str;
            this.zzc = i2;
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return zzae.equal(this.zza, authenticatorErrorResponse.zza) && zzae.equal(this.zzb, authenticatorErrorResponse.zzb) && zzae.equal(Integer.valueOf(this.zzc), Integer.valueOf(authenticatorErrorResponse.zzc));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        zzah zzahVar = new zzah(getClass().getSimpleName(), 1);
        String valueOf = String.valueOf(this.zza.zzb);
        zzbf zzbfVar = new zzbf(29);
        ((SVG) zzahVar.zzc).idToElementMap = zzbfVar;
        zzahVar.zzc = zzbfVar;
        zzbfVar.cssRules = valueOf;
        zzbfVar.rootElement = "errorCode";
        String str = this.zzb;
        if (str != null) {
            zzahVar.zzb(str, "errorMessage");
        }
        return zzahVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza.zzb;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}

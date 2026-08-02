package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new com.google.android.gms.common.zzs(25);
    public final UvmEntries zza;
    public final zzf zzb;
    public final AuthenticationExtensionsCredPropsOutputs zzc;
    public final zzh zzd;
    public final String zze;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.zza = uvmEntries;
        this.zzb = zzfVar;
        this.zzc = authenticationExtensionsCredPropsOutputs;
        this.zzd = zzhVar;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return zzae.equal(this.zza, authenticationExtensionsClientOutputs.zza) && zzae.equal(this.zzb, authenticationExtensionsClientOutputs.zzb) && zzae.equal(this.zzc, authenticationExtensionsClientOutputs.zzc) && zzae.equal(this.zzd, authenticationExtensionsClientOutputs.zzd) && zzae.equal(this.zze, authenticationExtensionsClientOutputs.zze);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze});
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AuthenticationExtensionsClientOutputs{", zza().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.zzc;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.zza);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.zza;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.zza());
            }
            zzh zzhVar = this.zzd;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.zza());
            }
            String str = this.zze;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Error encoding AuthenticationExtensionsClientOutputs to JSON object", (Throwable) e2);
            return null;
        }
    }
}
